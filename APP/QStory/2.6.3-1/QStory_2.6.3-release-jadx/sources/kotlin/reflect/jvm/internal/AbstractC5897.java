package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.text.C1850;
import androidx.core.view.C3075;
import io.ktor.client.plugins.api.C4718;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C5999;
import kotlin.C6008;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5250;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5252;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5253;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5254;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5255;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5454;
import kotlin.reflect.jvm.internal.impl.load.java.C5442;
import kotlin.reflect.jvm.internal.impl.load.java.C5444;
import kotlin.reflect.jvm.internal.impl.load.java.C5451;
import kotlin.reflect.jvm.internal.impl.load.java.C5457;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5480;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5483;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5484;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5647;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5657;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5612;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.InterfaceC5674;
import kotlin.reflect.jvm.internal.impl.types.C5734;
import kotlin.reflect.jvm.internal.impl.types.checker.C5687;
import kotlin.reflect.jvm.internal.impl.types.checker.C5695;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5688;
import p050.AbstractC7176;
import p061.C7296;
import p065.AbstractC7359;
import p065.C7362;
import p083.C7722;
import p086.C7727;
import p089.C7755;
import p092.C7794;
import p093.C7796;
import p093.C7797;
import p093.C7800;
import p095.C7817;
import p095.C7846;
import p096.C7853;
import p096.InterfaceC7850;
import p096.InterfaceC7852;
import p099.C7867;
import p099.C7869;
import p099.C7870;
import p100.C7877;
import p248.C8894;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5897 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f14949 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7796 m10618(Class cls) {
        C5677 c5677;
        InterfaceC7852 interfaceC7852M9526;
        InterfaceC7850 interfaceC7850M9526;
        cls.getClass();
        ClassLoader classLoaderM9533 = AbstractC5263.m9533(cls);
        C5898 c5898 = new C5898(classLoaderM9533);
        ConcurrentHashMap concurrentHashMap = f14949;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(c5898);
        if (weakReference != null) {
            C7796 c7796 = (C7796) weakReference.get();
            if (c7796 != null) {
                return c7796;
            }
            concurrentHashMap.remove(c5898, weakReference);
        }
        C5657 c5657 = C5657.f14411;
        int i = 0;
        C7800 c7800 = new C7800(classLoaderM9533, false);
        ClassLoader classLoader = C6008.class.getClassLoader();
        classLoader.getClass();
        C7800 c78002 = new C7800(classLoader, false);
        C7800 c78003 = new C7800(classLoaderM9533, false);
        C7797 c7797 = C7797.f19003;
        C7797 c77972 = C7797.f19002;
        C5677 c56772 = new C5677("DeserializationComponentsForJava.ModuleData");
        C5255 c5255 = new C5255(c56772, JvmBuiltIns$Kind.FROM_DEPENDENCIES);
        C7817 c7817 = new C7817(C5523.m9892("<" + ("runtime module for " + classLoaderM9533) + '>'), c56772, c5255, 56);
        InterfaceC5674 interfaceC5674 = c56772.f14472;
        interfaceC5674.lock();
        try {
            if (c5255.f18269 == null) {
                c5255.f18269 = c7817;
                interfaceC5674.unlock();
                c5255.f13383 = new C5253(c7817, i);
                C5483 c5483 = new C5483();
                C6686 c6686 = new C6686(9, false);
                C1171 c1171 = new C1171(c56772, c7817);
                C5484 c5484 = C5484.f13939;
                C5999 c5999 = new C5999(1, 9, 0);
                C5451 c5451 = AbstractC5454.f13873;
                C5999 c59992 = c5451.f13870;
                ReportLevel reportLevel = (c59992 == null || c59992.f15073 - c5999.f15073 > 0) ? c5451.f13871 : c5451.f13869;
                reportLevel.getClass();
                C8894 c8894 = new C8894(new C5444(reportLevel, reportLevel == ReportLevel.WARN ? null : reportLevel), new C1850(c5999, 6));
                C7877 c7877 = C7877.f19274;
                C7877 c78772 = C7877.f19276;
                EmptyList emptyList = EmptyList.INSTANCE;
                C4718 c4718 = new C4718(c56772, emptyList);
                C5293 c5293 = C5293.f13434;
                C7362 c7362 = new C7362(c7817, c1171);
                C5442 c5442 = new C5442(c8894);
                C7869 c7869 = C7869.f19233;
                C7755 c7755 = new C7755();
                InterfaceC5688.f14483.getClass();
                C5687 c5687 = C5695.f14494;
                C7867 c7867 = new C7867(new C7870(c56772, c78003, c7800, c5483, c7877, c7797, c78772, c4718, c77972, c6686, c5484, c5293, C7794.f18999, c7817, c7362, c5442, c7755, C5457.f13878, c7869, c5687, c8894, new C5484()));
                C7727 c7727 = C7727.f18701;
                c7727.getClass();
                C0923 c0923 = new C0923(c7800, 28, c5483);
                C5480 c5480 = new C5480(c7817, c1171, c56772, c7800);
                c5480.f13926 = c7727;
                List listM12487 = AbstractC7176.m12487(C5734.f14571);
                AbstractC7359 abstractC7359 = c7817.f19044;
                C5255 c52552 = abstractC7359 instanceof C5255 ? (C5255) abstractC7359 : null;
                C5484 c54842 = C5484.f13940;
                if (c52552 == null || (interfaceC7852M9526 = c52552.m9526()) == null) {
                    interfaceC7852M9526 = C7853.f19207;
                }
                if (c52552 == null || (interfaceC7850M9526 = c52552.m9526()) == null) {
                    interfaceC7850M9526 = C7853.f19205;
                }
                C5898 c58982 = c5898;
                C5665 c5665 = new C5665(c56772, c7817, c0923, c5480, c7867, c7797, c54842, emptyList, c1171, interfaceC7852M9526, interfaceC7850M9526, C7722.f18692, c5687, new C4718(c56772, emptyList), listM12487, c5657);
                c5483.f13937 = c5665;
                c6686.f16359 = new C6686(c7867, 8);
                C5252 c5252M9526 = c5255.m9526();
                C5252 c5252M95262 = c5255.m9526();
                C4718 c47182 = new C4718(c56772, emptyList);
                c5252M9526.getClass();
                c5252M95262.getClass();
                C5250 c5250 = new C5250(c56772, c78002, c7817);
                C3075 c3075 = new C3075(c5250, 23);
                C5612 c5612 = C5612.f14267;
                c5250.f13359 = new C5665(c56772, c7817, c3075, new C5647(c7817, c1171, c5612), c5250, AbstractC7176.m12490(new C7296(c56772, c7817), new C5254(c56772, c7817)), c1171, c5252M9526, c5252M95262, c5612.f19642, c5687, c47182, 262144);
                List listM9405 = AbstractC5179.m9405(new C7817[]{c7817});
                listM9405.getClass();
                EmptySet emptySet = EmptySet.INSTANCE;
                emptySet.getClass();
                c7817.f19048 = new C0955(listM9405, emptySet, emptyList, emptySet);
                c7817.f19045 = new C7846(AbstractC7176.m12490(c7867, c5250), "CompositeProvider@RuntimeModuleData for " + c7817);
                C7796 c77962 = new C7796(c5665, new C0955(c5483, c7800));
                while (true) {
                    C5898 c58983 = c58982;
                    WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(c58983, new WeakReference(c77962));
                    if (weakReference2 == null) {
                        return c77962;
                    }
                    C7796 c77963 = (C7796) weakReference2.get();
                    if (c77963 != null) {
                        return c77963;
                    }
                    concurrentHashMap.remove(c58983, weakReference2);
                    c58982 = c58983;
                }
            } else {
                c5677 = c56772;
                try {
                    throw new AssertionError("Built-ins module is already set: " + c5255.f18269 + " (attempting to reset to " + c7817 + ")");
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c5677 = c56772;
        }
        try {
            c5677.f14471.getClass();
            throw th;
        } catch (Throwable th3) {
            interfaceC5674.unlock();
            throw th3;
        }
    }
}
