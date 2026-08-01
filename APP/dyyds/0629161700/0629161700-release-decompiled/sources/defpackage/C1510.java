package defpackage;

/* JADX INFO: renamed from: ᛸᛶᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1510 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int f6671;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f6672;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f6673;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.MenuC1701 f6674;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean f6675;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final android.view.LayoutInflater f6676;

    public C1510(defpackage.MenuC1701 r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f6673 = r0
            r1.f6675 = r4
            r1.f6676 = r3
            r1.f6674 = r2
            r1.f6671 = r5
            r1.m2744()
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r2 = this;
            boolean r0 = r2.f6675
            ᲀᛷᛱᲇ r1 = r2.f6674
            if (r0 == 0) goto Lc
            r1.m3077()
            java.util.ArrayList r0 = r1.f7562
            goto L10
        Lc:
            java.util.ArrayList r0 = r1.m3076()
        L10:
            int r2 = r2.f6673
            if (r2 >= 0) goto L19
            int r2 = r0.size()
            return r2
        L19:
            int r2 = r0.size()
            int r2 = r2 + (-1)
            return r2
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            ᛲᛲᛶᲁ r0 = r0.m2745(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto Lb
            android.view.LayoutInflater r7 = r5.f6676
            int r1 = r5.f6671
            android.view.View r7 = r7.inflate(r1, r8, r0)
        Lb:
            ᛲᛲᛶᲁ r8 = r5.m2745(r6)
            int r8 = r8.f1492
            int r1 = r6 + (-1)
            if (r1 < 0) goto L1c
            ᛲᛲᛶᲁ r1 = r5.m2745(r1)
            int r1 = r1.f1492
            goto L1d
        L1c:
            r1 = r8
        L1d:
            r2 = r7
            androidx.appcompat.view.menu.ListMenuItemView r2 = (androidx.appcompat.view.menu.ListMenuItemView) r2
            ᲀᛷᛱᲇ r3 = r5.f6674
            boolean r3 = r3.mo2719()
            r4 = 1
            if (r3 == 0) goto L2c
            if (r8 == r1) goto L2c
            r0 = r4
        L2c:
            r2.setGroupDividerEnabled(r0)
            r8 = r7
            ᲀᛲᲇᲁ r8 = (defpackage.InterfaceC1637) r8
            boolean r0 = r5.f6672
            if (r0 == 0) goto L39
            r2.setForceShowIcon(r4)
        L39:
            ᛲᛲᛶᲁ r5 = r5.m2745(r6)
            r8.mo14(r5)
            return r7
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r0 = this;
            r0.m2744()
            super.notifyDataSetChanged()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2744() {
            r5 = this;
            ᲀᛷᛱᲇ r0 = r5.f6674
            ᛲᛲᛶᲁ r1 = r0.f7576
            if (r1 == 0) goto L20
            r0.m3077()
            java.util.ArrayList r0 = r0.f7562
            int r2 = r0.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L20
            java.lang.Object r4 = r0.get(r3)
            ᛲᛲᛶᲁ r4 = (defpackage.C0254) r4
            if (r4 != r1) goto L1d
            r5.f6673 = r3
            return
        L1d:
            int r3 = r3 + 1
            goto L10
        L20:
            r0 = -1
            r5.f6673 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0254 m2745(int r3) {
            r2 = this;
            boolean r0 = r2.f6675
            ᲀᛷᛱᲇ r1 = r2.f6674
            if (r0 == 0) goto Lc
            r1.m3077()
            java.util.ArrayList r0 = r1.f7562
            goto L10
        Lc:
            java.util.ArrayList r0 = r1.m3076()
        L10:
            int r2 = r2.f6673
            if (r2 < 0) goto L18
            if (r3 < r2) goto L18
            int r3 = r3 + 1
        L18:
            java.lang.Object r2 = r0.get(r3)
            ᛲᛲᛶᲁ r2 = (defpackage.C0254) r2
            return r2
    }
}
