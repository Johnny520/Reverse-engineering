package p001;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.List;
import java.util.NoSuchElementException;
import p001.AbstractC0149b0;
import p001.AbstractC0255i8;
import p001.AbstractC0356q;
import p001.AlertDialogC0414u5;
import p001.C0178d1;

/* JADX INFO: renamed from: ۟.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0235h2 extends AbstractC0484za {

    /* JADX INFO: renamed from: ۥ */
    public int f824;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f1490 = "dialog";

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final String f1491 = "update";

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final String f1492 = "update_tip";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final a f823 = new a();

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static final List<String> f1493 = C0272jb.m1106("https://raw.gitmirror.com/tpnet/XpConfig/master/", "https://raw.kkgithub.com/tpnet/XpConfig/master/", "https://raw.bgithub.xyz/tpnet/XpConfig/master/", "https://ghfast.top/https://raw.githubusercontent.com/tpnet/XpConfig/master/", "https://ghproxy.net/raw.githubusercontent.com/tpnet/XpConfig/master/", "https://gh-proxy.com/raw.githubusercontent.com/tpnet/XpConfig/master/");

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static final String f1494 = "redbook/";

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final String f1495 = "tpnet/XpConfig";

    /* JADX INFO: renamed from: ۟.h2$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static void m861(InterfaceC0222g3 interfaceC0222g3) {
            "callback";
            C0286kb c0286kb = AbstractC0356q.f1031;
            AbstractC0356q.c.m1191().execute(new RunnableC0278k3(interfaceC0222g3, 1));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ۟ */
        public static String m862() {
            List<String> list = C0235h2.f1493;
            AbstractC0255i8.a aVar = AbstractC0255i8.f860;
            C0237h4.m1090("<this>", list);
            C0237h4.m1090("random", aVar);
            if (list.isEmpty()) {
                throw new NoSuchElementException("Collection is empty.");
            }
            String str = list.get(aVar.m1094(list.size()));
            return ((Object) str) + C0235h2.f1494;
        }
    }

    /* JADX INFO: renamed from: ۟.h2$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final b f825 = new b();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090("it", methodHookParam2);
            String simpleName = methodHookParam2.thisObject.getClass().getSimpleName();
            if (C0432va.m1253(simpleName, "SettingActivity") || C0432va.m1253(simpleName, "IndexActivity")) {
                C0235h2.m1085(methodHookParam2);
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.h2$c */
    public static final class c extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {
        public c() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090("it", methodHookParam2);
            C0325n8.f994.getClass();
            if (C0325n8.m904().length() > 0) {
                Object obj = methodHookParam2.thisObject;
                C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", obj);
                Activity activity = (Activity) obj;
                View viewFindViewById = activity.findViewById(R.id.content);
                if (viewFindViewById == null) {
                    C0235h2.m1084(C0235h2.this, activity);
                } else {
                    viewFindViewById.postDelayed(new RunnableC0258ib(C0235h2.this, activity, 5), 200L);
                }
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.h2$d */
    public static final class d extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final d f827 = new d();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            int i = 6;
            C0237h4.m1090("it", methodHookParam2);
            Object obj = methodHookParam2.thisObject;
            C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", obj);
            Activity activity = (Activity) obj;
            FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
            if (frameLayout != null) {
                C0286kb c0286kb = AbstractC0356q.f1031;
                AbstractC0356q.c.m921().postDelayed(new RunnableC0258ib(frameLayout, activity, i), 100L);
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.h2$e */
    public static final class e extends AbstractC0335o4 implements InterfaceC0222g3<Method, Boolean> {

        /* JADX INFO: renamed from: ۥ */
        public static final e f828 = new e();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final Boolean mo984(Method method) {
            Method method2 = method;
            C0237h4.m1090("$this$findMethod", method2);
            boolean z = false;
            if (method2.getParameterTypes().length == 1 && C0237h4.m864(method2.getParameterTypes()[0], ViewGroup.class)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: ۟.h2$f */
    public static final class f extends AbstractC0335o4 implements InterfaceC0208f3<Boolean> {

        /* JADX INFO: renamed from: ۥ */
        public static final f f829 = new f();

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final Boolean mo7() {
            C0338o7 c0338o7 = C0338o7.f1010;
            C0338o7.m1181("update", 32);
            return Boolean.TRUE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m1084(C0235h2 c0235h2, Activity activity) {
        int i = c0235h2.f824;
        if (i > 3) {
            c0235h2.f824 = 0;
            return;
        }
        c0235h2.f824 = i + 1;
        a aVar = f823;
        C0263j2 c0263j2 = new C0263j2(c0235h2, activity);
        aVar.getClass();
        a.m861(c0263j2);
        C0277k2 c0277k2 = C0277k2.f901;
        "callback";
        C0286kb c0286kb = AbstractC0356q.f1031;
        AbstractC0356q.c.m1191().execute(new RunnableC0278k3(c0277k2, 2));
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m1085(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr = methodHookParam.args;
        Object obj = objArr[1];
        Object obj2 = objArr[0];
        if (C0237h4.m864(obj, -1) && C0237h4.m864(obj2, 666)) {
            Object obj3 = methodHookParam.args[2];
            Intent intent = obj3 instanceof Intent ? (Intent) obj3 : null;
            if (intent != null) {
                Object obj4 = methodHookParam.thisObject;
                C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", obj4);
                String strM955 = C0437w2.m955((Activity) obj4, intent.getData());
                C0479z5 c0479z5 = AlertDialogC0414u5.f1826;
                C0479z5 c0479z5M948 = AlertDialogC0414u5.a.m948();
                if (c0479z5M948 != null) {
                    C0237h4.m865(strM955);
                    c0479z5M948.mo984(strM955);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final void m1086(C0235h2 c0235h2, Activity activity, C0446wb c0446wb) {
        c0235h2.getClass();
        C0338o7 c0338o7 = C0338o7.f1010;
        boolean zM913 = C0338o7.m913(f1492, false);
        if (c0446wb != null && !c0446wb.f1181 && !zM913) {
            C0286kb c0286kb = C0178d1.f750;
            if (c0446wb.m959(C0178d1.b.m841().mo1059("rp", false))) {
                StringBuilder sbM924 = C0372r2.m924("猪手版本更新", c0446wb.f1857);
                sbM924.append("(");
                sbM924.append(c0446wb.f1858);
                sbM924.append(")");
                String string = sbM924.toString();
                C0237h4.m1089("toString(...)", string);
                int i = C0330o.f1000;
                AlertDialogC0441w6 alertDialogC0441w6 = new AlertDialogC0441w6(activity, string, C0330o.m1175(c0446wb.f1862));
                alertDialogC0441w6.m1083(new C0333o2(c0446wb));
                alertDialogC0441w6.m1081(new C0346p2(c0235h2, activity));
                C0272jb.m1109(alertDialogC0441w6, c0446wb.f1863);
                if (c0446wb.f1181) {
                    alertDialogC0441w6.m858();
                    alertDialogC0441w6.setCancelable(false);
                } else {
                    AbstractAlertDialogC0230gb.m1077(alertDialogC0441w6);
                    alertDialogC0441w6.m1082(new C0263j2(c0235h2, activity));
                    alertDialogC0441w6.f1487.setText("不再提示");
                }
                alertDialogC0441w6.show();
                return;
            }
        }
        m1087(activity);
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static void m1087(Activity activity) {
        C0338o7 c0338o7 = C0338o7.f1010;
        if (C0338o7.m914(f1491) != 32) {
            String strM915 = "1.2.7(32)更新内容";
            int i = C0330o.f1000;
            AlertDialogC0441w6 alertDialogC0441w6 = new AlertDialogC0441w6(activity, strM915, C0330o.m1175("对比1.2.6更新记录：<br>1. 修复 笔记可能不显示保存LivePhoto<br>2. 修复 保存评论Livephoto可能失败<br>3. 新增 保存单张笔记无水印Livephoto<br>4. 新增 可自定义模拟首页附近的位置<br>5. 修复 可能无法去除首页第一页的直播笔记<br>6. 新增 可去除分享链接的用户信息追踪"));
            C0272jb.m1109(alertDialogC0441w6, 2);
            alertDialogC0441w6.m858();
            alertDialogC0441w6.m1083(f.f829);
            alertDialogC0441w6.show();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        Method method;
        C0237h4.m1090("processName", str);
        String strM915 = "com.xingin.foundation.framework.v2.LCBActivity";
        String strM9152 = "onActivityResult";
        Class cls = Integer.TYPE;
        C0373r3.m1208(strM915, strM9152, new Object[]{cls, cls, Intent.class}, b.f825);
        C0373r3.m1208("com.xingin.xhs.index.v2.IndexActivityV2", "onCreate", new Object[]{Bundle.class}, new c());
        String strM9153 = "com.xingin.matrix.setting.SettingActivityV2";
        e eVar = e.f828;
        ClassLoader classLoader = C0292l3.f938;
        Method method2 = null;
        if (classLoader == null) {
            C0237h4.m1092("cl");
            throw null;
        }
        "<this>";
        "classLoader";
        "condition";
        Class clsM1199 = C0373r3.m1199(strM9153, classLoader, 2);
        if (clsM1199 != null) {
            "clz";
            "condition";
            "clz";
            "condition";
            Method[] declaredMethods = clsM1199.getDeclaredMethods();
            C0237h4.m1089("getDeclaredMethods(...)", declaredMethods);
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                C0237h4.m865(method);
                if (((Boolean) eVar.mo984(method)).booleanValue()) {
                    break;
                } else {
                    i++;
                }
            }
            if (method != null) {
                method.setAccessible(true);
                method2 = method;
            }
        }
        if (method2 == null) {
            return;
        }
        d dVar = d.f827;
        "<this>";
        "hooker";
        try {
            C0315mc c0315mc = new C0315mc(0);
            c0315mc.m900(dVar);
            C0373r3.m1212(method2, c0315mc);
        } catch (Throwable th) {
            StringBuilder sb = AbstractC0149b0.f695;
            AbstractC0149b0.a.m817(th);
        }
    }
}
