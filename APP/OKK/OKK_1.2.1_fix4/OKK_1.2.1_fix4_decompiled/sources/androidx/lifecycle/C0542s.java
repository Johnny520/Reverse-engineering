package androidx.lifecycle;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0542s {

    /* JADX INFO: renamed from: a */
    public EnumC0536m f1489a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0539p f1490b;

    /* JADX INFO: renamed from: a */
    public final void m1253a(InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l) {
        EnumC0536m enumC0536mM1252a = enumC0535l.m1252a();
        EnumC0536m enumC0536m = this.f1489a;
        AbstractC0307g.m703e(enumC0536m, "state1");
        if (enumC0536mM1252a.compareTo(enumC0536m) < 0) {
            enumC0536m = enumC0536mM1252a;
        }
        this.f1489a = enumC0536m;
        this.f1490b.mo981b(interfaceC0541r, enumC0535l);
        this.f1489a = enumC0536mM1252a;
    }
}
