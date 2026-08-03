package org.luckypray.dexkit.query.matchers.base;

import Yue.C3411;
import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5499;
import Yue.InterfaceC5573;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import com.google.flatbuffers.FlatBufferBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.TargetElementType;
import org.luckypray.dexkit.schema.TargetElementTypesMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u001f\u0010\u0003\u001a\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0016\"\u00020\u0005¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0003\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR4\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "()V", "types", "", "Lorg/luckypray/dexkit/query/enums/TargetElementType;", "matchType", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)V", "<set-?>", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "getTypes", "()Ljava/util/Collection;", "setTypes", "(Ljava/util/Collection;)V", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "", "([Lorg/luckypray/dexkit/query/enums/TargetElementType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
@InterfaceC7507({"SMAP\nTargetElementTypesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetElementTypesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1547#2:133\n1618#2,3:134\n1#3:137\n*S KotlinDebug\n*F\n+ 1 TargetElementTypesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher\n*L\n125#1:133\n125#1:134,3\n*E\n"})
public final class TargetElementTypesMatcher extends BaseMatcher {

    @InterfaceC6399
    public static final Companion Companion = new Companion(null);

    @InterfaceC6399
    private MatchType matchType;

    @InterfaceC6489
    private Collection<? extends TargetElementType> types;

    @InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "types", "", "Lorg/luckypray/dexkit/query/enums/TargetElementType;", "matchType", "Lorg/luckypray/dexkit/query/enums/MatchType;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public static /* synthetic */ TargetElementTypesMatcher create$default(Companion companion, Collection collection, MatchType matchType, int i, Object obj) {
            if ((i & 2) != 0) {
                matchType = MatchType.Contains;
            }
            return companion.create(collection, matchType);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final TargetElementTypesMatcher create(@InterfaceC6399 Collection<? extends TargetElementType> collection, @InterfaceC6399 MatchType matchType) {
            C5499.m17103(collection, "types");
            C5499.m17103(matchType, "matchType");
            return new TargetElementTypesMatcher(collection, matchType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5573
    public TargetElementTypesMatcher(@InterfaceC6399 Collection<? extends TargetElementType> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
        C5499.m17103(collection, "types");
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final TargetElementTypesMatcher create(@InterfaceC6399 Collection<? extends TargetElementType> collection, @InterfaceC6399 MatchType matchType) {
        return Companion.create(collection, matchType);
    }

    @InterfaceC6399
    public final MatchType getMatchType() {
        return this.matchType;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType>, java.util.Collection<org.luckypray.dexkit.query.enums.TargetElementType> */
    @InterfaceC6489
    public final Collection<TargetElementType> getTypes() {
        return this.types;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder flatBufferBuilder) {
        int iCreateTypesVector;
        C5499.m17103(flatBufferBuilder, "fbb");
        TargetElementTypesMatcher.Companion companion = org.luckypray.dexkit.schema.TargetElementTypesMatcher.INSTANCE;
        Collection<? extends TargetElementType> collection = this.types;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf(((TargetElementType) it.next()).getValue()));
            }
            byte[] bArrM11055 = C3888.m11055(arrayList);
            iCreateTypesVector = bArrM11055 != null ? org.luckypray.dexkit.schema.TargetElementTypesMatcher.INSTANCE.createTypesVector(flatBufferBuilder, bArrM11055) : 0;
        }
        int iCreateTargetElementTypesMatcher = companion.createTargetElementTypesMatcher(flatBufferBuilder, iCreateTypesVector, this.matchType.getValue());
        flatBufferBuilder.finish(iCreateTargetElementTypesMatcher);
        return iCreateTargetElementTypesMatcher;
    }

    @InterfaceC6399
    public final TargetElementTypesMatcher matchType(@InterfaceC6399 MatchType matchType) {
        C5499.m17103(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        C5499.m17103(matchType, "<set-?>");
        this.matchType = matchType;
    }

    public final /* synthetic */ void setTypes(Collection collection) {
        this.types = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final TargetElementTypesMatcher types(@InterfaceC6399 Collection<? extends TargetElementType> collection) {
        C5499.m17103(collection, "types");
        this.types = collection;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public TargetElementTypesMatcher() {
        this.matchType = MatchType.Contains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final TargetElementTypesMatcher types(@InterfaceC6399 TargetElementType... targetElementTypeArr) {
        C5499.m17103(targetElementTypeArr, "types");
        this.types = C3411.m8926(targetElementTypeArr);
        return this;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.util.Collection)
  (wrap:org.luckypray.dexkit.query.enums.MatchType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.MatchType:0x0004: SGET  A[WRAPPED] (LINE:4) org.luckypray.dexkit.query.enums.MatchType.Contains org.luckypray.dexkit.query.enums.MatchType) : (r2v0 org.luckypray.dexkit.query.enums.MatchType))
 A[MD:(java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType>, org.luckypray.dexkit.query.enums.MatchType):void (m)] (LINE:5) call: org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.<init>(java.util.Collection, org.luckypray.dexkit.query.enums.MatchType):void type: THIS */
    public /* synthetic */ TargetElementTypesMatcher(Collection collection, MatchType matchType, int i, C4335 c4335) {
        this(collection, (i & 2) != 0 ? MatchType.Contains : matchType);
    }

    @InterfaceC5573
    public TargetElementTypesMatcher(@InterfaceC6399 Collection<? extends TargetElementType> collection, @InterfaceC6399 MatchType matchType) {
        C5499.m17103(collection, "types");
        C5499.m17103(matchType, "matchType");
        MatchType matchType2 = MatchType.Contains;
        this.types = collection;
        this.matchType = matchType;
    }
}
