package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.core.os.C2169;
import androidx.core.os.InterfaceC2170;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.AbstractC4344;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2357 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f6978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashSet f6979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f6980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 f6981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public SpecialEffectsController$Operation$LifecycleImpact f6982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public SpecialEffectsController$Operation$State f6983;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2304 f6984;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6985;

    public C2357(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, C2304 c2304, C2169 c2169) {
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6754;
        abstractComponentCallbacksC2338.getClass();
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        abstractComponentCallbacksC2338.getClass();
        this.f6983 = specialEffectsController$Operation$State;
        this.f6982 = specialEffectsController$Operation$LifecycleImpact;
        this.f6981 = abstractComponentCallbacksC2338;
        this.f6980 = new ArrayList();
        this.f6979 = new LinkedHashSet();
        c2169.setOnCancelListener(new C2358(this, 0));
        this.f6984 = c2304;
    }

    public final String toString() {
        StringBuilder sbM11585 = AbstractC6183.m11585("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbM11585.append(this.f6983);
        sbM11585.append(" lifecycleImpact = ");
        sbM11585.append(this.f6982);
        sbM11585.append(" fragment = ");
        sbM11585.append(this.f6981);
        sbM11585.append('}');
        return sbM11585.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4478() {
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = this.f6982;
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact2 = SpecialEffectsController$Operation$LifecycleImpact.ADDING;
        C2304 c2304 = this.f6984;
        if (specialEffectsController$Operation$LifecycleImpact != specialEffectsController$Operation$LifecycleImpact2) {
            if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.REMOVING) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6754;
                abstractComponentCallbacksC2338.getClass();
                View viewM4434 = abstractComponentCallbacksC2338.m4434();
                if (AbstractC2313.m4362(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewM4434.findFocus() + " on view " + viewM4434 + " for Fragment " + abstractComponentCallbacksC2338);
                }
                viewM4434.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6754;
        abstractComponentCallbacksC23382.getClass();
        View viewFindFocus = abstractComponentCallbacksC23382.f6881.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC23382.m4444().f6869 = viewFindFocus;
            if (AbstractC2313.m4362(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC23382);
            }
        }
        View viewM44342 = this.f6981.m4434();
        if (viewM44342.getParent() == null) {
            c2304.m4335();
            viewM44342.setAlpha(0.0f);
        }
        if (viewM44342.getAlpha() == 0.0f && viewM44342.getVisibility() == 0) {
            viewM44342.setVisibility(4);
        }
        C2334 c2334 = abstractComponentCallbacksC23382.f6917;
        viewM44342.setAlpha(c2334 == null ? 1.0f : c2334.f6871);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4479(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact) {
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        int i = AbstractC2352.f6961[specialEffectsController$Operation$LifecycleImpact.ordinal()];
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6981;
        if (i == 1) {
            if (this.f6983 == SpecialEffectsController$Operation$State.REMOVED) {
                if (AbstractC2313.m4362(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2338 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f6982 + " to ADDING.");
                }
                this.f6983 = SpecialEffectsController$Operation$State.VISIBLE;
                this.f6982 = SpecialEffectsController$Operation$LifecycleImpact.ADDING;
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC2313.m4362(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2338 + " mFinalState = " + this.f6983 + " -> REMOVED. mLifecycleImpact  = " + this.f6982 + " to REMOVING.");
            }
            this.f6983 = SpecialEffectsController$Operation$State.REMOVED;
            this.f6982 = SpecialEffectsController$Operation$LifecycleImpact.REMOVING;
            return;
        }
        if (i == 3 && this.f6983 != SpecialEffectsController$Operation$State.REMOVED) {
            if (AbstractC2313.m4362(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2338 + " mFinalState = " + this.f6983 + " -> " + specialEffectsController$Operation$State + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
            this.f6983 = specialEffectsController$Operation$State;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4480() {
        if (!this.f6985) {
            if (AbstractC2313.m4362(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f6985 = true;
            Iterator it = this.f6980.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f6984.m4344();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4481() {
        if (this.f6978) {
            return;
        }
        this.f6978 = true;
        if (this.f6979.isEmpty()) {
            m4480();
            return;
        }
        for (C2169 c2169 : AbstractC4344.m8784(this.f6979)) {
            synchronized (c2169) {
                try {
                    if (!c2169.f6446) {
                        c2169.f6446 = true;
                        c2169.f6444 = true;
                        InterfaceC2170 interfaceC2170 = c2169.f6445;
                        if (interfaceC2170 != null) {
                            try {
                                interfaceC2170.onCancel();
                            } catch (Throwable th) {
                                synchronized (c2169) {
                                    c2169.f6444 = false;
                                    c2169.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c2169) {
                            c2169.f6444 = false;
                            c2169.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }
}
