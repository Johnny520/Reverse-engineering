package p177m2;

import android.graphics.Typeface;
import androidx.lifecycle.C0100e0;
import p003a2.C0014a;
import p014b.C0126e;
import p015b0.C0136d0;
import p069f.C0956r;
import p077f8.AbstractC1089i;
import p162l3.C2469w;
import p174m.C2571a;
import p237q2.AbstractC3434h;
import p249qg.AbstractC3603v;
import p249qg.C3566g1;
import p259r9.AbstractC3754e0;
import p263rg.C3808e;
import wf.C5562h;

/* JADX INFO: renamed from: m2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2761e implements InterfaceC2760d {

    /* JADX INFO: renamed from: a */
    public final C2469w f8989a;

    /* JADX INFO: renamed from: b */
    public final C2757a f8990b;

    /* JADX INFO: renamed from: c */
    public final C0126e f8991c;

    /* JADX INFO: renamed from: d */
    public final C2764h f8992d;

    /* JADX INFO: renamed from: e */
    public final C2571a f8993e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2761e(C2469w c2469w, C2757a c2757a) {
        C0126e c0126e = AbstractC2762f.f8994a;
        C0126e c0126e2 = AbstractC2762f.f8994a;
        C2764h c2764h = new C2764h();
        C2763g c2763g = C2764h.f8995a;
        C3808e c3808e = AbstractC3434h.f11125a;
        c2763g.getClass();
        AbstractC3603v.m7547a(AbstractC1089i.m2786q0(c2763g, c3808e).mo2059e(C5562h.f22661g).mo2059e(new C3566g1(null)));
        C2571a c2571a = new C2571a(1);
        this.f8989a = c2469w;
        this.f8990b = c2757a;
        this.f8991c = c0126e;
        this.f8992d = c2764h;
        this.f8993e = c2571a;
        new C0136d0(this, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2 A[Catch: Exception -> 0x00aa, TRY_ENTER, TryCatch #0 {Exception -> 0x00aa, blocks: (B:25:0x0044, B:27:0x0057, B:30:0x005c, B:32:0x0060, B:38:0x0079, B:55:0x00a2, B:56:0x00a9, B:34:0x0069, B:35:0x006b, B:36:0x006e, B:37:0x0074), top: B:62:0x0044 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2774r m6152a(C2773q c2773q) {
        Typeface typefaceM5865g;
        C2774r c2774r;
        Object objRemove;
        C0126e c0126e = this.f8991c;
        synchronized (((C2469w) c0126e.f332h)) {
            try {
                C2774r c2774r2 = (C2774r) ((C0956r) c0126e.f333i).m2351a(c2773q);
                if (c2774r2 != null) {
                    if (c2774r2.f9014h) {
                        return c2774r2;
                    }
                    C0956r c0956r = (C0956r) c0126e.f333i;
                    synchronized (((C0014a) c0956r.f3014g)) {
                        C0100e0 c0100e0 = (C0100e0) c0956r.f3013f;
                        c0100e0.getClass();
                        objRemove = c0100e0.f284a.remove(c2773q);
                        if (objRemove != null) {
                            c0956r.f3010c--;
                        }
                    }
                }
                try {
                    this.f8992d.getClass();
                    AbstractC2772p abstractC2772p = c2773q.f9008a;
                    C2469w c2469w = (C2469w) this.f8993e.f8339h;
                    int i9 = c2773q.f9010c;
                    C2767k c2767k = c2773q.f9009b;
                    if (abstractC2772p == null || (abstractC2772p instanceof C2758b)) {
                        switch (c2469w.f8104g) {
                            case 6:
                                typefaceM5865g = C2469w.m5865g(null, c2767k, i9);
                                break;
                            default:
                                typefaceM5865g = C2469w.m5866h(null, c2767k, i9);
                                break;
                        }
                    } else {
                        if (!(abstractC2772p instanceof C2769m)) {
                            c2774r = null;
                            if (c2774r != null) {
                                throw new IllegalStateException("Could not load font");
                            }
                            synchronized (((C2469w) c0126e.f332h)) {
                                if (((C0956r) c0126e.f333i).m2351a(c2773q) == null && c2774r.f9014h) {
                                    ((C0956r) c0126e.f333i).m2352b(c2773q, c2774r);
                                }
                            }
                            return c2774r;
                        }
                        typefaceM5865g = c2469w.m5874i((C2769m) abstractC2772p, c2767k, i9);
                    }
                    c2774r = new C2774r(typefaceM5865g);
                    if (c2774r != null) {
                    }
                } catch (Exception e6) {
                    throw new IllegalStateException("Could not load font", e6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C2774r m6153b(AbstractC2772p abstractC2772p, C2767k c2767k, int i9, int i10) {
        C2757a c2757a = this.f8990b;
        c2757a.getClass();
        int i11 = c2757a.f8988g;
        C2767k c2767k2 = (i11 == 0 || i11 == Integer.MAX_VALUE) ? c2767k : new C2767k(AbstractC3754e0.m7909r(c2767k.f9003g + i11, 1, 1000));
        this.f8989a.getClass();
        return m6152a(new C2773q(abstractC2772p, c2767k2, i9, i10, null));
    }
}
