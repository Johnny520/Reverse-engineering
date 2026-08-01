package p079;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.checker.C4849;
import net.bytebuddy.description.method.MethodDescription;
import p066.AbstractC6870;
import p101.C7257;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7000 extends AbstractC6989 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4847 f18755;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4847 f18756;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4847 f18757;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4691 f18758;

    public AbstractC7000(C4845 c4845, C4691 c4691) {
        int i = 0;
        if (c4845 == null) {
            m12329(0);
            throw null;
        }
        int i2 = 1;
        if (c4691 == null) {
            m12329(1);
            throw null;
        }
        this.f18758 = c4691;
        this.f18756 = new C4847(c4845, new C7001(this, i));
        this.f18757 = new C4847(c4845, new C7001(this, i2));
        this.f18755 = new C4847(c4845, new C7001(this, 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12329(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    public final C4691 getName() {
        C4691 c4691 = this.f18758;
        if (c4691 != null) {
            return c4691;
        }
        m12329(2);
        throw null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public InterfaceC7254 mo9214() {
        AbstractC4773.m9504(AbstractC6870.m12104(this));
        InterfaceC7254 interfaceC7254Mo9019 = mo9019(C4849.f14131);
        if (interfaceC7254Mo9019 != null) {
            return interfaceC7254Mo9019;
        }
        m12329(17);
        throw null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public InterfaceC7254 mo9215() {
        InterfaceC7254 interfaceC7254 = (InterfaceC7254) this.f18757.invoke();
        if (interfaceC7254 != null) {
            return interfaceC7254;
        }
        m12329(4);
        throw null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final C7006 mo12307() {
        C7006 c7006 = (C7006) this.f18755.invoke();
        if (c7006 != null) {
            return c7006;
        }
        m12329(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9027(InterfaceC4497 interfaceC4497, Object obj) {
        return interfaceC4497.mo295(this, obj);
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public InterfaceC7254 mo12308(AbstractC4916 abstractC4916, AbstractC4861 abstractC4861) {
        if (!abstractC4916.mo9734()) {
            return new C7257(mo9019(abstractC4861), new C4919(abstractC4916));
        }
        InterfaceC7254 interfaceC7254Mo9019 = mo9019(abstractC4861);
        if (interfaceC7254Mo9019 != null) {
            return interfaceC7254Mo9019;
        }
        m12329(12);
        throw null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public List mo9539() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12329(6);
        throw null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC7254 mo12309(AbstractC4916 abstractC4916) {
        AbstractC4773.m9504(AbstractC6870.m12104(this));
        InterfaceC7254 interfaceC7254Mo12308 = mo12308(abstractC4916, C4849.f14131);
        if (interfaceC7254Mo12308 != null) {
            return interfaceC7254Mo12308;
        }
        m12329(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4464
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC6989 mo9005(C4919 c4919) {
        if (c4919 != null) {
            return c4919.f14249.mo9734() ? this : new C7005(this, c4919);
        }
        m12329(18);
        throw null;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC4878 mo9025() {
        AbstractC4878 abstractC4878 = (AbstractC4878) this.f18756.invoke();
        if (abstractC4878 != null) {
            return abstractC4878;
        }
        m12329(20);
        throw null;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4499 mo9002() {
        return this;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC6989 mo9002() {
        return this;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4477 mo9002() {
        return this;
    }
}
