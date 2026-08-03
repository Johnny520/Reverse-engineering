package p000;

/* JADX INFO: renamed from: Fn */
/* JADX INFO: loaded from: classes.dex */
public final class C0245Fn {

    /* JADX INFO: renamed from: a */
    public final String f801a;

    public C0245Fn(String r1) {
        this.f801a = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0245Fn) == true) goto L5;
        return false;
    L5:
        return this.f801a.equals(((C0245Fn) r2).f801a);
    }

    public final int hashCode() {
        return this.f801a.hashCode();
    }

    public final String toString() {
        return AbstractC0213Ey.m410h(new StringBuilder("StringHeaderFactory{value='"), this.f801a, "'}");
    }
}
