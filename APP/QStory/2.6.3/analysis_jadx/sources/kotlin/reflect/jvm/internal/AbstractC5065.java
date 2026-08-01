package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import androidx.core.view.C2242;
import io.ktor.client.plugins.api.C3886;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C5167;
import kotlin.C5176;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4418;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4420;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4421;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4422;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4423;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4622;
import kotlin.reflect.jvm.internal.impl.load.java.C4610;
import kotlin.reflect.jvm.internal.impl.load.java.C4612;
import kotlin.reflect.jvm.internal.impl.load.java.C4619;
import kotlin.reflect.jvm.internal.impl.load.java.C4625;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4648;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4651;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4652;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4815;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4825;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4833;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4780;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.InterfaceC4842;
import kotlin.reflect.jvm.internal.impl.types.C4902;
import kotlin.reflect.jvm.internal.impl.types.checker.C4855;
import kotlin.reflect.jvm.internal.impl.types.checker.C4863;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4856;
import p034.AbstractC6347;
import p045.C6467;
import p049.AbstractC6530;
import p049.C6533;
import p067.C6893;
import p070.C6898;
import p073.C6926;
import p076.C6965;
import p077.C6967;
import p077.C6968;
import p077.C6971;
import p079.C6988;
import p079.C7017;
import p080.C7024;
import p080.InterfaceC7021;
import p080.InterfaceC7023;
import p083.C7038;
import p083.C7040;
import p083.C7041;
import p084.C7048;
import p232.C8065;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f14604 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6967 m10059(Class cls) {
        C4845 c4845;
        InterfaceC7023 interfaceC7023M8967;
        InterfaceC7021 interfaceC7021M8967;
        cls.getClass();
        ClassLoader classLoaderM8974 = AbstractC4431.m8974(cls);
        C5066 c5066 = new C5066(classLoaderM8974);
        ConcurrentHashMap concurrentHashMap = f14604;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(c5066);
        if (weakReference != null) {
            C6967 c6967 = (C6967) weakReference.get();
            if (c6967 != null) {
                return c6967;
            }
            concurrentHashMap.remove(c5066, weakReference);
        }
        C4825 c4825 = C4825.f14066;
        int i = 0;
        C6971 c6971 = new C6971(classLoaderM8974, false);
        ClassLoader classLoader = C5176.class.getClassLoader();
        classLoader.getClass();
        C6971 c69712 = new C6971(classLoader, false);
        C6971 c69713 = new C6971(classLoaderM8974, false);
        C6968 c6968 = C6968.f18658;
        C6968 c69682 = C6968.f18657;
        C4845 c48452 = new C4845("DeserializationComponentsForJava.ModuleData");
        C4423 c4423 = new C4423(c48452, JvmBuiltIns$Kind.FROM_DEPENDENCIES);
        C6988 c6988 = new C6988(C4691.m9333("<" + ("runtime module for " + classLoaderM8974) + '>'), c48452, c4423, 56);
        InterfaceC4842 interfaceC4842 = c48452.f14127;
        interfaceC4842.lock();
        try {
            if (c4423.f17924 == null) {
                c4423.f17924 = c6988;
                interfaceC4842.unlock();
                c4423.f13038 = new C4421(c6988, i);
                C4651 c4651 = new C4651();
                C5856 c5856 = new C5856(9, false);
                C0325 c0325 = new C0325(c48452, c6988);
                C4652 c4652 = C4652.f13594;
                C5167 c5167 = new C5167(1, 9, 0);
                C4619 c4619 = AbstractC4622.f13528;
                C5167 c51672 = c4619.f13525;
                ReportLevel reportLevel = (c51672 == null || c51672.f14728 - c5167.f14728 > 0) ? c4619.f13526 : c4619.f13524;
                reportLevel.getClass();
                C8065 c8065 = new C8065(new C4612(reportLevel, reportLevel == ReportLevel.WARN ? null : reportLevel), new C1012(c5167, 6));
                C7048 c7048 = C7048.f18929;
                C7048 c70482 = C7048.f18931;
                EmptyList emptyList = EmptyList.INSTANCE;
                C3886 c3886 = new C3886(c48452, emptyList);
                C4461 c4461 = C4461.f13089;
                C6533 c6533 = new C6533(c6988, c0325);
                C4610 c4610 = new C4610(c8065);
                C7040 c7040 = C7040.f18888;
                C6926 c6926 = new C6926();
                InterfaceC4856.f14138.getClass();
                C4855 c4855 = C4863.f14149;
                C7038 c7038 = new C7038(new C7041(c48452, c69713, c6971, c4651, c7048, c6968, c70482, c3886, c69682, c5856, c4652, c4461, C6965.f18654, c6988, c6533, c4610, c6926, C4625.f13533, c7040, c4855, c8065, new C4652()));
                C6898 c6898 = C6898.f18356;
                c6898.getClass();
                C0076 c0076 = new C0076(c6971, 28, c4651);
                C4648 c4648 = new C4648(c6988, c0325, c48452, c6971);
                c4648.f13581 = c6898;
                List listM11928 = AbstractC6347.m11928(C4902.f14226);
                AbstractC6530 abstractC6530 = c6988.f18699;
                C4423 c44232 = abstractC6530 instanceof C4423 ? (C4423) abstractC6530 : null;
                C4652 c46522 = C4652.f13595;
                if (c44232 == null || (interfaceC7023M8967 = c44232.m8967()) == null) {
                    interfaceC7023M8967 = C7024.f18862;
                }
                if (c44232 == null || (interfaceC7021M8967 = c44232.m8967()) == null) {
                    interfaceC7021M8967 = C7024.f18860;
                }
                C5066 c50662 = c5066;
                C4833 c4833 = new C4833(c48452, c6988, c0076, c4648, c7038, c6968, c46522, emptyList, c0325, interfaceC7023M8967, interfaceC7021M8967, C6893.f18347, c4855, new C3886(c48452, emptyList), listM11928, c4825);
                c4651.f13592 = c4833;
                c5856.f16014 = new C5856(c7038, 8);
                C4420 c4420M8967 = c4423.m8967();
                C4420 c4420M89672 = c4423.m8967();
                C3886 c38862 = new C3886(c48452, emptyList);
                c4420M8967.getClass();
                c4420M89672.getClass();
                C4418 c4418 = new C4418(c48452, c69712, c6988);
                C2242 c2242 = new C2242(c4418, 23);
                C4780 c4780 = C4780.f13922;
                c4418.f13014 = new C4833(c48452, c6988, c2242, new C4815(c6988, c0325, c4780), c4418, AbstractC6347.m11931(new C6467(c48452, c6988), new C4422(c48452, c6988)), c0325, c4420M8967, c4420M89672, c4780.f19297, c4855, c38862, 262144);
                List listM8846 = AbstractC4347.m8846(new C6988[]{c6988});
                listM8846.getClass();
                EmptySet emptySet = EmptySet.INSTANCE;
                emptySet.getClass();
                c6988.f18703 = new C0108(listM8846, emptySet, emptyList, emptySet);
                c6988.f18700 = new C7017(AbstractC6347.m11931(c7038, c4418), "CompositeProvider@RuntimeModuleData for " + c6988);
                C6967 c69672 = new C6967(c4833, new C0108(c4651, c6971));
                while (true) {
                    C5066 c50663 = c50662;
                    WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(c50663, new WeakReference(c69672));
                    if (weakReference2 == null) {
                        return c69672;
                    }
                    C6967 c69673 = (C6967) weakReference2.get();
                    if (c69673 != null) {
                        return c69673;
                    }
                    concurrentHashMap.remove(c50663, weakReference2);
                    c50662 = c50663;
                }
            } else {
                c4845 = c48452;
                try {
                    throw new AssertionError("Built-ins module is already set: " + c4423.f17924 + " (attempting to reset to " + c6988 + ")");
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c4845 = c48452;
        }
        try {
            c4845.f14126.getClass();
            throw th;
        } catch (Throwable th3) {
            interfaceC4842.unlock();
            throw th3;
        }
    }
}
