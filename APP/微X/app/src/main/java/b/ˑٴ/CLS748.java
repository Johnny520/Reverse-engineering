// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.graphics.Bitmap;
import android.text.TextUtils;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS93;
import b.ⁱᵔ.CLS1283;
import b.ⁱᵔ.CLS1424;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS748 implements CLS0, CLS39 {
    public final CLS794 FLD960;
    public final String FLD961;
    public final String FLD962;
    public final long FLD963;

    public CLS748(CLS794 ᴵʽ0, String s, String s1, long v) {
        this.FLD960 = ᴵʽ0;
        this.FLD962 = s;
        this.FLD961 = s1;
        this.FLD963 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS794 ᴵʽ0 = this.FLD960;
        ᴵʽ0.getClass();
        String s = this.FLD962;
        if(CLS426.MTH6129(s)) {
            String s1 = CLS27.MTH904();
            String s2 = this.FLD961;
            String s3 = CLS66.MTH1452(s2, s1);
            if(!TextUtils.isEmpty(s3)) {
                String[] arr_s = new String[1];
                arr_s[0] = s3;
                if(CLS502.MTH6934(s, arr_s)) {
                    HashSet hashSet0 = new HashSet();
                    ArrayList arrayList0 = CLS794.MTH2698().MTH1338(0, s2);
                    ArrayList arrayList1 = CLS794.MTH2698().MTH1338(6, s2);
                    StringBuilder stringBuilder0 = new StringBuilder();
                    CLS371 ʻ0 = ᴵʽ0.FLD1444;
                    if(!arrayList1.isEmpty()) {
                        stringBuilder0.append(CLS27.MTH889("show_supermods_list"));
                        for(Object object0: arrayList1) {
                            CLS93 ⁱʾ0 = (CLS93)object0;
                            if(ʻ0.MTH5337(s2, ⁱʾ0.FLD396) && !hashSet0.contains(ⁱʾ0.FLD396)) {
                                hashSet0.add(ⁱʾ0.FLD396);
                                stringBuilder0.append(CLS66.MTH1452(s2, ⁱʾ0.FLD396));
                                stringBuilder0.append("\n");
                            }
                        }
                    }
                    stringBuilder0.append(CLS27.MTH889("show_mods_list"));
                    HashSet hashSet1 = new HashSet();
                    for(Object object1: arrayList0) {
                        CLS93 ⁱʾ1 = (CLS93)object1;
                        if(ʻ0.MTH5337(s2, ⁱʾ1.FLD396) && !hashSet0.contains(ⁱʾ1.FLD396)) {
                            hashSet0.add(ⁱʾ1.FLD396);
                            hashSet1.add(ⁱʾ1.FLD396);
                        }
                    }
                    String s4 = ʻ0.MTH5335(s2);
                    String s5 = ʻ0.MTH5343(s2);
                    String[] arr_s1 = CLS502.MTH6941(s4);
                    for(int v = 0; v < arr_s1.length; ++v) {
                        String s6 = arr_s1[v];
                        if(!TextUtils.isEmpty(s6) && !s6.equals(s5) && CLS66.MTH1383(s2, s6)) {
                            hashSet1.add(s6);
                        }
                    }
                    for(Object object2: hashSet1) {
                        stringBuilder0.append(CLS66.MTH1452(s2, ((String)object2)));
                        stringBuilder0.append("\n");
                    }
                    String s7 = CLS27.MTH889("chatroom_mod_cmdlist");
                    if(!TextUtils.isEmpty(s7)) {
                        stringBuilder0.append(s7);
                    }
                    CLS466.MTH6542(s2, stringBuilder0.toString());
                    ᴵʽ0.FLD1144.put(s2, this.FLD963);
                }
            }
        }
    }

    @Override  // b.ʻˑ.CLS0
    public final void MTH770(String s) {
        String s1 = this.FLD962;
        String s2 = this.FLD961;
        long v = this.FLD963;
        CLS794 ᴵʽ0 = this.FLD960;
        ᴵʽ0.getClass();
        String s3 = CLS66.MTH1410(s);
        if(CLS31.MTH1024(s3)) {
            CLS689 ˉˏ0 = new CLS689(ᴵʽ0, s1, s2, v);
            if(!CLS66.MTH1416(s3, ((CLS12)new CLS1283(((CLS12)new CLS1424(((CLS3)ˉˏ0), 0)), 1)))) {
                Bitmap bitmap0 = CLS518.MTH7060(s3);
                if(bitmap0 != null && CLS21.FLD76.MTH830("isQRCode", new Object[]{bitmap0})) {
                    ˉˏ0.MTH774();
                }
            }
        }
    }
}

