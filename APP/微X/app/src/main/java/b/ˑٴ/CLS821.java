// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Pair;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS38.CLS37;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS283;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS502;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CLS821 implements CLS37 {
    public final int FLD1250;
    public final CLS140 FLD1251;

    public CLS821(CLS140 ﹶˑ0, int v) {
        this.FLD1250 = v;
        this.FLD1251 = ﹶˑ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        CLS140 ﹶˑ0 = this.FLD1251;
        boolean z = true;
        switch(this.FLD1250) {
            case 0: {
                if(!((CLS772)ﹶˑ0).FLD1447.FLD1407.MTH5947("_config_autoreply") && ((CLS772)ﹶˑ0).FLD1445.MTH938("autoreply_master_enable", false)) {
                    String s1 = (String)arr_object[0];
                    return TextUtils.isEmpty(s1) || CLS372.MTH5400(s1) || s1.equals(CLS27.MTH904()) || !CLS426.MTH6126(s1) && !((CLS772)ﹶˑ0).FLD1444.MTH5302(s1) ? null : Pair.create(CLS27.MTH889("config_autoreply"), "autoreply");
                }
                return null;
            }
            case 1: {
                ((CLS631)ﹶˑ0).getClass();
                String s2 = (String)arr_object[0];
                if(TextUtils.isEmpty(s2)) {
                    z = false;
                }
                else {
                    int v1 = s2.length();
                    if(v1 <= 6000 && (v1 <= 500 || !CLS502.MTH6935(((CLS631)ﹶˑ0).FLD562, s2))) {
                        if(v1 > 3000) {
                            Pattern pattern0 = ((CLS631)ﹶˑ0).FLD564;
                            if(pattern0 != null) {
                                String s3 = s2.replaceAll(" |\n|\r", "");
                                if(!TextUtils.isEmpty(s3)) {
                                    Matcher matcher0 = pattern0.matcher(s3);
                                    HashMap hashMap0 = new HashMap();
                                    while(matcher0.find()) {
                                        for(int v2 = 1; v2 <= matcher0.groupCount(); ++v2) {
                                            String s4 = matcher0.group(v2);
                                            if(TextUtils.isEmpty(s4) || !CLS502.MTH6935(((CLS631)ﹶˑ0).FLD563, s4)) {
                                                if(hashMap0.containsKey(s4)) {
                                                    int v3 = (int)(((Integer)hashMap0.get(s4)));
                                                    hashMap0.put(s4, ((int)(v3 + 1)));
                                                    if(s4.length() > 100 || v3 + 1 >= 10) {
                                                        return true;
                                                    }
                                                }
                                                else {
                                                    hashMap0.put(s4, 1);
                                                }
                                            }
                                        }
                                    }
                                    char[] arr_c = s3.toCharArray();
                                    int v5 = 0;
                                    for(int v4 = 0; v4 < arr_c.length; ++v4) {
                                        String s5 = "" + Character.UnicodeBlock.of(arr_c[v4]);
                                        if(s5.equals("PRIVATE_USE_AREA") || s5.equals("CYRILLIC_EXTENDED_B")) {
                                            ++v5;
                                            if(v5 < 10) {
                                                continue;
                                            }
                                            return Boolean.valueOf(z);
                                        }
                                    }
                                }
                            }
                        }
                        return false;
                    }
                }
                return Boolean.valueOf(z);
            }
            case 2: {
                if(!((CLS725)ﹶˑ0).FLD1447.FLD1407.MTH5947("_config_notification")) {
                    String s6 = (String)arr_object[0];
                    return !CLS426.MTH6126(s6) && !((CLS725)ﹶˑ0).FLD1444.MTH5382(s6) ? null : Pair.create(CLS27.MTH889("personal_notification"), "notifications");
                }
                return null;
            }
            default: {
                ((CLS691)ﹶˑ0).getClass();
                ContentValues contentValues0 = (ContentValues)arr_object[0];
                CLS283 ʾˏ0 = CLS283.FLD2946;
                if(ʾˏ0.FLD2943 && CLS182.MTH3474(4102171196970029877L, contentValues0) == 10000) {
                    String s = contentValues0.getAsString("talker");
                    if(!s.equals(CLS27.MTH904()) && !CLS426.MTH6126(s) && !CLS372.MTH5400(s)) {
                        int v = CLS412.MTH6002() ? 3 : 0;
                        return ((CLS691)ﹶˑ0).FLD1445.MTH927(v, "scan_zombie_method") == 2 && !CLS481.MTH6686(((CLS691)ﹶˑ0).FLD782, contentValues0) && ʾˏ0.FLD2952.contains(s);
                    }
                    return false;
                }
                return false;
            }
        }
    }
}

