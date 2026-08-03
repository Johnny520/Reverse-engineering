package p001;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۟.h5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0238h5 implements InterfaceC0191e0 {

    /* JADX INFO: renamed from: ۥ */
    public final LinkedHashMap<String, Bitmap> f830;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f831;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1496;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0238h5(Context context) {
        StringBuilder sb = C0259ic.f866;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int largeMemoryClass = (((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7;
        if (largeMemoryClass <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.f831 = largeMemoryClass;
        this.f830 = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: ۥ */
    public final Bitmap m866(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Bitmap bitmap = this.f830.get(str);
            if (bitmap != null) {
                return bitmap;
            }
            return null;
        }
    }
}
