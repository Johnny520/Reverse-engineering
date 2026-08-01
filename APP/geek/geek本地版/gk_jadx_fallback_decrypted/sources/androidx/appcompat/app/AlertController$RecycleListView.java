package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends android.widget.ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int[] r0 = defpackage.xy.t
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = 0
            r0 = -1
            int r3 = r2.getDimensionPixelOffset(r3, r0)
            r1.b = r3
            r3 = 1
            int r2 = r2.getDimensionPixelOffset(r3, r0)
            r1.a = r2
            return
    }
}
