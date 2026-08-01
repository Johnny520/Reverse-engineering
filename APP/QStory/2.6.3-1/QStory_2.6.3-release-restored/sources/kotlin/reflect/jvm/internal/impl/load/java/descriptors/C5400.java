package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5314;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.description.method.MethodDescription;
import p062.C7311;
import p062.InterfaceC7310;
import p082.AbstractC7705;
import p093.C7802;
import p095.AbstractC7818;
import p095.AbstractC7831;
import p095.C7847;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5400 extends C7847 implements InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public Boolean f13667;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public Boolean f13668;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5400(AbstractC7818 abstractC7818, C5400 c5400, InterfaceC7310 interfaceC7310, boolean z, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5294 interfaceC5294) {
        super(abstractC7818, c5400, interfaceC7310, z, callableMemberDescriptor$Kind, interfaceC5294);
        if (abstractC7818 == null) {
            m9705(0);
            throw null;
        }
        if (interfaceC7310 == null) {
            m9705(1);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9705(2);
            throw null;
        }
        if (interfaceC5294 == null) {
            m9705(3);
            throw null;
        }
        this.f13668 = null;
        this.f13667 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public static C5400 m9704(AbstractC7818 abstractC7818, InterfaceC7310 interfaceC7310, boolean z, C7802 c7802) {
        if (abstractC7818 != null) {
            return new C5400(abstractC7818, null, interfaceC7310, z, CallableMemberDescriptor$Kind.DECLARATION, c7802);
        }
        m9705(4);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m9705(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final InterfaceC5401 mo9696(AbstractC5714 abstractC5714, ArrayList arrayList, AbstractC5714 abstractC57142, Pair pair) {
        C5400 c5400M9706 = m9706(mo9587(), null, getKind(), getAnnotations(), mo9585());
        c5400M9706.mo12856(abstractC5714 == null ? null : AbstractC7705.m12690(c5400M9706, abstractC5714, C7311.f18113), this.f19119, EmptyList.INSTANCE, getTypeParameters(), AbstractC9019.m14245(arrayList, mo9594(), c5400M9706), abstractC57142, mo9568(), getVisibility());
        if (pair != null) {
            c5400M9706.m12894((InterfaceC5314) pair.getFirst(), pair.getSecond());
        }
        return c5400M9706;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final C5400 m9706(InterfaceC5331 interfaceC5331, InterfaceC5316 interfaceC5316, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC7310 interfaceC7310, InterfaceC5294 interfaceC5294) {
        if (interfaceC5331 == null) {
            m9705(7);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9705(8);
            throw null;
        }
        if (interfaceC7310 == null) {
            m9705(9);
            throw null;
        }
        if (interfaceC5294 == null) {
            m9705(10);
            throw null;
        }
        if (callableMemberDescriptor$Kind != CallableMemberDescriptor$Kind.DECLARATION && callableMemberDescriptor$Kind != CallableMemberDescriptor$Kind.SYNTHESIZED) {
            C6385.m11447("Attempt at creating a constructor that is not a declaration: \ncopy from: ", this, "\nnewOwner: ", interfaceC5331, "\nkind: ", callableMemberDescriptor$Kind);
            return null;
        }
        C5400 c5400 = new C5400((AbstractC7818) interfaceC5331, (C5400) interfaceC5316, interfaceC7310, this.f19201, callableMemberDescriptor$Kind, interfaceC5294);
        Boolean bool = this.f13668;
        bool.getClass();
        c5400.f13668 = bool;
        Boolean bool2 = this.f13667;
        bool2.getClass();
        c5400.f13667 = bool2;
        return c5400;
    }

    @Override // p095.AbstractC7831
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final void mo9707(boolean z) {
        this.f13667 = Boolean.valueOf(z);
    }

    @Override // p095.AbstractC7831
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo9708(boolean z) {
        this.f13668 = Boolean.valueOf(z);
    }

    @Override // p095.C7847
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C7847 mo9703(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5331 interfaceC5331, InterfaceC5316 interfaceC5316, InterfaceC5294 interfaceC5294, C5523 c5523, InterfaceC7310 interfaceC7310) {
        return m9706(interfaceC5331, interfaceC5316, callableMemberDescriptor$Kind, interfaceC7310, interfaceC5294);
    }

    @Override // p095.C7847, p095.AbstractC7831
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final /* bridge */ /* synthetic */ AbstractC7831 mo9703(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5331 interfaceC5331, InterfaceC5316 interfaceC5316, InterfaceC5294 interfaceC5294, C5523 c5523, InterfaceC7310 interfaceC7310) {
        return m9706(interfaceC5331, interfaceC5316, callableMemberDescriptor$Kind, interfaceC7310, interfaceC5294);
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9595() {
        return this.f13667.booleanValue();
    }
}
