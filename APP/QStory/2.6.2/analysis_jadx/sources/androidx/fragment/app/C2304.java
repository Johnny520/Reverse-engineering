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
import com.alibaba.fastjson2.C2941;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5092;
import p143.C7543;
import p143.C7544;
import p156.AbstractC7621;
import p156.C7622;
import p160.C7636;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2304 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 f6753;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0325 f6754;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0076 f6755;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f6752 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f6751 = -1;

    public C2304(C0076 c0076, C0325 c0325, ClassLoader classLoader, C2324 c2324, Bundle bundle) {
        this.f6755 = c0076;
        this.f6754 = c0325;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4413 = c2324.m4413(fragmentState.f6748);
        abstractComponentCallbacksC2338M4413.f6900 = fragmentState.f6746;
        abstractComponentCallbacksC2338M4413.f6890 = fragmentState.f6747;
        abstractComponentCallbacksC2338M4413.f6888 = true;
        abstractComponentCallbacksC2338M4413.f6885 = fragmentState.f6741;
        abstractComponentCallbacksC2338M4413.f6884 = fragmentState.f6740;
        abstractComponentCallbacksC2338M4413.f6887 = fragmentState.f6744;
        abstractComponentCallbacksC2338M4413.f6883 = fragmentState.f6745;
        abstractComponentCallbacksC2338M4413.f6891 = fragmentState.f6742;
        abstractComponentCallbacksC2338M4413.f6882 = fragmentState.f6743;
        abstractComponentCallbacksC2338M4413.f6886 = fragmentState.f6739;
        abstractComponentCallbacksC2338M4413.f6917 = Lifecycle$State.values()[fragmentState.f6738];
        abstractComponentCallbacksC2338M4413.f6902 = fragmentState.f6737;
        abstractComponentCallbacksC2338M4413.f6903 = fragmentState.f6736;
        abstractComponentCallbacksC2338M4413.f6877 = fragmentState.f6735;
        this.f6753 = abstractComponentCallbacksC2338M4413;
        abstractComponentCallbacksC2338M4413.f6906 = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC2338M4413.m4429(bundle2);
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC2338M4413);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4321() {
        String resourceName;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (abstractComponentCallbacksC2338.f6890) {
            return;
        }
        if (AbstractC2313.m4352(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC2338);
        }
        Bundle bundle = abstractComponentCallbacksC2338.f6906;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterMo4440 = abstractComponentCallbacksC2338.mo4440(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC2338.f6881;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC2338.f6884;
            if (i != 0) {
                if (i == -1) {
                    C8796.m14448(abstractComponentCallbacksC2338, "Cannot create fragment ", " for a container view with no id");
                    return;
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC2338.f6897.f6791.mo4407(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC2338.f6888) {
                        try {
                            resourceName = abstractComponentCallbacksC2338.m4425().getResources().getResourceName(abstractComponentCallbacksC2338.f6884);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC2338.f6884) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC2338);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C7622 c7622 = AbstractC7621.f20657;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(abstractComponentCallbacksC2338, viewGroup);
                    AbstractC7621.m12826(wrongFragmentContainerViolation);
                    C7622 c7622M12828 = AbstractC7621.m12828(abstractComponentCallbacksC2338);
                    if (c7622M12828.f20660.contains(FragmentStrictMode$Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && AbstractC7621.m12824(c7622M12828, abstractComponentCallbacksC2338.getClass(), WrongFragmentContainerViolation.class)) {
                        AbstractC7621.m12827(c7622M12828, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        abstractComponentCallbacksC2338.f6881 = viewGroup;
        abstractComponentCallbacksC2338.mo4427(layoutInflaterMo4440, viewGroup, bundle2);
        if (abstractComponentCallbacksC2338.f6880 != null) {
            if (AbstractC2313.m4352(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC2338);
            }
            abstractComponentCallbacksC2338.f6880.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC2338.f6880.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC2338);
            if (viewGroup != null) {
                m4325();
            }
            if (abstractComponentCallbacksC2338.f6886) {
                abstractComponentCallbacksC2338.f6880.setVisibility(8);
            }
            View view = abstractComponentCallbacksC2338.f6880;
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            boolean zIsAttachedToWindow = view.isAttachedToWindow();
            View view2 = abstractComponentCallbacksC2338.f6880;
            if (zIsAttachedToWindow) {
                view2.requestApplyInsets();
            } else {
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2307(view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC2338.f6906;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC2338.f6895.m4380(2);
            this.f6755.m262(false);
            int visibility = abstractComponentCallbacksC2338.f6880.getVisibility();
            abstractComponentCallbacksC2338.m4434().f6870 = abstractComponentCallbacksC2338.f6880.getAlpha();
            if (abstractComponentCallbacksC2338.f6881 != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC2338.f6880.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC2338.m4434().f6868 = viewFindFocus;
                    if (AbstractC2313.m4352(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC2338);
                    }
                }
                abstractComponentCallbacksC2338.f6880.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC2338.f6908 = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4322() {
        Bundle bundle;
        boolean zM4352 = AbstractC2313.m4352(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (zM4352) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC2338);
        }
        Bundle bundle2 = abstractComponentCallbacksC2338.f6906;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC2338.f6919) {
            abstractComponentCallbacksC2338.f6908 = 1;
            Bundle bundle4 = abstractComponentCallbacksC2338.f6906;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC2338.f6895.m4358(bundle);
            C2309 c2309 = abstractComponentCallbacksC2338.f6895;
            c2309.f6778 = false;
            c2309.f6777 = false;
            c2309.f6767.f6762 = false;
            c2309.m4380(1);
            return;
        }
        C0076 c0076 = this.f6755;
        c0076.m264(false);
        abstractComponentCallbacksC2338.f6895.m4362();
        abstractComponentCallbacksC2338.f6908 = 1;
        abstractComponentCallbacksC2338.f6878 = false;
        abstractComponentCallbacksC2338.f6918.mo4493(new C2342(abstractComponentCallbacksC2338));
        abstractComponentCallbacksC2338.mo4444(bundle3);
        abstractComponentCallbacksC2338.f6919 = true;
        if (!abstractComponentCallbacksC2338.f6878) {
            C2308.m4346(abstractComponentCallbacksC2338, " did not call through to super.onCreate()");
        } else {
            abstractComponentCallbacksC2338.f6918.m4489(Lifecycle$Event.ON_CREATE);
            c0076.m276(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4323() {
        Object next;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (abstractComponentCallbacksC2338.f6897 == null) {
            return abstractComponentCallbacksC2338.f6908;
        }
        int iMin = this.f6751;
        int i = AbstractC2303.f6750[abstractComponentCallbacksC2338.f6917.ordinal()];
        if (i != 1) {
            iMin = i != 2 ? i != 3 ? i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        if (abstractComponentCallbacksC2338.f6890) {
            boolean z = abstractComponentCallbacksC2338.f6889;
            int i2 = this.f6751;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = abstractComponentCallbacksC2338.f6880;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, abstractComponentCallbacksC2338.f6908) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC2338.f6892) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC2338.f6881;
        if (viewGroup != null) {
            C2349 c2349M4457 = C2349.m4457(viewGroup, abstractComponentCallbacksC2338.m4449());
            C2357 c2357M4459 = c2349M4457.m4459(abstractComponentCallbacksC2338);
            SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = c2357M4459 != null ? c2357M4459.f6981 : null;
            Iterator it = c2349M4457.f6954.iterator();
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
            C2357 c23572 = (C2357) next;
            specialEffectsController$Operation$LifecycleImpact = c23572 != null ? c23572.f6981 : null;
            int i3 = specialEffectsController$Operation$LifecycleImpact == null ? -1 : AbstractC2351.f6959[specialEffectsController$Operation$LifecycleImpact.ordinal()];
            if (i3 != -1 && i3 != 1) {
                specialEffectsController$Operation$LifecycleImpact = specialEffectsController$Operation$LifecycleImpact;
            }
        }
        if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC2338.f6891) {
            iMin = abstractComponentCallbacksC2338.m4443() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC2338.f6876 && abstractComponentCallbacksC2338.f6908 < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC2338);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4324() {
        C2304 c2304;
        boolean zM4352 = AbstractC2313.m4352(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (zM4352) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC2338);
        }
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = abstractComponentCallbacksC2338.f6905;
        C0325 c0325 = this.f6754;
        if (abstractComponentCallbacksC23382 != null) {
            c2304 = (C2304) ((HashMap) c0325.f1096).get(abstractComponentCallbacksC23382.f6900);
            if (c2304 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC2338);
                C2308.m4342(sb, " declared target fragment ", abstractComponentCallbacksC2338.f6905, " that does not belong to this FragmentManager!");
                return;
            }
            abstractComponentCallbacksC2338.f6902 = abstractComponentCallbacksC2338.f6905.f6900;
            abstractComponentCallbacksC2338.f6905 = null;
        } else {
            String str = abstractComponentCallbacksC2338.f6902;
            if (str != null) {
                c2304 = (C2304) ((HashMap) c0325.f1096).get(str);
                if (c2304 == null) {
                    StringBuilder sb2 = new StringBuilder("Fragment ");
                    sb2.append(abstractComponentCallbacksC2338);
                    sb2.append(" declared target fragment ");
                    C5919.m11250(AbstractC0053.m146(sb2, abstractComponentCallbacksC2338.f6902, " that does not belong to this FragmentManager!"));
                    return;
                }
            } else {
                c2304 = null;
            }
        }
        if (c2304 != null) {
            c2304.m4334();
        }
        AbstractC2313 abstractC2313 = abstractComponentCallbacksC2338.f6897;
        abstractComponentCallbacksC2338.f6896 = abstractC2313.f6790;
        abstractComponentCallbacksC2338.f6894 = abstractC2313.f6788;
        C0076 c0076 = this.f6755;
        c0076.m272(false);
        ArrayList arrayList = abstractComponentCallbacksC2338.f6910;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC23383 = ((C2344) ((AbstractC2333) it.next())).f6941;
            abstractComponentCallbacksC23383.f6911.m12730();
            AbstractC2435.m4520(abstractComponentCallbacksC23383);
            Bundle bundle = abstractComponentCallbacksC23383.f6906;
            abstractComponentCallbacksC23383.f6911.m12729(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        abstractComponentCallbacksC2338.f6895.m4378(abstractComponentCallbacksC2338.f6896, abstractComponentCallbacksC2338.mo4435(), abstractComponentCallbacksC2338);
        abstractComponentCallbacksC2338.f6908 = 0;
        abstractComponentCallbacksC2338.f6878 = false;
        abstractComponentCallbacksC2338.mo4447(abstractComponentCallbacksC2338.f6896.f6819);
        if (!abstractComponentCallbacksC2338.f6878) {
            C2308.m4346(abstractComponentCallbacksC2338, " did not call through to super.onAttach()");
            return;
        }
        Iterator it2 = abstractComponentCallbacksC2338.f6897.f6792.iterator();
        while (it2.hasNext()) {
            ((InterfaceC2305) it2.next()).mo4338(abstractComponentCallbacksC2338);
        }
        C2309 c2309 = abstractComponentCallbacksC2338.f6895;
        c2309.f6778 = false;
        c2309.f6777 = false;
        c2309.f6767.f6762 = false;
        c2309.m4380(0);
        c0076.m277(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4325() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338;
        View view;
        View view2;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = this.f6753;
        View view3 = abstractComponentCallbacksC23382.f6881;
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
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23384 = abstractComponentCallbacksC23382.f6894;
        if (abstractComponentCallbacksC2338 != null && abstractComponentCallbacksC2338 != abstractComponentCallbacksC23384) {
            int i = abstractComponentCallbacksC23382.f6884;
            C7622 c7622 = AbstractC7621.f20657;
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(abstractComponentCallbacksC23382, abstractComponentCallbacksC2338, i);
            AbstractC7621.m12826(wrongNestedHierarchyViolation);
            C7622 c7622M12828 = AbstractC7621.m12828(abstractComponentCallbacksC23382);
            if (c7622M12828.f20660.contains(FragmentStrictMode$Flag.DETECT_WRONG_NESTED_HIERARCHY) && AbstractC7621.m12824(c7622M12828, abstractComponentCallbacksC23382.getClass(), WrongNestedHierarchyViolation.class)) {
                AbstractC7621.m12827(c7622M12828, wrongNestedHierarchyViolation);
            }
        }
        ArrayList arrayList = (ArrayList) this.f6754.f1095;
        ViewGroup viewGroup = abstractComponentCallbacksC23382.f6881;
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
                        if (abstractComponentCallbacksC23385.f6881 == viewGroup && (view = abstractComponentCallbacksC23385.f6880) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC23386 = (AbstractComponentCallbacksC2338) arrayList.get(i2);
                    if (abstractComponentCallbacksC23386.f6881 == viewGroup && (view2 = abstractComponentCallbacksC23386.f6880) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC23382.f6881.addView(abstractComponentCallbacksC23382.f6880, iIndexOfChild);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4326() {
        boolean zM4352 = AbstractC2313.m4352(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (zM4352) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC2338);
        }
        Bundle bundle = abstractComponentCallbacksC2338.f6906;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC2338.f6895.m4362();
        abstractComponentCallbacksC2338.f6908 = 3;
        abstractComponentCallbacksC2338.f6878 = false;
        abstractComponentCallbacksC2338.mo4442();
        if (!abstractComponentCallbacksC2338.f6878) {
            C2308.m4346(abstractComponentCallbacksC2338, " did not call through to super.onActivityCreated()");
            return;
        }
        if (AbstractC2313.m4352(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC2338);
        }
        if (abstractComponentCallbacksC2338.f6880 != null) {
            Bundle bundle2 = abstractComponentCallbacksC2338.f6906;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC2338.f6907;
            if (sparseArray != null) {
                abstractComponentCallbacksC2338.f6880.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC2338.f6907 = null;
            }
            abstractComponentCallbacksC2338.f6878 = false;
            abstractComponentCallbacksC2338.mo4428(bundle3);
            if (!abstractComponentCallbacksC2338.f6878) {
                C2308.m4346(abstractComponentCallbacksC2338, " did not call through to super.onViewStateRestored()");
                return;
            } else if (abstractComponentCallbacksC2338.f6880 != null) {
                abstractComponentCallbacksC2338.f6914.m4467(Lifecycle$Event.ON_CREATE);
            }
        }
        abstractComponentCallbacksC2338.f6906 = null;
        C2309 c2309 = abstractComponentCallbacksC2338.f6895;
        c2309.f6778 = false;
        c2309.f6777 = false;
        c2309.f6767.f6762 = false;
        c2309.m4380(4);
        this.f6755.m267(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4327() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC2313.m4352(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.飘花落叶言子楪兰苏哲世 r2 = r7.f6753
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            androidx.fragment.app.飘花落叶言子楪兰世苏哲 r0 = r2.f6916
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f6868
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.f6880
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.f6880
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = androidx.fragment.app.AbstractC2313.m4352(r5)
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
            android.view.View r0 = r2.f6880
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            androidx.fragment.app.飘花落叶言子楪兰世苏哲 r0 = r2.m4434()
            r0.f6868 = r3
            androidx.fragment.app.飘花落叶言子世哲兰楪苏 r0 = r2.f6895
            r0.m4362()
            androidx.fragment.app.飘花落叶言子世哲兰楪苏 r0 = r2.f6895
            r1 = 1
            r0.m4369(r1)
            r0 = 7
            r2.f6908 = r0
            r2.f6878 = r1
            androidx.lifecycle.飘花落叶言子世苏兰楪哲 r1 = r2.f6918
            androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle$Event.ON_RESUME
            r1.m4489(r4)
            android.view.View r1 = r2.f6880
            if (r1 == 0) goto La5
            androidx.fragment.app.飘花落叶言子苏楪世兰哲 r1 = r2.f6914
            androidx.lifecycle.飘花落叶言子世苏兰楪哲 r1 = r1.f6962
            r1.m4489(r4)
        La5:
            androidx.fragment.app.飘花落叶言子世哲兰楪苏 r1 = r2.f6895
            r4 = 0
            r1.f6778 = r4
            r1.f6777 = r4
            androidx.fragment.app.飘花落叶言子世兰楪苏哲 r5 = r1.f6767
            r5.f6762 = r4
            r1.m4380(r0)
            androidx.appcompat.app.飘花落叶言子世楪苏兰哲 r0 = r7.f6755
            r0.m263(r4)
            androidx.compose.animation.core.飘花落叶言子哲楪苏世兰 r7 = r7.f6754
            java.lang.String r0 = r2.f6900
            r7.m995(r0, r3)
            r2.f6906 = r3
            r2.f6907 = r3
            r2.f6901 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2304.m4327():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4328(ClassLoader classLoader) {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        Bundle bundle = abstractComponentCallbacksC2338.f6906;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC2338.f6906.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC2338.f6906.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC2338.f6907 = abstractComponentCallbacksC2338.f6906.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC2338.f6901 = abstractComponentCallbacksC2338.f6906.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) abstractComponentCallbacksC2338.f6906.getParcelable("state");
        if (fragmentState != null) {
            abstractComponentCallbacksC2338.f6902 = fragmentState.f6737;
            abstractComponentCallbacksC2338.f6903 = fragmentState.f6736;
            abstractComponentCallbacksC2338.f6877 = fragmentState.f6735;
        }
        if (abstractComponentCallbacksC2338.f6877) {
            return;
        }
        abstractComponentCallbacksC2338.f6876 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m4329() {
        boolean zM4352 = AbstractC2313.m4352(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (zM4352) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC2338);
        }
        C2309 c2309 = abstractComponentCallbacksC2338.f6895;
        c2309.f6777 = true;
        c2309.f6767.f6762 = true;
        c2309.m4380(4);
        if (abstractComponentCallbacksC2338.f6880 != null) {
            abstractComponentCallbacksC2338.f6914.m4467(Lifecycle$Event.ON_STOP);
        }
        abstractComponentCallbacksC2338.f6918.m4489(Lifecycle$Event.ON_STOP);
        abstractComponentCallbacksC2338.f6908 = 4;
        abstractComponentCallbacksC2338.f6878 = false;
        abstractComponentCallbacksC2338.mo4439();
        if (abstractComponentCallbacksC2338.f6878) {
            this.f6755.m261(false);
        } else {
            C2308.m4346(abstractComponentCallbacksC2338, " did not call through to super.onStop()");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m4330() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (abstractComponentCallbacksC2338.f6880 == null) {
            return;
        }
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC2338 + " with view " + abstractComponentCallbacksC2338.f6880);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC2338.f6880.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC2338.f6907 = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC2338.f6914.f6964.m12728(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC2338.f6901 = bundle;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m4331() {
        boolean zM4352 = AbstractC2313.m4352(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (zM4352) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6895.m4362();
        abstractComponentCallbacksC2338.f6895.m4369(true);
        abstractComponentCallbacksC2338.f6908 = 5;
        abstractComponentCallbacksC2338.f6878 = false;
        abstractComponentCallbacksC2338.mo4438();
        if (!abstractComponentCallbacksC2338.f6878) {
            C2308.m4346(abstractComponentCallbacksC2338, " did not call through to super.onStart()");
            return;
        }
        C2386 c2386 = abstractComponentCallbacksC2338.f6918;
        Lifecycle$Event lifecycle$Event = Lifecycle$Event.ON_START;
        c2386.m4489(lifecycle$Event);
        if (abstractComponentCallbacksC2338.f6880 != null) {
            abstractComponentCallbacksC2338.f6914.f6962.m4489(lifecycle$Event);
        }
        C2309 c2309 = abstractComponentCallbacksC2338.f6895;
        c2309.f6778 = false;
        c2309.f6777 = false;
        c2309.f6767.f6762 = false;
        c2309.m4380(5);
        this.f6755.m265(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4332() {
        View view;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (AbstractC2313.m4352(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC2338);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC2338.f6881;
        if (viewGroup != null && (view = abstractComponentCallbacksC2338.f6880) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC2338.f6895.m4380(1);
        if (abstractComponentCallbacksC2338.f6880 != null) {
            C2355 c2355 = abstractComponentCallbacksC2338.f6914;
            c2355.m4466();
            if (c2355.f6962.f7018.isAtLeast(Lifecycle$State.CREATED)) {
                abstractComponentCallbacksC2338.f6914.m4467(Lifecycle$Event.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC2338.f6908 = 1;
        abstractComponentCallbacksC2338.f6878 = false;
        abstractComponentCallbacksC2338.mo4437();
        if (!abstractComponentCallbacksC2338.f6878) {
            C2308.m4346(abstractComponentCallbacksC2338, " did not call through to super.onDestroyView()");
            return;
        }
        C2423 viewModelStore = abstractComponentCallbacksC2338.getViewModelStore();
        C7544 c7544 = C7543.f20430;
        viewModelStore.getClass();
        C7636 c7636 = C7636.f20730;
        c7636.getClass();
        C0325 c0325 = new C0325(viewModelStore, c7544, c7636);
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C7543.class);
        String strMo8895 = interfaceC5092Mo8927.mo8895();
        if (strMo8895 == null) {
            C5919.m11249("Local and anonymous classes can not be ViewModels");
            return;
        }
        C0282 c0282 = ((C7543) c0325.m958("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8895), interfaceC5092Mo8927)).f20431;
        if (c0282.f991 > 0) {
            c0282.m856(0).getClass();
            C2941.m6336();
            return;
        }
        abstractComponentCallbacksC2338.f6899 = false;
        this.f6755.m258(false);
        abstractComponentCallbacksC2338.f6881 = null;
        abstractComponentCallbacksC2338.f6880 = null;
        abstractComponentCallbacksC2338.f6914 = null;
        C2374 c2374 = abstractComponentCallbacksC2338.f6913;
        c2374.getClass();
        AbstractC2375.m4482("setValue");
        c2374.f7005++;
        c2374.f6999 = null;
        c2374.m4484(null);
        abstractComponentCallbacksC2338.f6889 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4333() {
        boolean z;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M976;
        boolean zM4352 = AbstractC2313.m4352(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (zM4352) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC2338);
        }
        boolean z2 = abstractComponentCallbacksC2338.f6891 && !abstractComponentCallbacksC2338.m4443();
        C0325 c0325 = this.f6754;
        if (z2) {
            c0325.m995(abstractComponentCallbacksC2338.f6900, null);
        }
        if (!z2) {
            C2306 c2306 = (C2306) c0325.f1093;
            if (!((c2306.f6761.containsKey(abstractComponentCallbacksC2338.f6900) && c2306.f6758) ? c2306.f6757 : true)) {
                String str = abstractComponentCallbacksC2338.f6902;
                if (str != null && (abstractComponentCallbacksC2338M976 = c0325.m976(str)) != null && abstractComponentCallbacksC2338M976.f6883) {
                    abstractComponentCallbacksC2338.f6905 = abstractComponentCallbacksC2338M976;
                }
                abstractComponentCallbacksC2338.f6908 = 0;
                return;
            }
        }
        C2319 c2319 = abstractComponentCallbacksC2338.f6896;
        if (c2319 != null) {
            z = ((C2306) c0325.f1093).f6757;
        } else {
            z = c2319.f6819 != null ? !r6.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((C2306) c0325.f1093).m4341(abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6895.m4394();
        abstractComponentCallbacksC2338.f6918.m4489(Lifecycle$Event.ON_DESTROY);
        abstractComponentCallbacksC2338.f6908 = 0;
        abstractComponentCallbacksC2338.f6919 = false;
        abstractComponentCallbacksC2338.f6878 = true;
        this.f6755.m275(false);
        for (C2304 c2304 : c0325.m964()) {
            if (c2304 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = c2304.f6753;
                if (abstractComponentCallbacksC2338.f6900.equals(abstractComponentCallbacksC23382.f6902)) {
                    abstractComponentCallbacksC23382.f6905 = abstractComponentCallbacksC2338;
                    abstractComponentCallbacksC23382.f6902 = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC2338.f6902;
        if (str2 != null) {
            abstractComponentCallbacksC2338.f6905 = c0325.m976(str2);
        }
        c0325.m957(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4334() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C0325 c0325 = this.f6754;
        boolean z = this.f6752;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (z) {
            if (AbstractC2313.m4352(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC2338);
                return;
            }
            return;
        }
        try {
            this.f6752 = true;
            boolean z2 = false;
            while (true) {
                int iM4323 = m4323();
                int i = abstractComponentCallbacksC2338.f6908;
                if (iM4323 == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC2338.f6891 && !abstractComponentCallbacksC2338.m4443()) {
                        if (AbstractC2313.m4352(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC2338);
                        }
                        ((C2306) c0325.f1093).m4341(abstractComponentCallbacksC2338);
                        c0325.m957(this);
                        if (AbstractC2313.m4352(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC2338);
                        }
                        abstractComponentCallbacksC2338.m4453();
                    }
                    if (abstractComponentCallbacksC2338.f6915) {
                        if (abstractComponentCallbacksC2338.f6880 != null && (viewGroup = abstractComponentCallbacksC2338.f6881) != null) {
                            C2349 c2349M4457 = C2349.m4457(viewGroup, abstractComponentCallbacksC2338.m4449());
                            if (abstractComponentCallbacksC2338.f6886) {
                                if (AbstractC2313.m4352(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC2338);
                                }
                                c2349M4457.m4462(SpecialEffectsController$Operation$State.GONE, SpecialEffectsController$Operation$LifecycleImpact.NONE, this);
                            } else {
                                if (AbstractC2313.m4352(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC2338);
                                }
                                c2349M4457.m4462(SpecialEffectsController$Operation$State.VISIBLE, SpecialEffectsController$Operation$LifecycleImpact.NONE, this);
                            }
                        }
                        AbstractC2313 abstractC2313 = abstractComponentCallbacksC2338.f6897;
                        if (abstractC2313 != null && abstractComponentCallbacksC2338.f6892 && AbstractC2313.m4351(abstractComponentCallbacksC2338)) {
                            abstractC2313.f6779 = true;
                        }
                        abstractComponentCallbacksC2338.f6915 = false;
                        abstractComponentCallbacksC2338.f6895.m4386();
                    }
                    this.f6752 = false;
                    return;
                }
                if (iM4323 <= i) {
                    switch (i - 1) {
                        case -1:
                            m4336();
                            break;
                        case 0:
                            m4333();
                            break;
                        case 1:
                            m4332();
                            abstractComponentCallbacksC2338.f6908 = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC2338.f6889 = false;
                            abstractComponentCallbacksC2338.f6908 = 2;
                            break;
                        case 3:
                            if (AbstractC2313.m4352(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC2338);
                            }
                            if (abstractComponentCallbacksC2338.f6880 != null && abstractComponentCallbacksC2338.f6907 == null) {
                                m4330();
                            }
                            if (abstractComponentCallbacksC2338.f6880 != null && (viewGroup2 = abstractComponentCallbacksC2338.f6881) != null) {
                                C2349 c2349M44572 = C2349.m4457(viewGroup2, abstractComponentCallbacksC2338.m4449());
                                if (AbstractC2313.m4352(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC2338);
                                }
                                c2349M44572.m4462(SpecialEffectsController$Operation$State.REMOVED, SpecialEffectsController$Operation$LifecycleImpact.REMOVING, this);
                            }
                            abstractComponentCallbacksC2338.f6908 = 3;
                            break;
                        case 4:
                            m4329();
                            break;
                        case 5:
                            abstractComponentCallbacksC2338.f6908 = 5;
                            break;
                        case 6:
                            m4335();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m4324();
                            break;
                        case 1:
                            m4322();
                            break;
                        case 2:
                            m4337();
                            m4321();
                            break;
                        case 3:
                            m4326();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC2338.f6880 != null && (viewGroup3 = abstractComponentCallbacksC2338.f6881) != null) {
                                C2349 c2349M44573 = C2349.m4457(viewGroup3, abstractComponentCallbacksC2338.m4449());
                                SpecialEffectsController$Operation$State specialEffectsController$Operation$StateFrom = SpecialEffectsController$Operation$State.from(abstractComponentCallbacksC2338.f6880.getVisibility());
                                specialEffectsController$Operation$StateFrom.getClass();
                                if (AbstractC2313.m4352(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC2338);
                                }
                                c2349M44573.m4462(specialEffectsController$Operation$StateFrom, SpecialEffectsController$Operation$LifecycleImpact.ADDING, this);
                            }
                            abstractComponentCallbacksC2338.f6908 = 4;
                            break;
                        case 5:
                            m4331();
                            break;
                        case 6:
                            abstractComponentCallbacksC2338.f6908 = 6;
                            break;
                        case 7:
                            m4327();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.f6752 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4335() {
        boolean zM4352 = AbstractC2313.m4352(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (zM4352) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6895.m4380(5);
        if (abstractComponentCallbacksC2338.f6880 != null) {
            abstractComponentCallbacksC2338.f6914.m4467(Lifecycle$Event.ON_PAUSE);
        }
        abstractComponentCallbacksC2338.f6918.m4489(Lifecycle$Event.ON_PAUSE);
        abstractComponentCallbacksC2338.f6908 = 6;
        abstractComponentCallbacksC2338.f6878 = true;
        this.f6755.m273(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4336() {
        boolean zM4352 = AbstractC2313.m4352(3);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (zM4352) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6908 = -1;
        abstractComponentCallbacksC2338.f6878 = false;
        abstractComponentCallbacksC2338.mo4436();
        if (!abstractComponentCallbacksC2338.f6878) {
            C2308.m4346(abstractComponentCallbacksC2338, " did not call through to super.onDetach()");
            return;
        }
        C2309 c2309 = abstractComponentCallbacksC2338.f6895;
        if (!c2309.f6776) {
            c2309.m4394();
            abstractComponentCallbacksC2338.f6895 = new C2309();
        }
        this.f6755.m274(false);
        abstractComponentCallbacksC2338.f6908 = -1;
        abstractComponentCallbacksC2338.f6896 = null;
        abstractComponentCallbacksC2338.f6894 = null;
        abstractComponentCallbacksC2338.f6897 = null;
        if (!abstractComponentCallbacksC2338.f6891 || abstractComponentCallbacksC2338.m4443()) {
            C2306 c2306 = (C2306) this.f6754.f1093;
            if (!((c2306.f6761.containsKey(abstractComponentCallbacksC2338.f6900) && c2306.f6758) ? c2306.f6757 : true)) {
                return;
            }
        }
        if (AbstractC2313.m4352(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.m4453();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4337() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6753;
        if (abstractComponentCallbacksC2338.f6890 && abstractComponentCallbacksC2338.f6889 && !abstractComponentCallbacksC2338.f6899) {
            if (AbstractC2313.m4352(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC2338);
            }
            Bundle bundle = abstractComponentCallbacksC2338.f6906;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC2338.mo4427(abstractComponentCallbacksC2338.mo4440(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC2338.f6880;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC2338.f6880.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC2338);
                if (abstractComponentCallbacksC2338.f6886) {
                    abstractComponentCallbacksC2338.f6880.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC2338.f6906;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC2338.f6895.m4380(2);
                this.f6755.m262(false);
                abstractComponentCallbacksC2338.f6908 = 2;
            }
        }
    }

    public C2304(C0076 c0076, C0325 c0325, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f6755 = c0076;
        this.f6754 = c0325;
        this.f6753 = abstractComponentCallbacksC2338;
    }

    public C2304(C0076 c0076, C0325 c0325, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, Bundle bundle) {
        this.f6755 = c0076;
        this.f6754 = c0325;
        this.f6753 = abstractComponentCallbacksC2338;
        abstractComponentCallbacksC2338.f6907 = null;
        abstractComponentCallbacksC2338.f6901 = null;
        abstractComponentCallbacksC2338.f6898 = 0;
        abstractComponentCallbacksC2338.f6889 = false;
        abstractComponentCallbacksC2338.f6892 = false;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = abstractComponentCallbacksC2338.f6905;
        abstractComponentCallbacksC2338.f6902 = abstractComponentCallbacksC23382 != null ? abstractComponentCallbacksC23382.f6900 : null;
        abstractComponentCallbacksC2338.f6905 = null;
        abstractComponentCallbacksC2338.f6906 = bundle;
        abstractComponentCallbacksC2338.f6904 = bundle.getBundle("arguments");
    }
}
