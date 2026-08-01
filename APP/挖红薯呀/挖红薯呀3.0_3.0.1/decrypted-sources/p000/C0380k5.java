package p000;

import android.content.Context;

/* JADX INFO: renamed from: k5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0380k5 {

    /* JADX INFO: renamed from: a */
    public final Context f3011a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0968ym f3012b;

    /* JADX INFO: renamed from: c */
    public final long f3013c;

    /* JADX INFO: renamed from: d */
    public final jn0 f3014d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0380k5(Context context, InterfaceC0968ym interfaceC0968ym, long j, jn0 jn0Var) {
        this.f3011a = context;
        this.f3012b = interfaceC0968ym;
        this.f3013c = j;
        this.f3014d = jn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0380k5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C0380k5 c0380k5 = (C0380k5) obj;
        return p30.m3002l(this.f3011a, c0380k5.f3011a) && p30.m3002l(this.f3012b, c0380k5.f3012b) && C0207ff.m1094c(this.f3013c, c0380k5.f3013c) && p30.m3002l(this.f3014d, c0380k5.f3014d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f3012b.hashCode() + (this.f3011a.hashCode() * 31)) * 31;
        int i = C0207ff.f1708h;
        return this.f3014d.hashCode() + AbstractC0748t1.m4146d(this.f3013c, iHashCode, 31);
    }
}
