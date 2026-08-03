package androidx.fragment.app;

import Yue.C3674;
import Yue.C3888;
import Yue.C4335;
import Yue.C5499;
import Yue.C6193;
import Yue.C6884;
import Yue.C8107;
import Yue.C8273;
import Yue.InterfaceC3647;
import Yue.InterfaceC5578;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import Yue.InterfaceC7541;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC8887;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
public abstract class AbstractC8887 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1705 f29822 = new C1705(null);

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final ViewGroup f3845;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final List<C8888> f3846;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final List<C8888> f29823;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f29824;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f29825;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ */
    public static final class C1705 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.fragment.app.ۥ۟۟۠ۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1705(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ */
        public final AbstractC8887 m4859(@InterfaceC6399 ViewGroup viewGroup, @InterfaceC6399 InterfaceC7541 interfaceC7541) {
            C5499.m17103(viewGroup, "container");
            C5499.m17103(interfaceC7541, "factory");
            Object tag = viewGroup.getTag(C6884.C6885.f2415);
            if (tag instanceof AbstractC8887) {
                return (AbstractC8887) tag;
            }
            AbstractC8887 abstractC8887Mo3724 = interfaceC7541.mo3724(viewGroup);
            C5499.m17102(abstractC8887Mo3724, "factory.createController(container)");
            viewGroup.setTag(C6884.C6885.f2415, abstractC8887Mo3724);
            return abstractC8887Mo3724;
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟ */
        public final AbstractC8887 m4860(@InterfaceC6399 ViewGroup viewGroup, @InterfaceC6399 FragmentManager fragmentManager) {
            C5499.m17103(viewGroup, "container");
            C5499.m17103(fragmentManager, "fragmentManager");
            InterfaceC7541 interfaceC7541M29817 = fragmentManager.m29817();
            C5499.m17102(interfaceC7541M29817, "fragmentManager.specialEffectsControllerFactory");
            return m4859(viewGroup, interfaceC7541M29817);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1705() {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟ */
    public static final class C1706 extends C8888 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC6399
        public final C8882 f29826;

        /* JADX WARN: Illegal instructions before constructor call */
        public C1706(@InterfaceC6399 C8888.EnumC1708 enumC1708, @InterfaceC6399 C8888.EnumC1707 enumC1707, @InterfaceC6399 C8882 c8882, @InterfaceC6399 C3674 c3674) {
            C5499.m17103(enumC1708, "finalState");
            C5499.m17103(enumC1707, "lifecycleImpact");
            C5499.m17103(c8882, "fragmentStateManager");
            C5499.m17103(c3674, "cancellationSignal");
            Fragment fragmentM30000 = c8882.m30000();
            C5499.m17102(fragmentM30000, "fragmentStateManager.fragment");
            super(enumC1708, enumC1707, fragmentM30000, c3674);
            this.f29826 = c8882;
        }

        @Override // androidx.fragment.app.AbstractC8887.C8888
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo30092() {
            super.mo30092();
            this.f29826.m30002();
        }

        @Override // androidx.fragment.app.AbstractC8887.C8888
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void mo30093() {
            if (m30099() != C8888.EnumC1707.ADDING) {
                if (m30099() == C8888.EnumC1707.REMOVING) {
                    Fragment fragmentM30000 = this.f29826.m30000();
                    C5499.m17102(fragmentM30000, "fragmentStateManager.fragment");
                    View viewRequireView = fragmentM30000.requireView();
                    C5499.m17102(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentM30000);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentM300002 = this.f29826.m30000();
            C5499.m17102(fragmentM300002, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentM300002.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentM300002.setFocusedView(viewFindFocus);
                if (FragmentManager.m29739(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentM300002);
                }
            }
            View viewRequireView2 = m30098().requireView();
            C5499.m17102(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f29826.m4852();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentM300002.getPostOnViewCreatedAlpha());
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    public static class C8888 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public EnumC1708 f3847;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public EnumC1707 f3848;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final Fragment f29827;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final List<Runnable> f29828;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final Set<C3674> f29829;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f29830;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f29831;

        /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ */
        public enum EnumC1707 {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟ */
        public enum EnumC1708 {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            @InterfaceC6399
            public static final C8889 f29836 = new C8889(null);

            /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ, reason: contains not printable characters */
            public static final class C8889 {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.fragment.app.ۥ۟۟۠ۡ.ۥ۟۟.ۥ۟.ۥ.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ C8889(C4335 c4335) {
                    this();
                }

                @InterfaceC6399
                /* JADX INFO: renamed from: ۥ */
                public final EnumC1708 m4865(@InterfaceC6399 View view) {
                    C5499.m17103(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? EnumC1708.INVISIBLE : m4866(view.getVisibility());
                }

                @InterfaceC6399
                @InterfaceC5578
                /* JADX INFO: renamed from: ۥ۟ */
                public final EnumC1708 m4866(int i) {
                    if (i == 0) {
                        return EnumC1708.VISIBLE;
                    }
                    if (i == 4) {
                        return EnumC1708.INVISIBLE;
                    }
                    if (i == 8) {
                        return EnumC1708.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public C8889() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ۟, reason: contains not printable characters */
            public /* synthetic */ class C8890 {

                /* JADX INFO: renamed from: ۥ */
                public static final /* synthetic */ int[] f3849;

                static {
                    int[] iArr = new int[EnumC1708.values().length];
                    try {
                        iArr[EnumC1708.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC1708.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC1708.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC1708.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f3849 = iArr;
                }
            }

            @InterfaceC6399
            @InterfaceC5578
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static final EnumC1708 m30106(int i) {
                return f29836.m4866(i);
            }

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final void m30107(@InterfaceC6399 View view) {
                C5499.m17103(view, "view");
                int i = C8890.f3849[ordinal()];
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.m29739(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i != 4) {
                    return;
                }
                if (FragmentManager.m29739(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟۟, reason: contains not printable characters */
        public /* synthetic */ class C8891 {

            /* JADX INFO: renamed from: ۥ */
            public static final /* synthetic */ int[] f3850;

            static {
                int[] iArr = new int[EnumC1707.values().length];
                try {
                    iArr[EnumC1707.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1707.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1707.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3850 = iArr;
            }
        }

        public C8888(@InterfaceC6399 EnumC1708 enumC1708, @InterfaceC6399 EnumC1707 enumC1707, @InterfaceC6399 Fragment fragment, @InterfaceC6399 C3674 c3674) {
            C5499.m17103(enumC1708, "finalState");
            C5499.m17103(enumC1707, "lifecycleImpact");
            C5499.m17103(fragment, "fragment");
            C5499.m17103(c3674, "cancellationSignal");
            this.f3847 = enumC1708;
            this.f3848 = enumC1707;
            this.f29827 = fragment;
            this.f29828 = new ArrayList();
            this.f29829 = new LinkedHashSet();
            c3674.m10066(new C3674.InterfaceC0218() { // from class: Yue.ۥۢ۟ۦۧ
                @Override // Yue.C3674.InterfaceC0218
                public final void onCancel() {
                    AbstractC8887.C8888.m4862(this.f2938);
                }
            });
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static final void m4862(C8888 c8888) {
            C5499.m17103(c8888, "this$0");
            c8888.m30095();
        }

        @InterfaceC6399
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f3847 + " lifecycleImpact = " + this.f3848 + " fragment = " + this.f29827 + C6193.f1885;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m30094(@InterfaceC6399 Runnable runnable) {
            C5499.m17103(runnable, "listener");
            this.f29828.add(runnable);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m30095() {
            if (this.f29830) {
                return;
            }
            this.f29830 = true;
            if (this.f29829.isEmpty()) {
                mo30092();
                return;
            }
            Iterator it = C3888.m11066(this.f29829).iterator();
            while (it.hasNext()) {
                ((C3674) it.next()).m741();
            }
        }

        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo30092() {
            if (this.f29831) {
                return;
            }
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f29831 = true;
            Iterator<T> it = this.f29828.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m30096(@InterfaceC6399 C3674 c3674) {
            C5499.m17103(c3674, "signal");
            if (this.f29829.remove(c3674) && this.f29829.isEmpty()) {
                mo30092();
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final EnumC1708 m30097() {
            return this.f3847;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Fragment m30098() {
            return this.f29827;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final EnumC1707 m30099() {
            return this.f3848;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final boolean m30100() {
            return this.f29830;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final boolean m30101() {
            return this.f29831;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m30102(@InterfaceC6399 C3674 c3674) {
            C5499.m17103(c3674, "signal");
            mo30093();
            this.f29829.add(c3674);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m30103(@InterfaceC6399 EnumC1708 enumC1708, @InterfaceC6399 EnumC1707 enumC1707) {
            C5499.m17103(enumC1708, "finalState");
            C5499.m17103(enumC1707, "lifecycleImpact");
            int i = C8891.f3850[enumC1707.ordinal()];
            if (i == 1) {
                if (this.f3847 == EnumC1708.REMOVED) {
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f29827 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3848 + " to ADDING.");
                    }
                    this.f3847 = EnumC1708.VISIBLE;
                    this.f3848 = EnumC1707.ADDING;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.m29739(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f29827 + " mFinalState = " + this.f3847 + " -> REMOVED. mLifecycleImpact  = " + this.f3848 + " to REMOVING.");
                }
                this.f3847 = EnumC1708.REMOVED;
                this.f3848 = EnumC1707.REMOVING;
                return;
            }
            if (i == 3 && this.f3847 != EnumC1708.REMOVED) {
                if (FragmentManager.m29739(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f29827 + " mFinalState = " + this.f3847 + " -> " + enumC1708 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                }
                this.f3847 = enumC1708;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public void mo30093() {
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m30104(@InterfaceC6399 EnumC1708 enumC1708) {
            C5499.m17103(enumC1708, "<set-?>");
            this.f3847 = enumC1708;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final void m30105(@InterfaceC6399 EnumC1707 enumC1707) {
            C5499.m17103(enumC1707, "<set-?>");
            this.f3848 = enumC1707;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠ۡ$ۥ۟۟۟, reason: contains not printable characters */
    public /* synthetic */ class C8892 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3851;

        static {
            int[] iArr = new int[C8888.EnumC1707.values().length];
            try {
                iArr[C8888.EnumC1707.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3851 = iArr;
        }
    }

    public AbstractC8887(@InterfaceC6399 ViewGroup viewGroup) {
        C5499.m17103(viewGroup, "container");
        this.f3845 = viewGroup;
        this.f3846 = new ArrayList();
        this.f29823 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m30073(AbstractC8887 abstractC8887, C1706 c1706) {
        C5499.m17103(abstractC8887, "this$0");
        C5499.m17103(c1706, "$operation");
        if (abstractC8887.f3846.contains(c1706)) {
            C8888.EnumC1708 enumC1708M30097 = c1706.m30097();
            View view = c1706.m30098().mView;
            C5499.m17102(view, "operation.fragment.mView");
            enumC1708M30097.m30107(view);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m30074(AbstractC8887 abstractC8887, C1706 c1706) {
        C5499.m17103(abstractC8887, "this$0");
        C5499.m17103(c1706, "$operation");
        abstractC8887.f3846.remove(c1706);
        abstractC8887.f29823.remove(c1706);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final AbstractC8887 m30075(@InterfaceC6399 ViewGroup viewGroup, @InterfaceC6399 InterfaceC7541 interfaceC7541) {
        return f29822.m4859(viewGroup, interfaceC7541);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final AbstractC8887 m30076(@InterfaceC6399 ViewGroup viewGroup, @InterfaceC6399 FragmentManager fragmentManager) {
        return f29822.m4860(viewGroup, fragmentManager);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m30077(C8888.EnumC1708 enumC1708, C8888.EnumC1707 enumC1707, C8882 c8882) {
        synchronized (this.f3846) {
            C3674 c3674 = new C3674();
            Fragment fragmentM30000 = c8882.m30000();
            C5499.m17102(fragmentM30000, "fragmentStateManager.fragment");
            C8888 c8888M30083 = m30083(fragmentM30000);
            if (c8888M30083 != null) {
                c8888M30083.m30103(enumC1708, enumC1707);
                return;
            }
            final C1706 c1706 = new C1706(enumC1708, enumC1707, c8882, c3674);
            this.f3846.add(c1706);
            c1706.m30094(new Runnable() { // from class: Yue.ۥۢ۟ۦۥ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8887.m30073(this.f22816, c1706);
                }
            });
            c1706.m30094(new Runnable() { // from class: Yue.ۥۢ۟ۦۦ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8887.m30074(this.f22818, c1706);
                }
            });
            C8107 c8107 = C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m30078(@InterfaceC6399 C8888.EnumC1708 enumC1708, @InterfaceC6399 C8882 c8882) {
        C5499.m17103(enumC1708, "finalState");
        C5499.m17103(c8882, "fragmentStateManager");
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c8882.m30000());
        }
        m30077(enumC1708, C8888.EnumC1707.ADDING, c8882);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m30079(@InterfaceC6399 C8882 c8882) {
        C5499.m17103(c8882, "fragmentStateManager");
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c8882.m30000());
        }
        m30077(C8888.EnumC1708.GONE, C8888.EnumC1707.NONE, c8882);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m30080(@InterfaceC6399 C8882 c8882) {
        C5499.m17103(c8882, "fragmentStateManager");
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c8882.m30000());
        }
        m30077(C8888.EnumC1708.REMOVED, C8888.EnumC1707.REMOVING, c8882);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m30081(@InterfaceC6399 C8882 c8882) {
        C5499.m17103(c8882, "fragmentStateManager");
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c8882.m30000());
        }
        m30077(C8888.EnumC1708.VISIBLE, C8888.EnumC1707.NONE, c8882);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public abstract void mo29941(@InterfaceC6399 List<C8888> list, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m30082() {
        if (this.f29825) {
            return;
        }
        if (!C8273.m27397(this.f3845)) {
            m30085();
            this.f29824 = false;
            return;
        }
        synchronized (this.f3846) {
            try {
                if (!this.f3846.isEmpty()) {
                    List<C8888> listM11065 = C3888.m11065(this.f29823);
                    this.f29823.clear();
                    for (C8888 c8888 : listM11065) {
                        if (FragmentManager.m29739(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c8888);
                        }
                        c8888.m30095();
                        if (!c8888.m30101()) {
                            this.f29823.add(c8888);
                        }
                    }
                    m30090();
                    List<C8888> listM110652 = C3888.m11065(this.f3846);
                    this.f3846.clear();
                    this.f29823.addAll(listM110652);
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator<C8888> it = listM110652.iterator();
                    while (it.hasNext()) {
                        it.next().mo30093();
                    }
                    mo29941(listM110652, this.f29824);
                    this.f29824 = false;
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final C8888 m30083(Fragment fragment) {
        Object next;
        Iterator<T> it = this.f3846.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C8888 c8888 = (C8888) next;
            if (C5499.m17094(c8888.m30098(), fragment) && !c8888.m30100()) {
                break;
            }
        }
        return (C8888) next;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final C8888 m30084(Fragment fragment) {
        Object next;
        Iterator<T> it = this.f29823.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C8888 c8888 = (C8888) next;
            if (C5499.m17094(c8888.m30098(), fragment) && !c8888.m30100()) {
                break;
            }
        }
        return (C8888) next;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m30085() {
        if (FragmentManager.m29739(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zM27397 = C8273.m27397(this.f3845);
        synchronized (this.f3846) {
            try {
                m30090();
                Iterator<C8888> it = this.f3846.iterator();
                while (it.hasNext()) {
                    it.next().mo30093();
                }
                for (C8888 c8888 : C3888.m11065(this.f29823)) {
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zM27397 ? "" : "Container " + this.f3845 + " is not attached to window. ") + "Cancelling running operation " + c8888);
                    }
                    c8888.m30095();
                }
                for (C8888 c88882 : C3888.m11065(this.f3846)) {
                    if (FragmentManager.m29739(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zM27397 ? "" : "Container " + this.f3845 + " is not attached to window. ") + "Cancelling pending operation " + c88882);
                    }
                    c88882.m30095();
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m30086() {
        if (this.f29825) {
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f29825 = false;
            m30082();
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final C8888.EnumC1707 m30087(@InterfaceC6399 C8882 c8882) {
        C5499.m17103(c8882, "fragmentStateManager");
        Fragment fragmentM30000 = c8882.m30000();
        C5499.m17102(fragmentM30000, "fragmentStateManager.fragment");
        C8888 c8888M30083 = m30083(fragmentM30000);
        C8888.EnumC1707 enumC1707M30099 = c8888M30083 != null ? c8888M30083.m30099() : null;
        C8888 c8888M30084 = m30084(fragmentM30000);
        C8888.EnumC1707 enumC1707M300992 = c8888M30084 != null ? c8888M30084.m30099() : null;
        int i = enumC1707M30099 == null ? -1 : C8892.f3851[enumC1707M30099.ordinal()];
        return (i == -1 || i == 1) ? enumC1707M300992 : enumC1707M30099;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final ViewGroup m30088() {
        return this.f3845;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m30089() {
        C8888 c8888Previous;
        synchronized (this.f3846) {
            try {
                m30090();
                List<C8888> list = this.f3846;
                ListIterator<C8888> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        c8888Previous = null;
                        break;
                    }
                    c8888Previous = listIterator.previous();
                    C8888 c8888 = c8888Previous;
                    C8888.EnumC1708.C8889 c8889 = C8888.EnumC1708.f29836;
                    View view = c8888.m30098().mView;
                    C5499.m17102(view, "operation.fragment.mView");
                    C8888.EnumC1708 enumC1708M4865 = c8889.m4865(view);
                    C8888.EnumC1708 enumC1708M30097 = c8888.m30097();
                    C8888.EnumC1708 enumC1708 = C8888.EnumC1708.VISIBLE;
                    if (enumC1708M30097 == enumC1708 && enumC1708M4865 != enumC1708) {
                        break;
                    }
                }
                C8888 c88882 = c8888Previous;
                Fragment fragmentM30098 = c88882 != null ? c88882.m30098() : null;
                this.f29825 = fragmentM30098 != null ? fragmentM30098.isPostponed() : false;
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m30090() {
        for (C8888 c8888 : this.f3846) {
            if (c8888.m30099() == C8888.EnumC1707.ADDING) {
                View viewRequireView = c8888.m30098().requireView();
                C5499.m17102(viewRequireView, "fragment.requireView()");
                c8888.m30103(C8888.EnumC1708.f29836.m4866(viewRequireView.getVisibility()), C8888.EnumC1707.NONE);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m30091(boolean z) {
        this.f29824 = z;
    }
}
