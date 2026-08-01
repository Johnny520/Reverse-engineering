package kotlin.reflect.jvm.internal;

import androidx.compose.ui.C2125;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.InterfaceC4382;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.AbstractC5080;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4515;
import lin.xposed.hook.javaplugin.C5553;
import p047.AbstractC6493;
import p047.AbstractC6503;
import p047.C6487;
import p047.C6494;
import p047.C6502;
import p047.C6506;
import p047.InterfaceC6488;
import p052.InterfaceC6537;
import p052.InterfaceC6538;
import p052.InterfaceC6539;
import p052.InterfaceC6540;
import p052.InterfaceC6541;
import p052.InterfaceC6542;
import p052.InterfaceC6543;
import p052.InterfaceC6544;
import p052.InterfaceC6545;
import p052.InterfaceC6546;
import p052.InterfaceC6547;
import p052.InterfaceC6548;
import p052.InterfaceC6549;
import p052.InterfaceC6550;
import p052.InterfaceC6551;
import p052.InterfaceC6552;
import p052.InterfaceC6553;
import p052.InterfaceC6554;
import p052.InterfaceC6555;
import p052.InterfaceC6556;
import p052.InterfaceC6557;
import p052.InterfaceC6558;
import p052.InterfaceC6559;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5007 extends AbstractC5006 implements InterfaceC4382, InterfaceC6542, InterfaceC6557, InterfaceC6541, InterfaceC6540, InterfaceC6539, InterfaceC6538, InterfaceC6537, InterfaceC6555, InterfaceC6554, InterfaceC6558, InterfaceC6559, InterfaceC6556, InterfaceC6553, InterfaceC6549, InterfaceC6548, InterfaceC6552, InterfaceC6550, InterfaceC6551, InterfaceC6544, InterfaceC6543, InterfaceC6546, InterfaceC6547, InterfaceC6545, InterfaceC5093, InterfaceC5060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5183 f14428;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14429;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5183 f14430;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5183 f14431;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5183 f14432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5002 f14433;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f14434;

    public AbstractC5007(AbstractC5002 abstractC5002, String str, Object obj) {
        this.f14433 = abstractC5002;
        this.f14434 = str;
        this.f14429 = obj;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14428 = AbstractC5186.m10211(lazyThreadSafetyMode, new C5008(this, 0));
        this.f14431 = AbstractC5186.m10211(lazyThreadSafetyMode, new C5008(this, 1));
        this.f14432 = AbstractC5186.m10211(lazyThreadSafetyMode, new C5008(this, 2));
        this.f14430 = AbstractC5186.m10211(lazyThreadSafetyMode, new C5008(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰 r0 = kotlin.reflect.jvm.internal.AbstractC5066.f14608
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.InterfaceC5060
            if (r0 == 0) goto L9
            kotlin.reflect.jvm.internal.飘花落叶言楪子世兰苏哲 r3 = (kotlin.reflect.jvm.internal.InterfaceC5060) r3
            goto L1c
        L9:
            boolean r0 = r3 instanceof kotlin.jvm.internal.FunctionReference
            r1 = 0
            if (r0 == 0) goto L1b
            kotlin.jvm.internal.FunctionReference r3 = (kotlin.jvm.internal.FunctionReference) r3
            kotlin.reflect.飘花落叶言子楪世哲苏兰 r3 = r3.compute()
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.InterfaceC5060
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.飘花落叶言楪子世兰苏哲 r3 = (kotlin.reflect.jvm.internal.InterfaceC5060) r3
            goto L1c
        L1b:
            r3 = r1
        L1c:
            if (r3 != 0) goto L1f
            goto L53
        L1f:
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世 r0 = r2.f14433
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世 r1 = r3.mo9946()
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r1)
            if (r0 == 0) goto L53
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = r3.getName()
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r1)
            if (r0 == 0) goto L53
            java.lang.String r0 = r2.f14434
            java.lang.String r1 = r3.getSignature()
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r1)
            if (r0 == 0) goto L53
            java.lang.Object r2 = r2.f14429
            java.lang.Object r3 = r3.mo9948()
            boolean r2 = kotlin.jvm.internal.AbstractC4394.m8917(r2, r3)
            if (r2 == 0) goto L53
            r2 = 1
            return r2
        L53:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5007.equals(java.lang.Object):boolean");
    }

    @Override // kotlin.jvm.internal.InterfaceC4397
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC4387.m8897(this.f14433, this.f14434);
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        Member memberMo11953 = mo9944().mo11953();
        AnnotatedElement annotatedElement = memberMo11953 instanceof AnnotatedElement ? (AnnotatedElement) memberMo11953 : null;
        if (annotatedElement == null) {
            return EmptyList.INSTANCE;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return AbstractC5066.m10062(AbstractC4346.m8850(annotations));
    }

    @Override // kotlin.jvm.internal.InterfaceC4382
    public final int getArity() {
        InterfaceC6488 interfaceC6488Mo9944 = mo9944();
        interfaceC6488Mo9944.getClass();
        return interfaceC6488Mo9944.getParameterTypes().size();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getParameters() {
        return (List) this.f14431.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5060
    public final String getSignature() {
        return this.f14434;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getTypeParameters() {
        return mo9968().f14613;
    }

    public final int hashCode() {
        return this.f14434.hashCode() + ((getName().hashCode() + (this.f14433.hashCode() * 31)) * 31);
    }

    @Override // p052.InterfaceC6547
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(C2125.f6275, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public final String toString() {
        return C5068.m10080(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract List mo9967();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract C5069 mo9968();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract C4515 mo9969();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract C4533 mo9970();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6488 mo9942() {
        return (InterfaceC6488) this.f14430.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6488 mo9944() {
        return (InterfaceC6488) this.f14432.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo9964() {
        return (List) this.f14428.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract List mo9971();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6503 m9989(Method method, boolean z) {
        if (!AbstractC5061.m10028(this)) {
            return new C6494(6, 2, method, false);
        }
        if (this.f14433 instanceof C4991) {
            return new C6502(method, z, AbstractC5061.m10041(this));
        }
        C5553.m10815(this, "Only top-level functions are supported for now: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5002 mo9946() {
        return this.f14433;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC6493 m9990(Constructor constructor, boolean z) {
        List parameters;
        if (!z && (this instanceof C5005)) {
            C5005 c5005 = (C5005) this;
            if (c5005.getVisibility() != KVisibility.PRIVATE && ((parameters = c5005.getParameters()) == null || !parameters.isEmpty())) {
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    InterfaceC5092 interfaceC5092M10088 = AbstractC5080.m10088(((InterfaceC5107) it.next()).getType());
                    if (interfaceC5092M10088.mo8894() && !interfaceC5092M10088.equals(AbstractC4395.f12971.mo8927(Result.class))) {
                        return AbstractC5061.m10028(this) ? new C6487(constructor, AbstractC5061.m10041(this), 0) : new C6506(constructor, 0);
                    }
                }
            }
        }
        return AbstractC5061.m10028(this) ? new C6487(constructor, AbstractC5061.m10041(this), 1) : new C6506(constructor, 1);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo9948() {
        return this.f14429;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // p052.InterfaceC6544
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // p052.InterfaceC6543
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // p052.InterfaceC6546
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        return call(new Object[0]);
    }
}
