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
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2273 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f6599;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f6600;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f6601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2279 f6602;

    public C2273(AbstractC2279 abstractC2279) {
        super(abstractC2279.f6620);
        this.f6599 = new HashMap();
        this.f6602 = abstractC2279;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f6602.mo1458(m4248(windowInsetsAnimation));
        this.f6599.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f6602.mo1456(m4248(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f6600;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f6600 = arrayList2;
            this.f6601 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM1406 = AbstractC0626.m1406(list.get(size));
            C2274 c2274M4248 = m4248(windowInsetsAnimationM1406);
            c2274M4248.f6603.mo4243(windowInsetsAnimationM1406.getFraction());
            this.f6600.add(c2274M4248);
        }
        return this.f6602.mo1455(C2225.m4053(null, windowInsets), this.f6601).m4059();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0076 c0076Mo1457 = this.f6602.mo1457(m4248(windowInsetsAnimation), new C0076(bounds));
        c0076Mo1457.getClass();
        AbstractC0626.m1398();
        return AbstractC0626.m1408(((C7664) c0076Mo1457.f227).m12913(), ((C7664) c0076Mo1457.f228).m12913());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2274 m4248(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f6599;
        C2274 c2274 = (C2274) map.get(windowInsetsAnimation);
        if (c2274 != null) {
            return c2274;
        }
        C2274 c22742 = new C2274(0, null, 0L);
        c22742.f6603 = new C2272(windowInsetsAnimation);
        map.put(windowInsetsAnimation, c22742);
        return c22742;
    }
}
