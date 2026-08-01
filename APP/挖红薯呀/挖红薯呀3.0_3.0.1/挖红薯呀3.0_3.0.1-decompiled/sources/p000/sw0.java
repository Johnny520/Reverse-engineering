package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class sw0 extends tw0 implements Iterator {

    /* JADX INFO: renamed from: d */
    public rw0 f5851d;

    /* JADX INFO: renamed from: e */
    public boolean f5852e = true;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0486mt f5853f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sw0(C0486mt c0486mt) {
        this.f5853f = c0486mt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.tw0
    /* JADX INFO: renamed from: a */
    public final void mo3336a(rw0 rw0Var) {
        rw0 rw0Var2 = this.f5851d;
        if (rw0Var == rw0Var2) {
            rw0 rw0Var3 = rw0Var2.f5565g;
            this.f5851d = rw0Var3;
            this.f5852e = rw0Var3 == null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5852e) {
            return this.f5853f.f4032d != null;
        }
        rw0 rw0Var = this.f5851d;
        return (rw0Var == null || rw0Var.f5564f == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5852e) {
            this.f5852e = false;
            this.f5851d = this.f5853f.f4032d;
        } else {
            rw0 rw0Var = this.f5851d;
            this.f5851d = rw0Var != null ? rw0Var.f5564f : null;
        }
        return this.f5851d;
    }
}
