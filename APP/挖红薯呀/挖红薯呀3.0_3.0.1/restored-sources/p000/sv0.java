package p000;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class sv0 extends ViewGroup {

    /* JADX INFO: renamed from: d */
    public final int f5846d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f5847e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f5848f;

    /* JADX INFO: renamed from: g */
    public final C0111d f5849g;

    /* JADX INFO: renamed from: h */
    public int f5850h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sv0(Context context) {
        super(context);
        this.f5846d = 5;
        ArrayList arrayList = new ArrayList();
        this.f5847e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f5848f = arrayList2;
        this.f5849g = new C0111d(18);
        setClipChildren(false);
        tv0 tv0Var = new tv0(context);
        addView(tv0Var);
        arrayList.add(tv0Var);
        arrayList2.add(tv0Var);
        this.f5850h = 1;
        setTag(C0587R.id.hide_in_inspector_tag, Boolean.TRUE);
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
