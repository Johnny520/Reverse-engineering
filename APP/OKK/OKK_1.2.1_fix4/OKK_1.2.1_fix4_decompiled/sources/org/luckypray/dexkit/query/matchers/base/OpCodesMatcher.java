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
    public static final Companion Companion = new Companion(null);
    private OpCodeMatchType matchType;
    private Collection<Integer> opCodes;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ OpCodesMatcher create$default(Companion companion, Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                opCodeMatchType = OpCodeMatchType.Contains;
            }
            if ((i2 & 4) != 0) {
                intRange = null;
            }
            return companion.create((Collection<Integer>) collection, opCodeMatchType, intRange);
        }

        public static /* synthetic */ OpCodesMatcher createForOpNames$default(Companion companion, Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                opCodeMatchType = OpCodeMatchType.Contains;
            }
            if ((i2 & 4) != 0) {
                intRange = null;
            }
            return companion.createForOpNames((Collection<String>) collection, opCodeMatchType, intRange);
        }

        public final OpCodesMatcher create(Collection<Integer> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
            AbstractC0307g.m703e(collection, "opCodes");
            AbstractC0307g.m703e(opCodeMatchType, "matchType");
            return new OpCodesMatcher(collection, opCodeMatchType, intRange);
        }

        public final OpCodesMatcher createForOpNames(Collection<String> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
            AbstractC0307g.m703e(collection, "opNames");
            AbstractC0307g.m703e(opCodeMatchType, "matchType");
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode((String) it.next())));
            }
            return new OpCodesMatcher(arrayList, opCodeMatchType, intRange);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final OpCodesMatcher create(int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange) {
            AbstractC0307g.m703e(iArr, "opCodes");
            AbstractC0307g.m703e(opCodeMatchType, "matchType");
            return new OpCodesMatcher(iArr, opCodeMatchType, intRange);
        }

        public static /* synthetic */ OpCodesMatcher create$default(Companion companion, int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                opCodeMatchType = OpCodeMatchType.Contains;
            }
            if ((i2 & 4) != 0) {
                intRange = null;
            }
            return companion.create(iArr, opCodeMatchType, intRange);
        }

        public static /* synthetic */ OpCodesMatcher createForOpNames$default(Companion companion, String[] strArr, OpCodeMatchType opCodeMatchType, IntRange intRange, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                opCodeMatchType = OpCodeMatchType.Contains;
            }
            if ((i2 & 4) != 0) {
                intRange = null;
            }
            return companion.createForOpNames(strArr, opCodeMatchType, intRange);
        }

        public final OpCodesMatcher create(int... iArr) {
            AbstractC0307g.m703e(iArr, "opCodes");
            return new OpCodesMatcher(AbstractC0179j.m539p0(iArr), (OpCodeMatchType) null, (IntRange) null, 6, (AbstractC0304d) null);
        }

        public final OpCodesMatcher createForOpNames(String[] strArr, OpCodeMatchType opCodeMatchType, IntRange intRange) {
            AbstractC0307g.m703e(strArr, "opNames");
            AbstractC0307g.m703e(opCodeMatchType, "matchType");
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode(str)));
            }
            return new OpCodesMatcher(arrayList, opCodeMatchType, intRange);
        }

        public final OpCodesMatcher createForOpNames(String... strArr) {
            AbstractC0307g.m703e(strArr, "opNames");
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode(str)));
            }
            return new OpCodesMatcher(arrayList, (OpCodeMatchType) null, (IntRange) null, 6, (AbstractC0304d) null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpCodesMatcher(Collection<Integer> collection) {
        this(collection, (OpCodeMatchType) null, (IntRange) null, 6, (AbstractC0304d) null);
        AbstractC0307g.m703e(collection, "opCodes");
    }

    public static final OpCodesMatcher create(Collection<Integer> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        return Companion.create(collection, opCodeMatchType, intRange);
    }

    public static final OpCodesMatcher createForOpNames(Collection<String> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        return Companion.createForOpNames(collection, opCodeMatchType, intRange);
    }

    public static /* synthetic */ OpCodesMatcher size$default(OpCodesMatcher opCodesMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return opCodesMatcher.size(i2, i3);
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
    public int innerBuild(C0733b c0733b) {
        int iCreateOpCodesVector;
        AbstractC0307g.m703e(c0733b, "fbb");
        OpCodesMatcher.Companion companion = org.luckypray.dexkit.schema.OpCodesMatcher.Companion;
        Collection<Integer> collection = this.opCodes;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Short.valueOf((short) ((Number) it.next()).intValue()));
            }
            short[] sArr = new short[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                sArr[i2] = ((Number) it2.next()).shortValue();
                i2++;
            }
            iCreateOpCodesVector = org.luckypray.dexkit.schema.OpCodesMatcher.Companion.createOpCodesVector(c0733b, sArr);
        } else {
            iCreateOpCodesVector = 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateOpCodesMatcher = companion.createOpCodesMatcher(c0733b, iCreateOpCodesVector, value, intRange != null ? intRange.innerBuild(c0733b) : 0);
        c0733b.m1931n(iCreateOpCodesMatcher);
        return iCreateOpCodesMatcher;
    }

    public final OpCodesMatcher matchType(OpCodeMatchType opCodeMatchType) {
        AbstractC0307g.m703e(opCodeMatchType, "matchType");
        this.matchType = opCodeMatchType;
        return this;
    }

    public final OpCodesMatcher opCodes(Collection<Integer> collection) {
        AbstractC0307g.m703e(collection, "opCodes");
        this.opCodes = collection;
        return this;
    }

    public final OpCodesMatcher opNames(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "opNames");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode((String) it.next())));
        }
        this.opCodes = arrayList;
        return this;
    }

    public final /* synthetic */ void setMatchType(OpCodeMatchType opCodeMatchType) {
        AbstractC0307g.m703e(opCodeMatchType, "<set-?>");
        this.matchType = opCodeMatchType;
    }

    public final /* synthetic */ void setOpCodes(Collection collection) {
        this.opCodes = collection;
    }

    /* JADX INFO: renamed from: size, reason: merged with bridge method [inline-methods] */
    public final OpCodesMatcher setSize(int i2) {
        this.rangeMatcher = new IntRange(i2);
        return this;
    }

    public final OpCodesMatcher sizeMax(int i2) {
        this.rangeMatcher = new IntRange(0, i2);
        return this;
    }

    public final OpCodesMatcher sizeMin(int i2) {
        this.rangeMatcher = new IntRange(i2, Integer.MAX_VALUE);
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpCodesMatcher(Collection<Integer> collection, OpCodeMatchType opCodeMatchType) {
        this(collection, opCodeMatchType, (IntRange) null, 4, (AbstractC0304d) null);
        AbstractC0307g.m703e(collection, "opCodes");
        AbstractC0307g.m703e(opCodeMatchType, "matchType");
    }

    public static final OpCodesMatcher create(int... iArr) {
        return Companion.create(iArr);
    }

    public static final OpCodesMatcher createForOpNames(String... strArr) {
        return Companion.createForOpNames(strArr);
    }

    public final OpCodesMatcher opCodes(Integer[] numArr) {
        AbstractC0307g.m703e(numArr, "opCodes");
        this.opCodes = AbstractC0179j.m540q0(numArr);
        return this;
    }

    public final OpCodesMatcher size(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        this.rangeMatcher = intRange;
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpCodesMatcher(int[] iArr) {
        this(iArr, (OpCodeMatchType) null, (IntRange) null, 6, (AbstractC0304d) null);
        AbstractC0307g.m703e(iArr, "opCodes");
    }

    public static final OpCodesMatcher create(int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        return Companion.create(iArr, opCodeMatchType, intRange);
    }

    public static final OpCodesMatcher createForOpNames(String[] strArr, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        return Companion.createForOpNames(strArr, opCodeMatchType, intRange);
    }

    public final OpCodesMatcher size(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        this.rangeMatcher = new IntRange(c0340c);
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpCodesMatcher(int[] iArr, OpCodeMatchType opCodeMatchType) {
        this(iArr, opCodeMatchType, (IntRange) null, 4, (AbstractC0304d) null);
        AbstractC0307g.m703e(iArr, "opCodes");
        AbstractC0307g.m703e(opCodeMatchType, "matchType");
    }

    public final OpCodesMatcher size(int i2, int i3) {
        this.rangeMatcher = new IntRange(i2, i3);
        return this;
    }

    public OpCodesMatcher() {
        this.matchType = OpCodeMatchType.Contains;
    }

    public /* synthetic */ OpCodesMatcher(Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i2, AbstractC0304d abstractC0304d) {
        this((Collection<Integer>) collection, (i2 & 2) != 0 ? OpCodeMatchType.Contains : opCodeMatchType, (i2 & 4) != 0 ? null : intRange);
    }

    public final OpCodesMatcher opNames(String[] strArr) {
        AbstractC0307g.m703e(strArr, "opNames");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode(str)));
        }
        this.opCodes = arrayList;
        return this;
    }

    public OpCodesMatcher(Collection<Integer> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        AbstractC0307g.m703e(collection, "opCodes");
        AbstractC0307g.m703e(opCodeMatchType, "matchType");
        OpCodeMatchType opCodeMatchType2 = OpCodeMatchType.Contains;
        this.opCodes = collection;
        this.matchType = opCodeMatchType;
        this.rangeMatcher = intRange;
    }

    public /* synthetic */ OpCodesMatcher(int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange, int i2, AbstractC0304d abstractC0304d) {
        this(iArr, (i2 & 2) != 0 ? OpCodeMatchType.Contains : opCodeMatchType, (i2 & 4) != 0 ? null : intRange);
    }

    public OpCodesMatcher(int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        AbstractC0307g.m703e(iArr, "opCodes");
        AbstractC0307g.m703e(opCodeMatchType, "matchType");
        this.matchType = OpCodeMatchType.Contains;
        this.opCodes = AbstractC0179j.m539p0(iArr);
        this.matchType = opCodeMatchType;
        this.rangeMatcher = intRange;
    }
}
