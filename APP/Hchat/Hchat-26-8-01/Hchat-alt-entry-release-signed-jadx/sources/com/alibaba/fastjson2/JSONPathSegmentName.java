package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p012ah.C0086a;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSegmentName extends JSONPathSegment {
    final String name;
    final long nameHashCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONPathSegmentName(String str, long j3) {
        this.name = str;
        this.nameHashCode = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && JSONPathSegmentName.class == obj.getClass()) {
            JSONPathSegmentName jSONPathSegmentName = (JSONPathSegmentName) obj;
            if ((this.nameHashCode == jSONPathSegmentName.nameHashCode && this.name == jSONPathSegmentName.name) || ((str = this.name) != null && str.equals(jSONPathSegmentName.name))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void eval(JSONPath.Context context) {
        Object obj;
        JSONPath.Context context2 = context.parent;
        Object obj2 = context2 == null ? context.root : context2.value;
        if (obj2 == null) {
            return;
        }
        Collection jSONArray = null;
        Long lValueOf = null;
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object value = map.get(this.name);
            if (value == null) {
                boolean zIsNumber = IOUtils.isNumber(this.name);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    if ((key instanceof Enum) && ((Enum) key).name().equals(this.name)) {
                        value = entry.getValue();
                        break;
                    } else if (key instanceof Long) {
                        if (lValueOf == null && zIsNumber) {
                            lValueOf = Long.valueOf(Long.parseLong(this.name));
                        }
                        if (key.equals(lValueOf)) {
                            value = entry.getValue();
                            break;
                        }
                    }
                }
            }
            context.value = value;
            return;
        }
        if (!(obj2 instanceof Collection)) {
            Class<?> cls = obj2.getClass();
            JSONWriter.Context context3 = context.path.writerContext;
            ObjectWriter objectWriter = context3 != null ? context3.getObjectWriter(cls) : JSONFactory.defaultObjectWriterProvider.getObjectWriter((Class) cls);
            if (objectWriter instanceof ObjectWriterAdapter) {
                FieldWriter fieldWriter = objectWriter.getFieldWriter(this.nameHashCode);
                if (fieldWriter != null) {
                    context.value = fieldWriter.getFieldValue(obj2);
                    return;
                }
                return;
            }
            if ((obj2 instanceof Number) || (obj2 instanceof Boolean)) {
                context.value = null;
                return;
            } else {
                C0086a.m464w(AbstractC3199a.m6838k(cls, "not support : "));
                return;
            }
        }
        Collection collection = (Collection) obj2;
        int size = collection.size();
        for (Object obj3 : collection) {
            if ((obj3 instanceof Map) && (obj = ((Map) obj3).get(this.name)) != null) {
                if (!(obj instanceof Collection)) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray(size);
                    }
                    jSONArray.add(obj);
                } else if (size == 1) {
                    jSONArray = (Collection) obj;
                } else {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray(size);
                    }
                    jSONArray.addAll((Collection) obj);
                }
            }
        }
        context.value = jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name, Long.valueOf(this.nameHashCode)});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.name;
    }
}
