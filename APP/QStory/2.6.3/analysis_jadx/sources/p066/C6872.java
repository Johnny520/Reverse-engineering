package p066;

import java.util.Collection;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852;
import p052.InterfaceC6554;
import p079.AbstractC6986;
import p079.AbstractC6989;
import p232.C8065;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6872 implements InterfaceC4852 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C6872 f18313 = new C6872();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static InterfaceC4462 m12119(InterfaceC4481 interfaceC4481) {
        while (interfaceC4481 instanceof InterfaceC4480) {
            InterfaceC4480 interfaceC4480 = (InterfaceC4480) interfaceC4481;
            if (interfaceC4480.getKind() != CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionMo9030 = interfaceC4480.mo9030();
            collectionMo9030.getClass();
            interfaceC4481 = (InterfaceC4480) AbstractC4344.m8782(collectionMo9030);
            if (interfaceC4481 == null) {
                return null;
            }
        }
        return interfaceC4481.mo9026();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m12120(int i) {
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
    public boolean m12121(InterfaceC4463 interfaceC4463, InterfaceC4463 interfaceC44632, boolean z, InterfaceC6554 interfaceC6554) {
        interfaceC4463.getClass();
        interfaceC44632.getClass();
        if (interfaceC4463.equals(interfaceC44632)) {
            return true;
        }
        if (AbstractC4395.m8907(interfaceC4463.mo9028(), interfaceC44632.mo9028())) {
            return false;
        }
        InterfaceC4499 interfaceC4499Mo9028 = interfaceC4463.mo9028();
        InterfaceC4499 interfaceC4499Mo90282 = interfaceC44632.mo9028();
        return (((interfaceC4499Mo9028 instanceof InterfaceC4480) || (interfaceC4499Mo90282 instanceof InterfaceC4480)) ? ((Boolean) interfaceC6554.invoke(interfaceC4499Mo9028, interfaceC4499Mo90282)).booleanValue() : m12122(interfaceC4499Mo9028, interfaceC4499Mo90282, z)) && interfaceC4463.getIndex() == interfaceC44632.getIndex();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean m12122(InterfaceC4499 interfaceC4499, InterfaceC4499 interfaceC44992, boolean z) {
        if ((interfaceC4499 instanceof AbstractC6989) && (interfaceC44992 instanceof AbstractC6989)) {
            return AbstractC4395.m8907(((AbstractC6989) interfaceC4499).mo9001(), ((AbstractC6989) interfaceC44992).mo9001());
        }
        if ((interfaceC4499 instanceof InterfaceC4463) && (interfaceC44992 instanceof InterfaceC4463)) {
            return m12121((InterfaceC4463) interfaceC4499, (InterfaceC4463) interfaceC44992, z, C6874.f18316);
        }
        if (!(interfaceC4499 instanceof InterfaceC4481) || !(interfaceC44992 instanceof InterfaceC4481)) {
            return ((interfaceC4499 instanceof InterfaceC4466) && (interfaceC44992 instanceof InterfaceC4466)) ? AbstractC4395.m8907(((AbstractC6986) ((InterfaceC4466) interfaceC4499)).f18687, ((AbstractC6986) ((InterfaceC4466) interfaceC44992)).f18687) : AbstractC4395.m8907(interfaceC4499, interfaceC44992);
        }
        InterfaceC4481 interfaceC4481 = (InterfaceC4481) interfaceC4499;
        InterfaceC4481 interfaceC44812 = (InterfaceC4481) interfaceC44992;
        if (!interfaceC4481.equals(interfaceC44812)) {
            if (AbstractC4395.m8907(interfaceC4481.getName(), interfaceC44812.getName()) && ((!(interfaceC4481 instanceof InterfaceC4487) || !(interfaceC44812 instanceof InterfaceC4487) || ((InterfaceC4487) interfaceC4481).mo9008() == ((InterfaceC4487) interfaceC44812).mo9008()) && ((!AbstractC4395.m8907(interfaceC4481.mo9028(), interfaceC44812.mo9028()) || (z && AbstractC4395.m8907(m12119(interfaceC4481), m12119(interfaceC44812)))) && !AbstractC6870.m12108(interfaceC4481) && !AbstractC6870.m12108(interfaceC44812)))) {
                InterfaceC4499 interfaceC4499Mo9028 = interfaceC4481.mo9028();
                InterfaceC4499 interfaceC4499Mo90282 = interfaceC44812.mo9028();
                if (((interfaceC4499Mo9028 instanceof InterfaceC4480) || (interfaceC4499Mo90282 instanceof InterfaceC4480)) ? false : m12122(interfaceC4499Mo9028, interfaceC4499Mo90282, z)) {
                    C6877 c6877 = new C6877(new C8065(6, interfaceC4481, interfaceC44812, z));
                    OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12159 = c6877.m12152(interfaceC4481, interfaceC44812, null, true).m12159();
                    OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result = OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE;
                    if (overridingUtil$OverrideCompatibilityInfo$ResultM12159 != overridingUtil$OverrideCompatibilityInfo$Result || c6877.m12152(interfaceC44812, interfaceC4481, null, true).m12159() != overridingUtil$OverrideCompatibilityInfo$Result) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo9590(InterfaceC4873 interfaceC4873, InterfaceC4873 interfaceC48732) {
        if (interfaceC4873 == null) {
            m12120(0);
            throw null;
        }
        if (interfaceC48732 != null) {
            return interfaceC4873.equals(interfaceC48732);
        }
        m12120(1);
        throw null;
    }
}
