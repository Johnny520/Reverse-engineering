package p000;

/* JADX INFO: renamed from: aC */
/* JADX INFO: loaded from: classes.dex */
public final class C1130aC implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte f3580a;

    public /* synthetic */ C1130aC(byte b) {
        this.f3580a = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC0585Nj.m1139g(this.f3580a & 255, ((C1130aC) obj).f3580a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1130aC) {
            return this.f3580a == ((C1130aC) obj).f3580a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f3580a);
    }

    public final String toString() {
        return String.valueOf(this.f3580a & 255);
    }
}
