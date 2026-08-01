package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import androidx.collection.C0282;
import androidx.compose.animation.core.C0325;
import androidx.core.view.AbstractC2270;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.AbstractC2375;
import androidx.lifecycle.AbstractC2435;
import androidx.lifecycle.C2374;
import androidx.lifecycle.C2386;
import androidx.lifecycle.C2423;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5093;
import p143.C7544;
import p143.C7545;
import p156.AbstractC7622;
import p156.C7623;
import p160.C7637;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2304 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 f6754;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0325 f6755;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0076 f6756;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f6753 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f6752 = -1;

    public C2304(C0076 c0076, C0325 c0325, ClassLoader classLoader, C2324 c2324, Bundle bundle) {
        this.f6756 = c0076;
        this.f6755 = c0325;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4423 = c2324.m4423(fragmentState.f6749);
        abstractComponentCallbacksC2338M4423.f6901 = fragmentState.f6747;
        abstractComponentCallbacksC2338M4423.f6891 = fragmentState.f6748;
        abstractComponentCallbacksC2338M4423.f6889 = true;
        abstractComponentCallbacksC2338M4423.f6886 = fragmentState.f6742;
        abstractComponentCallbacksC2338M4423.f6885 = fragmentState.f6741;
        abstractComponentCallbacksC2338M4423.f6888 = fragmentState.f6745;
        abstractComponentCallbacksC2338M4423.f6884 = fragmentState.f6746;
        abstractComponentCallbacksC2338M4423.f6892 = fragmentState.f6743;
        abstractComponentCallbacksC2338M4423.f6883 = fragmentState.f6744;
        abstractComponentCallbacksC2338M4423.f6887 = fragmentState.f6740;
        abstractComponentCallbacksC2338M4423.f6918 = Lifecycle$State.values()[fragmentState.f6739];
        abstractComponentCallbacksC2338M4423.f6903 = fragmentState.f6738;
        abstractComponentCallbacksC2338M4423.f6904 = fragmentState.f6737;
        abstractComponentCallbacksC2338M4423.f6878 = fragmentState.f6736;
        this.f6754 = abstractComponentCallbacksC2338M4423;
        abstractComponentCallbacksC2338M4423.f6907 = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC2338M4423.m4439(bundle2);
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC2338M4423);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4331() {
        String resourceName;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (abstractComponentCallbacksC2338.f6891) {
            return;
        }
        if (AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC2338);
        }
        Bundle bundle = abstractComponentCallbacksC2338.f6907;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterMo4450 = abstractComponentCallbacksC2338.mo4450(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC2338.f6882;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC2338.f6885;
            if (i != 0) {
                if (i == -1) {
                    C8791.m14472(abstractComponentCallbacksC2338, "Cannot create fragment ", " for a container view with no id");
                    return;
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC2338.f6898.f6792.mo4417(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC2338.f6889) {
                        try {
                            resourceName = abstractComponentCallbacksC2338.m4435().getResources().getResourceName(abstractComponentCallbacksC2338.f6885);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC2338.f6885) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC2338);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C7623 c7623 = AbstractC7622.f20652;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(abstractComponentCallbacksC2338, viewGroup);
                    AbstractC7622.m12855(wrongFragmentContainerViolation);
                    C7623 c7623M12857 = AbstractC7622.m12857(abstractComponentCallbacksC2338);
                    if (c7623M12857.f20655.contains(FragmentStrictMode$Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && AbstractC7622.m12853(c7623M12857, abstractComponentCallbacksC2338.getClass(), WrongFragmentContainerViolation.class)) {
                        AbstractC7622.m12856(c7623M12857, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        abstractComponentCallbacksC2338.f6882 = viewGroup;
        abstractComponentCallbacksC2338.mo4437(layoutInflaterMo4450, viewGroup, bundle2);
        if (abstractComponentCallbacksC2338.f6881 != null) {
            if (AbstractC2313.m4362(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC2338);
            }
            abstractComponentCallbacksC2338.f6881.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC2338.f6881.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC2338);
            if (viewGroup != null) {
                m4335();
            }
            if (abstractComponentCallbacksC2338.f6887) {
                abstractComponentCallbacksC2338.f6881.setVisibility(8);
            }
            View view = abstractComponentCallbacksC2338.f6881;
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            boolean zIsAttachedToWindow = view.isAttachedToWindow();
            View view2 = abstractComponentCallbacksC2338.f6881;
            if (zIsAttachedToWindow) {
                view2.requestApplyInsets();
            } else {
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2307(view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC2338.f6907;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC2338.f6896.m4390(2);
            this.f6756.m263(false);
            int visibility = abstractComponentCallbacksC2338.f6881.getVisibility();
            abstractComponentCallbacksC2338.m4444().f6871 = abstractComponentCallbacksC2338.f6881.getAlpha();
            if (abstractComponentCallbacksC2338.f6882 != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC2338.f6881.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC2338.m4444().f6869 = viewFindFocus;
                    if (AbstractC2313.m4362(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC2338);
                    }
                }
                abstractComponentCallbacksC2338.f6881.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC2338.f6909 = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4332() {
        Bundle bundle;
        boolean zM4362 = AbstractC2313.m4362(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (zM4362) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC2338);
        }
        Bundle bundle2 = abstractComponentCallbacksC2338.f6907;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC2338.f6920) {
            abstractComponentCallbacksC2338.f6909 = 1;
            Bundle bundle4 = abstractComponentCallbacksC2338.f6907;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC2338.f6896.m4368(bundle);
            C2309 c2309 = abstractComponentCallbacksC2338.f6896;
            c2309.f6779 = false;
            c2309.f6778 = false;
            c2309.f6768.f6763 = false;
            c2309.m4390(1);
            return;
        }
        C0076 c0076 = this.f6756;
        c0076.m265(false);
        abstractComponentCallbacksC2338.f6896.m4372();
        abstractComponentCallbacksC2338.f6909 = 1;
        abstractComponentCallbacksC2338.f6879 = false;
        abstractComponentCallbacksC2338.f6919.mo4503(new C2342(abstractComponentCallbacksC2338));
        abstractComponentCallbacksC2338.mo4454(bundle3);
        abstractComponentCallbacksC2338.f6920 = true;
        if (!abstractComponentCallbacksC2338.f6879) {
            C2308.m4356(abstractComponentCallbacksC2338, " did not call through to super.onCreate()");
        } else {
            abstractComponentCallbacksC2338.f6919.m4499(Lifecycle$Event.ON_CREATE);
            c0076.m277(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4333() {
        Object next;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (abstractComponentCallbacksC2338.f6898 == null) {
            return abstractComponentCallbacksC2338.f6909;
        }
        int iMin = this.f6752;
        int i = AbstractC2303.f6751[abstractComponentCallbacksC2338.f6918.ordinal()];
        if (i != 1) {
            iMin = i != 2 ? i != 3 ? i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        if (abstractComponentCallbacksC2338.f6891) {
            boolean z = abstractComponentCallbacksC2338.f6890;
            int i2 = this.f6752;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = abstractComponentCallbacksC2338.f6881;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, abstractComponentCallbacksC2338.f6909) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC2338.f6893) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC2338.f6882;
        if (viewGroup != null) {
            C2349 c2349M4467 = C2349.m4467(viewGroup, abstractComponentCallbacksC2338.m4459());
            C2357 c2357M4469 = c2349M4467.m4469(abstractComponentCallbacksC2338);
            SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = c2357M4469 != null ? c2357M4469.f6982 : null;
            Iterator it = c2349M4467.f6955.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C2357 c2357 = (C2357) next;
                if (AbstractC4395.m8907(c2357.f6981, abstractComponentCallbacksC2338) && !c2357.f6978) {
                    break;
                }
            }
            C2357 c23572 = (C2357) next;
            specialEffectsController$Operation$LifecycleImpact = c23572 != null ? c23572.f6982 : null;
            int i3 = specialEffectsController$Operation$LifecycleImpact == null ? -1 : AbstractC2351.f6960[specialEffectsController$Operation$LifecycleImpact.ordinal()];
            if (i3 != -1 && i3 != 1) {
                specialEffectsController$Operation$LifecycleImpact = specialEffectsController$Operation$LifecycleImpact;
            }
        }
        if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC2338.f6892) {
            iMin = abstractComponentCallbacksC2338.m4453() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC2338.f6877 && abstractComponentCallbacksC2338.f6909 < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC2338);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4334() {
        C2304 c2304;
        boolean zM4362 = AbstractC2313.m4362(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (zM4362) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC2338);
        }
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = abstractComponentCallbacksC2338.f6906;
        C0325 c0325 = this.f6755;
        if (abstractComponentCallbacksC23382 != null) {
            c2304 = (C2304) ((HashMap) c0325.f1096).get(abstractComponentCallbacksC23382.f6901);
            if (c2304 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC2338);
                C2308.m4352(sb, " declared target fragment ", abstractComponentCallbacksC2338.f6906, " that does not belong to this FragmentManager!");
                return;
            }
            abstractComponentCallbacksC2338.f6903 = abstractComponentCallbacksC2338.f6906.f6901;
            abstractComponentCallbacksC2338.f6906 = null;
        } else {
            String str = abstractComponentCallbacksC2338.f6903;
            if (str != null) {
                c2304 = (C2304) ((HashMap) c0325.f1096).get(str);
                if (c2304 == null) {
                    StringBuilder sb2 = new StringBuilder("Fragment ");
                    sb2.append(abstractComponentCallbacksC2338);
                    sb2.append(" declared target fragment ");
                    C5925.m11311(AbstractC0053.m151(sb2, abstractComponentCallbacksC2338.f6903, " that does not belong to this FragmentManager!"));
                    return;
                }
            } else {
                c2304 = null;
            }
        }
        if (c2304 != null) {
            c2304.m4344();
        }
        AbstractC2313 abstractC2313 = abstractComponentCallbacksC2338.f6898;
        abstractComponentCallbacksC2338.f6897 = abstractC2313.f6791;
        abstractComponentCallbacksC2338.f6895 = abstractC2313.f6789;
        C0076 c0076 = this.f6756;
        c0076.m273(false);
        ArrayList arrayList = abstractComponentCallbacksC2338.f6911;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC23383 = ((C2344) ((AbstractC2333) it.next())).f6942;
            abstractComponentCallbacksC23383.f6912.m12759();
            AbstractC2435.m4530(abstractComponentCallbacksC23383);
            Bundle bundle = abstractComponentCallbacksC23383.f6907;
            abstractComponentCallbacksC23383.f6912.m12758(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        abstractComponentCallbacksC2338.f6896.m4388(abstractComponentCallbacksC2338.f6897, abstractComponentCallbacksC2338.mo4445(), abstractComponentCallbacksC2338);
        abstractComponentCallbacksC2338.f6909 = 0;
        abstractComponentCallbacksC2338.f6879 = false;
        abstractComponentCallbacksC2338.mo4457(abstractComponentCallbacksC2338.f6897.f6816);
        if (!abstractComponentCallbacksC2338.f6879) {
            C2308.m4356(abstractComponentCallbacksC2338, " did not call through to super.onAttach()");
            return;
        }
        Iterator it2 = abstractComponentCallbacksC2338.f6898.f6793.iterator();
        while (it2.hasNext()) {
            ((InterfaceC2305) it2.next()).mo4348(abstractComponentCallbacksC2338);
        }
        C2309 c2309 = abstractComponentCallbacksC2338.f6896;
        c2309.f6779 = false;
        c2309.f6778 = false;
        c2309.f6768.f6763 = false;
        c2309.m4390(0);
        c0076.m278(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4335() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338;
        View view;
        View view2;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = this.f6754;
        View view3 = abstractComponentCallbacksC23382.f6882;
        while (true) {
            abstractComponentCallbacksC2338 = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC23383 = tag instanceof AbstractComponentCallbacksC2338 ? (AbstractComponentCallbacksC2338) tag : null;
            if (abstractComponentCallbacksC23383 != null) {
                abstractComponentCallbacksC2338 = abstractComponentCallbacksC23383;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23384 = abstractComponentCallbacksC23382.f6895;
        if (abstractComponentCallbacksC2338 != null && abstractComponentCallbacksC2338 != abstractComponentCallbacksC23384) {
            int i = abstractComponentCallbacksC23382.f6885;
            C7623 c7623 = AbstractC7622.f20652;
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(abstractComponentCallbacksC23382, abstractComponentCallbacksC2338, i);
            AbstractC7622.m12855(wrongNestedHierarchyViolation);
            C7623 c7623M12857 = AbstractC7622.m12857(abstractComponentCallbacksC23382);
            if (c7623M12857.f20655.contains(FragmentStrictMode$Flag.DETECT_WRONG_NESTED_HIERARCHY) && AbstractC7622.m12853(c7623M12857, abstractComponentCallbacksC23382.getClass(), WrongNestedHierarchyViolation.class)) {
                AbstractC7622.m12856(c7623M12857, wrongNestedHierarchyViolation);
            }
        }
        ArrayList arrayList = (ArrayList) this.f6755.f1095;
        ViewGroup viewGroup = abstractComponentCallbacksC23382.f6882;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC23382);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23385 = (AbstractComponentCallbacksC2338) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC23385.f6882 == viewGroup && (view = abstractComponentCallbacksC23385.f6881) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC23386 = (AbstractComponentCallbacksC2338) arrayList.get(i2);
                    if (abstractComponentCallbacksC23386.f6882 == viewGroup && (view2 = abstractComponentCallbacksC23386.f6881) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC23382.f6882.addView(abstractComponentCallbacksC23382.f6881, iIndexOfChild);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4336() {
        boolean zM4362 = AbstractC2313.m4362(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (zM4362) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC2338);
        }
        Bundle bundle = abstractComponentCallbacksC2338.f6907;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC2338.f6896.m4372();
        abstractComponentCallbacksC2338.f6909 = 3;
        abstractComponentCallbacksC2338.f6879 = false;
        abstractComponentCallbacksC2338.mo4452();
        if (!abstractComponentCallbacksC2338.f6879) {
            C2308.m4356(abstractComponentCallbacksC2338, " did not call through to super.onActivityCreated()");
            return;
        }
        if (AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC2338);
        }
        if (abstractComponentCallbacksC2338.f6881 != null) {
            Bundle bundle2 = abstractComponentCallbacksC2338.f6907;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC2338.f6908;
            if (sparseArray != null) {
                abstractComponentCallbacksC2338.f6881.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC2338.f6908 = null;
            }
            abstractComponentCallbacksC2338.f6879 = false;
            abstractComponentCallbacksC2338.mo4438(bundle3);
            if (!abstractComponentCallbacksC2338.f6879) {
                C2308.m4356(abstractComponentCallbacksC2338, " did not call through to super.onViewStateRestored()");
                return;
            } else if (abstractComponentCallbacksC2338.f6881 != null) {
                abstractComponentCallbacksC2338.f6915.m4477(Lifecycle$Event.ON_CREATE);
            }
        }
        abstractComponentCallbacksC2338.f6907 = null;
        C2309 c2309 = abstractComponentCallbacksC2338.f6896;
        c2309.f6779 = false;
        c2309.f6778 = false;
        c2309.f6768.f6763 = false;
        c2309.m4390(4);
        this.f6756.m268(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4337() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC2313.m4362(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.飘花落叶言子楪兰苏哲世 r2 = r7.f6754
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            androidx.fragment.app.飘花落叶言子楪兰世苏哲 r0 = r2.f6917
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f6869
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.f6881
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.f6881
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = androidx.fragment.app.AbstractC2313.m4362(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L55
            java.lang.String r0 = "succeeded"
            goto L57
        L55:
            java.lang.String r0 = "failed"
        L57:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.f6881
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            androidx.fragment.app.飘花落叶言子楪兰世苏哲 r0 = r2.m4444()
            r0.f6869 = r3
            androidx.fragment.app.飘花落叶言子世哲兰楪苏 r0 = r2.f6896
            r0.m4372()
            androidx.fragment.app.飘花落叶言子世哲兰楪苏 r0 = r2.f6896
            r1 = 1
            r0.m4379(r1)
            r0 = 7
            r2.f6909 = r0
            r2.f6879 = r1
            androidx.lifecycle.飘花落叶言子世苏兰楪哲 r1 = r2.f6919
            androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle$Event.ON_RESUME
            r1.m4499(r4)
            android.view.View r1 = r2.f6881
            if (r1 == 0) goto La5
            androidx.fragment.app.飘花落叶言子苏楪世兰哲 r1 = r2.f6915
            androidx.lifecycle.飘花落叶言子世苏兰楪哲 r1 = r1.f6963
            r1.m4499(r4)
        La5:
            androidx.fragment.app.飘花落叶言子世哲兰楪苏 r1 = r2.f6896
            r4 = 0
            r1.f6779 = r4
            r1.f6778 = r4
            androidx.fragment.app.飘花落叶言子世兰楪苏哲 r5 = r1.f6768
            r5.f6763 = r4
            r1.m4390(r0)
            androidx.appcompat.app.飘花落叶言子世楪苏兰哲 r0 = r7.f6756
            r0.m264(r4)
            androidx.compose.animation.core.飘花落叶言子哲楪苏世兰 r7 = r7.f6755
            java.lang.String r0 = r2.f6901
            r7.m996(r0, r3)
            r2.f6907 = r3
            r2.f6908 = r3
            r2.f6902 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2304.m4337():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4338(ClassLoader classLoader) {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        Bundle bundle = abstractComponentCallbacksC2338.f6907;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC2338.f6907.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC2338.f6907.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC2338.f6908 = abstractComponentCallbacksC2338.f6907.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC2338.f6902 = abstractComponentCallbacksC2338.f6907.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) abstractComponentCallbacksC2338.f6907.getParcelable("state");
        if (fragmentState != null) {
            abstractComponentCallbacksC2338.f6903 = fragmentState.f6738;
            abstractComponentCallbacksC2338.f6904 = fragmentState.f6737;
            abstractComponentCallbacksC2338.f6878 = fragmentState.f6736;
        }
        if (abstractComponentCallbacksC2338.f6878) {
            return;
        }
        abstractComponentCallbacksC2338.f6877 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m4339() {
        boolean zM4362 = AbstractC2313.m4362(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (zM4362) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC2338);
        }
        C2309 c2309 = abstractComponentCallbacksC2338.f6896;
        c2309.f6778 = true;
        c2309.f6768.f6763 = true;
        c2309.m4390(4);
        if (abstractComponentCallbacksC2338.f6881 != null) {
            abstractComponentCallbacksC2338.f6915.m4477(Lifecycle$Event.ON_STOP);
        }
        abstractComponentCallbacksC2338.f6919.m4499(Lifecycle$Event.ON_STOP);
        abstractComponentCallbacksC2338.f6909 = 4;
        abstractComponentCallbacksC2338.f6879 = false;
        abstractComponentCallbacksC2338.mo4449();
        if (abstractComponentCallbacksC2338.f6879) {
            this.f6756.m262(false);
        } else {
            C2308.m4356(abstractComponentCallbacksC2338, " did not call through to super.onStop()");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m4340() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (abstractComponentCallbacksC2338.f6881 == null) {
            return;
        }
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC2338 + " with view " + abstractComponentCallbacksC2338.f6881);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC2338.f6881.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC2338.f6908 = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC2338.f6915.f6965.m12757(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC2338.f6902 = bundle;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m4341() {
        boolean zM4362 = AbstractC2313.m4362(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (zM4362) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6896.m4372();
        abstractComponentCallbacksC2338.f6896.m4379(true);
        abstractComponentCallbacksC2338.f6909 = 5;
        abstractComponentCallbacksC2338.f6879 = false;
        abstractComponentCallbacksC2338.mo4448();
        if (!abstractComponentCallbacksC2338.f6879) {
            C2308.m4356(abstractComponentCallbacksC2338, " did not call through to super.onStart()");
            return;
        }
        C2386 c2386 = abstractComponentCallbacksC2338.f6919;
        Lifecycle$Event lifecycle$Event = Lifecycle$Event.ON_START;
        c2386.m4499(lifecycle$Event);
        if (abstractComponentCallbacksC2338.f6881 != null) {
            abstractComponentCallbacksC2338.f6915.f6963.m4499(lifecycle$Event);
        }
        C2309 c2309 = abstractComponentCallbacksC2338.f6896;
        c2309.f6779 = false;
        c2309.f6778 = false;
        c2309.f6768.f6763 = false;
        c2309.m4390(5);
        this.f6756.m266(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4342() {
        View view;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC2338);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC2338.f6882;
        if (viewGroup != null && (view = abstractComponentCallbacksC2338.f6881) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC2338.f6896.m4390(1);
        if (abstractComponentCallbacksC2338.f6881 != null) {
            C2355 c2355 = abstractComponentCallbacksC2338.f6915;
            c2355.m4476();
            if (c2355.f6963.f7019.isAtLeast(Lifecycle$State.CREATED)) {
                abstractComponentCallbacksC2338.f6915.m4477(Lifecycle$Event.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC2338.f6909 = 1;
        abstractComponentCallbacksC2338.f6879 = false;
        abstractComponentCallbacksC2338.mo4447();
        if (!abstractComponentCallbacksC2338.f6879) {
            C2308.m4356(abstractComponentCallbacksC2338, " did not call through to super.onDestroyView()");
            return;
        }
        C2423 viewModelStore = abstractComponentCallbacksC2338.getViewModelStore();
        C7545 c7545 = C7544.f20425;
        viewModelStore.getClass();
        C7637 c7637 = C7637.f20725;
        c7637.getClass();
        C0325 c0325 = new C0325(viewModelStore, c7545, c7637);
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C7544.class);
        String strMo8885 = interfaceC5093Mo8917.mo8885();
        if (strMo8885 == null) {
            C5925.m11310("Local and anonymous classes can not be ViewModels");
            return;
        }
        C0282 c0282 = ((C7544) c0325.m959("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8885), interfaceC5093Mo8917)).f20426;
        if (c0282.f991 > 0) {
            c0282.m857(0).getClass();
            C2942.m6394();
            return;
        }
        abstractComponentCallbacksC2338.f6900 = false;
        this.f6756.m259(false);
        abstractComponentCallbacksC2338.f6882 = null;
        abstractComponentCallbacksC2338.f6881 = null;
        abstractComponentCallbacksC2338.f6915 = null;
        C2374 c2374 = abstractComponentCallbacksC2338.f6914;
        c2374.getClass();
        AbstractC2375.m4492("setValue");
        c2374.f7006++;
        c2374.f7000 = null;
        c2374.m4494(null);
        abstractComponentCallbacksC2338.f6890 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4343() {
        boolean z;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M976;
        boolean zM4362 = AbstractC2313.m4362(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (zM4362) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC2338);
        }
        boolean z2 = abstractComponentCallbacksC2338.f6892 && !abstractComponentCallbacksC2338.m4453();
        C0325 c0325 = this.f6755;
        if (z2) {
            c0325.m996(abstractComponentCallbacksC2338.f6901, null);
        }
        if (!z2) {
            C2306 c2306 = (C2306) c0325.f1093;
            if (!((c2306.f6762.containsKey(abstractComponentCallbacksC2338.f6901) && c2306.f6759) ? c2306.f6758 : true)) {
                String str = abstractComponentCallbacksC2338.f6903;
                if (str != null && (abstractComponentCallbacksC2338M976 = c0325.m976(str)) != null && abstractComponentCallbacksC2338M976.f6884) {
                    abstractComponentCallbacksC2338.f6906 = abstractComponentCallbacksC2338M976;
                }
                abstractComponentCallbacksC2338.f6909 = 0;
                return;
            }
        }
        C2319 c2319 = abstractComponentCallbacksC2338.f6897;
        if (c2319 != null) {
            z = ((C2306) c0325.f1093).f6758;
        } else {
            z = c2319.f6816 != null ? !r6.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((C2306) c0325.f1093).m4351(abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6896.m4404();
        abstractComponentCallbacksC2338.f6919.m4499(Lifecycle$Event.ON_DESTROY);
        abstractComponentCallbacksC2338.f6909 = 0;
        abstractComponentCallbacksC2338.f6920 = false;
        abstractComponentCallbacksC2338.f6879 = true;
        this.f6756.m276(false);
        for (C2304 c2304 : c0325.m965()) {
            if (c2304 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6754;
                if (abstractComponentCallbacksC2338.f6901.equals(abstractComponentCallbacksC23382.f6903)) {
                    abstractComponentCallbacksC23382.f6906 = abstractComponentCallbacksC2338;
                    abstractComponentCallbacksC23382.f6903 = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC2338.f6903;
        if (str2 != null) {
            abstractComponentCallbacksC2338.f6906 = c0325.m976(str2);
        }
        c0325.m958(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4344() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C0325 c0325 = this.f6755;
        boolean z = this.f6753;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (z) {
            if (AbstractC2313.m4362(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC2338);
                return;
            }
            return;
        }
        try {
            this.f6753 = true;
            boolean z2 = false;
            while (true) {
                int iM4333 = m4333();
                int i = abstractComponentCallbacksC2338.f6909;
                if (iM4333 == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC2338.f6892 && !abstractComponentCallbacksC2338.m4453()) {
                        if (AbstractC2313.m4362(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC2338);
                        }
                        ((C2306) c0325.f1093).m4351(abstractComponentCallbacksC2338);
                        c0325.m958(this);
                        if (AbstractC2313.m4362(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC2338);
                        }
                        abstractComponentCallbacksC2338.m4463();
                    }
                    if (abstractComponentCallbacksC2338.f6916) {
                        if (abstractComponentCallbacksC2338.f6881 != null && (viewGroup = abstractComponentCallbacksC2338.f6882) != null) {
                            C2349 c2349M4467 = C2349.m4467(viewGroup, abstractComponentCallbacksC2338.m4459());
                            if (abstractComponentCallbacksC2338.f6887) {
                                if (AbstractC2313.m4362(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC2338);
                                }
                                c2349M4467.m4472(SpecialEffectsController$Operation$State.GONE, SpecialEffectsController$Operation$LifecycleImpact.NONE, this);
                            } else {
                                if (AbstractC2313.m4362(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC2338);
                                }
                                c2349M4467.m4472(SpecialEffectsController$Operation$State.VISIBLE, SpecialEffectsController$Operation$LifecycleImpact.NONE, this);
                            }
                        }
                        AbstractC2313 abstractC2313 = abstractComponentCallbacksC2338.f6898;
                        if (abstractC2313 != null && abstractComponentCallbacksC2338.f6893 && AbstractC2313.m4361(abstractComponentCallbacksC2338)) {
                            abstractC2313.f6780 = true;
                        }
                        abstractComponentCallbacksC2338.f6916 = false;
                        abstractComponentCallbacksC2338.f6896.m4396();
                    }
                    this.f6753 = false;
                    return;
                }
                if (iM4333 <= i) {
                    switch (i - 1) {
                        case -1:
                            m4346();
                            break;
                        case 0:
                            m4343();
                            break;
                        case 1:
                            m4342();
                            abstractComponentCallbacksC2338.f6909 = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC2338.f6890 = false;
                            abstractComponentCallbacksC2338.f6909 = 2;
                            break;
                        case 3:
                            if (AbstractC2313.m4362(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC2338);
                            }
                            if (abstractComponentCallbacksC2338.f6881 != null && abstractComponentCallbacksC2338.f6908 == null) {
                                m4340();
                            }
                            if (abstractComponentCallbacksC2338.f6881 != null && (viewGroup2 = abstractComponentCallbacksC2338.f6882) != null) {
                                C2349 c2349M44672 = C2349.m4467(viewGroup2, abstractComponentCallbacksC2338.m4459());
                                if (AbstractC2313.m4362(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC2338);
                                }
                                c2349M44672.m4472(SpecialEffectsController$Operation$State.REMOVED, SpecialEffectsController$Operation$LifecycleImpact.REMOVING, this);
                            }
                            abstractComponentCallbacksC2338.f6909 = 3;
                            break;
                        case 4:
                            m4339();
                            break;
                        case 5:
                            abstractComponentCallbacksC2338.f6909 = 5;
                            break;
                        case 6:
                            m4345();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m4334();
                            break;
                        case 1:
                            m4332();
                            break;
                        case 2:
                            m4347();
                            m4331();
                            break;
                        case 3:
                            m4336();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC2338.f6881 != null && (viewGroup3 = abstractComponentCallbacksC2338.f6882) != null) {
                                C2349 c2349M44673 = C2349.m4467(viewGroup3, abstractComponentCallbacksC2338.m4459());
                                SpecialEffectsController$Operation$State specialEffectsController$Operation$StateFrom = SpecialEffectsController$Operation$State.from(abstractComponentCallbacksC2338.f6881.getVisibility());
                                specialEffectsController$Operation$StateFrom.getClass();
                                if (AbstractC2313.m4362(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC2338);
                                }
                                c2349M44673.m4472(specialEffectsController$Operation$StateFrom, SpecialEffectsController$Operation$LifecycleImpact.ADDING, this);
                            }
                            abstractComponentCallbacksC2338.f6909 = 4;
                            break;
                        case 5:
                            m4341();
                            break;
                        case 6:
                            abstractComponentCallbacksC2338.f6909 = 6;
                            break;
                        case 7:
                            m4337();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.f6753 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4345() {
        boolean zM4362 = AbstractC2313.m4362(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (zM4362) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6896.m4390(5);
        if (abstractComponentCallbacksC2338.f6881 != null) {
            abstractComponentCallbacksC2338.f6915.m4477(Lifecycle$Event.ON_PAUSE);
        }
        abstractComponentCallbacksC2338.f6919.m4499(Lifecycle$Event.ON_PAUSE);
        abstractComponentCallbacksC2338.f6909 = 6;
        abstractComponentCallbacksC2338.f6879 = true;
        this.f6756.m274(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4346() {
        boolean zM4362 = AbstractC2313.m4362(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (zM4362) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6909 = -1;
        abstractComponentCallbacksC2338.f6879 = false;
        abstractComponentCallbacksC2338.mo4446();
        if (!abstractComponentCallbacksC2338.f6879) {
            C2308.m4356(abstractComponentCallbacksC2338, " did not call through to super.onDetach()");
            return;
        }
        C2309 c2309 = abstractComponentCallbacksC2338.f6896;
        if (!c2309.f6777) {
            c2309.m4404();
            abstractComponentCallbacksC2338.f6896 = new C2309();
        }
        this.f6756.m275(false);
        abstractComponentCallbacksC2338.f6909 = -1;
        abstractComponentCallbacksC2338.f6897 = null;
        abstractComponentCallbacksC2338.f6895 = null;
        abstractComponentCallbacksC2338.f6898 = null;
        if (!abstractComponentCallbacksC2338.f6892 || abstractComponentCallbacksC2338.m4453()) {
            C2306 c2306 = (C2306) this.f6755.f1093;
            if (!((c2306.f6762.containsKey(abstractComponentCallbacksC2338.f6901) && c2306.f6759) ? c2306.f6758 : true)) {
                return;
            }
        }
        if (AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.m4463();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4347() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6754;
        if (abstractComponentCallbacksC2338.f6891 && abstractComponentCallbacksC2338.f6890 && !abstractComponentCallbacksC2338.f6900) {
            if (AbstractC2313.m4362(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC2338);
            }
            Bundle bundle = abstractComponentCallbacksC2338.f6907;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC2338.mo4437(abstractComponentCallbacksC2338.mo4450(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC2338.f6881;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC2338.f6881.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC2338);
                if (abstractComponentCallbacksC2338.f6887) {
                    abstractComponentCallbacksC2338.f6881.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC2338.f6907;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC2338.f6896.m4390(2);
                this.f6756.m263(false);
                abstractComponentCallbacksC2338.f6909 = 2;
            }
        }
    }

    public C2304(C0076 c0076, C0325 c0325, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f6756 = c0076;
        this.f6755 = c0325;
        this.f6754 = abstractComponentCallbacksC2338;
    }

    public C2304(C0076 c0076, C0325 c0325, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, Bundle bundle) {
        this.f6756 = c0076;
        this.f6755 = c0325;
        this.f6754 = abstractComponentCallbacksC2338;
        abstractComponentCallbacksC2338.f6908 = null;
        abstractComponentCallbacksC2338.f6902 = null;
        abstractComponentCallbacksC2338.f6899 = 0;
        abstractComponentCallbacksC2338.f6890 = false;
        abstractComponentCallbacksC2338.f6893 = false;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = abstractComponentCallbacksC2338.f6906;
        abstractComponentCallbacksC2338.f6903 = abstractComponentCallbacksC23382 != null ? abstractComponentCallbacksC23382.f6901 : null;
        abstractComponentCallbacksC2338.f6906 = null;
        abstractComponentCallbacksC2338.f6907 = bundle;
        abstractComponentCallbacksC2338.f6905 = bundle.getBundle("arguments");
    }
}
