package p079;

import androidx.compose.runtime.AbstractC1332;
import bsh.C2632;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4915;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p046.InterfaceC6480;
import p052.InterfaceC6542;
import p100.C7245;
import p100.C7246;
import p103.AbstractC7274;
import p103.C7272;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6992 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public CallableMemberDescriptor$Kind f18736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4489 f18738;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Modality f18739;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC4498 f18740;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7005 f18741;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final /* synthetic */ C6991 f18743;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4690 f18744;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC4881 f18745;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC4472 f18737 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC4915 f18735 = AbstractC4915.f14239;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f18742 = true;

    public C6992(C6991 c6991) {
        this.f18743 = c6991;
        this.f18740 = c6991.mo9038();
        this.f18739 = c6991.mo9019();
        this.f18738 = c6991.getVisibility();
        this.f18736 = c6991.getKind();
        this.f18741 = c6991.f18726;
        this.f18744 = c6991.getName();
        this.f18745 = c6991.getType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12296(int i) {
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
    public final C6991 m12297() throws Exception {
        C7005 c7005;
        C7005 c70052;
        C6990 c6990;
        C6989 c6989;
        C4918 c4918;
        InterfaceC6542 interfaceC6542;
        C7005 c70053;
        C7005 c70054;
        InterfaceC4498 interfaceC4498 = this.f18740;
        Modality modality = this.f18739;
        C4489 c4489 = this.f18738;
        InterfaceC4472 interfaceC4472 = this.f18737;
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = this.f18736;
        C4690 c4690 = this.f18744;
        C6991 c6991 = this.f18743;
        C6991 c6991Mo9149 = c6991.mo9149(interfaceC4498, modality, c4489, interfaceC4472, callableMemberDescriptor$Kind, c4690);
        List typeParameters = c6991.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        C4918 c4918M9808 = AbstractC4892.m9808(typeParameters, this.f18735, c6991Mo9149, arrayList);
        Variance variance = Variance.OUT_VARIANCE;
        AbstractC4881 abstractC4881 = this.f18745;
        AbstractC4881 abstractC4881M9868 = c4918M9808.m9868(abstractC4881, variance);
        if (abstractC4881M9868 != null) {
            Variance variance2 = Variance.IN_VARIANCE;
            AbstractC4881 abstractC4881M98682 = c4918M9808.m9868(abstractC4881, variance2);
            if (abstractC4881M98682 != null) {
                c6991Mo9149.mo9148(abstractC4881M98682);
            }
            C7005 c70055 = this.f18741;
            if (c70055 != null) {
                C7005 c7005Mo9015 = c70055.mo9015(c4918M9808);
                c7005 = c7005Mo9015 != null ? c7005Mo9015 : null;
            }
            C7005 c70056 = c6991.f18725;
            if (c70056 != null) {
                AbstractC4881 abstractC4881M98683 = c4918M9808.m9868(c70056.getType(), variance2);
                if (abstractC4881M98683 == null) {
                    c70054 = null;
                } else {
                    c70056.m12317();
                    c70054 = new C7005(c6991Mo9149, new C7245(c6991Mo9149, abstractC4881M98683), c70056.getAnnotations());
                }
                c70052 = c70054;
            } else {
                c70052 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C7005 c70057 : c6991.f18727) {
                AbstractC4881 abstractC4881M98684 = c4918M9808.m9868(c70057.getType(), Variance.IN_VARIANCE);
                if (abstractC4881M98684 == null) {
                    c70053 = null;
                } else {
                    C4690 c4690M12446 = ((C7246) c70057.m12317()).m12446();
                    c70057.m12317();
                    c70053 = new C7005(c6991Mo9149, new C7246(c6991Mo9149, abstractC4881M98684, c4690M12446), c70057.getAnnotations());
                }
                if (c70053 != null) {
                    arrayList2.add(c70053);
                }
            }
            c6991Mo9149.m12293(abstractC4881M9868, arrayList, c7005, c70052, arrayList2);
            C6990 c69902 = c6991.f18715;
            C4460 c4460 = InterfaceC4461.f13087;
            if (c69902 == null) {
                c6990 = null;
            } else {
                InterfaceC6480 annotations = c69902.getAnnotations();
                Modality modality2 = this.f18739;
                C4489 visibility = c6991.f18715.getVisibility();
                if (this.f18736 == CallableMemberDescriptor$Kind.FAKE_OVERRIDE && AbstractC4488.m9077(AbstractC4488.m9082(visibility.f13127.mo9108()))) {
                    visibility = AbstractC4488.f13120;
                }
                C4489 c44892 = visibility;
                C6990 c69903 = c6991.f18715;
                boolean z = c69903.f18749;
                boolean z2 = c69903.f18752;
                boolean z3 = c69903.f18751;
                CallableMemberDescriptor$Kind callableMemberDescriptor$Kind2 = this.f18736;
                InterfaceC4472 interfaceC44722 = this.f18737;
                c6990 = new C6990(c6991Mo9149, annotations, modality2, c44892, z, z2, z3, callableMemberDescriptor$Kind2, interfaceC44722 == null ? null : interfaceC44722.getGetter(), c4460);
            }
            if (c6990 != null) {
                C6990 c69904 = c6991.f18715;
                AbstractC4881 abstractC48812 = c69904.f18713;
                c6990.f18746 = C6991.m12289(c4918M9808, c69904);
                c6990.m12287(abstractC48812 != null ? c4918M9808.m9868(abstractC48812, Variance.OUT_VARIANCE) : null);
            }
            C6989 c69892 = c6991.f18718;
            if (c69892 == null) {
                c6989 = null;
            } else {
                InterfaceC6480 annotations2 = c69892.getAnnotations();
                Modality modality3 = this.f18739;
                C4489 visibility2 = c6991.f18718.getVisibility();
                if (this.f18736 == CallableMemberDescriptor$Kind.FAKE_OVERRIDE && AbstractC4488.m9077(AbstractC4488.m9082(visibility2.f13127.mo9108()))) {
                    visibility2 = AbstractC4488.f13120;
                }
                C4489 c44893 = visibility2;
                C6989 c69893 = c6991.f18718;
                boolean z4 = c69893.f18749;
                boolean z5 = c69893.f18752;
                boolean z6 = c69893.f18751;
                CallableMemberDescriptor$Kind callableMemberDescriptor$Kind3 = this.f18736;
                InterfaceC4472 interfaceC44723 = this.f18737;
                c6989 = new C6989(c6991Mo9149, annotations2, modality3, c44893, z4, z5, z6, callableMemberDescriptor$Kind3, interfaceC44723 == null ? null : interfaceC44723.getSetter(), c4460);
            }
            if (c6989 != null) {
                c4918 = c4918M9808;
                List listM12304 = AbstractC7001.m12304(c6989, c6991.f18718.mo9045(), c4918, false, false, null);
                if (listM12304 == null) {
                    listM12304 = Collections.singletonList(C6989.m12283(c6989, AbstractC4772.m9509(this.f18740).m11988(), ((AbstractC1332) ((InterfaceC4455) c6991.f18718.mo9045().get(0))).getAnnotations()));
                }
                if (listM12304.size() != 1) {
                    C2632.m5296();
                    return null;
                }
                c6989.f18746 = C6991.m12289(c4918, c6991.f18718);
                InterfaceC4455 interfaceC4455 = (InterfaceC4455) listM12304.get(0);
                if (interfaceC4455 == null) {
                    C6989.m12284(6);
                    throw null;
                }
                c6989.f18711 = interfaceC4455;
            } else {
                c4918 = c4918M9808;
            }
            C7010 c7010 = c6991.f18717;
            C7010 c70102 = c7010 == null ? null : new C7010(c7010.getAnnotations(), c6991Mo9149);
            C7010 c70103 = c6991.f18714;
            c6991Mo9149.m12294(c6990, c6989, c70102, c70103 != null ? new C7010(c70103.getAnnotations(), c6991Mo9149) : null);
            if (this.f18742) {
                int i = C7272.f19375;
                C7272 c7272M12462 = AbstractC7274.m12462();
                Iterator it = c6991.mo9040().iterator();
                while (it.hasNext()) {
                    c7272M12462.add(((InterfaceC4472) it.next()).mo9015(c4918));
                }
                c6991Mo9149.f18723 = c7272M12462;
            }
            if (c6991.isConst() && (interfaceC6542 = c6991.f18731) != null) {
                c6991Mo9149.m12295(c6991.f18734, interfaceC6542);
            }
            return c6991Mo9149;
        }
        return null;
    }
}
