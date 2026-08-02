package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n73 implements Comparable {

    /* JADX INFO: renamed from: h */
    public final short f7040h;

    public /* synthetic */ n73(short s) {
        this.f7040h = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return t11.m5089o(this.f7040h & 65535, ((n73) obj).f7040h & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n73) {
            return this.f7040h == ((n73) obj).f7040h;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f7040h);
    }

    public final String toString() {
        return String.valueOf(this.f7040h & 65535);
    }
}
