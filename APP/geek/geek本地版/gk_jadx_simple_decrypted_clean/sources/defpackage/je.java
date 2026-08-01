package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class je implements fe {
    public final cq a;
    public final fe b;

    /* JADX WARN: Multi-variable type inference failed */
    public je(fe r2, sm r3) {
        ip.o("baseKey", r2);
        this.a = (cq) r3;
        if ((r2 instanceof je) == false) goto L5;
        r2 = ((je) r2).b;
    L5:
        this.b = r2;
    }
}
