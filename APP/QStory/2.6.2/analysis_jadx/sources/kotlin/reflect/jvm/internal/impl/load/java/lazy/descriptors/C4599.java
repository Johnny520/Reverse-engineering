package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4458;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4500;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.C4471;
import kotlin.reflect.jvm.internal.impl.descriptors.C4487;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4502;
import kotlin.reflect.jvm.internal.impl.descriptors.C4506;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4616;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.C4854;
import p000.AbstractC6087;
import p033.AbstractC6325;
import p046.InterfaceC6480;
import p066.AbstractC6869;
import p077.C6967;
import p078.C6973;
import p078.C6974;
import p078.C6975;
import p079.AbstractC6988;
import p079.AbstractC6999;
import p079.AbstractC7018;
import p079.C7017;
import p083.C7038;
import p083.C7040;
import p101.C7263;
import p101.InterfaceC7253;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4599 extends AbstractC7018 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C4846 f13415;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean f13416;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC4500 f13417;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Modality f13418;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ClassKind f13419;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f13420;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C0325 f13421;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C7038 f13422;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C4571 f13423;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C7263 f13424;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C4471 f13425;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C4589 f13426;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C4595 f13427;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4451 f13428;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC6988 f13429;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0325 f13430;

    static {
        AbstractC4346.m8852(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4599(C0325 c0325, InterfaceC4498 interfaceC4498, C4451 c4451, AbstractC6988 abstractC6988) throws IllegalAccessException, InvocationTargetException {
        Modality modality;
        c0325.getClass();
        interfaceC4498.getClass();
        c4451.getClass();
        C7040 c7040 = (C7040) c0325.f1095;
        C4844 c4844 = c7040.f18899;
        C4690 c4690M8998 = c4451.m8998();
        c7040.f18917.getClass();
        super(c4844, interfaceC4498, c4690M8998, C6967.m12257(c4451));
        this.f13430 = c0325;
        this.f13428 = c4451;
        this.f13429 = abstractC6988;
        C0325 c0325M11416 = AbstractC6087.m11416(c0325, this, c4451, 4);
        this.f13421 = c0325M11416;
        C7040 c70402 = (C7040) c0325M11416.f1095;
        C4844 c48442 = c70402.f18899;
        c70402.f18913.getClass();
        this.f13420 = AbstractC5186.m10210(new C4596(this, 0));
        Class cls = c4451.f13079;
        this.f13419 = cls.isAnnotation() ? ClassKind.ANNOTATION_CLASS : cls.isInterface() ? ClassKind.INTERFACE : cls.isEnum() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        int i = 1;
        if (cls.isAnnotation() || cls.isEnum()) {
            modality = Modality.FINAL;
        } else {
            C4487 c4487 = Modality.Companion;
            Boolean boolM10025 = AbstractC5061.m10025(cls);
            boolean zBooleanValue = boolM10025 != null ? boolM10025.booleanValue() : false;
            Boolean boolM100252 = AbstractC5061.m10025(cls);
            boolean z = (boolM100252 != null ? boolM100252.booleanValue() : false) || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            c4487.getClass();
            modality = zBooleanValue ? Modality.SEALED : z ? Modality.ABSTRACT : !zIsFinal ? Modality.OPEN : Modality.FINAL;
        }
        this.f13418 = modality;
        int modifiers = cls.getModifiers();
        this.f13417 = Modifier.isPublic(modifiers) ? C4506.f13142 : Modifier.isPrivate(modifiers) ? C4502.f13138 : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C6973.f18670 : C6974.f18671 : C6975.f18672;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.f13416 = ((declaringClass != null ? new C4451(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f13427 = new C4595(this);
        C4589 c4589 = new C4589(c0325M11416, this, c4451, abstractC6988 != null, null);
        this.f13426 = c4589;
        C4460 c4460 = C4471.f13099;
        ((C4854) c70402.f18904).getClass();
        C1012 c1012 = new C1012(this, 9);
        c4460.getClass();
        c48442.getClass();
        this.f13425 = new C4471(this, c48442, c1012);
        this.f13424 = new C7263(c4589);
        this.f13423 = new C4571(c0325M11416, c4451, this);
        this.f13422 = AbstractC6325.m11852(c0325M11416, c4451);
        C4596 c4596 = new C4596(this, i);
        c48442.getClass();
        this.f13415 = new C4846(c48442, c4596);
    }

    @Override // p046.InterfaceC6478
    public final InterfaceC6480 getAnnotations() {
        return this.f13422;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497
    public final C4489 getVisibility() {
        C4489 c4489 = AbstractC4488.f13116;
        AbstractC4500 abstractC4500 = this.f13417;
        if (AbstractC4394.m8917(abstractC4500, c4489)) {
            Class<?> declaringClass = this.f13428.f13079.getDeclaringClass();
            if ((declaringClass != null ? new C4451(declaringClass) : null) == null) {
                C4489 c44892 = AbstractC4616.f13514;
                c44892.getClass();
                return c44892;
            }
        }
        return AbstractC3056.m6711(abstractC4500);
    }

    @Override // p079.AbstractC6988
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = AbstractC4772.f13905;
        C4685 c4685M12073 = AbstractC6869.m12073(this);
        c4685M12073.getClass();
        sb.append(c4685M12073);
        return sb.toString();
    }

    @Override // p079.AbstractC6999, p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final InterfaceC7253 mo9224() {
        return (C4589) super.mo9224();
    }

    @Override // p079.AbstractC6999, p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC7253 mo9225() {
        return this.f13424;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC7253 mo9016() {
        return this.f13423;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4872 mo9011() {
        return this.f13427;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9017() {
        return (List) this.f13426.f13383.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9018() {
        return false;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9019() {
        return this.f13418;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9020() {
        return this.f13419;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9021() {
        return this.f13416;
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
    public final C4589 m9226() {
        return (C4589) super.mo9224();
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9024() {
        return false;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9025() {
        return (List) this.f13415.invoke();
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
        C4471 c4471 = this.f13425;
        AbstractC6999 abstractC6999 = c4471.f13102;
        int i = AbstractC4772.f13905;
        AbstractC6869.m12076(abstractC6999).getClass();
        return (C4589) ((InterfaceC7253) AbstractC9124.m14672(c4471.f13100, C4471.f13098[0]));
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4458 mo9030() {
        return null;
    }
}
