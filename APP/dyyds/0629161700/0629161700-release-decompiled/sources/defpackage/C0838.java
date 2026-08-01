package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0838 extends defpackage.AbstractC1683 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0526 f3859;

    public C0838(defpackage.C0526 r1) {
            r0 = this;
            r0.<init>()
            r0.f3859 = r1
            return
    }

    @Override // defpackage.AbstractC1683
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final boolean mo987() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1683
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo988(java.lang.Throwable r2) {
            r1 = this;
            ᛴᛲᛵᛵ r2 = r1.f7495
            if (r2 == 0) goto L5
            goto L6
        L5:
            r2 = 0
        L6:
            java.lang.Object r2 = r2.m1442()
            boolean r0 = r2 instanceof defpackage.C0142
            ᛳᛸᛵᛳ r1 = r1.f3859
            if (r0 == 0) goto L1d
            ᛱᛸᛳᛱ r2 = (defpackage.C0142) r2
            java.lang.Throwable r2 = r2.f1092
            ᛴᛸᛲᲀ r0 = new ᛴᛸᛲᲀ
            r0.<init>(r2)
            r1.mo662(r0)
            return
        L1d:
            java.lang.Object r2 = defpackage.AbstractC1754.m3154(r2)
            r1.mo662(r2)
            return
    }
}
