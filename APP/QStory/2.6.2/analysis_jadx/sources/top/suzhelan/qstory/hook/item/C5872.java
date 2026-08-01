package top.suzhelan.qstory.hook.item;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰哲苏楪;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5872 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        try {
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937761016470046119L));
            XposedHelpers.findAndHookMethod(clsM11838, AbstractC3056.m6668(-3937622254666646951L), new Object[]{new C5912(clsM11838, this)});
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937761102369392039L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11222(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (AbstractC4394.m8917(textView.getText().toString(), AbstractC3056.m6668(-3937761050829784487L))) {
                    Object parent = textView.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    textView.addTextChangedListener(new C5871(i, textView, this));
                }
            } else if (childAt instanceof ViewGroup) {
                m11222((ViewGroup) childAt);
            }
        }
    }
}
