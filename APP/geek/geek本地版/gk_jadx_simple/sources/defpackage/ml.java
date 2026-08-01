package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.a;
import androidx.lifecycle.b;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ml implements ComponentCallbacks, View.OnCreateContextMenuListener, oq, sa0, lo, u10 {
    public static final Object Q = null;
    public boolean A;
    public final boolean B;
    public boolean C;
    public ViewGroup D;
    public View E;
    public boolean F;
    public boolean G;
    public ll H;
    public boolean I;
    public boolean J;
    public jq K;
    public a L;
    public fm M;
    public final b N;
    public gm O;
    public final ArrayList P;
    public int a;
    public Bundle b;
    public SparseArray c;
    public Bundle d;
    public String e;
    public Bundle f;
    public ml g;
    public String h;
    public int i;
    public Boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public yl r;
    public nl s;
    public yl t;
    public ml u;
    public int v;
    public int w;
    public String x;
    public boolean y;
    public boolean z;

    static {
        Q = new Object();
    }

    public ml() {
        this.a = -1;
        this.e = UUID.randomUUID().toString();
        this.h = null;
        this.j = null;
        this.t = new yl();
        this.B = true;
        this.G = true;
        this.K = jq.e;
        this.N = new b();
        new AtomicInteger();
        this.P = new ArrayList();
        this.L = new a(this);
        this.O = new gm(this);
    }

    public final View A() {
        View r0 = this.E;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void B(int r2, int r3, int r4, int r5) {
        if (this.H != null) goto L9;
        if (r2 != 0) goto L9;
        if (r3 != 0) goto L9;
        if (r4 != 0) goto L9;
        if (r5 != 0) goto L9;
        return;
    L9:
        f().b = r2;
        f().c = r3;
        f().d = r4;
        f().e = r5;
    }

    public final void C(Bundle r3) {
        yl r0 = this.r;
        if (r0 != null) goto L5;
    L11:
        this.f = r3;
        return;
    L5:
        if (r0.y == true) goto L10;
        if (r0.z == false) goto L11;
    L10:
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    @Override // defpackage.u10
    public final a3 b() {
        return (a3) this.O.c;
    }

    public ip c() {
        return new kl(this);
    }

    @Override // defpackage.sa0
    public final ra0 d() {
        if (this.r == null) goto L13;
        if (i() == 1) goto L11;
        HashMap r0 = this.r.F.e;
        ra0 r1 = (ra0) r0.get(this.e);
        if (r1 != null) goto L14;
        ra0 r12 = new ra0();
        r0.put(this.e, r12);
        return r12;
    L14:
        return r1;
    L11:
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    L13:
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // defpackage.oq
    public final a e() {
        return this.L;
    }

    public final ll f() {
        if (this.H != null) goto L6;
        ll r0 = new ll();
        Object r1 = Q;
        r0.g = r1;
        r0.h = r1;
        r0.i = r1;
        r0.j = 1.0f;
        r0.k = null;
        this.H = r0;
    L6:
        return this.H;
    }

    public final yl g() {
        if (this.s == null) goto L7;
        return this.t;
    L7:
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        nl r0 = this.s;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.D;
    }

    public final int i() {
        jq r0 = this.K;
        if (r0 == jq.b) goto L10;
        if (this.u == null) goto L10;
        return Math.min(r0.ordinal(), this.u.i());
    L10:
        return r0.ordinal();
    }

    public final yl j() {
        yl r0 = this.r;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k(int r3, int r4, Intent r5) {
        if (yl.A(2) == false) goto L6;
        Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + r3 + " resultCode: " + r4 + " data: " + r5);
        return;
    }

    public void l(Context r2) {
        this.C = true;
        nl r0 = this.s;
        if (r0 != null) goto L5;
        FragmentActivity r02 = null;
    L6:
        if (r02 == null) goto L9;
        this.C = true;
        return;
    L9:
        return;
    L5:
        r02 = r0.C;
        goto L6
    }

    public void m(Bundle r4) {
        this.C = true;
        if (r4 == null) goto L7;
        Parcelable r42 = r4.getParcelable("android:support:fragments");
        if (r42 == null) goto L7;
        this.t.K(r42);
        yl r43 = this.t;
        r43.y = false;
        r43.z = false;
        r43.F.h = false;
        r43.p(1);
    L7:
        yl r44 = this.t;
        if (r44.m < 1) goto L10;
        return;
    L10:
        r44.y = false;
        r44.z = false;
        r44.F.h = false;
        r44.p(1);
    }

    public View n(LayoutInflater r1, ViewGroup r2) {
        return null;
    }

    public void o() {
        this.C = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
        this.C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu r2, View r3, ContextMenu.ContextMenuInfo r4) {
        nl r0 = this.s;
        if (r0 != null) goto L5;
        FragmentActivity r02 = null;
    L6:
        if (r02 == null) goto L10;
        r02.onCreateContextMenu(r2, r3, r4);
        return;
    L10:
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    L5:
        r02 = r0.C;
        goto L6
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.C = true;
    }

    public void p() {
        this.C = true;
    }

    public LayoutInflater q(Bundle r2) {
        nl r22 = this.s;
        if (r22 == null) goto L7;
        FragmentActivity r23 = r22.G;
        LayoutInflater r24 = r23.getLayoutInflater().cloneInContext(r23);
        r24.setFactory2(this.t.f);
        return r24;
    L7:
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public abstract void r(Bundle r1);

    public void s() {
        this.C = true;
    }

    public void t() {
        this.C = true;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append(getClass().getSimpleName());
        r0.append("{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("} (");
        r0.append(this.e);
        if (this.v == 0) goto L6;
        r0.append(" id=0x");
        r0.append(Integer.toHexString(this.v));
    L6:
        if (this.x == null) goto L8;
        r0.append(" tag=");
        r0.append(this.x);
    L8:
        r0.append(")");
        return r0.toString();
    }

    public void u(Bundle r1) {
        this.C = true;
    }

    public void v(LayoutInflater r2, ViewGroup r3, Bundle r4) {
        this.t.F();
        this.p = true;
        this.M = new fm(d());
        View r22 = n(r2, r3);
        this.E = r22;
        if (r22 == null) goto L7;
        this.M.f();
        View r23 = this.E;
        fm r32 = this.M;
        ip.o("<this>", r23);
        r23.setTag(R.id.view_tree_lifecycle_owner, r32);
        View r24 = this.E;
        fm r33 = this.M;
        ip.o("<this>", r24);
        r24.setTag(R.id.view_tree_view_model_store_owner, r33);
        View r25 = this.E;
        fm r34 = this.M;
        ip.o("<this>", r25);
        r25.setTag(R.id.view_tree_saved_state_registry_owner, r34);
        this.N.e(this.M);
        return;
    L7:
        if (this.M.b != null) goto L11;
        this.M = null;
        return;
    L11:
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final void w() {
        this.C = true;
        Iterator r0 = this.t.c.p().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        ml r1 = (ml) r0.next();
        if (r1 == null) goto L4;
        r1.w();
        goto L4
    }

    public final void x() {
        Iterator r0 = this.t.c.p().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        ml r1 = (ml) r0.next();
        if (r1 == null) goto L4;
        r1.x();
        goto L4
    }

    public final void y() {
        Iterator r0 = this.t.c.p().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        ml r1 = (ml) r0.next();
        if (r1 == null) goto L4;
        r1.y();
        goto L4
    }

    public final Context z() {
        Context r0 = h();
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }
}
