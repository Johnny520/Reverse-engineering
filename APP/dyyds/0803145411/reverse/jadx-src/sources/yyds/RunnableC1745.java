package yyds;

import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛸᛳᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1745 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f8801;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C2181 f8802;

    public /* synthetic */ RunnableC1745(LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181, int i) {
        this.f8801 = i;
        this.f8802 = layoutInflaterFactory2C2181;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f8801;
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f8802;
        switch (i) {
            case 0:
                if ((layoutInflaterFactory2C2181.f10721 & 1) != 0) {
                    layoutInflaterFactory2C2181.m4160(0);
                }
                if ((layoutInflaterFactory2C2181.f10721 & 4096) != 0) {
                    layoutInflaterFactory2C2181.m4160(108);
                }
                layoutInflaterFactory2C2181.f10692 = false;
                layoutInflaterFactory2C2181.f10721 = 0;
                break;
            default:
                layoutInflaterFactory2C2181.f10683.showAtLocation(layoutInflaterFactory2C2181.f10695, 55, 0, 0);
                C0140 c0140 = layoutInflaterFactory2C2181.f10694;
                if (c0140 != null) {
                    c0140.m627();
                }
                if (layoutInflaterFactory2C2181.f10706 && (viewGroup = layoutInflaterFactory2C2181.f10675) != null) {
                    WeakHashMap weakHashMap = AbstractC1640.f8352;
                    if (viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C2181.f10695.setAlpha(0.0f);
                        C0140 c0140M3343 = AbstractC1640.m3343(layoutInflaterFactory2C2181.f10695);
                        c0140M3343.m626(1.0f);
                        layoutInflaterFactory2C2181.f10694 = c0140M3343;
                        c0140M3343.m629(new C1469(0, this));
                    }
                }
                layoutInflaterFactory2C2181.f10695.setAlpha(1.0f);
                layoutInflaterFactory2C2181.f10695.setVisibility(0);
                break;
        }
    }
}
