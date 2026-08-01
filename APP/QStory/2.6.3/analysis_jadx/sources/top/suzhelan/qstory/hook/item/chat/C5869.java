package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.material.ripple.RunnableC1107;
import bsh.C2644;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.text.AbstractC5144;
import kotlin.text.Regex;
import p026.InterfaceC6312;
import p287.AbstractC8405;
import p389.C9086;
import p389.C9092;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5869 implements InterfaceC6312 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16027;

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
        char c;
        int i = 0;
        switch (this.f16027) {
            case 0:
                Object obj = methodHookParam.thisObject;
                AbstractC8405.m13972(2146);
                obj.getClass();
                LinearLayout linearLayout = (LinearLayout) obj;
                int childCount = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    CharSequence contentDescription = linearLayout.getChildAt(i2).getContentDescription();
                    if (contentDescription != null && contentDescription.equals(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜呜喵~呜呜呜呜喵呜呜呜~呜喵喵喵呜呜呜呜~呜呜呜喵喵喵喵喵~呜呜喵喵呜喵呜呜"))) {
                        linearLayout.removeViewAt(i2);
                    }
                    break;
                }
                break;
            case 1:
                Object obj2 = methodHookParam.thisObject;
                AbstractC8405.m13972(2146);
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
                List list = AbstractC4388.m8893(result) ? (List) result : null;
                if (list != null) {
                    list.removeIf(new C2644(new C5863(), 2));
                    break;
                }
                break;
            case 3:
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 4:
                methodHookParam.getClass();
                Object obj3 = methodHookParam.thisObject;
                AbstractC8405.m13972(2146);
                obj3.getClass();
                LinearLayout linearLayout3 = (LinearLayout) obj3;
                int childCount2 = linearLayout3.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    CharSequence contentDescription2 = linearLayout3.getChildAt(i3).getContentDescription();
                    if (contentDescription2 != null && (contentDescription2.equals(AbstractC8405.m13972(2198)) || contentDescription2.equals(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜喵喵喵呜呜喵~呜呜喵呜呜喵呜呜~呜喵喵喵呜呜呜喵~呜呜喵呜喵呜呜喵~呜呜喵喵呜呜喵呜")))) {
                        linearLayout3.removeViewAt(i3);
                    }
                    break;
                }
                break;
            case 5:
                methodHookParam.args[2] = Integer.MAX_VALUE;
                break;
            case 6:
                XposedHelpers.setObjectField(methodHookParam.thisObject, AbstractC8405.m13972(527), new FakeMap());
                break;
            case 7:
                Object obj4 = methodHookParam.thisObject;
                AbstractC8405.m13972(1891);
                obj4.getClass();
                C5844.m11254(obj4);
                break;
            case 8:
                Object obj5 = methodHookParam.thisObject;
                AbstractC8405.m13972(1891);
                obj5.getClass();
                C5844.m11254(obj5);
                break;
            case 9:
                methodHookParam.setResult((Object) null);
                break;
            case 10:
                Object obj6 = methodHookParam.args[2];
                AbstractC8405.m13972(2235);
                obj6.getClass();
                Iterator it = ((ArrayList) obj6).iterator();
                AbstractC8405.m13972(1253);
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    String strM13972 = AbstractC8405.m13972(338);
                    Class cls = Integer.TYPE;
                    Object objM14663 = C9086.m14663(cls, strM13972, next);
                    AbstractC8405.m13972(1588);
                    objM14663.getClass();
                    int i4 = 1;
                    if (((Number) objM14663).intValue() == 1) {
                        int i5 = C9092.f25480;
                        C9092 c9092M14672 = C9092.m14672(next.getClass());
                        c9092M14672.f25481 = AbstractC8405.m13972(247);
                        Object objM14674 = c9092M14672.m14674(next, new Object[i]);
                        Integer num = (Integer) C9086.m14663(cls, AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM14674);
                        if (num == null || num.intValue() != 2) {
                            C9092 c9092M146722 = C9092.m14672(objM14674.getClass());
                            c9092M146722.f25481 = AbstractC8405.m13972(339);
                            c9092M146722.f25483 = String.class;
                            String string = (String) c9092M146722.m14674(objM14674, new Object[i]);
                            C9092 c9092M146723 = C9092.m14672(objM14674.getClass());
                            c9092M146723.f25481 = AbstractC8405.m13972(340);
                            string.getClass();
                            if (string.length() != 0) {
                                StringBuilder sb = new StringBuilder();
                                char[] charArray = string.toCharArray();
                                AbstractC8405.m13972(2232);
                                charArray.getClass();
                                int i6 = (C5830.m11241(charArray[i]) || C5830.m11242(charArray[i])) ? 1 : i;
                                int i7 = (C5830.m11242(charArray[i]) || (12288 <= (c = charArray[i]) && c < 12352) || (65280 <= c && c < 65520)) ? 1 : i;
                                int length = charArray.length;
                                int i8 = i;
                                while (i8 < length) {
                                    char c2 = charArray[i8];
                                    if (!C5830.m11241(c2) && !C5830.m11242(c2)) {
                                        i4 = 0;
                                    }
                                    int i9 = (C5830.m11242(c2) || (12288 <= c2 && c2 < 12352) || (65280 <= c2 && c2 < 65520)) ? 1 : 0;
                                    if (i4 != i6 && (i7 == 0 || i9 == 0)) {
                                        sb.append(AbstractC8405.m13973("喵呜喵呜喵喵呜呜"));
                                    }
                                    sb.append(c2);
                                    i8++;
                                    i6 = i4;
                                    i7 = i9;
                                    i4 = 1;
                                }
                                String string2 = sb.toString();
                                AbstractC8405.m13972(1296);
                                string = AbstractC5144.m10155(new Regex(AbstractC8405.m13972(2234)).replace(new Regex(AbstractC8405.m13972(2233)).replace(string2, AbstractC8405.m13973("喵呜喵呜喵喵呜呜")), "")).toString();
                            }
                            c9092M146723.m14674(objM14674, string);
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
