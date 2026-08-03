package fun.box001.internal.dexformat.writer.code;

/* JADX INFO: renamed from: k.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0183m extends AbstractC0184n {

    /* JADX INFO: renamed from: a */
    private final long f692a;

    AbstractC0183m(long r1) {
        this.f692a = r1;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a r5) {
        long r0 = ((AbstractC0183m) r5).f692a;
        long r2 = this.f692a;
        if (r2 >= r0) goto L7;
        return -1;
    L7:
        if (r2 <= r0) goto L10;
        return 1;
    L10:
        return 0;
    }

    public final boolean equals(Object r5) {
        if (r5 != null) goto L4;
    L8:
        return false;
    L4:
        if (getClass() != r5.getClass()) goto L8;
        long r0 = ((AbstractC0183m) r5).f692a;
        if (this.f692a != r0) goto L8;
        return true;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0184n
    /* JADX INFO: renamed from: g */
    public final boolean mo437g() {
        if (((int) r0) != this.f692a) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0184n
    /* JADX INFO: renamed from: h */
    public final int mo438h() {
        return (int) this.f692a;
    }

    public final int hashCode() {
        long r0 = this.f692a;
        int r2 = (int) r0;
        return ((int) (r0 >> 32)) ^ r2;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0184n
    /* JADX INFO: renamed from: i */
    public final long mo439i() {
        return this.f692a;
    }
}
