package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.xy;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(Context r2, AttributeSet r3) {
        super(r2, r3);
        TypedArray r22 = r2.obtainStyledAttributes(r3, xy.t);
        this.b = r22.getDimensionPixelOffset(0, -1);
        this.a = r22.getDimensionPixelOffset(1, -1);
    }
}
