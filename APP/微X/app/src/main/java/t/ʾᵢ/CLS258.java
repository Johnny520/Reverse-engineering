// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import t.ˆʿ.CLS43;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS106;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS132;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS300;
import t.ᵔʾ.CLS304;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS177.CLS176;
import t.ﾞᐧ.CLS332;
import t.ﾞᐧ.CLS338;
import t.ﾞᐧ.CLS339;
import t.ﾞᐧ.CLS345;
import t.ﾞᐧ.CLS347.CLS184;

public final class CLS258 implements CLS136, CLS176, CLS184 {
    public final Object FLD360;
    public final Object FLD361;
    public final Object FLD362;
    public final Object FLD363;
    public final Object FLD364;

    public CLS258(Object object0, Object object1, Object object2, Object object3, Object object4) {
        this.FLD360 = object0;
        this.FLD363 = object1;
        this.FLD362 = object2;
        this.FLD364 = object3;
        this.FLD361 = object4;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        File file0;
        CLS216 ˎﾞ0 = (CLS216)this.FLD360;
        String s = (String)this.FLD362;
        ProgressDialog progressDialog0 = (ProgressDialog)this.FLD364;
        Activity activity0 = (Activity)this.FLD361;
        ˎﾞ0.getClass();
        Object object0 = ((Object[])this.FLD363)[0];
        InputStream inputStream0 = null;
        if(object0 instanceof File) {
            file0 = (File)object0;
            if(file0.isFile()) {
                try {
                    inputStream0 = new FileInputStream(file0);
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }
        else {
            if(object0 instanceof InputStream) {
                inputStream0 = (InputStream)object0;
            }
            else if(object0 instanceof Uri) {
                inputStream0 = CLS125.MTH2027(((Uri)object0));
            }
            file0 = null;
        }
        try {
            CLS117 ˆٴ0 = CLS117.FLD842;
            CLS102 יﹳ0 = ˆٴ0.MTH1907(s);
            if(inputStream0 != null) {
                יﹳ0.MTH1810(inputStream0);
            }
            else if(file0 != null) {
                יﹳ0.MTH1822(file0);
            }
            יﹳ0.getClass();
            if(!CLS132.MTH2090("settings.json", new String[]{יﹳ0.FLD773})) {
                if(!TextUtils.isEmpty(s)) {
                    CLS132.MTH2097(s);
                    ˆٴ0.FLD841.remove(s);
                }
                CLS304 ﾞᐧ0 = new CLS304(progressDialog0, activity0, 12);
                CLS137.FLD972.MTH2145(((CLS136)ﾞᐧ0));
                return;
            }
            ˆٴ0.MTH1908();
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
        }
        CLS300 ـˏ0 = new CLS300(ˎﾞ0, s, progressDialog0, activity0);
        CLS137.FLD972.MTH2145(((CLS136)ـˏ0));
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞᐧ.CLS177$CLS176
    public final void MTH2442(String s) {
        CLS43.MTH1431(!((String)((HashMap)((CLS106)this.FLD360).FLD790).get(s)).equals("custom"), new CLS145[]{((CLS339)this.FLD363)});
        CLS43.MTH1431(((String)((HashMap)((CLS106)this.FLD360).FLD790).get(s)).equals("menu_header"), new CLS145[]{((CLS338)this.FLD362), ((CLS345)this.FLD364), ((CLS332)this.FLD361)});
    }
}

