package p000;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: J3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0391J3 {

    /* JADX INFO: renamed from: a */
    public final TextView f1326a;

    /* JADX INFO: renamed from: b */
    public final C0132D2 f1327b;

    public C0391J3(TextView r2) {
        this.f1326a = r2;
        this.f1327b = new C0132D2(r2);
    }

    /* JADX INFO: renamed from: a */
    public final InputFilter[] m828a(InputFilter[] r2) {
        return ((AbstractC0828TB) this.f1327b.f328b).mo104m(r2);
    }

    /* JADX INFO: renamed from: b */
    public final void m829b(AttributeSet r4, int r5) {
        TypedArray r42 = this.f1326a.getContext().obtainStyledAttributes(r4, AbstractC0982Wu.f3074i, r5, 0);
        boolean r1 = true;
        if (r42.hasValue(14) == false) goto L9;
        r1 = r42.getBoolean(14, true);     // Catch: Throwable -> L7
    L9:
        r42.recycle();
        m831d(r1);
        return;
    L7:
        th = move-exception;
        r42.recycle();
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final void m830c(boolean r2) {
        ((AbstractC0828TB) this.f1327b.f328b).mo101B(r2);
    }

    /* JADX INFO: renamed from: d */
    public final void m831d(boolean r2) {
        ((AbstractC0828TB) this.f1327b.f328b).mo102C(r2);
    }
}
