// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.Intent;
import android.os.Environment;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS442.CLS440;
import b.ⁱᵔ.CLS442;

public final class CLS119 implements View.OnClickListener {
    public final int FLD864;
    public final CLS881 FLD865;

    public CLS119(CLS881 ﾞˏ0, int v) {
        this.FLD864 = v;
        this.FLD865 = ﾞˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS881 ﾞˏ0 = this.FLD865;
        switch(this.FLD864) {
            case 0: {
                ﾞˏ0.getClass();
                Intent intent0 = new Intent();
                intent0.setType("video/*");
                intent0.setAction("android.intent.action.GET_CONTENT");
                ((CLS140)ﾞˏ0).MTH3042().startActivityForResult(Intent.createChooser(intent0, CLS27.MTH889("select_video")), 5002);
                return;
            }
            case 1: {
                CLS442 ˎᵢ0 = new CLS442(((CLS140)ﾞˏ0).MTH3042());
                ˎᵢ0.MTH6224("mp4");
                ˎᵢ0.MTH6226(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                ˎᵢ0.MTH6228(((CLS440)new CLS799(ﾞˏ0, 1)));
                return;
            }
            default: {
                ﾞˏ0.MTH3111(5007, 2, 1);
            }
        }
    }
}

