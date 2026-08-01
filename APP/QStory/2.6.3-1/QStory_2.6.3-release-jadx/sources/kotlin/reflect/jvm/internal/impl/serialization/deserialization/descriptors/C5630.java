package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.C5325;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import p082.AbstractC7705;
import p082.C7706;
import p095.AbstractC7831;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5630 extends AbstractC7705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractCollection f14331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f14332;

    public /* synthetic */ C5630(AbstractCollection abstractCollection, int i) {
        this.f14332 = i;
        this.f14331 = abstractCollection;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m10095(int i) {
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

    @Override // p082.AbstractC7705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo10096(InterfaceC5312 interfaceC5312, InterfaceC5312 interfaceC53122) {
        switch (this.f14332) {
            case 0:
                interfaceC53122.getClass();
                if (interfaceC53122 instanceof AbstractC7831) {
                    ((AbstractC7831) interfaceC53122).m12894(C5325.f13478, interfaceC5312);
                    return;
                }
                return;
            default:
                if (interfaceC53122 != null) {
                    return;
                }
                m10095(2);
                throw null;
        }
    }

    @Override // p082.AbstractC7705
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo10097(InterfaceC5312 interfaceC5312) {
        int i = this.f14332;
        AbstractCollection abstractCollection = this.f14331;
        switch (i) {
            case 0:
                interfaceC5312.getClass();
                C7706.m12702(interfaceC5312, null);
                ((ArrayList) abstractCollection).add(interfaceC5312);
                return;
            default:
                if (interfaceC5312 == null) {
                    m10095(0);
                    throw null;
                }
                C7706.m12702(interfaceC5312, null);
                ((LinkedHashSet) abstractCollection).add(interfaceC5312);
                return;
        }
    }
}
