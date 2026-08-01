package p272z;

import p153e1.C2010f;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: z.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3504b implements InterfaceC3503a {

    /* JADX INFO: renamed from: a */
    public final float f10912a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3504b(float f2) {
        this.f10912a = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p272z.InterfaceC3503a
    /* JADX INFO: renamed from: a */
    public final float mo5759a(long j5, InterfaceC2007c interfaceC2007c) {
        return interfaceC2007c.mo268G(this.f10912a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3504b) && C2010f.m3696b(this.f10912a, ((C3504b) obj).f10912a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10912a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CornerSize(size = " + this.f10912a + ".dp)";
    }
}
