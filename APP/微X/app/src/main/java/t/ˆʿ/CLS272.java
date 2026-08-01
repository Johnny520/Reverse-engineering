// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.HashMap;
import t.ʻˑ.CLS3;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS144;

public final class CLS272 implements CLS144 {
    public final int FLD428;
    public final String FLD429;
    public final Activity FLD430;

    public CLS272(Activity activity0, String s, int v) {
        this.FLD428 = v;
        this.FLD430 = activity0;
        this.FLD429 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS144
    public final void MTH2170(Object[] arr_object) {
        Bitmap bitmap1;
        Bitmap bitmap0 = null;
        String s = this.FLD429;
        Activity activity0 = this.FLD430;
        if(this.FLD428 == 0) {
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            if(CLS133.MTH2107(new String[]{"MMAnimateViewClass", "MMAnimateViewClass_b", "MMAnimateViewClass_c"})) {
                try {
                    if(CLS133.MTH2110("MMAnimateViewClass")) {
                        bitmap0 = CLS3.MTH988(CLS133.MTH2111("MMAnimateViewClass"), new Object[]{activity0});
                    }
                    else if(CLS133.MTH2110("MMAnimateViewClass_b")) {
                        bitmap0 = CLS3.MTH988(CLS133.MTH2111("MMAnimateViewClass_b"), new Object[]{activity0, null});
                    }
                    else if(CLS133.MTH2110("MMAnimateViewClass_c")) {
                        bitmap0 = CLS3.MTH988(CLS133.MTH2111("MMAnimateViewClass_c"), new Object[]{activity0, null, -1});
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                CLS3.MTH991(bitmap0, "setMinimumHeight", new Object[]{640});
                CLS3.MTH991(bitmap0, "setMinimumWidth", new Object[]{640});
                CLS43.MTH1419(linearLayout0, ((View)bitmap0));
                if(bitmap0 != null) {
                    CLS3.MTH991(bitmap0, CLS133.MTH2115("MMAnimateViewClassSetImageFilePathMethod"), new Object[]{s});
                    return;
                }
            }
            else {
                WebView webView0 = new WebView(activity0);
                CLS43.MTH1432(linearLayout0, webView0);
                webView0.getSettings().setLoadWithOverviewMode(true);
                webView0.getSettings().setUseWideViewPort(true);
                webView0.setScrollBarStyle(0x2000000);
                webView0.setScrollbarFadingEnabled(false);
                webView0.getSettings().setBuiltInZoomControls(true);
                webView0.loadUrl("file://" + s);
            }
            return;
        }
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        ImageView imageView0 = new ImageView(activity0);
        if(!TextUtils.isEmpty(s)) {
            HashMap hashMap0 = CLS41.FLD488;
            if(hashMap0.containsKey(s)) {
                bitmap1 = (Bitmap)hashMap0.get(s);
                if(bitmap1 == null || bitmap1.isRecycled()) {
                    bitmap1 = CLS41.MTH1393(s);
                    hashMap0.put(s, bitmap1);
                }
            }
            else {
                bitmap1 = CLS41.MTH1393(s);
                hashMap0.put(s, bitmap1);
            }
            bitmap0 = bitmap1;
        }
        imageView0.setImageBitmap(bitmap0);
        CLS43.MTH1432(linearLayout1, imageView0);
    }
}

