package p362;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p026.RunnableC7015;
import p267.SharedPreferencesC9005;
import p303.AbstractC9234;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9667 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9924 f25288 = new C9924(AbstractC9234.m14531(1222), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ScheduledExecutorService f25287 = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f25286 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m15063(String str, ArrayList arrayList) {
        String str2 = AbstractC9234.m14531(1221) + str;
        C9924 c9924 = f25288;
        c9924.m15236(arrayList, str2);
        c9924.m15236(Long.valueOf(System.currentTimeMillis()), str2.concat(AbstractC9234.m14532("喵喵呜喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵")));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m15064(String str) {
        HashMap map = f25286;
        if (((ScheduledFuture) map.get(str)) != null) {
            return;
        }
        map.put(str, f25287.scheduleWithFixedDelay(new RunnableC7015(str, 3), 5L, 30L, TimeUnit.MINUTES));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m15065(String str) {
        String str2 = AbstractC9234.m14531(1221) + str;
        String strConcat = str2.concat(AbstractC9234.m14532("喵喵呜喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵"));
        C9924 c9924 = f25288;
        c9924.getClass();
        SharedPreferencesC9005 sharedPreferencesC9005 = c9924.f25834;
        if (sharedPreferencesC9005.contains(strConcat)) {
            return System.currentTimeMillis() - sharedPreferencesC9005.getLong(str2.concat(AbstractC9234.m14532("喵喵呜喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵")), 0L) < 1800000;
        }
        return false;
    }
}
