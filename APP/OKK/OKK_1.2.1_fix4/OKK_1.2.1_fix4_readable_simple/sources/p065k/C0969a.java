package p065k;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0969a {

    /* JADX INFO: renamed from: b */
    public static final C0969a f3440b = null;

    /* JADX INFO: renamed from: c */
    public static final C0969a f3441c = null;

    /* JADX INFO: renamed from: a */
    public final Throwable f3442a;

    static {
        if (AbstractFutureC0975g.f3453d == false) goto L5;
        f3441c = null;
        f3440b = null;
        return;
    L5:
        f3441c = new C0969a(false, null);
        f3440b = new C0969a(true, null);
    }

    public C0969a(boolean r1, CancellationException r2) {
        this.f3442a = r2;
    }
}
