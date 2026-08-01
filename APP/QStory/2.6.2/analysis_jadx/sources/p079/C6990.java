package p079;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6990 extends AbstractC6993 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C6990 f18712;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC4881 f18713;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6990(InterfaceC4472 interfaceC4472, InterfaceC6480 interfaceC6480, Modality modality, C4489 c4489, boolean z, boolean z2, boolean z3, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C6990 c6990, InterfaceC4461 interfaceC4461) {
        super(modality, c4489, interfaceC4472, interfaceC6480, C4690.m9343("<get-" + interfaceC4472.getName() + ">"), z, z2, z3, callableMemberDescriptor$Kind, interfaceC4461);
        if (interfaceC6480 == null) {
            m12286(1);
            throw null;
        }
        if (modality == null) {
            m12286(2);
            throw null;
        }
        if (c4489 == null) {
            m12286(3);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12286(4);
            throw null;
        }
        if (interfaceC4461 == null) {
            m12286(5);
            throw null;
        }
        this.f18712 = c6990 != null ? c6990 : this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12286(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    public final AbstractC4881 getReturnType() {
        return this.f18713;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final List mo9045() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12286(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final void m12287(AbstractC4881 abstractC4881) {
        if (abstractC4881 == null) {
            abstractC4881 = m12299().getType();
        }
        this.f18713 = abstractC4881;
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6990 mo9012() {
        C6990 c6990 = this.f18712;
        if (c6990 != null) {
            return c6990;
        }
        m12286(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9037(InterfaceC4496 interfaceC4496, Object obj) {
        return interfaceC4496.mo296(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9040() {
        return m12300(true);
    }
}
