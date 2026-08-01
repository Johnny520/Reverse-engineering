// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;

public final class CLS998 implements CLS3 {
    public final int FLD2024;
    public final ContentValues FLD2025;
    public final int FLD2026;
    public final CLS244 FLD2027;
    public final Activity FLD2028;
    public final CLS359 FLD2029;

    public CLS998(CLS244 ᴵʻ0, int v, Activity activity0, ContentValues contentValues0, CLS359 ⁱˉ0, int v1) {
        this.FLD2024 = v1;
        this.FLD2027 = ᴵʻ0;
        this.FLD2026 = v;
        this.FLD2028 = activity0;
        this.FLD2025 = contentValues0;
        this.FLD2029 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s3;
        CLS1159 ᵔﹳ0;
        String s2;
        String s1;
        String s;
        CLS359 ⁱˉ0 = this.FLD2029;
        ContentValues contentValues0 = this.FLD2025;
        int v = this.FLD2026;
        CLS244 ᴵʻ0 = this.FLD2027;
        if(this.FLD2024 == 0) {
            Activity activity0 = this.FLD2028;
            ᴵʻ0.getClass();
            if(v == 1) {
                s = CLS27.MTH889("text");
                s1 = CLS27.MTH889("modify");
                s2 = contentValues0.getAsString("msg");
                ᵔﹳ0 = new CLS1159(contentValues0, ⁱˉ0, 3);
                s3 = s;
            }
            else {
                if(v == 101) {
                    try {
                        ArrayList arrayList0 = new ArrayList();
                        String[] arr_s = CLS502.MTH6941(contentValues0.getAsString("chatrooms"));
                        for(int v1 = 0; v1 < arr_s.length; ++v1) {
                            String s4 = arr_s[v1];
                            arrayList0.add(new CLS78(s4, ᴵʻ0.FLD2541.MTH5316(s4)));
                        }
                        CLS387.MTH5585(true, activity0, arrayList0, ((CLS2)new CLS1126(contentValues0, ⁱˉ0)), contentValues0.getAsString("chatrooms"), -1);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    return;
                }
                if(v == -49) {
                    String s5 = contentValues0.getAsString("path");
                    CLS31.MTH1014(activity0, ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 3)), ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 4)), new File(s5).getParent());
                    return;
                }
                if(v == -104 || v == -103 || v == -102 || v == -101 || v == -100) {
                    String s6 = CLS27.MTH889("input_url");
                    s1 = "";
                    s2 = contentValues0.getAsString("url");
                    ᵔﹳ0 = new CLS901(contentValues0, v, ⁱˉ0, 1);
                    s3 = s6;
                }
                else {
                    switch(v) {
                        case -333: {
                            s = CLS27.MTH889("tts");
                            s1 = "";
                            s2 = contentValues0.getAsString("tts");
                            ᵔﹳ0 = new CLS1159(contentValues0, ⁱˉ0, 4);
                            s3 = s;
                            break;
                        }
                        case -33: {
                            CLS476.MTH6640(activity0, ((CLS7)new CLS1159(contentValues0, ⁱˉ0, 5)));
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                }
            }
            CLS523.MTH7165(activity0, s3, s1, s2, 1, ((CLS16)ᵔﹳ0));
            return;
        }
        Activity activity1 = this.FLD2028;
        ᴵʻ0.getClass();
        try {
            switch(v) {
                case -333: {
                    goto label_75;
                }
                case -202: {
                    JSONArray jSONArray0 = new JSONArray(contentValues0.getAsString("data"));
                    ᴵʻ0.MTH4264(((CLS12)new CLS1194(contentValues0, ⁱˉ0, 2)), jSONArray0);
                    return;
                }
                case -104: 
                case -103: 
                case -102: 
                case -101: 
                case -100: {
                    goto label_79;
                }
                case -49: {
                    break;
                }
                case -33: {
                    goto label_60;
                }
                case 1: {
                    goto label_87;
                }
                case 101: {
                    goto label_62;
                }
                default: {
                    return;
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return;
        }
        String s7 = contentValues0.getAsString("path");
        CLS31.MTH1014(activity1, ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 0)), ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 1)), new File(s7).getParent());
        return;
    label_60:
        CLS476.MTH6640(activity1, ((CLS7)new CLS1159(contentValues0, ⁱˉ0, 2)));
        return;
        try {
        label_62:
            ArrayList arrayList1 = new ArrayList();
            String[] arr_s1 = CLS502.MTH6941(contentValues0.getAsString("chatrooms"));
            for(int v2 = 0; v2 < arr_s1.length; ++v2) {
                String s8 = arr_s1[v2];
                arrayList1.add(new CLS78(s8, ᴵʻ0.FLD2541.MTH5316(s8)));
            }
            CLS387.MTH5585(true, activity1, arrayList1, ((CLS2)new CLS1038(contentValues0, ⁱˉ0)), contentValues0.getAsString("chatrooms"), -1);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
        return;
    label_75:
        String s9 = CLS27.MTH889("tts");
        String s10 = contentValues0.getAsString("tts");
        CLS901 ʻˏ0 = new CLS1159(contentValues0, ⁱˉ0, 1);
        goto label_82;
    label_79:
        s9 = CLS27.MTH889("input_url");
        s10 = contentValues0.getAsString("url");
        ʻˏ0 = new CLS901(contentValues0, v, ⁱˉ0, 0);
    label_82:
        String s11 = s10;
        CLS1159 ᵔﹳ1 = ʻˏ0;
        String s12 = s9;
        String s13 = "";
        CLS523.MTH7165(activity1, s12, s13, s11, 1, ((CLS16)ᵔﹳ1));
        return;
    label_87:
        String s14 = CLS27.MTH889("text");
        s13 = CLS27.MTH889("modify");
        s11 = contentValues0.getAsString("msg");
        ᵔﹳ1 = new CLS1159(contentValues0, ⁱˉ0, 0);
        s12 = s14;
        CLS523.MTH7165(activity1, s12, s13, s11, 1, ((CLS16)ᵔﹳ1));
    }
}

