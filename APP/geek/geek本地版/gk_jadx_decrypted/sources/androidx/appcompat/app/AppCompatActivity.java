package androidx.appcompat.app;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import p000.AbstractC0173e3;
import p000.AbstractC0183ed;
import p000.AbstractC0202ew;
import p000.AbstractC0346ip;
import p000.AbstractC0618q1;
import p000.AbstractC0979zt;
import p000.C0004a3;
import p000.C0079bs;
import p000.C0693s2;
import p000.C0730t2;
import p000.C0768u3;
import p000.ExecutorC0770u5;
import p000.InterfaceC0878x2;
import p000.LayoutInflaterFactory2C0657r3;
import p000.f90;
import p000.k50;
import p000.k70;
import p000.w00;
import p000.xa0;
import p000.yb0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC0878x2 {

    /* JADX INFO: renamed from: x */
    public LayoutInflaterFactory2C0657r3 f192x;

    public AppCompatActivity() {
        ((C0004a3) this.f161e.f2143c).m9e("androidx:appcompat", new C0693s2(this, 0));
        m121h(new C0730t2(this, 0));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m131m();
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) m130l();
        layoutInflaterFactory2C0657r3.m2209w();
        ((ViewGroup) layoutInflaterFactory2C0657r3.f4143A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0657r3.f4179m.m1737a(layoutInflaterFactory2C0657r3.f4178l.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attachBaseContext(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C0657r3) m130l()).m2193A();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0657r3) m130l()).m2193A();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.core.app.ComponentActivity
    /* JADX INFO: renamed from: f */
    public final void mo129f() {
        m130l().mo974b();
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) m130l();
        layoutInflaterFactory2C0657r3.m2209w();
        return layoutInflaterFactory2C0657r3.f4178l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) m130l();
        if (layoutInflaterFactory2C0657r3.f4182p == null) {
            layoutInflaterFactory2C0657r3.m2193A();
            yb0 yb0Var = layoutInflaterFactory2C0657r3.f4181o;
            layoutInflaterFactory2C0657r3.f4182p = new k50(yb0Var != null ? yb0Var.m2682L() : layoutInflaterFactory2C0657r3.f4177k);
        }
        return layoutInflaterFactory2C0657r3.f4182p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = f90.f1914a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m130l().mo974b();
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC0173e3 m130l() {
        if (this.f192x == null) {
            ExecutorC0770u5 executorC0770u5 = AbstractC0173e3.f1684a;
            this.f192x = new LayoutInflaterFactory2C0657r3(this, null, this, this);
        }
        return this.f192x;
    }

    /* JADX INFO: renamed from: m */
    public final void m131m() {
        View decorView = getWindow().getDecorView();
        AbstractC0346ip.m1503o("<this>", decorView);
        decorView.setTag(com.ljx.wechatmod.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0346ip.m1503o("<this>", decorView2);
        decorView2.setTag(com.ljx.wechatmod.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0346ip.m1503o("<this>", decorView3);
        decorView3.setTag(com.ljx.wechatmod.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0346ip.m1503o("<this>", decorView4);
        decorView4.setTag(com.ljx.wechatmod.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) m130l();
        if (layoutInflaterFactory2C0657r3.f4148F && layoutInflaterFactory2C0657r3.f4192z) {
            layoutInflaterFactory2C0657r3.m2193A();
            yb0 yb0Var = layoutInflaterFactory2C0657r3.f4181o;
            if (yb0Var != null) {
                yb0Var.m2685O(yb0Var.f5327w.getResources().getBoolean(com.ljx.wechatmod.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0768u3 c0768u3M2404a = C0768u3.m2404a();
        Context context = layoutInflaterFactory2C0657r3.f4177k;
        synchronized (c0768u3M2404a) {
            w00 w00Var = c0768u3M2404a.f4655a;
            synchronized (w00Var) {
                C0079bs c0079bs = (C0079bs) w00Var.f4897b.get(context);
                if (c0079bs != null) {
                    c0079bs.m564a();
                }
            }
        }
        layoutInflaterFactory2C0657r3.f4160R = new Configuration(layoutInflaterFactory2C0657r3.f4177k.getResources().getConfiguration());
        layoutInflaterFactory2C0657r3.m2202m(false, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        m130l().mo976e();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM2832r;
        if (!super.onMenuItemSelected(i, menuItem)) {
            LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) m130l();
            layoutInflaterFactory2C0657r3.m2193A();
            yb0 yb0Var = layoutInflaterFactory2C0657r3.f4181o;
            if (menuItem.getItemId() != 16908332 || yb0Var == null || (((k70) yb0Var.f5307A).f2718b & 4) == 0 || (intentM2832r = AbstractC0979zt.m2832r(this)) == null) {
                return false;
            }
            if (!AbstractC0202ew.m1091c(this, intentM2832r)) {
                AbstractC0202ew.m1090b(this, intentM2832r);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM2832r2 = AbstractC0979zt.m2832r(this);
            if (intentM2832r2 == null) {
                intentM2832r2 = AbstractC0979zt.m2832r(this);
            }
            if (intentM2832r2 != null) {
                ComponentName component = intentM2832r2.getComponent();
                if (component == null) {
                    component = intentM2832r2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentM2833s = AbstractC0979zt.m2833s(this, component);
                    while (intentM2833s != null) {
                        arrayList.add(size, intentM2833s);
                        intentM2833s = AbstractC0979zt.m2833s(this, intentM2833s.getComponent());
                    }
                    arrayList.add(intentM2832r2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            AbstractC0183ed.m1019a(this, intentArr, null);
            try {
                AbstractC0618q1.m2136a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0657r3) m130l()).m2209w();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) m130l();
        layoutInflaterFactory2C0657r3.m2193A();
        yb0 yb0Var = layoutInflaterFactory2C0657r3.f4181o;
        if (yb0Var != null) {
            yb0Var.f5322P = true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0657r3) m130l()).m2202m(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) m130l();
        layoutInflaterFactory2C0657r3.m2193A();
        yb0 yb0Var = layoutInflaterFactory2C0657r3.f4181o;
        if (yb0Var != null) {
            yb0Var.f5322P = false;
            xa0 xa0Var = yb0Var.f5321O;
            if (xa0Var != null) {
                xa0Var.m2617a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m130l().mo981l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C0657r3) m130l()).m2193A();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        m131m();
        m130l().mo978h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0657r3) m130l()).f4162T = i;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m131m();
        m130l().mo979i(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m131m();
        m130l().mo980j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
