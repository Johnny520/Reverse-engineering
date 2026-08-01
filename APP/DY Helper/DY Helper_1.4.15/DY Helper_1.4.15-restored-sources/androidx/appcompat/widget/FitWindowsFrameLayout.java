package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class FitWindowsFrameLayout extends android.widget.FrameLayout {
    public FitWindowsFrameLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FitWindowsFrameLayout(android.content.Context r1, android.util.AttributeSet r2) {
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

    public void setOnFitSystemWindowsListener(p000.z30 r1) {
            r0 = this;
            return
    }
}
