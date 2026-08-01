package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1936 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f3572;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1946 f3573;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f3574;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f3575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f3576;

    public C1936(Context context) {
        super(context);
        this.f3576 = 5;
        ArrayList arrayList = new ArrayList();
        this.f3574 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3575 = arrayList2;
        this.f3573 = new C1946();
        setClipChildren(false);
        C1949 c1949 = new C1949(context);
        addView(c1949);
        arrayList.add(c1949);
        arrayList2.add(c1949);
        this.f3572 = 1;
        setTag(C0328R.id.hide_in_inspector_tag, Boolean.TRUE);
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
