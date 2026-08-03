package org.luckypray.dexkit.query.matchers;

import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
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
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.BatchUsingStringsMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nStringMatchersGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringMatchersGroup.kt\norg/luckypray/dexkit/query/matchers/StringMatchersGroup\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1547#2:185\n1618#2,3:186\n1547#2:193\n1618#2,3:194\n11328#3:189\n11663#3,3:190\n1#4:197\n*S KotlinDebug\n*F\n+ 1 StringMatchersGroup.kt\norg/luckypray/dexkit/query/matchers/StringMatchersGroup\n*L\n103#1:185\n103#1:186,3\n178#1:193\n178#1:194,3\n119#1:189\n119#1:190,3\n*E\n"})
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\n\u0018\u0000 32\u00020\u0001:\u00013B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0002\u0010\tJ\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ1\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\f\u0010\u0012J!\u0010\f\u001a\u00020\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0013\"\u00020\u0004¢\u0006\u0004\b\f\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J&\u0010\f\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0004\b\f\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#R.\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070*2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "groupName", "", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "stringMatchers", "(Ljava/lang/String;Ljava/util/Collection;)V", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "usingStrings", "(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "matcher", "add", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "usingString", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Ljava/lang/String;", "getGroupName", "()Ljava/lang/String;", "setGroupName", "(Ljava/lang/String;)V", "", "Ljava/util/List;", "getStringMatchers", "()Ljava/util/List;", "value", "getUsingStrings", "()Ljava/util/Collection;", "setUsingStrings", "(Ljava/util/Collection;)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class StringMatchersGroup extends BaseMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private String groupName;

    @InterfaceC6399
    private List<StringMatcher> stringMatchers;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.StringMatchersGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final StringMatchersGroup create() {
            return new StringMatchersGroup();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StringMatchersGroup() {
        this.stringMatchers = new ArrayList();
    }

    public static /* synthetic */ StringMatchersGroup add$default(StringMatchersGroup stringMatchersGroup, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return stringMatchersGroup.add(str, stringMatchType, z);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final StringMatchersGroup create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ StringMatchersGroup usingStrings$default(StringMatchersGroup stringMatchersGroup, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return stringMatchersGroup.usingStrings(collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final StringMatchersGroup add(@InterfaceC6399 String str) {
        C5499.m17103(str, "usingString");
        return add$default(this, str, null, false, 6, null);
    }

    @InterfaceC6489
    public final String getGroupName() {
        return this.groupName;
    }

    @InterfaceC6399
    public final List<StringMatcher> getStringMatchers() {
        return this.stringMatchers;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ Collection getUsingStrings() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6399
    public final StringMatchersGroup groupName(@InterfaceC6399 String groupName) {
        C5499.m17103(groupName, "groupName");
        this.groupName = groupName;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) throws IllegalAccessException {
        C5499.m17103(fbb, "fbb");
        if (this.groupName == null) {
            throw new IllegalAccessException("groupName not be null");
        }
        if (this.stringMatchers.isEmpty()) {
            throw new IllegalAccessException("matchers not be empty");
        }
        BatchUsingStringsMatcher.Companion companion = BatchUsingStringsMatcher.INSTANCE;
        int iCreateString = fbb.createString(this.groupName);
        List<StringMatcher> list = this.stringMatchers;
        ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((StringMatcher) it.next()).build$dexkit_android_release(fbb)));
        }
        int iCreateBatchUsingStringsMatcher = companion.createBatchUsingStringsMatcher(fbb, iCreateString, fbb.createVectorOfTables(C3888.m11061(arrayList)));
        fbb.finish(iCreateBatchUsingStringsMatcher);
        return iCreateBatchUsingStringsMatcher;
    }

    public final /* synthetic */ void setGroupName(String str) {
        this.groupName = str;
    }

    public final /* synthetic */ void setUsingStrings(Collection collection) {
        C5499.m17103(collection, "value");
        usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final StringMatchersGroup usingStrings(@InterfaceC6399 Collection<String> collection) {
        C5499.m17103(collection, "usingStrings");
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final StringMatchersGroup add(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "usingString");
        C5499.m17103(stringMatchType, "matchType");
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final StringMatchersGroup usingStrings(@InterfaceC6399 Collection<String> collection, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(collection, "usingStrings");
        C5499.m17103(stringMatchType, "matchType");
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    public StringMatchersGroup(@InterfaceC6399 String str, @InterfaceC6399 Collection<StringMatcher> collection) {
        C5499.m17103(str, "groupName");
        C5499.m17103(collection, "stringMatchers");
        this.stringMatchers = new ArrayList();
        this.groupName = str;
        this.stringMatchers = C3888.m11065(collection);
    }

    @InterfaceC6399
    public final StringMatchersGroup add(@InterfaceC6399 StringMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        this.stringMatchers.add(matcher);
        return this;
    }

    @InterfaceC6399
    public final StringMatchersGroup usingStrings(@InterfaceC6399 StringMatcherList usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        this.stringMatchers = usingStrings;
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final StringMatchersGroup add(@InterfaceC6399 String usingString, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(usingString, "usingString");
        C5499.m17103(matchType, "matchType");
        add(new StringMatcher(usingString, matchType, ignoreCase));
        return this;
    }

    public final /* synthetic */ StringMatchersGroup usingStrings(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        StringMatcherList stringMatcherList = new StringMatcherList();
        init.invoke(stringMatcherList);
        usingStrings(stringMatcherList);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final StringMatchersGroup usingStrings(@InterfaceC6399 Collection<String> usingStrings, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(usingStrings, "usingStrings");
        C5499.m17103(matchType, "matchType");
        ArrayList arrayList = new ArrayList(C3881.m10756(usingStrings, 10));
        Iterator<T> it = usingStrings.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), matchType, ignoreCase));
        }
        this.stringMatchers = C3888.m11065(arrayList);
        return this;
    }

    @InterfaceC6399
    public final StringMatchersGroup usingStrings(@InterfaceC6399 String... usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        ArrayList arrayList = new ArrayList(usingStrings.length);
        for (String str : usingStrings) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.stringMatchers = C3888.m11065(arrayList);
        return this;
    }
}
