package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public class q5 {
    public static final Class[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final String[] g = null;
    public static final u30 h = null;
    public final Object[] a;

    static {
        b = new Class[]{Context.class, AttributeSet.class};
        c = new int[]{R.attr.onClick};
        d = new int[]{R.attr.accessibilityHeading};
        e = new int[]{R.attr.accessibilityPaneTitle};
        f = new int[]{R.attr.screenReaderFocusable};
        g = new String[]{"android.widget.", "android.view.", "android.webkit."};
        h = new u30();
    }

    public q5() {
        this.a = new Object[2];
    }

    public u2 a(Context r2, AttributeSet r3) {
        return new u2(r2, r3);
    }

    public w2 b(Context r3, AttributeSet r4) {
        return new w2(r3, r4, com.ljx.wechatmod.R.attr.buttonStyle);
    }

    public y2 c(Context r3, AttributeSet r4) {
        return new y2(r3, r4, com.ljx.wechatmod.R.attr.checkboxStyle);
    }

    public e4 d(Context r2, AttributeSet r3) {
        return new e4(r2, r3);
    }

    public g5 e(Context r2, AttributeSet r3) {
        return new g5(r2, r3);
    }

    public final View f(Context r4, String r5, String r6) {
        u30 r0 = h;
        Constructor r2 = (Constructor) r0.getOrDefault(r5, null);
        if (r2 != null) goto L8;
        if (r6 != null) goto L11;
        String r62 = r5;
    L7:
        r2 = Class.forName(r62, false, r4.getClassLoader()).asSubclass(View.class).getConstructor(b);     // Catch: Exception -> L10
        r0.put(r5, r2);     // Catch: Exception -> L10
        goto L8
    L11:
        r62 = r6.concat(r5);     // Catch: Exception -> L10
    L10:
        return null;
    L8:
        r2.setAccessible(true);     // Catch: Exception -> L10
        return (View) r2.newInstance(this.a);
    }
}
