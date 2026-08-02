package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class p11 extends yh1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p11 ? (p11) obj : null) != null;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        r11 r11Var = new r11();
        r11Var.f9320v = o11.f7418i;
        r11Var.f9321w = true;
        return r11Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        r11 r11Var = (r11) th1Var;
        r11Var.f9320v = o11.f7418i;
        r11Var.f9321w = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (o11.f7418i.hashCode() * 31);
    }
}
