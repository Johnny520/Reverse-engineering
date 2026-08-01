package p172h3;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: h3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2248h extends C2249i {

    /* JADX INFO: renamed from: a */
    public final Throwable f7391a;

    public C2248h(Throwable th) {
        this.f7391a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2248h) {
            return AbstractC1665j.m2981a(this.f7391a, ((C2248h) obj).f7391a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f7391a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p172h3.C2249i
    public final String toString() {
        return "Closed(" + this.f7391a + ')';
    }
}
