package org.luckypray.dexkit.query;

import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.matchers.UsingFieldMatcher;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ&\u0010\u0011\u001a\u00020\u00002\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lorg/luckypray/dexkit/query/UsingFieldMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "add", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/UsingFieldMatcherList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class UsingFieldMatcherList extends ArrayList<UsingFieldMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public UsingFieldMatcherList() {
    }

    public final /* synthetic */ UsingFieldMatcherList add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        UsingFieldMatcher usingFieldMatcher = new UsingFieldMatcher();
        init.invoke(usingFieldMatcher);
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
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ UsingFieldMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ UsingFieldMatcher removeAt(int i) {
        return (UsingFieldMatcher) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public UsingFieldMatcherList(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ boolean contains(UsingFieldMatcher usingFieldMatcher) {
        return super.contains((Object) usingFieldMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int indexOf(UsingFieldMatcher usingFieldMatcher) {
        return super.indexOf((Object) usingFieldMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int lastIndexOf(UsingFieldMatcher usingFieldMatcher) {
        return super.lastIndexOf((Object) usingFieldMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof UsingFieldMatcher) {
            return remove((UsingFieldMatcher) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsingFieldMatcherList(@InterfaceC6399 Collection<UsingFieldMatcher> collection) {
        super(collection);
        C5499.m17103(collection, "elements");
    }

    public /* bridge */ boolean remove(UsingFieldMatcher usingFieldMatcher) {
        return super.remove((Object) usingFieldMatcher);
    }
}
