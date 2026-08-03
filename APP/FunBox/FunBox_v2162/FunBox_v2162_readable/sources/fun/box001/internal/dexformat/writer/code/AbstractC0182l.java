package fun.box001.internal.dexformat.writer.code;

/* JADX INFO: renamed from: k.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0182l extends AbstractC0184n {

    /* JADX INFO: renamed from: a */
    private final int f691a;

    AbstractC0182l(int i2) {
        this.f691a = i2;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a abstractC0171a) {
        int i2 = ((AbstractC0182l) abstractC0171a).f691a;
        int i3 = this.f691a;
        if (i3 < i2) {
            return -1;
        }
        return i3 > i2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            if (this.f691a == ((AbstractC0182l) obj).f691a) {
                return true;
            }
        }
        return false;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0184n
    /* JADX INFO: renamed from: g */
    public final boolean mo437g() {
        return true;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0184n
    /* JADX INFO: renamed from: h */
    public final int mo438h() {
        return this.f691a;
    }

    public final int hashCode() {
        return this.f691a;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0184n
    /* JADX INFO: renamed from: i */
    public final long mo439i() {
        return this.f691a;
    }
}
