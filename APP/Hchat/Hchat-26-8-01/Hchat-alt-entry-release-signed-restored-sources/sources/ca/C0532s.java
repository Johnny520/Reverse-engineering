package ca;

import android.webkit.WebView;
import bb.C0240b;
import gg.AbstractC1416l;
import java.io.File;
import mg.InterfaceC2842d;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p065eb.C0875j0;
import p068eh.AbstractC0921a;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.InterfaceC1062y;
import p080fb.AbstractC1179u;
import p085fg.InterfaceC1231l;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p136j8.C2097h;
import p136j8.C2105p;
import p167l8.C2529d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3143g;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p258r8.C3739d;
import p276sf.C3958e;
import p276sf.C3967n;
import p285t7.C4135b;
import p317vb.InterfaceC4544a;
import p332wb.AbstractC4855en;
import p332wb.C5026jv;
import p365y9.C6008d;

/* JADX INFO: renamed from: ca.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0532s implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1660g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f1661h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0532s(String str, int i9) {
        this.f1660g = i9;
        this.f1661h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C0240b c0240b;
        C2097h c2097h;
        int i9 = this.f1660g;
        C3967n c3967n = C3967n.f12976a;
        String str = this.f1661h;
        switch (i9) {
            case 0:
                C5026jv c5026jv = (C5026jv) obj;
                c5026jv.getClass();
                return Boolean.valueOf(c5026jv.f18254f.contains(str));
            case 1:
                C3958e c3958e = (C3958e) obj;
                c3958e.getClass();
                String str2 = (String) c3958e.f12961g;
                if (str2.length() > 0 && !str2.equals(str) && !AbstractC3156t.m6733W(str2, "@chatroom", false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                return Boolean.valueOf(((C0875j0) obj).f2685a.equals(str));
            case 3:
                ((InterfaceC3142f) obj).getClass();
                return "&lt;title&gt;" + str + "&lt;/title&gt;";
            case 4:
                ((InterfaceC3142f) obj).getClass();
                return "<title>" + str + "</title>";
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                return AbstractC1179u.m3165y(str, str3);
            case 6:
                String str4 = (String) obj;
                str4.getClass();
                String strM3167z = AbstractC1179u.m3167z(str, str4);
                if (strM3167z != null) {
                    return AbstractC3149m.m6703R0(strM3167z).toString();
                }
                return null;
            case 7:
                C4135b c4135b = (C4135b) obj;
                c4135b.getClass();
                return Boolean.valueOf(AbstractC3149m.m6721t0(str) || AbstractC3156t.m6734X(c4135b.m8323c(), str));
            case 8:
                C4135b c4135b2 = (C4135b) obj;
                c4135b2.getClass();
                return Boolean.valueOf(AbstractC3156t.m6734X(c4135b2.m8323c(), str));
            case 9:
                InterfaceC1062y interfaceC1062y = (InterfaceC1062y) obj;
                InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
                interfaceC1062y.mo2644a(AbstractC1058u.f3376a, AbstractC0000a.m99x0(str));
                AbstractC1060w.m2680c(interfaceC1062y, 5);
                return c3967n;
            case 10:
                String str5 = (String) obj;
                str5.getClass();
                C2105p c2105pMedia = WeChatApis.media();
                if (c2105pMedia != null && c2105pMedia.m5301a(str, str5)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                String str6 = (String) obj;
                str6.getClass();
                C2105p c2105pMedia2 = WeChatApis.media();
                if (c2105pMedia2 != null && c2105pMedia2.f7038d.m5219v(str, str6)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                String str7 = (String) obj;
                str7.getClass();
                C2105p c2105pMedia3 = WeChatApis.media();
                if (c2105pMedia3 != null && (c0240b = c2105pMedia3.f7037c) != null && c0240b.m972q(str, str7)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                String str8 = (String) obj;
                str8.getClass();
                C2105p c2105pMedia4 = WeChatApis.media();
                if (c2105pMedia4 != null) {
                    if (c2105pMedia4.f7039e.m588T(str, str8, new File(str8).getName())) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                String str9 = (String) obj;
                str9.getClass();
                C2105p c2105pMedia5 = WeChatApis.media();
                if (c2105pMedia5 != null && (c2097h = c2105pMedia5.f7040f) != null && c2097h.m5236A(str, str9)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                String str10 = (String) obj;
                str10.getClass();
                return Boolean.valueOf(AbstractC3156t.m6740d0(str10, str, false));
            case 16:
                ((String) obj).getClass();
                return new C3739d(str);
            case 17:
                String str11 = (String) obj;
                str11.getClass();
                WeChatMessage.Companion.getClass();
                String strM5947m = C2529d.m5947m(str11, str);
                return AbstractC3149m.m6721t0(strM5947m) ? C2529d.m5949o(str11, str) : strM5947m;
            case 18:
                String str12 = (String) obj;
                str12.getClass();
                return Boolean.valueOf(str12.equals(str));
            case 19:
                String str13 = (String) obj;
                str13.getClass();
                if (AbstractC3156t.m6740d0(str13, "ID: ", false) && AbstractC3149m.m6709h0(str13, str, false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) obj;
                interfaceC4544a.getClass();
                return Boolean.valueOf(str.equals(interfaceC4544a.mo4983a()));
            case 21:
                WebView webView = (WebView) obj;
                webView.getClass();
                webView.loadDataWithBaseURL(null, this.f1661h, "image/svg+xml", "UTF-8", null);
                return c3967n;
            case 22:
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                interfaceC3142f.getClass();
                String string = AbstractC3149m.m6703R0((String) ((C3143g) ((C3145i) interfaceC3142f).m6676a()).get(1)).toString();
                if (AbstractC1416l.m3825a(string, "notify@all")) {
                    string = "所有人";
                } else {
                    C1368i c1368iM9259c = AbstractC4855en.m9259c();
                    String strM3731t = c1368iM9259c != null ? c1368iM9259c.m3731t(str, string) : null;
                    String str14 = HttpUrl.FRAGMENT_ENCODE_SET;
                    if (strM3731t == null) {
                        strM3731t = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (AbstractC3149m.m6721t0(strM3731t)) {
                        String strM3729r = c1368iM9259c != null ? c1368iM9259c.m3729r(string) : null;
                        if (strM3729r != null) {
                            str14 = strM3729r;
                        }
                        strM3731t = str14;
                    }
                    if (!AbstractC3149m.m6721t0(strM3731t)) {
                        string = strM3731t;
                    }
                }
                return AbstractC0921a.m2251n("@", string, "\u2005");
            default:
                return Boolean.valueOf(((C6008d) obj).f24388a.equals(str));
        }
    }
}
