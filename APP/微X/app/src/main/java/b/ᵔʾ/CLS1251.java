// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.יᐧ.CLS163;
import java.io.File;

public final class CLS1251 implements CLS12 {
    public final int FLD3144;
    public final CLS163 FLD3145;
    public final CLS1245 FLD3146;
    public final String FLD3147;

    public CLS1251(CLS1245 יᐧ$ˆٴ0, CLS163 ﾞᐧ0, String s, int v) {
        this.FLD3144 = v;
        this.FLD3146 = יᐧ$ˆٴ0;
        this.FLD3145 = ﾞᐧ0;
        this.FLD3147 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        String s = this.FLD3147;
        CLS163 ﾞᐧ0 = this.FLD3145;
        CLS1245 יᐧ$ˆٴ0 = this.FLD3146;
        if(this.FLD3144 == 0) {
            יᐧ$ˆٴ0.getClass();
            ﾞᐧ0.MTH3166();
            if(CLS27.MTH895().MTH938("auto_download_chat_media_save_external", false)) {
                CLS299.MTH4857(CLS299.this, s, ((File)object0));
            }
            return;
        }
        יᐧ$ˆٴ0.getClass();
        ﾞᐧ0.MTH3166();
        try {
            if(CLS27.MTH895().MTH938("auto_download_chat_media_save_external", false) && CLS31.MTH1024(((String)object0))) {
                File file0 = new File(((String)object0));
                CLS299.MTH4857(CLS299.this, s, file0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

