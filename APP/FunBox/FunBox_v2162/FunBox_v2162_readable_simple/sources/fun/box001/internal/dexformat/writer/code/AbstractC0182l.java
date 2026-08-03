package fun.box001.internal.dexformat.writer.code;

/* JADX INFO: renamed from: k.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0182l extends AbstractC0184n {

    /* JADX INFO: renamed from: a */
    private final int f691a;

    AbstractC0182l(int r1) {
        this.f691a = r1;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a r2) {
        int r22 = ((AbstractC0182l) r2).f691a;
        int r0 = this.f691a;
        if (r0 >= r22) goto L6;
        return -1;
    L6:
        if (r0 <= r22) goto L9;
        return 1;
    L9:
        return 0;
    }

    public final boolean equals(Object r3) {
        if (r3 != null) goto L4;
    L8:
        return false;
    L4:
        if (getClass() != r3.getClass()) goto L8;
        int r32 = ((AbstractC0182l) r3).f691a;
        if (this.f691a != r32) goto L8;
        return true;
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
