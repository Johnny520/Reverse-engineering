package org.luckypray.dexkit.query.matchers.base;

import Yue.C3411;
import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5458;
import Yue.C5499;
import Yue.C6398;
import Yue.EnumC0393;
import Yue.InterfaceC4372;
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
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.OpCodeMatchType;
import org.luckypray.dexkit.schema.OpCodesMatcher;
import org.luckypray.dexkit.util.OpCodeUtil;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nOpCodesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1547#2:350\n1618#2,3:351\n1547#2:358\n1618#2,3:359\n11328#3:354\n11663#3,3:355\n1#4:362\n*S KotlinDebug\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher\n*L\n137#1:350\n137#1:351,3\n341#1:358\n341#1:359,3\n149#1:354\n149#1:355,3\n*E\n"})
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 82\u00020\u0001:\u00018B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B-\b\u0017\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0002\u0010\u000bB'\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\f\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0002\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u000eJ\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0004\b\u0006\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0018J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0019¢\u0006\u0004\b\u0015\u0010\u001aJ!\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u0016J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#R:\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010/\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010\u0015\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00058G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "", "opCodes", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "matchType", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "opCodeSize", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V", "", "([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "", "([Ljava/lang/Integer;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "", "opNames", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "(Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "size", "(I)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "sizeMin", "sizeMax", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Ljava/util/Collection;", "getOpCodes", "()Ljava/util/Collection;", "setOpCodes", "(Ljava/util/Collection;)V", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)V", "rangeMatcher", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "getSize", "()I", "setSize", "(I)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class OpCodesMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6399
    private OpCodeMatchType matchType;

    @InterfaceC6489
    private Collection<Integer> opCodes;

    @InterfaceC6489
    private IntRange rangeMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00020\u0006\"\u00020\u0007H\u0007J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J,\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J1\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0011J!\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0012J,\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\u0013"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "opCodes", "", "", "matchType", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "opCodeSize", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "", "createForOpNames", "opNames", "", "", "([Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    @InterfaceC7507({"SMAP\nOpCodesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,349:1\n1547#2:350\n1618#2,3:351\n11328#3:354\n11663#3,3:355\n11328#3:358\n11663#3,3:359\n*S KotlinDebug\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion\n*L\n302#1:350\n302#1:351,3\n321#1:354\n321#1:355,3\n334#1:358\n334#1:359,3\n*E\n"})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
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
        @InterfaceC6399
        @InterfaceC5578
        public final OpCodesMatcher create(@InterfaceC6399 Collection<Integer> collection, @InterfaceC6399 OpCodeMatchType opCodeMatchType, @InterfaceC6489 IntRange intRange) {
            C5499.m17103(collection, "opCodes");
            C5499.m17103(opCodeMatchType, "matchType");
            return new OpCodesMatcher(collection, opCodeMatchType, intRange);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5578
        public final OpCodesMatcher createForOpNames(@InterfaceC6399 Collection<String> collection, @InterfaceC6399 OpCodeMatchType opCodeMatchType, @InterfaceC6489 IntRange intRange) {
            C5499.m17103(collection, "opNames");
            C5499.m17103(opCodeMatchType, "matchType");
            ArrayList arrayList = new ArrayList(C3881.m10756(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode((String) it.next())));
            }
            return new OpCodesMatcher(arrayList, opCodeMatchType, intRange);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5578
        public final OpCodesMatcher create(@InterfaceC6399 int[] iArr, @InterfaceC6399 OpCodeMatchType opCodeMatchType, @InterfaceC6489 IntRange intRange) {
            C5499.m17103(iArr, "opCodes");
            C5499.m17103(opCodeMatchType, "matchType");
            return new OpCodesMatcher(iArr, opCodeMatchType, intRange);
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

        @InterfaceC6399
        @InterfaceC5578
        public final OpCodesMatcher create(@InterfaceC6399 int... iArr) {
            C5499.m17103(iArr, "opCodes");
            return new OpCodesMatcher(C3411.m8924(iArr), (OpCodeMatchType) null, (IntRange) null, 6, (C4335) null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final OpCodesMatcher createForOpNames(@InterfaceC6399 String[] strArr, @InterfaceC6399 OpCodeMatchType opCodeMatchType, @InterfaceC6489 IntRange intRange) {
            C5499.m17103(strArr, "opNames");
            C5499.m17103(opCodeMatchType, "matchType");
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode(str)));
            }
            return new OpCodesMatcher(arrayList, opCodeMatchType, intRange);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final OpCodesMatcher createForOpNames(@InterfaceC6399 String... strArr) {
            C5499.m17103(strArr, "opNames");
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode(str)));
            }
            return new OpCodesMatcher(arrayList, (OpCodeMatchType) null, (IntRange) null, 6, (C4335) null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public OpCodesMatcher(@InterfaceC6399 Collection<Integer> collection) {
        this(collection, (OpCodeMatchType) null, (IntRange) null, 6, (C4335) null);
        C5499.m17103(collection, "opCodes");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final OpCodesMatcher create(@InterfaceC6399 Collection<Integer> collection, @InterfaceC6399 OpCodeMatchType opCodeMatchType, @InterfaceC6489 IntRange intRange) {
        return INSTANCE.create(collection, opCodeMatchType, intRange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final OpCodesMatcher createForOpNames(@InterfaceC6399 Collection<String> collection, @InterfaceC6399 OpCodeMatchType opCodeMatchType, @InterfaceC6489 IntRange intRange) {
        return INSTANCE.createForOpNames(collection, opCodeMatchType, intRange);
    }

    public static /* synthetic */ OpCodesMatcher size$default(OpCodesMatcher opCodesMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return opCodesMatcher.size(i, i2);
    }

    @InterfaceC6399
    public final OpCodeMatchType getMatchType() {
        return this.matchType;
    }

    @InterfaceC6489
    public final Collection<Integer> getOpCodes() {
        return this.opCodes;
    }

    @InterfaceC6489
    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ int getSize() {
        throw new C6398(null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        int iCreateOpCodesVector;
        C5499.m17103(fbb, "fbb");
        OpCodesMatcher.Companion companion = org.luckypray.dexkit.schema.OpCodesMatcher.INSTANCE;
        Collection<Integer> collection = this.opCodes;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Short.valueOf((short) ((Number) it.next()).intValue()));
            }
            short[] sArrM11068 = C3888.m11068(arrayList);
            iCreateOpCodesVector = sArrM11068 != null ? org.luckypray.dexkit.schema.OpCodesMatcher.INSTANCE.createOpCodesVector(fbb, sArrM11068) : 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateOpCodesMatcher = companion.createOpCodesMatcher(fbb, iCreateOpCodesVector, value, intRange != null ? intRange.build$dexkit_android_release(fbb) : 0);
        fbb.finish(iCreateOpCodesMatcher);
        return iCreateOpCodesMatcher;
    }

    @InterfaceC6399
    public final OpCodesMatcher matchType(@InterfaceC6399 OpCodeMatchType matchType) {
        C5499.m17103(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final OpCodesMatcher opCodes(@InterfaceC6399 Collection<Integer> opCodes) {
        C5499.m17103(opCodes, "opCodes");
        this.opCodes = opCodes;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final OpCodesMatcher opNames(@InterfaceC6399 Collection<String> opNames) {
        C5499.m17103(opNames, "opNames");
        ArrayList arrayList = new ArrayList(C3881.m10756(opNames, 10));
        Iterator<T> it = opNames.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode((String) it.next())));
        }
        this.opCodes = arrayList;
        return this;
    }

    public final /* synthetic */ void setMatchType(OpCodeMatchType opCodeMatchType) {
        C5499.m17103(opCodeMatchType, "<set-?>");
        this.matchType = opCodeMatchType;
    }

    public final /* synthetic */ void setOpCodes(Collection collection) {
        this.opCodes = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: setSize(I)V */
    @InterfaceC6399
    /* JADX INFO: renamed from: size, reason: merged with bridge method [inline-methods] */
    public final OpCodesMatcher setSize(int size) {
        this.rangeMatcher = new IntRange(size);
        return this;
    }

    @InterfaceC6399
    public final OpCodesMatcher sizeMax(int max) {
        this.rangeMatcher = new IntRange(0, max);
        return this;
    }

    @InterfaceC6399
    public final OpCodesMatcher sizeMin(int min) {
        this.rangeMatcher = new IntRange(min, Integer.MAX_VALUE);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public OpCodesMatcher(@InterfaceC6399 Collection<Integer> collection, @InterfaceC6399 OpCodeMatchType opCodeMatchType) {
        this(collection, opCodeMatchType, (IntRange) null, 4, (C4335) null);
        C5499.m17103(collection, "opCodes");
        C5499.m17103(opCodeMatchType, "matchType");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    public static final OpCodesMatcher create(@InterfaceC6399 int... iArr) {
        return INSTANCE.create(iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    public static final OpCodesMatcher createForOpNames(@InterfaceC6399 String... strArr) {
        return INSTANCE.createForOpNames(strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final OpCodesMatcher opCodes(@InterfaceC6399 Integer[] opCodes) {
        C5499.m17103(opCodes, "opCodes");
        this.opCodes = C3411.m8926(opCodes);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final OpCodesMatcher size(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = range;
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public OpCodesMatcher(@InterfaceC6399 int[] iArr) {
        this(iArr, (OpCodeMatchType) null, (IntRange) null, 6, (C4335) null);
        C5499.m17103(iArr, "opCodes");
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final OpCodesMatcher create(@InterfaceC6399 int[] iArr, @InterfaceC6399 OpCodeMatchType opCodeMatchType, @InterfaceC6489 IntRange intRange) {
        return INSTANCE.create(iArr, opCodeMatchType, intRange);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final OpCodesMatcher createForOpNames(@InterfaceC6399 String[] strArr, @InterfaceC6399 OpCodeMatchType opCodeMatchType, @InterfaceC6489 IntRange intRange) {
        return INSTANCE.createForOpNames(strArr, opCodeMatchType, intRange);
    }

    @InterfaceC6399
    public final OpCodesMatcher size(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = new IntRange(range);
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public OpCodesMatcher(@InterfaceC6399 int[] iArr, @InterfaceC6399 OpCodeMatchType opCodeMatchType) {
        this(iArr, opCodeMatchType, (IntRange) null, 4, (C4335) null);
        C5499.m17103(iArr, "opCodes");
        C5499.m17103(opCodeMatchType, "matchType");
    }

    @InterfaceC6399
    public final OpCodesMatcher size(int min, int max) {
        this.rangeMatcher = new IntRange(min, max);
        return this;
    }

    public OpCodesMatcher() {
        this.matchType = OpCodeMatchType.Contains;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.Collection<java.lang.Integer>:?: CAST (java.util.Collection<java.lang.Integer>) (r1v0 java.util.Collection))
  (wrap:org.luckypray.dexkit.query.enums.OpCodeMatchType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.OpCodeMatchType:0x0004: SGET  A[WRAPPED] (LINE:7) org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains org.luckypray.dexkit.query.enums.OpCodeMatchType) : (r2v0 org.luckypray.dexkit.query.enums.OpCodeMatchType))
  (wrap:org.luckypray.dexkit.query.matchers.base.IntRange:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null org.luckypray.dexkit.query.matchers.base.IntRange) : (r3v0 org.luckypray.dexkit.query.matchers.base.IntRange))
 A[MD:(java.util.Collection<java.lang.Integer>, org.luckypray.dexkit.query.enums.OpCodeMatchType, org.luckypray.dexkit.query.matchers.base.IntRange):void (m)] (LINE:8) call: org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.<init>(java.util.Collection, org.luckypray.dexkit.query.enums.OpCodeMatchType, org.luckypray.dexkit.query.matchers.base.IntRange):void type: THIS */
    public /* synthetic */ OpCodesMatcher(Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, C4335 c4335) {
        this((Collection<Integer>) collection, (i & 2) != 0 ? OpCodeMatchType.Contains : opCodeMatchType, (i & 4) != 0 ? null : intRange);
    }

    @InterfaceC6399
    public final OpCodesMatcher opNames(@InterfaceC6399 String[] opNames) {
        C5499.m17103(opNames, "opNames");
        ArrayList arrayList = new ArrayList(opNames.length);
        for (String str : opNames) {
            arrayList.add(Integer.valueOf(OpCodeUtil.getOpCode(str)));
        }
        this.opCodes = arrayList;
        return this;
    }

    @InterfaceC5573
    public OpCodesMatcher(@InterfaceC6399 Collection<Integer> collection, @InterfaceC6399 OpCodeMatchType opCodeMatchType, @InterfaceC6489 IntRange intRange) {
        C5499.m17103(collection, "opCodes");
        C5499.m17103(opCodeMatchType, "matchType");
        OpCodeMatchType opCodeMatchType2 = OpCodeMatchType.Contains;
        this.opCodes = collection;
        this.matchType = opCodeMatchType;
        this.rangeMatcher = intRange;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 int[])
  (wrap:org.luckypray.dexkit.query.enums.OpCodeMatchType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.OpCodeMatchType:0x0004: SGET  A[WRAPPED] (LINE:14) org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains org.luckypray.dexkit.query.enums.OpCodeMatchType) : (r2v0 org.luckypray.dexkit.query.enums.OpCodeMatchType))
  (wrap:org.luckypray.dexkit.query.matchers.base.IntRange:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null org.luckypray.dexkit.query.matchers.base.IntRange) : (r3v0 org.luckypray.dexkit.query.matchers.base.IntRange))
 A[MD:(int[], org.luckypray.dexkit.query.enums.OpCodeMatchType, org.luckypray.dexkit.query.matchers.base.IntRange):void (m)] (LINE:15) call: org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.<init>(int[], org.luckypray.dexkit.query.enums.OpCodeMatchType, org.luckypray.dexkit.query.matchers.base.IntRange):void type: THIS */
    public /* synthetic */ OpCodesMatcher(int[] iArr, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, C4335 c4335) {
        this(iArr, (i & 2) != 0 ? OpCodeMatchType.Contains : opCodeMatchType, (i & 4) != 0 ? null : intRange);
    }

    @InterfaceC5573
    public OpCodesMatcher(@InterfaceC6399 int[] iArr, @InterfaceC6399 OpCodeMatchType opCodeMatchType, @InterfaceC6489 IntRange intRange) {
        C5499.m17103(iArr, "opCodes");
        C5499.m17103(opCodeMatchType, "matchType");
        this.matchType = OpCodeMatchType.Contains;
        this.opCodes = C3411.m8924(iArr);
        this.matchType = opCodeMatchType;
        this.rangeMatcher = intRange;
    }
}
