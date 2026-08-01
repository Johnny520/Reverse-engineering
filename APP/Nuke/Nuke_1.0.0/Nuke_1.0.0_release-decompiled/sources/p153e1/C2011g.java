package p153e1;

/* JADX INFO: renamed from: e1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2011g {

    /* JADX INFO: renamed from: a */
    public final long f6733a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2011g) {
            return this.f6733a == ((C2011g) obj).f6733a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6733a);
    }

    public final String toString() {
        long j5 = this.f6733a;
        if (j5 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C2010f.m3697c(Float.intBitsToFloat((int) (j5 >> 32)))) + ", " + ((Object) C2010f.m3697c(Float.intBitsToFloat((int) (j5 & 4294967295L)))) + ')';
    }
}
