package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gd1 implements Cloneable {
    public /* synthetic */ boolean h;
    public /* synthetic */ long[] i;
    public /* synthetic */ Object[] j;
    public /* synthetic */ int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gd1(int i) {
        if (i == 0) {
            this.i = rg3.g;
            this.j = rg3.h;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.i = new long[i5];
        this.j = new Object[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.k)) {
            s.j(vi0.g("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.h) {
            long[] jArr = this.i;
            Object[] objArr = this.j;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != te.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.h = false;
            this.k = i3;
        }
        return this.i[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        gd1 gd1Var = (gd1) objClone;
        gd1Var.i = (long[]) this.i.clone();
        gd1Var.j = (Object[]) this.j.clone();
        return gd1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(long j, Object obj) {
        Object obj2 = te.c;
        int iQ = rg3.q(this.i, this.k, j);
        if (iQ >= 0) {
            this.j[iQ] = obj;
            return;
        }
        int i = ~iQ;
        int i2 = this.k;
        if (i < i2) {
            Object[] objArr = this.j;
            if (objArr[i] == obj2) {
                this.i[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.h) {
            long[] jArr = this.i;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.j;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.h = false;
                this.k = i3;
                i = ~rg3.q(this.i, i3, j);
            }
        }
        int i5 = this.k;
        if (i5 >= this.i.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.i = Arrays.copyOf(this.i, i9);
            this.j = Arrays.copyOf(this.j, i9);
        }
        int i10 = this.k;
        if (i10 - i != 0) {
            long[] jArr2 = this.i;
            int i11 = i + 1;
            mg.b0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.j;
            mg.c0(objArr3, objArr3, i11, i, this.k);
        }
        this.i[i] = j;
        this.j[i] = obj;
        this.k++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(long j) {
        int iQ = rg3.q(this.i, this.k, j);
        if (iQ >= 0) {
            Object[] objArr = this.j;
            Object obj = objArr[iQ];
            Object obj2 = te.c;
            if (obj != obj2) {
                objArr[iQ] = obj2;
                this.h = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g() {
        if (this.h) {
            int i = this.k;
            long[] jArr = this.i;
            Object[] objArr = this.j;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != te.c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.h = false;
            this.k = i2;
        }
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.k)) {
            s.j(vi0.g("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.h) {
            long[] jArr = this.i;
            Object[] objArr = this.j;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != te.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.h = false;
            this.k = i3;
        }
        return this.j[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.k * 28);
        sb.append('{');
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(a(i2));
            sb.append('=');
            Object objH = h(i2);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (10 int) A[MD:(int):void (m)] (LINE:44) call: gd1.<init>(int):void type: THIS */
    public /* synthetic */ gd1() {
        this(10);
    }
}
