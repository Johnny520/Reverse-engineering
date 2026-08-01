package org.luckypray.dexkit.query.matchers.base;

import org.luckypray.dexkit.query.base.BaseMatcher;
import p000.AbstractC0619pl;
import p000.C0938xt;
import p000.z20;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class IntRange extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private int max;
    private int min;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED] (LINE:6)) != (0 int)) ? (Integer.MAX_VALUE int) : (r2v0 int))
 A[MD:(int, int):void (m)] (LINE:13) call: org.luckypray.dexkit.query.matchers.base.IntRange.<init>(int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ IntRange(int i, int i2, int i3, AbstractC0619pl abstractC0619pl) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) {
        c0938xt.getClass();
        int iCreateIntRange = org.luckypray.dexkit.schema.IntRange.Companion.createIntRange(c0938xt, this.min, this.max);
        c0938xt.m5165n(iCreateIntRange);
        return iCreateIntRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setMax(int i) {
        this.max = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setMin(int i) {
        this.min = i;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.IntRange.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ IntRange create$default(Companion companion, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = Integer.MAX_VALUE;
            }
            return companion.create(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final IntRange create(int i) {
            return new IntRange(i);
        }

        private Companion() {
        }

        public final IntRange create(int i, int i2) {
            return new IntRange(i, i2);
        }
    }

    public IntRange(int i, int i2) {
        this.min = i;
        this.max = i2;
    }

    public IntRange(int i) {
        this.min = i;
        this.max = i;
    }

    public IntRange(z20 z20Var) {
        z20Var.getClass();
        this.min = z20Var.f7248d;
        this.max = z20Var.f7249e;
    }
}
