package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.Set;
import okhttp3.HttpUrl;
import p010aa.C0040h;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: wb.b9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4743b9 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15990g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f15991h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f15992i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f15993j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f15994k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f15995l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f15996m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f15997n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f15998o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4743b9(Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, String str) {
        this.f15990g = 1;
        this.f15991h = sharedPreferences;
        this.f15997n = str;
        this.f15998o = context;
        this.f15992i = interfaceC1809a1;
        this.f15993j = interfaceC1809a12;
        this.f15994k = interfaceC1809a13;
        this.f15995l = interfaceC1809a14;
        this.f15996m = interfaceC1809a15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f15990g) {
            case 0:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f15997n;
                AbstractC4955ho.m9407P0((SharedPreferences) this.f15991h, this.f15992i, this.f15993j, this.f15994k, this.f15995l, this.f15996m, (InterfaceC1809a1) this.f15998o);
                interfaceC1220a.invoke();
                break;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f15991h;
                String str = (String) this.f15997n;
                Context context = (Context) this.f15998o;
                sharedPreferences.edit().putString(AbstractC5700d.m10249E("group_rename_prompt_type", str), (String) this.f15992i.getValue()).putString(AbstractC5700d.m10249E("group_rename_both_order", str), (String) this.f15993j.getValue()).putString(AbstractC5700d.m10249E("group_rename_text", str), (String) this.f15994k.getValue()).putString(AbstractC5700d.m10249E("group_rename_card_title", str), (String) this.f15995l.getValue()).putString(AbstractC5700d.m10249E("group_rename_card_desc", str), (String) this.f15996m.getValue()).apply();
                Toast.makeText(context, "专属改名设置已保存", 0).show();
                break;
            case 2:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f15997n;
                C4806d6 c4806d6 = (C4806d6) this.f15991h;
                Context context2 = (Context) this.f15998o;
                String str2 = c4806d6.f16511b.f131a;
                String string = AbstractC3149m.m6703R0((String) this.f15992i.getValue()).toString();
                if (AbstractC3149m.m6721t0(string)) {
                    string = AbstractC0921a.m2249l(c4806d6.f16510a + 1, "模板 ");
                }
                String str3 = string;
                boolean zBooleanValue = ((Boolean) this.f15993j.getValue()).booleanValue();
                InterfaceC1809a1 interfaceC1809a1 = this.f15994k;
                boolean zBooleanValue2 = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                InterfaceC1809a1 interfaceC1809a12 = this.f15995l;
                interfaceC1231l.invoke(new C0040h(str2, str3, zBooleanValue, 0, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, zBooleanValue2, (Set) interfaceC1809a12.getValue(), (((Boolean) interfaceC1809a1.getValue()).booleanValue() || !((Set) interfaceC1809a12.getValue()).contains(WeChatSnsPost.TYPE_TEXT)) ? HttpUrl.FRAGMENT_ENCODE_SET : (String) this.f15996m.getValue()));
                Toast.makeText(context2, "模板已保存", 0).show();
                break;
            default:
                C5491y2.m9849w1((C1845j1) this.f15997n, (C1845j1) this.f15991h, (C1845j1) this.f15992i, (C1845j1) this.f15993j, (C1845j1) this.f15994k, (C1845j1) this.f15995l, (C1845j1) this.f15996m, (C1845j1) this.f15998o);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4743b9(int i9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, Object obj, Object obj2) {
        this.f15990g = i9;
        this.f15997n = obj;
        this.f15991h = obj2;
        this.f15992i = interfaceC1809a1;
        this.f15993j = interfaceC1809a12;
        this.f15994k = interfaceC1809a13;
        this.f15995l = interfaceC1809a14;
        this.f15996m = interfaceC1809a15;
        this.f15998o = interfaceC1809a16;
    }

    public /* synthetic */ C4743b9(InterfaceC1231l interfaceC1231l, C4806d6 c4806d6, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f15990g = 2;
        this.f15997n = interfaceC1231l;
        this.f15991h = c4806d6;
        this.f15998o = context;
        this.f15992i = interfaceC1809a1;
        this.f15993j = interfaceC1809a12;
        this.f15994k = interfaceC1809a13;
        this.f15995l = interfaceC1809a14;
        this.f15996m = interfaceC1809a15;
    }
}
