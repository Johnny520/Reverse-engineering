package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.C1098R;
import androidx.fragment.app.AbstractC1104f;
import androidx.fragment.app.C1102d;
import androidx.fragment.app.C1103e;
import androidx.fragment.app.ComponentCallbacksC1100b;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p000a.ActivityC0422X6;
import p000a.C0743o7;

/* JADX INFO: renamed from: a.a7 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0477a7 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0553e7 f1789a;

    /* JADX INFO: renamed from: a.a7$a */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1103e f1790a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(C1103e c1103e) {
            this.f1790a = c1103e;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            C1103e c1103e = this.f1790a;
            c1103e.m2555k();
            AbstractC1104f.m2562i((ViewGroup) c1103e.f4607c.f4543G.getParent(), LayoutInflaterFactory2C0477a7.this.f1789a).m2569h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C0477a7(AbstractC0553e7 abstractC0553e7) {
        this.f1789a = abstractC0553e7;
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
        C1103e c1103eM1367g;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC0553e7 abstractC0553e7 = this.f1789a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC0553e7);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1098R.styleable.Fragment);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(C1098R.styleable.Fragment_android_name);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1098R.styleable.Fragment_android_id, -1);
            String string = typedArrayObtainStyledAttributes.getString(C1098R.styleable.Fragment_android_tag);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = ComponentCallbacksC1100b.class.isAssignableFrom(C1102d.m2543b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    ComponentCallbacksC1100b componentCallbacksC1100bM1337C = resourceId != -1 ? abstractC0553e7.m1337C(resourceId) : null;
                    if (componentCallbacksC1100bM1337C == null && string != null) {
                        C0003A2 c0003a2 = abstractC0553e7.f2060c;
                        ArrayList arrayList = (ArrayList) c0003a2.f23a;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                ComponentCallbacksC1100b componentCallbacksC1100b = (ComponentCallbacksC1100b) arrayList.get(size);
                                if (componentCallbacksC1100b != null && string.equals(componentCallbacksC1100b.f4582z)) {
                                    componentCallbacksC1100bM1337C = componentCallbacksC1100b;
                                    break;
                                }
                                size--;
                            } else {
                                Iterator it = ((HashMap) c0003a2.f24b).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        componentCallbacksC1100bM1337C = null;
                                        break;
                                    }
                                    C1103e c1103e = (C1103e) it.next();
                                    if (c1103e != null) {
                                        ComponentCallbacksC1100b componentCallbacksC1100b2 = c1103e.f4607c;
                                        if (string.equals(componentCallbacksC1100b2.f4582z)) {
                                            componentCallbacksC1100bM1337C = componentCallbacksC1100b2;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (componentCallbacksC1100bM1337C == null && id != -1) {
                        componentCallbacksC1100bM1337C = abstractC0553e7.m1337C(id);
                    }
                    if (componentCallbacksC1100bM1337C == null) {
                        C1102d c1102dM1340G = abstractC0553e7.m1340G();
                        context.getClassLoader();
                        componentCallbacksC1100bM1337C = c1102dM1340G.mo1391a(attributeValue);
                        componentCallbacksC1100bM1337C.f4570n = true;
                        componentCallbacksC1100bM1337C.f4580x = resourceId != 0 ? resourceId : id;
                        componentCallbacksC1100bM1337C.f4581y = id;
                        componentCallbacksC1100bM1337C.f4582z = string;
                        componentCallbacksC1100bM1337C.f4571o = true;
                        componentCallbacksC1100bM1337C.f4576t = abstractC0553e7;
                        ActivityC0422X6.a aVar = abstractC0553e7.f2079v;
                        componentCallbacksC1100bM1337C.f4577u = aVar;
                        ActivityC0422X6 activityC0422X6 = aVar.f1723b;
                        componentCallbacksC1100bM1337C.f4541E = true;
                        if ((aVar != null ? aVar.f1722a : null) != null) {
                            componentCallbacksC1100bM1337C.f4541E = true;
                        }
                        c1103eM1367g = abstractC0553e7.m1356a(componentCallbacksC1100bM1337C);
                        if (AbstractC0553e7.m1330J(2)) {
                            Log.v("FragmentManager", "Fragment " + componentCallbacksC1100bM1337C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (componentCallbacksC1100bM1337C.f4571o) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        componentCallbacksC1100bM1337C.f4571o = true;
                        componentCallbacksC1100bM1337C.f4576t = abstractC0553e7;
                        ActivityC0422X6.a aVar2 = abstractC0553e7.f2079v;
                        componentCallbacksC1100bM1337C.f4577u = aVar2;
                        ActivityC0422X6 activityC0422X62 = aVar2.f1723b;
                        componentCallbacksC1100bM1337C.f4541E = true;
                        if ((aVar2 != null ? aVar2.f1722a : null) != null) {
                            componentCallbacksC1100bM1337C.f4541E = true;
                        }
                        c1103eM1367g = abstractC0553e7.m1367g(componentCallbacksC1100bM1337C);
                        if (AbstractC0553e7.m1330J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + componentCallbacksC1100bM1337C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C0743o7.b bVar = C0743o7.f2939a;
                    C0743o7.m1763b(new C0705m7(componentCallbacksC1100bM1337C, "Attempting to use <fragment> tag to add fragment " + componentCallbacksC1100bM1337C + " to container " + viewGroup));
                    C0743o7.m1762a(componentCallbacksC1100bM1337C).getClass();
                    componentCallbacksC1100bM1337C.f4542F = viewGroup;
                    c1103eM1367g.m2555k();
                    c1103eM1367g.m2554j();
                    View view2 = componentCallbacksC1100bM1337C.f4543G;
                    if (view2 == null) {
                        throw new IllegalStateException(C0944z.m2227g("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (componentCallbacksC1100bM1337C.f4543G.getTag() == null) {
                        componentCallbacksC1100bM1337C.f4543G.setTag(string);
                    }
                    componentCallbacksC1100bM1337C.f4543G.addOnAttachStateChangeListener(new a(c1103eM1367g));
                    return componentCallbacksC1100bM1337C.f4543G;
                }
            }
        }
        return null;
    }
}
