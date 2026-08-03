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
    public static final Class[] f9059b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f9060c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f9061d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f9062e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f9063f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f9064g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final C2520sy f9065h = new C2520sy(0);

    /* JADX INFO: renamed from: a */
    public final Object[] f9066a = new Object[2];

    /* JADX INFO: renamed from: a */
    public C1306d3 mo2499a(Context context, AttributeSet attributeSet) {
        return new C1306d3(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public C1393f3 mo2500b(Context context, AttributeSet attributeSet) {
        return new C1393f3(context, attributeSet, io.github.cherrywechat.R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: c */
    public C1481h3 mo2501c(Context context, AttributeSet attributeSet) {
        return new C1481h3(context, attributeSet, io.github.cherrywechat.R.attr.checkboxStyle);
    }

    /* JADX INFO: renamed from: d */
    public C0692Q3 mo2502d(Context context, AttributeSet attributeSet) {
        return new C0692Q3(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public C2304o4 mo2503e(Context context, AttributeSet attributeSet) {
        return new C2304o4(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final View m5126f(Context context, String str, String str2) {
        String strConcat;
        C2520sy c2520sy = f9065h;
        Constructor constructor = (Constructor) c2520sy.get(str);
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
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f9059b);
            c2520sy.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f9066a);
    }
}
