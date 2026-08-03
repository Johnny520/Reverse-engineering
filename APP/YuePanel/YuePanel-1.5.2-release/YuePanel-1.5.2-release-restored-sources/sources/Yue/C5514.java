package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5514 extends AbstractC3661 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<Throwable, C8107> f13493;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.lang.Throwable, Yue.ۥۣۢ۠ۤ> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5514(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        this.f13493 = interfaceC5124;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5124
    public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
        mo5758(th);
        return C8107.f3222;
    }

    @InterfaceC6399
    public String toString() {
        return "InvokeOnCancel[" + C4325.m1288(this.f13493) + '@' + C4325.m1289(this) + ']';
    }

    @Override // Yue.AbstractC3662
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo5758(@InterfaceC6489 Throwable th) {
        this.f13493.invoke(th);
    }
}
