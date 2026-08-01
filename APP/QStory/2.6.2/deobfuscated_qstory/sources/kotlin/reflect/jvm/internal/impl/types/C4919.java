package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4919 extends AbstractC4906 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f14246;

    public C4919(String str) {
        this.f14246 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9870(int r9) {
        /*
            r0 = 4
            r1 = 1
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = r3
            goto L14
        L13:
            r5 = r4
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
            r7 = 0
            if (r9 == r1) goto L30
            if (r9 == r4) goto L2b
            if (r9 == r3) goto L26
            if (r9 == r0) goto L30
            java.lang.String r8 = "newAttributes"
            r5[r7] = r8
            goto L32
        L26:
            java.lang.String r8 = "kotlinTypeRefiner"
            r5[r7] = r8
            goto L32
        L2b:
            java.lang.String r8 = "delegate"
            r5[r7] = r8
            goto L32
        L30:
            r5[r7] = r6
        L32:
            java.lang.String r7 = "refine"
            if (r9 == r1) goto L3e
            if (r9 == r0) goto L3b
            r5[r1] = r6
            goto L42
        L3b:
            r5[r1] = r7
            goto L42
        L3e:
            java.lang.String r6 = "toString"
            r5[r1] = r6
        L42:
            if (r9 == r1) goto L56
            if (r9 == r4) goto L52
            if (r9 == r3) goto L4f
            if (r9 == r0) goto L56
            java.lang.String r3 = "replaceAttributes"
            r5[r4] = r3
            goto L56
        L4f:
            r5[r4] = r7
            goto L56
        L52:
            java.lang.String r3 = "replaceDelegate"
            r5[r4] = r3
        L56:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4919.m9870(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    public final String toString() {
        return this.f14246;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906, kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4881 mo9740(AbstractC4860 abstractC4860) {
        if (abstractC4860 != null) {
            return this;
        }
        m9870(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4877 mo9776(C4873 c4873) {
        if (c4873 != null) {
            throw new IllegalStateException(this.f14246);
        }
        m9870(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4877 mo9741(boolean z) {
        throw new IllegalStateException(this.f14246);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final AbstractC4877 mo9731(AbstractC4860 abstractC4860) {
        if (abstractC4860 != null) {
            return this;
        }
        m9870(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC4906 mo9777(AbstractC4877 abstractC4877) {
        throw new IllegalStateException(this.f14246);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC4877 mo9787() {
        throw new IllegalStateException(this.f14246);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906, kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4913 mo9740(AbstractC4860 abstractC4860) {
        if (abstractC4860 != null) {
            return this;
        }
        m9870(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877, kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4913 mo9741(boolean z) {
        mo9741(z);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877, kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final /* bridge */ /* synthetic */ AbstractC4913 mo9776(C4873 c4873) {
        mo9776(c4873);
        throw null;
    }
}
