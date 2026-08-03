package org.luckypray.dexkit.query;

import Yue.C3881;
import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC5573;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.StringMatchersGroup;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMatcherCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatcherCollections.kt\norg/luckypray/dexkit/query/StringMatchersGroupList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n1547#2:443\n1618#2,3:444\n*S KotlinDebug\n*F\n+ 1 MatcherCollections.kt\norg/luckypray/dexkit/query/StringMatchersGroupList\n*L\n411#1:443\n411#1:444,3\n*E\n"})
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ9\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ&\u0010\u0014\u001a\u00020\u00002\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "groupName", "usingStrings", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "add", "(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "Lkotlin/Function1;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(Ljava/lang/String;LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class StringMatchersGroupList extends ArrayList<StringMatchersGroup> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StringMatchersGroupList() {
    }

    public static /* synthetic */ StringMatchersGroupList add$default(StringMatchersGroupList stringMatchersGroupList, String str, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return stringMatchersGroupList.add(str, collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final StringMatchersGroupList add(@InterfaceC6399 String str, @InterfaceC6399 Collection<String> collection) {
        C5499.m17103(str, "groupName");
        C5499.m17103(collection, "usingStrings");
        return add$default(this, str, collection, null, false, 12, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof StringMatchersGroup) {
            return contains((StringMatchersGroup) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof StringMatchersGroup) {
            return indexOf((StringMatchersGroup) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof StringMatchersGroup) {
            return lastIndexOf((StringMatchersGroup) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ StringMatchersGroup remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ StringMatchersGroup removeAt(int i) {
        return (StringMatchersGroup) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public StringMatchersGroupList(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final StringMatchersGroupList add(@InterfaceC6399 String str, @InterfaceC6399 Collection<String> collection, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "groupName");
        C5499.m17103(collection, "usingStrings");
        C5499.m17103(stringMatchType, "matchType");
        return add$default(this, str, collection, stringMatchType, false, 8, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ boolean contains(StringMatchersGroup stringMatchersGroup) {
        return super.contains((Object) stringMatchersGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int indexOf(StringMatchersGroup stringMatchersGroup) {
        return super.indexOf((Object) stringMatchersGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int lastIndexOf(StringMatchersGroup stringMatchersGroup) {
        return super.lastIndexOf((Object) stringMatchersGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof StringMatchersGroup) {
            return remove((StringMatchersGroup) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringMatchersGroupList(@InterfaceC6399 Collection<StringMatchersGroup> collection) {
        super(collection);
        C5499.m17103(collection, "elements");
    }

    public final /* synthetic */ StringMatchersGroupList add(String groupName, InterfaceC5124 init) {
        C5499.m17103(groupName, "groupName");
        C5499.m17103(init, "init");
        StringMatcherList stringMatcherList = new StringMatcherList();
        init.invoke(stringMatcherList);
        add(new StringMatchersGroup(groupName, stringMatcherList));
        return this;
    }

    public /* bridge */ boolean remove(StringMatchersGroup stringMatchersGroup) {
        return super.remove((Object) stringMatchersGroup);
    }

    public final /* synthetic */ StringMatchersGroupList add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        StringMatchersGroup stringMatchersGroup = new StringMatchersGroup();
        init.invoke(stringMatchersGroup);
        add(stringMatchersGroup);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final StringMatchersGroupList add(@InterfaceC6399 String groupName, @InterfaceC6399 Collection<String> usingStrings, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(groupName, "groupName");
        C5499.m17103(usingStrings, "usingStrings");
        C5499.m17103(matchType, "matchType");
        ArrayList arrayList = new ArrayList(C3881.m10756(usingStrings, 10));
        Iterator<T> it = usingStrings.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), matchType, ignoreCase));
        }
        add(new StringMatchersGroup(groupName, arrayList));
        return this;
    }
}
