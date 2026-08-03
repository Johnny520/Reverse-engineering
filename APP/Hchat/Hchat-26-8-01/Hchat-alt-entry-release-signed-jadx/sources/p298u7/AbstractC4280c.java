package p298u7;

import bsh.C0353j;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import okio.C3193a;
import p023b8.C0205c;
import p071f1.C1005h;
import p136j8.C2104o;
import p152k7.AbstractC2331a;
import p166l7.AbstractC2513a;
import p209o7.C3069c;
import p229p7.C3339i;
import p257r7.AbstractC3729s;
import p257r7.C3711a;
import p257r7.C3731u;
import p257r7.InterfaceC3723m;
import p273s7.C3938g;
import p273s7.C3939h;
import p273s7.C3940i;
import p344x7.C5705b;
import p379z7.C6119o;

/* JADX INFO: renamed from: u7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4280c extends AbstractC2513a implements Iterable {

    /* JADX INFO: renamed from: o */
    public final Object f14195o;

    /* JADX INFO: renamed from: p */
    public final C3938g f14196p;

    /* JADX INFO: renamed from: q */
    public final C3939h f14197q;

    /* JADX INFO: renamed from: r */
    public final C1005h f14198r;

    /* JADX INFO: renamed from: s */
    public boolean f14199s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4280c(boolean z9, boolean z10, C3193a c3193a) {
        C3339i c3339i = new C3339i();
        super(c3339i, 6);
        this.f14195o = new Object();
        c3339i.f10749y = null;
        c3339i.m7055T(z9);
        C3069c c3069c = new C3069c(c3339i.f10742r);
        C3069c c3069c2 = new C3069c(c3339i.f10743s);
        C3711a c3711a = new C3711a(0, true);
        C3938g c3938g = new C3938g(c3711a, c3339i, c3069c, c3193a);
        this.f14196p = c3938g;
        C3939h c3939h = new C3939h(c3339i.f10748x, c3069c2, C3731u.f12109q);
        this.f14197q = c3939h;
        AbstractC2331a c3940i = new C3940i(c3339i.f10743s);
        m6539P(c3069c);
        m6539P(c3069c2);
        m6539P(c3938g);
        m6539P(c3711a);
        m6539P(c3939h);
        m6539P(c3940i);
        this.f14199s = z10;
        C1005h c1005h = new C1005h();
        this.f14198r = c1005h;
        C0205c c0205c = new C0205c(11);
        synchronized (c1005h.f3182i) {
            c1005h.f3184k = c0205c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: M */
    public void mo5560M() {
        m8599U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: R */
    public void mo5906R() {
        m8601X();
        m8602a0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m8599U() {
        synchronized (this.f14195o) {
            try {
                if (this.f14199s) {
                    this.f14199s = false;
                    mo8598W();
                    m8602a0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final AbstractC3729s m8600V(int i9) {
        return (AbstractC3729s) this.f14196p.m6524Q(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public void mo8598W() {
        this.f14197q.m8132m0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final void m8601X() {
        C3938g c3938g = this.f14196p;
        int size = c3938g.f9926k.size();
        C3939h c3939h = this.f14197q;
        int size2 = c3939h.f9926k.size();
        if (size >= size2) {
            size = size2;
        }
        for (int i9 = 0; i9 < size; i9++) {
            C3731u c3731u = (C3731u) c3939h.m6524Q(i9);
            AbstractC3729s abstractC3729s = (AbstractC3729s) c3938g.m6524Q(i9);
            if (c3731u == null) {
                abstractC3729s.getClass();
                C0353j.m1305c("Can not link null style item");
                return;
            }
            C3731u c3731u2 = abstractC3729s.f12106q;
            if (c3731u2 != c3731u) {
                if (c3731u2 != null) {
                    C2104o.m5276A("Style item is already linked");
                    return;
                } else {
                    abstractC3729s.f12106q = c3731u;
                    c3731u.m7748S(abstractC3729s);
                }
            }
        }
        c3939h.m8132m0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public void mo8596Z() {
        this.f14197q.m8133n0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final void m8602a0() {
        int size;
        C1005h c1005h = this.f14198r;
        synchronized (c1005h.f3182i) {
            try {
                HashMap map = (HashMap) c1005h.f3183j;
                size = map == null ? 0 : map.size();
            } finally {
            }
        }
        if (size == 0) {
            C1005h c1005h2 = this.f14198r;
            synchronized (c1005h2.f3182i) {
                try {
                    HashMap map2 = (HashMap) c1005h2.f3183j;
                    if (map2 != null) {
                        if (c1005h2.f3181h == 0) {
                            c1005h2.f3181h = map2.size();
                        }
                        c1005h2.f3183j = null;
                        map2.clear();
                    }
                } finally {
                }
            }
            C1005h c1005h3 = this.f14198r;
            int size2 = size();
            synchronized (c1005h3.f3182i) {
                try {
                    c1005h3.f3181h = size2;
                    HashMap map3 = (HashMap) c1005h3.f3183j;
                    if (map3 != null && map3.isEmpty()) {
                        c1005h3.f3183j = null;
                    }
                } finally {
                }
            }
            C1005h c1005h4 = this.f14198r;
            synchronized (c1005h4.f3182i) {
                for (Object obj : this) {
                    try {
                        String strM7744Y = ((AbstractC3729s) obj).m7744Y();
                        if (strM7744Y != null && obj != null) {
                            HashMap map4 = (HashMap) c1005h4.f3183j;
                            if (map4 == null) {
                                int i9 = c1005h4.f3181h;
                                map4 = i9 == 0 ? new HashMap() : new HashMap(i9);
                                c1005h4.f3183j = map4;
                            }
                            Object obj2 = map4.get(strM7744Y);
                            if (obj2 == null) {
                                map4.put(strM7744Y, obj);
                            } else if (obj2.getClass() == C6119o.class) {
                                C6119o c6119o = (C6119o) obj2;
                                if (!c6119o.m10867c(obj)) {
                                    c6119o.add(obj);
                                    c1005h4.m2566E(c6119o);
                                }
                            } else {
                                map4.put(strM7744Y, c1005h4.m2579m(map4.remove(strM7744Y), obj));
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final void m8603b0(InterfaceC3723m interfaceC3723m) {
        AbstractC3729s abstractC3729sM8600V;
        if (interfaceC3723m == null || (abstractC3729sM8600V = m8600V(interfaceC3723m.get())) == null) {
            return;
        }
        abstractC3729sM8600V.m7745a0(interfaceC3723m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14196p.f9926k.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        C5705b c5705b = new C5705b(((C3339i) this.f8138m).f10723o.f12083n);
        try {
            m5549K(c5705b);
            c5705b.close();
        } catch (IOException unused) {
        }
        return c5705b.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.f14196p.f9926k.size();
    }

    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public final void mo5907S() {
    }

    /* JADX INFO: renamed from: Y */
    public void mo8595Y(int i9, AbstractC3729s abstractC3729s) {
    }
}
