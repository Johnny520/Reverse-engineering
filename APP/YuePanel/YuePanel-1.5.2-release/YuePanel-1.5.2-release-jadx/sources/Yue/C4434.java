package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4434 extends AbstractC3661 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4433 f9162;

    public C4434(@InterfaceC6399 InterfaceC4433 interfaceC4433) {
        this.f9162 = interfaceC4433;
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
        return "DisposeOnCancel[" + this.f9162 + ']';
    }

    @Override // Yue.AbstractC3662
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo5758(@InterfaceC6489 Throwable th) {
        this.f9162.mo5757();
    }
}
