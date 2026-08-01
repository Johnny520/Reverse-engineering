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
public final class ic0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final C0407kd f2365a;

    /* JADX INFO: renamed from: b */
    public List f2366b;

    /* JADX INFO: renamed from: c */
    public ArrayList f2367c;

    /* JADX INFO: renamed from: d */
    public final HashMap f2368d;

    public ic0(C0407kd c0407kd) {
        super(0);
        this.f2368d = new HashMap();
        this.f2365a = c0407kd;
    }

    /* JADX INFO: renamed from: a */
    public final lc0 m1502a(WindowInsetsAnimation windowInsetsAnimation) {
        lc0 lc0Var = (lc0) this.f2368d.get(windowInsetsAnimation);
        if (lc0Var == null) {
            lc0Var = new lc0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                lc0Var.f2997a = new jc0(windowInsetsAnimation);
            }
            this.f2368d.put(windowInsetsAnimation, lc0Var);
        }
        return lc0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        m1502a(windowInsetsAnimation);
        ((View) this.f2365a.f2822e).setTranslationY(0.0f);
        this.f2368d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m1502a(windowInsetsAnimation);
        C0407kd c0407kd = this.f2365a;
        View view = (View) c0407kd.f2822e;
        int[] iArr = (int[]) c0407kd.f2823f;
        view.getLocationOnScreen(iArr);
        c0407kd.f2820c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2367c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2367c = arrayList2;
            this.f2366b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM796j = AbstractC0134d0.m796j(list.get(size));
            lc0 lc0VarM1502a = m1502a(windowInsetsAnimationM796j);
            lc0VarM1502a.f2997a.mo1601d(windowInsetsAnimationM796j.getFraction());
            this.f2367c.add(lc0VarM1502a);
        }
        bd0 bd0VarM515g = bd0.m515g(null, windowInsets);
        this.f2365a.m1676a(bd0VarM515g, this.f2366b);
        return bd0VarM515g.m520f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        m1502a(windowInsetsAnimation);
        C0346ip c0346ipM1525c = C0346ip.m1525c(bounds.getLowerBound());
        C0346ip c0346ipM1525c2 = C0346ip.m1525c(bounds.getUpperBound());
        C0407kd c0407kd = this.f2365a;
        View view = (View) c0407kd.f2822e;
        int[] iArr = (int[]) c0407kd.f2823f;
        view.getLocationOnScreen(iArr);
        int i = c0407kd.f2820c - iArr[1];
        c0407kd.f2821d = i;
        view.setTranslationY(i);
        AbstractC0134d0.m799m();
        return AbstractC0134d0.m794h(c0346ipM1525c.m1526d(), c0346ipM1525c2.m1526d());
    }
}
