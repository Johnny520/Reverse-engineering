// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1622;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

public final class CLS966 implements CLS16 {
    public final int FLD1886;
    public final CLS1622 FLD1887;
    public final CLS1173 FLD1888;
    public final String FLD1889;

    public CLS966(CLS1173 ᵢᵢ0, CLS1622 ˑٴ0, String s, int v) {
        this.FLD1886 = v;
        this.FLD1888 = ᵢᵢ0;
        this.FLD1887 = ˑٴ0;
        this.FLD1889 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS1173 ᵢᵢ0 = this.FLD1888;
        String s1 = this.FLD1889;
        CLS1622 ˑٴ0 = this.FLD1887;
        switch(this.FLD1886) {
            case 0: {
                ᵢᵢ0.getClass();
                try {
                    HashSet hashSet1 = new HashSet();
                    String s4 = ˑٴ0.MTH7285();
                    if(!TextUtils.isEmpty(s4)) {
                        hashSet1.addAll(Arrays.asList(s4.split(Pattern.quote("|"))));
                    }
                    hashSet1.add(s);
                    String s5 = TextUtils.join("|", hashSet1);
                    ᵢᵢ0.FLD2151.MTH922(s5, s1 + "_keyword_excl_text");
                    ˑٴ0.MTH7277(s5);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                ᵢᵢ0.getClass();
                try {
                    HashSet hashSet2 = new HashSet();
                    String s6 = ˑٴ0.MTH7285();
                    if(!TextUtils.isEmpty(s6)) {
                        hashSet2.addAll(Arrays.asList(s6.split(Pattern.quote("|"))));
                    }
                    hashSet2.add(s);
                    String s7 = TextUtils.join("|", hashSet2);
                    ᵢᵢ0.FLD2151.MTH922(s7, s1 + "_notif_keyword_text");
                    ˑٴ0.MTH7277(s7);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                ᵢᵢ0.getClass();
                try {
                    HashSet hashSet0 = new HashSet();
                    String s2 = ˑٴ0.MTH7285();
                    if(!TextUtils.isEmpty(s2)) {
                        hashSet0.addAll(Arrays.asList(s2.split(Pattern.quote("|"))));
                    }
                    hashSet0.add(s);
                    String s3 = TextUtils.join("|", hashSet0);
                    ᵢᵢ0.FLD2151.MTH922(s3, s1 + "_notif_keyword_text");
                    ˑٴ0.MTH7277(s3);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

