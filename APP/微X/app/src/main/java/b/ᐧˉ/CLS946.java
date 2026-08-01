// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS530;
import java.io.File;
import java.util.ArrayList;

public final class CLS946 extends CLS219 {
    public final ArrayList FLD1802;
    public CLS1622 FLD1803;

    public CLS946(String s, String s1) {
        super(s, s1);
        this.FLD1802 = new ArrayList();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD1802.clear();
        CLS1195 ﹳי0 = new CLS1195(this, 7);
        CLS40.FLD157.MTH1124(((CLS39)ﹳי0));
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1195(this, 0);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 8);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        public final class CLS945 implements CLS2 {
            public final CLS946 FLD1801;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS946.this.FLD2151.MTH922(s, "werun_excl");
            }
        }

        File file6;
        File file5;
        String s2;
        File file3;
        File file2;
        File file1;
        File file0;
        int v = CLS523.MTH7137(10);
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ0.MTH798(CLS27.MTH889("float_video_desc"));
        ﾞᵎ0.MTH800(CLS27.MTH889("float_video_enable"));
        CLS29 ˎᵢ0 = this.FLD2151;
        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938("float_video_enable", false));
        ﾞᵎ0.MTH7438(new CLS183(this, 0));
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.MTH800(CLS27.MTH889("float_video_dim_lbl"));
        ˑٴ0.FLD5256 = CLS27.MTH889("dimensions");
        ˑٴ0.MTH7277(ˎᵢ0.MTH927(640, "float_vid_width") + "," + ˎᵢ0.MTH927(480, "float_vid_height"));
        ˑٴ0.FLD5252 = new CLS1195(this, 4);
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ˑٴ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ1.MTH800(CLS27.MTH889("custom_dice_enable"));
        ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("custom_dice_enable", false));
        ﾞᵎ1.MTH7438(new CLS183(this, 16));
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("pre_config_dice"));
        ـˏ0.MTH7320(new CLS173(activity0, 17));
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH7289(new Object[]{ﾞᵎ1, ـˏ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        if(!TextUtils.isEmpty(CLS27.MTH897("RegionCodeDecoder"))) {
            CLS1635 ﾞᵎ2 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ2.MTH800(CLS27.MTH889("fake_region_enable"));
            ﾞᵎ2.MTH7437(ˎᵢ0.MTH938("fake_region_enable", false));
            ﾞᵎ2.MTH7438(new CLS183(this, 17));
            CLS1625 ـˏ1 = new CLS1625(activity0);
            ـˏ1.MTH800(CLS27.MTH889("add_fake_region"));
            ـˏ1.MTH7320(new CLS173(activity0, 18));
            CLS1623 יᐧ2 = new CLS1623(activity0);
            יᐧ2.MTH7289(new Object[]{ﾞᵎ2, ـˏ1});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        }
        CLS500 ᵢﹶ0 = this.FLD2153;
        if(ᵢﹶ0.MTH6895("fake_gps") && !CLS502.MTH6934(CLS27.FLD105, new String[]{"io.va.exposed"})) {
            CLS1635 ﾞᵎ3 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ3.MTH800(CLS27.MTH889("fake_gps"));
            ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("fake_gps_enable", false));
            ﾞᵎ3.MTH7438(new CLS183(this, 18));
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889("set_gps"));
            ـˏ2.MTH7320(new CLS173(activity0, 19));
            CLS1622 ˑٴ1 = new CLS1622(activity0);
            this.FLD1803 = ˑٴ1;
            ˑٴ1.MTH800(CLS27.MTH889("fake_gps_hint"));
            this.FLD1803.MTH7277(ˎᵢ0.MTH925("fake_gps", ""));
            CLS1622 ˑٴ2 = this.FLD1803;
            ˑٴ2.FLD5252 = new CLS1195(this, 6);
            CLS1623 יᐧ3 = new CLS1623(activity0);
            יᐧ3.MTH7289(new Object[]{ﾞᵎ3, ـˏ2, this.FLD1803});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
        }
        if(ᵢﹶ0.MTH6895("modify_steps") && CLS27.MTH890("StepModifierClass")) {
            CLS1635 ﾞᵎ4 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ4.MTH800(CLS27.MTH889("modify_steps"));
            ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("modify_steps_enable", false));
            ﾞᵎ4.MTH7438(new CLS183(this, 19));
            CLS1622 ˑٴ3 = new CLS1622(activity0);
            ˑٴ3.MTH800(CLS27.MTH889("modify_steps_multiplier"));
            ˑٴ3.MTH7278(0x2000);
            ˑٴ3.MTH7277(String.valueOf(ˎᵢ0.MTH931("modify_steps_multiplier")));
            ˑٴ3.FLD5252 = new CLS1195(this, 1);
            CLS1635 ﾞᵎ5 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ5.MTH800(CLS27.MTH889("modify_steps_max_enable"));
            ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("modify_steps_max_enable", false));
            ﾞᵎ5.MTH7438(new CLS183(this, 1));
            CLS1622 ˑٴ4 = new CLS1622(activity0);
            ˑٴ4.FLD5243 = true;
            ˑٴ4.MTH7278(2);
            ˑٴ4.MTH7277(String.valueOf(ˎᵢ0.MTH927(0, "modify_steps_max")));
            ˑٴ4.FLD5252 = new CLS1195(this, 2);
            CLS1623 יᐧ4 = new CLS1623(activity0);
            יᐧ4.MTH7289(new Object[]{ﾞᵎ4, ˑٴ3, ﾞᵎ5, ˑٴ4});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v);
        }
        if(ᵢﹶ0.MTH6895("werun_like_all")) {
            CLS1635 ﾞᵎ6 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ6.MTH800(CLS27.MTH889("werun_autolike"));
            ﾞᵎ6.MTH798(CLS27.MTH889("werun_autolike_desc"));
            ﾞᵎ6.MTH7437(ˎᵢ0.MTH938("werun_autolike_enable", false));
            ﾞᵎ6.MTH7438(new CLS183(this, 2));
            CLS1622 ˑٴ5 = new CLS1622(activity0);
            ˑٴ5.MTH800(CLS27.MTH889("min_steps"));
            ˑٴ5.MTH7278(2);
            ˑٴ5.MTH7277(String.valueOf(ˎᵢ0.MTH927(0, "werun_steps")));
            ˑٴ5.FLD5252 = new CLS1195(this, 3);
            CLS1625 ـˏ3 = new CLS1625(activity0);
            ـˏ3.MTH800(CLS27.MTH889("config_exclude"));
            ـˏ3.MTH7320(new CLS530(this, activity0, 11));
            CLS1623 יᐧ5 = new CLS1623(activity0);
            יᐧ5.MTH7289(new Object[]{ﾞᵎ6, ˑٴ5, ـˏ3});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v);
        }
        CLS1623 יᐧ6 = new CLS1623(activity0);
        if(ᵢﹶ0.MTH6895("scan_gallery_to_camera") && !CLS182.MTH3470(4101013153527943989L)) {
            CLS1635 ﾞᵎ7 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ7.MTH800(CLS27.MTH889("scan_gallery_to_camera_enable"));
            ﾞᵎ7.MTH7437(ˎᵢ0.MTH938("scan_gallery_to_camera", false));
            ﾞᵎ7.MTH7438(new CLS183(this, 3));
            יᐧ6.MTH7296(ﾞᵎ7);
        }
        if(CLS27.MTH899(new String[]{"isTabletMethod1", "isTabletMethod1_b"})) {
            CLS1635 ﾞᵎ8 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ8.MTH800(CLS27.MTH889("force_tablet_mode_enable"));
            ﾞᵎ8.MTH7437(ˎᵢ0.MTH938("force_tablet_mode_enable", false));
            ﾞᵎ8.MTH7438(new CLS183(this, 4));
            יᐧ6.MTH7296(ﾞᵎ8);
        }
        if(!CLS182.MTH3470(4100992400245969717L)) {
            CLS1635 ﾞᵎ9 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ9.MTH800(CLS27.MTH889("sight_use_front_camera_enable"));
            ﾞᵎ9.MTH7437(ˎᵢ0.MTH938("sight_use_front_camera_enable", false));
            ﾞᵎ9.MTH7438(new CLS183(this, 5));
            יᐧ6.MTH7296(ﾞᵎ9);
        }
        CLS1635 ﾞᵎ10 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ10.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100992151137866549L, ﾞᵎ10, 4100992245627147061L), CLS412.MTH6002()));
        ﾞᵎ10.MTH7438(new CLS183(this, 6));
        יᐧ6.MTH7296(ﾞᵎ10);
        CLS1635 ﾞᵎ11 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ11.MTH800(CLS27.MTH889("quote_enable"));
        ﾞᵎ11.MTH7437(ˎᵢ0.MTH938("quote_enable", false));
        ﾞᵎ11.MTH7438(new CLS183(this, 7));
        יᐧ6.MTH7296(ﾞᵎ11);
        if(CLS27.MTH902("repeat_msg_send")) {
            CLS1635 ﾞᵎ12 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ12.MTH800(CLS27.MTH889("repeat_msg_send"));
            ﾞᵎ12.MTH7437(ˎᵢ0.MTH938("repeat_msg_send", false));
            ﾞᵎ12.MTH7438(new CLS183(this, 8));
            יᐧ6.MTH7296(ﾞᵎ12);
        }
        CLS1622 ˑٴ6 = new CLS1622(activity0);
        ˑٴ6.MTH800(CLS27.MTH889("max_emoji"));
        ˑٴ6.MTH7278(2);
        ˑٴ6.MTH7277(String.valueOf(CLS412.MTH6005(9000, "max_emoji")));
        ˑٴ6.FLD5252 = new CLS1195(this, 5);
        יᐧ6.MTH7296(ˑٴ6);
        if(!TextUtils.isEmpty(CLS27.MTH897("message_fold"))) {
            CLS1635 ﾞᵎ13 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ13.MTH800(CLS27.MTH889("prevent_message_fold"));
            ﾞᵎ13.MTH7437(ˎᵢ0.MTH938("prevent_message_fold", false));
            ﾞᵎ13.MTH7438(new CLS183(this, 9));
            יᐧ6.MTH7296(ﾞᵎ13);
        }
        if(!CLS182.MTH3470(4100993529822368565L)) {
            CLS1635 ﾞᵎ14 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ14.MTH800(CLS27.MTH889("fast_switch_account"));
            ﾞᵎ14.MTH7437(ˎᵢ0.MTH938("fast_switch_enable", false));
            ﾞᵎ14.MTH7438(new CLS183(this, 10));
            יᐧ6.MTH7296(ﾞᵎ14);
        }
        if(CLS27.MTH899(new String[]{"webwxConfirmationClass", "webwxConfirmationClass_b"})) {
            CLS1635 ﾞᵎ15 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ15.MTH800(CLS27.MTH889("webwx_auto_confirm"));
            ﾞᵎ15.MTH7437(ˎᵢ0.MTH938("webwx_auto_confirm", false));
            ﾞᵎ15.MTH7438(new CLS183(this, 11));
            יᐧ6.MTH7296(ﾞᵎ15);
        }
        if(ᵢﹶ0.MTH6895("storygallery_download") && !CLS182.MTH3470(4100989277804745525L)) {
            CLS1635 ﾞᵎ16 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ16.MTH800(CLS27.MTH889("storygallery_download_tip"));
            ﾞᵎ16.MTH7437(ˎᵢ0.MTH938("storygallery_download", false));
            ﾞᵎ16.MTH7438(new CLS183(this, 12));
            יᐧ6.MTH7296(ﾞᵎ16);
        }
        if(Build.VERSION.SDK_INT >= 21) {
            CLS1635 ﾞᵎ17 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ17.MTH800(CLS27.MTH889("multiwebview"));
            ﾞᵎ17.MTH7437(ˎᵢ0.MTH938("MultiWebView", false));
            ﾞᵎ17.MTH7438(new CLS183(this, 13));
            יᐧ6.MTH7296(ﾞᵎ17);
        }
        CLS1635 ﾞᵎ18 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ18.MTH800(CLS27.MTH889("auto_close_bindmobile"));
        ﾞᵎ18.MTH7437(ˎᵢ0.MTH938("auto_close_bindmobile", true));
        ﾞᵎ18.MTH7438(new CLS183(this, 14));
        יᐧ6.MTH7296(ﾞᵎ18);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v);
        if(CLS27.MTH902("add_actionbar_items_enable")) {
            CLS1623 יᐧ7 = new CLS1623(activity0);
            CLS1635 ﾞᵎ19 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ19.MTH800(CLS27.MTH889("add_actionbar_items_enable"));
            ﾞᵎ19.MTH7437(ˎᵢ0.MTH938("add_actionbar_items_enable", false));
            ﾞᵎ19.MTH7438(new CLS183(this, 15));
            יᐧ7.MTH7296(ﾞᵎ19);
            CLS1625 ـˏ4 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ4.MTH800(CLS27.MTH889("add_actionbar_items"));
            ـˏ4.MTH7320(new CLS173(activity0, 15));
            יᐧ7.MTH7296(ـˏ4);
            יᐧ7.MTH7290(linearLayout0, v);
        }
        String s = CLS66.MTH1365();
        if(TextUtils.isEmpty(s)) {
        label_193:
            file1 = null;
        }
        else {
            try {
                file0 = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android/data/" + CLS390.MTH5619(CLS27.MTH900()) + "/cache"), s), "finder"), "video");
                if(CLS31.MTH1001(file0)) {
                    goto label_191;
                }
                else {
                    goto label_193;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                file1 = null;
            }
            goto label_196;
        label_191:
            file1 = file0;
        }
    label_196:
        String s1 = CLS66.MTH1365();
        if(TextUtils.isEmpty(s1)) {
        label_207:
            file3 = null;
        }
        else {
            try {
                file2 = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android/data/" + CLS390.MTH5619(CLS27.MTH900()) + "/MicroMsg"), s1), "finder"), "video");
                if(CLS31.MTH1001(file2)) {
                    goto label_205;
                }
                else {
                    goto label_207;
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
                file3 = null;
            }
            goto label_210;
        label_205:
            file3 = file2;
        }
    label_210:
        if(CLS27.MTH890("cachePathField")) {
            try {
                Object object0 = CLS66.MTH1457();
                s2 = object0 == null ? "" : ((String)CLS166.MTH3194(object0, CLS27.MTH897("cachePathField")));
            }
            catch(Throwable throwable2) {
                CLS27.MTH893(throwable2);
                s2 = "";
            }
        }
        else {
            s2 = "";
        }
        if(TextUtils.isEmpty(s2)) {
        label_240:
            file6 = null;
        }
        else {
            try {
                Context context0 = CLS27.MTH900();
                if(context0 == null) {
                    goto label_240;
                }
                else {
                    File file4 = context0.getCacheDir();
                    if(file4 == null) {
                        goto label_240;
                    }
                    else {
                        file5 = new File(new File(new File(file4, s2), "finder"), "video");
                        if(CLS31.MTH1001(file5)) {
                            goto label_234;
                        }
                        else {
                            goto label_240;
                        }
                    }
                }
            }
            catch(Throwable throwable3) {
                CLS27.MTH893(throwable3);
                file6 = null;
            }
            goto label_243;
        label_234:
            file6 = file5;
        }
    label_243:
        if(file1 != null || file3 != null || file6 != null) {
            CLS1625 ـˏ5 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ5.MTH800(CLS27.MTH889("explore_finder_cache"));
            ـˏ5.MTH7320(new CLS258(activity0, file1, file3, file6, 2));
            CLS523.MTH7154(linearLayout0, ((CLS18)ـˏ5), v);
        }
        CLS1625 ـˏ6 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ6.MTH800(CLS27.MTH889("manage_wxid_module_load"));
        ـˏ6.MTH7320(new CLS173(activity0, 16));
        CLS523.MTH7154(linearLayout0, ((CLS18)ـˏ6), v);
    }
}

