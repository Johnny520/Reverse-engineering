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
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.InterfaceC4383;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.AbstractC5081;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4516;
import lin.xposed.hook.javaplugin.C5554;
import p047.AbstractC6494;
import p047.AbstractC6504;
import p047.C6488;
import p047.C6495;
import p047.C6503;
import p047.C6507;
import p047.InterfaceC6489;
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
import p052.InterfaceC6560;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5008 extends AbstractC5007 implements InterfaceC4383, InterfaceC6543, InterfaceC6558, InterfaceC6542, InterfaceC6541, InterfaceC6540, InterfaceC6539, InterfaceC6538, InterfaceC6556, InterfaceC6555, InterfaceC6559, InterfaceC6560, InterfaceC6557, InterfaceC6554, InterfaceC6550, InterfaceC6549, InterfaceC6553, InterfaceC6551, InterfaceC6552, InterfaceC6545, InterfaceC6544, InterfaceC6547, InterfaceC6548, InterfaceC6546, InterfaceC5094, InterfaceC5061 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5184 f14430;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14431;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5184 f14432;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5184 f14433;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5184 f14434;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5003 f14435;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f14436;

    public AbstractC5008(AbstractC5003 abstractC5003, String str, Object obj) {
        this.f14435 = abstractC5003;
        this.f14436 = str;
        this.f14431 = obj;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14430 = AbstractC5187.m10215(lazyThreadSafetyMode, new C5009(this, 0));
        this.f14433 = AbstractC5187.m10215(lazyThreadSafetyMode, new C5009(this, 1));
        this.f14434 = AbstractC5187.m10215(lazyThreadSafetyMode, new C5009(this, 2));
        this.f14432 = AbstractC5187.m10215(lazyThreadSafetyMode, new C5009(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰 r0 = kotlin.reflect.jvm.internal.AbstractC5067.f14608
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.InterfaceC5061
            if (r0 == 0) goto L9
            kotlin.reflect.jvm.internal.飘花落叶言楪子世兰苏哲 r3 = (kotlin.reflect.jvm.internal.InterfaceC5061) r3
            goto L1c
        L9:
            boolean r0 = r3 instanceof kotlin.jvm.internal.FunctionReference
            r1 = 0
            if (r0 == 0) goto L1b
            kotlin.jvm.internal.FunctionReference r3 = (kotlin.jvm.internal.FunctionReference) r3
            kotlin.reflect.飘花落叶言子楪世哲苏兰 r3 = r3.compute()
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.InterfaceC5061
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.飘花落叶言楪子世兰苏哲 r3 = (kotlin.reflect.jvm.internal.InterfaceC5061) r3
            goto L1c
        L1b:
            r3 = r1
        L1c:
            if (r3 != 0) goto L1f
            goto L53
        L1f:
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世 r0 = r2.f14435
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世 r1 = r3.mo9943()
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r1)
            if (r0 == 0) goto L53
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = r3.getName()
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r1)
            if (r0 == 0) goto L53
            java.lang.String r0 = r2.f14436
            java.lang.String r1 = r3.getSignature()
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r1)
            if (r0 == 0) goto L53
            java.lang.Object r2 = r2.f14431
            java.lang.Object r3 = r3.mo9945()
            boolean r2 = kotlin.jvm.internal.AbstractC4395.m8907(r2, r3)
            if (r2 == 0) goto L53
            r2 = 1
            return r2
        L53:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5008.equals(java.lang.Object):boolean");
    }

    @Override // kotlin.jvm.internal.InterfaceC4398
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC4388.m8887(this.f14435, this.f14436);
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        Member memberMo11996 = mo9941().mo11996();
        AnnotatedElement annotatedElement = memberMo11996 instanceof AnnotatedElement ? (AnnotatedElement) memberMo11996 : null;
        if (annotatedElement == null) {
            return EmptyList.INSTANCE;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return AbstractC5067.m10066(AbstractC4347.m8846(annotations));
    }

    @Override // kotlin.jvm.internal.InterfaceC4383
    public final int getArity() {
        InterfaceC6489 interfaceC6489Mo9941 = mo9941();
        interfaceC6489Mo9941.getClass();
        return interfaceC6489Mo9941.getParameterTypes().size();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getParameters() {
        return (List) this.f14433.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5061
    public final String getSignature() {
        return this.f14436;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getTypeParameters() {
        return mo9965().f14613;
    }

    public final int hashCode() {
        return this.f14436.hashCode() + ((getName().hashCode() + (this.f14435.hashCode() * 31)) * 31);
    }

    @Override // p052.InterfaceC6548
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(C2125.f6276, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public final String toString() {
        return C5069.m10084(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract List mo9964();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract C5070 mo9965();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract C4516 mo9966();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract C4534 mo9967();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6489 mo9939() {
        return (InterfaceC6489) this.f14432.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6489 mo9941() {
        return (InterfaceC6489) this.f14434.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo9961() {
        return (List) this.f14430.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract List mo9968();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6504 m9986(Method method, boolean z) {
        if (!AbstractC5062.m10042(this)) {
            return new C6495(6, 2, method, false);
        }
        if (this.f14435 instanceof C4992) {
            return new C6503(method, z, AbstractC5062.m10049(this));
        }
        C5554.m10872(this, "Only top-level functions are supported for now: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5003 mo9943() {
        return this.f14435;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC6494 m9987(Constructor constructor, boolean z) {
        List parameters;
        if (!z && (this instanceof C5006)) {
            C5006 c5006 = (C5006) this;
            if (c5006.getVisibility() != KVisibility.PRIVATE && ((parameters = c5006.getParameters()) == null || !parameters.isEmpty())) {
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    InterfaceC5093 interfaceC5093M10092 = AbstractC5081.m10092(((InterfaceC5108) it.next()).getType());
                    if (interfaceC5093M10092.mo8884() && !interfaceC5093M10092.equals(AbstractC4396.f12975.mo8917(Result.class))) {
                        return AbstractC5062.m10042(this) ? new C6488(constructor, AbstractC5062.m10049(this), 0) : new C6507(constructor, 0);
                    }
                }
            }
        }
        return AbstractC5062.m10042(this) ? new C6488(constructor, AbstractC5062.m10049(this), 1) : new C6507(constructor, 1);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo9945() {
        return this.f14431;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // p052.InterfaceC6552
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // p052.InterfaceC6545
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // p052.InterfaceC6544
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // p052.InterfaceC6547
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        return call(new Object[0]);
    }
}
