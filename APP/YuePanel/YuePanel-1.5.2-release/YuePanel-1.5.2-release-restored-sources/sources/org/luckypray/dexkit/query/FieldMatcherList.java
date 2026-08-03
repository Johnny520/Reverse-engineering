package org.luckypray.dexkit.query;

import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC5573;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.FieldMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMatcherCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatcherCollections.kt\norg/luckypray/dexkit/query/FieldMatcherList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n1#2:443\n*E\n"})
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0013\u001a\u00020\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b\u0013\u0010\u0017J+\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u0014J&\u0010\u001e\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J&\u0010!\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lorg/luckypray/dexkit/query/FieldMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "typeName", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "addForType", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/FieldMatcherList;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "name", "addForName", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "add", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "matcher", "match", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FieldMatcherList extends ArrayList<FieldMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldMatcherList() {
    }

    public static /* synthetic */ FieldMatcherList addForName$default(FieldMatcherList fieldMatcherList, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcherList.addForName(str, stringMatchType, z);
    }

    public static /* synthetic */ FieldMatcherList addForType$default(FieldMatcherList fieldMatcherList, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcherList.addForType(str, stringMatchType, z);
    }

    public final /* synthetic */ FieldMatcherList add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcherList addForName(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return addForName$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcherList addForType(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeName");
        return addForType$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof FieldMatcher) {
            return contains((FieldMatcher) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof FieldMatcher) {
            return indexOf((FieldMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof FieldMatcher) {
            return lastIndexOf((FieldMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcherList match(@InterfaceC6399 FieldMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        add(matcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ FieldMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ FieldMatcher removeAt(int i) {
        return (FieldMatcher) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FieldMatcherList(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcherList addForName(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "name");
        C5499.m17103(stringMatchType, "matchType");
        return addForName$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcherList addForType(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "typeName");
        C5499.m17103(stringMatchType, "matchType");
        return addForType$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ boolean contains(FieldMatcher fieldMatcher) {
        return super.contains((Object) fieldMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int indexOf(FieldMatcher fieldMatcher) {
        return super.indexOf((Object) fieldMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int lastIndexOf(FieldMatcher fieldMatcher) {
        return super.lastIndexOf((Object) fieldMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ FieldMatcherList match(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof FieldMatcher) {
            return remove((FieldMatcher) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldMatcherList(@InterfaceC6399 Collection<FieldMatcher> collection) {
        super(collection);
        C5499.m17103(collection, "elements");
    }

    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcherList addForName(@InterfaceC6399 String name, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(name, "name");
        C5499.m17103(matchType, "matchType");
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.name(name, matchType, ignoreCase);
        add(fieldMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcherList addForType(@InterfaceC6399 String typeName, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(typeName, "typeName");
        C5499.m17103(matchType, "matchType");
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.type(typeName, matchType, ignoreCase);
        add(fieldMatcher);
        return this;
    }

    public /* bridge */ boolean remove(FieldMatcher fieldMatcher) {
        return super.remove((Object) fieldMatcher);
    }

    @InterfaceC6399
    public final FieldMatcherList addForType(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.type(clazz);
        add(fieldMatcher);
        return this;
    }
}
