package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.reader.C2700;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p230.C8053;
import p279.InterfaceC8367;
import p289.C8413;
import p291.AbstractC8494;
import p291.C8524;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2810 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f8720;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C2809 f8721;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public transient ArrayList f8722;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f8723;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f8724;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f8725;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f8726;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f8727;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final JSONSchema f8728;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C2805 f8729;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C2807 f8730;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final JSONSchema f8731;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final JSONSchema f8732;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final JSONSchema f8733;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final LinkedHashMap f8734;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Set f8735;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashMap f8736;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long[] f8737;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C8053[] f8738;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f8739;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final JSONSchema f8740;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashMap f8741;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final LinkedHashMap f8742;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f8743;

    public C2810(JSONObject jSONObject, JSONSchema jSONSchema) {
        Set set;
        JSONSchema jSONSchemaM5640;
        JSONSchema jSONSchema2;
        super(jSONObject);
        this.f8743 = "object".equalsIgnoreCase(jSONObject.getString("type"));
        this.f8736 = new LinkedHashMap();
        this.f8741 = new LinkedHashMap();
        this.f8742 = new LinkedHashMap();
        this.f8720 = jSONObject.getBooleanValue("encoded", false);
        JSONObject jSONObject2 = jSONObject.getJSONObject("definitions");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                this.f8741.put(entry.getKey(), JSONSchema.m5640((JSONObject) entry.getValue(), jSONSchema == null ? this : jSONSchema));
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("$defs");
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                this.f8742.put(entry2.getKey(), JSONSchema.m5640((JSONObject) entry2.getValue(), jSONSchema == null ? this : jSONSchema));
            }
            ArrayList<C8413> arrayList = this.f8722;
            if (arrayList != null) {
                for (C8413 c8413 : arrayList) {
                    c8413.getClass();
                    LinkedHashMap linkedHashMap = this.f8742;
                    if (linkedHashMap != null && (jSONSchema2 = (JSONSchema) linkedHashMap.get(c8413.f23310)) != null) {
                        c8413.f23312.put(c8413.f23311, jSONSchema2);
                    }
                }
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("properties");
        JSONSchema jSONSchema3 = C2806.f8715;
        C2806 c2806 = C2806.f8716;
        if (jSONObject4 != null) {
            for (Map.Entry<String, Object> entry3 : jSONObject4.entrySet()) {
                String key = entry3.getKey();
                Object value = entry3.getValue();
                if (value instanceof Boolean) {
                    jSONSchemaM5640 = ((Boolean) value).booleanValue() ? c2806 : jSONSchema3;
                } else if (value instanceof JSONSchema) {
                    jSONSchemaM5640 = (JSONSchema) value;
                } else {
                    jSONSchemaM5640 = JSONSchema.m5640((JSONObject) value, jSONSchema == null ? this : jSONSchema);
                }
                this.f8736.put(key, jSONSchemaM5640);
                if (jSONSchemaM5640 instanceof C2812) {
                    (jSONSchema == null ? this : jSONSchema).mo5645(new C8413(this.f8736, key, ((C2812) jSONSchemaM5640).f8758));
                }
            }
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("patternProperties");
        if (jSONObject5 != null) {
            this.f8738 = new C8053[jSONObject5.size()];
            int i = 0;
            for (Map.Entry<String, Object> entry4 : jSONObject5.entrySet()) {
                String key2 = entry4.getKey();
                Object value2 = entry4.getValue();
                this.f8738[i] = new C8053(Pattern.compile(key2), value2 instanceof Boolean ? ((Boolean) value2).booleanValue() ? c2806 : jSONSchema3 : JSONSchema.m5640((JSONObject) value2, jSONSchema == null ? this : jSONSchema));
                i++;
            }
        } else {
            this.f8738 = new C8053[0];
        }
        JSONArray jSONArray = jSONObject.getJSONArray("required");
        if (jSONArray == null || jSONArray.isEmpty()) {
            this.f8735 = Collections.EMPTY_SET;
            this.f8737 = new long[0];
        } else {
            this.f8735 = new LinkedHashSet(jSONArray.size());
            int i2 = 0;
            while (true) {
                int size = jSONArray.size();
                set = this.f8735;
                if (i2 >= size) {
                    break;
                }
                set.add(jSONArray.getString(i2));
                i2++;
            }
            this.f8737 = new long[set.size()];
            Iterator it = this.f8735.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                this.f8737[i3] = AbstractC2860.m5774((String) it.next());
                i3++;
            }
        }
        Object obj = jSONObject.get("additionalProperties");
        if (obj instanceof Boolean) {
            this.f8740 = null;
            this.f8739 = ((Boolean) obj).booleanValue();
        } else if (obj instanceof JSONObject) {
            this.f8740 = JSONSchema.m5640((JSONObject) obj, jSONSchema);
            this.f8739 = false;
        } else {
            this.f8740 = null;
            this.f8739 = true;
        }
        Object obj2 = jSONObject.get("propertyNames");
        if (obj2 == null) {
            this.f8728 = null;
        } else if (obj2 instanceof Boolean) {
            this.f8728 = ((Boolean) obj2).booleanValue() ? c2806 : jSONSchema3;
        } else {
            this.f8728 = new C2811((JSONObject) obj2);
        }
        this.f8727 = jSONObject.getIntValue("minProperties", -1);
        this.f8726 = jSONObject.getIntValue("maxProperties", -1);
        JSONObject jSONObject6 = jSONObject.getJSONObject("dependentRequired");
        if (jSONObject6 == null || jSONObject6.isEmpty()) {
            this.f8725 = null;
            this.f8724 = null;
        } else {
            this.f8725 = new LinkedHashMap(jSONObject6.size(), 1.0f);
            this.f8724 = new LinkedHashMap(jSONObject6.size(), 1.0f);
            for (String str : jSONObject6.keySet()) {
                String[] strArr = (String[]) jSONObject6.getObject(str, String[].class, new JSONReader$Feature[0]);
                long[] jArr = new long[strArr.length];
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    jArr[i4] = AbstractC2860.m5774(strArr[i4]);
                }
                this.f8725.put(str, strArr);
                this.f8724.put(Long.valueOf(AbstractC2860.m5774(str)), jArr);
            }
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("dependentSchemas");
        int i5 = 15;
        if (jSONObject7 == null || jSONObject7.isEmpty()) {
            this.f8723 = null;
            this.f8734 = null;
        } else {
            this.f8723 = new LinkedHashMap(jSONObject7.size(), 1.0f);
            this.f8734 = new LinkedHashMap(jSONObject7.size(), 1.0f);
            for (String str2 : jSONObject7.keySet()) {
                JSONSchema jSONSchema4 = (JSONSchema) jSONObject7.getObject(str2, new C2700(i5));
                this.f8723.put(str2, jSONSchema4);
                this.f8734.put(Long.valueOf(AbstractC2860.m5774(str2)), jSONSchema4);
            }
        }
        this.f8733 = (JSONSchema) jSONObject.getObject("if", new C2700(i5));
        this.f8731 = (JSONSchema) jSONObject.getObject("else", new C2700(i5));
        this.f8732 = (JSONSchema) jSONObject.getObject("then", new C2700(i5));
        JSONSchema[] jSONSchemaArrM5639 = JSONSchema.m5639(jSONObject.getJSONArray("allOf"), null);
        this.f8730 = jSONSchemaArrM5639 == null ? null : new C2807(jSONSchemaArrM5639);
        this.f8729 = JSONSchema.m5635(jSONObject.getJSONArray("anyOf"), null);
        this.f8721 = JSONSchema.m5638(jSONObject.getJSONArray("oneOf"), null);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5645(C8413 c8413) {
        if (this.f8722 == null) {
            this.f8722 = new ArrayList();
        }
        this.f8722.add(c8413);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5648(Object obj) {
        Object objMo13995;
        Object objM6374 = obj;
        boolean z = this.f8743;
        C0748 c0748 = JSONSchema.f8683;
        if (objM6374 != null) {
            if (this.f8720) {
                if (objM6374 instanceof String) {
                    try {
                        objM6374 = InterfaceC2916.m6374((String) objM6374);
                    } catch (JSONException unused) {
                    }
                }
                return JSONSchema.f8690;
            }
            boolean z2 = objM6374 instanceof Map;
            C2809 c2809 = this.f8721;
            C2805 c2805 = this.f8729;
            C2807 c2807 = this.f8730;
            JSONSchema jSONSchema = this.f8731;
            JSONSchema jSONSchema2 = this.f8732;
            JSONSchema jSONSchema3 = this.f8733;
            LinkedHashMap linkedHashMap = this.f8725;
            Set<String> set = this.f8735;
            LinkedHashMap linkedHashMap2 = this.f8736;
            int i = this.f8727;
            int i2 = this.f8726;
            if (z2) {
                Map map = (Map) objM6374;
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
                    C2809 c28092 = c2809;
                    JSONSchema jSONSchema4 = (JSONSchema) entry.getValue();
                    C2805 c28052 = c2805;
                    Object obj2 = map.get(str2);
                    if (obj2 != null || map.containsKey(str2)) {
                        C0748 c0748Mo5648 = jSONSchema4.mo5648(obj2);
                        if (!c0748Mo5648.f2156) {
                            Object[] objArr = {str2};
                            C0748 c07482 = new C0748();
                            c07482.f2156 = false;
                            c07482.f2155 = "property %s invalid";
                            c07482.f2154 = objArr;
                            c07482.f2153 = c0748Mo5648;
                            if (objArr.length == 0) {
                                c07482.f2152 = "property %s invalid";
                            }
                            return c07482;
                        }
                    }
                    it = it2;
                    c2809 = c28092;
                    c2805 = c28052;
                }
                JSONSchema jSONSchema5 = c2809;
                JSONSchema jSONSchema6 = c2805;
                C8053[] c8053Arr = this.f8738;
                int length = c8053Arr.length;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    C8053 c8053 = c8053Arr[i3];
                    for (Map.Entry entry2 : map.entrySet()) {
                        int i5 = i3;
                        Object key = entry2.getKey();
                        C2807 c28072 = c2807;
                        if (key instanceof String) {
                            if (((Pattern) c8053.f22225).matcher((String) key).find()) {
                                C0748 c0748Mo56482 = ((JSONSchema) c8053.f22224).mo5648(entry2.getValue());
                                if (!c0748Mo56482.f2156) {
                                    return c0748Mo56482;
                                }
                            } else {
                                continue;
                            }
                        }
                        i3 = i5;
                        c2807 = c28072;
                    }
                    i3++;
                    length = i4;
                }
                JSONSchema jSONSchema7 = c2807;
                if (!this.f8739) {
                    for (Map.Entry entry3 : map.entrySet()) {
                        Object key2 = entry3.getKey();
                        if (!linkedHashMap2.containsKey(key2)) {
                            LinkedHashMap linkedHashMap3 = linkedHashMap2;
                            int length2 = c8053Arr.length;
                            C8053[] c8053Arr2 = c8053Arr;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length2) {
                                    JSONSchema jSONSchema8 = this.f8740;
                                    if (jSONSchema8 == null) {
                                        return new C0748("add additionalProperties %s", new Object[]{key2}, false);
                                    }
                                    C0748 c0748Mo56483 = jSONSchema8.mo5648(entry3.getValue());
                                    if (!c0748Mo56483.f2156) {
                                        return c0748Mo56483;
                                    }
                                } else {
                                    int i7 = length2;
                                    C8053 c80532 = c8053Arr2[i6];
                                    int i8 = i6;
                                    if (key2 instanceof String) {
                                        if (((Pattern) c80532.f22225).matcher((String) key2).find()) {
                                            break;
                                        }
                                    }
                                    i6 = i8 + 1;
                                    length2 = i7;
                                }
                            }
                            c8053Arr = c8053Arr2;
                            linkedHashMap2 = linkedHashMap3;
                        }
                    }
                }
                JSONSchema jSONSchema9 = this.f8728;
                if (jSONSchema9 != null) {
                    Iterator it3 = map.keySet().iterator();
                    while (it3.hasNext()) {
                        if (!jSONSchema9.mo5648(it3.next()).f2156) {
                            return JSONSchema.f8692;
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
                LinkedHashMap linkedHashMap4 = this.f8723;
                if (linkedHashMap4 != null) {
                    for (Map.Entry entry5 : linkedHashMap4.entrySet()) {
                        if (map.get((String) entry5.getKey()) != null) {
                            C0748 c0748Mo56484 = ((JSONSchema) entry5.getValue()).mo5648(map);
                            if (!c0748Mo56484.f2156) {
                                return c0748Mo56484;
                            }
                        }
                    }
                }
                if (jSONSchema3 != null) {
                    if (jSONSchema3.mo5648(map) == c0748) {
                        if (jSONSchema2 != null) {
                            C0748 c0748Mo56485 = jSONSchema2.mo5648(map);
                            if (!c0748Mo56485.f2156) {
                                return c0748Mo56485;
                            }
                        }
                    } else if (jSONSchema != null) {
                        C0748 c0748Mo56486 = jSONSchema.mo5648(map);
                        if (!c0748Mo56486.f2156) {
                            return c0748Mo56486;
                        }
                    }
                }
                if (jSONSchema7 != null) {
                    C0748 c0748Mo56487 = jSONSchema7.mo5648(map);
                    if (!c0748Mo56487.f2156) {
                        return c0748Mo56487;
                    }
                }
                if (jSONSchema6 != null) {
                    C0748 c0748Mo56488 = jSONSchema6.mo5648(map);
                    if (!c0748Mo56488.f2156) {
                        return c0748Mo56488;
                    }
                }
                if (jSONSchema5 != null) {
                    C0748 c0748Mo56489 = jSONSchema5.mo5648(map);
                    if (!c0748Mo56489.f2156) {
                        return c0748Mo56489;
                    }
                }
            } else {
                C2809 c28093 = c2809;
                Class<?> cls = objM6374.getClass();
                InterfaceC8523 interfaceC8523M14106 = AbstractC2933.f9294.m14106(cls, cls, false);
                if (!(interfaceC8523M14106 instanceof C8524)) {
                    return z ? new C0748("expect type %s, but %s", new Object[]{JSONSchema.Type.Object, cls}, false) : c0748;
                }
                int i9 = 0;
                while (true) {
                    long[] jArr = this.f8737;
                    C2809 c28094 = c28093;
                    String str5 = null;
                    if (i9 >= jArr.length) {
                        Iterator it4 = linkedHashMap2.entrySet().iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry6 = (Map.Entry) it4.next();
                            long jM5774 = AbstractC2860.m5774((String) entry6.getKey());
                            Iterator it5 = it4;
                            JSONSchema jSONSchema10 = (JSONSchema) entry6.getValue();
                            AbstractC8494 abstractC8494Mo14091 = interfaceC8523M14106.mo14091(jM5774);
                            if (abstractC8494Mo14091 != null && (objMo13995 = abstractC8494Mo14091.mo13995(objM6374)) != null) {
                                C0748 c0748Mo564810 = jSONSchema10.mo5648(objMo13995);
                                if (!c0748Mo564810.f2156) {
                                    return c0748Mo564810;
                                }
                            }
                            it4 = it5;
                        }
                        if (i >= 0 || i2 >= 0) {
                            Iterator it6 = ((C8524) interfaceC8523M14106).f23713.iterator();
                            int i10 = 0;
                            while (it6.hasNext()) {
                                if (((AbstractC8494) it6.next()).mo13995(objM6374) != null) {
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
                        LinkedHashMap linkedHashMap5 = this.f8724;
                        if (linkedHashMap5 != null) {
                            int i11 = 0;
                            for (Map.Entry entry7 : linkedHashMap5.entrySet()) {
                                Long l = (Long) entry7.getKey();
                                long[] jArr2 = (long[]) entry7.getValue();
                                if (interfaceC8523M14106.mo14091(l.longValue()).mo13995(objM6374) != null) {
                                    for (int i12 = 0; i12 < jArr2.length; i12++) {
                                        AbstractC8494 abstractC8494Mo140912 = interfaceC8523M14106.mo14091(jArr2[i12]);
                                        if (abstractC8494Mo140912 == null || abstractC8494Mo140912.mo13995(objM6374) == null) {
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
                        LinkedHashMap linkedHashMap6 = this.f8734;
                        if (linkedHashMap6 != null) {
                            for (Map.Entry entry9 : linkedHashMap6.entrySet()) {
                                AbstractC8494 abstractC8494Mo140913 = interfaceC8523M14106.mo14091(((Long) entry9.getKey()).longValue());
                                if (abstractC8494Mo140913 != null && abstractC8494Mo140913.mo13995(objM6374) != null) {
                                    C0748 c0748Mo564811 = ((JSONSchema) entry9.getValue()).mo5648(objM6374);
                                    if (!c0748Mo564811.f2156) {
                                        return c0748Mo564811;
                                    }
                                }
                            }
                        }
                        if (jSONSchema3 != null) {
                            if (jSONSchema3.mo5648(objM6374).f2156) {
                                if (jSONSchema2 != null) {
                                    C0748 c0748Mo564812 = jSONSchema2.mo5648(objM6374);
                                    if (!c0748Mo564812.f2156) {
                                        return c0748Mo564812;
                                    }
                                }
                            } else if (jSONSchema != null) {
                                C0748 c0748Mo564813 = jSONSchema.mo5648(objM6374);
                                if (!c0748Mo564813.f2156) {
                                    return c0748Mo564813;
                                }
                            }
                        }
                        if (c2807 != null) {
                            C0748 c0748Mo564814 = c2807.mo5648(objM6374);
                            if (!c0748Mo564814.f2156) {
                                return c0748Mo564814;
                            }
                        }
                        if (c2805 != null) {
                            C0748 c0748Mo564815 = c2805.mo5648(objM6374);
                            if (!c0748Mo564815.f2156) {
                                return c0748Mo564815;
                            }
                        }
                        if (c28094 == null) {
                            return c0748;
                        }
                        C0748 c0748Mo564816 = c28094.mo5648(objM6374);
                        return !c0748Mo564816.f2156 ? c0748Mo564816 : c0748;
                    }
                    AbstractC8494 abstractC8494Mo140914 = interfaceC8523M14106.mo14091(jArr[i9]);
                    if ((abstractC8494Mo140914 != null ? abstractC8494Mo140914.mo13995(objM6374) : null) == null) {
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
                    c28093 = c28094;
                }
            }
        } else if (z) {
            return JSONSchema.f8682;
        }
        return c0748;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    @InterfaceC8367(true)
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public JSONObject mo5653() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "object");
        String str = this.f8696;
        if (str != null) {
            jSONObject.put("title", str);
        }
        String str2 = this.f8695;
        if (str2 != null) {
            jSONObject.put("description", str2);
        }
        LinkedHashMap linkedHashMap = this.f8741;
        if (!linkedHashMap.isEmpty()) {
            jSONObject.put("definitions", linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = this.f8742;
        if (!linkedHashMap2.isEmpty()) {
            jSONObject.put("defs", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = this.f8736;
        if (!linkedHashMap3.isEmpty()) {
            jSONObject.put("properties", linkedHashMap3);
        }
        Set set = this.f8735;
        if (!set.isEmpty()) {
            jSONObject.put("required", set);
        }
        boolean z = this.f8739;
        if (!z) {
            JSONSchema jSONSchema = this.f8740;
            if (jSONSchema != null) {
                jSONObject.put("additionalProperties", jSONSchema);
            } else {
                jSONObject.put("additionalProperties", Boolean.valueOf(z));
            }
        }
        C8053[] c8053Arr = this.f8738;
        if (c8053Arr != null && c8053Arr.length != 0) {
            jSONObject.put("patternProperties", c8053Arr);
        }
        JSONSchema jSONSchema2 = this.f8728;
        if (jSONSchema2 != null) {
            jSONObject.put("propertyNames", jSONSchema2);
        }
        int i = this.f8727;
        if (i != -1) {
            jSONObject.put("minProperties", Integer.valueOf(i));
        }
        int i2 = this.f8726;
        if (i2 != -1) {
            jSONObject.put("maxProperties", Integer.valueOf(i2));
        }
        LinkedHashMap linkedHashMap4 = this.f8725;
        if (linkedHashMap4 != null && !linkedHashMap4.isEmpty()) {
            jSONObject.put("dependentRequired", linkedHashMap4);
        }
        LinkedHashMap linkedHashMap5 = this.f8723;
        if (linkedHashMap5 != null && !linkedHashMap5.isEmpty()) {
            jSONObject.put("dependentSchemas", linkedHashMap5);
        }
        JSONSchema jSONSchema3 = this.f8733;
        if (jSONSchema3 != null) {
            jSONObject.put("if", jSONSchema3);
        }
        JSONSchema jSONSchema4 = this.f8732;
        if (jSONSchema4 != null) {
            jSONObject.put("then", jSONSchema4);
        }
        JSONSchema jSONSchema5 = this.f8731;
        if (jSONSchema5 != null) {
            jSONObject.put("else", jSONSchema5);
        }
        C2807 c2807 = this.f8730;
        if (c2807 != null) {
            jSONObject.put("allOf", c2807);
        }
        C2805 c2805 = this.f8729;
        if (c2805 != null) {
            jSONObject.put("anyOf", c2805);
        }
        C2809 c2809 = this.f8721;
        if (c2809 != null) {
            jSONObject.put("oneOf", c2809);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5657() {
        return JSONSchema.Type.Object;
    }
}
