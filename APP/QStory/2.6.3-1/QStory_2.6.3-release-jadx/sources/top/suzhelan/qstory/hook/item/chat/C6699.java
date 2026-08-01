package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.material.ripple.RunnableC1945;
import bsh.C3477;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import p042.InterfaceC7141;
import p303.AbstractC9234;
import p405.C9915;
import p405.C9921;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6699 implements InterfaceC7141 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16372;

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
        char c;
        int i = 0;
        switch (this.f16372) {
            case 0:
                Object obj = methodHookParam.thisObject;
                AbstractC9234.m14531(2146);
                obj.getClass();
                LinearLayout linearLayout = (LinearLayout) obj;
                int childCount = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    CharSequence contentDescription = linearLayout.getChildAt(i2).getContentDescription();
                    if (contentDescription != null && contentDescription.equals(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜呜喵~呜呜呜呜喵呜呜呜~呜喵喵喵呜呜呜呜~呜呜呜喵喵喵喵喵~呜呜喵喵呜喵呜呜"))) {
                        linearLayout.removeViewAt(i2);
                    }
                    break;
                }
                break;
            case 1:
                Object obj2 = methodHookParam.thisObject;
                AbstractC9234.m14531(2146);
                obj2.getClass();
                final LinearLayout linearLayout2 = (LinearLayout) obj2;
                if (linearLayout2.getChildCount() >= 4) {
                    final View childAt = linearLayout2.getChildAt(2);
                    if (childAt != null) {
                        linearLayout2.post(new Runnable() { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏哲兰世
                            @Override // java.lang.Runnable
                            public final void run() {
                                linearLayout2.removeView(childAt);
                            }
                        });
                    }
                } else if (linearLayout2.getChildCount() >= 2) {
                    linearLayout2.post(new RunnableC1945(linearLayout2, 12));
                }
                break;
            case 2:
                Object result = methodHookParam.getResult();
                List list = AbstractC5220.m9452(result) ? (List) result : null;
                if (list != null) {
                    list.removeIf(new C3477(new C6693(), 2));
                    break;
                }
                break;
            case 3:
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 4:
                methodHookParam.getClass();
                Object obj3 = methodHookParam.thisObject;
                AbstractC9234.m14531(2146);
                obj3.getClass();
                LinearLayout linearLayout3 = (LinearLayout) obj3;
                int childCount2 = linearLayout3.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    CharSequence contentDescription2 = linearLayout3.getChildAt(i3).getContentDescription();
                    if (contentDescription2 != null && (contentDescription2.equals(AbstractC9234.m14531(2198)) || contentDescription2.equals(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜喵喵喵呜呜喵~呜呜喵呜呜喵呜呜~呜喵喵喵呜呜呜喵~呜呜喵呜喵呜呜喵~呜呜喵喵呜呜喵呜")))) {
                        linearLayout3.removeViewAt(i3);
                    }
                    break;
                }
                break;
            case 5:
                methodHookParam.args[2] = Integer.MAX_VALUE;
                break;
            case 6:
                XposedHelpers.setObjectField(methodHookParam.thisObject, AbstractC9234.m14531(527), new FakeMap());
                break;
            case 7:
                Object obj4 = methodHookParam.thisObject;
                AbstractC9234.m14531(1891);
                obj4.getClass();
                C6674.m11813(obj4);
                break;
            case 8:
                Object obj5 = methodHookParam.thisObject;
                AbstractC9234.m14531(1891);
                obj5.getClass();
                C6674.m11813(obj5);
                break;
            case 9:
                methodHookParam.setResult((Object) null);
                break;
            case 10:
                Object obj6 = methodHookParam.args[2];
                AbstractC9234.m14531(2235);
                obj6.getClass();
                Iterator it = ((ArrayList) obj6).iterator();
                AbstractC9234.m14531(1253);
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    String strM14531 = AbstractC9234.m14531(338);
                    Class cls = Integer.TYPE;
                    Object objM15222 = C9915.m15222(cls, strM14531, next);
                    AbstractC9234.m14531(1588);
                    objM15222.getClass();
                    int i4 = 1;
                    if (((Number) objM15222).intValue() == 1) {
                        int i5 = C9921.f25825;
                        C9921 c9921M15231 = C9921.m15231(next.getClass());
                        c9921M15231.f25826 = AbstractC9234.m14531(247);
                        Object objM15233 = c9921M15231.m15233(next, new Object[i]);
                        Integer num = (Integer) C9915.m15222(cls, AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM15233);
                        if (num == null || num.intValue() != 2) {
                            C9921 c9921M152312 = C9921.m15231(objM15233.getClass());
                            c9921M152312.f25826 = AbstractC9234.m14531(339);
                            c9921M152312.f25828 = String.class;
                            String string = (String) c9921M152312.m15233(objM15233, new Object[i]);
                            C9921 c9921M152313 = C9921.m15231(objM15233.getClass());
                            c9921M152313.f25826 = AbstractC9234.m14531(340);
                            string.getClass();
                            if (string.length() != 0) {
                                StringBuilder sb = new StringBuilder();
                                char[] charArray = string.toCharArray();
                                AbstractC9234.m14531(2232);
                                charArray.getClass();
                                int i6 = (C6660.m11800(charArray[i]) || C6660.m11801(charArray[i])) ? 1 : i;
                                int i7 = (C6660.m11801(charArray[i]) || (12288 <= (c = charArray[i]) && c < 12352) || (65280 <= c && c < 65520)) ? 1 : i;
                                int length = charArray.length;
                                int i8 = i;
                                while (i8 < length) {
                                    char c2 = charArray[i8];
                                    if (!C6660.m11800(c2) && !C6660.m11801(c2)) {
                                        i4 = 0;
                                    }
                                    int i9 = (C6660.m11801(c2) || (12288 <= c2 && c2 < 12352) || (65280 <= c2 && c2 < 65520)) ? 1 : 0;
                                    if (i4 != i6 && (i7 == 0 || i9 == 0)) {
                                        sb.append(AbstractC9234.m14532("喵呜喵呜喵喵呜呜"));
                                    }
                                    sb.append(c2);
                                    i8++;
                                    i6 = i4;
                                    i7 = i9;
                                    i4 = 1;
                                }
                                String string2 = sb.toString();
                                AbstractC9234.m14531(1296);
                                string = AbstractC5976.m10714(new Regex(AbstractC9234.m14531(2234)).replace(new Regex(AbstractC9234.m14531(2233)).replace(string2, AbstractC9234.m14532("喵呜喵呜喵喵呜呜")), "")).toString();
                            }
                            c9921M152313.m15233(objM15233, string);
                            i = 0;
                        }
                    }
                }
                break;
            default:
                methodHookParam.setResult((Object) null);
                break;
        }
    }
}
