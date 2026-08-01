// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.ImageView;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ᵔʾ.CLS1259;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.lang.ref.WeakReference;

public final class CLS216 {
    public final CLS29 FLD2110;
    public ImageView FLD2111;
    public WeakReference FLD2112;
    public String FLD2113;

    public CLS216(Activity activity0) {
        this.FLD2112 = new WeakReference(activity0);
        this.FLD2110 = CLS27.MTH895();
    }

    public final void MTH3842(String s, String s1) {
        public final class CLS1024 implements CLS8 {
            public final String FLD2108;
            public final CLS216 FLD2109;

            public CLS1024(String s) {
                this.FLD2108 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                String s = (String)object0;
                CLS216 ˎˎ0 = CLS216.this;
                ˎˎ0.FLD2110.MTH922(s, "custom_avatar_img_" + this.FLD2108);
                try {
                    File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "custom_avatar_img_" + this.FLD2108);
                    CLS518.MTH7058(file0, CLS518.MTH7072(0x60, 0x60, s));
                    String s1 = file0.getAbsolutePath();
                    CLS518.FLD5082.remove(s1);
                    Bitmap bitmap0 = CLS372.MTH5402(0x60, 0x60, this.FLD2108);
                    if(bitmap0 != null) {
                        ˎˎ0.FLD2111.setImageBitmap(bitmap0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        this.FLD2113 = s;
        Activity activity0 = (Activity)this.FLD2112.get();
        CLS523.MTH7169(activity0, s1, ((CLS379)new CLS1259(this, activity0, s, 26)));
    }
}

