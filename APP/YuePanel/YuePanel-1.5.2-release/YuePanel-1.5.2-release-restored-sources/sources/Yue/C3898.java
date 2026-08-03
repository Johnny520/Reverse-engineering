package Yue;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3898 {
    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ */
    public static final float m926(long j) {
        return Color.red(j);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static final float m927(@InterfaceC6399 Color color) {
        return color.getComponent(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m11083(@InterfaceC3897 int i) {
        return (i >> 24) & 255;
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final float m11084(long j) {
        return Color.green(j);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final float m11085(@InterfaceC6399 Color color) {
        return color.getComponent(1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m11086(@InterfaceC3897 int i) {
        return (i >> 16) & 255;
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final float m11087(long j) {
        return Color.blue(j);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final float m11088(@InterfaceC6399 Color color) {
        return color.getComponent(2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m11089(@InterfaceC3897 int i) {
        return (i >> 8) & 255;
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final float m11090(long j) {
        return Color.alpha(j);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final float m11091(@InterfaceC6399 Color color) {
        return color.getComponent(3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int m11092(@InterfaceC3897 int i) {
        return i & 255;
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long m11093(@InterfaceC3897 int i, @InterfaceC6399 ColorSpace.Named named) {
        return Color.convert(i, ColorSpace.get(named));
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final long m11094(@InterfaceC3897 int i, @InterfaceC6399 ColorSpace colorSpace) {
        return Color.convert(i, colorSpace);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final long m11095(long j, @InterfaceC6399 ColorSpace.Named named) {
        return Color.convert(j, ColorSpace.get(named));
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long m11096(long j, @InterfaceC6399 ColorSpace colorSpace) {
        return Color.convert(j, colorSpace);
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final Color m11097(@InterfaceC6399 Color color, @InterfaceC6399 ColorSpace.Named named) {
        return color.convert(ColorSpace.get(named));
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final Color m11098(@InterfaceC6399 Color color, @InterfaceC6399 ColorSpace colorSpace) {
        return color.convert(colorSpace);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final float m11099(long j) {
        return Color.alpha(j);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m11100(@InterfaceC3897 int i) {
        return (i >> 24) & 255;
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final float m11101(long j) {
        return Color.blue(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int m11102(@InterfaceC3897 int i) {
        return i & 255;
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final ColorSpace m11103(long j) {
        return Color.colorSpace(j);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final float m11104(long j) {
        return Color.green(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int m11105(@InterfaceC3897 int i) {
        return (i >> 8) & 255;
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final float m11106(@InterfaceC3897 int i) {
        return Color.luminance(i);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final float m11107(long j) {
        return Color.luminance(j);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final float m11108(long j) {
        return Color.red(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int m11109(@InterfaceC3897 int i) {
        return (i >> 16) & 255;
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final boolean m11110(long j) {
        return Color.isSrgb(j);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final boolean m11111(long j) {
        return Color.isWideGamut(j);
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final Color m11112(@InterfaceC6399 Color color, @InterfaceC6399 Color color2) {
        return C3913.m11166(color2, color);
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final Color m11113(@InterfaceC3897 int i) {
        return Color.valueOf(i);
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final Color m11114(long j) {
        return Color.valueOf(j);
    }

    @InterfaceC3897
    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int m11115(long j) {
        return Color.toArgb(j);
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int m11116(@InterfaceC6399 String str) {
        return Color.parseColor(str);
    }

    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final long m11117(@InterfaceC3897 int i) {
        return Color.pack(i);
    }
}
