package p010k;

/* JADX INFO: renamed from: k.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0183m extends AbstractC0184n {

    /* JADX INFO: renamed from: a */
    private final long f692a;

    AbstractC0183m(long j2) {
        this.f692a = j2;
    }

    @Override // p010k.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a abstractC0171a) {
        long j2 = ((AbstractC0183m) abstractC0171a).f692a;
        long j3 = this.f692a;
        if (j3 < j2) {
            return -1;
        }
        return j3 > j2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            if (this.f692a == ((AbstractC0183m) obj).f692a) {
                return true;
            }
        }
        return false;
    }

    @Override // p010k.AbstractC0184n
    /* JADX INFO: renamed from: g */
    public final boolean mo437g() {
        long j2 = this.f692a;
        return ((long) ((int) j2)) == j2;
    }

    @Override // p010k.AbstractC0184n
    /* JADX INFO: renamed from: h */
    public final int mo438h() {
        return (int) this.f692a;
    }

    public final int hashCode() {
        long j2 = this.f692a;
        return ((int) (j2 >> 32)) ^ ((int) j2);
    }

    @Override // p010k.AbstractC0184n
    /* JADX INFO: renamed from: i */
    public final long mo439i() {
        return this.f692a;
    }
}
