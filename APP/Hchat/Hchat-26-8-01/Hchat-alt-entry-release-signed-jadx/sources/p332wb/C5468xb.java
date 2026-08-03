package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;
import bb.C0250l;
import java.util.Set;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p117i0.InterfaceC1809a1;
import p126ia.RunnableC2018l;
import p144k.C2209s1;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p242q8.C3460o;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.xb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5468xb implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21901g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f21902h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f21903i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21904j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21905k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5468xb(Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f21901g = 1;
        this.f21902h = context;
        this.f21903i = sharedPreferences;
        this.f21904j = interfaceC1809a1;
        this.f21905k = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Activity activity;
        Object c3959f;
        switch (this.f21901g) {
            case 0:
                Context context = this.f21902h;
                InterfaceC1809a1 interfaceC1809a1 = this.f21904j;
                InterfaceC1809a1 interfaceC1809a12 = this.f21905k;
                SharedPreferences sharedPreferences = this.f21903i;
                boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                Set set = (Set) interfaceC1809a12.getValue();
                C5108me c5108me = new C5108me(sharedPreferences, interfaceC1809a12, 23);
                Activity activity2 = context instanceof Activity ? (Activity) context : null;
                if (activity2 == null) {
                    C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                    Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
                    Activity activity3 = activityM7263a != null ? activityM7263a : null;
                    if (activity3 != null) {
                        activity = activity3;
                    }
                    return C3967n.f12976a;
                }
                activity = activity2;
                Thread thread = new Thread(new RunnableC2018l(activity, zBooleanValue, C5491y2.m9813X1(activity, new C2209s1(25), "设置排除名单", zBooleanValue ? "正在载入好友和非好友..." : "正在载入好友列表..."), set, c5108me), "Hchat-MomentsFakeLikeExclude");
                thread.setDaemon(true);
                thread.start();
                return C3967n.f12976a;
            case 1:
                Context context2 = this.f21902h;
                SharedPreferences sharedPreferences2 = this.f21903i;
                InterfaceC1809a1 interfaceC1809a13 = this.f21904j;
                InterfaceC1809a1 interfaceC1809a14 = this.f21905k;
                Activity activity4 = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity4 != null) {
                    C5545zo c5545zo = C5545zo.f22524a;
                    C5304sc c5304sc = new C5304sc(1, context2, sharedPreferences2, interfaceC1809a13, interfaceC1809a14);
                    synchronized (c5545zo) {
                        try {
                            C5545zo.f22526c = new C5481xo(activity4, c5304sc);
                            c5545zo.m9964a(activity4.getClass());
                            c5545zo.m9964a(Activity.class);
                            Intent intent = new Intent();
                            intent.setClassName(activity4.getPackageName(), activity4.getPackageName() + ".plugin.location.ui.RedirectUI");
                            intent.putExtra("map_view_type", 8);
                            try {
                                activity4.startActivityForResult(intent, 1212371549);
                                c3959f = C3967n.f12976a;
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            Throwable thM8182b = C3960g.m8182b(c3959f);
                            if (thM8182b != null) {
                                synchronized (C5545zo.f22524a) {
                                    C5545zo.f22526c = null;
                                }
                                String message = thM8182b.getMessage();
                                if (message == null) {
                                    message = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                Toast.makeText(activity4, "启动微信地图失败: ".concat(message), 0).show();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                } else {
                    Toast.makeText(context2, "当前页面无法打开微信地图", 0).show();
                }
                return C3967n.f12976a;
            case 2:
                SharedPreferences sharedPreferences3 = this.f21903i;
                Context context3 = this.f21902h;
                InterfaceC1809a1 interfaceC1809a15 = this.f21904j;
                InterfaceC1809a1 interfaceC1809a16 = this.f21905k;
                SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                String str = (String) interfaceC1809a15.getValue();
                C3147k c3147k = C0250l.f693c;
                SharedPreferences.Editor editorPutString = editorEdit.putString("nickname_color", AbstractC0018a.m246j(str));
                Integer numM6742f0 = AbstractC3156t.m6742f0((String) interfaceC1809a16.getValue());
                editorPutString.putInt("nickname_weight", AbstractC1184v0.m3198h(numM6742f0 != null ? numM6742f0.intValue() : 400)).apply();
                Toast.makeText(context3, "设置已保存", 0).show();
                break;
            default:
                SharedPreferences sharedPreferences4 = this.f21903i;
                Context context4 = this.f21902h;
                InterfaceC1809a1 interfaceC1809a17 = this.f21904j;
                InterfaceC1809a1 interfaceC1809a18 = this.f21905k;
                String strM8392A1 = AbstractC4166m.m8392A1(AbstractC3754e0.m7882Y((String) interfaceC1809a17.getValue()), ",", null, null, null, 62);
                interfaceC1809a17.setValue(strM8392A1);
                sharedPreferences4.edit().putBoolean("hide_chat_menu_enable", ((Boolean) interfaceC1809a18.getValue()).booleanValue()).putString("hide_chat_menu_titles", strM8392A1).apply();
                Toast.makeText(context4, "设置已保存", 0).show();
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5468xb(int i9, Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f21901g = i9;
        this.f21903i = sharedPreferences;
        this.f21902h = context;
        this.f21904j = interfaceC1809a1;
        this.f21905k = interfaceC1809a12;
    }

    public /* synthetic */ C5468xb(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, SharedPreferences sharedPreferences) {
        this.f21901g = 0;
        this.f21902h = context;
        this.f21904j = interfaceC1809a1;
        this.f21905k = interfaceC1809a12;
        this.f21903i = sharedPreferences;
    }
}
