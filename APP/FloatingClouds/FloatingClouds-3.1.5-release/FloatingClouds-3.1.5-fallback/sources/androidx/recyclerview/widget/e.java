package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f996a;
    public final /* synthetic */ androidx.recyclerview.widget.k b;

    public e(androidx.recyclerview.widget.k r1, java.util.ArrayList r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f996a = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            java.util.ArrayList r0 = r9.f996a
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            androidx.recyclerview.widget.k r3 = r9.b
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            androidx.recyclerview.widget.RecyclerView$A r2 = (androidx.recyclerview.widget.RecyclerView.A) r2
            r3.getClass()
            android.view.View r4 = r2.f963a
            android.view.ViewPropertyAnimator r5 = r4.animate()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r6 = r3.o
            r6.add(r2)
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r6 = r5.alpha(r6)
            long r7 = r3.c
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r7)
            androidx.recyclerview.widget.g r7 = new androidx.recyclerview.widget.g
            r7.<init>(r4, r5, r3, r2)
            android.view.ViewPropertyAnimator r2 = r6.setListener(r7)
            r2.start()
            goto L6
        L3b:
            r0.clear()
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A>> r1 = r3.l
            r1.remove(r0)
            return
    }
}
