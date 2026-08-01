package p000;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class z50 {

    /* JADX INFO: renamed from: a */
    public int f5547a;

    /* JADX INFO: renamed from: b */
    public int f5548b;

    /* JADX INFO: renamed from: c */
    public int f5549c;

    /* JADX INFO: renamed from: d */
    public Object f5550d;

    public z50() {
        if (C0426kw.f2874b == null) {
            C0426kw.f2874b = new C0426kw(13);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m2795a(int i) {
        if (i < this.f5549c) {
            return ((ByteBuffer) this.f5550d).getShort(this.f5548b + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo2447b(View view);

    /* JADX INFO: renamed from: c */
    public abstract void mo2448c(View view, Object obj);

    /* JADX INFO: renamed from: d */
    public void m2796d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f5548b) {
            mo2448c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f5548b) {
            tag = mo2447b(view);
        } else {
            tag = view.getTag(this.f5547a);
            if (!((Class) this.f5550d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo2449e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM2003c = oa0.m2003c(view);
            C0875x c0875x = accessibilityDelegateM2003c == null ? null : accessibilityDelegateM2003c instanceof C0800v ? ((C0800v) accessibilityDelegateM2003c).f4870a : new C0875x(accessibilityDelegateM2003c);
            if (c0875x == null) {
                c0875x = new C0875x();
            }
            oa0.m2012l(view, c0875x);
            view.setTag(this.f5547a, obj);
            oa0.m2007g(view, this.f5549c);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2449e(Object obj, Object obj2);
}
