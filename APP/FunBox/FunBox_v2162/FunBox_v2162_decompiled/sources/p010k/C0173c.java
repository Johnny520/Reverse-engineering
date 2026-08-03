package p010k;

/* JADX INFO: renamed from: k.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0173c extends AbstractC0171a {

    /* JADX INFO: renamed from: a */
    private final C0172b f684a;

    public C0173c(C0172b c0172b) {
        c0172b.m538i();
        this.f684a = c0172b;
    }

    @Override // p013n.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return this.f684a.m505C("{", "}");
    }

    @Override // p010k.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a abstractC0171a) {
        return this.f684a.compareTo(((C0173c) abstractC0171a).f684a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0173c)) {
            return false;
        }
        return this.f684a.equals(((C0173c) obj).f684a);
    }

    @Override // p010k.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "array";
    }

    /* JADX INFO: renamed from: g */
    public final C0172b m429g() {
        return this.f684a;
    }

    public final int hashCode() {
        return this.f684a.hashCode();
    }

    public final String toString() {
        return this.f684a.m506D();
    }
}
