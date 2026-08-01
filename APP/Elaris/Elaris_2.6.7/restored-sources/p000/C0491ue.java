package p000;

import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: renamed from: ue */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0491ue implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0347n9 c0347n9 = (C0347n9) obj;
        C0347n9 c0347n92 = (C0347n9) obj2;
        boolean z = false;
        boolean z2 = c0347n9 != null && c0347n9.m768a();
        boolean z3 = c0347n92 != null && c0347n92.m768a();
        boolean z4 = c0347n9 != null && c0347n9.f599h;
        if (c0347n92 != null && c0347n92.f599h) {
            z = true;
        }
        if (z4 != z) {
            if (z4) {
                return -1;
            }
        } else {
            if (z2 == z3) {
                if (z2 || z3) {
                    long j = c0347n9 == null ? 0L : c0347n9.f598g;
                    long j2 = c0347n92 != null ? c0347n92.f598g : 0L;
                    if (j != j2) {
                        if (j > j2) {
                            return -1;
                        }
                    }
                }
                return (c0347n9 == null ? "" : c0347n9.f594c.toLowerCase(Locale.US)).compareTo(c0347n92 != null ? c0347n92.f594c.toLowerCase(Locale.US) : "");
            }
            if (z2) {
                return -1;
            }
        }
        return 1;
    }
}
