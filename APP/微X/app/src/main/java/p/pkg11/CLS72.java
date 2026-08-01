// Decompiled by JEB v5.42.0.202606242140

package p.pkg11;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import p.pkg5.CLS33;
import p.pkg8.CLS43.CLS42;
import p.pkg8.CLS43;
import p.pkg8.CLS45;

public final class CLS72 extends WebView {
    public interface CLS70 {
        boolean MTH1130(String arg1);
    }

    public final class CLS71 {
        public final CLS72 FLD426;

        @JavascriptInterface
        public void getSource(String s) {
            CLS72 ˎᵔ0 = CLS72.this;
            if(ˎᵔ0.FLD429) {
                return;
            }

            ˎᵔ0.FLD429 = ˎᵔ0.FLD427.MTH1130(s);
            if(!ˎᵔ0.FLD429) {
                ˎᵔ0.getHtml();
            }
        }
    }

    public CLS70 FLD427;
    public String FLD428;
    public boolean FLD429;

    // 此方法包含解密的字符串
    public CLS72(Context context0) {
        super(context0);
        String s;
        WebSettings webSettings0;
        this.getSettings().setDomStorageEnabled(true);
        this.getSettings().setJavaScriptEnabled(true);
        this.getSettings().setCacheMode(-1);
        if(Build.VERSION.SDK_INT >= 21) {
            CLS33.MTH842(this.getSettings());
        }

        if(TextUtils.isEmpty(this.FLD428)) {
            webSettings0 = this.getSettings();
            s = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36";
        }
        else {
            webSettings0 = this.getSettings();
            s = this.FLD428;
        }

        webSettings0.setUserAgentString(s);
        this.addJavascriptInterface(new CLS71(this), "java_obj");
        this.setWebViewClient(new CLS67(this));
    }

    private void getHtml() {
        synchronized(this) {
            CLS43 ʼˉ0 = CLS43.FLD320;
            var ﹳˑ0 = new CLS197(0, this);
            if(ʼˉ0.FLD322 == null) {
                ʼˉ0.FLD322 = new Handler(Looper.getMainLooper());
            }

            ʼˉ0.FLD322.postDelayed(new CLS45(((CLS42)ﹳˑ0), 2), 50L);
        }
    }

    public void setHtmlCallback(CLS70 ˎᵔ$ٴʼ0) {
        this.FLD427 = ˎᵔ$ٴʼ0;
    }

    public void setUserAgent(String s) {
        this.FLD428 = s;
    }
}

