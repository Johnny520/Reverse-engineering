package p265s;

import p020b5.C0184c;
import p201o.AbstractC3026b;

/* JADX INFO: renamed from: s.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3835i {

    /* JADX INFO: renamed from: a */
    public final int f12562a;

    /* JADX INFO: renamed from: b */
    public final int f12563b;

    /* JADX INFO: renamed from: c */
    public final C0184c f12564c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3835i(int i9, int i10, C0184c c0184c) {
        this.f12562a = i9;
        this.f12563b = i10;
        this.f12564c = c0184c;
        if (i9 < 0) {
            AbstractC3026b.m6428a("startIndex should be >= 0");
        }
        if (i10 > 0) {
            return;
        }
        AbstractC3026b.m6428a("size should be > 0");
    }
}
