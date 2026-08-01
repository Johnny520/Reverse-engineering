package p000;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: q5 */
/* JADX INFO: loaded from: classes.dex */
public class C0621q5 {

    /* JADX INFO: renamed from: b */
    public static final Class[] f3800b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f3801c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f3802d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f3803e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f3804f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f3805g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final b40 f3806h = new b40();

    /* JADX INFO: renamed from: a */
    public final Object[] f3807a = new Object[2];

    /* JADX INFO: renamed from: a */
    public C0766u2 mo749a(Context context, AttributeSet attributeSet) {
        return new C0766u2(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public C0841w2 mo750b(Context context, AttributeSet attributeSet) {
        return new C0841w2(context, attributeSet, com.ljx.wechatmod.R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: c */
    public C0915y2 mo751c(Context context, AttributeSet attributeSet) {
        return new C0915y2(context, attributeSet, com.ljx.wechatmod.R.attr.checkboxStyle);
    }

    /* JADX INFO: renamed from: d */
    public C0174e4 mo752d(Context context, AttributeSet attributeSet) {
        return new C0174e4(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public C0249g5 mo753e(Context context, AttributeSet attributeSet) {
        return new C0249g5(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final View m2113f(Context context, String str, String str2) {
        String strConcat;
        b40 b40Var = f3806h;
        Constructor constructor = (Constructor) b40Var.getOrDefault(str, null);
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
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3800b);
            b40Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f3807a);
    }
}
