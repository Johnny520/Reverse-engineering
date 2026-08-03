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

    public /* synthetic */ C1320da(int r1) {
        this.f4782a = r1;
    }

    @Override // p000.AbstractC2251mv
    public final void getItemOffsets(Rect r3, View r4, RecyclerView r5, C0038Av r6) {
        switch(this.f4782a) {
            case 0: goto L34;
            case 1: goto L32;
            case 2: goto L20;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-485833815619637L);
        AbstractC0295Gu.m625r(-485868175358005L);
        AbstractC0295Gu.m625r(-485889650194485L);
        AbstractC0295Gu.m625r(-485919714965557L);
        int r62 = AbstractC0295Gu.m616i(8);
        AbstractC1160i r52 = r5.getLayoutManager();
        int r1 = 0;
        if ((r52 instanceof GridLayoutManager) == false) goto L18;
        ViewGroup.LayoutParams r42 = r4.getLayoutParams();
        if ((r42 instanceof C1225bk) == false) goto L9;
        r1 = ((C1225bk) r42).f4181e;
    L9:
        int r43 = ((GridLayoutManager) r52).f3982b;
        r3.top = r62;
        r3.bottom = r62;
        if (r1 != 0) goto L12;
        int r53 = r62;
    L13:
        r3.left = r53;
        if (r1 == (r43 - 1)) goto L17;
        r62 = r62 / 2;
    L17:
        r3.right = r62;
        return;
    L12:
        r53 = r62 / 2;
        goto L13
    L18:
        r3.set(0, r62, 0, r62);
        return;
    L20:
        AbstractC0295Gu.m625r(-488595479590965L);
        AbstractC0295Gu.m625r(-488629839329333L);
        AbstractC0295Gu.m625r(-488651314165813L);
        AbstractC0295Gu.m625r(-488681378936885L);
        int r63 = AbstractC0295Gu.m616i(8);
        if ((r5.getLayoutManager() instanceof GridLayoutManager) == false) goto L30;
        ViewGroup.LayoutParams r44 = r4.getLayoutParams();
        if ((r44 instanceof C1225bk) == false) goto L25;
        int r45 = ((C1225bk) r44).f4181e;
    L26:
        r3.top = r63;
        r3.bottom = r63;
        if (r45 != 0) goto L29;
        r3.left = r63;
        r3.right = r63 / 2;
        return;
    L29:
        r3.left = r63 / 2;
        r3.right = r63;
        return;
    L25:
        r45 = 0;
        goto L26
    L30:
        r3.set(r63, r63, r63, r63);
        return;
    L32:
        AbstractC0295Gu.m625r(-84705345009717L);
        AbstractC0295Gu.m625r(-84739704748085L);
        AbstractC0295Gu.m625r(-84761179584565L);
        AbstractC0295Gu.m625r(-84791244355637L);
        r3.set(0, AbstractC0295Gu.m616i(8), 0, AbstractC0295Gu.m616i(8));
        return;
    L34:
        AbstractC0295Gu.m625r(-88270167865397L);
        AbstractC0295Gu.m625r(-88304527603765L);
        AbstractC0295Gu.m625r(-88326002440245L);
        AbstractC0295Gu.m625r(-88356067211317L);
        r3.set(0, AbstractC0295Gu.m616i(8), 0, AbstractC0295Gu.m616i(8));
    }
}
