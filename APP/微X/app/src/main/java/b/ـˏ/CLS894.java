// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ˆٴ.CLS66;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS412;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

public final class CLS894 implements CLS169 {
    public String FLD1620;
    public byte[] FLD1621;
    public final InputStream FLD1622;
    public int FLD1623;
    public int FLD1624;

    public CLS894() {
        this.FLD1624 = -1;
    }

    public CLS894(int v, InputStream inputStream0) {
        this.FLD1624 = -1;
        this.FLD1623 = v;
        this.FLD1622 = inputStream0;
    }

    public CLS894(int v, String s) {
        this.FLD1624 = -1;
        this.FLD1623 = v;
        this.FLD1620 = s;
    }

    public CLS894(int v, byte[] arr_b) {
        this.FLD1624 = -1;
        this.FLD1623 = v;
        this.FLD1621 = arr_b;
    }

    // 此方法包含解密的字符串
    public CLS894(String s, String s1) {
        this.FLD1624 = -1;
        this.FLD1623 = Integer.parseInt(s.split(":")[1]);
        this.FLD1620 = CLS66.MTH1483(s1);
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3228() {
        return 13;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        return this.MTH3232() + 120000;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3230(String s) {
        String s1 = this.FLD1620;
        if(s1 == null) {
            byte[] arr_b = this.FLD1621;
            if(arr_b == null) {
                InputStream inputStream0 = this.FLD1622;
                if(inputStream0 != null) {
                    int v2 = this.FLD1623;
                    if(inputStream0 != null) {
                        try {
                            String s5 = CLS66.MTH1456(s);
                            if(CLS31.MTH1037(inputStream0, new File(CLS66.MTH1483(s5)))) {
                                CLS66.MTH1378(v2, s5);
                                return;
                            }
                        }
                        catch(Throwable throwable2) {
                            CLS27.MTH893(throwable2);
                        }
                    }
                }
            }
            else {
                int v1 = this.FLD1623;
                if(arr_b != null && arr_b.length != 0) {
                    try {
                        String s3 = CLS66.MTH1456(s);
                        String s4 = CLS66.MTH1483(s3);
                        if(CLS31.MTH1037(new ByteArrayInputStream(arr_b), new File(s4))) {
                            CLS66.MTH1378(v1, s3);
                            return;
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                        return;
                    }
                }
            }
        }
        else {
            int v = this.FLD1623;
            if(!TextUtils.isEmpty(s1)) {
                try {
                    String s2 = CLS66.MTH1456(s);
                    if(CLS31.MTH976(s1, CLS66.MTH1483(s2))) {
                        CLS66.MTH1378(v, s2);
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    return;
                }
            }
        }
        try {
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        return this.FLD1620 == null ? this.FLD1621 != null || this.FLD1622 != null : CLS31.MTH1024(this.FLD1620);
    }

    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        int v = this.FLD1624;
        return v == -1 ? CLS412.MTH6005(3000, "send_delay_voice") : v;
    }

    // 此方法包含解密的字符串
    public final void MTH3304(String s) {
        String s1 = Long.toHexString(System.currentTimeMillis());
        String s2 = CLS34.MTH1079(4101558257892250421L, new StringBuilder(), s1, 4101558330906694453L);
        Object[] arr_object = {s, s2, s1, new CLS1274(this, new File(CLS31.MTH1038(CLS27.MTH900()), s2), 7)};
        CLS21.FLD76.MTH818("tts2", arr_object);
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        this.FLD1624 = v;
    }
}

