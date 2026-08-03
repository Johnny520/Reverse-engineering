package androidx.fragment.app;

import Yue.AbstractC5104;
import Yue.AbstractC5673;
import Yue.AbstractC7430;
import Yue.C3394;
import Yue.C3674;
import Yue.C3885;
import Yue.C3888;
import Yue.C5099;
import Yue.C5499;
import Yue.C6599;
import Yue.C8003;
import Yue.C8273;
import Yue.C8307;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import Yue.ViewTreeObserverOnPreDrawListenerC6565;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC8887;
import androidx.fragment.app.C8866;
import androidx.fragment.app.C8875;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,877:1\n288#2,2:878\n533#2,6:880\n819#2:886\n847#2,2:887\n766#2:889\n857#2,2:890\n1789#2,3:892\n819#2:895\n847#2,2:896\n1855#2,2:898\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n47#1:878,2\n53#1:880,6\n312#1:886\n312#1:887,2\n315#1:889\n315#1:890,2\n317#1:892,3\n629#1:895\n629#1:896,2\n632#1:898,2\n*E\n"})
public final class C8866 extends AbstractC8887 {

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ */
    public static final class C1691 extends C1692 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean f29690;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29691;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public C8875.C1695 f29692;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1691(@InterfaceC6399 AbstractC8887.C8888 c8888, @InterfaceC6399 C3674 c3674, boolean z) {
            super(c8888, c3674);
            C5499.m17103(c8888, "operation");
            C5499.m17103(c3674, "signal");
            this.f29690 = z;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C8875.C1695 m29949(@InterfaceC6399 Context context) {
            C5499.m17103(context, "context");
            if (this.f29691) {
                return this.f29692;
            }
            C8875.C1695 c1695M4840 = C8875.m4840(context, m4835().m30098(), m4835().m30097() == AbstractC8887.C8888.EnumC1708.VISIBLE, this.f29690);
            this.f29692 = c1695M4840;
            this.f29691 = true;
            return c1695M4840;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ۟ */
    public static class C1692 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final AbstractC8887.C8888 f3820;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final C3674 f3821;

        public C1692(@InterfaceC6399 AbstractC8887.C8888 c8888, @InterfaceC6399 C3674 c3674) {
            C5499.m17103(c8888, "operation");
            C5499.m17103(c3674, "signal");
            this.f3820 = c8888;
            this.f3821 = c3674;
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4834() {
            this.f3820.m30096(this.f3821);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final AbstractC8887.C8888 m4835() {
            return this.f3820;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C3674 m29950() {
            return this.f3821;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m29951() {
            AbstractC8887.C8888.EnumC1708 enumC1708;
            AbstractC8887.C8888.EnumC1708.C8889 c8889 = AbstractC8887.C8888.EnumC1708.f29836;
            View view = this.f3820.m30098().mView;
            C5499.m17102(view, "operation.fragment.mView");
            AbstractC8887.C8888.EnumC1708 enumC1708M4865 = c8889.m4865(view);
            AbstractC8887.C8888.EnumC1708 enumC1708M30097 = this.f3820.m30097();
            return enumC1708M4865 == enumC1708M30097 || !(enumC1708M4865 == (enumC1708 = AbstractC8887.C8888.EnumC1708.VISIBLE) || enumC1708M30097 == enumC1708);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public static final class C8867 extends C1692 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public final Object f29693;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean f29694;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public final Object f29695;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8867(@InterfaceC6399 AbstractC8887.C8888 c8888, @InterfaceC6399 C3674 c3674, boolean z, boolean z2) {
            Object returnTransition;
            super(c8888, c3674);
            C5499.m17103(c8888, "operation");
            C5499.m17103(c3674, "signal");
            AbstractC8887.C8888.EnumC1708 enumC1708M30097 = c8888.m30097();
            AbstractC8887.C8888.EnumC1708 enumC1708 = AbstractC8887.C8888.EnumC1708.VISIBLE;
            if (enumC1708M30097 == enumC1708) {
                Fragment fragmentM30098 = c8888.m30098();
                returnTransition = z ? fragmentM30098.getReenterTransition() : fragmentM30098.getEnterTransition();
            } else {
                Fragment fragmentM300982 = c8888.m30098();
                returnTransition = z ? fragmentM300982.getReturnTransition() : fragmentM300982.getExitTransition();
            }
            this.f29693 = returnTransition;
            this.f29694 = c8888.m30097() == enumC1708 ? z ? c8888.m30098().getAllowReturnTransitionOverlap() : c8888.m30098().getAllowEnterTransitionOverlap() : true;
            this.f29695 = z2 ? z ? c8888.m30098().getSharedElementReturnTransition() : c8888.m30098().getSharedElementEnterTransition() : null;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final AbstractC5104 m29952() {
            AbstractC5104 abstractC5104M29953 = m29953(this.f29693);
            AbstractC5104 abstractC5104M299532 = m29953(this.f29695);
            if (abstractC5104M29953 == null || abstractC5104M299532 == null || abstractC5104M29953 == abstractC5104M299532) {
                return abstractC5104M29953 == null ? abstractC5104M299532 : abstractC5104M29953;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m4835().m30098() + " returned Transition " + this.f29693 + " which uses a different Transition  type than its shared element transition " + this.f29695).toString());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final AbstractC5104 m29953(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC5104 abstractC5104 = C5099.f1272;
            if (abstractC5104 != null && abstractC5104.mo15742(obj)) {
                return abstractC5104;
            }
            AbstractC5104 abstractC51042 = C5099.f12080;
            if (abstractC51042 != null && abstractC51042.mo15742(obj)) {
                return abstractC51042;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m4835().m30098() + " is not a valid framework Transition or AndroidX Transition");
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final Object m29954() {
            return this.f29695;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Object m29955() {
            return this.f29693;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m29956() {
            return this.f29695 != null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final boolean m29957() {
            return this.f29694;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C8868 extends AbstractC5673 implements InterfaceC5124<Map.Entry<String, View>, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Collection<String> f29696;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8868(Collection<String> collection) {
            super(1);
            this.f29696 = collection;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(@InterfaceC6399 Map.Entry<String, View> entry) {
            C5499.m17103(entry, "entry");
            return Boolean.valueOf(C3888.m10855(this.f29696, C8273.m27380(entry.getValue())));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C8869 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ View f3823;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ boolean f29697;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ AbstractC8887.C8888 f29698;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C1691 f29699;

        public C8869(View view, boolean z, AbstractC8887.C8888 c8888, C1691 c1691) {
            this.f3823 = view;
            this.f29697 = z;
            this.f29698 = c8888;
            this.f29699 = c1691;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC6399 Animator animator) {
            C5499.m17103(animator, "anim");
            C8866.this.m30088().endViewTransition(this.f3823);
            if (this.f29697) {
                AbstractC8887.C8888.EnumC1708 enumC1708M30097 = this.f29698.m30097();
                View view = this.f3823;
                C5499.m17102(view, "viewToAnimate");
                enumC1708M30097.m30107(view);
            }
            this.f29699.m4834();
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f29698 + " has ended.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class AnimationAnimationListenerC8870 implements Animation.AnimationListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ AbstractC8887.C8888 f3824;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ C8866 f3825;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ View f29700;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C1691 f29701;

        public AnimationAnimationListenerC8870(AbstractC8887.C8888 c8888, C8866 c8866, View view, C1691 c1691) {
            this.f3824 = c8888;
            this.f3825 = c8866;
            this.f29700 = view;
            this.f29701 = c1691;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static final void m4837(C8866 c8866, View view, C1691 c1691) {
            C5499.m17103(c8866, "this$0");
            C5499.m17103(c1691, "$animationInfo");
            c8866.m30088().endViewTransition(view);
            c1691.m4834();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@InterfaceC6399 Animation animation) {
            C5499.m17103(animation, "animation");
            ViewGroup viewGroupM30088 = this.f3825.m30088();
            final C8866 c8866 = this.f3825;
            final View view = this.f29700;
            final C1691 c1691 = this.f29701;
            viewGroupM30088.post(new Runnable() { // from class: Yue.ۥ۟ۨۧۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C8866.AnimationAnimationListenerC8870.m4837(c8866, view, c1691);
                }
            });
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3824 + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@InterfaceC6399 Animation animation) {
            C5499.m17103(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@InterfaceC6399 Animation animation) {
            C5499.m17103(animation, "animation");
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3824 + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8866(@InterfaceC6399 ViewGroup viewGroup) {
        super(viewGroup);
        C5499.m17103(viewGroup, "container");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final void m29934(List list, AbstractC8887.C8888 c8888, C8866 c8866) {
        C5499.m17103(list, "$awaitingContainerChanges");
        C5499.m17103(c8888, "$operation");
        C5499.m17103(c8866, "this$0");
        if (list.contains(c8888)) {
            list.remove(c8888);
            c8866.m29942(c8888);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final void m29935(Animator animator, AbstractC8887.C8888 c8888) {
        C5499.m17103(c8888, "$operation");
        animator.end();
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Animator from operation " + c8888 + " has been canceled.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final void m29936(View view, C8866 c8866, C1691 c1691, AbstractC8887.C8888 c8888) {
        C5499.m17103(c8866, "this$0");
        C5499.m17103(c1691, "$animationInfo");
        C5499.m17103(c8888, "$operation");
        view.clearAnimation();
        c8866.m30088().endViewTransition(view);
        c1691.m4834();
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Animation from operation " + c8888 + " has been cancelled.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final void m29937(AbstractC5104 abstractC5104, View view, Rect rect) {
        C5499.m17103(abstractC5104, "$impl");
        C5499.m17103(rect, "$lastInEpicenterRect");
        abstractC5104.m15759(view, rect);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final void m29938(ArrayList arrayList) {
        C5499.m17103(arrayList, "$transitioningViews");
        C5099.m15737(arrayList, 4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final void m29939(C8867 c8867, AbstractC8887.C8888 c8888) {
        C5499.m17103(c8867, "$transitionInfo");
        C5499.m17103(c8888, "$operation");
        c8867.m4834();
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Transition for operation " + c8888 + " has completed");
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final void m29940(AbstractC8887.C8888 c8888, AbstractC8887.C8888 c88882, boolean z, C3394 c3394) {
        C5499.m17103(c3394, "$lastInViews");
        C5099.m1918(c8888.m30098(), c88882.m30098(), z, c3394, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    @Override // androidx.fragment.app.AbstractC8887
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo29941(@InterfaceC6399 List<? extends AbstractC8887.C8888> list, boolean z) {
        AbstractC8887.C8888 c8888;
        Object next;
        C5499.m17103(list, "operations");
        Iterator<T> it = list.iterator();
        while (true) {
            c8888 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC8887.C8888 c88882 = (AbstractC8887.C8888) next;
            AbstractC8887.C8888.EnumC1708.C8889 c8889 = AbstractC8887.C8888.EnumC1708.f29836;
            View view = c88882.m30098().mView;
            C5499.m17102(view, "operation.fragment.mView");
            AbstractC8887.C8888.EnumC1708 enumC1708M4865 = c8889.m4865(view);
            AbstractC8887.C8888.EnumC1708 enumC1708 = AbstractC8887.C8888.EnumC1708.VISIBLE;
            if (enumC1708M4865 == enumC1708 && c88882.m30097() != enumC1708) {
                break;
            }
        }
        AbstractC8887.C8888 c88883 = (AbstractC8887.C8888) next;
        ListIterator<? extends AbstractC8887.C8888> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            AbstractC8887.C8888 c8888Previous = listIterator.previous();
            AbstractC8887.C8888 c88884 = c8888Previous;
            AbstractC8887.C8888.EnumC1708.C8889 c88892 = AbstractC8887.C8888.EnumC1708.f29836;
            View view2 = c88884.m30098().mView;
            C5499.m17102(view2, "operation.fragment.mView");
            AbstractC8887.C8888.EnumC1708 enumC1708M48652 = c88892.m4865(view2);
            AbstractC8887.C8888.EnumC1708 enumC17082 = AbstractC8887.C8888.EnumC1708.VISIBLE;
            if (enumC1708M48652 != enumC17082 && c88884.m30097() == enumC17082) {
                c8888 = c8888Previous;
                break;
            }
        }
        AbstractC8887.C8888 c88885 = c8888;
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Executing operations from " + c88883 + " to " + c88885);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List<AbstractC8887.C8888> listM11065 = C3888.m11065(list);
        m29948(list);
        for (final AbstractC8887.C8888 c88886 : list) {
            C3674 c3674 = new C3674();
            c88886.m30102(c3674);
            arrayList.add(new C1691(c88886, c3674, z));
            C3674 c36742 = new C3674();
            c88886.m30102(c36742);
            boolean z2 = false;
            if (z) {
                if (c88886 == c88883) {
                    z2 = true;
                }
            } else if (c88886 == c88885) {
            }
            arrayList2.add(new C8867(c88886, c36742, z, z2));
            c88886.m30094(new Runnable() { // from class: Yue.ۥ۟ۨۦۨ
                @Override // java.lang.Runnable
                public final void run() {
                    C8866.m29934(listM11065, c88886, this);
                }
            });
        }
        Map<AbstractC8887.C8888, Boolean> mapM29947 = m29947(arrayList2, listM11065, z, c88883, c88885);
        m29946(arrayList, listM11065, mapM29947.containsValue(Boolean.TRUE), mapM29947);
        Iterator<AbstractC8887.C8888> it2 = listM11065.iterator();
        while (it2.hasNext()) {
            m29942(it2.next());
        }
        listM11065.clear();
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c88883 + " to " + c88885);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m29942(AbstractC8887.C8888 c8888) {
        View view = c8888.m30098().mView;
        AbstractC8887.C8888.EnumC1708 enumC1708M30097 = c8888.m30097();
        C5499.m17102(view, "view");
        enumC1708M30097.m30107(view);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m29943(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (C8307.m27677(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C5499.m17102(childAt, "child");
                m29943(arrayList, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m29944(Map<String, View> map, View view) {
        String strM27380 = C8273.m27380(view);
        if (strM27380 != null) {
            map.put(strM27380, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    C5499.m17102(childAt, "child");
                    m29944(map, childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m29945(C3394<String, View> c3394, Collection<String> collection) {
        Set<Map.Entry<String, View>> setEntrySet = c3394.entrySet();
        C5499.m17102(setEntrySet, "entries");
        C3885.m10797(setEntrySet, new C8868(collection));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m29946(List<C1691> list, List<AbstractC8887.C8888> list2, boolean z, Map<AbstractC8887.C8888, Boolean> map) {
        Context context = m30088().getContext();
        ArrayList<C1691> arrayList = new ArrayList();
        boolean z2 = false;
        for (C1691 c1691 : list) {
            if (c1691.m29951()) {
                c1691.m4834();
            } else {
                C5499.m17102(context, "context");
                C8875.C1695 c1695M29949 = c1691.m29949(context);
                if (c1695M29949 == null) {
                    c1691.m4834();
                } else {
                    final Animator animator = c1695M29949.f3828;
                    if (animator == null) {
                        arrayList.add(c1691);
                    } else {
                        final AbstractC8887.C8888 c8888M4835 = c1691.m4835();
                        Fragment fragmentM30098 = c8888M4835.m30098();
                        if (C5499.m17094(map.get(c8888M4835), Boolean.TRUE)) {
                            if (FragmentManager.m29739(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragmentM30098 + " as this Fragment was involved in a Transition.");
                            }
                            c1691.m4834();
                        } else {
                            boolean z3 = c8888M4835.m30097() == AbstractC8887.C8888.EnumC1708.GONE;
                            if (z3) {
                                list2.remove(c8888M4835);
                            }
                            View view = fragmentM30098.mView;
                            m30088().startViewTransition(view);
                            animator.addListener(new C8869(view, z3, c8888M4835, c1691));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.m29739(2)) {
                                Log.v("FragmentManager", "Animator from operation " + c8888M4835 + " has started.");
                            }
                            c1691.m29950().m10066(new C3674.InterfaceC0218() { // from class: Yue.ۥ۟ۨۦۦ
                                @Override // Yue.C3674.InterfaceC0218
                                public final void onCancel() {
                                    C8866.m29935(animator, c8888M4835);
                                }
                            });
                            z2 = true;
                        }
                    }
                }
            }
        }
        for (final C1691 c16912 : arrayList) {
            final AbstractC8887.C8888 c8888M48352 = c16912.m4835();
            Fragment fragmentM300982 = c8888M48352.m30098();
            if (z) {
                if (FragmentManager.m29739(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentM300982 + " as Animations cannot run alongside Transitions.");
                }
                c16912.m4834();
            } else if (z2) {
                if (FragmentManager.m29739(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentM300982 + " as Animations cannot run alongside Animators.");
                }
                c16912.m4834();
            } else {
                final View view2 = fragmentM300982.mView;
                C5499.m17102(context, "context");
                C8875.C1695 c1695M299492 = c16912.m29949(context);
                if (c1695M299492 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Animation animation = c1695M299492.f3827;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (c8888M48352.m30097() != AbstractC8887.C8888.EnumC1708.REMOVED) {
                    view2.startAnimation(animation);
                    c16912.m4834();
                } else {
                    m30088().startViewTransition(view2);
                    C8875.RunnableC1696 runnableC1696 = new C8875.RunnableC1696(animation, m30088(), view2);
                    runnableC1696.setAnimationListener(new AnimationAnimationListenerC8870(c8888M48352, this, view2, c16912));
                    view2.startAnimation(runnableC1696);
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "Animation from operation " + c8888M48352 + " has started.");
                    }
                }
                c16912.m29950().m10066(new C3674.InterfaceC0218() { // from class: Yue.ۥ۟ۨۦۧ
                    @Override // Yue.C3674.InterfaceC0218
                    public final void onCancel() {
                        C8866.m29936(view2, this, c16912, c8888M48352);
                    }
                });
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:241:0x043b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:245:0x043b */
    /* JADX DEBUG: Multi-variable search result rejected for r14v28, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r5v31, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r6v21, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final Map<AbstractC8887.C8888, Boolean> m29947(List<C8867> list, List<AbstractC8887.C8888> list2, boolean z, final AbstractC8887.C8888 c8888, final AbstractC8887.C8888 c88882) {
        String str;
        String str2;
        Object obj;
        View view;
        String str3;
        Object obj2;
        Object obj3;
        View view2;
        final ArrayList<View> arrayList;
        LinkedHashMap linkedHashMap;
        View view3;
        Rect rect;
        AbstractC5104 abstractC5104;
        Object obj4;
        View view4;
        final Rect rect2;
        final View view5;
        C8866 c8866 = this;
        final boolean z2 = z;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : list) {
            if (!((C8867) obj5).m29951()) {
                arrayList2.add(obj5);
            }
        }
        ArrayList<C8867> arrayList3 = new ArrayList();
        for (Object obj6 : arrayList2) {
            if (((C8867) obj6).m29952() != null) {
                arrayList3.add(obj6);
            }
        }
        final AbstractC5104 abstractC51042 = null;
        for (C8867 c8867 : arrayList3) {
            AbstractC5104 abstractC5104M29952 = c8867.m29952();
            if (abstractC51042 != null && abstractC5104M29952 != abstractC51042) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c8867.m4835().m30098() + " returned Transition " + c8867.m29955() + " which uses a different Transition type than other Fragments.").toString());
            }
            abstractC51042 = abstractC5104M29952;
        }
        if (abstractC51042 == null) {
            for (C8867 c88672 : list) {
                linkedHashMap2.put(c88672.m4835(), Boolean.FALSE);
                c88672.m4834();
            }
            return linkedHashMap2;
        }
        View view6 = new View(m30088().getContext());
        Rect rect3 = new Rect();
        ArrayList<View> arrayList4 = new ArrayList<>();
        ArrayList<View> arrayList5 = new ArrayList<>();
        C3394 c3394 = new C3394();
        Iterator<C8867> it = list.iterator();
        View view7 = null;
        Object obj7 = null;
        boolean z3 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            C8867 next = it.next();
            if (!next.m29956() || c8888 == null || c88882 == null) {
                rect = rect3;
                view6 = view6;
                arrayList5 = arrayList5;
                linkedHashMap2 = linkedHashMap2;
                c3394 = c3394;
                view7 = view7;
                arrayList4 = arrayList4;
                rect3 = rect;
                z2 = z;
            } else {
                Object objMo15755 = abstractC51042.mo15755(abstractC51042.mo15743(next.m29954()));
                ArrayList<String> sharedElementSourceNames = c88882.m30098().getSharedElementSourceNames();
                C5499.m17102(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = c8888.m30098().getSharedElementSourceNames();
                View view8 = view7;
                C5499.m17102(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = c8888.m30098().getSharedElementTargetNames();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                C5499.m17102(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                View view9 = view6;
                Rect rect4 = rect3;
                int i = 0;
                while (i < size) {
                    int i2 = size;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    size = i2;
                }
                ArrayList<String> sharedElementTargetNames2 = c88882.m30098().getSharedElementTargetNames();
                C5499.m17102(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                C6599 c6599M4014 = !z2 ? C8003.m4014(c8888.m30098().getExitTransitionCallback(), c88882.m30098().getEnterTransitionCallback()) : C8003.m4014(c8888.m30098().getEnterTransitionCallback(), c88882.m30098().getExitTransitionCallback());
                AbstractC7430 abstractC7430 = (AbstractC7430) c6599M4014.m3062();
                AbstractC7430 abstractC74302 = (AbstractC7430) c6599M4014.m3063();
                int size2 = sharedElementSourceNames.size();
                int i3 = 0;
                while (i3 < size2) {
                    c3394.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                    size2 = size2;
                    objMo15755 = objMo15755;
                }
                Object obj8 = objMo15755;
                if (FragmentManager.m29739(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator<String> it2 = sharedElementTargetNames2.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v("FragmentManager", "Name: " + it2.next());
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it3 = sharedElementSourceNames.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v("FragmentManager", "Name: " + it3.next());
                    }
                }
                C3394<String, View> c33942 = new C3394<>();
                View view10 = c8888.m30098().mView;
                C5499.m17102(view10, "firstOut.fragment.mView");
                c8866.m29944(c33942, view10);
                c33942.retainAll(sharedElementSourceNames);
                if (abstractC7430 != null) {
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + c8888);
                    }
                    abstractC7430.m23264(sharedElementSourceNames, c33942);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i4 = size3 - 1;
                            String str4 = sharedElementSourceNames.get(size3);
                            View view11 = (View) c33942.get(str4);
                            if (view11 == null) {
                                c3394.remove(str4);
                                abstractC5104 = abstractC51042;
                            } else {
                                abstractC5104 = abstractC51042;
                                if (!C5499.m17094(str4, C8273.m27380(view11))) {
                                    c3394.put(C8273.m27380(view11), (String) c3394.remove(str4));
                                }
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size3 = i4;
                            abstractC51042 = abstractC5104;
                        }
                    } else {
                        abstractC5104 = abstractC51042;
                    }
                } else {
                    abstractC5104 = abstractC51042;
                    c3394.retainAll(c33942.keySet());
                }
                final C3394<String, View> c33943 = new C3394<>();
                View view12 = c88882.m30098().mView;
                C5499.m17102(view12, "lastIn.fragment.mView");
                c8866.m29944(c33943, view12);
                c33943.retainAll(sharedElementTargetNames2);
                c33943.retainAll(c3394.values());
                if (abstractC74302 != null) {
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + c88882);
                    }
                    abstractC74302.m23264(sharedElementTargetNames2, c33943);
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i5 = size4 - 1;
                            String str5 = sharedElementTargetNames2.get(size4);
                            View view13 = c33943.get(str5);
                            if (view13 == null) {
                                C5499.m17102(str5, "name");
                                String strM1919 = C5099.m1919(c3394, str5);
                                if (strM1919 != null) {
                                    c3394.remove(strM1919);
                                }
                            } else if (!C5499.m17094(str5, C8273.m27380(view13))) {
                                C5499.m17102(str5, "name");
                                String strM19192 = C5099.m1919(c3394, str5);
                                if (strM19192 != null) {
                                    c3394.put(strM19192, C8273.m27380(view13));
                                }
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size4 = i5;
                        }
                    }
                } else {
                    C5099.m15736(c3394, c33943);
                }
                Collection<String> collectionKeySet = c3394.keySet();
                C5499.m17102(collectionKeySet, "sharedElementNameMapping.keys");
                c8866.m29945(c33942, collectionKeySet);
                Collection<String> collectionValues = c3394.values();
                C5499.m17102(collectionValues, "sharedElementNameMapping.values");
                c8866.m29945(c33943, collectionValues);
                if (c3394.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view7 = view8;
                    linkedHashMap2 = linkedHashMap3;
                    view6 = view9;
                    rect3 = rect4;
                    abstractC51042 = abstractC5104;
                    obj7 = null;
                } else {
                    C5099.m1918(c88882.m30098(), c8888.m30098(), z2, c33942, true);
                    ViewTreeObserverOnPreDrawListenerC6565.m3026(m30088(), new Runnable() { // from class: Yue.ۥ۟ۨۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8866.m29940(c88882, c8888, z2, c33943);
                        }
                    });
                    arrayList4.addAll(c33942.values());
                    if (!sharedElementSourceNames.isEmpty()) {
                        view4 = (View) c33942.get(sharedElementSourceNames.get(0));
                        abstractC51042 = abstractC5104;
                        obj4 = obj8;
                        abstractC51042.mo15751(obj4, view4);
                    } else {
                        abstractC51042 = abstractC5104;
                        obj4 = obj8;
                        view4 = view8;
                    }
                    arrayList5.addAll(c33943.values());
                    if (!(!sharedElementTargetNames2.isEmpty()) || (view5 = c33943.get(sharedElementTargetNames2.get(0))) == null) {
                        rect2 = rect4;
                    } else {
                        rect2 = rect4;
                        ViewTreeObserverOnPreDrawListenerC6565.m3026(m30088(), new Runnable() { // from class: Yue.ۥ۟ۨۧ۟
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8866.m29937(abstractC51042, view5, rect2);
                            }
                        });
                        z3 = true;
                    }
                    abstractC51042.mo15753(obj4, view9, arrayList4);
                    Object obj9 = obj4;
                    ArrayList<View> arrayList6 = arrayList5;
                    rect = rect2;
                    abstractC51042.mo15749(obj4, null, null, null, null, obj9, arrayList6);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap3.put(c8888, bool);
                    linkedHashMap3.put(c88882, bool);
                    view7 = view4;
                    arrayList5 = arrayList6;
                    c3394 = c3394;
                    obj7 = obj9;
                    arrayList4 = arrayList4;
                    view6 = view9;
                    linkedHashMap2 = linkedHashMap3;
                    rect3 = rect;
                    z2 = z;
                }
            }
        }
        View view14 = view7;
        C3394 c33944 = c3394;
        ArrayList<View> arrayList7 = arrayList5;
        ArrayList<View> arrayList8 = arrayList4;
        Rect rect5 = rect3;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        View view15 = view6;
        ArrayList arrayList9 = new ArrayList();
        Object objMo15745 = null;
        Object objMo157452 = null;
        for (C8867 c88673 : list) {
            if (c88673.m29951()) {
                linkedHashMap4.put(c88673.m4835(), Boolean.FALSE);
                c88673.m4834();
            } else {
                Object objMo15743 = abstractC51042.mo15743(c88673.m29955());
                AbstractC8887.C8888 c8888M4835 = c88673.m4835();
                boolean z4 = obj7 != null && (c8888M4835 == c8888 || c8888M4835 == c88882);
                if (objMo15743 != null) {
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj10 = obj7;
                    View view16 = c8888M4835.m30098().mView;
                    String str6 = str;
                    C5499.m17102(view16, "operation.fragment.mView");
                    c8866.m29943(arrayList10, view16);
                    if (z4) {
                        if (c8888M4835 == c8888) {
                            arrayList10.removeAll(C3888.m11067(arrayList8));
                        } else {
                            arrayList10.removeAll(C3888.m11067(arrayList7));
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        abstractC51042.mo1920(objMo15743, view15);
                        obj2 = objMo15745;
                        obj3 = objMo157452;
                        view = view14;
                        linkedHashMap = linkedHashMap5;
                        obj = obj10;
                        str3 = str6;
                        view2 = view15;
                        arrayList = arrayList10;
                    } else {
                        abstractC51042.mo1921(objMo15743, arrayList10);
                        obj = obj10;
                        view = view14;
                        str3 = str6;
                        obj2 = objMo15745;
                        obj3 = objMo157452;
                        view2 = view15;
                        arrayList = arrayList10;
                        linkedHashMap = linkedHashMap5;
                        abstractC51042.mo15749(objMo15743, objMo15743, arrayList10, null, null, null, null);
                        if (c8888M4835.m30097() == AbstractC8887.C8888.EnumC1708.GONE) {
                            c8888M4835 = c8888M4835;
                            list2.remove(c8888M4835);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList);
                            arrayList11.remove(c8888M4835.m30098().mView);
                            objMo15743 = objMo15743;
                            abstractC51042.mo15748(objMo15743, c8888M4835.m30098().mView, arrayList11);
                            ViewTreeObserverOnPreDrawListenerC6565.m3026(m30088(), new Runnable() { // from class: Yue.ۥ۟ۨۧ۠
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C8866.m29938(arrayList);
                                }
                            });
                        } else {
                            c8888M4835 = c8888M4835;
                            objMo15743 = objMo15743;
                        }
                    }
                    if (c8888M4835.m30097() == AbstractC8887.C8888.EnumC1708.VISIBLE) {
                        arrayList9.addAll(arrayList);
                        if (z3) {
                            abstractC51042.mo15750(objMo15743, rect5);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        abstractC51042.mo15751(objMo15743, view3);
                    }
                    linkedHashMap.put(c8888M4835, Boolean.TRUE);
                    if (c88673.m29957()) {
                        objMo157452 = abstractC51042.mo15745(obj3, objMo15743, null);
                        linkedHashMap4 = linkedHashMap;
                        obj7 = obj;
                        str = str3;
                        objMo15745 = obj2;
                    } else {
                        objMo157452 = obj3;
                        objMo15745 = abstractC51042.mo15745(obj2, objMo15743, null);
                        linkedHashMap4 = linkedHashMap;
                        obj7 = obj;
                        str = str3;
                    }
                    c8866 = this;
                    View view17 = view2;
                    view14 = view3;
                    view15 = view17;
                } else if (!z4) {
                    linkedHashMap4.put(c8888M4835, Boolean.FALSE);
                    c88673.m4834();
                }
            }
        }
        String str7 = str;
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        Object obj11 = obj7;
        Object objMo15744 = abstractC51042.mo15744(objMo157452, objMo15745, obj11);
        if (objMo15744 == null) {
            return linkedHashMap6;
        }
        ArrayList<C8867> arrayList12 = new ArrayList();
        for (Object obj12 : list) {
            if (!((C8867) obj12).m29951()) {
                arrayList12.add(obj12);
            }
        }
        for (final C8867 c88674 : arrayList12) {
            Object objM29955 = c88674.m29955();
            final AbstractC8887.C8888 c8888M48352 = c88674.m4835();
            boolean z5 = obj11 != null && (c8888M48352 == c8888 || c8888M48352 == c88882);
            if (objM29955 == null && !z5) {
                str2 = str7;
            } else if (C8273.m27404(m30088())) {
                str2 = str7;
                abstractC51042.mo15752(c88674.m4835().m30098(), objMo15744, c88674.m29950(), new Runnable() { // from class: Yue.ۥ۟ۨۧۡ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8866.m29939(c88674, c8888M48352);
                    }
                });
            } else {
                if (FragmentManager.m29739(2)) {
                    str2 = str7;
                    Log.v(str2, "SpecialEffectsController: Container " + m30088() + " has not been laid out. Completing operation " + c8888M48352);
                } else {
                    str2 = str7;
                }
                c88674.m4834();
            }
            str7 = str2;
        }
        String str8 = str7;
        if (!C8273.m27404(m30088())) {
            return linkedHashMap6;
        }
        C5099.m15737(arrayList9, 4);
        ArrayList<String> arrayListM15760 = abstractC51042.m15760(arrayList7);
        if (FragmentManager.m29739(2)) {
            Log.v(str8, ">>>>> Beginning transition <<<<<");
            Log.v(str8, ">>>>> SharedElementFirstOutViews <<<<<");
            for (View view18 : arrayList8) {
                C5499.m17102(view18, "sharedElementFirstOutViews");
                View view19 = view18;
                Log.v(str8, "View: " + view19 + " Name: " + C8273.m27380(view19));
            }
            Log.v(str8, ">>>>> SharedElementLastInViews <<<<<");
            for (View view20 : arrayList7) {
                C5499.m17102(view20, "sharedElementLastInViews");
                View view21 = view20;
                Log.v(str8, "View: " + view21 + " Name: " + C8273.m27380(view21));
            }
        }
        abstractC51042.mo15741(m30088(), objMo15744);
        abstractC51042.m15761(m30088(), arrayList8, arrayList7, arrayListM15760, c33944);
        C5099.m15737(arrayList9, 0);
        abstractC51042.mo15754(obj11, arrayList8, arrayList7);
        return linkedHashMap6;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final void m29948(List<? extends AbstractC8887.C8888> list) {
        Fragment fragmentM30098 = ((AbstractC8887.C8888) C3888.m10926(list)).m30098();
        for (AbstractC8887.C8888 c8888 : list) {
            c8888.m30098().mAnimationInfo.f29580 = fragmentM30098.mAnimationInfo.f29580;
            c8888.m30098().mAnimationInfo.f29581 = fragmentM30098.mAnimationInfo.f29581;
            c8888.m30098().mAnimationInfo.f29582 = fragmentM30098.mAnimationInfo.f29582;
            c8888.m30098().mAnimationInfo.f29583 = fragmentM30098.mAnimationInfo.f29583;
        }
    }
}
