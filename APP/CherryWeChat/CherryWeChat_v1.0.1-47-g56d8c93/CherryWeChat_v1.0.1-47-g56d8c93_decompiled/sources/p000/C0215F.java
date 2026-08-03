package p000;

/* JADX INFO: renamed from: F */
/* JADX INFO: loaded from: classes.dex */
public final class C0215F {

    /* JADX INFO: renamed from: b */
    public static final C0215F f632b;

    /* JADX INFO: renamed from: c */
    public static final C0215F f633c;

    /* JADX INFO: renamed from: a */
    public final Throwable f634a;

    static {
        if (AbstractFutureC0473L.f1563d) {
            f633c = null;
            f632b = null;
        } else {
            f633c = new C0215F(null, false);
            f632b = new C0215F(null, true);
        }
    }

    public C0215F(Throwable th, boolean z) {
        this.f634a = th;
    }
}
