package p332wb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import java.util.concurrent.atomic.AtomicBoolean;
import p036c9.C0429d2;
import p063e9.C0846q;
import p065eb.C0899v0;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p117i0.C1808a0;
import p117i0.InterfaceC1809a1;
import p154k9.C2373q;
import p154k9.C2374r;
import p222p.AbstractC3199a;
import p276sf.C3967n;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: wb.q1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5227q1 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20115g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f20116h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20117i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5227q1(Context context, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f20115g = i9;
        this.f20116h = context;
        this.f20117i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = 1;
        switch (this.f20115g) {
            case 0:
                Context context = this.f20116h;
                InterfaceC1809a1 interfaceC1809a1 = this.f20117i;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                interfaceC1809a1.setValue(bool);
                if (!AbstractC4302b.m8640c(context, "Hchat_conversation_groups").edit().putBoolean("enabled", zBooleanValue).commit()) {
                    AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 保存启用状态失败");
                }
                C0429d2.m1445y(context);
                break;
            case 1:
                Context context2 = this.f20116h;
                InterfaceC1809a1 interfaceC1809a12 = this.f20117i;
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                interfaceC1809a12.setValue(bool2);
                C2374r c2374r = C2374r.f7799a;
                AbstractC4302b.m8640c(context2, "floating_shortcut_menu").edit().putBoolean("enable", zBooleanValue2).apply();
                C2374r.f7802d = zBooleanValue2;
                C2374r.m5687p(new C2373q(0, zBooleanValue2));
                break;
            case 2:
                Context context3 = this.f20116h;
                InterfaceC1809a1 interfaceC1809a13 = this.f20117i;
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                Toast.makeText(context3, zBooleanValue3 ? "自定义头像已保存" : "头像设置失败", 0).show();
                if (zBooleanValue3) {
                    AbstractC3199a.m6848u((Number) interfaceC1809a13.getValue(), 1, interfaceC1809a13);
                }
                return C3967n.f12976a;
            case 3:
                Context context4 = this.f20116h;
                InterfaceC1809a1 interfaceC1809a14 = this.f20117i;
                String str = (String) obj;
                str.getClass();
                AtomicBoolean atomicBoolean = C0846q.f2580a;
                interfaceC1809a14.setValue(C0846q.m2123h(context4, str));
                Toast.makeText(context4, "铃声已选择，保存后生效", 0).show();
                break;
            case 4:
                Context context5 = this.f20116h;
                InterfaceC1809a1 interfaceC1809a15 = this.f20117i;
                String str2 = (String) obj;
                str2.getClass();
                AtomicBoolean atomicBoolean2 = C0846q.f2580a;
                interfaceC1809a15.setValue(C0846q.m2123h(context5, str2));
                Toast.makeText(context5, "铃声已选择，保存后生效", 0).show();
                break;
            case 5:
                Context context6 = this.f20116h;
                InterfaceC1809a1 interfaceC1809a16 = this.f20117i;
                ((C1808a0) obj).getClass();
                return new C4758bo(ScriptPluginRuntime.INSTANCE.subscribePluginCatalog(context6, new C5070l9(interfaceC1809a16, 24)), i9);
            default:
                Context context7 = this.f20116h;
                InterfaceC1809a1 interfaceC1809a17 = this.f20117i;
                int iIntValue = ((Integer) obj).intValue();
                Activity activity = context7 instanceof Activity ? (Activity) context7 : null;
                if (activity == null) {
                    Toast.makeText(context7, "当前页面无法打开文件选择器", 0).show();
                } else {
                    C5450wq.f21764a.m9763b(activity, iIntValue, new C0899v0(iIntValue, context7, interfaceC1809a17, 6));
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }
}
