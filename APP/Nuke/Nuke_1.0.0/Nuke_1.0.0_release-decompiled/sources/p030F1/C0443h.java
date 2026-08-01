package p030F1;

import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p061L2.AbstractC0978r;
import p061L2.C0971k;
import p061L2.C0981u;
import p065M2.C0999b;
import p117X2.AbstractC1665j;
import p178i3.AbstractC2339t;
import p178i3.C2318C;
import p178i3.C2335p;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: F1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0443h {

    /* JADX INFO: renamed from: a */
    public final C2318C f1325a = AbstractC2339t.m4166b(C0444i.f1339b);

    /* JADX INFO: renamed from: b */
    public final C2318C f1326b;

    /* JADX INFO: renamed from: c */
    public final C2335p f1327c;

    /* JADX INFO: renamed from: d */
    public final C0971k f1328d;

    /* JADX INFO: renamed from: e */
    public final C0971k f1329e;

    /* JADX INFO: renamed from: f */
    public AbstractC0440e f1330f;

    /* JADX INFO: renamed from: g */
    public int f1331g;

    /* JADX INFO: renamed from: h */
    public AbstractC0442g f1332h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f1333i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f1334j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet f1335k;

    /* JADX INFO: renamed from: l */
    public boolean f1336l;

    /* JADX INFO: renamed from: m */
    public boolean f1337m;

    /* JADX INFO: renamed from: n */
    public boolean f1338n;

    public C0443h() {
        C2318C c2318cM4166b = AbstractC2339t.m4166b(new C0441f());
        this.f1326b = c2318cM4166b;
        this.f1327c = new C2335p(c2318cM4166b);
        this.f1328d = new C0971k();
        this.f1329e = new C0971k();
        this.f1333i = new LinkedHashSet();
        this.f1334j = new LinkedHashSet();
        this.f1335k = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public final void m711a(C0438c c0438c, AbstractC0442g abstractC0442g, int i5) {
        AbstractC1665j.m2985e(c0438c, "dispatcher");
        if (abstractC0442g.f1323a == null) {
            (i5 != 0 ? i5 != 1 ? this.f1333i : this.f1334j : this.f1335k).add(abstractC0442g);
            abstractC0442g.f1323a = c0438c;
            AbstractC1665j.m2985e((C0441f) this.f1327c.f7605d.getValue(), "history");
            abstractC0442g.mo710b(i5 != 0 ? i5 != 1 ? this.f1338n : this.f1336l : this.f1337m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + abstractC0442g + "' is already added to dispatcher " + abstractC0442g.f1323a + '.').toString());
    }

    /* JADX INFO: renamed from: b */
    public final void m712b() {
        boolean z5;
        boolean z6;
        C0441f c0441f;
        C0971k c0971k = this.f1328d;
        if (c0971k == null || !c0971k.isEmpty()) {
            Iterator it = c0971k.iterator();
            while (it.hasNext()) {
                if (((AbstractC0440e) it.next()).f1319b) {
                    z5 = true;
                    break;
                }
            }
            z5 = false;
        } else {
            z5 = false;
        }
        C0971k c0971k2 = this.f1329e;
        if (c0971k2 == null || !c0971k2.isEmpty()) {
            Iterator it2 = c0971k2.iterator();
            while (it2.hasNext()) {
                if (((AbstractC0440e) it2.next()).f1319b) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
        } else {
            z6 = false;
        }
        boolean z7 = z5 || z6;
        boolean z8 = this.f1337m != z5;
        boolean z9 = this.f1336l != z6;
        boolean z10 = this.f1338n != z7;
        LinkedHashSet linkedHashSet = this.f1335k;
        if (z8) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((AbstractC0442g) it3.next()).mo710b(z5);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f1334j;
        if (z9) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((AbstractC0442g) it4.next()).mo710b(z6);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f1333i;
        if (z10) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((AbstractC0442g) it5.next()).mo710b(z7);
            }
        }
        this.f1337m = z5;
        this.f1336l = z6;
        this.f1338n = z7;
        AbstractC0440e abstractC0440eM713c = this.f1330f;
        if (abstractC0440eM713c == null) {
            abstractC0440eM713c = m713c(0);
        }
        AbstractC0440e abstractC0440eM713c2 = this.f1330f;
        if (abstractC0440eM713c2 == null) {
            abstractC0440eM713c2 = m713c(0);
        }
        if (AbstractC1665j.m2981a(abstractC0440eM713c2, abstractC0440eM713c)) {
            if (abstractC0440eM713c2 == null) {
                c0441f = new C0441f();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = c0971k.iterator();
                while (it6.hasNext()) {
                    boolean z11 = ((AbstractC0440e) it6.next()).f1319b;
                }
                Iterator<E> it7 = c0971k2.iterator();
                while (it7.hasNext()) {
                    boolean z12 = ((AbstractC0440e) it7.next()).f1319b;
                }
                AbstractC1926h abstractC1926h = abstractC0440eM713c2.f1318a;
                C0999b c0999bM4202o = AbstractC2352g.m4202o();
                AbstractC0978r.m2032N(arrayList, c0999bM4202o);
                c0999bM4202o.add(abstractC1926h);
                AbstractC0978r.m2032N(C0981u.f3047d, c0999bM4202o);
                c0441f = new C0441f(arrayList.size(), AbstractC2352g.m4200m(c0999bM4202o));
            }
            C2318C c2318c = this.f1326b;
            if (AbstractC1665j.m2981a((C0441f) c2318c.getValue(), c0441f)) {
                return;
            }
            c2318c.m4147g(null, c0441f);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((AbstractC0442g) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((AbstractC0442g) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((AbstractC0442g) it10.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0440e m713c(int i5) {
        Object next;
        Object next2;
        C0971k c0971k = this.f1329e;
        C0971k c0971k2 = this.f1328d;
        Object obj = null;
        if (i5 == -1) {
            Iterator it = c0971k2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AbstractC0440e) next).f1319b) {
                    break;
                }
            }
            AbstractC0440e abstractC0440e = (AbstractC0440e) next;
            if (abstractC0440e != null) {
                return abstractC0440e;
            }
            Iterator it2 = c0971k.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((AbstractC0440e) next3).f1319b) {
                    obj = next3;
                    break;
                }
            }
            return (AbstractC0440e) obj;
        }
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i5 + "'.").toString());
            }
            Iterator it3 = c0971k2.iterator();
            while (it3.hasNext()) {
                ((AbstractC0440e) it3.next()).getClass();
            }
            Iterator it4 = c0971k.iterator();
            while (it4.hasNext()) {
                ((AbstractC0440e) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = c0971k2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((AbstractC0440e) next2).f1319b) {
                break;
            }
        }
        AbstractC0440e abstractC0440e2 = (AbstractC0440e) next2;
        if (abstractC0440e2 != null) {
            return abstractC0440e2;
        }
        Iterator it6 = c0971k.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((AbstractC0440e) next4).f1319b) {
                obj = next4;
                break;
            }
        }
        return (AbstractC0440e) obj;
    }
}
