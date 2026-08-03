package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ev */
/* JADX INFO: loaded from: classes.dex */
public final class C1384ev implements InterfaceC2451rE, InterfaceC2165kv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f4930a;

    public /* synthetic */ C1384ev(RecyclerView r1) {
        this.f4930a = r1;
    }

    /* JADX INFO: renamed from: a */
    public void m2670a(int r3) {
        RecyclerView r0 = this.f4930a;
        View r1 = r0.getChildAt(r3);
        if (r1 == null) goto L5;
        r0.dispatchChildDetached(r1);
        r1.clearAnimation();
    L5:
        r0.removeViewAt(r3);
    }
}
