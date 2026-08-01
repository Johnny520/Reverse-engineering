package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p058d.AbstractC0515a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: b */
    public final int f913b;

    /* JADX INFO: renamed from: c */
    public final int f914c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515a.f1656t);
        this.f914c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f913b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
