package p172;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.RunnableC0946;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.Violation;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8452 f20997 = C8452.f20998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m13412(C8452 c8452, Class cls, Class cls2) {
        Set set = (Set) c8452.f20999.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC5227.m9466(cls2.getSuperclass(), Violation.class) || !AbstractC5176.m9365(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m13413(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, String str) {
        abstractComponentCallbacksC3171.getClass();
        str.getClass();
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(abstractComponentCallbacksC3171, str);
        m13414(fragmentReuseViolation);
        C8452 c8452M13416 = m13416(abstractComponentCallbacksC3171);
        if (c8452M13416.f21000.contains(FragmentStrictMode$Flag.DETECT_FRAGMENT_REUSE) && m13412(c8452M13416, abstractComponentCallbacksC3171.getClass(), FragmentReuseViolation.class)) {
            m13415(c8452M13416, fragmentReuseViolation);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m13414(Violation violation) {
        if (AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.getFragment().getClass().getName()), violation);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13415(C8452 c8452, Violation violation) {
        AbstractComponentCallbacksC3171 fragment = violation.getFragment();
        String name = fragment.getClass().getName();
        Set set = c8452.f21000;
        if (set.contains(FragmentStrictMode$Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(FragmentStrictMode$Flag.PENALTY_DEATH)) {
            RunnableC0946 runnableC0946 = new RunnableC0946(name, 20, violation);
            if (!fragment.m5020()) {
                runnableC0946.run();
                throw null;
            }
            Handler handler = fragment.m5019().f7136.f7164;
            handler.getClass();
            if (AbstractC5227.m9466(handler.getLooper(), Looper.myLooper())) {
                runnableC0946.run();
                throw null;
            }
            handler.post(runnableC0946);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8452 m13416(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        while (abstractComponentCallbacksC3171 != null) {
            if (abstractComponentCallbacksC3171.m5020()) {
                abstractComponentCallbacksC3171.m5019();
            }
            abstractComponentCallbacksC3171 = abstractComponentCallbacksC3171.f7240;
        }
        return f20997;
    }
}
