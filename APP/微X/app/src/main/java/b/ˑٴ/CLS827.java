// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS91;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS279;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS502;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class CLS827 implements CLS39 {
    public final int FLD1261;
    public final String FLD1262;
    public final CLS818 FLD1263;

    public CLS827(CLS818 ᵎⁱ0, String s, int v) {
        this.FLD1261 = v;
        this.FLD1263 = ᵎⁱ0;
        this.FLD1262 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        String s4;
        String s = this.FLD1262;
        CLS818 ᵎⁱ0 = this.FLD1263;
        switch(this.FLD1261) {
            case 0: {
                CLS91 ᵔʾ0 = ᵎⁱ0.MTH2791().MTH1184("_FRIEND_ACCEPT_");
                if(ᵔʾ0 != null) {
                    ContentValues contentValues0 = CLS371.MTH5368(ᵎⁱ0.FLD1444.MTH5315(s));
                    if(contentValues0 == null || !ᵔʾ0.MTH1735().equals(contentValues0.getAsString("content"))) {
                        String s1 = ᵔʾ0.MTH1735();
                        ᵎⁱ0.FLD1447.MTH3016(s1, s);
                    }
                }
                return;
            }
            case 1: {
                ᵎⁱ0.getClass();
                CLS29 ˎᵢ0 = ᵎⁱ0.FLD1445;
                if(ˎᵢ0.MTH938("auto_label_new_contact_date", true)) {
                    String s2 = new SimpleDateFormat(ˎᵢ0.MTH925("auto_label_new_contact_date_format", "yyyy-MM-dd")).format(new Date(System.currentTimeMillis()));
                    CLS279.FLD2908.MTH4651(s2, s);
                }
                if(ˎᵢ0.MTH938("auto_label_existing_label", false)) {
                    String s3 = ˎᵢ0.MTH925("auto_label_existing_label_data", "");
                    if(!TextUtils.isEmpty(s3)) {
                        CLS279.FLD2908.MTH4651(s3, s);
                    }
                }
                if(ˎᵢ0.MTH938("auto_label_new_contact_chatroom", false) && ᵎⁱ0.FLD1447.FLD1438.MTH6895("auto_label_new_contact_chatroom")) {
                    CLS371 ʻ0 = ᵎⁱ0.FLD1444;
                    ʻ0.getClass();
                    Cursor cursor0 = ʻ0.MTH5307(CLS27.MTH882("q_db40"), null);
                    if(cursor0 == null) {
                        s4 = "";
                    }
                    else {
                        if(cursor0.moveToFirst()) {
                            while(true) {
                                String s5 = CLS182.MTH3472(0x38EA94082B3CD335L, cursor0);
                                if(CLS502.MTH6934(ʻ0.MTH5335(s5), new String[]{s})) {
                                    s4 = ʻ0.MTH5316(s5);
                                    goto label_36;
                                }
                                if(!cursor0.moveToNext()) {
                                    break;
                                }
                            }
                        }
                        s4 = "";
                    label_36:
                        cursor0.close();
                    }
                    if(!TextUtils.isEmpty(s4)) {
                        CLS279.FLD2908.MTH4651(s4, s);
                    }
                }
                String s6 = ˎᵢ0.MTH925("auto_label_new_contact_lbl", "");
                if(!TextUtils.isEmpty(s6)) {
                    CLS279.FLD2908.MTH4651(s6, s);
                }
                return;
            }
            case 2: {
                CLS372.MTH5408(s, ᵎⁱ0.FLD1444.MTH5311(s) + ᵎⁱ0.FLD1445.MTH925("no_confirmation_remark_ext", "#"));
                return;
            }
            case 3: {
                CLS91 ᵔʾ1 = ᵎⁱ0.MTH2791().MTH1184("_FRIEND_ACCEPT_");
                if(ᵔʾ1 != null) {
                    ContentValues contentValues1 = CLS371.MTH5368(ᵎⁱ0.FLD1444.MTH5315(s));
                    if(contentValues1 == null || !ᵔʾ1.MTH1735().equals(contentValues1.getAsString("content"))) {
                        String s7 = ᵔʾ1.MTH1735();
                        ᵎⁱ0.FLD1447.MTH3016(s7, s);
                    }
                }
                return;
            }
            case 4: {
                String s8 = "";
                ᵎⁱ0.getClass();
                CLS29 ˎᵢ1 = ᵎⁱ0.FLD1445;
                String s9 = new SimpleDateFormat(ˎᵢ1.MTH925("auto_remark_new_contact_date_format", "yyMMdd")).format(new Date(System.currentTimeMillis()));
                String s10 = CLS372.MTH5417(s);
                String s11 = ˎᵢ1.MTH925("auto_remark_new_contact_custom_text", "");
                if(ˎᵢ1.MTH938("auto_remark_new_contact_append", false)) {
                    if(ˎᵢ1.MTH938("auto_remark_new_contact_date", true)) {
                        s10 = CLS182.MTH3484(0x38EB38CD2B3CD335L, CLS182.MTH3483(s10), s9);
                    }
                    if(ˎᵢ1.MTH938("auto_remark_new_contact_custom", false) && !TextUtils.isEmpty(s11)) {
                        StringBuilder stringBuilder0 = CLS182.MTH3483(s10);
                        stringBuilder0.append("_");
                        stringBuilder0.append(s11);
                        s10 = stringBuilder0.toString();
                    }
                }
                else {
                    if(ˎᵢ1.MTH938("auto_remark_new_contact_date", true)) {
                        s8 = CLS182.MTH3484(4101434068912886581L, CLS182.MTH3483(s9), "");
                    }
                    if(ˎᵢ1.MTH938("auto_remark_new_contact_custom", false) && !TextUtils.isEmpty(s11)) {
                        s8 = CLS182.MTH3484(4101434210646807349L, CLS182.MTH3483(s11), s8);
                    }
                    s10 = s8 + s10;
                }
                CLS372.MTH5408(s, s10);
                return;
            }
            case 5: {
                CLS91 ᵔʾ2 = ᵎⁱ0.MTH2791().MTH1184("_SELF_ACCEPT_");
                if(ᵔʾ2 != null) {
                    ContentValues contentValues2 = CLS371.MTH5368(ᵎⁱ0.FLD1444.MTH5315(s));
                    if(contentValues2 == null || !ᵔʾ2.MTH1735().equals(contentValues2.getAsString("content"))) {
                        String s12 = ᵔʾ2.MTH1735();
                        ᵎⁱ0.FLD1447.MTH3016(s12, s);
                    }
                }
                return;
            }
            default: {
                ᵎⁱ0.getClass();
                CLS372.MTH5408(s, ᵎⁱ0.FLD1445.MTH925("auto_remark_enable_text", ""));
            }
        }
    }
}

