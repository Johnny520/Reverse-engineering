package p000;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: Ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0107Ce {

    /* JADX INFO: renamed from: a */
    public static final int[] f250a = null;

    /* JADX INFO: renamed from: b */
    public static final int[] f251b = null;

    /* JADX INFO: renamed from: c */
    public static final Rect f252c = null;

    static {
        f250a = new int[]{R.attr.state_checked};
        f251b = new int[0];
        f252c = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public static void m159a(Drawable r3) {
        String r0 = r3.getClass().getName();
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 29) goto L5;
        return;
    L5:
        if (r1 < 31) goto L7;
        return;
    L7:
        if ("android.graphics.drawable.ColorStateListDrawable".equals(r0) == false) goto L19;
        int[] r02 = r3.getState();
        if (r02 != null) goto L11;
    L14:
        r3.setState(f250a);
    L15:
        r3.setState(r02);
        return;
    L11:
        if (r02.length == 0) goto L14;
        r3.setState(f251b);
        goto L15
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Rect m160b(Drawable r5) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 29) goto L6;
        Insets r52 = AbstractC2801ze.m5373a(r5);
        return new Rect(AbstractC0688Q.m1397a(r52), AbstractC0688Q.m1418v(r52), AbstractC0688Q.m1422z(r52), AbstractC0688Q.m1395C(r52));
    L6:
        boolean r2 = r5 instanceof InterfaceC0704QF;
        Object r53 = r5;
        if (r2 == false) goto L9;
        ((AbstractC0746RF) ((InterfaceC0704QF) r5)).getClass();
        r53 = null;
    L9:
        if (r0 < 29) goto L11;
        boolean r54 = AbstractC2758ye.f9387a;
    L18:
        return f252c;
    L11:
        if (AbstractC2758ye.f9387a == false) goto L18;
        Object r55 = AbstractC2758ye.f9388b.invoke(r53, null);     // Catch: Throwable -> L19
        if (r55 == null) goto L18;
        return new Rect(AbstractC2758ye.f9389c.getInt(r55), AbstractC2758ye.f9390d.getInt(r55), AbstractC2758ye.f9391e.getInt(r55), AbstractC2758ye.f9392f.getInt(r55));
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m161c(int r1, PorterDuff.Mode r2) {
        if (r1 == 3) goto L21;
        if (r1 == 5) goto L19;
        if (r1 == 9) goto L17;
        switch(r1) {
            case 14: goto L15;
            case 15: goto L13;
            case 16: goto L11;
            default: goto L9;
        };
    L9:
        return r2;
    L11:
        return PorterDuff.Mode.ADD;
    L13:
        return PorterDuff.Mode.SCREEN;
    L15:
        return PorterDuff.Mode.MULTIPLY;
    L17:
        return PorterDuff.Mode.SRC_ATOP;
    L19:
        return PorterDuff.Mode.SRC_IN;
    L21:
        return PorterDuff.Mode.SRC_OVER;
    }
}
