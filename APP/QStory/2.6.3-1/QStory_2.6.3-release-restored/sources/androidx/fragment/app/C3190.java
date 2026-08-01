package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.core.os.C3002;
import androidx.core.os.InterfaceC3003;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.AbstractC5176;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashSet f7324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f7325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractComponentCallbacksC3171 f7326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public SpecialEffectsController$Operation$LifecycleImpact f7327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public SpecialEffectsController$Operation$State f7328;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C3137 f7329;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f7330;

    public C3190(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, C3137 c3137, C3002 c3002) {
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3137.f7099;
        abstractComponentCallbacksC3171.getClass();
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        abstractComponentCallbacksC3171.getClass();
        this.f7328 = specialEffectsController$Operation$State;
        this.f7327 = specialEffectsController$Operation$LifecycleImpact;
        this.f7326 = abstractComponentCallbacksC3171;
        this.f7325 = new ArrayList();
        this.f7324 = new LinkedHashSet();
        c3002.setOnCancelListener(new C3191(this, 0));
        this.f7329 = c3137;
    }

    public final String toString() {
        StringBuilder sbM12144 = AbstractC7012.m12144("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbM12144.append(this.f7328);
        sbM12144.append(" lifecycleImpact = ");
        sbM12144.append(this.f7327);
        sbM12144.append(" fragment = ");
        sbM12144.append(this.f7326);
        sbM12144.append('}');
        return sbM12144.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5038() {
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = this.f7327;
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact2 = SpecialEffectsController$Operation$LifecycleImpact.ADDING;
        C3137 c3137 = this.f7329;
        if (specialEffectsController$Operation$LifecycleImpact != specialEffectsController$Operation$LifecycleImpact2) {
            if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.REMOVING) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3137.f7099;
                abstractComponentCallbacksC3171.getClass();
                View viewM4994 = abstractComponentCallbacksC3171.m4994();
                if (AbstractC3146.m4922(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewM4994.findFocus() + " on view " + viewM4994 + " for Fragment " + abstractComponentCallbacksC3171);
                }
                viewM4994.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = c3137.f7099;
        abstractComponentCallbacksC31712.getClass();
        View viewFindFocus = abstractComponentCallbacksC31712.f7226.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC31712.m5004().f7214 = viewFindFocus;
            if (AbstractC3146.m4922(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC31712);
            }
        }
        View viewM49942 = this.f7326.m4994();
        if (viewM49942.getParent() == null) {
            c3137.m4895();
            viewM49942.setAlpha(0.0f);
        }
        if (viewM49942.getAlpha() == 0.0f && viewM49942.getVisibility() == 0) {
            viewM49942.setVisibility(4);
        }
        C3167 c3167 = abstractComponentCallbacksC31712.f7262;
        viewM49942.setAlpha(c3167 == null ? 1.0f : c3167.f7216);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5039(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact) {
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        int i = AbstractC3185.f7306[specialEffectsController$Operation$LifecycleImpact.ordinal()];
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7326;
        if (i == 1) {
            if (this.f7328 == SpecialEffectsController$Operation$State.REMOVED) {
                if (AbstractC3146.m4922(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC3171 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f7327 + " to ADDING.");
                }
                this.f7328 = SpecialEffectsController$Operation$State.VISIBLE;
                this.f7327 = SpecialEffectsController$Operation$LifecycleImpact.ADDING;
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC3146.m4922(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC3171 + " mFinalState = " + this.f7328 + " -> REMOVED. mLifecycleImpact  = " + this.f7327 + " to REMOVING.");
            }
            this.f7328 = SpecialEffectsController$Operation$State.REMOVED;
            this.f7327 = SpecialEffectsController$Operation$LifecycleImpact.REMOVING;
            return;
        }
        if (i == 3 && this.f7328 != SpecialEffectsController$Operation$State.REMOVED) {
            if (AbstractC3146.m4922(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC3171 + " mFinalState = " + this.f7328 + " -> " + specialEffectsController$Operation$State + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
            this.f7328 = specialEffectsController$Operation$State;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5040() {
        if (!this.f7330) {
            if (AbstractC3146.m4922(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f7330 = true;
            Iterator it = this.f7325.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f7329.m4904();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5041() {
        if (this.f7323) {
            return;
        }
        this.f7323 = true;
        if (this.f7324.isEmpty()) {
            m5040();
            return;
        }
        for (C3002 c3002 : AbstractC5176.m9343(this.f7324)) {
            synchronized (c3002) {
                try {
                    if (!c3002.f6791) {
                        c3002.f6791 = true;
                        c3002.f6789 = true;
                        InterfaceC3003 interfaceC3003 = c3002.f6790;
                        if (interfaceC3003 != null) {
                            try {
                                interfaceC3003.onCancel();
                            } catch (Throwable th) {
                                synchronized (c3002) {
                                    c3002.f6789 = false;
                                    c3002.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c3002) {
                            c3002.f6789 = false;
                            c3002.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }
}
