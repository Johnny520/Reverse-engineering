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
    public final int f1424a = -1;

    /* JADX INFO: renamed from: b */
    public final String f1425b = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: c */
    public final C0509i f1426c = new C0509i();

    /* JADX INFO: renamed from: d */
    public final boolean f1427d = true;

    /* JADX INFO: renamed from: e */
    public final EnumC0536m f1428e = EnumC0536m.f1486e;

    /* JADX INFO: renamed from: f */
    public C0543t f1429f;

    /* JADX INFO: renamed from: g */
    public C0002c f1430g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f1431h;

    /* JADX INFO: renamed from: i */
    public final C0095d f1432i;

    public AbstractComponentCallbacksC0505e() {
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
        InterfaceC0395d interfaceC0395d;
        this.f1429f = new C0543t(this);
        this.f1430g = new C0002c(this);
        ArrayList arrayList = this.f1431h;
        C0095d c0095d = this.f1432i;
        if (arrayList.contains(c0095d)) {
            return;
        }
        if (this.f1424a < 0) {
            arrayList.add(c0095d);
            return;
        }
        AbstractComponentCallbacksC0505e abstractComponentCallbacksC0505e = (AbstractComponentCallbacksC0505e) c0095d.f251b;
        abstractComponentCallbacksC0505e.f1430g.m11l();
        AbstractC0307g.m703e(abstractComponentCallbacksC0505e, "<this>");
        EnumC0536m enumC0536m = abstractComponentCallbacksC0505e.mo1231d().f1493c;
        if (enumC0536m != EnumC0536m.f1483b && enumC0536m != EnumC0536m.f1484c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C0396e c0396eMo985b = abstractComponentCallbacksC0505e.mo985b();
        c0396eMo985b.getClass();
        Iterator it = c0396eMo985b.f884a.iterator();
        while (true) {
            C0949b c0949b = (C0949b) it;
            if (!c0949b.hasNext()) {
                interfaceC0395d = null;
                break;
            }
            Map.Entry entry = (Map.Entry) c0949b.next();
            AbstractC0307g.m702d(entry, "components");
            String str = (String) entry.getKey();
            interfaceC0395d = (InterfaceC0395d) entry.getValue();
            if (AbstractC0307g.m699a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC0395d == null) {
            C0519H c0519h = new C0519H(abstractComponentCallbacksC0505e.mo985b(), abstractComponentCallbacksC0505e);
            abstractComponentCallbacksC0505e.mo985b().m983b("androidx.lifecycle.internal.SavedStateHandlesProvider", c0519h);
            abstractComponentCallbacksC0505e.mo1231d().m1254a(new SavedStateHandleAttacher(c0519h));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1235h() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1425b);
        sb.append(")");
        return sb.toString();
    }
}
