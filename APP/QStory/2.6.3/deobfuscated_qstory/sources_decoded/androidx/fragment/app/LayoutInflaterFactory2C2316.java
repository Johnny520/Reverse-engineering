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
import p156.AbstractC7622;
import p156.C7623;
import p159.AbstractC7634;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C2316 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC2313 f6809;

    public LayoutInflaterFactory2C2316(AbstractC2313 abstractC2313) {
        this.f6809 = abstractC2313;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C2304 c2304M4384;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC2313 abstractC2313 = this.f6809;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC2313);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7634.f20723);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int i = 1;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC2338.class.isAssignableFrom(C2324.m4422(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        C2308.m4355(attributeSet.getPositionDescription(), ": Must specify unique android:id, android:tag, or have a parent with an id for ", attributeValue);
                        return null;
                    }
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4376 = resourceId != -1 ? abstractC2313.m4376(resourceId) : null;
                    if (abstractComponentCallbacksC2338M4376 == null && string != null) {
                        abstractComponentCallbacksC2338M4376 = abstractC2313.m4375(string);
                    }
                    if (abstractComponentCallbacksC2338M4376 == null && id != -1) {
                        abstractComponentCallbacksC2338M4376 = abstractC2313.m4376(id);
                    }
                    if (abstractComponentCallbacksC2338M4376 == null) {
                        C2324 c2324M4383 = abstractC2313.m4383();
                        context.getClassLoader();
                        abstractComponentCallbacksC2338M4376 = c2324M4383.m4423(attributeValue);
                        abstractComponentCallbacksC2338M4376.f6891 = true;
                        abstractComponentCallbacksC2338M4376.f6886 = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC2338M4376.f6885 = id;
                        abstractComponentCallbacksC2338M4376.f6888 = string;
                        abstractComponentCallbacksC2338M4376.f6890 = true;
                        abstractComponentCallbacksC2338M4376.f6898 = abstractC2313;
                        C2319 c2319 = abstractC2313.f6791;
                        abstractComponentCallbacksC2338M4376.f6897 = c2319;
                        FragmentActivity fragmentActivity = c2319.f6816;
                        abstractComponentCallbacksC2338M4376.f6879 = true;
                        if ((c2319 == null ? null : c2319.f6817) != null) {
                            abstractComponentCallbacksC2338M4376.f6879 = true;
                        }
                        c2304M4384 = abstractC2313.m4389(abstractComponentCallbacksC2338M4376);
                        if (AbstractC2313.m4362(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC2338M4376 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC2338M4376.f6890) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC2338M4376.f6890 = true;
                        abstractComponentCallbacksC2338M4376.f6898 = abstractC2313;
                        C2319 c23192 = abstractC2313.f6791;
                        abstractComponentCallbacksC2338M4376.f6897 = c23192;
                        FragmentActivity fragmentActivity2 = c23192.f6816;
                        abstractComponentCallbacksC2338M4376.f6879 = true;
                        if ((c23192 == null ? null : c23192.f6817) != null) {
                            abstractComponentCallbacksC2338M4376.f6879 = true;
                        }
                        c2304M4384 = abstractC2313.m4384(abstractComponentCallbacksC2338M4376);
                        if (AbstractC2313.m4362(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC2338M4376 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C7623 c7623 = AbstractC7622.f20652;
                    FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(abstractComponentCallbacksC2338M4376, viewGroup);
                    AbstractC7622.m12855(fragmentTagUsageViolation);
                    C7623 c7623M12857 = AbstractC7622.m12857(abstractComponentCallbacksC2338M4376);
                    if (c7623M12857.f20655.contains(FragmentStrictMode$Flag.DETECT_FRAGMENT_TAG_USAGE) && AbstractC7622.m12853(c7623M12857, abstractComponentCallbacksC2338M4376.getClass(), FragmentTagUsageViolation.class)) {
                        AbstractC7622.m12856(c7623M12857, fragmentTagUsageViolation);
                    }
                    abstractComponentCallbacksC2338M4376.f6882 = viewGroup;
                    c2304M4384.m4344();
                    c2304M4384.m4347();
                    View view2 = abstractComponentCallbacksC2338M4376.f6881;
                    if (view2 == null) {
                        C5925.m11311(AbstractC0053.m158("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC2338M4376.f6881.getTag() == null) {
                        abstractComponentCallbacksC2338M4376.f6881.setTag(string);
                    }
                    abstractComponentCallbacksC2338M4376.f6881.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1841(this, i, c2304M4384));
                    return abstractComponentCallbacksC2338M4376.f6881;
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
