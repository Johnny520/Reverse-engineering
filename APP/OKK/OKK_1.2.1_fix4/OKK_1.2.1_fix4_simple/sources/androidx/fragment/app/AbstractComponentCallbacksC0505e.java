package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.AbstractC0517F;
import androidx.lifecycle.C0519H;
import androidx.lifecycle.C0543t;
import androidx.lifecycle.C0545v;
import androidx.lifecycle.EnumC0536m;
import androidx.lifecycle.InterfaceC0522K;
import androidx.lifecycle.InterfaceC0531h;
import androidx.lifecycle.InterfaceC0541r;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p000A.C0002c;
import p006D.C0095d;
import p030Q.AbstractC0298b;
import p031Q0.AbstractC0307g;
import p039V.C0396e;
import p039V.InterfaceC0395d;
import p039V.InterfaceC0397f;
import p061i.C0949b;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0505e implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0541r, InterfaceC0522K, InterfaceC0531h, InterfaceC0397f {

    /* JADX INFO: renamed from: j */
    public static final Object f1423j = null;

    /* JADX INFO: renamed from: a */
    public final int f1424a;

    /* JADX INFO: renamed from: b */
    public final String f1425b;

    /* JADX INFO: renamed from: c */
    public final C0509i f1426c;

    /* JADX INFO: renamed from: d */
    public final boolean f1427d;

    /* JADX INFO: renamed from: e */
    public final EnumC0536m f1428e;

    /* JADX INFO: renamed from: f */
    public C0543t f1429f;

    /* JADX INFO: renamed from: g */
    public C0002c f1430g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f1431h;

    /* JADX INFO: renamed from: i */
    public final C0095d f1432i;

    static {
    }

    public AbstractComponentCallbacksC0505e() {
        this.f1424a = -1;
        this.f1425b = UUID.randomUUID().toString();
        this.f1426c = new C0509i();
        this.f1427d = true;
        this.f1428e = EnumC0536m.f1486e;
        new C0545v();
        new AtomicInteger();
        this.f1431h = new ArrayList();
        this.f1432i = new C0095d(14, this);
        m1234g();
    }

    @Override // androidx.lifecycle.InterfaceC0531h
    /* JADX INFO: renamed from: a */
    public final AbstractC0298b mo1229a() {
        m1235h();
        throw null;
    }

    @Override // p039V.InterfaceC0397f
    /* JADX INFO: renamed from: b */
    public final C0396e mo985b() {
        return (C0396e) this.f1430g.f8c;
    }

    @Override // androidx.lifecycle.InterfaceC0522K
    /* JADX INFO: renamed from: c */
    public final AbstractC0517F mo1230c() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.InterfaceC0541r
    /* JADX INFO: renamed from: d */
    public final C0543t mo1231d() {
        return this.f1429f;
    }

    /* JADX INFO: renamed from: e */
    public final int m1232e() {
        return this.f1428e.ordinal();
    }

    /* JADX INFO: renamed from: f */
    public final C0509i m1233f() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: g */
    public final void m1234g() {
        this.f1429f = new C0543t(this);
        this.f1430g = new C0002c(this);
        ArrayList r02 = this.f1431h;
        C0095d r1 = this.f1432i;
        if (r02.contains(r1) == false) goto L5;
        return;
    L5:
        if (this.f1424a < 0) goto L22;
        AbstractComponentCallbacksC0505e r03 = (AbstractComponentCallbacksC0505e) r1.f251b;
        r03.f1430g.m11l();
        AbstractC0307g.m703e(r03, "<this>");
        EnumC0536m r12 = r03.mo1231d().f1493c;
        if (r12 != EnumC0536m.f1483b) goto L9;
    L13:
        C0396e r13 = r03.mo985b();
        r13.getClass();
        Iterator r14 = r13.f884a.iterator();
    L14:
        C0949b r2 = (C0949b) r14;
        if (r2.hasNext() == false) goto L19;
        Map.Entry r22 = (Map.Entry) r2.next();
        AbstractC0307g.m702d(r22, "components");
        String r3 = (String) r22.getKey();
        InterfaceC0395d r23 = (InterfaceC0395d) r22.getValue();
        if (AbstractC0307g.m699a(r3, "androidx.lifecycle.internal.SavedStateHandlesProvider") == false) goto L14;
    L20:
        if (r23 != null) goto L28;
        C0519H r15 = new C0519H(r03.mo985b(), r03);
        r03.mo985b().m983b("androidx.lifecycle.internal.SavedStateHandlesProvider", r15);
        r03.mo1231d().m1254a(new SavedStateHandleAttacher(r15));
        return;
    L28:
        return;
    L19:
        r23 = null;
        goto L20
    L9:
        if (r12 == EnumC0536m.f1484c) goto L13;
        throw new IllegalArgumentException("Failed requirement.".toString());
    L22:
        r02.add(r1);
    }

    /* JADX INFO: renamed from: h */
    public final void m1235h() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu r1, View r2, ContextMenu.ContextMenuInfo r3) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder(128);
        r02.append(getClass().getSimpleName());
        r02.append("{");
        r02.append(Integer.toHexString(System.identityHashCode(this)));
        r02.append("} (");
        r02.append(this.f1425b);
        r02.append(")");
        return r02.toString();
    }
}
