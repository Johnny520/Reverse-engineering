package p158l;

import p266s0.C3874d;

/* JADX INFO: renamed from: l.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2412c {

    /* JADX INFO: renamed from: a */
    public static final C3874d f7886a = new C3874d(-1571120048, new C2410a(), false);

    /* JADX INFO: renamed from: b */
    public static final C3874d f7887b = new C3874d(-1455401925, new C2411b(0), false);

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
    public static final int m5750a(int i9, int i10, int i11, boolean z9) {
        if (i10 >= i11) {
            if (z9) {
                return 0;
            }
            return i11 - i10;
        }
        if (z9) {
            if (z9) {
                if (z9) {
                }
            } else if (z9) {
            }
        } else {
            if (z9 ? i11 - i10 <= i9 : i10 > i9) {
                if (z9) {
                    return i11 - i10;
                }
                return 0;
            }
            if (z9) {
                return i9 - i10;
            }
        }
        return i9;
    }
}
