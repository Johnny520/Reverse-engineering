package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.C4492;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import p066.AbstractC6875;
import p066.C6876;
import p079.AbstractC7001;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4797 extends AbstractC6875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractCollection f13982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f13983;

    public /* synthetic */ C4797(AbstractCollection abstractCollection, int i) {
        this.f13983 = i;
        this.f13982 = abstractCollection;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9546(int i) {
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

    @Override // p066.AbstractC6875
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo9547(InterfaceC4479 interfaceC4479, InterfaceC4479 interfaceC44792) {
        switch (this.f13983) {
            case 0:
                interfaceC44792.getClass();
                if (interfaceC44792 instanceof AbstractC7001) {
                    ((AbstractC7001) interfaceC44792).m12308(C4492.f13129, interfaceC4479);
                    return;
                }
                return;
            default:
                if (interfaceC44792 != null) {
                    return;
                }
                m9546(2);
                throw null;
        }
    }

    @Override // p066.AbstractC6875
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo9548(InterfaceC4479 interfaceC4479) {
        int i = this.f13983;
        AbstractCollection abstractCollection = this.f13982;
        switch (i) {
            case 0:
                interfaceC4479.getClass();
                C6876.m12115(interfaceC4479, null);
                ((ArrayList) abstractCollection).add(interfaceC4479);
                return;
            default:
                if (interfaceC4479 == null) {
                    m9546(0);
                    throw null;
                }
                C6876.m12115(interfaceC4479, null);
                ((LinkedHashSet) abstractCollection).add(interfaceC4479);
                return;
        }
    }
}
