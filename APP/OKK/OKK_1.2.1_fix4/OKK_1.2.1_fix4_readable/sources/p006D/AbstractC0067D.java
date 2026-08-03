package p006D;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import p089x0.C1121e;

/* JADX INFO: renamed from: D.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0067D {

    /* JADX INFO: renamed from: a */
    public int f211a;

    /* JADX INFO: renamed from: b */
    public int f212b;

    /* JADX INFO: renamed from: c */
    public int f213c;

    /* JADX INFO: renamed from: d */
    public Object f214d;

    public AbstractC0067D() {
        if (C1121e.f4286b == null) {
            C1121e.f4286b = new C1121e(3);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m205a(int i2) {
        if (i2 < this.f213c) {
            return ((ByteBuffer) this.f214d).getShort(this.f212b + i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo202b(View view);

    /* JADX INFO: renamed from: c */
    public abstract void mo203c(View view, Object obj);

    /* JADX INFO: renamed from: d */
    public Object m206d(View view) {
        if (Build.VERSION.SDK_INT >= this.f212b) {
            return mo202b(view);
        }
        Object tag = view.getTag(this.f211a);
        if (((Class) this.f214d).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m207e(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.f212b) {
            mo203c(view, obj);
            return;
        }
        if (mo204f(m206d(view), obj)) {
            View.AccessibilityDelegate accessibilityDelegateM282a = AbstractC0080Q.m282a(view);
            C0091b c0091b = accessibilityDelegateM282a == null ? null : accessibilityDelegateM282a instanceof C0089a ? ((C0089a) accessibilityDelegateM282a).f237a : new C0091b(accessibilityDelegateM282a);
            if (c0091b == null) {
                c0091b = new C0091b();
            }
            AbstractC0080Q.m291j(view, c0091b);
            view.setTag(this.f211a, obj);
            AbstractC0080Q.m286e(view, this.f213c);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo204f(Object obj, Object obj2);
}
