package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Editable;
import android.widget.EditText;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: e4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0195e4 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f225a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0195e4(int i) {
        super(96);
        this.f225a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0423qa.f763l.remove();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        String strM710b;
        boolean z;
        C0259i4 c0259i4;
        Editable text;
        String str;
        C0259i4 c0259i42;
        Object[] objArr2;
        C0465t4 c0465t4;
        int i = this.f225a;
        if (!HookEntry.runtimeBool(Prefs.KEY_FAVORITE_EMOTICON_BATCH_SEND) || methodHookParam == null || (objArr = methodHookParam.args) == null || i < 0 || i >= objArr.length) {
            return;
        }
        Object obj = objArr[i];
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            Member member = methodHookParam.method;
            Class<?> returnType = member instanceof Method ? ((Method) member).getReturnType() : Void.TYPE;
            C0227g4 c0227g4 = AbstractC0278j4.f463e;
            int i2 = 4;
            int i3 = 0;
            if (c0227g4 != null && (methodHookParam.method instanceof Method)) {
                long jCurrentTimeMillis = System.currentTimeMillis() - c0227g4.f305c;
                if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 1800) {
                    AbstractC0278j4.m712d(c0227g4);
                } else if (AbstractC0278j4.m710b(arrayList) == null && (c0259i42 = (C0259i4) AbstractC0278j4.f461c.get(c0227g4.f303a)) != null && c0259i42 == c0227g4.f304b && c0259i42.f379f == null) {
                    ConcurrentHashMap concurrentHashMap = AbstractC0423qa.f759h;
                    if (AbstractC0423qa.m804m(arrayList, true, 0, Collections.newSetFromMap(new IdentityHashMap()))) {
                        Object[] objArr3 = methodHookParam.args;
                        if (objArr3 == null) {
                            objArr2 = new Object[0];
                        } else {
                            objArr2 = (Object[]) objArr3.clone();
                            if (i >= 0 && i < objArr2.length && (objArr2[i] instanceof ArrayList)) {
                                objArr2[i] = new ArrayList((ArrayList) objArr2[i]);
                            }
                        }
                        C0243h4 c0243h4 = new C0243h4();
                        c0243h4.f347b = objArr2;
                        c0243h4.f346a = i;
                        c0259i42.f379f = c0243h4;
                        EditText editText = c0259i42.f376c;
                        if (c0259i42.f377d) {
                            Object obj2 = c0259i42.f375b;
                            Context context = editText.getContext();
                            if (context != null) {
                                int iM595b0 = AbstractC0260i5.m595b0(context, 34);
                                ArrayList arrayList2 = new ArrayList();
                                AbstractC0260i5.m542K(0, arrayList, arrayList2, Collections.newSetFromMap(new IdentityHashMap()), new int[]{0});
                                while (i3 < arrayList2.size()) {
                                    Bitmap bitmapM563R = AbstractC0260i5.m563R((String) arrayList2.get(i3), iM595b0);
                                    if (bitmapM563R != null) {
                                        c0465t4 = new C0465t4(bitmapM563R, AbstractC0260i5.m595b0(context, 2), iM595b0);
                                        break;
                                    }
                                    i3++;
                                }
                                AbstractC0260i5.m592a1(obj2, "captured", -1);
                                c0465t4 = null;
                                if (c0465t4 != null) {
                                    editText.post(new RunnableC0412q(c0259i42, c0465t4, i2));
                                }
                            } else {
                                c0465t4 = null;
                                if (c0465t4 != null) {
                                }
                            }
                        }
                        AbstractC0278j4.m712d(c0227g4);
                        AbstractC0497v4.m1080G(methodHookParam, returnType);
                        AbstractC0278j4.m729u("favorite emoticon batch captured official send token=" + c0227g4.f303a + " elements=" + arrayList.size() + " object=" + AbstractC0278j4.m718j(c0259i42.f375b));
                        return;
                    }
                }
            }
            if (AbstractC0278j4.f461c.isEmpty() || (strM710b = AbstractC0278j4.m710b(arrayList)) == null || strM710b.length() == 0) {
                return;
            }
            ArrayList arrayListM717i = AbstractC0278j4.m717i(strM710b);
            if (arrayListM717i.isEmpty()) {
                return;
            }
            ArrayList arrayListM728t = AbstractC0278j4.m728t(arrayListM717i);
            if (arrayListM728t.isEmpty()) {
                return;
            }
            Object[] objArr4 = methodHookParam.args;
            if (objArr4 == null) {
                z = false;
            } else {
                for (int i4 = 0; i4 < objArr4.length; i4++) {
                    Object obj3 = objArr4[i4];
                    if (obj3 != null) {
                        if (i4 != i) {
                            if (((obj3 instanceof Map) || !AbstractC0278j4.m726r(obj3.getClass())) && AbstractC0278j4.m722n(obj3, 0, AbstractC0278j4.m730v(), new int[]{0}, "")) {
                                z = true;
                                break;
                            }
                        } else {
                            if (AbstractC0278j4.m722n(obj3, 0, AbstractC0278j4.m730v(), new int[]{0}, "")) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            if (AbstractC0278j4.m715g(strM710b, arrayListM717i)) {
                ArrayList arrayList3 = new ArrayList();
                while (i3 < arrayListM728t.size()) {
                    C0259i4 c0259i43 = (C0259i4) arrayListM728t.get(i3);
                    if (c0259i43 != null && c0259i43.f379f != null) {
                        arrayList3.add(c0259i43);
                    }
                    i3++;
                }
                if (z) {
                    if (arrayList3.isEmpty()) {
                        AbstractC0497v4.m1080G(methodHookParam, returnType);
                        AbstractC0278j4.m733y(arrayListM717i);
                        AbstractC0278j4.m713e(arrayListM728t);
                        AbstractC0278j4.m706C("未捕捉到收藏表情发送数据，请重新点一次表情", arrayListM728t);
                        AbstractC0278j4.m729u("favorite emoticon batch reply blocked without captured data tokens=" + arrayListM717i.size());
                        return;
                    }
                    if (arrayList3.size() < arrayListM728t.size()) {
                        AbstractC0497v4.m1080G(methodHookParam, returnType);
                        AbstractC0278j4.m733y(arrayListM717i);
                        AbstractC0278j4.m713e(arrayListM728t);
                        AbstractC0278j4.m706C("部分收藏表情未捕捉到发送数据，本次已拦截", arrayListM728t);
                        AbstractC0278j4.m729u("favorite emoticon batch reply blocked partial captured count=" + arrayList3.size() + " tokens=" + arrayListM717i.size());
                        return;
                    }
                    if (AbstractC0278j4.m734z(methodHookParam, i, arrayList, arrayListM717i, arrayList3, true, "reply")) {
                        AbstractC0278j4.m733y(arrayListM717i);
                        AbstractC0278j4.m713e(arrayListM728t);
                        return;
                    }
                    AbstractC0497v4.m1080G(methodHookParam, returnType);
                    AbstractC0278j4.m733y(arrayListM717i);
                    AbstractC0278j4.m713e(arrayListM728t);
                    AbstractC0278j4.m706C("回复表情发送数据合并失败", arrayListM728t);
                    AbstractC0278j4.m729u("favorite emoticon batch reply merge failed tokens=" + arrayListM717i.size());
                    return;
                }
                if (arrayList3.isEmpty()) {
                    AbstractC0497v4.m1080G(methodHookParam, returnType);
                    AbstractC0278j4.m733y(arrayListM717i);
                    AbstractC0278j4.m713e(arrayListM728t);
                    AbstractC0278j4.m706C("未捕捉到收藏表情发送数据，请重新点一次表情", arrayListM728t);
                    AbstractC0278j4.m729u("favorite emoticon batch send blocked without captured data tokens=" + arrayListM717i.size());
                    return;
                }
                if (arrayList3.size() < arrayListM728t.size()) {
                    AbstractC0497v4.m1080G(methodHookParam, returnType);
                    AbstractC0278j4.m733y(arrayListM717i);
                    AbstractC0278j4.m713e(arrayListM728t);
                    AbstractC0278j4.m706C("部分收藏表情未捕捉到发送数据，本次已拦截", arrayListM728t);
                    AbstractC0278j4.m729u("favorite emoticon batch normal blocked partial captured count=" + arrayList3.size() + " tokens=" + arrayListM717i.size());
                    return;
                }
                if (AbstractC0278j4.m734z(methodHookParam, i, arrayList, arrayListM717i, arrayList3, false, "normal")) {
                    AbstractC0278j4.m733y(arrayListM717i);
                    AbstractC0278j4.m713e(arrayListM728t);
                    return;
                }
                AbstractC0497v4.m1080G(methodHookParam, returnType);
                AbstractC0278j4.m733y(arrayListM717i);
                AbstractC0278j4.m713e(arrayListM728t);
                AbstractC0278j4.m706C("收藏表情发送数据合并失败", arrayListM728t);
                AbstractC0278j4.m729u("favorite emoticon batch normal merge failed tokens=" + arrayListM717i.size());
                return;
            }
            AbstractC0497v4.m1080G(methodHookParam, returnType);
            if (arrayListM717i.isEmpty() || arrayListM728t.isEmpty()) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= arrayListM728t.size()) {
                    c0259i4 = null;
                    break;
                }
                c0259i4 = (C0259i4) arrayListM728t.get(i5);
                if (c0259i4 != null) {
                    break;
                } else {
                    i5++;
                }
            }
            EditText editText2 = c0259i4 == null ? null : c0259i4.f376c;
            if (arrayListM717i.size() > 16) {
                AbstractC0449s4.m907z(editText2, "混合发送收藏表情数量过多，已拦截");
                AbstractC0449s4.m897p("blocked reason=too_many_tokens count=" + arrayListM717i.size() + " limit=16");
                return;
            }
            if (editText2 == null) {
                while (true) {
                    if (i3 >= arrayListM728t.size()) {
                        break;
                    }
                    C0259i4 c0259i44 = (C0259i4) arrayListM728t.get(i3);
                    if (c0259i44 != null) {
                        AbstractC0449s4.m907z(c0259i44.f376c, "未找到输入框，已拦截混合发送");
                        break;
                    }
                    i3++;
                }
                AbstractC0449s4.m897p("blocked reason=input_missing method=" + AbstractC0449s4.m899r(methodHookParam) + " listIndex=" + i + " tokens=" + arrayListM717i.size());
                return;
            }
            try {
                text = editText2.getText();
            } catch (Throwable unused) {
                text = null;
            }
            if (text == null) {
                AbstractC0449s4.m907z(editText2, "输入框内容未就绪，已拦截混合发送");
                AbstractC0449s4.m897p("blocked reason=editable_missing input=" + editText2.getClass().getName() + " method=" + AbstractC0449s4.m899r(methodHookParam));
                return;
            }
            String string = text.toString();
            ArrayList arrayListM901t = AbstractC0449s4.m901t(string, arrayListM717i);
            if ((!AbstractC0449s4.m894m(arrayListM901t) || AbstractC0449s4.m889h(arrayListM901t) <= 0) && strM710b.length() > 0) {
                ArrayList arrayListM901t2 = AbstractC0449s4.m901t(strM710b, arrayListM717i);
                if (!AbstractC0449s4.m894m(arrayListM901t2) || AbstractC0449s4.m889h(arrayListM901t2) <= 0) {
                    str = string;
                } else {
                    AbstractC0449s4.m897p("using outgoing text snapshot current=" + AbstractC0449s4.m881A(string) + " outgoing=" + AbstractC0449s4.m881A(strM710b));
                    arrayListM901t = arrayListM901t2;
                    str = strM710b;
                }
            }
            if (!AbstractC0449s4.m894m(arrayListM901t) || AbstractC0449s4.m889h(arrayListM901t) <= 0) {
                AbstractC0449s4.m905x(editText2, text, strM710b);
                AbstractC0449s4.m907z(editText2, "混合内容解析失败，已拦截并保留输入");
                AbstractC0449s4.m897p("blocked reason=parse_not_mixed tokens=" + arrayListM717i.size() + " editable=" + AbstractC0449s4.m881A(string) + " text=" + AbstractC0449s4.m881A(strM710b));
                return;
            }
            C0540y c0540yM900s = AbstractC0449s4.m900s(editText2);
            if (c0540yM900s == null) {
                AbstractC0449s4.m905x(editText2, text, str);
                AbstractC0449s4.m907z(editText2, "未找到QQ官方图文输入链路，已拦截");
                AbstractC0449s4.m898q("blocked reason=official_span_missing", methodHookParam, i, editText2, text, arrayListM901t);
                return;
            }
            Editable editable = text;
            ArrayList arrayList4 = arrayListM901t;
            ArrayList arrayListM884c = AbstractC0449s4.m884c(str, arrayList4, arrayListM728t, c0540yM900s);
            if (arrayListM884c.size() != AbstractC0449s4.m889h(arrayList4)) {
                AbstractC0449s4.m905x(editText2, editable, str);
                AbstractC0449s4.m907z(editText2, "部分收藏表情不支持混合发送，已拦截");
                AbstractC0449s4.m898q("blocked reason=unsupported_favorite replacement=" + arrayListM884c.size() + "/" + AbstractC0449s4.m889h(arrayList4), methodHookParam, i, editText2, editable, arrayList4);
                return;
            }
            if (!AbstractC0449s4.m882a(editText2, editable, str, arrayListM884c)) {
                AbstractC0449s4.m905x(editText2, editable, str);
                AbstractC0449s4.m907z(editText2, "输入框官方图文内容写入失败，已拦截");
                AbstractC0449s4.m898q("blocked reason=span_apply_failed", methodHookParam, i, editText2, editable, arrayList4);
                return;
            }
            C0209f2 c0209f2M883b = AbstractC0449s4.m883b(editText2, editable.toString(), arrayListM884c.size(), false);
            String strM899r = AbstractC0449s4.m899r(methodHookParam);
            if (c0209f2M883b != null) {
                boolean[] zArr = {false};
                boolean[] zArr2 = {false};
                boolean[] zArr3 = {false};
                long[] jArr = {0, 80, 180, 360, 700};
                int i6 = 0;
                while (i6 < 5) {
                    int i7 = i6 + 1;
                    boolean[] zArr4 = zArr;
                    boolean[] zArr5 = zArr2;
                    AbstractC0449s4.m902u(c0209f2M883b, new RunnableC0310l4(zArr4, c0209f2M883b, i7, strM899r, zArr5, i6 == 4, zArr3), jArr[i6]);
                    zArr = zArr4;
                    i6 = i7;
                    zArr2 = zArr5;
                }
                AbstractC0449s4.m902u(c0209f2M883b, new RunnableC0239h0(3, c0209f2M883b), 1800L);
            }
            AbstractC0449s4.m898q("converted scheduled_auto_send", methodHookParam, i, editText2, editable, arrayList4);
            AbstractC0278j4.m733y(arrayListM717i);
        }
    }
}
