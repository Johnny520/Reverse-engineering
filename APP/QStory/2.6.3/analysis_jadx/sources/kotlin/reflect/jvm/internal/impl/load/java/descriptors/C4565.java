package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4482;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6482;
import p046.InterfaceC6481;
import p066.AbstractC6876;
import p077.C6973;
import p079.AbstractC7002;
import p079.C6981;
import p079.C7003;
import p079.C7006;
import p083.C7039;
import p104.AbstractC7294;
import p104.C7279;
import p104.C7295;
import p104.InterfaceC7280;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4565 extends C6981 implements InterfaceC4569 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C4566 f13318 = new C4566();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final C4566 f13319 = new C4566();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f13320;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public JavaMethodDescriptor$ParameterNamesStatus f13321;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4565(InterfaceC4499 interfaceC4499, InterfaceC4471 interfaceC4471, InterfaceC6481 interfaceC6481, C4691 c4691, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4462 interfaceC4462, boolean z) {
        super(interfaceC4499, interfaceC4471, interfaceC6481, c4691, callableMemberDescriptor$Kind, interfaceC4462);
        if (interfaceC4499 == null) {
            m9141(0);
            throw null;
        }
        if (interfaceC6481 == null) {
            m9141(1);
            throw null;
        }
        if (c4691 == null) {
            m9141(2);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9141(3);
            throw null;
        }
        this.f13321 = null;
        this.f13320 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public static C4565 m9140(InterfaceC4499 interfaceC4499, C7039 c7039, C4691 c4691, C6973 c6973, boolean z) {
        if (interfaceC4499 == null) {
            m9141(5);
            throw null;
        }
        if (c4691 != null) {
            return new C4565(interfaceC4499, null, c7039, c4691, CallableMemberDescriptor$Kind.DECLARATION, c6973, z);
        }
        m9141(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m9141(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4569
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final InterfaceC4569 mo9137(AbstractC4882 abstractC4882, ArrayList arrayList, AbstractC4882 abstractC48822, Pair pair) {
        ArrayList arrayListM13686 = AbstractC8190.m13686(arrayList, mo9035(), this);
        C7006 c7006M12131 = abstractC4882 == null ? null : AbstractC6876.m12131(this, abstractC4882, C6482.f17768);
        C7003 c7003M12336 = m12336(C4919.f14248);
        c7003M12336.f18806 = arrayListM13686;
        c7003M12336.f18793 = abstractC48822;
        c7003M12336.f18804 = c7006M12131;
        c7003M12336.f18800 = true;
        c7003M12336.f18789 = true;
        C4565 c4565 = (C4565) c7003M12336.f18788.mo11990(c7003M12336);
        if (pair != null) {
            c4565.m12335((InterfaceC4482) pair.getFirst(), pair.getSecond());
        }
        if (c4565 != null) {
            return c4565;
        }
        m9141(21);
        throw null;
    }

    @Override // p079.C6981
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final C6981 mo9142(C7006 c7006, C7006 c70062, List list, List list2, List list3, AbstractC4882 abstractC4882, Modality modality, C4490 c4490, Map map) {
        C7279 c7279;
        if (list == null) {
            m9141(9);
            throw null;
        }
        if (list2 == null) {
            m9141(10);
            throw null;
        }
        if (list3 == null) {
            m9141(11);
            throw null;
        }
        if (c4490 == null) {
            m9141(12);
            throw null;
        }
        super.mo9142(c7006, c70062, list, list2, list3, abstractC4882, modality, c4490, map);
        for (C7295 c7295 : AbstractC7294.f19419) {
            Regex regex = c7295.f19423;
            C4691 c4691 = c7295.f19424;
            if (c4691 == null || AbstractC4395.m8907(getName(), c4691)) {
                if (regex != null) {
                    String strM9335 = getName().m9335();
                    strM9335.getClass();
                    if (!regex.matches(strM9335)) {
                        continue;
                    }
                }
                Collection collection = c7295.f19422;
                if (collection == null || collection.contains(getName())) {
                    InterfaceC7280[] interfaceC7280Arr = c7295.f19420;
                    int length = interfaceC7280Arr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            c7279 = ((String) c7295.f19421.invoke(this)) != null ? new C7279(false) : C7279.f19378;
                        } else {
                            if (interfaceC7280Arr[i].mo12496(this) != null) {
                                c7279 = new C7279(false);
                                break;
                            }
                            i++;
                        }
                    }
                    this.f18771 = c7279.f19377;
                    return this;
                }
            }
        }
        c7279 = C7279.f19379;
        this.f18771 = c7279.f19377;
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m9143(boolean z, boolean z2) {
        this.f13321 = JavaMethodDescriptor$ParameterNamesStatus.get(z, z2);
    }

    @Override // p079.C6981, p079.AbstractC7002
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final AbstractC7002 mo9144(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4499 interfaceC4499, InterfaceC4484 interfaceC4484, InterfaceC4462 interfaceC4462, C4691 c4691, InterfaceC6481 interfaceC6481) {
        if (interfaceC4499 == null) {
            m9141(14);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9141(15);
            throw null;
        }
        if (interfaceC6481 == null) {
            m9141(16);
            throw null;
        }
        InterfaceC4471 interfaceC4471 = (InterfaceC4471) interfaceC4484;
        if (c4691 == null) {
            c4691 = getName();
        }
        C4565 c4565 = new C4565(interfaceC4499, interfaceC4471, interfaceC6481, c4691, callableMemberDescriptor$Kind, interfaceC4462, this.f13320);
        JavaMethodDescriptor$ParameterNamesStatus javaMethodDescriptor$ParameterNamesStatus = this.f13321;
        c4565.m9143(javaMethodDescriptor$ParameterNamesStatus.isStable, javaMethodDescriptor$ParameterNamesStatus.isSynthesized);
        return c4565;
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9036() {
        return this.f13321.isSynthesized;
    }
}
