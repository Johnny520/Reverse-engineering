package p244u;

import p041H0.AbstractC0582a0;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.K */
/* JADX INFO: loaded from: classes.dex */
final class C3242K extends AbstractC0582a0 {
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3243L c3243l = new C3243L();
        c3243l.f10042r = EnumC3241J.f10040e;
        c3243l.f10043s = true;
        return c3243l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3242K ? (C3242K) obj : null) != null;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3243L c3243l = (C3243L) abstractC2206o;
        c3243l.f10042r = EnumC3241J.f10040e;
        c3243l.f10043s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (EnumC3241J.f10040e.hashCode() * 31);
    }
}
