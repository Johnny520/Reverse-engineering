package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kg1 {

    /* JADX INFO: renamed from: a */
    public final int f5519a;

    /* JADX INFO: renamed from: b */
    public final int f5520b;

    /* JADX INFO: renamed from: c */
    public final int f5521c;

    public kg1(jg1 jg1Var) {
        Context context = jg1Var.f5023a;
        float f = jg1Var.f5026d;
        ActivityManager activityManager = jg1Var.f5024b;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f5521c = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) jg1Var.f5025c.f6983i;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.f5520b = iRound3;
            this.f5519a = iRound2;
        } else {
            float f3 = i2 / (f + 2.0f);
            this.f5520b = Math.round(2.0f * f3);
            this.f5519a = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f5520b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f5519a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
