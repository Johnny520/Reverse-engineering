package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsLinearLayout extends android.widget.LinearLayout {
    public FitWindowsLinearLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.fitSystemWindows(r1)
            return r1
    }

    public void setOnFitSystemWindowsListener(defpackage.jk r1) {
            r0 = this;
            return
    }
}
