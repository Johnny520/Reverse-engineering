package androidx.appcompat.app;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends android.widget.ListView {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f14;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f15;

    public AlertController$RecycleListView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AlertController$RecycleListView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int[] r0 = defpackage.AbstractC1070.f4784
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = 0
            r0 = -1
            int r3 = r2.getDimensionPixelOffset(r3, r0)
            r1.f14 = r3
            r3 = 1
            int r2 = r2.getDimensionPixelOffset(r3, r0)
            r1.f15 = r2
            return
    }
}
