package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.bumptech.glide.AbstractC3055;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6481;
import p046.InterfaceC6480;
import p066.AbstractC6875;
import p077.C6972;
import p079.AbstractC6988;
import p079.AbstractC7001;
import p079.C7017;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4567 extends C7017 implements InterfaceC4568 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public Boolean f13318;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public Boolean f13319;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4567(AbstractC6988 abstractC6988, C4567 c4567, InterfaceC6480 interfaceC6480, boolean z, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4461 interfaceC4461) {
        super(abstractC6988, c4567, interfaceC6480, z, callableMemberDescriptor$Kind, interfaceC4461);
        if (abstractC6988 == null) {
            m9156(0);
            throw null;
        }
        if (interfaceC6480 == null) {
            m9156(1);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9156(2);
            throw null;
        }
        if (interfaceC4461 == null) {
            m9156(3);
            throw null;
        }
        this.f13319 = null;
        this.f13318 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public static C4567 m9155(AbstractC6988 abstractC6988, InterfaceC6480 interfaceC6480, boolean z, C6972 c6972) {
        if (abstractC6988 != null) {
            return new C4567(abstractC6988, null, interfaceC6480, z, CallableMemberDescriptor$Kind.DECLARATION, c6972);
        }
        m9156(4);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m9156(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4568
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final InterfaceC4568 mo9147(AbstractC4881 abstractC4881, ArrayList arrayList, AbstractC4881 abstractC48812, Pair pair) {
        C4567 c4567M9157 = m9157(mo9038(), null, getKind(), getAnnotations(), mo9036());
        c4567M9157.mo12270(abstractC4881 == null ? null : AbstractC6875.m12103(c4567M9157, abstractC4881, C6481.f17772), this.f18779, EmptyList.INSTANCE, getTypeParameters(), AbstractC3055.m6645(arrayList, mo9045(), c4567M9157), abstractC48812, mo9019(), getVisibility());
        if (pair != null) {
            c4567M9157.m12308((InterfaceC4481) pair.getFirst(), pair.getSecond());
        }
        return c4567M9157;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final C4567 m9157(InterfaceC4498 interfaceC4498, InterfaceC4483 interfaceC4483, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC6480 interfaceC6480, InterfaceC4461 interfaceC4461) {
        if (interfaceC4498 == null) {
            m9156(7);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9156(8);
            throw null;
        }
        if (interfaceC6480 == null) {
            m9156(9);
            throw null;
        }
        if (interfaceC4461 == null) {
            m9156(10);
            throw null;
        }
        if (callableMemberDescriptor$Kind != CallableMemberDescriptor$Kind.DECLARATION && callableMemberDescriptor$Kind != CallableMemberDescriptor$Kind.SYNTHESIZED) {
            C5553.m10831("Attempt at creating a constructor that is not a declaration: \ncopy from: ", this, "\nnewOwner: ", interfaceC4498, "\nkind: ", callableMemberDescriptor$Kind);
            return null;
        }
        C4567 c4567 = new C4567((AbstractC6988) interfaceC4498, (C4567) interfaceC4483, interfaceC6480, this.f18861, callableMemberDescriptor$Kind, interfaceC4461);
        Boolean bool = this.f13319;
        bool.getClass();
        c4567.f13319 = bool;
        Boolean bool2 = this.f13318;
        bool2.getClass();
        c4567.f13318 = bool2;
        return c4567;
    }

    @Override // p079.AbstractC7001
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final void mo9158(boolean z) {
        this.f13318 = Boolean.valueOf(z);
    }

    @Override // p079.AbstractC7001
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo9159(boolean z) {
        this.f13319 = Boolean.valueOf(z);
    }

    @Override // p079.C7017
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C7017 mo9154(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4498 interfaceC4498, InterfaceC4483 interfaceC4483, InterfaceC4461 interfaceC4461, C4690 c4690, InterfaceC6480 interfaceC6480) {
        return m9157(interfaceC4498, interfaceC4483, callableMemberDescriptor$Kind, interfaceC6480, interfaceC4461);
    }

    @Override // p079.C7017, p079.AbstractC7001
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final /* bridge */ /* synthetic */ AbstractC7001 mo9154(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4498 interfaceC4498, InterfaceC4483 interfaceC4483, InterfaceC4461 interfaceC4461, C4690 c4690, InterfaceC6480 interfaceC6480) {
        return m9157(interfaceC4498, interfaceC4483, callableMemberDescriptor$Kind, interfaceC6480, interfaceC4461);
    }

    @Override // p079.AbstractC7001, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9046() {
        return this.f13318.booleanValue();
    }
}
