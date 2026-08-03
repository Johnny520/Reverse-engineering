package p273s7;

import java.util.HashMap;
import okio.C3193a;
import p063e9.C0830a;
import p071f1.C1005h;
import p075f6.C1075b;
import p152k7.AbstractC2331a;
import p209o7.C3069c;
import p229p7.C3339i;
import p241q7.C3445b;
import p243q9.C3465a;
import p257r7.AbstractC3729s;
import p257r7.C3711a;
import p257r7.C3731u;
import p298u7.AbstractC4280c;
import p379z7.C6119o;

/* JADX INFO: renamed from: s7.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3938g extends AbstractC3935d {

    /* JADX INFO: renamed from: o */
    public final C3711a f12916o;

    /* JADX INFO: renamed from: p */
    public int f12917p;

    /* JADX INFO: renamed from: q */
    public boolean f12918q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3938g(C3711a c3711a, C3339i c3339i, C3069c c3069c, C3193a c3193a) {
        super(c3339i.f10747w, c3069c);
        this.f12916o = c3711a;
        c3339i.f10749y = new C3465a(this, 4);
        m6532b0(new C0830a(c3193a, 6, c3339i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: L */
    public final void mo6518L(int i9, AbstractC2331a abstractC2331a) {
        AbstractC3729s abstractC3729s = (AbstractC3729s) abstractC2331a;
        ((AbstractC4280c) m5554v(AbstractC4280c.class)).mo8595Y(i9, abstractC3729s);
        super.mo6518L(i9, abstractC3729s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p273s7.AbstractC3935d, p209o7.C3068b
    /* JADX INFO: renamed from: V */
    public final void mo5143V() {
        mo8123l0().mo5557c0(this.f9926k.size());
        if (this.f12918q) {
            m8131m0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: W */
    public final void mo1894W(AbstractC2331a abstractC2331a) {
        AbstractC3729s abstractC3729s = (AbstractC3729s) abstractC2331a;
        AbstractC4280c abstractC4280c = (AbstractC4280c) m5554v(AbstractC4280c.class);
        if (!abstractC4280c.f14199s) {
            C1005h c1005h = abstractC4280c.f14198r;
            String strM7744Y = abstractC3729s.m7744Y();
            synchronized (c1005h.f3182i) {
                try {
                    if (strM7744Y != null) {
                        HashMap map = (HashMap) c1005h.f3183j;
                        if (map != null) {
                            Object obj = map.get(strM7744Y);
                            if (obj != null) {
                                if (obj.getClass() == C6119o.class) {
                                    C6119o c6119o = (C6119o) obj;
                                    int iM10868f = c6119o.m10868f(abstractC3729s, true, 0);
                                    if (iM10868f >= 0) {
                                        c6119o.remove(iM10868f);
                                        if (c6119o.isEmpty()) {
                                            map.remove(strM7744Y);
                                        } else if (c6119o.f24644i == 1) {
                                            Object obj2 = c6119o.f24642g[0];
                                            map.remove(strM7744Y);
                                            map.put(strM7744Y, obj2);
                                        }
                                    }
                                } else if (obj == abstractC3729s) {
                                    map.remove(strM7744Y);
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
        C3731u c3731u = abstractC3729s.f12106q;
        if (c3731u != null) {
            c3731u.m7747R();
        }
        abstractC3729s.m5548J(null);
        this.f12917p = 0;
        this.f12918q = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p273s7.AbstractC3935d, p209o7.C3068b
    /* JADX INFO: renamed from: Y */
    public final void mo6529Y(C3445b c3445b) {
        super.mo6529Y(c3445b);
        this.f12917p = 0;
        this.f12918q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p273s7.AbstractC3935d
    /* JADX INFO: renamed from: j0 */
    public final int mo8128j0() {
        int iMo8128j0 = super.mo8128j0();
        this.f12917p = iMo8128j0 - this.f12916o.mo5551p();
        return iMo8128j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p273s7.AbstractC3935d
    /* JADX INFO: renamed from: k0 */
    public final C3711a mo8129k0() {
        return this.f12916o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final void m8131m0() {
        this.f12918q = false;
        super.m6533e0();
        AbstractC4280c abstractC4280c = (AbstractC4280c) m5554v(AbstractC4280c.class);
        if (abstractC4280c != null) {
            abstractC4280c.mo8596Z();
        }
        this.f12918q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public final int mo5551p() {
        int i9 = this.f12917p;
        if (i9 != 0 || this.f9926k.size() == 0) {
            return i9;
        }
        int iMo5551p = super.mo5551p();
        this.f12917p = iMo5551p;
        return iMo5551p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: z */
    public final void mo5556z(C1075b c1075b) {
        if (c1075b.f3459b) {
            return;
        }
        AbstractC2331a abstractC2331a = (AbstractC2331a) c1075b.f3461d;
        if (abstractC2331a == this) {
            c1075b.f3459b = true;
            return;
        }
        if (abstractC2331a instanceof AbstractC3729s) {
            super.mo5556z(c1075b);
            return;
        }
        int iMo5551p = mo5551p();
        if (c1075b.f3459b || iMo5551p == 0) {
            return;
        }
        c1075b.f3460c += iMo5551p;
    }
}
