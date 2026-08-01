package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲈᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0227 extends xhss.AbstractC0119 {

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0921 f841;

    public AbstractC0227(xhss.C0847 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f841 = r1
            return
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0847 mo495() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f540
            android.view.WindowInsets r1 = r1.consumeStableInsets()
            r0 = 0
            xhss.ᲀᛳᛲᛶ r1 = xhss.C0847.m1430(r0, r1)
            return r1
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C0847 mo496() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f540
            android.view.WindowInsets r1 = r1.consumeSystemWindowInsets()
            r0 = 0
            xhss.ᲀᛳᛲᛶ r1 = xhss.C0847.m1430(r0, r1)
            return r1
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C0921 mo497() {
            r4 = this;
            xhss.ᲀᲈᲈᛸ r0 = r4.f841
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.f540
            int r1 = r0.getStableInsetLeft()
            int r2 = r0.getStableInsetTop()
            int r3 = r0.getStableInsetRight()
            int r0 = r0.getStableInsetBottom()
            xhss.ᲀᲈᲈᛸ r0 = xhss.C0921.m1515(r1, r2, r3, r0)
            r4.f841 = r0
        L1c:
            return r0
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public boolean mo498() {
            r0 = this;
            android.view.WindowInsets r0 = r0.f540
            boolean r0 = r0.isConsumed()
            return r0
    }
}
