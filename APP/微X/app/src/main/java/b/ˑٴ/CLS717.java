// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS283;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS481;
import java.lang.reflect.Method;

public final class CLS717 implements CLS35 {
    public final int FLD853;
    public final CLS691 FLD854;

    public CLS717(CLS691 ˉـ0, int v) {
        this.FLD853 = v;
        this.FLD854 = ˉـ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        int v = 3;
        CLS691 ˉـ0 = this.FLD854;
        if(this.FLD853 == 0) {
            if(!ˉـ0.FLD1447.FLD1410) {
                Object object0 = arr_object[0];
                if("message".equalsIgnoreCase(((String)arr_object[2]))) {
                    ContentValues contentValues0 = (ContentValues)arr_object[3];
                    boolean z = CLS27.MTH901();
                    int v1 = ˉـ0.FLD782;
                    if(!z) {
                        try {
                            String s = contentValues0.getAsString("talker");
                            if(!s.equals(CLS27.MTH904())) {
                                String s1 = contentValues0.getAsString("content");
                                int v2 = (int)contentValues0.getAsInteger("type");
                                if(!CLS481.MTH6686(v1, contentValues0)) {
                                    CLS283.FLD2946.MTH4694(v2, s, s1);
                                }
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                    CLS283 ʾˏ0 = CLS283.FLD2946;
                    if(ʾˏ0.FLD2943 && CLS182.MTH3474(4102170780358202165L, contentValues0) == 10000) {
                        String s2 = contentValues0.getAsString("talker");
                        if(!s2.equals(CLS27.MTH904()) && !CLS426.MTH6126(s2) && !CLS372.MTH5400(s2)) {
                            if(!CLS412.MTH6002()) {
                                v = 0;
                            }
                            if(ˉـ0.FLD1445.MTH927(v, "scan_zombie_method") == 2 && !CLS481.MTH6686(v1, contentValues0) && ʾˏ0.FLD2952.contains(s2)) {
                                try {
                                    Method method0 = object0.getClass().getDeclaredMethod("setResult", Object.class);
                                    method0.setAccessible(true);
                                    method0.invoke(object0, -1L);
                                }
                                catch(Throwable unused_ex) {
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        if(!ˉـ0.FLD1447.FLD1410 && "message".equalsIgnoreCase(((String)arr_object[2]))) {
            ContentValues contentValues1 = (ContentValues)arr_object[3];
            if((contentValues1.containsKey("isSend") ? CLS182.MTH3474(0x38EDD7652B3CD335L, contentValues1) : 0) != 0 && !CLS426.MTH6126(contentValues1.getAsString("talker"))) {
                String s3 = contentValues1.getAsString("content");
                if(contentValues1.containsKey("msgId")) {
                    long v3 = CLS34.MTH1080(0x38EDD7012B3CD335L, contentValues1);
                    CLS283 ʾˏ1 = CLS283.FLD2946;
                    if(ʾˏ1.FLD2954) {
                        CLS29 ˎᵢ0 = CLS27.MTH895();
                        if(!CLS412.MTH6002()) {
                            v = 0;
                        }
                        if(ˎᵢ0.MTH927(v, "scan_zombie_method") == 1 && s3.equals(CLS27.MTH895().MTH925("zombie_scan_msg", "") + "￀￀￀​￀")) {
                            ʾˏ1.FLD2956.add(v3);
                        }
                    }
                }
            }
        }
    }
}

