// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS36.CLS35;
import b.ˆʿ.CLS59;
import b.ˈˈ.CLS94;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS390;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS545;
import java.util.ArrayList;

public final class CLS881 extends CLS140 {
    public String FLD1488;
    public SeekBar FLD1489;
    public CLS1626 FLD1490;
    public CLS878 FLD1491;
    public RadioButton FLD1492;
    public CLS1626 FLD1493;
    public String FLD1494;
    public CLS94 FLD1495;
    public ImageView FLD1496;
    public ImageView FLD1497;
    public String FLD1498;
    public RadioButton FLD1499;
    public final CLS59 FLD1500;
    public String FLD1501;
    public CLS545 FLD1502;
    public RadioButton FLD1503;
    public RadioButton FLD1504;
    public CLS1622 FLD1505;
    public RadioButton FLD1506;
    public CLS545 FLD1507;
    public RadioButton FLD1508;
    public Bitmap FLD1509;
    public String FLD1510;
    public RadioButton FLD1511;
    public RadioButton FLD1512;
    public Object FLD1513;
    public RadioButton FLD1514;
    public WebView FLD1515;
    public CLS1622 FLD1516;
    public ImageView FLD1517;
    public final ArrayList FLD1518;
    public RadioButton FLD1519;

    public CLS881(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
        this.FLD1500 = CLS59.FLD183;
        this.FLD1518 = new ArrayList();
    }

    public final void MTH3109() {
        RadioButton radioButton0;
        CLS545 ᵔˉ0;
        switch(this.FLD1495.FLD399) {
            case 0: {
                ᵔˉ0 = this.FLD1507;
                radioButton0 = this.FLD1514;
                break;
            }
            case 1: {
                ᵔˉ0 = this.FLD1507;
                radioButton0 = this.FLD1503;
                break;
            }
            case 2: {
                ᵔˉ0 = this.FLD1507;
                radioButton0 = this.FLD1504;
                break;
            }
            case 3: {
                ᵔˉ0 = this.FLD1507;
                radioButton0 = this.FLD1512;
                break;
            }
            case 4: {
                ᵔˉ0 = this.FLD1507;
                radioButton0 = this.FLD1511;
                break;
            }
            default: {
                return;
            }
        }
        ᵔˉ0.MTH7362(radioButton0);
    }

    // 此方法包含解密的字符串
    public final void MTH3110(ImageView imageView0, String s) {
        String s1 = CLS27.MTH897("MMNewPhotoEditUI");
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        this.FLD1517 = imageView0;
        Intent intent0 = new Intent();
        intent0.setClassName(((CLS140)this).MTH3042(), s1);
        intent0.putExtra("before_photo_edit", s);
        intent0.putExtra("after_photo_edit", "");
        ((CLS140)this).MTH3042().startActivityForResult(intent0, 5001);
    }

    // 此方法包含解密的字符串
    public final void MTH3111(int v, int v1, int v2) {
        String s = CLS27.MTH897("AlbumPreviewUI");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Intent intent0 = new Intent();
        boolean z = false;
        intent0.putExtra("show_header_view", false);
        intent0.putExtra("max_select_count", v2);
        intent0.putExtra("send_raw_img", true);
        intent0.putExtra("query_source_type", 9);
        intent0.putExtra("query_media_type", v1);
        Activity activity0 = ((CLS140)this).MTH3042();
        Class class0 = CLS27.MTH894("PluginHelperClass");
        if(class0 != null) {
            try {
                if(CLS27.MTH890("PluginHelperMethod2")) {
                    CLS166.MTH3192(class0, CLS27.MTH897("PluginHelperMethod2"), new Object[]{activity0, "gallery", ".ui.AlbumPreviewUI", intent0, v});
                    z = true;
                }
                else if(CLS27.MTH890("PluginHelperMethod2_b")) {
                    CLS166.MTH3192(class0, CLS27.MTH897("PluginHelperMethod2_b"), new Object[]{v, intent0, activity0, "gallery", ".ui.AlbumPreviewUI"});
                    z = true;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        if(!z) {
            intent0.setClassName(activity0, s);
            activity0.startActivityForResult(intent0, v);
        }
    }

    public final void MTH3112() {
        RadioButton radioButton0;
        CLS545 ᵔˉ0;
        switch(this.FLD1495.FLD404) {
            case 0: {
                ᵔˉ0 = this.FLD1502;
                radioButton0 = this.FLD1508;
                break;
            }
            case 1: {
                ᵔˉ0 = this.FLD1502;
                radioButton0 = this.FLD1499;
                break;
            }
            case 2: {
                ᵔˉ0 = this.FLD1502;
                radioButton0 = this.FLD1519;
                break;
            }
            case 3: {
                ᵔˉ0 = this.FLD1502;
                radioButton0 = this.FLD1506;
                break;
            }
            case 4: {
                ᵔˉ0 = this.FLD1502;
                radioButton0 = this.FLD1492;
                break;
            }
            default: {
                return;
            }
        }
        ᵔˉ0.MTH7362(radioButton0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH828("b.settingsui.onactivityresult,b.launcherui.onactivityresult,b.mmactivity.onactivityresult,b.chattingui.onactivityresult,b.fragmentactivity.onactivityresult", ((CLS35)new CLS663(this, 0)));
        ʾᵢ0.MTH828("selectImg3", ((CLS35)new CLS663(this, 1)));
        ʾᵢ0.MTH828("selectImg", ((CLS35)new CLS663(this, 2)));
        ʾᵢ0.MTH828("selectImg2", ((CLS35)new CLS663(this, 3)));
        ʾᵢ0.MTH828("selectImgMulti", ((CLS35)new CLS663(this, 4)));
        ʾᵢ0.MTH828("selectGif", ((CLS35)new CLS663(this, 5)));
        ʾᵢ0.MTH828("show_watermark_dialog", ((CLS35)new CLS663(this, 6)));
        ʾᵢ0.MTH828("selectVid", ((CLS35)new CLS663(this, 7)));
    }

    public final void MTH3114(ImageView imageView0, String s) {
        try {
            this.FLD1494 = s;
            this.FLD1517 = imageView0;
            CLS390.MTH5623(((CLS140)this).MTH3042(), 5000);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH3115(Uri uri0) {
        try {
            return CLS31.MTH969(CLS27.MTH900(), uri0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
    }
}

