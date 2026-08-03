package fun.box001.internal.dexformat.writer.code;

/* JADX INFO: renamed from: k.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0188r extends AbstractC0171a {

    /* JADX INFO: renamed from: a */
    private final C0190t f695a;

    /* JADX INFO: renamed from: b */
    private final C0190t f696b;

    static {
        new C0188r(new C0190t("TYPE"), new C0190t("Ljava/lang/Class;"));
    }

    public C0188r(C0190t c0190t, C0190t c0190t2) {
        this.f695a = c0190t;
        this.f696b = c0190t2;
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return this.f695a.mo107a() + ':' + this.f696b.mo107a();
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a abstractC0171a) {
        C0188r c0188r = (C0188r) abstractC0171a;
        int iCompareTo = this.f695a.compareTo(c0188r.f695a);
        return iCompareTo != 0 ? iCompareTo : this.f696b.compareTo(c0188r.f696b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0188r)) {
            return false;
        }
        C0188r c0188r = (C0188r) obj;
        return this.f695a.equals(c0188r.f695a) && this.f696b.equals(c0188r.f696b);
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "nat";
    }

    /* JADX INFO: renamed from: g */
    public final C0190t m442g() {
        return this.f696b;
    }

    /* JADX INFO: renamed from: h */
    public final C0190t m443h() {
        return this.f695a;
    }

    public final int hashCode() {
        return (this.f695a.hashCode() * 31) ^ this.f696b.hashCode();
    }

    public final String toString() {
        return "nat{" + mo107a() + '}';
    }
}
