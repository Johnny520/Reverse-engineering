package p081o0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.p055lu.wxmask.config.AppConfigUtil;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p007D0.C0095c;
import p009E0.C0109i;
import p025M0.InterfaceC0204l;
import p025M0.InterfaceC0208p;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0291a;
import p040U0.AbstractC0299i;
import p052b1.AbstractC0503h;
import p086r0.C0919l1;
import p098x0.C1036b;
import p102z0.AbstractC1121d;
import p102z0.C1119b;
import p102z0.C1120c;

/* JADX INFO: renamed from: o0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0780a implements InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2615c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2616d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0780a(File file, String str, String str2) {
        this.f2613a = 1;
        this.f2614b = file;
        this.f2615c = str;
        this.f2616d = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public final Object mo8c(Object obj) throws JSONException {
        C1119b c1119bM2405f;
        Throwable th;
        switch (this.f2613a) {
            case 0:
                return AppConfigUtil.Companion.load$lambda$1$lambda$0((File) this.f2614b, (InterfaceC0208p) this.f2616d, (String) this.f2615c, (C0095c) obj);
            case 1:
                return AppConfigUtil.Companion.getReleaseNoteWebUrl$lambda$6((File) this.f2614b, (String) this.f2615c, (String) this.f2616d, (C0095c) obj);
            case 2:
                TextView textView = (TextView) obj;
                AbstractC0223g.m418e(textView, "textView");
                CharSequence text = textView.getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                ((C0919l1) this.f2614b).getClass();
                String string2 = AbstractC0299i.m507C0(string).toString();
                if (AbstractC0299i.m511i0(string2, "文件大小", false) || AbstractC0299i.m511i0(string2, "file size", true)) {
                    ((ArrayList) this.f2616d).add(C0919l1.m2015m(textView, (View) this.f2615c));
                }
                return C0109i.f404a;
            case 3:
                C1119b c1119b = (C1119b) obj;
                AbstractC0223g.m418e(c1119b, "result");
                boolean z2 = c1119b.f3767a;
                C1036b c1036b = (C1036b) this.f2614b;
                Context context = (Context) this.f2616d;
                if (!z2) {
                    c1036b.m2224c(context, c1119b);
                } else if (c1119b.m2400b()) {
                    c1036b.m2225d(context, c1119b, false);
                } else {
                    c1036b.f3652d = false;
                    AbstractC0503h.m978P(c1119b.f3778l == null ? (String) this.f2615c : "检查更新失败");
                }
                return C0109i.f404a;
            default:
                String str = (String) this.f2615c;
                C0095c c0095c = (C0095c) obj;
                AbstractC0223g.m418e(c0095c, "response");
                C1119b c1119bM2399a = null;
                try {
                    th = c0095c.f380d;
                } catch (Throwable th2) {
                    C1120c c1120c = AbstractC1121d.f3779a;
                    C1119b c1119bM2406g = C1120c.m2406g(th2, false);
                    if (c1119bM2406g == null) {
                        C1119b c1119bM2406g2 = C1120c.m2406g(th2, true);
                        if (c1119bM2406g2 == null || !C1120c.m2403d(c1119bM2406g2)) {
                            c1119bM2406g2 = null;
                        }
                        if (c1119bM2406g2 != null) {
                            c1119bM2399a = C1119b.m2399a(c1119bM2406g2, th2, 1020);
                            JSONObject jSONObjectPut = new JSONObject().put("serviceEnabled", c1119bM2399a.f3767a).put("serviceMessage", c1119bM2399a.f3768b).put("validUntil", c1119bM2399a.f3769c).put("updateEnabled", c1119bM2399a.f3770d).put("latestVersionCode", c1119bM2399a.f3771e).put("latestVersionName", c1119bM2399a.f3772f).put("forceUpdate", c1119bM2399a.f3773g).put("updateMessage", c1119bM2399a.f3774h).put("downloadUrl", c1119bM2399a.f3775i).put("serverTime", c1119bM2399a.f3776j);
                            AbstractC0223g.m417d(jSONObjectPut, "put(...)");
                            String string3 = jSONObjectPut.toString();
                            AbstractC0223g.m417d(string3, "toString(...)");
                            c1120c.m2408a(string3);
                        }
                        if (c1119bM2399a == null) {
                            C1119b c1119b2 = (C1119b) this.f2614b;
                            if (c1119b2 == null) {
                                c1119b2 = new C1119b(th2, 2047);
                            }
                            c1119bM2405f = c1119b2;
                        } else {
                            c1119bM2405f = c1119bM2399a;
                        }
                    } else {
                        c1119bM2405f = c1119bM2406g;
                    }
                }
                if (th != null) {
                    throw th;
                }
                if (c0095c.f377a != 200) {
                    throw new IllegalStateException("response code is " + c0095c.f377a);
                }
                String str2 = new String(c0095c.f379c, AbstractC0291a.f663a);
                C1120c c1120c2 = AbstractC1121d.f3779a;
                String strM2407i = C1120c.m2407i(str2);
                c1120c2.m2408a(strM2407i);
                C1120c.m2404e(str);
                c1119bM2405f = C1120c.m2405f(strM2407i, false, null);
                AbstractC1121d.f3780b.set(false);
                ((InterfaceC0204l) this.f2616d).mo8c(c1119bM2405f);
                return C0109i.f404a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0780a(Object obj, Object obj2, Object obj3, int i2) {
        this.f2613a = i2;
        this.f2614b = obj;
        this.f2616d = obj2;
        this.f2615c = obj3;
    }

    public /* synthetic */ C0780a(String str, C1119b c1119b, InterfaceC0204l interfaceC0204l) {
        this.f2613a = 4;
        this.f2615c = str;
        this.f2614b = c1119b;
        this.f2616d = interfaceC0204l;
    }
}
