// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS169;
import d.יʻ.CLS63;
import d.יʻ.CLS68.CLS67;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS123;
import java.io.File;
import java.io.FileOutputStream;

public final class CLS191 implements CLS123 {
    public final Object FLD564;
    public final int FLD565;

    public CLS191(Object object0, int v) {
        this.FLD565 = v;
        this.FLD564 = object0;
        super();
    }

    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        Object object0 = this.FLD564;
        switch(this.FLD565) {
            case 0: {
                ((CLS87)object0).FLD444 = ((CLS87)object0).FLD443;
                ((CLS87)object0).MTH934(((CLS87)object0).FLD443);
                ((CLS87)object0).MTH935();
                return;
            }
            case 1: {
                CLS169 ﹳᵎ0 = new CLS169(((CLS187)object0));
                CLS68.FLD326.MTH791(((CLS67)ﹳᵎ0));
                return;
            }
            default: {
                Bitmap bitmap0 = (Bitmap)object0;
                String s = CLS63.MTH766(CLS69.MTH810()) + ".png";
                CLS63.MTH764(s);
                File file0 = new File(s);
                if(bitmap0 != null) {
                    try {
                        if(!CLS63.MTH771(file0)) {
                            file0.createNewFile();
                        }
                        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
                        bitmap0.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream0);
                        fileOutputStream0.flush();
                        fileOutputStream0.close();
                    }
                    catch(Exception exception0) {
                        CLS69.MTH809(file0.getAbsolutePath());
                        CLS69.MTH797(exception0);
                    }
                }
                CLS1.MTH368(new File(s));
            }
        }
    }
}

