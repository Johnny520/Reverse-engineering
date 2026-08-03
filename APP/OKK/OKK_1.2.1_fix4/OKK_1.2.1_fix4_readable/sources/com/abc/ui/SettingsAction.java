package com.abc.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.abc.core.features.C0599J1;
import com.abc.core.features.ConfigStore;
import com.abc.core.features.DownloadRedirector;
import com.abc.core.features.MessageDetailHook;
import com.abc.core.features.RunnableC0701v;
import com.abc.core.features.ThemeWallpaperConfig;
import com.abc.core.features.WallpaperOverlayHook;
import com.abc.core.runtime.SettingsUiBuilder;
import java.io.File;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: d0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SettingsAction implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2579a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f2580b;

    public /* synthetic */ SettingsAction(Activity activity, int i2) {
        this.f2579a = i2;
        this.f2580b = activity;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        Object objM116u;
        View decorView;
        Object objM116u2;
        Object objM116u3;
        int i2 = 9;
        switch (this.f2579a) {
            case 0:
                Activity activity = this.f2580b;
                AbstractC0307g.m703e(activity, "$activity");
                AbstractC0358S.m868R(activity, new SettingsAction(activity, 10));
                break;
            case 1:
                Activity activity2 = this.f2580b;
                AbstractC0307g.m703e(activity2, "$activity");
                AbstractC0358S.m868R(activity2, new SettingsAction(activity2, i2));
                break;
            case 2:
                Activity activity3 = this.f2580b;
                AbstractC0307g.m703e(activity3, "$activity");
                AbstractC0358S.m868R(activity3, new SettingsAction(activity3, 4));
                break;
            case 3:
                Activity activity4 = this.f2580b;
                AbstractC0307g.m703e(activity4, "$activity");
                AbstractC0358S.m868R(activity4, new SettingsAction(activity4, 8));
                break;
            case 4:
                Activity activity5 = this.f2580b;
                AbstractC0307g.m703e(activity5, "$activity");
                InterfaceC0286l interfaceC0286l = AbstractC0358S.f733m;
                if (interfaceC0286l != null) {
                    interfaceC0286l.invoke(activity5);
                } else {
                    Toast.makeText(activity5, "设置入口未就绪", 0).show();
                }
                break;
            case 5:
                C0146l c0146l = C0146l.f339a;
                Activity activity6 = this.f2580b;
                AbstractC0307g.m703e(activity6, "$activity");
                try {
                    activity6.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/OKK_Group")).addFlags(268435456));
                    objM116u = c0146l;
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (AbstractC0141g.m465a(objM116u) != null) {
                    Toast.makeText(activity6, "无法打开链接", 0).show();
                }
                break;
            case 6:
                Activity activity7 = this.f2580b;
                AbstractC0307g.m703e(activity7, "$activity");
                AbstractC0358S.m898n(false);
                Window window = activity7.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.post(new RunnableC0701v(activity7, i2));
                }
                break;
            case 7:
                Activity activity8 = this.f2580b;
                AbstractC0307g.m703e(activity8, "$activity");
                InterfaceC0286l interfaceC0286l2 = AbstractC0358S.f732l;
                if (interfaceC0286l2 != null) {
                    interfaceC0286l2.invoke(activity8);
                } else {
                    Toast.makeText(activity8, "设置入口未就绪", 0).show();
                }
                break;
            case 8:
                Activity activity9 = this.f2580b;
                AbstractC0307g.m703e(activity9, "$activity");
                InterfaceC0286l interfaceC0286l3 = AbstractC0358S.f734n;
                if (interfaceC0286l3 != null) {
                    interfaceC0286l3.invoke(activity9);
                } else {
                    Toast.makeText(activity9, "设置入口未就绪", 0).show();
                }
                break;
            case 9:
                Activity activity10 = this.f2580b;
                AbstractC0307g.m703e(activity10, "$activity");
                InterfaceC0286l interfaceC0286l4 = AbstractC0358S.f735o;
                if (interfaceC0286l4 != null) {
                    interfaceC0286l4.invoke(activity10);
                } else {
                    Toast.makeText(activity10, "设置入口未就绪", 0).show();
                }
                break;
            case 10:
                Activity activity11 = this.f2580b;
                AbstractC0307g.m703e(activity11, "$activity");
                InterfaceC0286l interfaceC0286l5 = AbstractC0358S.f731k;
                if (interfaceC0286l5 != null) {
                    interfaceC0286l5.invoke(activity11);
                } else {
                    Toast.makeText(activity11, "设置入口未就绪", 0).show();
                }
                break;
            case 11:
                Activity activity12 = this.f2580b;
                AbstractC0307g.m703e(activity12, "$activity");
                AbstractC0358S.m868R(activity12, new SettingsAction(activity12, 5));
                break;
            case 12:
                Activity activity13 = this.f2580b;
                AbstractC0307g.m703e(activity13, "$activity");
                AbstractC0358S.m868R(activity13, new SettingsAction(activity13, 7));
                break;
            case 13:
                C0146l c0146l2 = C0146l.f339a;
                Activity activity14 = this.f2580b;
                AbstractC0307g.m703e(activity14, "$host");
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                intent.addFlags(3);
                try {
                    activity14.startActivityForResult(intent, 658720);
                    objM116u2 = c0146l2;
                } catch (Throwable th2) {
                    objM116u2 = AbstractC0040p.m116u(th2);
                }
                if (AbstractC0141g.m465a(objM116u2) != null) {
                    SettingsUiBuilder settingsUiBuilder = SettingsUiBuilder.f2933a;
                    SettingsUiBuilder.m2105z(activity14, "无法打开目录选择器");
                }
                break;
            case 14:
                Activity activity15 = this.f2580b;
                AbstractC0307g.m703e(activity15, "$host");
                DownloadRedirector downloadRedirector = DownloadRedirector.f2022a;
                DownloadRedirector.m1635d("/storage/emulated/0/Android/media/com.tencent.mm/OKK/download");
                SettingsUiBuilder settingsUiBuilder2 = SettingsUiBuilder.f2933a;
                SettingsUiBuilder.m2105z(activity15, "已恢复默认：/storage/emulated/0/Android/media/com.tencent.mm/OKK/download");
                break;
            case 15:
                C0146l c0146l3 = C0146l.f339a;
                Activity activity16 = this.f2580b;
                AbstractC0307g.m703e(activity16, "$host");
                C0599J1 c0599j1 = C0599J1.f1831a;
                Object obj = WallpaperOverlayHook.f1792a;
                WallpaperOverlayHook.m1466x(activity16);
                Activity activityM1468z = WallpaperOverlayHook.m1468z();
                if (activityM1468z == null) {
                    activityM1468z = activity16;
                }
                Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                intent2.setType("image/*");
                intent2.addCategory("android.intent.category.OPENABLE");
                try {
                    activityM1468z.startActivityForResult(Intent.createChooser(intent2, "选择壁纸"), 658449);
                    objM116u3 = c0146l3;
                } catch (Throwable th3) {
                    objM116u3 = AbstractC0040p.m116u(th3);
                }
                if (AbstractC0141g.m465a(objM116u3) != null) {
                    try {
                        activity16.startActivityForResult(intent2, 658449);
                    } catch (Throwable th4) {
                        AbstractC0040p.m116u(th4);
                    }
                }
                SettingsUiBuilder settingsUiBuilder3 = SettingsUiBuilder.f2933a;
                SettingsUiBuilder.m2105z(activity16, "选择完成后点「应用壁纸」");
                break;
            case 16:
                Activity activity17 = this.f2580b;
                AbstractC0307g.m703e(activity17, "$host");
                ThemeWallpaperConfig themeWallpaperConfig = ThemeWallpaperConfig.f1701a;
                try {
                    new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "theme_wallpaper.jpg").delete();
                } catch (Throwable th5) {
                    AbstractC0040p.m116u(th5);
                }
                ConfigStore configStore = ConfigStore.f2048a;
                configStore.m1666f("theme_wallpaper_path", "", true);
                String strValueOf = String.valueOf(System.currentTimeMillis());
                configStore.m1666f("theme_wallpaper_updated", strValueOf, true);
                ThemeWallpaperConfig.f1706f = "";
                ThemeWallpaperConfig.f1707g = strValueOf;
                ThemeWallpaperConfig.f1708h = null;
                ThemeWallpaperConfig.f1709i = "";
                ThemeWallpaperConfig.f1710j = "";
                ThemeWallpaperConfig.f1703c = SystemClock.uptimeMillis();
                ThemeWallpaperConfig.m1389f();
                ThemeWallpaperConfig themeWallpaperConfig2 = ThemeWallpaperConfig.f1701a;
                configStore.m1667g("theme_wallpaper_enabled", false, true);
                ThemeWallpaperConfig.f1704d = false;
                ThemeWallpaperConfig.f1703c = SystemClock.uptimeMillis();
                ThemeWallpaperConfig.m1389f();
                Object obj2 = WallpaperOverlayHook.f1792a;
                WallpaperOverlayHook.m1465w();
                SettingsUiBuilder settingsUiBuilder4 = SettingsUiBuilder.f2933a;
                SettingsUiBuilder.m2105z(activity17, "已清除壁纸，恢复默认");
                break;
            case 17:
                Activity activity18 = this.f2580b;
                AbstractC0307g.m703e(activity18, "$host");
                ThemeWallpaperConfig themeWallpaperConfig3 = ThemeWallpaperConfig.f1701a;
                ThemeWallpaperConfig.f1703c = 0L;
                ThemeWallpaperConfig.m1390g(true);
                ConfigStore.f2048a.m1667g("theme_wallpaper_enabled", true, false);
                Object obj3 = WallpaperOverlayHook.f1792a;
                WallpaperOverlayHook.m1466x(activity18);
                String strM1452j = WallpaperOverlayHook.m1452j();
                SettingsUiBuilder settingsUiBuilder5 = SettingsUiBuilder.f2933a;
                SettingsUiBuilder.m2105z(activity18, strM1452j);
                break;
            case 18:
                Activity activity19 = this.f2580b;
                AbstractC0307g.m703e(activity19, "$host");
                MessageDetailHook messageDetailHook = MessageDetailHook.f1967a;
                MessageDetailHook.m1589j0(activity19, false);
                break;
            default:
                Activity activity20 = this.f2580b;
                AbstractC0307g.m703e(activity20, "$host");
                MessageDetailHook messageDetailHook2 = MessageDetailHook.f1967a;
                MessageDetailHook.m1589j0(activity20, true);
                break;
        }
        return C0146l.f339a;
    }
}
