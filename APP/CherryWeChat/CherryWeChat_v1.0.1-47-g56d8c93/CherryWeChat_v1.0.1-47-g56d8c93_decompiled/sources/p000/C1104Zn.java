package p000;

/* JADX INFO: renamed from: Zn */
/* JADX INFO: loaded from: classes.dex */
public final class C1104Zn {

    /* JADX INFO: renamed from: a */
    public EnumC0675Pn f3496a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0889Un f3497b;

    /* JADX INFO: renamed from: a */
    public final void m2028a(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
        EnumC0675Pn enumC0675PnM1254a = enumC0632On.m1254a();
        EnumC0675Pn enumC0675Pn = this.f3496a;
        if (enumC0675PnM1254a.compareTo(enumC0675Pn) < 0) {
            enumC0675Pn = enumC0675PnM1254a;
        }
        this.f3496a = enumC0675Pn;
        this.f3497b.onStateChanged(interfaceC1061Yn, enumC0632On);
        this.f3496a = enumC0675PnM1254a;
    }
}
