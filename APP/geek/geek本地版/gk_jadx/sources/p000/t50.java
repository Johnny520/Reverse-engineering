package p000;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class t50 {

    /* JADX INFO: renamed from: a */
    public int f4510a;

    /* JADX INFO: renamed from: b */
    public int f4511b;

    /* JADX INFO: renamed from: c */
    public int f4512c;

    /* JADX INFO: renamed from: d */
    public Object f4513d;

    public t50() {
        if (C0354iy.f2510b == null) {
            C0354iy.f2510b = new C0354iy(11);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m2359a(int i) {
        if (i < this.f4512c) {
            return ((ByteBuffer) this.f4513d).getShort(this.f4511b + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo2068b(View view);

    /* JADX INFO: renamed from: c */
    public abstract void mo2069c(View view, Object obj);

    /* JADX INFO: renamed from: d */
    public void m2360d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f4511b) {
            mo2069c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f4511b) {
            tag = mo2068b(view);
        } else {
            tag = view.getTag(this.f4510a);
            if (!((Class) this.f4513d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo2070e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM1566c = ja0.m1566c(view);
            C0875x c0875x = accessibilityDelegateM1566c == null ? null : accessibilityDelegateM1566c instanceof C0801v ? ((C0801v) accessibilityDelegateM1566c).f4784a : new C0875x(accessibilityDelegateM1566c);
            if (c0875x == null) {
                c0875x = new C0875x();
            }
            ja0.m1575l(view, c0875x);
            view.setTag(this.f4510a, obj);
            ja0.m1570g(view, this.f4512c);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2070e(Object obj, Object obj2);
}
