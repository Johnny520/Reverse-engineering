package p012G;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import p099y.AbstractC1048L;
import p099y.C1062a;
import p099y.C1064b;

/* JADX INFO: renamed from: G.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0139c {

    /* JADX INFO: renamed from: a */
    public int f434a;

    /* JADX INFO: renamed from: b */
    public int f435b;

    /* JADX INFO: renamed from: c */
    public int f436c;

    /* JADX INFO: renamed from: d */
    public Object f437d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0139c() {
        if (C0140d.f438c == null) {
            C0140d.f438c = new C0140d(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int m303a(int i2) {
        if (i2 < this.f436c) {
            return ((ByteBuffer) this.f437d).getShort(this.f435b + i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo304b(View view);

    /* JADX INFO: renamed from: c */
    public abstract void mo305c(View view, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m306d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f435b) {
            mo305c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f435b) {
            tag = mo304b(view);
        } else {
            tag = view.getTag(this.f434a);
            if (!((Class) this.f437d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo307e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM2284c = AbstractC1048L.m2284c(view);
            C1064b c1064b = accessibilityDelegateM2284c == null ? null : accessibilityDelegateM2284c instanceof C1062a ? ((C1062a) accessibilityDelegateM2284c).f3689a : new C1064b(accessibilityDelegateM2284c);
            if (c1064b == null) {
                c1064b = new C1064b();
            }
            AbstractC1048L.m2290i(view, c1064b);
            view.setTag(this.f434a, obj);
            AbstractC1048L.m2286e(view, this.f436c);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo307e(Object obj, Object obj2);
}
