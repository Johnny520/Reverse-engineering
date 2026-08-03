package p037U;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: U.D */
/* JADX INFO: loaded from: classes.dex */
public class C0344D extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public final Rect f677a;

    /* JADX INFO: renamed from: b */
    public boolean f678b;

    /* JADX INFO: renamed from: c */
    public boolean f679c;

    public C0344D(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.f677a = new Rect();
        this.f678b = true;
        this.f679c = false;
    }

    public C0344D(int r1, int r2) {
        super(r1, r2);
        this.f677a = new Rect();
        this.f678b = true;
        this.f679c = false;
    }

    public C0344D(ViewGroup.MarginLayoutParams r1) {
        super(r1);
        this.f677a = new Rect();
        this.f678b = true;
        this.f679c = false;
    }

    public C0344D(ViewGroup.LayoutParams r1) {
        super(r1);
        this.f677a = new Rect();
        this.f678b = true;
        this.f679c = false;
    }

    public C0344D(C0344D r1) {
        super(r1);
        this.f677a = new Rect();
        this.f678b = true;
        this.f679c = false;
    }
}
