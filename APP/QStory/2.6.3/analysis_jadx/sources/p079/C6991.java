package p079;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6991 extends AbstractC6994 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C6991 f18707;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC4882 f18708;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6991(InterfaceC4473 interfaceC4473, InterfaceC6481 interfaceC6481, Modality modality, C4490 c4490, boolean z, boolean z2, boolean z3, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C6991 c6991, InterfaceC4462 interfaceC4462) {
        super(modality, c4490, interfaceC4473, interfaceC6481, C4691.m9333("<get-" + interfaceC4473.getName() + ">"), z, z2, z3, callableMemberDescriptor$Kind, interfaceC4462);
        if (interfaceC6481 == null) {
            m12313(1);
            throw null;
        }
        if (modality == null) {
            m12313(2);
            throw null;
        }
        if (c4490 == null) {
            m12313(3);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12313(4);
            throw null;
        }
        if (interfaceC4462 == null) {
            m12313(5);
            throw null;
        }
        this.f18707 = c6991 != null ? c6991 : this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12313(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    public final AbstractC4882 getReturnType() {
        return this.f18708;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final List mo9035() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12313(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final void m12314(AbstractC4882 abstractC4882) {
        if (abstractC4882 == null) {
            abstractC4882 = m12326().getType();
        }
        this.f18708 = abstractC4882;
    }

    @Override // p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6991 mo9002() {
        C6991 c6991 = this.f18707;
        if (c6991 != null) {
            return c6991;
        }
        m12313(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9027(InterfaceC4497 interfaceC4497, Object obj) {
        return interfaceC4497.mo297(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9030() {
        return m12327(true);
    }
}
