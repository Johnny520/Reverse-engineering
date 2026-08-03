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
        if (C1121e.f4286b != null) goto L6;
        C1121e.f4286b = new C1121e(3);
        return;
    }

    /* JADX INFO: renamed from: a */
    public int m205a(int r3) {
        if (r3 < this.f213c) goto L7;
        return 0;
    L7:
        return ((ByteBuffer) this.f214d).getShort(this.f212b + r3);
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo202b(View r1);

    /* JADX INFO: renamed from: c */
    public abstract void mo203c(View r1, Object r2);

    /* JADX INFO: renamed from: d */
    public Object m206d(View r3) {
        if (Build.VERSION.SDK_INT >= this.f212b) goto L5;
        Object r32 = r3.getTag(this.f211a);
        if (((Class) this.f214d).isInstance(r32) == false) goto L9;
        return r32;
    L9:
        return null;
    L5:
        return mo202b(r3);
    }

    /* JADX INFO: renamed from: e */
    public void m207e(View r3, Object r4) {
        if (Build.VERSION.SDK_INT < this.f212b) goto L6;
        mo203c(r3, r4);
        return;
    L6:
        if (mo204f(m206d(r3), r4) == false) goto L19;
        View.AccessibilityDelegate r02 = AbstractC0080Q.m282a(r3);
        if (r02 != null) goto L11;
        C0091b r03 = null;
    L14:
        if (r03 != null) goto L16;
        r03 = new C0091b();
    L16:
        AbstractC0080Q.m291j(r3, r03);
        r3.setTag(this.f211a, r4);
        AbstractC0080Q.m286e(r3, this.f213c);
        return;
    L11:
        if ((r02 instanceof C0089a) == false) goto L13;
        r03 = ((C0089a) r02).f237a;
        goto L14
    L13:
        r03 = new C0091b(r02);
        goto L14
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo204f(Object r1, Object r2);
}
