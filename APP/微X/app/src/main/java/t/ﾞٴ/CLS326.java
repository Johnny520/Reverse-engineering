// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.content.Intent;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.ImageView;
import t.ˆʿ.CLS38.CLS37;
import t.ˆʿ.CLS38;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS304;
import t.ⁱʾ.CLS143;

public final class CLS326 implements CLS143 {
    public final int FLD1068;
    public final ImageView FLD1069;
    public final CLS331 FLD1070;

    public CLS326(CLS331 ﾞᐧ0, ImageView imageView0, int v) {
        this.FLD1068 = v;
        this.FLD1070 = ﾞᐧ0;
        this.FLD1069 = imageView0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        ImageView imageView0 = this.FLD1069;
        CLS331 ﾞᐧ0 = this.FLD1070;
        switch(this.FLD1068) {
            case 0: {
                if(CLS125.MTH2024(ﾞᐧ0.FLD1088)) {
                    String s = ﾞᐧ0.FLD1088;
                    String s1 = CLS133.MTH2115("MMNewPhotoEditUI");
                    if(!TextUtils.isEmpty(s1)) {
                        ﾞᐧ0.FLD1087 = imageView0;
                        Intent intent0 = new Intent();
                        intent0.setClassName(((CLS155)ﾞᐧ0).MTH2306(), s1);
                        intent0.putExtra("before_photo_edit", s);
                        intent0.putExtra("after_photo_edit", "");
                        ((CLS155)ﾞᐧ0).MTH2306().startActivityForResult(intent0, 6001);
                    }
                }
                return;
            }
            case 1: {
                ﾞᐧ0.getClass();
                try {
                    ﾞᐧ0.FLD1087 = imageView0;
                    Activity activity0 = ((CLS155)ﾞᐧ0).MTH2306();
                    try {
                        Intent intent1 = new Intent();
                        intent1.setType("image/*");
                        intent1.setAction("android.intent.action.GET_CONTENT");
                        intent1.addCategory("android.intent.category.OPENABLE");
                        activity0.startActivityForResult(Intent.createChooser(intent1, CLS133.MTH2099("select_img")), 6003);
                    }
                    catch(Throwable throwable2) {
                        CLS133.MTH2113(throwable2);
                    }
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                return;
            }
            case 2: {
                CLS38 יᐧ0 = new CLS38(((CLS155)ﾞᐧ0).MTH2306());
                יᐧ0.MTH1384("jpg,jpeg,png");
                String s2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                יᐧ0.FLD476 = s2;
                יᐧ0.MTH1386(s2, ((CLS37)new CLS304(ﾞᐧ0, imageView0, 9)));
                return;
            }
            default: {
                ﾞᐧ0.getClass();
                try {
                    ﾞᐧ0.FLD1087 = imageView0;
                    ﾞᐧ0.MTH2311();
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }
    }
}

