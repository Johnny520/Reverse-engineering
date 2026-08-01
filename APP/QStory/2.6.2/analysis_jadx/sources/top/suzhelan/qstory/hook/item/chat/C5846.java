package top.suzhelan.qstory.hook.item.chat;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.method.MethodDescription;
import p000.AbstractC6087;
import p026.AbstractC6293;
import p316.C8675;
import p392.AbstractC9121;
import p392.C9117;
import top.suzhelan.qstory.hook.api.C5817;
import top.suzhelan.qstory.hook.api.InterfaceC5808;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "top/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世苏哲兰", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5846 extends AbstractC6293 implements InterfaceC5808 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        HashMap map = C5817.f15949;
        C8675.m14351(this, this);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937773489055073703L);
    }

    @Override // top.suzhelan.qstory.hook.api.InterfaceC5808
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11172(Object obj, View view) {
        AbstractC3056.m6668(-3937747620467049895L);
        AbstractC3056.m6668(-3937747568927442343L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object objM14649 = C9117.m14649(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), obj);
        AbstractC3056.m6668(-3937727850732586407L);
        objM14649.getClass();
        Iterator it = ((ArrayList) objM14649).iterator();
        AbstractC3056.m6668(-3937693916195980711L);
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3056.m6668(-3937693873246307751L);
            next.getClass();
            String strM6668 = AbstractC3056.m6668(-3937563452269397415L);
            Class cls = Integer.TYPE;
            Integer num = (Integer) C9117.m14649(cls, strM6668, next);
            if (num != null && num.intValue() == 1) {
                Object objM10031 = AbstractC5061.m10031(next, AbstractC3056.m6668(-3937563400729789863L), new Object[0]);
                Integer num2 = (Integer) C9117.m14649(cls, AbstractC3056.m6668(-3937565702832260519L), objM10031);
                if (num2 != null && num2.intValue() == 2) {
                    linkedHashMap.put((String) AbstractC5061.m10031(objM10031, AbstractC3056.m6668(-3937563327715345831L), new Object[0]), (String) C9117.m14649(String.class, AbstractC3056.m6668(-3937619535952348583L), objM10031));
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        String str = (String) C9117.m14649(String.class, AbstractC3056.m6668(-3937592177010673063L), obj);
        Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937565260450629031L));
        clsM14657.getClass();
        ArrayList<View> arrayListM11405 = AbstractC6087.m11405(view);
        AbstractC3056.m6668(-3937773471875204519L);
        for (View view2 : arrayListM11405) {
            if (view2.getClass().equals(clsM14657)) {
                AbstractC3056.m6668(-3937773394565793191L);
                TextView textView = (TextView) view2;
                str.getClass();
                CharSequence text = textView.getText();
                if (text != null && text.length() != 0) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(text);
                    Object[] spans = spannableStringBuilderValueOf.getSpans(0, spannableStringBuilderValueOf.length(), C5847.class);
                    AbstractC3056.m6668(-3937790733348767143L);
                    spans.getClass();
                    for (Object obj2 : spans) {
                        spannableStringBuilderValueOf.removeSpan(obj2);
                    }
                    String string = spannableStringBuilderValueOf.toString();
                    AbstractC3056.m6668(-3937690351373125031L);
                    string.getClass();
                    boolean z = false;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        if (str2.length() != 0) {
                            int iM10167 = AbstractC5143.m10167(string, str2, 0, false, 6);
                            while (iM10167 >= 0) {
                                int length = str2.length() + iM10167;
                                spannableStringBuilderValueOf.setSpan(new C5847(str3, str), iM10167, length, 33);
                                iM10167 = AbstractC5143.m10167(string, str2, length, false, 4);
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        textView.setText(spannableStringBuilderValueOf);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        textView.setLinksClickable(true);
                        textView.setHighlightColor(0);
                    }
                }
            }
        }
    }
}
