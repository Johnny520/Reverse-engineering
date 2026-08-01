// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ﾞˎ.CLS1622;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;

public final class CLS905 implements CLS16 {
    public final int FLD1684;
    public final CLS1622 FLD1685;
    public final CLS997 FLD1686;

    public CLS905(CLS997 ˋ0, CLS1622 ˑٴ0, int v) {
        this.FLD1684 = v;
        this.FLD1686 = ˋ0;
        this.FLD1685 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        int v = 0;
        CLS1622 ˑٴ0 = this.FLD1685;
        CLS997 ˋ0 = this.FLD1686;
        switch(this.FLD1684) {
            case 0: {
                ˋ0.getClass();
                String s4 = ˑٴ0.MTH7285();
                ArrayList arrayList1 = new ArrayList();
                HashSet hashSet1 = new HashSet();
                String[] arr_s1 = s4.split(Pattern.quote("|"));
                while(v < arr_s1.length) {
                    String s5 = arr_s1[v];
                    if(!TextUtils.isEmpty(s5) && !hashSet1.contains(s5)) {
                        hashSet1.add(s5);
                        arrayList1.add(s5);
                    }
                    ++v;
                }
                if(!hashSet1.contains(s)) {
                    arrayList1.add(s);
                }
                String s6 = TextUtils.join("|", arrayList1);
                ˑٴ0.MTH7277(s6);
                ˋ0.FLD2151.MTH922(s6, "auto_comment_like_filter");
                return;
            }
            case 1: {
                ˋ0.getClass();
                String s7 = ˑٴ0.MTH7285();
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                String[] arr_s2 = s7.split(Pattern.quote("|"));
                while(v < arr_s2.length) {
                    String s8 = arr_s2[v];
                    if(!TextUtils.isEmpty(s8) && !hashSet2.contains(s8)) {
                        hashSet2.add(s8);
                        arrayList2.add(s8);
                    }
                    ++v;
                }
                if(!hashSet2.contains(s)) {
                    arrayList2.add(s);
                }
                String s9 = TextUtils.join("|", arrayList2);
                ˑٴ0.MTH7277(s9);
                ˋ0.FLD2151.MTH922(s9, "moment_filter");
                return;
            }
            case 2: {
                ˋ0.getClass();
                String s10 = ˑٴ0.MTH7285();
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet3 = new HashSet();
                String[] arr_s3 = s10.split(Pattern.quote("|"));
                while(v < arr_s3.length) {
                    String s11 = arr_s3[v];
                    if(!TextUtils.isEmpty(s11) && !hashSet3.contains(s11)) {
                        hashSet3.add(s11);
                        arrayList3.add(s11);
                    }
                    ++v;
                }
                if(!hashSet3.contains(s)) {
                    arrayList3.add(s);
                }
                String s12 = TextUtils.join("|", arrayList3);
                ˑٴ0.MTH7277(s12);
                ˋ0.FLD2151.MTH922(s12, "auto_comment_allowed_filter");
                return;
            }
            default: {
                ˋ0.getClass();
                String s1 = ˑٴ0.MTH7285();
                ArrayList arrayList0 = new ArrayList();
                HashSet hashSet0 = new HashSet();
                String[] arr_s = s1.split(Pattern.quote("|"));
                while(v < arr_s.length) {
                    String s2 = arr_s[v];
                    if(!TextUtils.isEmpty(s2) && !hashSet0.contains(s2)) {
                        hashSet0.add(s2);
                        arrayList0.add(s2);
                    }
                    ++v;
                }
                if(!hashSet0.contains(s)) {
                    arrayList0.add(s);
                }
                String s3 = TextUtils.join("|", arrayList0);
                ˑٴ0.MTH7277(s3);
                ˋ0.FLD2151.MTH922(s3, "auto_like_allowed_filter");
            }
        }
    }
}

