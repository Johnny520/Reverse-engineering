package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.compose.foundation.text.C1804;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3369 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f7983;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f7984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f7985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f7986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f7987;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3287 f7988;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5604(AbstractC3317 abstractC3317) {
        int i = abstractC3317.mFlags;
        if (!abstractC3317.isInvalid() && (i & 4) == 0) {
            abstractC3317.getOldPosition();
            abstractC3317.getAbsoluteAdapterPosition();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract boolean mo5527();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo5528();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo5529(AbstractC3317 abstractC3317);

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5605(AbstractC3317 abstractC3317) {
        C3287 c3287 = this.f7988;
        if (c3287 != null) {
            RecyclerView recyclerView = c3287.f7649;
            boolean z = true;
            abstractC3317.setIsRecyclable(true);
            if (abstractC3317.mShadowedHolder != null && abstractC3317.mShadowingHolder == null) {
                abstractC3317.mShadowedHolder = null;
            }
            abstractC3317.mShadowingHolder = null;
            if (abstractC3317.shouldBeKeptAsChild()) {
                return;
            }
            View view = abstractC3317.itemView;
            C3364 c3364 = recyclerView.f7576;
            recyclerView.m5305();
            C3328 c3328 = recyclerView.f7573;
            C3329 c3329 = (C3329) c3328.f7815;
            C3287 c32872 = (C3287) c3328.f7816;
            int i = c3328.f7817;
            if (i != 1) {
                if (i == 2) {
                    C6755.m11870("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    c3328.f7817 = 2;
                    int iIndexOfChild = c32872.f7649.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        c3328.m5507(view);
                    } else if (c3329.m5512(iIndexOfChild)) {
                        c3329.m5517(iIndexOfChild);
                        c3328.m5507(view);
                        c32872.m5393(iIndexOfChild);
                    }
                    if (z) {
                        AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
                        c3364.m5596(abstractC3317M5249);
                        c3364.m5602(abstractC3317M5249);
                        if (RecyclerView.f7522) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.m5300(!z);
                    if (z && abstractC3317.isTmpDetached()) {
                        recyclerView.removeDetachedView(abstractC3317.itemView, false);
                        return;
                    }
                } finally {
                    c3328.f7817 = 0;
                }
            }
            if (((View) c3328.f7813) != view) {
                C6755.m11870("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
            }
            recyclerView.m5300(!z);
            if (z) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract boolean mo5530(AbstractC3317 abstractC3317, AbstractC3317 abstractC33172, C1804 c1804, C1804 c18042);
}
