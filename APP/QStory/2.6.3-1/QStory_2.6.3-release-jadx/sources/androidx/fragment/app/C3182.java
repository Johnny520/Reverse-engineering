package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.RunnableC0946;
import androidx.compose.foundation.lazy.layout.C1520;
import androidx.core.os.C3002;
import androidx.core.view.AbstractC3103;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3182 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f7298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f7299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f7300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f7301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewGroup f7302;

    public C3182(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f7302 = viewGroup;
        this.f7301 = new ArrayList();
        this.f7300 = new ArrayList();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3182 m5027(ViewGroup viewGroup, AbstractC3146 abstractC3146) {
        viewGroup.getClass();
        abstractC3146.getClass();
        abstractC3146.m4942().getClass();
        Object tag = viewGroup.getTag(C0328R.id.special_effects_controller_view_tag);
        if (tag instanceof C3182) {
            return (C3182) tag;
        }
        C3182 c3182 = new C3182(viewGroup);
        viewGroup.setTag(C0328R.id.special_effects_controller_view_tag, c3182);
        return c3182;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5028() {
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f7302;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f7301) {
            try {
                m5033();
                Iterator it = this.f7301.iterator();
                while (it.hasNext()) {
                    ((C3190) it.next()).m5038();
                }
                for (C3190 c3190 : AbstractC5176.m9345(this.f7300)) {
                    if (AbstractC3146.m4922(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f7302 + " is not attached to window. ") + "Cancelling running operation " + c3190);
                    }
                    c3190.m5041();
                }
                for (C3190 c31902 : AbstractC5176.m9345(this.f7301)) {
                    if (AbstractC3146.m4922(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f7302 + " is not attached to window. ") + "Cancelling pending operation " + c31902);
                    }
                    c31902.m5041();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3190 m5029(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        Object next;
        Iterator it = this.f7301.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C3190 c3190 = (C3190) next;
            if (AbstractC5227.m9466(c3190.f7326, abstractComponentCallbacksC3171) && !c3190.f7323) {
                break;
            }
        }
        return (C3190) next;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5030() {
        if (this.f7298) {
            return;
        }
        ViewGroup viewGroup = this.f7302;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        if (!viewGroup.isAttachedToWindow()) {
            m5028();
            this.f7299 = false;
            return;
        }
        synchronized (this.f7301) {
            try {
                if (!this.f7301.isEmpty()) {
                    ArrayList<C3190> arrayListM9345 = AbstractC5176.m9345(this.f7300);
                    this.f7300.clear();
                    for (C3190 c3190 : arrayListM9345) {
                        if (AbstractC3146.m4922(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c3190);
                        }
                        c3190.m5041();
                        if (!c3190.f7330) {
                            this.f7300.add(c3190);
                        }
                    }
                    m5033();
                    ArrayList arrayListM93452 = AbstractC5176.m9345(this.f7301);
                    this.f7301.clear();
                    this.f7300.addAll(arrayListM93452);
                    if (AbstractC3146.m4922(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayListM93452.iterator();
                    while (it.hasNext()) {
                        ((C3190) it.next()).m5038();
                    }
                    m5031(arrayListM93452, this.f7299);
                    this.f7299 = false;
                    if (AbstractC3146.m4922(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5031(ArrayList arrayList, boolean z) {
        Object obj;
        Object next;
        ArrayList arrayList2;
        boolean z2;
        Animator animator;
        boolean z3;
        C3182 c3182 = this;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C3190 c3190 = (C3190) next;
            C3187 c3187 = SpecialEffectsController$Operation$State.Companion;
            View view = c3190.f7326.f7226;
            view.getClass();
            c3187.getClass();
            SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM5035 = C3187.m5035(view);
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.VISIBLE;
            if (specialEffectsController$Operation$StateM5035 == specialEffectsController$Operation$State && c3190.f7328 != specialEffectsController$Operation$State) {
                break;
            }
        }
        C3190 c31902 = (C3190) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            C3190 c31903 = (C3190) objPrevious;
            C3187 c31872 = SpecialEffectsController$Operation$State.Companion;
            View view2 = c31903.f7326.f7226;
            view2.getClass();
            c31872.getClass();
            SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM50352 = C3187.m5035(view2);
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
            if (specialEffectsController$Operation$StateM50352 != specialEffectsController$Operation$State2 && c31903.f7328 == specialEffectsController$Operation$State2) {
                obj = objPrevious;
                break;
            }
        }
        C3190 c31904 = (C3190) obj;
        int i = 2;
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Executing operations from " + c31902 + " to " + c31904);
        }
        ArrayList<C3162> arrayList3 = new ArrayList();
        ArrayList<C3161> arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((C3190) AbstractC5176.m9367(arrayList)).f7326;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C3167 c3167 = ((C3190) it2.next()).f7326.f7262;
            C3167 c31672 = abstractComponentCallbacksC3171.f7262;
            c3167.f7210 = c31672.f7210;
            c3167.f7209 = c31672.f7209;
            c3167.f7208 = c31672.f7208;
            c3167.f7207 = c31672.f7207;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C3190 c31905 = (C3190) it3.next();
            C3002 c3002 = new C3002();
            c31905.m5038();
            LinkedHashSet linkedHashSet = c31905.f7324;
            linkedHashSet.add(c3002);
            arrayList3.add(new C3162(c31905, c3002, z));
            C3002 c30022 = new C3002();
            c31905.m5038();
            linkedHashSet.add(c30022);
            boolean z4 = !z ? c31905 != c31904 : c31905 != c31902;
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = c31905.f7326;
            C3161 c3161 = new C3161(c31905, i, c30022);
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State3 = c31905.f7328;
            int i2 = i;
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State4 = SpecialEffectsController$Operation$State.VISIBLE;
            if (specialEffectsController$Operation$State3 == specialEffectsController$Operation$State4) {
                if (z) {
                    C3167 c31673 = abstractComponentCallbacksC31712.f7262;
                } else {
                    abstractComponentCallbacksC31712.getClass();
                }
            } else if (z) {
                C3167 c31674 = abstractComponentCallbacksC31712.f7262;
            } else {
                abstractComponentCallbacksC31712.getClass();
            }
            if (c31905.f7328 == specialEffectsController$Operation$State4) {
                if (z) {
                    C3167 c31675 = abstractComponentCallbacksC31712.f7262;
                } else {
                    C3167 c31676 = abstractComponentCallbacksC31712.f7262;
                }
            }
            if (z4) {
                if (z) {
                    C3167 c31677 = abstractComponentCallbacksC31712.f7262;
                } else {
                    abstractComponentCallbacksC31712.getClass();
                }
            }
            arrayList4.add(c3161);
            c31905.f7325.add(new RunnableC0946(arrayList5, c31905, c3182));
            i = i2;
        }
        int i3 = i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (!((C3161) obj2).m873()) {
                arrayList6.add(obj2);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            ((C3161) it4.next()).getClass();
        }
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            ((C3161) it5.next()).getClass();
        }
        for (C3161 c31612 : arrayList4) {
            linkedHashMap.put((C3190) c31612.f576, Boolean.FALSE);
            c31612.m866();
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = c3182.f7302;
        Context context = viewGroup.getContext();
        ArrayList<C3162> arrayList8 = new ArrayList();
        boolean z5 = false;
        for (C3162 c3162 : arrayList3) {
            if (c3162.m873()) {
                c3162.m866();
            } else {
                context.getClass();
                C0923 c0923M4985 = c3162.m4985(context);
                if (c0923M4985 == null) {
                    c3162.m866();
                } else {
                    Animator animator2 = (Animator) c0923M4985.f573;
                    if (animator2 == null) {
                        arrayList8.add(c3162);
                    } else {
                        C3190 c31906 = (C3190) c3162.f576;
                        arrayList2 = arrayList8;
                        AbstractComponentCallbacksC3171 abstractComponentCallbacksC31713 = c31906.f7326;
                        z2 = z5;
                        if (AbstractC5227.m9466(linkedHashMap.get(c31906), Boolean.TRUE)) {
                            if (AbstractC3146.m4922(i3)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC31713 + " as this Fragment was involved in a Transition.");
                            }
                            c3162.m866();
                            c3182 = this;
                            arrayList8 = arrayList2;
                            z5 = z2;
                        } else {
                            if (c31906.f7328 == SpecialEffectsController$Operation$State.GONE) {
                                animator = animator2;
                                z3 = true;
                            } else {
                                animator = animator2;
                                z3 = false;
                            }
                            if (z3) {
                                arrayList5.remove(c31906);
                            }
                            View view3 = abstractComponentCallbacksC31713.f7226;
                            viewGroup.startViewTransition(view3);
                            ArrayList arrayList9 = arrayList5;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            Animator animator3 = animator;
                            c3182 = this;
                            animator3.addListener(new C3160(c3182, view3, z3, c31906, c3162));
                            animator3.setTarget(view3);
                            animator3.start();
                            if (AbstractC3146.m4922(i3)) {
                                Log.v("FragmentManager", "Animator from operation " + c31906 + " has started.");
                            }
                            ((C3002) c3162.f577).setOnCancelListener(new C1520(animator3, 1, c31906));
                            linkedHashMap = linkedHashMap2;
                            z5 = true;
                            arrayList8 = arrayList2;
                            arrayList5 = arrayList9;
                        }
                    }
                }
            }
            arrayList2 = arrayList8;
            z2 = z5;
            c3182 = this;
            arrayList8 = arrayList2;
            z5 = z2;
        }
        boolean z6 = z5;
        ArrayList<C3190> arrayList10 = arrayList5;
        for (C3162 c31622 : arrayList8) {
            C3190 c31907 = (C3190) c31622.f576;
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31714 = c31907.f7326;
            if (zContainsValue) {
                if (AbstractC3146.m4922(i3)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC31714 + " as Animations cannot run alongside Transitions.");
                }
                c31622.m866();
            } else if (z6) {
                if (AbstractC3146.m4922(i3)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC31714 + " as Animations cannot run alongside Animators.");
                }
                c31622.m866();
            } else {
                View view4 = abstractComponentCallbacksC31714.f7226;
                context.getClass();
                C0923 c0923M49852 = c31622.m4985(context);
                if (c0923M49852 == null) {
                    C6755.m11870("Required value was null.");
                    return;
                }
                Animation animation = (Animation) c0923M49852.f572;
                if (animation == null) {
                    C6755.m11870("Required value was null.");
                    return;
                }
                if (c31907.f7328 != SpecialEffectsController$Operation$State.REMOVED) {
                    view4.startAnimation(animation);
                    c31622.m866();
                } else {
                    viewGroup.startViewTransition(view4);
                    RunnableC3151 runnableC3151 = new RunnableC3151(animation, viewGroup, view4);
                    runnableC3151.setAnimationListener(new AnimationAnimationListenerC3178(c31907, c3182, view4, c31622));
                    view4.startAnimation(runnableC3151);
                    if (AbstractC3146.m4922(i3)) {
                        Log.v("FragmentManager", "Animation from operation " + c31907 + " has started.");
                    }
                }
                ((C3002) c31622.f577).setOnCancelListener(new C3163(view4, c3182, c31622, c31907));
            }
        }
        for (C3190 c31908 : arrayList10) {
            View view5 = c31908.f7326.f7226;
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State5 = c31908.f7328;
            view5.getClass();
            specialEffectsController$Operation$State5.applyState(view5);
        }
        arrayList10.clear();
        if (AbstractC3146.m4922(i3)) {
            Log.v("FragmentManager", "Completed executing operations from " + c31902 + " to " + c31904);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5032(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, C3137 c3137) {
        synchronized (this.f7301) {
            C3002 c3002 = new C3002();
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3137.f7099;
            abstractComponentCallbacksC3171.getClass();
            C3190 c3190M5029 = m5029(abstractComponentCallbacksC3171);
            if (c3190M5029 != null) {
                c3190M5029.m5039(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact);
                return;
            }
            final C3190 c3190 = new C3190(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact, c3137, c3002);
            this.f7301.add(c3190);
            final int i = 0;
            c3190.f7325.add(new Runnable(this) { // from class: androidx.fragment.app.飘花落叶言子苏楪哲兰世

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C3182 f7335;

                {
                    this.f7335 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    C3190 c31902 = c3190;
                    C3182 c3182 = this.f7335;
                    switch (i2) {
                        case 0:
                            if (c3182.f7301.contains(c31902)) {
                                SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = c31902.f7328;
                                View view = c31902.f7326.f7226;
                                view.getClass();
                                specialEffectsController$Operation$State2.applyState(view);
                            }
                            break;
                        default:
                            c3182.f7301.remove(c31902);
                            c3182.f7300.remove(c31902);
                            break;
                    }
                }
            });
            final int i2 = 1;
            c3190.f7325.add(new Runnable(this) { // from class: androidx.fragment.app.飘花落叶言子苏楪哲兰世

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C3182 f7335;

                {
                    this.f7335 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    C3190 c31902 = c3190;
                    C3182 c3182 = this.f7335;
                    switch (i22) {
                        case 0:
                            if (c3182.f7301.contains(c31902)) {
                                SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = c31902.f7328;
                                View view = c31902.f7326.f7226;
                                view.getClass();
                                specialEffectsController$Operation$State2.applyState(view);
                            }
                            break;
                        default:
                            c3182.f7301.remove(c31902);
                            c3182.f7300.remove(c31902);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5033() {
        for (C3190 c3190 : this.f7301) {
            if (c3190.f7327 == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
                View viewM4994 = c3190.f7326.m4994();
                C3187 c3187 = SpecialEffectsController$Operation$State.Companion;
                int visibility = viewM4994.getVisibility();
                c3187.getClass();
                c3190.m5039(C3187.m5034(visibility), SpecialEffectsController$Operation$LifecycleImpact.NONE);
            }
        }
    }
}
