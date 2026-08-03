package p000;

/* JADX INFO: renamed from: Fn */
/* JADX INFO: loaded from: classes.dex */
public final class C0245Fn {

    /* JADX INFO: renamed from: a */
    public final String f801a;

    public C0245Fn(String str) {
        this.f801a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0245Fn) {
            return this.f801a.equals(((C0245Fn) obj).f801a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f801a.hashCode();
    }

    public final String toString() {
        return AbstractC0213Ey.m410h(new StringBuilder("StringHeaderFactory{value='"), this.f801a, "'}");
    }
}
