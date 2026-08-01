package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class t50 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public t50() {
        if (iy.b != null) goto L6;
        iy.b = new iy(11);
        return;
    }

    public int a(int r3) {
        if (r3 < this.c) goto L5;
        return 0;
    L5:
        return ((ByteBuffer) this.d).getShort(this.b + r3);
    }

    public abstract Object b(View r1);

    public abstract void c(View r1, Object r2);

    public void d(View r3, Object r4) {
        if (Build.VERSION.SDK_INT < this.b) goto L7;
        c(r3, r4);
        return;
    L7:
        if (Build.VERSION.SDK_INT < this.b) goto L9;
        Object r0 = b(r3);
    L14:
        if (e(r0, r4) == false) goto L26;
        View.AccessibilityDelegate r02 = ja0.c(r3);
        if (r02 != null) goto L19;
        x r03 = null;
    L22:
        if (r03 != null) goto L24;
        r03 = new x();
    L24:
        ja0.l(r3, r03);
        r3.setTag(this.a, r4);
        ja0.g(r3, this.c);
        return;
    L19:
        if ((r02 instanceof v) == false) goto L21;
        r03 = ((v) r02).a;
        goto L22
    L21:
        r03 = new x(r02);
        goto L22
    L26:
        return;
    L9:
        r0 = r3.getTag(this.a);
        if (((Class) this.d).isInstance(r0) == true) goto L14;
        r0 = null;
        goto L14
    }

    public abstract boolean e(Object r1, Object r2);
}
