package p245qc;

import p136j8.AbstractC2091b;
import p141jf.C2128d;
import p141jf.C2132h;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: qc.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3494d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11356a;

    /* JADX INFO: renamed from: b */
    public final int f11357b;

    /* JADX INFO: renamed from: c */
    public final Object f11358c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3494d(int i9, int i10, Object obj) {
        this.f11356a = i10;
        this.f11358c = obj;
        this.f11357b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2132h m7336a() {
        switch (this.f11356a) {
            case 0:
                return null;
            default:
                return (C2132h) this.f11358c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m7337b() {
        switch (this.f11356a) {
        }
        return this.f11357b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f11356a) {
            case 0:
                return AbstractC4855en.m9264h(AbstractC2091b.m5175v(this.f11357b), ": ", String.valueOf((C2128d) this.f11358c));
            default:
                return AbstractC4855en.m9264h(AbstractC2091b.m5175v(this.f11357b), ": ", String.valueOf((C2132h) this.f11358c));
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m7335c() {
    }
}
