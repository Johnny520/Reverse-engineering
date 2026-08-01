package defpackage;

/* JADX INFO: renamed from: ᲈᲇᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2348 implements defpackage.InterfaceC0077 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1894 f10111;

    public C2348(defpackage.C1894 r1) {
            r0 = this;
            r0.<init>()
            r0.f10111 = r1
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
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC0077
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1894 mo536() {
            r0 = this;
            ᲁᛸᛲᛶ r0 = r0.f10111
            return r0
    }

    @Override // defpackage.InterfaceC0077
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final defpackage.C1475 mo537() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "already connected"
            r1.<init>(r0)
            throw r1
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
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "already connected"
            r1.<init>(r0)
            throw r1
    }
}
