package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0132;
import androidx.appcompat.widget.C0192;
import androidx.appcompat.widget.C0195;
import androidx.appcompat.widget.C0196;
import androidx.appcompat.widget.C0225;
import androidx.collection.C0283;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0066 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] f149 = new Object[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class[] f146 = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[] f145 = {R.attr.onClick};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f144 = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int[] f143 = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int[] f142 = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final String[] f148 = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0283 f147 = new C0283(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final View m205(Context context, String str, String str2) {
        String strConcat;
        C0283 c0283 = f147;
        Constructor constructor = (Constructor) c0283.get(str);
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
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f146);
            c0283.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f149);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0225 mo206(Context context, AttributeSet attributeSet) {
        return new C0225(context, attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0132 mo207(Context context, AttributeSet attributeSet) {
        return new C0132(context, attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0196 mo208(Context context, AttributeSet attributeSet) {
        return new C0196(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.checkboxStyle);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0195 mo209(Context context, AttributeSet attributeSet) {
        return new C0195(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0192 mo210(Context context, AttributeSet attributeSet) {
        return new C0192(context, attributeSet);
    }
}
