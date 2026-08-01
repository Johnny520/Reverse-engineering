package defpackage;

/* JADX INFO: renamed from: ᛵᛶᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913 implements defpackage.InterfaceC0277, java.io.Serializable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f4150;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.InterfaceC1781 f4151;

    @Override // defpackage.InterfaceC0277
    public final java.lang.Object getValue() {
            r2 = this;
            java.lang.Object r0 = r2.f4150
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6601
            if (r0 != r1) goto L11
            ᲀᲈᛵᲇ r0 = r2.f4151
            java.lang.Object r0 = r0.mo1032()
            r2.f4150 = r0
            r1 = 0
            r2.f4151 = r1
        L11:
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.f4150
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6601
            if (r0 == r1) goto Lf
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        Lf:
            java.lang.String r2 = "Lazy value not initialized yet."
            return r2
    }
}
