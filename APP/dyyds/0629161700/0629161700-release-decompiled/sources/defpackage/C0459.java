package defpackage;

/* JADX INFO: renamed from: ᛳᛴᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0459 implements defpackage.InterfaceC1405 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC0758 f2301;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Class f2302;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2303;

    public /* synthetic */ C0459(java.lang.Class r1, defpackage.AbstractC0758 r2, int r3) {
            r0 = this;
            r0.f2303 = r3
            r0.f2302 = r1
            r0.f2301 = r2
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.f2303
            java.lang.String r1 = "]"
            ᛴᲀᲈᛴ r2 = r5.f2301
            java.lang.String r3 = ",adapter="
            java.lang.Class r5 = r5.f2302
            switch(r0) {
                case 0: goto L29;
                default: goto Ld;
            }
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Factory[typeHierarchy="
            r0.<init>(r4)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            return r5
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Factory[type="
            r0.<init>(r4)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // defpackage.InterfaceC1405
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.AbstractC0758 mo690(defpackage.C1950 r3, defpackage.C1949 r4) {
            r2 = this;
            int r3 = r2.f2303
            r0 = 0
            java.lang.Class r1 = r2.f2302
            switch(r3) {
                case 0: goto L17;
                default: goto L8;
            }
        L8:
            java.lang.Class r3 = r4.f8476
            boolean r4 = r1.isAssignableFrom(r3)
            if (r4 != 0) goto L11
            goto L16
        L11:
            ᲁᛵᲁᛴ r0 = new ᲁᛵᲁᛴ
            r0.<init>(r2, r3)
        L16:
            return r0
        L17:
            java.lang.Class r3 = r4.f8476
            if (r3 != r1) goto L1d
            ᛴᲀᲈᛴ r0 = r2.f2301
        L1d:
            return r0
    }
}
