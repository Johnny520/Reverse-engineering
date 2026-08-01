// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS530;

public final class CLS707 implements CLS17 {
    public final int FLD833;
    public final Activity FLD834;
    public final CLS881 FLD835;

    public CLS707(CLS881 ﾞˏ0, Activity activity0, int v) {
        this.FLD833 = v;
        this.FLD835 = ﾞˏ0;
        this.FLD834 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        View view0;
        Activity activity0 = this.FLD834;
        CLS881 ﾞˏ0 = this.FLD835;
        if(this.FLD833 == 0) {
            ﾞˏ0.getClass();
            Menu menu0 = (Menu)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            CLS525 ʻˑ0 = new CLS525(activity0, linearLayout0, menu0);
            ʻˑ0.MTH7187("search_image", ((CLS3)new CLS780(ﾞˏ0, activity0, 0)));
            ʻˑ0.MTH7187("select_gif1", ((CLS3)new CLS788(ﾞˏ0, 1)));
            if(CLS21.FLD76.MTH830("hasReadStoragePermission", new Object[0])) {
                ʻˑ0.MTH7187("select_gif2", ((CLS3)new CLS788(ﾞˏ0, 2)));
            }
            if(CLS27.MTH890("AlbumPreviewUI")) {
                ʻˑ0.MTH7187("select_gif3", ((CLS3)new CLS788(ﾞˏ0, 3)));
            }
            ʻˑ0.MTH7188();
            if(CLS27.MTH899(new String[]{"MMAnimateViewClass", "MMAnimateViewClass_b", "MMAnimateViewClass_c"})) {
                Object object0 = CLS66.MTH1522(activity0);
                ﾞˏ0.FLD1513 = object0;
                CLS166.MTH3195(object0, "setMinimumHeight", new Object[]{640});
                CLS166.MTH3195(ﾞˏ0.FLD1513, "setMinimumWidth", new Object[]{640});
                view0 = (View)ﾞˏ0.FLD1513;
            }
            else {
                WebView webView0 = new WebView(activity0);
                ﾞˏ0.FLD1515 = webView0;
                webView0.getSettings().setLoadWithOverviewMode(true);
                ﾞˏ0.FLD1515.getSettings().setUseWideViewPort(true);
                ﾞˏ0.FLD1515.setScrollBarStyle(0x2000000);
                ﾞˏ0.FLD1515.setScrollbarFadingEnabled(false);
                ﾞˏ0.FLD1515.getSettings().setBuiltInZoomControls(true);
                view0 = ﾞˏ0.FLD1515;
            }
            CLS523.MTH7158(linearLayout0, view0, false);
            return;
        }
        ﾞˏ0.getClass();
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        CLS1623 יᐧ0 = new CLS1623(activity0);
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ﾞˏ0.FLD1490 = ـﹳ0;
        ـﹳ0.FLD5295 = false;
        ـﹳ0.MTH800(CLS27.MTH889("path"));
        יᐧ0.MTH7296(ﾞˏ0.FLD1490);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("select_video1"));
        ـˏ0.MTH7320(new CLS119(ﾞˏ0, 0));
        יᐧ0.MTH7296(ـˏ0);
        if(CLS21.FLD76.MTH830("hasReadStoragePermission", new Object[0])) {
            CLS1625 ـˏ1 = new CLS1625(activity0);
            ـˏ1.MTH800(CLS27.MTH889("select_video2"));
            ـˏ1.MTH7320(new CLS119(ﾞˏ0, 1));
            יᐧ0.MTH7296(ـˏ1);
        }
        if(CLS27.MTH890("AlbumPreviewUI")) {
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889("select_video3"));
            ـˏ2.MTH7320(new CLS119(ﾞˏ0, 2));
            יᐧ0.MTH7296(ـˏ2);
        }
        CLS1625 ـˏ3 = new CLS1625(activity0);
        ـˏ3.MTH800(CLS27.MTH889("preview"));
        ـˏ3.MTH7320(new CLS530(ﾞˏ0, activity0, 1));
        יᐧ0.MTH7296(ـˏ3);
        CLS523.MTH7154(linearLayout1, ((CLS18)יᐧ0), CLS523.MTH7137(10));
    }
}

