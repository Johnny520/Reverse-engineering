package org.luckypray.dexkit.query;

import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC5573;
import Yue.InterfaceC6399;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J&\u0010\u0013\u001a\u00020\u00002\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001a¢\u0006\u0004\b\u0013\u0010\u001cJ&\u0010\u0016\u001a\u00020\u00002\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001a¢\u0006\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/query/StringMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "usingString", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "add", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatcherList;", "matcher", "match", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/StringMatcherList;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/StringMatcherList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class StringMatcherList extends ArrayList<StringMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StringMatcherList() {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final StringMatcherList add(@InterfaceC6399 String str) {
        C5499.m17103(str, "usingString");
        return add$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof StringMatcher) {
            return contains((StringMatcher) obj);
        }
        return false;
    }

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
    @InterfaceC6399
    @InterfaceC5573
    public final StringMatcherList match(@InterfaceC6399 String str) {
        C5499.m17103(str, "usingString");
        return match$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ StringMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ StringMatcher removeAt(int i) {
        return (StringMatcher) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public StringMatcherList(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final StringMatcherList add(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "usingString");
        C5499.m17103(stringMatchType, "matchType");
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ boolean contains(StringMatcher stringMatcher) {
        return super.contains((Object) stringMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int indexOf(StringMatcher stringMatcher) {
        return super.indexOf((Object) stringMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int lastIndexOf(StringMatcher stringMatcher) {
        return super.lastIndexOf((Object) stringMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final StringMatcherList match(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "usingString");
        C5499.m17103(stringMatchType, "matchType");
        return match$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof StringMatcher) {
            return remove((StringMatcher) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringMatcherList(@InterfaceC6399 Collection<StringMatcher> collection) {
        super(collection);
        C5499.m17103(collection, "elements");
    }

    @InterfaceC6399
    @InterfaceC5573
    public final StringMatcherList add(@InterfaceC6399 String usingString, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(usingString, "usingString");
        C5499.m17103(matchType, "matchType");
        add(new StringMatcher(usingString, matchType, ignoreCase));
        return this;
    }

    @InterfaceC6399
    public final StringMatcherList match(@InterfaceC6399 StringMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        add(matcher);
        return this;
    }

    public /* bridge */ boolean remove(StringMatcher stringMatcher) {
        return super.remove((Object) stringMatcher);
    }

    public final /* synthetic */ StringMatcherList add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        StringMatcher stringMatcher = new StringMatcher();
        init.invoke(stringMatcher);
        add(stringMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final StringMatcherList match(@InterfaceC6399 String usingString, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(usingString, "usingString");
        C5499.m17103(matchType, "matchType");
        add(new StringMatcher(usingString, matchType, ignoreCase));
        return this;
    }

    public final /* synthetic */ StringMatcherList match(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        StringMatcher stringMatcher = new StringMatcher();
        init.invoke(stringMatcher);
        add(stringMatcher);
        return this;
    }
}
