// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS96;
import b.ˑٴ.CLS702;
import b.ˑٴ.CLS848;
import b.ﾞˎ.CLS525;
import java.util.HashSet;

public final class CLS1435 implements CLS17 {
    public final HashSet FLD4241;
    public final int FLD4242;
    public final String FLD4243;
    public final Activity FLD4244;
    public final boolean FLD4245;

    public CLS1435(HashSet hashSet0, Activity activity0, String s, boolean z, int v) {
        this.FLD4241 = hashSet0;
        this.FLD4244 = activity0;
        this.FLD4243 = s;
        this.FLD4245 = z;
        this.FLD4242 = v;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS96 ﾞˎ0 = new CLS96();
        ﾞˎ0.FLD408 = new CLS1545(this.FLD4241, 0);
        ﾞˎ0.FLD410 = new CLS1545(this.FLD4241, 1);
        ﾞˎ0.FLD409 = new CLS1545(this.FLD4241, 2);
        WebView webView0 = new WebView(this.FLD4244);
        webView0.getSettings().setJavaScriptEnabled(true);
        webView0.addJavascriptInterface(ﾞˎ0, "jsinterface");
        Object object0 = CLS40.FLD157.MTH1118(CLS29.class);
        String[] arr_s = {this.FLD4243};
        CLS1603 ﹶᵎ0 = new CLS1603(arr_s, ((CLS29)object0), this.FLD4245, this.FLD4242, webView0);
        CLS525 ʻˑ0 = new CLS525(this.FLD4244, linearLayout0, menu0);
        ʻˑ0.MTH7187("select_web_fav_categorie", ((CLS3)new CLS702(this.FLD4244, arr_s, ﹶᵎ0, 17)));
        ʻˑ0.MTH7187("delete", ((CLS3)new CLS848(arr_s, this.FLD4241, ((CLS29)object0), ﹶᵎ0)));
        ʻˑ0.MTH7188();
        CLS523.MTH7158(linearLayout0, webView0, false);
        if(!TextUtils.isEmpty(this.FLD4243)) {
            ﹶᵎ0.MTH774();
        }
    }
}

