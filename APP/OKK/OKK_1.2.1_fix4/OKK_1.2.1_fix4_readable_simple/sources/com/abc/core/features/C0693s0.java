package com.abc.core.features;

import android.R;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0693s0 {

    /* JADX INFO: renamed from: a */
    public static final C0693s0 f2187a = null;

    /* JADX INFO: renamed from: b */
    public static volatile Field f2188b;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2189c = null;

    /* JADX INFO: renamed from: d */
    public static final Handler f2190d = null;

    /* JADX INFO: renamed from: e */
    public static volatile int f2191e;

    /* JADX INFO: renamed from: f */
    public static volatile boolean f2192f;

    static {
        f2187a = new C0693s0();
        f2189c = new AtomicBoolean(false);
        f2190d = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: b */
    public static void m1789b(View r7, int r8) {
        if (r8 <= 12) goto L5;
        return;
    L5:
        ViewGroup r2 = null;
        int r3 = 0;
        if (r7.getVisibility() != 0) goto L63;
        if ((r7 instanceof ViewGroup) == true) goto L63;
        if (r7.isClickable() == true) goto L63;
        if (r7.isLongClickable() == true) goto L63;
        if (r7.getAlpha() <= 0.01f) goto L63;
        int r02 = r7.getHeight();
        Integer r4 = Integer.valueOf(r02);
        if (r02 > 0) goto L23;
        r4 = null;
    L23:
        if (r4 == null) goto L25;
        int r03 = r4.intValue();
    L32:
        int r42 = r7.getWidth();
        Integer r5 = Integer.valueOf(r42);
        if (r42 > 0) goto L36;
        r5 = null;
    L36:
        if (r5 == null) goto L38;
        int r43 = r5.intValue();
    L45:
        int r52 = Math.max(4, ((int) (r7.getResources().getDisplayMetrics().density * 1.5f)) + 1);
        if (1 > r03) goto L63;
        if (r03 > r52) goto L63;
        Object r04 = r7.getParent();
        if ((r04 instanceof View) == false) goto L51;
        View r05 = (View) r04;
    L52:
        if (r05 == null) goto L54;
        int r06 = r05.getWidth();
    L56:
        if (r43 == (-1)) goto L60;
        if (r06 <= 0) goto L60;
        if (r43 < (r06 / 4)) goto L63;
    L60:
        r7.setVisibility(8);
        return;
    L54:
        r06 = 0;
        goto L56
    L51:
        r05 = null;
        goto L52
    L38:
        ViewGroup.LayoutParams r44 = r7.getLayoutParams();
        if (r44 == null) goto L41;
        Integer r45 = Integer.valueOf(r44.width);
    L42:
        if (r45 == null) goto L44;
        r43 = r45.intValue();
        goto L45
    L44:
        r43 = 0;
        goto L45
    L41:
        r45 = null;
        goto L42
    L25:
        ViewGroup.LayoutParams r07 = r7.getLayoutParams();
        if (r07 == null) goto L28;
        Integer r08 = Integer.valueOf(r07.height);
    L29:
        if (r08 == null) goto L31;
        r03 = r08.intValue();
        goto L32
    L31:
        r03 = 0;
        goto L32
    L28:
        r08 = null;
    L63:
        if ((r7 instanceof ViewGroup) == false) goto L65;
        r2 = (ViewGroup) r7;
    L65:
        if (r2 != null) goto L67;
        return;
    L67:
        int r72 = r2.getChildCount();
        if (r72 <= 120) goto L70;
        r72 = 120;
    L70:
        if (r3 >= r72) goto L76;
        View r09 = r2.getChildAt(r3);
        if (r09 == null) goto L75;
        m1789b(r09, r8 + 1);
    L75:
        r3 = r3 + 1;
        goto L70
    }

    /* JADX INFO: renamed from: c */
    public static void m1790c(String r2) {
        AbstractC0762d.m1954d("[OKK-HomeDivider] " + r2);     // Catch: Throwable -> L5
        return;
    }

    /* JADX INFO: renamed from: a */
    public final void m1791a(Object r10) {
        Object r02 = null;
        Field r1 = f2188b;     // Catch: Throwable -> L6
        if (r1 == null) goto L8;
        Object r12 = r1.get(r10);     // Catch: Throwable -> L6
    L10:
        if ((r12 instanceof ListView) == false) goto L13;
        Object r13 = (ListView) r12;     // Catch: Throwable -> L6
    L16:
        if ((r13 instanceof C0140f) == false) goto L18;
        r13 = null;
    L18:
        ListView r14 = (ListView) r13;
        if (r14 == null) goto L86;
        r14.setDivider(null);     // Catch: Throwable -> L22
    L78:
        r14.setDividerHeight(0);     // Catch: Throwable -> L26
    L28:
        int r3 = r14.getChildCount();
        int r4 = 0;
    L29:
        if (r4 >= r3) goto L86;
        View r5 = r14.getChildAt(r4);
        if (r5 == null) goto L43;
        int r6 = f2191e;
        if (r6 == 0) goto L42;
        View r62 = r5.findViewById(r6);
        if (r62 == null) goto L42;
        if (r62.getVisibility() == 8) goto L42;
        r62.setVisibility(8);
    L42:
        m1789b(r5, 0);
    L43:
        r4 = r4 + 1;
    L26:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L22:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L86:
        Object r32 = AbstractC0358S.m887g(r10, "getView", new Object[0]);     // Catch: Throwable -> L48
        if ((r32 instanceof View) == false) goto L50;
        Object r33 = (View) r32;     // Catch: Throwable -> L48
    L53:
        if ((r33 instanceof C0140f) == false) goto L55;
        r33 = null;
    L55:
        View r34 = (View) r33;
        if (r34 == null) goto L80;
        View r15 = r34;
    L76:
        m1789b(r15, 0);
        return;
    L80:
        Object r102 = AbstractC0358S.m887g(r10, "findViewById", new Object[]{Integer.valueOf(R.id.content)});     // Catch: Throwable -> L61
        if ((r102 instanceof View) == false) goto L63;
        Object r103 = (View) r102;     // Catch: Throwable -> L61
    L66:
        if ((r103 instanceof C0140f) == true) goto L69;
        r02 = r103;
    L69:
        View r03 = (View) r02;
        r15 = r14;
        if (r03 != null) goto L74;
        if (r14 != null) goto L76;
        return;
    L74:
        r15 = r03;
        goto L76
    L63:
        r103 = null;
    L61:
        th = move-exception;
        r103 = AbstractC0040p.m116u(th);
        goto L66
    L50:
        r33 = null;
    L48:
        th = move-exception;
        r33 = AbstractC0040p.m116u(th);
        goto L53
    L13:
        r13 = null;
        goto L16
    L8:
        r12 = null;
    L6:
        th = move-exception;
        r13 = AbstractC0040p.m116u(th);
        goto L16
    }
}
