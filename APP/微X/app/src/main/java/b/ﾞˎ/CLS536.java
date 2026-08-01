// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import java.lang.ref.WeakReference;

public final class CLS536 {
    public int FLD5199;
    public final CLS12 FLD5200;
    public int FLD5201;
    public CLS1626 FLD5202;
    public final CLS12 FLD5203;
    public CLS1626 FLD5204;
    public int FLD5205;
    public int FLD5206;

    // 此方法包含解密的字符串
    public CLS536(Activity activity0, ContentValues contentValues0, CLS12 ᵔʾ0, CLS12 ᵔʾ1) {
        this.FLD5201 = -1;
        this.FLD5206 = -1;
        this.FLD5205 = 0;
        this.FLD5199 = 0;
        WeakReference weakReference0 = new WeakReference(activity0);
        this.FLD5200 = ᵔʾ0;
        this.FLD5203 = ᵔʾ1;
        this.FLD5201 = CLS182.MTH3474(4101560444030604085L, contentValues0);
        this.FLD5205 = CLS182.MTH3474(0x38EBAB052B3CD335L, contentValues0);
        this.FLD5206 = CLS182.MTH3474(0x38EBAB0C2B3CD335L, contentValues0);
        this.FLD5199 = CLS182.MTH3474(0x38EBAB112B3CD335L, contentValues0);
        Activity activity1 = (Activity)weakReference0.get();
        CLS1626 ـﹳ0 = new CLS1626(activity1);
        this.FLD5202 = ـﹳ0;
        ـﹳ0.MTH7324(new CLS527(this, activity1, 0));
        this.FLD5202.MTH800(CLS27.MTH889("start_time"));
        CLS1626 ـﹳ1 = new CLS1626(activity1);
        this.FLD5204 = ـﹳ1;
        ـﹳ1.MTH7324(new CLS527(this, activity1, 1));
        this.FLD5204.MTH800(CLS27.MTH889("end_time"));
        this.MTH7235();
    }

    public final void MTH7234(CLS1623 יᐧ0) {
        יᐧ0.MTH7289(new Object[]{this.FLD5202, this.FLD5204});
    }

    // 此方法包含解密的字符串
    public final void MTH7235() {
        String s1;
        CLS1626 ـﹳ1;
        String s;
        CLS1626 ـﹳ0;
        if(this.FLD5201 == -1) {
            ـﹳ0 = this.FLD5202;
            s = CLS27.MTH889("click_to_select");
        }
        else {
            ـﹳ0 = this.FLD5202;
            s = String.format("%02d:%02d", this.FLD5201, this.FLD5205);
        }
        ـﹳ0.MTH7325(s);
        if(this.FLD5206 == -1) {
            ـﹳ1 = this.FLD5204;
            s1 = CLS27.MTH889("click_to_select");
        }
        else {
            ـﹳ1 = this.FLD5204;
            s1 = String.format("%02d:%02d", this.FLD5206, this.FLD5199);
        }
        ـﹳ1.MTH7325(s1);
    }
}

