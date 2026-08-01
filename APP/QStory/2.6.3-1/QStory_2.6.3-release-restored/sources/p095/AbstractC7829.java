package p095;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5748;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.checker.C5681;
import net.bytebuddy.description.method.MethodDescription;
import p082.AbstractC7699;
import p117.C8086;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7829 extends AbstractC7818 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5679 f19100;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5679 f19101;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5679 f19102;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5523 f19103;

    public AbstractC7829(C5677 c5677, C5523 c5523) {
        int i = 0;
        if (c5677 == null) {
            m12888(0);
            throw null;
        }
        int i2 = 1;
        if (c5523 == null) {
            m12888(1);
            throw null;
        }
        this.f19103 = c5523;
        this.f19101 = new C5679(c5677, new C7830(this, i));
        this.f19102 = new C5679(c5677, new C7830(this, i2));
        this.f19100 = new C5679(c5677, new C7830(this, 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12888(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    public final C5523 getName() {
        C5523 c5523 = this.f19103;
        if (c5523 != null) {
            return c5523;
        }
        m12888(2);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public InterfaceC8083 mo9773() {
        AbstractC5605.m10063(AbstractC7699.m12663(this));
        InterfaceC8083 interfaceC8083Mo9578 = mo9578(C5681.f14476);
        if (interfaceC8083Mo9578 != null) {
            return interfaceC8083Mo9578;
        }
        m12888(17);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public InterfaceC8083 mo9774() {
        InterfaceC8083 interfaceC8083 = (InterfaceC8083) this.f19102.invoke();
        if (interfaceC8083 != null) {
            return interfaceC8083;
        }
        m12888(4);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final C7835 mo12866() {
        C7835 c7835 = (C7835) this.f19100.invoke();
        if (c7835 != null) {
            return c7835;
        }
        m12888(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return interfaceC5329.mo855(this, obj);
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public InterfaceC8083 mo12867(AbstractC5748 abstractC5748, AbstractC5693 abstractC5693) {
        if (!abstractC5748.mo10293()) {
            return new C8086(mo9578(abstractC5693), new C5751(abstractC5748));
        }
        InterfaceC8083 interfaceC8083Mo9578 = mo9578(abstractC5693);
        if (interfaceC8083Mo9578 != null) {
            return interfaceC8083Mo9578;
        }
        m12888(12);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public List mo10098() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12888(6);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC8083 mo12868(AbstractC5748 abstractC5748) {
        AbstractC5605.m10063(AbstractC7699.m12663(this));
        InterfaceC8083 interfaceC8083Mo12867 = mo12867(abstractC5748, C5681.f14476);
        if (interfaceC8083Mo12867 != null) {
            return interfaceC8083Mo12867;
        }
        m12888(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC7818 mo9564(C5751 c5751) {
        if (c5751 != null) {
            return c5751.f14594.mo10293() ? this : new C7834(this, c5751);
        }
        m12888(18);
        throw null;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC5710 mo9584() {
        AbstractC5710 abstractC5710 = (AbstractC5710) this.f19101.invoke();
        if (abstractC5710 != null) {
            return abstractC5710;
        }
        m12888(20);
        throw null;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5331 mo9561() {
        return this;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC7818 mo9561() {
        return this;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5309 mo9561() {
        return this;
    }
}
