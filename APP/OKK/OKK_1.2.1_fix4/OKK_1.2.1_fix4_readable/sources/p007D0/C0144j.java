package p007D0;

/* JADX INFO: renamed from: D0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0144j implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte f337a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        byte b2 = ((C0144j) obj).f337a;
        int i2 = this.f337a & 255;
        int i3 = b2 & 255;
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0144j) {
            return this.f337a == ((C0144j) obj).f337a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f337a);
    }

    public final String toString() {
        return String.valueOf(this.f337a & 255);
    }
}
