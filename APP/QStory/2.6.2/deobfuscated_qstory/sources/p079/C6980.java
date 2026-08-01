package p079;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6481;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6980 extends AbstractC7001 implements InterfaceC4470 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6980(InterfaceC4498 interfaceC4498, InterfaceC4470 interfaceC4470, InterfaceC6480 interfaceC6480, C4690 c4690, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4461 interfaceC4461) {
        super(callableMemberDescriptor$Kind, interfaceC4498, interfaceC4470, interfaceC4461, c4690, interfaceC6480);
        if (interfaceC4498 == null) {
            m12267(0);
            throw null;
        }
        if (interfaceC6480 == null) {
            m12267(1);
            throw null;
        }
        if (c4690 == null) {
            m12267(2);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12267(3);
            throw null;
        }
        if (interfaceC4461 != null) {
        } else {
            m12267(4);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public static C6980 m12266(AbstractC6988 abstractC6988, C4690 c4690, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4461 interfaceC4461) {
        if (abstractC6988 == null) {
            m12267(5);
            throw null;
        }
        if (c4690 == null) {
            m12267(7);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12267(8);
            throw null;
        }
        if (interfaceC4461 != null) {
            return new C6980(abstractC6988, null, C6481.f17772, c4690, callableMemberDescriptor$Kind, interfaceC4461);
        }
        m12267(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12267(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public C6980 mo9152(C7005 c7005, C7005 c70052, List list, List list2, List list3, AbstractC4881 abstractC4881, Modality modality, C4489 c4489, Map map) {
        if (list == null) {
            m12267(19);
            throw null;
        }
        if (list2 == null) {
            m12267(20);
            throw null;
        }
        if (list3 == null) {
            m12267(21);
            throw null;
        }
        if (c4489 == null) {
            m12267(22);
            throw null;
        }
        super.mo12270(c7005, c70052, list, list2, list3, abstractC4881, modality, c4489);
        if (map != null && !map.isEmpty()) {
            this.f18766 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // p079.AbstractC7001
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6980 mo12270(C7005 c7005, C7005 c70052, List list, List list2, List list3, AbstractC4881 abstractC4881, Modality modality, C4489 c4489) {
        if (list == null) {
            m12267(14);
            throw null;
        }
        if (list2 == null) {
            m12267(15);
            throw null;
        }
        if (list3 == null) {
            m12267(16);
            throw null;
        }
        if (c4489 != null) {
            return mo9152(c7005, c70052, list, list2, list3, abstractC4881, modality, c4489, null);
        }
        m12267(17);
        throw null;
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4470 mo9012() {
        InterfaceC4470 interfaceC4470 = (InterfaceC4470) super.mo9012();
        if (interfaceC4470 != null) {
            return interfaceC4470;
        }
        m12267(24);
        throw null;
    }

    @Override // p079.AbstractC7001
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public AbstractC7001 mo9154(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4498 interfaceC4498, InterfaceC4483 interfaceC4483, InterfaceC4461 interfaceC4461, C4690 c4690, InterfaceC6480 interfaceC6480) {
        if (interfaceC4498 == null) {
            m12267(25);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12267(26);
            throw null;
        }
        if (interfaceC6480 == null) {
            m12267(27);
            throw null;
        }
        InterfaceC4470 interfaceC4470 = (InterfaceC4470) interfaceC4483;
        if (c4690 == null) {
            c4690 = getName();
        }
        return new C6980(interfaceC4498, interfaceC4470, interfaceC6480, c4690, callableMemberDescriptor$Kind, interfaceC4461);
    }

    @Override // p079.AbstractC7001, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public InterfaceC4491 mo9052() {
        return m12309(C4918.f14244);
    }
}
