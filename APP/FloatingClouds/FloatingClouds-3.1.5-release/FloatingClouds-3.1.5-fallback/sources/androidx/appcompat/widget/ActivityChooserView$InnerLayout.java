package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f838a = null;

    static {
            r0 = 16842964(0x10100d4, float:2.3694152E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.ActivityChooserView$InnerLayout.f838a = r0
            return
    }

    public ActivityChooserView$InnerLayout(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            int[] r0 = androidx.appcompat.widget.ActivityChooserView$InnerLayout.f838a
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
            r0 = 0
            boolean r1 = r4.hasValue(r0)
            if (r1 == 0) goto L1b
            int r1 = r4.getResourceId(r0, r0)
            if (r1 == 0) goto L1b
            android.graphics.drawable.Drawable r3 = a.C0435w1.A(r3, r1)
            goto L1f
        L1b:
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r0)
        L1f:
            r2.setBackgroundDrawable(r3)
            r4.recycle()
            return
    }
}
