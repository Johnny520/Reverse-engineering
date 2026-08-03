package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: bA */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1208bA {

    /* JADX INFO: renamed from: a */
    public static final Handler f4138a = null;

    static {
        f4138a = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static void m2328a(Runnable r2) {
        AbstractC0295Gu.m625r(-839726235908149L);
        m2329b(r2, 0);
    }

    /* JADX INFO: renamed from: b */
    public static void m2329b(Runnable r2, long r3) {
        AbstractC0295Gu.m625r(-839717645973557L);
        f4138a.postDelayed(r2, r3);
    }
}
