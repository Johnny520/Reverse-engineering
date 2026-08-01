// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import android.net.Uri;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.יﹳ.CLS166;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS432;
import java.io.File;

public final class CLS888 implements CLS169 {
    public int FLD1599;
    public String FLD1600;

    public CLS888() {
        this.FLD1599 = -1;
    }

    public CLS888(Uri uri0) {
        this(new File(CLS31.MTH979(CLS31.MTH1013(CLS27.MTH900()), CLS31.MTH985(CLS27.MTH900(), uri0))).getAbsolutePath());
        CLS31.MTH1037(CLS31.MTH973(uri0), new File(this.FLD1600));
    }

    public CLS888(File file0) {
        this(file0.getAbsolutePath());
    }

    public CLS888(String s) {
        this.FLD1599 = -1;
        this.FLD1600 = s;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3228() {
        return 8;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        return this.MTH3232() + 15000;
    }

    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final void MTH3230(String s) {
        String s1 = this.FLD1600;
        File file0 = new File(s1);
        if(CLS31.MTH1001(file0) && file0.isFile()) {
            try {
                Class class0 = CLS27.MTH894("sendArticleClass");
                Class class1 = CLS27.MTH894("WXFileObject");
                Class class2 = CLS27.MTH894("WXMediaMessage");
                if(class0 != null && class1 != null && class2 != null) {
                    Object object0 = CLS166.MTH3188(class1, new Object[0]);
                    CLS166.MTH3195(object0, "setFilePath", new Object[]{s1});
                    Object object1 = CLS166.MTH3188(class2, new Object[0]);
                    CLS166.MTH3198(object1, "mediaObject", object0);
                    CLS166.MTH3198(object1, "title", file0.getName());
                    CLS166.MTH3198(object1, "description", CLS31.MTH967(file0.length()));
                    CLS166.MTH3192(class0, CLS27.MTH892("sendFileMethod6", "a"), new Object[]{object1, "", "", s, 4, null});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        return CLS31.MTH1024(this.FLD1600);
    }

    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        int v = this.FLD1599;
        return v == -1 ? CLS412.MTH6005(3000, "send_delay_text") : v;
    }

    public final void MTH3251(String s) {
        File file0 = new File(CLS31.MTH980());
        CLS432.MTH6184(file0.getAbsolutePath(), s, ((CLS3)new CLS1274(this, file0, 3)));
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        this.FLD1599 = v;
    }
}

