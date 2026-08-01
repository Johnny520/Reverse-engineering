package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jo1 implements p000.bp1 {

    /* JADX INFO: renamed from: α */
    public final p000.vk1 f5531;

    public jo1(p000.vk1 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f5531 = r1
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
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "already connected"
            r1.<init>(r0)
            throw r1
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: δ */
    public final p000.vk1 mo990() {
            r0 = this;
            vk1 r0 = r0.f5531
            return r0
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: ε */
    public final boolean mo991() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: η */
    public final p000.ap1 mo992() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "already connected"
            r1.<init>(r0)
            throw r1
    }
}
