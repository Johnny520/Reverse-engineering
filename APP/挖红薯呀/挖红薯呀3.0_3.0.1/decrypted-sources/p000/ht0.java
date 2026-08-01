package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 {

    /* JADX INFO: renamed from: a */
    public C0964yi f2359a;

    /* JADX INFO: renamed from: b */
    public int f2360b;

    /* JADX INFO: renamed from: c */
    public C0788u2 f2361c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0904ww f2362d;

    /* JADX INFO: renamed from: e */
    public int f2363e;

    /* JADX INFO: renamed from: f */
    public ch0 f2364f;

    /* JADX INFO: renamed from: g */
    public jh0 f2365g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ht0(C0964yi c0964yi) {
        this.f2359a = c0964yi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m1503a() {
        if (this.f2359a != null) {
            C0788u2 c0788u2 = this.f2361c;
            if (c0788u2 != null ? c0788u2.m4246a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final y30 m1504b(Object obj) {
        y30 y30VarM5278s;
        C0964yi c0964yi = this.f2359a;
        return (c0964yi == null || (y30VarM5278s = c0964yi.m5278s(this, obj)) == null) ? y30.f7506d : y30VarM5278s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1505c() {
        C0964yi c0964yi = this.f2359a;
        if (c0964yi != null) {
            c0964yi.f7639r = true;
            c0964yi.f7644w.m5068h();
        }
        this.f2359a = null;
        this.f2364f = null;
        this.f2365g = null;
        this.f2362d = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1506d(boolean z) {
        int i = this.f2360b;
        this.f2360b = z ? i | 32 : i & (-33);
    }
}
