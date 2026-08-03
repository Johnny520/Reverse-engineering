package p001;

import android.R;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.mmkv.MMKV;
import de.robv.android.xposed.XC_MethodHook;
import org.json.JSONObject;
import p001.AbstractC0356q;

/* JADX INFO: renamed from: ۟.n8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0325n8 {

    /* JADX INFO: renamed from: ۥ */
    public static final C0325n8 f994;

    /* JADX INFO: renamed from: ۥ۟ */
    public static MMKV f995;

    /* JADX INFO: renamed from: ۟.n8$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC0208f3<C0433vb> f996;

        public a(InterfaceC0208f3<C0433vb> interfaceC0208f3) {
            this.f996 = interfaceC0208f3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final C0433vb mo7() {
            this.f996.mo7();
            return C0433vb.f1163;
        }
    }

    static {
        "对比1.2.6更新记录：<br>1. 修复 笔记可能不显示保存LivePhoto<br>2. 修复 保存评论Livephoto可能失败<br>3. 新增 保存单张笔记无水印Livephoto<br>4. 新增 可自定义模拟首页附近的位置<br>5. 修复 可能无法去除首页第一页的直播笔记<br>6. 新增 可去除分享链接的用户信息追踪";
        f994 = new C0325n8();
        "IndexActivityV2";
    }

    /* JADX INFO: renamed from: ۥ */
    public static String m904() {
        JSONObject jSONObjectM905 = m905();
        String strOptString = jSONObjectM905 != null ? jSONObjectM905.optString("red_id") : null;
        if (strOptString == null) {
            strOptString = "";
        }
        return strOptString.length() > 0 ? strOptString : "";
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static JSONObject m905() {
        String string;
        String string2;
        String str = "";
        if (f995 == null) {
            f995 = MMKV.mmkvWithID("com.xingin.xhs", 2, "");
        }
        MMKV mmkv = f995;
        if (mmkv != null && (string = mmkv.getString("key_desc_userinfo", "")) != null && (string2 = C0432va.m1260(string).toString()) != null) {
            str = string2;
        }
        if (C0406ta.m942(str, "{")) {
            return new JSONObject(str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m1158() {
        Context context = C0292l3.f937;
        if (context == null) {
            C0237h4.m1092("context");
            throw null;
        }
        if (context.getSharedPreferences("cn_feng_skin_pref", 0).getInt("app_skin_index_v1", 0) == 2) {
            return true;
        }
        Context context2 = C0292l3.f937;
        if (context2 == null) {
            C0237h4.m1092("context");
            throw null;
        }
        Object systemService = context2.getSystemService("uimode");
        UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        return uiModeManager != null && uiModeManager.getNightMode() == 2;
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static View m1159(XC_MethodHook.MethodHookParam methodHookParam) {
        C0237h4.m1090("<this>", methodHookParam);
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089("thisObject", obj);
        Object objM926 = C0373r3.m926(obj, "getPresenter", new Object[0]);
        if (objM926 != null) {
            return (View) C0373r3.m927(objM926, "getView", new Object[0]);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1160(String str) {
        boolean z = true;
        if (str == null) {
            z = false;
        } else {
            if (!(str.length() > 0)) {
            }
        }
        if (z) {
            Activity activityM893 = C0292l3.m893();
            String str2 = C0283k8.f1632.f1598;
            C0237h4.m1089("NewOtherUserActivityCls", str2);
            Intent intent = new Intent(activityM893, (Class<?>) C0373r3.m1199(str2, null, 3));
            intent.putExtra("uid", str);
            activityM893.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static void m1161(Activity activity, InterfaceC0208f3 interfaceC0208f3) {
        int i = 3;
        "act";
        "clickBack";
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if (frameLayout != null) {
            C0286kb c0286kb = AbstractC0356q.f1031;
            AbstractC0356q.c.m921().postDelayed(new RunnableC0154b5(frameLayout, activity, interfaceC0208f3, i), 100L);
        }
    }
}
