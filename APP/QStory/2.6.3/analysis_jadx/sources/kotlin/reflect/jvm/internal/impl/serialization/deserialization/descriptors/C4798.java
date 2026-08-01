package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.C4493;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import p066.AbstractC6876;
import p066.C6877;
import p079.AbstractC7002;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4798 extends AbstractC6876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractCollection f13986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f13987;

    public /* synthetic */ C4798(AbstractCollection abstractCollection, int i) {
        this.f13987 = i;
        this.f13986 = abstractCollection;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9536(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p066.AbstractC6876
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo9537(InterfaceC4480 interfaceC4480, InterfaceC4480 interfaceC44802) {
        switch (this.f13987) {
            case 0:
                interfaceC44802.getClass();
                if (interfaceC44802 instanceof AbstractC7002) {
                    ((AbstractC7002) interfaceC44802).m12335(C4493.f13133, interfaceC4480);
                    return;
                }
                return;
            default:
                if (interfaceC44802 != null) {
                    return;
                }
                m9536(2);
                throw null;
        }
    }

    @Override // p066.AbstractC6876
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo9538(InterfaceC4480 interfaceC4480) {
        int i = this.f13987;
        AbstractCollection abstractCollection = this.f13986;
        switch (i) {
            case 0:
                interfaceC4480.getClass();
                C6877.m12143(interfaceC4480, null);
                ((ArrayList) abstractCollection).add(interfaceC4480);
                return;
            default:
                if (interfaceC4480 == null) {
                    m9536(0);
                    throw null;
                }
                C6877.m12143(interfaceC4480, null);
                ((LinkedHashSet) abstractCollection).add(interfaceC4480);
                return;
        }
    }
}
