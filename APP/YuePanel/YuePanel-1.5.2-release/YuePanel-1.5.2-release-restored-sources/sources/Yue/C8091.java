package Yue;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Yue.ۥۣۣۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8091 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f3214;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3215;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23986;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23987;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23988;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23989;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23990;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23991;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23992;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23993;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23994;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23995;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23996;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23997;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23998;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23999;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24000;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24001;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24002;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24003;

    /* JADX INFO: renamed from: Yue.ۥۣۣۢ۟$ۥ */
    public class C1430 extends XC_MethodHook {
        public C1430() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C8091.m26682(C8091.this, methodHookParam.thisObject);
            C8091.m26683(C8091.this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣۢ۟$ۥ۟ */
    public class C1431 extends XC_MethodHook {
        public C1431() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C8091.m26682(C8091.this, methodHookParam.thisObject);
            C8091.m26683(C8091.this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣۢ۟$ۥ۟۟, reason: contains not printable characters */
    public class C8092 extends OnBindView<BottomDialog> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ View f3216;

        static {
            NativeUtil.classesInit0(975);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8092(View view, View view2) {
            super(view);
            this.f3216 = view2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.view.View] */
        @Override // com.kongzue.dialogx.interfaces.OnBindView
        public native /* bridge */ /* synthetic */ void onBind(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ */
        public native void m4127(BottomDialog bottomDialog, View view);
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣۢ۟$ۥ۟۟۟, reason: contains not printable characters */
    public class C8093 {

        /* JADX INFO: renamed from: ۥ */
        public int f3218;

        /* JADX INFO: renamed from: ۥ۟ */
        public String f3219;

        static {
            NativeUtil.classesInit0(18);
        }

        public C8093() {
        }

        /* JADX INFO: renamed from: ۥ */
        public native int m4128();

        /* JADX INFO: renamed from: ۥ۟ */
        public native String m4129();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public native void m26692(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public native void m26693(String str);
    }

    static {
        NativeUtil.classesInit0(801);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m4125(C8091 c8091, AtomicInteger atomicInteger, AtomicReference atomicReference, TextView textView, AtomicReference atomicReference2, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m4126(C8091 c8091, LinearLayout linearLayout);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m26680(C8091 c8091);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m26681(C8091 c8091, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m26682(C8091 c8091, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m26683(C8091 c8091);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    private native void m26684();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    private native /* synthetic */ void m26685(View view);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final native C8093 m26686(String str, TextView textView);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final native /* synthetic */ void m26687(AtomicInteger atomicInteger, AtomicReference atomicReference, TextView textView, AtomicReference atomicReference2, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final native /* synthetic */ void m26688(LinearLayout linearLayout);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final native /* synthetic */ void m26689();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m26690(Object obj) {
        try {
            Serializable serializableExtra = ((Intent) XposedHelpers.callMethod(obj, yue_xin_awa(5), new Object[0])).getSerializableExtra(yue_xin_awa(6));
            if (serializableExtra != null) {
                JsonObject jsonObjectM1992 = C5224.m1992(new Gson().toJson(serializableExtra));
                String asString = jsonObjectM1992.get(yue_xin_awa(7)).getAsString();
                JsonArray asJsonArray = jsonObjectM1992.getAsJsonObject(yue_xin_awa(8)).getAsJsonArray(yue_xin_awa(9));
                C7530.m23531(asJsonArray.get(asJsonArray.size() - 1).getAsString());
                C7530.m23532(asString);
                C7530.m23533(true);
            } else {
                C7530.m23533(false);
            }
        } catch (Throwable unused) {
            C7530.m23533(false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final native void m26691();
}
