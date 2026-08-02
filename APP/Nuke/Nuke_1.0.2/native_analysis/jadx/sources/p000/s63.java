package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s63 implements Comparable {

    /* JADX INFO: renamed from: h */
    public final byte f9948h;

    public /* synthetic */ s63(byte b) {
        this.f9948h = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return t11.m5089o(this.f9948h & 255, ((s63) obj).f9948h & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s63) {
            return this.f9948h == ((s63) obj).f9948h;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f9948h);
    }

    public final String toString() {
        return String.valueOf(this.f9948h & 255);
    }
}
