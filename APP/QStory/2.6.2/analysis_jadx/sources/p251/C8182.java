package p251;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8182 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f22550 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4484 f22551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22553;

    public C8182(String str, String str2) {
        if (str == null || str.isEmpty()) {
            C5919.m11249("path is empty");
            throw null;
        }
        if (str2.isEmpty()) {
            C5919.m11249("name is empty");
            throw null;
        }
        this.f22553 = str.endsWith("/") ? str : str.concat("/");
        this.f22552 = str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SharedPreferencesC8175 m13649() {
        SharedPreferencesC8175 sharedPreferencesC8175;
        String str = this.f22553 + this.f22552;
        ConcurrentHashMap concurrentHashMap = f22550;
        SharedPreferencesC8175 sharedPreferencesC81752 = (SharedPreferencesC8175) concurrentHashMap.get(str);
        if (sharedPreferencesC81752 != null) {
            return sharedPreferencesC81752;
        }
        synchronized (C8182.class) {
            try {
                sharedPreferencesC8175 = (SharedPreferencesC8175) concurrentHashMap.get(str);
                if (sharedPreferencesC8175 == null) {
                    SharedPreferencesC8175 sharedPreferencesC81753 = new SharedPreferencesC8175(this.f22553, this.f22552, null, this.f22551, 0);
                    concurrentHashMap.put(str, sharedPreferencesC81753);
                    sharedPreferencesC8175 = sharedPreferencesC81753;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferencesC8175;
    }
}
