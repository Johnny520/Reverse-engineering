package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.bumptech.glide.AbstractC3055;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6481;
import p046.InterfaceC6480;
import p066.AbstractC6875;
import p077.C6972;
import p079.AbstractC7001;
import p079.C6980;
import p079.C7002;
import p079.C7005;
import p083.C7038;
import p104.AbstractC7293;
import p104.C7278;
import p104.C7294;
import p104.InterfaceC7279;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4564 extends C6980 implements InterfaceC4568 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C4565 f13314 = new C4565();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final C4565 f13315 = new C4565();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f13316;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public JavaMethodDescriptor$ParameterNamesStatus f13317;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4564(InterfaceC4498 interfaceC4498, InterfaceC4470 interfaceC4470, InterfaceC6480 interfaceC6480, C4690 c4690, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4461 interfaceC4461, boolean z) {
        super(interfaceC4498, interfaceC4470, interfaceC6480, c4690, callableMemberDescriptor$Kind, interfaceC4461);
        if (interfaceC4498 == null) {
            m9151(0);
            throw null;
        }
        if (interfaceC6480 == null) {
            m9151(1);
            throw null;
        }
        if (c4690 == null) {
            m9151(2);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9151(3);
            throw null;
        }
        this.f13317 = null;
        this.f13316 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public static C4564 m9150(InterfaceC4498 interfaceC4498, C7038 c7038, C4690 c4690, C6972 c6972, boolean z) {
        if (interfaceC4498 == null) {
            m9151(5);
            throw null;
        }
        if (c4690 != null) {
            return new C4564(interfaceC4498, null, c7038, c4690, CallableMemberDescriptor$Kind.DECLARATION, c6972, z);
        }
        m9151(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m9151(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4568
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final InterfaceC4568 mo9147(AbstractC4881 abstractC4881, ArrayList arrayList, AbstractC4881 abstractC48812, Pair pair) {
        ArrayList arrayListM6645 = AbstractC3055.m6645(arrayList, mo9045(), this);
        C7005 c7005M12103 = abstractC4881 == null ? null : AbstractC6875.m12103(this, abstractC4881, C6481.f17772);
        C7002 c7002M12309 = m12309(C4918.f14244);
        c7002M12309.f18811 = arrayListM6645;
        c7002M12309.f18798 = abstractC48812;
        c7002M12309.f18809 = c7005M12103;
        c7002M12309.f18805 = true;
        c7002M12309.f18794 = true;
        C4564 c4564 = (C4564) c7002M12309.f18793.mo11947(c7002M12309);
        if (pair != null) {
            c4564.m12308((InterfaceC4481) pair.getFirst(), pair.getSecond());
        }
        if (c4564 != null) {
            return c4564;
        }
        m9151(21);
        throw null;
    }

    @Override // p079.C6980
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final C6980 mo9152(C7005 c7005, C7005 c70052, List list, List list2, List list3, AbstractC4881 abstractC4881, Modality modality, C4489 c4489, Map map) {
        C7278 c7278;
        if (list == null) {
            m9151(9);
            throw null;
        }
        if (list2 == null) {
            m9151(10);
            throw null;
        }
        if (list3 == null) {
            m9151(11);
            throw null;
        }
        if (c4489 == null) {
            m9151(12);
            throw null;
        }
        super.mo9152(c7005, c70052, list, list2, list3, abstractC4881, modality, c4489, map);
        for (C7294 c7294 : AbstractC7293.f19424) {
            Regex regex = c7294.f19428;
            C4690 c4690 = c7294.f19429;
            if (c4690 == null || AbstractC4394.m8917(getName(), c4690)) {
                if (regex != null) {
                    String strM9345 = getName().m9345();
                    strM9345.getClass();
                    if (!regex.matches(strM9345)) {
                        continue;
                    }
                }
                Collection collection = c7294.f19427;
                if (collection == null || collection.contains(getName())) {
                    InterfaceC7279[] interfaceC7279Arr = c7294.f19425;
                    int length = interfaceC7279Arr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            c7278 = ((String) c7294.f19426.invoke(this)) != null ? new C7278(false) : C7278.f19383;
                        } else {
                            if (interfaceC7279Arr[i].mo12469(this) != null) {
                                c7278 = new C7278(false);
                                break;
                            }
                            i++;
                        }
                    }
                    this.f18776 = c7278.f19382;
                    return this;
                }
            }
        }
        c7278 = C7278.f19384;
        this.f18776 = c7278.f19382;
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m9153(boolean z, boolean z2) {
        this.f13317 = JavaMethodDescriptor$ParameterNamesStatus.get(z, z2);
    }

    @Override // p079.C6980, p079.AbstractC7001
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final AbstractC7001 mo9154(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4498 interfaceC4498, InterfaceC4483 interfaceC4483, InterfaceC4461 interfaceC4461, C4690 c4690, InterfaceC6480 interfaceC6480) {
        if (interfaceC4498 == null) {
            m9151(14);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9151(15);
            throw null;
        }
        if (interfaceC6480 == null) {
            m9151(16);
            throw null;
        }
        InterfaceC4470 interfaceC4470 = (InterfaceC4470) interfaceC4483;
        if (c4690 == null) {
            c4690 = getName();
        }
        C4564 c4564 = new C4564(interfaceC4498, interfaceC4470, interfaceC6480, c4690, callableMemberDescriptor$Kind, interfaceC4461, this.f13316);
        JavaMethodDescriptor$ParameterNamesStatus javaMethodDescriptor$ParameterNamesStatus = this.f13317;
        c4564.m9153(javaMethodDescriptor$ParameterNamesStatus.isStable, javaMethodDescriptor$ParameterNamesStatus.isSynthesized);
        return c4564;
    }

    @Override // p079.AbstractC7001, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9046() {
        return this.f13317.isSynthesized;
    }
}
