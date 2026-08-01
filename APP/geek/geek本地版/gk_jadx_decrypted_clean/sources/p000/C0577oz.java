package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: oz */
/* JADX INFO: loaded from: classes.dex */
public class C0577oz extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public b00 f3621a;

    /* JADX INFO: renamed from: b */
    public final Rect f3622b;

    /* JADX INFO: renamed from: c */
    public boolean f3623c;

    /* JADX INFO: renamed from: d */
    public boolean f3624d;

    public C0577oz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3622b = new Rect();
        this.f3623c = true;
        this.f3624d = false;
    }

    public C0577oz(int i, int i2) {
        super(i, i2);
        this.f3622b = new Rect();
        this.f3623c = true;
        this.f3624d = false;
    }

    public C0577oz(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3622b = new Rect();
        this.f3623c = true;
        this.f3624d = false;
    }

    public C0577oz(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3622b = new Rect();
        this.f3623c = true;
        this.f3624d = false;
    }

    public C0577oz(C0577oz c0577oz) {
        super((ViewGroup.LayoutParams) c0577oz);
        this.f3622b = new Rect();
        this.f3623c = true;
        this.f3624d = false;
    }
}
