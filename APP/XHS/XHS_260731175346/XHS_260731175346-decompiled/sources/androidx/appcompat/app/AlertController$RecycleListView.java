package androidx.appcompat.app;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends android.widget.ListView {
    public AlertController$RecycleListView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AlertController$RecycleListView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int[] r0 = xhss.AbstractC0293.f1132
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r1 = 0
            r2 = -1
            r0.getDimensionPixelOffset(r1, r2)
            r1 = 1
            r0.getDimensionPixelOffset(r1, r2)
            return
    }
}
