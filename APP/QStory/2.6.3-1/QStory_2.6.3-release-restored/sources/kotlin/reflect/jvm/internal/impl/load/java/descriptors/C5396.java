package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5314;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5447;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5692;
import net.bytebuddy.description.method.MethodDescription;
import p062.C7311;
import p062.C7314;
import p062.InterfaceC7310;
import p065.AbstractC7358;
import p065.AbstractC7359;
import p068.InterfaceC7372;
import p082.AbstractC7705;
import p089.AbstractC7761;
import p093.C7802;
import p095.C7819;
import p095.C7820;
import p095.C7821;
import p099.C7868;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5396 extends C7821 implements InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Pair f13661;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean f13662;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5396(InterfaceC5331 interfaceC5331, InterfaceC7310 interfaceC7310, Modality modality, C5322 c5322, boolean z, C5523 c5523, InterfaceC5294 interfaceC5294, InterfaceC5305 interfaceC5305, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, boolean z2, Pair pair) {
        super(interfaceC5331, interfaceC5305, interfaceC7310, modality, c5322, z, c5523, callableMemberDescriptor$Kind, interfaceC5294, false, false, false, false, false);
        if (interfaceC5331 == null) {
            m9695(0);
            throw null;
        }
        if (interfaceC7310 == null) {
            m9695(1);
            throw null;
        }
        if (modality == null) {
            m9695(2);
            throw null;
        }
        if (c5322 == null) {
            m9695(3);
            throw null;
        }
        if (c5523 == null) {
            m9695(4);
            throw null;
        }
        if (interfaceC5294 == null) {
            m9695(5);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9695(6);
            throw null;
        }
        this.f13662 = z2;
        this.f13661 = pair;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public static C5396 m9694(InterfaceC5331 interfaceC5331, C7868 c7868, Modality modality, C5322 c5322, boolean z, C5523 c5523, C7802 c7802, boolean z2) {
        if (interfaceC5331 == null) {
            m9695(7);
            throw null;
        }
        if (modality == null) {
            m9695(9);
            throw null;
        }
        if (c5523 != null) {
            return new C5396(interfaceC5331, c7868, modality, c5322, z, c5523, c7802, null, CallableMemberDescriptor$Kind.DECLARATION, z2, null);
        }
        m9695(11);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m9695(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p095.C7821, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5287
    public final boolean isConst() {
        AbstractC5714 type = getType();
        if (!this.f13662) {
            return false;
        }
        type.getClass();
        if (((!AbstractC7359.m12576(type) && !AbstractC7358.m12566(type)) || AbstractC5749.m10403(type)) && !AbstractC7359.m12575(type)) {
            return false;
        }
        C7314 c7314 = AbstractC7761.f18838;
        C5519 c5519 = AbstractC5447.f13835;
        c5519.getClass();
        return !AbstractC5692.m10256(type, c5519) || AbstractC7359.m12575(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final InterfaceC5401 mo9696(AbstractC5714 abstractC5714, ArrayList arrayList, AbstractC5714 abstractC57142, Pair pair) {
        AbstractC5714 abstractC57143;
        C7820 c7820;
        C7819 c7819;
        InterfaceC5305 interfaceC5305Mo9561 = mo9561() == this ? null : mo9561();
        C5396 c5396 = new C5396(mo9587(), getAnnotations(), mo9568(), getVisibility(), this.f19073, getName(), mo9585(), interfaceC5305Mo9561, getKind(), this.f13662, pair);
        C7820 c78202 = this.f19055;
        if (c78202 != null) {
            C7820 c78203 = new C7820(c5396, c78202.getAnnotations(), c78202.mo9568(), c78202.getVisibility(), c78202.f19089, c78202.f19092, c78202.f19091, getKind(), interfaceC5305Mo9561 == null ? null : interfaceC5305Mo9561.getGetter(), c78202.mo9585());
            c78203.f19086 = c78202.f19086;
            abstractC57143 = abstractC57142;
            c78203.f19053 = abstractC57143;
            c7820 = c78203;
        } else {
            abstractC57143 = abstractC57142;
            c7820 = null;
        }
        C7819 c78192 = this.f19058;
        if (c78192 != null) {
            c7819 = new C7819(c5396, c78192.getAnnotations(), c78192.mo9568(), c78192.getVisibility(), c78192.f19089, c78192.f19092, c78192.f19091, getKind(), interfaceC5305Mo9561 == null ? null : interfaceC5305Mo9561.getSetter(), c78192.mo9585());
            c7819.f19086 = c7819.f19086;
            InterfaceC5288 interfaceC5288 = (InterfaceC5288) c78192.mo9594().get(0);
            if (interfaceC5288 == null) {
                C7819.m12870(6);
                throw null;
            }
            c7819.f19051 = interfaceC5288;
        } else {
            c7819 = null;
        }
        c5396.m12880(c7820, c7819, this.f19057, this.f19054);
        InterfaceC7372 interfaceC7372 = this.f19071;
        if (interfaceC7372 != null) {
            c5396.m12881(this.f19074, interfaceC7372);
        }
        c5396.mo9590(mo9589());
        c5396.m12879(abstractC57143, getTypeParameters(), this.f19066, abstractC5714 != null ? AbstractC7705.m12690(this, abstractC5714, C7311.f18113) : null, EmptyList.INSTANCE);
        return c5396;
    }

    @Override // p095.C7821, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo9592(InterfaceC5314 interfaceC5314) {
        Pair pair = this.f13661;
        if (pair == null || !((InterfaceC5314) pair.getFirst()).equals(interfaceC5314)) {
            return null;
        }
        return pair.getSecond();
    }

    @Override // p095.C7821
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final C7821 mo9698(InterfaceC5331 interfaceC5331, Modality modality, C5322 c5322, InterfaceC5305 interfaceC5305, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C5523 c5523) {
        if (interfaceC5331 == null) {
            m9695(13);
            throw null;
        }
        if (modality == null) {
            m9695(14);
            throw null;
        }
        if (c5322 == null) {
            m9695(15);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m9695(16);
            throw null;
        }
        if (c5523 == null) {
            m9695(17);
            throw null;
        }
        return new C5396(interfaceC5331, getAnnotations(), modality, c5322, this.f19073, c5523, InterfaceC5294.f13436, interfaceC5305, callableMemberDescriptor$Kind, this.f13662, this.f13661);
    }

    @Override // p095.AbstractC7806, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9595() {
        return false;
    }

    @Override // p095.C7821
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void mo9697(AbstractC5714 abstractC5714) {
    }
}
