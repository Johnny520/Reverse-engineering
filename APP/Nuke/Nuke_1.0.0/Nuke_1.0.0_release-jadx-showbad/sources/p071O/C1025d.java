package p071O;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import me.dartcv.nuke.R;
import p000A.C0038T0;

/* JADX INFO: renamed from: O.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1025d extends ViewGroup {

    /* JADX INFO: renamed from: d */
    public final int f3182d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f3183e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f3184f;

    /* JADX INFO: renamed from: g */
    public final C0038T0 f3185g;

    /* JADX INFO: renamed from: h */
    public int f3186h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1025d(Context context) {
        super(context);
        this.f3182d = 5;
        ArrayList arrayList = new ArrayList();
        this.f3183e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3184f = arrayList2;
        this.f3185g = new C0038T0(10);
        setClipChildren(false);
        C1026e c1026e = new C1026e(context);
        addView(c1026e);
        arrayList.add(c1026e);
        arrayList2.add(c1026e);
        this.f3186h = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
    }
}
