package p066;

import java.util.Collection;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4851;
import p052.InterfaceC6553;
import p079.AbstractC6985;
import p079.AbstractC6988;
import p232.C8064;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6871 implements InterfaceC4851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C6871 f18318 = new C6871();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static InterfaceC4461 m12091(InterfaceC4480 interfaceC4480) {
        while (interfaceC4480 instanceof InterfaceC4479) {
            InterfaceC4479 interfaceC4479 = (InterfaceC4479) interfaceC4480;
            if (interfaceC4479.getKind() != CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionMo9040 = interfaceC4479.mo9040();
            collectionMo9040.getClass();
            interfaceC4480 = (InterfaceC4479) AbstractC4343.m8819(collectionMo9040);
            if (interfaceC4480 == null) {
                return null;
            }
        }
        return interfaceC4480.mo9036();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m12092(int i) {
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
    public boolean m12093(InterfaceC4462 interfaceC4462, InterfaceC4462 interfaceC44622, boolean z, InterfaceC6553 interfaceC6553) {
        interfaceC4462.getClass();
        interfaceC44622.getClass();
        if (interfaceC4462.equals(interfaceC44622)) {
            return true;
        }
        if (AbstractC4394.m8917(interfaceC4462.mo9038(), interfaceC44622.mo9038())) {
            return false;
        }
        InterfaceC4498 interfaceC4498Mo9038 = interfaceC4462.mo9038();
        InterfaceC4498 interfaceC4498Mo90382 = interfaceC44622.mo9038();
        return (((interfaceC4498Mo9038 instanceof InterfaceC4479) || (interfaceC4498Mo90382 instanceof InterfaceC4479)) ? ((Boolean) interfaceC6553.invoke(interfaceC4498Mo9038, interfaceC4498Mo90382)).booleanValue() : m12094(interfaceC4498Mo9038, interfaceC4498Mo90382, z)) && interfaceC4462.getIndex() == interfaceC44622.getIndex();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean m12094(InterfaceC4498 interfaceC4498, InterfaceC4498 interfaceC44982, boolean z) {
        if ((interfaceC4498 instanceof AbstractC6988) && (interfaceC44982 instanceof AbstractC6988)) {
            return AbstractC4394.m8917(((AbstractC6988) interfaceC4498).mo9011(), ((AbstractC6988) interfaceC44982).mo9011());
        }
        if ((interfaceC4498 instanceof InterfaceC4462) && (interfaceC44982 instanceof InterfaceC4462)) {
            return m12093((InterfaceC4462) interfaceC4498, (InterfaceC4462) interfaceC44982, z, C6873.f18321);
        }
        if (!(interfaceC4498 instanceof InterfaceC4480) || !(interfaceC44982 instanceof InterfaceC4480)) {
            return ((interfaceC4498 instanceof InterfaceC4465) && (interfaceC44982 instanceof InterfaceC4465)) ? AbstractC4394.m8917(((AbstractC6985) ((InterfaceC4465) interfaceC4498)).f18692, ((AbstractC6985) ((InterfaceC4465) interfaceC44982)).f18692) : AbstractC4394.m8917(interfaceC4498, interfaceC44982);
        }
        InterfaceC4480 interfaceC4480 = (InterfaceC4480) interfaceC4498;
        InterfaceC4480 interfaceC44802 = (InterfaceC4480) interfaceC44982;
        if (!interfaceC4480.equals(interfaceC44802)) {
            if (AbstractC4394.m8917(interfaceC4480.getName(), interfaceC44802.getName()) && ((!(interfaceC4480 instanceof InterfaceC4486) || !(interfaceC44802 instanceof InterfaceC4486) || ((InterfaceC4486) interfaceC4480).mo9018() == ((InterfaceC4486) interfaceC44802).mo9018()) && ((!AbstractC4394.m8917(interfaceC4480.mo9038(), interfaceC44802.mo9038()) || (z && AbstractC4394.m8917(m12091(interfaceC4480), m12091(interfaceC44802)))) && !AbstractC6869.m12080(interfaceC4480) && !AbstractC6869.m12080(interfaceC44802)))) {
                InterfaceC4498 interfaceC4498Mo9038 = interfaceC4480.mo9038();
                InterfaceC4498 interfaceC4498Mo90382 = interfaceC44802.mo9038();
                if (((interfaceC4498Mo9038 instanceof InterfaceC4479) || (interfaceC4498Mo90382 instanceof InterfaceC4479)) ? false : m12094(interfaceC4498Mo9038, interfaceC4498Mo90382, z)) {
                    C6876 c6876 = new C6876(new C8064(6, interfaceC4480, interfaceC44802, z));
                    OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12131 = c6876.m12124(interfaceC4480, interfaceC44802, null, true).m12131();
                    OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result = OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE;
                    if (overridingUtil$OverrideCompatibilityInfo$ResultM12131 != overridingUtil$OverrideCompatibilityInfo$Result || c6876.m12124(interfaceC44802, interfaceC4480, null, true).m12131() != overridingUtil$OverrideCompatibilityInfo$Result) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo9600(InterfaceC4872 interfaceC4872, InterfaceC4872 interfaceC48722) {
        if (interfaceC4872 == null) {
            m12092(0);
            throw null;
        }
        if (interfaceC48722 != null) {
            return interfaceC4872.equals(interfaceC48722);
        }
        m12092(1);
        throw null;
    }
}
