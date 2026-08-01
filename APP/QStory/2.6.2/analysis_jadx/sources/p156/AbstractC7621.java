package p156;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.RunnableC0099;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.Violation;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7622 f20657 = C7622.f20658;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m12824(C7622 c7622, Class cls, Class cls2) {
        Set set = (Set) c7622.f20659.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC4394.m8917(cls2.getSuperclass(), Violation.class) || !AbstractC4343.m8789(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m12825(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, String str) {
        abstractComponentCallbacksC2338.getClass();
        str.getClass();
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(abstractComponentCallbacksC2338, str);
        m12826(fragmentReuseViolation);
        C7622 c7622M12828 = m12828(abstractComponentCallbacksC2338);
        if (c7622M12828.f20660.contains(FragmentStrictMode$Flag.DETECT_FRAGMENT_REUSE) && m12824(c7622M12828, abstractComponentCallbacksC2338.getClass(), FragmentReuseViolation.class)) {
            m12827(c7622M12828, fragmentReuseViolation);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m12826(Violation violation) {
        if (AbstractC2313.m4352(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.getFragment().getClass().getName()), violation);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12827(C7622 c7622, Violation violation) {
        AbstractComponentCallbacksC2338 fragment = violation.getFragment();
        String name = fragment.getClass().getName();
        Set set = c7622.f20660;
        if (set.contains(FragmentStrictMode$Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(FragmentStrictMode$Flag.PENALTY_DEATH)) {
            RunnableC0099 runnableC0099 = new RunnableC0099(name, 20, violation);
            if (!fragment.m4450()) {
                runnableC0099.run();
                throw null;
            }
            Handler handler = fragment.m4449().f6790.f6816;
            handler.getClass();
            if (AbstractC4394.m8917(handler.getLooper(), Looper.myLooper())) {
                runnableC0099.run();
                throw null;
            }
            handler.post(runnableC0099);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7622 m12828(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        while (abstractComponentCallbacksC2338 != null) {
            if (abstractComponentCallbacksC2338.m4450()) {
                abstractComponentCallbacksC2338.m4449();
            }
            abstractComponentCallbacksC2338 = abstractComponentCallbacksC2338.f6894;
        }
        return f20657;
    }
}
