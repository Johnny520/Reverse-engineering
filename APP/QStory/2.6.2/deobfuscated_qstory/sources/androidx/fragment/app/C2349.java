package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.RunnableC0099;
import androidx.compose.foundation.lazy.layout.C0679;
import androidx.core.os.C2169;
import androidx.core.view.AbstractC2270;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2349 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f6952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f6953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f6954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f6955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewGroup f6956;

    public C2349(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f6956 = viewGroup;
        this.f6955 = new ArrayList();
        this.f6954 = new ArrayList();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2349 m4457(ViewGroup viewGroup, AbstractC2313 abstractC2313) {
        viewGroup.getClass();
        abstractC2313.getClass();
        abstractC2313.m4372().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C2349) {
            return (C2349) tag;
        }
        C2349 c2349 = new C2349(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c2349);
        return c2349;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4458() {
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f6956;
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f6955) {
            try {
                m4463();
                Iterator it = this.f6955.iterator();
                while (it.hasNext()) {
                    ((C2357) it.next()).m4468();
                }
                for (C2357 c2357 : AbstractC4343.m8799(this.f6954)) {
                    if (AbstractC2313.m4352(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f6956 + " is not attached to window. ") + "Cancelling running operation " + c2357);
                    }
                    c2357.m4471();
                }
                for (C2357 c23572 : AbstractC4343.m8799(this.f6955)) {
                    if (AbstractC2313.m4352(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f6956 + " is not attached to window. ") + "Cancelling pending operation " + c23572);
                    }
                    c23572.m4471();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2357 m4459(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        Object next;
        Iterator it = this.f6955.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C2357 c2357 = (C2357) next;
            if (AbstractC4394.m8917(c2357.f6980, abstractComponentCallbacksC2338) && !c2357.f6977) {
                break;
            }
        }
        return (C2357) next;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4460() {
        if (this.f6952) {
            return;
        }
        ViewGroup viewGroup = this.f6956;
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        if (!viewGroup.isAttachedToWindow()) {
            m4458();
            this.f6953 = false;
            return;
        }
        synchronized (this.f6955) {
            try {
                if (!this.f6955.isEmpty()) {
                    ArrayList<C2357> arrayListM8799 = AbstractC4343.m8799(this.f6954);
                    this.f6954.clear();
                    for (C2357 c2357 : arrayListM8799) {
                        if (AbstractC2313.m4352(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c2357);
                        }
                        c2357.m4471();
                        if (!c2357.f6984) {
                            this.f6954.add(c2357);
                        }
                    }
                    m4463();
                    ArrayList arrayListM87992 = AbstractC4343.m8799(this.f6955);
                    this.f6955.clear();
                    this.f6954.addAll(arrayListM87992);
                    if (AbstractC2313.m4352(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayListM87992.iterator();
                    while (it.hasNext()) {
                        ((C2357) it.next()).m4468();
                    }
                    m4461(arrayListM87992, this.f6953);
                    this.f6953 = false;
                    if (AbstractC2313.m4352(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4461(ArrayList arrayList, boolean z) {
        Object obj;
        Object next;
        ArrayList arrayList2;
        boolean z2;
        Animator animator;
        boolean z3;
        C2349 c2349 = this;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C2357 c2357 = (C2357) next;
            C2354 c2354 = SpecialEffectsController$Operation$State.Companion;
            View view = c2357.f6980.f6880;
            view.getClass();
            c2354.getClass();
            SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM4465 = C2354.m4465(view);
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.VISIBLE;
            if (specialEffectsController$Operation$StateM4465 == specialEffectsController$Operation$State && c2357.f6982 != specialEffectsController$Operation$State) {
                break;
            }
        }
        C2357 c23572 = (C2357) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            C2357 c23573 = (C2357) objPrevious;
            C2354 c23542 = SpecialEffectsController$Operation$State.Companion;
            View view2 = c23573.f6980.f6880;
            view2.getClass();
            c23542.getClass();
            SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM44652 = C2354.m4465(view2);
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
            if (specialEffectsController$Operation$StateM44652 != specialEffectsController$Operation$State2 && c23573.f6982 == specialEffectsController$Operation$State2) {
                obj = objPrevious;
                break;
            }
        }
        C2357 c23574 = (C2357) obj;
        int i = 2;
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Executing operations from " + c23572 + " to " + c23574);
        }
        ArrayList<C2329> arrayList3 = new ArrayList();
        ArrayList<C2328> arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = ((C2357) AbstractC4343.m8811(arrayList)).f6980;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2334 c2334 = ((C2357) it2.next()).f6980.f6916;
            C2334 c23342 = abstractComponentCallbacksC2338.f6916;
            c2334.f6864 = c23342.f6864;
            c2334.f6863 = c23342.f6863;
            c2334.f6862 = c23342.f6862;
            c2334.f6861 = c23342.f6861;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C2357 c23575 = (C2357) it3.next();
            C2169 c2169 = new C2169();
            c23575.m4468();
            LinkedHashSet linkedHashSet = c23575.f6978;
            linkedHashSet.add(c2169);
            arrayList3.add(new C2329(c23575, c2169, z));
            C2169 c21692 = new C2169();
            c23575.m4468();
            linkedHashSet.add(c21692);
            boolean z4 = !z ? c23575 != c23574 : c23575 != c23572;
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c23575.f6980;
            C2328 c2328 = new C2328(c23575, i, c21692);
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State3 = c23575.f6982;
            int i2 = i;
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State4 = SpecialEffectsController$Operation$State.VISIBLE;
            if (specialEffectsController$Operation$State3 == specialEffectsController$Operation$State4) {
                if (z) {
                    C2334 c23343 = abstractComponentCallbacksC23382.f6916;
                } else {
                    abstractComponentCallbacksC23382.getClass();
                }
            } else if (z) {
                C2334 c23344 = abstractComponentCallbacksC23382.f6916;
            } else {
                abstractComponentCallbacksC23382.getClass();
            }
            if (c23575.f6982 == specialEffectsController$Operation$State4) {
                if (z) {
                    C2334 c23345 = abstractComponentCallbacksC23382.f6916;
                } else {
                    C2334 c23346 = abstractComponentCallbacksC23382.f6916;
                }
            }
            if (z4) {
                if (z) {
                    C2334 c23347 = abstractComponentCallbacksC23382.f6916;
                } else {
                    abstractComponentCallbacksC23382.getClass();
                }
            }
            arrayList4.add(c2328);
            c23575.f6979.add(new RunnableC0099(arrayList5, c23575, c2349));
            i = i2;
        }
        int i3 = i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (!((C2328) obj2).m312()) {
                arrayList6.add(obj2);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            ((C2328) it4.next()).getClass();
        }
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            ((C2328) it5.next()).getClass();
        }
        for (C2328 c23282 : arrayList4) {
            linkedHashMap.put((C2357) c23282.f231, Boolean.FALSE);
            c23282.m305();
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = c2349.f6956;
        Context context = viewGroup.getContext();
        ArrayList<C2329> arrayList8 = new ArrayList();
        boolean z5 = false;
        for (C2329 c2329 : arrayList3) {
            if (c2329.m312()) {
                c2329.m305();
            } else {
                context.getClass();
                C0076 c0076M4415 = c2329.m4415(context);
                if (c0076M4415 == null) {
                    c2329.m305();
                } else {
                    Animator animator2 = (Animator) c0076M4415.f228;
                    if (animator2 == null) {
                        arrayList8.add(c2329);
                    } else {
                        C2357 c23576 = (C2357) c2329.f231;
                        arrayList2 = arrayList8;
                        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23383 = c23576.f6980;
                        z2 = z5;
                        if (AbstractC4394.m8917(linkedHashMap.get(c23576), Boolean.TRUE)) {
                            if (AbstractC2313.m4352(i3)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC23383 + " as this Fragment was involved in a Transition.");
                            }
                            c2329.m305();
                            c2349 = this;
                            arrayList8 = arrayList2;
                            z5 = z2;
                        } else {
                            if (c23576.f6982 == SpecialEffectsController$Operation$State.GONE) {
                                animator = animator2;
                                z3 = true;
                            } else {
                                animator = animator2;
                                z3 = false;
                            }
                            if (z3) {
                                arrayList5.remove(c23576);
                            }
                            View view3 = abstractComponentCallbacksC23383.f6880;
                            viewGroup.startViewTransition(view3);
                            ArrayList arrayList9 = arrayList5;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            Animator animator3 = animator;
                            c2349 = this;
                            animator3.addListener(new C2327(c2349, view3, z3, c23576, c2329));
                            animator3.setTarget(view3);
                            animator3.start();
                            if (AbstractC2313.m4352(i3)) {
                                Log.v("FragmentManager", "Animator from operation " + c23576 + " has started.");
                            }
                            ((C2169) c2329.f232).setOnCancelListener(new C0679(animator3, 1, c23576));
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
            c2349 = this;
            arrayList8 = arrayList2;
            z5 = z2;
        }
        boolean z6 = z5;
        ArrayList<C2357> arrayList10 = arrayList5;
        for (C2329 c23292 : arrayList8) {
            C2357 c23577 = (C2357) c23292.f231;
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC23384 = c23577.f6980;
            if (zContainsValue) {
                if (AbstractC2313.m4352(i3)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC23384 + " as Animations cannot run alongside Transitions.");
                }
                c23292.m305();
            } else if (z6) {
                if (AbstractC2313.m4352(i3)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC23384 + " as Animations cannot run alongside Animators.");
                }
                c23292.m305();
            } else {
                View view4 = abstractComponentCallbacksC23384.f6880;
                context.getClass();
                C0076 c0076M44152 = c23292.m4415(context);
                if (c0076M44152 == null) {
                    C5919.m11250("Required value was null.");
                    return;
                }
                Animation animation = (Animation) c0076M44152.f227;
                if (animation == null) {
                    C5919.m11250("Required value was null.");
                    return;
                }
                if (c23577.f6982 != SpecialEffectsController$Operation$State.REMOVED) {
                    view4.startAnimation(animation);
                    c23292.m305();
                } else {
                    viewGroup.startViewTransition(view4);
                    RunnableC2318 runnableC2318 = new RunnableC2318(animation, viewGroup, view4);
                    runnableC2318.setAnimationListener(new AnimationAnimationListenerC2345(c23577, c2349, view4, c23292));
                    view4.startAnimation(runnableC2318);
                    if (AbstractC2313.m4352(i3)) {
                        Log.v("FragmentManager", "Animation from operation " + c23577 + " has started.");
                    }
                }
                ((C2169) c23292.f232).setOnCancelListener(new C2330(view4, c2349, c23292, c23577));
            }
        }
        for (C2357 c23578 : arrayList10) {
            View view5 = c23578.f6980.f6880;
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State5 = c23578.f6982;
            view5.getClass();
            specialEffectsController$Operation$State5.applyState(view5);
        }
        arrayList10.clear();
        if (AbstractC2313.m4352(i3)) {
            Log.v("FragmentManager", "Completed executing operations from " + c23572 + " to " + c23574);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4462(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, C2304 c2304) {
        synchronized (this.f6955) {
            C2169 c2169 = new C2169();
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6753;
            abstractComponentCallbacksC2338.getClass();
            C2357 c2357M4459 = m4459(abstractComponentCallbacksC2338);
            if (c2357M4459 != null) {
                c2357M4459.m4469(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact);
                return;
            }
            final C2357 c2357 = new C2357(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact, c2304, c2169);
            this.f6955.add(c2357);
            final int i = 0;
            c2357.f6979.add(new Runnable(this) { // from class: androidx.fragment.app.飘花落叶言子苏楪哲兰世

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C2349 f6989;

                {
                    this.f6989 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    C2357 c23572 = c2357;
                    C2349 c2349 = this.f6989;
                    switch (i2) {
                        case 0:
                            if (c2349.f6955.contains(c23572)) {
                                SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = c23572.f6982;
                                View view = c23572.f6980.f6880;
                                view.getClass();
                                specialEffectsController$Operation$State2.applyState(view);
                            }
                            break;
                        default:
                            c2349.f6955.remove(c23572);
                            c2349.f6954.remove(c23572);
                            break;
                    }
                }
            });
            final int i2 = 1;
            c2357.f6979.add(new Runnable(this) { // from class: androidx.fragment.app.飘花落叶言子苏楪哲兰世

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C2349 f6989;

                {
                    this.f6989 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    C2357 c23572 = c2357;
                    C2349 c2349 = this.f6989;
                    switch (i22) {
                        case 0:
                            if (c2349.f6955.contains(c23572)) {
                                SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = c23572.f6982;
                                View view = c23572.f6980.f6880;
                                view.getClass();
                                specialEffectsController$Operation$State2.applyState(view);
                            }
                            break;
                        default:
                            c2349.f6955.remove(c23572);
                            c2349.f6954.remove(c23572);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4463() {
        for (C2357 c2357 : this.f6955) {
            if (c2357.f6981 == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
                View viewM4424 = c2357.f6980.m4424();
                C2354 c2354 = SpecialEffectsController$Operation$State.Companion;
                int visibility = viewM4424.getVisibility();
                c2354.getClass();
                c2357.m4469(C2354.m4464(visibility), SpecialEffectsController$Operation$LifecycleImpact.NONE);
            }
        }
    }
}
