package p031Q0;

import java.io.Serializable;
import p007D0.InterfaceC0135a;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: Q0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0306f implements InterfaceC0305e, Serializable, InterfaceC0135a {

    /* JADX INFO: renamed from: a */
    public transient AbstractC0306f f582a;

    /* JADX INFO: renamed from: b */
    public final Object f583b;

    /* JADX INFO: renamed from: c */
    public final Class f584c;

    /* JADX INFO: renamed from: d */
    public final String f585d;

    /* JADX INFO: renamed from: e */
    public final String f586e;

    /* JADX INFO: renamed from: f */
    public final boolean f587f;

    /* JADX INFO: renamed from: g */
    public final int f588g;

    /* JADX INFO: renamed from: h */
    public final int f589h;

    public AbstractC0306f(Class r7, String r8, String r9) {
        this(1, C0301a.f579a, r7, r8, r9);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0306f m697a() {
        AbstractC0314n.f596a.getClass();
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0302b m698c() {
        Class r02 = this.f584c;
        if (r02 != null) goto L6;
        return null;
    L6:
        if (this.f587f == false) goto L9;
        AbstractC0314n.f596a.getClass();
        InterfaceC0302b r1 = new C0309i(r02);
    L11:
        return r1;
    L9:
        AbstractC0314n.f596a.getClass();
        r1 = new C0303c(r02);
        goto L11
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AbstractC0306f) == false) goto L23;
        AbstractC0306f r52 = (AbstractC0306f) r5;
        String r1 = r52.f585d;
        if (this.f585d.equals(r1) == false) goto L21;
        if (this.f586e.equals(r52.f586e) == false) goto L21;
        if (this.f589h != r52.f589h) goto L21;
        if (this.f588g != r52.f588g) goto L21;
        if (AbstractC0307g.m699a(this.f583b, r52.f583b) == false) goto L21;
        if (AbstractC0307g.m699a(m698c(), r52.m698c()) == false) goto L21;
        return true;
    L21:
        return false;
    L23:
        if ((r5 instanceof AbstractC0306f) == false) goto L29;
        AbstractC0306f r02 = this.f582a;
        if (r02 != null) goto L28;
        m697a();
        this.f582a = this;
        r02 = this;
    L28:
        return r5.equals(r02);
    L29:
        return false;
    }

    @Override // p031Q0.InterfaceC0305e
    public final int getArity() {
        return this.f588g;
    }

    public final int hashCode() {
        if (m698c() != null) goto L5;
        int r02 = 0;
    L6:
        int r1 = (this.f585d.hashCode() + r02) * 31;
        return this.f586e.hashCode() + r1;
    L5:
        r02 = m698c().hashCode() * 31;
        goto L6
    }

    public final String toString() {
        AbstractC0306f r02 = this.f582a;
        if (r02 != null) goto L5;
        m697a();
        this.f582a = this;
        r02 = this;
    L5:
        if (r02 != this) goto L7;
        String r1 = this.f585d;
        if ("<init>".equals(r1) == false) goto L12;
        return "constructor (Kotlin reflection is not available)";
    L12:
        return AbstractC0324d.m723f("function ", r1, " (Kotlin reflection is not available)");
    L7:
        return r02.toString();
    }

    public AbstractC0306f(int r2, Object r3, Class r4, String r5, String r6) {
        this.f583b = r3;
        this.f584c = r4;
        this.f585d = r5;
        this.f586e = r6;
        this.f587f = false;
        this.f588g = r2;
        this.f589h = 0;
    }
}
