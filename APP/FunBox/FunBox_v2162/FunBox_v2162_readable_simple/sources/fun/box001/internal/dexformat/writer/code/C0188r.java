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

    public C0188r(C0190t r1, C0190t r2) {
        this.f695a = r1;
        this.f696b = r2;
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return this.f695a.mo107a() + ':' + this.f696b.mo107a();
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a r3) {
        C0188r r32 = (C0188r) r3;
        C0190t r0 = r32.f695a;
        int r02 = this.f695a.m425b(r0);
        if (r02 == 0) goto L6;
        return r02;
    L6:
        return this.f696b.m425b(r32.f696b);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C0188r) == true) goto L5;
        return false;
    L5:
        C0188r r42 = (C0188r) r4;
        C0190t r0 = r42.f695a;
        if (this.f695a.equals(r0) == true) goto L8;
        return false;
    L8:
        if (this.f696b.equals(r42.f696b) == false) goto L12;
        return true;
    L12:
        return false;
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
