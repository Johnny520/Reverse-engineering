package p100;

import androidx.compose.foundation.text.C1850;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5660;
import p082.AbstractC7705;
import p082.C7706;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7876 extends AbstractC7705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f19271;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashSet f19272;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5660 f19273;

    public C7876(InterfaceC5660 interfaceC5660, LinkedHashSet linkedHashSet, boolean z) {
        this.f19273 = interfaceC5660;
        this.f19272 = linkedHashSet;
        this.f19271 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12936(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p082.AbstractC7705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo10096(InterfaceC5312 interfaceC5312, InterfaceC5312 interfaceC53122) {
        if (interfaceC53122 != null) {
            return;
        }
        m12936(2);
        throw null;
    }

    @Override // p082.AbstractC7705
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10097(InterfaceC5312 interfaceC5312) {
        if (interfaceC5312 == null) {
            m12936(0);
            throw null;
        }
        C7706.m12702(interfaceC5312, new C1850(this, 29));
        this.f19272.add(interfaceC5312);
    }

    @Override // p082.AbstractC7705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo12694(InterfaceC5312 interfaceC5312, Collection collection) {
        if (interfaceC5312 == null) {
            m12936(3);
            throw null;
        }
        if (!this.f19271 || interfaceC5312.getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
            interfaceC5312.mo9590(collection);
        }
    }
}
