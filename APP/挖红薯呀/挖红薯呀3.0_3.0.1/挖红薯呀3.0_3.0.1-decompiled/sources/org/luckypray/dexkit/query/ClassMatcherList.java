package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassMatcherList extends ArrayList<ClassMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassMatcherList(Collection<ClassMatcher> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ ClassMatcherList add(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        add(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ClassMatcher) {
            return contains((ClassMatcher) obj);
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
        if (obj instanceof ClassMatcher) {
            return indexOf((ClassMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ClassMatcher) {
            return lastIndexOf((ClassMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ ClassMatcherList match(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        add(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ClassMatcher) {
            return remove((ClassMatcher) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ ClassMatcher removeAt(int i) {
        return remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public ClassMatcherList(int i) {
        super(i);
    }

    public ClassMatcherList() {
    }

    public /* bridge */ boolean contains(ClassMatcher classMatcher) {
        return super.contains((Object) classMatcher);
    }

    public /* bridge */ int indexOf(ClassMatcher classMatcher) {
        return super.indexOf((Object) classMatcher);
    }

    public /* bridge */ int lastIndexOf(ClassMatcher classMatcher) {
        return super.lastIndexOf((Object) classMatcher);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ ClassMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(ClassMatcher classMatcher) {
        return super.remove((Object) classMatcher);
    }

    public final ClassMatcherList match(ClassMatcher classMatcher) {
        classMatcher.getClass();
        add(classMatcher);
        return this;
    }
}
