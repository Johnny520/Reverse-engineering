package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p000.AbstractC0910xy;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a */
    public final int f190a;

    /* JADX INFO: renamed from: b */
    public final int f191b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0910xy.f5236t);
        this.f191b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f190a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
