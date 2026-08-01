package org.luckypray.dexkit.query.matchers.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.TargetElementType;
import org.luckypray.dexkit.schema.TargetElementTypesMatcher;
import p000.AbstractC0201f9;
import p000.AbstractC0619pl;
import p000.AbstractC1001ze;
import p000.C0938xt;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class TargetElementTypesMatcher extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private MatchType matchType;
    private Collection<? extends TargetElementType> types;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TargetElementTypesMatcher(Collection<? extends TargetElementType> collection, MatchType matchType) {
        collection.getClass();
        matchType.getClass();
        MatchType matchType2 = MatchType.Contains;
        this.types = collection;
        this.matchType = matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final TargetElementTypesMatcher create(Collection<? extends TargetElementType> collection, MatchType matchType) {
        return Companion.create(collection, matchType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MatchType getMatchType() {
        return this.matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType>, java.util.Collection<org.luckypray.dexkit.query.enums.TargetElementType> */
    public final Collection<TargetElementType> getTypes() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) {
        c0938xt.getClass();
        TargetElementTypesMatcher.Companion companion = org.luckypray.dexkit.schema.TargetElementTypesMatcher.Companion;
        Collection<? extends TargetElementType> collection = this.types;
        int iCreateTypesVector = 0;
        if (collection != null) {
            Collection<? extends TargetElementType> collection2 = collection;
            ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(collection2));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf(((TargetElementType) it.next()).getValue()));
            }
            byte[] bArr = new byte[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                bArr[iCreateTypesVector] = ((Number) it2.next()).byteValue();
                iCreateTypesVector++;
            }
            iCreateTypesVector = org.luckypray.dexkit.schema.TargetElementTypesMatcher.Companion.createTypesVector(c0938xt, bArr);
        }
        int iCreateTargetElementTypesMatcher = companion.createTargetElementTypesMatcher(c0938xt, iCreateTypesVector, this.matchType.getValue());
        c0938xt.m5165n(iCreateTargetElementTypesMatcher);
        return iCreateTargetElementTypesMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TargetElementTypesMatcher matchType(MatchType matchType) {
        matchType.getClass();
        this.matchType = matchType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setMatchType(MatchType matchType) {
        matchType.getClass();
        this.matchType = matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setTypes(Collection collection) {
        this.types = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TargetElementTypesMatcher types(TargetElementType... targetElementTypeArr) {
        targetElementTypeArr.getClass();
        this.types = AbstractC0201f9.m1069o0(targetElementTypeArr);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ TargetElementTypesMatcher create$default(Companion companion, Collection collection, MatchType matchType, int i, Object obj) {
            if ((i & 2) != 0) {
                matchType = MatchType.Contains;
            }
            return companion.create(collection, matchType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final TargetElementTypesMatcher create(Collection<? extends TargetElementType> collection, MatchType matchType) {
            collection.getClass();
            matchType.getClass();
            return new TargetElementTypesMatcher(collection, matchType);
        }

        private Companion() {
        }
    }

    public final TargetElementTypesMatcher types(Collection<? extends TargetElementType> collection) {
        collection.getClass();
        this.types = collection;
        return this;
    }

    public TargetElementTypesMatcher() {
        this.matchType = MatchType.Contains;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.util.Collection)
  (wrap:org.luckypray.dexkit.query.enums.MatchType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.MatchType:0x0004: SGET  A[WRAPPED] (LINE:19) org.luckypray.dexkit.query.enums.MatchType.Contains org.luckypray.dexkit.query.enums.MatchType) : (r2v0 org.luckypray.dexkit.query.enums.MatchType))
 A[MD:(java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType>, org.luckypray.dexkit.query.enums.MatchType):void (m)] (LINE:20) call: org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.<init>(java.util.Collection, org.luckypray.dexkit.query.enums.MatchType):void type: THIS */
    public /* synthetic */ TargetElementTypesMatcher(Collection collection, MatchType matchType, int i, AbstractC0619pl abstractC0619pl) {
        this(collection, (i & 2) != 0 ? MatchType.Contains : matchType);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TargetElementTypesMatcher(Collection<? extends TargetElementType> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
        collection.getClass();
    }
}
