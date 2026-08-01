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
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7622 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7623 f20652 = C7623.f20653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m12853(C7623 c7623, Class cls, Class cls2) {
        Set set = (Set) c7623.f20654.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC4395.m8907(cls2.getSuperclass(), Violation.class) || !AbstractC4344.m8806(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m12854(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, String str) {
        abstractComponentCallbacksC2338.getClass();
        str.getClass();
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(abstractComponentCallbacksC2338, str);
        m12855(fragmentReuseViolation);
        C7623 c7623M12857 = m12857(abstractComponentCallbacksC2338);
        if (c7623M12857.f20655.contains(FragmentStrictMode$Flag.DETECT_FRAGMENT_REUSE) && m12853(c7623M12857, abstractComponentCallbacksC2338.getClass(), FragmentReuseViolation.class)) {
            m12856(c7623M12857, fragmentReuseViolation);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m12855(Violation violation) {
        if (AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.getFragment().getClass().getName()), violation);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12856(C7623 c7623, Violation violation) {
        AbstractComponentCallbacksC2338 fragment = violation.getFragment();
        String name = fragment.getClass().getName();
        Set set = c7623.f20655;
        if (set.contains(FragmentStrictMode$Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(FragmentStrictMode$Flag.PENALTY_DEATH)) {
            RunnableC0099 runnableC0099 = new RunnableC0099(name, 20, violation);
            if (!fragment.m4460()) {
                runnableC0099.run();
                throw null;
            }
            Handler handler = fragment.m4459().f6791.f6819;
            handler.getClass();
            if (AbstractC4395.m8907(handler.getLooper(), Looper.myLooper())) {
                runnableC0099.run();
                throw null;
            }
            handler.post(runnableC0099);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7623 m12857(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        while (abstractComponentCallbacksC2338 != null) {
            if (abstractComponentCallbacksC2338.m4460()) {
                abstractComponentCallbacksC2338.m4459();
            }
            abstractComponentCallbacksC2338 = abstractComponentCallbacksC2338.f6895;
        }
        return f20652;
    }
}
