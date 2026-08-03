package org.luckypray.dexkit.query.matchers;

import Yue.C3411;
import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5458;
import Yue.C5499;
import Yue.C6398;
import Yue.EnumC0393;
import Yue.InterfaceC4372;
import Yue.InterfaceC5124;
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
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.AnnotationElementsMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nAnnotationElementsMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationElementsMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1#2:229\n1547#3:230\n1618#3,3:231\n*S KotlinDebug\n*F\n+ 1 AnnotationElementsMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher\n*L\n220#1:230\n220#1:231,3\n*E\n"})
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0015\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\b\"\u00020\u0005¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0013¢\u0006\u0004\b\u000e\u0010\u0014J!\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u000fJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u000fJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b\u001b\u0010!J&\u0010\u001b\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\b$¢\u0006\u0004\b\u001b\u0010&J\u0017\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*R4\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010+2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R*\u0010\u000b\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u00106\u001a\u0004\u0018\u00010\u00102\b\u0010,\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010\u000e\u001a\u00020\r2\u0006\u0010:\u001a\u00020\r8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "elements", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "", "([Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "matchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "", "count", "(I)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "countMin", "countMax", "element", "add", "(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "", "name", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "matcher", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "", "<set-?>", "elementsMatcher", "Ljava/util/List;", "getElementsMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "rangeMatcher", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "getCount", "()I", "setCount", "(I)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationElementsMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private List<AnnotationElementMatcher> elementsMatcher;

    @InterfaceC6399
    private MatchType matchType = MatchType.Contains;

    @InterfaceC6489
    private IntRange rangeMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final AnnotationElementsMatcher create() {
            return new AnnotationElementsMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static /* synthetic */ AnnotationElementsMatcher add$default(AnnotationElementsMatcher annotationElementsMatcher, String str, AnnotationEncodeValueMatcher annotationEncodeValueMatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            annotationEncodeValueMatcher = null;
        }
        return annotationElementsMatcher.add(str, annotationEncodeValueMatcher);
    }

    public static /* synthetic */ AnnotationElementsMatcher count$default(AnnotationElementsMatcher annotationElementsMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return annotationElementsMatcher.count(i, i2);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final AnnotationElementsMatcher create() {
        return INSTANCE.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementsMatcher add(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return add$default(this, str, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: setCount(I)V */
    @InterfaceC6399
    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final AnnotationElementsMatcher setCount(int count) {
        this.rangeMatcher = new IntRange(count);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementsMatcher countMax(int max) {
        this.rangeMatcher = new IntRange(0, max);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementsMatcher countMin(int min) {
        this.rangeMatcher = new IntRange(min, Integer.MAX_VALUE);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final AnnotationElementsMatcher elements(@InterfaceC6399 Collection<AnnotationElementMatcher> elements) {
        C5499.m17103(elements, "elements");
        this.elementsMatcher = C3888.m11065(elements);
        return this;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ int getCount() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final List<AnnotationElementMatcher> getElementsMatcher() {
        return this.elementsMatcher;
    }

    @InterfaceC6399
    public final MatchType getMatchType() {
        return this.matchType;
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
        AnnotationElementsMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationElementsMatcher.INSTANCE;
        List<AnnotationElementMatcher> list = this.elementsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AnnotationElementMatcher) it.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM11061 = C3888.m11061(arrayList);
            iCreateVectorOfTables = iArrM11061 != null ? fbb.createVectorOfTables(iArrM11061) : 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateAnnotationElementsMatcher = companion.createAnnotationElementsMatcher(fbb, iCreateVectorOfTables, value, intRange != null ? intRange.build$dexkit_android_release(fbb) : 0);
        fbb.finish(iCreateAnnotationElementsMatcher);
        return iCreateAnnotationElementsMatcher;
    }

    @InterfaceC6399
    public final AnnotationElementsMatcher matchType(@InterfaceC6399 MatchType matchType) {
        C5499.m17103(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        C5499.m17103(matchType, "<set-?>");
        this.matchType = matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final AnnotationElementsMatcher add(@InterfaceC6399 AnnotationElementMatcher element) {
        C5499.m17103(element, "element");
        List<AnnotationElementMatcher> arrayList = this.elementsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.elementsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(element);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final AnnotationElementsMatcher count(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = range;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final AnnotationElementsMatcher elements(@InterfaceC6399 AnnotationElementMatcher... elements) {
        C5499.m17103(elements, "elements");
        this.elementsMatcher = C3411.m8936(elements);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementsMatcher count(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = new IntRange(range);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final AnnotationElementsMatcher add(@InterfaceC6399 String name, @InterfaceC6489 AnnotationEncodeValueMatcher matcher) {
        C5499.m17103(name, "name");
        AnnotationElementMatcher annotationElementMatcher = new AnnotationElementMatcher();
        AnnotationElementMatcher.name$default(annotationElementMatcher, name, null, false, 6, null);
        if (matcher != null) {
            annotationElementMatcher.value(matcher);
        }
        add(annotationElementMatcher);
        return this;
    }

    @InterfaceC6399
    public final AnnotationElementsMatcher count(int min, int max) {
        this.rangeMatcher = new IntRange(min, max);
        return this;
    }

    public final /* synthetic */ AnnotationElementsMatcher add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationElementMatcher annotationElementMatcher = new AnnotationElementMatcher();
        init.invoke(annotationElementMatcher);
        add(annotationElementMatcher);
        return this;
    }
}
