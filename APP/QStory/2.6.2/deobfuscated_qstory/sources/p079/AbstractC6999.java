package p079;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4915;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.C4848;
import net.bytebuddy.description.method.MethodDescription;
import p066.AbstractC6869;
import p101.C7256;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6999 extends AbstractC6988 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4846 f18760;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4846 f18761;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4846 f18762;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4690 f18763;

    public AbstractC6999(C4844 c4844, C4690 c4690) {
        int i = 0;
        if (c4844 == null) {
            m12302(0);
            throw null;
        }
        int i2 = 1;
        if (c4690 == null) {
            m12302(1);
            throw null;
        }
        this.f18763 = c4690;
        this.f18761 = new C4846(c4844, new C7000(this, i));
        this.f18762 = new C4846(c4844, new C7000(this, i2));
        this.f18760 = new C4846(c4844, new C7000(this, 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12302(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    public final C4690 getName() {
        C4690 c4690 = this.f18763;
        if (c4690 != null) {
            return c4690;
        }
        m12302(2);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public InterfaceC7253 mo9224() {
        AbstractC4772.m9514(AbstractC6869.m12076(this));
        InterfaceC7253 interfaceC7253Mo9029 = mo9029(C4848.f14127);
        if (interfaceC7253Mo9029 != null) {
            return interfaceC7253Mo9029;
        }
        m12302(17);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public InterfaceC7253 mo9225() {
        InterfaceC7253 interfaceC7253 = (InterfaceC7253) this.f18762.invoke();
        if (interfaceC7253 != null) {
            return interfaceC7253;
        }
        m12302(4);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final C7005 mo12280() {
        C7005 c7005 = (C7005) this.f18760.invoke();
        if (c7005 != null) {
            return c7005;
        }
        m12302(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9037(InterfaceC4496 interfaceC4496, Object obj) {
        return interfaceC4496.mo294(this, obj);
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public InterfaceC7253 mo12281(AbstractC4915 abstractC4915, AbstractC4860 abstractC4860) {
        if (!abstractC4915.mo9744()) {
            return new C7256(mo9029(abstractC4860), new C4918(abstractC4915));
        }
        InterfaceC7253 interfaceC7253Mo9029 = mo9029(abstractC4860);
        if (interfaceC7253Mo9029 != null) {
            return interfaceC7253Mo9029;
        }
        m12302(12);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public List mo9549() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12302(6);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC7253 mo12282(AbstractC4915 abstractC4915) {
        AbstractC4772.m9514(AbstractC6869.m12076(this));
        InterfaceC7253 interfaceC7253Mo12281 = mo12281(abstractC4915, C4848.f14127);
        if (interfaceC7253Mo12281 != null) {
            return interfaceC7253Mo12281;
        }
        m12302(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC6988 mo9015(C4918 c4918) {
        if (c4918 != null) {
            return c4918.f14245.mo9744() ? this : new C7004(this, c4918);
        }
        m12302(18);
        throw null;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC4877 mo9035() {
        AbstractC4877 abstractC4877 = (AbstractC4877) this.f18761.invoke();
        if (abstractC4877 != null) {
            return abstractC4877;
        }
        m12302(20);
        throw null;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4498 mo9012() {
        return this;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC6988 mo9012() {
        return this;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4476 mo9012() {
        return this;
    }
}
