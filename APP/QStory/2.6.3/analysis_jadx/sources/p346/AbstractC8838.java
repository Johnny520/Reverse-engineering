package p346;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p010.RunnableC6186;
import p251.SharedPreferencesC8176;
import p287.AbstractC8405;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8838 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9095 f24943 = new C9095(AbstractC8405.m13972(1222), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ScheduledExecutorService f24942 = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f24941 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14504(String str, ArrayList arrayList) {
        String str2 = AbstractC8405.m13972(1221) + str;
        C9095 c9095 = f24943;
        c9095.m14677(arrayList, str2);
        c9095.m14677(Long.valueOf(System.currentTimeMillis()), str2.concat(AbstractC8405.m13973("喵喵呜喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵")));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14505(String str) {
        HashMap map = f24941;
        if (((ScheduledFuture) map.get(str)) != null) {
            return;
        }
        map.put(str, f24942.scheduleWithFixedDelay(new RunnableC6186(str, 3), 5L, 30L, TimeUnit.MINUTES));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m14506(String str) {
        String str2 = AbstractC8405.m13972(1221) + str;
        String strConcat = str2.concat(AbstractC8405.m13973("喵喵呜喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵"));
        C9095 c9095 = f24943;
        c9095.getClass();
        SharedPreferencesC8176 sharedPreferencesC8176 = c9095.f25489;
        if (sharedPreferencesC8176.contains(strConcat)) {
            return System.currentTimeMillis() - sharedPreferencesC8176.getLong(str2.concat(AbstractC8405.m13973("喵喵呜喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵")), 0L) < 1800000;
        }
        return false;
    }
}
