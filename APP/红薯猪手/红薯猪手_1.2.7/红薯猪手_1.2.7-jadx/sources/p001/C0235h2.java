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
    public static final String f1490 = C0341oa.m915(new byte[]{-55, -123, -7, 111, -90, -89}, new byte[]{-83, -20, -104, 3, -55, -64});

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final String f1491 = C0341oa.m915(new byte[]{68, 80, 87, -121, 116, 45}, new byte[]{49, 32, 51, -26, 0, 72});

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final String f1492 = C0341oa.m915(new byte[]{-48, 44, 70, -42, 90, 49, -6, 40, 75, -57}, new byte[]{-91, 92, 34, -73, 46, 84});

    /* JADX INFO: renamed from: ۥ۟ */
    public static final a f823 = new a();

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static final List<String> f1493 = C0272jb.m1106(C0341oa.m915(new byte[]{-108, 116, -123, 37, -114, -59, -97, -16, 62, -36, 112, -44, 34, 53, 63, -108, 123, 123, 96, -49, 112, -103, 112, -62, -98, -116, 106, -100, 119, -126, 34, 54, 121, -99, 127, 123, 96, -115, 97, -101, 65, -62, -102, -60, 112, -108, 53, -64, -115, -55, -57, 103, 127, -57, -37}, new byte[]{-32, -74, 5, -25, 14, -71}), C0341oa.m915(new byte[]{-14, 63, -22, -115, 106, -93, -7, -69, 81, 116, -108, -78, 68, 126, 80, 56, -99, -84, -13, 63, -22, 59, 40, 94, -24, -57, 5, 52, -109, -28, 68, 125, 22, 53, -101, 29, 6, -58, 14, 51, -91, -92, -4, -113, 31, 60, -47, -90, -21, -126, -88, -49, -101, -95, -67}, new byte[]{-122, -3, 106, 79, -22, -33}), C0341oa.m915(new byte[]{75, 14, -2, 45, 9, 43, 64, -118, 69, -44, -9, 58, -3, 79, 68, -127, -6, 34, -3, 76, 10, 45, 8, 57, 5, 14, -6, 45, 12, -107, -71, -9, -68, 111, -11, 45, 78, 14, -2, -44, -19, 43, 112, -73, 4, -99, -4, 36, 4, -75, 19, -112, 75, -41, 78, -78, 69}, new byte[]{63, -52, 126, -17, -119, 87}), C0341oa.m915(new byte[]{-67, 23, -44, 24, -67, -9, -74, -109, 111, -31, 78, -1, -69, -72, 43, 24, -67, -79, 11, 85, 47, -90, 6, -1, 11, 85, -106, 90, 65, -12, -113, -18, 111, -92, 80, 73, 74, -17, 39, -81, -1, 11, -67, 23, -43, -76, -1, 10, -74, -92, 42, -75, 70, -15, 11, 85, 37, -96, -1, 11, -13, -70, 47, -93, 6, 73, 73, -87, 46, -85, -1, 11, -14, -79, 40, -107, 70, -15, -69, -96, 39, -31, 68, -26, -74, 23, -44, -85, 67, -80}, new byte[]{-55, -43, 84, -38, 61, -117}), C0341oa.m915(new byte[]{94, -17, 38, -126, 85, -120, 85, 107, -99, 123, -90, -128, 86, 83, -35, -126, 81, 54, -81, 23, -36, 49, 23, 116, 17, 83, -53, -126, 86, -50, 89, 88, 100, -64, -95, 54, -85, 67, 100, -63, -86, -123, 84, 66, -35, 58, 23, 116, 91, 87, 100, -64, -17, -101, 81, 84, -99, -126, 85, -120, 80, 92, 100, -64, -18, -112, 86, 98, -35, 58, -89, -127, 89, 22, -33, 45, -86, 54, -86, 92, -40, 123}, new byte[]{42, 45, -90, 64, -43, -12}), C0341oa.m915(new byte[]{-1, -118, 33, 111, 108, 78, -12, 14, -102, -106, -97, 70, -78, 52, -33, -42, 46, -74, 73, -51, -101, -62, -105, 75, -80, 54, -52, 111, 111, 8, -8, 61, 99, 45, -104, -16, 10, 38, 99, 44, -109, 67, -11, 39, -38, -41, 46, -78, -6, 50, 99, 45, -42, 93, -16, 49, -102, 111, 108, 78, -15, 57, 99, 45, -41, 86, -9, 7, -38, -41, -98, 71, -8, 115, -40, -64, -109, -16, 11, 57, -33, -106}, new byte[]{-117, 72, -95, -83, -20, 50}));

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static final String f1494 = C0341oa.m915(new byte[]{78, -106, 97, -63, 23, -24, 71, -36}, new byte[]{48, -25, 17, -81, 108, -109});

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final String f1495 = C0341oa.m915(new byte[]{34, -37, -127, -49, 53, 119, 96, 96, -103, -55, 11, -50, -102, 41, -120, -58}, new byte[]{-32, 91, -3, -75, 68, -75});

    /* JADX INFO: renamed from: ۟.h2$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static void m861(InterfaceC0222g3 interfaceC0222g3) {
            C0341oa.m915(new byte[]{-56, -127, -49, 40, 50, 51, -56, -117}, new byte[]{-85, -32, -93, 68, 80, 82});
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
            C0237h4.m1090(C0341oa.m915(new byte[]{-74, 89}, new byte[]{-33, 45, -8, -3, -39, -128}), methodHookParam2);
            String simpleName = methodHookParam2.thisObject.getClass().getSimpleName();
            if (C0432va.m1253(simpleName, C0341oa.m915(new byte[]{68, -38, 19, -72, 4, 100, 112, -2, 4, -72, 4, 124, 126, -53, 30}, new byte[]{23, -65, 103, -52, 109, 10})) || C0432va.m1253(simpleName, C0341oa.m915(new byte[]{-104, 107, 121, -106, 20, -94, -78, 113, 116, -123, 5, -105, -88}, new byte[]{-47, 5, 29, -13, 108, -29}))) {
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
            C0237h4.m1090(C0341oa.m915(new byte[]{114, -85}, new byte[]{27, -33, 23, -12, 5, -76}), methodHookParam2);
            C0325n8.f994.getClass();
            if (C0325n8.m904().length() > 0) {
                Object obj = methodHookParam2.thisObject;
                C0237h4.m1088(C0341oa.m915(new byte[]{-40, 124, -56, 52, 98, -96, -41, 103, -54, 55, 54, -29, -44, 108, -124, 59, 35, -80, -62, 41, -48, 55, 98, -83, -39, 103, -119, 54, 55, -81, -38, 41, -48, 33, 50, -90, -106, 104, -54, 60, 48, -84, -33, 109, -118, 57, 50, -77, -104, 72, -57, 44, 43, -75, -33, 125, -35}, new byte[]{-74, 9, -92, 88, 66, -61}), obj);
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
            C0237h4.m1090(C0341oa.m915(new byte[]{37, -13}, new byte[]{76, -121, 41, -82, 25, -47}), methodHookParam2);
            Object obj = methodHookParam2.thisObject;
            C0237h4.m1088(C0341oa.m915(new byte[]{-55, 96, 4, 29, 32, 71, -58, 123, 6, 30, 116, 4, -59, 112, 72, 18, 97, 87, -45, 53, 28, 30, 32, 74, -56, 123, 69, 31, 117, 72, -53, 53, 28, 8, 112, 65, -121, 116, 6, 21, 114, 75, -50, 113, 70, 16, 112, 84, -119, 84, 11, 5, 105, 82, -50, 97, 17}, new byte[]{-89, 21, 104, 113, 0, 36}), obj);
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
            C0237h4.m1090(C0341oa.m915(new byte[]{-81, 102, -124, 120, -35, -94, -19, 123, -126, 117, -29, -29, -1, 122, -125, 117}, new byte[]{-117, 18, -20, 17, -82, -122}), method2);
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
            C0338o7.m1181(C0341oa.m915(new byte[]{-32, 123, 102, 45, 25, 59}, new byte[]{-107, 11, 2, 76, 109, 94}), 32);
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
        C0341oa.m915(new byte[]{-36, 17, 116, 124, -83, 96, -36, 27}, new byte[]{-65, 112, 24, 16, -49, 1});
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
                C0237h4.m1088(C0341oa.m915(new byte[]{-2, -9, -3, 52, -76, -61, -15, -20, -1, 55, -32, -128, -14, -25, -79, 59, -11, -45, -28, -94, -27, 55, -76, -50, -1, -20, -68, 54, -31, -52, -4, -94, -27, 33, -28, -59, -80, -29, -1, 60, -26, -49, -7, -26, -65, 57, -28, -48, -66, -61, -14, 44, -3, -42, -7, -10, -24}, new byte[]{-112, -126, -111, 88, -108, -96}), obj4);
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
            if (c0446wb.m959(C0178d1.b.m841().mo1059(C0341oa.m915(new byte[]{-83, -126}, new byte[]{-33, -14, 103, 32, 87, 112}), false))) {
                StringBuilder sbM924 = C0372r2.m924(C0341oa.m915(new byte[]{-84, -43, -112, 18, -47, -46, -84, -48, -78, 18, -60, -11, -83, -62, -114, 18, -50, -23}, new byte[]{75, 89, 58, -12, 88, 89}), c0446wb.f1857);
                sbM924.append(C0341oa.m915(new byte[]{-117}, new byte[]{-93, -90, 107, -68, 24, -128}));
                sbM924.append(c0446wb.f1858);
                sbM924.append(C0341oa.m915(new byte[]{-51}, new byte[]{-28, -41, 24, -100, -108, 107}));
                String string = sbM924.toString();
                C0237h4.m1089(C0341oa.m915(new byte[]{9, 72, 68, -121, -44, -10, 19, 64, 63, -35, -120, -79, 84}, new byte[]{125, 39, 23, -13, -90, -97}), string);
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
                    alertDialogC0441w6.f1487.setText(C0341oa.m915(new byte[]{117, 34, -19, 126, -53, -104, 119, 21, -16, 124, -23, -81}, new byte[]{-111, -102, 96, -101, 77, 21}));
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
            String strM915 = C0341oa.m915(new byte[]{114, 20, -50, 52, 50, 27, 112, 8, -43, -4, -98, -121, -91, -84, 76, -1, -125, -74, -90, -108, 69}, new byte[]{67, 58, -4, 26, 5, 51});
            int i = C0330o.f1000;
            AlertDialogC0441w6 alertDialogC0441w6 = new AlertDialogC0441w6(activity, strM915, C0330o.m1175(C0341oa.m915(new byte[]{62, -115, 11, 74, 40, -124, -22, 12, -128, -126, -79, -10, 64, -106, 84, 58, 55, -8, 117, -110, 87, 17, 18, -1, 103, -72, -114, -50, -11, 46, -22, 12, -110, 72, 56, -66, 62, -122, 63, -116, 96, -68, 79, -54, 28, 28, 98, -97, 116, -54, 49, 17, 99, -88, 86, -60, 42, 18, 96, -76, 97, -58, 13, 49, 98, -67, 67, 110, -37, -38, -30, 64, -77, 77, -58, -61, -69, 114, -87, 28, -128, -126, -89, -12, 100, -116, 87, 8, 10, 48, 63, -99, 47, 73, 42, -120, 51, -115, 54, 68, 41, -86, -105, 75, -60, -55, -9, 120, -76, 86, -35, 73, 8, -65, 51, -95, 15, 73, 35, -95, 51, -106, 23, -112, -27, 98, -27, 17, -100, -116, 97, -122, 107, -57, 16, 50, -89, -12, 100, -65, 87, 1, 31, -11, 86, -73, 87, 16, 39, -9, 119, -74, 90, 2, 55, -10, 76, -126, 84, 28, 51, -11, 86, -110, -2, -59, -15, 117, -85, 74, -35, -40, -24, 44, -71, 80, -116, -104, -87, 48, 61, -76, 2, 73, 37, -114, -5, -57, 61, 3, 111, -105, 113, -57, 28, 54, 99, -87, 82, -60, 26, 13, 97, -101, 68, -53, 20, 58, 110, -79, 110, -53, 43, 40, 111, -81, 74, -59, 40, 40, 99, -83, 86, -59, 15, 2, -69, 114, -87, 28, -121, -126, -89, -12, 100, -116, 87, 8, 10, 48, 62, -83, 29, 68, 4, -83, 61, -75, 18, 74, 52, -123, 62, -84, 9, 69, 30, -76, 50, -124, 36, 69, 38, -91, 60, -114, 30, 72, 63, -112, 50, -125, 7, 75, 29, -108, 60, -71, 6, 74, 21, -67, 60, -114, 38, 68, 41, -96, -25, 64, -64, -110, -79, 62, -5, -60, 36, 28, 98, -78, 69, 2, 87, 35, 40, -11, 85, -103, 91, 53, 35, -11, 83, -92, 86, 22, 44, -7, 72, -100, 84, 34, 34, -9, 65, -90, 85, 56, 47, -10, 83, -107, 86, 19, 38, -10, 90, -115, 90, 19, 58, -8, 99, -120}, new byte[]{-37, 34, -78, -84, -121, 16})));
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
        C0237h4.m1090(C0341oa.m915(new byte[]{66, -27, 37, -46, -66, 46, 65, -39, 43, -36, -66}, new byte[]{50, -105, 74, -79, -37, 93}), str);
        String strM915 = C0341oa.m915(new byte[]{4, 29, -45, -76, 10, 49, 9, 21, -41, -12, 92, 62, 8, 7, -48, -2, 19, 44, 14, 29, -48, -76, 20, 42, 6, 31, -37, -19, 29, 42, 12, 92, -56, -88, 92, 20, 36, 48, -1, -7, 6, 49, 17, 27, -54, -29}, new byte[]{103, 114, -66, -102, 114, 88});
        String strM9152 = C0341oa.m915(new byte[]{-120, 42, 88, -21, 120, 3, -111, 45, 109, -15, 94, 15, -108, 49, 117, -4}, new byte[]{-25, 68, 25, -120, 12, 106});
        Class cls = Integer.TYPE;
        C0373r3.m1208(strM915, strM9152, new Object[]{cls, cls, Intent.class}, b.f825);
        C0373r3.m1208(C0341oa.m915(new byte[]{-86, -117, 93, 2, -112, 116, -89, -125, 89, 66, -58, 101, -95, -105, 30, 69, -122, 121, -84, -100, 30, 90, -38, 51, -128, -118, 84, 73, -112, 92, -86, -112, 89, 90, -127, 105, -80, -78, 2}, new byte[]{-55, -28, 48, 44, -24, 29}), C0341oa.m915(new byte[]{68, -32, -106, 0, -64, 81, 95, -21}, new byte[]{43, -114, -43, 114, -91, 48}), new Object[]{Bundle.class}, new c());
        String strM9153 = C0341oa.m915(new byte[]{-27, 85, -26, 124, -105, 36, -24, 93, -30, 60, -63, 32, -25, 78, -7, 59, -105, 99, -11, 95, -1, 38, -122, 35, -31, 20, -40, 55, -101, 57, -17, 84, -20, 19, -116, 57, -17, 76, -30, 38, -106, 27, -76}, new byte[]{-122, 58, -117, 82, -17, 77});
        e eVar = e.f828;
        ClassLoader classLoader = C0292l3.f938;
        Method method2 = null;
        if (classLoader == null) {
            C0237h4.m1092(C0341oa.m915(new byte[]{-78, 10}, new byte[]{-47, 102, 55, 90, 4, -54}));
            throw null;
        }
        C0341oa.m915(new byte[]{53, -71, -96, -104, -26, -85}, new byte[]{9, -51, -56, -15, -107, -107});
        C0341oa.m915(new byte[]{125, 116, 53, 95, 67, 100, 113, 121, 48, 73, 66}, new byte[]{30, 24, 84, 44, 48, 40});
        C0341oa.m915(new byte[]{-104, -35, -34, 5, -118, -120, -110, -35, -34}, new byte[]{-5, -78, -80, 97, -29, -4});
        Class clsM1199 = C0373r3.m1199(strM9153, classLoader, 2);
        if (clsM1199 != null) {
            C0341oa.m915(new byte[]{-79, -70, -97}, new byte[]{-46, -42, -27, 38, 112, -109});
            C0341oa.m915(new byte[]{9, -4, 65, -52, 81, 0, 3, -4, 65}, new byte[]{106, -109, 47, -88, 56, 116});
            C0341oa.m915(new byte[]{17, -11, -14}, new byte[]{114, -103, -120, -30, -62, 41});
            C0341oa.m915(new byte[]{-46, 83, -83, 1, -59, 109, -40, 83, -83}, new byte[]{-79, 60, -61, 101, -84, 25});
            Method[] declaredMethods = clsM1199.getDeclaredMethods();
            C0237h4.m1089(C0341oa.m915(new byte[]{12, 44, -73, -108, 21, -26, 7, 40, -79, -75, 20, -56, 14, 61, -85, -65, 20, -10, 67, 103, -19, -2, 89}, new byte[]{107, 73, -61, -48, 112, -123}), declaredMethods);
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
        C0341oa.m915(new byte[]{21, 86, 4, 96, 123, -82}, new byte[]{41, 34, 108, 9, 8, -112});
        C0341oa.m915(new byte[]{-77, 49, -123, 105, -49, -82}, new byte[]{-37, 94, -22, 2, -86, -36});
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
