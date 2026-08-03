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

    public C2409qF(C2712xb c2712xb) {
        super(0);
        this.f8449d = new HashMap();
        this.f8446a = c2712xb;
    }

    /* JADX INFO: renamed from: a */
    public final C2538tF m4847a(WindowInsetsAnimation windowInsetsAnimation) {
        C2538tF c2538tF = (C2538tF) this.f8449d.get(windowInsetsAnimation);
        if (c2538tF == null) {
            c2538tF = new C2538tF(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c2538tF.f8846a = new C2452rF(windowInsetsAnimation);
            }
            this.f8449d.put(windowInsetsAnimation, c2538tF);
        }
        return c2538tF;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        m4847a(windowInsetsAnimation);
        ((View) this.f8446a.f9289e).setTranslationY(0.0f);
        this.f8449d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m4847a(windowInsetsAnimation);
        C2712xb c2712xb = this.f8446a;
        View view = (View) c2712xb.f9289e;
        int[] iArr = (int[]) c2712xb.f9290f;
        view.getLocationOnScreen(iArr);
        c2712xb.f9287c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f8448c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f8448c = arrayList2;
            this.f8447b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM1579j = AbstractC0773S.m1579j(list.get(size));
            C2538tF c2538tFM4847a = m4847a(windowInsetsAnimationM1579j);
            c2538tFM4847a.f8846a.mo4896d(windowInsetsAnimationM1579j.getFraction());
            this.f8448c.add(c2538tFM4847a);
        }
        C0489LF c0489lfM939h = C0489LF.m939h(null, windowInsets);
        this.f8446a.m5285b(c0489lfM939h, this.f8447b);
        return c0489lfM939h.m945g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        m4847a(windowInsetsAnimation);
        C2765yl c2765ylM5338c = C2765yl.m5338c(bounds.getLowerBound());
        C2765yl c2765ylM5338c2 = C2765yl.m5338c(bounds.getUpperBound());
        C2712xb c2712xb = this.f8446a;
        View view = (View) c2712xb.f9289e;
        int[] iArr = (int[]) c2712xb.f9290f;
        view.getLocationOnScreen(iArr);
        int i = c2712xb.f9287c - iArr[1];
        c2712xb.f9288d = i;
        view.setTranslationY(i);
        AbstractC0773S.m1582m();
        return AbstractC0773S.m1577h(c2765ylM5338c.m5339d(), c2765ylM5338c2.m5339d());
    }
}
