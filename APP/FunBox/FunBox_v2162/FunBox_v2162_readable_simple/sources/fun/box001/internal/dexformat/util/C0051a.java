package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0022F;
import fun.box001.internal.dexformat.output.C0202d;

/* JADX INFO: renamed from: f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0051a extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0051a f280a = null;

    static {
        f280a = new C0051a();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: b */
    public final boolean mo175b(C0022F r4) {
        int r42 = r4.m87A();
        if (r42 != 0) goto L5;
        return false;
    L5:
        if (((byte) r42) != r42) goto L7;
        boolean r43 = true;
    L8:
        if (r43 == true) goto L10;
        return false;
    L10:
        return true;
    L7:
        r43 = false;
        goto L8
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 1;
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
        if (r2.m140m().m504B() != 0) goto L15;
        C0022F r22 = (C0022F) r2;
        if (r22.m88B() == true) goto L14;
        return true;
    L14:
        return mo175b(r22);
    L15:
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r2, AbstractC0033j r3) {
        r2.m498r(AbstractC0039p.m167m(((C0022F) r3).m87A() & 255, r3));
    }
}
