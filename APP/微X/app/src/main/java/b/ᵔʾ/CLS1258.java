// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.text.TextUtils;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS6;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ـˏ.CLS169;
import b.ـˏ.CLS886;
import b.ٴـ.CLS896.CLS170;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS500;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS1258 implements CLS0, CLS6, CLS7, CLS16, CLS39 {
    public final int FLD3198;
    public final String FLD3199;

    public CLS1258(int v, String s) {
        this.FLD3198 = v;
        this.FLD3199 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        String s = this.FLD3199;
        switch(this.FLD3198) {
            case 0: {
                CLS66.MTH1507(s);
                return;
            }
            case 1: {
                HashSet hashSet0 = new HashSet();
                if(!TextUtils.isEmpty(s)) {
                    hashSet0.addAll(Arrays.asList(s.split(";")));
                }
                if(!hashSet0.isEmpty()) {
                    for(Object object0: hashSet0) {
                        String[] arr_s = ((String)object0).split(":");
                        if(CLS390.MTH5618(CLS27.MTH900(), arr_s[1].trim()) && !CLS500.FLD4928.MTH6895(arr_s[0].trim())) {
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
            case 2: {
                HashSet hashSet1 = new HashSet();
                if(!TextUtils.isEmpty(s)) {
                    hashSet1.addAll(Arrays.asList(s.split(";")));
                }
                if(!hashSet1.isEmpty()) {
                    for(Object object1: hashSet1) {
                        String[] arr_s1 = ((String)object1).split(",");
                        if(CLS390.MTH5618(CLS27.MTH900(), arr_s1[0].trim()) && CLS390.MTH5618(CLS27.MTH900(), arr_s1[1].trim())) {
                            CLS21.FLD76.MTH827("core", "setDisableCode", new Object[]{510});
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
            case 3: {
                CLS66.MTH1507(s);
                return;
            }
            case 4: {
                CLS286.FLD2962.MTH4706(1, s);
                return;
            }
            case 5: {
                CLS21.FLD76.MTH829("new_chatroom", new Object[]{s});
                return;
            }
            default: {
                CLS466.MTH6516(new File(s));
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS0
    public final void MTH770(String s) {
        Object[] arr_object = {new CLS170(((CLS169)new CLS886(s)), this.FLD3199)};
        CLS21.FLD76.MTH818("sendMessageForwardItem", arr_object);
    }

    @Override  // b.ʻˑ.CLS6
    public final void MTH783(ArrayList arrayList0) {
        String s = this.FLD3199;
        if(this.FLD3198 == 6) {
            CLS466.MTH6536(s, arrayList0);
            return;
        }
        CLS466.MTH6536(s, arrayList0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        String s1 = this.FLD3199;
        switch(this.FLD3198) {
            case 10: {
                try {
                    String[] arr_s = s.split("#");
                    CLS466.MTH6513(s1, arr_s[1].trim(), arr_s[0].trim());
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 11: {
                if(!TextUtils.isEmpty(s)) {
                    CLS466.MTH6500(s1, s);
                }
                return;
            }
            case 12: {
                CLS466.MTH6515(s1, CLS27.MTH889("groupAnnounce"), "#ga " + s);
                return;
            }
            case 13: {
                CLS466.MTH6515(s1, CLS27.MTH889("changeChatroomName") + ":\n" + s, "#cn " + s);
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    CLS279.FLD2908.getClass();
                    CLS66.MTH1474(CLS371.FLD3470.MTH5297(s1), s);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        String s = this.FLD3199;
        switch(this.FLD3198) {
            case 8: {
                String s1 = CLS182.MTH3489(0x38EC15F72B3CD335L, new StringBuilder(), object0);
                CLS21.FLD76.MTH819("b.chatroominfoui.menu.config", new Object[]{s1, s});
                return;
            }
            case 9: {
                String s2 = CLS182.MTH3489(4101673530519507765L, new StringBuilder(), object0);
                CLS21.FLD76.MTH819("b.chatroominfoui.menu.config", new Object[]{s2, s});
                return;
            }
            default: {
                if(!s.equals(((String)object0))) {
                    CLS279 ʻˑ0 = CLS279.FLD2908;
                    ʻˑ0.getClass();
                    ArrayList arrayList0 = CLS371.FLD3470.MTH5328(s);
                    if(!arrayList0.isEmpty()) {
                        ʻˑ0.MTH4654(((String)object0), arrayList0);
                        CLS279.MTH4652(s);
                    }
                }
            }
        }
    }
}

