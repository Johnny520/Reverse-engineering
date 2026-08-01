package defpackage;

/* JADX INFO: renamed from: ᛵᛴᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0869 extends defpackage.AbstractC0370 implements defpackage.InterfaceC1886, defpackage.InterfaceC0598 {
    public C0869(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r5 = 0
            ᛲᲁᲁᲈ r1 = defpackage.C0365.f1904
            java.lang.Class<ᛶᲀᛵ> r2 = defpackage.C1141.class
            r0 = r6
            r3 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.InterfaceC0598
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo617(java.lang.Object r1) {
            r0 = this;
            r0.m1848()
            r0 = 0
            throw r0
    }

    @Override // defpackage.AbstractC2232
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final defpackage.InterfaceC0119 mo1263() {
            r1 = this;
            ᲀᛶᲈᲀ r0 = defpackage.AbstractC1168.f5286
            r0.getClass()
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m1848() {
            r1 = this;
            boolean r0 = r1.f570
            if (r0 != 0) goto L1a
            ᛱᛶᲈᛱ r0 = r1.m396()
            if (r0 == r1) goto L12
            ᲁᛷᛶᛶ r0 = (defpackage.InterfaceC1886) r0
            ᛵᛴᛶᛴ r0 = (defpackage.C0869) r0
            r0.m1848()
            return
        L12:
            ᲁᛵᛵᲀ r1 = new ᲁᛵᛵᲀ
            java.lang.String r0 = "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"
            r1.<init>(r0)
            throw r1
        L1a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980"
            r1.<init>(r0)
            throw r1
    }
}
