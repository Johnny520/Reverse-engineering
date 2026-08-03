package org.luckypray.dexkit.query.matchers;

import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5458;
import Yue.C5499;
import Yue.C6398;
import Yue.EnumC0393;
import Yue.InterfaceC4372;
import Yue.InterfaceC5124;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import com.google.flatbuffers.FlatBufferBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.MethodsMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMethodsMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodsMatcher.kt\norg/luckypray/dexkit/query/matchers/MethodsMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1547#2:199\n1618#2,3:200\n1#3:203\n*S KotlinDebug\n*F\n+ 1 MethodsMatcher.kt\norg/luckypray/dexkit/query/matchers/MethodsMatcher\n*L\n190#1:199\n190#1:200,3\n*E\n"})
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0015\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0012J!\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u0019\u001a\u00020\u00002\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#R4\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R*\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010/\u001a\u0004\u0018\u00010\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010\f\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "methods", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "matchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "", "count", "(I)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "countMin", "countMax", "method", "add", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "", "<set-?>", "methodsMatcher", "Ljava/util/List;", "getMethodsMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "rangeMatcher", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "getCount", "()I", "setCount", "(I)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class MethodsMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6399
    private MatchType matchType = MatchType.Contains;

    @InterfaceC6489
    private List<MethodMatcher> methodsMatcher;

    @InterfaceC6489
    private IntRange rangeMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/MethodsMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.MethodsMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final MethodsMatcher create() {
            return new MethodsMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static /* synthetic */ MethodsMatcher count$default(MethodsMatcher methodsMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return methodsMatcher.count(i, i2);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final MethodsMatcher create() {
        return INSTANCE.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodsMatcher add(@InterfaceC6399 MethodMatcher method) {
        C5499.m17103(method, "method");
        List<MethodMatcher> arrayList = this.methodsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.methodsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(method);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: setCount(I)V */
    @InterfaceC6399
    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final MethodsMatcher setCount(int count) {
        this.rangeMatcher = new IntRange(count);
        return this;
    }

    @InterfaceC6399
    public final MethodsMatcher countMax(int max) {
        this.rangeMatcher = new IntRange(0, max);
        return this;
    }

    @InterfaceC6399
    public final MethodsMatcher countMin(int min) {
        this.rangeMatcher = new IntRange(min, Integer.MAX_VALUE);
        return this;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ int getCount() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6399
    public final MatchType getMatchType() {
        return this.matchType;
    }

    @InterfaceC6489
    public final List<MethodMatcher> getMethodsMatcher() {
        return this.methodsMatcher;
    }

    @InterfaceC6489
    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        int iCreateVectorOfTables;
        C5499.m17103(fbb, "fbb");
        MethodsMatcher.Companion companion = org.luckypray.dexkit.schema.MethodsMatcher.INSTANCE;
        List<MethodMatcher> list = this.methodsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((MethodMatcher) it.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM11061 = C3888.m11061(arrayList);
            iCreateVectorOfTables = iArrM11061 != null ? fbb.createVectorOfTables(iArrM11061) : 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateMethodsMatcher = companion.createMethodsMatcher(fbb, iCreateVectorOfTables, value, intRange != null ? intRange.build$dexkit_android_release(fbb) : 0);
        fbb.finish(iCreateMethodsMatcher);
        return iCreateMethodsMatcher;
    }

    @InterfaceC6399
    public final MethodsMatcher matchType(@InterfaceC6399 MatchType matchType) {
        C5499.m17103(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    @InterfaceC6399
    public final MethodsMatcher methods(@InterfaceC6399 Collection<MethodMatcher> methods) {
        C5499.m17103(methods, "methods");
        this.methodsMatcher = C3888.m11065(methods);
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        C5499.m17103(matchType, "<set-?>");
        this.matchType = matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final MethodsMatcher count(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = range;
        return this;
    }

    public final /* synthetic */ MethodsMatcher add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        add(methodMatcher);
        return this;
    }

    @InterfaceC6399
    public final MethodsMatcher count(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = new IntRange(range);
        return this;
    }

    @InterfaceC6399
    public final MethodsMatcher count(int min, int max) {
        this.rangeMatcher = new IntRange(min, max);
        return this;
    }
}
