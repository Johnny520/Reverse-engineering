package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends androidx.recyclerview.widget.RecyclerView.i {
    public boolean g;

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean a(androidx.recyclerview.widget.RecyclerView.A r10, androidx.recyclerview.widget.RecyclerView.A r11, androidx.recyclerview.widget.RecyclerView.i.b r12, androidx.recyclerview.widget.RecyclerView.i.b r13) {
            r9 = this;
            int r2 = r12.f969a
            int r3 = r12.b
            boolean r0 = r11.o()
            if (r0 == 0) goto L11
            int r13 = r12.f969a
            int r12 = r12.b
            r5 = r12
            r4 = r13
            goto L17
        L11:
            int r12 = r13.f969a
            int r13 = r13.b
            r4 = r12
            r5 = r13
        L17:
            r0 = r9
            androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.k) r0
            if (r10 != r11) goto L22
            r1 = r10
            boolean r10 = r0.g(r1, r2, r3, r4, r5)
            return r10
        L22:
            r1 = r10
            android.view.View r10 = r1.f963a
            float r12 = r10.getTranslationX()
            float r13 = r10.getTranslationY()
            float r6 = r10.getAlpha()
            r0.l(r1)
            int r7 = r4 - r2
            float r7 = (float) r7
            float r7 = r7 - r12
            int r7 = (int) r7
            int r8 = r5 - r3
            float r8 = (float) r8
            float r8 = r8 - r13
            int r8 = (int) r8
            r10.setTranslationX(r12)
            r10.setTranslationY(r13)
            r10.setAlpha(r6)
            r0.l(r11)
            int r10 = -r7
            float r10 = (float) r10
            android.view.View r12 = r11.f963a
            r12.setTranslationX(r10)
            int r10 = -r8
            float r10 = (float) r10
            r12.setTranslationY(r10)
            r10 = 0
            r12.setAlpha(r10)
            java.util.ArrayList<androidx.recyclerview.widget.k$a> r10 = r0.k
            androidx.recyclerview.widget.k$a r12 = new androidx.recyclerview.widget.k$a
            r12.<init>()
            r12.f1002a = r1
            r12.b = r11
            r12.c = r2
            r12.d = r3
            r12.e = r4
            r12.f = r5
            r10.add(r12)
            r10 = 1
            return r10
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public abstract boolean g(androidx.recyclerview.widget.RecyclerView.A r1, int r2, int r3, int r4, int r5);
}
