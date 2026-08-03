package th;

import androidx.lifecycle.C0119x;
import p015b0.C0146l;
import p020b5.C0184c;
import p057e1.C0807b;
import p071f1.AbstractC1000e0;
import p071f1.C1032u0;
import p085fg.InterfaceC1231l;
import p101h1.InterfaceC1567d;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p118i1.C1902b;
import p219oh.AbstractC3165h;
import p293u2.InterfaceC4233c;
import p308v1.InterfaceC4428t;
import p320vh.C4576c;

/* JADX INFO: renamed from: th.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4218j implements InterfaceC4209a {

    /* JADX INFO: renamed from: a */
    public final C1902b f13880a;

    /* JADX INFO: renamed from: b */
    public final C0146l f13881b;

    /* JADX INFO: renamed from: c */
    public final C1845j1 f13882c;

    /* JADX INFO: renamed from: d */
    public float f13883d;

    /* JADX INFO: renamed from: e */
    public float f13884e;

    /* JADX INFO: renamed from: f */
    public C4576c f13885f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4218j(C1902b c1902b, C0146l c0146l) {
        c1902b.getClass();
        this.f13880a = c1902b;
        this.f13881b = c0146l;
        this.f13882c = AbstractC1874r.m4639u(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r2 = (p308v1.InterfaceC4428t) r16.f13882c.getValue();
     */
    @Override // th.InterfaceC4209a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo8471a(InterfaceC1567d interfaceC1567d, InterfaceC4233c interfaceC4233c, InterfaceC4428t interfaceC4428t, InterfaceC1231l interfaceC1231l, int i9) {
        InterfaceC4428t interfaceC4428t2;
        long jM2041d;
        interfaceC1567d.getClass();
        interfaceC4233c.getClass();
        if (interfaceC4428t == null || interfaceC4428t2 == null) {
            return;
        }
        try {
            jM2041d = interfaceC4428t2.mo8861W(interfaceC4428t, 0L);
        } catch (Exception unused) {
            jM2041d = C0807b.m2041d(interfaceC4428t.mo8867m(0L), interfaceC4428t2.mo8867m(0L));
        }
        long j3 = jM2041d;
        C4215g c4215g = interfaceC4233c instanceof C4215g ? (C4215g) interfaceC4233c : null;
        long jMo4091a = c4215g != null ? c4215g.f13841i : interfaceC1567d.mo4091a();
        C0184c c0184cMo4081z0 = interfaceC1567d.mo4081z0();
        long jM825v = c0184cMo4081z0.m825v();
        c0184cMo4081z0.m819p().mo2487e();
        try {
            C0119x c0119x = (C0119x) c0184cMo4081z0.f469a;
            if (interfaceC1231l != null) {
                m8490e().m9022e(c0119x, interfaceC4233c, jMo4091a, interfaceC1231l);
            }
            if (i9 > 1) {
                float f3 = i9;
                float f10 = 1.0f / f3;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * f10;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j3)) * f10;
                float fRint = ((int) Math.rint(fIntBitsToFloat * 0.5f)) * 2.0f;
                float fRint2 = ((int) Math.rint(0.5f * fIntBitsToFloat2)) * 2.0f;
                this.f13883d = (fIntBitsToFloat - fRint) * f3;
                this.f13884e = (fIntBitsToFloat2 - fRint2) * f3;
                c0119x.m598c0(-fRint, -fRint2);
                c0119x.m587S(f10, f10, 0L);
            } else {
                this.f13883d = 0.0f;
                this.f13884e = 0.0f;
                c0119x.m598c0(-Float.intBitsToFloat((int) (j3 >> 32)), -Float.intBitsToFloat((int) (4294967295L & j3)));
            }
            AbstractC3165h.m6794u(interfaceC1567d, this.f13880a);
            c0184cMo4081z0.m819p().mo2497p();
            c0184cMo4081z0.m803U(jM825v);
        } catch (Throwable th2) {
            c0184cMo4081z0.m819p().mo2497p();
            c0184cMo4081z0.m803U(jM825v);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // th.InterfaceC4209a
    /* JADX INFO: renamed from: b */
    public final boolean mo8472b() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // th.InterfaceC4209a
    /* JADX INFO: renamed from: c */
    public final float mo8473c() {
        return this.f13883d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // th.InterfaceC4209a
    /* JADX INFO: renamed from: d */
    public final float mo8474d() {
        return this.f13884e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C4576c m8490e() {
        C4576c c4576c = this.f13885f;
        if (c4576c != null) {
            c4576c.f15070g = 9205357640488583168L;
            c4576c.f15071h = 1.0f;
            c4576c.f15072i = 1.0f;
            c4576c.f15073j = 1.0f;
            c4576c.f15074k = 1.0f;
            int i9 = AbstractC1000e0.f3170b;
            c4576c.f15075l = 0.0f;
            long j3 = C1032u0.f3254b;
            return c4576c;
        }
        C4576c c4576c2 = new C4576c();
        c4576c2.f15070g = 9205357640488583168L;
        c4576c2.f15071h = 1.0f;
        c4576c2.f15072i = 1.0f;
        c4576c2.f15073j = 1.0f;
        c4576c2.f15074k = 1.0f;
        int i10 = AbstractC1000e0.f3170b;
        long j4 = C1032u0.f3254b;
        this.f13885f = c4576c2;
        return c4576c2;
    }
}
