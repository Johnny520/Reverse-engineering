package p147d1;

import p120Y0.AbstractC1732a;
import p211o0.AbstractC2758q;
import p211o0.C2762u;

/* JADX INFO: renamed from: d1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1953c implements InterfaceC1965o {

    /* JADX INFO: renamed from: a */
    public final long f6622a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1953c(long j5) {
        this.f6622a = j5;
        if (j5 != 16) {
            return;
        }
        AbstractC1732a.m3085a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147d1.InterfaceC1965o
    /* JADX INFO: renamed from: a */
    public final float mo3619a() {
        return C2762u.m4922d(this.f6622a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147d1.InterfaceC1965o
    /* JADX INFO: renamed from: b */
    public final long mo3620b() {
        return this.f6622a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147d1.InterfaceC1965o
    /* JADX INFO: renamed from: c */
    public final AbstractC2758q mo3621c() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1953c) && C2762u.m4921c(this.f6622a, ((C1953c) obj).f6622a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i5 = C2762u.f8763h;
        return Long.hashCode(this.f6622a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ColorStyle(value=" + ((Object) C2762u.m4927i(this.f6622a)) + ')';
    }
}
