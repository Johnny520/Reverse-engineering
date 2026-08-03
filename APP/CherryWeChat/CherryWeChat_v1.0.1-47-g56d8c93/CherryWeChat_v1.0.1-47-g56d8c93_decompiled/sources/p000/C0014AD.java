package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: AD */
/* JADX INFO: loaded from: classes.dex */
public final class C0014AD implements Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final C0014AD f18c = new C0014AD(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f19a;

    /* JADX INFO: renamed from: b */
    public final long f20b;

    public C0014AD(long j, long j2) {
        this.f19a = j;
        this.f20b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0014AD c0014ad = (C0014AD) obj;
        long j = c0014ad.f19a;
        long j2 = this.f19a;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.f20b, c0014ad.f20b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0014AD)) {
            return false;
        }
        C0014AD c0014ad = (C0014AD) obj;
        return this.f19a == c0014ad.f19a && this.f20b == c0014ad.f20b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19a ^ this.f20b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC0714Qj.m1496r(this.f19a, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC0714Qj.m1496r(this.f19a, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC0714Qj.m1496r(this.f19a, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC0714Qj.m1496r(this.f20b, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC0714Qj.m1496r(this.f20b, bArr, 24, 2, 8);
        return new String(bArr, AbstractC2659w7.f9201a);
    }
}
