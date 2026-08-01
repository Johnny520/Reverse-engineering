package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.FieldMatcher;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMatcherList extends ArrayList<FieldMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldMatcherList(Collection<FieldMatcher> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ FieldMatcherList addForName$default(FieldMatcherList fieldMatcherList, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcherList.addForName(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ FieldMatcherList addForType$default(FieldMatcherList fieldMatcherList, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcherList.addForType(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ FieldMatcherList add(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0742sw.invoke(fieldMatcher);
        add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcherList addForName(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.name(str, stringMatchType, z);
        add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcherList addForType(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.type(str, stringMatchType, z);
        add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof FieldMatcher) {
            return contains((FieldMatcher) obj);
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
    public final /* synthetic */ FieldMatcherList match(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0742sw.invoke(fieldMatcher);
        add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof FieldMatcher) {
            return remove((FieldMatcher) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ FieldMatcher removeAt(int i) {
        return remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public FieldMatcherList(int i) {
        super(i);
    }

    public FieldMatcherList() {
    }

    public /* bridge */ boolean contains(FieldMatcher fieldMatcher) {
        return super.contains((Object) fieldMatcher);
    }

    public /* bridge */ int indexOf(FieldMatcher fieldMatcher) {
        return super.indexOf((Object) fieldMatcher);
    }

    public /* bridge */ int lastIndexOf(FieldMatcher fieldMatcher) {
        return super.lastIndexOf((Object) fieldMatcher);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ FieldMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(FieldMatcher fieldMatcher) {
        return super.remove((Object) fieldMatcher);
    }

    public final FieldMatcherList match(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        add(fieldMatcher);
        return this;
    }

    public final FieldMatcherList addForName(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addForName$default(this, str, stringMatchType, false, 4, null);
    }

    public final FieldMatcherList addForType(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addForType$default(this, str, stringMatchType, false, 4, null);
    }

    public final FieldMatcherList addForName(String str) {
        str.getClass();
        return addForName$default(this, str, null, false, 6, null);
    }

    public final FieldMatcherList addForType(String str) {
        str.getClass();
        return addForType$default(this, str, null, false, 6, null);
    }

    public final FieldMatcherList addForType(Class<?> cls) {
        cls.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.type(cls);
        add(fieldMatcher);
        return this;
    }
}
