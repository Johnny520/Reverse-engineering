package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4614;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4859;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6481;
import p046.C6484;
import p046.InterfaceC6480;
import p049.AbstractC6528;
import p049.AbstractC6529;
import p052.InterfaceC6542;
import p066.AbstractC6875;
import p073.AbstractC6931;
import p077.C6972;
import p079.C6989;
import p079.C6990;
import p079.C6991;
import p083.C7038;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4563 extends C6991 implements InterfaceC4568 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Pair f13312;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean f13313;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4563(InterfaceC4498 interfaceC4498, InterfaceC6480 interfaceC6480, Modality modality, C4489 c4489, boolean z, C4690 c4690, InterfaceC4461 interfaceC4461, InterfaceC4472 interfaceC4472, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, boolean z2, Pair pair) {
        super(interfaceC4498, interfaceC4472, interfaceC6480, modality, c4489, z, c4690, callableMemberDescriptor$Kind, interfaceC4461, false, false, false, false, false);
        if (interfaceC4498 == null) {
            m9146(0);
            throw null;
        }
        if (interfaceC6480 == null) {
            m9146(1);
            throw null;
        }
        if (modality == null) {
            m9146(2);
            throw null;
        }
        if (c4489 == null) {
            m9146(3);
            throw null;
        }
        if (c4690 == null) {
            m9146(4);
            throw null;
        }
        if (interfaceC4461 == null) {
            m9146(5);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9146(6);
            throw null;
        }
        this.f13313 = z2;
        this.f13312 = pair;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public static C4563 m9145(InterfaceC4498 interfaceC4498, C7038 c7038, Modality modality, C4489 c4489, boolean z, C4690 c4690, C6972 c6972, boolean z2) {
        if (interfaceC4498 == null) {
            m9146(7);
            throw null;
        }
        if (modality == null) {
            m9146(9);
            throw null;
        }
        if (c4690 != null) {
            return new C4563(interfaceC4498, c7038, modality, c4489, z, c4690, c6972, null, CallableMemberDescriptor$Kind.DECLARATION, z2, null);
        }
        m9146(11);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m9146(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p079.C6991, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4454
    public final boolean isConst() {
        AbstractC4881 type = getType();
        if (!this.f13313) {
            return false;
        }
        type.getClass();
        if (((!AbstractC6529.m11974(type) && !AbstractC6528.m11964(type)) || AbstractC4916.m9850(type)) && !AbstractC6529.m11973(type)) {
            return false;
        }
        C6484 c6484 = AbstractC6931.f18498;
        C4686 c4686 = AbstractC4614.f13486;
        c4686.getClass();
        return !AbstractC4859.m9707(type, c4686) || AbstractC6529.m11973(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4568
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final InterfaceC4568 mo9147(AbstractC4881 abstractC4881, ArrayList arrayList, AbstractC4881 abstractC48812, Pair pair) {
        AbstractC4881 abstractC48813;
        C6990 c6990;
        C6989 c6989;
        InterfaceC4472 interfaceC4472Mo9012 = mo9012() == this ? null : mo9012();
        C4563 c4563 = new C4563(mo9038(), getAnnotations(), mo9019(), getVisibility(), this.f18733, getName(), mo9036(), interfaceC4472Mo9012, getKind(), this.f13313, pair);
        C6990 c69902 = this.f18715;
        if (c69902 != null) {
            C6990 c69903 = new C6990(c4563, c69902.getAnnotations(), c69902.mo9019(), c69902.getVisibility(), c69902.f18749, c69902.f18752, c69902.f18751, getKind(), interfaceC4472Mo9012 == null ? null : interfaceC4472Mo9012.getGetter(), c69902.mo9036());
            c69903.f18746 = c69902.f18746;
            abstractC48813 = abstractC48812;
            c69903.f18713 = abstractC48813;
            c6990 = c69903;
        } else {
            abstractC48813 = abstractC48812;
            c6990 = null;
        }
        C6989 c69892 = this.f18718;
        if (c69892 != null) {
            c6989 = new C6989(c4563, c69892.getAnnotations(), c69892.mo9019(), c69892.getVisibility(), c69892.f18749, c69892.f18752, c69892.f18751, getKind(), interfaceC4472Mo9012 == null ? null : interfaceC4472Mo9012.getSetter(), c69892.mo9036());
            c6989.f18746 = c6989.f18746;
            InterfaceC4455 interfaceC4455 = (InterfaceC4455) c69892.mo9045().get(0);
            if (interfaceC4455 == null) {
                C6989.m12284(6);
                throw null;
            }
            c6989.f18711 = interfaceC4455;
        } else {
            c6989 = null;
        }
        c4563.m12294(c6990, c6989, this.f18717, this.f18714);
        InterfaceC6542 interfaceC6542 = this.f18731;
        if (interfaceC6542 != null) {
            c4563.m12295(this.f18734, interfaceC6542);
        }
        c4563.mo9041(mo9040());
        c4563.m12293(abstractC48813, getTypeParameters(), this.f18726, abstractC4881 != null ? AbstractC6875.m12103(this, abstractC4881, C6481.f17772) : null, EmptyList.INSTANCE);
        return c4563;
    }

    @Override // p079.C6991, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo9043(InterfaceC4481 interfaceC4481) {
        Pair pair = this.f13312;
        if (pair == null || !((InterfaceC4481) pair.getFirst()).equals(interfaceC4481)) {
            return null;
        }
        return pair.getSecond();
    }

    @Override // p079.C6991
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final C6991 mo9149(InterfaceC4498 interfaceC4498, Modality modality, C4489 c4489, InterfaceC4472 interfaceC4472, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C4690 c4690) {
        if (interfaceC4498 == null) {
            m9146(13);
            throw null;
        }
        if (modality == null) {
            m9146(14);
            throw null;
        }
        if (c4489 == null) {
            m9146(15);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9146(16);
            throw null;
        }
        if (c4690 == null) {
            m9146(17);
            throw null;
        }
        return new C4563(interfaceC4498, getAnnotations(), modality, c4489, this.f18733, c4690, InterfaceC4461.f13087, interfaceC4472, callableMemberDescriptor$Kind, this.f13313, this.f13312);
    }

    @Override // p079.AbstractC6976, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9046() {
        return false;
    }

    @Override // p079.C6991
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void mo9148(AbstractC4881 abstractC4881) {
    }
}
