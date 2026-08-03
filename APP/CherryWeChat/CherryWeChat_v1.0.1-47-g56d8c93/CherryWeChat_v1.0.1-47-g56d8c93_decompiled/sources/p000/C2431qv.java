package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: renamed from: qv */
/* JADX INFO: loaded from: classes.dex */
public class C2431qv extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC1166o f8526a;

    /* JADX INFO: renamed from: b */
    public final Rect f8527b;

    /* JADX INFO: renamed from: c */
    public boolean f8528c;

    /* JADX INFO: renamed from: d */
    public boolean f8529d;

    public C2431qv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8527b = new Rect();
        this.f8528c = true;
        this.f8529d = false;
    }

    public C2431qv(int i, int i2) {
        super(i, i2);
        this.f8527b = new Rect();
        this.f8528c = true;
        this.f8529d = false;
    }

    public C2431qv(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f8527b = new Rect();
        this.f8528c = true;
        this.f8529d = false;
    }

    public C2431qv(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f8527b = new Rect();
        this.f8528c = true;
        this.f8529d = false;
    }

    public C2431qv(C2431qv c2431qv) {
        super((ViewGroup.LayoutParams) c2431qv);
        this.f8527b = new Rect();
        this.f8528c = true;
        this.f8529d = false;
    }
}
