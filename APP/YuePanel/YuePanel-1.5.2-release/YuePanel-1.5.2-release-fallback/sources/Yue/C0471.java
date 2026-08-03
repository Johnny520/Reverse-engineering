package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0471 extends android.widget.PopupWindow {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean f1197 = false;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f1198;

    static {
            r0 = 0
            Yue.C0471.f1197 = r0
            return
    }

    public C0471(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3, @Yue.InterfaceC0642 int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r0 = 0
            r1.m1722(r2, r3, r4, r0)
            return
    }

    public C0471(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, @Yue.InterfaceC0642 int r3, @Yue.InterfaceC6018 int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.m1722(r1, r2, r3, r4)
            return
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View r2, int r3, int r4) {
            r1 = this;
            boolean r0 = Yue.C0471.f1197
            if (r0 == 0) goto Ld
            boolean r0 = r1.f1198
            if (r0 == 0) goto Ld
            int r0 = r2.getHeight()
            int r4 = r4 - r0
        Ld:
            super.showAsDropDown(r2, r3, r4)
            return
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = Yue.C0471.f1197
            if (r0 == 0) goto Ld
            boolean r0 = r1.f1198
            if (r0 == 0) goto Ld
            int r0 = r2.getHeight()
            int r4 = r4 - r0
        Ld:
            super.showAsDropDown(r2, r3, r4, r5)
            return
    }

    @Override // android.widget.PopupWindow
    public void update(android.view.View r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            boolean r0 = Yue.C0471.f1197
            if (r0 == 0) goto Ld
            boolean r0 = r6.f1198
            if (r0 == 0) goto Ld
            int r0 = r7.getHeight()
            int r9 = r9 - r0
        Ld:
            r3 = r9
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            super.update(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m1722(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            int[] r0 = Yue.C5058.C5071.f17893
            Yue.ۥۢۡۥۦ r2 = Yue.C6264.m23339(r2, r3, r0, r4, r5)
            int r3 = Yue.C5058.C5071.f17896
            boolean r3 = r2.m23368(r3)
            if (r3 == 0) goto L18
            int r3 = Yue.C5058.C5071.f17896
            r4 = 0
            boolean r3 = r2.m23340(r3, r4)
            r1.m1723(r3)
        L18:
            int r3 = Yue.C5058.C5071.f17894
            android.graphics.drawable.Drawable r3 = r2.m23347(r3)
            r1.setBackgroundDrawable(r3)
            r2.m23371()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m1723(boolean r2) {
            r1 = this;
            boolean r0 = Yue.C0471.f1197
            if (r0 == 0) goto L7
            r1.f1198 = r2
            goto La
        L7:
            Yue.C4833.m19118(r1, r2)
        La:
            return
    }
}
