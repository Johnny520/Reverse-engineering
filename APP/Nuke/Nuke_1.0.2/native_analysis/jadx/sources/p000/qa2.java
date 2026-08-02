package p000;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qa2 extends ViewGroup {

    /* JADX INFO: renamed from: h */
    public final int f8855h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f8856i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f8857j;

    /* JADX INFO: renamed from: k */
    public final dq1 f8858k;

    /* JADX INFO: renamed from: l */
    public int f8859l;

    public qa2(Context context) {
        super(context);
        this.f8855h = 5;
        ArrayList arrayList = new ArrayList();
        this.f8856i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f8857j = arrayList2;
        this.f8858k = new dq1(8);
        setClipChildren(false);
        ra2 ra2Var = new ra2(context);
        addView(ra2Var);
        arrayList.add(ra2Var);
        arrayList2.add(ra2Var);
        this.f8859l = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
