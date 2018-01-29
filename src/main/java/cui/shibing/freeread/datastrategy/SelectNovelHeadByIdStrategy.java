package cui.shibing.freeread.datastrategy;

import cui.shibing.freeread.datasource.DataInfo;

import java.util.Map;

public class SelectNovelHeadByIdStrategy implements DataInfo {

    @Override
    public String getDataSourceName(Map<String, Object> params) throws Throwable {
        return null;
    }

    @Override
    public String getTableName(Map<String, Object> params) throws Throwable {
        //TODO:参数的名称失效了,考虑用参数的下标来标识参数.
        String novelId = (String) params.get("arg0");
        System.out.println(novelId);
        return "novel_head";
    }
}
