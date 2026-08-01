package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.reader.C2699;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p230.C8052;
import p279.InterfaceC8366;
import p289.C8421;
import p291.AbstractC8502;
import p291.C8532;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2809 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f8718;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C2808 f8719;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public transient ArrayList f8720;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f8721;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f8722;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f8723;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f8724;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f8725;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final JSONSchema f8726;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C2804 f8727;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C2806 f8728;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final JSONSchema f8729;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final JSONSchema f8730;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final JSONSchema f8731;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final LinkedHashMap f8732;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Set f8733;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashMap f8734;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long[] f8735;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C8052[] f8736;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f8737;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final JSONSchema f8738;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashMap f8739;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final LinkedHashMap f8740;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f8741;

    public C2809(JSONObject jSONObject, JSONSchema jSONSchema) {
        Set set;
        JSONSchema jSONSchemaM5595;
        JSONSchema jSONSchema2;
        super(jSONObject);
        this.f8741 = "object".equalsIgnoreCase(jSONObject.getString("type"));
        this.f8734 = new LinkedHashMap();
        this.f8739 = new LinkedHashMap();
        this.f8740 = new LinkedHashMap();
        this.f8718 = jSONObject.getBooleanValue("encoded", false);
        JSONObject jSONObject2 = jSONObject.getJSONObject("definitions");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                this.f8739.put(entry.getKey(), JSONSchema.m5595((JSONObject) entry.getValue(), jSONSchema == null ? this : jSONSchema));
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("$defs");
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                this.f8740.put(entry2.getKey(), JSONSchema.m5595((JSONObject) entry2.getValue(), jSONSchema == null ? this : jSONSchema));
            }
            ArrayList<C8421> arrayList = this.f8720;
            if (arrayList != null) {
                for (C8421 c8421 : arrayList) {
                    c8421.getClass();
                    LinkedHashMap linkedHashMap = this.f8740;
                    if (linkedHashMap != null && (jSONSchema2 = (JSONSchema) linkedHashMap.get(c8421.f23319)) != null) {
                        c8421.f23321.put(c8421.f23320, jSONSchema2);
                    }
                }
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("properties");
        JSONSchema jSONSchema3 = C2805.f8713;
        C2805 c2805 = C2805.f8714;
        if (jSONObject4 != null) {
            for (Map.Entry<String, Object> entry3 : jSONObject4.entrySet()) {
                String key = entry3.getKey();
                Object value = entry3.getValue();
                if (value instanceof Boolean) {
                    jSONSchemaM5595 = ((Boolean) value).booleanValue() ? c2805 : jSONSchema3;
                } else if (value instanceof JSONSchema) {
                    jSONSchemaM5595 = (JSONSchema) value;
                } else {
                    jSONSchemaM5595 = JSONSchema.m5595((JSONObject) value, jSONSchema == null ? this : jSONSchema);
                }
                this.f8734.put(key, jSONSchemaM5595);
                if (jSONSchemaM5595 instanceof C2811) {
                    (jSONSchema == null ? this : jSONSchema).mo5600(new C8421(this.f8734, key, ((C2811) jSONSchemaM5595).f8756));
                }
            }
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("patternProperties");
        if (jSONObject5 != null) {
            this.f8736 = new C8052[jSONObject5.size()];
            int i = 0;
            for (Map.Entry<String, Object> entry4 : jSONObject5.entrySet()) {
                String key2 = entry4.getKey();
                Object value2 = entry4.getValue();
                this.f8736[i] = new C8052(Pattern.compile(key2), value2 instanceof Boolean ? ((Boolean) value2).booleanValue() ? c2805 : jSONSchema3 : JSONSchema.m5595((JSONObject) value2, jSONSchema == null ? this : jSONSchema));
                i++;
            }
        } else {
            this.f8736 = new C8052[0];
        }
        JSONArray jSONArray = jSONObject.getJSONArray("required");
        if (jSONArray == null || jSONArray.isEmpty()) {
            this.f8733 = Collections.EMPTY_SET;
            this.f8735 = new long[0];
        } else {
            this.f8733 = new LinkedHashSet(jSONArray.size());
            int i2 = 0;
            while (true) {
                int size = jSONArray.size();
                set = this.f8733;
                if (i2 >= size) {
                    break;
                }
                set.add(jSONArray.getString(i2));
                i2++;
            }
            this.f8735 = new long[set.size()];
            Iterator it = this.f8733.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                this.f8735[i3] = AbstractC2859.m5729((String) it.next());
                i3++;
            }
        }
        Object obj = jSONObject.get("additionalProperties");
        if (obj instanceof Boolean) {
            this.f8738 = null;
            this.f8737 = ((Boolean) obj).booleanValue();
        } else if (obj instanceof JSONObject) {
            this.f8738 = JSONSchema.m5595((JSONObject) obj, jSONSchema);
            this.f8737 = false;
        } else {
            this.f8738 = null;
            this.f8737 = true;
        }
        Object obj2 = jSONObject.get("propertyNames");
        if (obj2 == null) {
            this.f8726 = null;
        } else if (obj2 instanceof Boolean) {
            this.f8726 = ((Boolean) obj2).booleanValue() ? c2805 : jSONSchema3;
        } else {
            this.f8726 = new C2810((JSONObject) obj2);
        }
        this.f8725 = jSONObject.getIntValue("minProperties", -1);
        this.f8724 = jSONObject.getIntValue("maxProperties", -1);
        JSONObject jSONObject6 = jSONObject.getJSONObject("dependentRequired");
        if (jSONObject6 == null || jSONObject6.isEmpty()) {
            this.f8723 = null;
            this.f8722 = null;
        } else {
            this.f8723 = new LinkedHashMap(jSONObject6.size(), 1.0f);
            this.f8722 = new LinkedHashMap(jSONObject6.size(), 1.0f);
            for (String str : jSONObject6.keySet()) {
                String[] strArr = (String[]) jSONObject6.getObject(str, String[].class, new JSONReader$Feature[0]);
                long[] jArr = new long[strArr.length];
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    jArr[i4] = AbstractC2859.m5729(strArr[i4]);
                }
                this.f8723.put(str, strArr);
                this.f8722.put(Long.valueOf(AbstractC2859.m5729(str)), jArr);
            }
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("dependentSchemas");
        int i5 = 15;
        if (jSONObject7 == null || jSONObject7.isEmpty()) {
            this.f8721 = null;
            this.f8732 = null;
        } else {
            this.f8721 = new LinkedHashMap(jSONObject7.size(), 1.0f);
            this.f8732 = new LinkedHashMap(jSONObject7.size(), 1.0f);
            for (String str2 : jSONObject7.keySet()) {
                JSONSchema jSONSchema4 = (JSONSchema) jSONObject7.getObject(str2, new C2699(i5));
                this.f8721.put(str2, jSONSchema4);
                this.f8732.put(Long.valueOf(AbstractC2859.m5729(str2)), jSONSchema4);
            }
        }
        this.f8731 = (JSONSchema) jSONObject.getObject("if", new C2699(i5));
        this.f8729 = (JSONSchema) jSONObject.getObject("else", new C2699(i5));
        this.f8730 = (JSONSchema) jSONObject.getObject("then", new C2699(i5));
        JSONSchema[] jSONSchemaArrM5594 = JSONSchema.m5594(jSONObject.getJSONArray("allOf"), null);
        this.f8728 = jSONSchemaArrM5594 == null ? null : new C2806(jSONSchemaArrM5594);
        this.f8727 = JSONSchema.m5590(jSONObject.getJSONArray("anyOf"), null);
        this.f8719 = JSONSchema.m5593(jSONObject.getJSONArray("oneOf"), null);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5600(C8421 c8421) {
        if (this.f8720 == null) {
            this.f8720 = new ArrayList();
        }
        this.f8720.add(c8421);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5603(Object obj) {
        Object objMo13976;
        Object objM6316 = obj;
        boolean z = this.f8741;
        C0748 c0748 = JSONSchema.f8681;
        if (objM6316 != null) {
            if (this.f8718) {
                if (objM6316 instanceof String) {
                    try {
                        objM6316 = InterfaceC2915.m6316((String) objM6316);
                    } catch (JSONException unused) {
                    }
                }
                return JSONSchema.f8688;
            }
            boolean z2 = objM6316 instanceof Map;
            C2808 c2808 = this.f8719;
            C2804 c2804 = this.f8727;
            C2806 c2806 = this.f8728;
            JSONSchema jSONSchema = this.f8729;
            JSONSchema jSONSchema2 = this.f8730;
            JSONSchema jSONSchema3 = this.f8731;
            LinkedHashMap linkedHashMap = this.f8723;
            Set<String> set = this.f8733;
            LinkedHashMap linkedHashMap2 = this.f8734;
            int i = this.f8725;
            int i2 = this.f8724;
            if (z2) {
                Map map = (Map) objM6316;
                for (String str : set) {
                    if (!map.containsKey(str)) {
                        return new C0748("required %s", new Object[]{str}, false);
                    }
                }
                Iterator it = linkedHashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Iterator it2 = it;
                    String str2 = (String) entry.getKey();
                    C2808 c28082 = c2808;
                    JSONSchema jSONSchema4 = (JSONSchema) entry.getValue();
                    C2804 c28042 = c2804;
                    Object obj2 = map.get(str2);
                    if (obj2 != null || map.containsKey(str2)) {
                        C0748 c0748Mo5603 = jSONSchema4.mo5603(obj2);
                        if (!c0748Mo5603.f2155) {
                            Object[] objArr = {str2};
                            C0748 c07482 = new C0748();
                            c07482.f2155 = false;
                            c07482.f2154 = "property %s invalid";
                            c07482.f2153 = objArr;
                            c07482.f2152 = c0748Mo5603;
                            if (objArr.length == 0) {
                                c07482.f2151 = "property %s invalid";
                            }
                            return c07482;
                        }
                    }
                    it = it2;
                    c2808 = c28082;
                    c2804 = c28042;
                }
                JSONSchema jSONSchema5 = c2808;
                JSONSchema jSONSchema6 = c2804;
                C8052[] c8052Arr = this.f8736;
                int length = c8052Arr.length;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    C8052 c8052 = c8052Arr[i3];
                    for (Map.Entry entry2 : map.entrySet()) {
                        int i5 = i3;
                        Object key = entry2.getKey();
                        C2806 c28062 = c2806;
                        if (key instanceof String) {
                            if (((Pattern) c8052.f22227).matcher((String) key).find()) {
                                C0748 c0748Mo56032 = ((JSONSchema) c8052.f22226).mo5603(entry2.getValue());
                                if (!c0748Mo56032.f2155) {
                                    return c0748Mo56032;
                                }
                            } else {
                                continue;
                            }
                        }
                        i3 = i5;
                        c2806 = c28062;
                    }
                    i3++;
                    length = i4;
                }
                JSONSchema jSONSchema7 = c2806;
                if (!this.f8737) {
                    for (Map.Entry entry3 : map.entrySet()) {
                        Object key2 = entry3.getKey();
                        if (!linkedHashMap2.containsKey(key2)) {
                            LinkedHashMap linkedHashMap3 = linkedHashMap2;
                            int length2 = c8052Arr.length;
                            C8052[] c8052Arr2 = c8052Arr;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length2) {
                                    JSONSchema jSONSchema8 = this.f8738;
                                    if (jSONSchema8 == null) {
                                        return new C0748("add additionalProperties %s", new Object[]{key2}, false);
                                    }
                                    C0748 c0748Mo56033 = jSONSchema8.mo5603(entry3.getValue());
                                    if (!c0748Mo56033.f2155) {
                                        return c0748Mo56033;
                                    }
                                } else {
                                    int i7 = length2;
                                    C8052 c80522 = c8052Arr2[i6];
                                    int i8 = i6;
                                    if (key2 instanceof String) {
                                        if (((Pattern) c80522.f22227).matcher((String) key2).find()) {
                                            break;
                                        }
                                    }
                                    i6 = i8 + 1;
                                    length2 = i7;
                                }
                            }
                            c8052Arr = c8052Arr2;
                            linkedHashMap2 = linkedHashMap3;
                        }
                    }
                }
                JSONSchema jSONSchema9 = this.f8726;
                if (jSONSchema9 != null) {
                    Iterator it3 = map.keySet().iterator();
                    while (it3.hasNext()) {
                        if (!jSONSchema9.mo5603(it3.next()).f2155) {
                            return JSONSchema.f8690;
                        }
                    }
                }
                if (i >= 0 && map.size() < i) {
                    return new C0748("minProperties not match, expect %s, but %s", new Object[]{Integer.valueOf(i), Integer.valueOf(map.size())}, false);
                }
                if (i2 >= 0 && map.size() > i2) {
                    return new C0748("maxProperties not match, expect %s, but %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(map.size())}, false);
                }
                if (linkedHashMap != null) {
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry4.getKey();
                        if (map.get(str3) != null) {
                            for (String str4 : (String[]) entry4.getValue()) {
                                if (!map.containsKey(str4)) {
                                    return new C0748("property %s, dependentRequired property %s", new Object[]{str3, str4}, false);
                                }
                            }
                        }
                    }
                }
                LinkedHashMap linkedHashMap4 = this.f8721;
                if (linkedHashMap4 != null) {
                    for (Map.Entry entry5 : linkedHashMap4.entrySet()) {
                        if (map.get((String) entry5.getKey()) != null) {
                            C0748 c0748Mo56034 = ((JSONSchema) entry5.getValue()).mo5603(map);
                            if (!c0748Mo56034.f2155) {
                                return c0748Mo56034;
                            }
                        }
                    }
                }
                if (jSONSchema3 != null) {
                    if (jSONSchema3.mo5603(map) == c0748) {
                        if (jSONSchema2 != null) {
                            C0748 c0748Mo56035 = jSONSchema2.mo5603(map);
                            if (!c0748Mo56035.f2155) {
                                return c0748Mo56035;
                            }
                        }
                    } else if (jSONSchema != null) {
                        C0748 c0748Mo56036 = jSONSchema.mo5603(map);
                        if (!c0748Mo56036.f2155) {
                            return c0748Mo56036;
                        }
                    }
                }
                if (jSONSchema7 != null) {
                    C0748 c0748Mo56037 = jSONSchema7.mo5603(map);
                    if (!c0748Mo56037.f2155) {
                        return c0748Mo56037;
                    }
                }
                if (jSONSchema6 != null) {
                    C0748 c0748Mo56038 = jSONSchema6.mo5603(map);
                    if (!c0748Mo56038.f2155) {
                        return c0748Mo56038;
                    }
                }
                if (jSONSchema5 != null) {
                    C0748 c0748Mo56039 = jSONSchema5.mo5603(map);
                    if (!c0748Mo56039.f2155) {
                        return c0748Mo56039;
                    }
                }
            } else {
                C2808 c28083 = c2808;
                Class<?> cls = objM6316.getClass();
                InterfaceC8531 interfaceC8531M14087 = AbstractC2932.f9292.m14087(cls, cls, false);
                if (!(interfaceC8531M14087 instanceof C8532)) {
                    return z ? new C0748("expect type %s, but %s", new Object[]{JSONSchema.Type.Object, cls}, false) : c0748;
                }
                int i9 = 0;
                while (true) {
                    long[] jArr = this.f8735;
                    C2808 c28084 = c28083;
                    String str5 = null;
                    if (i9 >= jArr.length) {
                        Iterator it4 = linkedHashMap2.entrySet().iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry6 = (Map.Entry) it4.next();
                            long jM5729 = AbstractC2859.m5729((String) entry6.getKey());
                            Iterator it5 = it4;
                            JSONSchema jSONSchema10 = (JSONSchema) entry6.getValue();
                            AbstractC8502 abstractC8502Mo14072 = interfaceC8531M14087.mo14072(jM5729);
                            if (abstractC8502Mo14072 != null && (objMo13976 = abstractC8502Mo14072.mo13976(objM6316)) != null) {
                                C0748 c0748Mo560310 = jSONSchema10.mo5603(objMo13976);
                                if (!c0748Mo560310.f2155) {
                                    return c0748Mo560310;
                                }
                            }
                            it4 = it5;
                        }
                        if (i >= 0 || i2 >= 0) {
                            Iterator it6 = ((C8532) interfaceC8531M14087).f23722.iterator();
                            int i10 = 0;
                            while (it6.hasNext()) {
                                if (((AbstractC8502) it6.next()).mo13976(objM6316) != null) {
                                    i10++;
                                }
                            }
                            if (i >= 0 && i10 < i) {
                                return new C0748("minProperties not match, expect %s, but %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i10)}, false);
                            }
                            if (i2 >= 0 && i10 > i2) {
                                return new C0748("maxProperties not match, expect %s, but %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i10)}, false);
                            }
                        }
                        LinkedHashMap linkedHashMap5 = this.f8722;
                        if (linkedHashMap5 != null) {
                            int i11 = 0;
                            for (Map.Entry entry7 : linkedHashMap5.entrySet()) {
                                Long l = (Long) entry7.getKey();
                                long[] jArr2 = (long[]) entry7.getValue();
                                if (interfaceC8531M14087.mo14072(l.longValue()).mo13976(objM6316) != null) {
                                    for (int i12 = 0; i12 < jArr2.length; i12++) {
                                        AbstractC8502 abstractC8502Mo140722 = interfaceC8531M14087.mo14072(jArr2[i12]);
                                        if (abstractC8502Mo140722 == null || abstractC8502Mo140722.mo13976(objM6316) == null) {
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
                                            return new C0748("property %s, dependentRequired property %s", new Object[]{str6, str7}, false);
                                        }
                                    }
                                }
                                i11++;
                            }
                        }
                        LinkedHashMap linkedHashMap6 = this.f8732;
                        if (linkedHashMap6 != null) {
                            for (Map.Entry entry9 : linkedHashMap6.entrySet()) {
                                AbstractC8502 abstractC8502Mo140723 = interfaceC8531M14087.mo14072(((Long) entry9.getKey()).longValue());
                                if (abstractC8502Mo140723 != null && abstractC8502Mo140723.mo13976(objM6316) != null) {
                                    C0748 c0748Mo560311 = ((JSONSchema) entry9.getValue()).mo5603(objM6316);
                                    if (!c0748Mo560311.f2155) {
                                        return c0748Mo560311;
                                    }
                                }
                            }
                        }
                        if (jSONSchema3 != null) {
                            if (jSONSchema3.mo5603(objM6316).f2155) {
                                if (jSONSchema2 != null) {
                                    C0748 c0748Mo560312 = jSONSchema2.mo5603(objM6316);
                                    if (!c0748Mo560312.f2155) {
                                        return c0748Mo560312;
                                    }
                                }
                            } else if (jSONSchema != null) {
                                C0748 c0748Mo560313 = jSONSchema.mo5603(objM6316);
                                if (!c0748Mo560313.f2155) {
                                    return c0748Mo560313;
                                }
                            }
                        }
                        if (c2806 != null) {
                            C0748 c0748Mo560314 = c2806.mo5603(objM6316);
                            if (!c0748Mo560314.f2155) {
                                return c0748Mo560314;
                            }
                        }
                        if (c2804 != null) {
                            C0748 c0748Mo560315 = c2804.mo5603(objM6316);
                            if (!c0748Mo560315.f2155) {
                                return c0748Mo560315;
                            }
                        }
                        if (c28084 == null) {
                            return c0748;
                        }
                        C0748 c0748Mo560316 = c28084.mo5603(objM6316);
                        return !c0748Mo560316.f2155 ? c0748Mo560316 : c0748;
                    }
                    AbstractC8502 abstractC8502Mo140724 = interfaceC8531M14087.mo14072(jArr[i9]);
                    if ((abstractC8502Mo140724 != null ? abstractC8502Mo140724.mo13976(objM6316) : null) == null) {
                        int i14 = 0;
                        for (String str9 : set) {
                            if (i14 == i9) {
                                str5 = str9;
                            }
                            i14++;
                        }
                        return new C0748("required property %s", new Object[]{str5}, false);
                    }
                    i9++;
                    c28083 = c28084;
                }
            }
        } else if (z) {
            return JSONSchema.f8680;
        }
        return c0748;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    @InterfaceC8366(true)
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public JSONObject mo5608() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "object");
        String str = this.f8694;
        if (str != null) {
            jSONObject.put("title", str);
        }
        String str2 = this.f8693;
        if (str2 != null) {
            jSONObject.put("description", str2);
        }
        LinkedHashMap linkedHashMap = this.f8739;
        if (!linkedHashMap.isEmpty()) {
            jSONObject.put("definitions", linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = this.f8740;
        if (!linkedHashMap2.isEmpty()) {
            jSONObject.put("defs", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = this.f8734;
        if (!linkedHashMap3.isEmpty()) {
            jSONObject.put("properties", linkedHashMap3);
        }
        Set set = this.f8733;
        if (!set.isEmpty()) {
            jSONObject.put("required", set);
        }
        boolean z = this.f8737;
        if (!z) {
            JSONSchema jSONSchema = this.f8738;
            if (jSONSchema != null) {
                jSONObject.put("additionalProperties", jSONSchema);
            } else {
                jSONObject.put("additionalProperties", Boolean.valueOf(z));
            }
        }
        C8052[] c8052Arr = this.f8736;
        if (c8052Arr != null && c8052Arr.length != 0) {
            jSONObject.put("patternProperties", c8052Arr);
        }
        JSONSchema jSONSchema2 = this.f8726;
        if (jSONSchema2 != null) {
            jSONObject.put("propertyNames", jSONSchema2);
        }
        int i = this.f8725;
        if (i != -1) {
            jSONObject.put("minProperties", Integer.valueOf(i));
        }
        int i2 = this.f8724;
        if (i2 != -1) {
            jSONObject.put("maxProperties", Integer.valueOf(i2));
        }
        LinkedHashMap linkedHashMap4 = this.f8723;
        if (linkedHashMap4 != null && !linkedHashMap4.isEmpty()) {
            jSONObject.put("dependentRequired", linkedHashMap4);
        }
        LinkedHashMap linkedHashMap5 = this.f8721;
        if (linkedHashMap5 != null && !linkedHashMap5.isEmpty()) {
            jSONObject.put("dependentSchemas", linkedHashMap5);
        }
        JSONSchema jSONSchema3 = this.f8731;
        if (jSONSchema3 != null) {
            jSONObject.put("if", jSONSchema3);
        }
        JSONSchema jSONSchema4 = this.f8730;
        if (jSONSchema4 != null) {
            jSONObject.put("then", jSONSchema4);
        }
        JSONSchema jSONSchema5 = this.f8729;
        if (jSONSchema5 != null) {
            jSONObject.put("else", jSONSchema5);
        }
        C2806 c2806 = this.f8728;
        if (c2806 != null) {
            jSONObject.put("allOf", c2806);
        }
        C2804 c2804 = this.f8727;
        if (c2804 != null) {
            jSONObject.put("anyOf", c2804);
        }
        C2808 c2808 = this.f8719;
        if (c2808 != null) {
            jSONObject.put("oneOf", c2808);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5612() {
        return JSONSchema.Type.Object;
    }
}
