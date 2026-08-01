package kotlin.reflect.jvm.internal;

import androidx.compose.ui.C2125;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.InterfaceC4383;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.types.C4938;
import p047.AbstractC6494;
import p047.C6488;
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
import p066.AbstractC6870;
import p066.AbstractC6879;
import p079.AbstractC6977;
import p079.AbstractC6989;
import p079.AbstractC7009;
import p079.C7018;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5026 extends AbstractC5024 implements InterfaceC4383, InterfaceC6543, InterfaceC6558, InterfaceC6542, InterfaceC6541, InterfaceC6540, InterfaceC6539, InterfaceC6538, InterfaceC6556, InterfaceC6555, InterfaceC6559, InterfaceC6560, InterfaceC6557, InterfaceC6554, InterfaceC6550, InterfaceC6549, InterfaceC6553, InterfaceC6551, InterfaceC6552, InterfaceC6545, InterfaceC6544, InterfaceC6547, InterfaceC6548, InterfaceC6546, InterfaceC5094, InterfaceC5061 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f14493 = {new PropertyReference1Impl(C5026.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC5184 f14494;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f14495;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5074 f14496;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f14497;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC5003 f14498;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String f14499;

    public C5026(AbstractC5003 abstractC5003, String str, String str2, InterfaceC4484 interfaceC4484, Object obj, C5051 c5051) {
        super(c5051);
        this.f14498 = abstractC5003;
        this.f14499 = str2;
        this.f14497 = obj;
        int i = 0;
        this.f14496 = C8667.m14378(interfaceC4484, new C5028(this, i, str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14495 = AbstractC5187.m10215(lazyThreadSafetyMode, new C5029(this, i));
        this.f14494 = AbstractC5187.m10215(lazyThreadSafetyMode, new C5029(this, 1));
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
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世 r0 = r2.f14498
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世 r1 = r3.mo9943()
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r1)
            if (r0 == 0) goto L53
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = r3.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            java.lang.String r0 = r2.f14499
            java.lang.String r1 = r3.getSignature()
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r1)
            if (r0 == 0) goto L53
            java.lang.Object r2 = r2.f14497
            java.lang.Object r3 = r3.mo9945()
            boolean r2 = kotlin.jvm.internal.AbstractC4395.m8907(r2, r3)
            if (r2 == 0) goto L53
            r2 = 1
            return r2
        L53:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C5026.equals(java.lang.Object):boolean");
    }

    @Override // kotlin.jvm.internal.InterfaceC4398
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC4388.m8887(this.f14498, this.f14499);
    }

    @Override // kotlin.jvm.internal.InterfaceC4383
    public final int getArity() {
        InterfaceC6489 interfaceC6489Mo9941 = mo9941();
        interfaceC6489Mo9941.getClass();
        return interfaceC6489Mo9941.getParameterTypes().size();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final String getName() {
        String strM9335 = ((AbstractC7009) mo9942()).getName().m9335();
        strM9335.getClass();
        return strM9335;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5061
    public final String getSignature() {
        return this.f14499;
    }

    public final int hashCode() {
        return this.f14499.hashCode() + ((getName().hashCode() + (this.f14498.hashCode() * 31)) * 31);
    }

    @Override // p052.InterfaceC6548
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(C2125.f6276, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isExternal() {
        return this.f14489.f14577 || mo9942().isExternal();
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isInfix() {
        return this.f14489.f14583 || mo9942().isInfix();
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isInline() {
        return this.f14489.f14582 || mo9942().isInline();
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isOperator() {
        return this.f14489.f14576 || mo9942().isOperator();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isSuspend() {
        return mo9942().isSuspend();
    }

    public final String toString() {
        return C5069.m10084(this);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4484 mo9942() {
        InterfaceC5088 interfaceC5088 = f14493[0];
        Object objInvoke = this.f14496.invoke();
        objInvoke.getClass();
        return (InterfaceC4484) objInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p047.AbstractC6504 m9993(java.lang.reflect.Method r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = kotlin.reflect.jvm.internal.AbstractC5062.m10042(r4)
            r1 = 0
            if (r0 == 0) goto L4a
            飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲兰苏世 r0 = new 飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲兰苏世
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲 r2 = r4.mo9942()
            飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰苏世哲 r2 = r2.mo9034()
            if (r2 == 0) goto L42
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r2 = r2.getType()
            int r3 = p066.AbstractC6879.f18323
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲兰苏楪 r2 = r2.mo9722()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏 r2 = r2.mo9211()
            if (r2 == 0) goto L27
            boolean r1 = p066.AbstractC6879.m12156(r2)
        L27:
            r2 = 1
            if (r1 != r2) goto L42
            java.lang.Class[] r1 = r5.getParameterTypes()
            r1.getClass()
            java.lang.Object r1 = kotlin.collections.AbstractC4347.m8828(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L42
            boolean r1 = r1.isInterface()
            if (r1 != r2) goto L42
            java.lang.Object r4 = r4.f14497
            goto L46
        L42:
            java.lang.Object r4 = kotlin.reflect.jvm.internal.AbstractC5062.m10049(r4)
        L46:
            r0.<init>(r5, r6, r4)
            return r0
        L4a:
            飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰世苏哲 r4 = new 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰世苏哲
            r6 = 6
            r0 = 2
            r4.<init>(r6, r0, r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C5026.m9993(java.lang.reflect.Method, boolean):飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲苏世兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC6494 m9994(Constructor constructor, InterfaceC4484 interfaceC4484, boolean z) {
        if (!z) {
            C7018 c7018 = interfaceC4484 instanceof C7018 ? (C7018) interfaceC4484 : null;
            if (c7018 != null && !AbstractC4489.m9067(c7018.getVisibility())) {
                AbstractC6989 abstractC6989M12364 = c7018.m12364();
                abstractC6989M12364.getClass();
                if (!AbstractC6879.m12155(abstractC6989M12364) && !AbstractC6870.m12111(c7018.m12364())) {
                    List listMo9035 = c7018.mo9035();
                    listMo9035.getClass();
                    if (!listMo9035.isEmpty()) {
                        Iterator it = listMo9035.iterator();
                        while (it.hasNext()) {
                            AbstractC4882 type = ((AbstractC6977) ((InterfaceC4456) it.next())).getType();
                            type.getClass();
                            if (AbstractC5062.m10027(type)) {
                                return AbstractC5062.m10042(this) ? new C6488(constructor, AbstractC5062.m10049(this), 0) : new C6507(constructor, 0);
                            }
                        }
                    }
                }
            }
        }
        return AbstractC5062.m10042(this) ? new C6488(constructor, AbstractC5062.m10049(this), 1) : new C6507(constructor, 1);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5024 mo9947(C5051 c5051) {
        return new C5026(this.f14498, mo9942(), c5051);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6489 mo9939() {
        return (InterfaceC6489) this.f14494.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6489 mo9941() {
        return (InterfaceC6489) this.f14495.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5003 mo9943() {
        return this.f14498;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C4938 mo9944() {
        AbstractC4882 returnType = mo9942().getReturnType();
        returnType.getClass();
        return new C4938(returnType, new C5029(this, 2), false);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo9945() {
        return this.f14497;
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

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C5026(AbstractC5003 abstractC5003, InterfaceC4484 interfaceC4484, C5051 c5051) {
        abstractC5003.getClass();
        interfaceC4484.getClass();
        c5051.getClass();
        String strM9335 = ((AbstractC7009) interfaceC4484).getName().m9335();
        strM9335.getClass();
        this(abstractC5003, strM9335, AbstractC5068.m10079(interfaceC4484).mo9995(), interfaceC4484, CallableReference.NO_RECEIVER, c5051);
    }

    public C5026(AbstractC5003 abstractC5003, InterfaceC4484 interfaceC4484) {
        this(abstractC5003, interfaceC4484, C5051.f14575);
    }
}
