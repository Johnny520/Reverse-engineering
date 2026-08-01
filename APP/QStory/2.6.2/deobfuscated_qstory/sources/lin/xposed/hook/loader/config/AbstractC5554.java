package lin.xposed.hook.loader.config;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import bsh.classpath.C2604;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.reader.C2699;
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p024.AbstractC6291;
import p026.AbstractC6293;
import p026.AbstractC6296;
import p035.AbstractC6340;

/* JADX INFO: renamed from: lin.xposed.hook.loader.config.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Map f15321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m10833(AbstractC6293 abstractC6293) {
        if (AbstractC6340.m11895()) {
            if (f15321 == null) {
                f15321 = new HashMap();
            }
            for (AbstractC6296 abstractC6296 : AbstractC6291.f17375.values()) {
                if (abstractC6296 instanceof AbstractC6293) {
                    m10835(abstractC6296.getItemPath()).setEnabled(((AbstractC6293) abstractC6296).f17376);
                }
            }
            if (abstractC6293 != null) {
                m10835(abstractC6293.getItemPath()).setBypassDefaultLoad(Boolean.TRUE);
            }
            AbstractC0455.m1145(AbstractC3932.m8313().concat("/data/item_config.json"), InterfaceC2915.m6317(f15321), false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m10834() {
        if (!new File(AbstractC3932.m8313().concat("/data/item_config.json")).exists()) {
            m10833(null);
            AbstractC6154.m11561("\u914d\u7f6e\u6587\u4ef6\u5df2\u751f\u6210");
        }
        try {
            Map map = (Map) InterfaceC2915.m6312(AbstractC0455.m1142(AbstractC3932.m8313().concat("/data/item_config.json")), new C5555(), new JSONReader$Feature[0]);
            f15321 = map;
            if (map == null || map.isEmpty()) {
                throw new RuntimeException("config read error");
            }
            AbstractC6291.f17375.values().forEach(new C2604(1));
        } catch (Exception e) {
            m10833(null);
            AbstractC6157.m11575(e);
            AbstractC6154.m11561("[QStory]\u52a0\u8f7d\u8bbe\u7f6e\u5931\u8d25qwq " + e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static HookItemConfig m10835(String str) {
        return (HookItemConfig) f15321.computeIfAbsent(str, new C2699(12));
    }
}
