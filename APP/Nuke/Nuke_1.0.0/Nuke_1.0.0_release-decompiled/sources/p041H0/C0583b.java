package p041H0;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.bumptech.glide.AbstractC1925g;
import p007B0.AbstractC0208v;
import p007B0.C0173F;
import p007B0.C0174G;
import p007B0.C0175H;
import p007B0.C0200n;
import p007B0.C0209w;
import p007B0.EnumC0170C;
import p007B0.EnumC0201o;
import p023E0.AbstractC0277a;
import p029F0.C0406j;
import p029F0.C0428u;
import p029F0.EnumC0380S;
import p029F0.EnumC0381T;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p029F0.InterfaceC0430v;
import p029F0.InterfaceC0433x;
import p035G0.C0469a;
import p035G0.InterfaceC0471c;
import p047I0.C0769w0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.InterfaceC0877c;
import p077P0.C1114a;
import p077P0.C1115b;
import p077P0.C1125l;
import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p117X2.AbstractC1665j;
import p153e1.AbstractC2006b;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2206o;
import p169h0.InterfaceC2205n;
import p186k.C2408E;
import p193l0.InterfaceC2479b;
import p197m.C2554n;
import p198m0.EnumC2594y;
import p198m0.InterfaceC2576g;
import p198m0.InterfaceC2586q;
import p198m0.InterfaceC2589t;
import p198m0.InterfaceC2592w;
import p255w.C3383n;

/* JADX INFO: renamed from: H0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0583b extends AbstractC2206o implements InterfaceC0627x, InterfaceC0605m, InterfaceC0632z0, InterfaceC0624v0, InterfaceC0471c, InterfaceC0620t0, InterfaceC0625w, InterfaceC0607n, InterfaceC2576g, InterfaceC2589t, InterfaceC2592w, InterfaceC0616r0, InterfaceC2479b {

    /* JADX INFO: renamed from: r */
    public InterfaceC2205n f1864r;

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        m939J0(true);
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        if (!this.f7199q) {
            AbstractC0277a.m483b("unInitializeModifier called on unattached node");
        }
        if ((this.f7188f & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).m1295C();
        }
    }

    @Override // p041H0.InterfaceC0616r0
    /* JADX INFO: renamed from: H */
    public final boolean mo800H() {
        return this.f7199q;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m939J0(boolean z5) {
        if (!this.f7199q) {
            AbstractC0277a.m483b("initializeModifier called on unattached node");
        }
        InterfaceC2205n interfaceC2205n = this.f1864r;
        if ((this.f7188f & 4) != 0 && !z5) {
            AbstractC0601k.m1042r(this, 2).m988Y0();
        }
        if ((this.f7188f & 2) != 0) {
            C0552B0 c0552b0 = AbstractC0601k.m1044t(this).f1699J.f1895e;
            AbstractC1665j.m2983c(c0552b0, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (c0552b0.f1665r) {
                AbstractC0596h0 abstractC0596h0 = this.f7193k;
                AbstractC1665j.m2982b(abstractC0596h0);
                ((C0631z) abstractC0596h0).m1082s1(this);
                InterfaceC0612p0 interfaceC0612p0 = abstractC0596h0.f1931O;
                if (interfaceC0612p0 != null) {
                    ((C0769w0) interfaceC0612p0).invalidate();
                }
            }
            if (!z5) {
                AbstractC0601k.m1042r(this, 2).m988Y0();
                AbstractC0601k.m1044t(this).m796D();
            }
        }
        if (interfaceC2205n instanceof C3383n) {
            ((C3383n) interfaceC2205n).f10552a.f10569k = AbstractC0601k.m1044t(this);
        }
        int i5 = this.f7188f;
        if ((i5 & 16) != 0 && (interfaceC2205n instanceof C0174G)) {
            ((C0174G) interfaceC2205n).f619d.f612e = this.f7193k;
        }
        if ((i5 & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).m1295C();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: K */
    public final void mo286K(C0200n c0200n, EnumC0201o enumC0201o, long j5) {
        boolean z5;
        boolean z6;
        boolean z7;
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C0173F c0173f = ((C0174G) interfaceC2205n).f619d;
        C0174G c0174g = (C0174G) c0173f.f615h;
        ?? r02 = c0200n.f696a;
        int size = r02.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0209w c0209w = (C0209w) r02.get(i5);
            if (AbstractC0208v.m312b(c0209w) || AbstractC0208v.m314d(c0209w)) {
                z5 = false;
                break;
            }
        }
        z5 = true;
        if (!z5) {
            z6 = false;
            break;
        }
        int size2 = r02.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (((C0209w) r02.get(i6)).m321b()) {
                z6 = false;
                break;
            }
        }
        z6 = true;
        if (c0174g.f618c) {
            z7 = true;
        } else {
            int size3 = r02.size();
            int i7 = 0;
            while (true) {
                if (i7 < size3) {
                    C0209w c0209w2 = (C0209w) r02.get(i7);
                    if (AbstractC0208v.m312b(c0209w2) || AbstractC0208v.m314d(c0209w2)) {
                        break;
                    } else {
                        i7++;
                    }
                } else if (z6) {
                    break;
                } else {
                    z7 = false;
                }
            }
            z7 = true;
        }
        EnumC0170C enumC0170C = (EnumC0170C) c0173f.f613f;
        EnumC0170C enumC0170C2 = EnumC0170C.f604f;
        EnumC0201o enumC0201o2 = EnumC0201o.f704f;
        if (enumC0170C != enumC0170C2) {
            if (enumC0201o == EnumC0201o.f702d && z7) {
                c0173f.f614g = c0200n;
                c0173f.m250e(c0200n, !z5 || c0174g.f618c);
            }
            if (enumC0201o == EnumC0201o.f703e && z5 && c0200n.equals((C0200n) c0173f.f614g) && c0174g.f618c) {
                int size4 = r02.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    ((C0209w) r02.get(i8)).m320a();
                }
            }
            if (enumC0201o == enumC0201o2 && !z7 && !c0200n.equals((C0200n) c0173f.f614g)) {
                c0173f.m250e(c0200n, true);
            }
        }
        if (enumC0201o == enumC0201o2) {
            int size5 = r02.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size5) {
                    c0173f.f613f = EnumC0170C.f602d;
                    ((C0174G) c0173f.f615h).f618c = false;
                    c0173f.f614g = null;
                    break;
                } else if (!AbstractC0208v.m314d((C0209w) r02.get(i9))) {
                    break;
                } else {
                    i9++;
                }
            }
            if (c0200n.equals((C0200n) c0173f.f614g) && z5) {
                int size6 = r02.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size6) {
                        break;
                    }
                    if (!((C0209w) r02.get(i10)).m321b()) {
                        i10++;
                    } else if (!c0174g.f618c) {
                        c0173f.m260t(c0200n);
                        return;
                    }
                }
                int size7 = r02.size();
                for (int i11 = 0; i11 < size7; i11++) {
                    ((C0209w) r02.get(i11)).m320a();
                }
            }
        }
    }

    @Override // p041H0.InterfaceC0607n
    /* JADX INFO: renamed from: P */
    public final void mo654P(AbstractC0596h0 abstractC0596h0) {
        AbstractC1665j.m2983c(this.f1864r, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        throw new ClassCastException();
    }

    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    public final void mo940R(C0566K c0566k) {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        c0566k.m857a();
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: T */
    public final int mo941T(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0433x) interfaceC2205n).mo59d(new C0428u(abstractC0572Q, abstractC0572Q.getLayoutDirection()), new C0406j(interfaceC0376N, EnumC0380S.f1191e, EnumC0381T.f1194e, 1), AbstractC2006b.m3685b(i5, 0, 13)).mo609c();
    }

    @Override // p198m0.InterfaceC2576g
    /* JADX INFO: renamed from: W */
    public final void mo942W(EnumC2594y enumC2594y) {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC0277a.m483b("onFocusEvent called on wrong node");
        interfaceC2205n.getClass();
        throw new ClassCastException();
    }

    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        int i5;
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        C1115b c1115b = (C1115b) interfaceC2205n;
        C1125l c1125l = new C1125l();
        c1125l.f3704f = c1115b.f3635a;
        c1115b.f3636b.mo1h(c1125l);
        AbstractC1665j.m2983c(interfaceC1136w, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        C1125l c1125l2 = (C1125l) interfaceC1136w;
        C2408E c2408e = c1125l2.f3702d;
        if (c1125l.f3704f) {
            c1125l2.f3704f = true;
        }
        if (c1125l.f3705g) {
            c1125l2.f3705g = true;
        }
        C2408E c2408e2 = c1125l.f3702d;
        Object[] objArr = c2408e2.f7788b;
        Object[] objArr2 = c2408e2.f7789c;
        long[] jArr = c2408e2.f7787a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j5 = jArr[i6];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((255 & j5) < 128) {
                        int i10 = (i6 << 3) + i9;
                        Object obj = objArr[i10];
                        Object obj2 = objArr2[i10];
                        C1135v c1135v = (C1135v) obj;
                        if (!c2408e.m4267b(c1135v)) {
                            c2408e.m4278m(c1135v, obj2);
                        } else if (obj2 instanceof C1114a) {
                            Object objM4272g = c2408e.m4272g(c1135v);
                            AbstractC1665j.m2983c(objM4272g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            C1114a c1114a = (C1114a) objM4272g;
                            i5 = i7;
                            String str = c1114a.f3633a;
                            if (str == null) {
                                str = ((C1114a) obj2).f3633a;
                            }
                            InterfaceC0877c interfaceC0877c = c1114a.f3634b;
                            if (interfaceC0877c == null) {
                                interfaceC0877c = ((C1114a) obj2).f3634b;
                            }
                            c2408e.m4278m(c1135v, new C1114a(str, interfaceC0877c));
                        }
                        i5 = i7;
                    } else {
                        i5 = i7;
                    }
                    j5 >>= i5;
                    i9++;
                    i7 = i5;
                }
                if (i8 != i7) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: Z */
    public final boolean mo944Z() {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C0174G) interfaceC2205n).f619d.getClass();
        return true;
    }

    @Override // p041H0.InterfaceC0597i, p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: a */
    public final void mo289a() {
        if (this.f1864r instanceof C0174G) {
            mo291g0();
        }
    }

    @Override // p193l0.InterfaceC2479b
    /* JADX INFO: renamed from: b */
    public final InterfaceC2007c mo945b() {
        return AbstractC0601k.m1044t(this).f1692C;
    }

    @Override // p193l0.InterfaceC2479b
    /* JADX INFO: renamed from: c */
    public final long mo946c() {
        return AbstractC1925g.m3523F(AbstractC0601k.m1042r(this, 128).f1208f);
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0433x) interfaceC2205n).mo59d(interfaceC0379Q, interfaceC0376N, j5);
    }

    @Override // p198m0.InterfaceC2589t
    /* JADX INFO: renamed from: e */
    public final void mo947e(InterfaceC2586q interfaceC2586q) {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC0277a.m483b("applyFocusProperties called on wrong node");
        interfaceC2205n.getClass();
        throw new ClassCastException();
    }

    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: g0 */
    public final void mo291g0() {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C0173F c0173f = ((C0174G) interfaceC2205n).f619d;
        EnumC0170C enumC0170C = (EnumC0170C) c0173f.f613f;
        C0174G c0174g = (C0174G) c0173f.f615h;
        if (enumC0170C == EnumC0170C.f603e) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((C0175H) c0174g.m261e()).mo1h(motionEventObtain);
            motionEventObtain.recycle();
            c0173f.f613f = EnumC0170C.f602d;
            c0174g.f618c = false;
            c0173f.f614g = null;
        }
    }

    @Override // p193l0.InterfaceC2479b
    public final EnumC2017m getLayoutDirection() {
        return AbstractC0601k.m1044t(this).f1693D;
    }

    @Override // p035G0.InterfaceC0471c
    /* JADX INFO: renamed from: i */
    public final C0469a mo750i() {
        return C0469a.f1394a;
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: j */
    public final int mo948j(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0433x) interfaceC2205n).mo59d(new C0428u(abstractC0572Q, abstractC0572Q.getLayoutDirection()), new C0406j(interfaceC0376N, EnumC0380S.f1190d, EnumC0381T.f1193d, 1), AbstractC2006b.m3685b(0, i5, 7)).mo611e();
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: l0 */
    public final int mo949l0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0433x) interfaceC2205n).mo59d(new C0428u(abstractC0572Q, abstractC0572Q.getLayoutDirection()), new C0406j(interfaceC0376N, EnumC0380S.f1190d, EnumC0381T.f1194e, 1), AbstractC2006b.m3685b(i5, 0, 13)).mo609c();
    }

    @Override // p041H0.InterfaceC0620t0
    /* JADX INFO: renamed from: m0 */
    public final Object mo950m0(Object obj) {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (C2554n) interfaceC2205n;
    }

    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: n0 */
    public final void mo951n0() {
        AbstractC0601k.m1034j(this);
    }

    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: p0 */
    public final void mo952p0() {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C0174G) interfaceC2205n).f619d.getClass();
    }

    public final String toString() {
        return this.f1864r.toString();
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: w0 */
    public final int mo954w0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        InterfaceC2205n interfaceC2205n = this.f1864r;
        AbstractC1665j.m2983c(interfaceC2205n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0433x) interfaceC2205n).mo59d(new C0428u(abstractC0572Q, abstractC0572Q.getLayoutDirection()), new C0406j(interfaceC0376N, EnumC0380S.f1191e, EnumC0381T.f1193d, 1), AbstractC2006b.m3685b(0, i5, 7)).mo611e();
    }

    @Override // p041H0.InterfaceC0625w
    /* JADX INFO: renamed from: v */
    public final void mo953v(InterfaceC0430v interfaceC0430v) {
    }

    @Override // p041H0.InterfaceC0625w
    /* JADX INFO: renamed from: x */
    public final void mo655x(long j5) {
    }
}
