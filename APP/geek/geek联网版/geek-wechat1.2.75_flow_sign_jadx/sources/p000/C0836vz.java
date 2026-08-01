package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: vz */
/* JADX INFO: loaded from: classes.dex */
public class C0836vz extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public i00 f5017a;

    /* JADX INFO: renamed from: b */
    public final Rect f5018b;

    /* JADX INFO: renamed from: c */
    public boolean f5019c;

    /* JADX INFO: renamed from: d */
    public boolean f5020d;

    public C0836vz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5018b = new Rect();
        this.f5019c = true;
        this.f5020d = false;
    }

    public C0836vz(int i, int i2) {
        super(i, i2);
        this.f5018b = new Rect();
        this.f5019c = true;
        this.f5020d = false;
    }

    public C0836vz(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5018b = new Rect();
        this.f5019c = true;
        this.f5020d = false;
    }

    public C0836vz(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5018b = new Rect();
        this.f5019c = true;
        this.f5020d = false;
    }

    public C0836vz(C0836vz c0836vz) {
        super((ViewGroup.LayoutParams) c0836vz);
        this.f5018b = new Rect();
        this.f5019c = true;
        this.f5020d = false;
    }
}
