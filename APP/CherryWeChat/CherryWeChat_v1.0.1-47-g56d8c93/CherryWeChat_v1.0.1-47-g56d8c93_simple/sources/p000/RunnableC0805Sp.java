package p000;

import io.github.cherrywechat.lua.LuaUiScheduler;

/* JADX INFO: renamed from: Sp */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0805Sp implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2526a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0884Ui f2527b;

    public /* synthetic */ RunnableC0805Sp(int r1, InterfaceC0884Ui r2) {
        this.f2526a = r1;
        this.f2527b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f2526a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        LuaUiScheduler.m2985b(this.f2527b);
        return;
    L6:
        LuaUiScheduler.m2986c(this.f2527b);
    }
}
