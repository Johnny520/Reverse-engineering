package org.luckypray.dexkit.query;

import Yue.C3411;
import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5499;
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
import java.util.Map;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.BaseFinder;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.StringMatchersGroup;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.schema.BatchFindMethodUsingStrings;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nBatchFindMethodUsingStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchFindMethodUsingStrings.kt\norg/luckypray/dexkit/query/BatchFindMethodUsingStrings\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n125#2:292\n152#2,2:293\n154#2:299\n1547#3:295\n1618#3,3:296\n1547#3:300\n1618#3,3:301\n1547#3:304\n1618#3,3:305\n1547#3:308\n1618#3,3:309\n1547#3:313\n1618#3,3:314\n1547#3:317\n1618#3,3:318\n1547#3:321\n1618#3,3:322\n1547#3:325\n1618#3,3:326\n1#4:312\n*S KotlinDebug\n*F\n+ 1 BatchFindMethodUsingStrings.kt\norg/luckypray/dexkit/query/BatchFindMethodUsingStrings\n*L\n204#1:292\n204#1:293,2\n204#1:299\n205#1:295\n205#1:296,3\n240#1:300\n240#1:301,3\n272#1:304\n272#1:305,3\n277#1:308\n277#1:309,3\n279#1:313\n279#1:314,3\n282#1:317\n282#1:318,3\n284#1:321\n284#1:322,3\n286#1:325\n286#1:326,3\n*E\n"})
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 G2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0006\u0010\tJ!\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\tJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0013\u0010\tJ\u001b\u0010\u0015\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b¢\u0006\u0004\b\u0015\u0010\tJ=\u0010\u0015\u001a\u00020\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001d\u0010!J&\u0010\u0015\u001a\u00020\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%¢\u0006\u0004\b\u0015\u0010'J&\u0010\u001d\u001a\u00020\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%¢\u0006\u0004\b\u001d\u0010'J.\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%¢\u0006\u0004\b\u001d\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b-\u0010.R:\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R:\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u00104R*\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R:\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00100\u001a\u0004\b=\u00102\"\u0004\b>\u00104R:\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00100\u001a\u0004\b@\u00102\"\u0004\bA\u00104R4\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010B2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010B8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lorg/luckypray/dexkit/query/base/BaseFinder;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "", "searchPackages", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "excludePackages", "", "ignorePackagesCase", "(Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lorg/luckypray/dexkit/result/ClassData;", "classes", "searchInClasses", "Lorg/luckypray/dexkit/result/MethodData;", "methods", "searchInMethods", "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "groups", "", "keywordsMap", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "ignoreCase", "(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "matcher", "addSearchGroup", "(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "groupName", "usingStrings", "(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lkotlin/Function1;", "Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "(Ljava/lang/String;LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Ljava/util/Collection;", "getSearchPackages", "()Ljava/util/Collection;", "setSearchPackages", "(Ljava/util/Collection;)V", "getExcludePackages", "setExcludePackages", "Z", "getIgnorePackagesCase", "()Z", "setIgnorePackagesCase", "(Z)V", "searchClasses", "getSearchClasses", "setSearchClasses", "searchMethods", "getSearchMethods", "setSearchMethods", "", "searchGroups", "Ljava/util/List;", "getSearchGroups", "()Ljava/util/List;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class BatchFindMethodUsingStrings extends BaseFinder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private Collection<String> excludePackages;
    private boolean ignorePackagesCase;

    @InterfaceC6489
    private Collection<ClassData> searchClasses;

    @InterfaceC6489
    private List<StringMatchersGroup> searchGroups;

    @InterfaceC6489
    private Collection<MethodData> searchMethods;

    @InterfaceC6489
    private Collection<String> searchPackages;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.BatchFindMethodUsingStrings.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final BatchFindMethodUsingStrings create() {
            return new BatchFindMethodUsingStrings();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static /* synthetic */ BatchFindMethodUsingStrings addSearchGroup$default(BatchFindMethodUsingStrings batchFindMethodUsingStrings, String str, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return batchFindMethodUsingStrings.addSearchGroup(str, collection, stringMatchType, z);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final BatchFindMethodUsingStrings create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ BatchFindMethodUsingStrings groups$default(BatchFindMethodUsingStrings batchFindMethodUsingStrings, Map map, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return batchFindMethodUsingStrings.groups(map, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final BatchFindMethodUsingStrings addSearchGroup(@InterfaceC6399 String str, @InterfaceC6399 Collection<String> collection) {
        C5499.m17103(str, "groupName");
        C5499.m17103(collection, "usingStrings");
        return addSearchGroup$default(this, str, collection, null, false, 12, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final BatchFindMethodUsingStrings excludePackages(@InterfaceC6399 String... excludePackages) {
        C5499.m17103(excludePackages, "excludePackages");
        this.excludePackages = C3411.m8926(excludePackages);
        return this;
    }

    @InterfaceC6489
    public final Collection<String> getExcludePackages() {
        return this.excludePackages;
    }

    public final boolean getIgnorePackagesCase() {
        return this.ignorePackagesCase;
    }

    @InterfaceC6489
    public final Collection<ClassData> getSearchClasses() {
        return this.searchClasses;
    }

    @InterfaceC6489
    public final List<StringMatchersGroup> getSearchGroups() {
        return this.searchGroups;
    }

    @InterfaceC6489
    public final Collection<MethodData> getSearchMethods() {
        return this.searchMethods;
    }

    @InterfaceC6489
    public final Collection<String> getSearchPackages() {
        return this.searchPackages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final BatchFindMethodUsingStrings groups(@InterfaceC6399 Map<String, ? extends Collection<String>> map) {
        C5499.m17103(map, "keywordsMap");
        return groups$default(this, map, null, false, 6, null);
    }

    @InterfaceC6399
    public final BatchFindMethodUsingStrings ignorePackagesCase(boolean ignorePackagesCase) {
        this.ignorePackagesCase = ignorePackagesCase;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) throws IllegalAccessException {
        int iCreateVectorOfTables;
        int iCreateVectorOfTables2;
        int iCreateInClassesVector;
        int iCreateInMethodsVector;
        C5499.m17103(fbb, "fbb");
        List<StringMatchersGroup> list = this.searchGroups;
        if (list == null) {
            throw new IllegalAccessException("searchGroups not be empty");
        }
        C5499.m17100(list);
        ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StringMatchersGroup) it.next()).getGroupName());
        }
        int size = C3888.m11067(arrayList).size();
        List<StringMatchersGroup> list2 = this.searchGroups;
        C5499.m17100(list2);
        if (size < list2.size()) {
            throw new IllegalAccessException("groupName must be unique");
        }
        BatchFindMethodUsingStrings.Companion companion = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.INSTANCE;
        Collection<String> collection = this.searchPackages;
        if (collection != null) {
            ArrayList arrayList2 = new ArrayList(C3881.m10756(collection, 10));
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(fbb.createString((String) it2.next())));
            }
            int[] iArrM11061 = C3888.m11061(arrayList2);
            iCreateVectorOfTables = iArrM11061 != null ? fbb.createVectorOfTables(iArrM11061) : 0;
        }
        Collection<String> collection2 = this.excludePackages;
        if (collection2 != null) {
            ArrayList arrayList3 = new ArrayList(C3881.m10756(collection2, 10));
            Iterator<T> it3 = collection2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(fbb.createString((String) it3.next())));
            }
            int[] iArrM110612 = C3888.m11061(arrayList3);
            iCreateVectorOfTables2 = iArrM110612 != null ? fbb.createVectorOfTables(iArrM110612) : 0;
        }
        boolean z = this.ignorePackagesCase;
        Collection<ClassData> collection3 = this.searchClasses;
        if (collection3 != null) {
            ArrayList arrayList4 = new ArrayList(C3881.m10756(collection3, 10));
            Iterator<T> it4 = collection3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Long.valueOf(((ClassData) it4.next()).getEncodeId()));
            }
            long[] jArrM11063 = C3888.m11063(arrayList4);
            iCreateInClassesVector = jArrM11063 != null ? org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.INSTANCE.createInClassesVector(fbb, jArrM11063) : 0;
        }
        Collection<MethodData> collection4 = this.searchMethods;
        if (collection4 != null) {
            ArrayList arrayList5 = new ArrayList(C3881.m10756(collection4, 10));
            Iterator<T> it5 = collection4.iterator();
            while (it5.hasNext()) {
                arrayList5.add(Long.valueOf(((MethodData) it5.next()).getEncodeId()));
            }
            long[] jArrM110632 = C3888.m11063(arrayList5);
            iCreateInMethodsVector = jArrM110632 != null ? org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.INSTANCE.createInMethodsVector(fbb, jArrM110632) : 0;
        }
        List<StringMatchersGroup> list3 = this.searchGroups;
        C5499.m17100(list3);
        ArrayList arrayList6 = new ArrayList(C3881.m10756(list3, 10));
        Iterator<T> it6 = list3.iterator();
        while (it6.hasNext()) {
            arrayList6.add(Integer.valueOf(((StringMatchersGroup) it6.next()).build$dexkit_android_release(fbb)));
        }
        int iCreateBatchFindMethodUsingStrings = companion.createBatchFindMethodUsingStrings(fbb, iCreateVectorOfTables, iCreateVectorOfTables2, z, iCreateInClassesVector, iCreateInMethodsVector, fbb.createVectorOfTables(C3888.m11061(arrayList6)));
        fbb.finish(iCreateBatchFindMethodUsingStrings);
        return iCreateBatchFindMethodUsingStrings;
    }

    @InterfaceC6399
    public final BatchFindMethodUsingStrings searchInClasses(@InterfaceC6399 Collection<ClassData> classes) {
        C5499.m17103(classes, "classes");
        this.searchClasses = classes;
        return this;
    }

    @InterfaceC6399
    public final BatchFindMethodUsingStrings searchInMethods(@InterfaceC6399 Collection<MethodData> methods) {
        C5499.m17103(methods, "methods");
        this.searchMethods = methods;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final BatchFindMethodUsingStrings searchPackages(@InterfaceC6399 String... searchPackages) {
        C5499.m17103(searchPackages, "searchPackages");
        this.searchPackages = C3411.m8926(searchPackages);
        return this;
    }

    public final /* synthetic */ void setExcludePackages(Collection collection) {
        this.excludePackages = collection;
    }

    public final /* synthetic */ void setIgnorePackagesCase(boolean z) {
        this.ignorePackagesCase = z;
    }

    public final /* synthetic */ void setSearchClasses(Collection collection) {
        this.searchClasses = collection;
    }

    public final /* synthetic */ void setSearchMethods(Collection collection) {
        this.searchMethods = collection;
    }

    public final /* synthetic */ void setSearchPackages(Collection collection) {
        this.searchPackages = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final BatchFindMethodUsingStrings addSearchGroup(@InterfaceC6399 String str, @InterfaceC6399 Collection<String> collection, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "groupName");
        C5499.m17103(collection, "usingStrings");
        C5499.m17103(stringMatchType, "matchType");
        return addSearchGroup$default(this, str, collection, stringMatchType, false, 8, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final BatchFindMethodUsingStrings excludePackages(@InterfaceC6399 Collection<String> excludePackages) {
        C5499.m17103(excludePackages, "excludePackages");
        this.excludePackages = excludePackages;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final BatchFindMethodUsingStrings groups(@InterfaceC6399 Map<String, ? extends Collection<String>> map, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(map, "keywordsMap");
        C5499.m17103(stringMatchType, "matchType");
        return groups$default(this, map, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final BatchFindMethodUsingStrings searchPackages(@InterfaceC6399 Collection<String> searchPackages) {
        C5499.m17103(searchPackages, "searchPackages");
        this.searchPackages = searchPackages;
        return this;
    }

    @InterfaceC6399
    public final BatchFindMethodUsingStrings addSearchGroup(@InterfaceC6399 StringMatchersGroup matcher) {
        C5499.m17103(matcher, "matcher");
        List<StringMatchersGroup> arrayList = this.searchGroups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.searchGroups = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(matcher);
        return this;
    }

    @InterfaceC6399
    public final BatchFindMethodUsingStrings groups(@InterfaceC6399 Collection<StringMatchersGroup> groups) {
        C5499.m17103(groups, "groups");
        this.searchGroups = C3888.m11065(groups);
        return this;
    }

    public final /* synthetic */ BatchFindMethodUsingStrings groups(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        StringMatchersGroupList stringMatchersGroupList = new StringMatchersGroupList();
        init.invoke(stringMatchersGroupList);
        groups(stringMatchersGroupList);
        return this;
    }

    public final /* synthetic */ BatchFindMethodUsingStrings addSearchGroup(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        StringMatchersGroup stringMatchersGroup = new StringMatchersGroup();
        init.invoke(stringMatchersGroup);
        addSearchGroup(stringMatchersGroup);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final BatchFindMethodUsingStrings groups(@InterfaceC6399 Map<String, ? extends Collection<String>> keywordsMap, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(keywordsMap, "keywordsMap");
        C5499.m17103(matchType, "matchType");
        ArrayList arrayList = new ArrayList(keywordsMap.size());
        for (Map.Entry<String, ? extends Collection<String>> entry : keywordsMap.entrySet()) {
            String key = entry.getKey();
            Collection<String> value = entry.getValue();
            ArrayList arrayList2 = new ArrayList(C3881.m10756(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList2.add(new StringMatcher((String) it.next(), matchType, ignoreCase));
            }
            arrayList.add(new StringMatchersGroup(key, arrayList2));
        }
        this.searchGroups = C3888.m11065(arrayList);
        return this;
    }

    public final /* synthetic */ BatchFindMethodUsingStrings addSearchGroup(String groupName, InterfaceC5124 init) {
        C5499.m17103(groupName, "groupName");
        C5499.m17103(init, "init");
        StringMatcherList stringMatcherList = new StringMatcherList();
        init.invoke(stringMatcherList);
        addSearchGroup(new StringMatchersGroup(groupName, stringMatcherList));
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final BatchFindMethodUsingStrings addSearchGroup(@InterfaceC6399 String groupName, @InterfaceC6399 Collection<String> usingStrings, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(groupName, "groupName");
        C5499.m17103(usingStrings, "usingStrings");
        C5499.m17103(matchType, "matchType");
        ArrayList arrayList = new ArrayList(C3881.m10756(usingStrings, 10));
        Iterator<T> it = usingStrings.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), matchType, ignoreCase));
        }
        addSearchGroup(new StringMatchersGroup(groupName, arrayList));
        return this;
    }
}
