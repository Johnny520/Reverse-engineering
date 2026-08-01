package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4920 extends AbstractC4907 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f14250;

    public C4920(String str) {
        this.f14250 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9864(int r9) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4920.m9864(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    public final String toString() {
        return this.f14250;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907, kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4882 mo9730(AbstractC4861 abstractC4861) {
        if (abstractC4861 != null) {
            return this;
        }
        m9864(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4878 mo9770(C4874 c4874) {
        if (c4874 != null) {
            throw new IllegalStateException(this.f14250);
        }
        m9864(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4878 mo9731(boolean z) {
        throw new IllegalStateException(this.f14250);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final AbstractC4878 mo9721(AbstractC4861 abstractC4861) {
        if (abstractC4861 != null) {
            return this;
        }
        m9864(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC4907 mo9771(AbstractC4878 abstractC4878) {
        throw new IllegalStateException(this.f14250);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC4878 mo9781() {
        throw new IllegalStateException(this.f14250);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907, kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4914 mo9730(AbstractC4861 abstractC4861) {
        if (abstractC4861 != null) {
            return this;
        }
        m9864(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878, kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4914 mo9731(boolean z) {
        mo9731(z);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878, kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final /* bridge */ /* synthetic */ AbstractC4914 mo9770(C4874 c4874) {
        mo9770(c4874);
        throw null;
    }
}
