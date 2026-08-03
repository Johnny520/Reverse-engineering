package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: wy */
/* JADX INFO: loaded from: classes.dex */
public final class C2692wy implements InterfaceC1014Xj {

    /* JADX INFO: renamed from: e */
    public static volatile C2692wy f9262e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9263a;

    /* JADX INFO: renamed from: b */
    public boolean f9264b;

    /* JADX INFO: renamed from: c */
    public final Object f9265c;

    /* JADX INFO: renamed from: d */
    public final Object f9266d;

    public C2692wy() {
        this.f9263a = 2;
        this.f9265c = Collections.newSetFromMap(new WeakHashMap());
        this.f9266d = new HashSet();
    }

    /* JADX INFO: renamed from: b */
    public static C2692wy m5266b(Context context) {
        if (f9262e == null) {
            synchronized (C2692wy.class) {
                try {
                    if (f9262e == null) {
                        f9262e = new C2692wy(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f9262e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5267a(InterfaceC1026Xv interfaceC1026Xv) {
        boolean z = true;
        if (interfaceC1026Xv == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f9265c).remove(interfaceC1026Xv);
        if (!((HashSet) this.f9266d).remove(interfaceC1026Xv) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC1026Xv.clear();
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public void m5268c() {
        InterfaceC2075ix interfaceC2075ix = (InterfaceC2075ix) this.f9265c;
        AbstractC0760Rn lifecycle = interfaceC2075ix.getLifecycle();
        if (((C1185ao) lifecycle).f4064c != EnumC0675Pn.f2148b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo1555a(new C1297cv(0, interfaceC2075ix));
        C1518hx c1518hx = (C1518hx) this.f9266d;
        if (c1518hx.f5370b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.mo1555a(new C0318Ha(2, c1518hx));
        c1518hx.f5370b = true;
        this.f9264b = true;
    }

    /* JADX INFO: renamed from: d */
    public void m5269d(Bundle bundle) {
        if (!this.f9264b) {
            m5268c();
        }
        C1185ao c1185ao = (C1185ao) ((InterfaceC2075ix) this.f9265c).getLifecycle();
        if (c1185ao.f4064c.m1371a(EnumC0675Pn.f2150d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c1185ao.f4064c).toString());
        }
        C1518hx c1518hx = (C1518hx) this.f9266d;
        if (!c1518hx.f5370b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c1518hx.f5372d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c1518hx.f5371c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c1518hx.f5372d = true;
    }

    /* JADX INFO: renamed from: e */
    public void m5270e(Bundle bundle) {
        C1518hx c1518hx = (C1518hx) this.f9266d;
        c1518hx.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c1518hx.f5371c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1027Xw c1027Xw = c1518hx.f5369a;
        c1027Xw.getClass();
        C0941Vw c0941Vw = new C0941Vw(c1027Xw);
        c1027Xw.f3271c.put(c0941Vw, Boolean.FALSE);
        while (c0941Vw.hasNext()) {
            Map.Entry entry = (Map.Entry) c0941Vw.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC1474gx) entry.getValue()).saveState());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    @Override // p000.InterfaceC1014Xj
    public Object get() {
        if (this.f9264b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        AbstractC0628Oj.m1239c("Glide registry");
        this.f9264b = true;
        try {
            return AbstractC0148Dc.m273g((ComponentCallbacks2C1273a) this.f9265c, (ArrayList) this.f9266d);
        } finally {
            this.f9264b = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f9263a) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f9265c).size() + ", isPaused=" + this.f9264b + "}";
            default:
                return super.toString();
        }
    }

    public C2692wy(InterfaceC2075ix interfaceC2075ix) {
        this.f9263a = 3;
        this.f9265c = interfaceC2075ix;
        this.f9266d = new C1518hx();
    }

    public C2692wy(Context context) {
        this.f9263a = 0;
        this.f9266d = new HashSet();
        this.f9265c = new C1094Zd(new C0061Bb(new C0793Sd(context, 10)), new C2606uy(this));
    }

    public C2692wy(ComponentCallbacks2C1273a componentCallbacks2C1273a, ArrayList arrayList, AbstractC0148Dc abstractC0148Dc) {
        this.f9263a = 1;
        this.f9265c = componentCallbacks2C1273a;
        this.f9266d = arrayList;
    }
}
