package defpackage;

/* JADX INFO: renamed from: ᛱᛴᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0068 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0937 f767;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f768;

    public C0068(defpackage.C0937 r1) {
            r0 = this;
            r0.f767 = r1
            r0.<init>()
            r1 = -1
            r0.f768 = r1
            r0.m510()
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            ᛵᛷᲇᛱ r0 = r1.f767
            ᲀᛷᛱᲇ r0 = r0.f4221
            r0.m3077()
            java.util.ArrayList r0 = r0.f7562
            int r0 = r0.size()
            int r1 = r1.f768
            if (r1 >= 0) goto L12
            return r0
        L12:
            int r0 = r0 + (-1)
            return r0
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            ᛲᛲᛶᲁ r0 = r0.m511(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            if (r4 != 0) goto Le
            ᛵᛷᲇᛱ r4 = r2.f767
            android.view.LayoutInflater r4 = r4.f4222
            r0 = 1712062480(0x660c0010, float:1.6528312E23)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
        Le:
            r5 = r4
            ᲀᛲᲇᲁ r5 = (defpackage.InterfaceC1637) r5
            ᛲᛲᛶᲁ r2 = r2.m511(r3)
            r5.mo14(r2)
            return r4
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r0 = this;
            r0.m510()
            super.notifyDataSetChanged()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m510() {
            r5 = this;
            ᛵᛷᲇᛱ r0 = r5.f767
            ᲀᛷᛱᲇ r0 = r0.f4221
            ᛲᛲᛶᲁ r1 = r0.f7576
            if (r1 == 0) goto L22
            r0.m3077()
            java.util.ArrayList r0 = r0.f7562
            int r2 = r0.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto L22
            java.lang.Object r4 = r0.get(r3)
            ᛲᛲᛶᲁ r4 = (defpackage.C0254) r4
            if (r4 != r1) goto L1f
            r5.f768 = r3
            return
        L1f:
            int r3 = r3 + 1
            goto L12
        L22:
            r0 = -1
            r5.f768 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0254 m511(int r2) {
            r1 = this;
            ᛵᛷᲇᛱ r0 = r1.f767
            ᲀᛷᛱᲇ r0 = r0.f4221
            r0.m3077()
            java.util.ArrayList r0 = r0.f7562
            int r1 = r1.f768
            if (r1 < 0) goto L11
            if (r2 < r1) goto L11
            int r2 = r2 + 1
        L11:
            java.lang.Object r1 = r0.get(r2)
            ᛲᛲᛶᲁ r1 = (defpackage.C0254) r1
            return r1
    }
}
