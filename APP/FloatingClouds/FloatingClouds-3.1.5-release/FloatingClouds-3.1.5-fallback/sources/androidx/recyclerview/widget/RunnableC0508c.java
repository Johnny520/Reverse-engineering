package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0508c implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f994a;
    public final /* synthetic */ androidx.recyclerview.widget.k b;

    public RunnableC0508c(androidx.recyclerview.widget.k r1, java.util.ArrayList r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f994a = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            java.util.ArrayList r0 = r10.f994a
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            androidx.recyclerview.widget.k r4 = r10.b
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            androidx.recyclerview.widget.k$b r2 = (androidx.recyclerview.widget.k.b) r2
            androidx.recyclerview.widget.RecyclerView$A r5 = r2.f1003a
            r4.getClass()
            android.view.View r7 = r5.f963a
            int r3 = r2.d
            int r6 = r2.b
            int r6 = r3 - r6
            int r3 = r2.e
            int r2 = r2.c
            int r8 = r3 - r2
            r2 = 0
            if (r6 == 0) goto L31
            android.view.ViewPropertyAnimator r3 = r7.animate()
            r3.translationX(r2)
        L31:
            if (r8 == 0) goto L3a
            android.view.ViewPropertyAnimator r3 = r7.animate()
            r3.translationY(r2)
        L3a:
            android.view.ViewPropertyAnimator r9 = r7.animate()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r4.p
            r2.add(r5)
            long r2 = r4.e
            android.view.ViewPropertyAnimator r2 = r9.setDuration(r2)
            androidx.recyclerview.widget.h r3 = new androidx.recyclerview.widget.h
            r3.<init>(r4, r5, r6, r7, r8, r9)
            android.view.ViewPropertyAnimator r2 = r2.setListener(r3)
            r2.start()
            goto L6
        L56:
            r0.clear()
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k$b>> r1 = r4.m
            r1.remove(r0)
            return
    }
}
