package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.ljx.wechatmod.R;
import defpackage.a3;
import defpackage.ct;
import defpackage.d4;
import defpackage.dd;
import defpackage.dw;
import defpackage.gm;
import defpackage.hm;
import defpackage.ip;
import defpackage.jq;
import defpackage.k10;
import defpackage.k80;
import defpackage.lo;
import defpackage.mq;
import defpackage.n00;
import defpackage.o10;
import defpackage.p00;
import defpackage.p1;
import defpackage.p10;
import defpackage.qb;
import defpackage.ra0;
import defpackage.rb;
import defpackage.sa0;
import defpackage.sb;
import defpackage.se;
import defpackage.t10;
import defpackage.te;
import defpackage.u10;
import defpackage.ub;
import defpackage.vb;
import defpackage.vh;
import defpackage.y6;
import defpackage.yk;
import defpackage.yw;
import defpackage.z30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements sa0, lo, u10 {
    public static final /* synthetic */ int r = 0;
    public final dd b;
    public final d4 c;
    public final androidx.lifecycle.a d;
    public final gm e;
    public ra0 f;
    public a g;
    public final vb h;
    public final gm i;
    public final sb j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public boolean p;
    public boolean q;

    public ComponentActivity() {
        this.b = new dd();
        this.c = new d4(new p1(3, this));
        androidx.lifecycle.a r0 = new androidx.lifecycle.a(this);
        this.d = r0;
        gm r1 = new gm(this);
        this.e = r1;
        t10 r2 = null;
        this.g = null;
        vb r3 = new vb(this);
        this.h = r3;
        this.i = new gm(r3, new k80(this, 2));
        new AtomicInteger();
        this.j = new sb();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = false;
        this.q = false;
        r0.a(new AnonymousClass2(this));
        r0.a(new AnonymousClass3(this));
        r0.a(new AnonymousClass4(this));
        r1.a();
        jq r02 = r0.c;
        if (r02 != jq.b) goto L5;
    L9:
        a3 r03 = (a3) r1.c;
        r03.getClass();
        Iterator r04 = ((o10) r03.f).iterator();
    L10:
        k10 r12 = (k10) r04;
        if (r12.hasNext() == false) goto L15;
        Map.Entry r13 = (Map.Entry) r12.next();
        ip.n("components", r13);
        String r32 = (String) r13.getKey();
        t10 r14 = (t10) r13.getValue();
        if (ip.i(r32, "androidx.lifecycle.internal.SavedStateHandlesProvider") == false) goto L10;
        r2 = r14;
    L15:
        if (r2 != null) goto L17;
        p10 r05 = new p10((a3) this.e.c, this);
        ((a3) this.e.c).e("androidx.lifecycle.internal.SavedStateHandlesProvider", r05);
        this.d.a(new SavedStateHandleAttacher(r05));
    L17:
        ((a3) this.e.c).e("android:support:activity-result", new qb(this));
        h(new rb(this));
        return;
    L5:
        if (r02 == jq.c) goto L9;
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static /* synthetic */ void g(ComponentActivity r0) {
        super.onBackPressed();
    }

    @Override // defpackage.lo
    public final te a() {
        se r1 = se.b;
        ip.o("initialExtras", r1);
        dw r0 = new dw();
        r0.a.putAll(r1.a);
        Application r12 = getApplication();
        LinkedHashMap r2 = r0.a;
        if (r12 == null) goto L5;
        r2.put(vh.o, getApplication());
    L5:
        r2.put(ip.q, this);
        r2.put(ip.r, this);
        if (getIntent() != null) goto L8;
    L10:
        return r0;
    L8:
        if (getIntent().getExtras() == null) goto L10;
        r2.put(ip.s, getIntent().getExtras());
        goto L10
    }

    @Override // android.app.Activity
    public void addContentView(View r3, ViewGroup.LayoutParams r4) {
        j();
        View r0 = getWindow().getDecorView();
        this.h.a(r0);
        super.addContentView(r3, r4);
    }

    @Override // defpackage.u10
    public final a3 b() {
        return (a3) this.e.c;
    }

    @Override // defpackage.sa0
    public final ra0 d() {
        if (getApplication() == null) goto L15;
        if (this.f != null) goto L13;
        ub r0 = (ub) getLastNonConfigurationInstance();
        if (r0 == null) goto L10;
        this.f = r0.a;
    L10:
        if (this.f != null) goto L13;
        this.f = new ra0();
    L13:
        return this.f;
    L15:
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.core.app.ComponentActivity, defpackage.oq
    public final androidx.lifecycle.a e() {
        return this.d;
    }

    public final void h(yw r3) {
        dd r0 = this.b;
        r0.getClass();
        if (r0.b == null) goto L5;
        r3.a();
    L5:
        r0.a.add(r3);
    }

    public final a i() {
        if (this.g != null) goto L6;
        this.g = new a(new y6(2, this));
        mq r0 = new AnonymousClass6(this);
        this.d.a(r0);
    L6:
        return this.g;
    }

    public final void j() {
        View r0 = getWindow().getDecorView();
        ip.o("<this>", r0);
        r0.setTag(R.id.view_tree_lifecycle_owner, this);
        View r02 = getWindow().getDecorView();
        ip.o("<this>", r02);
        r02.setTag(R.id.view_tree_view_model_store_owner, this);
        View r03 = getWindow().getDecorView();
        ip.o("<this>", r03);
        r03.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View r04 = getWindow().getDecorView();
        ip.o("<this>", r04);
        r04.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View r05 = getWindow().getDecorView();
        ip.o("<this>", r05);
        r05.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int r2, int r3, Intent r4) {
        if (this.j.a(r2, r3, r4) == true) goto L6;
        super.onActivityResult(r2, r3, r4);
        return;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        i().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration r3) {
        super.onConfigurationChanged(r3);
        Iterator r0 = this.k.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((yk) r0.next()).a(r3);
        goto L4
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle r3) {
        this.e.b(r3);
        dd r0 = this.b;
        r0.getClass();
        r0.b = this;
        Iterator r02 = r0.a.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((yw) r02.next()).a();
        goto L4
    L6:
        super.onCreate(r3);
        int r32 = p00.b;
        n00.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r1, Menu r2) {
        if (r1 != 0) goto L8;
        super.onCreatePanelMenu(r1, r2);
        getMenuInflater();
        Iterator r12 = ((CopyOnWriteArrayList) this.c.c).iterator();
        if (r12.hasNext() == true) goto L7;
        return true;
    L7:
        throw z30.h(r12);
    L8:
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, MenuItem r2) {
        if (super.onMenuItemSelected(r1, r2) == false) goto L6;
        return true;
    L6:
        if (r1 != 0) goto L12;
        Iterator r12 = ((CopyOnWriteArrayList) this.c.c).iterator();
        if (r12.hasNext() == true) goto L11;
        return false;
    L11:
        throw z30.h(r12);
    L12:
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r4) {
        if (this.p == true) goto L9;
        Iterator r42 = this.n.iterator();
    L7:
        if (r42.hasNext() == false) goto L11;
        ((yk) r42.next()).a(new vh(28));
        goto L7
    L11:
        return;
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent r3) {
        super.onNewIntent(r3);
        Iterator r0 = this.m.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((yk) r0.next()).a(r3);
        goto L4
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r3, Menu r4) {
        Iterator r0 = ((CopyOnWriteArrayList) this.c.c).iterator();
        if (r0.hasNext() == true) goto L7;
        super.onPanelClosed(r3, r4);
        return;
    L7:
        throw z30.h(r0);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r4) {
        if (this.q == true) goto L9;
        Iterator r42 = this.o.iterator();
    L7:
        if (r42.hasNext() == false) goto L11;
        ((yk) r42.next()).a(new vh(29));
        goto L7
    L11:
        return;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r1, View r2, Menu r3) {
        if (r1 != 0) goto L8;
        super.onPreparePanel(r1, r2, r3);
        Iterator r12 = ((CopyOnWriteArrayList) this.c.c).iterator();
        if (r12.hasNext() == true) goto L7;
        return true;
    L7:
        throw z30.h(r12);
    L8:
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r4, String[] r5, int[] r6) {
        Intent r0 = new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", r5).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", r6);
        if (this.j.a(r4, -1, r0) == true) goto L6;
        super.onRequestPermissionsResult(r4, r5, r6);
        return;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ra0 r0 = this.f;
        if (r0 != null) goto L7;
        ub r1 = (ub) getLastNonConfigurationInstance();
        if (r1 == null) goto L7;
        r0 = r1.a;
    L7:
        if (r0 != null) goto L10;
        return null;
    L10:
        ub r12 = new ub();
        r12.a = r0;
        return r12;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle r2) {
        androidx.lifecycle.a r0 = this.d;
        if (r0 == null) goto L5;
        r0.g();
    L5:
        super.onSaveInstanceState(r2);
        this.e.c(r2);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int r4) {
        super.onTrimMemory(r4);
        Iterator r0 = this.l.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((yk) r0.next()).a(Integer.valueOf(r4));
        goto L4
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
    L5:
        th = move-exception;
        Trace.endSection();
        throw th;
    L3:
        if (ct.r() == false) goto L7;
        Trace.beginSection("reportFullyDrawn() for ComponentActivity");     // Catch: Throwable -> L5
    L7:
        super.reportFullyDrawn();     // Catch: Throwable -> L5
        gm r0 = this.i;     // Catch: Throwable -> L5
        Object r1 = r0.b;     // Catch: Throwable -> L5
        monitor-enter(r1);     // Catch: Throwable -> L5
        r0.a = true;     // Catch: Throwable -> L13
        ArrayList r2 = (ArrayList) r0.c;     // Catch: Throwable -> L13
        int r3 = r2.size();     // Catch: Throwable -> L13
        int r4 = 0;
    L11:
        if (r4 >= r3) goto L15;
        Object r5 = r2.get(r4);     // Catch: Throwable -> L13
        r4 = r4 + 1;     // Catch: Throwable -> L13
        ((hm) r5).a();     // Catch: Throwable -> L13
        goto L11
    L15:
        ((ArrayList) r0.c).clear();     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L5
        Trace.endSection();
        return;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L5
    }

    @Override // android.app.Activity
    public void setContentView(int r3) {
        j();
        View r0 = getWindow().getDecorView();
        this.h.a(r0);
        super.setContentView(r3);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View r3) {
        j();
        View r0 = getWindow().getDecorView();
        this.h.a(r0);
        super.setContentView(r3);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean r3, Configuration r4) {
        this.p = true;
        super.onMultiWindowModeChanged(r3, r4);     // Catch: Throwable -> L9
        this.p = false;
        Iterator r32 = this.n.iterator();
    L6:
        if (r32.hasNext() == false) goto L8;
        ((yk) r32.next()).a(new vh(28));
        goto L6
    L8:
        return;
    L9:
        th = move-exception;
        this.p = false;
        throw th;
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r3, Configuration r4) {
        this.q = true;
        super.onPictureInPictureModeChanged(r3, r4);     // Catch: Throwable -> L9
        this.q = false;
        Iterator r32 = this.o.iterator();
    L6:
        if (r32.hasNext() == false) goto L8;
        ((yk) r32.next()).a(new vh(29));
        goto L6
    L8:
        return;
    L9:
        th = move-exception;
        this.q = false;
        throw th;
    }

    @Override // android.app.Activity
    public void setContentView(View r3, ViewGroup.LayoutParams r4) {
        j();
        View r0 = getWindow().getDecorView();
        this.h.a(r0);
        super.setContentView(r3, r4);
    }
}
