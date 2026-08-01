package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p079.AbstractC6989;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4894 extends AbstractC4909 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4894(C4845 c4845) {
        super(c4845);
        if (c4845 != null) {
        } else {
            m9830(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9830(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC4894.m9830(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[RETURN] */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo9831(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p079.AbstractC6989
            r1 = 0
            if (r0 == 0) goto L71
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰 r4 = r4.mo9211()
            r4.getClass()
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r0 = r4.getName()
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r2 = r5.getName()
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r2)
            r2 = 1
            if (r0 != 0) goto L1d
        L1b:
            r4 = r1
            goto L6e
        L1d:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r4 = r4.mo9028()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r5 = r5.mo9028()
        L25:
            if (r4 == 0) goto L4f
            if (r5 == 0) goto L4f
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
            if (r0 == 0) goto L30
            boolean r4 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
            goto L6e
        L30:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
            if (r0 == 0) goto L35
            goto L1b
        L35:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466
            if (r0 == 0) goto L51
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪兰苏哲 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466) r4
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪哲兰苏 r4 = (p079.AbstractC6986) r4
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰 r4 = r4.f18687
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪兰苏哲 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466) r5
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪哲兰苏 r5 = (p079.AbstractC6986) r5
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰 r5 = r5.f18687
            boolean r4 = kotlin.jvm.internal.AbstractC4395.m8907(r4, r5)
            if (r4 == 0) goto L1b
        L4f:
            r4 = r2
            goto L6e
        L51:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466
            if (r0 == 0) goto L56
            goto L1b
        L56:
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r0 = r4.getName()
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r3 = r5.getName()
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r3)
            if (r0 != 0) goto L65
            goto L1b
        L65:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r4 = r4.mo9028()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r5 = r5.mo9028()
            goto L25
        L6e:
            if (r4 == 0) goto L71
            return r2
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC4894.mo9831(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6530 mo9493() {
        AbstractC6530 abstractC6530M9499 = AbstractC4773.m9499(mo9211());
        if (abstractC6530M9499 != null) {
            return abstractC6530M9499;
        }
        m9830(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4882 mo9832() {
        AbstractC6989 abstractC6989Mo9211 = mo9211();
        if (abstractC6989Mo9211 == null) {
            AbstractC6530.m12020(107);
            throw null;
        }
        C4691 c4691 = AbstractC6530.f17920;
        if (AbstractC6530.m12019(abstractC6989Mo9211, AbstractC6527.f17885) || AbstractC6530.m12019(abstractC6989Mo9211, AbstractC6527.f17884)) {
            return null;
        }
        return mo9493().m12025();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC6989 mo9211();
}
