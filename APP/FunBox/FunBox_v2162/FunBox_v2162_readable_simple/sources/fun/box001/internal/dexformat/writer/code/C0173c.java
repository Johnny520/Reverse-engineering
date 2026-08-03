package fun.box001.internal.dexformat.writer.code;

/* JADX INFO: renamed from: k.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0173c extends AbstractC0171a {

    /* JADX INFO: renamed from: a */
    private final C0172b f684a;

    public C0173c(C0172b r1) {
        r1.m538i();
        this.f684a = r1;
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return this.f684a.m505C("{", "}");
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a r2) {
        C0172b r22 = ((C0173c) r2).f684a;
        return this.f684a.m428F(r22);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0173c) == true) goto L6;
        return false;
    L6:
        C0172b r22 = ((C0173c) r2).f684a;
        return this.f684a.equals(r22);
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
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
