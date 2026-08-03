package com.abc.core.features;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.abc.core.runtime.HookDiagnostics;
import com.abc.core.runtime.SettingsEntryInjector;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.I1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0596I1 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1826b;

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public final void mo1385a(C0760b c0760b) {
        Activity activity;
        View decorView;
        View decorView2;
        View decorView3;
        View decorView4;
        switch (this.f1826b) {
            case 0:
                Object obj = c0760b.f2669b;
                activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    Object obj2 = WallpaperOverlayHook.f1792a;
                    WallpaperOverlayHook.m1466x(activity);
                    Window window = activity.getWindow();
                    if (window != null && (decorView4 = window.getDecorView()) != null) {
                        decorView4.postDelayed(new RunnableC0701v(activity, 4), 400L);
                    }
                    Window window2 = activity.getWindow();
                    if (window2 != null && (decorView3 = window2.getDecorView()) != null) {
                        decorView3.postDelayed(new RunnableC0701v(activity, 5), 1200L);
                    }
                    Window window3 = activity.getWindow();
                    if (window3 != null && (decorView2 = window3.getDecorView()) != null) {
                        decorView2.postDelayed(new RunnableC0701v(activity, 6), 2600L);
                    }
                    Window window4 = activity.getWindow();
                    if (window4 != null && (decorView = window4.getDecorView()) != null) {
                        decorView.postDelayed(new RunnableC0701v(activity, 7), 5200L);
                        break;
                    }
                }
                break;
            case 1:
                Object obj3 = c0760b.f2669b;
                activity = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity != null && ThemeWallpaperConfig.f1701a.m1393e()) {
                    Object obj4 = WallpaperOverlayHook.f1792a;
                    WallpaperOverlayHook.m1439B(activity);
                }
                break;
            case 2:
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                if (AbstractC0307g.m699a(AbstractC0179j.m537n0(0, objArr), Boolean.TRUE)) {
                    Object obj5 = c0760b.f2669b;
                    activity = obj5 instanceof Activity ? (Activity) obj5 : null;
                    if (activity != null) {
                        HookDiagnostics.m2151a(activity, "focus");
                        break;
                    }
                }
                break;
            case 3:
                Object obj6 = c0760b.f2669b;
                activity = obj6 instanceof Activity ? (Activity) obj6 : null;
                if (activity != null) {
                    HookDiagnostics hookDiagnostics = HookDiagnostics.f3000a;
                    HookDiagnostics.m2151a(activity, "hook:" + c0760b.f2668a.getName());
                    break;
                }
                break;
            case 4:
                Object obj7 = c0760b.f2669b;
                AbstractC0307g.m702d(obj7, "thisObject");
                SettingsEntryInjector.m2135a(obj7);
                break;
            case 5:
                Object obj8 = c0760b.f2669b;
                AbstractC0307g.m702d(obj8, "thisObject");
                SettingsEntryInjector.m2135a(obj8);
                break;
            default:
                Object obj9 = c0760b.f2669b;
                AbstractC0307g.m702d(obj9, "thisObject");
                SettingsEntryInjector settingsEntryInjector = SettingsEntryInjector.f2992a;
                SettingsEntryInjector.m2140f(obj9);
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b c0760b) {
        switch (this.f1826b) {
            case 1:
                if (ThemeWallpaperConfig.f1701a.m1393e()) {
                    Object obj = c0760b.f2669b;
                    Activity activity = obj instanceof Activity ? (Activity) obj : null;
                    if (activity != null) {
                        Object obj2 = WallpaperOverlayHook.f1792a;
                        WallpaperOverlayHook.m1462t(activity);
                    }
                    c0760b.f2670c[0] = Boolean.FALSE;
                }
                break;
        }
    }

    public C0596I1(int i2) {
        this.f1826b = i2;
        switch (i2) {
            case 4:
                SettingsEntryInjector settingsEntryInjector = SettingsEntryInjector.f2992a;
                break;
            case 5:
                SettingsEntryInjector settingsEntryInjector2 = SettingsEntryInjector.f2992a;
                break;
            default:
                HookDiagnostics hookDiagnostics = HookDiagnostics.f3000a;
                break;
        }
    }

    public C0596I1(ClassLoader classLoader) {
        this.f1826b = 6;
        SettingsEntryInjector settingsEntryInjector = SettingsEntryInjector.f2992a;
    }
}
