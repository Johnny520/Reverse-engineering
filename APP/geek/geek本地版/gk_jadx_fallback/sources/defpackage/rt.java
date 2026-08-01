package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rt extends androidx.recyclerview.widget.LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ defpackage.ut F;

    public rt(defpackage.ut r1, int r2, int r3) {
            r0 = this;
            r0.F = r1
            r0.E = r3
            r0.<init>(r2)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final void v0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            n8 r0 = new n8
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r0.a = r3
            r1.w0(r0)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void y0(defpackage.yz r4, int[] r5) {
            r3 = this;
            int r4 = r3.E
            r0 = 1
            r1 = 0
            ut r2 = r3.F
            if (r4 != 0) goto L19
            androidx.recyclerview.widget.RecyclerView r4 = r2.Y
            int r4 = r4.getWidth()
            r5[r1] = r4
            androidx.recyclerview.widget.RecyclerView r4 = r2.Y
            int r4 = r4.getWidth()
            r5[r0] = r4
            return
        L19:
            androidx.recyclerview.widget.RecyclerView r4 = r2.Y
            int r4 = r4.getHeight()
            r5[r1] = r4
            androidx.recyclerview.widget.RecyclerView r4 = r2.Y
            int r4 = r4.getHeight()
            r5[r0] = r4
            return
    }
}
