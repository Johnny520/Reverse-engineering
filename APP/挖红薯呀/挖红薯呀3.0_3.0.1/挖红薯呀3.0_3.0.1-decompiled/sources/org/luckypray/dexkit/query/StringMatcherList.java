package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class StringMatcherList extends ArrayList<StringMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringMatcherList(Collection<StringMatcher> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ StringMatcherList add$default(StringMatcherList stringMatcherList, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return stringMatcherList.add(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ StringMatcherList match$default(StringMatcherList stringMatcherList, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return stringMatcherList.match(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcherList add(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof StringMatcher) {
            return contains((StringMatcher) obj);
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
        if (obj instanceof StringMatcher) {
            return indexOf((StringMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof StringMatcher) {
            return lastIndexOf((StringMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcherList match(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return match$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof StringMatcher) {
            return remove((StringMatcher) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ StringMatcher removeAt(int i) {
        return remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public StringMatcherList(int i) {
        super(i);
    }

    public StringMatcherList() {
    }

    public /* bridge */ boolean contains(StringMatcher stringMatcher) {
        return super.contains((Object) stringMatcher);
    }

    public /* bridge */ int indexOf(StringMatcher stringMatcher) {
        return super.indexOf((Object) stringMatcher);
    }

    public /* bridge */ int lastIndexOf(StringMatcher stringMatcher) {
        return super.lastIndexOf((Object) stringMatcher);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ StringMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(StringMatcher stringMatcher) {
        return super.remove((Object) stringMatcher);
    }

    public final StringMatcherList add(String str) {
        str.getClass();
        return add$default(this, str, null, false, 6, null);
    }

    public final StringMatcherList match(String str) {
        str.getClass();
        return match$default(this, str, null, false, 6, null);
    }

    public final StringMatcherList add(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        add(new StringMatcher(str, stringMatchType, z));
        return this;
    }

    public final StringMatcherList match(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        add(stringMatcher);
        return this;
    }

    public final /* synthetic */ StringMatcherList add(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        StringMatcher stringMatcher = new StringMatcher();
        interfaceC0742sw.invoke(stringMatcher);
        add(stringMatcher);
        return this;
    }

    public final StringMatcherList match(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        add(new StringMatcher(str, stringMatchType, z));
        return this;
    }

    public final /* synthetic */ StringMatcherList match(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        StringMatcher stringMatcher = new StringMatcher();
        interfaceC0742sw.invoke(stringMatcher);
        add(stringMatcher);
        return this;
    }
}
