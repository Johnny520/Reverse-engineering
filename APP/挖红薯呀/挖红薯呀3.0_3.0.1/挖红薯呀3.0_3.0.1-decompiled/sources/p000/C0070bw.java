package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: bw */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0070bw implements ob1 {

    /* JADX INFO: renamed from: d */
    public int f594d;

    /* JADX INFO: renamed from: e */
    public Object f595e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0070bw(l91 l91Var, int i) {
        this.f595e = l91Var;
        this.f594d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ob1
    /* JADX INFO: renamed from: c */
    public int mo374c() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m375d(long j) {
        if (m377f(j)) {
            return;
        }
        int i = this.f594d;
        long[] jArrCopyOf = (long[]) this.f595e;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.f595e = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.f594d) {
            this.f594d = i + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: e */
    public AbstractC0046b8 mo376e(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        return ((C0948y2) this.f595e).mo376e(j, abstractC0046b8, abstractC0046b82, abstractC0046b83);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean m377f(long j) {
        int i = this.f594d;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.f595e)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ob1
    /* JADX INFO: renamed from: g */
    public int mo378g() {
        return this.f594d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: h */
    public AbstractC0046b8 mo379h(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        return ((C0948y2) this.f595e).mo379h(j, abstractC0046b8, abstractC0046b82, abstractC0046b83);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m380j(long j) {
        int i = this.f594d;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.f595e)[i2]) {
                int i3 = this.f594d - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.f595e;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.f594d--;
                return;
            }
            i2++;
        }
    }
}
