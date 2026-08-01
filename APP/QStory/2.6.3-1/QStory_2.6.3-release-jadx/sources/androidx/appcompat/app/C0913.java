package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0979;
import androidx.appcompat.widget.C1039;
import androidx.appcompat.widget.C1042;
import androidx.appcompat.widget.C1043;
import androidx.appcompat.widget.C1072;
import androidx.collection.C1130;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0913 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] f494 = new Object[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class[] f491 = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[] f490 = {R.attr.onClick};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f489 = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int[] f488 = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int[] f487 = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final String[] f493 = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1130 f492 = new C1130(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final View m766(Context context, String str, String str2) {
        String strConcat;
        C1130 c1130 = f492;
        Constructor constructor = (Constructor) c1130.get(str);
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
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f491);
            c1130.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f494);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C1072 mo767(Context context, AttributeSet attributeSet) {
        return new C1072(context, attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0979 mo768(Context context, AttributeSet attributeSet) {
        return new C0979(context, attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1043 mo769(Context context, AttributeSet attributeSet) {
        return new C1043(context, attributeSet, C0328R.attr.checkboxStyle);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1042 mo770(Context context, AttributeSet attributeSet) {
        return new C1042(context, attributeSet, C0328R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1039 mo771(Context context, AttributeSet attributeSet) {
        return new C1039(context, attributeSet);
    }
}
