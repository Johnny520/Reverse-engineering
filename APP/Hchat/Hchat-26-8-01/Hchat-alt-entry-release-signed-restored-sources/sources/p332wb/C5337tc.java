package p332wb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p003a2.C0014a;
import p010aa.C0033a;
import p036c9.C0443h0;
import p085fg.InterfaceC1231l;
import p099h.Hchat.crash.C1438g;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p218og.AbstractC3149m;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.tc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5337tc implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20833g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f20834h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f20835i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Context f20836j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5337tc(Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1) {
        this.f20833g = 10;
        this.f20836j = context;
        this.f20835i = sharedPreferences;
        this.f20834h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f20833g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f20834h;
                SharedPreferences sharedPreferences = this.f20835i;
                Context context = this.f20836j;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                interfaceC1809a1.setValue(bool);
                AbstractC4955ho.m9598l4(context, sharedPreferences, "wechat_keep_alive_enable", zBooleanValue);
                break;
            case 1:
                InterfaceC1809a1 interfaceC1809a12 = this.f20834h;
                SharedPreferences sharedPreferences2 = this.f20835i;
                Context context2 = this.f20836j;
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                interfaceC1809a12.setValue(bool2);
                AbstractC4955ho.m9598l4(context2, sharedPreferences2, "wechat_keep_alive_foreground_service", zBooleanValue2);
                break;
            case 2:
                InterfaceC1809a1 interfaceC1809a13 = this.f20834h;
                SharedPreferences sharedPreferences3 = this.f20835i;
                Context context3 = this.f20836j;
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                interfaceC1809a13.setValue(bool3);
                AbstractC4955ho.m9598l4(context3, sharedPreferences3, "wechat_keep_alive_wake_lock", zBooleanValue3);
                break;
            case 3:
                InterfaceC1809a1 interfaceC1809a14 = this.f20834h;
                SharedPreferences sharedPreferences4 = this.f20835i;
                Context context4 = this.f20836j;
                Boolean bool4 = (Boolean) obj;
                boolean zBooleanValue4 = bool4.booleanValue();
                interfaceC1809a14.setValue(bool4);
                AbstractC4955ho.m9598l4(context4, sharedPreferences4, "wechat_keep_alive_root_doze_whitelist", zBooleanValue4);
                break;
            case 4:
                InterfaceC1809a1 interfaceC1809a15 = this.f20834h;
                SharedPreferences sharedPreferences5 = this.f20835i;
                Context context5 = this.f20836j;
                Boolean bool5 = (Boolean) obj;
                boolean zBooleanValue5 = bool5.booleanValue();
                interfaceC1809a15.setValue(bool5);
                AbstractC4955ho.m9598l4(context5, sharedPreferences5, "wechat_keep_alive_root_app_ops", zBooleanValue5);
                break;
            case 5:
                InterfaceC1809a1 interfaceC1809a16 = this.f20834h;
                SharedPreferences sharedPreferences6 = this.f20835i;
                Context context6 = this.f20836j;
                Boolean bool6 = (Boolean) obj;
                boolean zBooleanValue6 = bool6.booleanValue();
                interfaceC1809a16.setValue(bool6);
                AbstractC4955ho.m9598l4(context6, sharedPreferences6, "wechat_keep_alive_watchdog", zBooleanValue6);
                break;
            case 6:
                InterfaceC1809a1 interfaceC1809a17 = this.f20834h;
                SharedPreferences sharedPreferences7 = this.f20835i;
                Context context7 = this.f20836j;
                Boolean bool7 = (Boolean) obj;
                boolean zBooleanValue7 = bool7.booleanValue();
                interfaceC1809a17.setValue(bool7);
                AbstractC4955ho.m9598l4(context7, sharedPreferences7, "wechat_keep_alive_network_heartbeat", zBooleanValue7);
                break;
            case 7:
                SharedPreferences sharedPreferences8 = this.f20835i;
                Context context8 = this.f20836j;
                InterfaceC1809a1 interfaceC1809a18 = this.f20834h;
                Boolean bool8 = (Boolean) obj;
                boolean zBooleanValue8 = bool8.booleanValue();
                if (sharedPreferences8.edit().putBoolean("crash_report_enable", zBooleanValue8).commit()) {
                    interfaceC1809a18.setValue(bool8);
                    C1438g c1438g = C1438g.f4755a;
                    C1438g.f4763i = zBooleanValue8;
                    if (zBooleanValue8) {
                        Context applicationContext = context8.getApplicationContext();
                        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                        if (application != null || (application = C1438g.f4764j) != null) {
                            C1438g.m3866h(application);
                            ClassLoader classLoader = C1438g.f4765k;
                            if (classLoader != null) {
                                C1438g.m3865g(application, classLoader);
                            } else {
                                C1438g.m3862d();
                            }
                        }
                    } else if (C1438g.f4770p != null) {
                        C1438g.m3861c();
                    }
                } else {
                    Toast.makeText(context8, "保存设置失败", 0).show();
                }
                return C3967n.f12976a;
            case 8:
                SharedPreferences sharedPreferences9 = this.f20835i;
                Context context9 = this.f20836j;
                InterfaceC1809a1 interfaceC1809a19 = this.f20834h;
                String str = (String) obj;
                str.getClass();
                String str2 = (String) interfaceC1809a19.getValue();
                interfaceC1809a19.setValue(str);
                sharedPreferences9.edit().putString("bubble_dark_icon", str).apply();
                AbstractC2043a.m5039m(context9, str2);
                break;
            case 9:
                SharedPreferences sharedPreferences10 = this.f20835i;
                Context context10 = this.f20836j;
                InterfaceC1809a1 interfaceC1809a110 = this.f20834h;
                String str3 = (String) obj;
                str3.getClass();
                String str4 = (String) interfaceC1809a110.getValue();
                interfaceC1809a110.setValue(str3);
                sharedPreferences10.edit().putString("bubble_icon", str3).apply();
                AbstractC2043a.m5039m(context10, str4);
                break;
            case 10:
                Context context11 = this.f20836j;
                SharedPreferences sharedPreferences11 = this.f20835i;
                InterfaceC1809a1 interfaceC1809a111 = this.f20834h;
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    Toast.makeText(context11, "没有可删除的名单", 0).show();
                } else {
                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                    Iterator it = list.iterator();
                    while (true) {
                        String str5 = "contact";
                        if (it.hasNext()) {
                            C0033a c0033a = (C0033a) it.next();
                            String str6 = c0033a.f104b;
                            String str7 = c0033a.f105c;
                            str6.getClass();
                            str7.getClass();
                            if (str6.equals("group_member")) {
                                str5 = "group_member";
                            }
                            arrayList.add(str5 + "|" + AbstractC3149m.m6703R0(str7).toString());
                        } else {
                            Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
                            List list2 = (List) interfaceC1809a111.getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                C0033a c0033a2 = (C0033a) obj2;
                                String str8 = c0033a2.f104b;
                                String str9 = c0033a2.f105c;
                                str8.getClass();
                                str9.getClass();
                                if (!setM8412U1.contains((str8.equals("group_member") ? "group_member" : "contact") + "|" + AbstractC3149m.m6703R0(str9).toString())) {
                                    arrayList2.add(obj2);
                                }
                            }
                            interfaceC1809a111.setValue(arrayList2);
                            sharedPreferences11.edit().putString("message_block_bindings", C0014a.m175e(arrayList2)).apply();
                            AbstractC4855en.m9271o("已删除 ", list.size(), " 个名单项", context11, 0);
                        }
                    }
                }
                return C3967n.f12976a;
            default:
                SharedPreferences sharedPreferences12 = this.f20835i;
                Context context12 = this.f20836j;
                InterfaceC1809a1 interfaceC1809a112 = this.f20834h;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19675T4, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-526951344, new C0443h0(sharedPreferences12, context12, interfaceC1809a112, 25), true), 3);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5337tc(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f20833g = i9;
        this.f20835i = sharedPreferences;
        this.f20836j = context;
        this.f20834h = interfaceC1809a1;
    }

    public /* synthetic */ C5337tc(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, Context context, int i9) {
        this.f20833g = i9;
        this.f20834h = interfaceC1809a1;
        this.f20835i = sharedPreferences;
        this.f20836j = context;
    }
}
