package p095;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5314;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import net.bytebuddy.description.method.MethodDescription;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7823 extends AbstractC7837 implements InterfaceC5316 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public InterfaceC5316 f19086;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C5322 f19087;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final CallableMemberDescriptor$Kind f19088;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f19089;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5305 f19090;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f19091;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f19092;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Modality f19093;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7823(Modality modality, C5322 c5322, InterfaceC5305 interfaceC5305, InterfaceC7310 interfaceC7310, C5523 c5523, boolean z, boolean z2, boolean z3, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5294 interfaceC5294) {
        super(interfaceC5305.mo9587(), interfaceC7310, c5523, interfaceC5294);
        if (modality == null) {
            m12884(0);
            throw null;
        }
        if (c5322 == null) {
            m12884(1);
            throw null;
        }
        if (interfaceC7310 == null) {
            m12884(3);
            throw null;
        }
        if (interfaceC5294 == null) {
            m12884(5);
            throw null;
        }
        this.f19086 = null;
        this.f19093 = modality;
        this.f19087 = c5322;
        this.f19090 = interfaceC5305;
        this.f19089 = z;
        this.f19092 = z2;
        this.f19091 = z3;
        this.f19088 = callableMemberDescriptor$Kind;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12884(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312
    public final CallableMemberDescriptor$Kind getKind() {
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = this.f19088;
        if (callableMemberDescriptor$Kind != null) {
            return callableMemberDescriptor$Kind;
        }
        m12884(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12884(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5330
    public final C5322 getVisibility() {
        C5322 c5322 = this.f19087;
        if (c5322 != null) {
            return c5322;
        }
        m12884(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    public final boolean isExternal() {
        return this.f19092;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    public final boolean isInline() {
        return this.f19091;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final C7835 mo9591() {
        return m12885().mo9591();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo9592(InterfaceC5314 interfaceC5314) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final InterfaceC5316 mo9597() {
        return this.f19086;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final C7835 mo9593() {
        return m12885().mo9593();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo9598() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final InterfaceC5305 m12885() {
        InterfaceC5305 interfaceC5305 = this.f19090;
        if (interfaceC5305 != null) {
            return interfaceC5305;
        }
        m12884(13);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final ArrayList m12886(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC5305 interfaceC5305 : m12885().mo9589()) {
            AbstractC7838 getter = z ? interfaceC5305.getGetter() : interfaceC5305.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC5316 mo9564(C5751 c5751) {
        if (c5751 != null) {
            return this;
        }
        m12884(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9595() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9567() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9568() {
        Modality modality = this.f19093;
        if (modality != null) {
            return modality;
        }
        m12884(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC5312 mo9588(AbstractC7818 abstractC7818, Modality modality, C5322 c5322, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo9590(Collection collection) {
        if (collection != null) {
            return;
        }
        m12884(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final boolean mo9599() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9575() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final boolean mo9600() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final List mo9596() {
        List listMo9596 = m12885().mo9596();
        if (listMo9596 != null) {
            return listMo9596;
        }
        m12884(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final /* bridge */ /* synthetic */ InterfaceC5332 mo9564(C5751 c5751) {
        mo9564(c5751);
        return this;
    }
}
