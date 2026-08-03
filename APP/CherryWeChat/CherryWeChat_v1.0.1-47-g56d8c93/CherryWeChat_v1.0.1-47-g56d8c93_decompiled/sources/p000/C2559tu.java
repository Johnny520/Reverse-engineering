package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: tu */
/* JADX INFO: loaded from: classes.dex */
public final class C2559tu implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte[] f8879a;

    public C2559tu(byte[] bArr) {
        this.f8879a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2559tu c2559tu = (C2559tu) obj;
        byte[] bArr = this.f8879a;
        int length = bArr.length;
        byte[] bArr2 = c2559tu.f8879a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = c2559tu.f8879a[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2559tu) {
            return Arrays.equals(this.f8879a, ((C2559tu) obj).f8879a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8879a);
    }

    public final String toString() {
        return AbstractC0585Nj.m1155w(this.f8879a);
    }
}
