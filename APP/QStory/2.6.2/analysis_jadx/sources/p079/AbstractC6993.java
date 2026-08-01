package p079;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6993 extends AbstractC7007 implements InterfaceC4483 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public InterfaceC4483 f18746;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C4489 f18747;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final CallableMemberDescriptor$Kind f18748;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f18749;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC4472 f18750;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f18751;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f18752;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Modality f18753;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6993(Modality modality, C4489 c4489, InterfaceC4472 interfaceC4472, InterfaceC6480 interfaceC6480, C4690 c4690, boolean z, boolean z2, boolean z3, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4461 interfaceC4461) {
        super(interfaceC4472.mo9038(), interfaceC6480, c4690, interfaceC4461);
        if (modality == null) {
            m12298(0);
            throw null;
        }
        if (c4489 == null) {
            m12298(1);
            throw null;
        }
        if (interfaceC6480 == null) {
            m12298(3);
            throw null;
        }
        if (interfaceC4461 == null) {
            m12298(5);
            throw null;
        }
        this.f18746 = null;
        this.f18753 = modality;
        this.f18747 = c4489;
        this.f18750 = interfaceC4472;
        this.f18749 = z;
        this.f18752 = z2;
        this.f18751 = z3;
        this.f18748 = callableMemberDescriptor$Kind;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12298(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479
    public final CallableMemberDescriptor$Kind getKind() {
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = this.f18748;
        if (callableMemberDescriptor$Kind != null) {
            return callableMemberDescriptor$Kind;
        }
        m12298(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12298(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497
    public final C4489 getVisibility() {
        C4489 c4489 = this.f18747;
        if (c4489 != null) {
            return c4489;
        }
        m12298(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    public final boolean isExternal() {
        return this.f18752;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    public final boolean isInline() {
        return this.f18751;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final C7005 mo9042() {
        return m12299().mo9042();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo9043(InterfaceC4481 interfaceC4481) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final InterfaceC4483 mo9048() {
        return this.f18746;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final C7005 mo9044() {
        return m12299().mo9044();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo9049() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final InterfaceC4472 m12299() {
        InterfaceC4472 interfaceC4472 = this.f18750;
        if (interfaceC4472 != null) {
            return interfaceC4472;
        }
        m12298(13);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final ArrayList m12300(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC4472 interfaceC4472 : m12299().mo9040()) {
            AbstractC7008 getter = z ? interfaceC4472.getGetter() : interfaceC4472.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC4483 mo9015(C4918 c4918) {
        if (c4918 != null) {
            return this;
        }
        m12298(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9046() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9018() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9019() {
        Modality modality = this.f18753;
        if (modality != null) {
            return modality;
        }
        m12298(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4479 mo9039(AbstractC6988 abstractC6988, Modality modality, C4489 c4489, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo9041(Collection collection) {
        if (collection != null) {
            return;
        }
        m12298(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final boolean mo9050() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9026() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final boolean mo9051() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final List mo9047() {
        List listMo9047 = m12299().mo9047();
        if (listMo9047 != null) {
            return listMo9047;
        }
        m12298(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final /* bridge */ /* synthetic */ InterfaceC4499 mo9015(C4918 c4918) {
        mo9015(c4918);
        return this;
    }
}
