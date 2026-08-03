package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0480 extends android.widget.SeekBar {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.C0481 f1211;

    public C0480(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0480(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16748
            r1.<init>(r2, r3, r0)
            return
    }

    public C0480(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            Yue.C6173.m23109(r0, r1)
            Yue.ۥۣ۟ۡۢ r1 = new Yue.ۥۣ۟ۡۢ
            r1.<init>(r0)
            r0.f1211 = r1
            r1.mo1726(r2, r3)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            Yue.ۥۣ۟ۡۢ r0 = r1.f1211
            r0.m1740()
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            Yue.ۥۣ۟ۡۢ r0 = r1.f1211
            r0.m1744()
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            monitor-enter(r1)
            super.onDraw(r2)     // Catch: java.lang.Throwable -> Lb
            Yue.ۥۣ۟ۡۢ r0 = r1.f1211     // Catch: java.lang.Throwable -> Lb
            r0.m1739(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
