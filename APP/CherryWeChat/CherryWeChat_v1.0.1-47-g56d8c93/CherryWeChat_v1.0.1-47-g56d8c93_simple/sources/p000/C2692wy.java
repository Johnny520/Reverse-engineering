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
    public static C2692wy m5266b(Context r2) {
        if (f9262e != null) goto L16;
        monitor-enter(C2692wy.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f9262e != null) goto L11;
        f9262e = new C2692wy(r2.getApplicationContext());     // Catch: Throwable -> L9
    L11:
        monitor-exit(C2692wy.class);     // Catch: Throwable -> L9
    L16:
        return f9262e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5267a(InterfaceC1026Xv r4) {
        boolean r0 = true;
        if (r4 != null) goto L5;
        return true;
    L5:
        boolean r1 = ((Set) this.f9265c).remove(r4);
        if (((HashSet) this.f9266d).remove(r4) == true) goto L10;
        if (r1 == true) goto L10;
        r0 = false;
    L10:
        if (r0 == false) goto L12;
        r4.clear();
    L12:
        return r0;
    }

    /* JADX INFO: renamed from: c */
    public void m5268c() {
        InterfaceC2075ix r0 = (InterfaceC2075ix) this.f9265c;
        AbstractC0760Rn r1 = r0.getLifecycle();
        if (((C1185ao) r1).f4064c != EnumC0675Pn.f2148b) goto L11;
        r1.mo1555a(new C1297cv(0, r0));
        C1518hx r02 = (C1518hx) this.f9266d;
        if (r02.f5370b == true) goto L9;
        r1.mo1555a(new C0318Ha(2, r02));
        r02.f5370b = true;
        this.f9264b = true;
        return;
    L9:
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    L11:
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* JADX INFO: renamed from: d */
    public void m5269d(Bundle r4) {
        if (this.f9264b == true) goto L5;
        m5268c();
    L5:
        C1185ao r0 = (C1185ao) ((InterfaceC2075ix) this.f9265c).getLifecycle();
        if (r0.f4064c.m1371a(EnumC0675Pn.f2150d) == true) goto L21;
        C1518hx r02 = (C1518hx) this.f9266d;
        if (r02.f5370b == false) goto L19;
        if (r02.f5372d == true) goto L17;
        if (r4 == null) goto L13;
        Bundle r42 = r4.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
    L14:
        r02.f5371c = r42;
        r02.f5372d = true;
        return;
    L13:
        r42 = null;
        goto L14
    L17:
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    L19:
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
    L21:
        throw new IllegalStateException(("performRestore cannot be called when owner is " + r0.f4064c).toString());
    }

    /* JADX INFO: renamed from: e */
    public void m5270e(Bundle r5) {
        C1518hx r0 = (C1518hx) this.f9266d;
        r0.getClass();
        Bundle r1 = new Bundle();
        Bundle r2 = r0.f5371c;
        if (r2 == null) goto L5;
        r1.putAll(r2);
    L5:
        C1027Xw r02 = r0.f5369a;
        r02.getClass();
        C0941Vw r22 = new C0941Vw(r02);
        r02.f3271c.put(r22, Boolean.FALSE);
    L7:
        if (r22.hasNext() == false) goto L10;
        Map.Entry r03 = (Map.Entry) r22.next();
        r1.putBundle((String) r03.getKey(), ((InterfaceC1474gx) r03.getValue()).saveState());
        goto L7
    L10:
        if (r1.isEmpty() == true) goto L14;
        r5.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", r1);
        return;
    }

    @Override // p000.InterfaceC1014Xj
    public Object get() {
        if (this.f9264b == true) goto L12;
        AbstractC0628Oj.m1239c("Glide registry");
        this.f9264b = true;
        C0683Pv r1 = AbstractC0148Dc.m273g((ComponentCallbacks2C1273a) this.f9265c, (ArrayList) this.f9266d);     // Catch: Throwable -> L8
        this.f9264b = false;
        Trace.endSection();
        return r1;
    L8:
        th = move-exception;
        this.f9264b = false;
        Trace.endSection();
        throw th;
    L12:
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }

    public String toString() {
        switch(this.f9263a) {
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return super.toString() + "{numRequests=" + ((Set) this.f9265c).size() + ", isPaused=" + this.f9264b + "}";
    }

    public C2692wy(InterfaceC2075ix r2) {
        this.f9263a = 3;
        this.f9265c = r2;
        this.f9266d = new C1518hx();
    }

    public C2692wy(Context r3) {
        this.f9263a = 0;
        this.f9266d = new HashSet();
        this.f9265c = new C1094Zd(new C0061Bb(new C0793Sd(r3, 10)), new C2606uy(this));
    }

    public C2692wy(ComponentCallbacks2C1273a r1, ArrayList r2, AbstractC0148Dc r3) {
        this.f9263a = 1;
        this.f9265c = r1;
        this.f9266d = r2;
    }
}
