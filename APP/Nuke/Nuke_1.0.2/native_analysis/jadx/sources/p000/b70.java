package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b70 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f714h;

    /* JADX INFO: renamed from: i */
    public int f715i;

    /* JADX INFO: renamed from: j */
    public int f716j;

    /* JADX INFO: renamed from: k */
    public int f717k;

    /* JADX INFO: renamed from: l */
    public Object f718l;

    /* JADX INFO: renamed from: m */
    public final Object f719m;

    public b70(c70 c70Var) {
        this.f714h = 0;
        this.f719m = c70Var;
        this.f715i = -1;
        int iM779D = ci0.m779D(0, 0, ((CharSequence) c70Var.f1218b).length());
        this.f716j = iM779D;
        this.f717k = iM779D;
    }

    /* JADX INFO: renamed from: a */
    public void m483a() {
        c70 c70Var = (c70) this.f719m;
        CharSequence charSequence = (CharSequence) c70Var.f1218b;
        int i = this.f717k;
        if (i < 0) {
            this.f715i = 0;
            this.f718l = null;
            return;
        }
        if (i > charSequence.length()) {
            int i2 = this.f716j;
            charSequence.getClass();
            this.f718l = new c11(i2, charSequence.length() - 1, 1);
            this.f717k = -1;
        } else {
            ow1 ow1Var = (ow1) ((mn0) c70Var.f1219c).mo12g(charSequence, Integer.valueOf(this.f717k));
            if (ow1Var == null) {
                int i3 = this.f716j;
                charSequence.getClass();
                this.f718l = new c11(i3, charSequence.length() - 1, 1);
                this.f717k = -1;
            } else {
                int iIntValue = ((Number) ow1Var.f7862h).intValue();
                int iIntValue2 = ((Number) ow1Var.f7863i).intValue();
                this.f718l = ci0.m799X(this.f716j, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f716j = i4;
                this.f717k = i4 + (iIntValue2 == 0 ? 1 : 0);
            }
        }
        this.f715i = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f714h) {
            case 0:
                if (this.f715i == -1) {
                    m483a();
                }
                return this.f715i == 1;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f714h) {
            case 0:
                if (this.f715i == -1) {
                    m483a();
                }
                if (this.f715i == 0) {
                    um2.m5513b();
                    return null;
                }
                c11 c11Var = (c11) this.f718l;
                c11Var.getClass();
                this.f718l = null;
                this.f715i = -1;
                return c11Var;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f714h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b70(qr2 qr2Var, int i, io0 io0Var, qp0 qp0Var) {
        this.f714h = 1;
        this.f718l = qr2Var;
        this.f715i = i;
        this.f719m = qp0Var;
        this.f716j = qr2Var.f9139o;
    }
}
