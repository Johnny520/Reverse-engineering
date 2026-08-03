package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.annotation.Annotation f1848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.alibaba.fastjson2.codec.BeanInfo f1849c;

    public /* synthetic */ g(com.alibaba.fastjson2.codec.BeanInfo r1, java.lang.annotation.Annotation r2, int r3) {
            r0 = this;
            r0.f1847a = r3
            r0.f1849c = r1
            r0.f1848b = r2
            r0.<init>()
            return
    }

    public /* synthetic */ g(java.lang.annotation.Annotation r1, com.alibaba.fastjson2.codec.BeanInfo r2, int r3) {
            r0 = this;
            r0.f1847a = r3
            r0.f1848b = r1
            r0.f1849c = r2
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f1847a
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L23;
                case 2: goto L19;
                case 3: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.annotation.Annotation r0 = r2.f1848b
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            com.alibaba.fastjson2.codec.BeanInfo r1 = r2.f1849c
            com.alibaba.fastjson2.writer.ObjectWriterProvider.b(r1, r0, r3)
            return
        Lf:
            java.lang.annotation.Annotation r0 = r2.f1848b
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            com.alibaba.fastjson2.codec.BeanInfo r1 = r2.f1849c
            com.alibaba.fastjson2.util.BeanUtils.e(r1, r0, r3)
            return
        L19:
            com.alibaba.fastjson2.codec.BeanInfo r0 = r2.f1849c
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.annotation.Annotation r1 = r2.f1848b
            com.alibaba.fastjson2.reader.ObjectReaderProvider.g(r0, r1, r3)
            return
        L23:
            com.alibaba.fastjson2.codec.BeanInfo r0 = r2.f1849c
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.annotation.Annotation r1 = r2.f1848b
            com.alibaba.fastjson2.reader.ObjectReaderProvider.e(r0, r1, r3)
            return
        L2d:
            com.alibaba.fastjson2.codec.BeanInfo r0 = r2.f1849c
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.annotation.Annotation r1 = r2.f1848b
            com.alibaba.fastjson2.reader.ObjectReaderProvider.o(r0, r1, r3)
            return
    }
}
