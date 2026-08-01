package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5314;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p062.C7311;
import p062.InterfaceC7310;
import p082.AbstractC7705;
import p093.C7802;
import p095.AbstractC7831;
import p095.C7810;
import p095.C7832;
import p095.C7835;
import p099.C7868;
import p120.AbstractC8123;
import p120.C8108;
import p120.C8124;
import p120.InterfaceC8109;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5397 extends C7810 implements InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C5398 f13663 = new C5398();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final C5398 f13664 = new C5398();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f13665;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public JavaMethodDescriptor$ParameterNamesStatus f13666;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5397(InterfaceC5331 interfaceC5331, InterfaceC5303 interfaceC5303, InterfaceC7310 interfaceC7310, C5523 c5523, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5294 interfaceC5294, boolean z) {
        super(interfaceC5331, interfaceC5303, interfaceC7310, c5523, callableMemberDescriptor$Kind, interfaceC5294);
        if (interfaceC5331 == null) {
            m9700(0);
            throw null;
        }
        if (interfaceC7310 == null) {
            m9700(1);
            throw null;
        }
        if (c5523 == null) {
            m9700(2);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9700(3);
            throw null;
        }
        this.f13666 = null;
        this.f13665 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public static C5397 m9699(InterfaceC5331 interfaceC5331, C7868 c7868, C5523 c5523, C7802 c7802, boolean z) {
        if (interfaceC5331 == null) {
            m9700(5);
            throw null;
        }
        if (c5523 != null) {
            return new C5397(interfaceC5331, null, c7868, c5523, CallableMemberDescriptor$Kind.DECLARATION, c7802, z);
        }
        m9700(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m9700(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final InterfaceC5401 mo9696(AbstractC5714 abstractC5714, ArrayList arrayList, AbstractC5714 abstractC57142, Pair pair) {
        ArrayList arrayListM14245 = AbstractC9019.m14245(arrayList, mo9594(), this);
        C7835 c7835M12690 = abstractC5714 == null ? null : AbstractC7705.m12690(this, abstractC5714, C7311.f18113);
        C7832 c7832M12895 = m12895(C5751.f14593);
        c7832M12895.f19151 = arrayListM14245;
        c7832M12895.f19138 = abstractC57142;
        c7832M12895.f19149 = c7835M12690;
        c7832M12895.f19145 = true;
        c7832M12895.f19134 = true;
        C5397 c5397 = (C5397) c7832M12895.f19133.mo12549(c7832M12895);
        if (pair != null) {
            c5397.m12894((InterfaceC5314) pair.getFirst(), pair.getSecond());
        }
        if (c5397 != null) {
            return c5397;
        }
        m9700(21);
        throw null;
    }

    @Override // p095.C7810
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final C7810 mo9701(C7835 c7835, C7835 c78352, List list, List list2, List list3, AbstractC5714 abstractC5714, Modality modality, C5322 c5322, Map map) {
        C8108 c8108;
        if (list == null) {
            m9700(9);
            throw null;
        }
        if (list2 == null) {
            m9700(10);
            throw null;
        }
        if (list3 == null) {
            m9700(11);
            throw null;
        }
        if (c5322 == null) {
            m9700(12);
            throw null;
        }
        super.mo9701(c7835, c78352, list, list2, list3, abstractC5714, modality, c5322, map);
        for (C8124 c8124 : AbstractC8123.f19764) {
            Regex regex = c8124.f19768;
            C5523 c5523 = c8124.f19769;
            if (c5523 == null || AbstractC5227.m9466(getName(), c5523)) {
                if (regex != null) {
                    String strM9894 = getName().m9894();
                    strM9894.getClass();
                    if (!regex.matches(strM9894)) {
                        continue;
                    }
                }
                Collection collection = c8124.f19767;
                if (collection == null || collection.contains(getName())) {
                    InterfaceC8109[] interfaceC8109Arr = c8124.f19765;
                    int length = interfaceC8109Arr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            c8108 = ((String) c8124.f19766.invoke(this)) != null ? new C8108(false) : C8108.f19723;
                        } else {
                            if (interfaceC8109Arr[i].mo13055(this) != null) {
                                c8108 = new C8108(false);
                                break;
                            }
                            i++;
                        }
                    }
                    this.f19116 = c8108.f19722;
                    return this;
                }
            }
        }
        c8108 = C8108.f19724;
        this.f19116 = c8108.f19722;
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m9702(boolean z, boolean z2) {
        this.f13666 = JavaMethodDescriptor$ParameterNamesStatus.get(z, z2);
    }

    @Override // p095.C7810, p095.AbstractC7831
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final AbstractC7831 mo9703(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5331 interfaceC5331, InterfaceC5316 interfaceC5316, InterfaceC5294 interfaceC5294, C5523 c5523, InterfaceC7310 interfaceC7310) {
        if (interfaceC5331 == null) {
            m9700(14);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9700(15);
            throw null;
        }
        if (interfaceC7310 == null) {
            m9700(16);
            throw null;
        }
        InterfaceC5303 interfaceC5303 = (InterfaceC5303) interfaceC5316;
        if (c5523 == null) {
            c5523 = getName();
        }
        C5397 c5397 = new C5397(interfaceC5331, interfaceC5303, interfaceC7310, c5523, callableMemberDescriptor$Kind, interfaceC5294, this.f13665);
        JavaMethodDescriptor$ParameterNamesStatus javaMethodDescriptor$ParameterNamesStatus = this.f13666;
        c5397.m9702(javaMethodDescriptor$ParameterNamesStatus.isStable, javaMethodDescriptor$ParameterNamesStatus.isSynthesized);
        return c5397;
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9595() {
        return this.f13666.isSynthesized;
    }
}
