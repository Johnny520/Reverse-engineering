package android.view;

import Yue.C4423;
import Yue.C5499;
import Yue.C5696;
import Yue.C7679;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m2699d2 = {"coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/Lifecycle;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycle-common"}, m2700k = 2, m2701mv = {1, 8, 0}, m2703xi = 48)
public final class LifecycleKt {
    @InterfaceC6399
    public static final LifecycleCoroutineScope getCoroutineScope(@InterfaceC6399 Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C5499.m17103(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, C7679.m24447(null, 1, null).plus(C4423.m12872().mo16039()));
        } while (!C5696.m2374(lifecycle.getInternalScopeRef(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }
}
