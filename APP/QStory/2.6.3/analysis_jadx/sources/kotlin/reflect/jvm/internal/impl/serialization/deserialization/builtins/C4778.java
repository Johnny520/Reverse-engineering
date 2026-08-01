package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.C1322;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4811;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4833;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4796;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import p066.AbstractC6870;
import p070.AbstractC6903;
import p070.C6911;
import p074.C6946;
import p079.AbstractC6986;
import p101.InterfaceC7254;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4778 extends AbstractC6986 implements InterfaceC4466 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C4796 f13916;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ProtoBuf$PackageFragment f13917;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6911 f13918;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0325 f13919;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6903 f13920;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4778(C4687 c4687, C4845 c4845, InterfaceC4486 interfaceC4486, ProtoBuf$PackageFragment protoBuf$PackageFragment, C6946 c6946) {
        super(interfaceC4486, c4687);
        c4687.getClass();
        interfaceC4486.getClass();
        c6946.getClass();
        this.f13920 = c6946;
        ProtoBuf$StringTable strings = protoBuf$PackageFragment.getStrings();
        strings.getClass();
        ProtoBuf$QualifiedNameTable qualifiedNames = protoBuf$PackageFragment.getQualifiedNames();
        qualifiedNames.getClass();
        C6911 c6911 = new C6911(strings, qualifiedNames);
        this.f13918 = c6911;
        this.f13919 = new C0325(protoBuf$PackageFragment, c6911, c6946, new C4811(this));
        this.f13917 = protoBuf$PackageFragment;
    }

    @Override // p079.AbstractC6986, p079.AbstractC7009
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.f18687);
        sb.append(" from ");
        int i = AbstractC4773.f13909;
        InterfaceC4486 interfaceC4486M12104 = AbstractC6870.m12104(this);
        interfaceC4486M12104.getClass();
        sb.append(interfaceC4486M12104);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7254 mo8950() {
        C4796 c4796 = this.f13916;
        if (c4796 != null) {
            return c4796;
        }
        AbstractC4395.m8908("_memberScope");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void m9509(C4833 c4833) {
        c4833.getClass();
        ProtoBuf$PackageFragment protoBuf$PackageFragment = this.f13917;
        if (protoBuf$PackageFragment == null) {
            C5925.m11311("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.f13917 = null;
        ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.getPackage();
        protoBuf$Package.getClass();
        this.f13916 = new C4796(this, protoBuf$Package, this.f13918, this.f13920, null, c4833, "scope of " + this, new C1322(this, 6));
    }
}
