package p037U;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: U.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0386v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f875a;

    public /* synthetic */ C0386v(RecyclerView r1) {
        this.f875a = r1;
    }

    /* JADX INFO: renamed from: a */
    public void m977a(int r3) {
        RecyclerView r02 = this.f875a;
        View r1 = r02.getChildAt(r3);
        if (r1 == null) goto L5;
        RecyclerView.m1301u(r1);
        r1.clearAnimation();
    L5:
        r02.removeViewAt(r3);
    }
}
