package Yue;

import android.app.Activity;
import android.content.Context;
import com.google.gson.JsonObject;
import com.kongzue.dialogx.DialogX;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2604;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8590 {

    /* JADX INFO: renamed from: ۥ */
    public static boolean f3568;

    /* JADX INFO: renamed from: ۥ۟ */
    public static AtomicBoolean f3569;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final List<C8595> f25498;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25499;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25500;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25501;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25502;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25503;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25504;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25505;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25506;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25507;

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۥ$ۥ */
    public class C1558 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f25508;

        public C1558(ClassLoader classLoader) {
            this.f25508 = classLoader;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Activity activity = (Activity) methodHookParam.thisObject;
            Context applicationContext = activity.getApplicationContext();
            if (applicationContext != null) {
                C3270.m6717(applicationContext);
                C3270.m6718(applicationContext.getClassLoader());
            } else {
                C3270.m6717(activity);
                C3270.m6718(this.f25508);
            }
            C3270.m6721(C3369.m456(C3270.m6705()));
            C3270.m6722(C3369.m455(C3270.m6705()));
            C7139.m3427(C3270.m6705());
            DialogX.init(activity);
            C8590.m4562();
            C8590.m28591(this.f25508);
            C4383.m12697(C8590.f25498);
            C3356.m436();
            C8590.f3569.set(true);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۥ$ۥ۟ */
    public class C1559 extends XC_MethodHook {
        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C8590.m28592(methodHookParam.thisObject);
        }
    }

    static {
        NativeUtil.classesInit0(302);
        f3569 = new AtomicBoolean();
        f25498 = new ArrayList();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m4561(Object obj);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m4562();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m28591(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m28592(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m28593();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native void m28594(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m28595(ClassLoader classLoader) {
        try {
            C5309.m16286(classLoader.loadClass(yue_xin_awa(2)), new C1559());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m28596(Object obj) {
        Object objectField;
        int i = 0;
        while (true) {
            try {
                C7477.m3677(100L);
                Object objectField2 = XposedHelpers.getObjectField(obj, yue_xin_awa(3));
                if (objectField2 != null && (objectField = XposedHelpers.getObjectField(objectField2, yue_xin_awa(4))) != null) {
                    JsonObject jsonObjectM2994 = C6498.m2994(objectField);
                    if (jsonObjectM2994 != null) {
                        String asString = jsonObjectM2994.getAsJsonArray(yue_xin_awa(5)).get(0).getAsJsonObject().get(yue_xin_awa(6)).getAsString();
                        String asString2 = jsonObjectM2994.get(yue_xin_awa(7)).getAsString();
                        String asString3 = jsonObjectM2994.get(yue_xin_awa(8)).getAsString();
                        C6263.m19282(asString2);
                        C6263.m19283(asString3);
                        C6263.m19278(asString);
                        C2604.m31089(true);
                        return;
                    }
                    return;
                }
                if (i >= 100) {
                    return;
                }
            } catch (Throwable unused) {
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native void m28597();
}
