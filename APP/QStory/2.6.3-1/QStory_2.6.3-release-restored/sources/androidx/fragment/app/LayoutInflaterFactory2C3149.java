package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.platform.ViewOnAttachStateChangeListenerC2676;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import p172.AbstractC8451;
import p172.C8452;
import p175.AbstractC8463;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C3149 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC3146 f7154;

    public LayoutInflaterFactory2C3149(AbstractC3146 abstractC3146) {
        this.f7154 = abstractC3146;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C3137 c3137M4944;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC3146 abstractC3146 = this.f7154;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC3146);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8463.f21068);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int i = 1;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC3171.class.isAssignableFrom(C3157.m4982(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        C3141.m4915(attributeSet.getPositionDescription(), ": Must specify unique android:id, android:tag, or have a parent with an id for ", attributeValue);
                        return null;
                    }
                    AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M4936 = resourceId != -1 ? abstractC3146.m4936(resourceId) : null;
                    if (abstractComponentCallbacksC3171M4936 == null && string != null) {
                        abstractComponentCallbacksC3171M4936 = abstractC3146.m4935(string);
                    }
                    if (abstractComponentCallbacksC3171M4936 == null && id != -1) {
                        abstractComponentCallbacksC3171M4936 = abstractC3146.m4936(id);
                    }
                    if (abstractComponentCallbacksC3171M4936 == null) {
                        C3157 c3157M4943 = abstractC3146.m4943();
                        context.getClassLoader();
                        abstractComponentCallbacksC3171M4936 = c3157M4943.m4983(attributeValue);
                        abstractComponentCallbacksC3171M4936.f7236 = true;
                        abstractComponentCallbacksC3171M4936.f7231 = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC3171M4936.f7230 = id;
                        abstractComponentCallbacksC3171M4936.f7233 = string;
                        abstractComponentCallbacksC3171M4936.f7235 = true;
                        abstractComponentCallbacksC3171M4936.f7243 = abstractC3146;
                        C3152 c3152 = abstractC3146.f7136;
                        abstractComponentCallbacksC3171M4936.f7242 = c3152;
                        FragmentActivity fragmentActivity = c3152.f7161;
                        abstractComponentCallbacksC3171M4936.f7224 = true;
                        if ((c3152 == null ? null : c3152.f7162) != null) {
                            abstractComponentCallbacksC3171M4936.f7224 = true;
                        }
                        c3137M4944 = abstractC3146.m4949(abstractComponentCallbacksC3171M4936);
                        if (AbstractC3146.m4922(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC3171M4936 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC3171M4936.f7235) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC3171M4936.f7235 = true;
                        abstractComponentCallbacksC3171M4936.f7243 = abstractC3146;
                        C3152 c31522 = abstractC3146.f7136;
                        abstractComponentCallbacksC3171M4936.f7242 = c31522;
                        FragmentActivity fragmentActivity2 = c31522.f7161;
                        abstractComponentCallbacksC3171M4936.f7224 = true;
                        if ((c31522 == null ? null : c31522.f7162) != null) {
                            abstractComponentCallbacksC3171M4936.f7224 = true;
                        }
                        c3137M4944 = abstractC3146.m4944(abstractComponentCallbacksC3171M4936);
                        if (AbstractC3146.m4922(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC3171M4936 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C8452 c8452 = AbstractC8451.f20997;
                    FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(abstractComponentCallbacksC3171M4936, viewGroup);
                    AbstractC8451.m13414(fragmentTagUsageViolation);
                    C8452 c8452M13416 = AbstractC8451.m13416(abstractComponentCallbacksC3171M4936);
                    if (c8452M13416.f21000.contains(FragmentStrictMode$Flag.DETECT_FRAGMENT_TAG_USAGE) && AbstractC8451.m13412(c8452M13416, abstractComponentCallbacksC3171M4936.getClass(), FragmentTagUsageViolation.class)) {
                        AbstractC8451.m13415(c8452M13416, fragmentTagUsageViolation);
                    }
                    abstractComponentCallbacksC3171M4936.f7227 = viewGroup;
                    c3137M4944.m4904();
                    c3137M4944.m4907();
                    View view2 = abstractComponentCallbacksC3171M4936.f7226;
                    if (view2 == null) {
                        C6755.m11870(AbstractC0900.m718("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC3171M4936.f7226.getTag() == null) {
                        abstractComponentCallbacksC3171M4936.f7226.setTag(string);
                    }
                    abstractComponentCallbacksC3171M4936.f7226.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2676(this, i, c3137M4944));
                    return abstractComponentCallbacksC3171M4936.f7226;
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
