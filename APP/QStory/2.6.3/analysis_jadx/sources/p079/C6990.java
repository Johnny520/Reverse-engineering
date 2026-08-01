package p079;

import bsh.C2633;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4692;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6990 extends AbstractC6994 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C6990 f18705;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC4456 f18706;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6990(InterfaceC4473 interfaceC4473, InterfaceC6481 interfaceC6481, Modality modality, C4490 c4490, boolean z, boolean z2, boolean z3, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C6990 c6990, InterfaceC4462 interfaceC4462) {
        super(modality, c4490, interfaceC4473, interfaceC6481, C4691.m9333("<set-" + interfaceC4473.getName() + ">"), z, z2, z3, callableMemberDescriptor$Kind, interfaceC4462);
        if (interfaceC6481 == null) {
            m12311(1);
            throw null;
        }
        if (modality == null) {
            m12311(2);
            throw null;
        }
        if (c4490 == null) {
            m12311(3);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12311(4);
            throw null;
        }
        if (interfaceC4462 == null) {
            m12311(5);
            throw null;
        }
        this.f18705 = c6990 != null ? c6990 : this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static C6979 m12310(C6990 c6990, AbstractC4882 abstractC4882, InterfaceC6481 interfaceC6481) {
        if (abstractC4882 == null) {
            m12311(8);
            throw null;
        }
        if (interfaceC6481 != null) {
            return new C6979(c6990, null, 0, interfaceC6481, AbstractC4692.f13712, abstractC4882, false, false, false, null, InterfaceC4462.f13091);
        }
        m12311(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12311(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    public final AbstractC4882 getReturnType() {
        return AbstractC4773.m9499(this).m12028();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final List mo9035() {
        InterfaceC4456 interfaceC4456 = this.f18706;
        if (interfaceC4456 == null) {
            C2633.m5341();
            return null;
        }
        List listSingletonList = Collections.singletonList(interfaceC4456);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m12311(11);
        throw null;
    }

    @Override // p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6990 mo9002() {
        C6990 c6990 = this.f18705;
        if (c6990 != null) {
            return c6990;
        }
        m12311(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9027(InterfaceC4497 interfaceC4497, Object obj) {
        return interfaceC4497.mo269(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9030() {
        return m12327(false);
    }
}
