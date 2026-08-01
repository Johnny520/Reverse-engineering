package p100y0;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0291a;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: y0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1098d {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f3737c = 0;

    /* JADX INFO: renamed from: a */
    public InterfaceC1099e f3738a;

    /* JADX INFO: renamed from: b */
    public final WebView f3739b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1098d(Context context) {
        AbstractC0223g.m418e(context, "context");
        WebView webView = new WebView(context);
        this.f3739b = webView;
        WebSettings settings = webView.getSettings();
        settings.setDomStorageEnabled(false);
        settings.setJavaScriptEnabled(false);
        settings.setDatabaseEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (Build.VERSION.SDK_INT >= 33) {
            settings.setAlgorithmicDarkeningAllowed(true);
        }
        webView.setWebViewClient(new C1095a(this));
        webView.setWebChromeClient(new C1097c(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2367a(String str, InterfaceC1099e interfaceC1099e) {
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        Object c0104d4;
        String host;
        AbstractC0223g.m418e(str, "url");
        this.f3738a = interfaceC1099e;
        try {
            c0104d = Uri.parse(AbstractC0299i.m507C0(str).toString());
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        Uri uri = (Uri) c0104d;
        WebView webView = this.f3739b;
        if (uri != null && AbstractC0307q.m533c0(uri.getScheme(), "https") && (host = uri.getHost()) != null && !AbstractC0307q.m534d0(host) && uri.getUserInfo() == null) {
            webView.loadUrl(uri.toString());
        } else if (uri != null && AbstractC0307q.m533c0(uri.getScheme(), "file")) {
            try {
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                c0104d2 = new File(path).getCanonicalFile();
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            if (c0104d2 instanceof C0104d) {
                c0104d2 = null;
            }
            File file = (File) c0104d2;
            try {
                c0104d3 = webView.getContext().getFilesDir().getCanonicalFile();
            } catch (Throwable th3) {
                c0104d3 = new C0104d(th3);
            }
            File file2 = (File) (c0104d3 instanceof C0104d ? null : c0104d3);
            if (file == null || file2 == null) {
                AbstractC0731a.m1387d("d", "blocked unsafe local webview file", uri);
                webView.loadUrl("about:blank");
            } else {
                String path2 = file.getPath();
                AbstractC0223g.m417d(path2, "getPath(...)");
                if (AbstractC0307q.m538h0(path2, false, file2.getPath() + File.separator) && file.isFile()) {
                    try {
                        c0104d4 = AbstractC0079h.m172O(file, AbstractC0291a.f663a);
                    } catch (Throwable th4) {
                        c0104d4 = new C0104d(th4);
                    }
                    Throwable thM246a = AbstractC0105e.m246a(c0104d4);
                    if (thM246a == null) {
                        webView.loadDataWithBaseURL("https://local.inkhide.invalid/", (String) c0104d4, "text/html", "utf-8", null);
                    } else {
                        AbstractC0731a.m1387d("d", "read local webview file fail", file, thM246a);
                        webView.loadUrl("about:blank");
                    }
                }
            }
        } else if (str.equals("about:blank")) {
            webView.loadUrl(str);
        } else {
            AbstractC0731a.m1387d("d", "blocked unsafe webview url", str);
            webView.loadUrl("about:blank");
        }
        AbstractC0731a.m1386c("d", "webview load url:", uri);
    }
}
