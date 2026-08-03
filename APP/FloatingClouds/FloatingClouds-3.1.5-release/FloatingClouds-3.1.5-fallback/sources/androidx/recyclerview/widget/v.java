package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f1015a;

    public v(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.<init>()
            r0.f1015a = r1
            return
    }

    public final void a(int r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.f1015a
            android.view.View r1 = r0.getChildAt(r3)
            if (r1 == 0) goto Le
            androidx.recyclerview.widget.RecyclerView.L(r1)
            r1.clearAnimation()
        Le:
            r0.removeViewAt(r3)
            return
    }
}
