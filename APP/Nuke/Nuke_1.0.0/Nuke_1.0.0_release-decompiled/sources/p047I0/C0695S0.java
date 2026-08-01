package p047I0;

import me.dartcv.nuke.BuildConfig;
import p002A1.EnumC0140m;
import p002A1.InterfaceC0143p;
import p002A1.InterfaceC0145r;
import p055K1.C0874a;
import p229r1.C3079i;

/* JADX INFO: renamed from: I0.S0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0695S0 implements InterfaceC0143p {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2222d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2223e;

    public /* synthetic */ C0695S0(int i5, Object obj) {
        this.f2222d = i5;
        this.f2223e = obj;
    }

    @Override // p002A1.InterfaceC0143p
    /* JADX INFO: renamed from: d */
    public final void mo147d(InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
        switch (this.f2222d) {
            case 0:
                AbstractC0713b abstractC0713b = (AbstractC0713b) this.f2223e;
                if (enumC0140m == EnumC0140m.ON_DESTROY) {
                    abstractC0713b.m1212d();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0874a c0874a = (C0874a) this.f2223e;
                if (enumC0140m == EnumC0140m.ON_START) {
                    c0874a.f2763h = true;
                } else if (enumC0140m == EnumC0140m.ON_STOP) {
                    c0874a.f2763h = false;
                }
                break;
            default:
                C3079i c3079i = (C3079i) this.f2223e;
                c3079i.getClass();
                if (enumC0140m == EnumC0140m.ON_DESTROY) {
                    c3079i.m5398a();
                }
                break;
        }
    }
}
