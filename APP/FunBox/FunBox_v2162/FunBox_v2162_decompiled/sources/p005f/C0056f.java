package p005f;

import p004e.AbstractC0033j;
import p004e.AbstractC0039p;
import p004e.C0022F;
import p013n.C0202d;

/* JADX INFO: renamed from: f.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0056f extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0056f f285a = new C0056f();

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: b */
    public final boolean mo175b(C0022F c0022f) {
        int iM87A = c0022f.m87A();
        if (iM87A != 0) {
            return ((short) iM87A) == iM87A;
        }
        return false;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 2;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        return AbstractC0039p.m162c(abstractC0033j);
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return AbstractC0039p.m161a(abstractC0033j);
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        if (!(abstractC0033j instanceof C0022F) || abstractC0033j.m140m().m504B() != 0) {
            return false;
        }
        C0022F c0022f = (C0022F) abstractC0033j;
        if (c0022f.m88B()) {
            return mo175b(c0022f);
        }
        return true;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        AbstractC0039p.m173s(c0202d, AbstractC0039p.m167m(0, abstractC0033j), (short) ((C0022F) abstractC0033j).m87A());
    }
}
