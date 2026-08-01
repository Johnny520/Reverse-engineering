package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.StringMatchType;
import p068.InterfaceC7387;
import p378.C9755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u0013\u0010\u001bJ!\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, m151d2 = {"Lorg/luckypray/dexkit/query/StringMatcherList;", "Ljava/util/ArrayList;", "L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世哲兰苏;", "Lkotlin/collections/ArrayList;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "usingString", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "add", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatcherList;", "matcher", "match", "(L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世哲兰苏;)Lorg/luckypray/dexkit/query/StringMatcherList;", "Lkotlin/Function1;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "init", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/query/StringMatcherList;", "dexkit-android_release"}, m152k = 1, m153mv = {1, 5, 1}, m155xi = 48)
public final class StringMatcherList extends ArrayList<C9755> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringMatcherList(Collection<C9755> collection) {
        super(collection);
        collection.getClass();
    }

    public static /* synthetic */ StringMatcherList add$default(StringMatcherList stringMatcherList, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return stringMatcherList.add(str, stringMatchType, z);
    }

    public static /* synthetic */ StringMatcherList match$default(StringMatcherList stringMatcherList, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return stringMatcherList.match(str, stringMatchType, z);
    }

    public final StringMatcherList add(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C9755) {
            return contains((C9755) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C9755) {
            return indexOf((C9755) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C9755) {
            return lastIndexOf((C9755) obj);
        }
        return -1;
    }

    public final StringMatcherList match(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return match$default(this, str, stringMatchType, false, 4, null);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C9755) {
            return remove((C9755) obj);
        }
        return false;
    }

    public /* bridge */ C9755 removeAt(int i) {
        return remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public StringMatcherList(int i) {
        super(i);
    }

    public StringMatcherList() {
    }

    public /* bridge */ boolean contains(C9755 c9755) {
        return super.contains((Object) c9755);
    }

    public /* bridge */ int indexOf(C9755 c9755) {
        return super.indexOf((Object) c9755);
    }

    public /* bridge */ int lastIndexOf(C9755 c9755) {
        return super.lastIndexOf((Object) c9755);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ C9755 remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C9755 c9755) {
        return super.remove((Object) c9755);
    }

    public final StringMatcherList add(String str) {
        str.getClass();
        return add$default(this, str, null, false, 6, null);
    }

    public final StringMatcherList match(String str) {
        str.getClass();
        return match$default(this, str, null, false, 6, null);
    }

    public final StringMatcherList add(String usingString, StringMatchType matchType, boolean ignoreCase) {
        usingString.getClass();
        matchType.getClass();
        add(new C9755(usingString, matchType, ignoreCase));
        return this;
    }

    public final StringMatcherList match(C9755 matcher) {
        matcher.getClass();
        add(matcher);
        return this;
    }

    public final /* synthetic */ StringMatcherList add(InterfaceC7387 init) {
        init.getClass();
        C9755 c9755 = new C9755();
        init.invoke(c9755);
        add(c9755);
        return this;
    }

    public final StringMatcherList match(String usingString, StringMatchType matchType, boolean ignoreCase) {
        usingString.getClass();
        matchType.getClass();
        add(new C9755(usingString, matchType, ignoreCase));
        return this;
    }

    public final /* synthetic */ StringMatcherList match(InterfaceC7387 init) {
        init.getClass();
        C9755 c9755 = new C9755();
        init.invoke(c9755);
        add(c9755);
        return this;
    }
}
