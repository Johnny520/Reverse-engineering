package p082;

import java.util.Collection;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5684;
import p068.InterfaceC7383;
import p095.AbstractC7815;
import p095.AbstractC7818;
import p248.C8894;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7701 implements InterfaceC5684 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7701 f18658 = new C7701();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static InterfaceC5294 m12678(InterfaceC5313 interfaceC5313) {
        while (interfaceC5313 instanceof InterfaceC5312) {
            InterfaceC5312 interfaceC5312 = (InterfaceC5312) interfaceC5313;
            if (interfaceC5312.getKind() != CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionMo9589 = interfaceC5312.mo9589();
            collectionMo9589.getClass();
            interfaceC5313 = (InterfaceC5312) AbstractC5176.m9341(collectionMo9589);
            if (interfaceC5313 == null) {
                return null;
            }
        }
        return interfaceC5313.mo9585();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m12679(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m12680(InterfaceC5295 interfaceC5295, InterfaceC5295 interfaceC52952, boolean z, InterfaceC7383 interfaceC7383) {
        interfaceC5295.getClass();
        interfaceC52952.getClass();
        if (interfaceC5295.equals(interfaceC52952)) {
            return true;
        }
        if (AbstractC5227.m9466(interfaceC5295.mo9587(), interfaceC52952.mo9587())) {
            return false;
        }
        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5295.mo9587();
        InterfaceC5331 interfaceC5331Mo95872 = interfaceC52952.mo9587();
        return (((interfaceC5331Mo9587 instanceof InterfaceC5312) || (interfaceC5331Mo95872 instanceof InterfaceC5312)) ? ((Boolean) interfaceC7383.invoke(interfaceC5331Mo9587, interfaceC5331Mo95872)).booleanValue() : m12681(interfaceC5331Mo9587, interfaceC5331Mo95872, z)) && interfaceC5295.getIndex() == interfaceC52952.getIndex();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean m12681(InterfaceC5331 interfaceC5331, InterfaceC5331 interfaceC53312, boolean z) {
        if ((interfaceC5331 instanceof AbstractC7818) && (interfaceC53312 instanceof AbstractC7818)) {
            return AbstractC5227.m9466(((AbstractC7818) interfaceC5331).mo9560(), ((AbstractC7818) interfaceC53312).mo9560());
        }
        if ((interfaceC5331 instanceof InterfaceC5295) && (interfaceC53312 instanceof InterfaceC5295)) {
            return m12680((InterfaceC5295) interfaceC5331, (InterfaceC5295) interfaceC53312, z, C7703.f18661);
        }
        if (!(interfaceC5331 instanceof InterfaceC5313) || !(interfaceC53312 instanceof InterfaceC5313)) {
            return ((interfaceC5331 instanceof InterfaceC5298) && (interfaceC53312 instanceof InterfaceC5298)) ? AbstractC5227.m9466(((AbstractC7815) ((InterfaceC5298) interfaceC5331)).f19032, ((AbstractC7815) ((InterfaceC5298) interfaceC53312)).f19032) : AbstractC5227.m9466(interfaceC5331, interfaceC53312);
        }
        InterfaceC5313 interfaceC5313 = (InterfaceC5313) interfaceC5331;
        InterfaceC5313 interfaceC53132 = (InterfaceC5313) interfaceC53312;
        if (!interfaceC5313.equals(interfaceC53132)) {
            if (AbstractC5227.m9466(interfaceC5313.getName(), interfaceC53132.getName()) && ((!(interfaceC5313 instanceof InterfaceC5319) || !(interfaceC53132 instanceof InterfaceC5319) || ((InterfaceC5319) interfaceC5313).mo9567() == ((InterfaceC5319) interfaceC53132).mo9567()) && ((!AbstractC5227.m9466(interfaceC5313.mo9587(), interfaceC53132.mo9587()) || (z && AbstractC5227.m9466(m12678(interfaceC5313), m12678(interfaceC53132)))) && !AbstractC7699.m12667(interfaceC5313) && !AbstractC7699.m12667(interfaceC53132)))) {
                InterfaceC5331 interfaceC5331Mo9587 = interfaceC5313.mo9587();
                InterfaceC5331 interfaceC5331Mo95872 = interfaceC53132.mo9587();
                if (((interfaceC5331Mo9587 instanceof InterfaceC5312) || (interfaceC5331Mo95872 instanceof InterfaceC5312)) ? false : m12681(interfaceC5331Mo9587, interfaceC5331Mo95872, z)) {
                    C7706 c7706 = new C7706(new C8894(6, interfaceC5313, interfaceC53132, z));
                    OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12718 = c7706.m12711(interfaceC5313, interfaceC53132, null, true).m12718();
                    OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result = OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE;
                    if (overridingUtil$OverrideCompatibilityInfo$ResultM12718 != overridingUtil$OverrideCompatibilityInfo$Result || c7706.m12711(interfaceC53132, interfaceC5313, null, true).m12718() != overridingUtil$OverrideCompatibilityInfo$Result) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5684
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo10149(InterfaceC5705 interfaceC5705, InterfaceC5705 interfaceC57052) {
        if (interfaceC5705 == null) {
            m12679(0);
            throw null;
        }
        if (interfaceC57052 != null) {
            return interfaceC5705.equals(interfaceC57052);
        }
        m12679(1);
        throw null;
    }
}
