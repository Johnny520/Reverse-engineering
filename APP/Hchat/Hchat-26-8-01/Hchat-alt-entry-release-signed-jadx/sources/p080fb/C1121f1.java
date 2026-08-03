package p080fb;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import ci.C0611w;
import de.robv.android.xposed.XC_MethodHook;
import p036c9.RunnableC0487t;
import p085fg.InterfaceC1231l;
import p117i0.C1808a0;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p304uf.C4330d;
import va.EnumC4542b;

/* JADX INFO: renamed from: fb.f1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1121f1 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3671g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f3672h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1121f1(Context context, int i9) {
        this.f3671g = i9;
        this.f3672h = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        String strM8749K;
        String strM8749K2;
        Window window;
        View decorView;
        Activity activity;
        WindowManager.LayoutParams attributes;
        int i9 = this.f3671g;
        C3967n c3967n = C3967n.f12976a;
        numValueOf = null;
        Integer numValueOf = null;
        Context baseContext = this.f3672h;
        switch (i9) {
            case 0:
                C1099a c1099a = (C1099a) obj;
                c1099a.getClass();
                C1125g1 c1125g1 = C1125g1.f3676a;
                return C1125g1.m2866j(baseContext, c1099a.f3540b);
            case 1:
                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj;
                methodHookParam.getClass();
                Object obj2 = methodHookParam.thisObject;
                Activity activity2 = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity2 != null && AbstractC4302b.m8640c(baseContext, "Hchat_profile_id_config").getBoolean("profile_id_enable", false) && (strM8749K = C4330d.m8749K(activity2, EnumC4542b.f14991g)) != null) {
                    Window window2 = activity2.getWindow();
                    View decorView2 = window2 != null ? window2.getDecorView() : null;
                    ViewGroup viewGroup = decorView2 instanceof ViewGroup ? (ViewGroup) decorView2 : null;
                    if (viewGroup != null) {
                        viewGroup.post(new RunnableC0487t(activity2, strM8749K));
                    }
                }
                return c3967n;
            case 2:
                XC_MethodHook.MethodHookParam methodHookParam2 = (XC_MethodHook.MethodHookParam) obj;
                methodHookParam2.getClass();
                Object obj3 = methodHookParam2.thisObject;
                Activity activity3 = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity3 != null && AbstractC4302b.m8640c(baseContext, "Hchat_profile_id_config").getBoolean("profile_id_enable", false) && (strM8749K2 = C4330d.m8749K(activity3, EnumC4542b.f14992h)) != null && (window = activity3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    decorView.post(new RunnableC0487t(activity3, strM8749K2, 10));
                }
                return c3967n;
            case 3:
                String str = (String) obj;
                str.getClass();
                Object systemService = baseContext.getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Agent 代码", str));
                }
                Toast.makeText(baseContext, "代码已复制", 0).show();
                return c3967n;
            default:
                ((C1808a0) obj).getClass();
                baseContext.getClass();
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        activity = baseContext instanceof Activity ? (Activity) baseContext : null;
                    } else if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                Window window3 = activity != null ? activity.getWindow() : null;
                if (window3 != null && (attributes = window3.getAttributes()) != null) {
                    numValueOf = Integer.valueOf(attributes.softInputMode);
                }
                if (window3 != null && numValueOf != null) {
                    window3.setSoftInputMode((numValueOf.intValue() & 15) | 16);
                }
                return new C0611w(window3, 9, numValueOf);
        }
    }
}
