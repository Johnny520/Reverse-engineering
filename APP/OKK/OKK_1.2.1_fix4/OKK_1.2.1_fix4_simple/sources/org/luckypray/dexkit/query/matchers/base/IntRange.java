package org.luckypray.dexkit.query.matchers.base;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.BaseQuery;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class IntRange extends BaseQuery {
    public static final Companion Companion = null;
    private int max;
    private int min;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ IntRange create$default(Companion r02, int r1, int r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = 0;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = Integer.MAX_VALUE;
        L9:
            return r02.create(r1, r2);
        }

        public final IntRange create(int r2) {
            return new IntRange(r2);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final IntRange create(int r2, int r3) {
            return new IntRange(r2, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public IntRange(int r1) {
        this.min = r1;
        this.max = r1;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r4) {
        AbstractC0307g.m703e(r4, "fbb");
        int r02 = org.luckypray.dexkit.schema.IntRange.Companion.createIntRange(r4, this.min, this.max);
        r4.m1931n(r02);
        return r02;
    }

    public final /* synthetic */ void setMax(int r1) {
        this.max = r1;
    }

    public final /* synthetic */ void setMin(int r1) {
        this.min = r1;
    }

    public IntRange(int r1, int r2) {
        this.min = r1;
        this.max = r2;
    }

    public /* synthetic */ IntRange(int r1, int r2, int r3, AbstractC0304d r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = Integer.MAX_VALUE;
    L8:
        this(r1, r2);
    }

    public IntRange(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        this.min = r2.f657a;
        this.max = r2.f658b;
    }
}
