// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS92;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import java.util.ArrayDeque;

public final class CLS295 {
    public static final class CLS294 {
        public Bitmap FLD3042;
        public String FLD3043;
        public String FLD3044;
        public String FLD3045;
        public String FLD3046;
        public int FLD3047;
        public int FLD3048;
        public int FLD3049;

    }

    public final Handler FLD3050;
    public boolean FLD3051;
    public final CLS92 FLD3052;
    public final CLS291 FLD3053;
    public final ArrayDeque FLD3054;
    public static final CLS295 FLD3055;
    public CLS3 FLD3056;

    static {
        CLS295.FLD3055 = new CLS295();
    }

    public CLS295() {
        this.FLD3051 = false;
        this.FLD3052 = new CLS92(1800000);
        this.FLD3054 = new ArrayDeque();
        this.FLD3050 = CLS40.FLD157.MTH1121();
        this.FLD3053 = new CLS291(1, this);
    }

    public final CLS294 MTH4789(Object object0, String s) {
        if(!CLS27.MTH890("searchContactField1")) {
            return null;
        }
        try {
            String s1 = "";
            Object object1 = CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3194(object0, CLS27.MTH897("searchContactField1")), CLS27.MTH897("searchContactField2")), CLS27.MTH897("searchContactField3"));
            if(object1 == null) {
                return null;
            }
            String s2 = TextUtils.isEmpty(CLS27.MTH897("searchContactFieldAlias")) ? "" : ((String)CLS166.MTH3194(object1, CLS27.MTH897("searchContactFieldAlias")));
            String s3 = TextUtils.isEmpty(CLS27.MTH897("searchContactFieldTicket")) ? "" : ((String)CLS166.MTH3194(object1, CLS27.MTH897("searchContactFieldTicket")));
            String s4 = TextUtils.isEmpty(CLS27.MTH897("searchContactFieldV1")) ? "" : "" + CLS166.MTH3194(object1, CLS27.MTH897("searchContactFieldV1"));
            String s5 = TextUtils.isEmpty(CLS27.MTH897("searchContactFieldNickname")) ? "" : "" + CLS166.MTH3194(object1, CLS27.MTH897("searchContactFieldNickname"));
            String s6 = TextUtils.isEmpty(CLS27.MTH897("searchContactFieldAvatar")) ? "" : "" + CLS166.MTH3194(object1, CLS27.MTH897("searchContactFieldAvatar"));
            String s7 = TextUtils.isEmpty(CLS27.MTH897("searchContactFieldCountry")) ? "" : "" + CLS166.MTH3194(object1, CLS27.MTH897("searchContactFieldCountry"));
            String s8 = TextUtils.isEmpty(CLS27.MTH897("searchContactFieldProvince")) ? "" : "" + CLS166.MTH3194(object1, CLS27.MTH897("searchContactFieldProvince"));
            if(!TextUtils.isEmpty(CLS27.MTH897("searchContactFieldCity"))) {
                s1 = "" + CLS166.MTH3194(object1, CLS27.MTH897("searchContactFieldCity"));
            }
            int v = -1;
            int v1 = TextUtils.isEmpty(CLS27.MTH897("searchContactFieldSearchType")) ? -1 : CLS166.MTH3181(object1, CLS27.MTH897("searchContactFieldSearchType"));
            if(!TextUtils.isEmpty(CLS27.MTH897("searchContactFieldSex"))) {
                v = CLS166.MTH3181(object1, CLS27.MTH897("searchContactFieldSex"));
            }
            CLS294 ˑٴ$ˆٴ0 = new CLS294();
            ˑٴ$ˆٴ0.FLD3048 = 1;
            ˑٴ$ˆٴ0.FLD3047 = v1;
            ˑٴ$ˆٴ0.FLD3043 = CLS502.MTH6937(s3);
            ˑٴ$ˆٴ0.FLD3049 = v;
            CLS502.MTH6937(s2);
            ˑٴ$ˆٴ0.FLD3045 = CLS502.MTH6937(s5);
            ˑٴ$ˆٴ0.FLD3046 = CLS502.MTH6937(s4);
            ˑٴ$ˆٴ0.FLD3044 = CLS66.MTH1435(CLS502.MTH6937(s7), CLS502.MTH6937(s8), CLS502.MTH6937(s1));
            String s9 = CLS502.MTH6937(s6);
            if(!CLS502.MTH6933(s9)) {
                CLS518.MTH7068(s9, ((CLS516)new CLS1229(2, ˑٴ$ˆٴ0)));
            }
            this.FLD3052.MTH1746(s, ˑٴ$ˆٴ0);
            return ˑٴ$ˆٴ0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    public final void MTH4790(String s) {
        if(this.FLD3052.MTH1745(s)) {
            return;
        }
        this.FLD3054.addLast(s);
        if(!this.FLD3051) {
            this.FLD3051 = true;
            this.FLD3050.post(this.FLD3053);
        }
    }
}

