package p251r;

import p085fg.InterfaceC1220a;
import p276sf.C3958e;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: r.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3620e implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11677g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3641z f11678h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3620e(C3641z c3641z, int i9) {
        this.f11677g = i9;
        this.f11678h = c3641z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        C3632q c3632q;
        switch (this.f11677g) {
            case 0:
                return Integer.valueOf(this.f11678h.m7623j().f11749n);
            default:
                C3641z c3641z = this.f11678h;
                Boolean boolValueOf = Boolean.valueOf(c3641z.f11806j.mo5458a());
                C3631p c3631pM7623j = c3641z.m7623j();
                boolean z9 = true;
                if (c3631pM7623j.f11749n != 0 && (c3632q = (C3632q) AbstractC4166m.m8394C1(c3631pM7623j.f11746k)) != null && (c3632q.f11753a < c3631pM7623j.f11749n - 1 || c3632q.f11767o + c3632q.f11768p > c3631pM7623j.f11748m + 120)) {
                    z9 = false;
                }
                return new C3958e(boolValueOf, Boolean.valueOf(z9));
        }
    }
}
