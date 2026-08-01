package top.suzhelan.qstory.loader;

import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import java.util.Collection;
import lin.xposed.hook.loader.config.AbstractC5554;
import p009.InterfaceC6152;
import p024.AbstractC6290;
import p024.AbstractC6291;
import p026.AbstractC6293;
import p026.AbstractC6296;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class CoreLoader {
    public static void collectHookItemException(Object obj, Throwable th) {
        ((AbstractC6296) obj).getExceptionCollectionToolInstance().m11804(th);
    }

    public static Collection<AbstractC6296> getHookItems() {
        return AbstractC6291.f17375.values();
    }

    public static boolean isEnabled(Object obj) {
        return ((AbstractC6293) obj).f17376.booleanValue();
    }

    public static boolean isLoadedByDefault(Object obj) {
        return ((AbstractC6296) obj).isLoadedByDefault();
    }

    public static boolean isMethodCacheReady() {
        return AbstractC6291.m11801();
    }

    public static boolean isSwitchHookItem(Object obj) {
        return obj instanceof AbstractC6293;
    }

    public static void loadHookItemConfig() {
        AbstractC5554.m10834();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void scanMethodCache() {
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(AbstractC6290.f17371.m14641(AbstractC3056.m6668(-3937638231944988071L), AbstractC3056.m6668(-3937603683228059047L)));
        for (AbstractC6296 abstractC6296 : AbstractC6291.f17375.values()) {
            if (abstractC6296 instanceof InterfaceC6152) {
                InterfaceC6152 interfaceC6152 = (InterfaceC6152) abstractC6296;
                try {
                    if (jSONObjectM6316.containsKey(abstractC6296.getItemPath())) {
                        JSONObject jSONObject = jSONObjectM6316.getJSONObject(abstractC6296.getItemPath());
                        C3069 c3069 = new C3069(2);
                        c3069.m6901(jSONObject);
                        interfaceC6152.mo11179(c3069);
                    }
                } catch (Exception e) {
                    abstractC6296.getExceptionCollectionToolInstance().m11804(e);
                }
            }
        }
    }

    public static void startLoadHook(Object obj) {
        ((AbstractC6296) obj).startLoadHook();
    }
}
