package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import bsh.classpath.C2603;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.C2830;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2811 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Predicate f8747;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Set f8748;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Pattern f8749;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f8750;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2809 f8751;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String f8752;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f8753;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2805 f8754;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f8755;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f8756;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f8757;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final Pattern f8746 = Pattern.compile("^\\s*?(.+)@(.+?)\\s*$");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final Pattern f8745 = Pattern.compile("^\\[(.*)\\]$");

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Pattern f8744 = Pattern.compile("^\\s*(((\\\\.)|[^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\"))(\\.(((\\\\.)|[^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\")))*$");

    public C2811(JSONObject jSONObject) {
        Set linkedHashSet;
        int i;
        int i2;
        int i3;
        super(jSONObject);
        this.f8753 = "string".equalsIgnoreCase(jSONObject.getString("type"));
        this.f8755 = jSONObject.getIntValue("minLength", -1);
        this.f8757 = jSONObject.getIntValue("maxLength", -1);
        String string = jSONObject.getString("pattern");
        this.f8750 = string;
        this.f8749 = string == null ? null : Pattern.compile(string);
        String string2 = jSONObject.getString("format");
        this.f8756 = string2;
        Object obj = jSONObject.get("anyOf");
        if (obj instanceof JSONArray) {
            this.f8754 = JSONSchema.m5635((JSONArray) obj, String.class);
        } else {
            this.f8754 = null;
        }
        Object obj2 = jSONObject.get("oneOf");
        if (obj2 instanceof JSONArray) {
            this.f8751 = JSONSchema.m5638((JSONArray) obj2, String.class);
        } else {
            this.f8751 = null;
        }
        this.f8752 = jSONObject.getString("const");
        Object obj3 = jSONObject.get("enum");
        if (obj3 instanceof Collection) {
            Collection collection = (Collection) obj3;
            linkedHashSet = new LinkedHashSet(collection.size(), 1.0f);
            linkedHashSet.addAll(collection);
        } else {
            linkedHashSet = obj3 instanceof Object[] ? (Set) jSONObject.getObject("enum", new C2830(LinkedHashSet.class, String.class), new JSONReader$Feature[0]) : null;
        }
        this.f8748 = linkedHashSet;
        if (string2 == null) {
            this.f8747 = null;
        }
        i = 8;
        i2 = 7;
        i3 = 6;
        switch (string2) {
            case "duration":
                this.f8747 = new C2603(13);
                break;
            case "date-time":
                this.f8747 = new C2603(10);
                break;
            case "uri":
                this.f8747 = new C2603(9);
                break;
            case "date":
                this.f8747 = new C2603(11);
                break;
            case "ipv4":
                this.f8747 = new C2603(i2);
                break;
            case "ipv6":
                this.f8747 = new C2603(i);
                break;
            case "time":
                this.f8747 = new C2603(12);
                break;
            case "uuid":
                this.f8747 = new C2603(14);
                break;
            case "email":
                this.f8747 = new C2603(i3);
                break;
            default:
                this.f8747 = null;
                break;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5648(Object obj) {
        boolean z = this.f8753;
        if (obj == null) {
            if (z) {
                return JSONSchema.f8688;
            }
        } else if (obj instanceof String) {
            String str = (String) obj;
            int i = this.f8757;
            int i2 = this.f8755;
            if (i2 >= 0 || i >= 0) {
                int iCodePointCount = str.codePointCount(0, str.length());
                if (i2 >= 0 && iCodePointCount < i2) {
                    return new C0748("minLength not match, expect >= %s, but %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(str.length())}, false);
                }
                if (i >= 0 && iCodePointCount > i) {
                    return new C0748("maxLength not match, expect <= %s, but %s", new Object[]{Integer.valueOf(i), Integer.valueOf(str.length())}, false);
                }
            }
            Pattern pattern = this.f8749;
            if (pattern != null && !pattern.matcher(str).find()) {
                return new C0748("pattern not match, expect %s, but %s", new Object[]{this.f8750, str}, false);
            }
            Predicate predicate = this.f8747;
            if (predicate != null && !predicate.test(str)) {
                return new C0748("format not match, expect %s, but %s", new Object[]{this.f8756, str}, false);
            }
            C2805 c2805 = this.f8754;
            if (c2805 != null) {
                C0748 c0748Mo5648 = c2805.mo5648(str);
                if (!c0748Mo5648.f2156) {
                    return c0748Mo5648;
                }
            }
            C2809 c2809 = this.f8751;
            if (c2809 != null) {
                C0748 c0748Mo56482 = c2809.mo5648(str);
                if (!c0748Mo56482.f2156) {
                    return c0748Mo56482;
                }
            }
            String str2 = this.f8752;
            if (str2 != null && !str2.equals(str)) {
                return new C0748("must be const %s, but %s", new Object[]{str2, str}, false);
            }
            Set set = this.f8748;
            if (set != null && !set.contains(str)) {
                return new C0748("not in enum values, %s", new Object[]{str}, false);
            }
        } else if (z) {
            return new C0748("expect type %s, but %s", new Object[]{JSONSchema.Type.String, obj.getClass()}, false);
        }
        return JSONSchema.f8683;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo5653() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "string");
        int i = this.f8755;
        if (i != -1) {
            jSONObject.put("minLength", Integer.valueOf(i));
        }
        String str = this.f8756;
        if (str != null) {
            jSONObject.put("format", str);
        }
        if (this.f8750 != null) {
            jSONObject.put("pattern", this.f8749);
        }
        C2805 c2805 = this.f8754;
        if (c2805 != null) {
            jSONObject.put("anyOf", c2805);
        }
        C2809 c2809 = this.f8751;
        if (c2809 != null) {
            jSONObject.put("oneOf", c2809);
        }
        String str2 = this.f8752;
        if (str2 != null) {
            jSONObject.put("const", str2);
        }
        Set set = this.f8748;
        if (set != null && !set.isEmpty()) {
            jSONObject.put("enum", set);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5657() {
        return JSONSchema.Type.String;
    }
}
