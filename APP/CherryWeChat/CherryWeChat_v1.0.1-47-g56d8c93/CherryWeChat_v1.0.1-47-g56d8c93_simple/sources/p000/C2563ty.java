package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: ty */
/* JADX INFO: loaded from: classes.dex */
public final class C2563ty implements InterfaceC1026Xv, InterfaceC0041Ay {

    /* JADX INFO: renamed from: A */
    public static final boolean f8883A = false;

    /* JADX INFO: renamed from: a */
    public final C1432fz f8884a;

    /* JADX INFO: renamed from: b */
    public final Object f8885b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1237bw f8886c;

    /* JADX INFO: renamed from: d */
    public final Context f8887d;

    /* JADX INFO: renamed from: e */
    public final C0756Rj f8888e;

    /* JADX INFO: renamed from: f */
    public final Object f8889f;

    /* JADX INFO: renamed from: g */
    public final Class f8890g;

    /* JADX INFO: renamed from: h */
    public final AbstractC2743y5 f8891h;

    /* JADX INFO: renamed from: i */
    public final int f8892i;

    /* JADX INFO: renamed from: j */
    public final int f8893j;

    /* JADX INFO: renamed from: k */
    public final EnumC2688wu f8894k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC1444gA f8895l;

    /* JADX INFO: renamed from: m */
    public final List f8896m;

    /* JADX INFO: renamed from: n */
    public final C0668Pg f8897n;

    /* JADX INFO: renamed from: o */
    public final ExecutorC2346p3 f8898o;

    /* JADX INFO: renamed from: p */
    public InterfaceC2389pw f8899p;

    /* JADX INFO: renamed from: q */
    public C2656w4 f8900q;

    /* JADX INFO: renamed from: r */
    public volatile C1264cg f8901r;

    /* JADX INFO: renamed from: s */
    public Drawable f8902s;

    /* JADX INFO: renamed from: t */
    public Drawable f8903t;

    /* JADX INFO: renamed from: u */
    public Drawable f8904u;

    /* JADX INFO: renamed from: v */
    public int f8905v;

    /* JADX INFO: renamed from: w */
    public int f8906w;

    /* JADX INFO: renamed from: x */
    public boolean f8907x;

    /* JADX INFO: renamed from: y */
    public final RuntimeException f8908y;

    /* JADX INFO: renamed from: z */
    public int f8909z;

    static {
        f8883A = Log.isLoggable("GlideRequest", 2);
    }

    public C2563ty(Context r3, C0756Rj r4, Object r5, Object r6, Class r7, AbstractC2743y5 r8, int r9, int r10, EnumC2688wu r11, InterfaceC1444gA r12, ArrayList r13, InterfaceC1237bw r14, C1264cg r15, C0668Pg r16) {
        ExecutorC2346p3 r0 = AbstractC0671Pj.f2139b;
        if (f8883A == false) goto L5;
        String.valueOf(hashCode());
    L5:
        this.f8884a = new C1432fz();
        this.f8885b = r5;
        this.f8887d = r3;
        this.f8888e = r4;
        this.f8889f = r6;
        this.f8890g = r7;
        this.f8891h = r8;
        this.f8892i = r9;
        this.f8893j = r10;
        this.f8894k = r11;
        this.f8895l = r12;
        this.f8896m = r13;
        this.f8886c = r14;
        this.f8901r = r15;
        this.f8897n = r16;
        this.f8898o = r0;
        this.f8909z = 1;
        if (this.f8908y == null) goto L8;
        return;
    L8:
        if (((Map) r4.f2403h.f328b).containsKey(AbstractC0628Oj.class) == false) goto L12;
        this.f8908y = new RuntimeException("Glide request origin trace");
        return;
    }

    /* JADX INFO: renamed from: a */
    public final void m5045a() {
        if (this.f8907x == true) goto L17;
        this.f8884a.m2744a();
        this.f8895l.mo395e(this);
        C2656w4 r0 = this.f8900q;
        if (r0 == null) goto L15;
        C1264cg r1 = (C1264cg) r0.f9198d;
        monitor-enter(r1);
        ((C1544ig) r0.f9196b).m2963h((C2563ty) r0.f9197c);     // Catch: Throwable -> L12
        monitor-exit(r1);     // Catch: Throwable -> L12
        this.f8900q = null;
        return;
    L12:
        th = move-exception;
        throw th;
    L15:
        return;
    L17:
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m5046b() {
        if (this.f8903t != null) goto L8;
        AbstractC2743y5 r0 = this.f8891h;
        r0.getClass();
        this.f8903t = null;
        int r1 = r0.f9356e;
        if (r1 <= 0) goto L8;
        r0.getClass();
        Context r02 = this.f8887d;
        this.f8903t = AbstractC0148Dc.m277k(r02, r02, r1, r02.getTheme());
    L8:
        return this.f8903t;
    }

    /* JADX INFO: renamed from: c */
    public final void m5047c(C0842Tj r6, int r7) {
        this.f8884a.m2744a();
        Object r0 = this.f8885b;
        monitor-enter(r0);
        r6.getClass();     // Catch: Throwable -> L11
        int r1 = this.f8888e.f2404i;     // Catch: Throwable -> L11
        if (r1 > r7) goto L13;
        Objects.toString(this.f8889f);     // Catch: Throwable -> L11
        if (r1 > 4) goto L13;
        ArrayList r72 = new ArrayList();     // Catch: Throwable -> L11
        C0842Tj.m1666a(r6, r72);     // Catch: Throwable -> L11
        int r62 = r72.size();     // Catch: Throwable -> L11
        int r12 = 0;
    L9:
        if (r12 >= r62) goto L13;
        int r3 = r12 + 1;     // Catch: Throwable -> L11
        Throwable r13 = (Throwable) r72.get(r12);     // Catch: Throwable -> L11
        r12 = r3;
    L13:
        this.f8900q = null;     // Catch: Throwable -> L11
        this.f8909z = 5;     // Catch: Throwable -> L11
        InterfaceC1237bw r73 = this.f8886c;     // Catch: Throwable -> L11
        if (r73 == null) goto L16;
        r73.mo2358c(this);     // Catch: Throwable -> L11
    L16:
        boolean r74 = true;
        this.f8907x = true;     // Catch: Throwable -> L11
        List r14 = this.f8896m;     // Catch: Throwable -> L30
        if (r14 == null) goto L32;
        Iterator r15 = r14.iterator();     // Catch: Throwable -> L30
    L21:
        if (r15.hasNext() == false) goto L32;
        C1461gk r32 = (C1461gk) r15.next();     // Catch: Throwable -> L30
        InterfaceC1237bw r4 = this.f8886c;     // Catch: Throwable -> L30
        if (r4 == null) goto L26;
        r4.getRoot().mo1938e();     // Catch: Throwable -> L30
    L26:
        switch(r32.f5179a) {
            case 0: goto L29;
            case 1: goto L28;
            default: goto L27;
        };     // Catch: Throwable -> L30
    L28:
        ((ProgressBar) r32.f5180b).setVisibility(8);     // Catch: Throwable -> L30
        goto L21
    L29:
        AbstractC0295Gu.m625r(-71786083383349L);     // Catch: Throwable -> L30
        goto L21
    L27:
        ((C0441KA) r32.f5180b).itemView.requestLayout();     // Catch: Throwable -> L30
    L32:
        InterfaceC1237bw r16 = this.f8886c;     // Catch: Throwable -> L30
        if (r16 != null) goto L35;
    L38:
        if (r74 == true) goto L41;
    L57:
        this.f8907x = false;     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L41:
        if (this.f8889f == null) goto L43;
        Drawable r75 = null;
    L47:
        if (r75 == null) goto L49;
    L54:
        if (r75 != null) goto L56;
        r75 = m5046b();     // Catch: Throwable -> L30
    L56:
        this.f8895l.mo393c(r75);     // Catch: Throwable -> L30
    L49:
        if (this.f8902s != null) goto L53;
        AbstractC2743y5 r76 = this.f8891h;     // Catch: Throwable -> L30
        r76.getClass();     // Catch: Throwable -> L30
        this.f8902s = null;     // Catch: Throwable -> L30
        int r63 = r76.f9355d;     // Catch: Throwable -> L30
        if (r63 <= 0) goto L53;
        Context r77 = this.f8887d;     // Catch: Throwable -> L30
        this.f8891h.getClass();     // Catch: Throwable -> L30
        this.f8902s = AbstractC0148Dc.m277k(r77, r77, r63, r77.getTheme());     // Catch: Throwable -> L30
    L53:
        r75 = this.f8902s;     // Catch: Throwable -> L30
        goto L54
    L43:
        if (this.f8904u != null) goto L45;
        this.f8891h.getClass();     // Catch: Throwable -> L30
        this.f8904u = null;     // Catch: Throwable -> L30
    L45:
        r75 = this.f8904u;     // Catch: Throwable -> L30
        goto L47
    L35:
        if (r16.mo2357b(this) == true) goto L38;
        r74 = false;
    L30:
        th = move-exception;
        this.f8907x = false;     // Catch: Throwable -> L11
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1026Xv
    public final void clear() {
        Object r0 = this.f8885b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f8907x == true) goto L27;
        this.f8884a.m2744a();     // Catch: Throwable -> L10
        if (this.f8909z != 6) goto L12;
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L12:
        m5045a();     // Catch: Throwable -> L10
        InterfaceC2389pw r1 = this.f8899p;     // Catch: Throwable -> L10
        if (r1 == null) goto L15;
        this.f8899p = null;     // Catch: Throwable -> L10
    L16:
        InterfaceC1237bw r3 = this.f8886c;     // Catch: Throwable -> L10
        if (r3 != null) goto L19;
    L20:
        this.f8895l.mo399i(m5046b());     // Catch: Throwable -> L10
    L21:
        this.f8909z = 6;     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        if (r1 == null) goto L31;
        this.f8901r.getClass();
        C1264cg.m2400e(r1);
        return;
    L31:
        return;
    L19:
        if (r3.mo2356a(this) == false) goto L21;
    L15:
        r1 = null;
        goto L16
    L27:
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");     // Catch: Throwable -> L10
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: d */
    public final void mo1937d() {
        Object r0 = this.f8885b;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (isRunning() == false) goto L9;
        clear();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: e */
    public final boolean mo1938e() {
        Object r0 = this.f8885b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f8909z != 4) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: f */
    public final boolean mo1939f(InterfaceC1026Xv r18) {
        if ((r18 instanceof C2563ty) == true) goto L5;
        return false;
    L5:
        Object r2 = this.f8885b;
        monitor-enter(r2);
        int r4 = this.f8892i;     // Catch: Throwable -> L10
        int r5 = this.f8893j;     // Catch: Throwable -> L10
        Object r6 = this.f8889f;     // Catch: Throwable -> L10
        Class r7 = this.f8890g;     // Catch: Throwable -> L10
        AbstractC2743y5 r8 = this.f8891h;     // Catch: Throwable -> L10
        EnumC2688wu r9 = this.f8894k;     // Catch: Throwable -> L10
        List r10 = this.f8896m;     // Catch: Throwable -> L10
        if (r10 == null) goto L12;
        int r102 = r10.size();     // Catch: Throwable -> L10
    L13:
        monitor-exit(r2);     // Catch: Throwable -> L10
        C2563ty r0 = (C2563ty) r18;
        Object r11 = r0.f8885b;
        monitor-enter(r11);
        int r22 = r0.f8892i;     // Catch: Throwable -> L19
        int r12 = r0.f8893j;     // Catch: Throwable -> L19
        Object r13 = r0.f8889f;     // Catch: Throwable -> L19
        Class r14 = r0.f8890g;     // Catch: Throwable -> L19
        AbstractC2743y5 r15 = r0.f8891h;     // Catch: Throwable -> L19
        EnumC2688wu r3 = r0.f8894k;     // Catch: Throwable -> L19
        List r02 = r0.f8896m;     // Catch: Throwable -> L19
        if (r02 == null) goto L21;
        int r03 = r02.size();     // Catch: Throwable -> L19
    L22:
        monitor-exit(r11);     // Catch: Throwable -> L19
        if (r4 != r22) goto L43;
        if (r5 != r12) goto L43;
        char[] r23 = AbstractC2622vD.f9104a;
        if (r6 != null) goto L30;
        if (r13 != null) goto L29;
        boolean r42 = true;
    L31:
        if (r42 == false) goto L43;
        if (r7.equals(r14) == false) goto L43;
        if (r8 != null) goto L38;
        if (r15 != null) goto L37;
        boolean r43 = true;
    L39:
        if (r43 == false) goto L43;
        if (r9 != r3) goto L43;
        if (r102 != r03) goto L43;
        return true;
    L37:
        r43 = false;
        goto L39
    L38:
        r43 = r8.m5313g(r15);
        goto L39
    L29:
        r42 = false;
        goto L31
    L30:
        r42 = r6.equals(r13);
    L43:
        return false;
    L21:
        r03 = 0;
    L19:
        th = move-exception;
        throw th;
    L12:
        r102 = 0;
    L10:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: g */
    public final void m5048g(InterfaceC2389pw r7, int r8, boolean r9) {
        this.f8884a.m2744a();
        InterfaceC2389pw r1 = null;
        Object r2 = this.f8885b;     // Catch: Throwable -> L44
        monitor-enter(r2);     // Catch: Throwable -> L44
        this.f8900q = null;     // Catch: Throwable -> L10
        if (r7 != null) goto L12;
        m5047c(new C0842Tj("Expected to receive a Resource<R> with an object of " + this.f8890g + " inside, but instead got null."), 5);     // Catch: Throwable -> L10
        monitor-exit(r2);     // Catch: Throwable -> L10
        return;
    L12:
        Object r0 = r7.get();     // Catch: Throwable -> L10
        if (r0 != null) goto L15;
    L31:
        this.f8899p = null;     // Catch: Throwable -> L26
        StringBuilder r12 = new StringBuilder("Expected to receive an object of ");     // Catch: Throwable -> L26
        r12.append(this.f8890g);     // Catch: Throwable -> L26
        r12.append(" but instead got ");     // Catch: Throwable -> L26
        if (r0 == null) goto L34;
        Object r92 = r0.getClass();     // Catch: Throwable -> L26
    L35:
        r12.append(r92);     // Catch: Throwable -> L26
        r12.append("{");     // Catch: Throwable -> L26
        r12.append(r0);     // Catch: Throwable -> L26
        r12.append("} inside Resource{");     // Catch: Throwable -> L26
        r12.append(r7);     // Catch: Throwable -> L26
        r12.append("}.");     // Catch: Throwable -> L26
        if (r0 == null) goto L38;
        String r93 = "";
    L39:
        r12.append(r93);     // Catch: Throwable -> L26
        m5047c(new C0842Tj(r12.toString()), 5);     // Catch: Throwable -> L26
        monitor-exit(r2);     // Catch: Throwable -> L26
    L24:
        this.f8901r.getClass();
        C1264cg.m2400e(r7);
        return;
    L38:
        r93 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
        goto L39
    L34:
        r92 = "";
        goto L35
    L15:
        if (this.f8890g.isAssignableFrom(r0.getClass()) == false) goto L31;
        InterfaceC1237bw r94 = this.f8886c;     // Catch: Throwable -> L10
        if (r94 != null) goto L20;
    L28:
        m5049h(r7, r0, r8);     // Catch: Throwable -> L10
        monitor-exit(r2);     // Catch: Throwable -> L10
        return;
    L20:
        if (r94.mo2359g(this) == true) goto L28;
        this.f8899p = null;     // Catch: Throwable -> L26
        this.f8909z = 4;     // Catch: Throwable -> L26
        monitor-exit(r2);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        r1 = r7;
        th = th;
    L42:
        monitor-exit(r2);     // Catch: Throwable -> L10
        throw th;     // Catch: Throwable -> L44
    L10:
        th = th;
    L44:
        th = move-exception;
        if (r1 == null) goto L47;
        this.f8901r.getClass();
        C1264cg.m2400e(r1);
    L47:
        throw th;
    }

    /* JADX INFO: renamed from: h */
    public final void m5049h(InterfaceC2389pw r2, Object r3, int r4) {
        InterfaceC1237bw r42 = this.f8886c;
        if (r42 == null) goto L5;
        r42.getRoot().mo1938e();
    L5:
        this.f8909z = 4;
        this.f8899p = r2;
        if (this.f8888e.f2404i > 3) goto L8;
        Objects.toString(this.f8889f);
        int r22 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
    L8:
        if (r42 == null) goto L10;
        r42.mo2360h(this);
    L10:
        this.f8907x = true;
        List r43 = this.f8896m;     // Catch: Throwable -> L17
        if (r43 == null) goto L19;
        Iterator r44 = r43.iterator();     // Catch: Throwable -> L17
    L15:
        if (r44.hasNext() == false) goto L19;
        ((C1461gk) r44.next()).m2815a(r3);     // Catch: Throwable -> L17
    L19:
        this.f8897n.getClass();     // Catch: Throwable -> L17
        this.f8895l.mo400j(r3);     // Catch: Throwable -> L17
        this.f8907x = false;
        return;
    L17:
        th = move-exception;
        this.f8907x = false;
        throw th;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: i */
    public final boolean mo1940i() {
        Object r0 = this.f8885b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f8909z != 6) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }

    @Override // p000.InterfaceC1026Xv
    public final boolean isRunning() {
        Object r0 = this.f8885b;
        monitor-enter(r0);
        int r1 = this.f8909z;     // Catch: Throwable -> L13
        if (r1 != 2) goto L7;
    L10:
        boolean r12 = true;
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L13
        return r12;
    L7:
        if (r1 == 3) goto L10;
        r12 = false;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: j */
    public final void mo1941j() {
        Object r0 = this.f8885b;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (this.f8907x == true) goto L58;
        this.f8884a.m2744a();     // Catch: Throwable -> L11
        int r1 = AbstractC1510hp.f5351a;     // Catch: Throwable -> L11
        SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L11
        int r2 = 3;
        if (this.f8889f == null) goto L9;
        int r12 = this.f8909z;     // Catch: Throwable -> L11
        if (r12 == 2) goto L56;
        boolean r6 = false;
        if (r12 != 4) goto L29;
        m5048g(this.f8899p, 5, false);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L29:
        List r13 = this.f8896m;     // Catch: Throwable -> L11
        if (r13 == null) goto L36;
        Iterator r14 = r13.iterator();     // Catch: Throwable -> L11
    L34:
        if (r14.hasNext() == false) goto L36;
        C1461gk r3 = (C1461gk) r14.next();     // Catch: Throwable -> L11
    L36:
        this.f8909z = 3;     // Catch: Throwable -> L11
        if (AbstractC2622vD.m5138i(this.f8892i, this.f8893j) == false) goto L39;
        m5050l(this.f8892i, this.f8893j);     // Catch: Throwable -> L11
    L40:
        int r15 = this.f8909z;     // Catch: Throwable -> L11
        if (r15 == 2) goto L43;
        if (r15 == 3) goto L43;
    L51:
        if (f8883A == false) goto L53;
        SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L11
    L53:
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L43:
        InterfaceC1237bw r16 = this.f8886c;     // Catch: Throwable -> L11
        if (r16 != null) goto L46;
    L47:
        r6 = true;
    L48:
        if (r6 == false) goto L51;
        this.f8895l.mo398h(m5046b());     // Catch: Throwable -> L11
        goto L51
    L46:
        if (r16.mo2357b(this) == false) goto L48;
    L39:
        this.f8895l.mo396f(this);     // Catch: Throwable -> L11
        goto L40
    L56:
        throw new IllegalArgumentException("Cannot restart a running request");     // Catch: Throwable -> L11
    L9:
        if (AbstractC2622vD.m5138i(this.f8892i, this.f8893j) == false) goto L14;
        this.f8905v = this.f8892i;     // Catch: Throwable -> L11
        this.f8906w = this.f8893j;     // Catch: Throwable -> L11
    L14:
        if (this.f8904u != null) goto L17;
        this.f8891h.getClass();     // Catch: Throwable -> L11
        this.f8904u = null;     // Catch: Throwable -> L11
    L17:
        if (this.f8904u != null) goto L19;
        r2 = 5;
    L19:
        m5047c(new C0842Tj("Received null model"), r2);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L58:
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");     // Catch: Throwable -> L11
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: k */
    public final boolean mo1942k() {
        Object r0 = this.f8885b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f8909z != 4) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public final void m5050l(int r23, int r24) {
        C2563ty r1 = this;
        int r0 = r23;
        r1.f8884a.m2744a();
        Object r3 = r1.f8885b;
        monitor-enter(r3);
        boolean r20 = f8883A;     // Catch: Throwable -> L12
        if (r20 == false) goto L9;
        int r4 = AbstractC1510hp.f5351a;     // Catch: Throwable -> L12
        SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L12
    L9:
        if (r1.f8909z == 3) goto L14;
        monitor-exit(r3);     // Catch: Throwable -> L12
        return;
    L14:
        r1.f8909z = 2;     // Catch: Throwable -> L12
        r1.f8891h.getClass();     // Catch: Throwable -> L12
        if (r0 == Integer.MIN_VALUE) goto L18;
        r0 = Math.round(r0 * 1.0f);     // Catch: Throwable -> L12
    L18:
        r1.f8905v = r0;     // Catch: Throwable -> L12
        if (r24 != Integer.MIN_VALUE) goto L21;
        int r02 = r24;
    L22:
        r1.f8906w = r02;     // Catch: Throwable -> L12
        if (r20 == false) goto L25;
        int r03 = AbstractC1510hp.f5351a;     // Catch: Throwable -> L12
        SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L12
    L25:
        C1264cg r2 = r1.f8901r;     // Catch: Throwable -> L12
        C0756Rj r32 = r1.f8888e;     // Catch: Throwable -> L66
        Object r42 = r1.f8889f;     // Catch: Throwable -> L66
        AbstractC2743y5 r6 = r1.f8891h;     // Catch: Throwable -> L66
        InterfaceC0802Sm r5 = r6.f9360i;     // Catch: Throwable -> L64
        int r8 = r1.f8905v;     // Catch: Throwable -> L64
        int r7 = r1.f8906w;     // Catch: Throwable -> L62
        Class r82 = r6.f9364m;     // Catch: Throwable -> L62
        Class r9 = r1.f8890g;     // Catch: Throwable -> L60
        EnumC2688wu r10 = r1.f8894k;     // Catch: Throwable -> L60
        C0922Vd r11 = r6.f9353b;     // Catch: Throwable -> L58
        C0007A6 r12 = r6.f9363l;     // Catch: Throwable -> L58
        boolean r13 = r6.f9361j;     // Catch: Throwable -> L56
        boolean r14 = r6.f9367p;     // Catch: Throwable -> L56
        C2644vt r15 = r6.f9362k;     // Catch: Throwable -> L54
        boolean r04 = r6.f9357f;     // Catch: Throwable -> L54
        boolean r62 = r6.f9368q;     // Catch: Throwable -> L54
        ExecutorC2346p3 r05 = r1.f8898o;     // Catch: Throwable -> L54
        Object r16 = r3;
        r1.f8900q = r2.m2401a(r32, r42, r5, r8, r7, r82, r9, r10, r11, r12, r13, r14, r15, r04, r62, r1, r05);     // Catch: Throwable -> L46
        if (r1.f8909z == 2) goto L48;
        r1.f8900q = null;     // Catch: Throwable -> L46
    L48:
        if (r20 == false) goto L50;
        int r06 = AbstractC1510hp.f5351a;     // Catch: Throwable -> L46
        SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L46
    L50:
        monitor-exit(r16);     // Catch: Throwable -> L46
        return;
    L52:
        th = th;
        Object r17 = r16;
    L68:
        monitor-exit(r17);     // Catch: Throwable -> L46
        throw th;
    L54:
        th = th;
        r17 = r3;
    L56:
        th = th;
        r17 = r3;
    L58:
        th = th;
        r17 = r3;
    L60:
        th = th;
        r17 = r3;
    L62:
        th = th;
        r17 = r3;
    L64:
        th = th;
        r17 = r3;
    L66:
        th = th;
        r17 = r3;
        goto L68
    L21:
        r02 = Math.round(1.0f * r24);     // Catch: Throwable -> L12
    L46:
        th = th;
        r17 = r1;
    L12:
        th = th;
        r17 = r3;
        goto L68
    }

    public final String toString() {
        Object r0 = this.f8885b;
        monitor-enter(r0);
        Object r1 = this.f8889f;     // Catch: Throwable -> L8
        Class r2 = this.f8890g;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return super.toString() + "[model=" + r1 + ", transcodeClass=" + r2 + "]";
    L8:
        th = move-exception;
        throw th;
    }
}
