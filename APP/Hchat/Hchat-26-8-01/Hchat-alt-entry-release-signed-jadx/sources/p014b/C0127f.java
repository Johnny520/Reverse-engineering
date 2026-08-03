package p014b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;
import p002a1.RunnableC0003a;
import p057e1.C0807b;
import p069f.C0952p;
import p100h0.C1545q0;
import p117i0.C1833g1;
import p174m.C2571a;
import p201o.AbstractC3026b;
import p227p4.C3315t;
import p259r9.AbstractC3754e0;
import p265s.C3831g0;
import p267s1.AbstractC3913s;
import p267s1.C3889d;
import p267s1.C3914t;
import p339x1.C5602f0;
import p339x1.C5633p;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import tf.C4164k;

/* JADX INFO: renamed from: b.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0127f {

    /* JADX INFO: renamed from: a */
    public boolean f334a;

    /* JADX INFO: renamed from: b */
    public Object f335b;

    /* JADX INFO: renamed from: c */
    public Object f336c;

    /* JADX INFO: renamed from: d */
    public Object f337d;

    /* JADX INFO: renamed from: e */
    public Object f338e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m649a() {
        Object objPrevious;
        C4164k c4164k = (C4164k) this.f336c;
        ListIterator listIterator = c4164k.listIterator(c4164k.mo6457a());
        if (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            ((C0128g) objPrevious).getClass();
        } else {
            objPrevious = null;
        }
        C0128g c0128g = (C0128g) objPrevious;
        if (c0128g != null) {
            c0128g.f340b.invoke(c0128g);
        } else {
            ((RunnableC0003a) this.f335b).run();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public int m650b(C3315t c3315t, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, boolean z9) {
        Object[] objArr;
        int i9;
        int i10;
        C3889d c3889d = (C3889d) this.f336c;
        C5633p c5633p = (C5633p) this.f338e;
        if (this.f334a) {
            return 0;
        }
        try {
            this.f334a = true;
            C1545q0 c1545q0M6038t = ((C2571a) this.f337d).m6038t(c3315t, viewTreeObserverOnGlobalLayoutListenerC5934t);
            C0952p c0952p = (C0952p) c1545q0M6038t.f5153c;
            int iM2345d = c0952p.m2345d();
            for (int i11 = 0; i11 < iM2345d; i11++) {
                C3914t c3914t = (C3914t) c0952p.m2346e(i11);
                if (!c3914t.f12837d && !c3914t.f12841h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iM2345d2 = c0952p.m2345d();
            for (int i12 = 0; i12 < iM2345d2; i12++) {
                C3914t c3914t2 = (C3914t) c0952p.m2346e(i12);
                if (objArr != false || AbstractC3913s.m8109b(c3914t2)) {
                    ((C5602f0) this.f335b).m10054z(c3914t2.f12836c, (C5633p) this.f338e, c3914t2.f12842i, true);
                    if (!c5633p.f22940g.m2293h()) {
                        c3889d.m8075a(c3914t2.f12834a, c5633p, AbstractC3913s.m8109b(c3914t2));
                        c5633p.clear();
                    }
                }
            }
            boolean zM8076b = c3889d.m8076b(c1545q0M6038t, z9);
            if (c1545q0M6038t.f5152b) {
                i9 = 0;
            } else {
                int iM2345d3 = c0952p.m2345d();
                for (int i13 = 0; i13 < iM2345d3; i13++) {
                    C3914t c3914t3 = (C3914t) c0952p.m2346e(i13);
                    if (!C0807b.m2039b(AbstractC3913s.m8115h(c3914t3, true), 0L) && c3914t3.m8119b()) {
                        i9 = 1;
                        break;
                    }
                }
                i9 = 0;
            }
            int iM2345d4 = c0952p.m2345d();
            int i14 = 0;
            while (true) {
                if (i14 >= iM2345d4) {
                    i10 = 0;
                    break;
                }
                if (((C3914t) c0952p.m2346e(i14)).m8119b()) {
                    i10 = 1;
                    break;
                }
                i14++;
            }
            int i15 = (zM8076b ? 1 : 0) | (i9 << 1) | (i10 << 2);
            this.f334a = false;
            return i15;
        } catch (Throwable th2) {
            this.f334a = false;
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m651c(int i9, int i10) {
        if (i9 < 0.0f) {
            AbstractC3026b.m6428a("Index should be non-negative (" + i9 + ')');
        }
        ((C1833g1) this.f335b).m4493h(i9);
        C3831g0 c3831g0 = (C3831g0) this.f338e;
        if (i9 != c3831g0.f12552h) {
            c3831g0.f12552h = i9;
            int i11 = (i9 / 30) * 30;
            c3831g0.f12551g.setValue(AbstractC3754e0.m7910r0(Math.max(i11 - 100, 0), i11 + 130));
        }
        ((C1833g1) this.f336c).m4493h(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m652d() {
        boolean z9;
        C4164k c4164k = (C4164k) this.f336c;
        if (c4164k == null || !c4164k.isEmpty()) {
            Iterator it = c4164k.iterator();
            if (it.hasNext()) {
                ((C0128g) it.next()).getClass();
                z9 = true;
            } else {
                z9 = false;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = (OnBackInvokedDispatcher) this.f338e;
        OnBackInvokedCallback onBackInvokedCallback = (OnBackInvokedCallback) this.f337d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0124c c0124c = C0124c.f325a;
        if (z9 && !this.f334a) {
            c0124c.m619b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f334a = true;
        } else {
            if (z9 || !this.f334a) {
                return;
            }
            c0124c.m620c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f334a = false;
        }
    }
}
