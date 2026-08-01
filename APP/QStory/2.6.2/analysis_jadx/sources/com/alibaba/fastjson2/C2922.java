package com.alibaba.fastjson2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2922 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f9263;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Annotation f9264;

    public C2922(Annotation annotation) {
        this.f9264 = annotation;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Method method = (Method) obj;
        if ("name".equals(method.getName())) {
            try {
                String str = (String) method.invoke(this.f9264, null);
                if (str.isEmpty()) {
                    return;
                }
                this.f9263 = str;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
