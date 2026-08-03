package p251r;

import java.util.List;
import java.util.Map;
import p085fg.InterfaceC1231l;
import p174m.EnumC2640p1;
import p249qg.InterfaceC3599t;
import p265s.C3857t;
import p265s.C3865x;
import p293u2.InterfaceC4233c;
import p308v1.InterfaceC4415o0;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: r.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3631p implements InterfaceC4415o0 {

    /* JADX INFO: renamed from: a */
    public final C3632q f11736a;

    /* JADX INFO: renamed from: b */
    public final int f11737b;

    /* JADX INFO: renamed from: c */
    public final boolean f11738c;

    /* JADX INFO: renamed from: d */
    public final float f11739d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4415o0 f11740e;

    /* JADX INFO: renamed from: f */
    public final float f11741f;

    /* JADX INFO: renamed from: g */
    public final boolean f11742g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3599t f11743h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC4233c f11744i;

    /* JADX INFO: renamed from: j */
    public final long f11745j;

    /* JADX INFO: renamed from: k */
    public final Object f11746k;

    /* JADX INFO: renamed from: l */
    public final int f11747l;

    /* JADX INFO: renamed from: m */
    public final int f11748m;

    /* JADX INFO: renamed from: n */
    public final int f11749n;

    /* JADX INFO: renamed from: o */
    public final EnumC2640p1 f11750o;

    /* JADX INFO: renamed from: p */
    public final int f11751p;

    /* JADX INFO: renamed from: q */
    public final int f11752q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3631p(C3632q c3632q, int i9, boolean z9, float f3, InterfaceC4415o0 interfaceC4415o0, float f10, boolean z10, InterfaceC3599t interfaceC3599t, InterfaceC4233c interfaceC4233c, long j3, List list, int i10, int i11, int i12, EnumC2640p1 enumC2640p1, int i13, int i14) {
        this.f11736a = c3632q;
        this.f11737b = i9;
        this.f11738c = z9;
        this.f11739d = f3;
        this.f11740e = interfaceC4415o0;
        this.f11741f = f10;
        this.f11742g = z10;
        this.f11743h = interfaceC3599t;
        this.f11744i = interfaceC4233c;
        this.f11745j = j3;
        this.f11746k = list;
        this.f11747l = i10;
        this.f11748m = i11;
        this.f11749n = i12;
        this.f11750o = enumC2640p1;
        this.f11751p = i13;
        this.f11752q = i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final C3631p m7610a(int i9, boolean z9) {
        C3632q c3632q;
        int i10;
        int i11;
        int i12;
        if (this.f11742g) {
            return null;
        }
        ?? r2 = this.f11746k;
        if (r2.isEmpty() || (c3632q = this.f11736a) == null) {
            return null;
        }
        int i13 = c3632q.f11769q;
        int i14 = this.f11737b - i9;
        if (i14 < 0 || i14 >= i13) {
            return null;
        }
        C3632q c3632q2 = (C3632q) AbstractC4166m.m8422t1(r2);
        C3632q c3632q3 = (C3632q) AbstractC4166m.m8393B1(r2);
        if (c3632q2.f11771s || c3632q3.f11771s) {
            return null;
        }
        int i15 = c3632q2.f11767o;
        int i16 = this.f11748m;
        int i17 = this.f11747l;
        if (i9 < 0) {
            if (Math.min((i15 + c3632q2.f11769q) - i17, (c3632q3.f11767o + c3632q3.f11769q) - i16) <= (-i9)) {
                return null;
            }
        } else if (Math.min(i17 - i15, i16 - c3632q3.f11767o) <= i9) {
            return null;
        }
        int size = r2.size();
        int i18 = 0;
        while (i18 < size) {
            C3632q c3632q4 = (C3632q) r2.get(i18);
            boolean z10 = c3632q4.f11755c;
            int[] iArr = c3632q4.f11775w;
            if (!c3632q4.f11771s) {
                c3632q4.f11767o += i9;
                int length = iArr.length;
                for (int i19 = 0; i19 < length; i19++) {
                    int i20 = i19 & 1;
                    if ((z10 && i20 != 0) || (!z10 && i20 == 0)) {
                        iArr[i19] = iArr[i19] + i9;
                    }
                }
                if (z9) {
                    int size2 = c3632q4.f11754b.size();
                    int i21 = 0;
                    while (i21 < size2) {
                        C3865x c3865x = (C3865x) c3632q4.f11765m.f12684a.m2320g(c3632q4.f11763k);
                        C3857t c3857t = c3865x != null ? c3865x.f12665a[i21] : null;
                        if (c3857t != null) {
                            long j3 = c3857t.f12641j;
                            if (z10) {
                                i10 = size;
                                i11 = (int) (j3 >> 32);
                                i12 = ((int) (j3 & 4294967295L)) + i9;
                            } else {
                                i10 = size;
                                i11 = ((int) (j3 >> 32)) + i9;
                                i12 = (int) (j3 & 4294967295L);
                            }
                            c3857t.f12641j = (((long) i12) & 4294967295L) | (((long) i11) << 32);
                        } else {
                            i10 = size;
                        }
                        i21++;
                        size = i10;
                    }
                }
            }
            i18++;
            size = size;
        }
        return new C3631p(this.f11736a, i14, this.f11738c || i9 > 0, i9, this.f11740e, this.f11741f, this.f11742g, this.f11743h, this.f11744i, this.f11745j, r2, this.f11747l, this.f11748m, this.f11749n, this.f11750o, this.f11751p, this.f11752q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m7611b() {
        InterfaceC4415o0 interfaceC4415o0 = this.f11740e;
        return (((long) interfaceC4415o0.mo7602h()) << 32) | (((long) interfaceC4415o0.mo7601g()) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: e */
    public final Map mo7599e() {
        return this.f11740e.mo7599e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: f */
    public final void mo7600f() {
        this.f11740e.mo7600f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: g */
    public final int mo7601g() {
        return this.f11740e.mo7601g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: h */
    public final int mo7602h() {
        return this.f11740e.mo7602h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: i */
    public final InterfaceC1231l mo7612i() {
        return this.f11740e.mo7612i();
    }
}
