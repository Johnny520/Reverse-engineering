package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ha3 implements InterfaceC0539od {

    /* JADX INFO: renamed from: a */
    public final String f3935a;

    public ha3(String str) {
        this.f3935a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ha3) {
            return this.f3935a.equals(((ha3) obj).f3935a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3935a.hashCode();
    }

    public final String toString() {
        return hk1.m2210i(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f3935a, ')');
    }
}
