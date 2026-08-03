package p004e;

import p009j.C0164o;
import p009j.C0168s;

/* JADX INFO: renamed from: e.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0022F extends AbstractC0037n {

    /* JADX INFO: renamed from: e */
    private C0029f f82e;

    public C0022F(C0035l c0035l, C0168s c0168s, C0164o c0164o, C0029f c0029f) {
        super(c0035l, c0168s, c0164o);
        if (c0029f == null) {
            throw new NullPointerException("target == null");
        }
        this.f82e = c0029f;
    }

    /* JADX INFO: renamed from: A */
    public final int m87A() {
        return this.f82e.m135h() - m135h();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m88B() {
        return m141n() && this.f82e.m141n();
    }

    @Override // p004e.AbstractC0033j
    /* JADX INFO: renamed from: a */
    protected final String mo84a() {
        C0029f c0029f = this.f82e;
        return c0029f == null ? "????" : c0029f.m143p();
    }

    @Override // p004e.AbstractC0033j
    /* JADX INFO: renamed from: u */
    public final AbstractC0033j mo85u(C0035l c0035l) {
        return new C0022F(c0035l, m139l(), m140m(), this.f82e);
    }

    @Override // p004e.AbstractC0033j
    /* JADX INFO: renamed from: w */
    public final AbstractC0033j mo86w(C0164o c0164o) {
        return new C0022F(m138k(), m139l(), c0164o, this.f82e);
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
