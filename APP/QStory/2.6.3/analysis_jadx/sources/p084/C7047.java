package p084;

import androidx.compose.foundation.text.C1012;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4828;
import p066.AbstractC6876;
import p066.C6877;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7047 extends AbstractC6876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f18926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashSet f18927;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4828 f18928;

    public C7047(InterfaceC4828 interfaceC4828, LinkedHashSet linkedHashSet, boolean z) {
        this.f18928 = interfaceC4828;
        this.f18927 = linkedHashSet;
        this.f18926 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12377(int i) {
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

    @Override // p066.AbstractC6876
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9537(InterfaceC4480 interfaceC4480, InterfaceC4480 interfaceC44802) {
        if (interfaceC44802 != null) {
            return;
        }
        m12377(2);
        throw null;
    }

    @Override // p066.AbstractC6876
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9538(InterfaceC4480 interfaceC4480) {
        if (interfaceC4480 == null) {
            m12377(0);
            throw null;
        }
        C6877.m12143(interfaceC4480, new C1012(this, 29));
        this.f18927.add(interfaceC4480);
    }

    @Override // p066.AbstractC6876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo12135(InterfaceC4480 interfaceC4480, Collection collection) {
        if (interfaceC4480 == null) {
            m12377(3);
            throw null;
        }
        if (!this.f18926 || interfaceC4480.getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
            interfaceC4480.mo9031(collection);
        }
    }
}
