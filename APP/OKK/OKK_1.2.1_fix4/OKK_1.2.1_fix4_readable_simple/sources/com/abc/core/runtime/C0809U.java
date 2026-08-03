package com.abc.core.runtime;

import android.os.SystemClock;
import android.widget.SeekBar;
import android.widget.TextView;
import com.abc.core.features.ConfigStore;
import com.abc.core.features.RunnableC0578C1;
import com.abc.core.features.ThemeWallpaperConfig;
import com.abc.core.features.WallpaperOverlayHook;
import p001A0.AbstractC0040p;

/* JADX INFO: renamed from: f0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0809U implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f2931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SeekBar f2932b;

    public C0809U(TextView r1, SeekBar r2) {
        this.f2931a = r1;
        this.f2932b = r2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar r4, int r5, boolean r6) {
        if (r6 == true) goto L4;
        return;
    L4:
        ThemeWallpaperConfig r42 = ThemeWallpaperConfig.f1701a;
        float r43 = ThemeWallpaperConfig.m1387c(AbstractC0040p.m111p(r5, 1, 85) / 100.0f);
        this.f2931a.setText("不透明度 " + ((int) (100 * r43)) + "%");
        float r44 = ThemeWallpaperConfig.m1387c(r43);
        ThemeWallpaperConfig.f1705e = r44;
        ThemeWallpaperConfig.f1703c = SystemClock.uptimeMillis();
        ConfigStore.f2048a.m1666f("theme_wallpaper_alpha", ThemeWallpaperConfig.m1388d(r44), true);
        Object r52 = WallpaperOverlayHook.f1792a;
        WallpaperOverlayHook.f1796e.post(new RunnableC0578C1(ThemeWallpaperConfig.m1387c(r44)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar r1) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar r5) {
        ThemeWallpaperConfig r52 = ThemeWallpaperConfig.f1701a;
        float r53 = ThemeWallpaperConfig.m1387c(ThemeWallpaperConfig.m1387c(AbstractC0040p.m111p(this.f2932b.getProgress(), 1, 85) / 100.0f));
        ConfigStore.f2048a.m1666f("theme_wallpaper_alpha", ThemeWallpaperConfig.m1388d(r53), false);
        ThemeWallpaperConfig.f1705e = r53;
        ThemeWallpaperConfig.f1703c = SystemClock.uptimeMillis();
        Object r02 = WallpaperOverlayHook.f1792a;
        WallpaperOverlayHook.f1796e.post(new RunnableC0578C1(ThemeWallpaperConfig.m1387c(r53)));
    }
}
