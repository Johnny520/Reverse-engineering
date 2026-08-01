package p007B0;

import com.bumptech.glide.AbstractC1926h;
import p000A.C0038T0;
import p000A.C0066i0;
import p041H0.C0564I;
import p041H0.C0613q;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p095T.C1360f0;
import p154e2.C2029h;
import p186k.C2433o;
import p204n0.C2683b;
import p238t.AbstractC3204b;
import p260x.C3443z;

/* JADX INFO: renamed from: B0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0212z {

    /* JADX INFO: renamed from: a */
    public boolean f740a;

    /* JADX INFO: renamed from: b */
    public Object f741b;

    /* JADX INFO: renamed from: c */
    public Object f742c;

    /* JADX INFO: renamed from: d */
    public Object f743d;

    /* JADX INFO: renamed from: e */
    public Object f744e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public int m322a(C0038T0 c0038t0, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, boolean z5) {
        Object[] objArr;
        int i5;
        int i6;
        C0191e c0191e = (C0191e) this.f742c;
        C0613q c0613q = (C0613q) this.f744e;
        if (this.f740a) {
            return 0;
        }
        try {
            this.f740a = true;
            C2029h c2029hM72l = ((C0066i0) this.f743d).m72l(c0038t0, viewTreeObserverOnGlobalLayoutListenerC0772y);
            C2433o c2433o = (C2433o) c2029hM72l.f6763f;
            int iM4323h = c2433o.m4323h();
            for (int i7 = 0; i7 < iM4323h; i7++) {
                C0209w c0209w = (C0209w) c2433o.m4324i(i7);
                if (!c0209w.f714d && !c0209w.f718h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iM4323h2 = c2433o.m4323h();
            for (int i8 = 0; i8 < iM4323h2; i8++) {
                C0209w c0209w2 = (C0209w) c2433o.m4324i(i8);
                if (objArr != false || AbstractC0208v.m312b(c0209w2)) {
                    ((C0564I) this.f741b).m844z(c0209w2.f713c, (C0613q) this.f744e, c0209w2.f719i, true);
                    if (!c0613q.f1966d.m4250h()) {
                        c0191e.m292a(c0209w2.f711a, c0613q, AbstractC0208v.m312b(c0209w2));
                        c0613q.clear();
                    }
                }
            }
            boolean zM293b = c0191e.m293b(c2029hM72l, z5);
            if (c2029hM72l.f6762e) {
                i5 = 0;
            } else {
                int iM4323h3 = c2433o.m4323h();
                for (int i9 = 0; i9 < iM4323h3; i9++) {
                    C0209w c0209w3 = (C0209w) c2433o.m4324i(i9);
                    if (!C2683b.m4644b(AbstractC0208v.m317g(c0209w3, true), 0L) && c0209w3.m321b()) {
                        i5 = 1;
                        break;
                    }
                }
                i5 = 0;
            }
            int iM4323h4 = c2433o.m4323h();
            int i10 = 0;
            while (true) {
                if (i10 >= iM4323h4) {
                    i6 = 0;
                    break;
                }
                if (((C0209w) c2433o.m4324i(i10)).m321b()) {
                    i6 = 1;
                    break;
                }
                i10++;
            }
            int i11 = (zM293b ? 1 : 0) | (i5 << 1) | (i6 << 2);
            this.f740a = false;
            return i11;
        } catch (Throwable th) {
            this.f740a = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m323b(int i5, int i6) {
        if (i5 < 0.0f) {
            AbstractC3204b.m5475a("Index should be non-negative (" + i5 + ')');
        }
        ((C1360f0) this.f741b).m2510h(i5);
        C3443z c3443z = (C3443z) this.f744e;
        if (i5 != c3443z.f10760e) {
            c3443z.f10760e = i5;
            int i7 = (i5 / 30) * 30;
            c3443z.f10759d.setValue(AbstractC1926h.m3557J(Math.max(i7 - 100, 0), i7 + 130));
        }
        ((C1360f0) this.f742c).m2510h(i6);
    }
}
