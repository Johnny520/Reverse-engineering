package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p000.AbstractC0982Wu;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a */
    public final int f3684a;

    /* JADX INFO: renamed from: b */
    public final int f3685b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3085t);
        this.f3685b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f3684a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
