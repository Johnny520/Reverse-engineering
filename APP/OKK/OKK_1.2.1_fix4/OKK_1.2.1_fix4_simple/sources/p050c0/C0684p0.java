package p050c0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Field;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0179j;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684p0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2143b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0687q0 f2144c;

    public C0684p0(int r1) {
        this.f2143b = r1;
        switch(r1) {
            case 1: goto L12;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        this.f2144c = C0687q0.f2154a;
        return;
    L6:
        this.f2144c = C0687q0.f2154a;
        return;
    L8:
        this.f2144c = C0687q0.f2154a;
        return;
    L10:
        this.f2144c = C0687q0.f2154a;
        return;
    L12:
        this.f2144c = C0687q0.f2154a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r5) {
        switch(this.f2143b) {
            case 0: goto L88;
            case 1: goto L80;
            case 2: goto L18;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        return;
    L18:
        C0687q0.m1755b();
        if (C0687q0.f2156c == false) goto L117;
        C0687q0 r02 = this.f2144c;
        Object r52 = r5.f2669b;
        AbstractC0307g.m702d(r52, "thisObject");
        r02.getClass();
        C0172c r03 = AbstractC0317q.m714c(r52.getClass().getDeclaredFields());     // Catch: Throwable -> L33
    L23:
        if (r03.hasNext() == false) goto L101;
        Field r1 = (Field) r03.next();     // Catch: Throwable -> L33
        r1.setAccessible(true);     // Catch: Throwable -> L33
        Object r12 = r1.get(r52);     // Catch: Throwable -> L33
        if (r12 == null) goto L23;
        if (r12.getClass().getName().equals("com.tencent.mm.ui.conversation.l5") == false) goto L31;
    L35:
        View r2 = C0687q0.m1761h(r12);     // Catch: Throwable -> L33
        if (r2 == null) goto L39;
        C0687q0.m1762i(r2);     // Catch: Throwable -> L33
        C0687q0.m1759f(r2);     // Catch: Throwable -> L33
    L39:
        if ((r12 instanceof View) == false) goto L44;
        if (C0687q0.m1760g((View) r12) == false) goto L44;
        C0687q0.m1762i((View) r12);     // Catch: Throwable -> L33
        C0687q0.m1759f((View) r12);     // Catch: Throwable -> L33
    L44:
        if ((r12 instanceof ViewGroup) == false) goto L23;
        View r13 = C0687q0.m1758e((ViewGroup) r12);     // Catch: Throwable -> L33
        if (r13 == null) goto L23;
        C0687q0.m1762i(r13);     // Catch: Throwable -> L33
        C0687q0.m1759f(r13);     // Catch: Throwable -> L33
        goto L23
    L31:
        if (AbstractC0433r.m1028C0(r12.getClass().getName(), ".l5") == false) goto L39;
    L101:
        ViewGroup r14 = null;
        if ((r52 instanceof Activity) == false) goto L55;
        Activity r53 = (Activity) r52;     // Catch: Throwable -> L53
    L65:
        if (r53 == null) goto L69;
        Window r54 = r53.getWindow();     // Catch: Throwable -> L53
        if (r54 == null) goto L69;
        View r55 = r54.getDecorView();     // Catch: Throwable -> L53
    L71:
        if ((r55 instanceof ViewGroup) == false) goto L73;
        r14 = (ViewGroup) r55;     // Catch: Throwable -> L53
    L73:
        if (r14 == null) goto L115;
        View r56 = C0687q0.m1758e(r14);     // Catch: Throwable -> L53
        if (r56 == null) goto L116;
        C0687q0.m1762i(r56);     // Catch: Throwable -> L53
        C0687q0.m1759f(r56);     // Catch: Throwable -> L53
        C0687q0.m1765l("decor lt5 hidden");     // Catch: Throwable -> L53
        return;
    L116:
        return;
    L115:
        return;
    L69:
        r55 = null;
        goto L71
    L55:
        Object r04 = AbstractC0358S.m887g(r52, "getContext", new Object[0]);     // Catch: Throwable -> L53
        if ((r04 instanceof Activity) == false) goto L58;
        Activity r05 = (Activity) r04;     // Catch: Throwable -> L53
    L59:
        if (r05 != null) goto L64;
        Object r57 = AbstractC0358S.m887g(r52, "getActivity", new Object[0]);     // Catch: Throwable -> L53
        if ((r57 instanceof Activity) == false) goto L63;
        r53 = (Activity) r57;     // Catch: Throwable -> L53
        goto L65
    L63:
        r53 = null;
        goto L65
    L64:
        r53 = r05;
        goto L65
    L58:
        r05 = null;
    L53:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    L33:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L101
    L117:
        return;
    L80:
        C0687q0.m1755b();
        if (C0687q0.f2156c == false) goto L119;
        C0687q0 r06 = this.f2144c;
        Object r58 = r5.f2669b;
        AbstractC0307g.m702d(r58, "thisObject");
        r06.getClass();
        View r59 = C0687q0.m1761h(r58);
        if (r59 == null) goto L120;
        this.f2144c.getClass();
        C0687q0.m1762i(r59);
        this.f2144c.getClass();
        C0687q0.m1759f(r59);
        return;
    L120:
        return;
    L119:
        return;
    L88:
        C0687q0.m1755b();
        if (C0687q0.f2156c == false) goto L121;
        Object[] r510 = r5.f2670c;
        AbstractC0307g.m702d(r510, "args");
        Object r511 = AbstractC0179j.m537n0(0, r510);
        if ((r511 instanceof View) == false) goto L94;
        View r512 = (View) r511;
    L95:
        if (r512 == null) goto L122;
        this.f2144c.getClass();
        C0687q0.m1762i(r512);
        this.f2144c.getClass();
        C0687q0.m1759f(r512);
        C0687q0 r07 = this.f2144c;
        String r15 = r512.getClass().getSimpleName();
        this.f2144c.getClass();
        String r513 = "setFoldBanner hide " + r15 + " id=" + C0687q0.m1764k(r512);
        r07.getClass();
        C0687q0.m1765l(r513);
        return;
    L122:
        return;
    L94:
        r512 = null;
        goto L95
    L121:
        return;
    L6:
        if (C0687q0.f2156c == false) goto L113;
        Object[] r514 = r5.f2670c;
        AbstractC0307g.m702d(r514, "args");
        Object r515 = AbstractC0179j.m537n0(0, r514);
        if ((r515 instanceof View) == false) goto L11;
        View r516 = (View) r515;
    L12:
        if (r516 == null) goto L114;
        this.f2144c.getClass();
        if (C0687q0.m1760g(r516) == false) goto L112;
        this.f2144c.getClass();
        C0687q0.m1762i(r516);
        this.f2144c.getClass();
        C0687q0.m1759f(r516);
        this.f2144c.getClass();
        C0687q0.m1765l("addView hide fold banner id=" + C0687q0.m1764k(r516));
        return;
    L112:
        return;
    L114:
        return;
    L11:
        r516 = null;
        goto L12
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r4) {
        switch(this.f2143b) {
            case 1: goto L19;
            case 4: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0687q0.m1755b();
        if (C0687q0.f2156c == false) goto L32;
        Object r02 = r4.f2669b;
        if ((r02 instanceof View) == false) goto L11;
        View r03 = (View) r02;
    L12:
        if (r03 != null) goto L15;
        return;
    L15:
        if (C0687q0.m1754a(r03) == false) goto L34;
        r4.f2670c[0] = Float.valueOf(0.0f);
        this.f2144c.getClass();
        C0687q0.m1759f(r03);
        return;
    L34:
        return;
    L11:
        r03 = null;
        goto L12
    L32:
        return;
    L19:
        C0687q0.m1755b();
        if (C0687q0.f2156c == false) goto L36;
        Object r04 = r4.f2670c[0];
        if ((r04 instanceof Integer) == false) goto L25;
        Integer r05 = (Integer) r04;
    L26:
        if (r05 != null) goto L29;
        return;
    L29:
        if (r05.intValue() != 0) goto L35;
        r4.f2670c[0] = 8;
        return;
    L35:
        return;
    L25:
        r05 = null;
        goto L26
    }
}
