package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k4(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L39;
            case 1: goto L32;
            case 2: goto L16;
            default: goto L4;
        };
    L4:
        q40 r12 = (q40) r1;
        bv r02 = r12.h;
        if (r12.b() == true) goto L7;
        return;
    L7:
        if (r02.y == true) goto L48;
        View r2 = r12.m;
        if (r2 != null) goto L11;
    L14:
        r12.dismiss();
        return;
    L11:
        if (r2.isShown() == false) goto L14;
        r02.f();
        return;
    L48:
        return;
    L16:
        t8 r13 = (t8) r1;
        ArrayList r03 = r13.h;
        if (r13.b() == true) goto L19;
        return;
    L19:
        if (r03.size() <= 0) goto L51;
        int r22 = 0;
        if (((s8) r03.get(0)).a.y == true) goto L52;
        View r3 = r13.o;
        if (r3 != null) goto L25;
    L30:
        r13.dismiss();
        return;
    L25:
        if (r3.isShown() == false) goto L30;
        int r14 = r03.size();
    L28:
        if (r22 >= r14) goto L53;
        Object r32 = r03.get(r22);
        r22 = r22 + 1;
        ((s8) r32).a.f();
        goto L28
    L53:
        return;
    L52:
        return;
    L51:
        return;
    L32:
        s4 r15 = (s4) r1;
        v4 r04 = r15.G;
        r15.getClass();
        WeakHashMap r23 = ja0.a;
        if (v90.b(r04) == true) goto L35;
    L37:
        r15.dismiss();
        return;
    L35:
        if (r04.getGlobalVisibleRect(r15.E) == false) goto L37;
        r15.s();
        r15.f();
        return;
    L39:
        v4 r16 = (v4) r1;
        if (r16.getInternalPopup().b() == true) goto L42;
        r16.f.e(m4.b(r16), m4.a(r16));
    L42:
        ViewTreeObserver r05 = r16.getViewTreeObserver();
        if (r05 == null) goto L55;
        l4.a(r05, this);
        return;
    }
}
