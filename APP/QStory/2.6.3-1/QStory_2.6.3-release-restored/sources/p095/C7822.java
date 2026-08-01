package p095;

import androidx.compose.runtime.AbstractC2167;
import bsh.C3466;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5748;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p062.InterfaceC7310;
import p068.InterfaceC7372;
import p116.C8075;
import p116.C8076;
import p119.AbstractC8104;
import p119.C8102;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7822 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public CallableMemberDescriptor$Kind f19076;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C5322 f19078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Modality f19079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC5331 f19080;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7835 f19081;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final /* synthetic */ C7821 f19083;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5523 f19084;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC5714 f19085;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC5305 f19077 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC5748 f19075 = AbstractC5748.f14588;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f19082 = true;

    public C7822(C7821 c7821) {
        this.f19083 = c7821;
        this.f19080 = c7821.mo9587();
        this.f19079 = c7821.mo9568();
        this.f19078 = c7821.getVisibility();
        this.f19076 = c7821.getKind();
        this.f19081 = c7821.f19066;
        this.f19084 = c7821.getName();
        this.f19085 = c7821.getType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12882(int i) {
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
    public final C7821 m12883() throws Exception {
        C7835 c7835;
        C7835 c78352;
        C7820 c7820;
        C7819 c7819;
        C5751 c5751;
        InterfaceC7372 interfaceC7372;
        C7835 c78353;
        C7835 c78354;
        InterfaceC5331 interfaceC5331 = this.f19080;
        Modality modality = this.f19079;
        C5322 c5322 = this.f19078;
        InterfaceC5305 interfaceC5305 = this.f19077;
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = this.f19076;
        C5523 c5523 = this.f19084;
        C7821 c7821 = this.f19083;
        C7821 c7821Mo9698 = c7821.mo9698(interfaceC5331, modality, c5322, interfaceC5305, callableMemberDescriptor$Kind, c5523);
        List typeParameters = c7821.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        C5751 c5751M10361 = AbstractC5725.m10361(typeParameters, this.f19075, c7821Mo9698, arrayList);
        Variance variance = Variance.OUT_VARIANCE;
        AbstractC5714 abstractC5714 = this.f19085;
        AbstractC5714 abstractC5714M10421 = c5751M10361.m10421(abstractC5714, variance);
        if (abstractC5714M10421 != null) {
            Variance variance2 = Variance.IN_VARIANCE;
            AbstractC5714 abstractC5714M104212 = c5751M10361.m10421(abstractC5714, variance2);
            if (abstractC5714M104212 != null) {
                c7821Mo9698.mo9697(abstractC5714M104212);
            }
            C7835 c78355 = this.f19081;
            if (c78355 != null) {
                C7835 c7835Mo9564 = c78355.mo9564(c5751M10361);
                c7835 = c7835Mo9564 != null ? c7835Mo9564 : null;
            }
            C7835 c78356 = c7821.f19065;
            if (c78356 != null) {
                AbstractC5714 abstractC5714M104213 = c5751M10361.m10421(c78356.getType(), variance2);
                if (abstractC5714M104213 == null) {
                    c78354 = null;
                } else {
                    c78356.m12903();
                    c78354 = new C7835(c7821Mo9698, new C8075(c7821Mo9698, abstractC5714M104213), c78356.getAnnotations());
                }
                c78352 = c78354;
            } else {
                c78352 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C7835 c78357 : c7821.f19067) {
                AbstractC5714 abstractC5714M104214 = c5751M10361.m10421(c78357.getType(), Variance.IN_VARIANCE);
                if (abstractC5714M104214 == null) {
                    c78353 = null;
                } else {
                    C5523 c5523M13032 = ((C8076) c78357.m12903()).m13032();
                    c78357.m12903();
                    c78353 = new C7835(c7821Mo9698, new C8076(c7821Mo9698, abstractC5714M104214, c5523M13032), c78357.getAnnotations());
                }
                if (c78353 != null) {
                    arrayList2.add(c78353);
                }
            }
            c7821Mo9698.m12879(abstractC5714M10421, arrayList, c7835, c78352, arrayList2);
            C7820 c78202 = c7821.f19055;
            C5293 c5293 = InterfaceC5294.f13436;
            if (c78202 == null) {
                c7820 = null;
            } else {
                InterfaceC7310 annotations = c78202.getAnnotations();
                Modality modality2 = this.f19079;
                C5322 visibility = c7821.f19055.getVisibility();
                if (this.f19076 == CallableMemberDescriptor$Kind.FAKE_OVERRIDE && AbstractC5321.m9626(AbstractC5321.m9631(visibility.f13476.mo9657()))) {
                    visibility = AbstractC5321.f13469;
                }
                C5322 c53222 = visibility;
                C7820 c78203 = c7821.f19055;
                boolean z = c78203.f19089;
                boolean z2 = c78203.f19092;
                boolean z3 = c78203.f19091;
                CallableMemberDescriptor$Kind callableMemberDescriptor$Kind2 = this.f19076;
                InterfaceC5305 interfaceC53052 = this.f19077;
                c7820 = new C7820(c7821Mo9698, annotations, modality2, c53222, z, z2, z3, callableMemberDescriptor$Kind2, interfaceC53052 == null ? null : interfaceC53052.getGetter(), c5293);
            }
            if (c7820 != null) {
                C7820 c78204 = c7821.f19055;
                AbstractC5714 abstractC57142 = c78204.f19053;
                c7820.f19086 = C7821.m12875(c5751M10361, c78204);
                c7820.m12873(abstractC57142 != null ? c5751M10361.m10421(abstractC57142, Variance.OUT_VARIANCE) : null);
            }
            C7819 c78192 = c7821.f19058;
            if (c78192 == null) {
                c7819 = null;
            } else {
                InterfaceC7310 annotations2 = c78192.getAnnotations();
                Modality modality3 = this.f19079;
                C5322 visibility2 = c7821.f19058.getVisibility();
                if (this.f19076 == CallableMemberDescriptor$Kind.FAKE_OVERRIDE && AbstractC5321.m9626(AbstractC5321.m9631(visibility2.f13476.mo9657()))) {
                    visibility2 = AbstractC5321.f13469;
                }
                C5322 c53223 = visibility2;
                C7819 c78193 = c7821.f19058;
                boolean z4 = c78193.f19089;
                boolean z5 = c78193.f19092;
                boolean z6 = c78193.f19091;
                CallableMemberDescriptor$Kind callableMemberDescriptor$Kind3 = this.f19076;
                InterfaceC5305 interfaceC53053 = this.f19077;
                c7819 = new C7819(c7821Mo9698, annotations2, modality3, c53223, z4, z5, z6, callableMemberDescriptor$Kind3, interfaceC53053 == null ? null : interfaceC53053.getSetter(), c5293);
            }
            if (c7819 != null) {
                c5751 = c5751M10361;
                List listM12890 = AbstractC7831.m12890(c7819, c7821.f19058.mo9594(), c5751, false, false, null);
                if (listM12890 == null) {
                    listM12890 = Collections.singletonList(C7819.m12869(c7819, AbstractC5605.m10058(this.f19080).m12590(), ((AbstractC2167) ((InterfaceC5288) c7821.f19058.mo9594().get(0))).getAnnotations()));
                }
                if (listM12890.size() != 1) {
                    C3466.m5901();
                    return null;
                }
                c7819.f19086 = C7821.m12875(c5751, c7821.f19058);
                InterfaceC5288 interfaceC5288 = (InterfaceC5288) listM12890.get(0);
                if (interfaceC5288 == null) {
                    C7819.m12870(6);
                    throw null;
                }
                c7819.f19051 = interfaceC5288;
            } else {
                c5751 = c5751M10361;
            }
            C7840 c7840 = c7821.f19057;
            C7840 c78402 = c7840 == null ? null : new C7840(c7840.getAnnotations(), c7821Mo9698);
            C7840 c78403 = c7821.f19054;
            c7821Mo9698.m12880(c7820, c7819, c78402, c78403 != null ? new C7840(c78403.getAnnotations(), c7821Mo9698) : null);
            if (this.f19082) {
                int i = C8102.f19715;
                C8102 c8102M13048 = AbstractC8104.m13048();
                Iterator it = c7821.mo9589().iterator();
                while (it.hasNext()) {
                    c8102M13048.add(((InterfaceC5305) it.next()).mo9564(c5751));
                }
                c7821Mo9698.f19063 = c8102M13048;
            }
            if (c7821.isConst() && (interfaceC7372 = c7821.f19071) != null) {
                c7821Mo9698.m12881(c7821.f19074, interfaceC7372);
            }
            return c7821Mo9698;
        }
        return null;
    }
}
