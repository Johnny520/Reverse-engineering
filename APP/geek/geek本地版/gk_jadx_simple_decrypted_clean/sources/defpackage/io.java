package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class io extends cq implements sm {
    public final /* synthetic */ jo b;
    public final /* synthetic */ h1 c;

    public io(jo r1, h1 r2) {
        this.b = r1;
        this.c = r2;
        super(1);
    }

    @Override // defpackage.sm
    public final Object f(Object r2) {
        Throwable r22 = (Throwable) r2;
        this.b.c.removeCallbacks(this.c);
        return vh.n;
    }
}
