// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.ImageView;
import t.ʻˑ.CLS3;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS139.CLS138;
import t.ﾞᐧ.CLS337;

public final class CLS331 extends CLS155 {
    public CLS337 FLD1086;
    public ImageView FLD1087;
    public String FLD1088;
    public String FLD1089;

    public CLS331(CLS150 ʻˑ0) {
        super(ʻˑ0);
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞٴ.CLS155
    public final void MTH2307(CLS123 ʾᵢ0) {
        ʾᵢ0.MTH2002("b.settingsui.onactivityresult,b.launcherui.onactivityresult,b.mmactivity.onactivityresult,b.chattingui.onactivityresult,b.fragmentactivity.onactivityresult", ((CLS138)new CLS312(this, 0)));
        ʾᵢ0.MTH2002("themes_selectImg2", ((CLS138)new CLS312(this, 1)));
    }

    // 此方法包含解密的字符串
    public final void MTH2311() {
        String s = CLS133.MTH2115("AlbumPreviewUI");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Intent intent0 = new Intent();
        boolean z = false;
        intent0.putExtra("show_header_view", false);
        intent0.putExtra("max_select_count", 1);
        intent0.putExtra("send_raw_img", true);
        intent0.putExtra("query_source_type", 9);
        intent0.putExtra("query_media_type", 1);
        Activity activity0 = ((CLS155)this).MTH2306();
        Class class0 = CLS133.MTH2111("PluginHelperClass");
        if(class0 != null) {
            try {
                if(CLS133.MTH2110("PluginHelperMethod2")) {
                    CLS3.MTH996(class0, CLS133.MTH2115("PluginHelperMethod2"), new Object[]{activity0, "gallery", ".ui.AlbumPreviewUI", intent0, 6006});
                    goto label_22;
                }
                else if(CLS133.MTH2110("PluginHelperMethod2_b")) {
                    CLS3.MTH996(class0, CLS133.MTH2115("PluginHelperMethod2_b"), new Object[]{6006, intent0, activity0, "gallery", ".ui.AlbumPreviewUI"});
                    goto label_22;
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            goto label_23;
        label_22:
            z = true;
        }
    label_23:
        if(!z) {
            intent0.setClassName(activity0, s);
            activity0.startActivityForResult(intent0, 6006);
        }
    }
}

