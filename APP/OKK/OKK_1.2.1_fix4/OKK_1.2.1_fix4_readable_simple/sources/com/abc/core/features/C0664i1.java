package com.abc.core.features;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0664i1 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2064b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0670k1 f2065c;

    public C0664i1(int r1) {
        this.f2064b = r1;
        switch(r1) {
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        this.f2065c = C0670k1.f2084a;
        return;
    L6:
        this.f2065c = C0670k1.f2084a;
        return;
    L8:
        this.f2065c = C0670k1.f2084a;
        return;
    L10:
        this.f2065c = C0670k1.f2084a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r6) {
        switch(this.f2064b) {
            case 0: goto L40;
            case 1: goto L36;
            case 2: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.f2065c.getClass();
        if (C0670k1.m1685g() == false) goto L48;
        Object r02 = r6.f2669b;
        InputConnection r2 = null;
        if ((r02 instanceof View) == false) goto L11;
        View r03 = (View) r02;
    L12:
        if (r03 != null) goto L15;
        return;
    L15:
        if ((r03 instanceof EditText) == true) goto L21;
        String r1 = r03.getClass().getName();
        if (AbstractC0425j.m1005J0(r1, "EditText", true) == true) goto L21;
        if (AbstractC0425j.m1005J0(r1, "MMEdit", true) == true) goto L21;
        return;
    L21:
        int r12 = 0;
        Object r3 = r03;
    L23:
        if ((r3 instanceof View) == false) goto L51;
        if (r12 >= 20) goto L52;
        if (C0670k1.m1683e(r3) == true) goto L28;
        r3 = ((View) r3).getParent();
        r12 = r12 + 1;
        goto L23
    L28:
        Object r13 = r6.f2672e;
        if ((r13 instanceof InputConnection) == false) goto L31;
        r2 = (InputConnection) r13;
    L31:
        if (r2 == null) goto L50;
        r6.m1946c(new C0667j1(r2, r03, new WeakReference(C0670k1.m1679a(r03))));
        return;
    L50:
        return;
    L52:
        return;
    L51:
        return;
    L11:
        r03 = null;
        goto L12
    L48:
        return;
    L36:
        C0670k1.f2090g = new WeakReference(r6.f2669b);
        if (C0670k1.f2091h != null) goto L53;
        C0670k1 r04 = this.f2065c;
        Class<?> r62 = r6.f2669b.getClass();
        r04.getClass();
        C0670k1.m1688j(r62);
        return;
    L53:
        return;
    L40:
        C0670k1.f2090g = new WeakReference(r6.f2669b);
        if (C0670k1.f2091h != null) goto L54;
        C0670k1 r05 = this.f2065c;
        Class<?> r63 = r6.f2669b.getClass();
        r05.getClass();
        C0670k1.m1688j(r63);
        return;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r5) {
        switch(this.f2064b) {
            case 3: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.f2065c.getClass();
        if (C0670k1.m1685g() == false) goto L36;
        Object[] r02 = r5.f2670c;
        AbstractC0307g.m702d(r02, "args");
        Object r03 = AbstractC0179j.m537n0(2, r02);
        View r3 = null;
        if ((r03 instanceof KeyEvent) == false) goto L11;
        KeyEvent r04 = (KeyEvent) r03;
    L12:
        if (r04 != null) goto L15;
        return;
    L15:
        if (r04.getAction() == 0) goto L18;
        return;
    L18:
        if (r04.getKeyCode() != 67) goto L39;
        Object[] r05 = r5.f2670c;
        AbstractC0307g.m702d(r05, "args");
        Object r06 = AbstractC0179j.m537n0(0, r05);
        if ((r06 instanceof View) == false) goto L23;
        r3 = (View) r06;
    L23:
        Object r07 = C0670k1.m1679a(r3);
        if (r07 != null) goto L29;
        r07 = C0670k1.m1681c();
        if (r07 != null) goto L29;
        return;
    L29:
        if (C0670k1.m1686h(r3, r07) == true) goto L32;
        return;
    L32:
        if (C0670k1.m1689k(r07, "onKey") == false) goto L35;
        r5.m1946c(Boolean.TRUE);
        return;
    L35:
        return;
    L39:
        return;
    L11:
        r04 = null;
        goto L12
    }
}
