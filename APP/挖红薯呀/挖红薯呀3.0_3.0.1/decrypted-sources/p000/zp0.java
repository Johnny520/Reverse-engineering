package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class zp0 implements ju0 {

    /* JADX INFO: renamed from: d */
    public final Set f7978d;

    /* JADX INFO: renamed from: e */
    public final sh0 f7979e = new sh0(new ku0[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zp0(Set set) {
        this.f7978d = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ju0
    /* JADX INFO: renamed from: c */
    public final void mo784c() {
        sh0 sh0Var = this.f7979e;
        Object[] objArr = sh0Var.f5768d;
        int i = sh0Var.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            ju0 ju0Var = ((ku0) objArr[i2]).f3270a;
            this.f7978d.remove(ju0Var);
            ju0Var.mo784c();
        }
    }

    @Override // p000.ju0
    /* JADX INFO: renamed from: d */
    public final void mo785d() {
    }

    @Override // p000.ju0
    /* JADX INFO: renamed from: e */
    public final void mo786e() {
    }
}
