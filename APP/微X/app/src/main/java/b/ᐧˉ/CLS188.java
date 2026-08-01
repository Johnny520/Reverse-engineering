// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.os.Environment;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS31;
import b.ﾞˎ.CLS1626;

public final class CLS188 implements View.OnClickListener {
    public final int FLD1797;
    public final Activity FLD1798;
    public final CLS928 FLD1799;
    public final CLS1626 FLD1800;

    public CLS188(CLS928 ʼᴵ0, Activity activity0, CLS1626 ـﹳ0, int v) {
        this.FLD1797 = v;
        this.FLD1799 = ʼᴵ0;
        this.FLD1798 = activity0;
        this.FLD1800 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD1798;
        CLS1626 ـﹳ0 = this.FLD1800;
        CLS928 ʼᴵ0 = this.FLD1799;
        switch(this.FLD1797) {
            case 0: {
                ʼᴵ0.getClass();
                CLS1001 ˋˑ1 = new CLS1001(ʼᴵ0, ـﹳ0, 3);
                String s2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                String s3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                CLS31.MTH982(activity0, ((CLS12)ˋˑ1), s2, ʼᴵ0.FLD2151.MTH925("local_emoji_dir", s3));
                return;
            }
            case 1: {
                ʼᴵ0.getClass();
                CLS1001 ˋˑ2 = new CLS1001(ʼᴵ0, ـﹳ0, 1);
                String s4 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                String s5 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                CLS31.MTH982(activity0, ((CLS12)ˋˑ2), s4, ʼᴵ0.FLD2151.MTH925("export_emoji_gif_path", s5));
                return;
            }
            case 2: {
                ʼᴵ0.getClass();
                CLS1001 ˋˑ3 = new CLS1001(ʼᴵ0, ـﹳ0, 2);
                String s6 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                String s7 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                CLS31.MTH982(activity0, ((CLS12)ˋˑ3), s6, ʼᴵ0.FLD2151.MTH925("auto_download_chat_media_save_path", s7));
                return;
            }
            default: {
                ʼᴵ0.getClass();
                CLS1001 ˋˑ0 = new CLS1001(ʼᴵ0, ـﹳ0, 0);
                String s = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                String s1 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                CLS31.MTH982(activity0, ((CLS12)ˋˑ0), s, ʼᴵ0.FLD2151.MTH925("export_chat_path", s1));
            }
        }
    }
}

