package top.suzhelan.qstory.loader;

import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.C3902;
import java.util.Collection;
import lin.xposed.hook.loader.config.AbstractC6386;
import p040.AbstractC7137;
import p040.AbstractC7138;
import p042.AbstractC7140;
import p042.AbstractC7143;
import p043.InterfaceC7146;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class CoreLoader {
    public static void collectHookItemException(Object obj, Throwable th) {
        ((AbstractC7143) obj).getExceptionCollectionToolInstance().m12391(th);
    }

    public static Collection<AbstractC7143> getHookItems() {
        return AbstractC7138.f17769.values();
    }

    public static boolean isEnabled(Object obj) {
        return ((AbstractC7140) obj).f17770.booleanValue();
    }

    public static boolean isLoadedByDefault(Object obj) {
        return ((AbstractC7143) obj).isLoadedByDefault();
    }

    public static boolean isMethodCacheReady() {
        return AbstractC7138.m12388();
    }

    public static boolean isSwitchHookItem(Object obj) {
        return obj instanceof AbstractC7140;
    }

    public static void loadHookItemConfig() {
        AbstractC6386.m11450();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void scanMethodCache() {
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(AbstractC7137.f17765.m15237(AbstractC9234.m14531(769), AbstractC9234.m14532("喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵喵")));
        for (AbstractC7143 abstractC7143 : AbstractC7138.f17769.values()) {
            if (abstractC7143 instanceof InterfaceC7146) {
                InterfaceC7146 interfaceC7146 = (InterfaceC7146) abstractC7143;
                try {
                    if (jSONObjectM6934.containsKey(abstractC7143.getItemPath())) {
                        JSONObject jSONObject = jSONObjectM6934.getJSONObject(abstractC7143.getItemPath());
                        C3902 c3902 = new C3902(2);
                        c3902.m7448(jSONObject);
                        interfaceC7146.mo11795(c3902);
                    }
                } catch (Exception e) {
                    abstractC7143.getExceptionCollectionToolInstance().m12391(e);
                }
            }
        }
    }

    public static void startLoadHook(Object obj) {
        ((AbstractC7143) obj).startLoadHook();
    }
}
