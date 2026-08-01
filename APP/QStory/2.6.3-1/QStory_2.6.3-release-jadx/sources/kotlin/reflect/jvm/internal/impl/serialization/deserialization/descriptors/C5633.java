package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.compose.animation.core.C1171;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5291;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.C5304;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5428;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5639;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5638;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5652;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.storage.C5675;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.checker.C5687;
import p023.C6986;
import p034.AbstractC7082;
import p050.AbstractC7173;
import p062.C7311;
import p062.InterfaceC7310;
import p082.AbstractC7699;
import p086.AbstractC7728;
import p086.AbstractC7732;
import p086.AbstractC7738;
import p086.C7735;
import p086.InterfaceC7737;
import p095.AbstractC7829;
import p095.C7835;
import p095.C7847;
import p116.C8076;
import p117.AbstractC8087;
import p117.C8084;
import p117.C8085;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5633 extends AbstractC7829 implements InterfaceC5331 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final InterfaceC7310 f14335;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C5304 f14336;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C5428 f14337;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC8087 f14338;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C5656 f14339;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ClassKind f14340;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5322 f14341;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C5652 f14342;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C5675 f14343;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C5679 f14344;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C5675 f14345;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC5331 f14346;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C1171 f14347;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ProtoBuf$Class f14348;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5520 f14349;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Modality f14350;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC7732 f14351;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5294 f14352;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5633(C5656 c5656, ProtoBuf$Class protoBuf$Class, InterfaceC7737 interfaceC7737, AbstractC7732 abstractC7732, InterfaceC5294 interfaceC5294) {
        ClassKind classKind;
        AbstractC8087 c8085;
        Boolean bool;
        super(c5656.f14407.f14437, AbstractC4765.m8878(interfaceC7737, protoBuf$Class.getFqName()).m9882());
        c5656.getClass();
        protoBuf$Class.getClass();
        interfaceC7737.getClass();
        abstractC7732.getClass();
        interfaceC5294.getClass();
        this.f14348 = protoBuf$Class;
        this.f14351 = abstractC7732;
        this.f14352 = interfaceC5294;
        this.f14349 = AbstractC4765.m8878(interfaceC7737, protoBuf$Class.getFqName());
        this.f14350 = C5638.m10101((ProtoBuf$Modality) AbstractC7728.f18725.mo12740(protoBuf$Class.getFlags()));
        this.f14341 = AbstractC5894.m10612((ProtoBuf$Visibility) AbstractC7728.f18726.mo12740(protoBuf$Class.getFlags()));
        ProtoBuf$Class.Kind kind = (ProtoBuf$Class.Kind) AbstractC7728.f18724.mo12740(protoBuf$Class.getFlags());
        switch (kind == null ? -1 : AbstractC5639.f14360[kind.ordinal()]) {
            case 1:
                classKind = ClassKind.CLASS;
                break;
            case 2:
                classKind = ClassKind.INTERFACE;
                break;
            case 3:
                classKind = ClassKind.ENUM_CLASS;
                break;
            case 4:
                classKind = ClassKind.ENUM_ENTRY;
                break;
            case 5:
                classKind = ClassKind.ANNOTATION_CLASS;
                break;
            case 6:
            case 7:
                classKind = ClassKind.OBJECT;
                break;
            default:
                classKind = ClassKind.CLASS;
                break;
        }
        ClassKind classKind2 = classKind;
        this.f14340 = classKind2;
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Class.getTypeParameterList();
        typeParameterList.getClass();
        ProtoBuf$TypeTable typeTable = protoBuf$Class.getTypeTable();
        typeTable.getClass();
        C6986 c6986 = new C6986(typeTable);
        C7735 c7735 = C7735.f18766;
        ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Class.getVersionRequirementTable();
        versionRequirementTable.getClass();
        C5656 c5656M10123 = c5656.m10123(this, typeParameterList, interfaceC7737, c6986, AbstractC7173.m12448(versionRequirementTable), abstractC7732);
        C5665 c5665 = c5656M10123.f14407;
        C5677 c5677 = c5665.f14437;
        this.f14339 = c5656M10123;
        boolean zBooleanValue = AbstractC7728.f18737.mo12740(protoBuf$Class.getFlags()).booleanValue();
        ClassKind classKind3 = ClassKind.ENUM_CLASS;
        int i = 1;
        int i2 = 0;
        if (classKind2 != classKind3) {
            c8085 = C8084.f19681;
        } else if (!zBooleanValue) {
            switch (c5665.f14439.f14416) {
                case 1:
                    bool = null;
                    break;
                default:
                    bool = Boolean.TRUE;
                    break;
            }
            boolean z = AbstractC5227.m9466(bool, Boolean.TRUE);
            c8085 = new C8085(c5677, this, z);
        }
        this.f14338 = c8085;
        this.f14337 = new C5428(this);
        C5293 c5293 = C5304.f13448;
        ((C5687) c5665.f14442).getClass();
        DeserializedClassDescriptor$memberScopeHolder$1 deserializedClassDescriptor$memberScopeHolder$1 = new DeserializedClassDescriptor$memberScopeHolder$1(this);
        c5293.getClass();
        c5677.getClass();
        this.f14336 = new C5304(this, c5677, deserializedClassDescriptor$memberScopeHolder$1);
        this.f14347 = classKind2 == classKind3 ? new C1171(this) : null;
        InterfaceC5331 interfaceC5331 = c5656.f14405;
        this.f14346 = interfaceC5331;
        this.f14345 = new C5675(c5677, new C5615(this, i));
        this.f14344 = new C5679(c5677, new C5615(this, 2));
        new C5675(c5677, new C5615(this, 3));
        c5677.m10139(new C5615(this, 4));
        this.f14343 = new C5675(c5677, new C5615(this, i2));
        InterfaceC7737 interfaceC77372 = c5656M10123.f14406;
        C6986 c69862 = c5656M10123.f14404;
        C5633 c5633 = interfaceC5331 instanceof C5633 ? (C5633) interfaceC5331 : null;
        this.f14342 = new C5652(protoBuf$Class, interfaceC77372, c69862, interfaceC5294, c5633 != null ? c5633.f14342 : null);
        this.f14335 = !AbstractC7728.f18727.mo12740(protoBuf$Class.getFlags()).booleanValue() ? C7311.f18113 : new C5621(c5677, new C5615(this, 5));
    }

    @Override // p062.InterfaceC7308
    public final InterfaceC7310 getAnnotations() {
        return this.f14335;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5330
    public final C5322 getVisibility() {
        return this.f14341;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    public final boolean isExternal() {
        return AbstractC7728.f18746.mo12740(this.f14348.getFlags()).booleanValue();
    }

    @Override // p095.AbstractC7818
    public final boolean isInline() {
        if (!AbstractC7728.f18744.mo12740(this.f14348.getFlags()).booleanValue()) {
            return false;
        }
        AbstractC7732 abstractC7732 = this.f14351;
        int i = abstractC7732.f18755;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = abstractC7732.f18754;
            if (i2 >= 4 && (i2 > 4 || abstractC7732.f18753 > 1)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(mo9567() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC8083 mo9565() {
        return this.f14338;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC5705 mo9560() {
        return this.f14337;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9566() {
        return (Collection) this.f14344.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5294 mo9585() {
        return this.f14352;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9567() {
        return AbstractC7728.f18747.mo12740(this.f14348.getFlags()).booleanValue();
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9568() {
        return this.f14350;
    }

    @Override // p095.AbstractC7829, p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final List mo10098() {
        C5656 c5656 = this.f14339;
        List listM12748 = AbstractC7738.m12748(this.f14348, c5656.f14404);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM12748, 10));
        Iterator it = listM12748.iterator();
        while (it.hasNext()) {
            arrayList.add(new C7835(mo12866(), new C8076(this, c5656.f14408.m10110((ProtoBuf$Type) it.next()), (C5523) null), C7311.f18113));
        }
        return arrayList;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9569() {
        return this.f14340;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5331 mo9587() {
        return this.f14346;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9570() {
        return AbstractC7728.f18743.mo12740(this.f14348.getFlags()).booleanValue();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9571() {
        return AbstractC7728.f18742.mo12740(this.f14348.getFlags()).booleanValue();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9572() {
        return AbstractC7728.f18724.mo12740(this.f14348.getFlags()) == ProtoBuf$Class.Kind.COMPANION_OBJECT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final C5629 m10099() {
        ((C5687) this.f14339.f14407.f14442).getClass();
        C5304 c5304 = this.f14336;
        c5304.getClass();
        AbstractC7829 abstractC7829 = c5304.f13451;
        int i = AbstractC5605.f14254;
        AbstractC7699.m12663(abstractC7829).getClass();
        return (C5629) ((InterfaceC8083) AbstractC7082.m12308(c5304.f13449, C5304.f13447[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final AbstractC5710 m10100(C5523 c5523) {
        Iterator it = m10099().mo9726(c5523, NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                InterfaceC5305 interfaceC5305 = (InterfaceC5305) next;
                if (interfaceC5305.mo9591() == null && interfaceC5305.mo9596().isEmpty()) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        InterfaceC5305 interfaceC53052 = (InterfaceC5305) obj;
        return (AbstractC5710) (interfaceC53052 != null ? interfaceC53052.getType() : null);
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9573() {
        return AbstractC7728.f18744.mo12740(this.f14348.getFlags()).booleanValue() && this.f14351.m12743(1, 4, 2);
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9574() {
        return this.f14339.f14408.m10109();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9575() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9576() {
        return AbstractC7728.f18745.mo12740(this.f14348.getFlags()).booleanValue();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final C7847 mo9577() {
        return (C7847) this.f14345.invoke();
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC8083 mo9578(AbstractC5693 abstractC5693) {
        C5304 c5304 = this.f14336;
        AbstractC7829 abstractC7829 = c5304.f13451;
        int i = AbstractC5605.f14254;
        AbstractC7699.m12663(abstractC7829).getClass();
        return (InterfaceC8083) AbstractC7082.m12308(c5304.f13449, C5304.f13447[0]);
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC5291 mo9579() {
        return (AbstractC5291) this.f14343.invoke();
    }
}
