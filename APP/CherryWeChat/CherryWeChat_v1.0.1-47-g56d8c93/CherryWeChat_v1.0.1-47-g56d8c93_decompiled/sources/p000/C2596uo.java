package p000;

import java.util.List;

/* JADX INFO: renamed from: uo */
/* JADX INFO: loaded from: classes.dex */
public final class C2596uo extends AbstractC2639vo {
    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: a */
    public final void mo5041a(long j, Object obj) {
        ((AbstractC0172E) ((InterfaceC0458Kl) AbstractC2092jD.f7366c.m2908i(j, obj))).f453a = false;
    }

    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: b */
    public final void mo5042b(long j, Object obj, Object obj2) {
        AbstractC1535iD abstractC1535iD = AbstractC2092jD.f7366c;
        InterfaceC0458Kl interfaceC0458KlMo716f = (InterfaceC0458Kl) abstractC1535iD.m2908i(j, obj);
        InterfaceC0458Kl interfaceC0458Kl = (InterfaceC0458Kl) abstractC1535iD.m2908i(j, obj2);
        int size = interfaceC0458KlMo716f.size();
        int size2 = interfaceC0458Kl.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0172E) interfaceC0458KlMo716f).f453a) {
                interfaceC0458KlMo716f = interfaceC0458KlMo716f.mo716f(size2 + size);
            }
            interfaceC0458KlMo716f.addAll(interfaceC0458Kl);
        }
        if (size > 0) {
            interfaceC0458Kl = interfaceC0458KlMo716f;
        }
        AbstractC2092jD.m4276p(j, obj, interfaceC0458Kl);
    }

    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: c */
    public final List mo5043c(long j, Object obj) {
        InterfaceC0458Kl interfaceC0458Kl = (InterfaceC0458Kl) AbstractC2092jD.f7366c.m2908i(j, obj);
        if (((AbstractC0172E) interfaceC0458Kl).f453a) {
            return interfaceC0458Kl;
        }
        int size = interfaceC0458Kl.size();
        InterfaceC0458Kl interfaceC0458KlMo716f = interfaceC0458Kl.mo716f(size == 0 ? 10 : size * 2);
        AbstractC2092jD.m4276p(j, obj, interfaceC0458KlMo716f);
        return interfaceC0458KlMo716f;
    }
}
