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
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.FieldsMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nFieldsMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldsMatcher.kt\norg/luckypray/dexkit/query/matchers/FieldsMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,242:1\n1#2:243\n1547#3:244\n1618#3,3:245\n*S KotlinDebug\n*F\n+ 1 FieldsMatcher.kt\norg/luckypray/dexkit/query/matchers/FieldsMatcher\n*L\n234#1:244\n234#1:245,3\n*E\n"})
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0015\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0012J!\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010\t\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u0019\u0010#\u001a\u00020\u00002\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%¢\u0006\u0004\b#\u0010'J&\u0010\u0019\u001a\u00020\u00002\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020)0(¢\u0006\u0002\b*¢\u0006\u0004\b\u0019\u0010,J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100R4\u00103\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001012\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R*\u0010\t\u001a\u00020\b2\u0006\u00102\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010<\u001a\u0004\u0018\u00010\u000e2\b\u00102\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010\f\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "fields", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "matchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "", "count", "(I)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "countMin", "countMax", "matcher", "add", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "", "name", "addForName", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "typeName", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "", "ignoreCase", "addForType", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "", "<set-?>", "fieldsMatcher", "Ljava/util/List;", "getFieldsMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "rangeMatcher", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "getCount", "()I", "setCount", "(I)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FieldsMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private List<FieldMatcher> fieldsMatcher;

    @InterfaceC6399
    private MatchType matchType = MatchType.Contains;

    @InterfaceC6489
    private IntRange rangeMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/FieldsMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.FieldsMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final FieldsMatcher create() {
            return new FieldsMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static /* synthetic */ FieldsMatcher addForType$default(FieldsMatcher fieldsMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldsMatcher.addForType(str, stringMatchType, z);
    }

    public static /* synthetic */ FieldsMatcher count$default(FieldsMatcher fieldsMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return fieldsMatcher.count(i, i2);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final FieldsMatcher create() {
        return INSTANCE.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldsMatcher add(@InterfaceC6399 FieldMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        List<FieldMatcher> arrayList = this.fieldsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.fieldsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(matcher);
        return this;
    }

    @InterfaceC6399
    public final FieldsMatcher addForName(@InterfaceC6399 String name) {
        C5499.m17103(name, "name");
        FieldMatcher fieldMatcher = new FieldMatcher();
        FieldMatcher.name$default(fieldMatcher, name, null, false, 6, null);
        add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldsMatcher addForType(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeName");
        return addForType$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: setCount(I)V */
    @InterfaceC6399
    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final FieldsMatcher setCount(int count) {
        this.rangeMatcher = new IntRange(count);
        return this;
    }

    @InterfaceC6399
    public final FieldsMatcher countMax(int max) {
        this.rangeMatcher = new IntRange(0, max);
        return this;
    }

    @InterfaceC6399
    public final FieldsMatcher countMin(int min) {
        this.rangeMatcher = new IntRange(min, Integer.MAX_VALUE);
        return this;
    }

    @InterfaceC6399
    public final FieldsMatcher fields(@InterfaceC6399 Collection<FieldMatcher> fields) {
        C5499.m17103(fields, "fields");
        this.fieldsMatcher = C3888.m11065(fields);
        return this;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ int getCount() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final List<FieldMatcher> getFieldsMatcher() {
        return this.fieldsMatcher;
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
        FieldsMatcher.Companion companion = org.luckypray.dexkit.schema.FieldsMatcher.INSTANCE;
        List<FieldMatcher> list = this.fieldsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((FieldMatcher) it.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM11061 = C3888.m11061(arrayList);
            iCreateVectorOfTables = iArrM11061 != null ? fbb.createVectorOfTables(iArrM11061) : 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateFieldsMatcher = companion.createFieldsMatcher(fbb, iCreateVectorOfTables, value, intRange != null ? intRange.build$dexkit_android_release(fbb) : 0);
        fbb.finish(iCreateFieldsMatcher);
        return iCreateFieldsMatcher;
    }

    @InterfaceC6399
    public final FieldsMatcher matchType(@InterfaceC6399 MatchType matchType) {
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
    @InterfaceC5573
    public final FieldsMatcher addForType(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "typeName");
        C5499.m17103(stringMatchType, "matchType");
        return addForType$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final FieldsMatcher count(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = range;
        return this;
    }

    public final /* synthetic */ FieldsMatcher add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        add(fieldMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final FieldsMatcher addForType(@InterfaceC6399 String typeName, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(typeName, "typeName");
        C5499.m17103(matchType, "matchType");
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.type(typeName, matchType, ignoreCase);
        add(fieldMatcher);
        return this;
    }

    @InterfaceC6399
    public final FieldsMatcher count(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = new IntRange(range);
        return this;
    }

    @InterfaceC6399
    public final FieldsMatcher addForType(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.type(clazz);
        add(fieldMatcher);
        return this;
    }

    @InterfaceC6399
    public final FieldsMatcher count(int min, int max) {
        this.rangeMatcher = new IntRange(min, max);
        return this;
    }
}
