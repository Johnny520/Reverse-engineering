// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS67;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS230;
import b.ⁱʾ.CLS1270;
import b.ⁱʾ.CLS335;
import b.ﾞˎ.CLS1618;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS525;
import java.io.File;
import java.util.ArrayList;

public final class CLS1392 implements CLS17, CLS39 {
    public final int FLD3946;
    public final String FLD3947;
    public final Activity FLD3948;

    public CLS1392(Activity activity0, String s) {
        this.FLD3946 = 6;
        super();
        this.FLD3947 = s;
        this.FLD3948 = activity0;
    }

    public CLS1392(Activity activity0, String s, int v) {
        this.FLD3946 = v;
        this.FLD3948 = activity0;
        this.FLD3947 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Activity activity0 = this.FLD3948;
        String s = this.FLD3947;
        if(this.FLD3946 == 1) {
            CLS476.MTH6641(activity0, new File(s));
            return;
        }
        File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_shortvid_temp.mp4");
        if(!CLS432.MTH6185(file0.getAbsolutePath(), s)) {
            CLS27.MTH906("download failed!");
            return;
        }
        CLS462.MTH6488(false, activity0, file0.getAbsolutePath());
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        String s = this.FLD3947;
        Activity activity0 = this.FLD3948;
        switch(this.FLD3946) {
            case 0: {
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                TextView textView0 = new TextView(activity0);
                CLS523.MTH7155(textView0, s);
                textView0.setTextSize(30.0f);
                textView0.setGravity(17);
                textView0.setTextColor(CLS522.MTH7109());
                CLS523.MTH7158(linearLayout1, textView0, true);
                return;
            }
            case 2: {
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                CLS1623 יᐧ0 = new CLS1623(activity0);
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("invite_key_unused"));
                ـˏ0.MTH7320(new CLS230(s, activity0, 13));
                יᐧ0.MTH7296(ـˏ0);
                CLS1625 ـˏ1 = new CLS1625(activity0);
                ـˏ1.MTH800(CLS27.MTH889("invite_key_used"));
                ـˏ1.MTH7320(new CLS230(s, activity0, 14));
                יᐧ0.MTH7296(ـˏ1);
                CLS1625 ـˏ2 = new CLS1625(activity0);
                ـˏ2.MTH800(CLS27.MTH889("invite_key_pending"));
                ـˏ2.MTH7320(new CLS230(s, activity0, 15));
                יᐧ0.MTH7296(ـˏ2);
                CLS523.MTH7154(linearLayout2, ((CLS18)יᐧ0), CLS523.MTH7137(10));
                CLS1623 יᐧ1 = new CLS1623(activity0);
                CLS1626 ـﹳ0 = new CLS1626(activity0);
                ـﹳ0.FLD5295 = false;
                יᐧ1.MTH7296(ـﹳ0);
                CLS1471 ˑˋ0 = new CLS1471(s, ـﹳ0, 5);
                ˑˋ0.MTH774();
                CLS1625 ـˏ3 = new CLS1625(activity0);
                ـˏ3.MTH800(CLS27.MTH889("select_chatrooms"));
                ـˏ3.MTH7320(new CLS67(s, activity0, ˑˋ0, 28));
                יᐧ1.MTH7296(ـˏ3);
                CLS1625 ـˏ4 = new CLS1625(activity0);
                ـˏ4.MTH800(CLS27.MTH889("invite_key_add"));
                ـˏ4.MTH7320(new CLS230(activity0, s, 16));
                יᐧ1.MTH7296(ـˏ4);
                CLS523.MTH7154(linearLayout2, ((CLS18)יᐧ1), CLS523.MTH7137(10));
                return;
            }
            case 3: {
                Menu menu0 = (Menu)arr_object[0];
                LinearLayout linearLayout3 = (LinearLayout)arr_object[1];
                ArrayList arrayList0 = new ArrayList();
                CLS335 ˑٴ0 = new CLS335(activity0, arrayList0);
                ˑٴ0.FLD3331 = true;
                CLS1626 ـﹳ1 = new CLS1626(activity0);
                CLS525 ʻˑ0 = new CLS525(activity0, linearLayout3, menu0);
                ʻˑ0.MTH7187("add", ((CLS3)new CLS1396(activity0, s, arrayList0, ـﹳ1, ˑٴ0, 1)));
                ʻˑ0.MTH7187("import_", ((CLS3)new CLS1396(activity0, s, arrayList0, ـﹳ1, ˑٴ0, 2)));
                ʻˑ0.MTH7188();
                ـﹳ1.FLD5295 = false;
                ـﹳ1.MTH800(CLS27.MTH889("total"));
                ـﹳ1.MTH7325("" + arrayList0.size());
                CLS523.MTH7154(linearLayout3, ((CLS18)ـﹳ1), CLS523.MTH7137(10));
                CLS1624 יﹳ0 = new CLS1624(activity0);
                יﹳ0.FLD5274 = new CLS1270(ˑٴ0, 6);
                יﹳ0.MTH7302();
                יﹳ0.MTH7311();
                יﹳ0.MTH7303(ˑٴ0);
                יﹳ0.MTH7305(new CLS427(ˑٴ0, activity0, arrayList0, ـﹳ1, 1));
                CLS523.MTH7147(linearLayout3, ((CLS18)יﹳ0), true);
                return;
            }
            case 4: {
                LinearLayout linearLayout4 = (LinearLayout)arr_object[1];
                CLS1623 יᐧ2 = new CLS1623(activity0);
                ImageView imageView0 = new ImageView(activity0);
                imageView0.setImageBitmap(CLS518.MTH7061(s));
                CLS1618 ʽﹶ0 = new CLS1618(activity0);
                ʽﹶ0.FLD5172.add(imageView0);
                יᐧ2.MTH7296(ʽﹶ0);
                יᐧ2.MTH7290(linearLayout4, 0);
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                if(CLS27.MTH899(new String[]{"MMAnimateViewClass", "MMAnimateViewClass_b", "MMAnimateViewClass_c"})) {
                    Object object0 = CLS66.MTH1522(activity0);
                    CLS166.MTH3195(object0, "setMinimumHeight", new Object[]{640});
                    CLS166.MTH3195(object0, "setMinimumWidth", new Object[]{640});
                    CLS523.MTH7158(linearLayout0, ((View)object0), false);
                    if(object0 != null) {
                        CLS166.MTH3195(object0, CLS27.MTH897("MMAnimateViewClassSetImageFilePathMethod"), new Object[]{s});
                    }
                }
                else {
                    WebView webView0 = new WebView(activity0);
                    CLS523.MTH7139(linearLayout0, webView0, 0);
                    webView0.getSettings().setLoadWithOverviewMode(true);
                    webView0.getSettings().setUseWideViewPort(true);
                    webView0.setScrollBarStyle(0x2000000);
                    webView0.setScrollbarFadingEnabled(false);
                    webView0.getSettings().setBuiltInZoomControls(true);
                    webView0.loadUrl("file://" + s);
                }
            }
        }
    }
}

