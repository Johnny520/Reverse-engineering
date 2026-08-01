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
public final class C0658r5 implements InterfaceC0735t8 {

    /* JADX INFO: renamed from: e */
    public static volatile C0658r5 f4060e;

    /* JADX INFO: renamed from: f */
    public static final Object f4061f = new Object();

    /* JADX INFO: renamed from: g */
    public static C0658r5 f4062g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4063a;

    /* JADX INFO: renamed from: b */
    public final Object f4064b;

    /* JADX INFO: renamed from: c */
    public Object f4065c;

    /* JADX INFO: renamed from: d */
    public Object f4066d;

    public C0658r5() {
        this.f4063a = 5;
        this.f4065c = new ArrayList();
        this.f4064b = new HashMap();
    }

    /* JADX INFO: renamed from: q */
    public static C0658r5 m2225q(Context context) {
        if (f4060e == null) {
            synchronized (f4061f) {
                try {
                    if (f4060e == null) {
                        f4060e = new C0658r5(context);
                    }
                } finally {
                }
            }
        }
        return f4060e;
    }

    /* JADX INFO: renamed from: y */
    public static C0658r5 m2226y(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0658r5(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX INFO: renamed from: A */
    public void m2227A(C0962zc c0962zc, int i, int i2) {
        int i3 = c0962zc.f5387Q;
        int i4 = c0962zc.f5388R;
        c0962zc.f5387Q = 0;
        c0962zc.f5388R = 0;
        c0962zc.m2762y(i);
        c0962zc.m2759v(i2);
        if (i3 < 0) {
            c0962zc.f5387Q = 0;
        } else {
            c0962zc.f5387Q = i3;
        }
        if (i4 < 0) {
            c0962zc.f5388R = 0;
        } else {
            c0962zc.f5388R = i4;
        }
        ((C0962zc) this.f4066d).m2836E();
    }

    /* JADX INFO: renamed from: B */
    public void m2228B(View view) {
        if (((ArrayList) this.f4066d).remove(view)) {
            C0466lz c0466lz = (C0466lz) this.f4064b;
            i00 i00VarM352I = RecyclerView.m352I(view);
            if (i00VarM352I != null) {
                RecyclerView recyclerView = c0466lz.f3055a;
                int i = i00VarM352I.f2311p;
                if (recyclerView.m367L()) {
                    i00VarM352I.f2312q = i;
                    recyclerView.f577p0.add(i00VarM352I);
                } else {
                    View view2 = i00VarM352I.f2296a;
                    WeakHashMap weakHashMap = oa0.f3426a;
                    x90.m2671s(view2, i);
                }
                i00VarM352I.f2311p = 0;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2229a(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        if (((ArrayList) this.f4065c).contains(abstractComponentCallbacksC0563ol)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0563ol);
        }
        synchronized (((ArrayList) this.f4065c)) {
            ((ArrayList) this.f4065c).add(abstractComponentCallbacksC0563ol);
        }
        abstractComponentCallbacksC0563ol.f3496k = true;
    }

    /* JADX INFO: renamed from: b */
    public void m2230b(View view, int i, boolean z) {
        RecyclerView recyclerView = ((C0466lz) this.f4064b).f3055a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2245r(i);
        ((C0515na) this.f4065c).m1933e(childCount, z);
        if (z) {
            m2248u(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m352I(view);
    }

    /* JADX INFO: renamed from: c */
    public void m2231c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((C0466lz) this.f4064b).f3055a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2245r(i);
        ((C0515na) this.f4065c).m1933e(childCount, z);
        if (z) {
            m2248u(view);
        }
        i00 i00VarM352I = RecyclerView.m352I(view);
        if (i00VarM352I != null) {
            if (!i00VarM352I.m1428j() && !i00VarM352I.m1433o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + i00VarM352I + recyclerView.m403y());
            }
            i00VarM352I.f2305j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m2232d(int i) {
        i00 i00VarM352I;
        int iM2245r = m2245r(i);
        ((C0515na) this.f4065c).m1934f(iM2245r);
        RecyclerView recyclerView = ((C0466lz) this.f4064b).f3055a;
        View childAt = recyclerView.getChildAt(iM2245r);
        if (childAt != null && (i00VarM352I = RecyclerView.m352I(childAt)) != null) {
            if (i00VarM352I.m1428j() && !i00VarM352I.m1433o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + i00VarM352I + recyclerView.m403y());
            }
            i00VarM352I.m1419a(256);
        }
        recyclerView.detachViewFromParent(iM2245r);
    }

    /* JADX INFO: renamed from: e */
    public void m2233e(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f4065c;
        String string = ((Context) this.f4066d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC0195ep.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m2234f((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0924yb(e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public Object m2234f(Class cls, HashSet hashSet) {
        Object objMo235b;
        HashMap map = (HashMap) this.f4064b;
        if (AbstractC0387ju.m1628q()) {
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
            objMo235b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0195ep interfaceC0195ep = (InterfaceC0195ep) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo234a = interfaceC0195ep.mo234a();
                if (!listMo234a.isEmpty()) {
                    for (Class cls2 : listMo234a) {
                        if (!map.containsKey(cls2)) {
                            m2234f(cls2, hashSet);
                        }
                    }
                }
                objMo235b = interfaceC0195ep.mo235b((Context) this.f4066d);
                hashSet.remove(cls);
                map.put(cls, objMo235b);
            } catch (Throwable th2) {
                throw new C0924yb(th2);
            }
        }
        Trace.endSection();
        return objMo235b;
    }

    /* JADX INFO: renamed from: g */
    public AbstractComponentCallbacksC0563ol m2235g(String str) {
        C0035a c0035a = (C0035a) ((HashMap) this.f4064b).get(str);
        if (c0035a != null) {
            return c0035a.f469c;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public AbstractComponentCallbacksC0563ol m2236h(String str) {
        for (C0035a c0035a : ((HashMap) this.f4064b).values()) {
            if (c0035a != null) {
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563olM2236h = c0035a.f469c;
                if (!str.equals(abstractComponentCallbacksC0563olM2236h.f3490e)) {
                    abstractComponentCallbacksC0563olM2236h = abstractComponentCallbacksC0563olM2236h.f3505t.f96c.m2236h(str);
                }
                if (abstractComponentCallbacksC0563olM2236h != null) {
                    return abstractComponentCallbacksC0563olM2236h;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public ArrayList m2237i() {
        ArrayList arrayList = new ArrayList();
        for (C0035a c0035a : ((HashMap) this.f4064b).values()) {
            if (c0035a != null) {
                arrayList.add(c0035a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public View m2238j(int i) {
        return ((C0466lz) this.f4064b).f3055a.getChildAt(m2245r(i));
    }

    /* JADX INFO: renamed from: k */
    public int m2239k() {
        return ((C0466lz) this.f4064b).f3055a.getChildCount() - ((ArrayList) this.f4066d).size();
    }

    /* JADX INFO: renamed from: l */
    public ColorStateList m2240l(int i) {
        int resourceId;
        ColorStateList colorStateListM1864n;
        TypedArray typedArray = (TypedArray) this.f4064b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM1864n = AbstractC0493mp.m1864n((Context) this.f4066d, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM1864n;
    }

    /* JADX INFO: renamed from: m */
    public Drawable m2241m(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f4064b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0259gf.m1261w((Context) this.f4066d, resourceId);
    }

    /* JADX INFO: renamed from: n */
    public Drawable m2242n(int i) {
        int resourceId;
        Drawable drawableM821d;
        if (!((TypedArray) this.f4064b).hasValue(i) || (resourceId = ((TypedArray) this.f4064b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0767u3 c0767u3M2425a = C0767u3.m2425a();
        Context context = (Context) this.f4066d;
        synchronized (c0767u3M2425a) {
            drawableM821d = c0767u3M2425a.f4623a.m821d(context, resourceId, true);
        }
        return drawableM821d;
    }

    /* JADX INFO: renamed from: o */
    public Typeface m2243o(int i, int i2, C0880x4 c0880x4) {
        int resourceId = ((TypedArray) this.f4064b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f4065c) == null) {
            this.f4065c = new TypedValue();
        }
        Context context = (Context) this.f4066d;
        TypedValue typedValue = (TypedValue) this.f4065c;
        ThreadLocal threadLocal = j10.f2646a;
        if (context.isRestricted()) {
            return null;
        }
        return j10.m1564b(context, resourceId, typedValue, i2, c0880x4, true, false);
    }

    @Override // p000.InterfaceC0735t8
    public void onCancel() {
        View view = (View) this.f4064b;
        view.clearAnimation();
        ((ViewGroup) this.f4065c).endViewTransition(view);
        ((C0067bg) this.f4066d).m1967d();
    }

    /* JADX INFO: renamed from: p */
    public List m2244p() {
        ArrayList arrayList;
        if (((ArrayList) this.f4065c).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f4065c)) {
            arrayList = new ArrayList((ArrayList) this.f4065c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public int m2245r(int i) {
        C0515na c0515na = (C0515na) this.f4065c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0466lz) this.f4064b).f3055a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM1930b = i - (i2 - c0515na.m1930b(i2));
            if (iM1930b == 0) {
                while (c0515na.m1932d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM1930b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public View m2246s(int i) {
        return ((C0466lz) this.f4064b).f3055a.getChildAt(i);
    }

    /* JADX INFO: renamed from: t */
    public int m2247t() {
        return ((C0466lz) this.f4064b).f3055a.getChildCount();
    }

    public String toString() {
        switch (this.f4063a) {
            case 3:
                return ((C0515na) this.f4065c).toString() + ", hidden list:" + ((ArrayList) this.f4066d).size();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m2248u(View view) {
        ((ArrayList) this.f4066d).add(view);
        C0466lz c0466lz = (C0466lz) this.f4064b;
        i00 i00VarM352I = RecyclerView.m352I(view);
        if (i00VarM352I != null) {
            View view2 = i00VarM352I.f2296a;
            RecyclerView recyclerView = c0466lz.f3055a;
            int i = i00VarM352I.f2312q;
            if (i != -1) {
                i00VarM352I.f2311p = i;
            } else {
                WeakHashMap weakHashMap = oa0.f3426a;
                i00VarM352I.f2311p = x90.m2655c(view2);
            }
            if (recyclerView.m367L()) {
                i00VarM352I.f2312q = 4;
                recyclerView.f577p0.add(i00VarM352I);
            } else {
                WeakHashMap weakHashMap2 = oa0.f3426a;
                x90.m2671s(view2, 4);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m2249v(C0035a c0035a) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0035a.f469c;
        String str = abstractComponentCallbacksC0563ol.f3490e;
        HashMap map = (HashMap) this.f4064b;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0563ol.f3490e, c0035a);
        if (C0023am.m55A(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0563ol);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m2250w(C0035a c0035a) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0035a.f469c;
        if (abstractComponentCallbacksC0563ol.f3470A) {
            ((C0109cm) this.f4066d).m652b(abstractComponentCallbacksC0563ol);
        }
        if (((C0035a) ((HashMap) this.f4064b).put(abstractComponentCallbacksC0563ol.f3490e, null)) != null && C0023am.m55A(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0563ol);
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m2251x(C0628qc c0628qc, C0925yc c0925yc, boolean z) {
        C0771u7 c0771u7 = (C0771u7) this.f4065c;
        int[] iArr = c0925yc.f5402c0;
        int[] iArr2 = c0925yc.f5411l;
        c0771u7.f4651a = iArr[0];
        c0771u7.f4652b = iArr[1];
        c0771u7.f4653c = c0925yc.m2749l();
        c0771u7.f4654d = c0925yc.m2746i();
        c0771u7.f4659i = false;
        c0771u7.f4660j = z;
        boolean z2 = c0771u7.f4651a == 3;
        boolean z3 = c0771u7.f4652b == 3;
        boolean z4 = z2 && c0925yc.f5382L > 0.0f;
        boolean z5 = z3 && c0925yc.f5382L > 0.0f;
        if (z4 && iArr2[0] == 4) {
            c0771u7.f4651a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0771u7.f4652b = 1;
        }
        c0628qc.m2145a(c0925yc, c0771u7);
        c0925yc.m2762y(c0771u7.f4655e);
        c0925yc.m2759v(c0771u7.f4656f);
        c0925yc.f5422w = c0771u7.f4658h;
        int i = c0771u7.f4657g;
        c0925yc.f5386P = i;
        c0925yc.f5422w = i > 0;
        c0771u7.f4660j = false;
        return c0771u7.f4659i;
    }

    /* JADX INFO: renamed from: z */
    public void m2252z() {
        ((TypedArray) this.f4064b).recycle();
    }

    public C0658r5(C0466lz c0466lz) {
        this.f4063a = 3;
        this.f4064b = c0466lz;
        this.f4065c = new C0515na();
        this.f4066d = new ArrayList();
    }

    public C0658r5(Context context, TypedArray typedArray) {
        this.f4063a = 6;
        this.f4066d = context;
        this.f4064b = typedArray;
    }

    public C0658r5(Context context, LocationManager locationManager) {
        this.f4063a = 7;
        this.f4065c = new f80();
        this.f4066d = context;
        this.f4064b = locationManager;
    }

    public C0658r5(Context context) {
        this.f4063a = 0;
        this.f4066d = context.getApplicationContext();
        this.f4065c = new HashSet();
        this.f4064b = new HashMap();
    }

    public C0658r5(C0962zc c0962zc) {
        this.f4063a = 2;
        this.f4064b = new ArrayList();
        this.f4065c = new C0771u7();
        this.f4066d = c0962zc;
    }

    public C0658r5(C0431l0 c0431l0) {
        this.f4063a = 1;
        this.f4063a = 1;
        this.f4064b = c0431l0;
        this.f4065c = Choreographer.getInstance();
        this.f4066d = new ChoreographerFrameCallbackC0544o2(this);
    }

    public C0658r5(C0067bg c0067bg, View view, ViewGroup viewGroup) {
        this.f4063a = 4;
        this.f4064b = view;
        this.f4065c = viewGroup;
        this.f4066d = c0067bg;
    }
}
