package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class DialogTitle extends Yue.C0508 {
    public DialogTitle(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public DialogTitle(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public DialogTitle(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // Yue.C0508, android.widget.TextView, android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            super.onMeasure(r7, r8)
            android.text.Layout r0 = r6.getLayout()
            if (r0 == 0) goto L42
            int r1 = r0.getLineCount()
            if (r1 <= 0) goto L42
            int r1 = r1 + (-1)
            int r0 = r0.getEllipsisCount(r1)
            if (r0 <= 0) goto L42
            r0 = 0
            r6.setSingleLine(r0)
            r1 = 2
            r6.setMaxLines(r1)
            android.content.Context r1 = r6.getContext()
            int[] r2 = Yue.C5058.C5071.f17953
            r3 = 16842817(0x1010041, float:2.369374E-38)
            r4 = 16973892(0x1030044, float:2.406109E-38)
            r5 = 0
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r5, r2, r3, r4)
            int r2 = Yue.C5058.C5071.f17954
            int r2 = r1.getDimensionPixelSize(r2, r0)
            if (r2 == 0) goto L3c
            float r2 = (float) r2
            r6.setTextSize(r0, r2)
        L3c:
            r1.recycle()
            super.onMeasure(r7, r8)
        L42:
            return
    }
}
