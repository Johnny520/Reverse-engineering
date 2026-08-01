package p079;

import androidx.compose.runtime.AbstractC1332;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4691;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6481;
import p046.InterfaceC6480;
import p100.C7242;
import p100.C7244;
import p100.InterfaceC7243;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7005 extends AbstractC7008 implements InterfaceC4473 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC7243 f18827;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4498 f18828;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f18829 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7005(InterfaceC4498 interfaceC4498, AbstractC1332 abstractC1332, InterfaceC6480 interfaceC6480, C4690 c4690) {
        super(interfaceC6480, c4690);
        if (interfaceC4498 == null) {
            m12316(3);
            throw null;
        }
        if (interfaceC6480 == null) {
            m12316(5);
            throw null;
        }
        if (c4690 == null) {
            m12316(6);
            throw null;
        }
        this.f18828 = interfaceC4498;
        this.f18827 = abstractC1332;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public static /* synthetic */ void m12314(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12315(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12316(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    public final AbstractC4881 getReturnType() {
        return getType();
    }

    @Override // androidx.compose.runtime.AbstractC1332, p100.InterfaceC7243
    public final AbstractC4881 getType() {
        AbstractC4881 type = m12317().getType();
        if (type != null) {
            return type;
        }
        m12314(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12314(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497
    public final C4489 getVisibility() {
        C4489 c4489 = AbstractC4488.f13111;
        if (c4489 != null) {
            return c4489;
        }
        m12314(9);
        throw null;
    }

    @Override // p079.AbstractC7008
    public String toString() {
        switch (this.f18829) {
            case 0:
                return "class " + ((AbstractC6988) this.f18828).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final C7005 mo9042() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final List mo9045() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12314(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final InterfaceC7243 m12317() {
        int i = this.f18829;
        InterfaceC7243 interfaceC7243 = this.f18827;
        switch (i) {
            case 0:
                C7244 c7244 = (C7244) interfaceC7243;
                if (c7244 != null) {
                    return c7244;
                }
                m12315(1);
                throw null;
            default:
                AbstractC1332 abstractC1332 = (AbstractC1332) interfaceC7243;
                if (abstractC1332 != null) {
                    return abstractC1332;
                }
                m12316(7);
                throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7005 mo9015(C4918 c4918) {
        if (c4918 == null) {
            m12314(3);
            throw null;
        }
        if (!c4918.f14245.mo9744()) {
            AbstractC4881 abstractC4881M9868 = mo9038() instanceof AbstractC6988 ? c4918.m9868(getType(), Variance.OUT_VARIANCE) : c4918.m9868(getType(), Variance.INVARIANT);
            if (abstractC4881M9868 == null) {
                return null;
            }
            if (abstractC4881M9868 != getType()) {
                return new C7005(mo9038(), new C7242(abstractC4881M9868), getAnnotations());
            }
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4461 mo9036() {
        return InterfaceC4461.f13087;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9037(InterfaceC4496 interfaceC4496, Object obj) {
        return interfaceC4496.mo289(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9046() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4498 mo9038() {
        int i = this.f18829;
        InterfaceC4498 interfaceC4498 = this.f18828;
        switch (i) {
            case 0:
                AbstractC6988 abstractC6988 = (AbstractC6988) interfaceC4498;
                if (abstractC6988 != null) {
                    return abstractC6988;
                }
                m12315(2);
                throw null;
            default:
                if (interfaceC4498 != null) {
                    return interfaceC4498;
                }
                m12316(8);
                throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9040() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m12314(8);
        throw null;
    }

    @Override // p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4498 mo9012() {
        return this;
    }

    @Override // p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4480 mo9012() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7005(InterfaceC4498 interfaceC4498, AbstractC1332 abstractC1332, InterfaceC6480 interfaceC6480) {
        this(interfaceC4498, abstractC1332, interfaceC6480, AbstractC4691.f13704);
        if (interfaceC4498 == null) {
            m12316(0);
            throw null;
        }
        if (interfaceC6480 != null) {
        } else {
            m12316(2);
            throw null;
        }
    }

    public C7005(AbstractC6988 abstractC6988) {
        super(C6481.f17772, AbstractC4691.f13704);
        this.f18828 = abstractC6988;
        this.f18827 = new C7244(abstractC6988);
    }
}
