package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h1(Object r1, int r2, Object r3) {
        this.a = r2;
        this.c = r1;
        this.b = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.a;
        int r1 = 0;
        Object r2 = this.c;
        switch(r0) {
            case 0: goto L60;
            case 1: goto L58;
            case 2: goto L56;
            case 3: goto L36;
            case 4: goto L32;
            case 5: goto L28;
            case 6: goto L26;
            case 7: goto L12;
            case 8: goto L10;
            default: goto L4;
        };
    L4:
        ma0 r02 = ((SwipeDismissBehavior) r2).a;
        if (r02 != null) goto L7;
        return;
    L7:
        if (r02.f() == false) goto L91;
        View r03 = (View) this.b;
        WeakHashMap r12 = ja0.a;
        s90.m(r03, this);
        return;
    L91:
        return;
    L10:
        ((yk) this.b).a(r2);
        return;
    L12:
        rq r04 = (rq) r2;
        ke r3 = r04.c;
    L79:
        ((Runnable) this.b).run();     // Catch: Throwable -> L15
    L17:
        Runnable r22 = r04.f();
        if (r22 == null) goto L92;
        this.b = r22;
        r1 = r1 + 1;
        if (r1 < 16) goto L79;
        if (r3.e() == false) goto L79;
        r3.d(r04, this);
        return;
    L92:
        return;
    L15:
        th = move-exception;
        ff.u(wi.a, th);
        goto L17
    L26:
        ((i8) this.b).s((jo) r2);
        return;
    L28:
        ArrayList r05 = (ArrayList) this.b;
        g40 r23 = (g40) r2;
        if (r05.contains(r23) == false) goto L93;
        r05.remove(r23);
        z30.a(r23.c.E, r23.a);
        return;
    L93:
        return;
    L32:
        Typeface r24 = (Typeface) r2;
        zt r06 = (zt) ((l0) this.b).b;
        if (r06 == null) goto L94;
        r06.J(r24);
        return;
    L94:
        return;
    L36:
        Object r07 = this.b;
        Method r13 = s1.d;     // Catch: Throwable -> L40 RuntimeException -> L42
        if (r13 == null) goto L44;
        r13.invoke(r07, new Object[]{r2, Boolean.FALSE, "AppCompat recreation"});     // Catch: Throwable -> L40 RuntimeException -> L42
    L81:
        return;
    L44:
        s1.e.invoke(r07, new Object[]{r2, Boolean.FALSE});     // Catch: Throwable -> L40 RuntimeException -> L42
    L42:
        e = move-exception;
        if (e.getClass() == RuntimeException.class) goto L50;
        return;
    L50:
        if (e.getMessage() != null) goto L52;
        return;
    L52:
        if (e.getMessage().startsWith("Unable to stop") == false) goto L98;
        throw e;
    L98:
        return;
    L40:
        th = move-exception;
        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        return;
    L56:
        ((Application) this.b).unregisterActivityLifecycleCallbacks((r1) r2);
        return;
    L58:
        ((r1) this.b).a = r2;
        return;
    L60:
        f1 r08 = (f1) this.b;
        j1 r25 = (j1) r2;
        ku r32 = r25.c;
        if (r32 == null) goto L65;
        iu r4 = r32.e;
        if (r4 == null) goto L65;
        r4.k(r32);
    L65:
        View r33 = (View) r25.h;
        if (r33 != null) goto L68;
    L77:
        r25.u = null;
        return;
    L68:
        if (r33.getWindowToken() == null) goto L77;
        if (r08.b() == false) goto L73;
    L76:
        r25.s = r08;
        goto L77
    L73:
        if (r08.e == null) goto L77;
        r08.d(0, 0, false, false);
        goto L76
    }

    public /* synthetic */ h1(Object r1, Object r2, int r3, boolean r4) {
        this.a = r3;
        this.b = r1;
        this.c = r2;
    }

    public h1(cg r1, ArrayList r2, g40 r3) {
        this.a = 5;
        this.b = r2;
        this.c = r3;
    }

    public h1(SwipeDismissBehavior r1, View r2, boolean r3) {
        this.a = 9;
        this.c = r1;
        this.b = r2;
    }
}
