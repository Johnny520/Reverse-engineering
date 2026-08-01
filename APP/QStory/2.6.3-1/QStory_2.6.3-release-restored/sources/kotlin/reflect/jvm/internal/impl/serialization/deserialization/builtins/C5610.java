package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import androidx.compose.animation.core.C1171;
import androidx.compose.runtime.C2157;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5643;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5628;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import p082.AbstractC7699;
import p086.AbstractC7732;
import p086.C7740;
import p090.C7775;
import p095.AbstractC7815;
import p117.InterfaceC8083;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5610 extends AbstractC7815 implements InterfaceC5298 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C5628 f14261;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ProtoBuf$PackageFragment f14262;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C7740 f14263;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C1171 f14264;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC7732 f14265;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5610(C5519 c5519, C5677 c5677, InterfaceC5318 interfaceC5318, ProtoBuf$PackageFragment protoBuf$PackageFragment, C7775 c7775) {
        super(interfaceC5318, c5519);
        c5519.getClass();
        interfaceC5318.getClass();
        c7775.getClass();
        this.f14265 = c7775;
        ProtoBuf$StringTable strings = protoBuf$PackageFragment.getStrings();
        strings.getClass();
        ProtoBuf$QualifiedNameTable qualifiedNames = protoBuf$PackageFragment.getQualifiedNames();
        qualifiedNames.getClass();
        C7740 c7740 = new C7740(strings, qualifiedNames);
        this.f14263 = c7740;
        this.f14264 = new C1171(protoBuf$PackageFragment, c7740, c7775, new C5643(this));
        this.f14262 = protoBuf$PackageFragment;
    }

    @Override // p095.AbstractC7815, p095.AbstractC7838
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.f19032);
        sb.append(" from ");
        int i = AbstractC5605.f14254;
        InterfaceC5318 interfaceC5318M12663 = AbstractC7699.m12663(this);
        interfaceC5318M12663.getClass();
        sb.append(interfaceC5318M12663);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC8083 mo9509() {
        C5628 c5628 = this.f14261;
        if (c5628 != null) {
            return c5628;
        }
        AbstractC5227.m9467("_memberScope");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void m10068(C5665 c5665) {
        c5665.getClass();
        ProtoBuf$PackageFragment protoBuf$PackageFragment = this.f14262;
        if (protoBuf$PackageFragment == null) {
            C6755.m11870("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.f14262 = null;
        ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.getPackage();
        protoBuf$Package.getClass();
        this.f14261 = new C5628(this, protoBuf$Package, this.f14263, this.f14265, null, c5665, "scope of " + this, new C2157(this, 6));
    }
}
