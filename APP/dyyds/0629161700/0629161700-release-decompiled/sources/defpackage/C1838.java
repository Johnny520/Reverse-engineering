package defpackage;

/* JADX INFO: renamed from: ᲁᛳᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1838 implements defpackage.InterfaceC1818 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1050[] f8032;

    public C1838(defpackage.C1050[] r1) {
            r0 = this;
            r0.<init>()
            r0.f8032 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisposeHandlersOnCancel["
            r0.<init>(r1)
            ᛶᛳᲈᛱ[] r2 = r2.f8032
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC1818
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo742(java.lang.Throwable r1) {
            r0 = this;
            r0.m3232()
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3232() {
            r3 = this;
            ᛶᛳᲈᛱ[] r3 = r3.f8032
            int r0 = r3.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L14
            r2 = r3[r1]
            ᛵᛲᲇᲇ r2 = r2.f4650
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            r2.mo1182()
            int r1 = r1 + 1
            goto L4
        L14:
            return
    }
}
