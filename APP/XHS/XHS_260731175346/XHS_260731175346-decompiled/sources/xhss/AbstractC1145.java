package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛶᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145 extends xhss.AbstractC0227 {
    public AbstractC1145(xhss.C0847 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // xhss.C0501
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof xhss.AbstractC1145
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᲈᛶᛲᲈ r5 = (xhss.AbstractC1145) r5
            android.view.WindowInsets r1 = r4.f540
            android.view.WindowInsets r3 = r5.f540
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L28
            r1 = 0
            boolean r1 = java.util.Objects.equals(r1, r1)
            if (r1 == 0) goto L28
            int r4 = r4.f543
            int r5 = r5.f543
            boolean r4 = xhss.AbstractC0119.m319(r4, r5)
            if (r4 == 0) goto L28
            return r0
        L28:
            return r2
    }

    @Override // xhss.C0501
    public int hashCode() {
            r0 = this;
            android.view.WindowInsets r0 = r0.f540
            int r0 = r0.hashCode()
            return r0
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public xhss.C0847 mo905() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f540
            android.view.WindowInsets r1 = r1.consumeDisplayCutout()
            r0 = 0
            xhss.ᲀᛳᛲᛶ r1 = xhss.C0847.m1430(r0, r1)
            return r1
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public xhss.C0658 mo906() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f540
            android.view.DisplayCutout r1 = r1.getDisplayCutout()
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            xhss.ᛷᛵᛳᛸ r0 = new xhss.ᛷᛵᛳᛸ
            r0.<init>(r1)
            return r0
    }
}
