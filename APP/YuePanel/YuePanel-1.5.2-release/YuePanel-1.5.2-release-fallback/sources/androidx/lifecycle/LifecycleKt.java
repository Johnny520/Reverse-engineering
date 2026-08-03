package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/Lifecycle;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LifecycleKt {
    @Yue.InterfaceC4418
    public static final androidx.lifecycle.LifecycleCoroutineScope getCoroutineScope(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
        L5:
            java.util.concurrent.atomic.AtomicReference r0 = r4.getInternalScopeRef()
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) r0
            if (r0 == 0) goto L12
            return r0
        L12:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = new androidx.lifecycle.LifecycleCoroutineScopeImpl
            r1 = 1
            r2 = 0
            Yue.ۥ۟ۦۣ۟ r1 = Yue.C6053.m22764(r2, r1, r2)
            Yue.ۥ۠ۨۥۥ r3 = Yue.C1878.m8793()
            Yue.ۥ۠ۨۥۥ r3 = r3.mo12588()
            Yue.ۥ۟ۧۦۥ r1 = r1.plus(r3)
            r0.<init>(r4, r1)
            java.util.concurrent.atomic.AtomicReference r1 = r4.getInternalScopeRef()
            boolean r1 = Yue.C3587.m14520(r1, r2, r0)
            if (r1 == 0) goto L5
            r0.register()
            return r0
    }
}
