package p086r0;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import de.robv.android.xposed.XC_MethodHook;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;
import p001A0.C0019T;
import p005C0.C0069c;
import p006D.AbstractC0079h;
import p007D0.AbstractC0096d;
import p007D0.C0095c;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0129q;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0291a;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0300j;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;
import p094v0.C1026a;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1134q;
import p102z0.AbstractC1135r;
import p102z0.C1124g;
import p102z0.C1133p;

/* JADX INFO: renamed from: r0.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0898e1 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3158a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3159b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3160c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3161d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ GenericDeclaration f3162e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0898e1(Object obj, Object obj2, Object obj3, GenericDeclaration genericDeclaration, int i2) {
        this.f3158a = i2;
        this.f3159b = obj;
        this.f3160c = obj2;
        this.f3161d = obj3;
        this.f3162e = genericDeclaration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f3158a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0901f1 c0901f1 = (C0901f1) this.f3159b;
                Object obj = methodHookParam.thisObject;
                Class cls = (Class) this.f3160c;
                Class cls2 = (Class) this.f3161d;
                Class cls3 = (Class) this.f3162e;
                c0901f1.getClass();
                if (obj != null) {
                    Method[] declaredMethods = obj.getClass().getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                    ArrayList<Method> arrayList = new ArrayList();
                    for (Method method : declaredMethods) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            Class<?> returnType = method.getReturnType();
                            AbstractC0223g.m417d(returnType, "getReturnType(...)");
                            if (C0901f1.m1920l(returnType, cls)) {
                                arrayList.add(method);
                            }
                        }
                    }
                    for (Method method2 : arrayList) {
                        try {
                            method2.setAccessible(true);
                            Object objInvoke = method2.invoke(obj, null);
                            if (objInvoke != null) {
                                if (objInvoke != c0901f1.f3180g) {
                                    c0901f1.f3180g = objInvoke;
                                }
                                c0901f1.m1925d(objInvoke, cls2, cls3);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws JSONException, UnsupportedEncodingException {
        Object c0104d;
        Object c0104d2;
        EditText editText;
        boolean z2;
        Object c0104d3;
        Object obj;
        Object c0104d4;
        Method method;
        Object objInvoke;
        Object c0104d5;
        Editable text;
        Method method2;
        Editable text2;
        Method method3;
        boolean z3 = true;
        switch (this.f3158a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0019T c0019t = (C0019T) this.f3159b;
                AbstractC0731a.m1384a("read trace send hook hit", c0019t.f154a, c0019t.f155b, c0019t.f156c);
                final C0955x1 c0955x1 = (C0955x1) this.f3160c;
                final Context context = (Context) this.f3161d;
                Object obj2 = methodHookParam.thisObject;
                c0955x1.getClass();
                boolean z4 = AbstractC1126i.f3786a;
                if (C1124g.m2416G()) {
                    if (obj2 == null) {
                        c0104d = null;
                    } else if (obj2.getClass().getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")) {
                        c0104d = obj2;
                    } else {
                        Class<?> cls = obj2.getClass();
                        ArrayList<Field> arrayList = new ArrayList();
                        for (Class<?> superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                            try {
                                Field[] declaredFields = superclass.getDeclaredFields();
                                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                                c0104d2 = AbstractC0120h.m262j0(declaredFields);
                            } catch (Throwable th) {
                                c0104d2 = new C0104d(th);
                            }
                            Object obj3 = C0131s.f426a;
                            if (c0104d2 instanceof C0104d) {
                                c0104d2 = obj3;
                            }
                            arrayList.addAll((Collection) c0104d2);
                            break;
                        }
                        for (Field field : arrayList) {
                            try {
                                field.setAccessible(true);
                                c0104d = field.get(obj2);
                                if (c0104d == null || !c0104d.getClass().getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")) {
                                    c0104d = null;
                                }
                            } catch (Throwable th2) {
                                c0104d = new C0104d(th2);
                            }
                            if (c0104d instanceof C0104d) {
                                c0104d = null;
                            }
                            if (c0104d != null) {
                            }
                        }
                        c0104d = null;
                    }
                    if (c0104d == null) {
                        C0069c c0069c = C0069c.f316a;
                        WeakReference weakReference = C0069c.f319d;
                        c0104d = weakReference != null ? weakReference.get() : null;
                        if (c0104d == null) {
                            String name = obj2 != null ? obj2.getClass().getName() : null;
                            AbstractC0731a.m1384a("read trace chat footer missing", name != null ? name : "");
                        }
                    }
                    Object obj4 = c0104d;
                    if (obj4 instanceof View) {
                        View view = (View) AbstractC0123k.m268j0(AbstractC0503h.m987s((View) obj4, new C0925n1(6)));
                        editText = view instanceof EditText ? (EditText) view : null;
                    }
                    try {
                        Method[] methods = obj4.getClass().getMethods();
                        AbstractC0223g.m417d(methods, "getMethods(...)");
                        int length = methods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                Method method4 = methods[i2];
                                z2 = z3;
                                try {
                                    if (AbstractC0223g.m414a(method4.getName(), "getLastText")) {
                                        Class<?>[] parameterTypes = method4.getParameterTypes();
                                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                                        if (parameterTypes.length == 0 && AbstractC0223g.m414a(method4.getReturnType(), String.class)) {
                                            method3 = method4;
                                        }
                                    }
                                    i2++;
                                    z3 = z2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0104d3 = new C0104d(th);
                                }
                            } else {
                                z2 = z3;
                                method3 = null;
                            }
                        }
                        Object objInvoke2 = method3 != null ? method3.invoke(obj4, null) : null;
                        c0104d3 = objInvoke2 instanceof String ? (String) objInvoke2 : null;
                    } catch (Throwable th4) {
                        th = th4;
                        z2 = z3;
                    }
                    if (c0104d3 instanceof C0104d) {
                        c0104d3 = null;
                    }
                    String string = (String) c0104d3;
                    if (string == null) {
                        string = "";
                    }
                    if (AbstractC0307q.m534d0(string)) {
                        string = (editText == null || (text2 = editText.getText()) == null) ? null : text2.toString();
                        if (string == null) {
                            string = "";
                        }
                    }
                    boolean z5 = AbstractC1126i.f3786a;
                    String string2 = AbstractC0299i.m507C0(C1124g.m2435k().getReadTraceCommandPrefix()).toString();
                    if (AbstractC0307q.m534d0(string2)) {
                        string2 = "#read";
                    }
                    if (AbstractC0307q.m538h0(AbstractC0299i.m510F0(string).toString(), false, string2)) {
                        C0069c c0069c2 = C0069c.f316a;
                        String str = C0069c.f318c;
                        AbstractC0731a.m1384a("read trace command matched", AbstractC0174d.m352h("target=", str), AbstractC0174d.m351g(string.length(), "textLength="));
                        final String string3 = AbstractC0299i.m507C0(AbstractC0299i.m522t0(AbstractC0299i.m510F0(string).toString(), string2)).toString();
                        if (AbstractC0307q.m534d0(string3)) {
                            AbstractC0503h.m977O(context, "请输入要发送的追踪内容");
                        } else {
                            if (AbstractC0307q.m534d0(str)) {
                                try {
                                    Method[] methods2 = obj4.getClass().getMethods();
                                    AbstractC0223g.m417d(methods2, "getMethods(...)");
                                    int length2 = methods2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < length2) {
                                            method = methods2[i3];
                                            Method[] methodArr = methods2;
                                            if (AbstractC0223g.m414a(method.getName(), "getUserName")) {
                                                Class<?>[] parameterTypes2 = method.getParameterTypes();
                                                AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                                                if (parameterTypes2.length != 0 || !AbstractC0223g.m414a(method.getReturnType(), String.class)) {
                                                }
                                            }
                                            i3++;
                                            methods2 = methodArr;
                                        } else {
                                            method = null;
                                        }
                                    }
                                    if (method != null) {
                                        obj = null;
                                        try {
                                            objInvoke = method.invoke(obj4, null);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            c0104d4 = new C0104d(th);
                                        }
                                    } else {
                                        obj = null;
                                        objInvoke = null;
                                    }
                                    c0104d4 = objInvoke instanceof String ? (String) objInvoke : obj;
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj = null;
                                }
                                if (c0104d4 instanceof C0104d) {
                                    c0104d4 = obj;
                                }
                                String str2 = (String) c0104d4;
                                str = str2 == null ? "" : str2;
                                break;
                            }
                            if (AbstractC0307q.m534d0(str)) {
                                AbstractC0503h.m977O(context, "未识别当前聊天对象");
                            } else {
                                try {
                                    Method[] methods3 = obj4.getClass().getMethods();
                                    AbstractC0223g.m417d(methods3, "getMethods(...)");
                                    int length3 = methods3.length;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < length3) {
                                            method2 = methods3[i4];
                                            if (!AbstractC0223g.m414a(method2.getName(), "setLastText") || !Arrays.equals(method2.getParameterTypes(), new Class[]{String.class})) {
                                                i4++;
                                            }
                                        } else {
                                            method2 = null;
                                        }
                                    }
                                    if (method2 == null) {
                                        z2 = false;
                                    } else {
                                        method2.invoke(obj4, "");
                                    }
                                    c0104d5 = Boolean.valueOf(z2);
                                } catch (Throwable th7) {
                                    c0104d5 = new C0104d(th7);
                                }
                                Object obj5 = Boolean.FALSE;
                                if (c0104d5 instanceof C0104d) {
                                    c0104d5 = obj5;
                                }
                                if (!((Boolean) c0104d5).booleanValue() && editText != null && (text = editText.getText()) != null) {
                                    text.clear();
                                }
                                String string4 = UUID.randomUUID().toString();
                                AbstractC0223g.m417d(string4, "toString(...)");
                                final String strM537g0 = AbstractC0307q.m537g0(string4, "-", "");
                                boolean z6 = AbstractC1126i.f3786a;
                                String string5 = AbstractC0299i.m507C0(C1124g.m2435k().getReadTraceServerUrl()).toString();
                                if (AbstractC0307q.m534d0(string5)) {
                                    string5 = "https://read.spint.kdns.fr";
                                }
                                String string6 = AbstractC0299i.m507C0(string5).toString();
                                if (AbstractC0307q.m534d0(string6)) {
                                    AbstractC0503h.m977O(context, "请先配置已读追踪服务地址");
                                } else {
                                    String strM2437m = C1124g.m2437m();
                                    StringBuilder sb = new StringBuilder(C0955x1.m2131d(string6, "pixel"));
                                    sb.append("?id=");
                                    Charset charset = AbstractC0291a.f663a;
                                    String strEncode = URLEncoder.encode(strM537g0, charset.name());
                                    AbstractC0223g.m417d(strEncode, "encode(...)");
                                    sb.append(strEncode);
                                    if (!AbstractC0307q.m534d0(strM2437m)) {
                                        sb.append("&wxId=");
                                        String strEncode2 = URLEncoder.encode(strM2437m, charset.name());
                                        AbstractC0223g.m417d(strEncode2, "encode(...)");
                                        sb.append(strEncode2);
                                    }
                                    final String string7 = sb.toString();
                                    AbstractC0223g.m417d(string7, "toString(...)");
                                    String strM2131d = C0955x1.m2131d(string6, "register");
                                    JSONObject jSONObjectPut = new JSONObject().put("id", strM537g0);
                                    byte[] bytes = string3.getBytes(charset);
                                    AbstractC0223g.m417d(bytes, "getBytes(...)");
                                    String strEncodeToString = Base64.encodeToString(bytes, 11);
                                    AbstractC0223g.m417d(strEncodeToString, "encodeToString(...)");
                                    String string8 = jSONObjectPut.put("msg", strEncodeToString).put("wxId", strM2437m).toString();
                                    AbstractC0223g.m417d(string8, "toString(...)");
                                    ThreadPoolExecutor threadPoolExecutor = AbstractC0096d.f381a;
                                    final String str3 = str;
                                    AbstractC0079h.m169L(strM2131d, string8, new InterfaceC0204l() { // from class: r0.v1
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p025M0.InterfaceC0204l
                                        /* JADX INFO: renamed from: c */
                                        public final Object mo8c(Object obj6) {
                                            Object c0104d6;
                                            C0095c c0095c = (C0095c) obj6;
                                            AbstractC0223g.m418e(c0095c, "response");
                                            String str4 = new String(c0095c.f379c, AbstractC0291a.f663a);
                                            final C0955x1 c0955x12 = c0955x1;
                                            c0955x12.getClass();
                                            try {
                                                JSONObject jSONObject = new JSONObject(str4);
                                                String strOptString = jSONObject.optString("pixelUrl");
                                                if (AbstractC0307q.m534d0(strOptString)) {
                                                    strOptString = jSONObject.optString("url");
                                                }
                                                if (AbstractC0307q.m534d0(strOptString)) {
                                                    strOptString = jSONObject.optString("pixel");
                                                }
                                                AbstractC0223g.m417d(strOptString, "ifBlank(...)");
                                                c0104d6 = AbstractC0307q.m537g0(strOptString, "&amp;", "&");
                                            } catch (Throwable th8) {
                                                c0104d6 = new C0104d(th8);
                                            }
                                            if (c0104d6 instanceof C0104d) {
                                                c0104d6 = "";
                                            }
                                            String str5 = (String) c0104d6;
                                            if (AbstractC0307q.m534d0(str5)) {
                                                str5 = string7;
                                            }
                                            final String str6 = str5;
                                            Handler handler = c0955x12.f3434a;
                                            final Context context2 = context;
                                            final String str7 = str3;
                                            final String str8 = string3;
                                            final String str9 = strM537g0;
                                            handler.post(new Runnable() { // from class: r0.w1
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i5;
                                                    int iM518p0;
                                                    String strSubstring;
                                                    int i6;
                                                    int iM517o0;
                                                    Object c0104d7;
                                                    Object objInvoke3;
                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                    String str10 = str8;
                                                    c0955x12.getClass();
                                                    String strM2130c = C0955x1.m2130c(str10);
                                                    StringBuilder sbM357m = AbstractC0174d.m357m("\n            <msg>\n              <appmsg appid=\"\" sdkver=\"0\">\n                <title>当前版本不支持展示该内容，请升级至最新版本。</title>\n                <action>view</action>\n                <type>51</type>\n                <url>https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade</url>\n                <finderFeed>\n                  <objectId>14667626555619936481</objectId>\n                  <objectNonceId>8625307247096037618_0_12_2_1_1748600110424042_f7dd7f2e-3d3e-11f0-adb0-43719c7e1fc7</objectNonceId>\n                  <feedType>4</feedType>\n                  <username>v2_060000231003b20faec8cae38d1ac4d6c800e435b077830e54ceb941efb42210f69f736d359b@finder</username>\n                  <avatar><![CDATA[https://wx.qlogo.cn/finderhead/ver_1/MiawsaiaO8qpgTJBRD70ROuXN6En8LoKZ266tvlLeRGRHbb7CvcqKrxH19a2mxiafeuCoakYZhsf1u3AYEB3BooKZ6lpCfRVnsfjMfMHC4ibR67iaV6rR4qZ5Irmal16AFpQ0/0]]></avatar>\n                  <desc>", C0955x1.m2130c(str10), "</desc>\n                  <mediaCount>1</mediaCount>\n                  <authIconType>1</authIconType>\n                  <authIconUrl><![CDATA[https://dldir1v6.qq.com/weixin/checkresupdate/auth_icon_level3_2e2f94615c1e4651a25a7e0446f63135.png]]></authIconUrl>\n                  <mediaList>\n                    <media>\n                      <mediaType>4</mediaType>\n                      <url><![CDATA[http://wxapp.tc.qq.com/251/20302/stodownload?encfilekey=rjD5jyTuFrIpZ2ibE8T7YmwgiahniaXswqz0uUhqGrF2B7C1FqN4dW4RUFEqbMlm05rmPXfSmjgCf3G9ia8ia5kibCH5kxIczTrbCbgAqYUvKicB0IA1udGCuzXpw&hy=SH&idx=1&m=&uzid=7a15c&token=cztXnd9GyrE6cgMDsjj0eZ1MdRB3Eib2ic7rNkGkF4Z9FR5nuld6Yiap9VEugIeCegbHKzjOSMHy5EPTzfChDe3YZJjiaR7aiaFbEzmJ7lsaIjCkSIMxuHkzHibDgX42h1Lq3VySAfoEl06sU0vskxMYumKLA4llQm1WU2hX00ItegJ0c&basedata=CAESBnhXVDE1MRoGeFdUMTExGgZ4V1QxMTIaBnhXVDE1MxoGeFdUMTU2GgZ4V1QxNTEaBnhXVDE1NxoGeFdUMTU4IhgKCgoGeFdUMTEyEAEKCgoGeFdUMTU3EAEqBwiYHRAAGAI&sign=60es22k_sbg7L-LeRKkcDVtXNMBrP54gaTyqCSSs7KRwQm_cI792BPZxaghvauP9954aUbkgAXldv-6hcaDvjA&ctsc=12&extg=10eb900&svrbypass=AAuL%2FQsFAAABAAAAAAC%2B28t6CjV1pwlsLoU5aBAAAADnaHZTnGbFfAj9RgZXfw6Vfkx7FpiL%2B22LVp4HLkn05tij40%2FAsJD%2BPQrMho6FgQX6w1ETaBHqHtM%3D&svrnonce=1748600110]]></url>\n                      <thumbUrl><![CDATA[");
                                                    String str11 = str6;
                                                    sbM357m.append(str11);
                                                    sbM357m.append("]]></thumbUrl>\n                      <coverUrl><![CDATA[");
                                                    sbM357m.append(str11);
                                                    sbM357m.append("]]></coverUrl>\n                      <width>1080.0</width>\n                      <height>1920.0</height>\n                      <videoPlayDuration>8</videoPlayDuration>\n                    </media>\n                  </mediaList>\n                  <sourceCommentScene>1</sourceCommentScene>\n                  <finderShareExtInfo><![CDATA[{\"hasInput\":false,\"tabContextId\":\"4-1748600105044\",\"contextId\":\"1-1-17-e669331b7d4243ecae426b3a64ec81b5\",\"shareSrcScene\":4}]]></finderShareExtInfo>\n                </finderFeed>\n              </appmsg>\n            </msg>\n        ");
                                                    String strM529Y = AbstractC0300j.m529Y("\n            <msg>\n              <appmsg appid=\"\" sdkver=\"0\">\n                <title>" + strM2130c + "</title>\n                <action>view</action>\n                <type>57</type>\n                <refermsg>\n                  <type>49</type>\n                  <svrid>3081795456970157299</svrid>\n                  <fromusr>wxid_</fromusr>\n                  <chatusr>wxid_</chatusr>\n                  <displayname> </displayname>\n                  <msgsource>&lt;msgsource&gt;&lt;alnode&gt;&lt;fr&gt;2&lt;/fr&gt;&lt;/alnode&gt;&lt;sec_msg_node&gt;&lt;/sec_msg_node&gt;&lt;/msgsource&gt;</msgsource>\n                  <content>" + C0955x1.m2130c(AbstractC0300j.m529Y(sbM357m.toString())) + "</content>\n                  <createtime>" + (System.currentTimeMillis() / ((long) 1000)) + "</createtime>\n                </refermsg>\n              </appmsg>\n            </msg>\n        ");
                                                    Context context3 = context2;
                                                    String str12 = str7;
                                                    boolean zBooleanValue = false;
                                                    if (AbstractC1135r.m2503y(context3)) {
                                                        int iM518p02 = AbstractC0299i.m518p0(strM529Y, "<title>", 0, false, 6);
                                                        String strSubstring2 = "";
                                                        if (iM518p02 >= 0 && (iM518p0 = AbstractC0299i.m518p0(strM529Y, "</title>", (i5 = iM518p02 + 7), false, 4)) >= 0) {
                                                            strSubstring = strM529Y.substring(i5, iM518p0);
                                                            AbstractC0223g.m417d(strSubstring, "substring(...)");
                                                        } else {
                                                            strSubstring = "";
                                                        }
                                                        int iM518p03 = AbstractC0299i.m518p0(strM529Y, "appid=\"", 0, false, 6);
                                                        if (iM518p03 >= 0 && (iM517o0 = AbstractC0299i.m517o0(strM529Y, '\"', (i6 = 7 + iM518p03), 4)) >= 0) {
                                                            strSubstring2 = strM529Y.substring(i6, iM517o0);
                                                            AbstractC0223g.m417d(strSubstring2, "substring(...)");
                                                        }
                                                        String str13 = strSubstring2;
                                                        try {
                                                            Method method5 = AbstractC1135r.f3837i;
                                                            if (method5 != null && (objInvoke3 = method5.invoke(null, strM529Y)) != null) {
                                                                Method method6 = AbstractC1135r.f3838j;
                                                                if (method6 != null) {
                                                                    method6.invoke(null, objInvoke3, str13, strSubstring, str12, null, null);
                                                                }
                                                                zBooleanValue = true;
                                                            }
                                                            c0104d7 = Boolean.valueOf(zBooleanValue);
                                                        } catch (Throwable th9) {
                                                            c0104d7 = new C0104d(th9);
                                                        }
                                                        Throwable thM246a = AbstractC0105e.m246a(c0104d7);
                                                        if (thM246a != null) {
                                                            AbstractC0731a.m1387d("read trace send xml appmsg fail", thM246a);
                                                        }
                                                        Boolean bool = Boolean.FALSE;
                                                        if (c0104d7 instanceof C0104d) {
                                                            c0104d7 = bool;
                                                        }
                                                        zBooleanValue = ((Boolean) c0104d7).booleanValue();
                                                    } else {
                                                        AbstractC0731a.m1387d("read trace sender not prepared");
                                                    }
                                                    boolean z7 = zBooleanValue;
                                                    String str14 = str9;
                                                    if (z7) {
                                                        Handler handler2 = AbstractC1134q.f3825a;
                                                        if (!AbstractC0307q.m534d0(str12) && !AbstractC0307q.m534d0(str14)) {
                                                            ArrayList arrayListM283y0 = AbstractC0123k.m283y0(AbstractC1134q.m2464e());
                                                            AbstractC0129q.m293g0(arrayListM283y0, new C1026a(str14));
                                                            arrayListM283y0.add(new C1133p(str12, str14, AbstractC0299i.m506B0(80, str10), jCurrentTimeMillis, "", false));
                                                            AbstractC1134q.m2471l(AbstractC1134q.m2461b(arrayListM283y0));
                                                            AbstractC0731a.m1384a("read trace monitor record", str12, str14);
                                                        }
                                                        AbstractC1134q.m2467h(context3, str12);
                                                    }
                                                    AbstractC0503h.m977O(context3, z7 ? "已发送已读追踪：".concat(str14) : "已读追踪发送失败");
                                                    AbstractC0731a.m1384a("read trace send result", "sent=" + z7, "target=".concat(str12), "trackId=".concat(str14));
                                                }
                                            });
                                            return C0109i.f404a;
                                        }
                                    });
                                }
                            }
                        }
                        C0955x1 c0955x12 = (C0955x1) this.f3160c;
                        Method method5 = (Method) this.f3162e;
                        c0955x12.getClass();
                        Class<?> returnType = method5.getReturnType();
                        methodHookParam.setResult((AbstractC0223g.m414a(returnType, Boolean.TYPE) || AbstractC0223g.m414a(returnType, Boolean.class)) ? Boolean.TRUE : (AbstractC0223g.m414a(returnType, Integer.TYPE) || AbstractC0223g.m414a(returnType, Integer.class)) ? 0 : (AbstractC0223g.m414a(returnType, Long.TYPE) || AbstractC0223g.m414a(returnType, Long.class)) ? 0L : (AbstractC0223g.m414a(returnType, Float.TYPE) || AbstractC0223g.m414a(returnType, Float.class)) ? Float.valueOf(0.0f) : (AbstractC0223g.m414a(returnType, Double.TYPE) || AbstractC0223g.m414a(returnType, Double.class)) ? Double.valueOf(0.0d) : (AbstractC0223g.m414a(returnType, Short.TYPE) || AbstractC0223g.m414a(returnType, Short.class)) ? (short) 0 : (AbstractC0223g.m414a(returnType, Byte.TYPE) || AbstractC0223g.m414a(returnType, Byte.class)) ? (byte) 0 : (AbstractC0223g.m414a(returnType, Character.TYPE) || AbstractC0223g.m414a(returnType, Character.class)) ? (char) 0 : null);
                        break;
                    }
                    break;
                }
                break;
        }
    }
}
