package p049I2;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: I2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0795m {

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f2542c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final String f2543a;

    /* JADX INFO: renamed from: b */
    public final String f2544b;

    public C0795m(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        this.f2543a = context.getFilesDir().getAbsolutePath() + "/fastkv/";
        this.f2544b = str;
    }

    /* JADX INFO: renamed from: a */
    public final SharedPreferencesC0796n m1357a() {
        SharedPreferencesC0796n sharedPreferencesC0796n;
        String str = this.f2543a + this.f2544b;
        ConcurrentHashMap concurrentHashMap = f2542c;
        SharedPreferencesC0796n sharedPreferencesC0796n2 = (SharedPreferencesC0796n) concurrentHashMap.get(str);
        if (sharedPreferencesC0796n2 != null) {
            return sharedPreferencesC0796n2;
        }
        synchronized (C0795m.class) {
            try {
                sharedPreferencesC0796n = (SharedPreferencesC0796n) concurrentHashMap.get(str);
                if (sharedPreferencesC0796n == null) {
                    sharedPreferencesC0796n = new SharedPreferencesC0796n(this.f2543a, this.f2544b, null, 0);
                    concurrentHashMap.put(str, sharedPreferencesC0796n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferencesC0796n;
    }
}
