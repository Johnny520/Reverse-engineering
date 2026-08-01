// Decompiled by JEB v5.42.0.202606242140

package p.pkg11;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class CLS67 extends WebViewClient {
    public final CLS72 FLD419;

    public CLS67(CLS72 ˎᵔ0) {
        this.FLD419 = ˎᵔ0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        if(TextUtils.equals(s, webView0.getUrl())) {
            this.FLD419.getHtml();
        }
        super.onPageFinished(webView0, s);
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
        super.onPageStarted(webView0, s, bitmap0);
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
        super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
    }

    // 此方法包含解密的字符串
    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        if(!s.startsWith("http://") && !s.startsWith("https://")) {
            return false;
        }
        webView0.loadUrl(s);
        return true;
    }
}

