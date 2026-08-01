package org.luckypray.dexkit.query.matchers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.InterfacesMatcher;
import p000.AbstractC0619pl;
import p000.AbstractC0960ye;
import p000.AbstractC1001ze;
import p000.C0096cl;
import p000.C0938xt;
import p000.InterfaceC0061bn;
import p000.InterfaceC0742sw;
import p000.z20;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class InterfacesMatcher extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private List<ClassMatcher> interfacesMatcher;
    private MatchType matchType = MatchType.Contains;
    private IntRange rangeMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ InterfacesMatcher add$default(InterfacesMatcher interfacesMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return interfacesMatcher.add(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ InterfacesMatcher count$default(InterfacesMatcher interfacesMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return interfacesMatcher.count(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfacesMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfacesMatcher add(ClassMatcher classMatcher) {
        classMatcher.getClass();
        List<ClassMatcher> arrayList = this.interfacesMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.interfacesMatcher = arrayList;
        arrayList.add(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfacesMatcher count(z20 z20Var) {
        z20Var.getClass();
        this.rangeMatcher = new IntRange(z20Var);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfacesMatcher countMax(int i) {
        this.rangeMatcher = new IntRange(0, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfacesMatcher countMin(int i) {
        this.rangeMatcher = new IntRange(i, Integer.MAX_VALUE);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ int getCount() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<ClassMatcher> getInterfacesMatcher() {
        return this.interfacesMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MatchType getMatchType() {
        return this.matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) {
        int iM5162k;
        c0938xt.getClass();
        InterfacesMatcher.Companion companion = org.luckypray.dexkit.schema.InterfacesMatcher.Companion;
        List<ClassMatcher> list = this.interfacesMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((ClassMatcher) it.next()).build$dexkit_android_release(c0938xt)));
            }
            iM5162k = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList));
        } else {
            iM5162k = 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateInterfacesMatcher = companion.createInterfacesMatcher(c0938xt, iM5162k, value, intRange != null ? intRange.build$dexkit_android_release(c0938xt) : 0);
        c0938xt.m5165n(iCreateInterfacesMatcher);
        return iCreateInterfacesMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfacesMatcher interfaces(Collection<ClassMatcher> collection) {
        collection.getClass();
        this.interfacesMatcher = new ArrayList(collection);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfacesMatcher matchType(MatchType matchType) {
        matchType.getClass();
        this.matchType = matchType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setMatchType(MatchType matchType) {
        matchType.getClass();
        this.matchType = matchType;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.InterfacesMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final InterfacesMatcher create() {
            return new InterfacesMatcher();
        }

        private Companion() {
        }
    }

    public final InterfacesMatcher count(IntRange intRange) {
        intRange.getClass();
        this.rangeMatcher = intRange;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCount(I)V */
    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final InterfacesMatcher setCount(int i) {
        this.rangeMatcher = new IntRange(i);
        return this;
    }

    public final InterfacesMatcher count(int i, int i2) {
        this.rangeMatcher = new IntRange(i, i2);
        return this;
    }

    public final InterfacesMatcher add(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    public final InterfacesMatcher add(String str) {
        str.getClass();
        return add$default(this, str, null, false, 6, null);
    }

    public final InterfacesMatcher add(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        classMatcher.className(str, stringMatchType, z);
        add(classMatcher);
        return this;
    }

    public final /* synthetic */ InterfacesMatcher add(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        add(classMatcher);
        return this;
    }
}
