package p092u0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p055lu.wxmask.config.AppConfigUtil;
import com.p055lu.wxmask.p057ui.MainActivity;
import com.p055lu.wxmask.p057ui.WebViewActivity;
import java.net.URISyntaxException;
import java.util.List;
import java.util.regex.Pattern;
import p004C.C0060d;
import p009E0.C0104d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p070i0.AbstractC0731a;
import p081o0.C0780a;
import p094v0.DialogC1029d;
import p098x0.C1036b;
import p102z0.AbstractC1121d;

/* JADX INFO: renamed from: u0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1015a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2215a(Context context, Uri uri) {
        AbstractC0223g.m418e(context, "context");
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(268435456);
        String queryParameter = uri.getQueryParameter("data");
        if (queryParameter != null) {
            intent.setData(Uri.parse(queryParameter));
        }
        context.startActivity(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2216b(Context context, String str, InterfaceC0204l interfaceC0204l) {
        AbstractC0223g.m418e(context, "context");
        try {
            AbstractC0731a.m1386c("App Route", str);
            Uri uri = Uri.parse(str);
            if (!(uri != null && "maskwechat".equals(uri.getScheme()) && "com.lu.wxmask".equals(uri.getHost()))) {
                AbstractC0223g.m415b(uri);
                m2217c(context, uri, str);
                return;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                AbstractC0731a.m1387d("is Mask App link ,but pathSegments‘s size is not match. Jump to main Page");
                m2215a(context, uri);
                return;
            }
            String str2 = pathSegments.get(0);
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = pathSegments.get(1);
            if (str4 != null) {
                str3 = str4;
            }
            m2218d(context, uri, str2, str3);
        } catch (Throwable th) {
            AbstractC0731a.m1387d(th);
            if (interfaceC0204l != null) {
                interfaceC0204l.mo8c(th);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2217c(Context context, Uri uri, String str) throws URISyntaxException {
        Intent uri2;
        if (AbstractC0307q.m533c0(uri.getScheme(), "http") || AbstractC0307q.m533c0(uri.getScheme(), "https")) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addCategory("android.intent.category.BROWSABLE");
            uri2 = intent;
        } else {
            uri2 = Intent.parseUri(str, 4);
        }
        uri2.setComponent(null);
        uri2.setPackage(null);
        uri2.addFlags(268435456);
        context.startActivity(uri2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m2218d(Context context, Uri uri, String str, String str2) {
        Object c0104d;
        String host;
        if (str.equals("feat")) {
            if (!str2.equals("checkAppUpdate")) {
                if (str2.equals("donate")) {
                    AbstractC0503h.m978P("Good good study, day day up.");
                    return;
                } else {
                    AbstractC0731a.m1387d(str2, "for mask link featGroup not impl");
                    return;
                }
            }
            C1036b c1036b = new C1036b();
            AbstractC0223g.m418e(context, "context");
            if (c1036b.f3652d) {
                return;
            }
            c1036b.f3652d = true;
            AbstractC1121d.f3779a.m2409h(true, new C0060d(14, new C0780a(c1036b, context, "未检查到新版本", 3)));
            return;
        }
        if (!str.equals("page")) {
            AbstractC0731a.m1387d(str, "for mask link 's group not impl");
            return;
        }
        int iHashCode = str2.hashCode();
        if (iHashCode != -1948027042) {
            if (iHashCode != 3343801) {
                if (iHashCode == 1223471129 && str2.equals("webView")) {
                    String queryParameter = uri.getQueryParameter("url");
                    String string = null;
                    String string2 = queryParameter != null ? AbstractC0299i.m507C0(queryParameter).toString() : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                    if (!AbstractC0307q.m534d0(string2)) {
                        try {
                            c0104d = Uri.parse(string2);
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        if (c0104d instanceof C0104d) {
                            c0104d = null;
                        }
                        Uri uri2 = (Uri) c0104d;
                        if (uri2 != null && AbstractC0307q.m533c0(uri2.getScheme(), "https") && (host = uri2.getHost()) != null && !AbstractC0307q.m534d0(host) && uri2.getUserInfo() == null) {
                            string = uri2.toString();
                        }
                    }
                    if (string == null) {
                        AbstractC0503h.m978P("链接无效或不安全");
                        return;
                    }
                    if (Boolean.parseBoolean(uri.getQueryParameter("isDialog"))) {
                        new DialogC1029d(context, string, uri.getQueryParameter("title"), Boolean.parseBoolean(uri.getQueryParameter("forceHtml"))).show();
                        return;
                    }
                    Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
                    intent.addFlags(268435456);
                    intent.putExtra("url", string);
                    intent.putExtra("title", uri.getQueryParameter("title"));
                    intent.putExtra("forceHtml", Boolean.parseBoolean(uri.getQueryParameter("forceHtml")));
                    context.startActivity(intent);
                    return;
                }
            } else if (str2.equals("main")) {
                m2215a(context, uri);
                return;
            }
        } else if (str2.equals("releasesNote")) {
            boolean z2 = Boolean.parseBoolean(uri.getQueryParameter("isDialog"));
            String releaseNoteWebUrl = AppConfigUtil.Companion.getReleaseNoteWebUrl();
            Pattern patternCompile = Pattern.compile("https?://.+\\.html", 66);
            AbstractC0223g.m417d(patternCompile, "compile(...)");
            AbstractC0223g.m418e(releaseNoteWebUrl, "input");
            boolean zMatches = patternCompile.matcher(releaseNoteWebUrl).matches();
            if (z2) {
                String queryParameter2 = uri.getQueryParameter("title");
                if (queryParameter2 == null) {
                    queryParameter2 = context.getApplicationInfo().name;
                }
                new DialogC1029d(context, releaseNoteWebUrl, queryParameter2, zMatches).show();
                return;
            }
            Intent intent2 = new Intent(context, (Class<?>) WebViewActivity.class);
            intent2.addFlags(268435456);
            intent2.putExtra("url", releaseNoteWebUrl);
            intent2.putExtra("title", uri.getQueryParameter("title"));
            intent2.putExtra("forceHtml", zMatches);
            context.startActivity(intent2);
            return;
        }
        AbstractC0731a.m1387d(str2, "for mask link pageGroup not impl");
    }
}
