package fun.box001.internal.dexformat.writer.code;

/* JADX INFO: renamed from: k.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0186p extends AbstractC0192v {

    /* JADX INFO: renamed from: a */
    private final C0191u f693a;

    /* JADX INFO: renamed from: b */
    private final C0188r f694b;

    AbstractC0186p(C0191u c0191u, C0188r c0188r) {
        if (c0191u == null) {
            throw new NullPointerException("definingClass == null");
        }
        this.f693a = c0191u;
        this.f694b = c0188r;
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return this.f693a.mo107a() + '.' + this.f694b.mo107a();
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected int mo426e(AbstractC0171a abstractC0171a) {
        AbstractC0186p abstractC0186p = (AbstractC0186p) abstractC0171a;
        int iCompareTo = this.f693a.compareTo(abstractC0186p.f693a);
        return iCompareTo != 0 ? iCompareTo : this.f694b.m443h().compareTo(abstractC0186p.f694b.m443h());
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0186p abstractC0186p = (AbstractC0186p) obj;
        return this.f693a.equals(abstractC0186p.f693a) && this.f694b.equals(abstractC0186p.f694b);
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
