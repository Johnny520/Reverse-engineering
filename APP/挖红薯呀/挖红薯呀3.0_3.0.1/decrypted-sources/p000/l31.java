package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class l31 implements Cloneable {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int[] f3334d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object[] f3335e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ int f3336f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l31() {
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
        this.f3334d = new int[i4];
        this.f3335e = new Object[i4];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l31 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        l31 l31Var = (l31) objClone;
        l31Var.f3334d = (int[]) this.f3334d.clone();
        l31Var.f3335e = (Object[]) this.f3335e.clone();
        return l31Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m1973b(int i) {
        Object obj;
        int iM2770j = o30.m2770j(this.f3334d, this.f3336f, i);
        if (iM2770j < 0 || (obj = this.f3335e[iM2770j]) == s91.f5694B) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1974c(int i, Object obj) {
        int iM2770j = o30.m2770j(this.f3334d, this.f3336f, i);
        if (iM2770j >= 0) {
            this.f3335e[iM2770j] = obj;
            return;
        }
        int i2 = ~iM2770j;
        int i3 = this.f3336f;
        if (i2 < i3) {
            Object[] objArr = this.f3335e;
            if (objArr[i2] == s91.f5694B) {
                this.f3334d[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f3334d.length) {
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
            this.f3334d = Arrays.copyOf(this.f3334d, i7);
            this.f3335e = Arrays.copyOf(this.f3335e, i7);
        }
        int i8 = this.f3336f;
        if (i8 - i2 != 0) {
            int[] iArr = this.f3334d;
            int i9 = i2 + 1;
            AbstractC0201f9.m1055a0(iArr, iArr, i9, i2, i8);
            Object[] objArr2 = this.f3335e;
            AbstractC0201f9.m1057c0(objArr2, objArr2, i9, i2, this.f3336f);
        }
        this.f3334d[i2] = i;
        this.f3335e[i2] = obj;
        this.f3336f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m1975d(int i) {
        Object[] objArr = this.f3335e;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.f3336f;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f3336f;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f3334d[i3]);
            sb.append('=');
            Object objM1975d = m1975d(i3);
            if (objM1975d != this) {
                sb.append(objM1975d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
