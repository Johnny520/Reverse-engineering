package p000;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.view.DisplayCutout;

/* JADX INFO: renamed from: a4 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0005a4 {
    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m34e(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ AnimatedImageDrawable m36g(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ DisplayCutout m39j(Object obj) {
        return (DisplayCutout) obj;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m51v(Object obj) {
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m52w(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m53x(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
