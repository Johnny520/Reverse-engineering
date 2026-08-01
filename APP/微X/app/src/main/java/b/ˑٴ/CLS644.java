// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.Environment;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS69;
import b.ᵔʾ.CLS1258;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS518;
import java.io.File;

public final class CLS644 implements CLS39 {
    public final int FLD618;
    public final String FLD619;
    public final CLS805 FLD620;

    public CLS644(CLS805 ᵎ0, String s, int v) {
        this.FLD618 = v;
        this.FLD620 = ᵎ0;
        this.FLD619 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS805 ᵎ0 = this.FLD620;
        String s = this.FLD619;
        switch(this.FLD618) {
            case 0: {
                ᵎ0.getClass();
                try {
                    ᵎ0.FLD1197.getClass();
                    File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "story_temp.mp4");
                    CLS31.MTH1018(file0);
                    String s1 = file0.getAbsolutePath();
                    if(CLS432.MTH6176(new CLS69(file0), s)) {
                        CLS1258 ⁱˏ0 = new CLS1258(7, s1);
                        CLS40.FLD157.MTH1116(((CLS39)ⁱˏ0));
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                ᵎ0.getClass();
                File file1 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), CLS31.MTH970(s.getBytes()) + ".mp4");
                if(CLS432.MTH6176(new CLS69(file1), s)) {
                    CLS412.MTH6013(((CLS140)ᵎ0.FLD1197).MTH3042(), CLS27.MTH889("file_written_to") + file1.getAbsolutePath());
                }
                return;
            }
            case 2: {
                ᵎ0.getClass();
                try {
                    ᵎ0.FLD1197.getClass();
                    File file2 = new File(CLS31.MTH1038(CLS27.MTH900()), "story_temp.mp4");
                    CLS31.MTH1018(file2);
                    String s2 = file2.getAbsolutePath();
                    if(CLS432.MTH6176(new CLS69(file2), s)) {
                        CLS644 ʽ0 = new CLS644(ᵎ0, s2, 5);
                        CLS40.FLD157.MTH1116(((CLS39)ʽ0));
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 3: {
                ᵎ0.getClass();
                try {
                    ᵎ0.FLD1197.getClass();
                    File file3 = new File(CLS31.MTH1038(CLS27.MTH900()), "story_temp.mp4");
                    CLS31.MTH1018(file3);
                    String s3 = file3.getAbsolutePath();
                    if(CLS432.MTH6176(new CLS69(file3), s)) {
                        CLS644 ʽ1 = new CLS644(ᵎ0, s3, 4);
                        CLS40.FLD157.MTH1116(((CLS39)ʽ1));
                        return;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 4: {
                ᵎ0.getClass();
                try {
                    ᵎ0.FLD1197.getClass();
                    File file4 = new File(CLS31.MTH1038(CLS27.MTH900()), "story_temp.jpg");
                    CLS518.MTH7053(file4, s);
                    CLS466.MTH6522(s, file4.getAbsolutePath(), "");
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            default: {
                CLS387.MTH5601(false, ((CLS140)ᵎ0.FLD1197).MTH3042(), ((CLS2)new CLS804(ᵎ0, s)), -1);
            }
        }
    }
}

