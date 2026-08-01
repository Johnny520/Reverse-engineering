package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import defpackage.a3;
import defpackage.e40;
import defpackage.fm;
import defpackage.ip;
import defpackage.iq;
import defpackage.jq;
import defpackage.l0;
import defpackage.ml;
import defpackage.nl;
import defpackage.pa0;
import defpackage.pr;
import defpackage.ra0;
import defpackage.s2;
import defpackage.se;
import defpackage.t2;
import defpackage.vh;
import defpackage.yl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {
    public final l0 s;
    public final androidx.lifecycle.a t;
    public boolean u;
    public boolean v;
    public boolean w;

    public FragmentActivity() {
        int r2 = 15;
        this.s = new l0(r2, new nl(this));
        this.t = new androidx.lifecycle.a(this);
        this.w = true;
        ((a3) this.e.c).e("android:support:fragments", new s2(this, 1));
        h(new t2(this, 1));
    }

    public static boolean k(yl r5) {
        Iterator r52 = r5.c.p().iterator();
        boolean r0 = false;
    L4:
        if (r52.hasNext() == false) goto L22;
        ml r1 = (ml) r52.next();
        if (r1 == null) goto L4;
        nl r2 = r1.s;
        if (r2 != null) goto L11;
        FragmentActivity r22 = null;
    L12:
        if (r22 == null) goto L14;
        r0 = r0 | k(r1.g());
    L14:
        fm r23 = r1.M;
        jq r4 = jq.d;
        if (r23 == null) goto L20;
        r23.f();
        if (r23.b.c.compareTo(r4) < 0) goto L20;
        r1.M.b.g();
        r0 = true;
    L20:
        if (r1.L.c.compareTo(r4) < 0) goto L4;
        r1.L.g();
        r0 = true;
        goto L4
    L11:
        r22 = r2.G;
        goto L12
    L22:
        return r0;
    }

    @Override // android.app.Activity
    public final void dump(String r7, FileDescriptor r8, PrintWriter r9, String[] r10) {
        super.dump(r7, r8, r9, r10);
        r9.print(r7);
        r9.print("Local FragmentActivity ");
        r9.print(Integer.toHexString(System.identityHashCode(this)));
        r9.println(" State:");
        String r0 = r7 + "  ";
        r9.print(r0);
        r9.print("mCreated=");
        r9.print(this.u);
        r9.print(" mResumed=");
        r9.print(this.v);
        r9.print(" mStopped=");
        r9.print(this.w);
        if (getApplication() == null) goto L29;
        ra0 r1 = d();
        ip.o("store", r1);
        se r2 = se.b;
        ip.o("defaultCreationExtras", r2);
        String r4 = pr.class.getCanonicalName();
        if (r4 == null) goto L28;
        String r42 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r4);
        ip.o("key", r42);
        LinkedHashMap r12 = r1.a;
        pa0 r5 = (pa0) r12.get(r42);
        if (pr.class.isInstance(r5) == false) goto L9;
        ip.m("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", r5);
    L16:
        e40 r13 = ((pr) r5).c;
        if (r13.c <= 0) goto L29;
        r9.print(r0);
        r9.println("Loaders:");
        if (r13.c <= 0) goto L29;
        if (r13.b[0] != null) goto L26;
        r9.print(r0);
        r9.print("  #");
        r9.print(r13.a[0]);
        r9.print(": ");
        throw null;
    L26:
        throw new ClassCastException();
    L9:
        LinkedHashMap r3 = new LinkedHashMap();
        r3.putAll(r2.a);
        r3.put(vh.p, r42);
        pr r22 = new pr();     // Catch: AbstractMethodError -> L12
    L11:
        r5 = r22;
        pa0 r14 = (pa0) r12.put(r42, r5);
        if (r14 == null) goto L16;
        r14.a();
    L12:
        r22 = new pr();
        goto L11
    L28:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    L29:
        ((nl) this.s.b).F.q(r7, r8, r9, r10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int r2, int r3, Intent r4) {
        this.s.v();
        super.onActivityResult(r2, r3, r4);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration r2) {
        l0 r0 = this.s;
        r0.v();
        super.onConfigurationChanged(r2);
        ((nl) r0.b).F.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle r3) {
        super.onCreate(r3);
        this.t.d(iq.ON_CREATE);
        yl r32 = ((nl) this.s.b).F;
        r32.y = false;
        r32.z = false;
        r32.F.h = false;
        r32.p(1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, Menu r3) {
        if (r2 != 0) goto L6;
        super.onCreatePanelMenu(r2, r3);
        getMenuInflater();
        ((nl) this.s.b).F.j();
        return true;
    L6:
        super.onCreatePanelMenu(r2, r3);
        return true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View r2, String r3, Context r4, AttributeSet r5) {
        View r0 = ((nl) this.s.b).F.f.onCreateView(r2, r3, r4, r5);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return super.onCreateView(r2, r3, r4, r5);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((nl) this.s.b).F.k();
        this.t.d(iq.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        Iterator r0 = ((nl) this.s.b).F.c.p().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        ml r1 = (ml) r0.next();
        if (r1 == null) goto L4;
        r1.w();
        goto L4
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, MenuItem r3) {
        if (super.onMenuItemSelected(r2, r3) == false) goto L6;
        return true;
    L6:
        l0 r32 = this.s;
        if (r2 == 0) goto L15;
        if (r2 == 6) goto L13;
        return false;
    L13:
        return ((nl) r32.b).F.i();
    L15:
        return ((nl) r32.b).F.l();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onMultiWindowModeChanged(boolean r2) {
        Iterator r22 = ((nl) this.s.b).F.c.p().iterator();
    L4:
        if (r22.hasNext() == false) goto L8;
        ml r0 = (ml) r22.next();
        if (r0 == null) goto L4;
        r0.x();
        goto L4
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent r2) {
        this.s.v();
        super.onNewIntent(r2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, Menu r3) {
        if (r2 != 0) goto L4;
        ((nl) this.s.b).F.m();
    L4:
        super.onPanelClosed(r2, r3);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.v = false;
        ((nl) this.s.b).F.p(5);
        this.t.d(iq.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r2) {
        Iterator r22 = ((nl) this.s.b).F.c.p().iterator();
    L4:
        if (r22.hasNext() == false) goto L8;
        ml r0 = (ml) r22.next();
        if (r0 == null) goto L4;
        r0.y();
        goto L4
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.t.d(iq.ON_RESUME);
        yl r0 = ((nl) this.s.b).F;
        r0.y = false;
        r0.z = false;
        r0.F.h = false;
        r0.p(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int r2, View r3, Menu r4) {
        if (r2 != 0) goto L6;
        super.onPreparePanel(0, r3, r4);
        ((nl) this.s.b).F.o();
        return true;
    L6:
        super.onPreparePanel(r2, r3, r4);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int r2, String[] r3, int[] r4) {
        this.s.v();
        super.onRequestPermissionsResult(r2, r3, r4);
    }

    @Override // android.app.Activity
    public final void onResume() {
        l0 r0 = this.s;
        r0.v();
        super.onResume();
        this.v = true;
        ((nl) r0.b).F.t(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        l0 r0 = this.s;
        r0.v();
        nl r02 = (nl) r0.b;
        super.onStart();
        this.w = false;
        if (this.u == true) goto L5;
        this.u = true;
        yl r2 = r02.F;
        r2.y = false;
        r2.z = false;
        r2.F.h = false;
        r2.p(4);
    L5:
        r02.F.t(true);
        this.t.d(iq.ON_START);
        yl r03 = r02.F;
        r03.y = false;
        r03.z = false;
        r03.F.h = false;
        r03.p(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.s.v();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.w = true;
    L3:
        l0 r1 = this.s;
        if (k(((nl) r1.b).F) == true) goto L3;
        yl r12 = ((nl) r1.b).F;
        r12.z = true;
        r12.F.h = true;
        r12.p(4);
        this.t.d(iq.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String r3, Context r4, AttributeSet r5) {
        View r0 = ((nl) this.s.b).F.f.onCreateView(null, r3, r4, r5);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return super.onCreateView(r3, r4, r5);
    }
}
