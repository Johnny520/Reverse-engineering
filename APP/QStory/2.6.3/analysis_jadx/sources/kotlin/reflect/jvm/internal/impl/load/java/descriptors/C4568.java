package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4482;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6482;
import p046.InterfaceC6481;
import p066.AbstractC6876;
import p077.C6973;
import p079.AbstractC6989;
import p079.AbstractC7002;
import p079.C7018;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4568 extends C7018 implements InterfaceC4569 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public Boolean f13322;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public Boolean f13323;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4568(AbstractC6989 abstractC6989, C4568 c4568, InterfaceC6481 interfaceC6481, boolean z, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4462 interfaceC4462) {
        super(abstractC6989, c4568, interfaceC6481, z, callableMemberDescriptor$Kind, interfaceC4462);
        if (abstractC6989 == null) {
            m9146(0);
            throw null;
        }
        if (interfaceC6481 == null) {
            m9146(1);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9146(2);
            throw null;
        }
        if (interfaceC4462 == null) {
            m9146(3);
            throw null;
        }
        this.f13323 = null;
        this.f13322 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public static C4568 m9145(AbstractC6989 abstractC6989, InterfaceC6481 interfaceC6481, boolean z, C6973 c6973) {
        if (abstractC6989 != null) {
            return new C4568(abstractC6989, null, interfaceC6481, z, CallableMemberDescriptor$Kind.DECLARATION, c6973);
        }
        m9146(4);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m9146(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4569
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final InterfaceC4569 mo9137(AbstractC4882 abstractC4882, ArrayList arrayList, AbstractC4882 abstractC48822, Pair pair) {
        C4568 c4568M9147 = m9147(mo9028(), null, getKind(), getAnnotations(), mo9026());
        c4568M9147.mo12297(abstractC4882 == null ? null : AbstractC6876.m12131(c4568M9147, abstractC4882, C6482.f17768), this.f18774, EmptyList.INSTANCE, getTypeParameters(), AbstractC8190.m13686(arrayList, mo9035(), c4568M9147), abstractC48822, mo9009(), getVisibility());
        if (pair != null) {
            c4568M9147.m12335((InterfaceC4482) pair.getFirst(), pair.getSecond());
        }
        return c4568M9147;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final C4568 m9147(InterfaceC4499 interfaceC4499, InterfaceC4484 interfaceC4484, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC6481 interfaceC6481, InterfaceC4462 interfaceC4462) {
        if (interfaceC4499 == null) {
            m9146(7);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9146(8);
            throw null;
        }
        if (interfaceC6481 == null) {
            m9146(9);
            throw null;
        }
        if (interfaceC4462 == null) {
            m9146(10);
            throw null;
        }
        if (callableMemberDescriptor$Kind != CallableMemberDescriptor$Kind.DECLARATION && callableMemberDescriptor$Kind != CallableMemberDescriptor$Kind.SYNTHESIZED) {
            C5554.m10888("Attempt at creating a constructor that is not a declaration: \ncopy from: ", this, "\nnewOwner: ", interfaceC4499, "\nkind: ", callableMemberDescriptor$Kind);
            return null;
        }
        C4568 c4568 = new C4568((AbstractC6989) interfaceC4499, (C4568) interfaceC4484, interfaceC6481, this.f18856, callableMemberDescriptor$Kind, interfaceC4462);
        Boolean bool = this.f13323;
        bool.getClass();
        c4568.f13323 = bool;
        Boolean bool2 = this.f13322;
        bool2.getClass();
        c4568.f13322 = bool2;
        return c4568;
    }

    @Override // p079.AbstractC7002
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final void mo9148(boolean z) {
        this.f13322 = Boolean.valueOf(z);
    }

    @Override // p079.AbstractC7002
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo9149(boolean z) {
        this.f13323 = Boolean.valueOf(z);
    }

    @Override // p079.C7018
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C7018 mo9144(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4499 interfaceC4499, InterfaceC4484 interfaceC4484, InterfaceC4462 interfaceC4462, C4691 c4691, InterfaceC6481 interfaceC6481) {
        return m9147(interfaceC4499, interfaceC4484, callableMemberDescriptor$Kind, interfaceC6481, interfaceC4462);
    }

    @Override // p079.C7018, p079.AbstractC7002
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final /* bridge */ /* synthetic */ AbstractC7002 mo9144(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4499 interfaceC4499, InterfaceC4484 interfaceC4484, InterfaceC4462 interfaceC4462, C4691 c4691, InterfaceC6481 interfaceC6481) {
        return m9147(interfaceC4499, interfaceC4484, callableMemberDescriptor$Kind, interfaceC6481, interfaceC4462);
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9036() {
        return this.f13322.booleanValue();
    }
}
