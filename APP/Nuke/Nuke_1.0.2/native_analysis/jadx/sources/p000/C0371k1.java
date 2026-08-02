package p000;

/* JADX INFO: renamed from: k1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0371k1 implements InterfaceC0482n1 {

    /* JADX INFO: renamed from: a */
    public final String f5299a;

    public C0371k1(String str) {
        str.getClass();
        this.f5299a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0371k1) && t11.m5086l(this.f5299a, ((C0371k1) obj).f5299a);
    }

    public final int hashCode() {
        return this.f5299a.hashCode();
    }

    public final String toString() {
        return vi0.m5691j("Failed(reason=", this.f5299a, ")");
    }
}
