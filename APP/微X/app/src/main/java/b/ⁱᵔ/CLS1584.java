// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ᐧˉ.CLS1159;
import b.ᐧˉ.CLS1194;
import b.ᐧˉ.CLS901;
import b.ᐧˉ.CLS934;
import b.ⁱʾ.CLS359;
import java.io.File;

public final class CLS1584 implements CLS3 {
    public final int FLD4968;
    public final CLS359 FLD4969;
    public final Activity FLD4970;
    public final int FLD4971;
    public final ContentValues FLD4972;

    public CLS1584(int v, Activity activity0, ContentValues contentValues0, CLS359 ⁱˉ0, int v1) {
        this.FLD4968 = v1;
        this.FLD4971 = v;
        this.FLD4970 = activity0;
        this.FLD4972 = contentValues0;
        this.FLD4969 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s5;
        String s4;
        CLS1159 ᵔﹳ0;
        String s3;
        String s2;
        CLS359 ⁱˉ0 = this.FLD4969;
        ContentValues contentValues0 = this.FLD4972;
        int v = this.FLD4971;
        if(this.FLD4968 == 0) {
            Activity activity0 = this.FLD4970;
            switch(v) {
                case -333: {
                    String s1 = CLS27.MTH889("tts");
                    s2 = "";
                    s3 = contentValues0.getAsString("tts");
                    ᵔﹳ0 = new CLS1159(contentValues0, ⁱˉ0, 10);
                    s4 = s1;
                    break;
                }
                case -104: 
                case -103: 
                case -102: 
                case -101: 
                case -100: {
                    s5 = CLS27.MTH889("input_url");
                    s2 = "";
                    s3 = contentValues0.getAsString("url");
                    ᵔﹳ0 = new CLS901(contentValues0, v, ⁱˉ0, 2);
                    s4 = s5;
                    break;
                }
                case -49: {
                    String s = contentValues0.getAsString("path");
                    CLS31.MTH1014(activity0, ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 7)), ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 8)), new File(s).getParent());
                    return;
                }
                case 1: {
                    s5 = CLS27.MTH889("text");
                    s2 = CLS27.MTH889("modify");
                    s3 = contentValues0.getAsString("content");
                    ᵔﹳ0 = new CLS1159(contentValues0, ⁱˉ0, 9);
                    s4 = s5;
                    break;
                }
                case 0x30: {
                    CLS395.MTH5727(activity0, contentValues0, ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 9)));
                    return;
                }
                default: {
                    return;
                }
            }
            CLS523.MTH7165(activity0, s4, s2, s3, 1, ((CLS16)ᵔﹳ0));
            return;
        }
        Activity activity1 = this.FLD4970;
        switch(v) {
            case -104: 
            case -103: 
            case -102: 
            case -101: 
            case -100: {
                CLS523.MTH7165(activity1, CLS27.MTH889("input_url"), "", contentValues0.getAsString("url"), 1, ((CLS16)new CLS901(contentValues0, v, ⁱˉ0, 3)));
                break;
            }
            case -49: {
                String s6 = contentValues0.getAsString("path");
                CLS31.MTH1014(activity1, ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 10)), ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 11)), new File(s6).getParent());
                return;
            label_39:
                if(v == -333) {
                    CLS523.MTH7165(activity1, CLS27.MTH889("tts"), "", contentValues0.getAsString("tts"), 1, ((CLS16)new CLS934(contentValues0, 5)));
                    return;
                }
                break;
            }
            case 1: {
                CLS523.MTH7165(activity1, CLS27.MTH889("text"), CLS27.MTH889("modify"), contentValues0.getAsString("content"), 1, ((CLS16)new CLS1159(contentValues0, ⁱˉ0, 11)));
                return;
            }
            default: {
                goto label_39;
            }
        }
    }
}

