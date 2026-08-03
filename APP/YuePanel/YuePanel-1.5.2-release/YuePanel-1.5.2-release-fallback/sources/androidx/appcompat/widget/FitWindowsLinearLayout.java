package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class FitWindowsLinearLayout extends android.widget.LinearLayout implements androidx.appcompat.widget.InterfaceC7429 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public androidx.appcompat.widget.InterfaceC7429.InterfaceC7430 f25656;

    public FitWindowsLinearLayout(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FitWindowsLinearLayout(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.View
    public boolean fitSystemWindows(android.graphics.Rect r2) {
            r1 = this;
            androidx.appcompat.widget.ۥ۟۟$ۥ r0 = r1.f25656
            if (r0 == 0) goto L7
            r0.mo28092(r2)
        L7:
            boolean r2 = super.fitSystemWindows(r2)
            return r2
    }

    @Override // androidx.appcompat.widget.InterfaceC7429
    public void setOnFitSystemWindowsListener(androidx.appcompat.widget.InterfaceC7429.InterfaceC7430 r1) {
            r0 = this;
            r0.f25656 = r1
            return
    }
}
