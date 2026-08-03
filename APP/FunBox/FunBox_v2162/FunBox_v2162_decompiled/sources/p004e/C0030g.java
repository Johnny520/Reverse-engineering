package p004e;

import p000a.AbstractC0001b;
import p009j.C0164o;
import p009j.C0168s;
import p010k.AbstractC0171a;
import p010k.C0190t;

/* JADX INFO: renamed from: e.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0030g extends AbstractC0037n {

    /* JADX INFO: renamed from: e */
    private final AbstractC0171a f93e;

    /* JADX INFO: renamed from: f */
    private int f94f;

    /* JADX INFO: renamed from: g */
    private int f95g;

    public C0030g(C0035l c0035l, C0168s c0168s, C0164o c0164o, AbstractC0171a abstractC0171a) {
        super(c0035l, c0168s, c0164o);
        if (abstractC0171a == null) {
            throw new NullPointerException("constant == null");
        }
        this.f93e = abstractC0171a;
        this.f94f = -1;
        this.f95g = -1;
    }

    /* JADX INFO: renamed from: A */
    public final void m113A(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f95g >= 0) {
            throw new IllegalStateException("class index already set");
        }
        this.f95g = i2;
    }

    /* JADX INFO: renamed from: B */
    public final void m114B(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f94f >= 0) {
            throw new IllegalStateException("index already set");
        }
        this.f94f = i2;
    }

    @Override // p004e.AbstractC0033j
    /* JADX INFO: renamed from: a */
    protected final String mo84a() {
        return this.f93e.mo107a();
    }

    @Override // p004e.AbstractC0033j
    /* JADX INFO: renamed from: c */
    public final String mo115c() {
        if (!(this.f94f >= 0)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f93e.mo427f());
        sb.append('@');
        int i2 = this.f94f;
        sb.append(i2 < 65536 ? AbstractC0001b.m11q(i2) : AbstractC0001b.m13s(i2));
        return sb.toString();
    }

    @Override // p004e.AbstractC0033j
    /* JADX INFO: renamed from: d */
    public final String mo116d() {
        AbstractC0171a abstractC0171a = this.f93e;
        return abstractC0171a instanceof C0190t ? ((C0190t) abstractC0171a).m448k() : abstractC0171a.mo107a();
    }

    @Override // p004e.AbstractC0033j
    /* JADX INFO: renamed from: u */
    public final AbstractC0033j mo85u(C0035l c0035l) {
        C0030g c0030g = new C0030g(c0035l, m139l(), m140m(), this.f93e);
        int i2 = this.f94f;
        if (i2 >= 0) {
            c0030g.m114B(i2);
        }
        int i3 = this.f95g;
        if (i3 >= 0) {
            c0030g.m113A(i3);
        }
        return c0030g;
    }

    @Override // p004e.AbstractC0033j
    /* JADX INFO: renamed from: w */
    public final AbstractC0033j mo86w(C0164o c0164o) {
        C0030g c0030g = new C0030g(m138k(), m139l(), c0164o, this.f93e);
        int i2 = this.f94f;
        if (i2 >= 0) {
            c0030g.m114B(i2);
        }
        int i3 = this.f95g;
        if (i3 >= 0) {
            c0030g.m113A(i3);
        }
        return c0030g;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC0171a m117y() {
        return this.f93e;
    }

    /* JADX INFO: renamed from: z */
    public final int m118z() {
        int i2 = this.f94f;
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalStateException("index not yet set for " + this.f93e);
    }
}
