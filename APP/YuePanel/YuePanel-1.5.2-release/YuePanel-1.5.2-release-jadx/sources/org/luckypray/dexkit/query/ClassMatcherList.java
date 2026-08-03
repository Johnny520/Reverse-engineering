package org.luckypray.dexkit.query;

import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.matchers.ClassMatcher;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0014\u001a\u00020\u00002\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u000e\u001a\u00020\u00002\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u000e\u0010\u0015¨\u0006\u0016"}, d2 = {"Lorg/luckypray/dexkit/query/ClassMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "matcher", "match", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/ClassMatcherList;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "add", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/ClassMatcherList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ClassMatcherList extends ArrayList<ClassMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassMatcherList() {
    }

    public final /* synthetic */ ClassMatcherList add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
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
    @InterfaceC6399
    public final ClassMatcherList match(@InterfaceC6399 ClassMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        add(matcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ ClassMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ ClassMatcher removeAt(int i) {
        return (ClassMatcher) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ClassMatcherList(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ boolean contains(ClassMatcher classMatcher) {
        return super.contains((Object) classMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int indexOf(ClassMatcher classMatcher) {
        return super.indexOf((Object) classMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int lastIndexOf(ClassMatcher classMatcher) {
        return super.lastIndexOf((Object) classMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ ClassMatcherList match(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        add(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ClassMatcher) {
            return remove((ClassMatcher) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassMatcherList(@InterfaceC6399 Collection<ClassMatcher> collection) {
        super(collection);
        C5499.m17103(collection, "elements");
    }

    public /* bridge */ boolean remove(ClassMatcher classMatcher) {
        return super.remove((Object) classMatcher);
    }
}
