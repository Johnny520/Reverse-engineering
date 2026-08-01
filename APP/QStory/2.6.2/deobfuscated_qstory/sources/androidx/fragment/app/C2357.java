package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.core.os.C2169;
import androidx.core.os.InterfaceC2170;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.AbstractC4343;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2357 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f6977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashSet f6978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f6979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 f6980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public SpecialEffectsController$Operation$LifecycleImpact f6981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public SpecialEffectsController$Operation$State f6982;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2304 f6983;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6984;

    public C2357(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, C2304 c2304, C2169 c2169) {
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6753;
        abstractComponentCallbacksC2338.getClass();
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        abstractComponentCallbacksC2338.getClass();
        this.f6982 = specialEffectsController$Operation$State;
        this.f6981 = specialEffectsController$Operation$LifecycleImpact;
        this.f6980 = abstractComponentCallbacksC2338;
        this.f6979 = new ArrayList();
        this.f6978 = new LinkedHashSet();
        c2169.setOnCancelListener(new C2358(this, 0));
        this.f6983 = c2304;
    }

    public final String toString() {
        StringBuilder sbM11550 = AbstractC6136.m11550("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbM11550.append(this.f6982);
        sbM11550.append(" lifecycleImpact = ");
        sbM11550.append(this.f6981);
        sbM11550.append(" fragment = ");
        sbM11550.append(this.f6980);
        sbM11550.append('}');
        return sbM11550.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4468() {
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = this.f6981;
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact2 = SpecialEffectsController$Operation$LifecycleImpact.ADDING;
        C2304 c2304 = this.f6983;
        if (specialEffectsController$Operation$LifecycleImpact != specialEffectsController$Operation$LifecycleImpact2) {
            if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.REMOVING) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6753;
                abstractComponentCallbacksC2338.getClass();
                View viewM4424 = abstractComponentCallbacksC2338.m4424();
                if (AbstractC2313.m4352(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewM4424.findFocus() + " on view " + viewM4424 + " for Fragment " + abstractComponentCallbacksC2338);
                }
                viewM4424.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6753;
        abstractComponentCallbacksC23382.getClass();
        View viewFindFocus = abstractComponentCallbacksC23382.f6880.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC23382.m4434().f6868 = viewFindFocus;
            if (AbstractC2313.m4352(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC23382);
            }
        }
        View viewM44242 = this.f6980.m4424();
        if (viewM44242.getParent() == null) {
            c2304.m4325();
            viewM44242.setAlpha(0.0f);
        }
        if (viewM44242.getAlpha() == 0.0f && viewM44242.getVisibility() == 0) {
            viewM44242.setVisibility(4);
        }
        C2334 c2334 = abstractComponentCallbacksC23382.f6916;
        viewM44242.setAlpha(c2334 == null ? 1.0f : c2334.f6870);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4469(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact) {
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        int i = AbstractC2352.f6960[specialEffectsController$Operation$LifecycleImpact.ordinal()];
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6980;
        if (i == 1) {
            if (this.f6982 == SpecialEffectsController$Operation$State.REMOVED) {
                if (AbstractC2313.m4352(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2338 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f6981 + " to ADDING.");
                }
                this.f6982 = SpecialEffectsController$Operation$State.VISIBLE;
                this.f6981 = SpecialEffectsController$Operation$LifecycleImpact.ADDING;
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC2313.m4352(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2338 + " mFinalState = " + this.f6982 + " -> REMOVED. mLifecycleImpact  = " + this.f6981 + " to REMOVING.");
            }
            this.f6982 = SpecialEffectsController$Operation$State.REMOVED;
            this.f6981 = SpecialEffectsController$Operation$LifecycleImpact.REMOVING;
            return;
        }
        if (i == 3 && this.f6982 != SpecialEffectsController$Operation$State.REMOVED) {
            if (AbstractC2313.m4352(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2338 + " mFinalState = " + this.f6982 + " -> " + specialEffectsController$Operation$State + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
            this.f6982 = specialEffectsController$Operation$State;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4470() {
        if (!this.f6984) {
            if (AbstractC2313.m4352(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f6984 = true;
            Iterator it = this.f6979.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f6983.m4334();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4471() {
        if (this.f6977) {
            return;
        }
        this.f6977 = true;
        if (this.f6978.isEmpty()) {
            m4470();
            return;
        }
        for (C2169 c2169 : AbstractC4343.m8801(this.f6978)) {
            synchronized (c2169) {
                try {
                    if (!c2169.f6445) {
                        c2169.f6445 = true;
                        c2169.f6443 = true;
                        InterfaceC2170 interfaceC2170 = c2169.f6444;
                        if (interfaceC2170 != null) {
                            try {
                                interfaceC2170.onCancel();
                            } catch (Throwable th) {
                                synchronized (c2169) {
                                    c2169.f6443 = false;
                                    c2169.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c2169) {
                            c2169.f6443 = false;
                            c2169.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }
}
