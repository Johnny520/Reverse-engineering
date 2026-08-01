package p275z2;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: z2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3516b {

    /* JADX INFO: renamed from: a */
    public final Class f10961a;

    /* JADX INFO: renamed from: b */
    public final Object f10962b;

    /* JADX INFO: renamed from: c */
    public boolean f10963c = false;

    public C3516b(Class cls, Object obj) {
        this.f10961a = cls;
        this.f10962b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3516b)) {
            return false;
        }
        C3516b c3516b = (C3516b) obj;
        return AbstractC1665j.m2981a(this.f10961a, c3516b.f10961a) && AbstractC1665j.m2981a(this.f10962b, c3516b.f10962b) && this.f10963c == c3516b.f10963c;
    }

    public final int hashCode() {
        int iHashCode = this.f10961a.hashCode() * 31;
        Object obj = this.f10962b;
        return EnumC3515a.f10959d.hashCode() + AbstractC0231b.m395f((iHashCode + (obj == null ? 0 : obj.hashCode())) * 961, 31, this.f10963c);
    }

    public final String toString() {
        return "Configuration(declaringClass=" + this.f10961a + ", memberInstance=" + this.f10962b + ", processorResolver=null, superclass=" + this.f10963c + ", optional=" + EnumC3515a.f10959d + ")";
    }
}
