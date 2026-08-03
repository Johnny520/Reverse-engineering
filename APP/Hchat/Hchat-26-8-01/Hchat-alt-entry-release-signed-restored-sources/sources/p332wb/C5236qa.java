package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import ci.C0579e;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p243q9.C3471g;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p343x6.AbstractC5700d;
import p345x8.C5707a;
import p345x8.C5728u;

/* JADX INFO: renamed from: wb.qa */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5236qa implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20141g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f20142h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20143i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20144j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20145k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20146l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f20147m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f20148n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f20149o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f20150p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f20151q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f20152r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5236qa(Context context, InterfaceC1231l interfaceC1231l, C3471g c3471g, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f20147m = context;
        this.f20148n = interfaceC1231l;
        this.f20149o = c3471g;
        this.f20142h = interfaceC1809a1;
        this.f20143i = interfaceC1809a12;
        this.f20144j = interfaceC1809a13;
        this.f20145k = interfaceC1809a14;
        this.f20146l = interfaceC1809a15;
        this.f20150p = interfaceC1809a16;
        this.f20151q = interfaceC1809a17;
        this.f20152r = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f20141g) {
            case 0:
                Context context = (Context) this.f20147m;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f20148n;
                C3471g c3471g = (C3471g) this.f20149o;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f20150p;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f20151q;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f20152r;
                InterfaceC1809a1 interfaceC1809a14 = this.f20142h;
                if (AbstractC3149m.m6721t0((String) interfaceC1809a14.getValue())) {
                    Toast.makeText(context, "请输入模板名称", 0).show();
                } else {
                    String string = AbstractC3149m.m6703R0((String) interfaceC1809a14.getValue()).toString();
                    boolean zBooleanValue = ((Boolean) this.f20143i.getValue()).booleanValue();
                    Integer numM6742f0 = AbstractC3156t.m6742f0((String) this.f20144j.getValue());
                    int iM7909r = numM6742f0 != null ? AbstractC3754e0.m7909r(numM6742f0.intValue(), 0, 600) : 0;
                    String str = (String) this.f20145k.getValue();
                    str.getClass();
                    int iHashCode = str.hashCode();
                    String str2 = (iHashCode == 3029889 ? str.equals("both") : iHashCode == 3046160 ? str.equals(WeChatSnsPost.TYPE_CARD) : iHashCode == 3556653 && str.equals(WeChatSnsPost.TYPE_TEXT)) ? str : WeChatSnsPost.TYPE_TEXT;
                    String str3 = (String) this.f20146l.getValue();
                    str3.getClass();
                    String str4 = str3.equals("card_first") ? "card_first" : "text_first";
                    String str5 = (String) interfaceC1809a1.getValue();
                    String str6 = (String) interfaceC1809a12.getValue();
                    String str7 = (String) interfaceC1809a13.getValue();
                    String str8 = c3471g.f11255a;
                    string.getClass();
                    str5.getClass();
                    str6.getClass();
                    str7.getClass();
                    interfaceC1231l.invoke(new C3471g(str8, string, zBooleanValue, iM7909r, str2, str4, str5, str6, str7));
                }
                return C3967n.f12976a;
            case 1:
                String str9 = (String) this.f20147m;
                String str10 = (String) this.f20148n;
                String str11 = (String) this.f20149o;
                String str12 = (String) this.f20150p;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f20151q;
                String str13 = (String) this.f20152r;
                this.f20142h.setValue("global");
                this.f20143i.setValue(str9);
                this.f20144j.setValue(str10);
                this.f20145k.setValue(str11);
                this.f20146l.setValue(str12);
                sharedPreferences.edit().putString(AbstractC5700d.m10249E("group_rename_prompt_type", str13), "global").putString(AbstractC5700d.m10249E("group_rename_both_order", str13), str9).putString(AbstractC5700d.m10249E("group_rename_text", str13), str10).putString(AbstractC5700d.m10249E("group_rename_card_title", str13), str11).putString(AbstractC5700d.m10249E("group_rename_card_desc", str13), str12).apply();
                break;
            default:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f20148n;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f20149o;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f20150p;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f20151q;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f20152r;
                Context context2 = (Context) this.f20147m;
                C5728u c5728uM9647r = AbstractC4955ho.m9647r(this.f20142h, this.f20143i, this.f20144j, this.f20145k, this.f20146l, interfaceC1809a15, interfaceC1809a16);
                boolean z9 = sharedPreferences2.getBoolean("ai_stream", false);
                C5728u c5728uM10399b = c5728uM9647r.m10399b();
                C5707a c5707a = new C5707a(c5728uM10399b.f23334b, c5728uM10399b.f23335c, c5728uM10399b.f23336d, c5728uM10399b.f23337e, c5728uM10399b.f23338f, c5728uM10399b.f23339g, z9);
                interfaceC1809a17.setValue("正在测试...");
                AbstractC3603v.m7563q(interfaceC3599t, null, new C0579e(context2, c5707a, interfaceC1809a17, null, 9), 3);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5236qa(SharedPreferences sharedPreferences, InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, Context context) {
        this.f20148n = sharedPreferences;
        this.f20149o = interfaceC3599t;
        this.f20142h = interfaceC1809a1;
        this.f20143i = interfaceC1809a12;
        this.f20144j = interfaceC1809a13;
        this.f20145k = interfaceC1809a14;
        this.f20146l = interfaceC1809a15;
        this.f20150p = interfaceC1809a16;
        this.f20151q = interfaceC1809a17;
        this.f20152r = interfaceC1809a18;
        this.f20147m = context;
    }

    public /* synthetic */ C5236qa(String str, String str2, String str3, String str4, SharedPreferences sharedPreferences, String str5, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f20147m = str;
        this.f20148n = str2;
        this.f20149o = str3;
        this.f20150p = str4;
        this.f20151q = sharedPreferences;
        this.f20152r = str5;
        this.f20142h = interfaceC1809a1;
        this.f20143i = interfaceC1809a12;
        this.f20144j = interfaceC1809a13;
        this.f20145k = interfaceC1809a14;
        this.f20146l = interfaceC1809a15;
    }
}
