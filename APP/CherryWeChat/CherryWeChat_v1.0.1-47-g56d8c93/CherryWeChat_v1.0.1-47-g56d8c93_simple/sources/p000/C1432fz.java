package p000;

/* JADX INFO: renamed from: fz */
/* JADX INFO: loaded from: classes.dex */
public final class C1432fz {

    /* JADX INFO: renamed from: a */
    public volatile boolean f5035a;

    /* JADX INFO: renamed from: a */
    public final void m2744a() {
        if (this.f5035a == true) goto L6;
        return;
    L6:
        throw new IllegalStateException("Already released");
    }
}
