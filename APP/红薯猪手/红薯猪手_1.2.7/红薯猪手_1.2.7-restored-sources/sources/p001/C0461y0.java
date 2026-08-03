package p001;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0461y0 extends AbstractC0484za {

    /* JADX INFO: renamed from: ۟.y0$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<C0433vb> {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final C0433vb mo7() {
            C0461y0 c0461y0 = C0461y0.this;
            c0461y0.getClass();
            String str = C0283k8.f1632.f1558;
            C0237h4.m1089("AsyncTextContentControllerCls", str);
            C0274k c0274k = C0283k8.f1632;
            String str2 = c0274k.f1559;
            String str3 = c0274k.f1561;
            C0237h4.m1089("DetailNoteFeedHolderCls", str3);
            C0373r3.m1208(str, str2, new Object[]{Boolean.TYPE, C0373r3.m1199(str3, null, 3)}, new C0409u0(c0461y0));
            C0461y0 c0461y02 = C0461y0.this;
            c0461y02.getClass();
            String str4 = C0283k8.f1632.f1549;
            C0237h4.m1089("NoteContentComponentItemPresenterCls", str4);
            C0274k c0274k2 = C0283k8.f1632;
            C0373r3.m1208(str4, c0274k2.f1550, new Object[]{c0274k2.f1572}, new C0435w0(c0461y02));
            String str5 = C0283k8.f1632.f1596;
            C0237h4.m1089("VideoNoteContentControllerCls", str5);
            String str6 = C0283k8.f1632.f1597;
            String str7 = C0283k8.f1632.f1572;
            C0237h4.m1089("NoteFeedCls", str7);
            C0373r3.m1208(str5, str6, new Object[]{C0373r3.m1199("kotlin.jvm.functions.Function0", null, 3), C0373r3.m1199(str7, null, 3), Object.class}, new C0448x0(c0461y02));
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m1265(XC_MethodHook.MethodHookParam methodHookParam, C0461y0 c0461y0) {
        C0237h4.m1090("$param", methodHookParam);
        C0237h4.m1090("this$0", c0461y0);
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089("thisObject", obj);
        C0274k c0274k = C0283k8.f1632;
        Object objM1203 = C0373r3.m1203(obj, C0283k8.a.m885().f1560);
        m1267(C0292l3.m893(), objM1203 != null ? C0373r3.m1203(objM1203, "noteFeed") : null);
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static void m1266(XC_MethodHook.MethodHookParam methodHookParam, C0461y0 c0461y0) {
        C0237h4.m1090("$param", methodHookParam);
        C0237h4.m1090("this$0", c0461y0);
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089("thisObject", obj);
        C0274k c0274k = C0283k8.f1632;
        Object objM1203 = C0373r3.m1203(obj, C0283k8.a.m885().f1560);
        m1267(C0292l3.m893(), objM1203 != null ? C0373r3.m1203(objM1203, "noteFeed") : null);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static void m1267(Context context, Object obj) {
        if (obj != null) {
            String str = (String) C0373r3.m1204(obj, "title");
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                str = str + "\n";
            }
            Object objM1204 = C0373r3.m1204(obj, "desc");
            String str2 = str + (objM1204 != null ? objM1204 : "");
            if (str2.length() > 0) {
                new AlertDialogC0383s0(context, str2.toString()).show();
            }
        }
    }

    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090("processName", str);
        C0192e1.m1054(EnumC0164c1.f1374, new a());
    }
}
