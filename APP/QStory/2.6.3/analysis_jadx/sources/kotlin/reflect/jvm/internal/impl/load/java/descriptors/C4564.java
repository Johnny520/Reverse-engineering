package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4482;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4615;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6482;
import p046.C6485;
import p046.InterfaceC6481;
import p049.AbstractC6529;
import p049.AbstractC6530;
import p052.InterfaceC6543;
import p066.AbstractC6876;
import p073.AbstractC6932;
import p077.C6973;
import p079.C6990;
import p079.C6991;
import p079.C6992;
import p083.C7039;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4564 extends C6992 implements InterfaceC4569 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Pair f13316;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean f13317;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4564(InterfaceC4499 interfaceC4499, InterfaceC6481 interfaceC6481, Modality modality, C4490 c4490, boolean z, C4691 c4691, InterfaceC4462 interfaceC4462, InterfaceC4473 interfaceC4473, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, boolean z2, Pair pair) {
        super(interfaceC4499, interfaceC4473, interfaceC6481, modality, c4490, z, c4691, callableMemberDescriptor$Kind, interfaceC4462, false, false, false, false, false);
        if (interfaceC4499 == null) {
            m9136(0);
            throw null;
        }
        if (interfaceC6481 == null) {
            m9136(1);
            throw null;
        }
        if (modality == null) {
            m9136(2);
            throw null;
        }
        if (c4490 == null) {
            m9136(3);
            throw null;
        }
        if (c4691 == null) {
            m9136(4);
            throw null;
        }
        if (interfaceC4462 == null) {
            m9136(5);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9136(6);
            throw null;
        }
        this.f13317 = z2;
        this.f13316 = pair;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public static C4564 m9135(InterfaceC4499 interfaceC4499, C7039 c7039, Modality modality, C4490 c4490, boolean z, C4691 c4691, C6973 c6973, boolean z2) {
        if (interfaceC4499 == null) {
            m9136(7);
            throw null;
        }
        if (modality == null) {
            m9136(9);
            throw null;
        }
        if (c4691 != null) {
            return new C4564(interfaceC4499, c7039, modality, c4490, z, c4691, c6973, null, CallableMemberDescriptor$Kind.DECLARATION, z2, null);
        }
        m9136(11);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m9136(int i) {
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

    @Override // p079.C6992, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455
    public final boolean isConst() {
        AbstractC4882 type = getType();
        if (!this.f13317) {
            return false;
        }
        type.getClass();
        if (((!AbstractC6530.m12017(type) && !AbstractC6529.m12007(type)) || AbstractC4917.m9844(type)) && !AbstractC6530.m12016(type)) {
            return false;
        }
        C6485 c6485 = AbstractC6932.f18493;
        C4687 c4687 = AbstractC4615.f13490;
        c4687.getClass();
        return !AbstractC4860.m9697(type, c4687) || AbstractC6530.m12016(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4569
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final InterfaceC4569 mo9137(AbstractC4882 abstractC4882, ArrayList arrayList, AbstractC4882 abstractC48822, Pair pair) {
        AbstractC4882 abstractC48823;
        C6991 c6991;
        C6990 c6990;
        InterfaceC4473 interfaceC4473Mo9002 = mo9002() == this ? null : mo9002();
        C4564 c4564 = new C4564(mo9028(), getAnnotations(), mo9009(), getVisibility(), this.f18728, getName(), mo9026(), interfaceC4473Mo9002, getKind(), this.f13317, pair);
        C6991 c69912 = this.f18710;
        if (c69912 != null) {
            C6991 c69913 = new C6991(c4564, c69912.getAnnotations(), c69912.mo9009(), c69912.getVisibility(), c69912.f18744, c69912.f18747, c69912.f18746, getKind(), interfaceC4473Mo9002 == null ? null : interfaceC4473Mo9002.getGetter(), c69912.mo9026());
            c69913.f18741 = c69912.f18741;
            abstractC48823 = abstractC48822;
            c69913.f18708 = abstractC48823;
            c6991 = c69913;
        } else {
            abstractC48823 = abstractC48822;
            c6991 = null;
        }
        C6990 c69902 = this.f18713;
        if (c69902 != null) {
            c6990 = new C6990(c4564, c69902.getAnnotations(), c69902.mo9009(), c69902.getVisibility(), c69902.f18744, c69902.f18747, c69902.f18746, getKind(), interfaceC4473Mo9002 == null ? null : interfaceC4473Mo9002.getSetter(), c69902.mo9026());
            c6990.f18741 = c6990.f18741;
            InterfaceC4456 interfaceC4456 = (InterfaceC4456) c69902.mo9035().get(0);
            if (interfaceC4456 == null) {
                C6990.m12311(6);
                throw null;
            }
            c6990.f18706 = interfaceC4456;
        } else {
            c6990 = null;
        }
        c4564.m12321(c6991, c6990, this.f18712, this.f18709);
        InterfaceC6543 interfaceC6543 = this.f18726;
        if (interfaceC6543 != null) {
            c4564.m12322(this.f18729, interfaceC6543);
        }
        c4564.mo9031(mo9030());
        c4564.m12320(abstractC48823, getTypeParameters(), this.f18721, abstractC4882 != null ? AbstractC6876.m12131(this, abstractC4882, C6482.f17768) : null, EmptyList.INSTANCE);
        return c4564;
    }

    @Override // p079.C6992, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo9033(InterfaceC4482 interfaceC4482) {
        Pair pair = this.f13316;
        if (pair == null || !((InterfaceC4482) pair.getFirst()).equals(interfaceC4482)) {
            return null;
        }
        return pair.getSecond();
    }

    @Override // p079.C6992
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final C6992 mo9139(InterfaceC4499 interfaceC4499, Modality modality, C4490 c4490, InterfaceC4473 interfaceC4473, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C4691 c4691) {
        if (interfaceC4499 == null) {
            m9136(13);
            throw null;
        }
        if (modality == null) {
            m9136(14);
            throw null;
        }
        if (c4490 == null) {
            m9136(15);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9136(16);
            throw null;
        }
        if (c4691 == null) {
            m9136(17);
            throw null;
        }
        return new C4564(interfaceC4499, getAnnotations(), modality, c4490, this.f18728, c4691, InterfaceC4462.f13091, interfaceC4473, callableMemberDescriptor$Kind, this.f13317, this.f13316);
    }

    @Override // p079.AbstractC6977, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9036() {
        return false;
    }

    @Override // p079.C6992
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void mo9138(AbstractC4882 abstractC4882) {
    }
}
