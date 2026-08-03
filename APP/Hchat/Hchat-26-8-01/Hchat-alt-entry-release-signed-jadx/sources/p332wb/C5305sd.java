package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.List;
import org.json.JSONException;
import p007a7.AbstractC0018a;
import p080fb.C1168r0;
import p080fb.C1176t0;
import p080fb.C1183v;
import p080fb.C1186w;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.sd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5305sd implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20636g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f20637h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20638i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20639j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20640k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20641l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20642m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20643n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f20644o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f20645p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f20646q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f20647r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f20648s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f20649t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f20650u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f20651v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5305sd(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, int i9) {
        this.f20636g = i9;
        this.f20637h = context;
        this.f20638i = interfaceC1809a1;
        this.f20639j = interfaceC1809a12;
        this.f20640k = interfaceC1809a13;
        this.f20641l = interfaceC1809a14;
        this.f20642m = interfaceC1809a15;
        this.f20643n = interfaceC1809a16;
        this.f20644o = interfaceC1809a17;
        this.f20645p = interfaceC1809a18;
        this.f20646q = interfaceC1809a19;
        this.f20647r = interfaceC1809a110;
        this.f20648s = interfaceC1809a111;
        this.f20649t = interfaceC1809a112;
        this.f20650u = interfaceC1809a113;
        this.f20651v = interfaceC1809a114;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() throws JSONException {
        int iIntValue;
        switch (this.f20636g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f20651v;
                Boolean bool = Boolean.FALSE;
                this.f20638i.setValue(bool);
                this.f20639j.setValue("#00000000");
                this.f20640k.setValue("#FFFF0000");
                this.f20641l.setValue("#00000000");
                this.f20642m.setValue("#FFFF0000");
                this.f20643n.setValue("${time}");
                this.f20644o.setValue("HH:mm:ss");
                this.f20645p.setValue("message_bottom");
                this.f20646q.setValue("2");
                this.f20647r.setValue("64");
                this.f20648s.setValue("64");
                this.f20649t.setValue("10");
                this.f20650u.setValue(Boolean.TRUE);
                interfaceC1809a1.setValue(bool);
                Toast.makeText(this.f20637h, "已恢复默认，保存后生效", 0).show();
                break;
            case 1:
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f20651v;
                InterfaceC1809a1 interfaceC1809a13 = this.f20638i;
                Integer numM6742f0 = AbstractC3156t.m6742f0((String) interfaceC1809a13.getValue());
                Context context = this.f20637h;
                if (numM6742f0 == null || 2000 > (iIntValue = numM6742f0.intValue()) || iIntValue >= 1000001) {
                    Toast.makeText(context, "自动压缩阈值需为 2000 到 1000000", 0).show();
                } else {
                    InterfaceC1809a1 interfaceC1809a14 = this.f20639j;
                    C1183v c1183vM9768B0 = C5491y2.m9768B0(interfaceC1809a14, this.f20640k, this.f20641l, this.f20642m, this.f20643n, this.f20644o, interfaceC1809a13, this.f20645p, this.f20646q, this.f20647r);
                    String str = c1183vM9768B0.f3976a;
                    if (AbstractC3149m.m6721t0(str) || AbstractC3149m.m6721t0(c1183vM9768B0.f3979d)) {
                        Toast.makeText(context, "API 地址和模型不能为空", 0).show();
                    } else {
                        String strM9779H0 = C5491y2.m9779H0(c1183vM9768B0);
                        if (AbstractC3149m.m6721t0(strM9779H0)) {
                            strM9779H0 = null;
                        }
                        if (strM9779H0 != null) {
                            Toast.makeText(context, strM9779H0, 0).show();
                        } else {
                            List<C1168r0> list = c1183vM9768B0.f3980e;
                            if (list == null || !list.isEmpty()) {
                                for (C1168r0 c1168r0 : list) {
                                    if (c1168r0.f3899c && AbstractC3149m.m6721t0(c1168r0.f3900d)) {
                                        Toast.makeText(context, "已启用 MCP 的 Endpoint 不能为空", 0).show();
                                    }
                                }
                                C1186w.m3239w(context, c1183vM9768B0);
                                interfaceC1809a14.setValue(str);
                                C1176t0 c1176t0M3230n = C1186w.m3230n(context);
                                this.f20648s.setValue(c1176t0M3230n.f3936a);
                                this.f20649t.setValue(c1176t0M3230n.f3937b);
                                InterfaceC1809a1 interfaceC1809a15 = this.f20650u;
                                AbstractC3199a.m6848u((Number) interfaceC1809a15.getValue(), 1, interfaceC1809a15);
                                interfaceC1809a12.setValue(Boolean.FALSE);
                                Toast.makeText(context, "Agent 配置已保存", 0).show();
                            } else {
                                C1186w.m3239w(context, c1183vM9768B0);
                                interfaceC1809a14.setValue(str);
                                C1176t0 c1176t0M3230n2 = C1186w.m3230n(context);
                                this.f20648s.setValue(c1176t0M3230n2.f3936a);
                                this.f20649t.setValue(c1176t0M3230n2.f3937b);
                                InterfaceC1809a1 interfaceC1809a152 = this.f20650u;
                                AbstractC3199a.m6848u((Number) interfaceC1809a152.getValue(), 1, interfaceC1809a152);
                                interfaceC1809a12.setValue(Boolean.FALSE);
                                Toast.makeText(context, "Agent 配置已保存", 0).show();
                            }
                        }
                    }
                }
                return C3967n.f12976a;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f20651v;
                InterfaceC1809a1 interfaceC1809a16 = this.f20638i;
                String strM245i = AbstractC0018a.m245i(AbstractC3149m.m6698M0((String) interfaceC1809a16.getValue(), ','));
                if (strM245i.length() == 0) {
                    strM245i = "#576B95";
                }
                interfaceC1809a16.setValue(strM245i);
                SharedPreferences.Editor editorPutString = sharedPreferences.edit().putBoolean("group_rename_notice_enable", ((Boolean) this.f20639j.getValue()).booleanValue()).putString("group_rename_notice_text", (String) this.f20640k.getValue()).putString("group_rename_notice_scope", (String) this.f20641l.getValue()).putString("group_rename_notice_groups", (String) this.f20642m.getValue()).putBoolean("group_rename_send_enable", ((Boolean) this.f20643n.getValue()).booleanValue()).putString("group_rename_listen_groups", (String) this.f20644o.getValue());
                Integer numM6742f02 = AbstractC3156t.m6742f0((String) this.f20645p.getValue());
                editorPutString.putInt("group_rename_delay_seconds", numM6742f02 != null ? AbstractC3754e0.m7909r(numM6742f02.intValue(), 0, 600) : 0).putString("group_rename_prompt_type", (String) this.f20646q.getValue()).putString("group_rename_both_order", (String) this.f20647r.getValue()).putString("group_rename_text", (String) this.f20648s.getValue()).putString("group_rename_card_title", (String) this.f20649t.getValue()).putString("group_rename_card_desc", (String) this.f20650u.getValue()).putString("group_rename_wxid_color", strM245i).apply();
                Toast.makeText(this.f20637h, "改名监控设置已保存", 0).show();
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5305sd(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f20636g = 2;
        this.f20651v = sharedPreferences;
        this.f20637h = context;
        this.f20638i = interfaceC1809a1;
        this.f20639j = interfaceC1809a12;
        this.f20640k = interfaceC1809a13;
        this.f20641l = interfaceC1809a14;
        this.f20642m = interfaceC1809a15;
        this.f20643n = interfaceC1809a16;
        this.f20644o = interfaceC1809a17;
        this.f20645p = interfaceC1809a18;
        this.f20646q = interfaceC1809a19;
        this.f20647r = interfaceC1809a110;
        this.f20648s = interfaceC1809a111;
        this.f20649t = interfaceC1809a112;
        this.f20650u = interfaceC1809a113;
    }
}
