package ec;

import p024b9.AbstractC1061t;
import p145jc.C3822o;

/* JADX INFO: renamed from: ec.b2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2113b2 extends C3822o implements InterfaceC2126e1, InterfaceC2182s1 {

    /* JADX INFO: renamed from: t */
    public C2118c2 f5915t;

    @Override // ec.InterfaceC2126e1
    /* JADX INFO: renamed from: a */
    public void mo7628a() {
        m7631v().m7672U0(this);
    }

    @Override // ec.InterfaceC2182s1
    /* JADX INFO: renamed from: b */
    public C2139h2 mo7629b() {
        return null;
    }

    @Override // ec.InterfaceC2182s1
    /* JADX INFO: renamed from: c */
    public boolean mo7630c() {
        return true;
    }

    @Override // p145jc.C3822o
    public String toString() {
        return AbstractC2181s0.m7898a(this) + '@' + AbstractC2181s0.m7899b(this) + "[job@" + AbstractC2181s0.m7899b(m7631v()) + ']';
    }

    /* JADX INFO: renamed from: v */
    public final C2118c2 m7631v() {
        C2118c2 c2118c2 = this.f5915t;
        if (c2118c2 != null) {
            return c2118c2;
        }
        AbstractC1061t.m3851l("job");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public abstract boolean mo7632w();

    /* JADX INFO: renamed from: x */
    public abstract void mo7633x(Throwable th);

    /* JADX INFO: renamed from: z */
    public final void m7634z(C2118c2 c2118c2) {
        this.f5915t = c2118c2;
    }
}
