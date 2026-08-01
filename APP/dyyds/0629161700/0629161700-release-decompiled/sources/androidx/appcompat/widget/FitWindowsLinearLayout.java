package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class FitWindowsLinearLayout extends android.widget.LinearLayout {
    public FitWindowsLinearLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FitWindowsLinearLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r0 = super.fitSystemWindows(r1)
            return r0
    }

    public void setOnFitSystemWindowsListener(defpackage.InterfaceC1059 r1) {
            r0 = this;
            return
    }
}
