package p000;

/* JADX INFO: renamed from: aC */
/* JADX INFO: loaded from: classes.dex */
public final class C1130aC implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte f3580a;

    public /* synthetic */ C1130aC(byte r1) {
        this.f3580a = r1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object r2) {
        byte r22 = ((C1130aC) r2).f3580a;
        return AbstractC0585Nj.m1139g(this.f3580a & 255, r22 & 255);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1130aC) == false) goto L11;
        byte r22 = ((C1130aC) r2).f3580a;
        if (this.f3580a == r22) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f3580a);
    }

    public final String toString() {
        return String.valueOf(this.f3580a & 255);
    }
}
