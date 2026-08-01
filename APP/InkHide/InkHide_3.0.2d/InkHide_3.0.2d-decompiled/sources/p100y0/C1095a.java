package p100y0;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;
import java.util.regex.Pattern;
import p012G.C0140d;
import p027N0.AbstractC0223g;
import p070i0.AbstractC0731a;
import p092u0.AbstractC1015a;

/* JADX INFO: renamed from: y0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1095a extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final C0140d f3733a = new C0140d(29);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1098d f3734b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1095a(C1098d c1098d) {
        this.f3734b = c1098d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        Log.i("d", "webViewLinker onLoadResource " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AbstractC0731a.m1386c("d", "onPageFinished", str);
        InterfaceC1099e interfaceC1099e = this.f3734b.f3738a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AbstractC0731a.m1386c("d", "onPageStarted", str);
        super.onPageStarted(webView, str, bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        AbstractC0731a.m1387d("d", "onReceivedError", Integer.valueOf(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        AbstractC0731a.m1387d("d", "onReceivedHttpError", webResourceRequest != null ? webResourceRequest.getUrl() : null, webResourceResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
        AbstractC0731a.m1387d("d", "onReceivedSslError", sslError);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        AbstractC0223g.m418e(str, "url");
        AbstractC0731a.m1386c("d", "shouldInterceptRequest", str);
        return super.shouldInterceptRequest(webView, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String string;
        AbstractC0223g.m418e(webView, "view");
        AbstractC0223g.m418e(str, "url");
        AbstractC0731a.m1386c("d", "shouldOverrideUrlLoading", str);
        Uri uri = Uri.parse(str);
        this.f3733a.getClass();
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme == null || (string = scheme.toString()) == null) {
                string = "";
            }
            String lowerCase = string.toLowerCase(Locale.ROOT);
            AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
            String string2 = uri.toString();
            AbstractC0223g.m417d(string2, "toString(...)");
            Pattern patternCompile = Pattern.compile("https?://.+\\.(?:apk|zip|rar|gzip)", 66);
            AbstractC0223g.m417d(patternCompile, "compile(...)");
            if (patternCompile.matcher(string2).matches()) {
                Context context = webView.getContext();
                AbstractC0223g.m417d(context, "getContext(...)");
                AbstractC1015a.m2216b(context, uri.toString(), null);
                return true;
            }
            if ("maskwechat".equals(uri.getScheme()) && "com.lu.wxmask".equals(uri.getHost())) {
                AbstractC0731a.m1386c("d", "webView appLink:", uri);
                Context context2 = webView.getContext();
                AbstractC0223g.m417d(context2, "getContext(...)");
                AbstractC1015a.m2216b(context2, uri.toString(), null);
                return true;
            }
            if (!lowerCase.equals("https") && !lowerCase.equals("about")) {
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        AbstractC0731a.m1387d("d", "onReceivedError", webResourceRequest != null ? webResourceRequest.getUrl() : null);
    }
}
