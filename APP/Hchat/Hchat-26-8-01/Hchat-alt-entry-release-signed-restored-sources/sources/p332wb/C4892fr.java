package p332wb;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bi.AbstractC0316d;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p070f0.C0976h;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3241o;
import p222p.C3200a0;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p266s0.C3873c;
import p266s0.C3874d;
import p266s0.C3878h;
import p293u2.InterfaceC4233c;
import p308v1.InterfaceC4412n0;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p340x2.AbstractC5674i;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import tf.AbstractC4166m;
import th.AbstractC4211c;
import th.C4218j;

/* JADX INFO: renamed from: wb.fr */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4892fr {

    /* JADX INFO: renamed from: a */
    public static final C4892fr f17279a = new C4892fr();

    /* JADX INFO: renamed from: b */
    public static final Handler f17280b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public static final WeakHashMap f17281c = new WeakHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m9275c(View view, ViewGroup viewGroup, ViewGroup viewGroup2, int i9, ViewGroup.LayoutParams layoutParams, Drawable drawable, View view2, ArrayList arrayList, FrameLayout frameLayout, FrameLayout frameLayout2) {
        ViewParent parent = frameLayout.getParent();
        ViewGroup viewGroup3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup3 != null) {
            viewGroup3.removeView(frameLayout);
        }
        ViewParent parent2 = frameLayout2.getParent();
        ViewGroup viewGroup4 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup4 != null) {
            viewGroup4.removeView(frameLayout2);
        }
        for (C4761br c4761br : AbstractC4166m.m8402K1(arrayList, new C4834e2(9))) {
            View view3 = c4761br.f16122a;
            ViewParent parent3 = view3.getParent();
            ViewGroup viewGroup5 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
            if (viewGroup5 != null) {
                viewGroup5.removeView(view3);
            }
            viewGroup.addView(view3, AbstractC3754e0.m7909r(c4761br.f16123b, 0, viewGroup.getChildCount()), c4761br.f16124c);
        }
        ViewParent parent4 = view.getParent();
        ViewGroup viewGroup6 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
        if (viewGroup6 != null) {
            viewGroup6.removeView(view);
        }
        ViewParent parent5 = view2.getParent();
        ViewGroup viewGroup7 = parent5 instanceof ViewGroup ? (ViewGroup) parent5 : null;
        if (viewGroup7 == viewGroup2) {
            int iIndexOfChild = viewGroup2.indexOfChild(view2);
            Integer numValueOf = iIndexOfChild >= 0 ? Integer.valueOf(iIndexOfChild) : null;
            if (numValueOf != null) {
                i9 = numValueOf.intValue();
            }
        }
        int iM7909r = AbstractC3754e0.m7909r(i9, 0, viewGroup2.getChildCount());
        if (viewGroup7 != null) {
            viewGroup7.removeView(view2);
        }
        view.setBackground(drawable);
        viewGroup2.addView(view, iM7909r, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9276a(FrameLayout frameLayout, FrameLayout frameLayout2, int i9, C4859er c4859er, C1836h0 c1836h0, int i10) {
        C1836h0 c1836h02 = c1836h0;
        c1836h02.m4527b0(1762765574);
        int i11 = i10 | (c1836h02.m4538h(frameLayout) ? 4 : 2) | (c1836h02.m4538h(frameLayout2) ? 32 : 16) | (c1836h02.m4530d(i9) ? Opcodes.ACC_NATIVE : 128) | (c1836h02.m4534f(c4859er) ? Opcodes.ACC_STRICT : 1024);
        if (c1836h02.m4516S(i11 & 1, (i11 & 1171) != 1170)) {
            float fMo1599i0 = ((InterfaceC4233c) c1836h02.m4542j(AbstractC5888h1.f23926h)).mo1599i0(i9);
            C4218j c4218jM8479e = AbstractC4211c.m8479e(null, c1836h02, 0, 3);
            C3200a0 c3200a0 = AbstractC3222h1.f10289c;
            InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23761g, false);
            int iHashCode = Long.hashCode(c1836h02.f6095T);
            C3878h c3878hM4546l = c1836h02.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, c3200a0);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h02.m4531d0();
            if (c1836h02.f6094S) {
                c1836h02.m4544k(c5660y);
            } else {
                c1836h02.m4551n0();
            }
            C5597e c5597e = C5601f.f22761e;
            AbstractC1874r.m4615A(c5597e, c1836h02, interfaceC4412n0M6930d);
            C5597e c5597e2 = C5601f.f22760d;
            AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C5597e c5597e3 = C5601f.f22762f;
            AbstractC1874r.m4615A(c5597e3, c1836h02, numValueOf);
            C5593d c5593d = C5601f.f22763g;
            AbstractC1874r.m4641w(c5593d, c1836h02);
            C5597e c5597e4 = C5601f.f22759c;
            AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c);
            boolean zM4538h = c1836h02.m4538h(frameLayout);
            Object objM4514P = c1836h02.m4514P();
            if (zM4538h || objM4514P == C1851l.f6155a) {
                objM4514P = new C4728ar(frameLayout, 0);
                c1836h02.m4545k0(objM4514P);
            }
            AbstractC5674i.m10235b((InterfaceC1231l) objM4514P, AbstractC4211c.m8478d(c3200a0, c4218jM8479e), null, c1836h02, 0, 4);
            float f3 = c4859er.f16974c;
            InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(c3200a0, f3, 0.0f, f3, c4859er.f16975d, 2);
            InterfaceC4412n0 interfaceC4412n0M6930d2 = AbstractC3241o.m6930d(C5840b.f23768n, false);
            int iHashCode2 = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l2 = c1836h0.m4546l();
            InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6886p);
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(c5597e, c1836h0, interfaceC4412n0M6930d2);
            AbstractC1874r.m4615A(c5597e2, c1836h0, c3878hM4546l2);
            AbstractC2091b.m5169p(iHashCode2, c1836h0, c5597e3, c1836h0, c5593d);
            AbstractC1874r.m4615A(c5597e4, c1836h0, interfaceC5853oM10543c2);
            AbstractC5163o3.m9734d(c4218jM8479e, c4859er.f16972a, AbstractC3222h1.m6902e(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), fMo1599i0 + 8), AbstractC3879i.m8071e(1558922973, new C0976h(frameLayout2, 13), c1836h0), c1836h0, 3072);
            c1836h02 = c1836h0;
            c1836h02.m4553p(true);
            c1836h02.m4553p(true);
        } else {
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C3873c(this, frameLayout, frameLayout2, i9, c4859er, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m9277b(Activity activity, C3874d c3874d, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(1449312867);
        int i10 = (c1836h0.m4538h(activity) ? 4 : 2) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            AbstractC2043a.m5023b((activity.getResources().getConfiguration().uiMode & 48) == 32 ? AbstractC0316d.m1246a() : AbstractC0316d.m1247b(), null, false, c3874d, c1836h0, 3072);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C5278rj((Object) this, (Object) activity, (Object) c3874d, i9, 13);
        }
    }
}
