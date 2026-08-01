package p084;

import androidx.compose.foundation.text.C1012;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4827;
import p066.AbstractC6875;
import p066.C6876;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7046 extends AbstractC6875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f18931;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashSet f18932;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4827 f18933;

    public C7046(InterfaceC4827 interfaceC4827, LinkedHashSet linkedHashSet, boolean z) {
        this.f18933 = interfaceC4827;
        this.f18932 = linkedHashSet;
        this.f18931 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12350(int i) {
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

    @Override // p066.AbstractC6875
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9547(InterfaceC4479 interfaceC4479, InterfaceC4479 interfaceC44792) {
        if (interfaceC44792 != null) {
            return;
        }
        m12350(2);
        throw null;
    }

    @Override // p066.AbstractC6875
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9548(InterfaceC4479 interfaceC4479) {
        if (interfaceC4479 == null) {
            m12350(0);
            throw null;
        }
        C6876.m12115(interfaceC4479, new C1012(this, 29));
        this.f18932.add(interfaceC4479);
    }

    @Override // p066.AbstractC6875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo12107(InterfaceC4479 interfaceC4479, Collection collection) {
        if (interfaceC4479 == null) {
            m12350(3);
            throw null;
        }
        if (!this.f18931 || interfaceC4479.getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
            interfaceC4479.mo9041(collection);
        }
    }
}
