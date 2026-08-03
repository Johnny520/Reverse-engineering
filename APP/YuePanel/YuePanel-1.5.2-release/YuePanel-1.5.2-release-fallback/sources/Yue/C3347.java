package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3347 extends Yue.AbstractC0928 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> f10801;

    public C3347(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r1) {
            r0 = this;
            r0.<init>()
            r0.f10801 = r1
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.mo353(r1)
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InvokeOnCancel["
            r0.append(r1)
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r1 = r2.f10801
            java.lang.String r1 = Yue.C1758.m8350(r1)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = Yue.C1758.m8351(r2)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC0929
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo353(@Yue.InterfaceC4543 java.lang.Throwable r2) {
            r1 = this;
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r0 = r1.f10801
            r0.invoke(r2)
            return
    }
}
