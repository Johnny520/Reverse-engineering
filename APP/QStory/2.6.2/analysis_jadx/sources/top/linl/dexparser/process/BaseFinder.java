package top.linl.dexparser.process;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.util.ArrayList;
import java.util.List;
import net.bytebuddy.description.method.MethodDescription;
import top.linl.dexparser.DexParser;
import top.linl.dexparser.bean.ids.DexMethodId;
import top.linl.dexparser.bean.ids.DexTypeId;
import top.linl.dexparser.util.DexTypeUtils;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseFinder {
    private final ArrayList<String> result = new ArrayList<>();

    public final void addMethodToResult(DexParser dexParser, DexMethodId dexMethodId) {
        this.result.add(getMethodJSON(dexParser, dexMethodId));
    }

    public <T> boolean checkListContain(List<T> list, T[] tArr) {
        int i = 0;
        for (T t : list) {
            if (i >= tArr.length) {
                break;
            }
            for (T t2 : tArr) {
                if (t.equals(t2)) {
                    i++;
                }
            }
        }
        return i >= tArr.length;
    }

    public final String getMethodJSON(DexParser dexParser, DexMethodId dexMethodId) {
        String string = dexParser.dexStringIdsList[dexMethodId.name_idx].getString(dexParser);
        String strConversionTypeName = DexTypeUtils.conversionTypeName(dexParser.dexStringIdsList[dexParser.dexTypeIdsList[dexMethodId.class_ids].descriptor_idx].getString(dexParser));
        DexTypeId[] methodParams = dexMethodId.getMethodParams(dexParser);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("DeclareClass", strConversionTypeName);
        jSONObject.put("MethodName", string);
        JSONArray jSONArray = new JSONArray();
        for (DexTypeId dexTypeId : methodParams) {
            jSONArray.add(DexTypeUtils.conversionTypeName(dexTypeId.getString(dexParser)));
        }
        jSONObject.put("Params", jSONArray);
        jSONObject.put("ReturnType", DexTypeUtils.conversionTypeName(dexMethodId.getReturnType(dexParser).getString(dexParser)));
        return jSONObject.toString();
    }

    public final ArrayList<String> getResult() {
        return this.result;
    }

    public void startFind(DexParser dexParser) {
        for (DexMethodId dexMethodId : dexParser.dexMethodIdsList) {
            String string = dexParser.dexStringIdsList[dexMethodId.name_idx].getString(dexParser);
            if (!string.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME) && !string.equals("<cinit>")) {
                startParserMethodId(dexParser, dexMethodId);
            }
        }
    }

    public abstract void startParserMethodId(DexParser dexParser, DexMethodId dexMethodId);
}
