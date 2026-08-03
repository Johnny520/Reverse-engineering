package p006D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p085v.C1102c;

/* JADX INFO: renamed from: D.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0090a0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final C0099f f238a;

    /* JADX INFO: renamed from: b */
    public List f239b;

    /* JADX INFO: renamed from: c */
    public ArrayList f240c;

    /* JADX INFO: renamed from: d */
    public final HashMap f241d;

    public C0090a0(C0099f r2) {
        super(0);
        this.f241d = new HashMap();
        this.f238a = r2;
    }

    /* JADX INFO: renamed from: a */
    public final C0096d0 m312a(WindowInsetsAnimation r6) {
        C0096d0 r02 = (C0096d0) this.f241d.get(r6);
        if (r02 != null) goto L8;
        r02 = new C0096d0(0, null, 0);
        if (Build.VERSION.SDK_INT < 30) goto L7;
        r02.f252a = new C0092b0(r6);
    L7:
        this.f241d.put(r6, r02);
    L8:
        return r02;
    }

    public final void onEnd(WindowInsetsAnimation r3) {
        C0099f r02 = this.f238a;
        m312a(r3);
        ((View) r02.f261e).setTranslationY(0.0f);
        this.f241d.remove(r3);
    }

    public final void onPrepare(WindowInsetsAnimation r3) {
        C0099f r02 = this.f238a;
        m312a(r3);
        View r32 = (View) r02.f261e;
        int[] r1 = (int[]) r02.f262f;
        r32.getLocationOnScreen(r1);
        r02.f259c = r1[1];
    }

    public final WindowInsets onProgress(WindowInsets r5, List r6) {
        ArrayList r02 = this.f240c;
        if (r02 != null) goto L5;
        ArrayList r03 = new ArrayList(r6.size());
        this.f240c = r03;
        this.f239b = Collections.unmodifiableList(r03);
    L6:
        int r04 = r6.size() - 1;
    L7:
        if (r04 < 0) goto L9;
        WindowInsetsAnimation r1 = AbstractC0130v.m446k(r6.get(r04));
        C0096d0 r2 = m312a(r1);
        r2.f252a.mo323d(AbstractC0130v.m455t(r1));
        this.f240c.add(r2);
        r04 = r04 - 1;
        goto L7
    L9:
        C0099f r62 = this.f238a;
        C0122q0 r52 = C0122q0.m429d(null, r5);
        r62.m360a(r52, this.f239b);
        return r52.m431c();
    L5:
        r02.clear();
        goto L6
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation r5, WindowInsetsAnimation.Bounds r6) {
        C0099f r02 = this.f238a;
        m312a(r5);
        C1102c r52 = C1102c.m2599c(AbstractC0130v.m457v(r6));
        C1102c r62 = C1102c.m2599c(AbstractC0130v.m442g(r6));
        View r1 = (View) r02.f261e;
        int[] r2 = (int[]) r02.f262f;
        r1.getLocationOnScreen(r2);
        int r3 = r02.f259c - r2[1];
        r02.f260d = r3;
        r1.setTranslationY(r3);
        AbstractC0130v.m450o();
        return AbstractC0130v.m444i(r52.m2600d(), r62.m2600d());
    }
}
