// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS304.CLS303;
import b.ᵔʾ.CLS304;
import b.ⁱʾ.CLS319;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS530;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class CLS174 {
    public final ArrayList FLD1676;
    public final String FLD1677;
    public final CLS210 FLD1678;
    public final HashMap FLD1679;
    public final ArrayList FLD1680;
    public CLS319 FLD1681;
    public final WeakReference FLD1682;

    public CLS174(Activity activity0, String s) {
        this.FLD1682 = new WeakReference(activity0);
        this.FLD1677 = s;
        this.FLD1680 = new ArrayList();
        this.FLD1679 = new HashMap();
        this.FLD1676 = CLS304.FLD3172.FLD3169;
        CLS1229 ˆٴ0 = new CLS1229(23, this);
        CLS40.FLD157.MTH1124(((CLS39)ˆٴ0));
        this.FLD1678 = new CLS210(activity0, s);
    }

    // 此方法包含解密的字符串
    public final void MTH3357(String s, CLS303 ᵔʾ$ˆٴ0, boolean z) {
        public final class CLS902 implements CLS2 {
            public final CLS303 FLD1672;

            public CLS902(CLS303 ᵔʾ$ˆٴ0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                this.FLD1672.FLD3162.clear();
                List list0 = Arrays.asList(s.split(","));
                this.FLD1672.FLD3162.addAll(list0);
            }
        }


        public final class CLS903 implements CLS11 {
            public final boolean FLD1673;
            public final CLS174 FLD1674;
            public final CLS303 FLD1675;

            public CLS903(boolean z, CLS303 ᵔʾ$ˆٴ0) {
                this.FLD1673 = z;
                this.FLD1675 = ᵔʾ$ˆٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                if(!this.FLD1673) {
                    CLS304.FLD3172.FLD3169.add(this.FLD1675);
                }
                CLS304.FLD3172.MTH4909();
                CLS174.this.FLD1681.notifyDataSetChanged();
            }
        }

        if(!z) {
            ᵔʾ$ˆٴ0 = new CLS303();
        }
        Object object0 = this.FLD1682.get();
        CLS1622 ˑٴ0 = new CLS1622(((Activity)object0));
        ˑٴ0.MTH800(CLS27.MTH889("title"));
        ᵔʾ$ˆٴ0.getClass();
        ˑٴ0.FLD5252 = new CLS1091(ᵔʾ$ˆٴ0, 0);
        CLS1635 ﾞᵎ0 = new CLS1635(((Activity)object0));
        ﾞᵎ0.MTH800(CLS27.MTH889("enable"));
        ﾞᵎ0.MTH7438(new CLS261(0, ᵔʾ$ˆٴ0));
        CLS1626 ـﹳ0 = new CLS1626(((Activity)object0));
        ـﹳ0.MTH800(CLS27.MTH889("members"));
        ـﹳ0.MTH7325(CLS27.MTH889("click_to_select"));
        ـﹳ0.MTH7324(new CLS209(this, ((Activity)object0), ᵔʾ$ˆٴ0, 0));
        CLS1622 ˑٴ1 = new CLS1622(((Activity)object0));
        ˑٴ1.MTH800(CLS27.MTH889("num_of_msg"));
        ˑٴ1.FLD5252 = new CLS1091(ᵔʾ$ˆٴ0, 1);
        CLS1635 ﾞᵎ1 = new CLS1635(((Activity)object0));
        ﾞᵎ1.MTH800(CLS27.MTH889("random"));
        ﾞᵎ1.MTH7438(new CLS276(ᵔʾ$ˆٴ0, ˑٴ1, 0));
        CLS1625 ـˏ0 = new CLS1625(((Activity)object0));
        ـˏ0.MTH800(CLS27.MTH889("config_responses"));
        ـˏ0.MTH7320(new CLS530(this, ᵔʾ$ˆٴ0, 2));
        CLS523.MTH7133(((Activity)object0), s, ((CLS379)new CLS1213(ˑٴ0, ((Activity)object0), ﾞᵎ0, ـﹳ0, ﾞᵎ1, ˑٴ1, ـˏ0, z, ᵔʾ$ˆٴ0)), null, ((CLS11)new CLS903(this, z, ᵔʾ$ˆٴ0)));
    }
}

