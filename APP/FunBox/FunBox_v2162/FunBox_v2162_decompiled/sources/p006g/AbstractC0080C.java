package p006g;

import p001b.C0003a;
import p013n.C0202d;

/* JADX INFO: renamed from: g.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080C extends AbstractC0108s implements Comparable {

    /* JADX INFO: renamed from: a */
    private final int f312a;

    /* JADX INFO: renamed from: b */
    private int f313b;

    /* JADX INFO: renamed from: c */
    private AbstractC0082E f314c;

    /* JADX INFO: renamed from: d */
    private int f315d;

    public AbstractC0080C(int i2, int i3) {
        if (i2 <= 0 || ((i2 - 1) & i2) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        if (i3 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.f312a = i2;
        this.f313b = i3;
        this.f314c = null;
        this.f315d = -1;
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        int i2 = this.f313b;
        if (i2 >= 0) {
            return i2;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC0080C abstractC0080C = (AbstractC0080C) obj;
        if (this == abstractC0080C) {
            return 0;
        }
        EnumC0109t enumC0109tMo243b = mo243b();
        EnumC0109t enumC0109tMo243b2 = abstractC0080C.mo243b();
        return enumC0109tMo243b != enumC0109tMo243b2 ? enumC0109tMo243b.compareTo(enumC0109tMo243b2) : mo234e(abstractC0080C);
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k c0100k, C0202d c0202d) {
        c0202d.m483a(this.f312a);
        try {
            if (this.f313b < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            c0202d.m487e(m235f());
            mo241l(c0100k, c0202d);
        } catch (RuntimeException e2) {
            throw C0003a.m22b("...while writing " + this, e2);
        }
    }

    /* JADX INFO: renamed from: e */
    protected int mo234e(AbstractC0080C abstractC0080C) {
        throw new UnsupportedOperationException("unsupported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC0080C abstractC0080C = (AbstractC0080C) obj;
        return mo243b() == abstractC0080C.mo243b() && mo234e(abstractC0080C) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m235f() {
        int i2 = this.f315d;
        if (i2 >= 0) {
            return this.f314c.m244b(i2);
        }
        throw new RuntimeException("offset not yet known");
    }

    /* JADX INFO: renamed from: g */
    public final int m236g() {
        return this.f312a;
    }

    /* JADX INFO: renamed from: h */
    public final String m237h() {
        return "[" + Integer.toHexString(m235f()) + ']';
    }

    /* JADX INFO: renamed from: i */
    public final int m238i(AbstractC0082E abstractC0082E, int i2) {
        if (abstractC0082E == null) {
            throw new NullPointerException("addedTo == null");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.f314c != null) {
            throw new RuntimeException("already written");
        }
        int i3 = this.f312a - 1;
        int i4 = (i2 + i3) & (~i3);
        this.f314c = abstractC0082E;
        this.f315d = i4;
        mo239j(abstractC0082E, i4);
        return i4;
    }

    /* JADX INFO: renamed from: j */
    protected void mo239j(AbstractC0082E abstractC0082E, int i2) {
    }

    /* JADX INFO: renamed from: k */
    public final void m240k(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.f313b >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.f313b = i2;
    }

    /* JADX INFO: renamed from: l */
    protected abstract void mo241l(C0100k c0100k, C0202d c0202d);
}
