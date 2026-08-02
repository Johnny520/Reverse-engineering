package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v83 implements InterfaceC0539od {

    /* JADX INFO: renamed from: a */
    public final String f11844a;

    public v83(String str) {
        this.f11844a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v83) {
            return this.f11844a.equals(((v83) obj).f11844a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11844a.hashCode();
    }

    public final String toString() {
        return hk1.m2210i(new StringBuilder("UrlAnnotation(url="), this.f11844a, ')');
    }
}
