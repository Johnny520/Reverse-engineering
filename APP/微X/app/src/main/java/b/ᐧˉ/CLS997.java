// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS997 extends CLS219 {
    public final int FLD1995;
    public final ArrayList FLD1996;
    public CLS210 FLD1997;

    public CLS997(String s, String s1) {
        super(s, s1);
        this.FLD1996 = new ArrayList();
        this.FLD1995 = CLS523.MTH7137(10);
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD1996.clear();
        CLS1188 ⁱⁱ0 = new CLS1188(this, 2);
        CLS40.FLD157.MTH1124(((CLS39)ⁱⁱ0));
        this.FLD1997 = new CLS210(((CLS219)this).MTH3883(), this.FLD2157);
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1188(this, 1);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 9);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        public final class CLS994 implements CLS2 {
            public final CLS997 FLD1992;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS997.this.FLD2151.MTH922(s, "sns_auto_export_list");
            }
        }


        public final class CLS995 implements CLS2 {
            public final CLS997 FLD1993;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS997 ˋ0 = CLS997.this;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    ˋ0.FLD2151.MTH922(s, "moments_post_message_exclude");
                    return;
                }
                ˋ0.FLD2151.MTH922("", "moments_post_message_exclude");
            }
        }


        public final class CLS996 implements CLS2 {
            public final CLS997 FLD1994;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s)));
                HashSet hashSet1 = new HashSet();
                CLS997 ˋ0 = CLS997.this;
                for(Object object0: ˋ0.FLD1996) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(!hashSet0.contains("")) {
                        hashSet1.add("");
                    }
                }
                String s2 = TextUtils.join(",", hashSet1);
                ˋ0.FLD2151.MTH922(s2, "moments_post_message_exclude");
            }
        }

        long v2;
        CLS500 ᵢﹶ7;
        CLS500 ᵢﹶ6;
        CLS500 ᵢﹶ5;
        CLS267 ﹶʾ1;
        CLS500 ᵢﹶ4;
        CLS500 ᵢﹶ3;
        CLS500 ᵢﹶ2;
        CLS21 ʾᵢ1;
        CLS500 ᵢﹶ1;
        CLS267 ﹶʾ0;
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1623 יᐧ0 = new CLS1623(activity0);
        Activity activity1 = ((CLS219)this).MTH3883();
        CLS1617 ʻᵎ0 = new CLS1617(activity1);
        ʻᵎ0.MTH7200(z);
        ʻᵎ0.MTH800(CLS27.MTH889("moments_filter"));
        ʻᵎ0.FLD5159 = new CLS942(this, z1, z2, activity1, 3);
        יᐧ0.MTH7296(ʻᵎ0);
        Activity activity2 = ((CLS219)this).MTH3883();
        CLS1617 ʻᵎ1 = new CLS1617(activity2);
        ʻᵎ1.MTH7200(z);
        ʻᵎ1.MTH800(CLS27.MTH889("self_like_enable"));
        ʻᵎ1.FLD5159 = new CLS942(this, z1, z2, activity2, 1);
        יᐧ0.MTH7296(ʻᵎ1);
        Activity activity3 = ((CLS219)this).MTH3883();
        CLS1617 ʻᵎ2 = new CLS1617(activity3);
        ʻᵎ2.MTH7200(z);
        ʻᵎ2.MTH800(CLS27.MTH889("autolike"));
        ʻᵎ2.FLD5159 = new CLS942(this, activity3, z1, z2, 0);
        יᐧ0.MTH7296(ʻᵎ2);
        Activity activity4 = ((CLS219)this).MTH3883();
        CLS1617 ʻᵎ3 = new CLS1617(activity4);
        ʻᵎ3.MTH7200(z);
        ʻᵎ3.MTH800(CLS27.MTH889("autocomment"));
        ʻᵎ3.FLD5159 = new CLS942(this, activity4, z1, z2, 2);
        יᐧ0.MTH7296(ʻᵎ3);
        Activity activity5 = ((CLS219)this).MTH3883();
        CLS1617 ʻᵎ4 = new CLS1617(activity5);
        ʻᵎ4.MTH7200(z);
        ʻᵎ4.MTH800(CLS27.MTH889("auto_comment_like_filter_enable"));
        ʻᵎ4.FLD5159 = new CLS942(this, activity5, z1, z2, 4);
        יᐧ0.MTH7296(ʻᵎ4);
        int v = this.FLD1995;
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        boolean z3 = CLS412.MTH6002();
        CLS29 ˎᵢ0 = this.FLD2151;
        if(!ˎᵢ0.MTH938("moments_forward_enable", z3) || !CLS500.FLD4928.MTH6897()) {
            Activity activity6 = ((CLS219)this).MTH3883();
            CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3488(4100798340738634549L, ﾞᵎ0, 4100798409458111285L, ˎᵢ0, false, this, 22);
            CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ1.MTH800(CLS27.MTH889("timeline_sync_enable"));
            ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("timeline_sync_enable", false));
            ﾞᵎ1.MTH7438(new CLS266(this, 23));
            CLS1621 ˎᵢ1 = new CLS1621(activity6);
            ˎᵢ1.MTH800(CLS27.MTH889("sns_sync_pollingrate"));
            ˎᵢ1.MTH7268(((long)CLS412.MTH6005(900000, "sns_sync_rate")));
            ˎᵢ1.FLD5242 = new CLS1188(this, 3);
            CLS1623 יᐧ1 = new CLS1623(activity6);
            יᐧ1.MTH800(CLS27.MTH889("sns_auto_check"));
            יᐧ1.MTH7289(new Object[]{ﾞᵎ0, ﾞᵎ1, ˎᵢ1});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        }
        CLS1623 יᐧ2 = new CLS1623(activity0);
        if(!CLS412.MTH6002()) {
            CLS1635 ﾞᵎ2 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ2.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100798688630985525L, ﾞᵎ2, 4100799345760981813L), CLS390.MTH5621()));
            ﾞᵎ2.MTH7438(new CLS266(this, 0));
            יᐧ2.MTH7296(ﾞᵎ2);
        }
        CLS1635 ﾞᵎ3 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3488(0x38E8F7602B3CD335L, ﾞᵎ3, 0x38E8F76F2B3CD335L, ˎᵢ0, false, this, 6);
        יᐧ2.MTH7296(ﾞᵎ3);
        CLS1635 ﾞᵎ4 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ4.MTH798(CLS27.MTH889("sns_block_desc"));
        ﾞᵎ4.MTH800(CLS27.MTH889("sns_block_enable"));
        ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("sns_block_enable", false));
        ﾞᵎ4.MTH7438(new CLS266(this, 13));
        יᐧ2.MTH7296(ﾞᵎ4);
        יᐧ2.MTH7290(linearLayout0, v);
        if(CLS27.MTH899(new String[]{"setSnsAutoPlayMethod_b", "setSnsAutoPlayMethod"})) {
            CLS1623 יᐧ3 = new CLS1623(activity0);
            יᐧ3.MTH798(CLS27.MTH889("moment_autoplay"));
            CLS1635 ﾞᵎ5 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ5.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100800050135618357L, ﾞᵎ5, 0x38E8F7802B3CD335L), !CLS412.MTH6002()));
            ﾞᵎ5.MTH7438(new CLS266(this, 17));
            יᐧ3.MTH7296(ﾞᵎ5);
            CLS1635 ﾞᵎ6 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ6.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100799680768430901L, ﾞᵎ6, 4100799770962744117L), !CLS412.MTH6002()));
            ﾞᵎ6.MTH7438(new CLS266(this, 18));
            יᐧ3.MTH7296(ﾞᵎ6);
            יᐧ3.MTH7290(linearLayout0, v);
        }
        CLS1623 יᐧ4 = new CLS1623(activity0);
        CLS1635 ﾞᵎ7 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3488(0x38E8F7BF2B3CD335L, ﾞᵎ7, 4100796051521065781L, ˎᵢ0, false, this, 19);
        יᐧ4.MTH7296(ﾞᵎ7);
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.MTH800(CLS27.MTH889("path"));
        CLS21 ʾᵢ0 = CLS21.FLD76;
        if(ʾᵢ0.MTH830("hasWriteStoragePermission", new Object[0])) {
            ـﹳ0.MTH7325(CLS27.MTH889("set_path"));
            String s = ˎᵢ0.MTH925("sns_save_path", "");
            if(!TextUtils.isEmpty(s)) {
                ـﹳ0.MTH798(s);
            }
            ﹶʾ0 = new CLS185(this, activity0, ـﹳ0, 2);
        }
        else {
            ـﹳ0.MTH7325(CLS27.MTH889("preview"));
            ﹶʾ0 = new CLS267(10);
        }
        ـﹳ0.MTH7324(ﹶʾ0);
        יᐧ4.MTH7296(ـﹳ0);
        יᐧ4.MTH7290(linearLayout0, v);
        CLS1623 יᐧ5 = new CLS1623(activity0);
        CLS500 ᵢﹶ0 = this.FLD2153;
        if(ᵢﹶ0.MTH6895("moment_original_image")) {
            CLS1635 ﾞᵎ8 = ((CLS219)this).MTH3879(z1, z2);
            ᵢﹶ1 = ᵢﹶ0;
            ʾᵢ1 = ʾᵢ0;
            CLS182.MTH3488(4100795905492177717L, ﾞᵎ8, 0x38E8F43C2B3CD335L, ˎᵢ0, false, this, 20);
            יᐧ5.MTH7296(ﾞᵎ8);
        }
        else {
            ᵢﹶ1 = ᵢﹶ0;
            ʾᵢ1 = ʾᵢ0;
        }
        if(ᵢﹶ1.MTH6895("fake_moment_forward")) {
            CLS1635 ﾞᵎ9 = ((CLS219)this).MTH3879(z1, z2);
            ᵢﹶ2 = ᵢﹶ1;
            CLS182.MTH3488(4100796730125898549L, ﾞᵎ9, 4100796296334201653L, ˎᵢ0, false, this, 21);
            יᐧ5.MTH7296(ﾞᵎ9);
        }
        else {
            ᵢﹶ2 = ᵢﹶ1;
        }
        if(ᵢﹶ2.MTH6895("remove_mention_limit")) {
            CLS1635 ﾞᵎ10 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3488(4100796502492631861L, ﾞᵎ10, 4100797172507530037L, ˎᵢ0, false, this, 1);
            יᐧ5.MTH7296(ﾞᵎ10);
        }
        ᵢﹶ3 = ᵢﹶ2;
        יᐧ5.MTH7290(linearLayout0, v);
        if(ᵢﹶ3.MTH6895("sns_export")) {
            CLS1623 יᐧ6 = new CLS1623(activity0);
            יᐧ6.MTH800(CLS27.MTH889("sns_export"));
            CLS1635 ﾞᵎ11 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3488(0x38E8F57F2B3CD335L, ﾞᵎ11, 0x38E8F50A2B3CD335L, ˎᵢ0, false, this, 2);
            יᐧ6.MTH7296(ﾞᵎ11);
            if(ʾᵢ1.MTH830("hasWriteStoragePermission", new Object[0])) {
                CLS1626 ـﹳ1 = new CLS1626(activity0);
                ـﹳ1.MTH800(CLS27.MTH889("path"));
                ـﹳ1.MTH7325(CLS27.MTH889("set_path"));
                String s1 = ˎᵢ0.MTH925("moment_export_path", "");
                if(!TextUtils.isEmpty(s1)) {
                    ـﹳ1.MTH798(s1);
                }
                ـﹳ1.MTH7324(new CLS185(this, activity0, ـﹳ1, 0));
                יᐧ6.MTH7296(ـﹳ1);
            }
            CLS1635 ﾞᵎ12 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3488(4100797769507984181L, ﾞᵎ12, 0x38E8F5F12B3CD335L, ˎᵢ0, false, this, 3);
            CLS1625 ـˏ0 = CLS34.MTH1082(יᐧ6, ﾞᵎ12, activity0);
            ـˏ0.MTH800(CLS27.MTH889("mass_export_sns"));
            ـˏ0.MTH7320(new CLS173(activity0, 20));
            יᐧ6.MTH7296(ـˏ0);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v);
            ᵢﹶ4 = ᵢﹶ3;
            if(ᵢﹶ4.MTH6895("sns_auto_export")) {
                CLS1623 יᐧ7 = new CLS1623(activity0);
                CLS1635 ﾞᵎ13 = ((CLS219)this).MTH3879(z1, z2);
                ﾞᵎ13.MTH800(CLS27.MTH889("sns_auto_export_enable"));
                ﾞᵎ13.MTH798(CLS27.MTH889("sns_auto_export_enable_desc"));
                ﾞᵎ13.MTH7437(ˎᵢ0.MTH938("sns_auto_export_enable", false));
                ﾞᵎ13.MTH7438(new CLS266(this, 4));
                CLS1626 ـﹳ2 = new CLS1626(activity0);
                ـﹳ2.MTH800(CLS27.MTH889("path"));
                if(ʾᵢ1.MTH830("hasWriteStoragePermission", new Object[0])) {
                    ـﹳ2.MTH7325(CLS27.MTH889("set_path"));
                    String s2 = ˎᵢ0.MTH925("moment_auto_export_path", "");
                    if(!TextUtils.isEmpty(s2)) {
                        ـﹳ2.MTH798(s2);
                    }
                    ﹶʾ1 = new CLS185(this, activity0, ـﹳ2, 1);
                }
                else {
                    ـﹳ2.MTH7325(CLS27.MTH889("preview"));
                    ﹶʾ1 = new CLS267(9);
                }
                ـﹳ2.MTH7324(ﹶʾ1);
                CLS1625 ـˏ1 = new CLS1625(activity0);
                ـˏ1.MTH800(CLS27.MTH889("sns_auto_export_list"));
                ـˏ1.MTH7320(new CLS190(this, activity0, 0));
                יᐧ7.MTH7289(new Object[]{ﾞᵎ13, ـﹳ2, ـˏ1});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ7), v);
            }
        }
        else {
            ᵢﹶ4 = ᵢﹶ3;
        }
        if(ᵢﹶ4.MTH6895("moments_container_enable")) {
            CLS1635 ﾞᵎ14 = ((CLS219)this).MTH3879(z1, z2);
            ᵢﹶ5 = ᵢﹶ4;
            CLS182.MTH3488(0x38E8F2EB2B3CD335L, ﾞᵎ14, 4100794110195847989L, ˎᵢ0, false, this, 5);
            CLS1635 ﾞᵎ15 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ15.MTH800(CLS27.MTH889("moments_container_remember_selected"));
            ﾞᵎ15.MTH7437(ˎᵢ0.MTH938("moments_container_remember_selected", false));
            ﾞᵎ15.MTH7438(new CLS266(this, 7));
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889("moments_container"));
            ـˏ2.MTH7320(new CLS173(activity0, 21));
            CLS1623 יᐧ8 = new CLS1623(activity0);
            יᐧ8.MTH800(CLS27.MTH889("moments_container_enable"));
            יᐧ8.MTH7289(new Object[]{ﾞᵎ14, ﾞᵎ15, ـˏ2});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ8), v);
        }
        else {
            ᵢﹶ5 = ᵢﹶ4;
        }
        CLS1623 יᐧ9 = new CLS1623(activity0);
        CLS1635 ﾞᵎ16 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3488(0x38E8F3102B3CD335L, ﾞᵎ16, 4100794805980549941L, ˎᵢ0, false, this, 8);
        CLS1625 ـˏ3 = CLS34.MTH1082(יᐧ9, ﾞᵎ16, activity0);
        ـˏ3.MTH800(CLS27.MTH889("mass_del_sns"));
        ـˏ3.MTH7320(new CLS173(activity0, 22));
        יᐧ9.MTH7296(ـˏ3);
        if(CLS27.MTH890("SnsAsyncQueueMgr_removeAllErrorComments")) {
            CLS1635 ﾞᵎ17 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3488(0x38E8F3F12B3CD335L, ﾞᵎ17, 0x38E8F3902B3CD335L, ˎᵢ0, false, this, 9);
            יᐧ9.MTH7296(ﾞᵎ17);
        }
        if(ᵢﹶ5.MTH6895("mass_sns_like")) {
            CLS1635 ﾞᵎ18 = ((CLS219)this).MTH3879(z1, z2);
            ᵢﹶ6 = ᵢﹶ5;
            CLS182.MTH3488(4100795454520611637L, ﾞᵎ18, 4100791705014162229L, ˎᵢ0, false, this, 10);
            CLS1625 ـˏ4 = CLS34.MTH1082(יᐧ9, ﾞᵎ18, activity0);
            ـˏ4.MTH800(CLS27.MTH889("mass_like_sns"));
            ـˏ4.MTH7320(new CLS173(activity0, 23));
            יᐧ9.MTH7296(ـˏ4);
        }
        else {
            ᵢﹶ6 = ᵢﹶ5;
        }
        if(ᵢﹶ6.MTH6895("mass_sns_forward")) {
            CLS1635 ﾞᵎ19 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3488(0x38E8F00A2B3CD335L, ﾞᵎ19, 0x38E8F0242B3CD335L, ˎᵢ0, false, this, 11);
            CLS1625 ـˏ5 = CLS34.MTH1082(יᐧ9, ﾞᵎ19, activity0);
            ـˏ5.MTH800(CLS27.MTH889("mass_forward_sns"));
            ـˏ5.MTH7320(new CLS173(activity0, 24));
            יᐧ9.MTH7296(ـˏ5);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ9), v);
        if(ᵢﹶ6.MTH6895("mass_repeat_sns")) {
            CLS1623 יᐧ10 = new CLS1623(activity0);
            CLS1635 ﾞᵎ20 = ((CLS219)this).MTH3879(z1, z2);
            ᵢﹶ7 = ᵢﹶ6;
            CLS182.MTH3488(0x38E8F0DF2B3CD335L, ﾞᵎ20, 4100792370734093109L, ˎᵢ0, false, this, 12);
            יᐧ10.MTH7296(ﾞᵎ20);
            CLS1635 ﾞᵎ21 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3488(0x38E8F0862B3CD335L, ﾞᵎ21, 0x38E8F09F2B3CD335L, ˎᵢ0, false, this, 14);
            CLS1625 ـˏ6 = CLS34.MTH1082(יᐧ10, ﾞᵎ21, activity0);
            ـˏ6.MTH800(CLS27.MTH889("mass_repeat_sns"));
            ـˏ6.MTH7320(new CLS173(activity0, 25));
            יᐧ10.MTH7296(ـˏ6);
            CLS1625 ـˏ7 = new CLS1625(activity0);
            ـˏ7.MTH800(CLS27.MTH889("mass_repeat_sns_list"));
            ـˏ7.MTH7320(new CLS173(activity0, 26));
            יᐧ10.MTH7296(ـˏ7);
            יᐧ10.MTH7290(linearLayout0, v);
        }
        else {
            ᵢﹶ7 = ᵢﹶ6;
        }
        if(ᵢﹶ7.MTH6895("auto_clean_moment")) {
            CLS1623 יᐧ11 = new CLS1623(activity0);
            CLS1635 ﾞᵎ22 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ22.MTH800(CLS27.MTH889("post_auto_clean_moment_shortcut"));
            ﾞᵎ22.MTH798(CLS27.MTH889("post_auto_clean_moment_desc"));
            ﾞᵎ22.MTH7437(ˎᵢ0.MTH938("post_auto_clean_moment_shortcut", false));
            ﾞᵎ22.MTH7438(new CLS266(this, 15));
            CLS1625 ـˏ8 = CLS34.MTH1082(יᐧ11, ﾞᵎ22, activity0);
            ـˏ8.MTH800(CLS27.MTH889("post_auto_clean_moment"));
            ـˏ8.MTH7320(new CLS173(activity0, 27));
            יᐧ11.MTH7296(ـˏ8);
            יᐧ11.MTH7290(linearLayout0, v);
        }
        if(ᵢﹶ7.MTH6895("moments_post_message_mass_send")) {
            CLS1623 יᐧ12 = new CLS1623(activity0);
            CLS1635 ﾞᵎ23 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ23.MTH800(CLS27.MTH889("moments_post_message_enable"));
            ﾞᵎ23.MTH798(CLS27.MTH889("moments_post_message_enable"));
            ﾞᵎ23.MTH7437(ˎᵢ0.MTH938("moments_post_message_enable", false));
            ﾞᵎ23.MTH7438(new CLS266(this, 16));
            יᐧ12.MTH7296(ﾞᵎ23);
            CLS1621 ˎᵢ2 = new CLS1621(activity0);
            ˎᵢ2.MTH800(CLS27.MTH889("moments_post_message_dup_check_time"));
            long v1 = 14400000L;
            if(CLS27.MTH895().MTH928("moments_post_message_dup_check_time")) {
                v2 = CLS27.MTH895().MTH936(14400000L, "moments_post_message_dup_check_time");
            }
            else {
                String s3 = CLS27.MTH882("moments_post_message_dup_check_time");
                if(!TextUtils.isEmpty(s3)) {
                    try {
                        v1 = Long.parseLong(s3);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                v2 = v1;
            }
            ˎᵢ2.MTH7268(v2);
            ˎᵢ2.FLD5242 = new CLS1188(this, 0);
            יᐧ12.MTH7296(ˎᵢ2);
            CLS1625 ـˏ9 = new CLS1625(activity0);
            ـˏ9.MTH800(CLS27.MTH889("config_include"));
            ـˏ9.MTH7320(new CLS190(this, activity0, 1));
            יᐧ12.MTH7296(ـˏ9);
            CLS1625 ـˏ10 = new CLS1625(activity0);
            ـˏ10.MTH800(CLS27.MTH889("config_exclude"));
            ـˏ10.MTH7320(new CLS190(this, activity0, 2));
            יᐧ12.MTH7296(ـˏ10);
            CLS1625 ـˏ11 = new CLS1625(activity0);
            ـˏ11.MTH800(CLS27.MTH889("config_moments_post_message"));
            ـˏ11.MTH7320(new CLS218(this, 0));
            יᐧ12.MTH7296(ـˏ11);
            יᐧ12.MTH7290(linearLayout0, v);
        }
    }
}

