package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import androidx.core.view.C2242;
import io.ktor.client.plugins.api.C3885;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C5166;
import kotlin.C5175;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4417;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4419;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4420;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4421;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4422;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4621;
import kotlin.reflect.jvm.internal.impl.load.java.C4609;
import kotlin.reflect.jvm.internal.impl.load.java.C4611;
import kotlin.reflect.jvm.internal.impl.load.java.C4618;
import kotlin.reflect.jvm.internal.impl.load.java.C4624;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4647;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4650;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4651;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4814;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4832;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4779;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.InterfaceC4841;
import kotlin.reflect.jvm.internal.impl.types.C4901;
import kotlin.reflect.jvm.internal.impl.types.checker.C4854;
import kotlin.reflect.jvm.internal.impl.types.checker.C4862;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4855;
import p045.C6466;
import p049.AbstractC6529;
import p049.C6532;
import p067.C6892;
import p070.C6897;
import p073.C6925;
import p076.C6964;
import p077.C6966;
import p077.C6967;
import p077.C6970;
import p079.C6987;
import p079.C7016;
import p080.C7023;
import p080.InterfaceC7020;
import p080.InterfaceC7022;
import p083.C7037;
import p083.C7039;
import p083.C7040;
import p084.C7047;
import p232.C8064;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f14604 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6966 m10055(Class cls) {
        C4844 c4844;
        InterfaceC7022 interfaceC7022M8977;
        InterfaceC7020 interfaceC7020M8977;
        cls.getClass();
        ClassLoader classLoaderM8984 = AbstractC4430.m8984(cls);
        C5065 c5065 = new C5065(classLoaderM8984);
        ConcurrentHashMap concurrentHashMap = f14604;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(c5065);
        if (weakReference != null) {
            C6966 c6966 = (C6966) weakReference.get();
            if (c6966 != null) {
                return c6966;
            }
            concurrentHashMap.remove(c5065, weakReference);
        }
        C4824 c4824 = C4824.f14062;
        int i = 0;
        C6970 c6970 = new C6970(classLoaderM8984, false);
        ClassLoader classLoader = C5175.class.getClassLoader();
        classLoader.getClass();
        C6970 c69702 = new C6970(classLoader, false);
        C6970 c69703 = new C6970(classLoaderM8984, false);
        C6967 c6967 = C6967.f18663;
        C6967 c69672 = C6967.f18662;
        C4844 c48442 = new C4844("DeserializationComponentsForJava.ModuleData");
        C4422 c4422 = new C4422(c48442, JvmBuiltIns$Kind.FROM_DEPENDENCIES);
        C6987 c6987 = new C6987(C4690.m9343("<" + ("runtime module for " + classLoaderM8984) + '>'), c48442, c4422, 56);
        InterfaceC4841 interfaceC4841 = c48442.f14123;
        interfaceC4841.lock();
        try {
            if (c4422.f17928 == null) {
                c4422.f17928 = c6987;
                interfaceC4841.unlock();
                c4422.f13034 = new C4420(c6987, i);
                C4650 c4650 = new C4650();
                C5851 c5851 = new C5851(9, false);
                C0325 c0325 = new C0325(c48442, c6987);
                C4651 c4651 = C4651.f13590;
                C5166 c5166 = new C5166(1, 9, 0);
                C4618 c4618 = AbstractC4621.f13524;
                C5166 c51662 = c4618.f13521;
                ReportLevel reportLevel = (c51662 == null || c51662.f14728 - c5166.f14728 > 0) ? c4618.f13522 : c4618.f13520;
                reportLevel.getClass();
                C8064 c8064 = new C8064(new C4611(reportLevel, reportLevel == ReportLevel.WARN ? null : reportLevel), new C1012(c5166, 6));
                C7047 c7047 = C7047.f18934;
                C7047 c70472 = C7047.f18936;
                EmptyList emptyList = EmptyList.INSTANCE;
                C3885 c3885 = new C3885(c48442, emptyList);
                C4460 c4460 = C4460.f13085;
                C6532 c6532 = new C6532(c6987, c0325);
                C4609 c4609 = new C4609(c8064);
                C7039 c7039 = C7039.f18893;
                C6925 c6925 = new C6925();
                InterfaceC4855.f14134.getClass();
                C4854 c4854 = C4862.f14145;
                C7037 c7037 = new C7037(new C7040(c48442, c69703, c6970, c4650, c7047, c6967, c70472, c3885, c69672, c5851, c4651, c4460, C6964.f18659, c6987, c6532, c4609, c6925, C4624.f13529, c7039, c4854, c8064, new C4651()));
                C6897 c6897 = C6897.f18361;
                c6897.getClass();
                C0076 c0076 = new C0076(c6970, 28, c4650);
                C4647 c4647 = new C4647(c6987, c0325, c48442, c6970);
                c4647.f13577 = c6897;
                List listM13660 = AbstractC8189.m13660(C4901.f14222);
                AbstractC6529 abstractC6529 = c6987.f18704;
                C4422 c44222 = abstractC6529 instanceof C4422 ? (C4422) abstractC6529 : null;
                C4651 c46512 = C4651.f13591;
                if (c44222 == null || (interfaceC7022M8977 = c44222.m8977()) == null) {
                    interfaceC7022M8977 = C7023.f18867;
                }
                if (c44222 == null || (interfaceC7020M8977 = c44222.m8977()) == null) {
                    interfaceC7020M8977 = C7023.f18865;
                }
                C5065 c50652 = c5065;
                C4832 c4832 = new C4832(c48442, c6987, c0076, c4647, c7037, c6967, c46512, emptyList, c0325, interfaceC7022M8977, interfaceC7020M8977, C6892.f18352, c4854, new C3885(c48442, emptyList), listM13660, c4824);
                c4650.f13588 = c4832;
                c5851.f16007 = new C5851(c7037, 8);
                C4419 c4419M8977 = c4422.m8977();
                C4419 c4419M89772 = c4422.m8977();
                C3885 c38852 = new C3885(c48442, emptyList);
                c4419M8977.getClass();
                c4419M89772.getClass();
                C4417 c4417 = new C4417(c48442, c69702, c6987);
                C2242 c2242 = new C2242(c4417, 23);
                C4779 c4779 = C4779.f13918;
                c4417.f13010 = new C4832(c48442, c6987, c2242, new C4814(c6987, c0325, c4779), c4417, AbstractC8189.m13659(new C6466(c48442, c6987), new C4421(c48442, c6987)), c0325, c4419M8977, c4419M89772, c4779.f19302, c4854, c38852, 262144);
                List listM8850 = AbstractC4346.m8850(new C6987[]{c6987});
                listM8850.getClass();
                EmptySet emptySet = EmptySet.INSTANCE;
                emptySet.getClass();
                c6987.f18708 = new C0108(listM8850, emptySet, emptyList, emptySet);
                c6987.f18705 = new C7016(AbstractC8189.m13659(c7037, c4417), "CompositeProvider@RuntimeModuleData for " + c6987);
                C6966 c69662 = new C6966(c4832, new C0108(c4650, c6970));
                while (true) {
                    C5065 c50653 = c50652;
                    WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(c50653, new WeakReference(c69662));
                    if (weakReference2 == null) {
                        return c69662;
                    }
                    C6966 c69663 = (C6966) weakReference2.get();
                    if (c69663 != null) {
                        return c69663;
                    }
                    concurrentHashMap.remove(c50653, weakReference2);
                    c50652 = c50653;
                }
            } else {
                c4844 = c48442;
                try {
                    throw new AssertionError("Built-ins module is already set: " + c4422.f17928 + " (attempting to reset to " + c6987 + ")");
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c4844 = c48442;
        }
        try {
            c4844.f14122.getClass();
            throw th;
        } catch (Throwable th3) {
            interfaceC4841.unlock();
            throw th3;
        }
    }
}
