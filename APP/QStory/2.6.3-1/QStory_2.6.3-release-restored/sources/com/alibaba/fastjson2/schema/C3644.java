package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C1589;
import bsh.classpath.C3436;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.C3663;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3644 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Predicate f9092;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Set f9093;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Pattern f9094;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f9095;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3642 f9096;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String f9097;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f9098;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3638 f9099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f9100;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f9101;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f9102;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final Pattern f9091 = Pattern.compile("^\\s*?(.+)@(.+?)\\s*$");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final Pattern f9090 = Pattern.compile("^\\[(.*)\\]$");

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Pattern f9089 = Pattern.compile("^\\s*(((\\\\.)|[^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\"))(\\.(((\\\\.)|[^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\")))*$");

    public C3644(JSONObject jSONObject) {
        Set linkedHashSet;
        int i;
        int i2;
        int i3;
        super(jSONObject);
        this.f9098 = "string".equalsIgnoreCase(jSONObject.getString("type"));
        this.f9100 = jSONObject.getIntValue("minLength", -1);
        this.f9102 = jSONObject.getIntValue("maxLength", -1);
        String string = jSONObject.getString("pattern");
        this.f9095 = string;
        this.f9094 = string == null ? null : Pattern.compile(string);
        String string2 = jSONObject.getString("format");
        this.f9101 = string2;
        Object obj = jSONObject.get("anyOf");
        if (obj instanceof JSONArray) {
            this.f9099 = JSONSchema.m6195((JSONArray) obj, String.class);
        } else {
            this.f9099 = null;
        }
        Object obj2 = jSONObject.get("oneOf");
        if (obj2 instanceof JSONArray) {
            this.f9096 = JSONSchema.m6198((JSONArray) obj2, String.class);
        } else {
            this.f9096 = null;
        }
        this.f9097 = jSONObject.getString("const");
        Object obj3 = jSONObject.get("enum");
        if (obj3 instanceof Collection) {
            Collection collection = (Collection) obj3;
            linkedHashSet = new LinkedHashSet(collection.size(), 1.0f);
            linkedHashSet.addAll(collection);
        } else {
            linkedHashSet = obj3 instanceof Object[] ? (Set) jSONObject.getObject("enum", new C3663(LinkedHashSet.class, String.class), new JSONReader$Feature[0]) : null;
        }
        this.f9093 = linkedHashSet;
        if (string2 == null) {
            this.f9092 = null;
        }
        i = 8;
        i2 = 7;
        i3 = 6;
        switch (string2) {
            case "duration":
                this.f9092 = new C3436(13);
                break;
            case "date-time":
                this.f9092 = new C3436(10);
                break;
            case "uri":
                this.f9092 = new C3436(9);
                break;
            case "date":
                this.f9092 = new C3436(11);
                break;
            case "ipv4":
                this.f9092 = new C3436(i2);
                break;
            case "ipv6":
                this.f9092 = new C3436(i);
                break;
            case "time":
                this.f9092 = new C3436(12);
                break;
            case "uuid":
                this.f9092 = new C3436(14);
                break;
            case "email":
                this.f9092 = new C3436(i3);
                break;
            default:
                this.f9092 = null;
                break;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C1589 mo6208(Object obj) {
        boolean z = this.f9098;
        if (obj == null) {
            if (z) {
                return JSONSchema.f9033;
            }
        } else if (obj instanceof String) {
            String str = (String) obj;
            int i = this.f9102;
            int i2 = this.f9100;
            if (i2 >= 0 || i >= 0) {
                int iCodePointCount = str.codePointCount(0, str.length());
                if (i2 >= 0 && iCodePointCount < i2) {
                    return new C1589("minLength not match, expect >= %s, but %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(str.length())}, false);
                }
                if (i >= 0 && iCodePointCount > i) {
                    return new C1589("maxLength not match, expect <= %s, but %s", new Object[]{Integer.valueOf(i), Integer.valueOf(str.length())}, false);
                }
            }
            Pattern pattern = this.f9094;
            if (pattern != null && !pattern.matcher(str).find()) {
                return new C1589("pattern not match, expect %s, but %s", new Object[]{this.f9095, str}, false);
            }
            Predicate predicate = this.f9092;
            if (predicate != null && !predicate.test(str)) {
                return new C1589("format not match, expect %s, but %s", new Object[]{this.f9101, str}, false);
            }
            C3638 c3638 = this.f9099;
            if (c3638 != null) {
                C1589 c1589Mo6208 = c3638.mo6208(str);
                if (!c1589Mo6208.f2501) {
                    return c1589Mo6208;
                }
            }
            C3642 c3642 = this.f9096;
            if (c3642 != null) {
                C1589 c1589Mo62082 = c3642.mo6208(str);
                if (!c1589Mo62082.f2501) {
                    return c1589Mo62082;
                }
            }
            String str2 = this.f9097;
            if (str2 != null && !str2.equals(str)) {
                return new C1589("must be const %s, but %s", new Object[]{str2, str}, false);
            }
            Set set = this.f9093;
            if (set != null && !set.contains(str)) {
                return new C1589("not in enum values, %s", new Object[]{str}, false);
            }
        } else if (z) {
            return new C1589("expect type %s, but %s", new Object[]{JSONSchema.Type.String, obj.getClass()}, false);
        }
        return JSONSchema.f9028;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo6213() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "string");
        int i = this.f9100;
        if (i != -1) {
            jSONObject.put("minLength", Integer.valueOf(i));
        }
        String str = this.f9101;
        if (str != null) {
            jSONObject.put("format", str);
        }
        if (this.f9095 != null) {
            jSONObject.put("pattern", this.f9094);
        }
        C3638 c3638 = this.f9099;
        if (c3638 != null) {
            jSONObject.put("anyOf", c3638);
        }
        C3642 c3642 = this.f9096;
        if (c3642 != null) {
            jSONObject.put("oneOf", c3642);
        }
        String str2 = this.f9097;
        if (str2 != null) {
            jSONObject.put("const", str2);
        }
        Set set = this.f9093;
        if (set != null && !set.isEmpty()) {
            jSONObject.put("enum", set);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo6217() {
        return JSONSchema.Type.String;
    }
}
