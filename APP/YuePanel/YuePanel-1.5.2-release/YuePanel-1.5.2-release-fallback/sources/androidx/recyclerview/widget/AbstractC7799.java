package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7799 extends androidx.recyclerview.widget.RecyclerView.AbstractC7684 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean f30069 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final java.lang.String f30070 = "SimpleItemAnimator";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f30071;

    public AbstractC7799() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f30071 = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684
    /* JADX INFO: renamed from: ۥ */
    public boolean mo29727(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r7, @Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r8, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r9) {
            r6 = this;
            if (r8 == 0) goto L19
            int r2 = r8.f29603
            int r4 = r9.f29603
            if (r2 != r4) goto Le
            int r0 = r8.f29604
            int r1 = r9.f29604
            if (r0 == r1) goto L19
        Le:
            int r3 = r8.f29604
            int r5 = r9.f29604
            r0 = r6
            r1 = r7
            boolean r7 = r0.mo30072(r1, r2, r3, r4, r5)
            return r7
        L19:
            boolean r7 = r6.mo30070(r7)
            return r7
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo29728(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r8, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r9, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r10, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r11) {
            r7 = this;
            int r3 = r10.f29603
            int r4 = r10.f29604
            boolean r0 = r9.shouldIgnore()
            if (r0 == 0) goto L11
            int r11 = r10.f29603
            int r10 = r10.f29604
            r6 = r10
            r5 = r11
            goto L17
        L11:
            int r10 = r11.f29603
            int r11 = r11.f29604
            r5 = r10
            r6 = r11
        L17:
            r0 = r7
            r1 = r8
            r2 = r9
            boolean r8 = r0.mo30071(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo29729(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r7, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r8, @Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r9) {
            r6 = this;
            int r2 = r8.f29603
            int r3 = r8.f29604
            android.view.View r8 = r7.itemView
            if (r9 != 0) goto Le
            int r0 = r8.getLeft()
        Lc:
            r4 = r0
            goto L11
        Le:
            int r0 = r9.f29603
            goto Lc
        L11:
            if (r9 != 0) goto L19
            int r9 = r8.getTop()
        L17:
            r5 = r9
            goto L1c
        L19:
            int r9 = r9.f29604
            goto L17
        L1c:
            boolean r9 = r7.isRemoved()
            if (r9 != 0) goto L3a
            if (r2 != r4) goto L26
            if (r3 == r5) goto L3a
        L26:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            int r0 = r8.getHeight()
            int r0 = r0 + r5
            r8.layout(r4, r5, r9, r0)
            r0 = r6
            r1 = r7
            boolean r7 = r0.mo30072(r1, r2, r3, r4, r5)
            return r7
        L3a:
            boolean r7 = r6.mo30073(r7)
            return r7
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo29730(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r7, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r8, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r9) {
            r6 = this;
            int r2 = r8.f29603
            int r4 = r9.f29603
            if (r2 != r4) goto L12
            int r0 = r8.f29604
            int r1 = r9.f29604
            if (r0 == r1) goto Ld
            goto L12
        Ld:
            r6.m30274(r7)
            r7 = 0
            return r7
        L12:
            int r3 = r8.f29604
            int r5 = r9.f29604
            r0 = r6
            r1 = r7
            boolean r7 = r0.mo30072(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo29731(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2) {
            r1 = this;
            boolean r0 = r1.f30071
            if (r0 == 0) goto Ld
            boolean r2 = r2.isInvalid()
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public abstract boolean mo30070(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public abstract boolean mo30071(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, int r3, int r4, int r5, int r6);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public abstract boolean mo30072(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, int r2, int r3, int r4, int r5);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public abstract boolean mo30073(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m30270(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            r0.m30279(r1)
            r0.m29733(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m30271(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            r0.m30280(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m30272(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, boolean r2) {
            r0 = this;
            r0.m30281(r1, r2)
            r0.m29733(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m30273(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, boolean r2) {
            r0 = this;
            r0.m30282(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final void m30274(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            r0.m30283(r1)
            r0.m29733(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final void m30275(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            r0.m30284(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final void m30276(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            r0.m30285(r1)
            r0.m29733(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final void m30277(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            r0.m30286(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean m30278() {
            r1 = this;
            boolean r0 = r1.f30071
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m30279(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void m30280(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m30281(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, boolean r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m30282(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, boolean r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m30283(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m30284(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m30285(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m30286(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m30287(boolean r1) {
            r0 = this;
            r0.f30071 = r1
            return
    }
}
