package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import bsh.classpath.C2602;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.C2829;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2810 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Predicate f8745;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Set f8746;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Pattern f8747;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f8748;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2808 f8749;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String f8750;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f8751;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2804 f8752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f8753;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f8754;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f8755;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final Pattern f8744 = Pattern.compile("^\\s*?(.+)@(.+?)\\s*$");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final Pattern f8743 = Pattern.compile("^\\[(.*)\\]$");

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Pattern f8742 = Pattern.compile("^\\s*(((\\\\.)|[^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\"))(\\.(((\\\\.)|[^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\")))*$");

    public C2810(JSONObject jSONObject) {
        Set linkedHashSet;
        int i;
        int i2;
        int i3;
        super(jSONObject);
        this.f8751 = "string".equalsIgnoreCase(jSONObject.getString("type"));
        this.f8753 = jSONObject.getIntValue("minLength", -1);
        this.f8755 = jSONObject.getIntValue("maxLength", -1);
        String string = jSONObject.getString("pattern");
        this.f8748 = string;
        this.f8747 = string == null ? null : Pattern.compile(string);
        String string2 = jSONObject.getString("format");
        this.f8754 = string2;
        Object obj = jSONObject.get("anyOf");
        if (obj instanceof JSONArray) {
            this.f8752 = JSONSchema.m5590((JSONArray) obj, String.class);
        } else {
            this.f8752 = null;
        }
        Object obj2 = jSONObject.get("oneOf");
        if (obj2 instanceof JSONArray) {
            this.f8749 = JSONSchema.m5593((JSONArray) obj2, String.class);
        } else {
            this.f8749 = null;
        }
        this.f8750 = jSONObject.getString("const");
        Object obj3 = jSONObject.get("enum");
        if (obj3 instanceof Collection) {
            Collection collection = (Collection) obj3;
            linkedHashSet = new LinkedHashSet(collection.size(), 1.0f);
            linkedHashSet.addAll(collection);
        } else {
            linkedHashSet = obj3 instanceof Object[] ? (Set) jSONObject.getObject("enum", new C2829(LinkedHashSet.class, String.class), new JSONReader$Feature[0]) : null;
        }
        this.f8746 = linkedHashSet;
        if (string2 == null) {
            this.f8745 = null;
        }
        i = 8;
        i2 = 7;
        i3 = 6;
        switch (string2) {
            case "duration":
                this.f8745 = new C2602(13);
                break;
            case "date-time":
                this.f8745 = new C2602(10);
                break;
            case "uri":
                this.f8745 = new C2602(9);
                break;
            case "date":
                this.f8745 = new C2602(11);
                break;
            case "ipv4":
                this.f8745 = new C2602(i2);
                break;
            case "ipv6":
                this.f8745 = new C2602(i);
                break;
            case "time":
                this.f8745 = new C2602(12);
                break;
            case "uuid":
                this.f8745 = new C2602(14);
                break;
            case "email":
                this.f8745 = new C2602(i3);
                break;
            default:
                this.f8745 = null;
                break;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5603(Object obj) {
        boolean z = this.f8751;
        if (obj == null) {
            if (z) {
                return JSONSchema.f8686;
            }
        } else if (obj instanceof String) {
            String str = (String) obj;
            int i = this.f8755;
            int i2 = this.f8753;
            if (i2 >= 0 || i >= 0) {
                int iCodePointCount = str.codePointCount(0, str.length());
                if (i2 >= 0 && iCodePointCount < i2) {
                    return new C0748("minLength not match, expect >= %s, but %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(str.length())}, false);
                }
                if (i >= 0 && iCodePointCount > i) {
                    return new C0748("maxLength not match, expect <= %s, but %s", new Object[]{Integer.valueOf(i), Integer.valueOf(str.length())}, false);
                }
            }
            Pattern pattern = this.f8747;
            if (pattern != null && !pattern.matcher(str).find()) {
                return new C0748("pattern not match, expect %s, but %s", new Object[]{this.f8748, str}, false);
            }
            Predicate predicate = this.f8745;
            if (predicate != null && !predicate.test(str)) {
                return new C0748("format not match, expect %s, but %s", new Object[]{this.f8754, str}, false);
            }
            C2804 c2804 = this.f8752;
            if (c2804 != null) {
                C0748 c0748Mo5603 = c2804.mo5603(str);
                if (!c0748Mo5603.f2155) {
                    return c0748Mo5603;
                }
            }
            C2808 c2808 = this.f8749;
            if (c2808 != null) {
                C0748 c0748Mo56032 = c2808.mo5603(str);
                if (!c0748Mo56032.f2155) {
                    return c0748Mo56032;
                }
            }
            String str2 = this.f8750;
            if (str2 != null && !str2.equals(str)) {
                return new C0748("must be const %s, but %s", new Object[]{str2, str}, false);
            }
            Set set = this.f8746;
            if (set != null && !set.contains(str)) {
                return new C0748("not in enum values, %s", new Object[]{str}, false);
            }
        } else if (z) {
            return new C0748("expect type %s, but %s", new Object[]{JSONSchema.Type.String, obj.getClass()}, false);
        }
        return JSONSchema.f8681;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo5608() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "string");
        int i = this.f8753;
        if (i != -1) {
            jSONObject.put("minLength", Integer.valueOf(i));
        }
        String str = this.f8754;
        if (str != null) {
            jSONObject.put("format", str);
        }
        if (this.f8748 != null) {
            jSONObject.put("pattern", this.f8747);
        }
        C2804 c2804 = this.f8752;
        if (c2804 != null) {
            jSONObject.put("anyOf", c2804);
        }
        C2808 c2808 = this.f8749;
        if (c2808 != null) {
            jSONObject.put("oneOf", c2808);
        }
        String str2 = this.f8750;
        if (str2 != null) {
            jSONObject.put("const", str2);
        }
        Set set = this.f8746;
        if (set != null && !set.isEmpty()) {
            jSONObject.put("enum", set);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5612() {
        return JSONSchema.Type.String;
    }
}
