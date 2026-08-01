// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS412;

public final class CLS893 implements CLS169 {
    public final int FLD1617;
    public int FLD1618;
    public final Object FLD1619;

    public CLS893(int v, Object object0) {
        this.FLD1617 = v;
        this.FLD1618 = -1;
        this.FLD1619 = object0;
        super();
    }

    // 此方法包含解密的字符串
    public CLS893(String s, String s1, String s2, String s3) {
        this.FLD1617 = 1;
        super();
        this.FLD1618 = -1;
        if(TextUtils.isEmpty(s3)) {
            s3 = "[位置]";
        }
        this.FLD1619 = String.format(CLS27.MTH882("location_msg2"), s, s1, s2, s3);
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3228() {
        switch(this.FLD1617) {
            case 0: {
                return 6;
            }
            case 1: {
                return 1;
            }
            default: {
                return 7;
            }
        }
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        switch(this.FLD1617) {
            case 0: {
                return this.MTH3232() + 30000;
            }
            case 1: {
                return this.MTH3232() + 15000;
            }
            default: {
                return this.MTH3232() + 30000;
            }
        }
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3230(String s) {
        Object object0 = this.FLD1619;
        switch(this.FLD1617) {
            case 0: {
                CLS66.MTH1496(s, ((String)object0));
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(((String)object0))) {
                    CLS66.MTH1468(0x30, s, ((String)object0));
                }
                return;
            }
            default: {
                CLS66.MTH1361(CLS27.MTH900(), object0, s);
            }
        }
    }

    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        return this.FLD1617 == 1 ? !TextUtils.isEmpty(((String)this.FLD1619)) : true;
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        switch(this.FLD1617) {
            case 0: {
                return this.FLD1618 == -1 ? CLS412.MTH6005(3000, "send_delay_text") : this.FLD1618;
            }
            case 1: {
                return this.FLD1618 == -1 ? CLS412.MTH6005(3000, "send_delay_text") : this.FLD1618;
            }
            default: {
                return this.FLD1618 == -1 ? CLS412.MTH6005(3000, "send_delay_text") : this.FLD1618;
            }
        }
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        switch(this.FLD1617) {
            case 0: {
                this.FLD1618 = v;
                return;
            }
            case 1: {
                this.FLD1618 = v;
                return;
            }
            default: {
                this.FLD1618 = v;
            }
        }
    }
}

