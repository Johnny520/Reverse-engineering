package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p079.AbstractC6988;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4893 extends AbstractC4908 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4893(C4844 c4844) {
        super(c4844);
        if (c4844 != null) {
        } else {
            m9836(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9836(int r9) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC4893.m9836(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[RETURN] */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo9837(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p079.AbstractC6988
            r1 = 0
            if (r0 == 0) goto L71
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰 r4 = r4.mo9221()
            r4.getClass()
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r0 = r4.getName()
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r2 = r5.getName()
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r2)
            r2 = 1
            if (r0 != 0) goto L1d
        L1b:
            r4 = r1
            goto L6e
        L1d:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r4 = r4.mo9038()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r5 = r5.mo9038()
        L25:
            if (r4 == 0) goto L4f
            if (r5 == 0) goto L4f
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485
            if (r0 == 0) goto L30
            boolean r4 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485
            goto L6e
        L30:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485
            if (r0 == 0) goto L35
            goto L1b
        L35:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465
            if (r0 == 0) goto L51
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪兰苏哲 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465) r4
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪哲兰苏 r4 = (p079.AbstractC6985) r4
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰 r4 = r4.f18692
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪兰苏哲 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465) r5
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪哲兰苏 r5 = (p079.AbstractC6985) r5
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰 r5 = r5.f18692
            boolean r4 = kotlin.jvm.internal.AbstractC4394.m8917(r4, r5)
            if (r4 == 0) goto L1b
        L4f:
            r4 = r2
            goto L6e
        L51:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465
            if (r0 == 0) goto L56
            goto L1b
        L56:
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r0 = r4.getName()
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r3 = r5.getName()
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r3)
            if (r0 != 0) goto L65
            goto L1b
        L65:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r4 = r4.mo9038()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r5 = r5.mo9038()
            goto L25
        L6e:
            if (r4 == 0) goto L71
            return r2
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC4893.mo9837(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6529 mo9503() {
        AbstractC6529 abstractC6529M9509 = AbstractC4772.m9509(mo9221());
        if (abstractC6529M9509 != null) {
            return abstractC6529M9509;
        }
        m9836(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4881 mo9838() {
        AbstractC6988 abstractC6988Mo9221 = mo9221();
        if (abstractC6988Mo9221 == null) {
            AbstractC6529.m11977(107);
            throw null;
        }
        C4690 c4690 = AbstractC6529.f17924;
        if (AbstractC6529.m11976(abstractC6988Mo9221, AbstractC6526.f17889) || AbstractC6529.m11976(abstractC6988Mo9221, AbstractC6526.f17888)) {
            return null;
        }
        return mo9503().m11982();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC6988 mo9221();
}
