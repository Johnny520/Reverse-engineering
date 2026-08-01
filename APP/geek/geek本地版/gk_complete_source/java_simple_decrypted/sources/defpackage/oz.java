package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class oz extends ViewGroup.MarginLayoutParams {
    public b00 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public oz(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public oz(int r1, int r2) {
        super(r1, r2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public oz(ViewGroup.MarginLayoutParams r1) {
        super(r1);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public oz(ViewGroup.LayoutParams r1) {
        super(r1);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public oz(oz r1) {
        super(r1);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
