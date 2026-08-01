package p079;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4458;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.C4910;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6481;
import p046.InterfaceC6480;
import p101.C7254;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C7015 extends AbstractC7018 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C7017 f18853;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public Set f18854;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC7253 f18855;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ClassKind f18856;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4910 f18857;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Modality f18858;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7015(InterfaceC4498 interfaceC4498, C4690 c4690, Modality modality, ClassKind classKind, List list, C4844 c4844) {
        super(c4844, interfaceC4498, c4690, InterfaceC4461.f13087);
        if (interfaceC4498 == null) {
            m12329(0);
            throw null;
        }
        if (c4690 == null) {
            m12329(1);
            throw null;
        }
        if (modality == null) {
            m12329(2);
            throw null;
        }
        if (classKind == null) {
            m12329(3);
            throw null;
        }
        if (list == null) {
            m12329(4);
            throw null;
        }
        if (c4844 == null) {
            m12329(6);
            throw null;
        }
        this.f18858 = modality;
        this.f18856 = classKind;
        this.f18857 = new C4910(this, Collections.EMPTY_LIST, list, c4844);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12329(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p046.InterfaceC6478
    public final InterfaceC6480 getAnnotations() {
        return C6481.f17772;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497
    public final C4489 getVisibility() {
        C4489 c4489 = AbstractC4488.f13112;
        if (c4489 != null) {
            return c4489;
        }
        m12329(17);
        throw null;
    }

    @Override // p079.AbstractC6988
    public final boolean isInline() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC7253 mo9016() {
        return C7254.f19341;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4872 mo9011() {
        C4910 c4910 = this.f18857;
        if (c4910 != null) {
            return c4910;
        }
        m12329(10);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9017() {
        Set set = this.f18854;
        if (set != null) {
            return set;
        }
        m12329(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9018() {
        return false;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9019() {
        Modality modality = this.f18858;
        if (modality != null) {
            return modality;
        }
        m12329(16);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9020() {
        ClassKind classKind = this.f18856;
        if (classKind != null) {
            return classKind;
        }
        m12329(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9021() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9022() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9023() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void m12330(InterfaceC7253 interfaceC7253, Set set, C7017 c7017) {
        if (set == null) {
            m12329(8);
            throw null;
        }
        this.f18855 = interfaceC7253;
        this.f18854 = set;
        this.f18853 = c7017;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9024() {
        return false;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9025() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12329(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9026() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9027() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final C7017 mo9028() {
        return this.f18853;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC7253 mo9029(AbstractC4860 abstractC4860) {
        InterfaceC7253 interfaceC7253 = this.f18855;
        if (interfaceC7253 != null) {
            return interfaceC7253;
        }
        m12329(13);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4458 mo9030() {
        return null;
    }
}
