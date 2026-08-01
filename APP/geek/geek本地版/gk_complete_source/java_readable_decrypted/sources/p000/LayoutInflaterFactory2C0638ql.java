package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0035a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: ql */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0638ql implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final C0934yl f4108a;

    public LayoutInflaterFactory2C0638ql(C0934yl c0934yl) {
        this.f4108a = c0934yl;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml;
        int i;
        C0035a c0035aM2714f;
        View view2;
        C0934yl c0934yl = this.f4108a;
        C0659r5 c0659r5 = c0934yl.f5354c;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml2 = null;
        if (FragmentContainerView.class.getName().equals(str)) {
            FragmentContainerView fragmentContainerView = new FragmentContainerView(context, attributeSet);
            fragmentContainerView.f503d = true;
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799uy.f4783b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
            }
            String string = typedArrayObtainStyledAttributes.getString(1);
            typedArrayObtainStyledAttributes.recycle();
            int id = fragmentContainerView.getId();
            AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489mlM2730v = c0934yl.m2730v(id);
            if (classAttribute != null && abstractComponentCallbacksC0489mlM2730v == null) {
                if (id <= 0) {
                    throw new IllegalStateException(z30.m2765j("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                }
                C0749tl c0749tlM2732x = c0934yl.m2732x();
                context.getClassLoader();
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489mlM2381a = c0749tlM2732x.m2381a(classAttribute);
                abstractComponentCallbacksC0489mlM2381a.f3227C = true;
                C0526nl c0526nl = abstractComponentCallbacksC0489mlM2381a.f3259s;
                if ((c0526nl == null ? null : c0526nl.f3427C) != null) {
                    abstractComponentCallbacksC0489mlM2381a.f3227C = true;
                }
                C0058b7 c0058b7 = new C0058b7(c0934yl);
                c0058b7.f770o = true;
                abstractComponentCallbacksC0489mlM2381a.f3228D = fragmentContainerView;
                int id2 = fragmentContainerView.getId();
                Class<?> cls = abstractComponentCallbacksC0489mlM2381a.getClass();
                int modifiers = cls.getModifiers();
                if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
                    throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
                }
                if (string != null) {
                    String str2 = abstractComponentCallbacksC0489mlM2381a.f3264x;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0489mlM2381a + ": was " + abstractComponentCallbacksC0489mlM2381a.f3264x + " now " + string);
                    }
                    abstractComponentCallbacksC0489mlM2381a.f3264x = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0489mlM2381a + " with tag " + string + " to container view with no id");
                    }
                    int i2 = abstractComponentCallbacksC0489mlM2381a.f3262v;
                    if (i2 != 0 && i2 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0489mlM2381a + ": was " + abstractComponentCallbacksC0489mlM2381a.f3262v + " now " + id2);
                    }
                    abstractComponentCallbacksC0489mlM2381a.f3262v = id2;
                    abstractComponentCallbacksC0489mlM2381a.f3263w = id2;
                }
                c0058b7.m536b(new C0192em(1, abstractComponentCallbacksC0489mlM2381a));
                C0934yl c0934yl2 = c0058b7.f771p;
                abstractComponentCallbacksC0489mlM2381a.f3258r = c0934yl2;
                if (c0058b7.f762g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                if (c0934yl2.f5365n != null && !c0934yl2.f5345A) {
                    c0934yl2.m2727s(true);
                    c0058b7.mo535a(c0934yl2.f5347C, c0934yl2.f5348D);
                    c0934yl2.f5353b = true;
                    try {
                        c0934yl2.m2699J(c0934yl2.f5347C, c0934yl2.f5348D);
                        c0934yl2.m2712d();
                        c0934yl2.m2708T();
                        if (c0934yl2.f5346B) {
                            c0934yl2.f5346B = false;
                            c0934yl2.m2707S();
                        }
                        ((HashMap) c0934yl2.f5354c.f4209b).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        c0934yl2.m2712d();
                        throw th;
                    }
                }
            }
            ArrayList arrayListM2230i = c0659r5.m2230i();
            int size = arrayListM2230i.size();
            while (id < size) {
                Object obj = arrayListM2230i.get(id);
                id++;
                C0035a c0035a = (C0035a) obj;
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml3 = c0035a.f506c;
                if (abstractComponentCallbacksC0489ml3.f3263w == fragmentContainerView.getId() && (view2 = abstractComponentCallbacksC0489ml3.f3229E) != null && view2.getParent() == null) {
                    abstractComponentCallbacksC0489ml3.f3228D = fragmentContainerView;
                    c0035a.m255b();
                }
            }
            return fragmentContainerView;
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0799uy.f4782a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes2.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(1, -1);
            int i3 = 2;
            String string2 = typedArrayObtainStyledAttributes2.getString(2);
            typedArrayObtainStyledAttributes2.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0489ml.class.isAssignableFrom(C0749tl.m2379b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string2 == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489mlM2730v2 = resourceId != -1 ? c0934yl.m2730v(resourceId) : null;
                    if (abstractComponentCallbacksC0489mlM2730v2 == null && string2 != null) {
                        ArrayList arrayList = (ArrayList) c0659r5.f4210c;
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                abstractComponentCallbacksC0489ml = abstractComponentCallbacksC0489ml2;
                                i = i3;
                                Iterator it = ((HashMap) c0659r5.f4209b).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        abstractComponentCallbacksC0489mlM2730v2 = abstractComponentCallbacksC0489ml;
                                        break;
                                    }
                                    C0035a c0035a2 = (C0035a) it.next();
                                    if (c0035a2 != null) {
                                        abstractComponentCallbacksC0489mlM2730v2 = c0035a2.f506c;
                                        if (string2.equals(abstractComponentCallbacksC0489mlM2730v2.f3264x)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                abstractComponentCallbacksC0489ml = abstractComponentCallbacksC0489ml2;
                                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml4 = (AbstractComponentCallbacksC0489ml) arrayList.get(size2);
                                i = i3;
                                if (abstractComponentCallbacksC0489ml4 != null && string2.equals(abstractComponentCallbacksC0489ml4.f3264x)) {
                                    abstractComponentCallbacksC0489mlM2730v2 = abstractComponentCallbacksC0489ml4;
                                    break;
                                }
                                size2--;
                                i3 = i;
                                abstractComponentCallbacksC0489ml2 = abstractComponentCallbacksC0489ml;
                            }
                        }
                    } else {
                        abstractComponentCallbacksC0489ml = null;
                        i = 2;
                    }
                    if (abstractComponentCallbacksC0489mlM2730v2 == null && id != -1) {
                        abstractComponentCallbacksC0489mlM2730v2 = c0934yl.m2730v(id);
                    }
                    if (abstractComponentCallbacksC0489mlM2730v2 == null) {
                        C0749tl c0749tlM2732x2 = c0934yl.m2732x();
                        context.getClassLoader();
                        abstractComponentCallbacksC0489mlM2730v2 = c0749tlM2732x2.m2381a(attributeValue);
                        abstractComponentCallbacksC0489mlM2730v2.f3253m = true;
                        abstractComponentCallbacksC0489mlM2730v2.f3262v = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0489mlM2730v2.f3263w = id;
                        abstractComponentCallbacksC0489mlM2730v2.f3264x = string2;
                        abstractComponentCallbacksC0489mlM2730v2.f3254n = true;
                        abstractComponentCallbacksC0489mlM2730v2.f3258r = c0934yl;
                        C0526nl c0526nl2 = c0934yl.f5365n;
                        abstractComponentCallbacksC0489mlM2730v2.f3259s = c0526nl2;
                        FragmentActivity fragmentActivity = c0526nl2.f3428D;
                        abstractComponentCallbacksC0489mlM2730v2.f3227C = true;
                        if ((c0526nl2 == null ? abstractComponentCallbacksC0489ml : c0526nl2.f3427C) != null) {
                            abstractComponentCallbacksC0489mlM2730v2.f3227C = true;
                        }
                        c0035aM2714f = c0934yl.m2709a(abstractComponentCallbacksC0489mlM2730v2);
                        if (C0934yl.m2689A(i)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0489mlM2730v2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0489mlM2730v2.f3254n) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0489mlM2730v2.f3254n = true;
                        abstractComponentCallbacksC0489mlM2730v2.f3258r = c0934yl;
                        C0526nl c0526nl3 = c0934yl.f5365n;
                        abstractComponentCallbacksC0489mlM2730v2.f3259s = c0526nl3;
                        FragmentActivity fragmentActivity2 = c0526nl3.f3428D;
                        abstractComponentCallbacksC0489mlM2730v2.f3227C = true;
                        if ((c0526nl3 == null ? abstractComponentCallbacksC0489ml : c0526nl3.f3427C) != null) {
                            abstractComponentCallbacksC0489mlM2730v2.f3227C = true;
                        }
                        c0035aM2714f = c0934yl.m2714f(abstractComponentCallbacksC0489mlM2730v2);
                        if (C0934yl.m2689A(i)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0489mlM2730v2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    abstractComponentCallbacksC0489mlM2730v2.f3228D = (ViewGroup) view;
                    c0035aM2714f.m264k();
                    c0035aM2714f.m263j();
                    View view3 = abstractComponentCallbacksC0489mlM2730v2.f3229E;
                    if (view3 == null) {
                        throw new IllegalStateException(z30.m2765j("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view3.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0489mlM2730v2.f3229E.getTag() == null) {
                        abstractComponentCallbacksC0489mlM2730v2.f3229E.setTag(string2);
                    }
                    abstractComponentCallbacksC0489mlM2730v2.f3229E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0601pl(this, c0035aM2714f));
                    return abstractComponentCallbacksC0489mlM2730v2.f3229E;
                }
            }
        }
        return null;
    }
}
