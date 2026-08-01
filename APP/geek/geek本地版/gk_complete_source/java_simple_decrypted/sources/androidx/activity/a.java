package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.ip;
import defpackage.jq;
import defpackage.k6;
import defpackage.oq;
import defpackage.rw;
import defpackage.sl;
import defpackage.sw;
import defpackage.tw;
import defpackage.vw;
import defpackage.xw;
import defpackage.yl;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Runnable a;
    public final k6 b;
    public sl c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public a(Runnable r5) {
        this.a = r5;
        this.b = new k6();
        int r52 = Build.VERSION.SDK_INT;
        if (r52 >= 33) goto L5;
        return;
    L5:
        if (r52 < 34) goto L7;
        rw r53 = new rw(this, 0);
        rw r0 = new rw(this, 1);
        sw r1 = new sw(0, this);
        sw r2 = new sw(1, this);
        OnBackInvokedCallback r54 = vw.a.a(r53, r0, r1, r2);
    L8:
        this.d = r54;
        return;
    L7:
        sw r55 = new sw(2, this);
        r54 = tw.a.a(r55);
        goto L8
    }

    public final void a(oq r3, sl r4) {
        ip.o("onBackPressedCallback", r4);
        androidx.lifecycle.a r32 = r3.e();
        if (r32.c != jq.a) goto L5;
        return;
    L5:
        OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, r32, r4);
        r4.b.add(r0);
        d();
        r4.c = new xw(0, this);
    }

    public final void b() {
        k6 r0 = this.b;
        r0.getClass();
        ListIterator r02 = r0.listIterator(r0.c);
    L4:
        if (r02.hasPrevious() == false) goto L8;
        Object r1 = r02.previous();
        if (((sl) r1).a == false) goto L4;
    L9:
        sl r12 = (sl) r1;
        this.c = null;
        if (r12 == null) goto L17;
        yl r03 = r12.d;
        r03.t(true);
        if (r03.h.a == false) goto L15;
        r03.G();
        return;
    L15:
        r03.g.b();
        return;
    L17:
        this.a.run();
        return;
    L8:
        r1 = null;
        goto L9
    }

    public final void c(boolean r6) {
        OnBackInvokedDispatcher r0 = this.e;
        if (r0 == null) goto L17;
        OnBackInvokedCallback r1 = this.d;
        if (r1 == null) goto L18;
        tw r3 = tw.a;
        if (r6 == true) goto L9;
    L12:
        if (r6 == false) goto L14;
        return;
    L14:
        if (this.f == false) goto L20;
        r3.c(r0, r1);
        this.f = false;
        return;
    L20:
        return;
    L9:
        if (this.f == true) goto L12;
        r3.b(r0, 0, r1);
        this.f = true;
        return;
    L18:
        return;
    }

    public final void d() {
        boolean r0 = this.g;
        boolean r1 = false;
        k6 r2 = this.b;
        if (r2 != null) goto L5;
    L7:
        Iterator r22 = r2.iterator();
    L9:
        if (r22.hasNext() == false) goto L13;
        if (((sl) r22.next()).a == false) goto L9;
        r1 = true;
    L13:
        this.g = r1;
        if (r1 != r0) goto L16;
        return;
    L16:
        if (Build.VERSION.SDK_INT < 33) goto L23;
        c(r1);
        return;
    L23:
        return;
    L5:
        if (r2.isEmpty() == false) goto L7;
        goto L7
    }
}
