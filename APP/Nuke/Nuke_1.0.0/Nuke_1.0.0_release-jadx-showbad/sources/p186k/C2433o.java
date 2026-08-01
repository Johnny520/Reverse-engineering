package p186k;

import java.util.Arrays;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2433o implements Cloneable {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f7854d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ long[] f7855e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object[] f7856f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int f7857g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2433o(int i5) {
        if (i5 == 0) {
            this.f7855e = AbstractC2477a.f7972b;
            this.f7856f = AbstractC2477a.f7973c;
            return;
        }
        int i6 = i5 * 8;
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
        this.f7855e = new long[i9];
        this.f7856f = new Object[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m4320a(int i5) {
        int i6;
        if (i5 < 0 || i5 >= (i6 = this.f7857g)) {
            AbstractC2477a.m4422c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        if (this.f7854d) {
            long[] jArr = this.f7855e;
            Object[] objArr = this.f7856f;
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                Object obj = objArr[i8];
                if (obj != AbstractC2434p.f7858a) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f7854d = false;
            this.f7857g = i7;
        }
        return this.f7855e[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC1665j.m2983c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C2433o c2433o = (C2433o) objClone;
        c2433o.f7855e = (long[]) this.f7855e.clone();
        c2433o.f7856f = (Object[]) this.f7856f.clone();
        return c2433o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4321e(long j5, Object obj) {
        Object obj2 = AbstractC2434p.f7858a;
        int iM4421b = AbstractC2477a.m4421b(this.f7855e, this.f7857g, j5);
        if (iM4421b >= 0) {
            this.f7856f[iM4421b] = obj;
            return;
        }
        int i5 = ~iM4421b;
        int i6 = this.f7857g;
        if (i5 < i6) {
            Object[] objArr = this.f7856f;
            if (objArr[i5] == obj2) {
                this.f7855e[i5] = j5;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f7854d) {
            long[] jArr = this.f7855e;
            if (i6 >= jArr.length) {
                Object[] objArr2 = this.f7856f;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj3 = objArr2[i8];
                    if (obj3 != obj2) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr2[i7] = obj3;
                            objArr2[i8] = null;
                        }
                        i7++;
                    }
                }
                this.f7854d = false;
                this.f7857g = i7;
                i5 = ~AbstractC2477a.m4421b(this.f7855e, i7, j5);
            }
        }
        int i9 = this.f7857g;
        if (i9 >= this.f7855e.length) {
            int i10 = (i9 + 1) * 8;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f7855e, i13);
            AbstractC1665j.m2984d(jArrCopyOf, "copyOf(...)");
            this.f7855e = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7856f, i13);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            this.f7856f = objArrCopyOf;
        }
        int i14 = this.f7857g;
        if (i14 - i5 != 0) {
            long[] jArr2 = this.f7855e;
            int i15 = i5 + 1;
            AbstractC0972l.m1992P(jArr2, jArr2, i15, i5, i14);
            Object[] objArr3 = this.f7856f;
            AbstractC0972l.m1993Q(objArr3, objArr3, i15, i5, this.f7857g);
        }
        this.f7855e[i5] = j5;
        this.f7856f[i5] = obj;
        this.f7857g++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4322g(long j5) {
        int iM4421b = AbstractC2477a.m4421b(this.f7855e, this.f7857g, j5);
        if (iM4421b >= 0) {
            Object[] objArr = this.f7856f;
            Object obj = objArr[iM4421b];
            Object obj2 = AbstractC2434p.f7858a;
            if (obj != obj2) {
                objArr[iM4421b] = obj2;
                this.f7854d = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m4323h() {
        if (this.f7854d) {
            int i5 = this.f7857g;
            long[] jArr = this.f7855e;
            Object[] objArr = this.f7856f;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != AbstractC2434p.f7858a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f7854d = false;
            this.f7857g = i6;
        }
        return this.f7857g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Object m4324i(int i5) {
        int i6;
        if (i5 < 0 || i5 >= (i6 = this.f7857g)) {
            AbstractC2477a.m4422c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        if (this.f7854d) {
            long[] jArr = this.f7855e;
            Object[] objArr = this.f7856f;
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                Object obj = objArr[i8];
                if (obj != AbstractC2434p.f7858a) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f7854d = false;
            this.f7857g = i7;
        }
        return this.f7856f[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (m4323h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7857g * 28);
        sb.append('{');
        int i5 = this.f7857g;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(m4320a(i6));
            sb.append('=');
            Object objM4324i = m4324i(i6);
            if (objM4324i != sb) {
                sb.append(objM4324i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (10 int) A[MD:(int):void (m)] (LINE:7) call: k.o.<init>(int):void type: THIS */
    public /* synthetic */ C2433o() {
        this(10);
    }
}
