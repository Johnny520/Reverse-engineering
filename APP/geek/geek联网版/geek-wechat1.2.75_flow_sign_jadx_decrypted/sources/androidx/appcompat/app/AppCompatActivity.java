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
import p000.AbstractC0493mp;
import p000.AbstractC0498mu;
import p000.AbstractC0500mw;
import p000.AbstractC0555od;
import p000.AbstractC0617q1;
import p000.C0004a3;
import p000.C0235fs;
import p000.C0692s2;
import p000.C0729t2;
import p000.C0767u3;
import p000.ExecutorC0769u5;
import p000.InterfaceC0878x2;
import p000.LayoutInflaterFactory2C0656r3;
import p000.cb0;
import p000.d10;
import p000.dc0;
import p000.k90;
import p000.q70;
import p000.r50;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC0878x2 {

    /* JADX INFO: renamed from: x */
    public LayoutInflaterFactory2C0656r3 f155x;

    public AppCompatActivity() {
        ((C0004a3) this.f124e.f2555c).m22e("androidx:appcompat", new C0692s2(this, 0));
        m106h(new C0729t2(this, 0));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m116m();
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) m115l();
        layoutInflaterFactory2C0656r3.m2220w();
        ((ViewGroup) layoutInflaterFactory2C0656r3.f4004A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0656r3.f4040m.m1727a(layoutInflaterFactory2C0656r3.f4039l.getCallback());
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
        ((LayoutInflaterFactory2C0656r3) m115l()).m2204A();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0656r3) m115l()).m2204A();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.core.app.ComponentActivity
    /* JADX INFO: renamed from: f */
    public final void mo114f() {
        m115l().mo958b();
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) m115l();
        layoutInflaterFactory2C0656r3.m2220w();
        return layoutInflaterFactory2C0656r3.f4039l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) m115l();
        if (layoutInflaterFactory2C0656r3.f4043p == null) {
            layoutInflaterFactory2C0656r3.m2204A();
            dc0 dc0Var = layoutInflaterFactory2C0656r3.f4042o;
            layoutInflaterFactory2C0656r3.f4043p = new r50(dc0Var != null ? dc0Var.m910R() : layoutInflaterFactory2C0656r3.f4038k);
        }
        return layoutInflaterFactory2C0656r3.f4043p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = k90.f2800a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m115l().mo958b();
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC0173e3 m115l() {
        if (this.f155x == null) {
            ExecutorC0769u5 executorC0769u5 = AbstractC0173e3.f1489a;
            this.f155x = new LayoutInflaterFactory2C0656r3(this, null, this, this);
        }
        return this.f155x;
    }

    /* JADX INFO: renamed from: m */
    public final void m116m() {
        View decorView = getWindow().getDecorView();
        AbstractC0493mp.m1857g("<this>", decorView);
        decorView.setTag(com.ljx.wechatmod.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0493mp.m1857g("<this>", decorView2);
        decorView2.setTag(com.ljx.wechatmod.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0493mp.m1857g("<this>", decorView3);
        decorView3.setTag(com.ljx.wechatmod.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0493mp.m1857g("<this>", decorView4);
        decorView4.setTag(com.ljx.wechatmod.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) m115l();
        if (layoutInflaterFactory2C0656r3.f4009F && layoutInflaterFactory2C0656r3.f4053z) {
            layoutInflaterFactory2C0656r3.m2204A();
            dc0 dc0Var = layoutInflaterFactory2C0656r3.f4042o;
            if (dc0Var != null) {
                dc0Var.m913U(dc0Var.f1380v.getResources().getBoolean(com.ljx.wechatmod.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0767u3 c0767u3M2425a = C0767u3.m2425a();
        Context context = layoutInflaterFactory2C0656r3.f4038k;
        synchronized (c0767u3M2425a) {
            d10 d10Var = c0767u3M2425a.f4623a;
            synchronized (d10Var) {
                C0235fs c0235fs = (C0235fs) d10Var.f1288b.get(context);
                if (c0235fs != null) {
                    c0235fs.m1107a();
                }
            }
        }
        layoutInflaterFactory2C0656r3.f4021R = new Configuration(layoutInflaterFactory2C0656r3.f4038k.getResources().getConfiguration());
        layoutInflaterFactory2C0656r3.m2213m(false, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        m115l().mo960e();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM1894m;
        if (!super.onMenuItemSelected(i, menuItem)) {
            LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) m115l();
            layoutInflaterFactory2C0656r3.m2204A();
            dc0 dc0Var = layoutInflaterFactory2C0656r3.f4042o;
            if (menuItem.getItemId() != 16908332 || dc0Var == null || (((q70) dc0Var.f1384z).f3850b & 4) == 0 || (intentM1894m = AbstractC0498mu.m1894m(this)) == null) {
                return false;
            }
            if (!AbstractC0500mw.m1906c(this, intentM1894m)) {
                AbstractC0500mw.m1905b(this, intentM1894m);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM1894m2 = AbstractC0498mu.m1894m(this);
            if (intentM1894m2 == null) {
                intentM1894m2 = AbstractC0498mu.m1894m(this);
            }
            if (intentM1894m2 != null) {
                ComponentName component = intentM1894m2.getComponent();
                if (component == null) {
                    component = intentM1894m2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentM1895n = AbstractC0498mu.m1895n(this, component);
                    while (intentM1895n != null) {
                        arrayList.add(size, intentM1895n);
                        intentM1895n = AbstractC0498mu.m1895n(this, intentM1895n.getComponent());
                    }
                    arrayList.add(intentM1894m2);
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
            AbstractC0555od.m2024a(this, intentArr, null);
            try {
                AbstractC0617q1.m2103a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0656r3) m115l()).m2220w();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) m115l();
        layoutInflaterFactory2C0656r3.m2204A();
        dc0 dc0Var = layoutInflaterFactory2C0656r3.f4042o;
        if (dc0Var != null) {
            dc0Var.f1375O = true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0656r3) m115l()).m2213m(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) m115l();
        layoutInflaterFactory2C0656r3.m2204A();
        dc0 dc0Var = layoutInflaterFactory2C0656r3.f4042o;
        if (dc0Var != null) {
            dc0Var.f1375O = false;
            cb0 cb0Var = dc0Var.f1374N;
            if (cb0Var != null) {
                cb0Var.m610a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m115l().mo965l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C0656r3) m115l()).m2204A();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        m116m();
        m115l().mo962h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0656r3) m115l()).f4023T = i;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m116m();
        m115l().mo963i(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m116m();
        m115l().mo964j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
