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

    public C0809U(TextView textView, SeekBar seekBar) {
        this.f2931a = textView;
        this.f2932b = seekBar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (z2) {
            ThemeWallpaperConfig themeWallpaperConfig = ThemeWallpaperConfig.f1701a;
            float fM1387c = ThemeWallpaperConfig.m1387c(AbstractC0040p.m111p(i2, 1, 85) / 100.0f);
            this.f2931a.setText("不透明度 " + ((int) (100 * fM1387c)) + "%");
            float fM1387c2 = ThemeWallpaperConfig.m1387c(fM1387c);
            ThemeWallpaperConfig.f1705e = fM1387c2;
            ThemeWallpaperConfig.f1703c = SystemClock.uptimeMillis();
            ConfigStore.f2048a.m1666f("theme_wallpaper_alpha", ThemeWallpaperConfig.m1388d(fM1387c2), true);
            Object obj = WallpaperOverlayHook.f1792a;
            WallpaperOverlayHook.f1796e.post(new RunnableC0578C1(ThemeWallpaperConfig.m1387c(fM1387c2)));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        ThemeWallpaperConfig themeWallpaperConfig = ThemeWallpaperConfig.f1701a;
        float fM1387c = ThemeWallpaperConfig.m1387c(ThemeWallpaperConfig.m1387c(AbstractC0040p.m111p(this.f2932b.getProgress(), 1, 85) / 100.0f));
        ConfigStore.f2048a.m1666f("theme_wallpaper_alpha", ThemeWallpaperConfig.m1388d(fM1387c), false);
        ThemeWallpaperConfig.f1705e = fM1387c;
        ThemeWallpaperConfig.f1703c = SystemClock.uptimeMillis();
        Object obj = WallpaperOverlayHook.f1792a;
        WallpaperOverlayHook.f1796e.post(new RunnableC0578C1(ThemeWallpaperConfig.m1387c(fM1387c)));
    }
}
