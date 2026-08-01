// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import d.ˎˏ.CLS1;
import d.יʻ.CLS62;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS126;
import java.io.File;

public final class CLS164 implements CLS126 {
    public final CLS38 FLD241;
    public final boolean FLD242;
    public final Activity FLD243;

    public CLS164(boolean z, CLS38 ـʿ0, Activity activity0) {
        this.FLD242 = z;
        this.FLD241 = ـʿ0;
        this.FLD243 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS126
    public final void MTH1183() {
        Intent intent0;
        if(this.FLD242) {
            this.FLD241.getClass();
            if(CLS62.FLD317.MTH760("isUpdateFileAvailable", new Object[0])) {
                Activity activity0 = this.FLD243;
                File file0 = new File(activity0.getCacheDir(), "xmodule.apk");
                try {
                    if(Build.VERSION.SDK_INT >= 24) {
                        intent0 = new Intent("android.intent.action.INSTALL_PACKAGE");
                        intent0.setData(CLS1.MTH371(activity0, file0));
                        intent0.setFlags(1);
                    }
                    else {
                        intent0 = new Intent("android.intent.action.VIEW");
                        intent0.setDataAndType(CLS1.MTH371(activity0, file0), "application/vnd.android.package-archive");
                        intent0.setFlags(0x10000000);
                    }
                    activity0.startActivity(intent0);
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
            }
        }
    }

    @Override  // d.ⁱٴ.CLS126
    public final void MTH1184() {
    }
}

