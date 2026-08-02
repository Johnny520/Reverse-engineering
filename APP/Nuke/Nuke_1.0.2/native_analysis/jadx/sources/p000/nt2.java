package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nt2 implements Cloneable {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ int[] f7325h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object[] f7326i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ int f7327j;

    public nt2() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f7325h = new int[i4];
        this.f7326i = new Object[i4];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nt2 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        nt2 nt2Var = (nt2) objClone;
        nt2Var.f7325h = (int[]) this.f7325h.clone();
        nt2Var.f7326i = (Object[]) this.f7326i.clone();
        return nt2Var;
    }

    /* JADX INFO: renamed from: d */
    public final Object m3406d(int i) {
        Object obj;
        int iM4480p = rg3.m4480p(this.f7325h, this.f7327j, i);
        if (iM4480p < 0 || (obj = this.f7326i[iM4480p]) == op0.f7760g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: f */
    public final void m3407f(int i, Object obj) {
        int iM4480p = rg3.m4480p(this.f7325h, this.f7327j, i);
        if (iM4480p >= 0) {
            this.f7326i[iM4480p] = obj;
            return;
        }
        int i2 = ~iM4480p;
        int i3 = this.f7327j;
        if (i2 < i3) {
            Object[] objArr = this.f7326i;
            if (objArr[i2] == op0.f7760g) {
                this.f7325h[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f7325h.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.f7325h = Arrays.copyOf(this.f7325h, i7);
            this.f7326i = Arrays.copyOf(this.f7326i, i7);
        }
        int i8 = this.f7327j;
        if (i8 - i2 != 0) {
            int[] iArr = this.f7325h;
            int i9 = i2 + 1;
            AbstractC0460mg.m3086a0(iArr, iArr, i9, i2, i8);
            Object[] objArr2 = this.f7326i;
            AbstractC0460mg.m3088c0(objArr2, objArr2, i9, i2, this.f7327j);
        }
        this.f7325h[i2] = i;
        this.f7326i[i2] = obj;
        this.f7327j++;
    }

    /* JADX INFO: renamed from: g */
    public final Object m3408g(int i) {
        Object[] objArr = this.f7326i;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.f7327j;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f7327j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f7325h[i3]);
            sb.append('=');
            Object objM3408g = m3408g(i3);
            if (objM3408g != this) {
                sb.append(objM3408g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
