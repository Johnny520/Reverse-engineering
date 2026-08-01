package p107V1;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: V1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1511j {

    /* JADX INFO: renamed from: a */
    public final String f5258a;

    public C1511j(String str) {
        this.f5258a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1511j) {
            return this.f5258a.equals(((C1511j) obj).f5258a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5258a.hashCode();
    }

    public final String toString() {
        return AbstractC0231b.m403n(new StringBuilder("StringHeaderFactory{value='"), this.f5258a, "'}");
    }
}
