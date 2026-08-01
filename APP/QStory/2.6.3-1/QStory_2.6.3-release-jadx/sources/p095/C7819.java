package p095;

import bsh.C3466;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5524;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import net.bytebuddy.description.method.MethodDescription;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7819 extends AbstractC7823 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C7819 f19050;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC5288 f19051;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7819(InterfaceC5305 interfaceC5305, InterfaceC7310 interfaceC7310, Modality modality, C5322 c5322, boolean z, boolean z2, boolean z3, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C7819 c7819, InterfaceC5294 interfaceC5294) {
        super(modality, c5322, interfaceC5305, interfaceC7310, C5523.m9892("<set-" + interfaceC5305.getName() + ">"), z, z2, z3, callableMemberDescriptor$Kind, interfaceC5294);
        if (interfaceC7310 == null) {
            m12870(1);
            throw null;
        }
        if (modality == null) {
            m12870(2);
            throw null;
        }
        if (c5322 == null) {
            m12870(3);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12870(4);
            throw null;
        }
        if (interfaceC5294 == null) {
            m12870(5);
            throw null;
        }
        this.f19050 = c7819 != null ? c7819 : this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static C7808 m12869(C7819 c7819, AbstractC5714 abstractC5714, InterfaceC7310 interfaceC7310) {
        if (abstractC5714 == null) {
            m12870(8);
            throw null;
        }
        if (interfaceC7310 != null) {
            return new C7808(c7819, null, 0, interfaceC7310, AbstractC5524.f14057, abstractC5714, false, false, false, null, InterfaceC5294.f13436);
        }
        m12870(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12870(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    public final AbstractC5714 getReturnType() {
        return AbstractC5605.m10058(this).m12587();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final List mo9594() {
        InterfaceC5288 interfaceC5288 = this.f19051;
        if (interfaceC5288 == null) {
            C3466.m5901();
            return null;
        }
        List listSingletonList = Collections.singletonList(interfaceC5288);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m12870(11);
        throw null;
    }

    @Override // p095.AbstractC7837, p095.AbstractC7838, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7819 mo9561() {
        C7819 c7819 = this.f19050;
        if (c7819 != null) {
            return c7819;
        }
        m12870(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return interfaceC5329.mo829(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9589() {
        return m12886(false);
    }
}
