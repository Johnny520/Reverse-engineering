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

    public C0090a0(C0099f c0099f) {
        super(0);
        this.f241d = new HashMap();
        this.f238a = c0099f;
    }

    /* JADX INFO: renamed from: a */
    public final C0096d0 m312a(WindowInsetsAnimation windowInsetsAnimation) {
        C0096d0 c0096d0 = (C0096d0) this.f241d.get(windowInsetsAnimation);
        if (c0096d0 == null) {
            c0096d0 = new C0096d0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0096d0.f252a = new C0092b0(windowInsetsAnimation);
            }
            this.f241d.put(windowInsetsAnimation, c0096d0);
        }
        return c0096d0;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0099f c0099f = this.f238a;
        m312a(windowInsetsAnimation);
        ((View) c0099f.f261e).setTranslationY(0.0f);
        this.f241d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0099f c0099f = this.f238a;
        m312a(windowInsetsAnimation);
        View view = (View) c0099f.f261e;
        int[] iArr = (int[]) c0099f.f262f;
        view.getLocationOnScreen(iArr);
        c0099f.f259c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f240c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f240c = arrayList2;
            this.f239b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM446k = AbstractC0130v.m446k(list.get(size));
            C0096d0 c0096d0M312a = m312a(windowInsetsAnimationM446k);
            c0096d0M312a.f252a.mo323d(windowInsetsAnimationM446k.getFraction());
            this.f240c.add(c0096d0M312a);
        }
        C0099f c0099f = this.f238a;
        C0122q0 c0122q0M429d = C0122q0.m429d(null, windowInsets);
        c0099f.m360a(c0122q0M429d, this.f239b);
        return c0122q0M429d.m431c();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0099f c0099f = this.f238a;
        m312a(windowInsetsAnimation);
        C1102c c1102cM2599c = C1102c.m2599c(bounds.getLowerBound());
        C1102c c1102cM2599c2 = C1102c.m2599c(bounds.getUpperBound());
        View view = (View) c0099f.f261e;
        int[] iArr = (int[]) c0099f.f262f;
        view.getLocationOnScreen(iArr);
        int i2 = c0099f.f259c - iArr[1];
        c0099f.f260d = i2;
        view.setTranslationY(i2);
        AbstractC0130v.m450o();
        return AbstractC0130v.m444i(c1102cM2599c.m2600d(), c1102cM2599c2.m2600d());
    }
}
