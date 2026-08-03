package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1160i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: da */
/* JADX INFO: loaded from: classes.dex */
public final class C1320da extends AbstractC2251mv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4782a;

    public /* synthetic */ C1320da(int i) {
        this.f4782a = i;
    }

    @Override // p000.AbstractC2251mv
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0038Av c0038Av) {
        switch (this.f4782a) {
            case 0:
                AbstractC0295Gu.m625r(-88270167865397L);
                AbstractC0295Gu.m625r(-88304527603765L);
                AbstractC0295Gu.m625r(-88326002440245L);
                AbstractC0295Gu.m625r(-88356067211317L);
                rect.set(0, AbstractC0295Gu.m616i(8), 0, AbstractC0295Gu.m616i(8));
                break;
            case 1:
                AbstractC0295Gu.m625r(-84705345009717L);
                AbstractC0295Gu.m625r(-84739704748085L);
                AbstractC0295Gu.m625r(-84761179584565L);
                AbstractC0295Gu.m625r(-84791244355637L);
                rect.set(0, AbstractC0295Gu.m616i(8), 0, AbstractC0295Gu.m616i(8));
                break;
            case 2:
                AbstractC0295Gu.m625r(-488595479590965L);
                AbstractC0295Gu.m625r(-488629839329333L);
                AbstractC0295Gu.m625r(-488651314165813L);
                AbstractC0295Gu.m625r(-488681378936885L);
                int iM616i = AbstractC0295Gu.m616i(8);
                if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    rect.set(iM616i, iM616i, iM616i, iM616i);
                } else {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i = layoutParams instanceof C1225bk ? ((C1225bk) layoutParams).f4181e : 0;
                    rect.top = iM616i;
                    rect.bottom = iM616i;
                    if (i != 0) {
                        rect.left = iM616i / 2;
                        rect.right = iM616i;
                    } else {
                        rect.left = iM616i;
                        rect.right = iM616i / 2;
                    }
                }
                break;
            default:
                AbstractC0295Gu.m625r(-485833815619637L);
                AbstractC0295Gu.m625r(-485868175358005L);
                AbstractC0295Gu.m625r(-485889650194485L);
                AbstractC0295Gu.m625r(-485919714965557L);
                int iM616i2 = AbstractC0295Gu.m616i(8);
                AbstractC1160i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof GridLayoutManager)) {
                    rect.set(0, iM616i2, 0, iM616i2);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    int i2 = layoutParams2 instanceof C1225bk ? ((C1225bk) layoutParams2).f4181e : 0;
                    int i3 = ((GridLayoutManager) layoutManager).f3982b;
                    rect.top = iM616i2;
                    rect.bottom = iM616i2;
                    rect.left = i2 == 0 ? iM616i2 : iM616i2 / 2;
                    if (i2 != i3 - 1) {
                        iM616i2 /= 2;
                    }
                    rect.right = iM616i2;
                }
                break;
        }
    }
}
