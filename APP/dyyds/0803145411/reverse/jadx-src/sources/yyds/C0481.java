package yyds;

import java.io.Serializable;

/* JADX INFO: renamed from: yyds.ᛲᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0481 implements InterfaceC2213, Serializable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC2213 f2393;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC2247 f2394;

    public C0481(InterfaceC2213 interfaceC2213, InterfaceC2247 interfaceC2247) {
        this.f2393 = interfaceC2213;
        this.f2394 = interfaceC2247;
    }

    public final boolean equals(Object obj) {
        boolean zM3188;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0481) {
            C0481 c0481 = (C0481) obj;
            int i = 2;
            C0481 c04812 = c0481;
            int i2 = 2;
            while (true) {
                InterfaceC2213 interfaceC2213 = c04812.f2393;
                c04812 = interfaceC2213 instanceof C0481 ? (C0481) interfaceC2213 : null;
                if (c04812 == null) {
                    break;
                }
                i2++;
            }
            C0481 c04813 = this;
            while (true) {
                InterfaceC2213 interfaceC22132 = c04813.f2393;
                c04813 = interfaceC22132 instanceof C0481 ? (C0481) interfaceC22132 : null;
                if (c04813 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    InterfaceC2247 interfaceC2247 = this.f2394;
                    if (!AbstractC1544.m3188(c0481.mo423(interfaceC2247.getKey()), interfaceC2247)) {
                        zM3188 = false;
                        break;
                    }
                    InterfaceC2213 interfaceC22133 = this.f2393;
                    if (!(interfaceC22133 instanceof C0481)) {
                        InterfaceC2247 interfaceC22472 = (InterfaceC2247) interfaceC22133;
                        zM3188 = AbstractC1544.m3188(c0481.mo423(interfaceC22472.getKey()), interfaceC22472);
                        break;
                    }
                    this = (C0481) interfaceC22133;
                }
                if (zM3188) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2394.hashCode() + this.f2393.hashCode();
    }

    public final String toString() {
        return AbstractC0897.m2000(new StringBuilder("["), (String) mo424("", new C1936(2)), ']');
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final InterfaceC2213 mo421(InterfaceC2289 interfaceC2289) {
        InterfaceC2247 interfaceC2247 = this.f2394;
        InterfaceC2247 interfaceC2247Mo423 = interfaceC2247.mo423(interfaceC2289);
        InterfaceC2213 interfaceC2213 = this.f2393;
        if (interfaceC2247Mo423 != null) {
            return interfaceC2213;
        }
        InterfaceC2213 interfaceC2213Mo421 = interfaceC2213.mo421(interfaceC2289);
        return interfaceC2213Mo421 == interfaceC2213 ? this : interfaceC2213Mo421 == C2586.f12764 ? interfaceC2247 : new C0481(interfaceC2213Mo421, interfaceC2247);
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛶᛷᲀ */
    public final /* bridge */ InterfaceC2213 mo422(InterfaceC2213 interfaceC2213) {
        return AbstractC0879.m1960(this, interfaceC2213);
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛸᲇᛶ */
    public final InterfaceC2247 mo423(InterfaceC2289 interfaceC2289) {
        while (true) {
            InterfaceC2247 interfaceC2247Mo423 = this.f2394.mo423(interfaceC2289);
            if (interfaceC2247Mo423 != null) {
                return interfaceC2247Mo423;
            }
            InterfaceC2213 interfaceC2213 = this.f2393;
            if (!(interfaceC2213 instanceof C0481)) {
                return interfaceC2213.mo423(interfaceC2289);
            }
            this = (C0481) interfaceC2213;
        }
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final Object mo424(Object obj, InterfaceC0477 interfaceC0477) {
        return interfaceC0477.mo511(this.f2393.mo424(obj, interfaceC0477), this.f2394);
    }
}
