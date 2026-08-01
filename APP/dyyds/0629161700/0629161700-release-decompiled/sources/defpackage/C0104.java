package defpackage;

/* JADX INFO: renamed from: ᛱᛵᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0104 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1949 f929;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1950 f930;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f931;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public volatile defpackage.AbstractC0758 f932;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f933;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1814 f934;

    public C0104(defpackage.C1814 r1, boolean r2, boolean r3, defpackage.C1950 r4, defpackage.C1949 r5) {
            r0 = this;
            r0.<init>()
            r0.f934 = r1
            r0.f933 = r2
            r0.f931 = r3
            r0.f930 = r4
            r0.f929 = r5
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r10, java.lang.Object r11) {
            r9 = this;
            boolean r0 = r9.f931
            if (r0 == 0) goto L8
            r10.m1067()
            return
        L8:
            ᛴᲀᲈᛴ r0 = r9.f932
            if (r0 != 0) goto L93
            ᲁᲇᲀᛸ r0 = r9.f930
            ᲁᛲᛷᛲ r1 = r9.f934
            ᲁᲇᛸᲈ r2 = r9.f929
            ᛲᛲᛲᛵ r3 = r0.f8479
            ᲈᲁᛴᲀ r4 = defpackage.C0245.f1436
            r5 = 1
            if (r1 != r4) goto L1d
            r3.getClass()
            goto L62
        L1d:
            java.lang.Class r4 = r2.f8476
            java.util.concurrent.ConcurrentHashMap r6 = r3.f1437
            java.lang.Object r6 = r6.get(r4)
            ᛷᲈᲀᲈ r6 = (defpackage.InterfaceC1405) r6
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L63
            goto L62
        L2c:
            java.lang.Class<ᛳᲁᛱᲀ> r6 = defpackage.InterfaceC0553.class
            java.lang.annotation.Annotation r6 = r4.getAnnotation(r6)
            ᛳᲁᛱᲀ r6 = (defpackage.InterfaceC0553) r6
            if (r6 != 0) goto L37
            goto L63
        L37:
            java.lang.Class r6 = r6.value()
            java.lang.Class<ᛷᲈᲀᲈ> r7 = defpackage.InterfaceC1405.class
            boolean r7 = r7.isAssignableFrom(r6)
            if (r7 != 0) goto L44
            goto L63
        L44:
            ᛴᛵᲇᲇ r7 = r3.f1438
            ᲁᲇᛸᲈ r8 = new ᲁᲇᛸᲈ
            r8.<init>(r6)
            ᛳᛴᲁᛸ r6 = r7.m1557(r8, r5)
            java.lang.Object r6 = r6.mo741()
            ᛷᲈᲀᲈ r6 = (defpackage.InterfaceC1405) r6
            java.util.concurrent.ConcurrentHashMap r7 = r3.f1437
            java.lang.Object r4 = r7.putIfAbsent(r4, r6)
            ᛷᲈᲀᲈ r4 = (defpackage.InterfaceC1405) r4
            if (r4 == 0) goto L60
            r6 = r4
        L60:
            if (r6 != r1) goto L63
        L62:
            r1 = r3
        L63:
            java.util.List r3 = r0.f8478
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L6a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L84
            java.lang.Object r6 = r3.next()
            ᛷᲈᲀᲈ r6 = (defpackage.InterfaceC1405) r6
            if (r4 != 0) goto L7c
            if (r6 != r1) goto L6a
            r4 = r5
            goto L6a
        L7c:
            ᛴᲀᲈᛴ r6 = r6.mo690(r0, r2)
            if (r6 == 0) goto L6a
            r0 = r6
            goto L8a
        L84:
            if (r4 != 0) goto L8d
            ᛴᲀᲈᛴ r0 = r0.m3367(r2)
        L8a:
            r9.f932 = r0
            goto L93
        L8d:
            java.lang.String r9 = "GSON cannot serialize or deserialize "
            defpackage.C2264.m3685(r2, r9)
            return
        L93:
            r0.mo561(r10, r11)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r11) {
            r10 = this;
            boolean r0 = r10.f933
            r1 = 0
            if (r0 == 0) goto L9
            r11.m2086()
            return r1
        L9:
            ᛴᲀᲈᛴ r0 = r10.f932
            if (r0 != 0) goto L94
            ᲁᲇᲀᛸ r0 = r10.f930
            ᲁᛲᛷᛲ r2 = r10.f934
            ᲁᲇᛸᲈ r3 = r10.f929
            ᛲᛲᛲᛵ r4 = r0.f8479
            ᲈᲁᛴᲀ r5 = defpackage.C0245.f1436
            r6 = 1
            if (r2 != r5) goto L1e
            r4.getClass()
            goto L63
        L1e:
            java.lang.Class r5 = r3.f8476
            java.util.concurrent.ConcurrentHashMap r7 = r4.f1437
            java.lang.Object r7 = r7.get(r5)
            ᛷᲈᲀᲈ r7 = (defpackage.InterfaceC1405) r7
            if (r7 == 0) goto L2d
            if (r7 != r2) goto L64
            goto L63
        L2d:
            java.lang.Class<ᛳᲁᛱᲀ> r7 = defpackage.InterfaceC0553.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            ᛳᲁᛱᲀ r7 = (defpackage.InterfaceC0553) r7
            if (r7 != 0) goto L38
            goto L64
        L38:
            java.lang.Class r7 = r7.value()
            java.lang.Class<ᛷᲈᲀᲈ> r8 = defpackage.InterfaceC1405.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L45
            goto L64
        L45:
            ᛴᛵᲇᲇ r8 = r4.f1438
            ᲁᲇᛸᲈ r9 = new ᲁᲇᛸᲈ
            r9.<init>(r7)
            ᛳᛴᲁᛸ r7 = r8.m1557(r9, r6)
            java.lang.Object r7 = r7.mo741()
            ᛷᲈᲀᲈ r7 = (defpackage.InterfaceC1405) r7
            java.util.concurrent.ConcurrentHashMap r8 = r4.f1437
            java.lang.Object r5 = r8.putIfAbsent(r5, r7)
            ᛷᲈᲀᲈ r5 = (defpackage.InterfaceC1405) r5
            if (r5 == 0) goto L61
            r7 = r5
        L61:
            if (r7 != r2) goto L64
        L63:
            r2 = r4
        L64:
            java.util.List r4 = r0.f8478
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L6b:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L85
            java.lang.Object r7 = r4.next()
            ᛷᲈᲀᲈ r7 = (defpackage.InterfaceC1405) r7
            if (r5 != 0) goto L7d
            if (r7 != r2) goto L6b
            r5 = r6
            goto L6b
        L7d:
            ᛴᲀᲈᛴ r7 = r7.mo690(r0, r3)
            if (r7 == 0) goto L6b
            r0 = r7
            goto L8b
        L85:
            if (r5 != 0) goto L8e
            ᛴᲀᲈᛴ r0 = r0.m3367(r3)
        L8b:
            r10.f932 = r0
            goto L94
        L8e:
            java.lang.String r10 = "GSON cannot serialize or deserialize "
            defpackage.C2264.m3685(r3, r10)
            return r1
        L94:
            java.lang.Object r10 = r0.mo562(r11)
            return r10
    }
}
