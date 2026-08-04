package yyds;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: yyds.ᛵᛳᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1059 extends WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2133 f4828;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public ArrayList f4829;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final HashMap f4830;

    public C1059(C2133 c2133) {
        super(1);
        this.f4830 = new HashMap();
        this.f4828 = c2133;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        m2250(windowInsetsAnimation);
        C2173 c2173 = (C2173) this.f4828.f10553;
        int i = DialogXBaseRelativeLayout.f416;
        c2173.f10650 = false;
        this.f4830.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m2250(windowInsetsAnimation);
        ((C2173) this.f4828.f10553).f10650 = true;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f4829;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f4829 = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            C0537 c0537M2250 = m2250(windowInsetsAnimation);
            ((WindowInsetsAnimation) c0537M2250.f2573.f10074).setFraction(windowInsetsAnimation.getFraction());
            this.f4829.add(c0537M2250);
        }
        C2693 c2693M4783 = C2693.m4783(null, windowInsets);
        C2133 c2133 = this.f4828;
        C2173 c2173 = (C2173) c2133.f10553;
        Objects.toString(c2693M4783);
        int i = DialogXBaseRelativeLayout.f416;
        c2173.m4141(c2693M4783, new C2542((C2542) c2133.f10555));
        return c2693M4783.m4784();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        m2250(windowInsetsAnimation);
        return new WindowInsetsAnimation.Bounds(C1870.m3655(bounds.getLowerBound()).m3656(), C1870.m3655(bounds.getUpperBound()).m3656());
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0537 m2250(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f4830;
        C0537 c0537 = (C0537) map.get(windowInsetsAnimation);
        if (c0537 != null) {
            return c0537;
        }
        C0537 c05372 = new C0537();
        new WindowInsetsAnimation(0, null, 0L);
        c05372.f2573 = new C2014(25, windowInsetsAnimation);
        map.put(windowInsetsAnimation, c05372);
        return c05372;
    }
}
