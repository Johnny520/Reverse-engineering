package p150k5;

import androidx.lifecycle.C0119x;
import java.util.Collections;
import p005a5.C0016a;
import p122i5.AbstractC1988c;
import p207o5.AbstractC3050e;
import p207o5.C3049d;

/* JADX INFO: renamed from: k5.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2264o extends AbstractC1988c {

    /* JADX INFO: renamed from: j */
    public final C2270u f7511j;

    /* JADX INFO: renamed from: k */
    public final int f7512k;

    /* JADX INFO: renamed from: l */
    public final C2263n f7513l;

    /* JADX INFO: renamed from: m */
    public final int f7514m;

    /* JADX INFO: renamed from: n */
    public int f7515n = 0;

    /* JADX INFO: renamed from: o */
    public int f7516o = 0;

    /* JADX INFO: renamed from: p */
    public int f7517p = 0;

    /* JADX INFO: renamed from: q */
    public final int f7518q;

    /* JADX INFO: renamed from: r */
    public final int f7519r;

    /* JADX INFO: renamed from: s */
    public final int f7520s;

    /* JADX INFO: renamed from: t */
    public final int f7521t;

    /* JADX INFO: renamed from: u */
    public AbstractC3050e f7522u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2264o(C2270u c2270u, int i9, int i10) {
        this.f7511j = c2270u;
        this.f7512k = i9;
        int iM583N = c2270u.f7531a.m583N(i9 + 24);
        if (iM583N == 0) {
            this.f7514m = -1;
            this.f7518q = 0;
            this.f7519r = 0;
            this.f7520s = 0;
            this.f7521t = 0;
        } else {
            C0119x c0119x = c2270u.f7532b;
            c0119x.getClass();
            C0016a c0016a = new C0016a(iM583N, 5, c0119x);
            this.f7518q = c0016a.m211o(false);
            this.f7519r = c0016a.m211o(false);
            this.f7520s = c0016a.m211o(false);
            this.f7521t = c0016a.m211o(false);
            this.f7514m = c0016a.f55h;
        }
        if (i10 != 0) {
            this.f7513l = new C2263n(this, i10);
        } else {
            this.f7513l = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e1 */
    public final AbstractC3050e m5514e1() {
        if (this.f7522u == null) {
            C2270u c2270u = this.f7511j;
            int iM583N = c2270u.f7531a.m583N(this.f7512k + 20);
            this.f7522u = iM583N == 0 ? AbstractC3050e.f9873a : new C3049d(c2270u, iM583N);
        }
        return this.f7522u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f1 */
    public final Iterable m5515f1(boolean z9) {
        C2261l c2261l;
        if (this.f7520s <= 0) {
            int i9 = this.f7516o;
            if (i9 > 0) {
                this.f7517p = i9;
            }
            return Collections.EMPTY_SET;
        }
        C0119x c0119x = this.f7511j.f7532b;
        int iM5516g1 = m5516g1();
        c0119x.getClass();
        AbstractC3050e abstractC3050eM5514e1 = m5514e1();
        C2263n c2263n = this.f7513l;
        if (c2263n == null) {
            c2261l = null;
        } else {
            C2264o c2264o = (C2264o) c2263n.f7510l;
            c2261l = new C2261l(c2263n, c2264o.f7511j.f7532b, c2263n.m5507d(), c2264o.f7520s, 2);
        }
        return new C2258i(this, abstractC3050eM5514e1, iM5516g1, c2261l, z9, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    public final int m5516g1() {
        int i9 = this.f7516o;
        if (i9 > 0) {
            return i9;
        }
        C0119x c0119x = this.f7511j.f7532b;
        int iM5517h1 = m5517h1();
        c0119x.getClass();
        C0016a c0016a = new C0016a(iM5517h1, 5, c0119x);
        for (int i10 = 0; i10 < this.f7519r; i10++) {
            c0016a.m213q();
            c0016a.m213q();
        }
        int i11 = c0016a.f55h;
        this.f7516o = i11;
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p312v5.InterfaceC4480c
    public final String getType() {
        C2270u c2270u = this.f7511j;
        return c2270u.f7549s.m5521b(c2270u.f7531a.m583N(this.f7512k));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h1 */
    public final int m5517h1() {
        int i9 = this.f7515n;
        if (i9 > 0) {
            return i9;
        }
        C0119x c0119x = this.f7511j.f7532b;
        c0119x.getClass();
        C0016a c0016a = new C0016a(this.f7514m, 5, c0119x);
        for (int i10 = 0; i10 < this.f7518q; i10++) {
            c0016a.m213q();
            c0016a.m213q();
        }
        int i11 = c0016a.f55h;
        this.f7515n = i11;
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public final Iterable m5518i1(boolean z9) {
        C2262m c2262m;
        if (this.f7521t <= 0) {
            return Collections.EMPTY_SET;
        }
        C0119x c0119x = this.f7511j.f7532b;
        int i9 = this.f7517p;
        if (i9 <= 0) {
            int iM5516g1 = m5516g1();
            c0119x.getClass();
            C0016a c0016a = new C0016a(iM5516g1, 5, c0119x);
            for (int i10 = 0; i10 < this.f7520s; i10++) {
                c0016a.m213q();
                c0016a.m213q();
                c0016a.m213q();
            }
            i9 = c0016a.f55h;
            this.f7517p = i9;
        }
        int i11 = i9;
        c0119x.getClass();
        AbstractC3050e abstractC3050eM5514e1 = m5514e1();
        C2263n c2263n = this.f7513l;
        if (c2263n == null) {
            c2262m = null;
        } else {
            C2264o c2264o = (C2264o) c2263n.f7510l;
            C0119x c0119x2 = c2264o.f7511j.f7532b;
            if (c2263n.f7509k == 0) {
                int iM5507d = c2263n.m5507d();
                c0119x2.getClass();
                C0016a c0016a2 = new C0016a(iM5507d, 5, c0119x2);
                for (int i12 = 0; i12 < c2264o.f7520s; i12++) {
                    c0016a2.m211o(false);
                }
                c2263n.f7509k = c0016a2.f55h;
            }
            c2262m = new C2262m(c0119x2, c2263n.f7509k, c2264o.f7521t);
        }
        return new C2260k(this, abstractC3050eM5514e1, i11, c2262m, z9);
    }
}
