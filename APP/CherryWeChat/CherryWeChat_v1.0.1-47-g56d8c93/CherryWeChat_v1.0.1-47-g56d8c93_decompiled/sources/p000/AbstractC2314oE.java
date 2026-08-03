package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: oE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2314oE {
    /* JADX INFO: renamed from: a */
    public static int m4724a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m4725b(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
