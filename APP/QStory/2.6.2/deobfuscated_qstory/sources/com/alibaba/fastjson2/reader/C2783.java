package com.alibaba.fastjson2.reader;

import androidx.core.view.C2242;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.util.AbstractC2864;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import p278.C8362;
import p278.C8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2783 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f8517;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C8362 f8518;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f8519;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f8520;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f8521;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f8522;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8523 = 0;

    public /* synthetic */ C2783(C2242 c2242, String str, C8362 c8362, Class cls, String str2, String str3) {
        this.f8517 = c2242;
        this.f8522 = str;
        this.f8518 = c8362;
        this.f8521 = cls;
        this.f8519 = str2;
        this.f8520 = str3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String strSubstring;
        int i = this.f8523;
        C8362 c8362 = this.f8518;
        String str = this.f8522;
        Object obj2 = this.f8520;
        Serializable serializable = this.f8519;
        Object obj3 = this.f8517;
        Class<?> cls = this.f8521;
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
                        c2242.m4138(c8362, cls, field);
                    }
                    c8362.f23046 |= 4503599627370496L;
                } else if (field.getName().equals(str2)) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        c2242.m4138(c8362, cls, field);
                    }
                    c8362.f23046 |= 4503599627370496L;
                } else if (field.getName().equals(str3)) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        c2242.m4138(c8362, cls, field);
                    }
                    c8362.f23046 |= 4503599627370496L;
                }
                break;
            default:
                C2801 c2801 = (C2801) obj3;
                Class cls2 = (Class) serializable;
                C8364 c8364 = (C8364) obj2;
                Method method = (Method) obj;
                if (method.getReturnType() == cls) {
                    C8362 c83622 = new C8362();
                    c2801.m5576(c83622, cls2, method);
                    String strM5759 = c83622.f23050;
                    if (strM5759 == null) {
                        strM5759 = AbstractC2864.m5759(method, c8364.f23094, PropertyNamingStrategy.CamelCase.name());
                    }
                    if (c83622.f23063 != null && str.equals(strM5759)) {
                        c8362.f23063 = c83622.f23063;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C2783(Class cls, C2801 c2801, Class cls2, C8364 c8364, String str, C8362 c8362) {
        this.f8521 = cls;
        this.f8517 = c2801;
        this.f8519 = cls2;
        this.f8520 = c8364;
        this.f8522 = str;
        this.f8518 = c8362;
    }
}
