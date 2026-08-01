package org.luckypray.dexkit.query.matchers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.BatchUsingStringsMatcher;
import p000.AbstractC0619pl;
import p000.AbstractC0960ye;
import p000.AbstractC1001ze;
import p000.C0096cl;
import p000.C0938xt;
import p000.InterfaceC0061bn;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class StringMatchersGroup extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private String groupName;
    private List<StringMatcher> stringMatchers;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StringMatchersGroup(String str, Collection<StringMatcher> collection) {
        str.getClass();
        collection.getClass();
        this.stringMatchers = new ArrayList();
        this.groupName = str;
        this.stringMatchers = new ArrayList(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ StringMatchersGroup add$default(StringMatchersGroup stringMatchersGroup, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return stringMatchersGroup.add(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final StringMatchersGroup create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ StringMatchersGroup usingStrings$default(StringMatchersGroup stringMatchersGroup, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return stringMatchersGroup.usingStrings(collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatchersGroup add(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<StringMatcher> getStringMatchers() {
        return this.stringMatchers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ Collection getUsingStrings() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatchersGroup groupName(String str) {
        str.getClass();
        this.groupName = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) throws IllegalAccessException {
        c0938xt.getClass();
        if (this.groupName == null) {
            throw new IllegalAccessException("groupName not be null");
        }
        if (this.stringMatchers.isEmpty()) {
            throw new IllegalAccessException("matchers not be empty");
        }
        BatchUsingStringsMatcher.Companion companion = BatchUsingStringsMatcher.Companion;
        int iM5161j = c0938xt.m5161j(this.groupName);
        List<StringMatcher> list = this.stringMatchers;
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((StringMatcher) it.next()).build$dexkit_android_release(c0938xt)));
        }
        int iCreateBatchUsingStringsMatcher = companion.createBatchUsingStringsMatcher(c0938xt, iM5161j, c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList)));
        c0938xt.m5165n(iCreateBatchUsingStringsMatcher);
        return iCreateBatchUsingStringsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setGroupName(String str) {
        this.groupName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setUsingStrings(Collection collection) {
        collection.getClass();
        usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatchersGroup usingStrings(Collection<String> collection, StringMatchType stringMatchType, boolean z) {
        collection.getClass();
        stringMatchType.getClass();
        Collection<String> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(collection2));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z));
        }
        this.stringMatchers = new ArrayList(arrayList);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.StringMatchersGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final StringMatchersGroup create() {
            return new StringMatchersGroup();
        }

        private Companion() {
        }
    }

    public final StringMatchersGroup add(String str) {
        str.getClass();
        return add$default(this, str, null, false, 6, null);
    }

    public final StringMatchersGroup add(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        this.stringMatchers.add(stringMatcher);
        return this;
    }

    public final StringMatchersGroup add(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        add(new StringMatcher(str, stringMatchType, z));
        return this;
    }

    public StringMatchersGroup() {
        this.stringMatchers = new ArrayList();
    }

    public final StringMatchersGroup usingStrings(Collection<String> collection, StringMatchType stringMatchType) {
        collection.getClass();
        stringMatchType.getClass();
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    public final StringMatchersGroup usingStrings(StringMatcherList stringMatcherList) {
        stringMatcherList.getClass();
        this.stringMatchers = stringMatcherList;
        return this;
    }

    public final StringMatchersGroup usingStrings(Collection<String> collection) {
        collection.getClass();
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    public final /* synthetic */ StringMatchersGroup usingStrings(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0742sw.invoke(stringMatcherList);
        usingStrings(stringMatcherList);
        return this;
    }

    public final StringMatchersGroup usingStrings(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.stringMatchers = new ArrayList(arrayList);
        return this;
    }
}
