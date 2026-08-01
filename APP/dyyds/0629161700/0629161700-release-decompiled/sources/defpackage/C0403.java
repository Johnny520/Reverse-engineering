package defpackage;

/* JADX INFO: renamed from: ᛳᛱᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0403 implements defpackage.InterfaceC0077 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1475 f2059;

    public C0403(java.lang.Throwable r4) {
            r3 = this;
            r3.<init>()
            ᛸᛴᛸᛵ r0 = new ᛸᛴᛸᛵ
            r1 = 0
            r2 = 2
            r0.<init>(r3, r1, r4, r2)
            r3.f2059 = r0
            return
    }

    @Override // defpackage.InterfaceC0077
    public final void cancel() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected cancel"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.InterfaceC0077
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo535() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0077
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1894 mo536() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected call"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.InterfaceC0077
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final defpackage.C1475 mo537() {
            r0 = this;
            ᛸᛴᛸᛵ r0 = r0.f2059
            return r0
    }

    @Override // defpackage.InterfaceC0077
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC0077 mo538() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected retry"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.InterfaceC0077
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final defpackage.C1475 mo539() {
            r0 = this;
            ᛸᛴᛸᛵ r0 = r0.f2059
            return r0
    }
}
