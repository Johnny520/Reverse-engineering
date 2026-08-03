package android.view;

import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m2699d2 = {"lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleScope", "(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycle-common"}, m2700k = 2, m2701mv = {1, 8, 0}, m2703xi = 48)
public final class LifecycleOwnerKt {
    @InterfaceC6399
    public static final LifecycleCoroutineScope getLifecycleScope(@InterfaceC6399 LifecycleOwner lifecycleOwner) {
        C5499.m17103(lifecycleOwner, "<this>");
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
