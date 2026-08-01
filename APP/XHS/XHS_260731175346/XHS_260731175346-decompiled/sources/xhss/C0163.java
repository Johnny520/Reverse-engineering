package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛵᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0163 extends xhss.C0551 {

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final xhss.C0847 f672 = null;

    static {
            android.view.WindowInsets r0 = android.view.WindowInsets.CONSUMED
            r1 = 0
            xhss.ᲀᛳᛲᛶ r0 = xhss.C0847.m1430(r1, r0)
            xhss.C0163.f672 = r0
            return
    }

    public C0163(xhss.C0847 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // xhss.C0880, xhss.AbstractC0119
    /* JADX INFO: renamed from: ᛱᛳᲁᲈ */
    public xhss.C0921 mo323(int r1) {
            r0 = this;
            android.view.WindowInsets r0 = r0.f540
            int r1 = xhss.AbstractC0024.m126(r1)
            android.graphics.Insets r0 = r0.getInsetsIgnoringVisibility(r1)
            xhss.ᲀᲈᲈᛸ r0 = xhss.C0921.m1514(r0)
            return r0
    }

    @Override // xhss.C0880, xhss.C0501
    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public boolean mo406(int r1) {
            r0 = this;
            android.view.WindowInsets r0 = r0.f540
            int r1 = xhss.AbstractC0024.m126(r1)
            boolean r0 = r0.isVisible(r1)
            return r0
    }

    @Override // xhss.C0880, xhss.AbstractC0119, xhss.C0501
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public xhss.C0921 mo330(int r1) {
            r0 = this;
            android.view.WindowInsets r0 = r0.f540
            int r1 = xhss.AbstractC0024.m126(r1)
            android.graphics.Insets r0 = r0.getInsets(r1)
            xhss.ᲀᲈᲈᛸ r0 = xhss.C0921.m1514(r0)
            return r0
    }

    @Override // xhss.AbstractC0119, xhss.C0501
    /* JADX INFO: renamed from: ᲈᛳᲀ */
    public void mo336(android.view.View r1) {
            r0 = this;
            return
    }
}
