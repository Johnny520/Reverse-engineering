package p308v1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import gg.AbstractC1416l;
import java.util.Collections;
import java.util.List;
import p014b.C0126e;
import p018b3.C0171a;
import p030c3.AbstractC0390a;
import p069f.C0933f0;
import p069f.C0943k0;
import p069f.C0945l0;
import p069f.C0965w;
import p091g3.AbstractC1298a0;
import p091g3.AbstractC1321m;
import p091g3.AbstractC1329q;
import p091g3.AbstractC1333s;
import p091g3.C1300b0;
import p091g3.C1303d;
import p091g3.C1332r0;
import p091g3.InterfaceC1305e;
import p117i0.AbstractC1874r;
import p117i0.C1833g1;
import p117i0.InterfaceC1809a1;
import p322w0.AbstractC4662m;
import p322w0.C4665p;

/* JADX INFO: renamed from: v1.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4411n extends AbstractC1333s implements Runnable, InterfaceC1305e, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j */
    public boolean f14684j;

    /* JADX INFO: renamed from: k */
    public int f14685k;

    /* JADX INFO: renamed from: l */
    public C1332r0 f14686l;

    /* JADX INFO: renamed from: m */
    public final C0943k0 f14687m;

    /* JADX INFO: renamed from: n */
    public final C1833g1 f14688n;

    /* JADX INFO: renamed from: o */
    public final C0933f0 f14689o;

    /* JADX INFO: renamed from: p */
    public final C4665p f14690p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC4411n() {
        super(1);
        C0943k0 c0943k0 = new C0943k0(9);
        InterfaceC4416o1.f14701a.getClass();
        c0943k0.m2326m(C4413n1.f14692b, new C4425r1("caption bar"));
        c0943k0.m2326m(C4413n1.f14693c, new C4425r1("display cutout"));
        c0943k0.m2326m(C4413n1.f14694d, new C4425r1("ime"));
        c0943k0.m2326m(C4413n1.f14695e, new C4425r1("mandatory system gestures"));
        c0943k0.m2326m(C4413n1.f14696f, new C4425r1("navigation bars"));
        c0943k0.m2326m(C4413n1.f14697g, new C4425r1("status bars"));
        c0943k0.m2326m(C4413n1.f14698h, new C4425r1("system gestures"));
        c0943k0.m2326m(C4413n1.f14699i, new C4425r1("tappable element"));
        c0943k0.m2326m(C4413n1.f14700j, new C4425r1("waterfall"));
        this.f14687m = c0943k0;
        this.f14688n = new C1833g1(0);
        this.f14689o = new C0933f0(4);
        this.f14690p = new C4665p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1333s
    /* JADX INFO: renamed from: a */
    public final void mo3560a(C1300b0 c1300b0) {
        boolean z9 = false;
        this.f14684j = false;
        int iMo3447d = c1300b0.f4355a.mo3447d();
        this.f14685k &= ~iMo3447d;
        this.f14686l = null;
        InterfaceC4416o1 interfaceC4416o1 = (InterfaceC4416o1) AbstractC4422q1.f14714a.m2313b(iMo3447d);
        if (interfaceC4416o1 != null) {
            Object objM2320g = this.f14687m.m2320g(interfaceC4416o1);
            objM2320g.getClass();
            C4425r1 c4425r1 = (C4425r1) objM2320g;
            c4425r1.f14725c.m4489h(0.0f);
            c4425r1.f14727e.m4489h(1.0f);
            c4425r1.f14726d.m4565h(0L);
            c4425r1.f14725c.m4489h(0.0f);
            c4425r1.f14724b.setValue(Boolean.FALSE);
            c4425r1.f14732j = -1L;
            c4425r1.f14733k = -1L;
            C1833g1 c1833g1 = this.f14688n;
            c1833g1.m4493h(c1833g1.m4492g() + 1);
            synchronized (AbstractC4662m.f15512c) {
                C0945l0 c0945l0 = AbstractC4662m.f15519j.f15477h;
                if (c0945l0 != null) {
                    if (c0945l0.m2335h()) {
                        z9 = true;
                    }
                }
            }
            if (z9) {
                AbstractC4662m.m9120a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1333s
    /* JADX INFO: renamed from: b */
    public final void mo3561b() {
        this.f14684j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.InterfaceC1305e
    /* JADX INFO: renamed from: c */
    public final C1332r0 mo3460c(View view, C1332r0 c1332r0) {
        if (this.f14684j) {
            this.f14686l = c1332r0;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c1332r0;
            }
        } else if (this.f14685k == 0) {
            m8874f(c1332r0);
        }
        return c1332r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1333s
    /* JADX INFO: renamed from: d */
    public final C1332r0 mo3562d(C1332r0 c1332r0, List list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1300b0 c1300b0 = (C1300b0) list.get(i9);
            InterfaceC4416o1 interfaceC4416o1 = (InterfaceC4416o1) AbstractC4422q1.f14714a.m2313b(c1300b0.f4355a.mo3447d());
            if (interfaceC4416o1 != null) {
                Object objM2320g = this.f14687m.m2320g(interfaceC4416o1);
                objM2320g.getClass();
                C4425r1 c4425r1 = (C4425r1) objM2320g;
                if (((Boolean) c4425r1.f14724b.getValue()).booleanValue()) {
                    AbstractC1298a0 abstractC1298a0 = c1300b0.f4355a;
                    c4425r1.f14725c.m4489h(abstractC1298a0.mo3446c());
                    c4425r1.f14727e.m4489h(abstractC1298a0.mo3444a());
                    c4425r1.f14726d.m4565h(abstractC1298a0.mo3445b());
                }
            }
        }
        m8874f(c1332r0);
        return c1332r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1333s
    /* JADX INFO: renamed from: e */
    public final C0126e mo3563e(C1300b0 c1300b0, C0126e c0126e) {
        C1332r0 c1332r0 = this.f14686l;
        boolean z9 = false;
        this.f14684j = false;
        this.f14686l = null;
        if (c1300b0.f4355a.mo3445b() > 0 && c1332r0 != null) {
            int iMo3447d = c1300b0.f4355a.mo3447d();
            this.f14685k |= iMo3447d;
            InterfaceC4416o1 interfaceC4416o1 = (InterfaceC4416o1) AbstractC4422q1.f14714a.m2313b(iMo3447d);
            if (interfaceC4416o1 != null) {
                Object objM2320g = this.f14687m.m2320g(interfaceC4416o1);
                objM2320g.getClass();
                C4425r1 c4425r1 = (C4425r1) objM2320g;
                C0171a c0171aMo3501g = c1332r0.f4398a.mo3501g(iMo3447d);
                long j3 = (((long) c0171aMo3501g.f445a) << 48) | (((long) c0171aMo3501g.f446b) << 32) | (((long) c0171aMo3501g.f447c) << 16) | ((long) c0171aMo3501g.f448d);
                long j4 = c4425r1.f14730h;
                if (!AbstractC4434w.m8883g(j3, j4)) {
                    c4425r1.f14732j = j4;
                    c4425r1.f14733k = j3;
                    c4425r1.f14724b.setValue(Boolean.TRUE);
                    AbstractC1298a0 abstractC1298a0 = c1300b0.f4355a;
                    c4425r1.f14725c.m4489h(abstractC1298a0.mo3446c());
                    c4425r1.f14727e.m4489h(abstractC1298a0.mo3444a());
                    c4425r1.f14726d.m4565h(abstractC1298a0.mo3445b());
                    C1833g1 c1833g1 = this.f14688n;
                    c1833g1.m4493h(c1833g1.m4492g() + 1);
                    synchronized (AbstractC4662m.f15512c) {
                        C0945l0 c0945l0 = AbstractC4662m.f15519j.f15477h;
                        if (c0945l0 != null) {
                            if (c0945l0.m2335h()) {
                                z9 = true;
                            }
                        }
                    }
                    if (z9) {
                        AbstractC4662m.m9120a();
                        return c0126e;
                    }
                }
            }
        }
        return c0126e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8874f(C1332r0 c1332r0) {
        char c10;
        char c11;
        boolean z9;
        char c12;
        boolean z10;
        boolean z11;
        long j3;
        boolean z12;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j4;
        int i9;
        C0965w c0965w = AbstractC4422q1.f14714a;
        int[] iArr3 = c0965w.f2964b;
        Object[] objArr3 = c0965w.f2965c;
        long[] jArr3 = c0965w.f2963a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            z10 = false;
            z11 = false;
            c10 = 16;
            c11 = ' ';
            while (true) {
                long j5 = jArr3[i10];
                z9 = true;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    c12 = '0';
                    while (i13 < i12) {
                        if ((j5 & 255) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr3[i14];
                            InterfaceC4416o1 interfaceC4416o1 = (InterfaceC4416o1) objArr3[i14];
                            C0171a c0171aMo3501g = c1332r0.f4398a.mo3501g(i15);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j10 = (((long) c0171aMo3501g.f445a) << 48) | (((long) c0171aMo3501g.f446b) << 32) | (((long) c0171aMo3501g.f447c) << 16) | ((long) c0171aMo3501g.f448d);
                            Object objM2320g = this.f14687m.m2320g(interfaceC4416o1);
                            objM2320g.getClass();
                            C4425r1 c4425r1 = (C4425r1) objM2320g;
                            j4 = j5;
                            if (!AbstractC4434w.m8883g(j10, c4425r1.f14730h)) {
                                c4425r1.f14730h = j10;
                                z10 = true;
                                if (!AbstractC4434w.m8883g(j10, 0L)) {
                                    z11 = true;
                                }
                            }
                            if (i15 != 8) {
                                C0171a c0171aMo3502h = c1332r0.f4398a.mo3502h(i15);
                                objArr2 = objArr3;
                                long j11 = (((long) c0171aMo3502h.f446b) << 32) | (((long) c0171aMo3502h.f445a) << 48) | (((long) c0171aMo3502h.f447c) << 16) | ((long) c0171aMo3502h.f448d);
                                if (!AbstractC4434w.m8883g(c4425r1.f14731i, j11)) {
                                    c4425r1.f14731i = j11;
                                    z10 = true;
                                    if (!AbstractC4434w.m8883g(j11, 0L)) {
                                        z11 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            c4425r1.f14723a.setValue(Boolean.valueOf(c1332r0.f4398a.mo3506q(i15)));
                            i9 = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j4 = j5;
                            i9 = i11;
                        }
                        j5 = j4 >> i9;
                        i13++;
                        i11 = i9;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c12 = '0';
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c10 = 16;
            c11 = ' ';
            z9 = true;
            c12 = '0';
            z10 = false;
            z11 = false;
        }
        C1303d c1303dMo3518f = c1332r0.f4398a.mo3518f();
        if (c1303dMo3518f == null) {
            j3 = 0;
        } else {
            C0171a c0171aM3456a = c1303dMo3518f.m3456a();
            j3 = (((long) c0171aM3456a.f445a) << c12) | (((long) c0171aM3456a.f446b) << c11) | (((long) c0171aM3456a.f447c) << c10) | ((long) c0171aM3456a.f448d);
        }
        C0943k0 c0943k0 = this.f14687m;
        InterfaceC4416o1.f14701a.getClass();
        Object objM2320g2 = c0943k0.m2320g(C4413n1.f14700j);
        objM2320g2.getClass();
        C4425r1 c4425r12 = (C4425r1) objM2320g2;
        c4425r12.f14723a.setValue(Boolean.valueOf(!AbstractC4434w.m8883g(j3, 0L)));
        if (!AbstractC4434w.m8883g(c4425r12.f14730h, j3)) {
            c4425r12.f14730h = j3;
            c4425r12.f14731i = j3;
            z10 = z9;
            if (!AbstractC4434w.m8883g(j3, 0L)) {
                z11 = z10;
            }
        }
        if (c1303dMo3518f == null) {
            C0933f0 c0933f0 = this.f14689o;
            if (c0933f0.f2924b > 0) {
                c0933f0.m2289d();
                this.f14690p.clear();
                z10 = z9;
            }
        } else {
            List listM1355b = Build.VERSION.SDK_INT >= 28 ? AbstractC0390a.m1355b(c1303dMo3518f.f4362a) : Collections.EMPTY_LIST;
            int size = listM1355b.size();
            C0933f0 c0933f02 = this.f14689o;
            if (size < c0933f02.f2924b) {
                c0933f02.m2297l(listM1355b.size(), this.f14689o.f2924b);
                this.f14690p.m9144e(listM1355b.size(), this.f14690p.size());
                z10 = z9;
            } else {
                int size2 = listM1355b.size() - this.f14689o.f2924b;
                int i16 = 0;
                while (i16 < size2) {
                    C0933f0 c0933f03 = this.f14689o;
                    c0933f03.m2286a(AbstractC1874r.m4639u(listM1355b.get(c0933f03.f2924b)));
                    this.f14690p.add(new C4408m("display cutout rect " + this.f14689o.f2924b));
                    i16++;
                    z10 = z9;
                }
            }
            int size3 = listM1355b.size();
            for (int i17 = 0; i17 < size3; i17++) {
                Rect rect = (Rect) listM1355b.get(i17);
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f14689o.m2291f(i17);
                if (!AbstractC1416l.m3825a(interfaceC1809a1.getValue(), rect)) {
                    interfaceC1809a1.setValue(rect);
                    z10 = z9;
                }
            }
            if (!listM1355b.isEmpty()) {
                z11 = z9;
            }
        }
        if ((z11 || this.f14688n.m4492g() != 0) && z10) {
            C1833g1 c1833g1 = this.f14688n;
            c1833g1.m4493h(c1833g1.m4492g() + 1);
            synchronized (AbstractC4662m.f15512c) {
                C0945l0 c0945l0 = AbstractC4662m.f15519j.f15477h;
                if (c0945l0 != null) {
                    boolean z13 = z9;
                    z12 = c0945l0.m2335h() == z13 ? z13 : false;
                }
            }
            if (z12) {
                AbstractC4662m.m9120a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i9 = AbstractC1329q.f4395a;
        AbstractC1321m.m3524b(view, this);
        AbstractC1329q.m3555b(view, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i9 = AbstractC1329q.f4395a;
        AbstractC1321m.m3524b(view, null);
        AbstractC1329q.m3555b(view, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14684j) {
            this.f14685k = 0;
            this.f14684j = false;
            C1332r0 c1332r0 = this.f14686l;
            if (c1332r0 != null) {
                m8874f(c1332r0);
                this.f14686l = null;
            }
        }
    }
}
