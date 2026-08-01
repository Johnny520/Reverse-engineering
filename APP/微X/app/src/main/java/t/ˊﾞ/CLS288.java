// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import org.json.JSONObject;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS297;
import t.ᵔʾ.CLS303;
import t.ᵔʾ.CLS304;

public final class CLS288 implements CLS136 {
    public final CLS105 FLD734;
    public final ListView FLD735;
    public final Activity FLD736;
    public final boolean FLD737;
    public final LinearLayout FLD738;
    public final boolean FLD739;
    public final ImageView FLD740;

    public CLS288(CLS105 ـˏ0, boolean z, Activity activity0, LinearLayout linearLayout0, ListView listView0, ImageView imageView0, boolean z1) {
        this.FLD734 = ـˏ0;
        this.FLD737 = z;
        this.FLD736 = activity0;
        this.FLD738 = linearLayout0;
        this.FLD735 = listView0;
        this.FLD740 = imageView0;
        this.FLD739 = z1;
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        CLS297 ˈˈ0;
        CLS105 ـˏ0 = this.FLD734;
        CLS102 יﹳ0 = ـˏ0.FLD783;
        boolean z = this.FLD737;
        Activity activity0 = this.FLD736;
        LinearLayout linearLayout0 = this.FLD738;
        ListView listView0 = this.FLD735;
        if(z || !יﹳ0.MTH1818("DrawerBackgroundWhole", false)) {
            if(z) {
                ˈˈ0 = new CLS297(linearLayout0, 4);
                CLS137.FLD972.MTH2145(((CLS136)ˈˈ0));
                return;
            }
            CLS304 ﾞᐧ0 = new CLS304(ـˏ0, linearLayout0, 5);
            CLS137.FLD972.MTH2145(((CLS136)ﾞᐧ0));
            int v2 = CLS43.MTH1439(ـˏ0.MTH1834());
            Bitmap bitmap1 = יﹳ0.MTH1801("drawer_header.png", v2, CLS43.MTH1439(0xA0));
            if(bitmap1 != null) {
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("b", יﹳ0.MTH1817(0, "DrawerHeaderBgBlur"));
                    jSONObject1.put("c", יﹳ0.MTH1804("DrawerHeaderOverlay", "#00FFFFFF"));
                    bitmap1 = CLS41.MTH1399(activity0, jSONObject1, bitmap1);
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                CLS303 ﾞˎ0 = new CLS303(ـˏ0, this.FLD740, bitmap1, 2);
                CLS137.FLD972.MTH2145(((CLS136)ﾞˎ0));
            }
            int v3 = Resources.getSystem().getDisplayMetrics().heightPixels - CLS43.MTH1439(0xA0);
            if(!this.FLD739) {
                v3 -= CLS43.MTH1439(0x30);
            }
            Bitmap bitmap2 = יﹳ0.MTH1801("drawer_bg.png", v2, v3);
            if(bitmap2 != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("b", יﹳ0.MTH1817(0, "DrawerListBgBlur"));
                    jSONObject2.put("c", יﹳ0.MTH1804("DrawerListOverlay", "#00FFFFFF"));
                    bitmap2 = CLS41.MTH1399(activity0, jSONObject2, bitmap2);
                }
                catch(Throwable throwable2) {
                    CLS133.MTH2113(throwable2);
                }
                BitmapDrawable bitmapDrawable1 = new BitmapDrawable(activity0.getResources(), bitmap2);
                int v4 = יﹳ0.MTH1817(0xFF, "DrawerListBgAlpha");
                if(v4 != 0xFF) {
                    bitmapDrawable1.setAlpha(v4);
                }
                ˈˈ0 = new CLS304(listView0, bitmapDrawable1, 6);
                CLS137.FLD972.MTH2145(((CLS136)ˈˈ0));
            }
        }
        else {
            int v = Resources.getSystem().getDisplayMetrics().heightPixels;
            if(!יﹳ0.MTH1818("HideActionBar", false)) {
                v -= CLS43.MTH1439(0x30);
            }
            Bitmap bitmap0 = יﹳ0.MTH1801("drawer_bg_whole.png", CLS43.MTH1439(ـˏ0.MTH1834()), v);
            if(bitmap0 != null) {
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("b", יﹳ0.MTH1817(0, "DrawerWholeBgBlur"));
                    jSONObject0.put("c", יﹳ0.MTH1804("DrawerWholeOverlay", "#00FFFFFF"));
                    bitmap0 = CLS41.MTH1399(activity0, jSONObject0, bitmap0);
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                BitmapDrawable bitmapDrawable0 = new BitmapDrawable(activity0.getResources(), bitmap0);
                int v1 = יﹳ0.MTH1817(0xFF, "DrawerWholeAlpha");
                if(v1 != 0xFF) {
                    bitmapDrawable0.setAlpha(v1);
                }
                ˈˈ0 = new CLS303(linearLayout0, bitmapDrawable0, listView0, 1);
                CLS137.FLD972.MTH2145(((CLS136)ˈˈ0));
            }
        }
    }
}

