package kotlin.reflect.jvm.internal;

import androidx.compose.ui.C2125;
import com.bumptech.glide.AbstractC3055;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.InterfaceC4382;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.types.C4937;
import p047.AbstractC6493;
import p047.C6487;
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
import p066.AbstractC6869;
import p066.AbstractC6878;
import p079.AbstractC6976;
import p079.AbstractC6988;
import p079.AbstractC7008;
import p079.C7017;
import p316.C8675;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5025 extends AbstractC5023 implements InterfaceC4382, InterfaceC6542, InterfaceC6557, InterfaceC6541, InterfaceC6540, InterfaceC6539, InterfaceC6538, InterfaceC6537, InterfaceC6555, InterfaceC6554, InterfaceC6558, InterfaceC6559, InterfaceC6556, InterfaceC6553, InterfaceC6549, InterfaceC6548, InterfaceC6552, InterfaceC6550, InterfaceC6551, InterfaceC6544, InterfaceC6543, InterfaceC6546, InterfaceC6547, InterfaceC6545, InterfaceC5093, InterfaceC5060 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f14491 = {new PropertyReference1Impl(C5025.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC5183 f14492;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f14493;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5073 f14494;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f14495;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC5002 f14496;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String f14497;

    public C5025(AbstractC5002 abstractC5002, String str, String str2, InterfaceC4483 interfaceC4483, Object obj, C5050 c5050) {
        super(c5050);
        this.f14496 = abstractC5002;
        this.f14497 = str2;
        this.f14495 = obj;
        int i = 0;
        this.f14494 = AbstractC3055.m6635(interfaceC4483, new C5027(this, i, str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14493 = AbstractC5186.m10211(lazyThreadSafetyMode, new C5028(this, i));
        this.f14492 = AbstractC5186.m10211(lazyThreadSafetyMode, new C5028(this, 1));
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
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世 r0 = r2.f14496
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世 r1 = r3.mo9946()
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r1)
            if (r0 == 0) goto L53
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = r3.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            java.lang.String r0 = r2.f14497
            java.lang.String r1 = r3.getSignature()
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r1)
            if (r0 == 0) goto L53
            java.lang.Object r2 = r2.f14495
            java.lang.Object r3 = r3.mo9948()
            boolean r2 = kotlin.jvm.internal.AbstractC4394.m8917(r2, r3)
            if (r2 == 0) goto L53
            r2 = 1
            return r2
        L53:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C5025.equals(java.lang.Object):boolean");
    }

    @Override // kotlin.jvm.internal.InterfaceC4397
    public final GenericDeclaration findJavaDeclaration() {
        return AbstractC4387.m8897(this.f14496, this.f14497);
    }

    @Override // kotlin.jvm.internal.InterfaceC4382
    public final int getArity() {
        InterfaceC6488 interfaceC6488Mo9944 = mo9944();
        interfaceC6488Mo9944.getClass();
        return interfaceC6488Mo9944.getParameterTypes().size();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getName() {
        String strM9345 = ((AbstractC7008) mo9945()).getName().m9345();
        strM9345.getClass();
        return strM9345;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5060
    public final String getSignature() {
        return this.f14497;
    }

    public final int hashCode() {
        return this.f14497.hashCode() + ((getName().hashCode() + (this.f14496.hashCode() * 31)) * 31);
    }

    @Override // p052.InterfaceC6547
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(C2125.f6275, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isExternal() {
        return this.f14487.f14575 || mo9945().isExternal();
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isInfix() {
        return this.f14487.f14581 || mo9945().isInfix();
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isInline() {
        return this.f14487.f14580 || mo9945().isInline();
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isOperator() {
        return this.f14487.f14574 || mo9945().isOperator();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isSuspend() {
        return mo9945().isSuspend();
    }

    public final String toString() {
        return C5068.m10080(this);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4483 mo9945() {
        InterfaceC5087 interfaceC5087 = f14491[0];
        Object objInvoke = this.f14494.invoke();
        objInvoke.getClass();
        return (InterfaceC4483) objInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p047.AbstractC6503 m9996(java.lang.reflect.Method r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = kotlin.reflect.jvm.internal.AbstractC5061.m10028(r4)
            r1 = 0
            if (r0 == 0) goto L4a
            飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲兰苏世 r0 = new 飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲兰苏世
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲 r2 = r4.mo9945()
            飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰苏世哲 r2 = r2.mo9044()
            if (r2 == 0) goto L42
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r2 = r2.getType()
            int r3 = p066.AbstractC6878.f18328
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲兰苏楪 r2 = r2.mo9732()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏 r2 = r2.mo9221()
            if (r2 == 0) goto L27
            boolean r1 = p066.AbstractC6878.m12128(r2)
        L27:
            r2 = 1
            if (r1 != r2) goto L42
            java.lang.Class[] r1 = r5.getParameterTypes()
            r1.getClass()
            java.lang.Object r1 = kotlin.collections.AbstractC4346.m8848(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L42
            boolean r1 = r1.isInterface()
            if (r1 != r2) goto L42
            java.lang.Object r4 = r4.f14495
            goto L46
        L42:
            java.lang.Object r4 = kotlin.reflect.jvm.internal.AbstractC5061.m10041(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C5025.m9996(java.lang.reflect.Method, boolean):飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲苏世兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC6493 m9997(Constructor constructor, InterfaceC4483 interfaceC4483, boolean z) {
        if (!z) {
            C7017 c7017 = interfaceC4483 instanceof C7017 ? (C7017) interfaceC4483 : null;
            if (c7017 != null && !AbstractC4488.m9077(c7017.getVisibility())) {
                AbstractC6988 abstractC6988M12337 = c7017.m12337();
                abstractC6988M12337.getClass();
                if (!AbstractC6878.m12127(abstractC6988M12337) && !AbstractC6869.m12083(c7017.m12337())) {
                    List listMo9045 = c7017.mo9045();
                    listMo9045.getClass();
                    if (!listMo9045.isEmpty()) {
                        Iterator it = listMo9045.iterator();
                        while (it.hasNext()) {
                            AbstractC4881 type = ((AbstractC6976) ((InterfaceC4455) it.next())).getType();
                            type.getClass();
                            if (C8675.m14345(type)) {
                                return AbstractC5061.m10028(this) ? new C6487(constructor, AbstractC5061.m10041(this), 0) : new C6506(constructor, 0);
                            }
                        }
                    }
                }
            }
        }
        return AbstractC5061.m10028(this) ? new C6487(constructor, AbstractC5061.m10041(this), 1) : new C6506(constructor, 1);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5023 mo9950(C5050 c5050) {
        return new C5025(this.f14496, mo9945(), c5050);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6488 mo9942() {
        return (InterfaceC6488) this.f14492.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6488 mo9944() {
        return (InterfaceC6488) this.f14493.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5002 mo9946() {
        return this.f14496;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C4937 mo9947() {
        AbstractC4881 returnType = mo9945().getReturnType();
        returnType.getClass();
        return new C4937(returnType, new C5028(this, 2), false);
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo9948() {
        return this.f14495;
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

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C5025(AbstractC5002 abstractC5002, InterfaceC4483 interfaceC4483, C5050 c5050) {
        abstractC5002.getClass();
        interfaceC4483.getClass();
        c5050.getClass();
        String strM9345 = ((AbstractC7008) interfaceC4483).getName().m9345();
        strM9345.getClass();
        this(abstractC5002, strM9345, AbstractC5067.m10075(interfaceC4483).mo9998(), interfaceC4483, CallableReference.NO_RECEIVER, c5050);
    }

    public C5025(AbstractC5002 abstractC5002, InterfaceC4483 interfaceC4483) {
        this(abstractC5002, interfaceC4483, C5050.f14573);
    }
}
