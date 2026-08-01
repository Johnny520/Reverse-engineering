package top.suzhelan.qstory.loader;

import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.C3070;
import java.util.Collection;
import lin.xposed.hook.loader.config.AbstractC5555;
import p024.AbstractC6308;
import p024.AbstractC6309;
import p026.AbstractC6311;
import p026.AbstractC6314;
import p027.InterfaceC6317;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class CoreLoader {
    public static void collectHookItemException(Object obj, Throwable th) {
        ((AbstractC6314) obj).getExceptionCollectionToolInstance().m11832(th);
    }

    public static Collection<AbstractC6314> getHookItems() {
        return AbstractC6309.f17424.values();
    }

    public static boolean isEnabled(Object obj) {
        return ((AbstractC6311) obj).f17425.booleanValue();
    }

    public static boolean isLoadedByDefault(Object obj) {
        return ((AbstractC6314) obj).isLoadedByDefault();
    }

    public static boolean isMethodCacheReady() {
        return AbstractC6309.m11829();
    }

    public static boolean isSwitchHookItem(Object obj) {
        return obj instanceof AbstractC6311;
    }

    public static void loadHookItemConfig() {
        AbstractC5555.m10891();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void scanMethodCache() {
        JSONObject jSONObjectM6374 = InterfaceC2916.m6374(AbstractC6308.f17420.m14678(AbstractC8405.m13972(769), AbstractC8405.m13973("喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵喵")));
        for (AbstractC6314 abstractC6314 : AbstractC6309.f17424.values()) {
            if (abstractC6314 instanceof InterfaceC6317) {
                InterfaceC6317 interfaceC6317 = (InterfaceC6317) abstractC6314;
                try {
                    if (jSONObjectM6374.containsKey(abstractC6314.getItemPath())) {
                        JSONObject jSONObject = jSONObjectM6374.getJSONObject(abstractC6314.getItemPath());
                        C3070 c3070 = new C3070(2);
                        c3070.m6888(jSONObject);
                        interfaceC6317.mo11236(c3070);
                    }
                } catch (Exception e) {
                    abstractC6314.getExceptionCollectionToolInstance().m11832(e);
                }
            }
        }
    }

    public static void startLoadHook(Object obj) {
        ((AbstractC6314) obj).startLoadHook();
    }
}
