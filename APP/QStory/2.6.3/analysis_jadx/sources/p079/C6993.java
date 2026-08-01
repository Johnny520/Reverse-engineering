package p079;

import androidx.compose.runtime.AbstractC1332;
import bsh.C2633;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p046.InterfaceC6481;
import p052.InterfaceC6543;
import p100.C7246;
import p100.C7247;
import p103.AbstractC7275;
import p103.C7273;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6993 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public CallableMemberDescriptor$Kind f18731;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4490 f18733;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Modality f18734;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC4499 f18735;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7006 f18736;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final /* synthetic */ C6992 f18738;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4691 f18739;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC4882 f18740;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC4473 f18732 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC4916 f18730 = AbstractC4916.f14243;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f18737 = true;

    public C6993(C6992 c6992) {
        this.f18738 = c6992;
        this.f18735 = c6992.mo9028();
        this.f18734 = c6992.mo9009();
        this.f18733 = c6992.getVisibility();
        this.f18731 = c6992.getKind();
        this.f18736 = c6992.f18721;
        this.f18739 = c6992.getName();
        this.f18740 = c6992.getType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12323(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i == 1) {
            objArr[1] = "setOwner";
        } else if (i == 2) {
            objArr[1] = "setOriginal";
        } else if (i == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i == 5) {
            objArr[1] = "setReturnType";
        } else if (i == 7) {
            objArr[1] = "setModality";
        } else if (i == 9) {
            objArr[1] = "setVisibility";
        } else if (i == 11) {
            objArr[1] = "setKind";
        } else if (i == 19) {
            objArr[1] = "setName";
        } else if (i == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i == 16) {
            objArr[1] = "setSubstitution";
        } else if (i != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6992 m12324() throws Exception {
        C7006 c7006;
        C7006 c70062;
        C6991 c6991;
        C6990 c6990;
        C4919 c4919;
        InterfaceC6543 interfaceC6543;
        C7006 c70063;
        C7006 c70064;
        InterfaceC4499 interfaceC4499 = this.f18735;
        Modality modality = this.f18734;
        C4490 c4490 = this.f18733;
        InterfaceC4473 interfaceC4473 = this.f18732;
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = this.f18731;
        C4691 c4691 = this.f18739;
        C6992 c6992 = this.f18738;
        C6992 c6992Mo9139 = c6992.mo9139(interfaceC4499, modality, c4490, interfaceC4473, callableMemberDescriptor$Kind, c4691);
        List typeParameters = c6992.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        C4919 c4919M9802 = AbstractC4893.m9802(typeParameters, this.f18730, c6992Mo9139, arrayList);
        Variance variance = Variance.OUT_VARIANCE;
        AbstractC4882 abstractC4882 = this.f18740;
        AbstractC4882 abstractC4882M9862 = c4919M9802.m9862(abstractC4882, variance);
        if (abstractC4882M9862 != null) {
            Variance variance2 = Variance.IN_VARIANCE;
            AbstractC4882 abstractC4882M98622 = c4919M9802.m9862(abstractC4882, variance2);
            if (abstractC4882M98622 != null) {
                c6992Mo9139.mo9138(abstractC4882M98622);
            }
            C7006 c70065 = this.f18736;
            if (c70065 != null) {
                C7006 c7006Mo9005 = c70065.mo9005(c4919M9802);
                c7006 = c7006Mo9005 != null ? c7006Mo9005 : null;
            }
            C7006 c70066 = c6992.f18720;
            if (c70066 != null) {
                AbstractC4882 abstractC4882M98623 = c4919M9802.m9862(c70066.getType(), variance2);
                if (abstractC4882M98623 == null) {
                    c70064 = null;
                } else {
                    c70066.m12344();
                    c70064 = new C7006(c6992Mo9139, new C7246(c6992Mo9139, abstractC4882M98623), c70066.getAnnotations());
                }
                c70062 = c70064;
            } else {
                c70062 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C7006 c70067 : c6992.f18722) {
                AbstractC4882 abstractC4882M98624 = c4919M9802.m9862(c70067.getType(), Variance.IN_VARIANCE);
                if (abstractC4882M98624 == null) {
                    c70063 = null;
                } else {
                    C4691 c4691M12473 = ((C7247) c70067.m12344()).m12473();
                    c70067.m12344();
                    c70063 = new C7006(c6992Mo9139, new C7247(c6992Mo9139, abstractC4882M98624, c4691M12473), c70067.getAnnotations());
                }
                if (c70063 != null) {
                    arrayList2.add(c70063);
                }
            }
            c6992Mo9139.m12320(abstractC4882M9862, arrayList, c7006, c70062, arrayList2);
            C6991 c69912 = c6992.f18710;
            C4461 c4461 = InterfaceC4462.f13091;
            if (c69912 == null) {
                c6991 = null;
            } else {
                InterfaceC6481 annotations = c69912.getAnnotations();
                Modality modality2 = this.f18734;
                C4490 visibility = c6992.f18710.getVisibility();
                if (this.f18731 == CallableMemberDescriptor$Kind.FAKE_OVERRIDE && AbstractC4489.m9067(AbstractC4489.m9072(visibility.f13131.mo9098()))) {
                    visibility = AbstractC4489.f13124;
                }
                C4490 c44902 = visibility;
                C6991 c69913 = c6992.f18710;
                boolean z = c69913.f18744;
                boolean z2 = c69913.f18747;
                boolean z3 = c69913.f18746;
                CallableMemberDescriptor$Kind callableMemberDescriptor$Kind2 = this.f18731;
                InterfaceC4473 interfaceC44732 = this.f18732;
                c6991 = new C6991(c6992Mo9139, annotations, modality2, c44902, z, z2, z3, callableMemberDescriptor$Kind2, interfaceC44732 == null ? null : interfaceC44732.getGetter(), c4461);
            }
            if (c6991 != null) {
                C6991 c69914 = c6992.f18710;
                AbstractC4882 abstractC48822 = c69914.f18708;
                c6991.f18741 = C6992.m12316(c4919M9802, c69914);
                c6991.m12314(abstractC48822 != null ? c4919M9802.m9862(abstractC48822, Variance.OUT_VARIANCE) : null);
            }
            C6990 c69902 = c6992.f18713;
            if (c69902 == null) {
                c6990 = null;
            } else {
                InterfaceC6481 annotations2 = c69902.getAnnotations();
                Modality modality3 = this.f18734;
                C4490 visibility2 = c6992.f18713.getVisibility();
                if (this.f18731 == CallableMemberDescriptor$Kind.FAKE_OVERRIDE && AbstractC4489.m9067(AbstractC4489.m9072(visibility2.f13131.mo9098()))) {
                    visibility2 = AbstractC4489.f13124;
                }
                C4490 c44903 = visibility2;
                C6990 c69903 = c6992.f18713;
                boolean z4 = c69903.f18744;
                boolean z5 = c69903.f18747;
                boolean z6 = c69903.f18746;
                CallableMemberDescriptor$Kind callableMemberDescriptor$Kind3 = this.f18731;
                InterfaceC4473 interfaceC44733 = this.f18732;
                c6990 = new C6990(c6992Mo9139, annotations2, modality3, c44903, z4, z5, z6, callableMemberDescriptor$Kind3, interfaceC44733 == null ? null : interfaceC44733.getSetter(), c4461);
            }
            if (c6990 != null) {
                c4919 = c4919M9802;
                List listM12331 = AbstractC7002.m12331(c6990, c6992.f18713.mo9035(), c4919, false, false, null);
                if (listM12331 == null) {
                    listM12331 = Collections.singletonList(C6990.m12310(c6990, AbstractC4773.m9499(this.f18735).m12031(), ((AbstractC1332) ((InterfaceC4456) c6992.f18713.mo9035().get(0))).getAnnotations()));
                }
                if (listM12331.size() != 1) {
                    C2633.m5341();
                    return null;
                }
                c6990.f18741 = C6992.m12316(c4919, c6992.f18713);
                InterfaceC4456 interfaceC4456 = (InterfaceC4456) listM12331.get(0);
                if (interfaceC4456 == null) {
                    C6990.m12311(6);
                    throw null;
                }
                c6990.f18706 = interfaceC4456;
            } else {
                c4919 = c4919M9802;
            }
            C7011 c7011 = c6992.f18712;
            C7011 c70112 = c7011 == null ? null : new C7011(c7011.getAnnotations(), c6992Mo9139);
            C7011 c70113 = c6992.f18709;
            c6992Mo9139.m12321(c6991, c6990, c70112, c70113 != null ? new C7011(c70113.getAnnotations(), c6992Mo9139) : null);
            if (this.f18737) {
                int i = C7273.f19370;
                C7273 c7273M12489 = AbstractC7275.m12489();
                Iterator it = c6992.mo9030().iterator();
                while (it.hasNext()) {
                    c7273M12489.add(((InterfaceC4473) it.next()).mo9005(c4919));
                }
                c6992Mo9139.f18718 = c7273M12489;
            }
            if (c6992.isConst() && (interfaceC6543 = c6992.f18726) != null) {
                c6992Mo9139.m12322(c6992.f18729, interfaceC6543);
            }
            return c6992Mo9139;
        }
        return null;
    }
}
