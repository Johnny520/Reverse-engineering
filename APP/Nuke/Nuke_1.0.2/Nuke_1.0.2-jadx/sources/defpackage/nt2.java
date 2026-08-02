package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nt2 implements Cloneable {
    public /* synthetic */ int[] h;
    public /* synthetic */ Object[] i;
    public /* synthetic */ int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        this.h = new int[i4];
        this.i = new Object[i4];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nt2 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        nt2 nt2Var = (nt2) objClone;
        nt2Var.h = (int[]) this.h.clone();
        nt2Var.i = (Object[]) this.i.clone();
        return nt2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d(int i) {
        Object obj;
        int iP = rg3.p(this.h, this.j, i);
        if (iP < 0 || (obj = this.i[iP]) == op0.g) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i, Object obj) {
        int iP = rg3.p(this.h, this.j, i);
        if (iP >= 0) {
            this.i[iP] = obj;
            return;
        }
        int i2 = ~iP;
        int i3 = this.j;
        if (i2 < i3) {
            Object[] objArr = this.i;
            if (objArr[i2] == op0.g) {
                this.h[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.h.length) {
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
            this.h = Arrays.copyOf(this.h, i7);
            this.i = Arrays.copyOf(this.i, i7);
        }
        int i8 = this.j;
        if (i8 - i2 != 0) {
            int[] iArr = this.h;
            int i9 = i2 + 1;
            mg.a0(iArr, iArr, i9, i2, i8);
            Object[] objArr2 = this.i;
            mg.c0(objArr2, objArr2, i9, i2, this.j);
        }
        this.h[i2] = i;
        this.i[i2] = obj;
        this.j++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(int i) {
        Object[] objArr = this.i;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.j;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.h[i3]);
            sb.append('=');
            Object objG = g(i3);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
