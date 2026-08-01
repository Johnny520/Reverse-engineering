package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class IntRange extends org.luckypray.dexkit.query.base.BaseMatcher {
    public static final org.luckypray.dexkit.query.matchers.base.IntRange.Companion Companion = null;
    private int max;
    private int min;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.IntRange create$default(org.luckypray.dexkit.query.matchers.base.IntRange.Companion r0, int r1, int r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L5
                r1 = 0
            L5:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                r2 = 2147483647(0x7fffffff, float:NaN)
            Lc:
                org.luckypray.dexkit.query.matchers.base.IntRange r0 = r0.create(r1, r2)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.IntRange create(int r1) {
                r0 = this;
                org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
                r0.<init>(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.IntRange create(int r1, int r2) {
                r0 = this;
                org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
                r0.<init>(r1, r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.IntRange$Companion r0 = new org.luckypray.dexkit.query.matchers.base.IntRange$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.IntRange.Companion = r0
            return
    }

    public IntRange(int r1) {
            r0 = this;
            r0.<init>()
            r0.min = r1
            r0.max = r1
            return
    }

    public IntRange(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.min = r1
            r0.max = r2
            return
    }

    public /* synthetic */ IntRange(int r1, int r2, int r3, p000.AbstractC1067zq r4) {
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            r0.<init>(r1, r2)
            return
    }

    public IntRange(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            int r0 = r2.f11347
            r1.min = r0
            int r2 = r2.f11348
            r1.max = r2
            return
    }

    public final int getMax() {
            r0 = this;
            int r0 = r0.max
            return r0
    }

    public final int getMin() {
            r0 = this;
            int r0 = r0.min
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.schema.-IntRange$Companion r0 = org.luckypray.dexkit.schema.IntRange.Companion
            int r1 = r2.min
            int r2 = r2.max
            int r2 = r0.createIntRange(r3, r1, r2)
            r3.m733(r2)
            return r2
    }

    public final /* synthetic */ void setMax(int r1) {
            r0 = this;
            r0.max = r1
            return
    }

    public final /* synthetic */ void setMin(int r1) {
            r0 = this;
            r0.min = r1
            return
    }
}
