package p092S0;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: S0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1254G implements InterfaceC1264b {

    /* JADX INFO: renamed from: a */
    public final String f4513a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1254G) {
            return AbstractC1665j.m2981a(this.f4513a, ((C1254G) obj).f4513a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4513a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f4513a + ')';
    }
}
