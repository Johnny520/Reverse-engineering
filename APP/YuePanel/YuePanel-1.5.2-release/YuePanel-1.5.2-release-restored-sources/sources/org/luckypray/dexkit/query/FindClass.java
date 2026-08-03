package org.luckypray.dexkit.query;

import Yue.C3411;
import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5499;
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
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.BaseFinder;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.schema.FindClass;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nFindClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindClass.kt\norg/luckypray/dexkit/query/FindClass\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1547#2:205\n1618#2,3:206\n1547#2:210\n1618#2,3:211\n1547#2:214\n1618#2,3:215\n1#3:209\n*S KotlinDebug\n*F\n+ 1 FindClass.kt\norg/luckypray/dexkit/query/FindClass\n*L\n191#1:205\n191#1:206,3\n193#1:210\n193#1:211,3\n196#1:214\n196#1:215,3\n*E\n"})
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0006\u0010\tJ!\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0012\u001a\u00020\u00002\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR:\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R:\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R:\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R*\u0010.\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lorg/luckypray/dexkit/query/FindClass;", "Lorg/luckypray/dexkit/query/base/BaseFinder;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "", "searchPackages", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindClass;", "", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindClass;", "excludePackages", "", "ignorePackagesCase", "(Z)Lorg/luckypray/dexkit/query/FindClass;", "Lorg/luckypray/dexkit/result/ClassData;", "classes", "searchIn", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "matcher", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/FindClass;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/FindClass;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Ljava/util/Collection;", "getSearchPackages", "()Ljava/util/Collection;", "setSearchPackages", "(Ljava/util/Collection;)V", "getExcludePackages", "setExcludePackages", "Z", "getIgnorePackagesCase", "()Z", "setIgnorePackagesCase", "(Z)V", "searchClasses", "getSearchClasses", "setSearchClasses", "findFirst", "getFindFirst", "setFindFirst", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FindClass extends BaseFinder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private Collection<String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;

    @InterfaceC6489
    private ClassMatcher matcher;

    @InterfaceC6489
    private Collection<ClassData> searchClasses;

    @InterfaceC6489
    private Collection<String> searchPackages;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/FindClass$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/FindClass;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.FindClass.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final FindClass create() {
            return new FindClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final FindClass create() {
        return INSTANCE.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FindClass excludePackages(@InterfaceC6399 String... excludePackages) {
        C5499.m17103(excludePackages, "excludePackages");
        this.excludePackages = C3411.m8926(excludePackages);
        return this;
    }

    @InterfaceC6489
    public final Collection<String> getExcludePackages() {
        return this.excludePackages;
    }

    public final boolean getFindFirst() {
        return this.findFirst;
    }

    public final boolean getIgnorePackagesCase() {
        return this.ignorePackagesCase;
    }

    @InterfaceC6489
    public final ClassMatcher getMatcher() {
        return this.matcher;
    }

    @InterfaceC6489
    public final Collection<ClassData> getSearchClasses() {
        return this.searchClasses;
    }

    @InterfaceC6489
    public final Collection<String> getSearchPackages() {
        return this.searchPackages;
    }

    @InterfaceC6399
    public final FindClass ignorePackagesCase(boolean ignorePackagesCase) {
        this.ignorePackagesCase = ignorePackagesCase;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        int iCreateVectorOfTables;
        int iCreateVectorOfTables2;
        int iCreateInClassesVector;
        C5499.m17103(fbb, "fbb");
        FindClass.Companion companion = org.luckypray.dexkit.schema.FindClass.INSTANCE;
        Collection<String> collection = this.searchPackages;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(fbb.createString((String) it.next())));
            }
            int[] iArrM11061 = C3888.m11061(arrayList);
            iCreateVectorOfTables = iArrM11061 != null ? fbb.createVectorOfTables(iArrM11061) : 0;
        }
        Collection<String> collection2 = this.excludePackages;
        if (collection2 != null) {
            ArrayList arrayList2 = new ArrayList(C3881.m10756(collection2, 10));
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(fbb.createString((String) it2.next())));
            }
            int[] iArrM110612 = C3888.m11061(arrayList2);
            iCreateVectorOfTables2 = iArrM110612 != null ? fbb.createVectorOfTables(iArrM110612) : 0;
        }
        boolean z = this.ignorePackagesCase;
        Collection<ClassData> collection3 = this.searchClasses;
        if (collection3 != null) {
            ArrayList arrayList3 = new ArrayList(C3881.m10756(collection3, 10));
            Iterator<T> it3 = collection3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(((ClassData) it3.next()).getEncodeId()));
            }
            long[] jArrM11063 = C3888.m11063(arrayList3);
            iCreateInClassesVector = jArrM11063 != null ? org.luckypray.dexkit.schema.FindClass.INSTANCE.createInClassesVector(fbb, jArrM11063) : 0;
        }
        boolean z2 = this.findFirst;
        ClassMatcher classMatcher = this.matcher;
        int iCreateFindClass = companion.createFindClass(fbb, iCreateVectorOfTables, iCreateVectorOfTables2, z, iCreateInClassesVector, z2, classMatcher != null ? classMatcher.build$dexkit_android_release(fbb) : 0);
        fbb.finish(iCreateFindClass);
        return iCreateFindClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FindClass matcher(@InterfaceC6399 ClassMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        this.matcher = matcher;
        return this;
    }

    @InterfaceC6399
    public final FindClass searchIn(@InterfaceC6399 Collection<ClassData> classes) {
        C5499.m17103(classes, "classes");
        this.searchClasses = classes;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FindClass searchPackages(@InterfaceC6399 String... searchPackages) {
        C5499.m17103(searchPackages, "searchPackages");
        this.searchPackages = C3411.m8926(searchPackages);
        return this;
    }

    public final /* synthetic */ void setExcludePackages(Collection collection) {
        this.excludePackages = collection;
    }

    public final /* synthetic */ void setFindFirst(boolean z) {
        this.findFirst = z;
    }

    public final /* synthetic */ void setIgnorePackagesCase(boolean z) {
        this.ignorePackagesCase = z;
    }

    public final /* synthetic */ void setSearchClasses(Collection collection) {
        this.searchClasses = collection;
    }

    public final /* synthetic */ void setSearchPackages(Collection collection) {
        this.searchPackages = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final FindClass excludePackages(@InterfaceC6399 Collection<String> excludePackages) {
        C5499.m17103(excludePackages, "excludePackages");
        this.excludePackages = excludePackages;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ FindClass matcher(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        matcher(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final FindClass searchPackages(@InterfaceC6399 Collection<String> searchPackages) {
        C5499.m17103(searchPackages, "searchPackages");
        this.searchPackages = searchPackages;
        return this;
    }
}
