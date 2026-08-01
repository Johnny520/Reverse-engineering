package p079;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6482;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6981 extends AbstractC7002 implements InterfaceC4471 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6981(InterfaceC4499 interfaceC4499, InterfaceC4471 interfaceC4471, InterfaceC6481 interfaceC6481, C4691 c4691, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4462 interfaceC4462) {
        super(callableMemberDescriptor$Kind, interfaceC4499, interfaceC4471, interfaceC4462, c4691, interfaceC6481);
        if (interfaceC4499 == null) {
            m12294(0);
            throw null;
        }
        if (interfaceC6481 == null) {
            m12294(1);
            throw null;
        }
        if (c4691 == null) {
            m12294(2);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12294(3);
            throw null;
        }
        if (interfaceC4462 != null) {
        } else {
            m12294(4);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public static C6981 m12293(AbstractC6989 abstractC6989, C4691 c4691, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4462 interfaceC4462) {
        if (abstractC6989 == null) {
            m12294(5);
            throw null;
        }
        if (c4691 == null) {
            m12294(7);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12294(8);
            throw null;
        }
        if (interfaceC4462 != null) {
            return new C6981(abstractC6989, null, C6482.f17768, c4691, callableMemberDescriptor$Kind, interfaceC4462);
        }
        m12294(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12294(int i) {
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
    public C6981 mo9142(C7006 c7006, C7006 c70062, List list, List list2, List list3, AbstractC4882 abstractC4882, Modality modality, C4490 c4490, Map map) {
        if (list == null) {
            m12294(19);
            throw null;
        }
        if (list2 == null) {
            m12294(20);
            throw null;
        }
        if (list3 == null) {
            m12294(21);
            throw null;
        }
        if (c4490 == null) {
            m12294(22);
            throw null;
        }
        super.mo12297(c7006, c70062, list, list2, list3, abstractC4882, modality, c4490);
        if (map != null && !map.isEmpty()) {
            this.f18761 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // p079.AbstractC7002
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6981 mo12297(C7006 c7006, C7006 c70062, List list, List list2, List list3, AbstractC4882 abstractC4882, Modality modality, C4490 c4490) {
        if (list == null) {
            m12294(14);
            throw null;
        }
        if (list2 == null) {
            m12294(15);
            throw null;
        }
        if (list3 == null) {
            m12294(16);
            throw null;
        }
        if (c4490 != null) {
            return mo9142(c7006, c70062, list, list2, list3, abstractC4882, modality, c4490, null);
        }
        m12294(17);
        throw null;
    }

    @Override // p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4471 mo9002() {
        InterfaceC4471 interfaceC4471 = (InterfaceC4471) super.mo9002();
        if (interfaceC4471 != null) {
            return interfaceC4471;
        }
        m12294(24);
        throw null;
    }

    @Override // p079.AbstractC7002
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public AbstractC7002 mo9144(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4499 interfaceC4499, InterfaceC4484 interfaceC4484, InterfaceC4462 interfaceC4462, C4691 c4691, InterfaceC6481 interfaceC6481) {
        if (interfaceC4499 == null) {
            m12294(25);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12294(26);
            throw null;
        }
        if (interfaceC6481 == null) {
            m12294(27);
            throw null;
        }
        InterfaceC4471 interfaceC4471 = (InterfaceC4471) interfaceC4484;
        if (c4691 == null) {
            c4691 = getName();
        }
        return new C6981(interfaceC4499, interfaceC4471, interfaceC6481, c4691, callableMemberDescriptor$Kind, interfaceC4462);
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public InterfaceC4492 mo9042() {
        return m12336(C4919.f14248);
    }
}
