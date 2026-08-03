package p280t2;

import p071f1.AbstractC1027s;
import p071f1.C1034w;
import p204o2.AbstractC3042a;

/* JADX INFO: renamed from: t2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4087c implements InterfaceC4099o {

    /* JADX INFO: renamed from: a */
    public final long f13540a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4087c(long j3) {
        this.f13540a = j3;
        if (j3 != 16) {
            return;
        }
        AbstractC3042a.m6486a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p280t2.InterfaceC4099o
    /* JADX INFO: renamed from: a */
    public final float mo8267a() {
        return C1034w.m2636d(this.f13540a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p280t2.InterfaceC4099o
    /* JADX INFO: renamed from: b */
    public final long mo8268b() {
        return this.f13540a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p280t2.InterfaceC4099o
    /* JADX INFO: renamed from: c */
    public final AbstractC1027s mo8269c() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4087c) && C1034w.m2635c(this.f13540a, ((C4087c) obj).f13540a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f13540a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ColorStyle(value=" + ((Object) C1034w.m2641i(this.f13540a)) + ')';
    }
}
