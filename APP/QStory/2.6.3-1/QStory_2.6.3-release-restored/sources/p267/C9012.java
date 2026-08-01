package p267;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9012 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f22894 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C5317 f22895;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22897;

    public C9012(String str, String str2) {
        if (str.isEmpty()) {
            C6755.m11869("path is empty");
            throw null;
        }
        if (str2.isEmpty()) {
            C6755.m11869("name is empty");
            throw null;
        }
        this.f22897 = str.endsWith("/") ? str : str.concat("/");
        this.f22896 = str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SharedPreferencesC9005 m14232() {
        SharedPreferencesC9005 sharedPreferencesC9005;
        String str = this.f22897 + this.f22896;
        ConcurrentHashMap concurrentHashMap = f22894;
        SharedPreferencesC9005 sharedPreferencesC90052 = (SharedPreferencesC9005) concurrentHashMap.get(str);
        if (sharedPreferencesC90052 != null) {
            return sharedPreferencesC90052;
        }
        synchronized (C9012.class) {
            try {
                sharedPreferencesC9005 = (SharedPreferencesC9005) concurrentHashMap.get(str);
                if (sharedPreferencesC9005 == null) {
                    SharedPreferencesC9005 sharedPreferencesC90053 = new SharedPreferencesC9005(this.f22897, this.f22896, null, this.f22895, 0);
                    concurrentHashMap.put(str, sharedPreferencesC90053);
                    sharedPreferencesC9005 = sharedPreferencesC90053;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferencesC9005;
    }
}
