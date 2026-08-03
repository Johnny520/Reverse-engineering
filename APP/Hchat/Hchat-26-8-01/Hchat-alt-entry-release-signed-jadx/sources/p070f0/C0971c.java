package p070f0;

import android.graphics.Rect;
import ci.C0579e;
import ci.C0589j;
import gg.AbstractC1416l;
import java.lang.ref.WeakReference;
import p015b0.C0153s;
import p020b5.C0192k;
import p056e0.AbstractC0805e;
import p057e1.C0808c;
import p065eb.C0884o;
import p117i0.C1815c;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p129ig.AbstractC2043a;
import p190n2.C2875j;
import p190n2.C2884s;
import p190n2.InterfaceC2879n;
import p201o.AbstractC3026b;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p321w.C4642w;
import p339x1.AbstractC5618k;
import p357y1.AbstractC5888h1;
import p357y1.C5892i1;
import p357y1.InterfaceC5885g2;
import sg.EnumC3969a;
import tg.AbstractC4201s;
import tg.C4200r;
import tg.InterfaceC4196n;

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0971c implements InterfaceC2879n {

    /* JADX INFO: renamed from: a */
    public C0984p f3059a;

    /* JADX INFO: renamed from: b */
    public C3560e1 f3060b;

    /* JADX INFO: renamed from: c */
    public C0989u f3061c;

    /* JADX INFO: renamed from: d */
    public C4200r f3062d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: a */
    public final void mo2394a(C2884s c2884s, C2875j c2875j, C0153s c0153s, C4642w c4642w) {
        m2403j(new C0884o(c2884s, this, c2875j, c0153s, c4642w, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: b */
    public final void mo2395b() {
        m2403j(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: c */
    public final void mo2396c() {
        InterfaceC5885g2 interfaceC5885g2;
        C0984p c0984p = this.f3059a;
        if (c0984p == null || (interfaceC5885g2 = (InterfaceC5885g2) AbstractC5618k.m10152h(c0984p, AbstractC5888h1.f23935q)) == null) {
            return;
        }
        ((C5892i1) interfaceC5885g2).m10613b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: d */
    public final void mo2397d() {
        C3560e1 c3560e1 = this.f3060b;
        if (c3560e1 != null) {
            c3560e1.mo7485a(null);
        }
        this.f3060b = null;
        InterfaceC4196n interfaceC4196nM2402i = m2402i();
        if (interfaceC4196nM2402i != null) {
            C4200r c4200r = (C4200r) interfaceC4196nM2402i;
            synchronized (c4200r) {
                c4200r.m8461t(c4200r.m8455n() + ((long) c4200r.f13786q), c4200r.f13785p, c4200r.m8455n() + ((long) c4200r.f13786q), c4200r.m8455n() + ((long) c4200r.f13786q) + ((long) c4200r.f13787r));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: e */
    public final void mo2398e(C2884s c2884s, C2884s c2884s2) {
        C0989u c0989u = this.f3061c;
        if (c0989u != null) {
            boolean z9 = (C1939m0.m4812b(c0989u.f3130h.f9317b, c2884s2.f9317b) && AbstractC1416l.m3825a(c0989u.f3130h.f9318c, c2884s2.f9318c)) ? false : true;
            c0989u.f3130h = c2884s2;
            int size = c0989u.f3132j.size();
            for (int i9 = 0; i9 < size; i9++) {
                InputConnectionC0990v inputConnectionC0990v = (InputConnectionC0990v) ((WeakReference) c0989u.f3132j.get(i9)).get();
                if (inputConnectionC0990v != null) {
                    inputConnectionC0990v.f3142g = c2884s2;
                }
            }
            C0986r c0986r = c0989u.f3135m;
            synchronized (c0986r.f3106c) {
                c0986r.f3113j = null;
                c0986r.f3115l = null;
                c0986r.f3114k = null;
                c0986r.f3116m = null;
                c0986r.f3117n = null;
            }
            if (AbstractC1416l.m3825a(c2884s, c2884s2)) {
                if (z9) {
                    C0982n c0982n = c0989u.f3124b;
                    int iM4816f = C1939m0.m4816f(c2884s2.f9317b);
                    int iM4815e = C1939m0.m4815e(c2884s2.f9317b);
                    C1939m0 c1939m0 = c0989u.f3130h.f9318c;
                    int iM4816f2 = c1939m0 != null ? C1939m0.m4816f(c1939m0.f6575a) : -1;
                    C1939m0 c1939m02 = c0989u.f3130h.f9318c;
                    c0982n.m2429a().updateSelection(c0982n.f3096b, iM4816f, iM4815e, iM4816f2, c1939m02 != null ? C1939m0.m4815e(c1939m02.f6575a) : -1);
                    return;
                }
                return;
            }
            if (c2884s != null && (!AbstractC1416l.m3825a(c2884s.f9316a.f6529h, c2884s2.f9316a.f6529h) || (C1939m0.m4812b(c2884s.f9317b, c2884s2.f9317b) && !AbstractC1416l.m3825a(c2884s.f9318c, c2884s2.f9318c)))) {
                C0982n c0982n2 = c0989u.f3124b;
                c0982n2.m2429a().restartInput(c0982n2.f3096b);
                return;
            }
            int size2 = c0989u.f3132j.size();
            for (int i10 = 0; i10 < size2; i10++) {
                InputConnectionC0990v inputConnectionC0990v2 = (InputConnectionC0990v) ((WeakReference) c0989u.f3132j.get(i10)).get();
                if (inputConnectionC0990v2 != null) {
                    C2884s c2884s3 = c0989u.f3130h;
                    C0982n c0982n3 = c0989u.f3124b;
                    if (inputConnectionC0990v2.f3146k) {
                        inputConnectionC0990v2.f3142g = c2884s3;
                        if (inputConnectionC0990v2.f3144i) {
                            c0982n3.m2429a().updateExtractedText(c0982n3.f3096b, inputConnectionC0990v2.f3143h, AbstractC0985q.m2434d(c2884s3));
                        }
                        C1939m0 c1939m03 = c2884s3.f9318c;
                        long j3 = c2884s3.f9317b;
                        int iM4816f3 = c1939m03 != null ? C1939m0.m4816f(c1939m03.f6575a) : -1;
                        C1939m0 c1939m04 = c2884s3.f9318c;
                        c0982n3.m2429a().updateSelection(c0982n3.f3096b, C1939m0.m4816f(j3), C1939m0.m4815e(j3), iM4816f3, c1939m04 != null ? C1939m0.m4815e(c1939m04.f6575a) : -1);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: f */
    public final void mo2399f() {
        InterfaceC5885g2 interfaceC5885g2;
        C0984p c0984p = this.f3059a;
        if (c0984p == null || (interfaceC5885g2 = (InterfaceC5885g2) AbstractC5618k.m10152h(c0984p, AbstractC5888h1.f23935q)) == null) {
            return;
        }
        ((C5892i1) interfaceC5885g2).m10612a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: g */
    public final void mo2400g(C2884s c2884s, C0192k c0192k, C1935k0 c1935k0, C1815c c1815c, C0808c c0808c, C0808c c0808c2) {
        C0989u c0989u = this.f3061c;
        if (c0989u != null) {
            C0986r c0986r = c0989u.f3135m;
            synchronized (c0986r.f3106c) {
                try {
                    c0986r.f3113j = c2884s;
                    c0986r.f3115l = c0192k;
                    c0986r.f3114k = c1935k0;
                    c0986r.f3116m = c0808c;
                    c0986r.f3117n = c0808c2;
                    if (c0986r.f3108e || c0986r.f3107d) {
                        c0986r.m2445a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: h */
    public final void mo2401h(C0808c c0808c) {
        Rect rect;
        C0989u c0989u = this.f3061c;
        if (c0989u != null) {
            c0989u.f3134l = new Rect(AbstractC2043a.m5018X(c0808c.f2416a), AbstractC2043a.m5018X(c0808c.f2417b), AbstractC2043a.m5018X(c0808c.f2418c), AbstractC2043a.m5018X(c0808c.f2419d));
            if (!c0989u.f3132j.isEmpty() || (rect = c0989u.f3134l) == null) {
                return;
            }
            c0989u.f3123a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final InterfaceC4196n m2402i() {
        C4200r c4200r = this.f3062d;
        if (c4200r != null) {
            return c4200r;
        }
        if (!AbstractC0805e.f2409a) {
            return null;
        }
        C4200r c4200rM8463a = AbstractC4201s.m8463a(2, EnumC3969a.f12981i);
        this.f3062d = c4200rM8463a;
        return c4200rM8463a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m2403j(C0884o c0884o) {
        C0984p c0984p = this.f3059a;
        if (c0984p == null) {
            return;
        }
        this.f3060b = c0984p.f23801t ? AbstractC3603v.m7563q(c0984p.m10550Y0(), null, new C0589j(c0984p, new C0579e(c0884o, this, c0984p, c3560e1, 2), c3560e1, 4), 1) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m2404k(C0984p c0984p) {
        if (!(this.f3059a == c0984p)) {
            AbstractC3026b.m6430c("Expected textInputModifierNode to be " + c0984p + " but was " + this.f3059a);
        }
        this.f3059a = null;
    }
}
