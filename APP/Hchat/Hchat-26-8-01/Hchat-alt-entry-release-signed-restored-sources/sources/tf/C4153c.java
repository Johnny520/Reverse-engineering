package tf;

import okio.C3193a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: tf.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4153c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m8345a(int i9, int i10) {
        if (i9 < 0 || i9 >= i10) {
            C3193a.m6820i(AbstractC3199a.m6837j(i9, "index: ", ", size: ", i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m8346b(int i9, int i10) {
        if (i9 < 0 || i9 > i10) {
            C3193a.m6820i(AbstractC3199a.m6837j(i9, "index: ", ", size: ", i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m8347c(int i9, int i10, int i11) {
        if (i9 < 0 || i10 > i11) {
            C2104o.m5280e(i11, AbstractC0921a.m2256s(i9, i10, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i9 <= i10) {
                return;
            }
            C2104o.m5294t(AbstractC3199a.m6837j(i9, "fromIndex: ", " > toIndex: ", i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m8348d(int i9, int i10) {
        int i11 = i9 + (i9 >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        return i11 - 2147483639 > 0 ? i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i11;
    }
}
