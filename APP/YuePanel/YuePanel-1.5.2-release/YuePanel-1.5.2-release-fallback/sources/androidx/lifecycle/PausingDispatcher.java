package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/PausingDispatcher;", "LYue/ۥ۟ۧۦۨ;", "<init>", "()V", "LYue/ۥ۟ۧۦۥ;", "context", "", "isDispatchNeeded", "(LYue/ۥ۟ۧۦۥ;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LYue/ۥۣۢ۠ۤ;", "dispatch", "(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "Landroidx/lifecycle/DispatchQueue;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public final class PausingDispatcher extends Yue.AbstractC1643 {

    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final androidx.lifecycle.DispatchQueue dispatchQueue;

    public PausingDispatcher() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.DispatchQueue r0 = new androidx.lifecycle.DispatchQueue
            r0.<init>()
            r1.dispatchQueue = r0
            return
    }

    @Override // Yue.AbstractC1643
    public void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4418 java.lang.Runnable r3) {
            r1 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.DispatchQueue r0 = r1.dispatchQueue
            r0.dispatchAndEnqueue(r2, r3)
            return
    }

    @Override // Yue.AbstractC1643
    public boolean isDispatchNeeded(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2) {
            r1 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۥۥ r0 = Yue.C1878.m8793()
            Yue.ۥ۠ۨۥۥ r0 = r0.mo12588()
            boolean r2 = r0.isDispatchNeeded(r2)
            r0 = 1
            if (r2 == 0) goto L15
            return r0
        L15:
            androidx.lifecycle.DispatchQueue r2 = r1.dispatchQueue
            boolean r2 = r2.canRun()
            r2 = r2 ^ r0
            return r2
    }
}
