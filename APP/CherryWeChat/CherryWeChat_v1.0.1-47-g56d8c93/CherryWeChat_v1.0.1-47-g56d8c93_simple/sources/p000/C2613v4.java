package p000;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: v4 */
/* JADX INFO: loaded from: classes.dex */
public class C2613v4 {

    /* JADX INFO: renamed from: b */
    public static final Class[] f9059b = null;

    /* JADX INFO: renamed from: c */
    public static final int[] f9060c = null;

    /* JADX INFO: renamed from: d */
    public static final int[] f9061d = null;

    /* JADX INFO: renamed from: e */
    public static final int[] f9062e = null;

    /* JADX INFO: renamed from: f */
    public static final int[] f9063f = null;

    /* JADX INFO: renamed from: g */
    public static final String[] f9064g = null;

    /* JADX INFO: renamed from: h */
    public static final C2520sy f9065h = null;

    /* JADX INFO: renamed from: a */
    public final Object[] f9066a;

    static {
        f9059b = new Class[]{Context.class, AttributeSet.class};
        f9060c = new int[]{R.attr.onClick};
        f9061d = new int[]{R.attr.accessibilityHeading};
        f9062e = new int[]{R.attr.accessibilityPaneTitle};
        f9063f = new int[]{R.attr.screenReaderFocusable};
        f9064g = new String[]{"android.widget.", "android.view.", "android.webkit."};
        f9065h = new C2520sy(0);
    }

    public C2613v4() {
        this.f9066a = new Object[2];
    }

    /* JADX INFO: renamed from: a */
    public C1306d3 mo2499a(Context r2, AttributeSet r3) {
        return new C1306d3(r2, r3);
    }

    /* JADX INFO: renamed from: b */
    public C1393f3 mo2500b(Context r3, AttributeSet r4) {
        return new C1393f3(r3, r4, io.github.cherrywechat.R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: c */
    public C1481h3 mo2501c(Context r3, AttributeSet r4) {
        return new C1481h3(r3, r4, io.github.cherrywechat.R.attr.checkboxStyle);
    }

    /* JADX INFO: renamed from: d */
    public C0692Q3 mo2502d(Context r2, AttributeSet r3) {
        return new C0692Q3(r2, r3);
    }

    /* JADX INFO: renamed from: e */
    public C2304o4 mo2503e(Context r2, AttributeSet r3) {
        return new C2304o4(r2, r3);
    }

    /* JADX INFO: renamed from: f */
    public final View m5126f(Context r3, String r4, String r5) {
        C2520sy r0 = f9065h;
        Constructor r1 = (Constructor) r0.get(r4);
        if (r1 != null) goto L8;
        if (r5 != null) goto L12;
        String r52 = r4;
    L7:
        r1 = Class.forName(r52, false, r3.getClassLoader()).asSubclass(View.class).getConstructor(f9059b);     // Catch: Exception -> L10
        r0.put(r4, r1);     // Catch: Exception -> L10
        goto L8
    L12:
        r52 = r5.concat(r4);     // Catch: Exception -> L10
    L10:
        return null;
    L8:
        r1.setAccessible(true);     // Catch: Exception -> L10
        return (View) r1.newInstance(this.f9066a);
    }
}
