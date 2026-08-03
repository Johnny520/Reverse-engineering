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

    public AbstractC0306f(Class cls, String str, String str2) {
        this(1, C0301a.f579a, cls, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0306f m697a() {
        AbstractC0314n.f596a.getClass();
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0302b m698c() {
        InterfaceC0302b c0303c;
        Class cls = this.f584c;
        if (cls == null) {
            return null;
        }
        if (this.f587f) {
            AbstractC0314n.f596a.getClass();
            c0303c = new C0309i(cls);
        } else {
            AbstractC0314n.f596a.getClass();
            c0303c = new C0303c(cls);
        }
        return c0303c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0306f) {
            AbstractC0306f abstractC0306f = (AbstractC0306f) obj;
            return this.f585d.equals(abstractC0306f.f585d) && this.f586e.equals(abstractC0306f.f586e) && this.f589h == abstractC0306f.f589h && this.f588g == abstractC0306f.f588g && AbstractC0307g.m699a(this.f583b, abstractC0306f.f583b) && AbstractC0307g.m699a(m698c(), abstractC0306f.m698c());
        }
        if (!(obj instanceof AbstractC0306f)) {
            return false;
        }
        AbstractC0306f abstractC0306f2 = this.f582a;
        if (abstractC0306f2 == null) {
            m697a();
            this.f582a = this;
            abstractC0306f2 = this;
        }
        return obj.equals(abstractC0306f2);
    }

    @Override // p031Q0.InterfaceC0305e
    public final int getArity() {
        return this.f588g;
    }

    public final int hashCode() {
        return this.f586e.hashCode() + ((this.f585d.hashCode() + (m698c() == null ? 0 : m698c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        AbstractC0306f abstractC0306f = this.f582a;
        if (abstractC0306f == null) {
            m697a();
            this.f582a = this;
            abstractC0306f = this;
        }
        if (abstractC0306f != this) {
            return abstractC0306f.toString();
        }
        String str = this.f585d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0324d.m723f("function ", str, " (Kotlin reflection is not available)");
    }

    public AbstractC0306f(int i2, Object obj, Class cls, String str, String str2) {
        this.f583b = obj;
        this.f584c = cls;
        this.f585d = str;
        this.f586e = str2;
        this.f587f = false;
        this.f588g = i2;
        this.f589h = 0;
    }
}
