package top.suzhelan.qstory.hook.item.chat;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3065;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p034.AbstractC6344;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p389.C9086;
import top.suzhelan.qstory.hook.api.C5818;
import top.suzhelan.qstory.hook.api.InterfaceC5809;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "top/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世苏哲兰", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5851 extends AbstractC6311 implements InterfaceC5809 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        HashMap map = C5818.f15949;
        AbstractC6344.m11874(this, this);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2131);
    }

    @Override // top.suzhelan.qstory.hook.api.InterfaceC5809
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11229(Object obj, View view) {
        AbstractC8405.m13972(1908);
        AbstractC8405.m13972(1909);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object objM14663 = C9086.m14663(ArrayList.class, AbstractC8405.m13972(152), obj);
        AbstractC8405.m13972(1588);
        objM14663.getClass();
        Iterator it = ((ArrayList) objM14663).iterator();
        AbstractC8405.m13972(1253);
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC8405.m13972(1254);
            next.getClass();
            String strM13972 = AbstractC8405.m13972(338);
            Class cls = Integer.TYPE;
            Integer num = (Integer) C9086.m14663(cls, strM13972, next);
            if (num != null && num.intValue() == 1) {
                Object objM6837 = AbstractC3065.m6837(next, AbstractC8405.m13972(247), new Object[0]);
                Integer num2 = (Integer) C9086.m14663(cls, AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM6837);
                if (num2 != null && num2.intValue() == 2) {
                    linkedHashMap.put((String) AbstractC3065.m6837(objM6837, AbstractC8405.m13972(339), new Object[0]), (String) C9086.m14663(String.class, AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), objM6837));
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        String str = (String) C9086.m14663(String.class, AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj);
        Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(2132));
        clsM14669.getClass();
        ArrayList<View> arrayListM8322 = AbstractC3933.m8322(view);
        AbstractC8405.m13972(2133);
        for (View view2 : arrayListM8322) {
            if (view2.getClass().equals(clsM14669)) {
                AbstractC8405.m13972(2134);
                TextView textView = (TextView) view2;
                str.getClass();
                CharSequence text = textView.getText();
                if (text != null && text.length() != 0) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(text);
                    Object[] spans = spannableStringBuilderValueOf.getSpans(0, spannableStringBuilderValueOf.length(), C5852.class);
                    AbstractC8405.m13972(2135);
                    spans.getClass();
                    for (Object obj2 : spans) {
                        spannableStringBuilderValueOf.removeSpan(obj2);
                    }
                    String string = spannableStringBuilderValueOf.toString();
                    AbstractC8405.m13972(1296);
                    string.getClass();
                    boolean z = false;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        if (str2.length() != 0) {
                            int iM10170 = AbstractC5144.m10170(string, str2, 0, false, 6);
                            while (iM10170 >= 0) {
                                int length = str2.length() + iM10170;
                                spannableStringBuilderValueOf.setSpan(new C5852(str3, str), iM10170, length, 33);
                                iM10170 = AbstractC5144.m10170(string, str2, length, false, 4);
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
