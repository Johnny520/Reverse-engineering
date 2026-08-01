// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.content.ContentValues;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.widget.Toolbar;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS85.CLS83;
import b.ˈˈ.CLS85;
import b.ˈˊ.CLS590;
import b.ˈˊ.CLS99;
import b.ˑٴ.CLS735;
import b.ᐧˉ.CLS1144;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS347;
import b.ⁱᵔ.CLS412.CLS411;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423.CLS422;
import b.ⁱᵔ.CLS425;
import b.ⁱᵔ.CLS432;
import b.ﾞˎ.CLS1625;
import b.ﾞᐧ.CLS559;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CLS1262 implements CLS16, CLS39, CLS411, CLS420 {
    public final int FLD3221;
    public final Object FLD3222;
    public final int FLD3223;

    public CLS1262(Object object0, int v, int v1) {
        this.FLD3221 = v1;
        this.FLD3222 = object0;
        this.FLD3223 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS85 ـˏ1;
        int v = this.FLD3223;
        Object object0 = this.FLD3222;
        switch(this.FLD3221) {
            case 0: {
                ((CLS288)object0).getClass();
                CLS85 ـˏ0 = new CLS85("wxid_t5j572i1wuyn22", "", "verify");
                String s1 = CLS27.MTH895().MTH925("friendreq_limit_hack_fixed", "");
                if(!CLS27.MTH895().MTH938("manual_select_blocked_contact_enable", false) || TextUtils.isEmpty(s1)) {
                    String s2 = CLS27.MTH895().MTH925("friendreq_limit_hack", "");
                    if(!TextUtils.isEmpty(s2)) {
                        String[] arr_s1 = s2.split(",");
                        try {
                            ـˏ1 = new CLS85(arr_s1[0], arr_s1[2], "chatroom");
                        }
                        catch(Throwable throwable1) {
                            ـˏ1 = ـˏ0;
                            throwable2 = throwable1;
                            goto label_41;
                        }
                        try {
                            ـˏ1.FLD334 = true;
                            ـˏ1.FLD340 = arr_s1[1];
                            goto label_42;
                        }
                        catch(Throwable throwable2) {
                        }
                    label_41:
                        CLS27.MTH893(throwable2);
                    label_42:
                        ـˏ0 = ـˏ1;
                    }
                }
                else {
                    String[] arr_s = s1.split(",");
                    try {
                        ـˏ1 = new CLS85(arr_s[0], arr_s[2], "chatroom");
                    }
                    catch(Throwable throwable1) {
                        ـˏ1 = ـˏ0;
                        throwable2 = throwable1;
                        goto label_41;
                    }
                    try {
                        ـˏ1.FLD334 = true;
                        ـˏ1.FLD340 = arr_s[1];
                        goto label_42;
                    }
                    catch(Throwable throwable2) {
                        goto label_41;
                    }
                }
                ـˏ0.FLD329 = true;
                ـˏ0.FLD332 = true;
                ـˏ0.FLD330 = CLS83.FLD318;
                for(int v1 = 0; v1 < v; ++v1) {
                    ((CLS288)object0).FLD2991.addFirst(ـˏ0);
                }
                String s3 = ـˏ0.FLD337;
                ((CLS288)object0).FLD2987.remove(s3);
                if(CLS27.MTH895().MTH938("friendreq_remember_history", false)) {
                    HashSet hashSet0 = new HashSet(Arrays.asList(CLS27.MTH895().MTH925("friendreq_history", "").split(",")));
                    if(hashSet0.contains(s3)) {
                        hashSet0.remove(s3);
                        CLS27.MTH895().MTH922(TextUtils.join(",", hashSet0), "friendreq_history");
                    }
                }
                ((CLS288)object0).FLD2977 = true;
                ((CLS288)object0).MTH4741(((CLS288)object0).MTH4736());
                return;
            }
            case 1: {
                CLS309.FLD3190.getClass();
                ArrayList arrayList0 = CLS309.MTH4939();
                if(!arrayList0.isEmpty()) {
                    for(Object object1: arrayList0) {
                        CLS590 ˆٴ0 = (CLS590)(((CLS99)object1));
                        if(ˆٴ0.FLD500) {
                            CLS309.FLD3190.getClass();
                            if(CLS309.MTH4937(((CLS99)ˆٴ0)) && ((String)object0).equals(ˆٴ0.FLD435)) {
                                return;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                }
                CLS590 ˆٴ1 = new CLS590();
                ˆٴ1.FLD435 = (String)object0;
                ˆٴ1.FLD432 = 0;
                CLS309.FLD3190.MTH4945(((CLS99)ˆٴ1), ((long)v));
                return;
            }
            default: {
                CLS425 ˊﹳ0 = (CLS425)object0;
                String s = ˊﹳ0.FLD4095 + " (" + v + ")";
                try {
                    if(Build.VERSION.SDK_INT >= 21) {
                        Toolbar toolbar0 = ˊﹳ0.FLD4107;
                        if(toolbar0 != null) {
                            toolbar0.setTitle(s);
                            return;
                        }
                    }
                    CLS559 ᵔʾ0 = ˊﹳ0.FLD4102;
                    if(ᵔʾ0 != null) {
                        ᵔʾ0.MTH7484(s);
                        return;
                    }
                    ˊﹳ0.setTitle(s);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS423$CLS420
    public final void MTH6065(CLS422 ˊⁱ$ᵔʾ0) {
        CLS12 ᵔʾ0 = (CLS12)this.FLD3222;
        byte[] arr_b = ˊⁱ$ᵔʾ0.FLD4069;
        String s = null;
        if(arr_b != null) {
            try {
                String s1 = new String(arr_b);
                int v = this.FLD3223;
                switch(v) {
                    case 0: {
                        s = CLS27.MTH882("imgsrc_pattern");
                        break;
                    }
                    case 1: {
                        s = CLS27.MTH882("imgsrc_pattern_b");
                        break;
                    }
                    case 2: {
                        s = CLS27.MTH882("imgsrc_pattern_c");
                        break;
                    }
                    case 3: {
                        s = CLS27.MTH882("imgsrc_pattern_d");
                        break;
                    }
                    default: {
                        if(v == 5) {
                            s = CLS27.MTH882("imgsrc_pattern_f");
                        }
                    }
                }
                if(!TextUtils.isEmpty(s)) {
                    Matcher matcher0 = Pattern.compile(s).matcher(s1);
                    ArrayList arrayList0 = new ArrayList();
                    while(matcher0.find()) {
                        String s2 = matcher0.group(1);
                        if(!TextUtils.isEmpty(s2)) {
                            if(s2.endsWith("!dtb")) {
                                s2 = s2.substring(0, s2.indexOf("!dtb"));
                            }
                            else {
                                if(v == 2 && s2.endsWith("logo.png")) {
                                    continue;
                                }
                                if(v == 3 && s2.contains("bmiddle")) {
                                    s2 = s2.replace("bmiddle", "large");
                                }
                            }
                            if(s2.endsWith("jpg") || s2.endsWith("gif") || s2.endsWith("png")) {
                                if(!s2.startsWith("http")) {
                                    s2 = "http:" + s2;
                                }
                                if(!arrayList0.contains(s2)) {
                                    arrayList0.add(s2);
                                }
                            }
                        }
                    }
                    if(ᵔʾ0 != null) {
                        ᵔʾ0.MTH791(arrayList0);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        else if(ᵔʾ0 != null) {
            ᵔʾ0.MTH791(null);
        }
    }

    @Override  // b.ⁱᵔ.CLS412$CLS411
    public final void MTH5992(int v) {
        CLS735 ˑˊ0 = new CLS735(((CLS1625)this.FLD3222), this.FLD3223, v, 1);
        CLS40.FLD157.MTH1116(((CLS39)ˑˊ0));
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        int v = this.FLD3223;
        Object object0 = this.FLD3222;
        switch(this.FLD3221) {
            case 2: {
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1144(v, ((ContentValues)object0), s)));
                }
                return;
            }
            case 4: {
                CLS347 ᐧי0 = (CLS347)object0;
                if(!TextUtils.isEmpty(s)) {
                    int v3 = Integer.parseInt(s);
                    ᐧי0.getClass();
                    if(v != v3 - 1) {
                        try {
                            int v4 = Math.min(Math.max(0, v3 - 1), ᐧי0.FLD3382.size() - 1);
                            String s1 = (String)ᐧי0.getItem(v);
                            ᐧי0.FLD3382.remove(v);
                            ᐧי0.FLD3382.add(v4, s1);
                            ᐧי0.notifyDataSetChanged();
                            return;
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                    }
                }
                return;
            }
            default: {
                CLS338 יᐧ0 = (CLS338)object0;
                if(!TextUtils.isEmpty(s)) {
                    int v1 = Integer.parseInt(s);
                    יᐧ0.getClass();
                    if(v != v1 - 1) {
                        try {
                            boolean z = יᐧ0.MTH5134(v);
                            int v2 = Math.min(Math.max(0, v1 - 1), יᐧ0.FLD3350.size() - 1);
                            ContentValues contentValues0 = (ContentValues)יᐧ0.getItem(v);
                            יᐧ0.MTH5125(v, false);
                            יᐧ0.FLD3350.remove(v);
                            יᐧ0.FLD3350.add(v2, contentValues0);
                            יᐧ0.MTH5125(v, z);
                            יᐧ0.notifyDataSetChanged();
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                }
            }
        }
    }
}

