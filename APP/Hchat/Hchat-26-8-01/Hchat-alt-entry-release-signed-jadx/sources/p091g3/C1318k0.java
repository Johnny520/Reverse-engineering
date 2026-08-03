package p091g3;

import android.view.WindowInsets;
import p018b3.C0171a;

/* JADX INFO: renamed from: g3.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1318k0 extends C1316j0 {

    /* JADX INFO: renamed from: o */
    public C0171a f4385o;

    /* JADX INFO: renamed from: p */
    public C0171a f4386p;

    /* JADX INFO: renamed from: q */
    public C0171a f4387q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1318k0(C1332r0 c1332r0, WindowInsets windowInsets) {
        super(c1332r0, windowInsets);
        this.f4385o = null;
        this.f4386p = null;
        this.f4387q = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: i */
    public C0171a mo3520i() {
        if (this.f4386p == null) {
            this.f4386p = C0171a.m767c(this.f4376c.getMandatorySystemGestureInsets());
        }
        return this.f4386p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: k */
    public C0171a mo3521k() {
        if (this.f4385o == null) {
            this.f4385o = C0171a.m767c(this.f4376c.getSystemGestureInsets());
        }
        return this.f4385o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: m */
    public C0171a mo3522m() {
        if (this.f4387q == null) {
            this.f4387q = C0171a.m767c(this.f4376c.getTappableElementInsets());
        }
        return this.f4387q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1312h0, p091g3.C1324n0
    /* JADX INFO: renamed from: n */
    public C1332r0 mo3504n(int i9, int i10, int i11, int i12) {
        return C1332r0.m3558c(this.f4376c.inset(i9, i10, i11, i12), null);
    }

    public C1318k0(C1332r0 c1332r0, C1318k0 c1318k0) {
        super(c1332r0, c1318k0);
        this.f4385o = null;
        this.f4386p = null;
        this.f4387q = null;
    }

    @Override // p091g3.C1314i0, p091g3.C1324n0
    /* JADX INFO: renamed from: u */
    public void mo3516u(C0171a c0171a) {
    }
}
