package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {
    private final LinearLayoutManager mLayoutManager;
    private ViewPager2.PageTransformer mPageTransformer;

    public PageTransformerAdapter(LinearLayoutManager r1) {
        this.mLayoutManager = r1;
    }

    public ViewPager2.PageTransformer getPageTransformer() {
        return this.mPageTransformer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int r1) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int r4, float r5, int r6) {
        if (this.mPageTransformer == null) goto L13;
        float r52 = -r5;
        int r62 = 0;
    L7:
        if (r62 >= this.mLayoutManager.getChildCount()) goto L16;
        View r0 = this.mLayoutManager.getChildAt(r62);
        if (r0 == null) goto L11;
        this.mPageTransformer.transformPage(r0, (this.mLayoutManager.getPosition(r0) - r4) + r52);
        r62 = r62 + 1;
        goto L7
    L11:
        Locale r53 = Locale.US;
        throw new IllegalStateException("LayoutManager returned a null child at pos " + r62 + "/" + this.mLayoutManager.getChildCount() + " while transforming pages");
    L16:
        return;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int r1) {
    }

    public void setPageTransformer(ViewPager2.PageTransformer r1) {
        this.mPageTransformer = r1;
    }
}
