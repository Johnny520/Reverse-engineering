package p095;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import net.bytebuddy.description.method.MethodDescription;
import p062.C7311;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7810 extends AbstractC7831 implements InterfaceC5303 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7810(InterfaceC5331 interfaceC5331, InterfaceC5303 interfaceC5303, InterfaceC7310 interfaceC7310, C5523 c5523, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5294 interfaceC5294) {
        super(callableMemberDescriptor$Kind, interfaceC5331, interfaceC5303, interfaceC5294, c5523, interfaceC7310);
        if (interfaceC5331 == null) {
            m12853(0);
            throw null;
        }
        if (interfaceC7310 == null) {
            m12853(1);
            throw null;
        }
        if (c5523 == null) {
            m12853(2);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12853(3);
            throw null;
        }
        if (interfaceC5294 != null) {
        } else {
            m12853(4);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public static C7810 m12852(AbstractC7818 abstractC7818, C5523 c5523, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5294 interfaceC5294) {
        if (abstractC7818 == null) {
            m12853(5);
            throw null;
        }
        if (c5523 == null) {
            m12853(7);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12853(8);
            throw null;
        }
        if (interfaceC5294 != null) {
            return new C7810(abstractC7818, null, C7311.f18113, c5523, callableMemberDescriptor$Kind, interfaceC5294);
        }
        m12853(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12853(int i) {
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
    public C7810 mo9701(C7835 c7835, C7835 c78352, List list, List list2, List list3, AbstractC5714 abstractC5714, Modality modality, C5322 c5322, Map map) {
        if (list == null) {
            m12853(19);
            throw null;
        }
        if (list2 == null) {
            m12853(20);
            throw null;
        }
        if (list3 == null) {
            m12853(21);
            throw null;
        }
        if (c5322 == null) {
            m12853(22);
            throw null;
        }
        super.mo12856(c7835, c78352, list, list2, list3, abstractC5714, modality, c5322);
        if (map != null && !map.isEmpty()) {
            this.f19106 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // p095.AbstractC7831
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7810 mo12856(C7835 c7835, C7835 c78352, List list, List list2, List list3, AbstractC5714 abstractC5714, Modality modality, C5322 c5322) {
        if (list == null) {
            m12853(14);
            throw null;
        }
        if (list2 == null) {
            m12853(15);
            throw null;
        }
        if (list3 == null) {
            m12853(16);
            throw null;
        }
        if (c5322 != null) {
            return mo9701(c7835, c78352, list, list2, list3, abstractC5714, modality, c5322, null);
        }
        m12853(17);
        throw null;
    }

    @Override // p095.AbstractC7837, p095.AbstractC7838, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC5303 mo9561() {
        InterfaceC5303 interfaceC5303 = (InterfaceC5303) super.mo9561();
        if (interfaceC5303 != null) {
            return interfaceC5303;
        }
        m12853(24);
        throw null;
    }

    @Override // p095.AbstractC7831
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public AbstractC7831 mo9703(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5331 interfaceC5331, InterfaceC5316 interfaceC5316, InterfaceC5294 interfaceC5294, C5523 c5523, InterfaceC7310 interfaceC7310) {
        if (interfaceC5331 == null) {
            m12853(25);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12853(26);
            throw null;
        }
        if (interfaceC7310 == null) {
            m12853(27);
            throw null;
        }
        InterfaceC5303 interfaceC5303 = (InterfaceC5303) interfaceC5316;
        if (c5523 == null) {
            c5523 = getName();
        }
        return new C7810(interfaceC5331, interfaceC5303, interfaceC7310, c5523, callableMemberDescriptor$Kind, interfaceC5294);
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public InterfaceC5324 mo9601() {
        return m12895(C5751.f14593);
    }
}
