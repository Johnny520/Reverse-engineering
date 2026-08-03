package p069f;

import java.util.Arrays;
import p068eh.AbstractC0921a;
import p087g.AbstractC1256a;
import p136j8.C2104o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0952p implements Cloneable {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ boolean f2998g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ long[] f2999h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object[] f3000i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ int f3001j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0952p(int i9) {
        if (i9 == 0) {
            this.f2999h = AbstractC1256a.f4114b;
            this.f3000i = AbstractC1256a.f4115c;
            return;
        }
        int i10 = i9 * 8;
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
        this.f2999h = new long[i13];
        this.f3000i = new Object[i13];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m2342a(int i9) {
        int i10;
        if (i9 < 0 || i9 >= (i10 = this.f3001j)) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.f2998g) {
            long[] jArr = this.f2999h;
            Object[] objArr = this.f3000i;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC0954q.f3004a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f2998g = false;
            this.f3001j = i11;
        }
        return this.f2999h[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2343b(Object obj, long j3) {
        Object obj2 = AbstractC0954q.f3004a;
        int iM3380b = AbstractC1256a.m3380b(this.f2999h, this.f3001j, j3);
        if (iM3380b >= 0) {
            this.f3000i[iM3380b] = obj;
            return;
        }
        int i9 = ~iM3380b;
        int i10 = this.f3001j;
        if (i9 < i10) {
            Object[] objArr = this.f3000i;
            if (objArr[i9] == obj2) {
                this.f2999h[i9] = j3;
                objArr[i9] = obj;
                return;
            }
        }
        if (this.f2998g) {
            long[] jArr = this.f2999h;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f3000i;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f2998g = false;
                this.f3001j = i11;
                i9 = ~AbstractC1256a.m3380b(this.f2999h, i11, j3);
            }
        }
        int i13 = this.f3001j;
        if (i13 >= this.f2999h.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            this.f2999h = Arrays.copyOf(this.f2999h, i17);
            this.f3000i = Arrays.copyOf(this.f3000i, i17);
        }
        int i18 = this.f3001j;
        if (i18 - i9 != 0) {
            long[] jArr2 = this.f2999h;
            int i19 = i9 + 1;
            AbstractC4165l.m8382q0(jArr2, jArr2, i19, i9, i18);
            Object[] objArr3 = this.f3000i;
            AbstractC4165l.m8379n0(i19, i9, objArr3, this.f3001j, objArr3);
        }
        this.f2999h[i9] = j3;
        this.f3000i[i9] = obj;
        this.f3001j++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2344c(long j3) {
        int iM3380b = AbstractC1256a.m3380b(this.f2999h, this.f3001j, j3);
        if (iM3380b >= 0) {
            Object[] objArr = this.f3000i;
            Object obj = objArr[iM3380b];
            Object obj2 = AbstractC0954q.f3004a;
            if (obj != obj2) {
                objArr[iM3380b] = obj2;
                this.f2998g = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        C0952p c0952p = (C0952p) objClone;
        c0952p.f2999h = (long[]) this.f2999h.clone();
        c0952p.f3000i = (Object[]) this.f3000i.clone();
        return c0952p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m2345d() {
        if (this.f2998g) {
            int i9 = this.f3001j;
            long[] jArr = this.f2999h;
            Object[] objArr = this.f3000i;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC0954q.f3004a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f2998g = false;
            this.f3001j = i10;
        }
        return this.f3001j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m2346e(int i9) {
        int i10;
        if (i9 < 0 || i9 >= (i10 = this.f3001j)) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.f2998g) {
            long[] jArr = this.f2999h;
            Object[] objArr = this.f3000i;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC0954q.f3004a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f2998g = false;
            this.f3001j = i11;
        }
        return this.f3000i[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (m2345d() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f3001j * 28);
        sb2.append('{');
        int i9 = this.f3001j;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m2342a(i10));
            sb2.append('=');
            Object objM2346e = m2346e(i10);
            if (objM2346e != sb2) {
                sb2.append(objM2346e);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (10 int) A[MD:(int):void (m)] (LINE:44) call: f.p.<init>(int):void type: THIS */
    public /* synthetic */ C0952p() {
        this(10);
    }
}
