// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.os.Environment;
import t.ˆʿ.CLS38.CLS37;
import t.ˆʿ.CLS38;
import t.ˆٴ.CLS283;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS294;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS297;
import t.ᵔʾ.CLS304;
import t.ⁱʾ.CLS143;

public final class CLS226 implements CLS143 {
    public final int FLD264;
    public final CLS216 FLD265;

    public CLS226(CLS216 ˎﾞ0, int v) {
        this.FLD264 = v;
        this.FLD265 = ˎﾞ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        CLS216 ˎﾞ0 = this.FLD265;
        switch(this.FLD264) {
            case 0: {
                if(!ˎﾞ0.MTH1137()) {
                    CLS102 יﹳ0 = ˎﾞ0.FLD236;
                    יﹳ0.getClass();
                    Activity activity0 = (Activity)CLS123.FLD912.MTH2003("getCurrentActivity", new Object[0]);
                    CLS294 ⁱᵔ0 = new CLS294(יﹳ0, 0);
                    CLS283 ⁱʾ0 = new CLS283(יﹳ0, activity0, 1);
                    String s = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                    if(CLS123.FLD912.MTH2000("hasWriteStoragePermission", new Object[0])) {
                        CLS38 יᐧ0 = new CLS38(activity0);
                        יᐧ0.FLD476 = s;
                        יᐧ0.MTH1386(null, ((CLS37)new CLS304(ⁱᵔ0, ⁱʾ0, 2)));
                        return;
                    }
                    CLS297 ˈˈ0 = new CLS297(ⁱʾ0, 0);
                    CLS137.FLD972.MTH2141(((CLS136)ˈˈ0));
                }
                return;
            }
            case 1: {
                if(!ˎﾞ0.MTH1137()) {
                    CLS265 ﾞˎ0 = new CLS265(ˎﾞ0, 21);
                    CLS137.FLD972.MTH2141(((CLS136)ﾞˎ0));
                }
                return;
            }
            case 2: {
                if(!ˎﾞ0.MTH1137()) {
                    CLS265 ﾞˎ1 = new CLS265(ˎﾞ0, 20);
                    CLS137.FLD972.MTH2141(((CLS136)ﾞˎ1));
                }
                return;
            }
            case 3: {
                ˎﾞ0.getClass();
                Object[] arr_object1 = {new CLS243(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("BottomTabContactsIconNormal.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object1);
                return;
            }
            case 4: {
                ˎﾞ0.getClass();
                Object[] arr_object2 = {new CLS244(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("BottomTabContactsIconFocus.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object2);
                return;
            }
            case 5: {
                ˎﾞ0.getClass();
                Object[] arr_object3 = {new CLS186(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("BottomTabDiscoverIconNormal.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object3);
                return;
            }
            case 6: {
                ˎﾞ0.getClass();
                Object[] arr_object4 = {new CLS242(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("BottomTabDiscoverIconFocus.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object4);
                return;
            }
            case 7: {
                ˎﾞ0.getClass();
                Object[] arr_object5 = {new CLS225(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("BottomTabMeIconNormal.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object5);
                return;
            }
            case 8: {
                ˎﾞ0.getClass();
                Object[] arr_object6 = {new CLS194(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("BottomTabMeIconFocus.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object6);
                return;
            }
            case 9: {
                ˎﾞ0.getClass();
                Object[] arr_object7 = {new CLS229(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("BottomTabWechatIconNormal.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object7);
                return;
            }
            default: {
                ˎﾞ0.getClass();
                Object[] arr_object = {new CLS253(ˎﾞ0), ˎﾞ0.FLD236.MTH1826("BottomTabWechatIconFocus.png")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object);
            }
        }
    }
}

