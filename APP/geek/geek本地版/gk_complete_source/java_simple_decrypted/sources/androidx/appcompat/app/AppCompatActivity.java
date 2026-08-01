package androidx.appcompat.app;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import defpackage.a3;
import defpackage.b10;
import defpackage.b3;
import defpackage.bs;
import defpackage.e3;
import defpackage.ed;
import defpackage.ew;
import defpackage.f90;
import defpackage.ff;
import defpackage.i3;
import defpackage.ip;
import defpackage.k50;
import defpackage.k70;
import defpackage.kd;
import defpackage.q1;
import defpackage.r3;
import defpackage.s2;
import defpackage.sr;
import defpackage.t2;
import defpackage.u3;
import defpackage.u5;
import defpackage.w00;
import defpackage.x2;
import defpackage.xa0;
import defpackage.yb0;
import defpackage.zt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements x2 {
    public r3 x;

    public AppCompatActivity() {
        ((a3) this.e.c).e("androidx:appcompat", new s2(this, 0));
        h(new t2(this, 0));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View r4, ViewGroup.LayoutParams r5) {
        m();
        r3 r0 = (r3) l();
        r0.w();
        ((ViewGroup) r0.A.findViewById(R.id.content)).addView(r4, r5);
        r0.m.a(r0.l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context r11) {
        r3 r0 = (r3) l();
        r0.O = true;
        int r2 = r0.S;
        if (r2 != (-100)) goto L6;
        r2 = e3.b;
    L6:
        int r02 = r0.C(r11, r2);
        if (e3.c(r11) == true) goto L9;
    L37:
        sr r22 = r3.p(r11);
        if (r3.k0 == false) goto L45;
        if ((r11 instanceof ContextThemeWrapper) == false) goto L45;
        ((ContextThemeWrapper) r11).applyOverrideConfiguration(r3.t(r11, r02, r22, null, false));     // Catch: IllegalStateException -> L153
    L151:
        super.attachBaseContext(r11);
        return;
    L45:
        if ((r11 instanceof kd) == false) goto L50;
        ((kd) r11).a(r3.t(r11, r02, r22, null, false));     // Catch: IllegalStateException -> L154
    L50:
        if (r3.j0 == false) goto L151;
        int r3 = Build.VERSION.SDK_INT;
        Configuration r4 = new Configuration();
        r4.uiMode = -1;
        r4.fontScale = 0.0f;
        Configuration r42 = r11.createConfigurationContext(r4).getResources().getConfiguration();
        Configuration r7 = r11.getResources().getConfiguration();
        r42.uiMode = r7.uiMode;
        if (r42.equals(r7) == true) goto L120;
        Configuration r8 = new Configuration();
        r8.fontScale = 0.0f;
        if (r42.diff(r7) == 0) goto L121;
        float r6 = r42.fontScale;
        float r9 = r7.fontScale;
        if (r6 == r9) goto L60;
        r8.fontScale = r9;
    L60:
        int r62 = r42.mcc;
        int r92 = r7.mcc;
        if (r62 == r92) goto L63;
        r8.mcc = r92;
    L63:
        int r63 = r42.mnc;
        int r93 = r7.mnc;
        if (r63 == r93) goto L66;
        r8.mnc = r93;
    L66:
        i3.a(r42, r7, r8);
        int r64 = r42.touchscreen;
        int r94 = r7.touchscreen;
        if (r64 == r94) goto L69;
        r8.touchscreen = r94;
    L69:
        int r65 = r42.keyboard;
        int r95 = r7.keyboard;
        if (r65 == r95) goto L72;
        r8.keyboard = r95;
    L72:
        int r66 = r42.keyboardHidden;
        int r96 = r7.keyboardHidden;
        if (r66 == r96) goto L75;
        r8.keyboardHidden = r96;
    L75:
        int r67 = r42.navigation;
        int r97 = r7.navigation;
        if (r67 == r97) goto L78;
        r8.navigation = r97;
    L78:
        int r68 = r42.navigationHidden;
        int r98 = r7.navigationHidden;
        if (r68 == r98) goto L81;
        r8.navigationHidden = r98;
    L81:
        int r69 = r42.orientation;
        int r99 = r7.orientation;
        if (r69 == r99) goto L84;
        r8.orientation = r99;
    L84:
        int r610 = r42.screenLayout & 15;
        int r910 = r7.screenLayout & 15;
        if (r610 == r910) goto L87;
        r8.screenLayout |= r910;
    L87:
        int r611 = r42.screenLayout & 192;
        int r911 = r7.screenLayout & 192;
        if (r611 == r911) goto L90;
        r8.screenLayout |= r911;
    L90:
        int r612 = r42.screenLayout & 48;
        int r912 = r7.screenLayout & 48;
        if (r612 == r912) goto L93;
        r8.screenLayout |= r912;
    L93:
        int r613 = r42.screenLayout & 768;
        int r913 = r7.screenLayout & 768;
        if (r613 == r913) goto L96;
        r8.screenLayout |= r913;
    L96:
        int r614 = r42.colorMode & 3;
        int r914 = r7.colorMode & 3;
        if (r614 == r914) goto L99;
        r8.colorMode |= r914;
    L99:
        int r615 = r42.colorMode & 12;
        int r915 = r7.colorMode & 12;
        if (r615 == r915) goto L102;
        r8.colorMode |= r915;
    L102:
        int r616 = r42.uiMode & 15;
        int r916 = r7.uiMode & 15;
        if (r616 == r916) goto L105;
        r8.uiMode |= r916;
    L105:
        int r617 = r42.uiMode & 48;
        int r917 = r7.uiMode & 48;
        if (r617 == r917) goto L108;
        r8.uiMode |= r917;
    L108:
        int r618 = r42.screenWidthDp;
        int r918 = r7.screenWidthDp;
        if (r618 == r918) goto L111;
        r8.screenWidthDp = r918;
    L111:
        int r619 = r42.screenHeightDp;
        int r919 = r7.screenHeightDp;
        if (r619 == r919) goto L114;
        r8.screenHeightDp = r919;
    L114:
        int r620 = r42.smallestScreenWidthDp;
        int r920 = r7.smallestScreenWidthDp;
        if (r620 == r920) goto L117;
        r8.smallestScreenWidthDp = r920;
    L117:
        int r43 = r42.densityDpi;
        int r621 = r7.densityDpi;
        if (r43 == r621) goto L121;
        r8.densityDpi = r621;
    L121:
        Configuration r03 = r3.t(r11, r02, r22, r8, true);
        kd r23 = new kd(r11, com.ljx.wechatmod.R.style.Theme_AppCompat_Empty);
        r23.a(r03);
        if (r11.getTheme() == null) goto L150;
        Resources.Theme r112 = r23.getTheme();
        if (r3 < 29) goto L127;
        b10.a(r112);
        goto L150
    L127:
        Object r04 = ff.u;
        monitor-enter(r04);
    L133:
        th = move-exception;
        throw th;
    L130:
        if (ff.w == false) goto L164;
    L138:
        Method r1 = ff.v;     // Catch: Throwable -> L133
        if (r1 != null) goto L167;
    L146:
        monitor-exit(r04);     // Catch: Throwable -> L133
        goto L150
    L167:
        r1.invoke(r112, null);     // Catch: Throwable -> L133 InvocationTargetException -> L142 Throwable -> L144
    L144:
        e = move-exception;
        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e);     // Catch: Throwable -> L133
        ff.v = null;     // Catch: Throwable -> L133
        goto L146
    L164:
        Method r32 = Resources.Theme.class.getDeclaredMethod("rebase", null);     // Catch: Throwable -> L133 NoSuchMethodException -> L135
        ff.v = r32;     // Catch: Throwable -> L133 NoSuchMethodException -> L135
        r32.setAccessible(true);     // Catch: Throwable -> L133 NoSuchMethodException -> L135
    L137:
        ff.w = true;     // Catch: Throwable -> L133
        goto L138
    L135:
        e = move-exception;
        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);     // Catch: Throwable -> L133
    L150:
        r11 = r23;
        goto L151
    L120:
        r8 = null;
        goto L121
    L9:
        if (e3.c(r11) == false) goto L37;
        if (ip.A() == true) goto L14;
        Object r24 = e3.i;
        monitor-enter(r24);
        sr r44 = e3.c;     // Catch: Throwable -> L23
        if (r44 != null) goto L31;
        if (e3.d != null) goto L26;
        e3.d = sr.a(ip.L(r11));     // Catch: Throwable -> L23
    L26:
        if (e3.d.a.a.isEmpty() == false) goto L29;
        monitor-exit(r24);     // Catch: Throwable -> L23
        goto L37
    L29:
        e3.c = e3.d;     // Catch: Throwable -> L23
    L33:
        monitor-exit(r24);     // Catch: Throwable -> L23
        goto L37
    L31:
        if (r44.equals(e3.d) == true) goto L33;
        sr r45 = e3.c;     // Catch: Throwable -> L23
        e3.d = r45;     // Catch: Throwable -> L23
        ip.J(r11, r45.a.a.toLanguageTags());     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    L14:
        if (e3.f == true) goto L37;
        e3.a.execute(new b3(r11, 0));
        goto L37
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((r3) l()).A();
        if (getWindow().hasFeature(0) == false) goto L6;
        super.closeOptionsMenu();
        return;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        r2.getKeyCode();
        ((r3) l()).A();
        return super.dispatchKeyEvent(r2);
    }

    @Override // androidx.core.app.ComponentActivity
    public final void f() {
        l().b();
    }

    @Override // android.app.Activity
    public final View findViewById(int r2) {
        r3 r0 = (r3) l();
        r0.w();
        return r0.l.findViewById(r2);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        r3 r0 = (r3) l();
        if (r0.p != null) goto L10;
        r0.A();
        yb0 r2 = r0.o;
        if (r2 == null) goto L7;
        Context r22 = r2.L();
    L8:
        r0.p = new k50(r22);
        goto L10
    L7:
        r22 = r0.k;
    L10:
        return r0.p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int r0 = f90.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        l().b();
    }

    public final e3 l() {
        if (this.x != null) goto L6;
        u5 r0 = e3.a;
        this.x = new r3(this, null, this, this);
    L6:
        return this.x;
    }

    public final void m() {
        View r0 = getWindow().getDecorView();
        ip.o("<this>", r0);
        r0.setTag(com.ljx.wechatmod.R.id.view_tree_lifecycle_owner, this);
        View r02 = getWindow().getDecorView();
        ip.o("<this>", r02);
        r02.setTag(com.ljx.wechatmod.R.id.view_tree_view_model_store_owner, this);
        View r03 = getWindow().getDecorView();
        ip.o("<this>", r03);
        r03.setTag(com.ljx.wechatmod.R.id.view_tree_saved_state_registry_owner, this);
        View r04 = getWindow().getDecorView();
        ip.o("<this>", r04);
        r04.setTag(com.ljx.wechatmod.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r5) {
        super.onConfigurationChanged(r5);
        r3 r52 = (r3) l();
        if (r52.F == true) goto L5;
    L9:
        u3 r0 = u3.a();
        Context r1 = r52.k;
        monitor-enter(r0);
        w00 r2 = r0.a;     // Catch: Throwable -> L25
        monitor-enter(r2);     // Catch: Throwable -> L25
        bs r12 = (bs) r2.b.get(r1);     // Catch: Throwable -> L17
        if (r12 == null) goto L19;
        r12.a();     // Catch: Throwable -> L17
    L19:
        monitor-exit(r2);     // Catch: Throwable -> L25
        monitor-exit(r0);
        r52.R = new Configuration(r52.k.getResources().getConfiguration());
        r52.m(false, false);
        return;
    L17:
        th = move-exception;
        throw th;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        throw th;
    L5:
        if (r52.z == false) goto L9;
        r52.A();
        yb0 r02 = r52.o;
        if (r02 == null) goto L9;
        r02.O(r02.w.getResources().getBoolean(com.ljx.wechatmod.R.bool.abc_action_bar_embed_tabs));
        goto L9
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        l().e();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r5, MenuItem r6) {
        if (super.onMenuItemSelected(r5, r6) == true) goto L37;
        r3 r52 = (r3) l();
        r52.A();
        yb0 r53 = r52.o;
        if (r6.getItemId() != 16908332) goto L42;
        if (r53 == null) goto L42;
        if ((((k70) r53.A).b & 4) == 0) goto L42;
        Intent r54 = zt.r(this);
        if (r54 == null) goto L42;
        if (ew.c(this, r54) == false) goto L40;
        ArrayList r55 = new ArrayList();
        Intent r62 = zt.r(this);
        if (r62 != null) goto L17;
        r62 = zt.r(this);
    L17:
        if (r62 == null) goto L32;
        ComponentName r1 = r62.getComponent();
        if (r1 != null) goto L21;
        r1 = r62.resolveActivity(getPackageManager());
    L21:
        int r3 = r55.size();
        Intent r12 = zt.s(this, r1);     // Catch: PackageManager.NameNotFoundException -> L26
    L23:
        if (r12 == null) goto L28;
        r55.add(r3, r12);     // Catch: PackageManager.NameNotFoundException -> L26
        r12 = zt.s(this, r12.getComponent());     // Catch: PackageManager.NameNotFoundException -> L26
        goto L23
    L28:
        r55.add(r62);
    L26:
        e = move-exception;
        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
        throw new IllegalArgumentException(e);
    L32:
        if (r55.isEmpty() == true) goto L39;
        Intent[] r56 = (Intent[]) r55.toArray(new Intent[0]);
        r56[0] = new Intent(r56[0]).addFlags(268484608);
        ed.a(this, r56, null);
        q1.a(this);     // Catch: IllegalStateException -> L36
    L36:
        finish();
        goto L37
    L39:
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    L40:
        ew.b(this, r54);
        return true;
    L42:
        return false;
    L37:
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle r1) {
        super.onPostCreate(r1);
        ((r3) l()).w();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        r3 r0 = (r3) l();
        r0.A();
        yb0 r02 = r0.o;
        if (r02 == null) goto L6;
        r02.P = true;
        return;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((r3) l()).m(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        r3 r0 = (r3) l();
        r0.A();
        yb0 r02 = r0.o;
        if (r02 == null) goto L8;
        r02.P = false;
        xa0 r03 = r02.O;
        if (r03 == null) goto L9;
        r03.a();
        return;
    L9:
        return;
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence r1, int r2) {
        super.onTitleChanged(r1, r2);
        l().l(r1);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((r3) l()).A();
        if (getWindow().hasFeature(0) == false) goto L6;
        super.openOptionsMenu();
        return;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int r2) {
        m();
        l().h(r2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
        super.setTheme(r2);
        ((r3) l()).T = r2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View r2) {
        m();
        l().i(r2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View r2, ViewGroup.LayoutParams r3) {
        m();
        l().j(r2, r3);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
