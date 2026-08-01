package top.suzhelan.qstory.hook.item;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import de.robv.android.xposed.XposedHelpers;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5953 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1941));
            XposedHelpers.findAndHookMethod(clsM11866, AbstractC8405.m13972(550), new Object[]{new C5918(clsM11866, this)});
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1940);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11325(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (AbstractC4395.m8907(textView.getText().toString(), AbstractC8405.m13972(1939))) {
                    Object parent = textView.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    textView.addTextChangedListener(new C5877(0, textView, this));
                }
            } else if (childAt instanceof ViewGroup) {
                m11325((ViewGroup) childAt);
            }
        }
    }
}
