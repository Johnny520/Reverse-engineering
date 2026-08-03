package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import gb.C1391o;
import java.util.Set;
import okhttp3.HttpUrl;
import p010aa.C0033a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p249qg.InterfaceC3599t;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.o9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5169o9 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19335g = 2;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f19336h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f19337i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f19338j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f19339k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f19340l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f19341m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f19342n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f19343o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f19344p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f19345q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5169o9(Context context, C1391o c1391o, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC3599t interfaceC3599t) {
        this.f19342n = c1391o;
        this.f19337i = interfaceC1809a1;
        this.f19343o = interfaceC3599t;
        this.f19338j = interfaceC1809a12;
        this.f19339k = interfaceC1809a13;
        this.f19336h = context;
        this.f19340l = interfaceC1809a14;
        this.f19341m = interfaceC1809a15;
        this.f19344p = interfaceC1809a16;
        this.f19345q = interfaceC1809a17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f19335g) {
            case 0:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f19342n;
                C4969i5 c4969i5 = (C4969i5) this.f19343o;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f19344p;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f19345q;
                C0033a c0033a = c4969i5.f17772b;
                boolean zBooleanValue = ((Boolean) this.f19337i.getValue()).booleanValue();
                String str = (String) this.f19338j.getValue();
                Set set = (Set) this.f19339k.getValue();
                InterfaceC1809a1 interfaceC1809a13 = this.f19340l;
                boolean zBooleanValue2 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                InterfaceC1809a1 interfaceC1809a14 = this.f19341m;
                interfaceC1231l.invoke(C0033a.m290a(c0033a, null, null, null, zBooleanValue, str, set, zBooleanValue2, ((Boolean) interfaceC1809a14.getValue()).booleanValue(), (Set) interfaceC1809a1.getValue(), (((Boolean) interfaceC1809a13.getValue()).booleanValue() && !((Boolean) interfaceC1809a14.getValue()).booleanValue() && ((Set) interfaceC1809a1.getValue()).contains(WeChatSnsPost.TYPE_TEXT)) ? (String) interfaceC1809a12.getValue() : HttpUrl.FRAGMENT_ENCODE_SET, 15));
                Toast.makeText(this.f19336h, "名单已保存", 0).show();
                break;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f19342n;
                String str2 = (String) this.f19343o;
                String str3 = (String) this.f19344p;
                C5225q c5225q = (C5225q) this.f19345q;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                Long lM6743g0 = AbstractC3156t.m6743g0((String) this.f19337i.getValue());
                SharedPreferences.Editor editorPutString = editorEdit.putLong(str2, lM6743g0 != null ? AbstractC3754e0.m7911s(lM6743g0.longValue(), 0L, 600000L) : 0L).putString(str3, AbstractC3149m.m6703R0((String) this.f19338j.getValue()).toString());
                if (c5225q != null) {
                    String str4 = c5225q.f20105c;
                    String string = AbstractC3149m.m6703R0((String) this.f19339k.getValue()).toString();
                    if (AbstractC3149m.m6721t0(string)) {
                        string = "yyyy-MM-dd";
                    }
                    editorPutString.putString(str4, string);
                    String str5 = c5225q.f20111i;
                    String string2 = AbstractC3149m.m6703R0((String) this.f19340l.getValue()).toString();
                    if (AbstractC3149m.m6721t0(string2)) {
                        string2 = "yyMMdd";
                    }
                    editorPutString.putString(str5, string2);
                    editorPutString.putString(c5225q.f20113k, AbstractC3149m.m6703R0((String) this.f19341m.getValue()).toString());
                }
                editorPutString.apply();
                Toast.makeText(this.f19336h, "设置已保存", 0).show();
                break;
            default:
                C1391o c1391o = (C1391o) this.f19342n;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f19343o;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f19344p;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f19345q;
                this.f19337i.setValue(null);
                C5491y2.m9855z1(interfaceC3599t, this.f19338j, this.f19339k, this.f19336h, this.f19340l, this.f19341m, interfaceC1809a15, interfaceC1809a16, c1391o, true);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5169o9(SharedPreferences sharedPreferences, String str, String str2, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, C5225q c5225q, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f19342n = sharedPreferences;
        this.f19343o = str;
        this.f19344p = str2;
        this.f19336h = context;
        this.f19337i = interfaceC1809a1;
        this.f19338j = interfaceC1809a12;
        this.f19345q = c5225q;
        this.f19339k = interfaceC1809a13;
        this.f19340l = interfaceC1809a14;
        this.f19341m = interfaceC1809a15;
    }

    public /* synthetic */ C5169o9(InterfaceC1231l interfaceC1231l, C4969i5 c4969i5, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f19342n = interfaceC1231l;
        this.f19343o = c4969i5;
        this.f19336h = context;
        this.f19337i = interfaceC1809a1;
        this.f19338j = interfaceC1809a12;
        this.f19339k = interfaceC1809a13;
        this.f19340l = interfaceC1809a14;
        this.f19341m = interfaceC1809a15;
        this.f19344p = interfaceC1809a16;
        this.f19345q = interfaceC1809a17;
    }
}
