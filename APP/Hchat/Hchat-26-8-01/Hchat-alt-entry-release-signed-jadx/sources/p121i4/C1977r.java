package p121i4;

import p376z4.AbstractC6091e;

/* JADX INFO: renamed from: i4.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1977r extends AbstractC6091e {

    /* JADX INFO: renamed from: i */
    public static final C1977r f6705i = new C1977r(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final C1976q m4891o(int i9, int i10) {
        int i11;
        int length = this.f24601h.length;
        for (int i12 = 0; i12 < length; i12++) {
            C1976q c1976q = (C1976q) m10840l(i12);
            if (i10 == c1976q.f6704f && i9 >= (i11 = c1976q.f6699a) && i9 < i11 + c1976q.f6700b) {
                return c1976q;
            }
        }
        return null;
    }
}
