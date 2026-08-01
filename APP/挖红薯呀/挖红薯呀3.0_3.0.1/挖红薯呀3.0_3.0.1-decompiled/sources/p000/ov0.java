package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ov0 implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4663d = 0;

    /* JADX INFO: renamed from: e */
    public int f4664e;

    /* JADX INFO: renamed from: f */
    public int f4665f;

    /* JADX INFO: renamed from: g */
    public int f4666g;

    /* JADX INFO: renamed from: h */
    public Object f4667h;

    /* JADX INFO: renamed from: i */
    public final Object f4668i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ov0(pv0 pv0Var) {
        this.f4668i = pv0Var;
        this.f4665f = pv0Var.f4975g;
        this.f4666g = pv0Var.f4974f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public boolean m2958a() {
        this.f4664e = 3;
        int i = this.f4665f;
        if (i == 0) {
            this.f4664e = 2;
        } else {
            pv0 pv0Var = (pv0) this.f4668i;
            Object[] objArr = pv0Var.f4972d;
            int i2 = this.f4666g;
            this.f4667h = objArr[i2];
            this.f4664e = 1;
            this.f4666g = (i2 + 1) % pv0Var.f4973e;
            this.f4665f = i - 1;
        }
        return this.f4664e == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4663d) {
            case 0:
                int i = this.f4664e;
                if (i == 0) {
                    return m2958a();
                }
                if (i == 1) {
                    return true;
                }
                if (i != 2) {
                    C0921xc.m5131l("hasNext called when the iterator is in the FAILED state.");
                }
                return false;
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4663d) {
            case 0:
                int i = this.f4664e;
                if (i == 1) {
                    this.f4664e = 0;
                    return this.f4667h;
                }
                if (i == 2 || !m2958a()) {
                    C0921xc.m5132m();
                    return null;
                }
                this.f4664e = 0;
                return this.f4667h;
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4663d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ov0(w11 w11Var, int i, AbstractC0189ey abstractC0189ey, j50 j50Var) {
        this.f4667h = w11Var;
        this.f4664e = i;
        this.f4668i = j50Var;
        this.f4665f = w11Var.f6900k;
    }
}
