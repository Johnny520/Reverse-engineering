package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R*\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0005¨\u0006\u0018"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "", "value", "<init>", "(I)V", "min", "max", "(II)V", "LYue/ۥ۠ۥۣۨ;", "range", "(LYue/ۥ۠ۥۣۨ;)V", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "I", "getMin", "()I", "setMin", "getMax", "setMax", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class IntRange extends org.luckypray.dexkit.query.base.BaseMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.base.IntRange.Companion Companion = null;
    private int max;
    private int min;

    @Yue.InterfaceC4201(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "", "min", "max", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
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

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.query.matchers.base.IntRange create(int r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
                r0.<init>(r2)
                return r0
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.query.matchers.base.IntRange create(int r2, int r3) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
                r0.<init>(r2, r3)
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

    public /* synthetic */ IntRange(int r1, int r2, int r3, Yue.C1769 r4) {
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

    public IntRange(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.max = r0
            int r0 = r2.m13737()
            r1.min = r0
            int r2 = r2.m13738()
            r1.max = r2
            return
    }

    public final int getMax() {
            r1 = this;
            int r0 = r1.max
            return r0
    }

    public final int getMin() {
            r1 = this;
            int r0 = r1.min
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r4) {
            r3 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.schema.-IntRange$Companion r0 = org.luckypray.dexkit.schema.IntRange.Companion
            int r1 = r3.min
            int r2 = r3.max
            int r0 = r0.createIntRange(r4, r1, r2)
            r4.finish(r0)
            return r0
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
