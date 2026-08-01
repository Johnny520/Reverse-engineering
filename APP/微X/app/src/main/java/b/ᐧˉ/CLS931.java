// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS59;
import b.ˈˈ.CLS94;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS530;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;

public final class CLS931 extends CLS219 {
    public final CLS59 FLD1732;
    public final ArrayList FLD1733;

    public CLS931(String s, String s1) {
        super(s, s1);
        this.FLD1732 = CLS59.FLD183;
        this.FLD1733 = new ArrayList();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD1733.clear();
        CLS1052 ˑⁱ0 = new CLS1052(this, 6);
        CLS40.FLD157.MTH1124(((CLS39)ˑⁱ0));
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1052(this, 0);
        ʼˎ0.FLD3526 = new CLS1052(this, 1);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 7);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH3446() {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(CLS27.MTH889("empty"));
        for(Object object0: this.FLD1732.MTH1285()) {
            arrayList0.add(((CLS94)object0).FLD398);
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        public final class CLS929 implements CLS8 {
            public final CLS1620 FLD1729;
            public final CLS931 FLD1730;

            public CLS929(CLS1620 ˊˏ0) {
                this.FLD1729 = ˊˏ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                CLS1620 ˊˏ0 = this.FLD1729;
                CLS931 ʼﹳ0 = CLS931.this;
                if(object0 == null) {
                    ˊˏ0.MTH7247(ʼﹳ0.MTH3446());
                    return;
                }
                ʼﹳ0.FLD1732.MTH1281(((CLS94)object0));
                ʼﹳ0.FLD1732.MTH1287();
                String s = ((CLS94)object0).FLD398;
                ˊˏ0.MTH7247(ʼﹳ0.MTH3446());
                ˊˏ0.MTH7246(s);
            }
        }


        public final class CLS930 implements CLS2 {
            public final CLS931 FLD1731;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS931 ʼﹳ0 = CLS931.this;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    ʼﹳ0.FLD2151.MTH922(s, "mass_send_exclude");
                    return;
                }
                ʼﹳ0.FLD2151.MTH922("", "mass_send_exclude");
            }
        }

        CLS1623 יᐧ7;
        CLS1623 יᐧ5;
        CLS500 ᵢﹶ1;
        int v = CLS523.MTH7137(10);
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
        String s = CLS34.MTH1065(4101011010339263285L, ﾞᵎ0, 4101011066173838133L);
        ﾞᵎ0.MTH7437(this.FLD2151.MTH938(s, true));
        ﾞᵎ0.MTH7438(new CLS187(this, 0));
        CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101011139188282165L, ﾞᵎ1, 4101011190727889717L, this.FLD2151, true, this, 10);
        CLS1635 ﾞᵎ2 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101010709691552565L, ﾞᵎ2, 4101010752641225525L, this.FLD2151, true, this, 17);
        CLS1635 ﾞᵎ3 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101010795590898485L, ﾞᵎ3, 4101010890080178997L, this.FLD2151, true, this, 28);
        CLS1635 ﾞᵎ4 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101007136278762293L, ﾞᵎ4, 4101007226473075509L, this.FLD2151, true, this, 29);
        CLS1635 ﾞᵎ5 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ5.MTH800(CLS27.MTH889("record_forward_enable"));
        ﾞᵎ5.MTH7437(this.FLD2151.MTH938("record_forward_enable", true));
        ﾞᵎ5.MTH7438(new CLS225(this, 0));
        CLS1635 ﾞᵎ6 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ6.MTH800(CLS27.MTH889("add_img_watermark"));
        ﾞᵎ6.MTH7437(this.FLD2151.MTH938("add_img_watermark", false));
        ﾞᵎ6.MTH7438(new CLS225(this, 1));
        CLS1635 ﾞᵎ7 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ7.MTH800(CLS27.MTH889("sns_img_add_img_watermark"));
        ﾞᵎ7.MTH7437(this.FLD2151.MTH938("sns_img_add_img_watermark", false));
        ﾞᵎ7.MTH7438(new CLS225(this, 2));
        CLS1620 ˊˏ0 = new CLS1620(activity0);
        ˊˏ0.MTH7248(((CLS533)new CLS1052(this, 5)));
        ˊˏ0.MTH7247(this.MTH3446());
        ˊˏ0.MTH7246(this.FLD2151.MTH925("watermark_img", "watermark"));
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("config_img_watermark"));
        ـˏ0.MTH7320(new CLS530(this, ˊˏ0, 10));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH800(CLS27.MTH889("forward_to_moments"));
        יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ﾞᵎ1, ﾞᵎ2, ﾞᵎ3, ﾞᵎ4, ﾞᵎ5});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH7289(new Object[]{ﾞᵎ6, ﾞᵎ7, ˊˏ0, ـˏ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        CLS1623 יᐧ2 = new CLS1623(activity0);
        יᐧ2.MTH800(CLS27.MTH889("forward_to_friends"));
        CLS1635 ﾞᵎ8 = ((CLS219)this).MTH3879(z1, z2);
        CLS29 ˎᵢ0 = this.FLD2151;
        CLS182.MTH3493(4101008265855161141L, ﾞᵎ8, 4101008347459539765L, this.FLD2151, true, this, 1);
        יᐧ2.MTH7296(ﾞᵎ8);
        CLS1635 ﾞᵎ9 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101008424768951093L, ﾞᵎ9, 4101008472013591349L, ˎᵢ0, true, this, 2);
        יᐧ2.MTH7296(ﾞᵎ9);
        if(CLS500.FLD4928.MTH6895("extract_vid_audio")) {
            CLS1635 ﾞᵎ10 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3493(4101008046811829045L, ﾞᵎ10, 4101008124121240373L, ˎᵢ0, true, this, 3);
            יᐧ2.MTH7296(ﾞᵎ10);
            CLS1625 ـˏ1 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ1.MTH800(CLS27.MTH889("send_vid_audio"));
            ـˏ1.MTH7320(new CLS173(activity0, 13));
            יᐧ2.MTH7296(ـˏ1);
        }
        CLS1635 ﾞᵎ11 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101008815610975029L, ﾞᵎ11, 4101008905805288245L, ˎᵢ0, true, this, 4);
        יᐧ2.MTH7296(ﾞᵎ11);
        CLS1635 ﾞᵎ12 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101008995999601461L, ﾞᵎ12, 4101008536438100789L, ˎᵢ0, true, this, 5);
        יᐧ2.MTH7296(ﾞᵎ12);
        CLS1635 ﾞᵎ13 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101008652402217781L, ﾞᵎ13, 4101008764071367477L, ˎᵢ0, true, this, 6);
        יᐧ2.MTH7296(ﾞᵎ13);
        CLS1635 ﾞᵎ14 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101005027449819957L, ﾞᵎ14, 4101005152003871541L, ˎᵢ0, false, this, 7);
        יᐧ2.MTH7296(ﾞᵎ14);
        CLS500 ᵢﹶ0 = this.FLD2153;
        if(ᵢﹶ0.MTH6895("chat_schedule_forward")) {
            CLS1635 ﾞᵎ15 = ((CLS219)this).MTH3879(z1, z2);
            ᵢﹶ1 = ᵢﹶ0;
            CLS182.MTH3493(4101004821291389749L, ﾞᵎ15, 4101004894305833781L, ˎᵢ0, true, this, 8);
            יᐧ2.MTH7296(ﾞᵎ15);
        }
        else {
            ᵢﹶ1 = ᵢﹶ0;
        }
        CLS1623 יᐧ3 = CLS34.MTH1087(linearLayout0, יᐧ2, v, activity0);
        יᐧ3.MTH800(CLS27.MTH889("forward_to_broadcast"));
        CLS1635 ﾞᵎ16 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101005628745241397L, ﾞᵎ16, 4101005736119423797L, ˎᵢ0, true, this, 9);
        יᐧ3.MTH7296(ﾞᵎ16);
        CLS1635 ﾞᵎ17 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101005293737792309L, ﾞᵎ17, 4101005426881778485L, ˎᵢ0, true, this, 11);
        יᐧ3.MTH7296(ﾞᵎ17);
        CLS1635 ﾞᵎ18 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101006109781578549L, ﾞᵎ18, 4101006182796022581L, ˎᵢ0, true, this, 12);
        יᐧ3.MTH7296(ﾞᵎ18);
        if(!CLS412.MTH6002()) {
            CLS1635 ﾞᵎ19 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3493(4101005766184194869L, ﾞᵎ19, 4101005860673475381L, ˎᵢ0, false, this, 13);
            יᐧ3.MTH7296(ﾞᵎ19);
        }
        if(ᵢﹶ1.MTH6895("mass_send_by_one_hack")) {
            CLS1635 ﾞᵎ20 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3493(4101006599407850293L, ﾞᵎ20, 4101006693897130805L, ˎᵢ0, true, this, 14);
            יᐧ3.MTH7296(ﾞᵎ20);
        }
        CLS1621 ˎᵢ1 = new CLS1621(activity0);
        ˎᵢ1.MTH800(CLS27.MTH889("mass_send_delay"));
        ˎᵢ1.MTH7268(((long)CLS412.MTH6005(300000, "mass_send_delay")));
        ˎᵢ1.FLD5242 = new CLS1052(this, 2);
        יᐧ3.MTH7296(ˎᵢ1);
        CLS1621 ˎᵢ2 = new CLS1621(activity0);
        ˎᵢ2.MTH800(CLS27.MTH889("mass_send_delay2"));
        ˎᵢ2.MTH7268(((long)CLS412.MTH6005(3000, "mass_send_delay2")));
        ˎᵢ2.FLD5242 = new CLS1052(this, 3);
        יᐧ3.MTH7296(ˎᵢ2);
        CLS1635 ﾞᵎ21 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101006522098438965L, ﾞᵎ21, 4101002776886956853L, ˎᵢ0, false, this, 15);
        יᐧ3.MTH7296(ﾞᵎ21);
        if(ᵢﹶ1.MTH6895("mass_send_max_items")) {
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            ˑٴ0.MTH800(CLS27.MTH889("mass_send_max_items"));
            ˑٴ0.MTH7277(String.valueOf(CLS412.MTH6005(5, "mass_send_max_items")));
            ˑٴ0.MTH7278(0x2000);
            ˑٴ0.FLD5252 = new CLS1052(this, 4);
            יᐧ3.MTH7296(ˑٴ0);
        }
        CLS1625 ـˏ2 = new CLS1625(activity0);
        ـˏ2.MTH800(CLS27.MTH889("config_exclude"));
        ـˏ2.MTH7320(new CLS530(this, activity0, 9));
        יᐧ3.MTH7296(ـˏ2);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
        CLS1635 ﾞᵎ22 = ((CLS219)this).MTH3879(z1, z2);
        CLS182.MTH3493(4101002652332905269L, ﾞᵎ22, 4101003305167934261L, ˎᵢ0, true, this, 16);
        CLS1635 ﾞᵎ23 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ23.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4101003408247149365L, ﾞᵎ23, 0x38E9B0F02B3CD335L), CLS412.MTH6002()));
        ﾞᵎ23.MTH7438(new CLS187(this, 18));
        CLS1623 יᐧ4 = new CLS1623(activity0);
        יᐧ4.MTH800(CLS27.MTH889("forward_to_others"));
        יᐧ4.MTH7289(new Object[]{ﾞᵎ22, ﾞᵎ23});
        if(TextUtils.isEmpty(CLS27.MTH897("LiveFeedMenuClass1"))) {
            יᐧ5 = יᐧ4;
        }
        else {
            CLS1635 ﾞᵎ24 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3493(4101003163434013493L, ﾞᵎ24, 4101003829153944373L, ˎᵢ0, true, this, 19);
            יᐧ5 = יᐧ4;
            יᐧ5.MTH7296(ﾞᵎ24);
        }
        CLS1623 יᐧ6 = CLS34.MTH1087(linearLayout0, יᐧ5, v, activity0);
        if(ᵢﹶ1.MTH6895("send_raw_image")) {
            CLS1635 ﾞᵎ25 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ25.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4101004009542570805L, ﾞᵎ25, 4101004073967080245L), CLS412.MTH6002()));
            ﾞᵎ25.MTH7438(new CLS187(this, 20));
            יᐧ6.MTH7296(ﾞᵎ25);
        }
        if(ᵢﹶ1.MTH6895("fast_send")) {
            CLS1635 ﾞᵎ26 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ26.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4101003631585448757L, ﾞᵎ26, 4101003674535121717L), !CLS412.MTH6002()));
            ﾞᵎ26.MTH7438(new CLS187(this, 21));
            יᐧ6.MTH7296(ﾞᵎ26);
        }
        if(ᵢﹶ1.MTH6895("multi_select")) {
            CLS1635 ﾞᵎ27 = ((CLS219)this).MTH3879(z1, z2);
            יᐧ7 = יᐧ6;
            CLS182.MTH3493(4101003773319369525L, ﾞᵎ27, 4101004378909758261L, ˎᵢ0, true, this, 22);
            יᐧ7.MTH7296(ﾞᵎ27);
        }
        else {
            יᐧ7 = יᐧ6;
        }
        if(ᵢﹶ1.MTH6895("contact_tags")) {
            CLS1635 ﾞᵎ28 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ28.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4101004490578907957L, ﾞᵎ28, 4101004563593351989L), !CLS412.MTH6002()));
            ﾞᵎ28.MTH7438(new CLS187(this, 23));
            יᐧ7.MTH7296(ﾞᵎ28);
        }
        if(ᵢﹶ1.MTH6895("voice_manager")) {
            CLS1635 ﾞᵎ29 = ((CLS219)this).MTH3879(z1, z2);
            if(ˎᵢ0.MTH938("plusShowChatOptions", true)) {
                ﾞᵎ29.MTH798(CLS27.MTH889("plusShowChatOptions"));
            }
            ﾞᵎ29.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4101004301600346933L, ﾞᵎ29, 4101004361729889077L), CLS412.MTH6002()));
            ﾞᵎ29.MTH7438(new CLS187(this, 24));
            יᐧ7.MTH7296(ﾞᵎ29);
        }
        if(ᵢﹶ1.MTH6895("sight_forward_large_video")) {
            CLS1635 ﾞᵎ30 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ30.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4101018277423928117L, ﾞᵎ30, 4101017869402034997L), CLS412.MTH6002()));
            ﾞᵎ30.MTH7438(new CLS187(this, 25));
            יᐧ7.MTH7296(ﾞᵎ30);
        }
        if(ᵢﹶ1.MTH6895("moment_schedule_forward") && CLS27.MTH899(new String[]{"mmsnspostClass", "mmsnspostClass_b"})) {
            CLS1635 ﾞᵎ31 = ((CLS219)this).MTH3879(z1, z2);
            CLS182.MTH3493(4101018801409938229L, ﾞᵎ31, 4101018908784120629L, ˎᵢ0, true, this, 26);
            יᐧ7.MTH7296(ﾞᵎ31);
        }
        if(ᵢﹶ1.MTH6895("sns_external_video") && !CLS182.MTH3470(4101018548006867765L)) {
            CLS1635 ﾞᵎ32 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ32.MTH800(CLS27.MTH889("send_external_video_shortcut"));
            ﾞᵎ32.MTH798(CLS27.MTH889("send_external_video_desc"));
            ﾞᵎ32.MTH7437(ˎᵢ0.MTH938("send_external_video_shortcut", CLS412.MTH6002()));
            ﾞᵎ32.MTH7438(new CLS187(this, 27));
            CLS1625 ـˏ3 = CLS34.MTH1082(יᐧ7, ﾞᵎ32, activity0);
            ـˏ3.MTH800(CLS27.MTH889("send_external_video"));
            ـˏ3.MTH7320(new CLS173(activity0, 14));
            יᐧ7.MTH7296(ـˏ3);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ7), v);
    }
}

