package p069f;

import java.util.Arrays;
import p087g.AbstractC1256a;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0961t0 implements Cloneable {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int[] f3024g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object[] f3025h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ int f3026i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0961t0() {
        int i9;
        int i10 = 4;
        while (true) {
            i9 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i9 = i11;
                break;
            }
            i10++;
        }
        int i12 = i9 / 4;
        this.f3024g = new int[i12];
        this.f3025h = new Object[i12];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0961t0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        C0961t0 c0961t0 = (C0961t0) objClone;
        c0961t0.f3024g = (int[]) this.f3024g.clone();
        c0961t0.f3025h = (Object[]) this.f3025h.clone();
        return c0961t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m2360b(int i9) {
        Object obj;
        int iM3379a = AbstractC1256a.m3379a(this.f3024g, this.f3026i, i9);
        if (iM3379a < 0 || (obj = this.f3025h[iM3379a]) == AbstractC0954q.f3006c) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2361c(int i9, Object obj) {
        int iM3379a = AbstractC1256a.m3379a(this.f3024g, this.f3026i, i9);
        if (iM3379a >= 0) {
            this.f3025h[iM3379a] = obj;
            return;
        }
        int i10 = ~iM3379a;
        int i11 = this.f3026i;
        if (i10 < i11) {
            Object[] objArr = this.f3025h;
            if (objArr[i10] == AbstractC0954q.f3006c) {
                this.f3024g[i10] = i9;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f3024g.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            this.f3024g = Arrays.copyOf(this.f3024g, i15);
            this.f3025h = Arrays.copyOf(this.f3025h, i15);
        }
        int i16 = this.f3026i;
        if (i16 - i10 != 0) {
            int[] iArr = this.f3024g;
            int i17 = i10 + 1;
            AbstractC4165l.m8381p0(iArr, iArr, i17, i10, i16);
            Object[] objArr2 = this.f3025h;
            AbstractC4165l.m8379n0(i17, i10, objArr2, this.f3026i, objArr2);
        }
        this.f3024g[i10] = i9;
        this.f3025h[i10] = obj;
        this.f3026i++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m2362d(int i9) {
        Object[] objArr = this.f3025h;
        if (i9 < objArr.length) {
            return objArr[i9];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f3026i;
        if (i9 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i9 * 28);
        sb2.append('{');
        int i10 = this.f3026i;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f3024g[i11]);
            sb2.append('=');
            Object objM2362d = m2362d(i11);
            if (objM2362d != this) {
                sb2.append(objM2362d);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
