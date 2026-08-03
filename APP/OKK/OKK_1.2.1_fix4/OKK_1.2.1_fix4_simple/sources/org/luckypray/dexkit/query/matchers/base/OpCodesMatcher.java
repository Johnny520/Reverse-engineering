package org.luckypray.dexkit.query.matchers.base;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.OpCodeMatchType;
import org.luckypray.dexkit.schema.OpCodesMatcher;
import org.luckypray.dexkit.util.OpCodeUtil;
import p007D0.C0138d;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0183n;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class OpCodesMatcher extends BaseQuery {
    public static final Companion Companion = null;
    private OpCodeMatchType matchType;
    private Collection<Integer> opCodes;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ OpCodesMatcher create$default(Companion r02, Collection r1, OpCodeMatchType r2, IntRange r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = OpCodeMatchType.Contains;
        L6:
            if ((r4 & 4) == 0) goto L9;
            r3 = null;
        L9:
            return r02.create(r1, r2, r3);
        }

        public static /* synthetic */ OpCodesMatcher createForOpNames$default(Companion r02, Collection r1, OpCodeMatchType r2, IntRange r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = OpCodeMatchType.Contains;
        L6:
            if ((r4 & 4) == 0) goto L9;
            r3 = null;
        L9:
            return r02.createForOpNames(r1, r2, r3);
        }

        public final OpCodesMatcher create(Collection<Integer> r2, OpCodeMatchType r3, IntRange r4) {
            AbstractC0307g.m703e(r2, "opCodes");
            AbstractC0307g.m703e(r3, "matchType");
            return new OpCodesMatcher(r2, r3, r4);
        }

        public final OpCodesMatcher createForOpNames(Collection<String> r3, OpCodeMatchType r4, IntRange r5) {
            AbstractC0307g.m703e(r3, "opNames");
            AbstractC0307g.m703e(r4, "matchType");
            ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r3, 10));
            Iterator<T> r32 = r3.iterator();
        L4:
            if (r32.hasNext() == false) goto L7;
            r02.add(Integer.valueOf(OpCodeUtil.getOpCode((String) r32.next())));
            goto L4
        L7:
            return new OpCodesMatcher(r02, r4, r5);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final OpCodesMatcher create(int[] r2, OpCodeMatchType r3, IntRange r4) {
            AbstractC0307g.m703e(r2, "opCodes");
            AbstractC0307g.m703e(r3, "matchType");
            return new OpCodesMatcher(r2, r3, r4);
        }

        public static /* synthetic */ OpCodesMatcher create$default(Companion r02, int[] r1, OpCodeMatchType r2, IntRange r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = OpCodeMatchType.Contains;
        L6:
            if ((r4 & 4) == 0) goto L9;
            r3 = null;
        L9:
            return r02.create(r1, r2, r3);
        }

        public static /* synthetic */ OpCodesMatcher createForOpNames$default(Companion r02, String[] r1, OpCodeMatchType r2, IntRange r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = OpCodeMatchType.Contains;
        L6:
            if ((r4 & 4) == 0) goto L9;
            r3 = null;
        L9:
            return r02.createForOpNames(r1, r2, r3);
        }

        public final OpCodesMatcher create(int... r8) {
            AbstractC0307g.m703e(r8, "opCodes");
            OpCodeMatchType r3 = null;
            IntRange r4 = null;
            return new OpCodesMatcher(AbstractC0179j.m539p0(r8), r3, r4, 6, null);
        }

        public final OpCodesMatcher createForOpNames(String[] r5, OpCodeMatchType r6, IntRange r7) {
            AbstractC0307g.m703e(r5, "opNames");
            AbstractC0307g.m703e(r6, "matchType");
            ArrayList r02 = new ArrayList(r5.length);
            int r1 = r5.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L6;
            r02.add(Integer.valueOf(OpCodeUtil.getOpCode(r5[r2])));
            r2 = r2 + 1;
            goto L3
        L6:
            return new OpCodesMatcher(r02, r6, r7);
        }

        public final OpCodesMatcher createForOpNames(String... r8) {
            AbstractC0307g.m703e(r8, "opNames");
            ArrayList r2 = new ArrayList(r8.length);
            int r02 = r8.length;
            int r1 = 0;
        L3:
            if (r1 >= r02) goto L6;
            r2.add(Integer.valueOf(OpCodeUtil.getOpCode(r8[r1])));
            r1 = r1 + 1;
            goto L3
        L6:
            return new OpCodesMatcher(r2, null, null, 6, null);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public OpCodesMatcher(Collection<Integer> r8) {
        AbstractC0307g.m703e(r8, "opCodes");
        OpCodeMatchType r3 = null;
        IntRange r4 = null;
        this(r8, r3, r4, 6, null);
    }

    public static final OpCodesMatcher create(Collection<Integer> r1, OpCodeMatchType r2, IntRange r3) {
        return Companion.create(r1, r2, r3);
    }

    public static final OpCodesMatcher createForOpNames(Collection<String> r1, OpCodeMatchType r2, IntRange r3) {
        return Companion.createForOpNames(r1, r2, r3);
    }

    public static /* synthetic */ OpCodesMatcher size$default(OpCodesMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.size(r1, r2);
    }

    public final OpCodeMatchType getMatchType() {
        return this.matchType;
    }

    public final Collection<Integer> getOpCodes() {
        return this.opCodes;
    }

    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    public final /* synthetic */ int getSize() {
        throw new C0138d();
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r8) {
        AbstractC0307g.m703e(r8, "fbb");
        OpCodesMatcher.Companion r02 = org.luckypray.dexkit.schema.OpCodesMatcher.Companion;
        Collection<Integer> r1 = this.opCodes;
        int r2 = 0;
        if (r1 == null) goto L13;
        ArrayList r3 = new ArrayList(AbstractC0183n.m559k0(r1, 10));
        Iterator<T> r12 = r1.iterator();
    L6:
        if (r12.hasNext() == false) goto L8;
        r3.add(Short.valueOf((short) ((Number) r12.next()).intValue()));
        goto L6
    L8:
        short[] r13 = new short[r3.size()];
        Iterator r32 = r3.iterator();
        int r4 = 0;
    L10:
        if (r32.hasNext() == false) goto L12;
        r13[r4] = ((Number) r32.next()).shortValue();
        r4 = r4 + 1;
        goto L10
    L12:
        int r14 = org.luckypray.dexkit.schema.OpCodesMatcher.Companion.createOpCodesVector(r8, r13);
    L14:
        byte r33 = this.matchType.getValue();
        IntRange r42 = this.rangeMatcher;
        if (r42 == null) goto L17;
        r2 = BaseQuery.access$innerBuild(r42, r8);
    L17:
        int r03 = r02.createOpCodesMatcher(r8, r14, r33, r2);
        r8.m1931n(r03);
        return r03;
    L13:
        r14 = 0;
        goto L14
    }

    public final OpCodesMatcher matchType(OpCodeMatchType r2) {
        AbstractC0307g.m703e(r2, "matchType");
        this.matchType = r2;
        return this;
    }

    public final OpCodesMatcher opCodes(Collection<Integer> r2) {
        AbstractC0307g.m703e(r2, "opCodes");
        this.opCodes = r2;
        return this;
    }

    public final OpCodesMatcher opNames(Collection<String> r3) {
        AbstractC0307g.m703e(r3, "opNames");
        ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r3, 10));
        Iterator<T> r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        r02.add(Integer.valueOf(OpCodeUtil.getOpCode((String) r32.next())));
        goto L4
    L6:
        this.opCodes = r02;
        return this;
    }

    public final /* synthetic */ void setMatchType(OpCodeMatchType r2) {
        AbstractC0307g.m703e(r2, "<set-?>");
        this.matchType = r2;
    }

    public final /* synthetic */ void setOpCodes(Collection r1) {
        this.opCodes = r1;
    }

    public final /* synthetic */ void setSize(int r1) {
        size(r1);
    }

    public final OpCodesMatcher size(int r2) {
        this.rangeMatcher = new IntRange(r2);
        return this;
    }

    public final OpCodesMatcher sizeMax(int r3) {
        this.rangeMatcher = new IntRange(0, r3);
        return this;
    }

    public final OpCodesMatcher sizeMin(int r3) {
        this.rangeMatcher = new IntRange(r3, Integer.MAX_VALUE);
        return this;
    }

    public OpCodesMatcher(Collection<Integer> r8, OpCodeMatchType r9) {
        AbstractC0307g.m703e(r8, "opCodes");
        AbstractC0307g.m703e(r9, "matchType");
        IntRange r4 = null;
        this(r8, r9, r4, 4, null);
    }

    public static final OpCodesMatcher create(int... r1) {
        return Companion.create(r1);
    }

    public static final OpCodesMatcher createForOpNames(String... r1) {
        return Companion.createForOpNames(r1);
    }

    public final OpCodesMatcher opCodes(Integer[] r2) {
        AbstractC0307g.m703e(r2, "opCodes");
        this.opCodes = AbstractC0179j.m540q0(r2);
        return this;
    }

    public final OpCodesMatcher size(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        this.rangeMatcher = r2;
        return this;
    }

    public OpCodesMatcher(int[] r8) {
        AbstractC0307g.m703e(r8, "opCodes");
        OpCodeMatchType r3 = null;
        IntRange r4 = null;
        this(r8, r3, r4, 6, null);
    }

    public static final OpCodesMatcher create(int[] r1, OpCodeMatchType r2, IntRange r3) {
        return Companion.create(r1, r2, r3);
    }

    public static final OpCodesMatcher createForOpNames(String[] r1, OpCodeMatchType r2, IntRange r3) {
        return Companion.createForOpNames(r1, r2, r3);
    }

    public final OpCodesMatcher size(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        this.rangeMatcher = new IntRange(r2);
        return this;
    }

    public OpCodesMatcher(int[] r8, OpCodeMatchType r9) {
        AbstractC0307g.m703e(r8, "opCodes");
        AbstractC0307g.m703e(r9, "matchType");
        IntRange r4 = null;
        this(r8, r9, r4, 4, null);
    }

    public final OpCodesMatcher size(int r2, int r3) {
        this.rangeMatcher = new IntRange(r2, r3);
        return this;
    }

    public OpCodesMatcher() {
        this.matchType = OpCodeMatchType.Contains;
    }

    public /* synthetic */ OpCodesMatcher(Collection r1, OpCodeMatchType r2, IntRange r3, int r4, AbstractC0304d r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = OpCodeMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        this(r1, r2, r3);
    }

    public final OpCodesMatcher opNames(String[] r5) {
        AbstractC0307g.m703e(r5, "opNames");
        ArrayList r02 = new ArrayList(r5.length);
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02.add(Integer.valueOf(OpCodeUtil.getOpCode(r5[r2])));
        r2 = r2 + 1;
        goto L3
    L5:
        this.opCodes = r02;
        return this;
    }

    public OpCodesMatcher(Collection<Integer> r2, OpCodeMatchType r3, IntRange r4) {
        AbstractC0307g.m703e(r2, "opCodes");
        AbstractC0307g.m703e(r3, "matchType");
        OpCodeMatchType r02 = OpCodeMatchType.Contains;
        this.opCodes = r2;
        this.matchType = r3;
        this.rangeMatcher = r4;
    }

    public /* synthetic */ OpCodesMatcher(int[] r1, OpCodeMatchType r2, IntRange r3, int r4, AbstractC0304d r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = OpCodeMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        this(r1, r2, r3);
    }

    public OpCodesMatcher(int[] r2, OpCodeMatchType r3, IntRange r4) {
        AbstractC0307g.m703e(r2, "opCodes");
        AbstractC0307g.m703e(r3, "matchType");
        this.matchType = OpCodeMatchType.Contains;
        this.opCodes = AbstractC0179j.m539p0(r2);
        this.matchType = r3;
        this.rangeMatcher = r4;
    }
}
