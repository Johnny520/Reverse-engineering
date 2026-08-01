package p309v5;

/* JADX INFO: renamed from: v5.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8834p {

    /* JADX INFO: renamed from: q */
    public boolean f29369q;

    public AbstractC8834p() {
        this.f29369q = true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33927c() {
        return this.f29369q;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m33928s() {
        return !this.f29369q;
    }

    /* JADX INFO: renamed from: t */
    public void mo6829t() {
        this.f29369q = false;
    }

    /* JADX INFO: renamed from: u */
    public final void m33929u() {
        if (!this.f29369q) {
            throw new C8835q("immutable instance");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m33930v() {
        if (this.f29369q) {
            throw new C8835q("mutable instance");
        }
    }

    public AbstractC8834p(boolean z10) {
        this.f29369q = z10;
    }
}
