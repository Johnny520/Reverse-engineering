package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.matchers.UsingFieldMatcher;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldMatcherList extends ArrayList<UsingFieldMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsingFieldMatcherList(Collection<UsingFieldMatcher> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ UsingFieldMatcherList add(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        UsingFieldMatcher usingFieldMatcher = new UsingFieldMatcher();
        interfaceC0482u5.invoke(usingFieldMatcher);
        add(usingFieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UsingFieldMatcher) {
            return contains((UsingFieldMatcher) obj);
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
        if (obj instanceof UsingFieldMatcher) {
            return indexOf((UsingFieldMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UsingFieldMatcher) {
            return lastIndexOf((UsingFieldMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof UsingFieldMatcher) {
            return remove((UsingFieldMatcher) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ UsingFieldMatcher removeAt(int i) {
        return remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public UsingFieldMatcherList(int i) {
        super(i);
    }

    public UsingFieldMatcherList() {
    }

    public /* bridge */ boolean contains(UsingFieldMatcher usingFieldMatcher) {
        return super.contains((Object) usingFieldMatcher);
    }

    public /* bridge */ int indexOf(UsingFieldMatcher usingFieldMatcher) {
        return super.indexOf((Object) usingFieldMatcher);
    }

    public /* bridge */ int lastIndexOf(UsingFieldMatcher usingFieldMatcher) {
        return super.lastIndexOf((Object) usingFieldMatcher);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ UsingFieldMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(UsingFieldMatcher usingFieldMatcher) {
        return super.remove((Object) usingFieldMatcher);
    }
}
