package defpackage;

/* JADX INFO: renamed from: ᛳᛳᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0437 implements android.widget.PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0911 f2145;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.ViewTreeObserverOnGlobalLayoutListenerC0799 f2146;

    public C0437(defpackage.C0911 r1, defpackage.ViewTreeObserverOnGlobalLayoutListenerC0799 r2) {
            r0 = this;
            r0.<init>()
            r0.f2145 = r1
            r0.f2146 = r2
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r1 = this;
            ᛵᛶᛵᛶ r0 = r1.f2145
            ᛴᛱᲀᛸ r0 = r0.f4146
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto Lf
            ᛴᲈᛶᛳ r1 = r1.f2146
            r0.removeGlobalOnLayoutListener(r1)
        Lf:
            return
    }
}
