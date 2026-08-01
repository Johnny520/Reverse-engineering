// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.text.TextUtils;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS6;
import b.ʻˑ.CLS7;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS314;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS408;
import b.ⁱᵔ.CLS426;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS565 implements CLS6, CLS7, CLS13, CLS16, CLS39 {
    public final String FLD77;
    public final String FLD78;
    public final int FLD79;

    public CLS565(int v, String s, String s1) {
        this.FLD79 = v;
        this.FLD77 = s;
        this.FLD78 = s1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public void run() {
        String s = this.FLD78;
        String s1 = this.FLD77;
        switch(this.FLD79) {
            case 0: {
                HashSet hashSet0 = new HashSet();
                if(!TextUtils.isEmpty(s1)) {
                    hashSet0.addAll(Arrays.asList(s1.split(";")));
                }
                if(!TextUtils.isEmpty(s)) {
                    hashSet0.addAll(Arrays.asList(s.split(";")));
                }
                if(!hashSet0.isEmpty()) {
                    String s2 = ((CLS408)CLS40.FLD157.MTH1118(CLS408.class)).MTH5946();
                    for(Object object0: hashSet0) {
                        if(s2.contains(((String)object0).trim())) {
                            CLS21.FLD76.MTH822("disable", new Object[0]);
                            CLS21.FLD76.MTH827("core", "unloadFeature", new Object[]{"base"});
                            CLS21.FLD76.MTH820();
                            return;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return;
            }
            case 1: {
                CLS426.MTH6132(s1, s, false);
                return;
            }
            case 2: {
                CLS66.MTH1523(s1, s);
                return;
            }
            case 3: {
                CLS66.MTH1376(s1, s);
                return;
            }
            case 4: {
                CLS66.MTH1523(s1, s);
                return;
            }
            case 5: {
                CLS66.MTH1523(s1, s);
                return;
            }
            case 6: {
                CLS66.MTH1523(s1, s);
                return;
            }
            default: {
                CLS66.MTH1376(s1, s);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS13
    public void MTH770(String s) {
        if(!TextUtils.isEmpty(s)) {
            CLS69 ʾᵢ0 = new CLS69(s);
            Object[] arr_object = {this.FLD77, this.FLD79, ʾᵢ0.MTH1563(), this.FLD78};
            CLS21.FLD76.MTH818("moment_export_video", arr_object);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS6
    public void MTH783(ArrayList arrayList0) {
        Object[] arr_object = {this.FLD77, this.FLD79, CLS66.MTH1437(arrayList0), this.FLD78};
        CLS21.FLD76.MTH818("moment_export_images", arr_object);
    }

    @Override  // b.ʻˑ.CLS16
    public void MTH795(String s) {
        String s1 = this.FLD78;
        String s2 = this.FLD77;
        switch(this.FLD79) {
            case 8: {
                if(!s2.equals(s)) {
                    CLS372.MTH5408(s1, s);
                }
                return;
            }
            case 13: {
                CLS314.FLD3231.MTH5004(s2, s1, s);
                CLS314.FLD3231.MTH5002();
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s) && !s2.equals(s)) {
                    CLS372.MTH5408(s1, s);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public void MTH784(Object object0) {
        String s = this.FLD78;
        String s1 = this.FLD77;
        switch(this.FLD79) {
            case 9: {
                String s3 = CLS182.MTH3489(0x38EC15742B3CD335L, new StringBuilder(), object0);
                CLS21.FLD76.MTH819("b.contactinfoui.menu.config", new Object[]{s3, s1, s});
                return;
            }
            case 10: {
                String s4 = CLS182.MTH3489(4101677353040401205L, new StringBuilder(), object0);
                CLS21.FLD76.MTH819("b.contactinfoui.menu.config", new Object[]{s4, s1, s});
                return;
            }
            case 11: {
                String s5 = CLS182.MTH3489(0x38EC154C2B3CD335L, new StringBuilder(), object0);
                CLS21.FLD76.MTH819("b.singlechatinfoui.menu.config", new Object[]{s5, s1, s});
                return;
            }
            default: {
                String s2 = CLS182.MTH3489(4101676335133152053L, new StringBuilder(), object0);
                CLS21.FLD76.MTH819("b.singlechatinfoui.menu.config", new Object[]{s2, s1, s});
            }
        }
    }
}

