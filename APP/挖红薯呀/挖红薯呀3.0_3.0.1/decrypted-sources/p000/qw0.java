package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qw0 extends tw0 implements Iterator {

    /* JADX INFO: renamed from: d */
    public rw0 f5225d;

    /* JADX INFO: renamed from: e */
    public rw0 f5226e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f5227f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qw0(rw0 rw0Var, rw0 rw0Var2, int i) {
        this.f5227f = i;
        this.f5225d = rw0Var2;
        this.f5226e = rw0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.tw0
    /* JADX INFO: renamed from: a */
    public final void mo3336a(rw0 rw0Var) {
        rw0 rw0Var2;
        rw0 rw0VarM3337b = null;
        if (this.f5225d == rw0Var && rw0Var == this.f5226e) {
            this.f5226e = null;
            this.f5225d = null;
        }
        rw0 rw0Var3 = this.f5225d;
        if (rw0Var3 == rw0Var) {
            switch (this.f5227f) {
                case 0:
                    rw0Var2 = rw0Var3.f5565g;
                    break;
                default:
                    rw0Var2 = rw0Var3.f5564f;
                    break;
            }
            this.f5225d = rw0Var2;
        }
        rw0 rw0Var4 = this.f5226e;
        if (rw0Var4 == rw0Var) {
            rw0 rw0Var5 = this.f5225d;
            if (rw0Var4 != rw0Var5 && rw0Var5 != null) {
                rw0VarM3337b = m3337b(rw0Var4);
            }
            this.f5226e = rw0VarM3337b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final rw0 m3337b(rw0 rw0Var) {
        switch (this.f5227f) {
            case 0:
                return rw0Var.f5564f;
            default:
                return rw0Var.f5565g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5226e != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        rw0 rw0Var = this.f5226e;
        rw0 rw0Var2 = this.f5225d;
        this.f5226e = (rw0Var == rw0Var2 || rw0Var2 == null) ? null : m3337b(rw0Var);
        return rw0Var;
    }
}
