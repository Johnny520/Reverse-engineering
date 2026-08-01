package androidx.core.view;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.appcompat.app.C0076;
import androidx.compose.foundation.layout.AbstractC0626;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2273 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f6600;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f6601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f6602;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2279 f6603;

    public C2273(AbstractC2279 abstractC2279) {
        super(abstractC2279.f6621);
        this.f6600 = new HashMap();
        this.f6603 = abstractC2279;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f6603.mo1468(m4258(windowInsetsAnimation));
        this.f6600.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f6603.mo1466(m4258(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f6601;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f6601 = arrayList2;
            this.f6602 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM1416 = AbstractC0626.m1416(list.get(size));
            C2274 c2274M4258 = m4258(windowInsetsAnimationM1416);
            c2274M4258.f6604.mo4253(windowInsetsAnimationM1416.getFraction());
            this.f6601.add(c2274M4258);
        }
        return this.f6603.mo1465(C2225.m4063(null, windowInsets), this.f6602).m4069();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0076 c0076Mo1467 = this.f6603.mo1467(m4258(windowInsetsAnimation), new C0076(bounds));
        c0076Mo1467.getClass();
        AbstractC0626.m1408();
        return AbstractC0626.m1418(((C7665) c0076Mo1467.f227).m12942(), ((C7665) c0076Mo1467.f228).m12942());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2274 m4258(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f6600;
        C2274 c2274 = (C2274) map.get(windowInsetsAnimation);
        if (c2274 != null) {
            return c2274;
        }
        C2274 c22742 = new C2274(0, null, 0L);
        c22742.f6604 = new C2272(windowInsetsAnimation);
        map.put(windowInsetsAnimation, c22742);
        return c22742;
    }
}
