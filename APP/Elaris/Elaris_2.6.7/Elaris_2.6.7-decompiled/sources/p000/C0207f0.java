package p000;

import android.view.View;
import android.view.ViewGroup;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: f0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0207f0 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0274j0 f243a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0207f0(C0274j0 c0274j0) {
        super(31);
        this.f243a = c0274j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Throwable th;
        C0274j0 c0274j0 = this.f243a;
        if (methodHookParam != null) {
            ViewGroup viewGroup = null;
            try {
                Object obj = methodHookParam.thisObject;
                if (obj == null) {
                    return;
                }
                Object obj2 = c0274j0.f439e.get(obj);
                if (!(obj2 instanceof ViewGroup)) {
                    return;
                }
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                try {
                    boolean zRuntimeBool = HookEntry.runtimeBool(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME);
                    boolean zRuntimeBool2 = HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD);
                    if (!zRuntimeBool && !zRuntimeBool2) {
                        AbstractC0429r0.m837q(viewGroup2);
                        return;
                    }
                    Object[] objArr = methodHookParam.args;
                    Object obj3 = (objArr == null || objArr.length != 1) ? null : objArr[0];
                    if (c0274j0.f435a.isInstance(obj3)) {
                        Object obj4 = c0274j0.f441g.get(obj3);
                        if (c0274j0.f436b.isInstance(obj4) && !c0274j0.f437c.isInstance(obj4)) {
                            Class cls = c0274j0.f438d;
                            int childCount = viewGroup2.getChildCount();
                            int i = 0;
                            ViewGroup viewGroup3 = null;
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = viewGroup2.getChildAt(i2);
                                if (cls.isInstance(childAt)) {
                                    i++;
                                    if (viewGroup3 == null && (childAt instanceof ViewGroup)) {
                                        viewGroup3 = (ViewGroup) childAt;
                                    }
                                }
                            }
                            if (i == 1 && viewGroup3 != null) {
                                C0290k0 c0290k0M829i = AbstractC0429r0.m829i(c0274j0.f442h.invoke(obj4, null), c0274j0);
                                if (c0290k0M829i.m735a()) {
                                    AbstractC0429r0.m838r(AbstractC0429r0.m833m(methodHookParam.thisObject, obj4, viewGroup2, viewGroup3, c0290k0M829i, AbstractC0429r0.m840t(c0290k0M829i, zRuntimeBool2)));
                                    return;
                                } else {
                                    AbstractC0429r0.m837q(viewGroup2);
                                    return;
                                }
                            }
                            AbstractC0429r0.m837q(viewGroup2);
                            return;
                        }
                        AbstractC0429r0.m837q(viewGroup2);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    viewGroup = viewGroup2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            if (viewGroup != null) {
                AbstractC0429r0.m837q(viewGroup);
            }
            AbstractC0198e7.m343a("message-status-row", "bind-qq93-direct", th);
        }
    }
}
