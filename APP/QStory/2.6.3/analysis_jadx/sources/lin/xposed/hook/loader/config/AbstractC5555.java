package lin.xposed.hook.loader.config;

import bsh.classpath.C2605;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.reader.C2700;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p024.AbstractC6309;
import p026.AbstractC6311;
import p026.AbstractC6314;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: lin.xposed.hook.loader.config.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Map f15321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m10890(AbstractC6311 abstractC6311) {
        if (AbstractC6358.m11943()) {
            if (f15321 == null) {
                f15321 = new HashMap();
            }
            for (AbstractC6314 abstractC6314 : AbstractC6309.f17424.values()) {
                if (abstractC6314 instanceof AbstractC6311) {
                    m10892(abstractC6314.getItemPath()).setEnabled(((AbstractC6311) abstractC6314).f17425);
                }
            }
            if (abstractC6311 != null) {
                m10892(abstractC6311.getItemPath()).setBypassDefaultLoad(Boolean.TRUE);
            }
            AbstractC5062.m10056(AbstractC3933.m8315().concat(AbstractC8405.m13972(778)), InterfaceC2916.m6375(f15321), false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m10891() {
        if (!new File(AbstractC3933.m8315().concat(AbstractC8405.m13972(778))).exists()) {
            m10890(null);
            AbstractC6185.m11592(AbstractC8405.m13972(779));
        }
        try {
            Map map = (Map) InterfaceC2916.m6370(AbstractC5062.m10028(AbstractC3933.m8315().concat(AbstractC8405.m13972(778))), new C5556(), new JSONReader$Feature[0]);
            f15321 = map;
            if (map == null || map.isEmpty()) {
                throw new RuntimeException(AbstractC8405.m13972(780));
            }
            AbstractC6309.f17424.values().forEach(new C2605(1));
        } catch (Exception e) {
            m10890(null);
            AbstractC6188.m11606(e);
            AbstractC6185.m11592(AbstractC8405.m13972(781) + e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static HookItemConfig m10892(String str) {
        return (HookItemConfig) f15321.computeIfAbsent(str, new C2700(12));
    }
}
