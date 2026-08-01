// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS78;
import b.ˑٴ.CLS720;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;

public final class CLS899 extends CLS219 {
    public final CLS371 FLD1658;
    public final ArrayList FLD1659;
    public CLS210 FLD1660;
    public CLS1622 FLD1661;
    public final ArrayList FLD1662;
    public final ArrayList FLD1663;
    public CLS216 FLD1664;

    public CLS899(String s, String s1) {
        super(s, s1);
        this.FLD1658 = CLS371.FLD3470;
        this.FLD1659 = new ArrayList();
        this.FLD1662 = new ArrayList();
        this.FLD1663 = new ArrayList();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD1659.clear();
        this.FLD1662.clear();
        this.FLD1663.clear();
        CLS1088 ٴʿ0 = new CLS1088(this, 4);
        CLS40.FLD157.MTH1124(((CLS39)ٴʿ0));
        Activity activity0 = ((CLS219)this).MTH3883();
        this.FLD1664 = new CLS216(activity0);
        this.FLD1660 = new CLS210(activity0, this.FLD2157);
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1088(this, 2);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 4);
        ʼˎ0.FLD3519 = new CLS720(1);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3341(int v) {
        public final class CLS898 implements CLS2 {
            public final Activity FLD1654;
            public final ArrayList FLD1655;
            public final int FLD1656;
            public final CLS899 FLD1657;

            public CLS898(Activity activity0, int v, ArrayList arrayList0) {
                this.FLD1654 = activity0;
                this.FLD1656 = v;
                this.FLD1655 = arrayList0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    CLS1066 יᵎ0 = new CLS1066(this, arrayList0, s);
                    CLS523.MTH7142(this.FLD1654, ((CLS11)יᵎ0));
                }
            }
        }

        ArrayList arrayList2;
        Activity activity0 = ((CLS219)this).MTH3883();
        ArrayList arrayList0 = this.FLD1659;
        switch(v) {
            case 0: {
                ArrayList arrayList1 = new ArrayList();
                String s = this.FLD2151.MTH925("zombies", "");
                if(TextUtils.isEmpty(s)) {
                    CLS412.MTH6013(activity0, CLS27.MTH889("no_zombie"));
                    return;
                }
                for(Object object0: arrayList0) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(!CLS372.MTH5400("") && this.FLD1658.MTH5382("") && CLS502.MTH6934(s, new String[]{""})) {
                        arrayList1.add(ˊﾞ0);
                    }
                }
                if(arrayList1.isEmpty()) {
                    CLS412.MTH6013(activity0, CLS27.MTH889("no_zombie"));
                    return;
                }
                arrayList2 = arrayList1;
                break;
            }
            case 1: {
                arrayList2 = arrayList0;
                break;
            }
            default: {
                return;
            }
        }
        CLS387.MTH5585(true, activity0, arrayList2, ((CLS2)new CLS898(this, activity0, v, arrayList2)), null, -1);
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        CLS1623 יᐧ0 = new CLS1623(((CLS219)this).MTH3883());
        int v = CLS523.MTH7137(10);
        CLS500 ᵢﹶ0 = this.FLD2153;
        if(ᵢﹶ0.MTH6895("auto_friendreq") || ᵢﹶ0.MTH6895("accept_neighbor_friendreq")) {
            Activity activity0 = ((CLS219)this).MTH3883();
            CLS1617 ʻᵎ0 = new CLS1617(activity0);
            ʻᵎ0.MTH7200(z);
            ʻᵎ0.MTH800(CLS27.MTH889("add_contacts"));
            ʻᵎ0.MTH798(CLS27.MTH889("add_contacts_warn"));
            ʻᵎ0.FLD5157 = new CLS173(activity0, 10);
            ʻᵎ0.FLD5159 = new CLS949(this, activity0, z1, z2, v, 0);
            יᐧ0.MTH7296(ʻᵎ0);
        }
        int v1 = CLS523.MTH7137(10);
        Activity activity1 = ((CLS219)this).MTH3883();
        CLS1617 ʻᵎ1 = new CLS1617(activity1);
        ʻᵎ1.MTH7200(z);
        ʻᵎ1.MTH800(CLS27.MTH889("accept_friend_req2"));
        ʻᵎ1.FLD5159 = new CLS949(this, z1, z2, activity1, v1);
        יᐧ0.MTH7296(ʻᵎ1);
        int v2 = CLS523.MTH7137(10);
        Activity activity2 = ((CLS219)this).MTH3883();
        CLS1617 ʻᵎ2 = new CLS1617(activity2);
        ʻᵎ2.MTH7200(z);
        ʻᵎ2.MTH800(CLS27.MTH889("scan_zombie"));
        ʻᵎ2.FLD5159 = new CLS949(this, activity2, z1, z2, v2, 2);
        יᐧ0.MTH7296(ʻᵎ2);
        int v3 = CLS523.MTH7137(10);
        Activity activity3 = ((CLS219)this).MTH3883();
        CLS1617 ʻᵎ3 = new CLS1617(activity3);
        ʻᵎ3.MTH7200(z);
        ʻᵎ3.MTH800(CLS27.MTH889("delete_contact2"));
        ʻᵎ3.FLD5159 = new CLS949(this, activity3, z1, z2, v3, 1);
        יᐧ0.MTH7296(ʻᵎ3);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
        int v4 = CLS523.MTH7137(10);
        Activity activity4 = ((CLS219)this).MTH3883();
        CLS1623 יᐧ1 = new CLS1623(activity4);
        CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
        String s = CLS34.MTH1065(4101064143379682101L, ﾞᵎ0, 4101064199214256949L);
        boolean z3 = CLS412.MTH6002();
        CLS29 ˎᵢ0 = this.FLD2151;
        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938(s, z3));
        ﾞᵎ0.MTH7438(new CLS233(this, 0));
        יᐧ1.MTH7296(ﾞᵎ0);
        if(!CLS182.MTH3470(4101064255048831797L)) {
            CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ1.MTH800(CLS27.MTH889("fake_contacts_count_enable"));
            ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("fake_contacts_count_enable", false));
            ﾞᵎ1.MTH7438(new CLS233(this, 1));
            יᐧ1.MTH7296(ﾞᵎ1);
            CLS1622 ˑٴ0 = ((CLS219)this).MTH3880(z1, z2);
            ˑٴ0.MTH800(CLS27.MTH889("fake_contacts_count"));
            ˑٴ0.MTH7277(String.valueOf(ˎᵢ0.MTH927(0, "fake_contacts_count")));
            ˑٴ0.MTH7278(2);
            ˑٴ0.FLD5252 = new CLS1088(this, 0);
            יᐧ1.MTH7296(ˑٴ0);
        }
        if(CLS500.FLD4928.MTH6895("fake_friendreq_amount")) {
            CLS1635 ﾞᵎ2 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ2.MTH800(CLS27.MTH889("fake_friendreq_amount_enable"));
            ﾞᵎ2.MTH7437(ˎᵢ0.MTH938("fake_friendreq_amount_enable", false));
            ﾞᵎ2.MTH7438(new CLS233(this, 2));
            יᐧ1.MTH7296(ﾞᵎ2);
            CLS1622 ˑٴ1 = ((CLS219)this).MTH3880(z1, z2);
            ˑٴ1.MTH800(CLS27.MTH889("fake_friendreq_amount_number"));
            ˑٴ1.MTH7277(String.valueOf(ˎᵢ0.MTH927(0, "fake_friendreq_amount_number")));
            ˑٴ1.MTH7278(2);
            ˑٴ1.FLD5252 = new CLS1088(this, 1);
            יᐧ1.MTH7296(ˑٴ1);
        }
        if(ᵢﹶ0.MTH6895("record_showid") && !CLS182.MTH3470(4101065977330717493L)) {
            CLS1635 ﾞᵎ3 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ3.MTH800(CLS27.MTH889("record_show_id"));
            ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("record_show_id", false));
            ﾞᵎ3.MTH7438(new CLS233(this, 3));
            יᐧ1.MTH7296(ﾞᵎ3);
        }
        CLS1625 ـˏ0 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ0.MTH800(CLS27.MTH889("customize_avatars"));
        ـˏ0.MTH7320(new CLS268(this, 0));
        יᐧ1.MTH7296(ـˏ0);
        CLS1625 ـˏ1 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ1.MTH800(CLS27.MTH889("rename_contacts"));
        ـˏ1.MTH7320(new CLS232(this, activity4, 5));
        יᐧ1.MTH7296(ـˏ1);
        if(CLS27.MTH890("setMuteContactMethod") || CLS27.MTH890("setMuteContactMethod_b")) {
            CLS1625 ـˏ2 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ2.MTH800(CLS27.MTH889("mass_mute"));
            ـˏ2.MTH7320(new CLS232(this, activity4, 6));
            יᐧ1.MTH7296(ـˏ2);
            CLS1625 ـˏ3 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ3.MTH800(CLS27.MTH889("mass_unmute"));
            ـˏ3.MTH7320(new CLS232(this, activity4, 7));
            יᐧ1.MTH7296(ـˏ3);
        }
        if(!CLS182.MTH3470(4101044648523125557L)) {
            CLS1625 ـˏ4 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ4.MTH800(CLS27.MTH889("mass_set_star_contact"));
            ـˏ4.MTH7320(new CLS232(this, activity4, 0));
            יᐧ1.MTH7296(ـˏ4);
            CLS1625 ـˏ5 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ5.MTH800(CLS27.MTH889("mass_unset_star_contact"));
            ـˏ5.MTH7320(new CLS232(this, activity4, 1));
            יᐧ1.MTH7296(ـˏ5);
        }
        if(ᵢﹶ0.MTH6895("export_contacts")) {
            CLS1625 ـˏ6 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ6.MTH800(CLS27.MTH889("export_contacts"));
            ـˏ6.MTH7320(new CLS232(this, activity4, 2));
            יᐧ1.MTH7296(ـˏ6);
        }
        if(ᵢﹶ0.MTH6895("friend_request_type") || ᵢﹶ0.MTH6895("friend_request_import") || ᵢﹶ0.MTH6895("wxid_friend_req")) {
            CLS1625 ـˏ7 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ7.MTH800(CLS27.MTH889("send_friend_req"));
            ـˏ7.MTH7320(new CLS232(this, activity4, 3));
            יᐧ1.MTH7296(ـˏ7);
            CLS1625 ـˏ8 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ8.MTH800(CLS27.MTH889("send_phone_friend_req"));
            ـˏ8.MTH7320(new CLS232(this, activity4, 4));
            יᐧ1.MTH7296(ـˏ8);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v4);
    }
}

