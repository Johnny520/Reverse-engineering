// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import t.ʾᵢ.CLS200;
import t.ⁱʾ.CLS144;
import t.ⁱʾ.CLS146;

public final class CLS302 implements CLS146 {
    public final Activity FLD932;
    public final CLS144 FLD933;
    public final CLS144 FLD934;
    public final CLS144 FLD935;

    public CLS302(Activity activity0, CLS200 ˊﾞ0, CLS200 ˊﾞ1) {
        this.FLD932 = activity0;
        this.FLD934 = ˊﾞ0;
        this.FLD933 = null;
        this.FLD935 = ˊﾞ1;
    }

    @Override  // t.ⁱʾ.CLS146
    public final void MTH2177(Object object0) {
        Activity activity0 = this.FLD932;
        Intent intent0 = (Intent)object0;
        if(intent0 != null) {
            try {
                Uri uri0 = intent0.getData();
                if(uri0 != null) {
                    String s = CLS125.MTH2032(activity0, uri0);
                    String s1 = CLS125.MTH2039(uri0);
                    String s2 = CLS125.MTH2040(activity0, uri0);
                    if(!TextUtils.isEmpty(s2)) {
                        File file0 = new File(s2);
                        if(file0.canRead()) {
                            CLS144 ˊﾞ0 = this.FLD934;
                            if(ˊﾞ0 != null) {
                                ˊﾞ0.MTH2170(new Object[]{file0, s, s1});
                                return;
                            }
                        }
                    }
                    CLS144 ˊﾞ1 = this.FLD933;
                    if(ˊﾞ1 != null) {
                        try {
                            ˊﾞ1.MTH2170(new Object[]{uri0, s, s1});
                            return;
                        }
                        catch(Throwable throwable1) {
                            CLS133.MTH2113(throwable1);
                        }
                    }
                    InputStream inputStream0 = activity0.getContentResolver().openInputStream(uri0);
                    if(inputStream0 != null) {
                        CLS144 ˊﾞ2 = this.FLD935;
                        if(ˊﾞ2 != null) {
                            try {
                                ˊﾞ2.MTH2170(new Object[]{inputStream0, s, s1});
                            }
                            catch(Throwable throwable2) {
                                CLS133.MTH2113(throwable2);
                            }
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
    }
}

