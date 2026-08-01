package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0053;
import androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1841;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import p156.AbstractC7621;
import p156.C7622;
import p159.AbstractC7633;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C2316 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC2313 f6808;

    public LayoutInflaterFactory2C2316(AbstractC2313 abstractC2313) {
        this.f6808 = abstractC2313;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C2304 c2304M4374;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC2313 abstractC2313 = this.f6808;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC2313);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7633.f20728);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int i = 1;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC2338.class.isAssignableFrom(C2324.m4412(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        C2308.m4345(attributeSet.getPositionDescription(), ": Must specify unique android:id, android:tag, or have a parent with an id for ", attributeValue);
                        return null;
                    }
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4366 = resourceId != -1 ? abstractC2313.m4366(resourceId) : null;
                    if (abstractComponentCallbacksC2338M4366 == null && string != null) {
                        abstractComponentCallbacksC2338M4366 = abstractC2313.m4365(string);
                    }
                    if (abstractComponentCallbacksC2338M4366 == null && id != -1) {
                        abstractComponentCallbacksC2338M4366 = abstractC2313.m4366(id);
                    }
                    if (abstractComponentCallbacksC2338M4366 == null) {
                        C2324 c2324M4373 = abstractC2313.m4373();
                        context.getClassLoader();
                        abstractComponentCallbacksC2338M4366 = c2324M4373.m4413(attributeValue);
                        abstractComponentCallbacksC2338M4366.f6890 = true;
                        abstractComponentCallbacksC2338M4366.f6885 = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC2338M4366.f6884 = id;
                        abstractComponentCallbacksC2338M4366.f6887 = string;
                        abstractComponentCallbacksC2338M4366.f6889 = true;
                        abstractComponentCallbacksC2338M4366.f6897 = abstractC2313;
                        C2319 c2319 = abstractC2313.f6790;
                        abstractComponentCallbacksC2338M4366.f6896 = c2319;
                        FragmentActivity fragmentActivity = c2319.f6819;
                        abstractComponentCallbacksC2338M4366.f6878 = true;
                        if ((c2319 == null ? null : c2319.f6818) != null) {
                            abstractComponentCallbacksC2338M4366.f6878 = true;
                        }
                        c2304M4374 = abstractC2313.m4379(abstractComponentCallbacksC2338M4366);
                        if (AbstractC2313.m4352(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC2338M4366 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC2338M4366.f6889) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC2338M4366.f6889 = true;
                        abstractComponentCallbacksC2338M4366.f6897 = abstractC2313;
                        C2319 c23192 = abstractC2313.f6790;
                        abstractComponentCallbacksC2338M4366.f6896 = c23192;
                        FragmentActivity fragmentActivity2 = c23192.f6819;
                        abstractComponentCallbacksC2338M4366.f6878 = true;
                        if ((c23192 == null ? null : c23192.f6818) != null) {
                            abstractComponentCallbacksC2338M4366.f6878 = true;
                        }
                        c2304M4374 = abstractC2313.m4374(abstractComponentCallbacksC2338M4366);
                        if (AbstractC2313.m4352(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC2338M4366 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C7622 c7622 = AbstractC7621.f20657;
                    FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(abstractComponentCallbacksC2338M4366, viewGroup);
                    AbstractC7621.m12826(fragmentTagUsageViolation);
                    C7622 c7622M12828 = AbstractC7621.m12828(abstractComponentCallbacksC2338M4366);
                    if (c7622M12828.f20660.contains(FragmentStrictMode$Flag.DETECT_FRAGMENT_TAG_USAGE) && AbstractC7621.m12824(c7622M12828, abstractComponentCallbacksC2338M4366.getClass(), FragmentTagUsageViolation.class)) {
                        AbstractC7621.m12827(c7622M12828, fragmentTagUsageViolation);
                    }
                    abstractComponentCallbacksC2338M4366.f6881 = viewGroup;
                    c2304M4374.m4334();
                    c2304M4374.m4337();
                    View view2 = abstractComponentCallbacksC2338M4366.f6880;
                    if (view2 == null) {
                        C5919.m11250(AbstractC0053.m156("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC2338M4366.f6880.getTag() == null) {
                        abstractComponentCallbacksC2338M4366.f6880.setTag(string);
                    }
                    abstractComponentCallbacksC2338M4366.f6880.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1841(this, i, c2304M4374));
                    return abstractComponentCallbacksC2338M4366.f6880;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
