package p251;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f22549 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4485 f22550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22552;

    public C8183(String str, String str2) {
        if (str.isEmpty()) {
            C5925.m11310("path is empty");
            throw null;
        }
        if (str2.isEmpty()) {
            C5925.m11310("name is empty");
            throw null;
        }
        this.f22552 = str.endsWith("/") ? str : str.concat("/");
        this.f22551 = str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SharedPreferencesC8176 m13673() {
        SharedPreferencesC8176 sharedPreferencesC8176;
        String str = this.f22552 + this.f22551;
        ConcurrentHashMap concurrentHashMap = f22549;
        SharedPreferencesC8176 sharedPreferencesC81762 = (SharedPreferencesC8176) concurrentHashMap.get(str);
        if (sharedPreferencesC81762 != null) {
            return sharedPreferencesC81762;
        }
        synchronized (C8183.class) {
            try {
                sharedPreferencesC8176 = (SharedPreferencesC8176) concurrentHashMap.get(str);
                if (sharedPreferencesC8176 == null) {
                    SharedPreferencesC8176 sharedPreferencesC81763 = new SharedPreferencesC8176(this.f22552, this.f22551, null, this.f22550, 0);
                    concurrentHashMap.put(str, sharedPreferencesC81763);
                    sharedPreferencesC8176 = sharedPreferencesC81763;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferencesC8176;
    }
}
