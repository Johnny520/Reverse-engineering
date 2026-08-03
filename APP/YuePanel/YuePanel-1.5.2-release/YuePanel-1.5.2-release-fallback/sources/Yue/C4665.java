package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4665 extends Yue.C6875.AbstractC6885 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.recyclerview.widget.LinearLayoutManager f14838;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C6875.InterfaceC6891 f14839;

    public C4665(androidx.recyclerview.widget.LinearLayoutManager r1) {
            r0 = this;
            r0.<init>()
            r0.f14838 = r1
            return
    }

    @Override // Yue.C6875.AbstractC6885
    public void onPageScrollStateChanged(int r1) {
            r0 = this;
            return
    }

    @Override // Yue.C6875.AbstractC6885
    public void onPageScrolled(int r4, float r5, int r6) {
            r3 = this;
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ r6 = r3.f14839
            if (r6 != 0) goto L5
            return
        L5:
            float r5 = -r5
            r6 = 0
        L7:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.f14838
            int r0 = r0.getChildCount()
            if (r6 >= r0) goto L48
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.f14838
            android.view.View r0 = r0.getChildAt(r6)
            if (r0 == 0) goto L28
            androidx.recyclerview.widget.LinearLayoutManager r1 = r3.f14838
            int r1 = r1.getPosition(r0)
            int r1 = r1 - r4
            float r1 = (float) r1
            float r1 = r1 + r5
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ r2 = r3.f14839
            r2.mo7075(r0, r1)
            int r6 = r6 + 1
            goto L7
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.f14838
            int r0 = r0.getChildCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}
            java.lang.String r0 = "LayoutManager returned a null child at pos %d/%d while transforming pages"
            java.lang.String r5 = java.lang.String.format(r5, r0, r6)
            r4.<init>(r5)
            throw r4
        L48:
            return
    }

    @Override // Yue.C6875.AbstractC6885
    public void onPageSelected(int r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C6875.InterfaceC6891 m18511() {
            r1 = this;
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ r0 = r1.f14839
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m18512(@Yue.InterfaceC4544 Yue.C6875.InterfaceC6891 r1) {
            r0 = this;
            r0.f14839 = r1
            return
    }
}
