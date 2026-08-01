// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.Intent;
import android.os.Environment;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS59;
import b.ⁱᵔ.CLS442.CLS440;
import b.ⁱᵔ.CLS442;
import java.io.File;

public final class CLS788 implements CLS3 {
    public final int FLD1133;
    public final CLS881 FLD1134;

    public CLS788(CLS881 ﾞˏ0, int v) {
        this.FLD1133 = v;
        this.FLD1134 = ﾞˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS881 ﾞˏ0 = this.FLD1134;
        switch(this.FLD1133) {
            case 0: {
                ﾞˏ0.MTH3111(5009, 1, 9);
                return;
            }
            case 1: {
                ﾞˏ0.getClass();
                Intent intent0 = new Intent();
                intent0.setType("image/gif");
                intent0.setAction("android.intent.action.GET_CONTENT");
                ((CLS140)ﾞˏ0).MTH3042().startActivityForResult(Intent.createChooser(intent0, CLS27.MTH889("select_gif")), 5004);
                return;
            }
            case 2: {
                CLS442 ˎᵢ0 = new CLS442(((CLS140)ﾞˏ0).MTH3042());
                ˎᵢ0.MTH6224("gif");
                ˎᵢ0.MTH6226(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                ˎᵢ0.MTH6228(((CLS440)new CLS799(ﾞˏ0, 4)));
                return;
            }
            case 3: {
                ﾞˏ0.getClass();
                try {
                    ﾞˏ0.MTH3111(5008, 1, 1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 4: {
                ﾞˏ0.getClass();
                String s1 = CLS59.FLD183.MTH1286(ﾞˏ0.FLD1495).getAbsolutePath();
                ﾞˏ0.MTH3114(ﾞˏ0.FLD1497, s1);
                return;
            }
            case 5: {
                CLS442 ˎᵢ1 = new CLS442(((CLS140)ﾞˏ0).MTH3042());
                ˎᵢ1.MTH6224("jpg,jpeg,png");
                ˎᵢ1.MTH6226(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                ˎᵢ1.MTH6228(((CLS440)new CLS799(ﾞˏ0, 7)));
                return;
            }
            case 6: {
                ﾞˏ0.getClass();
                String s2 = CLS59.FLD183.MTH1286(ﾞˏ0.FLD1495).getAbsolutePath();
                try {
                    ﾞˏ0.FLD1494 = s2;
                    ﾞˏ0.FLD1517 = ﾞˏ0.FLD1497;
                    ﾞˏ0.MTH3111(5005, 1, 1);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 7: {
                ﾞˏ0.MTH3114(ﾞˏ0.FLD1496, null);
                ﾞˏ0.FLD1509 = ﾞˏ0.FLD1496.getDrawingCache();
                return;
            }
            case 8: {
                ﾞˏ0.getClass();
                CLS799 ᴵᵎ0 = new CLS799(ﾞˏ0, 5);
                CLS40.FLD157.MTH1116(((CLS39)ᴵᵎ0));
                return;
            }
            default: {
                File file0 = ﾞˏ0.FLD1500.MTH1286(ﾞˏ0.FLD1495);
                if(CLS31.MTH1001(file0)) {
                    String s = file0.getAbsolutePath();
                    ﾞˏ0.FLD1510 = s;
                    ﾞˏ0.MTH3110(ﾞˏ0.FLD1497, s);
                }
            }
        }
    }
}

