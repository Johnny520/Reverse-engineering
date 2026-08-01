package com.alibaba.fastjson2.reader;

import androidx.core.view.C3075;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.util.AbstractC3698;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import p294.C9192;
import p294.C9194;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3617 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f8864;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C9192 f8865;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f8866;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f8867;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f8868;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f8869;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8870 = 0;

    public /* synthetic */ C3617(C3075 c3075, String str, C9192 c9192, Class cls, String str2, String str3) {
        this.f8864 = c3075;
        this.f8869 = str;
        this.f8865 = c9192;
        this.f8868 = cls;
        this.f8866 = str2;
        this.f8867 = str3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String strSubstring;
        int i = this.f8870;
        C9192 c9192 = this.f8865;
        String str = this.f8869;
        Object obj2 = this.f8867;
        Serializable serializable = this.f8866;
        Object obj3 = this.f8864;
        Class<?> cls = this.f8868;
        switch (i) {
            case 0:
                C3075 c3075 = (C3075) obj3;
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
                        c3075.m4708(c9192, cls, field);
                    }
                    c9192.f23390 |= 4503599627370496L;
                } else if (field.getName().equals(str2)) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        c3075.m4708(c9192, cls, field);
                    }
                    c9192.f23390 |= 4503599627370496L;
                } else if (field.getName().equals(str3)) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        c3075.m4708(c9192, cls, field);
                    }
                    c9192.f23390 |= 4503599627370496L;
                }
                break;
            default:
                C3635 c3635 = (C3635) obj3;
                Class cls2 = (Class) serializable;
                C9194 c9194 = (C9194) obj2;
                Method method = (Method) obj;
                if (method.getReturnType() == cls) {
                    C9192 c91922 = new C9192();
                    c3635.m6181(c91922, cls2, method);
                    String strM6364 = c91922.f23394;
                    if (strM6364 == null) {
                        strM6364 = AbstractC3698.m6364(method, c9194.f23438, PropertyNamingStrategy.CamelCase.name());
                    }
                    if (c91922.f23407 != null && str.equals(strM6364)) {
                        c9192.f23407 = c91922.f23407;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C3617(Class cls, C3635 c3635, Class cls2, C9194 c9194, String str, C9192 c9192) {
        this.f8868 = cls;
        this.f8864 = c3635;
        this.f8866 = cls2;
        this.f8867 = c9194;
        this.f8869 = str;
        this.f8865 = c9192;
    }
}
