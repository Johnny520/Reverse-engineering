package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.C0168s;

/* JADX INFO: renamed from: e.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0022F extends AbstractC0037n {

    /* JADX INFO: renamed from: e */
    private C0029f f82e;

    public C0022F(C0035l r1, C0168s r2, C0164o r3, C0029f r4) {
        super(r1, r2, r3);
        if (r4 == null) goto L7;
        this.f82e = r4;
        return;
    L7:
        throw new NullPointerException("target == null");
    }

    /* JADX INFO: renamed from: A */
    public final int m87A() {
        return this.f82e.m135h() - m135h();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m88B() {
        if (m141n() == true) goto L5;
    L7:
        return false;
    L5:
        if (this.f82e.m141n() == false) goto L7;
        return true;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: a */
    protected final String mo84a() {
        C0029f r0 = this.f82e;
        if (r0 != null) goto L7;
        return "????";
    L7:
        return r0.m143p();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: u */
    public final AbstractC0033j mo85u(C0035l r5) {
        return new C0022F(r5, m139l(), m140m(), this.f82e);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: w */
    public final AbstractC0033j mo86w(C0164o r5) {
        return new C0022F(m138k(), m139l(), r5, this.f82e);
    }

    /* JADX INFO: renamed from: y */
    public final C0029f m89y() {
        return this.f82e;
    }

    /* JADX INFO: renamed from: z */
    public final int m90z() {
        return this.f82e.m135h();
    }
}
