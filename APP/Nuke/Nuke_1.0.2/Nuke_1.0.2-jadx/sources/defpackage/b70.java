package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b70 implements Iterator, q41 {
    public final /* synthetic */ int h;
    public int i;
    public int j;
    public int k;
    public Object l;
    public final Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b70(c70 c70Var) {
        this.h = 0;
        this.m = c70Var;
        this.i = -1;
        int iD = ci0.D(0, 0, ((CharSequence) c70Var.b).length());
        this.j = iD;
        this.k = iD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        c70 c70Var = (c70) this.m;
        CharSequence charSequence = (CharSequence) c70Var.b;
        int i = this.k;
        if (i < 0) {
            this.i = 0;
            this.l = null;
            return;
        }
        if (i > charSequence.length()) {
            int i2 = this.j;
            charSequence.getClass();
            this.l = new c11(i2, charSequence.length() - 1, 1);
            this.k = -1;
        } else {
            ow1 ow1Var = (ow1) ((mn0) c70Var.c).g(charSequence, Integer.valueOf(this.k));
            if (ow1Var == null) {
                int i3 = this.j;
                charSequence.getClass();
                this.l = new c11(i3, charSequence.length() - 1, 1);
                this.k = -1;
            } else {
                int iIntValue = ((Number) ow1Var.h).intValue();
                int iIntValue2 = ((Number) ow1Var.i).intValue();
                this.l = ci0.X(this.j, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.j = i4;
                this.k = i4 + (iIntValue2 == 0 ? 1 : 0);
            }
        }
        this.i = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.i == -1) {
                    a();
                }
                return this.i == 1;
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                if (this.i == -1) {
                    a();
                }
                if (this.i == 0) {
                    um2.b();
                    return null;
                }
                c11 c11Var = (c11) this.l;
                c11Var.getClass();
                this.l = null;
                this.i = -1;
                return c11Var;
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b70(qr2 qr2Var, int i, io0 io0Var, qp0 qp0Var) {
        this.h = 1;
        this.l = qr2Var;
        this.i = i;
        this.m = qp0Var;
        this.j = qr2Var.o;
    }
}
