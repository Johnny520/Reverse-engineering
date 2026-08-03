package org.luckypray.dexkit.query.matchers.base;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.BaseQuery;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class IntRange extends BaseQuery {
    public static final Companion Companion = new Companion(null);
    private int max;
    private int min;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ IntRange create$default(Companion companion, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = Integer.MAX_VALUE;
            }
            return companion.create(i2, i3);
        }

        public final IntRange create(int i2) {
            return new IntRange(i2);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final IntRange create(int i2, int i3) {
            return new IntRange(i2, i3);
        }
    }

    public IntRange(int i2) {
        this.min = i2;
        this.max = i2;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        int iCreateIntRange = org.luckypray.dexkit.schema.IntRange.Companion.createIntRange(c0733b, this.min, this.max);
        c0733b.m1931n(iCreateIntRange);
        return iCreateIntRange;
    }

    public final /* synthetic */ void setMax(int i2) {
        this.max = i2;
    }

    public final /* synthetic */ void setMin(int i2) {
        this.min = i2;
    }

    public IntRange(int i2, int i3) {
        this.min = i2;
        this.max = i3;
    }

    public /* synthetic */ IntRange(int i2, int i3, int i4, AbstractC0304d abstractC0304d) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? Integer.MAX_VALUE : i3);
    }

    public IntRange(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        this.min = c0340c.f657a;
        this.max = c0340c.f658b;
    }
}
