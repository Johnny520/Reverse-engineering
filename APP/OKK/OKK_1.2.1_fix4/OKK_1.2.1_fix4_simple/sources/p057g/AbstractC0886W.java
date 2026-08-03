package p057g;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p001A0.AbstractC0016B;
import p087w.AbstractC1115e;
import p087w.InterfaceC1114d;

/* JADX INFO: renamed from: g.W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0886W {

    /* JADX INFO: renamed from: a */
    public static final int[] f3156a = null;

    /* JADX INFO: renamed from: b */
    public static final int[] f3157b = null;

    /* JADX INFO: renamed from: c */
    public static final Rect f3158c = null;

    static {
        f3156a = new int[]{R.attr.state_checked};
        f3157b = new int[0];
        f3158c = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public static void m2219a(Drawable r3) {
        String r02 = r3.getClass().getName();
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 29) goto L5;
        return;
    L5:
        if (r1 < 31) goto L7;
        return;
    L7:
        if ("android.graphics.drawable.ColorStateListDrawable".equals(r02) == false) goto L19;
        int[] r03 = r3.getState();
        if (r03 != null) goto L11;
    L14:
        r3.setState(f3156a);
    L15:
        r3.setState(r03);
        return;
    L11:
        if (r03.length == 0) goto L14;
        r3.setState(f3157b);
        goto L15
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Rect m2220b(Drawable r5) {
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 29) goto L6;
        Insets r52 = AbstractC0885V.m2218a(r5);
        return new Rect(AbstractC0016B.m29b(r52), AbstractC0883T.m2211a(r52), AbstractC0883T.m2216f(r52), AbstractC0883T.m2217g(r52));
    L6:
        boolean r3 = r5 instanceof InterfaceC1114d;
        Object r53 = r5;
        if (r3 == false) goto L9;
        ((AbstractC1115e) ((InterfaceC1114d) r5)).getClass();
        r53 = null;
    L9:
        if (r1 < 29) goto L11;
        boolean r54 = AbstractC0884U.f3150a;
    L18:
        return f3158c;
    L11:
        if (AbstractC0884U.f3150a == false) goto L18;
        Object r55 = AbstractC0884U.f3151b.invoke(r53, null);     // Catch: Throwable -> L19
        if (r55 == null) goto L18;
        return new Rect(AbstractC0884U.f3152c.getInt(r55), AbstractC0884U.f3153d.getInt(r55), AbstractC0884U.f3154e.getInt(r55), AbstractC0884U.f3155f.getInt(r55));
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m2221c(int r1, PorterDuff.Mode r2) {
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
