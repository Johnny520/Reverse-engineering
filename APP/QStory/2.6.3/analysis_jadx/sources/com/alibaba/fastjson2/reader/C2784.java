package com.alibaba.fastjson2.reader;

import androidx.core.view.C2242;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.util.AbstractC2865;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import p278.C8363;
import p278.C8365;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2784 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f8519;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C8363 f8520;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f8521;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f8522;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f8523;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f8524;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8525 = 0;

    public /* synthetic */ C2784(C2242 c2242, String str, C8363 c8363, Class cls, String str2, String str3) {
        this.f8519 = c2242;
        this.f8524 = str;
        this.f8520 = c8363;
        this.f8523 = cls;
        this.f8521 = str2;
        this.f8522 = str3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String strSubstring;
        int i = this.f8525;
        C8363 c8363 = this.f8520;
        String str = this.f8524;
        Object obj2 = this.f8522;
        Serializable serializable = this.f8521;
        Object obj3 = this.f8519;
        Class<?> cls = this.f8523;
        switch (i) {
            case 0:
                C2242 c2242 = (C2242) obj3;
                String str2 = (String) serializable;
                String str3 = (String) obj2;
                Field field = (Field) obj;
                if ((field.getType() == Boolean.TYPE || field.getType() == Boolean.class) && field.getName().startsWith("is")) {
                    strSubstring = field.getName().substring(2);
                    if (!strSubstring.isEmpty()) {
                        strSubstring = Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1);
                    }
                } else {
                    strSubstring = "";
                }
                if (field.getName().equals(str) || strSubstring.equals(str)) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        c2242.m4148(c8363, cls, field);
                    }
                    c8363.f23045 |= 4503599627370496L;
                } else if (field.getName().equals(str2)) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        c2242.m4148(c8363, cls, field);
                    }
                    c8363.f23045 |= 4503599627370496L;
                } else if (field.getName().equals(str3)) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        c2242.m4148(c8363, cls, field);
                    }
                    c8363.f23045 |= 4503599627370496L;
                }
                break;
            default:
                C2802 c2802 = (C2802) obj3;
                Class cls2 = (Class) serializable;
                C8365 c8365 = (C8365) obj2;
                Method method = (Method) obj;
                if (method.getReturnType() == cls) {
                    C8363 c83632 = new C8363();
                    c2802.m5621(c83632, cls2, method);
                    String strM5804 = c83632.f23049;
                    if (strM5804 == null) {
                        strM5804 = AbstractC2865.m5804(method, c8365.f23093, PropertyNamingStrategy.CamelCase.name());
                    }
                    if (c83632.f23062 != null && str.equals(strM5804)) {
                        c8363.f23062 = c83632.f23062;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C2784(Class cls, C2802 c2802, Class cls2, C8365 c8365, String str, C8363 c8363) {
        this.f8523 = cls;
        this.f8519 = c2802;
        this.f8521 = cls2;
        this.f8522 = c8365;
        this.f8524 = str;
        this.f8520 = c8363;
    }
}
