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

/* JADX INFO: loaded from: classes.dex */
public final class dc0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final C0014ad f1418a;

    /* JADX INFO: renamed from: b */
    public List f1419b;

    /* JADX INFO: renamed from: c */
    public ArrayList f1420c;

    /* JADX INFO: renamed from: d */
    public final HashMap f1421d;

    public dc0(C0014ad c0014ad) {
        super(0);
        this.f1421d = new HashMap();
        this.f1418a = c0014ad;
    }

    /* JADX INFO: renamed from: a */
    public final gc0 m939a(WindowInsetsAnimation windowInsetsAnimation) {
        gc0 gc0Var = (gc0) this.f1421d.get(windowInsetsAnimation);
        if (gc0Var == null) {
            gc0Var = new gc0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                gc0Var.f2123a = new ec0(windowInsetsAnimation);
            }
            this.f1421d.put(windowInsetsAnimation, gc0Var);
        }
        return gc0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        m939a(windowInsetsAnimation);
        ((View) this.f1418a.f134e).setTranslationY(0.0f);
        this.f1421d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m939a(windowInsetsAnimation);
        C0014ad c0014ad = this.f1418a;
        View view = (View) c0014ad.f134e;
        int[] iArr = (int[]) c0014ad.f135f;
        view.getLocationOnScreen(iArr);
        c0014ad.f132c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f1420c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f1420c = arrayList2;
            this.f1419b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM846j = AbstractC0134d0.m846j(list.get(size));
            gc0 gc0VarM939a = m939a(windowInsetsAnimationM846j);
            gc0VarM939a.f2123a.mo1018d(windowInsetsAnimationM846j.getFraction());
            this.f1420c.add(gc0VarM939a);
        }
        wc0 wc0VarM2563g = wc0.m2563g(null, windowInsets);
        this.f1418a.m87a(wc0VarM2563g, this.f1419b);
        return wc0VarM2563g.m2568f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        m939a(windowInsetsAnimation);
        C0195ep c0195epM1051c = C0195ep.m1051c(bounds.getLowerBound());
        C0195ep c0195epM1051c2 = C0195ep.m1051c(bounds.getUpperBound());
        C0014ad c0014ad = this.f1418a;
        View view = (View) c0014ad.f134e;
        int[] iArr = (int[]) c0014ad.f135f;
        view.getLocationOnScreen(iArr);
        int i = c0014ad.f132c - iArr[1];
        c0014ad.f133d = i;
        view.setTranslationY(i);
        AbstractC0134d0.m849m();
        return AbstractC0134d0.m844h(c0195epM1051c.m1052d(), c0195epM1051c2.m1052d());
    }
}
