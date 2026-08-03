package com.abc.core.features;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0701v implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f2207b;

    public /* synthetic */ RunnableC0701v(Activity r1, int r2) {
        this.f2206a = r2;
        this.f2207b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity r2 = this.f2207b;
        switch(this.f2206a) {
            case 0: goto L45;
            case 1: goto L43;
            case 2: goto L37;
            case 3: goto L31;
            case 4: goto L27;
            case 5: goto L23;
            case 6: goto L19;
            case 7: goto L15;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r2, "$activity");
        AbstractC0358S.m899n0(r2);
        return;
    L6:
        AbstractC0307g.m703e(r2, "$activity");
        C0617P1 r02 = C0617P1.f1903a;
        Intent r3 = new Intent(r2, AbstractC0358S.m906r(r2.getClassLoader(), "com.tencent.mm.plugin.location.ui.RedirectUI"));     // Catch: Throwable -> L9
        r3.putExtra("map_view_type", 8);     // Catch: Throwable -> L9
        r2.startActivityForResult(r3, 44039);     // Catch: Throwable -> L9
        C0617P1.m1515c("launched RedirectUI for map pick");     // Catch: Throwable -> L9
        Toast.makeText(r2, "OKK：请在地图上选择位置", 0).show();     // Catch: Throwable -> L9
        Object r1 = C0146l.f339a;     // Catch: Throwable -> L9
    L11:
        Throwable r12 = AbstractC0141g.m465a(r1);
        if (r12 == null) goto L49;
        C0617P1.f1905c.set(false);
        VirtualLocationHook r03 = VirtualLocationHook.f1854a;
        VirtualLocationHook.m1487a();
        C0617P1.m1515c("launch RedirectUI failed: " + r12.getMessage());
        Toast.makeText(r2, "OKK：打开微信地图失败 " + r12.getMessage(), 1).show();
        return;
    L49:
        return;
    L9:
        th = move-exception;
        r1 = AbstractC0040p.m116u(th);
        goto L11
    L15:
        AbstractC0307g.m703e(r2, "$act");
        if (ThemeWallpaperConfig.f1701a.m1393e() == false) goto L50;
        Object r04 = WallpaperOverlayHook.f1792a;
        WallpaperOverlayHook.m1443a(r2);
        return;
    L50:
        return;
    L19:
        AbstractC0307g.m703e(r2, "$act");
        if (ThemeWallpaperConfig.f1701a.m1393e() == false) goto L51;
        Object r05 = WallpaperOverlayHook.f1792a;
        WallpaperOverlayHook.m1443a(r2);
        return;
    L51:
        return;
    L23:
        AbstractC0307g.m703e(r2, "$act");
        if (ThemeWallpaperConfig.f1701a.m1393e() == false) goto L52;
        Object r06 = WallpaperOverlayHook.f1792a;
        WallpaperOverlayHook.m1443a(r2);
        return;
    L52:
        return;
    L27:
        AbstractC0307g.m703e(r2, "$act");
        if (ThemeWallpaperConfig.f1701a.m1393e() == false) goto L53;
        Object r07 = WallpaperOverlayHook.f1792a;
        WallpaperOverlayHook.m1443a(r2);
        return;
    L53:
        return;
    L31:
        AbstractC0307g.m703e(r2, "$activity");
        if (r2.isFinishing() == false) goto L34;
        return;
    L34:
        if (ThemeWallpaperConfig.f1701a.m1393e() == false) goto L55;
        Object r08 = WallpaperOverlayHook.f1792a;
        WallpaperOverlayHook.m1443a(r2);
        WallpaperOverlayHook.m1450h(r2);
        return;
    L55:
        return;
    L37:
        AbstractC0307g.m703e(r2, "$activity");
        if (r2.isFinishing() == false) goto L40;
        return;
    L40:
        if (ThemeWallpaperConfig.f1701a.m1393e() == false) goto L57;
        Object r09 = WallpaperOverlayHook.f1792a;
        WallpaperOverlayHook.m1453k(r2);
        return;
    L57:
        return;
    L43:
        AbstractC0307g.m703e(r2, "$activity");
        C0704w.m1793a(r2, "onCreate.postDelayed");
        return;
    L45:
        AbstractC0307g.m703e(r2, "$activity");
        C0704w.m1793a(r2, "onCreate.post");
    }
}
