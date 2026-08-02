package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kv1 extends AbstractC0570p7 {

    /* JADX INFO: renamed from: n */
    public int f5826n;

    /* JADX INFO: renamed from: p */
    public int f5828p;

    /* JADX INFO: renamed from: r */
    public int f5830r;

    /* JADX INFO: renamed from: m */
    public iv1[] f5825m = new iv1[16];

    /* JADX INFO: renamed from: o */
    public int[] f5827o = new int[16];

    /* JADX INFO: renamed from: q */
    public Object[] f5829q = new Object[16];

    /* JADX INFO: renamed from: U */
    public final void m2740U() {
        this.f5826n = 0;
        this.f5828p = 0;
        Arrays.fill(this.f5829q, 0, this.f5830r, (Object) null);
        this.f5830r = 0;
    }

    /* JADX INFO: renamed from: V */
    public final void m2741V(InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        if (this.f5826n != 0) {
            bo0 bo0Var = new bo0(this);
            kv1 kv1Var = (kv1) bo0Var.f960e;
            while (true) {
                iv1 iv1Var = kv1Var.f5825m[bo0Var.f957b];
                ao0 ao0VarMo2408b = iv1Var.mo2408b(bo0Var);
                InterfaceC0654rf interfaceC0654rf2 = interfaceC0654rf;
                tr2 tr2Var2 = tr2Var;
                z72 z72Var2 = z72Var;
                jv1 jv1Var2 = jv1Var;
                try {
                    iv1Var.mo296a(bo0Var, interfaceC0654rf2, tr2Var2, z72Var2, jv1Var2);
                    int i = bo0Var.f957b;
                    int i2 = kv1Var.f5826n;
                    if (i < i2) {
                        iv1 iv1Var2 = kv1Var.f5825m[i];
                        bo0Var.f958c += iv1Var2.f4804a;
                        bo0Var.f959d += iv1Var2.f4805b;
                        int i3 = i + 1;
                        bo0Var.f957b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        interfaceC0654rf = interfaceC0654rf2;
                        tr2Var = tr2Var2;
                        z72Var = z72Var2;
                        jv1Var = jv1Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        m2740U();
    }

    /* JADX INFO: renamed from: W */
    public final boolean m2742W() {
        return this.f5826n == 0;
    }

    /* JADX INFO: renamed from: X */
    public final void m2743X(iv1 iv1Var) {
        int i = this.f5826n;
        iv1[] iv1VarArr = this.f5825m;
        if (i == iv1VarArr.length) {
            iv1[] iv1VarArr2 = new iv1[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(iv1VarArr, 0, iv1VarArr2, 0, i);
            this.f5825m = iv1VarArr2;
        }
        int i2 = this.f5828p;
        int i3 = iv1Var.f4804a;
        int i4 = iv1Var.f4805b;
        int i5 = i2 + i3;
        int[] iArr = this.f5827o;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            AbstractC0460mg.m3086a0(iArr, iArr2, 0, 0, length);
            this.f5827o = iArr2;
        }
        int i7 = this.f5830r + i4;
        Object[] objArr = this.f5829q;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f5829q = objArr2;
        }
        iv1[] iv1VarArr3 = this.f5825m;
        int i9 = this.f5826n;
        this.f5826n = i9 + 1;
        iv1VarArr3[i9] = iv1Var;
        this.f5828p += iv1Var.f4804a;
        this.f5830r += i4;
    }
}
