package defpackage;

/* JADX INFO: renamed from: ᛱᛴᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0074 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0235 f784;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0388 f785;

    public ViewOnClickListenerC0074(defpackage.C0235 r4) {
            r3 = this;
            r3.<init>()
            r3.f784 = r4
            ᛲᲈᛶᲇ r0 = new ᛲᲈᛶᲇ
            androidx.appcompat.widget.Toolbar r1 = r4.f1415
            android.content.Context r1 = r1.getContext()
            java.lang.CharSequence r4 = r4.f1406
            r0.<init>()
            r2 = 4096(0x1000, float:5.74E-42)
            r0.f2020 = r2
            r0.f2008 = r2
            r2 = 0
            r0.f2015 = r2
            r0.f2009 = r2
            r2 = 0
            r0.f2019 = r2
            r0.f2016 = r2
            r2 = 16
            r0.f2017 = r2
            r0.f2006 = r1
            r0.f2013 = r4
            r3.f785 = r0
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            ᛲᛱᛶᛲ r2 = r1.f784
            android.view.Window$Callback r0 = r2.f1407
            if (r0 == 0) goto L10
            boolean r2 = r2.f1408
            if (r2 == 0) goto L10
            r2 = 0
            ᛲᲈᛶᲇ r1 = r1.f785
            r0.onMenuItemSelected(r2, r1)
        L10:
            return
    }
}
