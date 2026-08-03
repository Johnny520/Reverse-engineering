package p028c1;

import androidx.lifecycle.C0119x;
import p085fg.InterfaceC1231l;
import p259r9.AbstractC3754e0;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p332wb.AbstractC4855en;
import p339x1.AbstractC5618k;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;
import p339x1.InterfaceC5626m1;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: c1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0373c extends AbstractC5852n implements InterfaceC5626m1, InterfaceC0371a, InterfaceC5624m {

    /* JADX INFO: renamed from: u */
    public final C0374d f1048u;

    /* JADX INFO: renamed from: v */
    public boolean f1049v;

    /* JADX INFO: renamed from: w */
    public InterfaceC1231l f1050w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0373c(C0374d c0374d, InterfaceC1231l interfaceC1231l) {
        this.f1048u = c0374d;
        this.f1050w = interfaceC1231l;
        c0374d.f1051g = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        boolean z9 = this.f1049v;
        C0374d c0374d = this.f1048u;
        if (!z9) {
            c0374d.f1052h = null;
            AbstractC5618k.m10162r(this, new C0372b(this, 0, c0374d));
            if (c0374d.f1052h == null) {
                throw AbstractC4855en.m9257a("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f1049v = true;
        }
        C0119x c0119x = c0374d.f1052h;
        c0119x.getClass();
        ((InterfaceC1231l) c0119x.f310h).invoke(c5610h0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        m1331k1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p028c1.InterfaceC0371a
    /* JADX INFO: renamed from: a */
    public final long mo1324a() {
        return AbstractC3754e0.m7908q0(AbstractC5618k.m10164t(this, 4).f14595i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p028c1.InterfaceC0371a
    /* JADX INFO: renamed from: d */
    public final InterfaceC4233c mo1325d() {
        return AbstractC5618k.m10167w(this).f22771E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: e1 */
    public final void mo1328e1() {
        m1331k1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: g0 */
    public final void mo1329g0() {
        m1331k1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p028c1.InterfaceC0371a
    public final EnumC4243m getLayoutDirection() {
        return AbstractC5618k.m10167w(this).f22772F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5612i
    /* JADX INFO: renamed from: k0 */
    public final void mo1330k0() {
        m1331k1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final void m1331k1() {
        this.f1049v = false;
        this.f1048u.f1052h = null;
        AbstractC5618k.m10156l(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5612i
    /* JADX INFO: renamed from: m */
    public final void mo1332m() {
        m1331k1();
    }

    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
    }
}
