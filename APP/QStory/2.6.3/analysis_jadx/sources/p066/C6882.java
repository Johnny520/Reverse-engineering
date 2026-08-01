package p066;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6882 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6882 f18327 = new C6882(OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE, "SUCCESS");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final OverridingUtil$OverrideCompatibilityInfo$Result f18329;

    public C6882(OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result, String str) {
        if (overridingUtil$OverrideCompatibilityInfo$Result == null) {
            m12158(3);
            throw null;
        }
        this.f18329 = overridingUtil$OverrideCompatibilityInfo$Result;
        this.f18328 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6882 m12157(String str) {
        return new C6882(OverridingUtil$OverrideCompatibilityInfo$Result.INCOMPATIBLE, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m12158(int r10) {
        /*
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            if (r10 == r3) goto Lf
            if (r10 == r2) goto Lf
            if (r10 == r1) goto Lf
            if (r10 == r0) goto Lf
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
            goto L11
        Lf:
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L11:
            if (r10 == r3) goto L1b
            if (r10 == r2) goto L1b
            if (r10 == r1) goto L1b
            if (r10 == r0) goto L1b
            r5 = r2
            goto L1c
        L1b:
            r5 = r1
        L1c:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "success"
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
            r8 = 0
            if (r10 == r3) goto L31
            if (r10 == r2) goto L31
            if (r10 == r1) goto L2e
            if (r10 == r0) goto L31
            r5[r8] = r7
            goto L35
        L2e:
            r5[r8] = r6
            goto L35
        L31:
            java.lang.String r9 = "debugMessage"
            r5[r8] = r9
        L35:
            switch(r10) {
                case 1: goto L45;
                case 2: goto L45;
                case 3: goto L45;
                case 4: goto L45;
                case 5: goto L40;
                case 6: goto L3b;
                default: goto L38;
            }
        L38:
            r5[r3] = r6
            goto L47
        L3b:
            java.lang.String r6 = "getDebugMessage"
            r5[r3] = r6
            goto L47
        L40:
            java.lang.String r6 = "getResult"
            r5[r3] = r6
            goto L47
        L45:
            r5[r3] = r7
        L47:
            if (r10 == r3) goto L5a
            if (r10 == r2) goto L55
            if (r10 == r1) goto L50
            if (r10 == r0) goto L50
            goto L5e
        L50:
            java.lang.String r6 = "<init>"
            r5[r2] = r6
            goto L5e
        L55:
            java.lang.String r6 = "conflict"
            r5[r2] = r6
            goto L5e
        L5a:
            java.lang.String r6 = "incompatible"
            r5[r2] = r6
        L5e:
            java.lang.String r4 = java.lang.String.format(r4, r5)
            if (r10 == r3) goto L70
            if (r10 == r2) goto L70
            if (r10 == r1) goto L70
            if (r10 == r0) goto L70
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
            goto L75
        L70:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r4)
        L75:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p066.C6882.m12158(int):void");
    }

    public final String toString() {
        return this.f18329 + ": " + this.f18328;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final OverridingUtil$OverrideCompatibilityInfo$Result m12159() {
        OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result = this.f18329;
        if (overridingUtil$OverrideCompatibilityInfo$Result != null) {
            return overridingUtil$OverrideCompatibilityInfo$Result;
        }
        m12158(5);
        throw null;
    }
}
