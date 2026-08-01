package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.material.ripple.RunnableC1107;
import bsh.C2643;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.text.AbstractC5143;
import kotlin.text.Regex;
import p026.InterfaceC6294;
import p392.C9117;
import p392.C9125;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5864 implements InterfaceC6294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16020;

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
        char c;
        int i = 0;
        switch (this.f16020) {
            case 0:
                Object obj = methodHookParam.thisObject;
                "null cannot be cast to non-null type android.widget.LinearLayout";
                obj.getClass();
                LinearLayout linearLayout = (LinearLayout) obj;
                int childCount = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    CharSequence contentDescription = linearLayout.getChildAt(i2).getContentDescription();
                    if (contentDescription != null && contentDescription.equals("\u62cd\u7167")) {
                        linearLayout.removeViewAt(i2);
                    }
                    break;
                }
                break;
            case 1:
                Object obj2 = methodHookParam.thisObject;
                "null cannot be cast to non-null type android.widget.LinearLayout";
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
                    linearLayout2.post(new RunnableC1107(linearLayout2, 12));
                }
                break;
            case 2:
                Object result = methodHookParam.getResult();
                List list = AbstractC4387.m8903(result) ? (List) result : null;
                if (list != null) {
                    list.removeIf(new C2643(new C5858(), 2));
                    break;
                }
                break;
            case 3:
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 4:
                methodHookParam.getClass();
                Object obj3 = methodHookParam.thisObject;
                "null cannot be cast to non-null type android.widget.LinearLayout";
                obj3.getClass();
                LinearLayout linearLayout3 = (LinearLayout) obj3;
                int childCount2 = linearLayout3.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    CharSequence contentDescription2 = linearLayout3.getChildAt(i3).getContentDescription();
                    if (contentDescription2 != null && (contentDescription2.equals("\u6ee4\u955c\u89c6\u9891") || contentDescription2.equals("\u6ce1\u6ce1"))) {
                        linearLayout3.removeViewAt(i3);
                    }
                    break;
                }
                break;
            case 5:
                methodHookParam.args[2] = Integer.MAX_VALUE;
                break;
            case 6:
                XposedHelpers.setObjectField(methodHookParam.thisObject, "mForwardTargetMap", new FakeMap());
                break;
            case 7:
                Object obj4 = methodHookParam.thisObject;
                "thisObject";
                obj4.getClass();
                C5831.m11186(obj4);
                break;
            case 8:
                Object obj5 = methodHookParam.thisObject;
                "thisObject";
                obj5.getClass();
                C5831.m11186(obj5);
                break;
            case 9:
                methodHookParam.setResult((Object) null);
                break;
            case 10:
                Object obj6 = methodHookParam.args[2];
                "null cannot be cast to non-null type java.util.ArrayList<*>";
                obj6.getClass();
                Iterator it = ((ArrayList) obj6).iterator();
                "iterator(...)";
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    String strM6668 = "elementType";
                    Class cls = Integer.TYPE;
                    Object objM14649 = C9117.m14649(cls, strM6668, next);
                    "getField(...)";
                    objM14649.getClass();
                    if (((Number) objM14649).intValue() == 1) {
                        int i4 = C9125.f25503;
                        C9125 c9125M14680 = C9125.m14680(next.getClass());
                        c9125M14680.f25504 = "getTextElement";
                        Object objM14682 = c9125M14680.m14682(next, new Object[i]);
                        Integer num = (Integer) C9117.m14649(cls, "atType", objM14682);
                        if (num == null || num.intValue() != 2) {
                            C9125 c9125M146802 = C9125.m14680(objM14682.getClass());
                            c9125M146802.f25504 = "getContent";
                            c9125M146802.f25506 = String.class;
                            String string = (String) c9125M146802.m14682(objM14682, new Object[i]);
                            C9125 c9125M146803 = C9125.m14680(objM14682.getClass());
                            c9125M146803.f25504 = "setContent";
                            string.getClass();
                            if (string.length() != 0) {
                                StringBuilder sb = new StringBuilder();
                                char[] charArray = string.toCharArray();
                                "toCharArray(...)";
                                charArray.getClass();
                                int i5 = (C5826.m11182(charArray[i]) || C5826.m11183(charArray[i])) ? 1 : i;
                                int i6 = (C5826.m11183(charArray[i]) || (12288 <= (c = charArray[i]) && c < 12352) || (65280 <= c && c < 65520)) ? 1 : i;
                                int length = charArray.length;
                                int i7 = i;
                                while (i7 < length) {
                                    char c2 = charArray[i7];
                                    if (C5826.m11182(c2) || C5826.m11183(c2)) {
                                        i = 1;
                                    }
                                    int i8 = (C5826.m11183(c2) || (12288 <= c2 && c2 < 12352) || (65280 <= c2 && c2 < 65520)) ? 1 : 0;
                                    if (i != i5 && (i6 == 0 || i8 == 0)) {
                                        sb.append(" ");
                                    }
                                    sb.append(c2);
                                    i7++;
                                    i5 = i;
                                    i6 = i8;
                                    i = 0;
                                }
                                String string2 = sb.toString();
                                "toString(...)";
                                string = AbstractC5143.m10150(new Regex("(?<=[({\\[/#])\\s|\\s(?=[)}\\]:;])|(?<=\\n)\\s").replace(new Regex("[^\\n\\S]+").replace(string2, " "), "")).toString();
                            }
                            c9125M146803.m14682(objM14682, string);
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
