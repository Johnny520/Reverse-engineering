// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.os.Handler;
import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS85;
import b.ˈˈ.CLS91;
import b.יᐧ.CLS154;
import b.יᐧ.CLS158.CLS157;
import b.יᐧ.CLS158;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS485.CLS484;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS288 {
    public boolean FLD2975;
    public final ArrayDeque FLD2976;
    public boolean FLD2977;
    public final CLS158 FLD2978;
    public CLS3 FLD2979;
    public CLS484 FLD2980;
    public final Handler FLD2981;
    public int FLD2982;
    public int FLD2983;
    public final Handler FLD2984;
    public int FLD2985;
    public long FLD2986;
    public final HashSet FLD2987;
    public final CLS287 FLD2988;
    public static final CLS288 FLD2989;
    public int FLD2990;
    public final ArrayDeque FLD2991;
    public final CLS287 FLD2992;

    static {
        CLS288.FLD2989 = new CLS288();
    }

    public CLS288() {
        public final class CLS1230 implements CLS157 {
            public final CLS288 FLD2974;

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
            }

            // 此方法包含解密的字符串
            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                int v1;
                try {
                    CLS85 ـˏ0 = (CLS85)ⁱʾ0.MTH3152();
                    String s = "";
                    CLS288 ˈˊ0 = CLS288.this;
                    if(ـˏ0 == null) {
                        ˈˊ0.MTH4744(CLS27.MTH889("friendrequest_stopped"));
                        return;
                    }
                    if(!ـˏ0.FLD332) {
                        ˈˊ0.getClass();
                        CLS91 ᵔʾ0 = ((CLS44)CLS40.FLD157.MTH1118(CLS44.class)).MTH1184("_FRIENDREQUEST_INTRO_");
                        if(ᵔʾ0 != null) {
                            s = ᵔʾ0.MTH1735();
                        }
                    }
                    ـˏ0.FLD333 = s;
                    CLS66.MTH1462(ـˏ0);
                    ˈˊ0.FLD2986 = System.currentTimeMillis();
                    int v = 0;
                    if(ـˏ0.FLD332) {
                        v1 = CLS27.MTH895().MTH927(0, "friend_request_limitbypass_delay");
                    }
                    else {
                        int v2 = CLS412.MTH6005(25000, "friend_request_delay");
                        if(v2 != 0) {
                            v = CLS412.MTH6015(CLS412.MTH6007(3000, v2, v2 - 5000), v2 + 10000);
                        }
                        if(!ˈˊ0.MTH4726()) {
                            ˈˊ0.FLD2984.postDelayed(ˈˊ0.FLD2988, ((long)(v2 + 300000)));
                        }
                        v1 = v;
                    }
                    ⁱʾ0.MTH3156(((long)v1));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        this.FLD2977 = false;
        this.FLD2975 = false;
        this.FLD2986 = 0L;
        this.FLD2983 = 0;
        this.FLD2990 = 0;
        this.FLD2982 = 0;
        this.FLD2985 = 0;
        this.FLD2991 = new ArrayDeque();
        this.FLD2976 = new ArrayDeque();
        this.FLD2987 = new HashSet();
        this.FLD2978 = new CLS158(((CLS157)new CLS1230(this)), 25000L);
        this.FLD2981 = CLS40.FLD157.MTH1121();
        this.FLD2992 = new CLS287(this, 0);
        this.FLD2984 = CLS40.FLD157.MTH1121();
        this.FLD2988 = new CLS287(this, 1);
    }

    public final boolean MTH4726() {
        return this.FLD2991.isEmpty();
    }

    public final int MTH4727() {
        return this.FLD2991.size();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static int MTH4728() {
        return CLS481.MTH6691("friendreq_success_day_cnt");
    }

    // 此方法包含解密的字符串
    public final void MTH4729(String s) {
        this.FLD2987.add(s);
        if(CLS27.MTH895().MTH938("friendreq_remember_history", false)) {
            HashSet hashSet0 = new HashSet(Arrays.asList(CLS27.MTH895().MTH925("friendreq_history", "").split(",")));
            if(hashSet0.contains(s)) {
                return;
            }
            hashSet0.add(s);
            CLS27.MTH895().MTH922(TextUtils.join(",", hashSet0), "friendreq_history");
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final boolean MTH4730(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        if(this.FLD2987.contains(s)) {
            return true;
        }
        return CLS27.MTH895().MTH938("friendreq_remember_history", false) ? CLS502.MTH6934(CLS27.MTH895().MTH925("friendreq_history", ""), new String[]{s}) : false;
    }

    public final void MTH4731(CLS85 ـˏ0) {
        String s = ـˏ0.FLD337;
        if(!this.MTH4730(s) && !CLS371.FLD3470.MTH5382(s)) {
            boolean z = false;
            ArrayDeque arrayDeque0 = this.FLD2991;
            if(!arrayDeque0.isEmpty()) {
                for(Object object0: arrayDeque0) {
                    if(((CLS85)object0).FLD337.equals(s)) {
                        z = true;
                        break;
                    }
                }
            }
            if(!z) {
                arrayDeque0.addLast(ـˏ0);
            }
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static int MTH4732() {
        return CLS27.MTH895().MTH927(0, "friendreq_success_cnt");
    }

    public final void MTH4733() {
        if(!this.FLD2975) {
            return;
        }
        this.FLD2975 = false;
        this.FLD2977 = true;
        this.MTH4741(this.MTH4736());
    }

    // 此方法包含解密的字符串
    public final void MTH4734() {
        if(this.FLD2975) {
            this.MTH4733();
            return;
        }
        if(!this.FLD2977 && !this.MTH4726()) {
            this.FLD2982 = 0;
            this.FLD2985 = 0;
            if(CLS27.MTH895().MTH938("friendreq_notif_enable", false)) {
                CLS485 ᐧﾞ0 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
                String s = CLS27.MTH889("friendreq");
                String s1 = CLS27.MTH889("start_friend_request");
                ᐧﾞ0.getClass();
                this.FLD2980 = CLS485.MTH6746("progress", s, s1);
            }
            this.FLD2977 = true;
            this.MTH4741(this.MTH4736());
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4735(CLS85 ـˏ0) {
        int v1;
        int v = 0;
        if(ـˏ0.FLD332) {
            v1 = CLS27.MTH895().MTH927(0, "friend_request_limitbypass_delay");
        }
        else {
            int v2 = CLS412.MTH6005(25000, "friend_request_delay");
            if(v2 != 0) {
                v = CLS412.MTH6015(CLS412.MTH6007(3000, v2, v2 - 5000), v2 + 10000);
            }
            v1 = v;
        }
        this.FLD2978.MTH3150(ـˏ0);
        this.FLD2978.MTH3156(((long)v1));
        this.FLD2978.MTH3149(((long)v1));
    }

    public final CLS85 MTH4736() {
        return (CLS85)this.FLD2991.peek();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH4737() {
        this.FLD2987.clear();
        CLS27.MTH895().MTH922("", "friendreq_history");
    }

    // 此方法包含解密的字符串
    public final void MTH4738(String s) {
        this.MTH4745();
        this.FLD2976.addLast(s);
        long v = (long)CLS412.MTH6005(25000, "friend_search_delay");
        this.FLD2981.postDelayed(this.FLD2992, v);
    }

    public final void MTH4739() {
        if(!this.FLD2977) {
            return;
        }
        this.FLD2984.removeCallbacks(this.FLD2988);
        this.FLD2975 = true;
    }

    // 此方法包含解密的字符串
    public final void MTH4740() {
        CLS27.MTH895().MTH922(0, "friendreq_req_day_cnt");
        CLS27.MTH895().MTH922(0, "friendreq_req_cnt");
        CLS27.MTH895().MTH922(0, "friendreq_success_day_cnt");
        CLS27.MTH895().MTH922(0, "friendreq_success_cnt");
        if(this.FLD2979 != null) {
            CLS1247 ـˏ0 = new CLS1247(this, 3);
            CLS40.FLD157.MTH1116(((CLS39)ـˏ0));
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4741(CLS85 ـˏ0) {
        if(ـˏ0 == null) {
            if(this.MTH4726()) {
                this.FLD2977 = false;
                this.MTH4744(CLS27.MTH889("friendrequest_stopped"));
            }
            return;
        }
        if(this.MTH4730(ـˏ0.FLD337)) {
            this.MTH4745();
            this.MTH4741(this.MTH4736());
            return;
        }
        if(ـˏ0.FLD332 && !TextUtils.isEmpty(CLS66.MTH1423(ـˏ0.FLD337))) {
            this.MTH4735(ـˏ0);
            return;
        }
        ++this.FLD2982;
        if(CLS27.MTH895().MTH938("friendreq_notif_enable", false)) {
            CLS485 ᐧﾞ0 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
            CLS484 ᐧﾞ$ˆٴ0 = this.FLD2980;
            String s = CLS27.MTH889("friendreq_result");
            Object[] arr_object = {this.FLD2982, this.FLD2991.size(), this.FLD2985};
            int v = this.FLD2982;
            ᐧﾞ0.getClass();
            CLS485.MTH6725(ᐧﾞ$ˆٴ0, String.format(s, arr_object), Math.round(v / this.FLD2991.size() * 100));
        }
        if(CLS27.MTH895().MTH938("friendreq_auto_cycle_type", false) && CLS500.FLD4928.MTH6895("friend_request_type")) {
            String s1 = CLS27.MTH895().MTH925("friendreq_cycle_types", "");
            if(!TextUtils.isEmpty(s1)) {
                try {
                    ArrayList arrayList0 = new ArrayList(Arrays.asList(s1.split(",")));
                    ـˏ0.FLD338 = CLS372.MTH5413(((String)arrayList0.get(this.FLD2983 % arrayList0.size())));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        CLS154 ٴـ0 = new CLS154(new CLS1252(this, ـˏ0, 0), new CLS1252(this, ـˏ0, 1), new CLS1252(this, ـˏ0, 2), new CLS1247(this, 0));
        ٴـ0.FLD1545.post(ٴـ0.FLD1547);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static int MTH4742() {
        return CLS27.MTH895().MTH927(0, "friendreq_req_cnt");
    }

    // 此方法包含解密的字符串
    public final void MTH4743() {
        this.FLD2984.removeCallbacks(this.FLD2988);
        this.FLD2977 = false;
        this.FLD2991.clear();
        CLS158 ⁱʾ0 = this.FLD2978;
        if(ⁱʾ0.FLD1562) {
            ⁱʾ0.FLD1562 = false;
            ⁱʾ0.MTH3153().removeCallbacks(ⁱʾ0.FLD1560);
            ⁱʾ0.MTH3151();
            if(!ⁱʾ0.MTH3154()) {
                ⁱʾ0.FLD1557.clear();
            }
        }
        this.FLD2990 = 0;
        this.FLD2983 = 0;
        if(CLS27.MTH895().MTH938("friendreq_notif_enable", false)) {
            CLS485 ᐧﾞ0 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
            CLS484 ᐧﾞ$ˆٴ0 = this.FLD2980;
            ᐧﾞ0.getClass();
            ᐧﾞ0.MTH6733(ᐧﾞ$ˆٴ0.FLD4732);
        }
        this.MTH4744(CLS27.MTH889("friendrequest_stopped"));
    }

    public final void MTH4744(String s) {
        if(this.FLD2979 != null) {
            CLS412.MTH6013(CLS27.MTH900(), s);
            return;
        }
        CLS412.MTH6011(s);
    }

    public final void MTH4745() {
        CLS85 ـˏ0 = (CLS85)this.FLD2991.poll();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static int MTH4746() {
        return CLS481.MTH6691("friendreq_req_day_cnt");
    }

    // 此方法包含解密的字符串
    public static int MTH4747() {
        if(CLS27.MTH895().MTH938("friendreq_auto_cycle_type", false) && CLS500.FLD4928.MTH6895("friend_request_type")) {
            String s = CLS27.MTH895().MTH925("friendreq_cycle_types", "");
            if(TextUtils.isEmpty(s)) {
                return 0;
            }
            try {
                return new ArrayList(Arrays.asList(s.split(","))).size();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return 0;
    }
}

