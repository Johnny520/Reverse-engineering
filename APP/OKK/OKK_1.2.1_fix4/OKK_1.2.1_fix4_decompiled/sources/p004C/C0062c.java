package p004C;

/* JADX INFO: renamed from: C.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0062c extends C0061b {

    /* JADX INFO: renamed from: d */
    public final Object f208d;

    public C0062c() {
        super(12);
        this.f208d = new Object();
    }

    @Override // p004C.C0061b
    /* JADX INFO: renamed from: a */
    public final Object mo198a() {
        Object objMo198a;
        synchronized (this.f208d) {
            objMo198a = super.mo198a();
        }
        return objMo198a;
    }

    @Override // p004C.C0061b
    /* JADX INFO: renamed from: c */
    public final boolean mo200c(Object obj) {
        boolean zMo200c;
        synchronized (this.f208d) {
            zMo200c = super.mo200c(obj);
        }
        return zMo200c;
    }
}
