package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.alibaba.fastjson2.writer.ObjectWriterCreator f1873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.alibaba.fastjson2.codec.FieldInfo f1874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f1875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.alibaba.fastjson2.writer.ObjectWriterProvider f1877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.alibaba.fastjson2.codec.BeanInfo f1878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.TreeMap f1879h;

    public /* synthetic */ a(com.alibaba.fastjson2.writer.ObjectWriterCreator r2, com.alibaba.fastjson2.codec.FieldInfo r3, long r4, com.alibaba.fastjson2.codec.BeanInfo r6, com.alibaba.fastjson2.writer.ObjectWriterProvider r7, java.lang.Class r8, java.util.TreeMap r9) {
            r1 = this;
            r0 = 2
            r1.f1872a = r0
            r1.<init>()
            r1.f1873b = r2
            r1.f1874c = r3
            r1.f1876e = r4
            r1.f1878g = r6
            r1.f1877f = r7
            r1.f1875d = r8
            r1.f1879h = r9
            return
    }

    public /* synthetic */ a(com.alibaba.fastjson2.writer.ObjectWriterCreator r1, com.alibaba.fastjson2.codec.FieldInfo r2, java.lang.Class r3, long r4, com.alibaba.fastjson2.writer.ObjectWriterProvider r6, com.alibaba.fastjson2.codec.BeanInfo r7, java.util.TreeMap r8, int r9) {
            r0 = this;
            r0.f1872a = r9
            r0.f1873b = r1
            r0.f1874c = r2
            r0.f1875d = r3
            r0.f1876e = r4
            r0.f1877f = r6
            r0.f1878g = r7
            r0.f1879h = r8
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r30) {
            r29 = this;
            r0 = r29
            int r1 = r0.f1872a
            switch(r1) {
                case 0: goto L39;
                case 1: goto L1d;
                default: goto L7;
            }
        L7:
            java.util.TreeMap r9 = r0.f1879h
            r10 = r30
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            com.alibaba.fastjson2.writer.ObjectWriterCreator r2 = r0.f1873b
            com.alibaba.fastjson2.codec.FieldInfo r3 = r0.f1874c
            long r4 = r0.f1876e
            com.alibaba.fastjson2.codec.BeanInfo r6 = r0.f1878g
            com.alibaba.fastjson2.writer.ObjectWriterProvider r7 = r0.f1877f
            java.lang.Class r8 = r0.f1875d
            com.alibaba.fastjson2.writer.ObjectWriterCreator.b(r2, r3, r4, r6, r7, r8, r9, r10)
            return
        L1d:
            java.util.TreeMap r1 = r0.f1879h
            r19 = r30
            java.lang.reflect.Field r19 = (java.lang.reflect.Field) r19
            com.alibaba.fastjson2.writer.ObjectWriterCreator r11 = r0.f1873b
            com.alibaba.fastjson2.codec.FieldInfo r12 = r0.f1874c
            java.lang.Class r13 = r0.f1875d
            long r14 = r0.f1876e
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = r0.f1877f
            com.alibaba.fastjson2.codec.BeanInfo r3 = r0.f1878g
            r18 = r1
            r16 = r2
            r17 = r3
            com.alibaba.fastjson2.writer.ObjectWriterCreator.c(r11, r12, r13, r14, r16, r17, r18, r19)
            return
        L39:
            java.util.TreeMap r1 = r0.f1879h
            r28 = r30
            java.lang.reflect.Field r28 = (java.lang.reflect.Field) r28
            com.alibaba.fastjson2.writer.ObjectWriterCreator r2 = r0.f1873b
            com.alibaba.fastjson2.codec.FieldInfo r3 = r0.f1874c
            java.lang.Class r4 = r0.f1875d
            long r5 = r0.f1876e
            com.alibaba.fastjson2.writer.ObjectWriterProvider r7 = r0.f1877f
            com.alibaba.fastjson2.codec.BeanInfo r8 = r0.f1878g
            r27 = r1
            r20 = r2
            r21 = r3
            r22 = r4
            r23 = r5
            r25 = r7
            r26 = r8
            com.alibaba.fastjson2.writer.ObjectWriterCreator.a(r20, r21, r22, r23, r25, r26, r27, r28)
            return
    }
}
