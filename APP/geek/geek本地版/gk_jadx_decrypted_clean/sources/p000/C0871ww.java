package p000;

import androidx.activity.C0029a;

/* JADX INFO: renamed from: ww */
/* JADX INFO: loaded from: classes.dex */
public final class C0871ww implements InterfaceC0289h8 {

    /* JADX INFO: renamed from: a */
    public final C0712sl f5034a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0029a f5035b;

    public C0871ww(C0029a c0029a, C0712sl c0712sl) {
        AbstractC0346ip.m1503o("onBackPressedCallback", c0712sl);
        this.f5035b = c0029a;
        this.f5034a = c0712sl;
    }

    @Override // p000.InterfaceC0289h8
    public final void cancel() {
        C0029a c0029a = this.f5035b;
        C0400k6 c0400k6 = c0029a.f184b;
        C0712sl c0712sl = this.f5034a;
        c0400k6.remove(c0712sl);
        if (AbstractC0346ip.m1497i(c0029a.f185c, c0712sl)) {
            c0712sl.getClass();
            c0029a.f185c = null;
        }
        c0712sl.f4447b.remove(this);
        C0908xw c0908xw = c0712sl.f4448c;
        if (c0908xw != null) {
            c0908xw.mo10a();
        }
        c0712sl.f4448c = null;
    }
}
