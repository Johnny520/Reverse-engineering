package defpackage;

/* JADX INFO: renamed from: ᛸᛸᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1548 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC1503 f6873;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6874;

    public /* synthetic */ RunnableC1548(defpackage.AbstractC1503 r1, int r2) {
            r0 = this;
            r0.f6874 = r2
            r0.f6873 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f6874
            ᛸᛶᛳᛷ r2 = r2.f6873
            switch(r0) {
                case 0: goto L35;
                default: goto L7;
            }
        L7:
            ᛲᲈᲁᛸ r0 = r2.f6621
            if (r0 == 0) goto L34
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L34
            ᛲᲈᲁᛸ r0 = r2.f6621
            int r0 = r0.getCount()
            ᛲᲈᲁᛸ r1 = r2.f6621
            int r1 = r1.getChildCount()
            if (r0 <= r1) goto L34
            ᛲᲈᲁᛸ r0 = r2.f6621
            int r0 = r0.getChildCount()
            int r1 = r2.f6619
            if (r0 > r1) goto L34
            ᛳᲇᲇᛲ r0 = r2.f6630
            r1 = 2
            r0.setInputMethodMode(r1)
            r2.show()
        L34:
            return
        L35:
            ᛲᲈᲁᛸ r2 = r2.f6621
            if (r2 == 0) goto L40
            r0 = 1
            r2.setListSelectionHidden(r0)
            r2.requestLayout()
        L40:
            return
    }
}
