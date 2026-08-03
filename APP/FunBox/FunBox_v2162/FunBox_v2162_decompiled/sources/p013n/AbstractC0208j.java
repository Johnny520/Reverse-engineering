package p013n;

import p000a.C0000a;

/* JADX INFO: renamed from: n.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0208j {

    /* JADX INFO: renamed from: a */
    private boolean f811a;

    public AbstractC0208j(boolean z) {
        this.f811a = z;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m534e() {
        return !this.f811a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m535f() {
        return this.f811a;
    }

    /* JADX INFO: renamed from: g */
    public final void m536g() {
        this.f811a = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m537h() {
        if (!this.f811a) {
            throw new C0000a("immutable instance");
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m538i() {
        if (this.f811a) {
            throw new C0000a("mutable instance");
        }
    }
}
