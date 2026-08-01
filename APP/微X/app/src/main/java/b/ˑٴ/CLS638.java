// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.graphics.Bitmap;
import android.widget.ImageView;
import b.ⁱᵔ.CLS442.CLS440;
import b.ⁱᵔ.CLS518;
import java.io.File;

public final class CLS638 implements CLS440 {
    public final int FLD591;
    public final ImageView FLD592;
    public final CLS881 FLD593;
    public final File FLD594;

    public CLS638(CLS881 ﾞˏ0, ImageView imageView0, File file0, int v) {
        this.FLD591 = v;
        this.FLD593 = ﾞˏ0;
        this.FLD592 = imageView0;
        this.FLD594 = file0;
        super();
    }

    @Override  // b.ⁱᵔ.CLS442$CLS440
    public final void MTH6221(File file0) {
        File file1 = this.FLD594;
        ImageView imageView0 = this.FLD592;
        CLS881 ﾞˏ0 = this.FLD593;
        if(this.FLD591 == 0) {
            ﾞˏ0.getClass();
            if(file0.isFile()) {
                String s = file0.getAbsolutePath();
                Bitmap bitmap0 = CLS518.MTH7060(s);
                imageView0.setImageBitmap(CLS518.MTH7074(0x200, 0x200, s));
                CLS518.MTH7058(file1, bitmap0);
            }
            return;
        }
        ﾞˏ0.getClass();
        if(file0.isFile()) {
            String s1 = file0.getAbsolutePath();
            Bitmap bitmap1 = CLS518.MTH7060(s1);
            imageView0.setImageBitmap(CLS518.MTH7074(0x200, 0x200, s1));
            CLS518.MTH7058(file1, bitmap1);
        }
    }
}

