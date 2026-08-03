package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: renamed from: ni */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C2281ni implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2805zi f8016a;

    public LayoutInflaterFactory2C2281ni(AbstractC2805zi abstractC2805zi) {
        this.f8016a = abstractC2805zi;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0326Hi c0326HiM5408f;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC2805zi abstractC2805zi = this.f8016a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC2805zi);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0767Ru.f2438a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC1503hi.class.isAssignableFrom(C2547ti.m5031b(attributeValue, context.getClassLoader()));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM5379B = resourceId != -1 ? abstractC2805zi.m5379B(resourceId) : null;
                    if (abstractComponentCallbacksC1503hiM5379B == null && string != null) {
                        abstractComponentCallbacksC1503hiM5379B = abstractC2805zi.m5380C(string);
                    }
                    if (abstractComponentCallbacksC1503hiM5379B == null && id != -1) {
                        abstractComponentCallbacksC1503hiM5379B = abstractC2805zi.m5379B(id);
                    }
                    if (abstractComponentCallbacksC1503hiM5379B == null) {
                        C2547ti c2547tiM5382E = abstractC2805zi.m5382E();
                        context.getClassLoader();
                        abstractComponentCallbacksC1503hiM5379B = c2547tiM5382E.m5033a(attributeValue);
                        abstractComponentCallbacksC1503hiM5379B.f5322m = true;
                        abstractComponentCallbacksC1503hiM5379B.f5331v = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC1503hiM5379B.f5332w = id;
                        abstractComponentCallbacksC1503hiM5379B.f5333x = string;
                        abstractComponentCallbacksC1503hiM5379B.f5323n = true;
                        abstractComponentCallbacksC1503hiM5379B.f5327r = abstractC2805zi;
                        C2104ji c2104ji = abstractC2805zi.f9512u;
                        abstractComponentCallbacksC1503hiM5379B.f5328s = c2104ji;
                        AbstractActivityC1244c3 abstractActivityC1244c3 = c2104ji.f7401m;
                        abstractComponentCallbacksC1503hiM5379B.f5294C = true;
                        if ((c2104ji != null ? c2104ji.f7400l : null) != null) {
                            abstractComponentCallbacksC1503hiM5379B.f5294C = true;
                        }
                        c0326HiM5408f = abstractC2805zi.m5400a(abstractComponentCallbacksC1503hiM5379B);
                        if (AbstractC2805zi.m5374G(2)) {
                            abstractComponentCallbacksC1503hiM5379B.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (abstractComponentCallbacksC1503hiM5379B.f5323n) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC1503hiM5379B.f5323n = true;
                        abstractComponentCallbacksC1503hiM5379B.f5327r = abstractC2805zi;
                        C2104ji c2104ji2 = abstractC2805zi.f9512u;
                        abstractComponentCallbacksC1503hiM5379B.f5328s = c2104ji2;
                        AbstractActivityC1244c3 abstractActivityC1244c32 = c2104ji2.f7401m;
                        abstractComponentCallbacksC1503hiM5379B.f5294C = true;
                        if ((c2104ji2 != null ? c2104ji2.f7400l : null) != null) {
                            abstractComponentCallbacksC1503hiM5379B.f5294C = true;
                        }
                        c0326HiM5408f = abstractC2805zi.m5408f(abstractComponentCallbacksC1503hiM5379B);
                        if (AbstractC2805zi.m5374G(2)) {
                            abstractComponentCallbacksC1503hiM5379B.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C0369Ii c0369Ii = AbstractC0412Ji.f1381a;
                    AbstractC0412Ji.m855b(new C0240Fi(abstractComponentCallbacksC1503hiM5379B, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC1503hiM5379B + " to container " + viewGroup));
                    AbstractC0412Ji.m854a(abstractComponentCallbacksC1503hiM5379B).getClass();
                    abstractComponentCallbacksC1503hiM5379B.f5295D = viewGroup;
                    c0326HiM5408f.m704k();
                    c0326HiM5408f.m703j();
                    View view2 = abstractComponentCallbacksC1503hiM5379B.f5296E;
                    if (view2 == null) {
                        throw new IllegalStateException(AbstractC2374ph.m4814k("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC1503hiM5379B.f5296E.getTag() == null) {
                        abstractComponentCallbacksC1503hiM5379B.f5296E.setTag(string);
                    }
                    abstractComponentCallbacksC1503hiM5379B.f5296E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2238mi(this, c0326HiM5408f));
                    return abstractComponentCallbacksC1503hiM5379B.f5296E;
                }
            }
        }
        return null;
    }
}
