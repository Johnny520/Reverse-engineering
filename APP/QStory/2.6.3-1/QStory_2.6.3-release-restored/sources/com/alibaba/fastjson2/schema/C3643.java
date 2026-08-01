package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C1589;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.reader.C3533;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p246.C8882;
import p295.InterfaceC9196;
import p305.C9242;
import p307.AbstractC9323;
import p307.C9353;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3643 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f9065;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C3642 f9066;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public transient ArrayList f9067;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f9068;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f9069;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f9070;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f9071;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f9072;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final JSONSchema f9073;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C3638 f9074;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C3640 f9075;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final JSONSchema f9076;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final JSONSchema f9077;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final JSONSchema f9078;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final LinkedHashMap f9079;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Set f9080;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashMap f9081;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long[] f9082;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C8882[] f9083;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f9084;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final JSONSchema f9085;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashMap f9086;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final LinkedHashMap f9087;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f9088;

    public C3643(JSONObject jSONObject, JSONSchema jSONSchema) {
        Set set;
        JSONSchema jSONSchemaM6200;
        JSONSchema jSONSchema2;
        super(jSONObject);
        this.f9088 = "object".equalsIgnoreCase(jSONObject.getString("type"));
        this.f9081 = new LinkedHashMap();
        this.f9086 = new LinkedHashMap();
        this.f9087 = new LinkedHashMap();
        this.f9065 = jSONObject.getBooleanValue("encoded", false);
        JSONObject jSONObject2 = jSONObject.getJSONObject("definitions");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                this.f9086.put(entry.getKey(), JSONSchema.m6200((JSONObject) entry.getValue(), jSONSchema == null ? this : jSONSchema));
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("$defs");
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                this.f9087.put(entry2.getKey(), JSONSchema.m6200((JSONObject) entry2.getValue(), jSONSchema == null ? this : jSONSchema));
            }
            ArrayList<C9242> arrayList = this.f9067;
            if (arrayList != null) {
                for (C9242 c9242 : arrayList) {
                    c9242.getClass();
                    LinkedHashMap linkedHashMap = this.f9087;
                    if (linkedHashMap != null && (jSONSchema2 = (JSONSchema) linkedHashMap.get(c9242.f23655)) != null) {
                        c9242.f23657.put(c9242.f23656, jSONSchema2);
                    }
                }
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("properties");
        JSONSchema jSONSchema3 = C3639.f9060;
        C3639 c3639 = C3639.f9061;
        if (jSONObject4 != null) {
            for (Map.Entry<String, Object> entry3 : jSONObject4.entrySet()) {
                String key = entry3.getKey();
                Object value = entry3.getValue();
                if (value instanceof Boolean) {
                    jSONSchemaM6200 = ((Boolean) value).booleanValue() ? c3639 : jSONSchema3;
                } else if (value instanceof JSONSchema) {
                    jSONSchemaM6200 = (JSONSchema) value;
                } else {
                    jSONSchemaM6200 = JSONSchema.m6200((JSONObject) value, jSONSchema == null ? this : jSONSchema);
                }
                this.f9081.put(key, jSONSchemaM6200);
                if (jSONSchemaM6200 instanceof C3645) {
                    (jSONSchema == null ? this : jSONSchema).mo6205(new C9242(this.f9081, key, ((C3645) jSONSchemaM6200).f9103));
                }
            }
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("patternProperties");
        if (jSONObject5 != null) {
            this.f9083 = new C8882[jSONObject5.size()];
            int i = 0;
            for (Map.Entry<String, Object> entry4 : jSONObject5.entrySet()) {
                String key2 = entry4.getKey();
                Object value2 = entry4.getValue();
                this.f9083[i] = new C8882(Pattern.compile(key2), value2 instanceof Boolean ? ((Boolean) value2).booleanValue() ? c3639 : jSONSchema3 : JSONSchema.m6200((JSONObject) value2, jSONSchema == null ? this : jSONSchema));
                i++;
            }
        } else {
            this.f9083 = new C8882[0];
        }
        JSONArray jSONArray = jSONObject.getJSONArray("required");
        if (jSONArray == null || jSONArray.isEmpty()) {
            this.f9080 = Collections.EMPTY_SET;
            this.f9082 = new long[0];
        } else {
            this.f9080 = new LinkedHashSet(jSONArray.size());
            int i2 = 0;
            while (true) {
                int size = jSONArray.size();
                set = this.f9080;
                if (i2 >= size) {
                    break;
                }
                set.add(jSONArray.getString(i2));
                i2++;
            }
            this.f9082 = new long[set.size()];
            Iterator it = this.f9080.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                this.f9082[i3] = AbstractC3693.m6334((String) it.next());
                i3++;
            }
        }
        Object obj = jSONObject.get("additionalProperties");
        if (obj instanceof Boolean) {
            this.f9085 = null;
            this.f9084 = ((Boolean) obj).booleanValue();
        } else if (obj instanceof JSONObject) {
            this.f9085 = JSONSchema.m6200((JSONObject) obj, jSONSchema);
            this.f9084 = false;
        } else {
            this.f9085 = null;
            this.f9084 = true;
        }
        Object obj2 = jSONObject.get("propertyNames");
        if (obj2 == null) {
            this.f9073 = null;
        } else if (obj2 instanceof Boolean) {
            this.f9073 = ((Boolean) obj2).booleanValue() ? c3639 : jSONSchema3;
        } else {
            this.f9073 = new C3644((JSONObject) obj2);
        }
        this.f9072 = jSONObject.getIntValue("minProperties", -1);
        this.f9071 = jSONObject.getIntValue("maxProperties", -1);
        JSONObject jSONObject6 = jSONObject.getJSONObject("dependentRequired");
        if (jSONObject6 == null || jSONObject6.isEmpty()) {
            this.f9070 = null;
            this.f9069 = null;
        } else {
            this.f9070 = new LinkedHashMap(jSONObject6.size(), 1.0f);
            this.f9069 = new LinkedHashMap(jSONObject6.size(), 1.0f);
            for (String str : jSONObject6.keySet()) {
                String[] strArr = (String[]) jSONObject6.getObject(str, String[].class, new JSONReader$Feature[0]);
                long[] jArr = new long[strArr.length];
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    jArr[i4] = AbstractC3693.m6334(strArr[i4]);
                }
                this.f9070.put(str, strArr);
                this.f9069.put(Long.valueOf(AbstractC3693.m6334(str)), jArr);
            }
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("dependentSchemas");
        int i5 = 15;
        if (jSONObject7 == null || jSONObject7.isEmpty()) {
            this.f9068 = null;
            this.f9079 = null;
        } else {
            this.f9068 = new LinkedHashMap(jSONObject7.size(), 1.0f);
            this.f9079 = new LinkedHashMap(jSONObject7.size(), 1.0f);
            for (String str2 : jSONObject7.keySet()) {
                JSONSchema jSONSchema4 = (JSONSchema) jSONObject7.getObject(str2, new C3533(i5));
                this.f9068.put(str2, jSONSchema4);
                this.f9079.put(Long.valueOf(AbstractC3693.m6334(str2)), jSONSchema4);
            }
        }
        this.f9078 = (JSONSchema) jSONObject.getObject("if", new C3533(i5));
        this.f9076 = (JSONSchema) jSONObject.getObject("else", new C3533(i5));
        this.f9077 = (JSONSchema) jSONObject.getObject("then", new C3533(i5));
        JSONSchema[] jSONSchemaArrM6199 = JSONSchema.m6199(jSONObject.getJSONArray("allOf"), null);
        this.f9075 = jSONSchemaArrM6199 == null ? null : new C3640(jSONSchemaArrM6199);
        this.f9074 = JSONSchema.m6195(jSONObject.getJSONArray("anyOf"), null);
        this.f9066 = JSONSchema.m6198(jSONObject.getJSONArray("oneOf"), null);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6205(C9242 c9242) {
        if (this.f9067 == null) {
            this.f9067 = new ArrayList();
        }
        this.f9067.add(c9242);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C1589 mo6208(Object obj) {
        Object objMo14554;
        Object objM6934 = obj;
        boolean z = this.f9088;
        C1589 c1589 = JSONSchema.f9028;
        if (objM6934 != null) {
            if (this.f9065) {
                if (objM6934 instanceof String) {
                    try {
                        objM6934 = InterfaceC3749.m6934((String) objM6934);
                    } catch (JSONException unused) {
                    }
                }
                return JSONSchema.f9035;
            }
            boolean z2 = objM6934 instanceof Map;
            C3642 c3642 = this.f9066;
            C3638 c3638 = this.f9074;
            C3640 c3640 = this.f9075;
            JSONSchema jSONSchema = this.f9076;
            JSONSchema jSONSchema2 = this.f9077;
            JSONSchema jSONSchema3 = this.f9078;
            LinkedHashMap linkedHashMap = this.f9070;
            Set<String> set = this.f9080;
            LinkedHashMap linkedHashMap2 = this.f9081;
            int i = this.f9072;
            int i2 = this.f9071;
            if (z2) {
                Map map = (Map) objM6934;
                for (String str : set) {
                    if (!map.containsKey(str)) {
                        return new C1589("required %s", new Object[]{str}, false);
                    }
                }
                Iterator it = linkedHashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Iterator it2 = it;
                    String str2 = (String) entry.getKey();
                    C3642 c36422 = c3642;
                    JSONSchema jSONSchema4 = (JSONSchema) entry.getValue();
                    C3638 c36382 = c3638;
                    Object obj2 = map.get(str2);
                    if (obj2 != null || map.containsKey(str2)) {
                        C1589 c1589Mo6208 = jSONSchema4.mo6208(obj2);
                        if (!c1589Mo6208.f2501) {
                            Object[] objArr = {str2};
                            C1589 c15892 = new C1589();
                            c15892.f2501 = false;
                            c15892.f2500 = "property %s invalid";
                            c15892.f2499 = objArr;
                            c15892.f2498 = c1589Mo6208;
                            if (objArr.length == 0) {
                                c15892.f2497 = "property %s invalid";
                            }
                            return c15892;
                        }
                    }
                    it = it2;
                    c3642 = c36422;
                    c3638 = c36382;
                }
                JSONSchema jSONSchema5 = c3642;
                JSONSchema jSONSchema6 = c3638;
                C8882[] c8882Arr = this.f9083;
                int length = c8882Arr.length;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    C8882 c8882 = c8882Arr[i3];
                    for (Map.Entry entry2 : map.entrySet()) {
                        int i5 = i3;
                        Object key = entry2.getKey();
                        C3640 c36402 = c3640;
                        if (key instanceof String) {
                            if (((Pattern) c8882.f22570).matcher((String) key).find()) {
                                C1589 c1589Mo62082 = ((JSONSchema) c8882.f22569).mo6208(entry2.getValue());
                                if (!c1589Mo62082.f2501) {
                                    return c1589Mo62082;
                                }
                            } else {
                                continue;
                            }
                        }
                        i3 = i5;
                        c3640 = c36402;
                    }
                    i3++;
                    length = i4;
                }
                JSONSchema jSONSchema7 = c3640;
                if (!this.f9084) {
                    for (Map.Entry entry3 : map.entrySet()) {
                        Object key2 = entry3.getKey();
                        if (!linkedHashMap2.containsKey(key2)) {
                            LinkedHashMap linkedHashMap3 = linkedHashMap2;
                            int length2 = c8882Arr.length;
                            C8882[] c8882Arr2 = c8882Arr;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length2) {
                                    JSONSchema jSONSchema8 = this.f9085;
                                    if (jSONSchema8 == null) {
                                        return new C1589("add additionalProperties %s", new Object[]{key2}, false);
                                    }
                                    C1589 c1589Mo62083 = jSONSchema8.mo6208(entry3.getValue());
                                    if (!c1589Mo62083.f2501) {
                                        return c1589Mo62083;
                                    }
                                } else {
                                    int i7 = length2;
                                    C8882 c88822 = c8882Arr2[i6];
                                    int i8 = i6;
                                    if (key2 instanceof String) {
                                        if (((Pattern) c88822.f22570).matcher((String) key2).find()) {
                                            break;
                                        }
                                    }
                                    i6 = i8 + 1;
                                    length2 = i7;
                                }
                            }
                            c8882Arr = c8882Arr2;
                            linkedHashMap2 = linkedHashMap3;
                        }
                    }
                }
                JSONSchema jSONSchema9 = this.f9073;
                if (jSONSchema9 != null) {
                    Iterator it3 = map.keySet().iterator();
                    while (it3.hasNext()) {
                        if (!jSONSchema9.mo6208(it3.next()).f2501) {
                            return JSONSchema.f9037;
                        }
                    }
                }
                if (i >= 0 && map.size() < i) {
                    return new C1589("minProperties not match, expect %s, but %s", new Object[]{Integer.valueOf(i), Integer.valueOf(map.size())}, false);
                }
                if (i2 >= 0 && map.size() > i2) {
                    return new C1589("maxProperties not match, expect %s, but %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(map.size())}, false);
                }
                if (linkedHashMap != null) {
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry4.getKey();
                        if (map.get(str3) != null) {
                            for (String str4 : (String[]) entry4.getValue()) {
                                if (!map.containsKey(str4)) {
                                    return new C1589("property %s, dependentRequired property %s", new Object[]{str3, str4}, false);
                                }
                            }
                        }
                    }
                }
                LinkedHashMap linkedHashMap4 = this.f9068;
                if (linkedHashMap4 != null) {
                    for (Map.Entry entry5 : linkedHashMap4.entrySet()) {
                        if (map.get((String) entry5.getKey()) != null) {
                            C1589 c1589Mo62084 = ((JSONSchema) entry5.getValue()).mo6208(map);
                            if (!c1589Mo62084.f2501) {
                                return c1589Mo62084;
                            }
                        }
                    }
                }
                if (jSONSchema3 != null) {
                    if (jSONSchema3.mo6208(map) == c1589) {
                        if (jSONSchema2 != null) {
                            C1589 c1589Mo62085 = jSONSchema2.mo6208(map);
                            if (!c1589Mo62085.f2501) {
                                return c1589Mo62085;
                            }
                        }
                    } else if (jSONSchema != null) {
                        C1589 c1589Mo62086 = jSONSchema.mo6208(map);
                        if (!c1589Mo62086.f2501) {
                            return c1589Mo62086;
                        }
                    }
                }
                if (jSONSchema7 != null) {
                    C1589 c1589Mo62087 = jSONSchema7.mo6208(map);
                    if (!c1589Mo62087.f2501) {
                        return c1589Mo62087;
                    }
                }
                if (jSONSchema6 != null) {
                    C1589 c1589Mo62088 = jSONSchema6.mo6208(map);
                    if (!c1589Mo62088.f2501) {
                        return c1589Mo62088;
                    }
                }
                if (jSONSchema5 != null) {
                    C1589 c1589Mo62089 = jSONSchema5.mo6208(map);
                    if (!c1589Mo62089.f2501) {
                        return c1589Mo62089;
                    }
                }
            } else {
                C3642 c36423 = c3642;
                Class<?> cls = objM6934.getClass();
                InterfaceC9352 interfaceC9352M14665 = AbstractC3766.f9639.m14665(cls, cls, false);
                if (!(interfaceC9352M14665 instanceof C9353)) {
                    return z ? new C1589("expect type %s, but %s", new Object[]{JSONSchema.Type.Object, cls}, false) : c1589;
                }
                int i9 = 0;
                while (true) {
                    long[] jArr = this.f9082;
                    C3642 c36424 = c36423;
                    String str5 = null;
                    if (i9 >= jArr.length) {
                        Iterator it4 = linkedHashMap2.entrySet().iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry6 = (Map.Entry) it4.next();
                            long jM6334 = AbstractC3693.m6334((String) entry6.getKey());
                            Iterator it5 = it4;
                            JSONSchema jSONSchema10 = (JSONSchema) entry6.getValue();
                            AbstractC9323 abstractC9323Mo14650 = interfaceC9352M14665.mo14650(jM6334);
                            if (abstractC9323Mo14650 != null && (objMo14554 = abstractC9323Mo14650.mo14554(objM6934)) != null) {
                                C1589 c1589Mo620810 = jSONSchema10.mo6208(objMo14554);
                                if (!c1589Mo620810.f2501) {
                                    return c1589Mo620810;
                                }
                            }
                            it4 = it5;
                        }
                        if (i >= 0 || i2 >= 0) {
                            Iterator it6 = ((C9353) interfaceC9352M14665).f24058.iterator();
                            int i10 = 0;
                            while (it6.hasNext()) {
                                if (((AbstractC9323) it6.next()).mo14554(objM6934) != null) {
                                    i10++;
                                }
                            }
                            if (i >= 0 && i10 < i) {
                                return new C1589("minProperties not match, expect %s, but %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i10)}, false);
                            }
                            if (i2 >= 0 && i10 > i2) {
                                return new C1589("maxProperties not match, expect %s, but %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i10)}, false);
                            }
                        }
                        LinkedHashMap linkedHashMap5 = this.f9069;
                        if (linkedHashMap5 != null) {
                            int i11 = 0;
                            for (Map.Entry entry7 : linkedHashMap5.entrySet()) {
                                Long l = (Long) entry7.getKey();
                                long[] jArr2 = (long[]) entry7.getValue();
                                if (interfaceC9352M14665.mo14650(l.longValue()).mo14554(objM6934) != null) {
                                    for (int i12 = 0; i12 < jArr2.length; i12++) {
                                        AbstractC9323 abstractC9323Mo146502 = interfaceC9352M14665.mo14650(jArr2[i12]);
                                        if (abstractC9323Mo146502 == null || abstractC9323Mo146502.mo14554(objM6934) == null) {
                                            String str6 = null;
                                            String str7 = null;
                                            int i13 = 0;
                                            for (Map.Entry entry8 : linkedHashMap.entrySet()) {
                                                if (i11 == i13) {
                                                    String str8 = (String) entry8.getKey();
                                                    str7 = ((String[]) entry8.getValue())[i12];
                                                    str6 = str8;
                                                }
                                                i13++;
                                            }
                                            return new C1589("property %s, dependentRequired property %s", new Object[]{str6, str7}, false);
                                        }
                                    }
                                }
                                i11++;
                            }
                        }
                        LinkedHashMap linkedHashMap6 = this.f9079;
                        if (linkedHashMap6 != null) {
                            for (Map.Entry entry9 : linkedHashMap6.entrySet()) {
                                AbstractC9323 abstractC9323Mo146503 = interfaceC9352M14665.mo14650(((Long) entry9.getKey()).longValue());
                                if (abstractC9323Mo146503 != null && abstractC9323Mo146503.mo14554(objM6934) != null) {
                                    C1589 c1589Mo620811 = ((JSONSchema) entry9.getValue()).mo6208(objM6934);
                                    if (!c1589Mo620811.f2501) {
                                        return c1589Mo620811;
                                    }
                                }
                            }
                        }
                        if (jSONSchema3 != null) {
                            if (jSONSchema3.mo6208(objM6934).f2501) {
                                if (jSONSchema2 != null) {
                                    C1589 c1589Mo620812 = jSONSchema2.mo6208(objM6934);
                                    if (!c1589Mo620812.f2501) {
                                        return c1589Mo620812;
                                    }
                                }
                            } else if (jSONSchema != null) {
                                C1589 c1589Mo620813 = jSONSchema.mo6208(objM6934);
                                if (!c1589Mo620813.f2501) {
                                    return c1589Mo620813;
                                }
                            }
                        }
                        if (c3640 != null) {
                            C1589 c1589Mo620814 = c3640.mo6208(objM6934);
                            if (!c1589Mo620814.f2501) {
                                return c1589Mo620814;
                            }
                        }
                        if (c3638 != null) {
                            C1589 c1589Mo620815 = c3638.mo6208(objM6934);
                            if (!c1589Mo620815.f2501) {
                                return c1589Mo620815;
                            }
                        }
                        if (c36424 == null) {
                            return c1589;
                        }
                        C1589 c1589Mo620816 = c36424.mo6208(objM6934);
                        return !c1589Mo620816.f2501 ? c1589Mo620816 : c1589;
                    }
                    AbstractC9323 abstractC9323Mo146504 = interfaceC9352M14665.mo14650(jArr[i9]);
                    if ((abstractC9323Mo146504 != null ? abstractC9323Mo146504.mo14554(objM6934) : null) == null) {
                        int i14 = 0;
                        for (String str9 : set) {
                            if (i14 == i9) {
                                str5 = str9;
                            }
                            i14++;
                        }
                        return new C1589("required property %s", new Object[]{str5}, false);
                    }
                    i9++;
                    c36423 = c36424;
                }
            }
        } else if (z) {
            return JSONSchema.f9027;
        }
        return c1589;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    @InterfaceC9196(true)
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public JSONObject mo6213() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "object");
        String str = this.f9041;
        if (str != null) {
            jSONObject.put("title", str);
        }
        String str2 = this.f9040;
        if (str2 != null) {
            jSONObject.put("description", str2);
        }
        LinkedHashMap linkedHashMap = this.f9086;
        if (!linkedHashMap.isEmpty()) {
            jSONObject.put("definitions", linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = this.f9087;
        if (!linkedHashMap2.isEmpty()) {
            jSONObject.put("defs", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = this.f9081;
        if (!linkedHashMap3.isEmpty()) {
            jSONObject.put("properties", linkedHashMap3);
        }
        Set set = this.f9080;
        if (!set.isEmpty()) {
            jSONObject.put("required", set);
        }
        boolean z = this.f9084;
        if (!z) {
            JSONSchema jSONSchema = this.f9085;
            if (jSONSchema != null) {
                jSONObject.put("additionalProperties", jSONSchema);
            } else {
                jSONObject.put("additionalProperties", Boolean.valueOf(z));
            }
        }
        C8882[] c8882Arr = this.f9083;
        if (c8882Arr != null && c8882Arr.length != 0) {
            jSONObject.put("patternProperties", c8882Arr);
        }
        JSONSchema jSONSchema2 = this.f9073;
        if (jSONSchema2 != null) {
            jSONObject.put("propertyNames", jSONSchema2);
        }
        int i = this.f9072;
        if (i != -1) {
            jSONObject.put("minProperties", Integer.valueOf(i));
        }
        int i2 = this.f9071;
        if (i2 != -1) {
            jSONObject.put("maxProperties", Integer.valueOf(i2));
        }
        LinkedHashMap linkedHashMap4 = this.f9070;
        if (linkedHashMap4 != null && !linkedHashMap4.isEmpty()) {
            jSONObject.put("dependentRequired", linkedHashMap4);
        }
        LinkedHashMap linkedHashMap5 = this.f9068;
        if (linkedHashMap5 != null && !linkedHashMap5.isEmpty()) {
            jSONObject.put("dependentSchemas", linkedHashMap5);
        }
        JSONSchema jSONSchema3 = this.f9078;
        if (jSONSchema3 != null) {
            jSONObject.put("if", jSONSchema3);
        }
        JSONSchema jSONSchema4 = this.f9077;
        if (jSONSchema4 != null) {
            jSONObject.put("then", jSONSchema4);
        }
        JSONSchema jSONSchema5 = this.f9076;
        if (jSONSchema5 != null) {
            jSONObject.put("else", jSONSchema5);
        }
        C3640 c3640 = this.f9075;
        if (c3640 != null) {
            jSONObject.put("allOf", c3640);
        }
        C3638 c3638 = this.f9074;
        if (c3638 != null) {
            jSONObject.put("anyOf", c3638);
        }
        C3642 c3642 = this.f9066;
        if (c3642 != null) {
            jSONObject.put("oneOf", c3642);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo6217() {
        return JSONSchema.Type.Object;
    }
}
