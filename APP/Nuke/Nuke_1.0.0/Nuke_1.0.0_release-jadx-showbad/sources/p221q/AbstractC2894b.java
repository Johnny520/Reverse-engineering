package p221q;

import p000A.C0057e;
import p136b0.C1843e;

/* JADX INFO: renamed from: q.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2894b {

    /* JADX INFO: renamed from: a */
    public static final C1843e f9148a = new C1843e(-1571120048, false, new C2893a());

    /* JADX INFO: renamed from: b */
    public static final C1843e f9149b = new C1843e(-1455401925, false, new C0057e(7));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m5090a(int i5, int i6, int i7, boolean z5) {
        if (i6 >= i7) {
            if (z5) {
                return 0;
            }
            return i7 - i6;
        }
        if (z5) {
            if (z5) {
                if (z5) {
                }
            } else if (z5) {
            }
        } else {
            if (z5 ? i7 - i6 <= i5 : i6 > i5) {
                if (z5) {
                    return i7 - i6;
                }
                return 0;
            }
            if (z5) {
                return i5 - i6;
            }
        }
        return i5;
    }
}
