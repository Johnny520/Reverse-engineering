package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0501 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0847 f1818;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Lc
            xhss.ᛶᛴᛳᛷ r0 = new xhss.ᛶᛴᛳᛷ
            r0.<init>()
            goto L2f
        Lc:
            r1 = 35
            if (r0 < r1) goto L16
            xhss.ᲈᲁᛳᛱ r0 = new xhss.ᲈᲁᛳᛱ
            r0.<init>()
            goto L2f
        L16:
            r1 = 34
            if (r0 < r1) goto L20
            xhss.ᛸᲀᛴᲀ r0 = new xhss.ᛸᲀᛴᲀ
            r0.<init>()
            goto L2f
        L20:
            r1 = 31
            if (r0 < r1) goto L2a
            xhss.ᛱᲁᛱᛲ r0 = new xhss.ᛱᲁᛱᛲ
            r0.<init>()
            goto L2f
        L2a:
            xhss.ᲁᛷᲇᛷ r0 = new xhss.ᲁᛷᲇᛷ
            r0.<init>()
        L2f:
            xhss.ᲀᛳᛲᛶ r0 = r0.mo555()
            xhss.ᛵᛸᛱ r0 = r0.f2754
            xhss.ᲀᛳᛲᛶ r0 = r0.mo905()
            xhss.ᛵᛸᛱ r0 = r0.f2754
            xhss.ᲀᛳᛲᛶ r0 = r0.mo495()
            xhss.ᛵᛸᛱ r0 = r0.f2754
            r0.mo496()
            return
    }

    public C0501(xhss.C0847 r1) {
            r0 = this;
            r0.<init>()
            r0.f1818 = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof xhss.C0501
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᛵᛸᛱ r5 = (xhss.C0501) r5
            boolean r1 = r4.mo335()
            boolean r3 = r5.mo335()
            if (r1 != r3) goto L4b
            boolean r1 = r4.mo498()
            boolean r3 = r5.mo498()
            if (r1 != r3) goto L4b
            xhss.ᲀᲈᲈᛸ r1 = r4.mo332()
            xhss.ᲀᲈᲈᛸ r3 = r5.mo332()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L4b
            xhss.ᲀᲈᲈᛸ r1 = r4.mo497()
            xhss.ᲀᲈᲈᛸ r3 = r5.mo497()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L4b
            xhss.ᛷᛵᛳᛸ r4 = r4.mo906()
            xhss.ᛷᛵᛳᛸ r5 = r5.mo906()
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L4b
            return r0
        L4b:
            return r2
    }

    public int hashCode() {
            r4 = this;
            boolean r0 = r4.mo335()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r4.mo498()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            xhss.ᲀᲈᲈᛸ r2 = r4.mo332()
            xhss.ᲀᲈᲈᛸ r3 = r4.mo497()
            xhss.ᛷᛵᛳᛸ r4 = r4.mo906()
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r1, r2, r3, r4}
            int r4 = java.util.Objects.hash(r4)
            return r4
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public xhss.C0847 mo495() {
            r0 = this;
            xhss.ᲀᛳᛲᛶ r0 = r0.f1818
            return r0
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ */
    public void mo324(android.graphics.Rect[][] r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public xhss.C0847 mo496() {
            r0 = this;
            xhss.ᲀᛳᛲᛶ r0 = r0.f1818
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ */
    public boolean mo406(int r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ */
    public void mo325(int r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ */
    public void mo326(xhss.C0822 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public java.util.List<android.graphics.Rect> mo327(int r1) {
            r0 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0847 mo905() {
            r0 = this;
            xhss.ᲀᛳᛲᛶ r0 = r0.f1818
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public void mo328() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ */
    public void mo329(xhss.C0847 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public xhss.C0921 mo497() {
            r0 = this;
            xhss.ᲀᲈᲈᛸ r0 = xhss.C0921.f2967
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public xhss.C0921 mo330(int r1) {
            r0 = this;
            xhss.ᲀᲈᲈᛸ r0 = xhss.C0921.f2967
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ */
    public void mo331(xhss.C0921[] r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public boolean mo498() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public xhss.C0921 mo332() {
            r0 = this;
            xhss.ᲀᲈᲈᛸ r0 = xhss.C0921.f2967
            return r0
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0658 mo906() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ */
    public void mo333(android.graphics.Rect[][] r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public void mo907(android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public java.util.List<android.graphics.Rect> mo334(int r1) {
            r0 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ */
    public boolean mo335() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ */
    public void mo336(android.view.View r1) {
            r0 = this;
            return
    }
}
