package defpackage;

/* JADX INFO: renamed from: ᛴᛷᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0712 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.LayoutInflaterFactory2C1411 f3364;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3365;

    public /* synthetic */ RunnableC0712(defpackage.LayoutInflaterFactory2C1411 r1, int r2) {
            r0 = this;
            r0.f3365 = r2
            r0.f3364 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f3365
            ᛸᛱᛱᛲ r1 = r5.f3364
            r2 = 0
            switch(r0) {
                case 0: goto L4f;
                default: goto L8;
            }
        L8:
            android.widget.PopupWindow r0 = r1.f6172
            androidx.appcompat.widget.ActionBarContextView r3 = r1.f6168
            r4 = 55
            r0.showAtLocation(r3, r4, r2, r2)
            ᲇᲇᛱᛳ r0 = r1.f6177
            if (r0 == 0) goto L18
            r0.m3556()
        L18:
            boolean r0 = r1.f6149
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L44
            android.view.ViewGroup r0 = r1.f6152
            if (r0 == 0) goto L44
            java.util.WeakHashMap r4 = defpackage.AbstractC0858.f3911
            boolean r0 = r0.isLaidOut()
            if (r0 == 0) goto L44
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f6168
            r4 = 0
            r0.setAlpha(r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f6168
            ᲇᲇᛱᛳ r0 = defpackage.AbstractC0858.m1815(r0)
            r0.m3555(r3)
            r1.f6177 = r0
            ᲀᛱᛴᛱ r1 = new ᲀᛱᛴᛱ
            r1.<init>(r2, r5)
            r0.m3553(r1)
            goto L4e
        L44:
            androidx.appcompat.widget.ActionBarContextView r5 = r1.f6168
            r5.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r5 = r1.f6168
            r5.setVisibility(r2)
        L4e:
            return
        L4f:
            int r5 = r1.f6169
            r5 = r5 & 1
            if (r5 == 0) goto L58
            r1.m2594(r2)
        L58:
            int r5 = r1.f6169
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L63
            r5 = 108(0x6c, float:1.51E-43)
            r1.m2594(r5)
        L63:
            r1.f6173 = r2
            r1.f6169 = r2
            return
    }
}
