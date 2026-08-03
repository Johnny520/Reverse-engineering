package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f995a;
    public final /* synthetic */ androidx.recyclerview.widget.k b;

    public d(androidx.recyclerview.widget.k r1, java.util.ArrayList r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f995a = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r13 = this;
            java.util.ArrayList r0 = r13.f995a
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            androidx.recyclerview.widget.k r3 = r13.b
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            androidx.recyclerview.widget.k$a r2 = (androidx.recyclerview.widget.k.a) r2
            r3.getClass()
            androidx.recyclerview.widget.RecyclerView$A r4 = r2.f1002a
            r5 = 0
            if (r4 != 0) goto L1e
            r4 = r5
            goto L20
        L1e:
            android.view.View r4 = r4.f963a
        L20:
            androidx.recyclerview.widget.RecyclerView$A r6 = r2.b
            if (r6 == 0) goto L26
            android.view.View r5 = r6.f963a
        L26:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r6 = r3.r
            long r7 = r3.f
            r9 = 0
            if (r4 == 0) goto L5c
            android.view.ViewPropertyAnimator r10 = r4.animate()
            android.view.ViewPropertyAnimator r10 = r10.setDuration(r7)
            androidx.recyclerview.widget.RecyclerView$A r11 = r2.f1002a
            r6.add(r11)
            int r11 = r2.e
            int r12 = r2.c
            int r11 = r11 - r12
            float r11 = (float) r11
            r10.translationX(r11)
            int r11 = r2.f
            int r12 = r2.d
            int r11 = r11 - r12
            float r11 = (float) r11
            r10.translationY(r11)
            android.view.ViewPropertyAnimator r11 = r10.alpha(r9)
            androidx.recyclerview.widget.i r12 = new androidx.recyclerview.widget.i
            r12.<init>(r3, r2, r10, r4)
            android.view.ViewPropertyAnimator r4 = r11.setListener(r12)
            r4.start()
        L5c:
            if (r5 == 0) goto L6
            android.view.ViewPropertyAnimator r4 = r5.animate()
            androidx.recyclerview.widget.RecyclerView$A r10 = r2.b
            r6.add(r10)
            android.view.ViewPropertyAnimator r6 = r4.translationX(r9)
            android.view.ViewPropertyAnimator r6 = r6.translationY(r9)
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r7)
            r7 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r6 = r6.alpha(r7)
            androidx.recyclerview.widget.j r7 = new androidx.recyclerview.widget.j
            r7.<init>(r3, r2, r4, r5)
            android.view.ViewPropertyAnimator r2 = r6.setListener(r7)
            r2.start()
            goto L6
        L86:
            r0.clear()
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k$a>> r1 = r3.n
            r1.remove(r0)
            return
    }
}
