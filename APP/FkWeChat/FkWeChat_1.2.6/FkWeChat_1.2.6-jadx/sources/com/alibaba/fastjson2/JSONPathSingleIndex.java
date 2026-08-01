package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSingleIndex extends JSONPathSingle {
    final int index;
    final JSONPathSegmentIndex segment;

    public JSONPathSingleIndex(String str, JSONPathSegmentIndex jSONPathSegmentIndex, JSONPath.Feature... featureArr) {
        super(jSONPathSegmentIndex, str, featureArr);
        this.segment = jSONPathSegmentIndex;
        this.index = jSONPathSegmentIndex.index;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public Object eval(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (this.index < list.size()) {
                return list.get(this.index);
            }
            return null;
        }
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        context.root = obj;
        this.segment.eval(context);
        return context.value;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        int iStartArray = jSONReader.startArray();
        boolean z10 = jSONReader.jsonb;
        if (z10 && this.index >= iStartArray) {
            return null;
        }
        if (!z10 && jSONReader.nextIfArrayEnd()) {
            return null;
        }
        for (int i10 = 0; i10 < this.index && i10 < iStartArray; i10++) {
            jSONReader.skipValue();
            if (!jSONReader.jsonb && jSONReader.nextIfArrayEnd()) {
                return null;
            }
        }
        return jSONReader.readAny();
    }
}
