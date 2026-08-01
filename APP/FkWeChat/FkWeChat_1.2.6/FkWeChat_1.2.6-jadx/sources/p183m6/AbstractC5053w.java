package p183m6;

import android.util.Log;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: m6.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5053w {
    /* JADX INFO: renamed from: a */
    public static void m20451a(SharedPreferencesC5046p sharedPreferencesC5046p, Exception exc) {
        Executor executor = AbstractC5047q.f15358a;
        Log.e("FastKV", sharedPreferencesC5046p.f15329b, exc);
    }

    /* JADX INFO: renamed from: b */
    public static void m20452b(SharedPreferencesC5046p sharedPreferencesC5046p, String str) {
        Executor executor = AbstractC5047q.f15358a;
        Log.e("FastKV", sharedPreferencesC5046p.f15329b + " " + str);
    }

    /* JADX INFO: renamed from: c */
    public static void m20453c(SharedPreferencesC5046p sharedPreferencesC5046p, String str) {
        Executor executor = AbstractC5047q.f15358a;
        Log.i("FastKV", sharedPreferencesC5046p.f15329b + " " + str);
    }

    /* JADX INFO: renamed from: d */
    public static void m20454d(SharedPreferencesC5046p sharedPreferencesC5046p, Exception exc) {
        Executor executor = AbstractC5047q.f15358a;
        Log.w("FastKV", sharedPreferencesC5046p.f15329b, exc);
    }
}
