package p084Q2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p074O2.C1047e;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1051i;
import p117X2.AbstractC1665j;
import p160f3.C2135g;
import p190k3.AbstractC2453a;
import p190k3.C2458f;

/* JADX INFO: renamed from: Q2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1178c extends AbstractC1176a {

    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i f3866e;

    /* JADX INFO: renamed from: f */
    public transient InterfaceC1046d f3867f;

    public AbstractC1178c(InterfaceC1046d interfaceC1046d, InterfaceC1051i interfaceC1051i) {
        super(interfaceC1046d);
        this.f3866e = interfaceC1051i;
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public InterfaceC1051i mo275e() {
        InterfaceC1051i interfaceC1051i = this.f3866e;
        AbstractC1665j.m2982b(interfaceC1051i);
        return interfaceC1051i;
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: q */
    public void mo2228q() {
        InterfaceC1046d interfaceC1046d = this.f3867f;
        if (interfaceC1046d != null && interfaceC1046d != this) {
            InterfaceC1049g interfaceC1049gMo1166C = mo275e().mo1166C(C1047e.f3285d);
            AbstractC1665j.m2982b(interfaceC1049gMo1166C);
            C2458f c2458f = (C2458f) interfaceC1046d;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2458f.f7929k;
            while (atomicReferenceFieldUpdater.get(c2458f) == AbstractC2453a.f7919c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(c2458f);
            C2135g c2135g = obj instanceof C2135g ? (C2135g) obj : null;
            if (c2135g != null) {
                c2135g.m3965o();
            }
        }
        this.f3867f = C1177b.f3865d;
    }

    public AbstractC1178c(InterfaceC1046d interfaceC1046d) {
        this(interfaceC1046d, interfaceC1046d != null ? interfaceC1046d.mo275e() : null);
    }
}
