package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class g00 implements p000.bp1 {

    /* JADX INFO: renamed from: α */
    public final p000.ap1 f4183;

    public g00(java.lang.Throwable r3) {
            r2 = this;
            r2.<init>()
            ap1 r0 = new ap1
            r1 = 2
            r0.<init>(r2, r3, r1)
            r2.f4183 = r0
            return
    }

    @Override // p000.bp1
    public final void cancel() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected cancel"
            r1.<init>(r0)
            throw r1
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: α */
    public final p000.bp1 mo988() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected retry"
            r1.<init>(r0)
            throw r1
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: γ */
    public final p000.ap1 mo989() {
            r0 = this;
            ap1 r0 = r0.f4183
            return r0
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: δ */
    public final p000.vk1 mo990() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected call"
            r1.<init>(r0)
            throw r1
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: ε */
    public final boolean mo991() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: η */
    public final p000.ap1 mo992() {
            r0 = this;
            ap1 r0 = r0.f4183
            return r0
    }
}
