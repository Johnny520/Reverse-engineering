package p000a;

import top.mmjz.floatingclouds.XposedEntry;

/* JADX INFO: renamed from: a.zh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0962zh implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3593a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ XposedEntry f3594b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0173J8 f3595c;

    public /* synthetic */ RunnableC0962zh(XposedEntry xposedEntry, C0173J8 c0173j8, int i) {
        this.f3593a = i;
        this.f3594b = xposedEntry;
        this.f3595c = c0173j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3593a) {
            case 0:
                XposedEntry.initWeChatHooks$doInit$lambda$1(this.f3594b, this.f3595c);
                break;
            default:
                XposedEntry.initPlugins$lambda$12(this.f3594b, this.f3595c);
                break;
        }
    }
}
