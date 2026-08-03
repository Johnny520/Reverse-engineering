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

    public C0955b(View r1) {
        this.f3382a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m2287a() {
        int r02 = this.f3385d;
        View r1 = this.f3382a;
        int r03 = r02 - (r1.getTop() - this.f3383b);
        Field r2 = AbstractC0080Q.f219a;
        r1.offsetTopAndBottom(r03);
        r1.offsetLeftAndRight(0 - (r1.getLeft() - this.f3384c));
    }
}
