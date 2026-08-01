// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˑٴ.CLS755;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS1173 extends CLS219 {
    public final CLS485 FLD2716;
    public final CLS371 FLD2717;
    public CLS1635 FLD2718;
    public CLS1626 FLD2719;
    public CLS1635 FLD2720;
    public String FLD2721;
    public final ArrayList FLD2722;
    public JSONObject FLD2723;
    public CLS1635 FLD2724;

    public CLS1173(String s, String s1) {
        super(s, s1);
        this.FLD2717 = CLS371.FLD3470;
        this.FLD2716 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
        this.FLD2722 = new ArrayList();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD2722.clear();
        CLS989 ˊˆ0 = new CLS989(this, 1);
        CLS40.FLD157.MTH1124(((CLS39)ˊˆ0));
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS989(this, 0);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 10);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    public static boolean MTH4443() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public final void MTH4444(String s, String s1) {
        public final class CLS1166 implements CLS11 {
            public final String FLD2696;
            public final CLS1635 FLD2697;
            public final CLS1635 FLD2698;
            public final CLS1635 FLD2699;
            public final CLS1635 FLD2700;
            public final CLS1173 FLD2701;

            public CLS1166(String s, CLS1635 ﾞᵎ0, CLS1635 ﾞᵎ1, CLS1635 ﾞᵎ2, CLS1635 ﾞᵎ3) {
                this.FLD2696 = s;
                this.FLD2699 = ﾞᵎ0;
                this.FLD2698 = ﾞᵎ1;
                this.FLD2700 = ﾞᵎ2;
                this.FLD2697 = ﾞᵎ3;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = this.FLD2696;
                if(!s.equals("general")) {
                    CLS1173 ᵢᵢ0 = CLS1173.this;
                    String s1 = ᵢᵢ0.FLD2151.MTH925("custom_videocall_ringtone_list", "");
                    HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s1)));
                    if(!this.FLD2699.MTH7444() && !this.FLD2698.MTH7444() && !this.FLD2700.MTH7444() && !this.FLD2697.MTH7444()) {
                        hashSet0.remove(s);
                    }
                    else if(!CLS502.MTH6934(s1, new String[]{s})) {
                        hashSet0.add(s);
                    }
                    String s2 = TextUtils.join(",", hashSet0);
                    ᵢᵢ0.FLD2151.MTH922(s2, "custom_videocall_ringtone_list");
                }
            }
        }

        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        CLS1635 ﾞᵎ1 = new CLS1635(activity0);
        CLS1635 ﾞᵎ2 = new CLS1635(activity0);
        CLS1635 ﾞᵎ3 = new CLS1635(activity0);
        CLS523.MTH7133(activity0, s1, ((CLS379)new CLS1181(this, activity0, ﾞᵎ0, s, ﾞᵎ1, ﾞᵎ2, ﾞᵎ3)), null, ((CLS11)new CLS1166(this, s, ﾞᵎ0, ﾞᵎ1, ﾞᵎ2, ﾞᵎ3)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        int v = CLS523.MTH7137(10);
        CLS1623 יᐧ0 = new CLS1623(((CLS219)this).MTH3883());
        CLS1626 ـﹳ0 = ((CLS219)this).MTH3881(z1, z2);
        ـﹳ0.MTH800(CLS27.MTH889("replace_wechat_notification"));
        ـﹳ0.MTH7324(new CLS175(this, 0));
        יᐧ0.MTH7296(ـﹳ0);
        CLS1626 ـﹳ1 = ((CLS219)this).MTH3881(z1, z2);
        ـﹳ1.MTH800(CLS27.MTH889("customize_recall_notification"));
        ـﹳ1.MTH7324(new CLS175(this, 1));
        יᐧ0.MTH7296(ـﹳ1);
        CLS1626 ـﹳ2 = ((CLS219)this).MTH3881(z1, z2);
        ـﹳ2.MTH800(CLS27.MTH889("customize_comment_recall_notification"));
        ـﹳ2.MTH7324(new CLS175(this, 2));
        יᐧ0.MTH7296(ـﹳ2);
        CLS1626 ـﹳ3 = ((CLS219)this).MTH3881(z1, z2);
        ـﹳ3.MTH800(CLS27.MTH889("customize_new_comment_notification"));
        ـﹳ3.MTH7324(new CLS175(this, 3));
        יᐧ0.MTH7296(ـﹳ3);
        CLS1626 ـﹳ4 = ((CLS219)this).MTH3881(z1, z2);
        ـﹳ4.MTH800(CLS27.MTH889("personal_notification"));
        ـﹳ4.MTH7324(new CLS175(this, 4));
        יᐧ0.MTH7296(ـﹳ4);
        CLS1626 ـﹳ5 = ((CLS219)this).MTH3881(z1, z2);
        ـﹳ5.MTH800(CLS27.MTH889("moments_notification"));
        ـﹳ5.MTH7324(new CLS175(this, 5));
        יᐧ0.MTH7296(ـﹳ5);
        CLS500 ᵢﹶ0 = this.FLD2153;
        if(ᵢﹶ0.MTH6895("keyword_notification")) {
            CLS1626 ـﹳ6 = ((CLS219)this).MTH3881(z1, z2);
            ـﹳ6.MTH800(CLS27.MTH889("keyword_notification"));
            ـﹳ6.MTH7324(new CLS175(this, 6));
            יᐧ0.MTH7296(ـﹳ6);
        }
        if(ᵢﹶ0.MTH6895("sns_keyword_notification") && (this.FLD2151.MTH938("timeline_sync_enable", false) && this.FLD2151.MTH938("sns_sync_enable", false) || this.FLD2151.MTH938("moments_forward_enable", CLS412.MTH6002()))) {
            CLS1626 ـﹳ7 = ((CLS219)this).MTH3881(z1, z2);
            ـﹳ7.MTH800(CLS27.MTH889("sns_keyword_notification"));
            ـﹳ7.MTH7324(new CLS175(this, 7));
            יᐧ0.MTH7296(ـﹳ7);
        }
        CLS1626 ـﹳ8 = ((CLS219)this).MTH3881(z1, z2);
        ـﹳ8.MTH800(CLS27.MTH889("custom_videocall"));
        ـﹳ8.MTH7324(new CLS175(this, 8));
        if(!CLS412.MTH6002() && CLS27.MTH890("phonering")) {
            יᐧ0.MTH7296(ـﹳ8);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
    }

    public final void MTH4446(String s, String s1) {
        public final class CLS1167 implements CLS2 {
            public final String FLD2702;
            public final CLS1173 FLD2703;

            public CLS1167(String s) {
                this.FLD2702 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1173.this.FLD2151.MTH922(s, this.FLD2702 + "_keyword_excl");
            }
        }


        public final class CLS1168 implements CLS2 {
            public final String FLD2704;
            public final CLS1173 FLD2705;

            public CLS1168(String s) {
                this.FLD2704 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1173.this.FLD2151.MTH922(s, this.FLD2704);
            }
        }


        public final class CLS1169 implements CLS11 {
            public final String FLD2706;
            public final Activity FLD2707;
            public final CLS1635 FLD2708;
            public final CLS1173 FLD2709;

            public CLS1169(String s, CLS1635 ﾞᵎ0, Activity activity0) {
                this.FLD2706 = s;
                this.FLD2708 = ﾞᵎ0;
                this.FLD2707 = activity0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = this.FLD2706;
                CLS1173 ᵢᵢ0 = CLS1173.this;
                if(s.startsWith("notif")) {
                    String s1 = ᵢᵢ0.FLD2151.MTH925("personal_notif_list", "");
                    HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s1)));
                    String s2 = s.substring(s.indexOf("_") + 1).trim();
                    if(!this.FLD2708.MTH7444()) {
                        hashSet0.remove(s2);
                    }
                    else if(!CLS502.MTH6934(s1, new String[]{s2})) {
                        hashSet0.add(s2);
                    }
                    String s3 = TextUtils.join(",", hashSet0);
                    ᵢᵢ0.FLD2151.MTH922(s3, "personal_notif_list");
                }
                if(CLS34.MTH1078(0x38E80FE72B3CD335L, s, ᵢᵢ0.FLD2151, false)) {
                    CLS485 ᐧﾞ0 = ᵢᵢ0.FLD2716;
                    ᐧﾞ0.getClass();
                    Activity activity0 = this.FLD2707;
                    CLS485.MTH6726(activity0, s);
                    if(CLS502.MTH6943(s, new String[]{"custom"})) {
                        ᐧﾞ0.getClass();
                        CLS485.MTH6726(activity0, s + "_chatroom");
                    }
                }
            }
        }


        public final class CLS1170 implements CLS2 {
            public final String FLD2710;
            public final CLS1173 FLD2711;

            public CLS1170(String s) {
                this.FLD2710 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1173.this.FLD2151.MTH922(s, this.FLD2710);
            }
        }


        public final class CLS1171 implements CLS2 {
            public final String FLD2712;
            public final CLS1173 FLD2713;

            public CLS1171(String s) {
                this.FLD2712 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1173.this.FLD2151.MTH922(s, this.FLD2712 + "_notif_excl");
            }
        }


        public final class CLS1172 implements CLS2 {
            public final String FLD2714;
            public final CLS1173 FLD2715;

            public CLS1172(String s) {
                this.FLD2714 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1173.this.FLD2151.MTH922(s, this.FLD2714 + "_notif_excl");
            }
        }

        this.FLD2721 = s;
        Activity activity0 = ((CLS219)this).MTH3883();
        int v = CLS523.MTH7137(10);
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        CLS523.MTH7133(activity0, s1, ((CLS379)new CLS755(this, s, activity0, ﾞᵎ0, v)), null, ((CLS11)new CLS1169(this, s, ﾞᵎ0, activity0)));
    }

    // 此方法包含解密的字符串
    public final void MTH4447(int v, String s) {
        Activity activity0 = ((CLS219)this).MTH3883();
        String s1 = CLS182.MTH3475(0x38E9FC002B3CD335L, CLS182.MTH3483(s));
        String s2 = this.FLD2151.MTH925(s1, "");
        Uri uri0 = TextUtils.isEmpty(s2) ? RingtoneManager.getActualDefaultRingtoneUri(activity0, v) : Uri.parse(s2);
        Intent intent0 = new Intent("android.intent.action.RINGTONE_PICKER");
        intent0.putExtra("android.intent.extra.ringtone.TYPE", v);
        intent0.putExtra("android.intent.extra.ringtone.TITLE", CLS27.MTH889("ringtone_selection"));
        intent0.putExtra("android.intent.extra.ringtone.EXISTING_URI", uri0);
        intent0.putExtra("android.intent.extra.ringtone.SHOW_SILENT", false);
        intent0.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        activity0.startActivityForResult(intent0, 4000);
    }

    // 此方法包含解密的字符串
    public final void MTH4448(String s) {
        this.MTH4446(CLS182.MTH3484(4101088659053007669L, new StringBuilder(), s), CLS27.MTH889("personal_notification"));
    }
}

