// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS12;
import b.ﾞˎ.CLS1626;
import java.io.File;

public final class CLS1001 implements CLS12 {
    public final int FLD2038;
    public final CLS1626 FLD2039;
    public final CLS928 FLD2040;

    public CLS1001(CLS928 ʼᴵ0, CLS1626 ـﹳ0, int v) {
        this.FLD2038 = v;
        this.FLD2040 = ʼᴵ0;
        this.FLD2039 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS1626 ـﹳ0 = this.FLD2039;
        CLS928 ʼᴵ0 = this.FLD2040;
        switch(this.FLD2038) {
            case 0: {
                ʼᴵ0.getClass();
                String s1 = ((File)object0).getAbsolutePath();
                ʼᴵ0.FLD2151.MTH922(s1, "export_chat_path");
                ـﹳ0.MTH798(s1);
                return;
            }
            case 1: {
                ʼᴵ0.getClass();
                String s2 = ((File)object0).getAbsolutePath();
                ʼᴵ0.FLD2151.MTH922(s2, "export_emoji_gif_path");
                ـﹳ0.MTH798(s2);
                return;
            }
            case 2: {
                ʼᴵ0.getClass();
                String s3 = ((File)object0).getAbsolutePath();
                ʼᴵ0.FLD2151.MTH922(s3, "auto_download_chat_media_save_path");
                ـﹳ0.MTH798(s3);
                return;
            }
            default: {
                ʼᴵ0.getClass();
                String s = ((File)object0).getAbsolutePath();
                ʼᴵ0.FLD2151.MTH922(s, "local_emoji_dir");
                ـﹳ0.MTH798(s);
            }
        }
    }
}

