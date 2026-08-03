package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3663 extends AbstractC3661 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C7301 f6483;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f6484;

    public C3663(@InterfaceC6399 C7301 c7301, int i) {
        this.f6483 = c7301;
        this.f6484 = i;
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
        return "CancelSemaphoreAcquisitionHandler[" + this.f6483 + ", " + this.f6484 + ']';
    }

    @Override // Yue.AbstractC3662
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo5758(@InterfaceC6489 Throwable th) {
        this.f6483.m22818(this.f6484);
    }
}
