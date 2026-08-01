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

/* JADX INFO: renamed from: sl */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0711sl implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final C0023am f4339a;

    public LayoutInflaterFactory2C0711sl(C0023am c0023am) {
        this.f4339a = c0023am;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol;
        int i;
        C0035a c0035aM80f;
        View view2;
        C0023am c0023am = this.f4339a;
        C0658r5 c0658r5 = c0023am.f96c;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol2 = null;
        if (FragmentContainerView.class.getName().equals(str)) {
            FragmentContainerView fragmentContainerView = new FragmentContainerView(context, attributeSet);
            fragmentContainerView.f466d = true;
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0085bz.f791b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
            }
            String string = typedArrayObtainStyledAttributes.getString(1);
            typedArrayObtainStyledAttributes.recycle();
            int id = fragmentContainerView.getId();
            AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563olM96v = c0023am.m96v(id);
            if (classAttribute != null && abstractComponentCallbacksC0563olM96v == null) {
                if (id <= 0) {
                    throw new IllegalStateException(g40.m1147j("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                }
                C0822vl c0822vlM98x = c0023am.m98x();
                context.getClassLoader();
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563olM2573a = c0822vlM98x.m2573a(classAttribute);
                abstractComponentCallbacksC0563olM2573a.f3472C = true;
                C0600pl c0600pl = abstractComponentCallbacksC0563olM2573a.f3504s;
                if ((c0600pl == null ? null : c0600pl.f3727y) != null) {
                    abstractComponentCallbacksC0563olM2573a.f3472C = true;
                }
                C0438l7 c0438l7 = new C0438l7(c0023am);
                c0438l7.f2961o = true;
                abstractComponentCallbacksC0563olM2573a.f3473D = fragmentContainerView;
                int id2 = fragmentContainerView.getId();
                Class<?> cls = abstractComponentCallbacksC0563olM2573a.getClass();
                int modifiers = cls.getModifiers();
                if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
                    throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
                }
                if (string != null) {
                    String str2 = abstractComponentCallbacksC0563olM2573a.f3509x;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0563olM2573a + ": was " + abstractComponentCallbacksC0563olM2573a.f3509x + " now " + string);
                    }
                    abstractComponentCallbacksC0563olM2573a.f3509x = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0563olM2573a + " with tag " + string + " to container view with no id");
                    }
                    int i2 = abstractComponentCallbacksC0563olM2573a.f3507v;
                    if (i2 != 0 && i2 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0563olM2573a + ": was " + abstractComponentCallbacksC0563olM2573a.f3507v + " now " + id2);
                    }
                    abstractComponentCallbacksC0563olM2573a.f3507v = id2;
                    abstractComponentCallbacksC0563olM2573a.f3508w = id2;
                }
                c0438l7.m1746b(new C0266gm(1, abstractComponentCallbacksC0563olM2573a));
                C0023am c0023am2 = c0438l7.f2962p;
                abstractComponentCallbacksC0563olM2573a.f3503r = c0023am2;
                if (c0438l7.f2953g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                if (c0023am2.f107n != null && !c0023am2.f87A) {
                    c0023am2.m93s(true);
                    c0438l7.mo1745a(c0023am2.f89C, c0023am2.f90D);
                    c0023am2.f95b = true;
                    try {
                        c0023am2.m65J(c0023am2.f89C, c0023am2.f90D);
                        c0023am2.m78d();
                        c0023am2.m74T();
                        if (c0023am2.f88B) {
                            c0023am2.f88B = false;
                            c0023am2.m73S();
                        }
                        ((HashMap) c0023am2.f96c.f4064b).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        c0023am2.m78d();
                        throw th;
                    }
                }
            }
            ArrayList arrayListM2237i = c0658r5.m2237i();
            int size = arrayListM2237i.size();
            while (id < size) {
                Object obj = arrayListM2237i.get(id);
                id++;
                C0035a c0035a = (C0035a) obj;
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol3 = c0035a.f469c;
                if (abstractComponentCallbacksC0563ol3.f3508w == fragmentContainerView.getId() && (view2 = abstractComponentCallbacksC0563ol3.f3474E) != null && view2.getParent() == null) {
                    abstractComponentCallbacksC0563ol3.f3473D = fragmentContainerView;
                    c0035a.m240b();
                }
            }
            return fragmentContainerView;
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0085bz.f790a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes2.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(1, -1);
            int i3 = 2;
            String string2 = typedArrayObtainStyledAttributes2.getString(2);
            typedArrayObtainStyledAttributes2.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0563ol.class.isAssignableFrom(C0822vl.m2571b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string2 == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563olM96v2 = resourceId != -1 ? c0023am.m96v(resourceId) : null;
                    if (abstractComponentCallbacksC0563olM96v2 == null && string2 != null) {
                        ArrayList arrayList = (ArrayList) c0658r5.f4065c;
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                abstractComponentCallbacksC0563ol = abstractComponentCallbacksC0563ol2;
                                i = i3;
                                Iterator it = ((HashMap) c0658r5.f4064b).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        abstractComponentCallbacksC0563olM96v2 = abstractComponentCallbacksC0563ol;
                                        break;
                                    }
                                    C0035a c0035a2 = (C0035a) it.next();
                                    if (c0035a2 != null) {
                                        abstractComponentCallbacksC0563olM96v2 = c0035a2.f469c;
                                        if (string2.equals(abstractComponentCallbacksC0563olM96v2.f3509x)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                abstractComponentCallbacksC0563ol = abstractComponentCallbacksC0563ol2;
                                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol4 = (AbstractComponentCallbacksC0563ol) arrayList.get(size2);
                                i = i3;
                                if (abstractComponentCallbacksC0563ol4 != null && string2.equals(abstractComponentCallbacksC0563ol4.f3509x)) {
                                    abstractComponentCallbacksC0563olM96v2 = abstractComponentCallbacksC0563ol4;
                                    break;
                                }
                                size2--;
                                i3 = i;
                                abstractComponentCallbacksC0563ol2 = abstractComponentCallbacksC0563ol;
                            }
                        }
                    } else {
                        abstractComponentCallbacksC0563ol = null;
                        i = 2;
                    }
                    if (abstractComponentCallbacksC0563olM96v2 == null && id != -1) {
                        abstractComponentCallbacksC0563olM96v2 = c0023am.m96v(id);
                    }
                    if (abstractComponentCallbacksC0563olM96v2 == null) {
                        C0822vl c0822vlM98x2 = c0023am.m98x();
                        context.getClassLoader();
                        abstractComponentCallbacksC0563olM96v2 = c0822vlM98x2.m2573a(attributeValue);
                        abstractComponentCallbacksC0563olM96v2.f3498m = true;
                        abstractComponentCallbacksC0563olM96v2.f3507v = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0563olM96v2.f3508w = id;
                        abstractComponentCallbacksC0563olM96v2.f3509x = string2;
                        abstractComponentCallbacksC0563olM96v2.f3499n = true;
                        abstractComponentCallbacksC0563olM96v2.f3503r = c0023am;
                        C0600pl c0600pl2 = c0023am.f107n;
                        abstractComponentCallbacksC0563olM96v2.f3504s = c0600pl2;
                        FragmentActivity fragmentActivity = c0600pl2.f3728z;
                        abstractComponentCallbacksC0563olM96v2.f3472C = true;
                        if ((c0600pl2 == null ? abstractComponentCallbacksC0563ol : c0600pl2.f3727y) != null) {
                            abstractComponentCallbacksC0563olM96v2.f3472C = true;
                        }
                        c0035aM80f = c0023am.m75a(abstractComponentCallbacksC0563olM96v2);
                        if (C0023am.m55A(i)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0563olM96v2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0563olM96v2.f3499n) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0563olM96v2.f3499n = true;
                        abstractComponentCallbacksC0563olM96v2.f3503r = c0023am;
                        C0600pl c0600pl3 = c0023am.f107n;
                        abstractComponentCallbacksC0563olM96v2.f3504s = c0600pl3;
                        FragmentActivity fragmentActivity2 = c0600pl3.f3728z;
                        abstractComponentCallbacksC0563olM96v2.f3472C = true;
                        if ((c0600pl3 == null ? abstractComponentCallbacksC0563ol : c0600pl3.f3727y) != null) {
                            abstractComponentCallbacksC0563olM96v2.f3472C = true;
                        }
                        c0035aM80f = c0023am.m80f(abstractComponentCallbacksC0563olM96v2);
                        if (C0023am.m55A(i)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0563olM96v2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    abstractComponentCallbacksC0563olM96v2.f3473D = (ViewGroup) view;
                    c0035aM80f.m249k();
                    c0035aM80f.m248j();
                    View view3 = abstractComponentCallbacksC0563olM96v2.f3474E;
                    if (view3 == null) {
                        throw new IllegalStateException(g40.m1147j("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view3.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0563olM96v2.f3474E.getTag() == null) {
                        abstractComponentCallbacksC0563olM96v2.f3474E.setTag(string2);
                    }
                    abstractComponentCallbacksC0563olM96v2.f3474E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0674rl(this, c0035aM80f));
                    return abstractComponentCallbacksC0563olM96v2.f3474E;
                }
            }
        }
        return null;
    }
}
