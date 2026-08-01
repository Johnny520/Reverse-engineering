package p079;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4458;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.storage.InterfaceC4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.C4910;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6480;
import p101.C7254;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7009 extends AbstractC7018 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC6480 f18835;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C7012 f18836;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC4845 f18837;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4910 f18838;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7009(C4844 c4844, AbstractC6988 abstractC6988, AbstractC4877 abstractC4877, C4690 c4690, InterfaceC4845 interfaceC4845, InterfaceC6480 interfaceC6480, InterfaceC4461 interfaceC4461) {
        super(c4844, abstractC6988, c4690, interfaceC4461);
        if (c4844 == null) {
            m12323(6);
            throw null;
        }
        if (abstractC6988 == null) {
            m12323(7);
            throw null;
        }
        if (abstractC4877 == null) {
            m12323(8);
            throw null;
        }
        if (c4690 == null) {
            m12323(9);
            throw null;
        }
        if (interfaceC4845 == null) {
            m12323(10);
            throw null;
        }
        this.f18835 = interfaceC6480;
        this.f18838 = new C4910(this, Collections.EMPTY_LIST, Collections.singleton(abstractC4877), c4844);
        this.f18836 = new C7012(this, c4844);
        this.f18837 = interfaceC4845;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static C7009 m12322(C4844 c4844, AbstractC6988 abstractC6988, C4690 c4690, C4846 c4846, InterfaceC6480 interfaceC6480, InterfaceC4461 interfaceC4461) {
        if (c4844 == null) {
            m12323(0);
            throw null;
        }
        if (abstractC6988 == null) {
            m12323(1);
            throw null;
        }
        if (c4690 == null) {
            m12323(2);
            throw null;
        }
        if (c4846 != null) {
            return new C7009(c4844, abstractC6988, abstractC6988.mo9035(), c4690, c4846, interfaceC6480, interfaceC4461);
        }
        m12323(3);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12323(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p046.InterfaceC6478
    public final InterfaceC6480 getAnnotations() {
        InterfaceC6480 interfaceC6480 = this.f18835;
        if (interfaceC6480 != null) {
            return interfaceC6480;
        }
        m12323(21);
        throw null;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497
    public final C4489 getVisibility() {
        C4489 c4489 = AbstractC4488.f13112;
        if (c4489 != null) {
            return c4489;
        }
        m12323(20);
        throw null;
    }

    @Override // p079.AbstractC6988
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC7253 mo9016() {
        return C7254.f19341;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4872 mo9011() {
        C4910 c4910 = this.f18838;
        if (c4910 != null) {
            return c4910;
        }
        m12323(17);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9017() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m12323(16);
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
        Modality modality = Modality.FINAL;
        if (modality != null) {
            return modality;
        }
        m12323(19);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9020() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind != null) {
            return classKind;
        }
        m12323(18);
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
        m12323(22);
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
        return null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC7253 mo9029(AbstractC4860 abstractC4860) {
        C7012 c7012 = this.f18836;
        if (c7012 != null) {
            return c7012;
        }
        m12323(14);
        throw null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4458 mo9030() {
        return null;
    }
}
