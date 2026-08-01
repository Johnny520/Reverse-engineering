package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mh(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r10, MotionEvent r11) {
        switch(this.a) {
            case 0: goto L56;
            default: goto L4;
        };
    L4:
        View r0 = (View) this.b;
        Object r2 = r10.getTag(2115043329);
        h40 r4 = null;
        if ((r2 instanceof h40) == false) goto L7;
        h40 r22 = (h40) r2;
    L8:
        qh r3 = h40.n;
        if (r22 != null) goto L11;
        r22 = new h40(r10, r3);
        r10.setTag(2115043329, r22);
    L11:
        Object r5 = r10.getTag(2115043330);
        if ((r5 instanceof h40) == false) goto L14;
        h40 r52 = (h40) r5;
    L15:
        qh r6 = h40.o;
        if (r52 != null) goto L18;
        r52 = new h40(r10, r6);
        r10.setTag(2115043330, r52);
    L18:
        if (r0 == null) goto L25;
        Object r7 = r0.getTag(2115043331);
        if ((r7 instanceof h40) == false) goto L22;
        h40 r72 = (h40) r7;
    L23:
        if (r72 != null) goto L26;
        r72 = new h40(r0, r3);
        r0.setTag(2115043331, r72);
    L26:
        if (r0 == null) goto L32;
        Object r32 = r0.getTag(2115043332);
        if ((r32 instanceof h40) == false) goto L30;
        r4 = (h40) r32;
    L30:
        if (r4 != null) goto L32;
        h40 r33 = new h40(r0, r6);
        r0.setTag(2115043332, r33);
        r4 = r33;
    L32:
        gn r02 = gn.a;
        String r1 = "key_bottom_bar_vibration";
        r02.getClass();
        boolean r12 = gn.a(r1, true);
        int r34 = r11.getActionMasked();
        if (r34 == 0) goto L47;
        if (r34 != 1) goto L36;
    L38:
        if (r12 == true) goto L40;
    L42:
        r22.j = z30.f(1.0f, 200.0f, 0.4f);
        r52.j = z30.f(1.0f, 200.0f, 0.4f);
        r22.h();
        r52.h();
        if (r72 == null) goto L45;
        r72.j = z30.f(1.0f, 200.0f, 0.25f);
        r72.h();
    L45:
        if (r4 == null) goto L65;
        r4.j = z30.f(1.0f, 200.0f, 0.25f);
        r4.h();
        return false;
    L65:
        return false;
    L40:
        if (r11.getActionMasked() != 1) goto L42;
        gn.i(r10, 2);
        goto L42
    L36:
        if (r34 == 3) goto L38;
        return false;
    L47:
        if (r12 == false) goto L49;
        gn.i(r10, 1);
    L49:
        r22.j = z30.f(0.92f, 1500.0f, 0.7f);
        r52.j = z30.f(0.92f, 1500.0f, 0.7f);
        r22.h();
        r52.h();
        if (r72 == null) goto L52;
        r72.j = z30.f(0.85f, 1500.0f, 0.6f);
        r72.h();
    L52:
        if (r4 == null) goto L67;
        r4.j = z30.f(0.85f, 1500.0f, 0.6f);
        r4.h();
        return false;
    L67:
        return false;
    L22:
        r72 = null;
        goto L23
    L25:
        r72 = null;
        goto L26
    L14:
        r52 = null;
        goto L15
    L7:
        r22 = null;
        goto L8
    L56:
        ph r102 = (ph) this.b;
        if (r11.getAction() != 1) goto L64;
        long r23 = System.currentTimeMillis() - r102.o;
        if (r23 >= 0) goto L61;
    L62:
        r102.m = false;
    L63:
        r102.t();
        r102.m = true;
        r102.o = System.currentTimeMillis();
        goto L64
    L61:
        if (r23 <= 300) goto L63;
    L64:
        return false;
    }
}
