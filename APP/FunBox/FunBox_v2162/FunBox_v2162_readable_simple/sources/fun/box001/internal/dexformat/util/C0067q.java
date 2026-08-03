package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0022F;
import fun.box001.internal.dexformat.output.C0202d;

/* JADX INFO: renamed from: f.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0067q extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0067q f296a = null;

    static {
        f296a = new C0067q();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 3;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j r1) {
        return AbstractC0039p.m162c(r1);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j r1) {
        return AbstractC0039p.m161a(r1);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r2) {
        if ((r2 instanceof C0022F) == true) goto L5;
        return false;
    L5:
        if (r2.m140m().m504B() != 0) goto L11;
        return true;
    L11:
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r3, AbstractC0033j r4) {
        int r0 = ((C0022F) r4).m87A();
        AbstractC0039p.m174t(r3, AbstractC0039p.m167m(0, r4), r0);
    }
}
