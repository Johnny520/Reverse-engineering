package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import defpackage.j6;
import defpackage.l0;
import defpackage.l10;
import defpackage.m10;
import defpackage.nr;
import defpackage.o10;
import defpackage.oq;
import defpackage.or;
import defpackage.rg;
import defpackage.yl;
import defpackage.z30;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final Object j = null;
    public final Object a;
    public final o10 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    static {
        j = new Object();
    }

    public b() {
        this.a = new Object();
        this.b = new o10();
        this.c = 0;
        Object r0 = j;
        this.f = r0;
        this.e = r0;
        this.g = -1;
    }

    public static void a(String r3) {
        ((j6) j6.z().d).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L6;
        return;
    L6:
        throw new IllegalStateException(z30.j("Cannot invoke ", r3, " on a background thread"));
    }

    public final void b(or r5) {
        if (r5.b == true) goto L6;
        return;
    L6:
        if (r5.e() == true) goto L9;
        r5.c(false);
        return;
    L9:
        int r0 = r5.c;
        int r1 = this.g;
        if (r0 >= r1) goto L31;
        r5.c = r1;
        l0 r52 = r5.a;
        Object r02 = this.e;
        r52.getClass();
        oq r03 = (oq) r02;
        rg r12 = (rg) r52.b;
        if (r03 != null) goto L15;
        return;
    L15:
        if (r12.W == false) goto L28;
        View r04 = r12.A();
        if (r04.getParent() != null) goto L26;
        if (r12.a0 != null) goto L21;
        return;
    L21:
        if (yl.A(3) == false) goto L23;
        Log.d("FragmentManager", "DialogFragment " + r52 + " setting the content view on " + r12.a0);
    L23:
        r12.a0.setContentView(r04);
        return;
    L26:
        throw new IllegalStateException("DialogFragment can not be attached to a container view");
    L28:
        return;
    }

    public final void c(or r5) {
        if (this.h == false) goto L6;
        this.i = true;
        return;
    L6:
        this.h = true;
    L7:
        this.i = false;
        if (r5 == null) goto L10;
        b(r5);
        r5 = null;
    L16:
        if (this.i == true) goto L7;
        this.h = false;
        return;
    L10:
        o10 r1 = this.b;
        r1.getClass();
        m10 r2 = new m10(r1);
        r1.c.put(r2, Boolean.FALSE);
    L12:
        if (r2.hasNext() == false) goto L16;
        b((or) ((Map.Entry) r2.next()).getValue());
        if (this.i == false) goto L12;
        goto L16
    }

    public final void d(l0 r5) {
        a("observeForever");
        nr r0 = new nr(this, r5);
        o10 r1 = this.b;
        l10 r2 = r1.a(r5);
        if (r2 == null) goto L5;
        Object r52 = r2.b;
    L10:
        or r53 = (or) r52;
        if ((r53 instanceof LiveData$LifecycleBoundObserver) == true) goto L17;
        if (r53 == null) goto L14;
        return;
    L14:
        r0.c(true);
        return;
    L17:
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    L5:
        l10 r22 = new l10(r5, r0);
        r1.d++;
        l10 r54 = r1.b;
        if (r54 != null) goto L8;
        r1.a = r22;
        r1.b = r22;
    L9:
        r52 = null;
        goto L10
    L8:
        r54.c = r22;
        r22.d = r54;
        r1.b = r22;
        goto L9
    }

    public final void e(Object r2) {
        a("setValue");
        this.g++;
        this.e = r2;
        c(null);
    }
}
