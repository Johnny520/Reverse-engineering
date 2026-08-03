package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p048b.AbstractC0550a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public AlertController$RecycleListView(Context r2, AttributeSet r3) {
        super(r2, r3);
        TypedArray r22 = r2.obtainStyledAttributes(r3, AbstractC0550a.f1632q);
        r22.getDimensionPixelOffset(0, -1);
        r22.getDimensionPixelOffset(1, -1);
    }
}
