package p004a3;

import p004a3.C0054r;

/* JADX INFO: renamed from: a3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0034d {
    /* JADX INFO: renamed from: a */
    public static final C0054r m138a(C0054r.a aVar) {
        return aVar.m209g();
    }

    /* JADX INFO: renamed from: b */
    public static final int m139b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    /* JADX INFO: renamed from: c */
    public static final int m140c(C0054r c0054r, int i10) {
        return m139b(c0054r.compareTo(m138a(C0054r.f120r)) >= 0, C0052p.m173f(i10, C0052p.f99b.m177a()));
    }
}
