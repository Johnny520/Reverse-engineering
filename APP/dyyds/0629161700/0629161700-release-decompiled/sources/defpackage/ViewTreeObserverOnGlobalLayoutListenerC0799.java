package defpackage;

/* JADX INFO: renamed from: ᛴᲈᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0799 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f3697;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3698;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0799(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3698 = r1
            r0.f3697 = r2
            r0.<init>()
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r4 = this;
            int r0 = r4.f3698
            java.lang.Object r1 = r4.f3697
            switch(r0) {
                case 0: goto L89;
                case 1: goto L6a;
                case 2: goto L28;
                default: goto L7;
            }
        L7:
            ᲇᲇᲇᲇ r1 = (defpackage.ViewOnKeyListenerC2155) r1
            ᲁᲀᛷᛲ r4 = r1.f9167
            boolean r0 = r1.mo2605()
            if (r0 == 0) goto L27
            boolean r0 = r4.f6633
            if (r0 != 0) goto L27
            android.view.View r0 = r1.f9161
            if (r0 == 0) goto L24
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L20
            goto L24
        L20:
            r4.show()
            goto L27
        L24:
            r1.dismiss()
        L27:
            return
        L28:
            ᛸᛱᛷᛸ r1 = (defpackage.ViewOnKeyListenerC1423) r1
            java.util.ArrayList r4 = r1.f6238
            boolean r0 = r1.mo2605()
            if (r0 == 0) goto L69
            int r0 = r4.size()
            if (r0 <= 0) goto L69
            r0 = 0
            java.lang.Object r0 = r4.get(r0)
            ᲀᛵᲁᲀ r0 = (defpackage.C1681) r0
            ᲁᲀᛷᛲ r0 = r0.f7491
            boolean r0 = r0.f6633
            if (r0 != 0) goto L69
            android.view.View r0 = r1.f6243
            if (r0 == 0) goto L66
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L50
            goto L66
        L50:
            java.util.Iterator r4 = r4.iterator()
        L54:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r4.next()
            ᲀᛵᲁᲀ r0 = (defpackage.C1681) r0
            ᲁᲀᛷᛲ r0 = r0.f7491
            r0.show()
            goto L54
        L66:
            r1.dismiss()
        L69:
            return
        L6a:
            ᛵᛶᛵᛶ r1 = (defpackage.C0911) r1
            ᛴᛱᲀᛸ r4 = r1.f4146
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L85
            android.graphics.Rect r0 = r1.f4147
            boolean r4 = r4.getGlobalVisibleRect(r0)
            if (r4 == 0) goto L85
            r1.m1880()
            r1.show()
            goto L88
        L85:
            r1.dismiss()
        L88:
            return
        L89:
            ᛴᛱᲀᛸ r1 = (defpackage.C0616) r1
            ᲀᲀᛴᲁ r0 = r1.getInternalPopup()
            boolean r0 = r0.mo1586()
            if (r0 != 0) goto La2
            ᲀᲀᛴᲁ r0 = r1.f3017
            int r2 = defpackage.AbstractC0044.m387(r1)
            int r3 = defpackage.AbstractC0044.m386(r1)
            r0.mo1580(r2, r3)
        La2:
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            if (r0 == 0) goto Lab
            defpackage.AbstractC0234.m843(r0, r4)
        Lab:
            return
    }
}
