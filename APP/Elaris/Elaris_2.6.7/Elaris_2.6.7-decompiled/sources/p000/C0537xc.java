package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: xc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0537xc {

    /* JADX INFO: renamed from: a */
    public final int f1067a;

    /* JADX INFO: renamed from: b */
    public final View f1068b;

    /* JADX INFO: renamed from: c */
    public final View f1069c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0537xc(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        this.f1067a = childCount;
        this.f1068b = childCount == 0 ? null : viewGroup.getChildAt(0);
        this.f1069c = childCount != 0 ? viewGroup.getChildAt(childCount - 1) : null;
    }
}
