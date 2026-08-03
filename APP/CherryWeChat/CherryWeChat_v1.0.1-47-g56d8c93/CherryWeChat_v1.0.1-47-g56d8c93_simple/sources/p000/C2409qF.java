package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: qF */
/* JADX INFO: loaded from: classes.dex */
public final class C2409qF extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final C2712xb f8446a;

    /* JADX INFO: renamed from: b */
    public List f8447b;

    /* JADX INFO: renamed from: c */
    public ArrayList f8448c;

    /* JADX INFO: renamed from: d */
    public final HashMap f8449d;

    public C2409qF(C2712xb r2) {
        super(0);
        this.f8449d = new HashMap();
        this.f8446a = r2;
    }

    /* JADX INFO: renamed from: a */
    public final C2538tF m4847a(WindowInsetsAnimation r6) {
        C2538tF r0 = (C2538tF) this.f8449d.get(r6);
        if (r0 != null) goto L8;
        r0 = new C2538tF(0, null, 0);
        if (Build.VERSION.SDK_INT < 30) goto L7;
        r0.f8846a = new C2452rF(r6);
    L7:
        this.f8449d.put(r6, r0);
    L8:
        return r0;
    }

    public final void onEnd(WindowInsetsAnimation r3) {
        m4847a(r3);
        ((View) this.f8446a.f9289e).setTranslationY(0.0f);
        this.f8449d.remove(r3);
    }

    public final void onPrepare(WindowInsetsAnimation r3) {
        m4847a(r3);
        C2712xb r32 = this.f8446a;
        View r0 = (View) r32.f9289e;
        int[] r1 = (int[]) r32.f9290f;
        r0.getLocationOnScreen(r1);
        r32.f9287c = r1[1];
    }

    public final WindowInsets onProgress(WindowInsets r5, List r6) {
        ArrayList r0 = this.f8448c;
        if (r0 != null) goto L5;
        ArrayList r02 = new ArrayList(r6.size());
        this.f8448c = r02;
        this.f8447b = Collections.unmodifiableList(r02);
    L6:
        int r03 = r6.size() - 1;
    L7:
        if (r03 < 0) goto L9;
        WindowInsetsAnimation r1 = AbstractC0773S.m1579j(r6.get(r03));
        C2538tF r2 = m4847a(r1);
        r2.f8846a.mo4896d(AbstractC0773S.m1589t(r1));
        this.f8448c.add(r2);
        r03 = r03 - 1;
        goto L7
    L9:
        C0489LF r52 = C0489LF.m939h(null, r5);
        this.f8446a.m5285b(r52, this.f8447b);
        return r52.m945g();
    L5:
        r0.clear();
        goto L6
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation r5, WindowInsetsAnimation.Bounds r6) {
        m4847a(r5);
        C2765yl r52 = C2765yl.m5338c(AbstractC0773S.m1591v(r6));
        C2765yl r62 = C2765yl.m5338c(AbstractC0773S.m1575f(r6));
        C2712xb r0 = this.f8446a;
        View r1 = (View) r0.f9289e;
        int[] r2 = (int[]) r0.f9290f;
        r1.getLocationOnScreen(r2);
        int r3 = r0.f9287c - r2[1];
        r0.f9288d = r3;
        r1.setTranslationY(r3);
        AbstractC0773S.m1582m();
        return AbstractC0773S.m1577h(r52.m5339d(), r62.m5339d());
    }
}
