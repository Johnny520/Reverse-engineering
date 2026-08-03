package p074f5;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 f5.c, still in use, count: 1, list:
  (r0v0 f5.c) from 0x0073: FILLED_NEW_ARRAY (r0v0 f5.c), (r1v1 f5.c), (r2v2 f5.c), (r3v3 f5.c), (r4v4 f5.c), (r5v5 f5.c), (r6v5 f5.c) A[WRAPPED] (LINE:116) elemType: f5.c
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: f5.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1067c {
    /* JADX INFO: Fake field, exist only in values array */
    WHITELIST(0, "whitelist", false),
    /* JADX INFO: Fake field, exist only in values array */
    GREYLIST(1, "greylist", false),
    /* JADX INFO: Fake field, exist only in values array */
    BLACKLIST(2, "blacklist", false),
    /* JADX INFO: Fake field, exist only in values array */
    GREYLIST_MAX_O(3, "greylist-max-o", false),
    /* JADX INFO: Fake field, exist only in values array */
    GREYLIST_MAX_P(4, "greylist-max-p", false),
    /* JADX INFO: Fake field, exist only in values array */
    GREYLIST_MAX_Q(5, "greylist-max-q", false),
    /* JADX INFO: Fake field, exist only in values array */
    GREYLIST_MAX_R(6, "greylist-max-r", false),
    /* JADX INFO: Fake field, exist only in values array */
    CORE_PLATFORM_API(8, "core-platform-api", true),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_API(16, "test-api", true);


    /* JADX INFO: renamed from: j */
    public static final EnumC1067c[] f3422j = {new EnumC1067c(0, "whitelist", false), new EnumC1067c(1, "greylist", false), new EnumC1067c(2, "blacklist", false), new EnumC1067c(3, "greylist-max-o", false), new EnumC1067c(4, "greylist-max-p", false), new EnumC1067c(5, "greylist-max-q", false), new EnumC1067c(6, "greylist-max-r", false)};

    /* JADX INFO: renamed from: k */
    public static final EnumC1067c[] f3423k = {new EnumC1067c(8, "core-platform-api", true), new EnumC1067c(16, "test-api", true)};

    /* JADX INFO: renamed from: l */
    public static final HashMap f3424l = new HashMap();

    /* JADX INFO: renamed from: g */
    public final int f3426g;

    /* JADX INFO: renamed from: h */
    public final String f3427h;

    /* JADX INFO: renamed from: i */
    public final boolean f3428i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        for (EnumC1067c enumC1067c : values()) {
            f3424l.put(enumC1067c.f3427h, enumC1067c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC1067c(int i9, String str, boolean z9) {
        this.f3426g = i9;
        this.f3427h = str;
        this.f3428i = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Set m2689a(int i9) {
        int i10 = i9 & 7;
        EnumC1067c enumC1067c = f3422j[i10];
        HashSet hashSet = new HashSet();
        if ((i9 & (-8)) == 0) {
            hashSet.add(enumC1067c);
            return Collections.unmodifiableSet(hashSet);
        }
        hashSet.add(enumC1067c);
        for (int i11 = 0; i11 < 2; i11++) {
            EnumC1067c enumC1067c2 = f3423k[i11];
            boolean z9 = enumC1067c2.f3428i;
            int i12 = enumC1067c2.f3426g;
            if (z9) {
                if ((i9 & i12) != 0) {
                    hashSet.add(enumC1067c2);
                }
            } else if (i10 == i12) {
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1067c valueOf(String str) {
        return (EnumC1067c) Enum.valueOf(EnumC1067c.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1067c[] values() {
        return (EnumC1067c[]) f3425m.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return this.f3427h;
    }
}
