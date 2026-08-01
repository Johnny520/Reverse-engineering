package androidx.lifecycle;

import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0485t {

    /* JADX INFO: renamed from: a */
    public EnumC0479n f1524a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0482q f1525b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m926a(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        EnumC0479n enumC0479nM925a = enumC0478m.m925a();
        EnumC0479n enumC0479n = this.f1524a;
        AbstractC0223g.m418e(enumC0479n, "state1");
        if (enumC0479nM925a.compareTo(enumC0479n) < 0) {
            enumC0479n = enumC0479nM925a;
        }
        this.f1524a = enumC0479n;
        this.f1525b.mo391c(interfaceC0484s, enumC0478m);
        this.f1524a = enumC0479nM925a;
    }
}
