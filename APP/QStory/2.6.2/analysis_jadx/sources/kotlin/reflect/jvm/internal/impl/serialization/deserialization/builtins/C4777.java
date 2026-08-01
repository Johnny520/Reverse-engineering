package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.C1322;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4810;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4832;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4795;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import p066.AbstractC6869;
import p070.AbstractC6902;
import p070.C6910;
import p074.C6945;
import p079.AbstractC6985;
import p101.InterfaceC7253;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4777 extends AbstractC6985 implements InterfaceC4465 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C4795 f13912;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ProtoBuf$PackageFragment f13913;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6910 f13914;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0325 f13915;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6902 f13916;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4777(C4686 c4686, C4844 c4844, InterfaceC4485 interfaceC4485, ProtoBuf$PackageFragment protoBuf$PackageFragment, C6945 c6945) {
        super(interfaceC4485, c4686);
        c4686.getClass();
        interfaceC4485.getClass();
        c6945.getClass();
        this.f13916 = c6945;
        ProtoBuf$StringTable strings = protoBuf$PackageFragment.getStrings();
        strings.getClass();
        ProtoBuf$QualifiedNameTable qualifiedNames = protoBuf$PackageFragment.getQualifiedNames();
        qualifiedNames.getClass();
        C6910 c6910 = new C6910(strings, qualifiedNames);
        this.f13914 = c6910;
        this.f13915 = new C0325(protoBuf$PackageFragment, c6910, c6945, new C4810(this));
        this.f13913 = protoBuf$PackageFragment;
    }

    @Override // p079.AbstractC6985, p079.AbstractC7008
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.f18692);
        sb.append(" from ");
        int i = AbstractC4772.f13905;
        InterfaceC4485 interfaceC4485M12076 = AbstractC6869.m12076(this);
        interfaceC4485M12076.getClass();
        sb.append(interfaceC4485M12076);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7253 mo8960() {
        C4795 c4795 = this.f13912;
        if (c4795 != null) {
            return c4795;
        }
        AbstractC4394.m8918("_memberScope");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void m9519(C4832 c4832) {
        c4832.getClass();
        ProtoBuf$PackageFragment protoBuf$PackageFragment = this.f13913;
        if (protoBuf$PackageFragment == null) {
            C5919.m11250("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.f13913 = null;
        ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.getPackage();
        protoBuf$Package.getClass();
        this.f13912 = new C4795(this, protoBuf$Package, this.f13914, this.f13916, null, c4832, "scope of " + this, new C1322(this, 6));
    }
}
