package org.luckypray.dexkit.query.matchers.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.OpCodeMatchType;
import org.luckypray.dexkit.schema.OpCodesMatcher;
import org.luckypray.dexkit.util.OpCodeUtil;
import p000.AbstractC0201f9;
import p000.AbstractC0619pl;
import p000.AbstractC1001ze;
import p000.C0096cl;
import p000.C0938xt;
import p000.InterfaceC0061bn;
import p000.z20;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class OpCodesMatcher extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private OpCodeMatchType matchType;
    private Collection<Integer> opCodes;
    private IntRange rangeMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OpCodesMatcher(int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        iArr.getClass();
        opCodeMatchType.getClass();
        this.matchType = OpCodeMatchType.Contains;
        this.opCodes = AbstractC0201f9.m1068n0(iArr);
        this.matchType = opCodeMatchType;
        this.rangeMatcher = intRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final OpCodesMatcher create(Collection<Integer> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        return Companion.create(collection, opCodeMatchType, intRange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final OpCodesMatcher createForOpNames(Collection<String> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        return Companion.createForOpNames(collection, opCodeMatchType, intRange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ OpCodesMatcher size$default(OpCodesMatcher opCodesMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return opCodesMatcher.size(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodeMatchType getMatchType() {
        return this.matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<Integer> getOpCodes() {
        return this.opCodes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ int getSize() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) {
        int iCreateOpCodesVector;
        c0938xt.getClass();
        OpCodesMatcher.Companion companion = org.luckypray.dexkit.schema.OpCodesMatcher.Companion;
        Collection<Integer> collection = this.opCodes;
        if (collection != null) {
            Collection<Integer> collection2 = collection;
            ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(collection2));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(Short.valueOf((short) ((Number) it.next()).intValue()));
            }
            short[] sArr = new short[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                sArr[i] = ((Number) it2.next()).shortValue();
                i++;
            }
            iCreateOpCodesVector = org.luckypray.dexkit.schema.OpCodesMatcher.Companion.createOpCodesVector(c0938xt, sArr);
        } else {
            iCreateOpCodesVector = 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateOpCodesMatcher = companion.createOpCodesMatcher(c0938xt, iCreateOpCodesVector, value, intRange != null ? intRange.build$dexkit_android_release(c0938xt) : 0);
        c0938xt.m5165n(iCreateOpCodesMatcher);
        return iCreateOpCodesMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodesMatcher matchType(OpCodeMatchType opCodeMatchType) {
        opCodeMatchType.getClass();
        this.matchType = opCodeMatchType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodesMatcher opCodes(Integer[] numArr) {
        numArr.getClass();
        this.opCodes = AbstractC0201f9.m1069o0(numArr);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodesMatcher opNames(Collection<String> collection) {
        collection.getClass();
        Collection<String> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(collection2));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode((String) it.next())));
        }
        this.opCodes = arrayList;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setMatchType(OpCodeMatchType opCodeMatchType) {
        opCodeMatchType.getClass();
        this.matchType = opCodeMatchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setOpCodes(Collection collection) {
        this.opCodes = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodesMatcher size(z20 z20Var) {
        z20Var.getClass();
        this.rangeMatcher = new IntRange(z20Var);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodesMatcher sizeMax(int i) {
        this.rangeMatcher = new IntRange(0, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodesMatcher sizeMin(int i) {
        this.rangeMatcher = new IntRange(i, Integer.MAX_VALUE);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ OpCodesMatcher create$default(Companion companion, Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, Object obj) {
            if ((i & 2) != 0) {
                opCodeMatchType = OpCodeMatchType.Contains;
            }
            if ((i & 4) != 0) {
                intRange = null;
            }
            return companion.create((Collection<Integer>) collection, opCodeMatchType, intRange);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ OpCodesMatcher createForOpNames$default(Companion companion, Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, Object obj) {
            if ((i & 2) != 0) {
                opCodeMatchType = OpCodeMatchType.Contains;
            }
            if ((i & 4) != 0) {
                intRange = null;
            }
            return companion.createForOpNames((Collection<String>) collection, opCodeMatchType, intRange);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final OpCodesMatcher create(int... iArr) {
            iArr.getClass();
            return new OpCodesMatcher(AbstractC0201f9.m1068n0(iArr), (OpCodeMatchType) null, (IntRange) null, 6, (AbstractC0619pl) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final OpCodesMatcher createForOpNames(Collection<String> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
            collection.getClass();
            opCodeMatchType.getClass();
            Collection<String> collection2 = collection;
            ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(collection2));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode((String) it.next())));
            }
            return new OpCodesMatcher(arrayList, opCodeMatchType, intRange);
        }

        private Companion() {
        }

        public static /* synthetic */ OpCodesMatcher create$default(Companion companion, int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, Object obj) {
            if ((i & 2) != 0) {
                opCodeMatchType = OpCodeMatchType.Contains;
            }
            if ((i & 4) != 0) {
                intRange = null;
            }
            return companion.create(iArr, opCodeMatchType, intRange);
        }

        public static /* synthetic */ OpCodesMatcher createForOpNames$default(Companion companion, String[] strArr, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, Object obj) {
            if ((i & 2) != 0) {
                opCodeMatchType = OpCodeMatchType.Contains;
            }
            if ((i & 4) != 0) {
                intRange = null;
            }
            return companion.createForOpNames(strArr, opCodeMatchType, intRange);
        }

        public final OpCodesMatcher create(int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange) {
            iArr.getClass();
            opCodeMatchType.getClass();
            return new OpCodesMatcher(iArr, opCodeMatchType, intRange);
        }

        public final OpCodesMatcher create(Collection<Integer> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
            collection.getClass();
            opCodeMatchType.getClass();
            return new OpCodesMatcher(collection, opCodeMatchType, intRange);
        }

        public final OpCodesMatcher createForOpNames(String[] strArr, OpCodeMatchType opCodeMatchType, IntRange intRange) {
            strArr.getClass();
            opCodeMatchType.getClass();
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode(str)));
            }
            return new OpCodesMatcher(arrayList, opCodeMatchType, intRange);
        }

        public final OpCodesMatcher createForOpNames(String... strArr) {
            strArr.getClass();
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode(str)));
            }
            return new OpCodesMatcher(arrayList, (OpCodeMatchType) null, (IntRange) null, 6, (AbstractC0619pl) null);
        }
    }

    public static final OpCodesMatcher create(int... iArr) {
        return Companion.create(iArr);
    }

    public static final OpCodesMatcher createForOpNames(String... strArr) {
        return Companion.createForOpNames(strArr);
    }

    public static final OpCodesMatcher create(int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        return Companion.create(iArr, opCodeMatchType, intRange);
    }

    public static final OpCodesMatcher createForOpNames(String[] strArr, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        return Companion.createForOpNames(strArr, opCodeMatchType, intRange);
    }

    public final OpCodesMatcher opCodes(Collection<Integer> collection) {
        collection.getClass();
        this.opCodes = collection;
        return this;
    }

    public final OpCodesMatcher size(IntRange intRange) {
        intRange.getClass();
        this.rangeMatcher = intRange;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setSize(I)V */
    /* JADX INFO: renamed from: size, reason: merged with bridge method [inline-methods] */
    public final OpCodesMatcher setSize(int i) {
        this.rangeMatcher = new IntRange(i);
        return this;
    }

    public final OpCodesMatcher size(int i, int i2) {
        this.rangeMatcher = new IntRange(i, i2);
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpCodesMatcher(Collection<Integer> collection, OpCodeMatchType opCodeMatchType) {
        this(collection, opCodeMatchType, (IntRange) null, 4, (AbstractC0619pl) null);
        collection.getClass();
        opCodeMatchType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpCodesMatcher(int[] iArr) {
        this(iArr, (OpCodeMatchType) null, (IntRange) null, 6, (AbstractC0619pl) null);
        iArr.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpCodesMatcher(int[] iArr, OpCodeMatchType opCodeMatchType) {
        this(iArr, opCodeMatchType, (IntRange) null, 4, (AbstractC0619pl) null);
        iArr.getClass();
        opCodeMatchType.getClass();
    }

    public OpCodesMatcher() {
        this.matchType = OpCodeMatchType.Contains;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.Collection<java.lang.Integer>:?: CAST (java.util.Collection<java.lang.Integer>) (r1v0 java.util.Collection))
  (wrap:org.luckypray.dexkit.query.enums.OpCodeMatchType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.OpCodeMatchType:0x0004: SGET  A[WRAPPED] (LINE:30) org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains org.luckypray.dexkit.query.enums.OpCodeMatchType) : (r2v0 org.luckypray.dexkit.query.enums.OpCodeMatchType))
  (wrap:org.luckypray.dexkit.query.matchers.base.IntRange:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null org.luckypray.dexkit.query.matchers.base.IntRange) : (r3v0 org.luckypray.dexkit.query.matchers.base.IntRange))
 A[MD:(java.util.Collection<java.lang.Integer>, org.luckypray.dexkit.query.enums.OpCodeMatchType, org.luckypray.dexkit.query.matchers.base.IntRange):void (m)] (LINE:31) call: org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.<init>(java.util.Collection, org.luckypray.dexkit.query.enums.OpCodeMatchType, org.luckypray.dexkit.query.matchers.base.IntRange):void type: THIS */
    public /* synthetic */ OpCodesMatcher(Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, AbstractC0619pl abstractC0619pl) {
        this((Collection<Integer>) collection, (i & 2) != 0 ? OpCodeMatchType.Contains : opCodeMatchType, (i & 4) != 0 ? null : intRange);
    }

    public OpCodesMatcher(Collection<Integer> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        collection.getClass();
        opCodeMatchType.getClass();
        OpCodeMatchType opCodeMatchType2 = OpCodeMatchType.Contains;
        this.opCodes = collection;
        this.matchType = opCodeMatchType;
        this.rangeMatcher = intRange;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 int[])
  (wrap:org.luckypray.dexkit.query.enums.OpCodeMatchType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.OpCodeMatchType:0x0004: SGET  A[WRAPPED] (LINE:37) org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains org.luckypray.dexkit.query.enums.OpCodeMatchType) : (r2v0 org.luckypray.dexkit.query.enums.OpCodeMatchType))
  (wrap:org.luckypray.dexkit.query.matchers.base.IntRange:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null org.luckypray.dexkit.query.matchers.base.IntRange) : (r3v0 org.luckypray.dexkit.query.matchers.base.IntRange))
 A[MD:(int[], org.luckypray.dexkit.query.enums.OpCodeMatchType, org.luckypray.dexkit.query.matchers.base.IntRange):void (m)] (LINE:38) call: org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.<init>(int[], org.luckypray.dexkit.query.enums.OpCodeMatchType, org.luckypray.dexkit.query.matchers.base.IntRange):void type: THIS */
    public /* synthetic */ OpCodesMatcher(int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, AbstractC0619pl abstractC0619pl) {
        this(iArr, (i & 2) != 0 ? OpCodeMatchType.Contains : opCodeMatchType, (i & 4) != 0 ? null : intRange);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpCodesMatcher(Collection<Integer> collection) {
        this(collection, (OpCodeMatchType) null, (IntRange) null, 6, (AbstractC0619pl) null);
        collection.getClass();
    }

    public final OpCodesMatcher opNames(String[] strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode(str)));
        }
        this.opCodes = arrayList;
        return this;
    }
}
