// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.LinearLayout;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS10;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS34;
import d.ˑʽ.CLS36;
import d.ˑʽ.CLS38;
import d.ˑʽ.CLS45;
import d.ˑʽ.CLS46;
import d.ˑʽ.CLS53;
import d.ˑʽ.CLS7;
import d.יʻ.CLS173;
import d.יʻ.CLS61;
import d.יʻ.CLS63;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS177;
import d.ٴˑ.CLS180;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ٴˑ.CLS190;
import d.ٴˑ.CLS74;
import d.ᐧי.CLS110;
import d.ᵎʻ.CLS118;
import d.ᵎʻ.CLS210;
import d.ⁱٴ.CLS120;
import d.ⁱٴ.CLS125;
import java.io.File;
import java.util.LinkedHashMap;

public final class CLS194 extends CLS101 {
    public CLS188 FLD576;
    public CLS188 FLD577;

    public CLS194(String s, String s1) {
        super(s, s1);
    }

    // 此方法包含解密的字符串
    public final void MTH1039() {
        String s = CLS69.MTH806("cloud");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                String[] arr_s1 = arr_s[v].split(",");
                linkedHashMap0.put(arr_s1[0], arr_s1[1]);
            }
        }
        Activity activity0 = ((CLS101)this).MTH1053();
        CLS110 ٴˑ0 = new CLS110(activity0, linkedHashMap0.keySet());
        CLS45.MTH656(false, activity0, s, linkedHashMap0, true, ((CLS120)new CLS195(activity0, 0)), ٴˑ0);
    }

    // 此方法包含解密的字符串
    public final void MTH1040() {
        String s = CLS1.MTH369();
        String s1 = CLS7.FLD41.MTH413();
        if(!TextUtils.isEmpty(s1) && !s.equals(s1)) {
            StringBuilder stringBuilder0 = CLS71.MTH830(s);
            stringBuilder0.append(" (");
            stringBuilder0.append(s1);
            stringBuilder0.append(")");
            s = stringBuilder0.toString();
        }
        this.FLD576.MTH1181(s);
    }

    @Override  // d.ᐧˈ.CLS101
    public final void MTH1054(boolean z, boolean z1, String s) {
        if(z1) {
            this.FLD580.clear();
        }
        CLS10 ʻﹶ0 = new CLS10(((CLS101)this).MTH1053(), this.FLD584);
        ʻﹶ0.FLD44 = new CLS201(((CLS101)this), z, z1, 0);
        ʻﹶ0.FLD52 = new CLS210(this, 3);
        ʻﹶ0.FLD48 = true;
        ʻﹶ0.FLD43 = new CLS206(0);
        ʻﹶ0.show();
        CLS46.FLD233.MTH672();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS101)this).MTH1058(s);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1042() {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        String s = CLS69.MTH806("qq_groups");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split(";");
            for(int v = 0; v < arr_s.length; v = CLS71.MTH828(arr_s1[1], linkedHashMap0, arr_s1[0].trim(), v, 1)) {
                String[] arr_s1 = arr_s[v].split(",");
            }
        }
        Activity activity0 = ((CLS101)this).MTH1053();
        CLS110 ٴˑ0 = new CLS110(activity0, linkedHashMap0.keySet());
        CLS45.MTH656(false, activity0, null, linkedHashMap0, true, ((CLS120)new CLS195(activity0, 3)), ٴˑ0);
    }

    // 此方法包含解密的字符串
    @Override  // d.ᐧˈ.CLS101
    public final void MTH1056(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        boolean z16;
        boolean z14;
        boolean z11;
        boolean z8;
        boolean z5;
        String s = CLS69.MTH806("cloud");
        Activity activity0 = ((CLS101)this).MTH1053();
        CLS182 ˆᐧ0 = new CLS182(activity0);
        CLS177 ʻﹶ0 = ((CLS101)this).MTH1052(z1, z2);
        ʻﹶ0.MTH1181(CLS69.MTH795("autoupdate"));
        CLS61 ˉᵢ0 = this.FLD585;
        ʻﹶ0.MTH854(ˉᵢ0.MTH748("autoupdate_enable", false));
        ʻﹶ0.MTH851(new CLS105(this, 0));
        ˆᐧ0.MTH907(((CLS125)ʻﹶ0));
        Class class0 = CLS36.class;
        if(CLS1.FLD29 == -1) {
            CLS1.FLD29 = 0;
            CLS36 יʻ0 = (CLS36)CLS68.FLD326.MTH786(class0);
            boolean z3 = יʻ0.FLD191.containsKey("isLsposed");
            ContentValues contentValues0 = יʻ0.FLD191;
            if(z3) {
                boolean z4 = contentValues0.getAsBoolean("isLsposed").booleanValue();
                CLS1.FLD29 = z4;
                z5 = z4;
            }
            else {
                if(contentValues0.containsKey("trace")) {
                    String s1 = contentValues0.getAsString("trace");
                    CLS1.FLD29 = s1.contains("io.github.lsposed.lspd") || s1.contains("LspHooker") || s1.contains("LSPHooker") || s1.contains("org.lsposed.lspd") ? 1 : 0;
                }
                z5 = CLS1.FLD29 == 1;
            }
        }
        else {
            z5 = CLS1.FLD29 == 1;
        }
        if(!z5) {
            if(CLS1.FLD30 == -1) {
                CLS1.FLD30 = 0;
                CLS36 יʻ1 = (CLS36)CLS68.FLD326.MTH786(class0);
                boolean z6 = יʻ1.FLD191.containsKey("isEdxp");
                ContentValues contentValues1 = יʻ1.FLD191;
                if(z6) {
                    boolean z7 = contentValues1.getAsBoolean("isEdxp").booleanValue();
                    CLS1.FLD30 = z7;
                    z8 = z7;
                }
                else {
                    if(contentValues1.containsKey("trace")) {
                        CLS1.FLD30 = contentValues1.getAsString("trace").contains("com.elderdrivers.riru.edxp");
                    }
                    z8 = CLS1.FLD30 == 1;
                }
            }
            else {
                z8 = CLS1.FLD30 == 1;
            }
            if(!z8) {
                if(CLS1.FLD31 == -1) {
                    CLS1.FLD31 = 0;
                    CLS36 יʻ2 = (CLS36)CLS68.FLD326.MTH786(class0);
                    boolean z9 = יʻ2.FLD191.containsKey("isXposed");
                    ContentValues contentValues2 = יʻ2.FLD191;
                    if(z9) {
                        boolean z10 = contentValues2.getAsBoolean("isXposed").booleanValue();
                        CLS1.FLD31 = z10;
                        z11 = z10;
                    }
                    else {
                        if(contentValues2.containsKey("trace")) {
                            CLS1.FLD31 = contentValues2.getAsString("trace").contains("de.robv.android.xposed.XposedBridge");
                        }
                        z11 = CLS1.FLD31 == 1;
                    }
                }
                else {
                    z11 = CLS1.FLD31 == 1;
                }
                if(!z11) {
                    File file0 = new File(new File(activity0.getFilesDir(), "X"), "logFile.log");
                    CLS177 ʻﹶ1 = ((CLS101)this).MTH1052(z1, z2);
                    ʻﹶ1.MTH1181(CLS69.MTH795("log_to_file_enable"));
                    ʻﹶ1.MTH854(ˉᵢ0.MTH748("log_to_file_enable", false));
                    ʻﹶ1.MTH851(new CLS105(this, 1));
                    ˆᐧ0.MTH907(((CLS125)ʻﹶ1));
                    if(CLS63.MTH771(file0)) {
                        CLS187 ᐧﹶ0 = ((CLS101)this).MTH1055(z1, z2);
                        ᐧﹶ0.MTH1181(CLS69.MTH795("export_log"));
                        ᐧﹶ0.MTH991(new CLS74(activity0, file0, 1));
                        ˆᐧ0.MTH907(((CLS125)ᐧﹶ0));
                    }
                }
            }
        }
        if(!CLS13.MTH430()) {
            CLS180 ʿﾞ0 = new CLS180(activity0);
            if(z) {
                ʿﾞ0.FLD384 = false;
                ʿﾞ0.FLD383 = true;
            }
            ʿﾞ0.MTH1181(CLS69.MTH795("donate_keycard_advanced"));
            ʿﾞ0.MTH1179(CLS69.MTH795("donate_keycard_advanced_desc"));
            ʿﾞ0.FLD390 = new CLS199(this, activity0, z1, z2, 0);
            ˆᐧ0.MTH907(((CLS125)ʿﾞ0));
        }
        CLS36 יʻ3 = this.FLD582;
        if(!יʻ3.MTH594("cloud")) {
            CLS188 ᴵʾ0 = ((CLS101)this).MTH1057(z1, z2);
            this.FLD577 = ᴵʾ0;
            ᴵʾ0.MTH1181(CLS69.MTH795("cloud_storage"));
            this.FLD577.MTH1000(new CLS103(this, 0));
            if(TextUtils.isEmpty(s)) {
                this.FLD577.MTH1177(8);
            }
            ˆᐧ0.MTH907(((CLS125)this.FLD577));
        }
        if(!יʻ3.MTH594("copyright")) {
            CLS38.FLD200.getClass();
            File file1 = new File(Environment.getExternalStorageDirectory(), "X");
            if(!(!CLS63.MTH771(file1) || TextUtils.isEmpty("license.txt") ? false : CLS63.MTH771(new File(file1, "license.txt")))) {
                CLS180 ʿﾞ1 = new CLS180(activity0);
                if(z) {
                    ʿﾞ1.FLD384 = false;
                    ʿﾞ1.FLD383 = true;
                }
                ʿﾞ1.MTH1181(CLS69.MTH795("contact_info"));
                ʿﾞ1.MTH1179(CLS69.MTH795("contact_info_desc"));
                ʿﾞ1.FLD390 = new CLS199(this, activity0, z1, z2, 1);
                ˆᐧ0.MTH907(((CLS125)ʿﾞ1));
                if(!TextUtils.isEmpty(CLS69.MTH806("tg_pass"))) {
                    CLS187 ᐧﹶ1 = new CLS187(activity0);
                    ᐧﹶ1.MTH1181(CLS69.MTH795("get_tg_pass"));
                    ᐧﹶ1.MTH991(new CLS106(this, activity0, 0));
                    ˆᐧ0.MTH907(((CLS125)ᐧﹶ1));
                }
            }
        }
        CLS188 ᴵʾ1 = new CLS188(activity0);
        this.FLD576 = ᴵʾ1;
        ᴵʾ1.FLD531 = false;
        ˆᐧ0.MTH907(((CLS125)ᴵʾ1));
        CLS190 ᵎᐧ0 = new CLS190(activity0);
        ᵎᐧ0.FLD562 = new CLS173(this, ᵎᐧ0, 4);
        ˆᐧ0.MTH907(((CLS125)ᵎᐧ0));
        String s2 = "";
        CLS53 ﹶᐧ0 = CLS53.FLD282;
        if(ﹶᐧ0.MTH710() || ﹶᐧ0.MTH715("extra_df")) {
            this.MTH1040();
        }
        boolean z12 = false;
        boolean z13 = ﹶᐧ0.MTH711(0);
        CLS118 ᵎʻ0 = ﹶᐧ0.FLD281;
        if(z13) {
            if(ᵎʻ0.MTH1155(0)) {
                z12 = ((Boolean)ᵎʻ0.MTH1159(0)).booleanValue();
            }
            else {
                z12 = ﹶᐧ0.MTH714(0);
                if(z12) {
                    ᵎʻ0.MTH1158(0, Boolean.TRUE);
                }
            }
        }
        if(z12) {
            StringBuilder stringBuilder0 = CLS71.MTH830("");
            stringBuilder0.append("<b>");
            stringBuilder0.append(CLS69.MTH795("multichat_autoforward"));
            stringBuilder0.append(" (");
            stringBuilder0.append(CLS69.MTH795("registered"));
            stringBuilder0.append(")</b>");
            String s3 = stringBuilder0.toString();
            long v = ﹶᐧ0.MTH713(0);
            if(v > 0L) {
                StringBuilder stringBuilder1 = CLS71.MTH830(s3);
                stringBuilder1.append(": ");
                stringBuilder1.append(CLS34.MTH572(v));
                stringBuilder1.append("<br>[<i>");
                stringBuilder1.append(CLS34.MTH573(v));
                stringBuilder1.append("]</i>");
                s3 = stringBuilder1.toString();
            }
            StringBuilder stringBuilder2 = CLS71.MTH830(s3);
            stringBuilder2.append("<br><br>");
            s2 = stringBuilder2.toString();
        }
        if(!ﹶᐧ0.MTH711(4)) {
            z14 = false;
        }
        else if(ᵎʻ0.MTH1155(4)) {
            z14 = ((Boolean)ᵎʻ0.MTH1159(4)).booleanValue();
        }
        else {
            boolean z15 = ﹶᐧ0.MTH714(4);
            if(z15) {
                ᵎʻ0.MTH1158(4, Boolean.TRUE);
            }
            z14 = z15;
        }
        if(z14) {
            StringBuilder stringBuilder3 = CLS71.MTH830(s2);
            stringBuilder3.append("<b>");
            stringBuilder3.append(CLS69.MTH795("moments_auto_forward"));
            stringBuilder3.append(" (");
            stringBuilder3.append(CLS69.MTH795("registered"));
            stringBuilder3.append(")</b>");
            String s4 = stringBuilder3.toString();
            long v1 = ﹶᐧ0.MTH713(4);
            if(v1 > 0L) {
                StringBuilder stringBuilder4 = CLS71.MTH830(s4);
                stringBuilder4.append(": ");
                stringBuilder4.append(CLS34.MTH572(v1));
                stringBuilder4.append("<br>[<i>");
                stringBuilder4.append(CLS34.MTH573(v1));
                stringBuilder4.append("]</i>");
                s4 = stringBuilder4.toString();
            }
            StringBuilder stringBuilder5 = CLS71.MTH830(s4);
            stringBuilder5.append("<br><br>");
            s2 = stringBuilder5.toString();
        }
        if(!ﹶᐧ0.MTH711(2)) {
            z16 = false;
        }
        else if(ᵎʻ0.MTH1155(2)) {
            z16 = ((Boolean)ᵎʻ0.MTH1159(2)).booleanValue();
        }
        else {
            boolean z17 = ﹶᐧ0.MTH714(2);
            if(z17) {
                ᵎʻ0.MTH1158(2, Boolean.TRUE);
            }
            z16 = z17;
        }
        if(z16) {
            StringBuilder stringBuilder6 = CLS71.MTH830(s2);
            stringBuilder6.append("<b>(");
            stringBuilder6.append(CLS69.MTH795("registered"));
            stringBuilder6.append(")</b>");
            String s5 = stringBuilder6.toString();
            long v2 = ﹶᐧ0.MTH713(2);
            if(v2 > 0L) {
                StringBuilder stringBuilder7 = CLS71.MTH830(s5);
                stringBuilder7.append(": ");
                stringBuilder7.append(CLS34.MTH572(v2));
                stringBuilder7.append("<br>[<i>");
                stringBuilder7.append(CLS34.MTH573(v2));
                stringBuilder7.append("]</i>");
                s5 = stringBuilder7.toString();
            }
            StringBuilder stringBuilder8 = CLS71.MTH830(s5);
            stringBuilder8.append("<br><br>");
            s2 = stringBuilder8.toString();
        }
        if(ﹶᐧ0.MTH714(101)) {
            StringBuilder stringBuilder9 = CLS71.MTH830(s2);
            stringBuilder9.append("<b>");
            stringBuilder9.append(CLS69.MTH795("auto_accept_chatroom_invite"));
            stringBuilder9.append(" (");
            stringBuilder9.append(CLS69.MTH795("registered"));
            stringBuilder9.append(")</b>");
            String s6 = stringBuilder9.toString();
            long v3 = ﹶᐧ0.MTH713(101);
            if(v3 > 0L) {
                StringBuilder stringBuilder10 = CLS71.MTH830(s6);
                stringBuilder10.append(": ");
                stringBuilder10.append(CLS34.MTH572(v3));
                stringBuilder10.append("<br>[<i>");
                stringBuilder10.append(CLS34.MTH573(v3));
                stringBuilder10.append("]</i>");
                s6 = stringBuilder10.toString();
            }
            StringBuilder stringBuilder11 = CLS71.MTH830(s6);
            stringBuilder11.append("<br><br>");
            s2 = stringBuilder11.toString();
        }
        if(ﹶᐧ0.MTH714(103)) {
            StringBuilder stringBuilder12 = CLS71.MTH830(s2);
            stringBuilder12.append("<b>");
            stringBuilder12.append(CLS69.MTH795("modify_message"));
            stringBuilder12.append(" (");
            stringBuilder12.append(CLS69.MTH795("registered"));
            stringBuilder12.append(")</b>");
            String s7 = stringBuilder12.toString();
            long v4 = ﹶᐧ0.MTH713(103);
            if(v4 > 0L) {
                StringBuilder stringBuilder13 = CLS71.MTH830(s7);
                stringBuilder13.append(": ");
                stringBuilder13.append(CLS34.MTH572(v4));
                stringBuilder13.append("<br>[<i>");
                stringBuilder13.append(CLS34.MTH573(v4));
                stringBuilder13.append("]</i>");
                s7 = stringBuilder13.toString();
            }
            StringBuilder stringBuilder14 = CLS71.MTH830(s7);
            stringBuilder14.append("<br><br>");
            s2 = stringBuilder14.toString();
        }
        if(ﹶᐧ0.MTH714(104)) {
            StringBuilder stringBuilder15 = CLS71.MTH830(s2);
            stringBuilder15.append("<b>");
            stringBuilder15.append(CLS69.MTH795("integrated_mode"));
            stringBuilder15.append(" (");
            stringBuilder15.append(CLS69.MTH795("registered"));
            stringBuilder15.append(")</b>");
            String s8 = stringBuilder15.toString();
            long v5 = ﹶᐧ0.MTH713(104);
            if(v5 > 0L) {
                StringBuilder stringBuilder16 = CLS71.MTH830(s8);
                stringBuilder16.append(": ");
                stringBuilder16.append(CLS34.MTH572(v5));
                stringBuilder16.append("<br>[<i>");
                stringBuilder16.append(CLS34.MTH573(v5));
                stringBuilder16.append("]</i>");
                s8 = stringBuilder16.toString();
            }
            StringBuilder stringBuilder17 = CLS71.MTH830(s8);
            stringBuilder17.append("<br><br>");
            s2 = stringBuilder17.toString();
        }
        this.FLD576.MTH1179(s2);
        CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ0), CLS45.MTH662(3));
    }
}

