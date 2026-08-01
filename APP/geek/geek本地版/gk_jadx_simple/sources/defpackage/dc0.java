package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dc0 extends WindowInsetsAnimation$Callback {
    public final ad a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public dc0(ad r2) {
        super(0);
        this.d = new HashMap();
        this.a = r2;
    }

    public final gc0 a(WindowInsetsAnimation r6) {
        gc0 r0 = (gc0) this.d.get(r6);
        if (r0 != null) goto L8;
        r0 = new gc0(0, null, 0);
        if (Build.VERSION.SDK_INT < 30) goto L7;
        r0.a = new ec0(r6);
    L7:
        this.d.put(r6, r0);
    L8:
        return r0;
    }

    public final void onEnd(WindowInsetsAnimation r3) {
        a(r3);
        ((View) this.a.e).setTranslationY(0.0f);
        this.d.remove(r3);
    }

    public final void onPrepare(WindowInsetsAnimation r3) {
        a(r3);
        ad r32 = this.a;
        View r0 = (View) r32.e;
        int[] r1 = (int[]) r32.f;
        r0.getLocationOnScreen(r1);
        r32.c = r1[1];
    }

    public final WindowInsets onProgress(WindowInsets r5, List r6) {
        ArrayList r0 = this.c;
        if (r0 != null) goto L5;
        ArrayList r02 = new ArrayList(r6.size());
        this.c = r02;
        this.b = Collections.unmodifiableList(r02);
    L6:
        int r03 = r6.size() - 1;
    L7:
        if (r03 < 0) goto L9;
        WindowInsetsAnimation r1 = d0.j(r6.get(r03));
        gc0 r2 = a(r1);
        r2.a.d(d0.v(r1));
        this.c.add(r2);
        r03 = r03 - 1;
        goto L7
    L9:
        wc0 r52 = wc0.g(null, r5);
        this.a.a(r52, this.b);
        return r52.f();
    L5:
        r0.clear();
        goto L6
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation r5, WindowInsetsAnimation.Bounds r6) {
        a(r5);
        ep r52 = ep.c(d0.x(r6));
        ep r62 = ep.c(d0.f(r6));
        ad r0 = this.a;
        View r1 = (View) r0.e;
        int[] r2 = (int[]) r0.f;
        r1.getLocationOnScreen(r2);
        int r3 = r0.c - r2[1];
        r0.d = r3;
        r1.setTranslationY(r3);
        d0.m();
        return d0.h(r52.d(), r62.d());
    }
}
