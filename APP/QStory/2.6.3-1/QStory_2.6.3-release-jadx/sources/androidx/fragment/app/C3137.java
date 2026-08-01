package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import androidx.collection.C1129;
import androidx.compose.animation.core.C1171;
import androidx.core.view.AbstractC3103;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.AbstractC3208;
import androidx.lifecycle.AbstractC3268;
import androidx.lifecycle.C3207;
import androidx.lifecycle.C3219;
import androidx.lifecycle.C3256;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import p159.C8373;
import p159.C8374;
import p172.AbstractC8451;
import p172.C8452;
import p176.C8466;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3137 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractComponentCallbacksC3171 f7099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1171 f7100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0923 f7101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f7098 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7097 = -1;

    public C3137(C0923 c0923, C1171 c1171, ClassLoader classLoader, C3157 c3157, Bundle bundle) {
        this.f7101 = c0923;
        this.f7100 = c1171;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M4983 = c3157.m4983(fragmentState.f7094);
        abstractComponentCallbacksC3171M4983.f7246 = fragmentState.f7092;
        abstractComponentCallbacksC3171M4983.f7236 = fragmentState.f7093;
        abstractComponentCallbacksC3171M4983.f7234 = true;
        abstractComponentCallbacksC3171M4983.f7231 = fragmentState.f7087;
        abstractComponentCallbacksC3171M4983.f7230 = fragmentState.f7086;
        abstractComponentCallbacksC3171M4983.f7233 = fragmentState.f7090;
        abstractComponentCallbacksC3171M4983.f7229 = fragmentState.f7091;
        abstractComponentCallbacksC3171M4983.f7237 = fragmentState.f7088;
        abstractComponentCallbacksC3171M4983.f7228 = fragmentState.f7089;
        abstractComponentCallbacksC3171M4983.f7232 = fragmentState.f7085;
        abstractComponentCallbacksC3171M4983.f7263 = Lifecycle$State.values()[fragmentState.f7084];
        abstractComponentCallbacksC3171M4983.f7248 = fragmentState.f7083;
        abstractComponentCallbacksC3171M4983.f7249 = fragmentState.f7082;
        abstractComponentCallbacksC3171M4983.f7223 = fragmentState.f7081;
        this.f7099 = abstractComponentCallbacksC3171M4983;
        abstractComponentCallbacksC3171M4983.f7252 = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC3171M4983.m4999(bundle2);
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC3171M4983);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4891() {
        String resourceName;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (abstractComponentCallbacksC3171.f7236) {
            return;
        }
        if (AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC3171);
        }
        Bundle bundle = abstractComponentCallbacksC3171.f7252;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterMo5010 = abstractComponentCallbacksC3171.mo5010(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC3171.f7227;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC3171.f7230;
            if (i != 0) {
                if (i == -1) {
                    C9620.m15031(abstractComponentCallbacksC3171, "Cannot create fragment ", " for a container view with no id");
                    return;
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC3171.f7243.f7137.mo4977(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC3171.f7234) {
                        try {
                            resourceName = abstractComponentCallbacksC3171.m4995().getResources().getResourceName(abstractComponentCallbacksC3171.f7230);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC3171.f7230) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC3171);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C8452 c8452 = AbstractC8451.f20997;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(abstractComponentCallbacksC3171, viewGroup);
                    AbstractC8451.m13414(wrongFragmentContainerViolation);
                    C8452 c8452M13416 = AbstractC8451.m13416(abstractComponentCallbacksC3171);
                    if (c8452M13416.f21000.contains(FragmentStrictMode$Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && AbstractC8451.m13412(c8452M13416, abstractComponentCallbacksC3171.getClass(), WrongFragmentContainerViolation.class)) {
                        AbstractC8451.m13415(c8452M13416, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        abstractComponentCallbacksC3171.f7227 = viewGroup;
        abstractComponentCallbacksC3171.mo4997(layoutInflaterMo5010, viewGroup, bundle2);
        if (abstractComponentCallbacksC3171.f7226 != null) {
            if (AbstractC3146.m4922(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC3171);
            }
            abstractComponentCallbacksC3171.f7226.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC3171.f7226.setTag(C0328R.id.fragment_container_view_tag, abstractComponentCallbacksC3171);
            if (viewGroup != null) {
                m4895();
            }
            if (abstractComponentCallbacksC3171.f7232) {
                abstractComponentCallbacksC3171.f7226.setVisibility(8);
            }
            View view = abstractComponentCallbacksC3171.f7226;
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            boolean zIsAttachedToWindow = view.isAttachedToWindow();
            View view2 = abstractComponentCallbacksC3171.f7226;
            if (zIsAttachedToWindow) {
                view2.requestApplyInsets();
            } else {
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3140(view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC3171.f7252;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC3171.f7241.m4950(2);
            this.f7101.m823(false);
            int visibility = abstractComponentCallbacksC3171.f7226.getVisibility();
            abstractComponentCallbacksC3171.m5004().f7216 = abstractComponentCallbacksC3171.f7226.getAlpha();
            if (abstractComponentCallbacksC3171.f7227 != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC3171.f7226.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC3171.m5004().f7214 = viewFindFocus;
                    if (AbstractC3146.m4922(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC3171);
                    }
                }
                abstractComponentCallbacksC3171.f7226.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC3171.f7254 = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4892() {
        Bundle bundle;
        boolean zM4922 = AbstractC3146.m4922(3);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (zM4922) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC3171);
        }
        Bundle bundle2 = abstractComponentCallbacksC3171.f7252;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC3171.f7265) {
            abstractComponentCallbacksC3171.f7254 = 1;
            Bundle bundle4 = abstractComponentCallbacksC3171.f7252;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC3171.f7241.m4928(bundle);
            C3142 c3142 = abstractComponentCallbacksC3171.f7241;
            c3142.f7124 = false;
            c3142.f7123 = false;
            c3142.f7113.f7108 = false;
            c3142.m4950(1);
            return;
        }
        C0923 c0923 = this.f7101;
        c0923.m825(false);
        abstractComponentCallbacksC3171.f7241.m4932();
        abstractComponentCallbacksC3171.f7254 = 1;
        abstractComponentCallbacksC3171.f7224 = false;
        abstractComponentCallbacksC3171.f7264.mo5063(new C3175(abstractComponentCallbacksC3171));
        abstractComponentCallbacksC3171.mo5014(bundle3);
        abstractComponentCallbacksC3171.f7265 = true;
        if (!abstractComponentCallbacksC3171.f7224) {
            C3141.m4916(abstractComponentCallbacksC3171, " did not call through to super.onCreate()");
        } else {
            abstractComponentCallbacksC3171.f7264.m5059(Lifecycle$Event.ON_CREATE);
            c0923.m837(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4893() {
        Object next;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (abstractComponentCallbacksC3171.f7243 == null) {
            return abstractComponentCallbacksC3171.f7254;
        }
        int iMin = this.f7097;
        int i = AbstractC3136.f7096[abstractComponentCallbacksC3171.f7263.ordinal()];
        if (i != 1) {
            iMin = i != 2 ? i != 3 ? i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        if (abstractComponentCallbacksC3171.f7236) {
            boolean z = abstractComponentCallbacksC3171.f7235;
            int i2 = this.f7097;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = abstractComponentCallbacksC3171.f7226;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, abstractComponentCallbacksC3171.f7254) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC3171.f7238) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC3171.f7227;
        if (viewGroup != null) {
            C3182 c3182M5027 = C3182.m5027(viewGroup, abstractComponentCallbacksC3171.m5019());
            C3190 c3190M5029 = c3182M5027.m5029(abstractComponentCallbacksC3171);
            SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = c3190M5029 != null ? c3190M5029.f7327 : null;
            Iterator it = c3182M5027.f7300.iterator();
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
            C3190 c31902 = (C3190) next;
            specialEffectsController$Operation$LifecycleImpact = c31902 != null ? c31902.f7327 : null;
            int i3 = specialEffectsController$Operation$LifecycleImpact == null ? -1 : AbstractC3184.f7305[specialEffectsController$Operation$LifecycleImpact.ordinal()];
            if (i3 != -1 && i3 != 1) {
                specialEffectsController$Operation$LifecycleImpact = specialEffectsController$Operation$LifecycleImpact;
            }
        }
        if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC3171.f7237) {
            iMin = abstractComponentCallbacksC3171.m5013() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC3171.f7222 && abstractComponentCallbacksC3171.f7254 < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC3171);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4894() {
        C3137 c3137;
        boolean zM4922 = AbstractC3146.m4922(3);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (zM4922) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC3171);
        }
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = abstractComponentCallbacksC3171.f7251;
        C1171 c1171 = this.f7100;
        if (abstractComponentCallbacksC31712 != null) {
            c3137 = (C3137) ((HashMap) c1171.f1441).get(abstractComponentCallbacksC31712.f7246);
            if (c3137 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC3171);
                C3141.m4912(sb, " declared target fragment ", abstractComponentCallbacksC3171.f7251, " that does not belong to this FragmentManager!");
                return;
            }
            abstractComponentCallbacksC3171.f7248 = abstractComponentCallbacksC3171.f7251.f7246;
            abstractComponentCallbacksC3171.f7251 = null;
        } else {
            String str = abstractComponentCallbacksC3171.f7248;
            if (str != null) {
                c3137 = (C3137) ((HashMap) c1171.f1441).get(str);
                if (c3137 == null) {
                    StringBuilder sb2 = new StringBuilder("Fragment ");
                    sb2.append(abstractComponentCallbacksC3171);
                    sb2.append(" declared target fragment ");
                    C6755.m11870(AbstractC0900.m711(sb2, abstractComponentCallbacksC3171.f7248, " that does not belong to this FragmentManager!"));
                    return;
                }
            } else {
                c3137 = null;
            }
        }
        if (c3137 != null) {
            c3137.m4904();
        }
        AbstractC3146 abstractC3146 = abstractComponentCallbacksC3171.f7243;
        abstractComponentCallbacksC3171.f7242 = abstractC3146.f7136;
        abstractComponentCallbacksC3171.f7240 = abstractC3146.f7134;
        C0923 c0923 = this.f7101;
        c0923.m833(false);
        ArrayList arrayList = abstractComponentCallbacksC3171.f7256;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31713 = ((C3177) ((AbstractC3166) it.next())).f7287;
            abstractComponentCallbacksC31713.f7257.m13318();
            AbstractC3268.m5090(abstractComponentCallbacksC31713);
            Bundle bundle = abstractComponentCallbacksC31713.f7252;
            abstractComponentCallbacksC31713.f7257.m13317(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        abstractComponentCallbacksC3171.f7241.m4948(abstractComponentCallbacksC3171.f7242, abstractComponentCallbacksC3171.mo5005(), abstractComponentCallbacksC3171);
        abstractComponentCallbacksC3171.f7254 = 0;
        abstractComponentCallbacksC3171.f7224 = false;
        abstractComponentCallbacksC3171.mo5017(abstractComponentCallbacksC3171.f7242.f7161);
        if (!abstractComponentCallbacksC3171.f7224) {
            C3141.m4916(abstractComponentCallbacksC3171, " did not call through to super.onAttach()");
            return;
        }
        Iterator it2 = abstractComponentCallbacksC3171.f7243.f7138.iterator();
        while (it2.hasNext()) {
            ((InterfaceC3138) it2.next()).mo4908(abstractComponentCallbacksC3171);
        }
        C3142 c3142 = abstractComponentCallbacksC3171.f7241;
        c3142.f7124 = false;
        c3142.f7123 = false;
        c3142.f7113.f7108 = false;
        c3142.m4950(0);
        c0923.m838(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4895() {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171;
        View view;
        View view2;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = this.f7099;
        View view3 = abstractComponentCallbacksC31712.f7227;
        while (true) {
            abstractComponentCallbacksC3171 = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(C0328R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC31713 = tag instanceof AbstractComponentCallbacksC3171 ? (AbstractComponentCallbacksC3171) tag : null;
            if (abstractComponentCallbacksC31713 != null) {
                abstractComponentCallbacksC3171 = abstractComponentCallbacksC31713;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC31714 = abstractComponentCallbacksC31712.f7240;
        if (abstractComponentCallbacksC3171 != null && abstractComponentCallbacksC3171 != abstractComponentCallbacksC31714) {
            int i = abstractComponentCallbacksC31712.f7230;
            C8452 c8452 = AbstractC8451.f20997;
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(abstractComponentCallbacksC31712, abstractComponentCallbacksC3171, i);
            AbstractC8451.m13414(wrongNestedHierarchyViolation);
            C8452 c8452M13416 = AbstractC8451.m13416(abstractComponentCallbacksC31712);
            if (c8452M13416.f21000.contains(FragmentStrictMode$Flag.DETECT_WRONG_NESTED_HIERARCHY) && AbstractC8451.m13412(c8452M13416, abstractComponentCallbacksC31712.getClass(), WrongNestedHierarchyViolation.class)) {
                AbstractC8451.m13415(c8452M13416, wrongNestedHierarchyViolation);
            }
        }
        ArrayList arrayList = (ArrayList) this.f7100.f1440;
        ViewGroup viewGroup = abstractComponentCallbacksC31712.f7227;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC31712);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC3171 abstractComponentCallbacksC31715 = (AbstractComponentCallbacksC3171) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC31715.f7227 == viewGroup && (view = abstractComponentCallbacksC31715.f7226) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC3171 abstractComponentCallbacksC31716 = (AbstractComponentCallbacksC3171) arrayList.get(i2);
                    if (abstractComponentCallbacksC31716.f7227 == viewGroup && (view2 = abstractComponentCallbacksC31716.f7226) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC31712.f7227.addView(abstractComponentCallbacksC31712.f7226, iIndexOfChild);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4896() {
        boolean zM4922 = AbstractC3146.m4922(3);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (zM4922) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC3171);
        }
        Bundle bundle = abstractComponentCallbacksC3171.f7252;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC3171.f7241.m4932();
        abstractComponentCallbacksC3171.f7254 = 3;
        abstractComponentCallbacksC3171.f7224 = false;
        abstractComponentCallbacksC3171.mo5012();
        if (!abstractComponentCallbacksC3171.f7224) {
            C3141.m4916(abstractComponentCallbacksC3171, " did not call through to super.onActivityCreated()");
            return;
        }
        if (AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC3171);
        }
        if (abstractComponentCallbacksC3171.f7226 != null) {
            Bundle bundle2 = abstractComponentCallbacksC3171.f7252;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC3171.f7253;
            if (sparseArray != null) {
                abstractComponentCallbacksC3171.f7226.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC3171.f7253 = null;
            }
            abstractComponentCallbacksC3171.f7224 = false;
            abstractComponentCallbacksC3171.mo4998(bundle3);
            if (!abstractComponentCallbacksC3171.f7224) {
                C3141.m4916(abstractComponentCallbacksC3171, " did not call through to super.onViewStateRestored()");
                return;
            } else if (abstractComponentCallbacksC3171.f7226 != null) {
                abstractComponentCallbacksC3171.f7260.m5037(Lifecycle$Event.ON_CREATE);
            }
        }
        abstractComponentCallbacksC3171.f7252 = null;
        C3142 c3142 = abstractComponentCallbacksC3171.f7241;
        c3142.f7124 = false;
        c3142.f7123 = false;
        c3142.f7113.f7108 = false;
        c3142.m4950(4);
        this.f7101.m828(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4897() {
        boolean zM4922 = AbstractC3146.m4922(3);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (zM4922) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC3171);
        }
        C3167 c3167 = abstractComponentCallbacksC3171.f7262;
        View view = c3167 == null ? null : c3167.f7214;
        if (view != null) {
            if (view == abstractComponentCallbacksC3171.f7226) {
                boolean zRequestFocus = view.requestFocus();
                if (AbstractC3146.m4922(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(zRequestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(abstractComponentCallbacksC3171);
                    sb.append(" resulting in focused view ");
                    sb.append(abstractComponentCallbacksC3171.f7226.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == abstractComponentCallbacksC3171.f7226) {
                        boolean zRequestFocus2 = view.requestFocus();
                        if (AbstractC3146.m4922(2)) {
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC3171.m5004().f7214 = null;
        abstractComponentCallbacksC3171.f7241.m4932();
        abstractComponentCallbacksC3171.f7241.m4939(true);
        abstractComponentCallbacksC3171.f7254 = 7;
        abstractComponentCallbacksC3171.f7224 = true;
        C3219 c3219 = abstractComponentCallbacksC3171.f7264;
        Lifecycle$Event lifecycle$Event = Lifecycle$Event.ON_RESUME;
        c3219.m5059(lifecycle$Event);
        if (abstractComponentCallbacksC3171.f7226 != null) {
            abstractComponentCallbacksC3171.f7260.f7308.m5059(lifecycle$Event);
        }
        C3142 c3142 = abstractComponentCallbacksC3171.f7241;
        c3142.f7124 = false;
        c3142.f7123 = false;
        c3142.f7113.f7108 = false;
        c3142.m4950(7);
        this.f7101.m824(false);
        this.f7100.m1556(abstractComponentCallbacksC3171.f7246, null);
        abstractComponentCallbacksC3171.f7252 = null;
        abstractComponentCallbacksC3171.f7253 = null;
        abstractComponentCallbacksC3171.f7247 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4898(ClassLoader classLoader) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        Bundle bundle = abstractComponentCallbacksC3171.f7252;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC3171.f7252.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC3171.f7252.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC3171.f7253 = abstractComponentCallbacksC3171.f7252.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC3171.f7247 = abstractComponentCallbacksC3171.f7252.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) abstractComponentCallbacksC3171.f7252.getParcelable("state");
        if (fragmentState != null) {
            abstractComponentCallbacksC3171.f7248 = fragmentState.f7083;
            abstractComponentCallbacksC3171.f7249 = fragmentState.f7082;
            abstractComponentCallbacksC3171.f7223 = fragmentState.f7081;
        }
        if (abstractComponentCallbacksC3171.f7223) {
            return;
        }
        abstractComponentCallbacksC3171.f7222 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m4899() {
        boolean zM4922 = AbstractC3146.m4922(3);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (zM4922) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC3171);
        }
        C3142 c3142 = abstractComponentCallbacksC3171.f7241;
        c3142.f7123 = true;
        c3142.f7113.f7108 = true;
        c3142.m4950(4);
        if (abstractComponentCallbacksC3171.f7226 != null) {
            abstractComponentCallbacksC3171.f7260.m5037(Lifecycle$Event.ON_STOP);
        }
        abstractComponentCallbacksC3171.f7264.m5059(Lifecycle$Event.ON_STOP);
        abstractComponentCallbacksC3171.f7254 = 4;
        abstractComponentCallbacksC3171.f7224 = false;
        abstractComponentCallbacksC3171.mo5009();
        if (abstractComponentCallbacksC3171.f7224) {
            this.f7101.m822(false);
        } else {
            C3141.m4916(abstractComponentCallbacksC3171, " did not call through to super.onStop()");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m4900() {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (abstractComponentCallbacksC3171.f7226 == null) {
            return;
        }
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC3171 + " with view " + abstractComponentCallbacksC3171.f7226);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC3171.f7226.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC3171.f7253 = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC3171.f7260.f7310.m13316(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC3171.f7247 = bundle;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m4901() {
        boolean zM4922 = AbstractC3146.m4922(3);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (zM4922) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC3171);
        }
        abstractComponentCallbacksC3171.f7241.m4932();
        abstractComponentCallbacksC3171.f7241.m4939(true);
        abstractComponentCallbacksC3171.f7254 = 5;
        abstractComponentCallbacksC3171.f7224 = false;
        abstractComponentCallbacksC3171.mo5008();
        if (!abstractComponentCallbacksC3171.f7224) {
            C3141.m4916(abstractComponentCallbacksC3171, " did not call through to super.onStart()");
            return;
        }
        C3219 c3219 = abstractComponentCallbacksC3171.f7264;
        Lifecycle$Event lifecycle$Event = Lifecycle$Event.ON_START;
        c3219.m5059(lifecycle$Event);
        if (abstractComponentCallbacksC3171.f7226 != null) {
            abstractComponentCallbacksC3171.f7260.f7308.m5059(lifecycle$Event);
        }
        C3142 c3142 = abstractComponentCallbacksC3171.f7241;
        c3142.f7124 = false;
        c3142.f7123 = false;
        c3142.f7113.f7108 = false;
        c3142.m4950(5);
        this.f7101.m826(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4902() {
        View view;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC3171);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC3171.f7227;
        if (viewGroup != null && (view = abstractComponentCallbacksC3171.f7226) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC3171.f7241.m4950(1);
        if (abstractComponentCallbacksC3171.f7226 != null) {
            C3188 c3188 = abstractComponentCallbacksC3171.f7260;
            c3188.m5036();
            if (c3188.f7308.f7364.isAtLeast(Lifecycle$State.CREATED)) {
                abstractComponentCallbacksC3171.f7260.m5037(Lifecycle$Event.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC3171.f7254 = 1;
        abstractComponentCallbacksC3171.f7224 = false;
        abstractComponentCallbacksC3171.mo5007();
        if (!abstractComponentCallbacksC3171.f7224) {
            C3141.m4916(abstractComponentCallbacksC3171, " did not call through to super.onDestroyView()");
            return;
        }
        C3256 viewModelStore = abstractComponentCallbacksC3171.getViewModelStore();
        C8374 c8374 = C8373.f20770;
        viewModelStore.getClass();
        C8466 c8466 = C8466.f21070;
        c8466.getClass();
        C1171 c1171 = new C1171(viewModelStore, c8374, c8466);
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8373.class);
        String strMo9444 = interfaceC5925Mo9476.mo9444();
        if (strMo9444 == null) {
            C6755.m11869("Local and anonymous classes can not be ViewModels");
            return;
        }
        C1129 c1129 = ((C8373) c1171.m1519("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo9444), interfaceC5925Mo9476)).f20771;
        if (c1129.f1336 > 0) {
            c1129.m1417(0).getClass();
            C3775.m6954();
            return;
        }
        abstractComponentCallbacksC3171.f7245 = false;
        this.f7101.m819(false);
        abstractComponentCallbacksC3171.f7227 = null;
        abstractComponentCallbacksC3171.f7226 = null;
        abstractComponentCallbacksC3171.f7260 = null;
        C3207 c3207 = abstractComponentCallbacksC3171.f7259;
        c3207.getClass();
        AbstractC3208.m5052("setValue");
        c3207.f7351++;
        c3207.f7345 = null;
        c3207.m5054(null);
        abstractComponentCallbacksC3171.f7235 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4903() {
        boolean z;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M1536;
        boolean zM4922 = AbstractC3146.m4922(3);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (zM4922) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC3171);
        }
        boolean z2 = abstractComponentCallbacksC3171.f7237 && !abstractComponentCallbacksC3171.m5013();
        C1171 c1171 = this.f7100;
        if (z2) {
            c1171.m1556(abstractComponentCallbacksC3171.f7246, null);
        }
        if (!z2) {
            C3139 c3139 = (C3139) c1171.f1438;
            if (!((c3139.f7107.containsKey(abstractComponentCallbacksC3171.f7246) && c3139.f7104) ? c3139.f7103 : true)) {
                String str = abstractComponentCallbacksC3171.f7248;
                if (str != null && (abstractComponentCallbacksC3171M1536 = c1171.m1536(str)) != null && abstractComponentCallbacksC3171M1536.f7229) {
                    abstractComponentCallbacksC3171.f7251 = abstractComponentCallbacksC3171M1536;
                }
                abstractComponentCallbacksC3171.f7254 = 0;
                return;
            }
        }
        C3152 c3152 = abstractComponentCallbacksC3171.f7242;
        if (c3152 != null) {
            z = ((C3139) c1171.f1438).f7103;
        } else {
            z = c3152.f7161 != null ? !r6.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((C3139) c1171.f1438).m4911(abstractComponentCallbacksC3171);
        }
        abstractComponentCallbacksC3171.f7241.m4964();
        abstractComponentCallbacksC3171.f7264.m5059(Lifecycle$Event.ON_DESTROY);
        abstractComponentCallbacksC3171.f7254 = 0;
        abstractComponentCallbacksC3171.f7265 = false;
        abstractComponentCallbacksC3171.f7224 = true;
        this.f7101.m836(false);
        for (C3137 c3137 : c1171.m1525()) {
            if (c3137 != null) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = c3137.f7099;
                if (abstractComponentCallbacksC3171.f7246.equals(abstractComponentCallbacksC31712.f7248)) {
                    abstractComponentCallbacksC31712.f7251 = abstractComponentCallbacksC3171;
                    abstractComponentCallbacksC31712.f7248 = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC3171.f7248;
        if (str2 != null) {
            abstractComponentCallbacksC3171.f7251 = c1171.m1536(str2);
        }
        c1171.m1518(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4904() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C1171 c1171 = this.f7100;
        boolean z = this.f7098;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (z) {
            if (AbstractC3146.m4922(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC3171);
                return;
            }
            return;
        }
        try {
            this.f7098 = true;
            boolean z2 = false;
            while (true) {
                int iM4893 = m4893();
                int i = abstractComponentCallbacksC3171.f7254;
                if (iM4893 == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC3171.f7237 && !abstractComponentCallbacksC3171.m5013()) {
                        if (AbstractC3146.m4922(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC3171);
                        }
                        ((C3139) c1171.f1438).m4911(abstractComponentCallbacksC3171);
                        c1171.m1518(this);
                        if (AbstractC3146.m4922(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC3171);
                        }
                        abstractComponentCallbacksC3171.m5023();
                    }
                    if (abstractComponentCallbacksC3171.f7261) {
                        if (abstractComponentCallbacksC3171.f7226 != null && (viewGroup = abstractComponentCallbacksC3171.f7227) != null) {
                            C3182 c3182M5027 = C3182.m5027(viewGroup, abstractComponentCallbacksC3171.m5019());
                            if (abstractComponentCallbacksC3171.f7232) {
                                if (AbstractC3146.m4922(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC3171);
                                }
                                c3182M5027.m5032(SpecialEffectsController$Operation$State.GONE, SpecialEffectsController$Operation$LifecycleImpact.NONE, this);
                            } else {
                                if (AbstractC3146.m4922(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC3171);
                                }
                                c3182M5027.m5032(SpecialEffectsController$Operation$State.VISIBLE, SpecialEffectsController$Operation$LifecycleImpact.NONE, this);
                            }
                        }
                        AbstractC3146 abstractC3146 = abstractComponentCallbacksC3171.f7243;
                        if (abstractC3146 != null && abstractComponentCallbacksC3171.f7238 && AbstractC3146.m4921(abstractComponentCallbacksC3171)) {
                            abstractC3146.f7125 = true;
                        }
                        abstractComponentCallbacksC3171.f7261 = false;
                        abstractComponentCallbacksC3171.f7241.m4956();
                    }
                    this.f7098 = false;
                    return;
                }
                if (iM4893 <= i) {
                    switch (i - 1) {
                        case -1:
                            m4906();
                            break;
                        case 0:
                            m4903();
                            break;
                        case 1:
                            m4902();
                            abstractComponentCallbacksC3171.f7254 = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC3171.f7235 = false;
                            abstractComponentCallbacksC3171.f7254 = 2;
                            break;
                        case 3:
                            if (AbstractC3146.m4922(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC3171);
                            }
                            if (abstractComponentCallbacksC3171.f7226 != null && abstractComponentCallbacksC3171.f7253 == null) {
                                m4900();
                            }
                            if (abstractComponentCallbacksC3171.f7226 != null && (viewGroup2 = abstractComponentCallbacksC3171.f7227) != null) {
                                C3182 c3182M50272 = C3182.m5027(viewGroup2, abstractComponentCallbacksC3171.m5019());
                                if (AbstractC3146.m4922(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC3171);
                                }
                                c3182M50272.m5032(SpecialEffectsController$Operation$State.REMOVED, SpecialEffectsController$Operation$LifecycleImpact.REMOVING, this);
                            }
                            abstractComponentCallbacksC3171.f7254 = 3;
                            break;
                        case 4:
                            m4899();
                            break;
                        case 5:
                            abstractComponentCallbacksC3171.f7254 = 5;
                            break;
                        case 6:
                            m4905();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m4894();
                            break;
                        case 1:
                            m4892();
                            break;
                        case 2:
                            m4907();
                            m4891();
                            break;
                        case 3:
                            m4896();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC3171.f7226 != null && (viewGroup3 = abstractComponentCallbacksC3171.f7227) != null) {
                                C3182 c3182M50273 = C3182.m5027(viewGroup3, abstractComponentCallbacksC3171.m5019());
                                SpecialEffectsController$Operation$State specialEffectsController$Operation$StateFrom = SpecialEffectsController$Operation$State.from(abstractComponentCallbacksC3171.f7226.getVisibility());
                                specialEffectsController$Operation$StateFrom.getClass();
                                if (AbstractC3146.m4922(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC3171);
                                }
                                c3182M50273.m5032(specialEffectsController$Operation$StateFrom, SpecialEffectsController$Operation$LifecycleImpact.ADDING, this);
                            }
                            abstractComponentCallbacksC3171.f7254 = 4;
                            break;
                        case 5:
                            m4901();
                            break;
                        case 6:
                            abstractComponentCallbacksC3171.f7254 = 6;
                            break;
                        case 7:
                            m4897();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.f7098 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4905() {
        boolean zM4922 = AbstractC3146.m4922(3);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (zM4922) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC3171);
        }
        abstractComponentCallbacksC3171.f7241.m4950(5);
        if (abstractComponentCallbacksC3171.f7226 != null) {
            abstractComponentCallbacksC3171.f7260.m5037(Lifecycle$Event.ON_PAUSE);
        }
        abstractComponentCallbacksC3171.f7264.m5059(Lifecycle$Event.ON_PAUSE);
        abstractComponentCallbacksC3171.f7254 = 6;
        abstractComponentCallbacksC3171.f7224 = true;
        this.f7101.m834(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4906() {
        boolean zM4922 = AbstractC3146.m4922(3);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (zM4922) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC3171);
        }
        abstractComponentCallbacksC3171.f7254 = -1;
        abstractComponentCallbacksC3171.f7224 = false;
        abstractComponentCallbacksC3171.mo5006();
        if (!abstractComponentCallbacksC3171.f7224) {
            C3141.m4916(abstractComponentCallbacksC3171, " did not call through to super.onDetach()");
            return;
        }
        C3142 c3142 = abstractComponentCallbacksC3171.f7241;
        if (!c3142.f7122) {
            c3142.m4964();
            abstractComponentCallbacksC3171.f7241 = new C3142();
        }
        this.f7101.m835(false);
        abstractComponentCallbacksC3171.f7254 = -1;
        abstractComponentCallbacksC3171.f7242 = null;
        abstractComponentCallbacksC3171.f7240 = null;
        abstractComponentCallbacksC3171.f7243 = null;
        if (!abstractComponentCallbacksC3171.f7237 || abstractComponentCallbacksC3171.m5013()) {
            C3139 c3139 = (C3139) this.f7100.f1438;
            if (!((c3139.f7107.containsKey(abstractComponentCallbacksC3171.f7246) && c3139.f7104) ? c3139.f7103 : true)) {
                return;
            }
        }
        if (AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC3171);
        }
        abstractComponentCallbacksC3171.m5023();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4907() {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7099;
        if (abstractComponentCallbacksC3171.f7236 && abstractComponentCallbacksC3171.f7235 && !abstractComponentCallbacksC3171.f7245) {
            if (AbstractC3146.m4922(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC3171);
            }
            Bundle bundle = abstractComponentCallbacksC3171.f7252;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC3171.mo4997(abstractComponentCallbacksC3171.mo5010(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC3171.f7226;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC3171.f7226.setTag(C0328R.id.fragment_container_view_tag, abstractComponentCallbacksC3171);
                if (abstractComponentCallbacksC3171.f7232) {
                    abstractComponentCallbacksC3171.f7226.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC3171.f7252;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC3171.f7241.m4950(2);
                this.f7101.m823(false);
                abstractComponentCallbacksC3171.f7254 = 2;
            }
        }
    }

    public C3137(C0923 c0923, C1171 c1171, AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        this.f7101 = c0923;
        this.f7100 = c1171;
        this.f7099 = abstractComponentCallbacksC3171;
    }

    public C3137(C0923 c0923, C1171 c1171, AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, Bundle bundle) {
        this.f7101 = c0923;
        this.f7100 = c1171;
        this.f7099 = abstractComponentCallbacksC3171;
        abstractComponentCallbacksC3171.f7253 = null;
        abstractComponentCallbacksC3171.f7247 = null;
        abstractComponentCallbacksC3171.f7244 = 0;
        abstractComponentCallbacksC3171.f7235 = false;
        abstractComponentCallbacksC3171.f7238 = false;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = abstractComponentCallbacksC3171.f7251;
        abstractComponentCallbacksC3171.f7248 = abstractComponentCallbacksC31712 != null ? abstractComponentCallbacksC31712.f7246 : null;
        abstractComponentCallbacksC3171.f7251 = null;
        abstractComponentCallbacksC3171.f7252 = bundle;
        abstractComponentCallbacksC3171.f7250 = bundle.getBundle("arguments");
    }
}
