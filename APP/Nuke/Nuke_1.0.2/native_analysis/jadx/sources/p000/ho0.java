package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ho0 implements InterfaceC0035ay {

    /* JADX INFO: renamed from: h */
    public final InterfaceC0902xx f4092h;

    public ho0(InterfaceC0902xx interfaceC0902xx) {
        this.f4092h = interfaceC0902xx;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ho0) {
            return this.f4092h.equals(((ho0) obj).f4092h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4092h.hashCode() * 31;
    }
}
