package p061e;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p075l.C0753k;

/* JADX INFO: renamed from: e.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0549y {

    /* JADX INFO: renamed from: b */
    public static final Class[] f1851b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f1852c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f1853d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f1854e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f1855f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f1856g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final C0753k f1857h = new C0753k();

    /* JADX INFO: renamed from: a */
    public final Object[] f1858a = new Object[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final View m1125a(Context context, String str, String str2) {
        String strConcat;
        C0753k c0753k = f1857h;
        Constructor constructor = (Constructor) c0753k.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1851b);
            c0753k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1858a);
    }
}
