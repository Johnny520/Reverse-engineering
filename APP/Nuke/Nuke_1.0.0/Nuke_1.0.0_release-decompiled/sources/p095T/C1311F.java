package p095T;

import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2082n;
import p158f0.AbstractC2091w;
import p158f0.AbstractC2092x;

/* JADX INFO: renamed from: T.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1311F extends AbstractC2091w implements InterfaceC1339T0 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC1599a f4682e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1334Q0 f4683f;

    /* JADX INFO: renamed from: g */
    public C1309E f4684g = new C1309E(AbstractC2082n.m3834j().mo3791g());

    public C1311F(InterfaceC1599a interfaceC1599a, C1357e c1357e) {
        this.f4682e = interfaceC1599a;
        this.f4683f = c1357e;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: a */
    public final AbstractC2092x mo2410a() {
        return this.f4684g;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: c */
    public final void mo2411c(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f4684g = (C1309E) abstractC2092x;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p095T.C1309E m2412g(p095T.C1309E r22, p158f0.AbstractC2074f r23, boolean r24, p112W2.InterfaceC1599a r25) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1311F.m2412g(T.E, f0.f, boolean, W2.a):T.E");
    }

    @Override // p095T.InterfaceC1339T0
    public final Object getValue() {
        InterfaceC1601c interfaceC1601cMo3789e = AbstractC2082n.m3834j().mo3789e();
        if (interfaceC1601cMo3789e != null) {
            interfaceC1601cMo3789e.mo1h(this);
        }
        AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
        return m2412g((C1309E) AbstractC2082n.m3833i(this.f4684g, abstractC2074fM3834j), abstractC2074fM3834j, true, this.f4682e).f4678f;
    }

    /* JADX INFO: renamed from: h */
    public final C1309E m2413h() {
        AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
        return m2412g((C1309E) AbstractC2082n.m3833i(this.f4684g, abstractC2074fM3834j), abstractC2074fM3834j, false, this.f4682e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C1309E c1309e = (C1309E) AbstractC2082n.m3832h(this.f4684g);
        sb.append(c1309e.m2407c(this, AbstractC2082n.m3834j()) ? String.valueOf(c1309e.f4678f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
