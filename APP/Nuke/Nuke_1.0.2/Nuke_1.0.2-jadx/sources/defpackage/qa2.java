package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qa2 extends ViewGroup {
    public final int h;
    public final ArrayList i;
    public final ArrayList j;
    public final dq1 k;
    public int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qa2(Context context) {
        super(context);
        this.h = 5;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.j = arrayList2;
        this.k = new dq1(8);
        setClipChildren(false);
        ra2 ra2Var = new ra2(context);
        addView(ra2Var);
        arrayList.add(ra2Var);
        arrayList2.add(ra2Var);
        this.l = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
