package p002A1;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: A1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0146s {

    /* JADX INFO: renamed from: a */
    public EnumC0141n f537a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0143p f538b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m186a(InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
        EnumC0141n enumC0141nM183a = enumC0140m.m183a();
        EnumC0141n enumC0141n = this.f537a;
        AbstractC1665j.m2985e(enumC0141n, "state1");
        if (enumC0141nM183a.compareTo(enumC0141n) < 0) {
            enumC0141n = enumC0141nM183a;
        }
        this.f537a = enumC0141n;
        this.f538b.mo147d(interfaceC0145r, enumC0140m);
        this.f537a = enumC0141nM183a;
    }
}
