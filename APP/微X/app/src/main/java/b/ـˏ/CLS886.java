// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS518;
import java.io.File;
import java.util.HashMap;

public final class CLS886 implements CLS169 {
    public String FLD1591;
    public int FLD1592;
    public File FLD1593;
    public int FLD1594;
    public String FLD1595;
    public File FLD1596;

    public CLS886() {
        this.FLD1594 = -1;
        this.FLD1592 = 0;
    }

    public CLS886(File file0) {
        this.FLD1594 = -1;
        this.FLD1592 = 0;
        this.FLD1596 = file0;
    }

    public CLS886(String s) {
        this.FLD1594 = -1;
        this.FLD1592 = 0;
        this.FLD1591 = s;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3228() {
        return 2;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        return this.MTH3232() + 90000;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3230(String s) {
        try {
            String s1 = this.FLD1593.getAbsolutePath();
            if(CLS31.MTH1024(s1)) {
                CLS66.MTH1406(CLS27.MTH904(), s, s1);
                int v = this.FLD1592 - 1;
                this.FLD1592 = v;
                if(v <= 0) {
                    CLS31.MTH1011(this.FLD1593);
                    this.FLD1593 = null;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        String s;
        File file0 = this.FLD1593;
        if(file0 != null) {
            return CLS31.MTH1001(file0);
        }
        try {
            if(TextUtils.isEmpty(this.FLD1595)) {
                File file1 = this.FLD1596;
                if(file1 != null) {
                    s = file1.getAbsolutePath();
                    this.FLD1595 = s;
                }
                else if(TextUtils.isEmpty(this.FLD1591)) {
                    s = "";
                }
                else if(CLS31.MTH1024(this.FLD1591)) {
                    s = this.FLD1591;
                    this.FLD1595 = s;
                }
                else if(CLS31.MTH1021(this.FLD1591)) {
                    s = CLS66.MTH1410(this.FLD1591);
                    if(TextUtils.isEmpty(s)) {
                        s = "";
                    }
                    else {
                        this.FLD1595 = s;
                    }
                }
                else {
                    HashMap hashMap0 = CLS466.MTH6525();
                    if(hashMap0.containsKey(this.FLD1591)) {
                        String s1 = (String)hashMap0.get(this.FLD1591);
                        this.FLD1591 = s1;
                        if(CLS31.MTH1021(s1)) {
                            s = CLS66.MTH1410(this.FLD1591);
                            if(TextUtils.isEmpty(s)) {
                                s = "";
                            }
                            else {
                                this.FLD1595 = s;
                            }
                        }
                        else {
                            s = "";
                        }
                    }
                    else {
                        s = "";
                    }
                }
            }
            else {
                s = this.FLD1595;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            s = "";
        }
        if(CLS31.MTH1024(s)) {
            try {
                if(CLS518.MTH7074(0x20, 0x20, s) != null) {
                    File file2 = new File(s);
                    File file3 = new File(CLS31.MTH1038(CLS27.MTH900()), "_" + file2.getName());
                    this.FLD1593 = file3;
                    CLS31.MTH1025(file2, file3);
                    return true;
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        int v = this.FLD1594;
        return v == -1 ? CLS412.MTH6005(3000, "send_delay_image") : v;
    }

    public final void MTH3223(String s) {
        File file0 = new File(CLS31.MTH980());
        CLS432.MTH6184(file0.getAbsolutePath(), s, ((CLS3)new CLS1274(this, file0, 5)));
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        this.FLD1594 = v;
    }
}

