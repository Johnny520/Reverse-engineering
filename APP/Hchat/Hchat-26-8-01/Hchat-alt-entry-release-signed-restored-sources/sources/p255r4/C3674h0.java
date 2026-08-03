package p255r4;

import bsh.C0353j;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import p089g1.C1275d;
import p136j8.C2104o;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4475x;
import p326w4.C4681a;
import p326w4.C4683c;

/* JADX INFO: renamed from: r4.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3674h0 extends AbstractC3700u0 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f11931f;

    /* JADX INFO: renamed from: g */
    public final Object f11932g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3674h0(C3689p c3689p, int i9) {
        super("method_handles", c3689p, 8);
        this.f11931f = i9;
        switch (i9) {
            case 1:
                super("proto_ids", c3689p, 4);
                this.f11932g = new TreeMap();
                break;
            case 2:
                super("string_ids", c3689p, 4);
                this.f11932g = new TreeMap();
                break;
            case 3:
                super("type_ids", c3689p, 4);
                this.f11932g = new TreeMap();
                break;
            case 4:
                super(null, c3689p, 4);
                C3704x c3704x = new C3704x();
                c3704x.m7711g(0);
                this.f11932g = Collections.singletonList(c3704x);
                break;
            default:
                this.f11932g = new TreeMap();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: c */
    public final Collection mo7652c() {
        switch (this.f11931f) {
            case 0:
                return ((TreeMap) this.f11932g).values();
            case 1:
                return ((TreeMap) this.f11932g).values();
            case 2:
                return ((TreeMap) this.f11932g).values();
            case 3:
                return ((TreeMap) this.f11932g).values();
            default:
                return (List) this.f11932g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3700u0
    /* JADX INFO: renamed from: k */
    public final void mo7651k() {
        switch (this.f11931f) {
            case 0:
                Iterator it = ((TreeMap) this.f11932g).values().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    ((C3672g0) it.next()).m7711g(i9);
                    i9++;
                }
                break;
            case 1:
                Iterator it2 = ((TreeMap) this.f11932g).values().iterator();
                int i10 = 0;
                while (it2.hasNext()) {
                    ((C3686n0) it2.next()).m7711g(i10);
                    i10++;
                }
                break;
            case 2:
                Iterator it3 = ((TreeMap) this.f11932g).values().iterator();
                int i11 = 0;
                while (it3.hasNext()) {
                    ((C3694r0) it3.next()).m7711g(i11);
                    i11++;
                }
                break;
            case 3:
                Iterator it4 = ((TreeMap) this.f11932g).values().iterator();
                int i12 = 0;
                while (it4.hasNext()) {
                    ((C3696s0) it4.next()).m7711g(i12);
                    i12++;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public int m7656l(C4451c0 c4451c0) {
        if (c4451c0 == null) {
            C0353j.m1305c("string == null");
            return 0;
        }
        m7698f();
        C3694r0 c3694r0 = (C3694r0) ((TreeMap) this.f11932g).get(c4451c0);
        if (c3694r0 != null) {
            return c3694r0.m7709e();
        }
        C2104o.m5294t("not found");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public int m7657m(C4453d0 c4453d0) {
        if (c4453d0 != null) {
            return m7659o(c4453d0.f14784g);
        }
        C0353j.m1305c("type == null");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public int m7658n(C4681a c4681a) {
        if (c4681a == null) {
            C0353j.m1305c("prototype == null");
            return 0;
        }
        m7698f();
        C3686n0 c3686n0 = (C3686n0) ((TreeMap) this.f11932g).get(c4681a);
        if (c3686n0 != null) {
            return c3686n0.m7709e();
        }
        C2104o.m5294t("not found");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public int m7659o(C4683c c4683c) {
        if (c4683c == null) {
            C0353j.m1305c("type == null");
            return 0;
        }
        m7698f();
        C3696s0 c3696s0 = (C3696s0) ((TreeMap) this.f11932g).get(c4683c);
        if (c3696s0 != null) {
            return c3696s0.m7709e();
        }
        C1275d.m3412f(c4683c, "not found: ");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public synchronized C3696s0 m7660p(C4453d0 c4453d0) {
        C3696s0 c3696s0;
        if (c4453d0 == null) {
            throw new NullPointerException("type == null");
        }
        m7699g();
        C4683c c4683c = c4453d0.f14784g;
        c3696s0 = (C3696s0) ((TreeMap) this.f11932g).get(c4683c);
        if (c3696s0 == null) {
            c3696s0 = new C3696s0(c4453d0);
            ((TreeMap) this.f11932g).put(c4683c, c3696s0);
        }
        return c3696s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public synchronized void m7661q(C4475x c4475x) {
        if (c4475x == null) {
            throw new NullPointerException("methodHandle == null");
        }
        m7699g();
        if (((C3672g0) ((TreeMap) this.f11932g).get(c4475x)) == null) {
            ((TreeMap) this.f11932g).put(c4475x, new C3672g0(c4475x));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void m7662r(C4451c0 c4451c0) {
        C3694r0 c3694r0 = new C3694r0(c4451c0);
        synchronized (this) {
            m7699g();
            if (((C3694r0) ((TreeMap) this.f11932g).get(c4451c0)) != null) {
                return;
            }
            ((TreeMap) this.f11932g).put(c4451c0, c3694r0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public synchronized void m7663s(C4681a c4681a) {
        if (c4681a == null) {
            throw new NullPointerException("prototype == null");
        }
        m7699g();
        if (((C3686n0) ((TreeMap) this.f11932g).get(c4681a)) == null) {
            ((TreeMap) this.f11932g).put(c4681a, new C3686n0(c4681a));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public synchronized void m7664t(C4683c c4683c) {
        if (c4683c == null) {
            throw new NullPointerException("type == null");
        }
        m7699g();
        if (((C3696s0) ((TreeMap) this.f11932g).get(c4683c)) == null) {
            ((TreeMap) this.f11932g).put(c4683c, new C3696s0(new C4453d0(c4683c)));
        }
    }

    /* JADX INFO: renamed from: u */
    private final void m7655u() {
    }
}
