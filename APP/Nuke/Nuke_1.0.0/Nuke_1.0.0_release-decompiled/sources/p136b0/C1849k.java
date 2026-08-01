package p136b0;

import android.os.Trace;
import com.bumptech.glide.AbstractC1924f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p000A.C0073m;
import p095T.C1308D0;
import p095T.InterfaceC1306C0;
import p095T.InterfaceC1363h;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p163g0.C2172d;
import p186k.AbstractC2416M;
import p186k.C2408E;
import p186k.C2409F;

/* JADX INFO: renamed from: b0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1849k {

    /* JADX INFO: renamed from: a */
    public Set f6258a;

    /* JADX INFO: renamed from: b */
    public C2172d f6259b;

    /* JADX INFO: renamed from: c */
    public final C1483e f6260c;

    /* JADX INFO: renamed from: d */
    public C2409F f6261d;

    /* JADX INFO: renamed from: e */
    public C1483e f6262e;

    /* JADX INFO: renamed from: f */
    public final C1483e f6263f;

    /* JADX INFO: renamed from: g */
    public final C1483e f6264g;

    /* JADX INFO: renamed from: h */
    public C2409F f6265h;

    /* JADX INFO: renamed from: i */
    public C2408E f6266i;

    /* JADX INFO: renamed from: j */
    public ArrayList f6267j;

    /* JADX INFO: renamed from: k */
    public C2409F f6268k;

    public C1849k() {
        C1483e c1483e = new C1483e(new C1308D0[16]);
        this.f6260c = c1483e;
        C2409F c2409f = AbstractC2416M.f7817a;
        this.f6261d = new C2409F();
        this.f6262e = c1483e;
        this.f6263f = new C1483e(new Object[16]);
        this.f6264g = new C1483e(new InterfaceC1599a[16]);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m3316f(C1308D0 c1308d0, C1483e c1483e) {
        Object[] objArr = c1483e.f5181d;
        int i5 = c1483e.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            InterfaceC1306C0 interfaceC1306C0 = ((C1308D0) objArr[i6]).f4672a;
            if (interfaceC1306C0 instanceof C1845g) {
                C1483e c1483e2 = ((C1845g) interfaceC1306C0).f6248e;
                if (c1483e2.m2761j(c1308d0) || m3316f(c1308d0, c1483e2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3317a() {
        this.f6258a = null;
        this.f6259b = null;
        C1483e c1483e = this.f6260c;
        c1483e.m2758g();
        this.f6261d.m4280b();
        this.f6262e = c1483e;
        this.f6263f.m2758g();
        this.f6264g.m2758g();
        this.f6265h = null;
        this.f6266i = null;
        this.f6267j = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m3318b() {
        Set set = this.f6258a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC1306C0 interfaceC1306C0 = (InterfaceC1306C0) it.next();
                it.remove();
                interfaceC1306C0.mo2402d();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3319c() {
        Set set = this.f6258a;
        if (set == null) {
            return;
        }
        this.f6268k = null;
        C1483e c1483e = this.f6263f;
        if (c1483e.f5183f != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C2409F c2409f = this.f6265h;
                int i5 = c1483e.f5183f;
                while (true) {
                    i5--;
                    if (-1 >= i5) {
                        break;
                    }
                    Object obj = c1483e.f5181d[i5];
                    try {
                        if (obj instanceof C1308D0) {
                            InterfaceC1306C0 interfaceC1306C0 = ((C1308D0) obj).f4672a;
                            set.remove(interfaceC1306C0);
                            interfaceC1306C0.mo2403e();
                        }
                        if (obj instanceof InterfaceC1363h) {
                            if (c2409f == null || !c2409f.m4281c(obj)) {
                                ((InterfaceC1363h) obj).mo619c();
                            } else {
                                ((InterfaceC1363h) obj).mo618b();
                            }
                        }
                    } catch (Throwable th) {
                        C2172d c2172d = this.f6259b;
                        if (c2172d != null) {
                            AbstractC1924f.m3491A(th, new C0073m(23, c2172d, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        C1483e c1483e2 = this.f6260c;
        if (c1483e2.f5183f != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.f6258a;
                if (set2 != null) {
                    Object[] objArr = c1483e2.f5181d;
                    int i6 = c1483e2.f5183f;
                    for (int i7 = 0; i7 < i6; i7++) {
                        C1308D0 c1308d0 = (C1308D0) objArr[i7];
                        InterfaceC1306C0 interfaceC1306C02 = c1308d0.f4672a;
                        set2.remove(interfaceC1306C02);
                        try {
                            interfaceC1306C02.mo2401a();
                        } catch (Throwable th2) {
                            C2172d c2172d2 = this.f6259b;
                            if (c2172d2 != null) {
                                AbstractC1924f.m3491A(th2, new C0073m(23, c2172d2, c1308d0));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3320d() {
        C1483e c1483e = this.f6264g;
        if (c1483e.f5183f != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = c1483e.f5181d;
                int i5 = c1483e.f5183f;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((InterfaceC1599a) objArr[i6]).mo6a();
                }
                c1483e.m2758g();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3321e(C1308D0 c1308d0) {
        if (!this.f6261d.m4281c(c1308d0)) {
            C2409F c2409f = this.f6268k;
            if (c2409f == null || !c2409f.m4281c(c1308d0)) {
                this.f6263f.m2753b(c1308d0);
                return;
            }
            return;
        }
        this.f6261d.m4290l(c1308d0);
        if (!this.f6262e.m2761j(c1308d0)) {
            C1483e c1483e = this.f6260c;
            if (!c1483e.m2761j(c1308d0)) {
                m3316f(c1308d0, c1483e);
            }
        }
        Set set = this.f6258a;
        if (set == null) {
            return;
        }
        set.add(c1308d0.f4672a);
    }

    /* JADX INFO: renamed from: g */
    public final void m3322g(Set set, C2172d c2172d) {
        m3317a();
        this.f6258a = set;
        this.f6259b = c2172d;
    }
}
