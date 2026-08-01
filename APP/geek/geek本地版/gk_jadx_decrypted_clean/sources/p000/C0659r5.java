package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0035a;
import androidx.recyclerview.widget.RecyclerView;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: r5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0659r5 implements InterfaceC0365j8 {

    /* JADX INFO: renamed from: e */
    public static volatile C0659r5 f4205e;

    /* JADX INFO: renamed from: f */
    public static final Object f4206f = new Object();

    /* JADX INFO: renamed from: g */
    public static C0659r5 f4207g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4208a;

    /* JADX INFO: renamed from: b */
    public final Object f4209b;

    /* JADX INFO: renamed from: c */
    public Object f4210c;

    /* JADX INFO: renamed from: d */
    public Object f4211d;

    public C0659r5() {
        this.f4208a = 5;
        this.f4210c = new ArrayList();
        this.f4209b = new HashMap();
    }

    /* JADX INFO: renamed from: q */
    public static C0659r5 m2218q(Context context) {
        if (f4205e == null) {
            synchronized (f4206f) {
                try {
                    if (f4205e == null) {
                        f4205e = new C0659r5(context);
                    }
                } finally {
                }
            }
        }
        return f4205e;
    }

    /* JADX INFO: renamed from: y */
    public static C0659r5 m2219y(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0659r5(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX INFO: renamed from: A */
    public void m2220A(C0629qc c0629qc, int i, int i2) {
        int i3 = c0629qc.f3840Q;
        int i4 = c0629qc.f3841R;
        c0629qc.f3840Q = 0;
        c0629qc.f3841R = 0;
        c0629qc.m2113y(i);
        c0629qc.m2110v(i2);
        if (i3 < 0) {
            c0629qc.f3840Q = 0;
        } else {
            c0629qc.f3840Q = i3;
        }
        if (i4 < 0) {
            c0629qc.f3841R = 0;
        } else {
            c0629qc.f3841R = i4;
        }
        ((C0629qc) this.f4211d).m2168E();
    }

    /* JADX INFO: renamed from: B */
    public void m2221B(View view) {
        if (((ArrayList) this.f4211d).remove(view)) {
            C0205ez c0205ez = (C0205ez) this.f4209b;
            b00 b00VarM367I = RecyclerView.m367I(view);
            if (b00VarM367I != null) {
                RecyclerView recyclerView = c0205ez.f1865a;
                int i = b00VarM367I.f712p;
                if (recyclerView.m382L()) {
                    b00VarM367I.f713q = i;
                    recyclerView.f614p0.add(b00VarM367I);
                } else {
                    View view2 = b00VarM367I.f697a;
                    WeakHashMap weakHashMap = ja0.f2600a;
                    s90.m2327s(view2, i);
                }
                b00VarM367I.f712p = 0;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2222a(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        if (((ArrayList) this.f4210c).contains(abstractComponentCallbacksC0489ml)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0489ml);
        }
        synchronized (((ArrayList) this.f4210c)) {
            ((ArrayList) this.f4210c).add(abstractComponentCallbacksC0489ml);
        }
        abstractComponentCallbacksC0489ml.f3251k = true;
    }

    /* JADX INFO: renamed from: b */
    public void m2223b(View view, int i, boolean z) {
        RecyclerView recyclerView = ((C0205ez) this.f4209b).f1865a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2238r(i);
        ((C0217fa) this.f4210c).m1148e(childCount, z);
        if (z) {
            m2241u(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m367I(view);
    }

    /* JADX INFO: renamed from: c */
    public void m2224c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((C0205ez) this.f4209b).f1865a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2238r(i);
        ((C0217fa) this.f4210c).m1148e(childCount, z);
        if (z) {
            m2241u(view);
        }
        b00 b00VarM367I = RecyclerView.m367I(view);
        if (b00VarM367I != null) {
            if (!b00VarM367I.m490j() && !b00VarM367I.m495o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + b00VarM367I + recyclerView.m418y());
            }
            b00VarM367I.f706j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m2225d(int i) {
        b00 b00VarM367I;
        int iM2238r = m2238r(i);
        ((C0217fa) this.f4210c).m1149f(iM2238r);
        RecyclerView recyclerView = ((C0205ez) this.f4209b).f1865a;
        View childAt = recyclerView.getChildAt(iM2238r);
        if (childAt != null && (b00VarM367I = RecyclerView.m367I(childAt)) != null) {
            if (b00VarM367I.m490j() && !b00VarM367I.m495o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + b00VarM367I + recyclerView.m418y());
            }
            b00VarM367I.m481a(256);
        }
        recyclerView.detachViewFromParent(iM2238r);
    }

    /* JADX INFO: renamed from: e */
    public void m2226e(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f4210c;
        String string = ((Context) this.f4211d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC0039ap.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m2227f((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0591pb(e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public Object m2227f(Class cls, HashSet hashSet) {
        Object objMo250b;
        HashMap map = (HashMap) this.f4209b;
        if (AbstractC0126ct.m820r()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo250b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0039ap interfaceC0039ap = (InterfaceC0039ap) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo249a = interfaceC0039ap.mo249a();
                if (!listMo249a.isEmpty()) {
                    for (Class cls2 : listMo249a) {
                        if (!map.containsKey(cls2)) {
                            m2227f(cls2, hashSet);
                        }
                    }
                }
                objMo250b = interfaceC0039ap.mo250b((Context) this.f4211d);
                hashSet.remove(cls);
                map.put(cls, objMo250b);
            } catch (Throwable th2) {
                throw new C0591pb(th2);
            }
        }
        Trace.endSection();
        return objMo250b;
    }

    /* JADX INFO: renamed from: g */
    public AbstractComponentCallbacksC0489ml m2228g(String str) {
        C0035a c0035a = (C0035a) ((HashMap) this.f4209b).get(str);
        if (c0035a != null) {
            return c0035a.f506c;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public AbstractComponentCallbacksC0489ml m2229h(String str) {
        for (C0035a c0035a : ((HashMap) this.f4209b).values()) {
            if (c0035a != null) {
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489mlM2229h = c0035a.f506c;
                if (!str.equals(abstractComponentCallbacksC0489mlM2229h.f3245e)) {
                    abstractComponentCallbacksC0489mlM2229h = abstractComponentCallbacksC0489mlM2229h.f3260t.f5354c.m2229h(str);
                }
                if (abstractComponentCallbacksC0489mlM2229h != null) {
                    return abstractComponentCallbacksC0489mlM2229h;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public ArrayList m2230i() {
        ArrayList arrayList = new ArrayList();
        for (C0035a c0035a : ((HashMap) this.f4209b).values()) {
            if (c0035a != null) {
                arrayList.add(c0035a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public View m2231j(int i) {
        return ((C0205ez) this.f4209b).f1865a.getChildAt(m2238r(i));
    }

    /* JADX INFO: renamed from: k */
    public int m2232k() {
        return ((C0205ez) this.f4209b).f1865a.getChildCount() - ((ArrayList) this.f4211d).size();
    }

    /* JADX INFO: renamed from: l */
    public ColorStateList m2233l(int i) {
        int resourceId;
        ColorStateList colorStateListM1510v;
        TypedArray typedArray = (TypedArray) this.f4209b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM1510v = AbstractC0346ip.m1510v((Context) this.f4211d, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM1510v;
    }

    /* JADX INFO: renamed from: m */
    public Drawable m2234m(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f4209b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0222ff.m1196r((Context) this.f4211d, resourceId);
    }

    /* JADX INFO: renamed from: n */
    public Drawable m2235n(int i) {
        int resourceId;
        Drawable drawableM2541d;
        if (!((TypedArray) this.f4209b).hasValue(i) || (resourceId = ((TypedArray) this.f4209b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0768u3 c0768u3M2404a = C0768u3.m2404a();
        Context context = (Context) this.f4211d;
        synchronized (c0768u3M2404a) {
            drawableM2541d = c0768u3M2404a.f4655a.m2541d(context, resourceId, true);
        }
        return drawableM2541d;
    }

    /* JADX INFO: renamed from: o */
    public Typeface m2236o(int i, int i2, C0880x4 c0880x4) {
        int resourceId = ((TypedArray) this.f4209b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f4210c) == null) {
            this.f4210c = new TypedValue();
        }
        Context context = (Context) this.f4211d;
        TypedValue typedValue = (TypedValue) this.f4210c;
        ThreadLocal threadLocal = c10.f879a;
        if (context.isRestricted()) {
            return null;
        }
        return c10.m626b(context, resourceId, typedValue, i2, c0880x4, true, false);
    }

    @Override // p000.InterfaceC0365j8
    public void onCancel() {
        View view = (View) this.f4209b;
        view.clearAnimation();
        ((ViewGroup) this.f4210c).endViewTransition(view);
        ((C0017ag) this.f4211d).m1986d();
    }

    /* JADX INFO: renamed from: p */
    public List m2237p() {
        ArrayList arrayList;
        if (((ArrayList) this.f4210c).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f4210c)) {
            arrayList = new ArrayList((ArrayList) this.f4210c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public int m2238r(int i) {
        C0217fa c0217fa = (C0217fa) this.f4210c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0205ez) this.f4209b).f1865a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM1145b = i - (i2 - c0217fa.m1145b(i2));
            if (iM1145b == 0) {
                while (c0217fa.m1147d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM1145b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public View m2239s(int i) {
        return ((C0205ez) this.f4209b).f1865a.getChildAt(i);
    }

    /* JADX INFO: renamed from: t */
    public int m2240t() {
        return ((C0205ez) this.f4209b).f1865a.getChildCount();
    }

    public String toString() {
        switch (this.f4208a) {
            case 3:
                return ((C0217fa) this.f4210c).toString() + ", hidden list:" + ((ArrayList) this.f4211d).size();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m2241u(View view) {
        ((ArrayList) this.f4211d).add(view);
        C0205ez c0205ez = (C0205ez) this.f4209b;
        b00 b00VarM367I = RecyclerView.m367I(view);
        if (b00VarM367I != null) {
            View view2 = b00VarM367I.f697a;
            RecyclerView recyclerView = c0205ez.f1865a;
            int i = b00VarM367I.f713q;
            if (i != -1) {
                b00VarM367I.f712p = i;
            } else {
                WeakHashMap weakHashMap = ja0.f2600a;
                b00VarM367I.f712p = s90.m2311c(view2);
            }
            if (recyclerView.m382L()) {
                b00VarM367I.f713q = 4;
                recyclerView.f614p0.add(b00VarM367I);
            } else {
                WeakHashMap weakHashMap2 = ja0.f2600a;
                s90.m2327s(view2, 4);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m2242v(C0035a c0035a) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0035a.f506c;
        String str = abstractComponentCallbacksC0489ml.f3245e;
        HashMap map = (HashMap) this.f4209b;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0489ml.f3245e, c0035a);
        if (C0934yl.m2689A(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0489ml);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m2243w(C0035a c0035a) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0035a.f506c;
        if (abstractComponentCallbacksC0489ml.f3225A) {
            ((C0023am) this.f4211d).m114b(abstractComponentCallbacksC0489ml);
        }
        if (((C0035a) ((HashMap) this.f4209b).put(abstractComponentCallbacksC0489ml.f3245e, null)) != null && C0934yl.m2689A(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0489ml);
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m2244x(C0293hc c0293hc, C0592pc c0592pc, boolean z) {
        C0401k7 c0401k7 = (C0401k7) this.f4210c;
        int[] iArr = c0592pc.f3855c0;
        int[] iArr2 = c0592pc.f3864l;
        c0401k7.f2707a = iArr[0];
        c0401k7.f2708b = iArr[1];
        c0401k7.f2709c = c0592pc.m2100l();
        c0401k7.f2710d = c0592pc.m2097i();
        c0401k7.f2715i = false;
        c0401k7.f2716j = z;
        boolean z2 = c0401k7.f2707a == 3;
        boolean z3 = c0401k7.f2708b == 3;
        boolean z4 = z2 && c0592pc.f3835L > 0.0f;
        boolean z5 = z3 && c0592pc.f3835L > 0.0f;
        if (z4 && iArr2[0] == 4) {
            c0401k7.f2707a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0401k7.f2708b = 1;
        }
        c0293hc.m1353a(c0592pc, c0401k7);
        c0592pc.m2113y(c0401k7.f2711e);
        c0592pc.m2110v(c0401k7.f2712f);
        c0592pc.f3875w = c0401k7.f2714h;
        int i = c0401k7.f2713g;
        c0592pc.f3839P = i;
        c0592pc.f3875w = i > 0;
        c0401k7.f2716j = false;
        return c0401k7.f2715i;
    }

    /* JADX INFO: renamed from: z */
    public void m2245z() {
        ((TypedArray) this.f4209b).recycle();
    }

    public C0659r5(C0205ez c0205ez) {
        this.f4208a = 3;
        this.f4209b = c0205ez;
        this.f4210c = new C0217fa();
        this.f4211d = new ArrayList();
    }

    public C0659r5(Context context, TypedArray typedArray) {
        this.f4208a = 6;
        this.f4211d = context;
        this.f4209b = typedArray;
    }

    public C0659r5(Context context, LocationManager locationManager) {
        this.f4208a = 7;
        this.f4210c = new z70();
        this.f4211d = context;
        this.f4209b = locationManager;
    }

    public C0659r5(Context context) {
        this.f4208a = 0;
        this.f4211d = context.getApplicationContext();
        this.f4210c = new HashSet();
        this.f4209b = new HashMap();
    }

    public C0659r5(C0629qc c0629qc) {
        this.f4208a = 2;
        this.f4209b = new ArrayList();
        this.f4210c = new C0401k7();
        this.f4211d = c0629qc;
    }

    public C0659r5(C0431l0 c0431l0) {
        this.f4208a = 1;
        this.f4208a = 1;
        this.f4209b = c0431l0;
        this.f4210c = Choreographer.getInstance();
        this.f4211d = new ChoreographerFrameCallbackC0544o2(this);
    }

    public C0659r5(C0017ag c0017ag, View view, ViewGroup viewGroup) {
        this.f4208a = 4;
        this.f4209b = view;
        this.f4210c = viewGroup;
        this.f4211d = c0017ag;
    }
}
