package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.util.ArrayList;

/* JADX INFO: renamed from: Hj */
/* JADX INFO: loaded from: classes.dex */
public final class C0327Hj {

    /* JADX INFO: renamed from: a */
    public final C0986Wy f1113a;

    /* JADX INFO: renamed from: b */
    public final Handler f1114b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1115c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C1473gw f1116d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0565N5 f1117e;

    /* JADX INFO: renamed from: f */
    public boolean f1118f;

    /* JADX INFO: renamed from: g */
    public boolean f1119g;

    /* JADX INFO: renamed from: h */
    public C1193aw f1120h;

    /* JADX INFO: renamed from: i */
    public C0198Ej f1121i;

    /* JADX INFO: renamed from: j */
    public boolean f1122j;

    /* JADX INFO: renamed from: k */
    public C0198Ej f1123k;

    /* JADX INFO: renamed from: l */
    public Bitmap f1124l;

    /* JADX INFO: renamed from: m */
    public C0198Ej f1125m;

    /* JADX INFO: renamed from: n */
    public int f1126n;

    /* JADX INFO: renamed from: o */
    public int f1127o;

    /* JADX INFO: renamed from: p */
    public int f1128p;

    public C0327Hj(ComponentCallbacks2C1273a r7, C0986Wy r8, int r9, int r10, Bitmap r11) {
        InterfaceC0565N5 r0 = r7.f4337a;
        C0756Rj r72 = r7.f4339c;
        ComponentCallbacks2C1473gw r1 = ComponentCallbacks2C1273a.m2414c(r72.getBaseContext());
        ComponentCallbacks2C1473gw r73 = ComponentCallbacks2C1273a.m2414c(r72.getBaseContext());
        r73.getClass();
        C1193aw r74 = new C1193aw(r73.f5216a, r73, Bitmap.class, r73.f5217b).m2304w(ComponentCallbacks2C1473gw.f5215k).m2304w(((C2252mw) ((C2252mw) ((C2252mw) new C2252mw().m5311e(C0922Vd.f2879c)).m5326u()).m5322q()).m5315j(r9, r10));
        this.f1115c = new ArrayList();
        this.f1116d = r1;
        Handler r92 = new Handler(Looper.getMainLooper(), new C0284Gj(0, this));
        this.f1117e = r0;
        this.f1114b = r92;
        this.f1120h = r74;
        this.f1113a = r8;
        m714c(C0958WC.f2994b, r11);
    }

    /* JADX INFO: renamed from: a */
    public final void m712a() {
        if (this.f1118f == true) goto L5;
        return;
    L5:
        if (this.f1119g == true) goto L24;
        C0198Ej r0 = this.f1125m;
        if (r0 == null) goto L11;
        this.f1125m = null;
        m713b(r0);
        return;
    L11:
        this.f1119g = true;
        C0986Wy r1 = this.f1113a;
        C0370Ij r2 = r1.f3112l;
        int r3 = r2.f1287c;
        if (r3 <= 0) goto L20;
        int r4 = r1.f3111k;
        if (r4 < 0) goto L20;
        if (r4 < 0) goto L19;
        if (r4 >= r3) goto L19;
        int r22 = ((C0155Dj) r2.f1289e.get(r4)).f427i;
    L21:
        long r32 = SystemClock.uptimeMillis() + ((long) r22);
        int r23 = (r1.f3111k + 1) % r1.f3112l.f1287c;
        r1.f3111k = r23;
        this.f1123k = new C0198Ej(this.f1114b, r23, r32);
        C1193aw r02 = this.f1120h;
        C1382et r24 = new C1382et(Double.valueOf(Math.random()));
        C1193aw r03 = r02.m2304w((C2252mw) new C2252mw().m5321p(r24)).m2300C(r1);
        r03.m2307z(this.f1123k, r03);
        return;
    L19:
        r22 = -1;
    L20:
        r22 = 0;
        goto L21
    }

    /* JADX INFO: renamed from: b */
    public final void m713b(C0198Ej r9) {
        this.f1119g = false;
        boolean r0 = this.f1122j;
        Handler r2 = this.f1114b;
        if (r0 == false) goto L7;
        r2.obtainMessage(2, r9).sendToTarget();
        return;
    L7:
        if (this.f1118f == true) goto L11;
        this.f1125m = r9;
        return;
    L11:
        if (r9.f602g == null) goto L38;
        Bitmap r02 = this.f1124l;
        if (r02 == null) goto L15;
        this.f1117e.mo53h(r02);
        this.f1124l = null;
    L15:
        C0198Ej r03 = this.f1121i;
        this.f1121i = r9;
        ArrayList r92 = this.f1115c;
        int r3 = r92.size() - 1;
    L16:
        if (r3 < 0) goto L36;
        C0026Aj r4 = (C0026Aj) ((InterfaceC0241Fj) r92.get(r3));
        Object r5 = r4.getCallback();
    L19:
        if ((r5 instanceof Drawable) == false) goto L21;
        r5 = ((Drawable) r5).getCallback();
        goto L19
    L21:
        if (r5 != null) goto L23;
        r4.stop();
        r4.invalidateSelf();
    L35:
        r3 = r3 - 1;
        goto L16
    L23:
        r4.invalidateSelf();
        C0198Ej r6 = ((C0327Hj) r4.f50a.f1572b).f1121i;
        if (r6 == null) goto L26;
        int r62 = r6.f600e;
    L28:
        if (r62 != (r5.f1113a.f3112l.f1287c - 1)) goto L30;
        r4.f55f++;
    L30:
        int r52 = r4.f56g;
        if (r52 == (-1)) goto L35;
        if (r4.f55f < r52) goto L35;
        r4.stop();
        goto L35
    L26:
        r62 = -1;
        goto L28
    L36:
        if (r03 == null) goto L38;
        r2.obtainMessage(2, r03).sendToTarget();
    L38:
        m712a();
    }

    /* JADX INFO: renamed from: c */
    public final void m714c(InterfaceC0098CB r4, Bitmap r5) {
        AbstractC0714Qj.m1488j("Argument must not be null", r4);
        AbstractC0714Qj.m1488j("Argument must not be null", r5);
        this.f1124l = r5;
        this.f1120h = this.f1120h.m2304w(new C2252mw().m5324s(r4, true));
        this.f1126n = AbstractC2622vD.m5132c(r5);
        this.f1127o = r5.getWidth();
        this.f1128p = r5.getHeight();
    }
}
