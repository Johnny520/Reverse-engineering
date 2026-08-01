package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p016I.AbstractC0154a;
import p022L.AbstractC0174d;
import p061e.AbstractActivityC0533i;

/* JADX INFO: renamed from: androidx.fragment.app.s */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0441s implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b */
    public final C0448z f1410b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LayoutInflaterFactory2C0441s(C0448z c0448z) {
        this.f1410b = c0448z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0415F c0415fM883f;
        View view2;
        boolean zEquals = C0439q.class.getName().equals(str);
        C0448z c0448z = this.f1410b;
        if (zEquals) {
            C0439q c0439q = new C0439q(context, attributeSet);
            c0439q.f1407e = true;
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0154a.f467b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
            }
            String string = typedArrayObtainStyledAttributes.getString(1);
            typedArrayObtainStyledAttributes.recycle();
            int id = c0439q.getId();
            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM902y = c0448z.m902y(id);
            if (classAttribute != null && abstractComponentCallbacksC0434lM902y == null) {
                if (id <= 0) {
                    throw new IllegalStateException(AbstractC0174d.m353i("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                }
                C0444v c0444vM862B = c0448z.m862B();
                context.getClassLoader();
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM855a = c0444vM862B.m855a(classAttribute);
                abstractComponentCallbacksC0434lM855a.f1351D = true;
                C0437o c0437o = abstractComponentCallbacksC0434lM855a.f1383t;
                if ((c0437o != null ? c0437o.f1394d : null) != null) {
                    abstractComponentCallbacksC0434lM855a.f1351D = true;
                }
                C0423a c0423a = new C0423a(c0448z);
                c0423a.f1296o = true;
                abstractComponentCallbacksC0434lM855a.f1352E = c0439q;
                c0423a.m819a(c0439q.getId(), abstractComponentCallbacksC0434lM855a, string);
                if (c0423a.f1288g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                c0423a.f1297p.m900w(c0423a, true);
            }
            for (C0415F c0415f : c0448z.f1432c.m121k()) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0415f.f1254c;
                if (abstractComponentCallbacksC0434l.f1387x == c0439q.getId() && (view2 = abstractComponentCallbacksC0434l.f1353F) != null && view2.getParent() == null) {
                    abstractComponentCallbacksC0434l.f1352E = c0439q;
                    c0415f.m790b();
                }
            }
            return c0439q;
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0154a.f466a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes2.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(1, -1);
            String string2 = typedArrayObtainStyledAttributes2.getString(2);
            typedArrayObtainStyledAttributes2.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0434l.class.isAssignableFrom(C0444v.m853b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string2 == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM902y2 = resourceId != -1 ? c0448z.m902y(resourceId) : null;
                    if (abstractComponentCallbacksC0434lM902y2 == null && string2 != null) {
                        abstractComponentCallbacksC0434lM902y2 = c0448z.m903z(string2);
                    }
                    if (abstractComponentCallbacksC0434lM902y2 == null && id2 != -1) {
                        abstractComponentCallbacksC0434lM902y2 = c0448z.m902y(id2);
                    }
                    if (abstractComponentCallbacksC0434lM902y2 == null) {
                        C0444v c0444vM862B2 = c0448z.m862B();
                        context.getClassLoader();
                        abstractComponentCallbacksC0434lM902y2 = c0444vM862B2.m855a(attributeValue);
                        abstractComponentCallbacksC0434lM902y2.f1377n = true;
                        abstractComponentCallbacksC0434lM902y2.f1386w = resourceId != 0 ? resourceId : id2;
                        abstractComponentCallbacksC0434lM902y2.f1387x = id2;
                        abstractComponentCallbacksC0434lM902y2.f1388y = string2;
                        abstractComponentCallbacksC0434lM902y2.f1378o = true;
                        abstractComponentCallbacksC0434lM902y2.f1382s = c0448z;
                        C0437o c0437o2 = c0448z.f1443n;
                        abstractComponentCallbacksC0434lM902y2.f1383t = c0437o2;
                        AbstractActivityC0533i abstractActivityC0533i = c0437o2.f1395e;
                        abstractComponentCallbacksC0434lM902y2.f1351D = true;
                        if ((c0437o2 != null ? c0437o2.f1394d : null) != null) {
                            abstractComponentCallbacksC0434lM902y2.f1351D = true;
                        }
                        c0415fM883f = c0448z.m878a(abstractComponentCallbacksC0434lM902y2);
                        if (C0448z.m856E(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0434lM902y2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0434lM902y2.f1378o) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0434lM902y2.f1378o = true;
                        abstractComponentCallbacksC0434lM902y2.f1382s = c0448z;
                        C0437o c0437o3 = c0448z.f1443n;
                        abstractComponentCallbacksC0434lM902y2.f1383t = c0437o3;
                        AbstractActivityC0533i abstractActivityC0533i2 = c0437o3.f1395e;
                        abstractComponentCallbacksC0434lM902y2.f1351D = true;
                        if ((c0437o3 != null ? c0437o3.f1394d : null) != null) {
                            abstractComponentCallbacksC0434lM902y2.f1351D = true;
                        }
                        c0415fM883f = c0448z.m883f(abstractComponentCallbacksC0434lM902y2);
                        if (C0448z.m856E(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0434lM902y2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    abstractComponentCallbacksC0434lM902y2.f1352E = (ViewGroup) view;
                    c0415fM883f.m799k();
                    c0415fM883f.m798j();
                    View view3 = abstractComponentCallbacksC0434lM902y2.f1353F;
                    if (view3 == null) {
                        throw new IllegalStateException(AbstractC0174d.m353i("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view3.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0434lM902y2.f1353F.getTag() == null) {
                        abstractComponentCallbacksC0434lM902y2.f1353F.setTag(string2);
                    }
                    abstractComponentCallbacksC0434lM902y2.f1353F.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0440r(this, c0415fM883f));
                    return abstractComponentCallbacksC0434lM902y2.f1353F;
                }
            }
        }
        return null;
    }
}
