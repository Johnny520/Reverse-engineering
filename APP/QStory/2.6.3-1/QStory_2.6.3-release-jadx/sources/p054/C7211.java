package p054;

import com.bumptech.glide.AbstractC3888;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import java.util.HashMap;
import p042.AbstractC7145;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7211 extends AbstractC7145 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC3888.m7256()) {
            C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(137));
            c7164M12412.f17803.f3963 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
            c7164M12412.f17803.f3964 = new Class[]{Long.TYPE, AbstractC7166.m12425(AbstractC9234.m14531(133)), ArrayList.class, HashMap.class, AbstractC7166.m12425(AbstractC9234.m14531(136))};
            XposedBridge.hookMethod(c7164M12412.m12414(), new C7202(3));
        }
    }
}
