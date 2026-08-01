package lin.xposed.hook.loader.config;

import bsh.classpath.C3438;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.reader.C3533;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p040.AbstractC7138;
import p042.AbstractC7140;
import p042.AbstractC7143;
import p052.AbstractC7187;
import p303.AbstractC9234;

/* JADX INFO: renamed from: lin.xposed.hook.loader.config.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6386 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Map f15666;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11449(AbstractC7140 abstractC7140) {
        if (AbstractC7187.m12502()) {
            if (f15666 == null) {
                f15666 = new HashMap();
            }
            for (AbstractC7143 abstractC7143 : AbstractC7138.f17769.values()) {
                if (abstractC7143 instanceof AbstractC7140) {
                    m11451(abstractC7143.getItemPath()).setEnabled(((AbstractC7140) abstractC7143).f17770);
                }
            }
            if (abstractC7140 != null) {
                m11451(abstractC7140.getItemPath()).setBypassDefaultLoad(Boolean.TRUE);
            }
            AbstractC5894.m10615(AbstractC4765.m8874().concat(AbstractC9234.m14531(778)), InterfaceC3749.m6935(f15666), false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11450() {
        if (!new File(AbstractC4765.m8874().concat(AbstractC9234.m14531(778))).exists()) {
            m11449(null);
            AbstractC7014.m12151(AbstractC9234.m14531(779));
        }
        try {
            Map map = (Map) InterfaceC3749.m6930(AbstractC5894.m10587(AbstractC4765.m8874().concat(AbstractC9234.m14531(778))), new C6387(), new JSONReader$Feature[0]);
            f15666 = map;
            if (map == null || map.isEmpty()) {
                throw new RuntimeException(AbstractC9234.m14531(780));
            }
            AbstractC7138.f17769.values().forEach(new C3438(1));
        } catch (Exception e) {
            m11449(null);
            AbstractC7017.m12165(e);
            AbstractC7014.m12151(AbstractC9234.m14531(781) + e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static HookItemConfig m11451(String str) {
        return (HookItemConfig) f15666.computeIfAbsent(str, new C3533(12));
    }
}
