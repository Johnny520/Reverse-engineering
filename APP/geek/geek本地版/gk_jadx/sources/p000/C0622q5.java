package p000;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: q5 */
/* JADX INFO: loaded from: classes.dex */
public class C0622q5 {

    /* JADX INFO: renamed from: b */
    public static final Class[] f4014b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f4015c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f4016d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f4017e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f4018f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f4019g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final u30 f4020h = new u30();

    /* JADX INFO: renamed from: a */
    public final Object[] f4021a = new Object[2];

    /* JADX INFO: renamed from: a */
    public C0767u2 mo791a(Context context, AttributeSet attributeSet) {
        return new C0767u2(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public C0841w2 mo792b(Context context, AttributeSet attributeSet) {
        return new C0841w2(context, attributeSet, com.ljx.wechatmod.R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: c */
    public C0915y2 mo793c(Context context, AttributeSet attributeSet) {
        return new C0915y2(context, attributeSet, com.ljx.wechatmod.R.attr.checkboxStyle);
    }

    /* JADX INFO: renamed from: d */
    public C0174e4 mo794d(Context context, AttributeSet attributeSet) {
        return new C0174e4(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public C0249g5 mo795e(Context context, AttributeSet attributeSet) {
        return new C0249g5(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final View m2150f(Context context, String str, String str2) {
        String strConcat;
        u30 u30Var = f4020h;
        Constructor constructor = (Constructor) u30Var.getOrDefault(str, null);
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
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f4014b);
            u30Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f4021a);
    }
}
