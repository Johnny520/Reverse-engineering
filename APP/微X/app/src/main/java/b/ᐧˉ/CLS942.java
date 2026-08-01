// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ⁱᵔ.CLS413;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;

public final class CLS942 implements CLS526 {
    public final int FLD1790;
    public final Activity FLD1791;
    public final boolean FLD1792;
    public final CLS997 FLD1793;
    public final boolean FLD1794;

    public CLS942(CLS997 ˋ0, Activity activity0, boolean z, boolean z1, int v) {
        this.FLD1790 = v;
        this.FLD1793 = ˋ0;
        this.FLD1791 = activity0;
        this.FLD1792 = z;
        this.FLD1794 = z1;
        super();
    }

    public CLS942(CLS997 ˋ0, boolean z, boolean z1, Activity activity0, int v) {
        this.FLD1790 = v;
        this.FLD1793 = ˋ0;
        this.FLD1792 = z;
        this.FLD1794 = z1;
        this.FLD1791 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        boolean z = this.FLD1794;
        boolean z1 = this.FLD1792;
        Activity activity0 = this.FLD1791;
        CLS997 ˋ0 = this.FLD1793;
        switch(this.FLD1790) {
            case 0: {
                ˋ0.getClass();
                CLS1625 ـˏ1 = new CLS1625(activity0);
                ـˏ1.MTH800(CLS27.MTH889("like_only_list"));
                ـˏ1.MTH7320(new CLS190(ˋ0, activity0, 5));
                CLS1625 ـˏ2 = new CLS1625(activity0);
                ـˏ2.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ2.MTH7320(new CLS190(ˋ0, activity0, 6));
                CLS1635 ﾞᵎ1 = ((CLS219)ˋ0).MTH3879(z1, z);
                String s2 = CLS34.MTH1065(4100774503670141749L, ﾞᵎ1, 0x38E8E0BD2B3CD335L);
                CLS29 ˎᵢ0 = ˋ0.FLD2151;
                ﾞᵎ1.MTH7437(ˎᵢ0.MTH938(s2, false));
                ﾞᵎ1.MTH7438(new CLS221(ˋ0, ـˏ1, ـˏ2, 0));
                CLS1622 ˑٴ1 = new CLS1622(activity0);
                CLS1625 ـˏ3 = new CLS1625(activity0);
                ـˏ3.MTH800(CLS27.MTH889("add_new_keyword"));
                ـˏ3.MTH7320(new CLS196(ˋ0, activity0, ˑٴ1, 2));
                ˑٴ1.MTH800(CLS27.MTH889("keyword"));
                ˑٴ1.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
                String s3 = ˎᵢ0.MTH925("auto_like_allowed_filter", "");
                if(!TextUtils.isEmpty(s3)) {
                    ˑٴ1.MTH7277(s3);
                }
                ˑٴ1.FLD5252 = new CLS1188(ˋ0, 10);
                CLS1635 ﾞᵎ2 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ2.MTH800(CLS27.MTH889("auto_like_allowed_filter_enable"));
                ﾞᵎ2.MTH7437(ˎᵢ0.MTH938("auto_like_allowed_filter_enable", false));
                ﾞᵎ2.MTH7438(new CLS206(ˋ0, 9));
                CLS1621 ˎᵢ1 = new CLS1621(activity0);
                ˎᵢ1.MTH800(CLS27.MTH889("delay"));
                ˎᵢ1.MTH7268(((long)ˎᵢ0.MTH927(5000, "auto_like_delay")));
                ˎᵢ1.FLD5242 = new CLS1188(ˋ0, 11);
                CLS1635 ﾞᵎ3 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ3.MTH800(CLS27.MTH889("auto_like_timeframe_enable"));
                ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("auto_like_timeframe_enable", false));
                ﾞᵎ3.MTH7438(new CLS206(ˋ0, 10));
                CLS1625 ـˏ4 = new CLS1625(activity0);
                ـˏ4.MTH800(CLS27.MTH889("set_timeframe"));
                ـˏ4.MTH7320(new CLS173(activity0, 28));
                CLS1623 יᐧ1 = new CLS1623(activity0);
                CLS1635 ﾞᵎ4 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ4.MTH800(CLS27.MTH889("autolike_enable"));
                ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("auto_like_enable", false));
                ﾞᵎ4.MTH7438(new CLS206(ˋ0, 11));
                יᐧ1.MTH7296(ﾞᵎ4);
                CLS1635 ﾞᵎ5 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ5.MTH800(CLS27.MTH889("like_only_once_per_day_enable"));
                ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("like_only_once_per_day_enable", false));
                ﾞᵎ5.MTH7438(new CLS206(ˋ0, 7));
                CLS1622 ˑٴ2 = CLS182.MTH3486(יᐧ1, ﾞᵎ5, activity0);
                ˑٴ2.MTH800(CLS27.MTH889("like_only_limited_per_day_max"));
                ˑٴ2.MTH7277(String.valueOf(ˎᵢ0.MTH927(1, "like_only_limited_per_day_max")));
                ˑٴ2.MTH7278(2);
                ˑٴ2.FLD5252 = new CLS1188(ˋ0, 9);
                יᐧ1.MTH7296(ˑٴ2);
                CLS1635 ﾞᵎ6 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ6.MTH800(CLS27.MTH889("like_only_on_already_liked"));
                ﾞᵎ6.MTH7437(ˎᵢ0.MTH938("like_only_on_already_liked", false));
                ﾞᵎ6.MTH7438(new CLS206(ˋ0, 8));
                יᐧ1.MTH7296(ﾞᵎ6);
                int v = ˋ0.FLD1995;
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
                if(ˎᵢ0.MTH938("like_only_enable", false)) {
                    ـˏ1.MTH801(0);
                    ـˏ2.MTH801(8);
                }
                else {
                    ـˏ2.MTH801(0);
                    ـˏ1.MTH801(8);
                }
                CLS1623 יᐧ2 = new CLS1623(activity0);
                יᐧ2.MTH7289(new Object[]{ﾞᵎ1, ـˏ1, ـˏ2});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
                CLS1623 יᐧ3 = new CLS1623(activity0);
                יᐧ3.MTH7296(ﾞᵎ3);
                יᐧ3.MTH7296(ـˏ4);
                יᐧ3.MTH7296(ˎᵢ1);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
                CLS1623 יᐧ4 = new CLS1623(activity0);
                יᐧ4.MTH7289(new Object[]{ﾞᵎ2, ـˏ3, ˑٴ1});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v);
                return;
            }
            case 1: {
                CLS1635 ﾞᵎ7 = ((CLS219)ˋ0).MTH3879(z1, z);
                String s4 = CLS34.MTH1065(4100806316492903221L, ﾞᵎ7, 4100806389507347253L);
                ﾞᵎ7.MTH7437(ˋ0.FLD2151.MTH938(s4, false));
                ﾞᵎ7.MTH7438(new CLS206(ˋ0, 1));
                CLS1635 ﾞᵎ8 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ8.MTH800(CLS27.MTH889("fake_comments_enable"));
                ﾞᵎ8.MTH7437(ˋ0.FLD2151.MTH938("fake_comments_enable", false));
                ﾞᵎ8.MTH7438(new CLS206(ˋ0, 2));
                CLS1623 יᐧ5 = new CLS1623(activity0);
                יᐧ5.MTH798(CLS27.MTH889("fake_like_comments_desc"));
                יᐧ5.MTH7289(new Object[]{ﾞᵎ7, ﾞᵎ8});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), ˋ0.FLD1995);
                CLS1635 ﾞᵎ9 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ9.MTH800(CLS27.MTH889("selflikes_use_nonfriends"));
                ﾞᵎ9.MTH7437(ˋ0.FLD2151.MTH938("fakelikes_use_all_contacts", false));
                ﾞᵎ9.MTH7438(new CLS206(ˋ0, 3));
                CLS1635 ﾞᵎ10 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ10.MTH800(CLS27.MTH889("random_sort"));
                ﾞᵎ10.MTH7437(ˋ0.FLD2151.MTH938("fakelikes_random_sort", false));
                ﾞᵎ10.MTH7438(new CLS206(ˋ0, 4));
                CLS1635 ﾞᵎ11 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ11.MTH800(CLS27.MTH889("selflikes_autoselect_lbl"));
                ﾞᵎ11.MTH7437(ˋ0.FLD2151.MTH938("selflikes_autoselect_enable", false));
                ﾞᵎ11.MTH7438(new CLS206(ˋ0, 5));
                CLS1622 ˑٴ3 = new CLS1622(activity0);
                ˑٴ3.MTH7278(2);
                ˑٴ3.MTH7277(String.valueOf(ˋ0.FLD2151.MTH927(50, "fakelikes_autoselect_cnt")));
                ˑٴ3.FLD5252 = new CLS1188(ˋ0, 5);
                CLS1625 ـˏ5 = new CLS1625(activity0);
                ـˏ5.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ5.MTH7320(new CLS190(ˋ0, activity0, 4));
                CLS1623 יᐧ6 = new CLS1623(activity0);
                יᐧ6.MTH7289(new Object[]{ﾞᵎ9, ﾞᵎ10, ﾞᵎ11, ˑٴ3, ـˏ5});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), ˋ0.FLD1995);
                CLS1622 ˑٴ4 = new CLS1622(activity0);
                ˑٴ4.MTH800(CLS27.MTH889("self_like_enable") + CLS27.MTH889("custom_label"));
                String s5 = CLS27.MTH889("sns_selflike");
                ˑٴ4.MTH7277(ˋ0.FLD2151.MTH925("sns_fakelike", s5));
                ˑٴ4.FLD5252 = new CLS1188(ˋ0, 6);
                CLS1622 ˑٴ5 = new CLS1622(activity0);
                ˑٴ5.MTH800(CLS27.MTH889("fake_comments_enable") + CLS27.MTH889("custom_label"));
                String s6 = CLS27.MTH889("sns_fake_comments");
                ˑٴ5.MTH7277(ˋ0.FLD2151.MTH925("sns_fakecomments", s6));
                ˑٴ5.FLD5252 = new CLS1188(ˋ0, 7);
                CLS1623 יᐧ7 = new CLS1623(activity0);
                יᐧ7.MTH7289(new Object[]{ˑٴ4, ˑٴ5});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ7), ˋ0.FLD1995);
                CLS1625 ـˏ6 = ((CLS219)ˋ0).MTH3877(z1, z);
                ـˏ6.MTH800(CLS27.MTH889("clearFakeLikes"));
                ـˏ6.MTH7320(new CLS267(13));
                CLS1625 ـˏ7 = ((CLS219)ˋ0).MTH3877(z1, z);
                ـˏ7.MTH800(CLS27.MTH889("clearFakeComments"));
                ـˏ7.MTH7320(new CLS267(12));
                CLS1623 יᐧ8 = new CLS1623(activity0);
                יᐧ8.MTH7289(new Object[]{ـˏ6, ـˏ7});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ8), ˋ0.FLD1995);
                return;
            }
            case 2: {
                ˋ0.getClass();
                CLS1625 ـˏ8 = new CLS1625(activity0);
                ـˏ8.MTH800(CLS27.MTH889("auto_comment_only_list"));
                ـˏ8.MTH7320(new CLS190(ˋ0, activity0, 7));
                CLS1625 ـˏ9 = new CLS1625(activity0);
                ـˏ9.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ9.MTH7320(new CLS190(ˋ0, activity0, 8));
                CLS1635 ﾞᵎ12 = ((CLS219)ˋ0).MTH3879(z1, z);
                String s7 = CLS34.MTH1065(4100778347665871669L, ﾞᵎ12, 4100778407795413813L);
                CLS29 ˎᵢ2 = ˋ0.FLD2151;
                ﾞᵎ12.MTH7437(ˎᵢ2.MTH938(s7, false));
                ﾞᵎ12.MTH7438(new CLS221(ˋ0, ـˏ8, ـˏ9, 1));
                CLS1625 ـˏ10 = new CLS1625(activity0);
                ـˏ10.MTH800(CLS27.MTH889("config_auto_comment"));
                ـˏ10.MTH7320(new CLS218(ˋ0, 1));
                CLS1622 ˑٴ6 = new CLS1622(activity0);
                CLS1625 ـˏ11 = new CLS1625(activity0);
                ـˏ11.MTH800(CLS27.MTH889("add_new_keyword"));
                ـˏ11.MTH7320(new CLS196(ˋ0, activity0, ˑٴ6, 3));
                ˑٴ6.MTH800(CLS27.MTH889("keyword"));
                ˑٴ6.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
                String s8 = ˎᵢ2.MTH925("auto_comment_allowed_filter", "");
                if(!TextUtils.isEmpty(s8)) {
                    ˑٴ6.MTH7277(s8);
                }
                ˑٴ6.FLD5252 = new CLS1188(ˋ0, 14);
                CLS1635 ﾞᵎ13 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ13.MTH800(CLS27.MTH889("auto_comment_allowed_filter_enable"));
                ﾞᵎ13.MTH7437(ˎᵢ2.MTH938("auto_comment_allowed_filter_enable", false));
                ﾞᵎ13.MTH7438(new CLS206(ˋ0, 15));
                CLS1635 ﾞᵎ14 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ14.MTH800(CLS27.MTH889("auto_comment_robot"));
                ﾞᵎ14.MTH7437(ˎᵢ2.MTH938("auto_comment_robot", false));
                ﾞᵎ14.MTH7438(new CLS276(ˋ0, ـˏ10, 8));
                CLS1625 ـˏ12 = new CLS1625(activity0);
                ـˏ12.MTH800(CLS27.MTH889("config_robot"));
                ـˏ12.MTH7320(new CLS190(ˋ0, activity0, 9));
                CLS1635 ﾞᵎ15 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ15.MTH800(CLS27.MTH889("auto_comment_timeframe_enable"));
                ﾞᵎ15.MTH7437(ˎᵢ2.MTH938("auto_comment_timeframe_enable", false));
                ﾞᵎ15.MTH7438(new CLS206(ˋ0, 16));
                CLS1625 ـˏ13 = new CLS1625(activity0);
                ـˏ13.MTH800(CLS27.MTH889("set_timeframe"));
                ـˏ13.MTH7320(new CLS413(activity0, 1));
                CLS1621 ˎᵢ3 = new CLS1621(activity0);
                ˎᵢ3.MTH800(CLS27.MTH889("delay"));
                ˎᵢ3.MTH7268(((long)ˎᵢ2.MTH927(1500, "auto_comment_delay")));
                ˎᵢ3.FLD5242 = new CLS1188(ˋ0, 12);
                CLS1623 יᐧ9 = new CLS1623(activity0);
                CLS1635 ﾞᵎ16 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ16.MTH800(CLS27.MTH889("autocomment"));
                ﾞᵎ16.MTH7437(ˎᵢ2.MTH938("auto_comment_enable", false));
                ﾞᵎ16.MTH7438(new CLS206(ˋ0, 12));
                יᐧ9.MTH7296(ﾞᵎ16);
                CLS1635 ﾞᵎ17 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ17.MTH800(CLS27.MTH889("comment_only_once_per_day_enable"));
                ﾞᵎ17.MTH7437(ˎᵢ2.MTH938("comment_only_once_per_day_enable", false));
                ﾞᵎ17.MTH7438(new CLS206(ˋ0, 13));
                CLS1622 ˑٴ7 = CLS182.MTH3486(יᐧ9, ﾞᵎ17, activity0);
                ˑٴ7.MTH800(CLS27.MTH889("comment_only_limited_per_day_max"));
                ˑٴ7.MTH7277(String.valueOf(ˎᵢ2.MTH927(1, "comment_only_limited_per_day_max")));
                ˑٴ7.MTH7278(2);
                ˑٴ7.FLD5252 = new CLS1188(ˋ0, 13);
                יᐧ9.MTH7296(ˑٴ7);
                CLS1635 ﾞᵎ18 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ18.MTH800(CLS27.MTH889("comment_only_on_already_commented"));
                ﾞᵎ18.MTH7437(ˎᵢ2.MTH938("comment_only_on_already_commented", false));
                ﾞᵎ18.MTH7438(new CLS206(ˋ0, 14));
                יᐧ9.MTH7296(ﾞᵎ18);
                int v1 = ˋ0.FLD1995;
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ9), v1);
                if(ˎᵢ2.MTH938("auto_comment_only_enable", false)) {
                    ـˏ8.MTH801(0);
                    ـˏ9.MTH801(8);
                }
                else {
                    ـˏ9.MTH801(0);
                    ـˏ8.MTH801(8);
                }
                CLS1623 יᐧ10 = new CLS1623(activity0);
                יᐧ10.MTH7289(new Object[]{ﾞᵎ12, ـˏ8, ـˏ9});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ10), v1);
                CLS1623 יᐧ11 = new CLS1623(activity0);
                if(ˋ0.FLD2153.MTH6895("auto_comment_robot")) {
                    if(ˎᵢ2.MTH938("auto_comment_robot", false)) {
                        ـˏ10.MTH801(8);
                    }
                    else {
                        ـˏ10.MTH801(0);
                    }
                    יᐧ11.MTH7296(ﾞᵎ14);
                    יᐧ11.MTH7296(ـˏ12);
                }
                יᐧ11.MTH7296(ـˏ10);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ11), v1);
                CLS1623 יᐧ12 = new CLS1623(activity0);
                יᐧ12.MTH7296(ﾞᵎ15);
                יᐧ12.MTH7296(ـˏ13);
                יᐧ12.MTH7296(ˎᵢ3);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ12), v1);
                CLS1623 יᐧ13 = new CLS1623(activity0);
                יᐧ13.MTH7289(new Object[]{ﾞᵎ13, ـˏ11, ˑٴ6});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ13), v1);
                return;
            }
            case 3: {
                CLS1635 ﾞᵎ19 = ((CLS219)ˋ0).MTH3879(z1, z);
                String s9 = CLS34.MTH1065(4100801755237634869L, ﾞᵎ19, 4100801299971101493L);
                ﾞᵎ19.MTH7437(ˋ0.FLD2151.MTH938(s9, false));
                ﾞᵎ19.MTH7438(new CLS266(ˋ0, 24));
                CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ19), true);
                CLS1635 ﾞᵎ20 = ((CLS219)ˋ0).MTH3879(z1, z);
                CLS182.MTH3488(4100801390165414709L, ﾞᵎ20, 0x38E8F9CF2B3CD335L, ˋ0.FLD2151, false, ˋ0, 25);
                CLS1635 ﾞᵎ21 = ((CLS219)ˋ0).MTH3879(z1, z);
                CLS182.MTH3488(4100802253453841205L, ﾞᵎ21, 4100801875496719157L, ˋ0.FLD2151, false, ˋ0, 26);
                CLS1635 ﾞᵎ22 = ((CLS219)ˋ0).MTH3879(z1, z);
                CLS182.MTH3488(4100801987165868853L, ﾞᵎ22, 4100780684128080693L, ˋ0.FLD2151, false, ˋ0, 27);
                CLS1635 ﾞᵎ23 = ((CLS219)ˋ0).MTH3879(z1, z);
                CLS182.MTH3488(4100780821567034165L, ﾞᵎ23, 4100780400660239157L, ˋ0.FLD2151, false, ˋ0, 28);
                CLS1635 ﾞᵎ24 = ((CLS219)ˋ0).MTH3879(z1, z);
                CLS182.MTH3488(4100780529509258037L, ﾞᵎ24, 4100781229588927285L, ˋ0.FLD2151, false, ˋ0, 29);
                CLS1635 ﾞᵎ25 = ((CLS219)ˋ0).MTH3879(z1, z);
                ﾞᵎ25.MTH800(CLS27.MTH889("enable_blocking_moments_ads"));
                ﾞᵎ25.MTH7437(ˋ0.FLD2151.MTH938("enable_block_snsad", false));
                ﾞᵎ25.MTH7438(new CLS206(ˋ0, 0));
                CLS1623 יᐧ14 = new CLS1623(activity0);
                יᐧ14.MTH7289(new Object[]{ﾞᵎ20, ﾞᵎ21, ﾞᵎ22, ﾞᵎ23, ﾞᵎ24, ﾞᵎ25});
                int v2 = ˋ0.FLD1995;
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ14), v2);
                CLS1625 ـˏ14 = new CLS1625(activity0);
                ـˏ14.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ14.MTH7320(new CLS190(ˋ0, activity0, 3));
                CLS1625 ـˏ15 = ((CLS219)ˋ0).MTH3877(z1, z);
                ـˏ15.MTH800(CLS27.MTH889("do_filter"));
                ـˏ15.MTH7320(new CLS267(11));
                CLS1623 יᐧ15 = new CLS1623(activity0);
                יᐧ15.MTH7289(new Object[]{ـˏ14, ـˏ15});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ15), v2);
                CLS1622 ˑٴ8 = new CLS1622(activity0);
                CLS1625 ـˏ16 = new CLS1625(activity0);
                ـˏ16.MTH800(CLS27.MTH889("add_new_keyword"));
                ـˏ16.MTH7320(new CLS196(ˋ0, activity0, ˑٴ8, 0));
                ˑٴ8.MTH800(CLS27.MTH889("keyword"));
                ˑٴ8.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
                String s10 = ˋ0.FLD2151.MTH925("moment_filter", "");
                if(!TextUtils.isEmpty(s10)) {
                    ˑٴ8.MTH7277(s10);
                }
                ˑٴ8.FLD5252 = new CLS1188(ˋ0, 4);
                CLS1623 יᐧ16 = new CLS1623(activity0);
                יᐧ16.MTH7289(new Object[]{ـˏ16, ˑٴ8});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ16), v2);
                return;
            }
            default: {
                ˋ0.getClass();
                CLS1625 ـˏ0 = new CLS1625(activity0);
                CLS1622 ˑٴ0 = new CLS1622(activity0);
                CLS1635 ﾞᵎ0 = ((CLS219)ˋ0).MTH3879(z1, z);
                String s = CLS34.MTH1065(4100800178984637237L, ﾞᵎ0, 4100800316423590709L);
                ﾞᵎ0.MTH7437(ˋ0.FLD2151.MTH938(s, false));
                ﾞᵎ0.MTH7438(new CLS206(ˋ0, 6));
                ـˏ0.MTH800(CLS27.MTH889("add_new_keyword"));
                ـˏ0.MTH7320(new CLS196(ˋ0, activity0, ˑٴ0, 1));
                ˑٴ0.MTH800(CLS27.MTH889("keyword"));
                ˑٴ0.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
                String s1 = ˋ0.FLD2151.MTH925("auto_comment_like_filter", "");
                if(!TextUtils.isEmpty(s1)) {
                    ˑٴ0.MTH7277(s1);
                }
                ˑٴ0.FLD5252 = new CLS1188(ˋ0, 8);
                CLS1623 יᐧ0 = new CLS1623(activity0);
                יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ـˏ0, ˑٴ0});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), ˋ0.FLD1995);
            }
        }
    }
}

