package p117i0;

import p069f.C0925b0;
import p069f.C0943k0;
import p085fg.InterfaceC1235p;
import p159l0.C2420b;

/* JADX INFO: renamed from: i0.r1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1876r1 {

    /* JADX INFO: renamed from: a */
    public C1871q f6238a;

    /* JADX INFO: renamed from: b */
    public int f6239b;

    /* JADX INFO: renamed from: c */
    public C2420b f6240c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1235p f6241d;

    /* JADX INFO: renamed from: e */
    public int f6242e;

    /* JADX INFO: renamed from: f */
    public C0925b0 f6243f;

    /* JADX INFO: renamed from: g */
    public C0943k0 f6244g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1876r1(C1871q c1871q) {
        this.f6238a = c1871q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4645a() {
        if (this.f6238a != null) {
            C2420b c2420b = this.f6240c;
            if (c2420b != null ? c2420b.m5756a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final EnumC1864o0 m4646b(Object obj) {
        EnumC1864o0 enumC1864o0M4606s;
        C1871q c1871q = this.f6238a;
        return (c1871q == null || (enumC1864o0M4606s = c1871q.m4606s(this, obj)) == null) ? EnumC1864o0.f6188g : enumC1864o0M4606s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4647c() {
        C1871q c1871q = this.f6238a;
        if (c1871q != null) {
            c1871q.f6216u = true;
            c1871q.f6221z.m606m();
        }
        this.f6238a = null;
        this.f6243f = null;
        this.f6244g = null;
        this.f6241d = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4648d(boolean z9) {
        int i9 = this.f6239b;
        this.f6239b = z9 ? i9 | 32 : i9 & (-33);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4649e(InterfaceC1235p interfaceC1235p) {
        this.f6241d = interfaceC1235p;
    }
}
