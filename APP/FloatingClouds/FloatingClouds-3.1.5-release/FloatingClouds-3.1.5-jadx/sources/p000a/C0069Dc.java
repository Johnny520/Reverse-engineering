package p000a;

/* JADX INFO: renamed from: a.Dc */
/* JADX INFO: loaded from: classes.dex */
public final class C0069Dc<T> extends C0051Cc {

    /* JADX INFO: renamed from: d */
    public final Object f238d;

    public C0069Dc() {
        super(12);
        this.f238d = new Object();
    }

    @Override // p000a.C0051Cc
    /* JADX INFO: renamed from: a */
    public final T mo128a() {
        T t;
        synchronized (this.f238d) {
            t = (T) super.mo128a();
        }
        return t;
    }

    @Override // p000a.C0051Cc
    /* JADX INFO: renamed from: c */
    public final boolean mo130c(T t) {
        boolean zMo130c;
        synchronized (this.f238d) {
            zMo130c = super.mo130c(t);
        }
        return zMo130c;
    }
}
