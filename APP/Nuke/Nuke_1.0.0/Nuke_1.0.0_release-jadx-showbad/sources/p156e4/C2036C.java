package p156e4;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: e4.C */
/* JADX INFO: loaded from: classes.dex */
public final class C2036C {

    /* JADX INFO: renamed from: a */
    public int f6780a;

    /* JADX INFO: renamed from: b */
    public final int[] f6781b = new int[10];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m3734a() {
        if ((this.f6780a & 16) != 0) {
            return this.f6781b[4];
        }
        return 65535;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3735b(C2036C c2036c) {
        AbstractC1665j.m2985e(c2036c, "other");
        for (int i5 = 0; i5 < 10; i5++) {
            if (((1 << i5) & c2036c.f6780a) != 0) {
                m3736c(i5, c2036c.f6781b[i5]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3736c(int i5, int i6) {
        if (i5 >= 0) {
            int[] iArr = this.f6781b;
            if (i5 >= iArr.length) {
                return;
            }
            this.f6780a = (1 << i5) | this.f6780a;
            iArr[i5] = i6;
        }
    }
}
