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
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.ParametersMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nParametersMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParametersMatcher.kt\norg/luckypray/dexkit/query/matchers/ParametersMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1547#2:209\n1618#2,3:210\n1#3:213\n*S KotlinDebug\n*F\n+ 1 ParametersMatcher.kt\norg/luckypray/dexkit/query/matchers/ParametersMatcher\n*L\n201#1:209\n201#1:210,3\n*E\n"})
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0010\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0006\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u000fJ!\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nJ\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u0016\u0010\u001eJ\u0019\u0010\u0016\u001a\u00020\u00002\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001f¢\u0006\u0004\b\u0016\u0010!J&\u0010\u0016\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\b$¢\u0006\u0004\b\u0016\u0010&J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*R8\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010+2\u0010\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R(\u00101\u001a\u0004\u0018\u00010\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R$\u0010\t\u001a\u00020\b2\u0006\u00105\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "params", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "", "count", "(I)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "countMin", "countMax", "matcher", "add", "(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "", "typeName", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "", "<set-?>", "paramsMatcher", "Ljava/util/List;", "getParamsMatcher", "()Ljava/util/List;", "rangeMatcher", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "getCount", "()I", "setCount", "(I)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ParametersMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private List<ParameterMatcher> paramsMatcher;

    @InterfaceC6489
    private IntRange rangeMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.ParametersMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final ParametersMatcher create() {
            return new ParametersMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static /* synthetic */ ParametersMatcher add$default(ParametersMatcher parametersMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return parametersMatcher.add(str, stringMatchType, z);
    }

    public static /* synthetic */ ParametersMatcher count$default(ParametersMatcher parametersMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return parametersMatcher.count(i, i2);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final ParametersMatcher create() {
        return INSTANCE.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final ParametersMatcher add(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeName");
        return add$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: setCount(I)V */
    @InterfaceC6399
    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final ParametersMatcher setCount(int count) {
        this.rangeMatcher = new IntRange(count);
        return this;
    }

    @InterfaceC6399
    public final ParametersMatcher countMax(int max) {
        this.rangeMatcher = new IntRange(0, max);
        return this;
    }

    @InterfaceC6399
    public final ParametersMatcher countMin(int min) {
        this.rangeMatcher = new IntRange(min, Integer.MAX_VALUE);
        return this;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ int getCount() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final List<ParameterMatcher> getParamsMatcher() {
        return this.paramsMatcher;
    }

    @InterfaceC6489
    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        int iCreateVectorOfTables;
        C5499.m17103(fbb, "fbb");
        ParametersMatcher.Companion companion = org.luckypray.dexkit.schema.ParametersMatcher.INSTANCE;
        List<ParameterMatcher> list = this.paramsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
            for (ParameterMatcher parameterMatcher : list) {
                if (parameterMatcher == null) {
                    parameterMatcher = new ParameterMatcher();
                }
                arrayList.add(Integer.valueOf(parameterMatcher.build$dexkit_android_release(fbb)));
            }
            int[] iArrM11061 = C3888.m11061(arrayList);
            iCreateVectorOfTables = iArrM11061 != null ? fbb.createVectorOfTables(iArrM11061) : 0;
        }
        IntRange intRange = this.rangeMatcher;
        int iCreateParametersMatcher = companion.createParametersMatcher(fbb, iCreateVectorOfTables, intRange != null ? intRange.build$dexkit_android_release(fbb) : 0);
        fbb.finish(iCreateParametersMatcher);
        return iCreateParametersMatcher;
    }

    @InterfaceC6399
    public final ParametersMatcher params(@InterfaceC6399 Collection<ParameterMatcher> params) {
        C5499.m17103(params, "params");
        this.paramsMatcher = C3888.m11065(params);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final ParametersMatcher add(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "typeName");
        C5499.m17103(stringMatchType, "matchType");
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final ParametersMatcher count(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = range;
        return this;
    }

    @InterfaceC6399
    public final ParametersMatcher add(@InterfaceC6489 ParameterMatcher matcher) {
        List<ParameterMatcher> arrayList = this.paramsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.paramsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(matcher);
        return this;
    }

    @InterfaceC6399
    public final ParametersMatcher count(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        this.rangeMatcher = new IntRange(range);
        return this;
    }

    @InterfaceC6399
    public final ParametersMatcher count(int min, int max) {
        this.rangeMatcher = new IntRange(min, max);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ParametersMatcher add(@InterfaceC6399 String typeName, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(typeName, "typeName");
        C5499.m17103(matchType, "matchType");
        add(new ParameterMatcher().type(typeName, matchType, ignoreCase));
        return this;
    }

    @InterfaceC6399
    public final ParametersMatcher add(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        add(new ParameterMatcher().type(clazz));
        return this;
    }

    public final /* synthetic */ ParametersMatcher add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ParameterMatcher parameterMatcher = new ParameterMatcher();
        init.invoke(parameterMatcher);
        add(parameterMatcher);
        return this;
    }
}
