package fun.box001.internal.dexformat.writer.code;

/* JADX INFO: renamed from: k.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0186p extends AbstractC0192v {

    /* JADX INFO: renamed from: a */
    private final C0191u f693a;

    /* JADX INFO: renamed from: b */
    private final C0188r f694b;

    AbstractC0186p(C0191u r1, C0188r r2) {
        if (r1 == null) goto L7;
        this.f693a = r1;
        this.f694b = r2;
        return;
    L7:
        throw new NullPointerException("definingClass == null");
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return this.f693a.mo107a() + '.' + this.f694b.mo107a();
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected int mo426e(AbstractC0171a r3) {
        AbstractC0186p r32 = (AbstractC0186p) r3;
        C0191u r0 = r32.f693a;
        int r02 = this.f693a.m425b(r0);
        if (r02 == 0) goto L6;
        return r02;
    L6:
        return this.f694b.m443h().m425b(r32.f694b.m443h());
    }

    public final boolean equals(Object r4) {
        if (r4 != null) goto L5;
        return false;
    L5:
        if (getClass() != r4.getClass()) goto L16;
        AbstractC0186p r42 = (AbstractC0186p) r4;
        if (this.f693a.equals(r42.f693a) == true) goto L10;
        return false;
    L10:
        if (this.f694b.equals(r42.f694b) == false) goto L15;
        return true;
    L15:
        return false;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final C0191u m440g() {
        return this.f693a;
    }

    /* JADX INFO: renamed from: h */
    public final C0188r m441h() {
        return this.f694b;
    }

    public final int hashCode() {
        return (this.f693a.hashCode() * 31) ^ this.f694b.hashCode();
    }

    public final String toString() {
        return "method{" + mo107a() + '}';
    }
}
