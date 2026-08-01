// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ⁱᵔ.CLS1438;
import b.ⁱᵔ.CLS432;
import java.io.File;
import java.util.ArrayList;

public final class CLS569 implements CLS16, CLS17 {
    public final int FLD130;
    public final Activity FLD131;
    public final CLS12 FLD132;

    public CLS569(Activity activity0, CLS12 ᵔʾ0, int v) {
        this.FLD130 = v;
        this.FLD131 = activity0;
        this.FLD132 = ᵔʾ0;
        super();
    }

    public CLS569(CLS12 ᵔʾ0, Activity activity0, int v) {
        this.FLD130 = v;
        this.FLD132 = ᵔʾ0;
        this.FLD131 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Activity activity0 = this.FLD131;
        ArrayList arrayList0 = new ArrayList();
        int v = (int)(((Integer)arr_object[2]));
        if(v == 1) {
            arrayList0 = (ArrayList)arr_object[1];
        }
        else if(v == 2) {
            for(Object object0: ((ArrayList)arr_object[1])) {
                Uri uri0 = (Uri)object0;
                try {
                    String s = CLS31.MTH985(activity0, uri0);
                    File file0 = new File(activity0.getCacheDir(), CLS31.MTH979(("wx_tmp_" + Long.toHexString(System.currentTimeMillis())), s));
                    CLS31.MTH1037(activity0.getContentResolver().openInputStream(uri0), file0);
                    CLS31.MTH996(file0.getAbsolutePath());
                    arrayList0.add(file0);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        this.FLD132.MTH791(arrayList0);
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS12 ᵔʾ0 = this.FLD132;
        Activity activity0 = this.FLD131;
        switch(this.FLD130) {
            case 1: {
                ᵔʾ0.MTH791(new CLS1438(activity0, s, 1));
                return;
            }
            case 2: {
                ᵔʾ0.MTH791(new CLS1438(activity0, s, 0));
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6180(activity0, ᵔʾ0, s);
                }
            }
        }
    }
}

