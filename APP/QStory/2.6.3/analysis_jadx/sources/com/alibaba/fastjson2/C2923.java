package com.alibaba.fastjson2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2923 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f9265;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Annotation f9266;

    public C2923(Annotation annotation) {
        this.f9266 = annotation;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Method method = (Method) obj;
        if ("name".equals(method.getName())) {
            try {
                String str = (String) method.invoke(this.f9266, null);
                if (str.isEmpty()) {
                    return;
                }
                this.f9265 = str;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
