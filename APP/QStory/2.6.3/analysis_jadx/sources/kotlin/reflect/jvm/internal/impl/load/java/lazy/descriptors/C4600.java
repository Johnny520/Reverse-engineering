package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.C1012;
import androidx.window.area.AbstractC2567;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4459;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4501;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.C4472;
import kotlin.reflect.jvm.internal.impl.descriptors.C4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.C4503;
import kotlin.reflect.jvm.internal.impl.descriptors.C4507;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4617;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.checker.C4855;
import p018.AbstractC6253;
import p046.InterfaceC6481;
import p066.AbstractC6870;
import p077.C6968;
import p078.C6974;
import p078.C6975;
import p078.C6976;
import p079.AbstractC6989;
import p079.AbstractC7000;
import p079.AbstractC7019;
import p079.C7018;
import p083.C7039;
import p083.C7041;
import p101.C7264;
import p101.InterfaceC7254;
import p251.AbstractC8175;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4600 extends AbstractC7019 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C4847 f13419;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean f13420;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC4501 f13421;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Modality f13422;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ClassKind f13423;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f13424;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C0325 f13425;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C7039 f13426;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C4572 f13427;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C7264 f13428;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C4472 f13429;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C4590 f13430;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C4596 f13431;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4452 f13432;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC6989 f13433;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0325 f13434;

    static {
        AbstractC4347.m8845(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4600(C0325 c0325, InterfaceC4499 interfaceC4499, C4452 c4452, AbstractC6989 abstractC6989) throws IllegalAccessException, InvocationTargetException {
        Modality modality;
        c0325.getClass();
        interfaceC4499.getClass();
        c4452.getClass();
        C7041 c7041 = (C7041) c0325.f1095;
        C4845 c4845 = c7041.f18894;
        C4691 c4691M8988 = c4452.m8988();
        c7041.f18912.getClass();
        super(c4845, interfaceC4499, c4691M8988, C6968.m12284(c4452));
        this.f13434 = c0325;
        this.f13432 = c4452;
        this.f13433 = abstractC6989;
        C0325 c0325M1174 = AbstractC0455.m1174(c0325, this, c4452, 4);
        this.f13425 = c0325M1174;
        C7041 c70412 = (C7041) c0325M1174.f1095;
        C4845 c48452 = c70412.f18894;
        c70412.f18908.getClass();
        this.f13424 = AbstractC5187.m10214(new C4597(this, 0));
        Class cls = c4452.f13083;
        this.f13423 = cls.isAnnotation() ? ClassKind.ANNOTATION_CLASS : cls.isInterface() ? ClassKind.INTERFACE : cls.isEnum() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        int i = 1;
        if (cls.isAnnotation() || cls.isEnum()) {
            modality = Modality.FINAL;
        } else {
            C4488 c4488 = Modality.Companion;
            Boolean boolM6693 = AbstractC3056.m6693(cls);
            boolean zBooleanValue = boolM6693 != null ? boolM6693.booleanValue() : false;
            Boolean boolM66932 = AbstractC3056.m6693(cls);
            boolean z = (boolM66932 != null ? boolM66932.booleanValue() : false) || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            c4488.getClass();
            modality = zBooleanValue ? Modality.SEALED : z ? Modality.ABSTRACT : !zIsFinal ? Modality.OPEN : Modality.FINAL;
        }
        this.f13422 = modality;
        int modifiers = cls.getModifiers();
        this.f13421 = Modifier.isPublic(modifiers) ? C4507.f13146 : Modifier.isPrivate(modifiers) ? C4503.f13142 : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C6974.f18665 : C6975.f18666 : C6976.f18667;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.f13420 = ((declaringClass != null ? new C4452(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f13431 = new C4596(this);
        C4590 c4590 = new C4590(c0325M1174, this, c4452, abstractC6989 != null, null);
        this.f13430 = c4590;
        C4461 c4461 = C4472.f13103;
        ((C4855) c70412.f18899).getClass();
        C1012 c1012 = new C1012(this, 9);
        c4461.getClass();
        c48452.getClass();
        this.f13429 = new C4472(this, c48452, c1012);
        this.f13428 = new C7264(c4590);
        this.f13427 = new C4572(c0325M1174, c4452, this);
        this.f13426 = AbstractC2567.m5060(c0325M1174, c4452);
        C4597 c4597 = new C4597(this, i);
        c48452.getClass();
        this.f13419 = new C4847(c48452, c4597);
    }

    @Override // p046.InterfaceC6479
    public final InterfaceC6481 getAnnotations() {
        return this.f13426;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    public final C4490 getVisibility() {
        C4490 c4490 = AbstractC4489.f13120;
        AbstractC4501 abstractC4501 = this.f13421;
        if (AbstractC4395.m8907(abstractC4501, c4490)) {
            Class<?> declaringClass = this.f13432.f13083.getDeclaringClass();
            if ((declaringClass != null ? new C4452(declaringClass) : null) == null) {
                C4490 c44902 = AbstractC4617.f13518;
                c44902.getClass();
                return c44902;
            }
        }
        return AbstractC8175.m13626(abstractC4501);
    }

    @Override // p079.AbstractC6989
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = AbstractC4773.f13909;
        C4686 c4686M12101 = AbstractC6870.m12101(this);
        c4686M12101.getClass();
        sb.append(c4686M12101);
        return sb.toString();
    }

    @Override // p079.AbstractC7000, p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final InterfaceC7254 mo9214() {
        return (C4590) super.mo9214();
    }

    @Override // p079.AbstractC7000, p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC7254 mo9215() {
        return this.f13428;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC7254 mo9006() {
        return this.f13427;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4873 mo9001() {
        return this.f13431;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9007() {
        return (List) this.f13430.f13387.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9008() {
        return false;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9009() {
        return this.f13422;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9010() {
        return this.f13423;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9011() {
        return this.f13420;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9012() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9013() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final C4590 m9216() {
        return (C4590) super.mo9214();
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9014() {
        return false;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9015() {
        return (List) this.f13419.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9016() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9017() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final C7018 mo9018() {
        return null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC7254 mo9019(AbstractC4861 abstractC4861) {
        C4472 c4472 = this.f13429;
        AbstractC7000 abstractC7000 = c4472.f13106;
        int i = AbstractC4773.f13909;
        AbstractC6870.m12104(abstractC7000).getClass();
        return (C4590) ((InterfaceC7254) AbstractC6253.m11749(c4472.f13104, C4472.f13102[0]));
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4459 mo9020() {
        return null;
    }
}
