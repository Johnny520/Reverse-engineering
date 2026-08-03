package p062i0;

import android.view.View;
import java.lang.reflect.Field;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: i0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0955b {

    /* JADX INFO: renamed from: a */
    public final View f3382a;

    /* JADX INFO: renamed from: b */
    public int f3383b;

    /* JADX INFO: renamed from: c */
    public int f3384c;

    /* JADX INFO: renamed from: d */
    public int f3385d;

    public C0955b(View view) {
        this.f3382a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m2287a() {
        int i2 = this.f3385d;
        View view = this.f3382a;
        int top = i2 - (view.getTop() - this.f3383b);
        Field field = AbstractC0080Q.f219a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f3384c));
    }
}
