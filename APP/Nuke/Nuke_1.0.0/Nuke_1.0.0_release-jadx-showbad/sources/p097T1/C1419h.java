package p097T1;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: renamed from: T1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1419h {

    /* JADX INFO: renamed from: a */
    public final int f5073a;

    /* JADX INFO: renamed from: b */
    public final int f5074b;

    /* JADX INFO: renamed from: c */
    public final int f5075c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1419h(C1418g c1418g) {
        Context context = c1418g.f5069a;
        float f2 = c1418g.f5072d;
        ActivityManager activityManager = c1418g.f5070b;
        int i5 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f5075c = i5;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c1418g.f5071c.f297e;
        float f5 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f5 * f2);
        int iRound3 = Math.round(f5 * 2.0f);
        int i6 = iRound - i5;
        int i7 = iRound3 + iRound2;
        if (i7 <= i6) {
            this.f5074b = iRound3;
            this.f5073a = iRound2;
        } else {
            float f6 = i6 / (f2 + 2.0f);
            this.f5074b = Math.round(2.0f * f6);
            this.f5073a = Math.round(f6 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f5074b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f5073a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i5));
            sb.append(", memory class limited? ");
            sb.append(i7 > iRound);
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
