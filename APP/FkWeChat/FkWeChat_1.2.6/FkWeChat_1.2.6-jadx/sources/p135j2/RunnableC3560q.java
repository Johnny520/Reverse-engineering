package p135j2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.AbstractC0570q4;
import androidx.compose.runtime.InterfaceC0498g2;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import p024b9.AbstractC1061t;
import p117i.AbstractC3041b1;
import p117i.AbstractC3075o;
import p117i.C3076o0;
import p117i.C3082r0;
import p119i1.AbstractC3137l;
import p135j2.InterfaceC3538j2;
import p179m2.ViewTreeObserverOnGlobalLayoutListenerC4898r;
import p252r3.C6475f;
import p336x3.AbstractC9428u;
import p336x3.C9377c;
import p336x3.C9408m0;
import p336x3.C9436y;
import p336x3.InterfaceC9392h;

/* JADX INFO: renamed from: j2.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3560q extends C9436y.b implements Runnable, InterfaceC9392h, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: s */
    public final ViewTreeObserverOnGlobalLayoutListenerC4898r f9902s;

    /* JADX INFO: renamed from: t */
    public boolean f9903t;

    /* JADX INFO: renamed from: u */
    public int f9904u;

    /* JADX INFO: renamed from: v */
    public C9408m0 f9905v;

    /* JADX INFO: renamed from: w */
    public final AbstractC3041b1 f9906w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC0498g2 f9907x;

    /* JADX INFO: renamed from: y */
    public final C3076o0 f9908y;

    /* JADX INFO: renamed from: z */
    public final SnapshotStateList f9909z;

    public RunnableC3560q(ViewTreeObserverOnGlobalLayoutListenerC4898r viewTreeObserverOnGlobalLayoutListenerC4898r) {
        super(1);
        this.f9902s = viewTreeObserverOnGlobalLayoutListenerC4898r;
        C3082r0 c3082r0 = new C3082r0(9);
        InterfaceC3538j2.a aVar = InterfaceC3538j2.f9838a;
        c3082r0.m11529x(aVar.m13225a(), new C3550m2("caption bar"));
        c3082r0.m11529x(aVar.m13226b(), new C3550m2("display cutout"));
        c3082r0.m11529x(aVar.m13227c(), new C3550m2("ime"));
        c3082r0.m11529x(aVar.m13228d(), new C3550m2("mandatory system gestures"));
        c3082r0.m11529x(aVar.m13229e(), new C3550m2("navigation bars"));
        c3082r0.m11529x(aVar.m13230f(), new C3550m2("status bars"));
        c3082r0.m11529x(aVar.m13231g(), new C3550m2("system gestures"));
        c3082r0.m11529x(aVar.m13232h(), new C3550m2("tappable element"));
        c3082r0.m11529x(aVar.m13233i(), new C3550m2("waterfall"));
        this.f9906w = c3082r0;
        this.f9907x = AbstractC0570q4.m2141a(0);
        this.f9908y = new C3076o0(4);
        this.f9909z = AbstractC0473c5.m1567f();
    }

    @Override // p336x3.InterfaceC9392h
    /* JADX INFO: renamed from: a */
    public C9408m0 mo13332a(View view, C9408m0 c9408m0) {
        if (this.f9903t) {
            this.f9905v = c9408m0;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c9408m0;
            }
        } else if (this.f9904u == 0) {
            m13343m(c9408m0);
        }
        return c9408m0;
    }

    @Override // p336x3.C9436y.b
    /* JADX INFO: renamed from: c */
    public void mo13333c(C9436y c9436y) {
        this.f9903t = false;
        int iM36715d = c9436y.m36715d();
        this.f9904u &= ~iM36715d;
        this.f9905v = null;
        InterfaceC3538j2 interfaceC3538j2 = (InterfaceC3538j2) AbstractC3546l2.f9867a.m11449b(iM36715d);
        if (interfaceC3538j2 != null) {
            Object objM11238e = this.f9906w.m11238e(interfaceC3538j2);
            objM11238e.getClass();
            C3550m2 c3550m2 = (C3550m2) objM11238e;
            c3550m2.m13314l(0.0f);
            c3550m2.m13310h(1.0f);
            c3550m2.m13313k(0L);
            c3550m2.m13314l(0.0f);
            m13341k(c3550m2);
            InterfaceC0498g2 interfaceC0498g2 = this.f9907x;
            interfaceC0498g2.mo1687j(interfaceC0498g2.mo1686f() + 1);
            AbstractC3137l.f8345e.m11773l();
        }
        super.mo13333c(c9436y);
    }

    @Override // p336x3.C9436y.b
    /* JADX INFO: renamed from: d */
    public void mo13334d(C9436y c9436y) {
        this.f9903t = true;
        super.mo13334d(c9436y);
    }

    @Override // p336x3.C9436y.b
    /* JADX INFO: renamed from: e */
    public C9408m0 mo13335e(C9408m0 c9408m0, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9436y c9436y = (C9436y) list.get(i10);
            InterfaceC3538j2 interfaceC3538j2 = (InterfaceC3538j2) AbstractC3546l2.f9867a.m11449b(c9436y.m36715d());
            if (interfaceC3538j2 != null) {
                Object objM11238e = this.f9906w.m11238e(interfaceC3538j2);
                objM11238e.getClass();
                C3550m2 c3550m2 = (C3550m2) objM11238e;
                if (c3550m2.m13309g()) {
                    m13342l(c3550m2, c9436y);
                }
            }
        }
        m13343m(c9408m0);
        return c9408m0;
    }

    @Override // p336x3.C9436y.b
    /* JADX INFO: renamed from: f */
    public C9436y.a mo13336f(C9436y c9436y, C9436y.a aVar) {
        C9408m0 c9408m0 = this.f9905v;
        this.f9903t = false;
        this.f9905v = null;
        if (c9436y.m36713b() > 0 && c9408m0 != null) {
            int iM36715d = c9436y.m36715d();
            this.f9904u |= iM36715d;
            InterfaceC3538j2 interfaceC3538j2 = (InterfaceC3538j2) AbstractC3546l2.f9867a.m11449b(iM36715d);
            if (interfaceC3538j2 != null) {
                Object objM11238e = this.f9906w.m11238e(interfaceC3538j2);
                objM11238e.getClass();
                C3550m2 c3550m2 = (C3550m2) objM11238e;
                C6475f c6475fM36558f = c9408m0.m36558f(iM36715d);
                long jM13109a = AbstractC3518e2.m13109a(((long) c6475fM36558f.f20350d) | (((long) c6475fM36558f.f20347a) << 48) | (((long) c6475fM36558f.f20348b) << 32) | (((long) c6475fM36558f.f20349c) << 16));
                long jM13303a = c3550m2.m13303a();
                if (!AbstractC3518e2.m13110b(jM13109a, jM13303a)) {
                    c3550m2.m13316n(jM13303a);
                    c3550m2.m13317o(jM13109a);
                    c3550m2.m13311i(true);
                    m13342l(c3550m2, c9436y);
                    InterfaceC0498g2 interfaceC0498g2 = this.f9907x;
                    interfaceC0498g2.mo1687j(interfaceC0498g2.mo1686f() + 1);
                    AbstractC3137l.f8345e.m11773l();
                }
            }
        }
        return super.mo13336f(c9436y, aVar);
    }

    /* JADX INFO: renamed from: g */
    public final SnapshotStateList m13337g() {
        return this.f9909z;
    }

    /* JADX INFO: renamed from: h */
    public final C3076o0 m13338h() {
        return this.f9908y;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0498g2 m13339i() {
        return this.f9907x;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC3041b1 m13340j() {
        return this.f9906w;
    }

    /* JADX INFO: renamed from: k */
    public final void m13341k(C3550m2 c3550m2) {
        c3550m2.m13311i(false);
        c3550m2.m13316n(AbstractC3522f2.m13119a());
        c3550m2.m13317o(AbstractC3522f2.m13119a());
    }

    /* JADX INFO: renamed from: l */
    public final void m13342l(C3550m2 c3550m2, C9436y c9436y) {
        c3550m2.m13314l(c9436y.m36714c());
        c3550m2.m13310h(c9436y.m36712a());
        c3550m2.m13313k(c9436y.m36713b());
    }

    /* JADX INFO: renamed from: m */
    public final void m13343m(C9408m0 c9408m0) {
        char c10;
        char c11;
        boolean z10;
        char c12;
        boolean z11;
        boolean z12;
        long jM13109a;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        long j10;
        int i10;
        char c13;
        Object[] objArr2;
        AbstractC3075o abstractC3075o = AbstractC3546l2.f9867a;
        int[] iArr3 = abstractC3075o.f8156b;
        Object[] objArr3 = abstractC3075o.f8157c;
        long[] jArr3 = abstractC3075o.f8155a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            z11 = false;
            z12 = false;
            char c14 = 16;
            c10 = ' ';
            while (true) {
                long j11 = jArr3[i11];
                c11 = '0';
                z10 = true;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j11 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            c13 = c14;
                            int i16 = iArr3[i15];
                            InterfaceC3538j2 interfaceC3538j2 = (InterfaceC3538j2) objArr3[i15];
                            i10 = i12;
                            C6475f c6475fM36558f = c9408m0.m36558f(i16);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long jM13109a2 = AbstractC3518e2.m13109a((((long) c6475fM36558f.f20347a) << 48) | (((long) c6475fM36558f.f20348b) << 32) | (((long) c6475fM36558f.f20349c) << c13) | ((long) c6475fM36558f.f20350d));
                            Object objM11238e = this.f9906w.m11238e(interfaceC3538j2);
                            objM11238e.getClass();
                            C3550m2 c3550m2 = (C3550m2) objM11238e;
                            j10 = j11;
                            if (!AbstractC3518e2.m13110b(jM13109a2, c3550m2.m13303a())) {
                                c3550m2.m13312j(jM13109a2);
                                z11 = true;
                                if (!AbstractC3518e2.m13110b(jM13109a2, AbstractC3522f2.m13120b())) {
                                    z12 = true;
                                }
                            }
                            if (i16 != C9408m0.n.m36615d()) {
                                C6475f c6475fM36559g = c9408m0.m36559g(i16);
                                objArr2 = objArr3;
                                long jM13109a3 = AbstractC3518e2.m13109a((((long) c6475fM36559g.f20348b) << 32) | (((long) c6475fM36559g.f20347a) << 48) | (((long) c6475fM36559g.f20349c) << c13) | ((long) c6475fM36559g.f20350d));
                                if (!AbstractC3518e2.m13110b(c3550m2.m13304b(), jM13109a3)) {
                                    c3550m2.m13315m(jM13109a3);
                                    z11 = true;
                                    if (!AbstractC3518e2.m13110b(jM13109a3, AbstractC3522f2.m13120b())) {
                                        z12 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            c3550m2.m13318p(c9408m0.m36563l(i16));
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            j10 = j11;
                            i10 = i12;
                            c13 = c14;
                            objArr2 = objArr3;
                        }
                        j11 = j10 >> i10;
                        i14++;
                        objArr3 = objArr2;
                        i12 = i10;
                        c14 = c13;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    int i17 = i12;
                    c12 = c14;
                    objArr = objArr3;
                    if (i13 != i17) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c12 = c14;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                objArr3 = objArr;
                c14 = c12;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c10 = ' ';
            c11 = '0';
            z10 = true;
            c12 = 16;
            z11 = false;
            z12 = false;
        }
        C9377c c9377cM36557e = c9408m0.m36557e();
        if (c9377cM36557e == null) {
            jM13109a = AbstractC3522f2.m13120b();
        } else {
            C6475f c6475fM36502f = c9377cM36557e.m36502f();
            jM13109a = AbstractC3518e2.m13109a((((long) c6475fM36502f.f20347a) << c11) | (((long) c6475fM36502f.f20348b) << c10) | (((long) c6475fM36502f.f20349c) << c12) | ((long) c6475fM36502f.f20350d));
        }
        Object objM11238e2 = this.f9906w.m11238e(InterfaceC3538j2.f9838a.m13233i());
        objM11238e2.getClass();
        C3550m2 c3550m22 = (C3550m2) objM11238e2;
        c3550m22.m13318p(!AbstractC3518e2.m13110b(jM13109a, AbstractC3522f2.m13120b()));
        if (!AbstractC3518e2.m13110b(c3550m22.m13303a(), jM13109a)) {
            c3550m22.m13312j(jM13109a);
            c3550m22.m13315m(jM13109a);
            z11 = z10;
            if (!AbstractC3518e2.m13110b(jM13109a, AbstractC3522f2.m13120b())) {
                z12 = z11;
            }
        }
        if (c9377cM36557e != null) {
            List listM36497a = c9377cM36557e.m36497a();
            if (listM36497a.size() < this.f9908y.m11587e()) {
                this.f9908y.m11455C(listM36497a.size(), this.f9908y.m11587e());
                this.f9909z.m2205r(listM36497a.size(), this.f9909z.size());
                z11 = z10;
            } else {
                int size = listM36497a.size() - this.f9908y.m11587e();
                int i18 = 0;
                while (i18 < size) {
                    C3076o0 c3076o0 = this.f9908y;
                    c3076o0.m11461n(AbstractC0522j5.m1773e(listM36497a.get(c3076o0.m11587e()), null, 2, null));
                    this.f9909z.add(AbstractC3559p1.m13330a("display cutout rect " + this.f9908y.m11587e()));
                    i18++;
                    z11 = z10;
                }
            }
            int size2 = listM36497a.size();
            for (int i19 = 0; i19 < size2; i19++) {
                Rect rect = (Rect) listM36497a.get(i19);
                InterfaceC0512i2 interfaceC0512i2 = (InterfaceC0512i2) this.f9908y.m11586d(i19);
                if (!AbstractC1061t.m3842c(interfaceC0512i2.getValue(), rect)) {
                    interfaceC0512i2.setValue(rect);
                    z11 = z10;
                }
            }
            if (!listM36497a.isEmpty()) {
                z12 = z10;
            }
        } else if (this.f9908y.m11587e() > 0) {
            this.f9908y.m11468u();
            this.f9909z.clear();
            z11 = z10;
        }
        if ((z12 || this.f9907x.mo1686f() != 0) && z11) {
            InterfaceC0498g2 interfaceC0498g2 = this.f9907x;
            interfaceC0498g2.mo1687j(interfaceC0498g2.mo1686f() + 1);
            AbstractC3137l.f8345e.m11773l();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        AbstractC9428u.m36668r(view, this);
        AbstractC9428u.m36669s(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        AbstractC9428u.m36668r(view, null);
        AbstractC9428u.m36669s(view, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f9903t) {
            this.f9904u = 0;
            this.f9903t = false;
            C9408m0 c9408m0 = this.f9905v;
            if (c9408m0 != null) {
                m13343m(c9408m0);
                this.f9905v = null;
            }
        }
    }
}
