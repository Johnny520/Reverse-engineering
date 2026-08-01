// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˊﾞ.CLS612;
import b.ﾞˎ.CLS1622;
import b.ﾞٴ.CLS1636;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS559;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

public final class CLS398 implements View.OnClickListener {
    public final int FLD3806;
    public final CLS1622 FLD3807;
    public final MediaPlayer FLD3808;
    public final File FLD3809;
    public final String[] FLD3810;

    public CLS398(File file0, MediaPlayer mediaPlayer0, String[] arr_s, CLS1622 ˑٴ0, int v) {
        this.FLD3806 = v;
        this.FLD3809 = file0;
        this.FLD3808 = mediaPlayer0;
        this.FLD3810 = arr_s;
        this.FLD3807 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        boolean z1;
        File file0 = null;
        CLS1622 ˑٴ0 = this.FLD3807;
        String[] arr_s = this.FLD3810;
        MediaPlayer mediaPlayer0 = this.FLD3808;
        File file1 = this.FLD3809;
        boolean z = false;
        if(this.FLD3806 == 0) {
            try {
                CLS557 ˆٴ0 = new CLS557(file1);
                int v = mediaPlayer0.getDuration();
                int v1 = CLS476.FLD4665;
                if(v1 != 0) {
                    int v2 = CLS476.FLD4663;
                    if(v2 != 0 || v1 != v) {
                        ˆٴ0.MTH7473(((double)v2) / 1000.0, ((double)v1) / 1000.0);
                    }
                }
                if(TextUtils.isEmpty(arr_s[0])) {
                    z1 = false;
                }
                else {
                    file0 = new File(arr_s[0]);
                    z1 = file0.canWrite();
                }
                if(!z1) {
                    file0 = CLS31.MTH1038(CLS27.MTH900());
                }
                String s = new File(file0, ˑٴ0.MTH7285() + ".mp3").getAbsolutePath();
                CLS1558 ᵔˏ0 = new CLS1558(s, z1);
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                new CLS559(ˆٴ0).MTH7483(byteArrayOutputStream0);
                byte[] arr_b = byteArrayOutputStream0.toByteArray();
                try {
                    ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                    CLS1636 ˆٴ1 = new CLS1636(0);
                    if(ˆٴ1.FLD5437 != null) {
                        CLS612 ᵔʾ0 = new CLS612(ˆٴ1, byteArrayInputStream0, s, ᵔˏ0, 0);
                        CLS40.FLD157.MTH1124(((CLS39)ᵔʾ0));
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            CLS557 ˆٴ2 = new CLS557(file1);
            int v3 = mediaPlayer0.getDuration();
            int v4 = CLS476.FLD4665;
            if(v4 != 0) {
                int v5 = CLS476.FLD4663;
                if(v5 != 0 || v4 != v3) {
                    ˆٴ2.MTH7473(((double)v5) / 1000.0, ((double)v4) / 1000.0);
                }
            }
            if(!TextUtils.isEmpty(arr_s[0])) {
                file0 = new File(arr_s[0]);
                z = file0.canWrite();
            }
            if(!z) {
                file0 = CLS31.MTH1038(CLS27.MTH900());
            }
            String s1 = new File(file0, ˑٴ0.MTH7285() + ".wav").getAbsolutePath();
            if(new CLS559(ˆٴ2).MTH7485(s1)) {
                if(!z) {
                    CLS31.MTH996(s1);
                    CLS466.MTH6506(new File(s1));
                    return;
                }
                CLS412.MTH6013(CLS27.MTH900(), CLS27.MTH889("file_written_to") + s1);
            }
        }
        catch(Throwable throwable2) {
            CLS27.MTH893(throwable2);
        }
    }
}

