package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodMatcherList extends ArrayList<MethodMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodMatcherList(Collection<MethodMatcher> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodMatcherList add(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0482u5.invoke(methodMatcher);
        add(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof MethodMatcher) {
            return contains((MethodMatcher) obj);
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
        if (obj instanceof MethodMatcher) {
            return indexOf((MethodMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof MethodMatcher) {
            return lastIndexOf((MethodMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodMatcherList match(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0482u5.invoke(methodMatcher);
        add(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof MethodMatcher) {
            return remove((MethodMatcher) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ MethodMatcher removeAt(int i) {
        return remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public MethodMatcherList(int i) {
        super(i);
    }

    public MethodMatcherList() {
    }

    public /* bridge */ boolean contains(MethodMatcher methodMatcher) {
        return super.contains((Object) methodMatcher);
    }

    public /* bridge */ int indexOf(MethodMatcher methodMatcher) {
        return super.indexOf((Object) methodMatcher);
    }

    public /* bridge */ int lastIndexOf(MethodMatcher methodMatcher) {
        return super.lastIndexOf((Object) methodMatcher);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ MethodMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(MethodMatcher methodMatcher) {
        return super.remove((Object) methodMatcher);
    }

    public final MethodMatcherList match(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        add(methodMatcher);
        return this;
    }
}
