package p346;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p007.AbstractC6136;
import p010.RunnableC6155;
import p251.SharedPreferencesC8175;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9114 f24959 = new C9114("TroopAdminUtils", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ScheduledExecutorService f24958 = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f24957 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14489(String str, ArrayList arrayList) {
        String strM11557 = AbstractC6136.m11557(-3937678772141295015L, new StringBuilder(), str);
        C9114 c9114 = f24959;
        c9114.m14640(arrayList, strM11557);
        c9114.m14640(Long.valueOf(System.currentTimeMillis()), strM11557.concat("_time"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14490(String str) {
        HashMap map = f24957;
        if (((ScheduledFuture) map.get(str)) != null) {
            return;
        }
        map.put(str, f24958.scheduleWithFixedDelay(new RunnableC6155(str, 2), 5L, 30L, TimeUnit.MINUTES));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m14491(String str) {
        String strM11557 = AbstractC6136.m11557(-3937678772141295015L, new StringBuilder(), str);
        String strConcat = strM11557.concat("_time");
        C9114 c9114 = f24959;
        c9114.getClass();
        SharedPreferencesC8175 sharedPreferencesC8175 = c9114.f25485;
        if (sharedPreferencesC8175.contains(strConcat)) {
            return System.currentTimeMillis() - sharedPreferencesC8175.getLong(strM11557.concat("_time"), 0L) < 1800000;
        }
        return false;
    }
}
