package androidx.appcompat.app;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends android.widget.ListView {

    /* JADX INFO: renamed from: ε */
    public final int f356;

    /* JADX INFO: renamed from: ζ */
    public final int f357;

    public AlertController$RecycleListView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AlertController$RecycleListView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int[] r0 = p000.kk1.f5987
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = 0
            r0 = -1
            int r3 = r2.getDimensionPixelOffset(r3, r0)
            r1.f357 = r3
            r3 = 1
            int r2 = r2.getDimensionPixelOffset(r3, r0)
            r1.f356 = r2
            return
    }
}
