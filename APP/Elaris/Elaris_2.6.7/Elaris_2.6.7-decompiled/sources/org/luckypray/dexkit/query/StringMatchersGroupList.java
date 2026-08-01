package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.StringMatchersGroup;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import p000.AbstractC0276j2;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class StringMatchersGroupList extends ArrayList<StringMatchersGroup> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringMatchersGroupList(Collection<StringMatchersGroup> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final StringMatchersGroupList add(String str, Collection<String> collection, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        collection.getClass();
        stringMatchType.getClass();
        ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(collection));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z));
        }
        add(new StringMatchersGroup(str, arrayList));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof StringMatchersGroup) {
            return contains((StringMatchersGroup) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof StringMatchersGroup) {
            return remove((StringMatchersGroup) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ StringMatchersGroup removeAt(int i) {
        return remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public StringMatchersGroupList(int i) {
        super(i);
    }

    public StringMatchersGroupList() {
    }

    public /* bridge */ boolean contains(StringMatchersGroup stringMatchersGroup) {
        return super.contains((Object) stringMatchersGroup);
    }

    public /* bridge */ int indexOf(StringMatchersGroup stringMatchersGroup) {
        return super.indexOf((Object) stringMatchersGroup);
    }

    public /* bridge */ int lastIndexOf(StringMatchersGroup stringMatchersGroup) {
        return super.lastIndexOf((Object) stringMatchersGroup);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ StringMatchersGroup remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(StringMatchersGroup stringMatchersGroup) {
        return super.remove((Object) stringMatchersGroup);
    }

    public final StringMatchersGroupList add(String str, Collection<String> collection, StringMatchType stringMatchType) {
        str.getClass();
        collection.getClass();
        stringMatchType.getClass();
        return add$default(this, str, collection, stringMatchType, false, 8, null);
    }

    public final /* synthetic */ StringMatchersGroupList add(String str, InterfaceC0482u5 interfaceC0482u5) {
        str.getClass();
        interfaceC0482u5.getClass();
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0482u5.invoke(stringMatcherList);
        add(new StringMatchersGroup(str, stringMatcherList));
        return this;
    }

    public final /* synthetic */ StringMatchersGroupList add(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        StringMatchersGroup stringMatchersGroup = new StringMatchersGroup();
        interfaceC0482u5.invoke(stringMatchersGroup);
        add(stringMatchersGroup);
        return this;
    }

    public final StringMatchersGroupList add(String str, Collection<String> collection) {
        str.getClass();
        collection.getClass();
        return add$default(this, str, collection, null, false, 12, null);
    }
}
