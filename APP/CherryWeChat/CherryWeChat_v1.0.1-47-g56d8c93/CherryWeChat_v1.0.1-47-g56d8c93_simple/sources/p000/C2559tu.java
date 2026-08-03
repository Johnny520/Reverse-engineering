package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: tu */
/* JADX INFO: loaded from: classes.dex */
public final class C2559tu implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte[] f8879a;

    public C2559tu(byte[] r2) {
        this.f8879a = Arrays.copyOf(r2, r2.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r6) {
        C2559tu r62 = (C2559tu) r6;
        byte[] r0 = this.f8879a;
        int r1 = r0.length;
        byte[] r2 = r62.f8879a;
        if (r1 != r2.length) goto L5;
        int r22 = 0;
    L8:
        if (r22 >= r0.length) goto L14;
        byte r3 = r0[r22];
        byte r4 = r62.f8879a[r22];
        if (r3 != r4) goto L12;
        r22 = r22 + 1;
        goto L8
    L12:
        return r3 - r4;
    L14:
        return 0;
    L5:
        return r0.length - r2.length;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2559tu) == true) goto L7;
        return false;
    L7:
        return Arrays.equals(this.f8879a, ((C2559tu) r2).f8879a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8879a);
    }

    public final String toString() {
        return AbstractC0585Nj.m1155w(this.f8879a);
    }
}
