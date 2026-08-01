package p163l;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0564p5;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: l.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4327m implements InterfaceC0564p5 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC4365t2 f12655q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0512i2 f12656r;

    /* JADX INFO: renamed from: s */
    public AbstractC4357s f12657s;

    /* JADX INFO: renamed from: t */
    public long f12658t;

    /* JADX INFO: renamed from: u */
    public long f12659u;

    /* JADX INFO: renamed from: v */
    public boolean f12660v;

    public /* synthetic */ C4327m(InterfaceC4365t2 interfaceC4365t2, Object obj, AbstractC4357s abstractC4357s, long j10, long j11, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC4365t2, obj, (i10 & 4) != 0 ? null : abstractC4357s, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }

    /* JADX INFO: renamed from: d */
    public final long m16981d() {
        return this.f12659u;
    }

    /* JADX INFO: renamed from: e */
    public final long m16982e() {
        return this.f12658t;
    }

    @Override // androidx.compose.runtime.InterfaceC0564p5
    public Object getValue() {
        return this.f12656r.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC4365t2 m16983k() {
        return this.f12655q;
    }

    /* JADX INFO: renamed from: l */
    public final Object m16984l() {
        return this.f12655q.mo17123b().mo27m(this.f12657s);
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC4357s m16985m() {
        return this.f12657s;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16986o() {
        return this.f12660v;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + m16984l() + ", isRunning=" + this.f12660v + ", lastFrameTimeNanos=" + this.f12658t + ", finishedTimeNanos=" + this.f12659u + ')';
    }

    /* JADX INFO: renamed from: v */
    public final void m16987v(long j10) {
        this.f12659u = j10;
    }

    /* JADX INFO: renamed from: w */
    public final void m16988w(long j10) {
        this.f12658t = j10;
    }

    /* JADX INFO: renamed from: x */
    public final void m16989x(boolean z10) {
        this.f12660v = z10;
    }

    /* JADX INFO: renamed from: y */
    public void m16990y(Object obj) {
        this.f12656r.setValue(obj);
    }

    /* JADX INFO: renamed from: z */
    public final void m16991z(AbstractC4357s abstractC4357s) {
        this.f12657s = abstractC4357s;
    }

    public C4327m(InterfaceC4365t2 interfaceC4365t2, Object obj, AbstractC4357s abstractC4357s, long j10, long j11, boolean z10) {
        AbstractC4357s abstractC4357sM17119e;
        this.f12655q = interfaceC4365t2;
        this.f12656r = AbstractC0522j5.m1773e(obj, null, 2, null);
        this.f12657s = (abstractC4357s == null || (abstractC4357sM17119e = AbstractC4362t.m17119e(abstractC4357s)) == null) ? AbstractC4332n.m17000i(interfaceC4365t2, obj) : abstractC4357sM17119e;
        this.f12658t = j10;
        this.f12659u = j11;
        this.f12660v = z10;
    }
}
