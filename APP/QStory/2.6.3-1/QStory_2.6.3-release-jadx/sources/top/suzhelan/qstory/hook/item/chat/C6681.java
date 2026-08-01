package top.suzhelan.qstory.hook.item.chat;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3897;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p050.AbstractC7173;
import p303.AbstractC9234;
import p405.AbstractC9919;
import p405.C9915;
import top.suzhelan.qstory.hook.api.C6648;
import top.suzhelan.qstory.hook.api.InterfaceC6639;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "top/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世苏哲兰", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6681 extends AbstractC7140 implements InterfaceC6639 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        HashMap map = C6648.f16294;
        AbstractC7173.m12433(this, this);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2131);
    }

    @Override // top.suzhelan.qstory.hook.api.InterfaceC6639
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11788(Object obj, View view) {
        AbstractC9234.m14531(1908);
        AbstractC9234.m14531(1909);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object objM15222 = C9915.m15222(ArrayList.class, AbstractC9234.m14531(152), obj);
        AbstractC9234.m14531(1588);
        objM15222.getClass();
        Iterator it = ((ArrayList) objM15222).iterator();
        AbstractC9234.m14531(1253);
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC9234.m14531(1254);
            next.getClass();
            String strM14531 = AbstractC9234.m14531(338);
            Class cls = Integer.TYPE;
            Integer num = (Integer) C9915.m15222(cls, strM14531, next);
            if (num != null && num.intValue() == 1) {
                Object objM7397 = AbstractC3897.m7397(next, AbstractC9234.m14531(247), new Object[0]);
                Integer num2 = (Integer) C9915.m15222(cls, AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM7397);
                if (num2 != null && num2.intValue() == 2) {
                    linkedHashMap.put((String) AbstractC3897.m7397(objM7397, AbstractC9234.m14531(339), new Object[0]), (String) C9915.m15222(String.class, AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), objM7397));
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        String str = (String) C9915.m15222(String.class, AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj);
        Class clsM15228 = AbstractC9919.m15228(AbstractC9234.m14531(2132));
        clsM15228.getClass();
        ArrayList<View> arrayListM8881 = AbstractC4765.m8881(view);
        AbstractC9234.m14531(2133);
        for (View view2 : arrayListM8881) {
            if (view2.getClass().equals(clsM15228)) {
                AbstractC9234.m14531(2134);
                TextView textView = (TextView) view2;
                str.getClass();
                CharSequence text = textView.getText();
                if (text != null && text.length() != 0) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(text);
                    Object[] spans = spannableStringBuilderValueOf.getSpans(0, spannableStringBuilderValueOf.length(), C6682.class);
                    AbstractC9234.m14531(2135);
                    spans.getClass();
                    for (Object obj2 : spans) {
                        spannableStringBuilderValueOf.removeSpan(obj2);
                    }
                    String string = spannableStringBuilderValueOf.toString();
                    AbstractC9234.m14531(1296);
                    string.getClass();
                    boolean z = false;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        if (str2.length() != 0) {
                            int iM10729 = AbstractC5976.m10729(string, str2, 0, false, 6);
                            while (iM10729 >= 0) {
                                int length = str2.length() + iM10729;
                                spannableStringBuilderValueOf.setSpan(new C6682(str3, str), iM10729, length, 33);
                                iM10729 = AbstractC5976.m10729(string, str2, length, false, 4);
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
