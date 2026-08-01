package androidx.core.view;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.appcompat.app.C0923;
import androidx.compose.foundation.layout.AbstractC1467;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3106 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f6945;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f6946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f6947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3112 f6948;

    public C3106(AbstractC3112 abstractC3112) {
        super(abstractC3112.f6966);
        this.f6945 = new HashMap();
        this.f6948 = abstractC3112;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f6948.mo2028(m4818(windowInsetsAnimation));
        this.f6945.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f6948.mo2026(m4818(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f6946;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f6946 = arrayList2;
            this.f6947 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM1976 = AbstractC1467.m1976(list.get(size));
            C3107 c3107M4818 = m4818(windowInsetsAnimationM1976);
            c3107M4818.f6949.mo4813(windowInsetsAnimationM1976.getFraction());
            this.f6946.add(c3107M4818);
        }
        return this.f6948.mo2025(C3058.m4623(null, windowInsets), this.f6947).m4629();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0923 c0923Mo2027 = this.f6948.mo2027(m4818(windowInsetsAnimation), new C0923(bounds));
        c0923Mo2027.getClass();
        AbstractC1467.m1968();
        return AbstractC1467.m1978(((C8494) c0923Mo2027.f572).m13501(), ((C8494) c0923Mo2027.f573).m13501());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3107 m4818(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f6945;
        C3107 c3107 = (C3107) map.get(windowInsetsAnimation);
        if (c3107 != null) {
            return c3107;
        }
        C3107 c31072 = new C3107(0, null, 0L);
        c31072.f6949 = new C3105(windowInsetsAnimation);
        map.put(windowInsetsAnimation, c31072);
        return c31072;
    }
}
