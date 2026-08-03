package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7092 extends AbstractC3529 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C5850 f21441;

    public C7092(@InterfaceC6399 C5850 c5850) {
        this.f21441 = c5850;
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
        return "RemoveOnCancel[" + this.f21441 + ']';
    }

    @Override // Yue.AbstractC3662
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo5758(@InterfaceC6489 Throwable th) {
        this.f21441.mo18079();
    }
}
