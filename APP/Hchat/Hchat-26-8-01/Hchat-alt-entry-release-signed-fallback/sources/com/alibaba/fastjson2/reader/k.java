package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1856d;

    public /* synthetic */ k(com.alibaba.fastjson2.reader.ObjectReaderProvider r2, java.lang.annotation.Annotation r3, com.alibaba.fastjson2.codec.BeanInfo r4) {
            r1 = this;
            r0 = 1
            r1.f1853a = r0
            r1.<init>()
            r1.f1856d = r2
            r1.f1854b = r3
            r1.f1855c = r4
            return
    }

    public /* synthetic */ k(com.alibaba.fastjson2.writer.ObjectWriterProvider r2, java.lang.annotation.Annotation r3, com.alibaba.fastjson2.codec.FieldInfo r4) {
            r1 = this;
            r0 = 2
            r1.f1853a = r0
            r1.<init>()
            r1.f1855c = r2
            r1.f1854b = r3
            r1.f1856d = r4
            return
    }

    public /* synthetic */ k(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f1853a = r4
            r0.f1854b = r1
            r0.f1855c = r2
            r0.f1856d = r3
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f1853a
            switch(r0) {
                case 0: goto Le2;
                case 1: goto Ld0;
                case 2: goto Lbe;
                case 3: goto L2e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f1854b
            ud.u r0 = (ud.u) r0
            java.lang.Object r1 = r8.f1855c
            ud.r r1 = (ud.r) r1
            java.lang.Object r2 = r8.f1856d
            i4.c0 r2 = (i4.c0) r2
            gf.a r9 = (gf.a) r9
            re.c.m(r0, r1, r9, r2)     // Catch: java.lang.Exception -> L17
            return
        L17:
            r0 = move-exception
            af.g r1 = new af.g
            java.lang.String r2 = r0.getMessage()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r3 = "Usage info collection failed with error: "
            java.lang.String r4 = " at insn: "
            java.lang.String r9 = bc.e.j(r3, r2, r4, r9)
            r1.<init>(r9, r0)
            throw r1
        L2e:
            java.lang.Object r0 = r8.f1854b
            fe.a r0 = (fe.a) r0
            ud.u r0 = r0.f3922a
            java.lang.Object r1 = r8.f1855c
            ud.e r1 = (ud.e) r1
            java.lang.Object r2 = r8.f1856d
            ah.a r2 = (ah.a) r2
            nd.b0 r9 = (nd.b0) r9
            b5.k r3 = r9.O()
            b5.k r4 = new b5.k
            int r5 = r3.f488b
            r6 = r5 & 7
            int r3 = r3.f489c
            r7 = 3
            r4.<init>(r6, r3, r7)
            boolean r3 = r4.g()
            if (r3 == 0) goto L55
            goto Lbd
        L55:
            boolean r3 = r4.e()
            r6 = 1
            if (r3 != 0) goto L99
            r3 = r5 & 7
            if (r3 != 0) goto L61
            goto L99
        L61:
            boolean r3 = r4.f()
            if (r3 == 0) goto L8b
            ud.e r3 = r9.P()
            if (r3 == 0) goto L87
            ed.c r0 = r0.f13760s
            java.lang.String r1 = r1.Z()
            java.util.Set r0 = r0.d(r1)
            java.util.stream.Stream r0 = r0.stream()
            be.g0 r1 = new be.g0
            r4 = 2
            r1.<init>(r3, r4)
            boolean r0 = r0.anyMatch(r1)
            if (r0 != 0) goto Lbd
        L87:
            r2.z(r9, r6)
            goto Lbd
        L8b:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " is not supported"
            java.lang.String r9 = r9.concat(r0)
            ah.a.k(r9)
            goto Lbd
        L99:
            ud.e r3 = r9.P()
            if (r3 == 0) goto Lba
            ed.c r0 = r0.f13760s
            java.lang.String r1 = r1.Z()
            java.util.Set r0 = r0.d(r1)
            java.util.stream.Stream r0 = r0.stream()
            be.g0 r1 = new be.g0
            r4 = 2
            r1.<init>(r3, r4)
            boolean r0 = r0.anyMatch(r1)
            if (r0 == 0) goto Lba
            r6 = 4
        Lba:
            r2.z(r9, r6)
        Lbd:
            return
        Lbe:
            java.lang.Object r0 = r8.f1855c
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = (com.alibaba.fastjson2.writer.ObjectWriterProvider) r0
            java.lang.Object r1 = r8.f1854b
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            java.lang.Object r2 = r8.f1856d
            com.alibaba.fastjson2.codec.FieldInfo r2 = (com.alibaba.fastjson2.codec.FieldInfo) r2
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            com.alibaba.fastjson2.writer.ObjectWriterProvider.a(r0, r1, r2, r9)
            return
        Ld0:
            java.lang.Object r0 = r8.f1856d
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = (com.alibaba.fastjson2.reader.ObjectReaderProvider) r0
            java.lang.Object r1 = r8.f1854b
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            java.lang.Object r2 = r8.f1855c
            com.alibaba.fastjson2.codec.BeanInfo r2 = (com.alibaba.fastjson2.codec.BeanInfo) r2
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            com.alibaba.fastjson2.reader.ObjectReaderProvider.a(r0, r1, r2, r9)
            return
        Le2:
            java.lang.Object r0 = r8.f1854b
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            java.lang.Object r1 = r8.f1855c
            com.alibaba.fastjson2.codec.BeanInfo r1 = (com.alibaba.fastjson2.codec.BeanInfo) r1
            java.lang.Object r2 = r8.f1856d
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            com.alibaba.fastjson2.reader.ObjectReaderProvider.q(r0, r1, r2, r9)
            return
    }
}
