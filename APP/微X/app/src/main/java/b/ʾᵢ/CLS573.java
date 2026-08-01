// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS82;
import b.ˑٴ.CLS629;
import b.ˑٴ.CLS687;
import b.ˑٴ.CLS794.CLS793;
import b.ˑٴ.CLS794;
import b.ˑٴ.CLS877;
import b.ᐧˉ.CLS1145;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS210;
import b.ᵔʾ.CLS1262;
import b.ᵔʾ.CLS286;
import b.ⁱᵔ.CLS1392;
import b.ⁱᵔ.CLS502;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS559;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS573 implements CLS12 {
    public final int FLD140;
    public final Object FLD141;

    public CLS573(int v, Object object0) {
        this.FLD140 = v;
        this.FLD141 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        Object object1 = this.FLD141;
        switch(this.FLD140) {
            case 0: {
                CLS17 ﾞٴ0 = (CLS17)object1;
                Intent intent0 = (Intent)object0;
                if(intent0 != null) {
                    ArrayList arrayList0 = new ArrayList();
                    try {
                        ClipData clipData0 = Build.VERSION.SDK_INT < 16 ? null : intent0.getClipData();
                        if(clipData0 == null) {
                            Uri uri0 = intent0.getData();
                            if(uri0 != null) {
                                arrayList0.add(uri0);
                            }
                        }
                        else {
                            for(int v1 = 0; v1 < clipData0.getItemCount(); ++v1) {
                                arrayList0.add(clipData0.getItemAt(v1).getUri());
                            }
                        }
                        ﾞٴ0.MTH796(new Object[]{null, arrayList0, 2});
                        return;
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 1: {
                ((CLS793)object1).getClass();
                if(!TextUtils.isEmpty(((String)object0)) && ((String)object0).startsWith("https://weixin.qq.com/")) {
                    CLS794 ᴵʽ0 = ((CLS793)object1).FLD1143;
                    if(ᴵʽ0.FLD1445.MTH938("autojoinqr_delay_enable", false)) {
                        int v2 = ᴵʽ0.FLD1445.MTH927(0, "autojoinqr_delay");
                        if(v2 != 0) {
                            CLS1262 ﾞˎ0 = new CLS1262(((String)object0), v2, 1);
                            CLS40.FLD157.MTH1124(((CLS39)ﾞˎ0));
                            return;
                        }
                    }
                    CLS286.FLD2962.MTH4706(0, ((String)object0));
                    return;
                }
                return;
            }
            case 2: {
                ((CLS629)object1).getClass();
                CLS687 ˉʾ0 = new CLS687(((CLS629)object1), object0);
                CLS40.FLD157.MTH1116(((CLS39)ˉʾ0));
                return;
            }
            case 3: {
                CLS21.FLD76.MTH819("chat.menu.config", new Object[]{object0, object1});
                return;
            }
            case 4: {
                ((CLS877)object1).getClass();
                CLS29 ˎᵢ0 = ((CLS877)object1).FLD1445;
                ˎᵢ0.MTH922(((String)object0), "moments_container_selected");
                String s = "";
                if(!TextUtils.isEmpty(((String)object0))) {
                    String s1 = ˎᵢ0.MTH925(CLS182.MTH3484(4102189850012996405L, new StringBuilder(), ((String)object0)), "");
                    if(!TextUtils.isEmpty(s1)) {
                        HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s1)));
                        hashSet0.add(CLS27.MTH904());
                        s = " userName in (\'" + TextUtils.join("\',\'", hashSet0) + "\') AND ";
                    }
                }
                ˎᵢ0.MTH922(s, "moments_container_filter");
                CLS66.MTH1373();
                return;
            }
            case 5: {
                ((CLS210)object1).getClass();
                ((CLS210)object1).FLD2007.MTH7277("#file " + ((File)object0).getAbsolutePath());
                return;
            }
            case 6: {
                ((CLS1145)object1).getClass();
                Integer integer0 = ((ContentValues)object0).getAsInteger("startH");
                Integer integer1 = ((ContentValues)object0).getAsInteger("startM");
                Integer integer2 = ((ContentValues)object0).getAsInteger("endH");
                Integer integer3 = ((ContentValues)object0).getAsInteger("endM");
                ((CLS1145)object1).FLD2151.MTH922(integer0 + ":" + integer1 + ";" + integer2 + ":" + integer3, "darkmode_timeframe");
                return;
            }
            case 7: {
                if(((CLS557)object0) != null) {
                    CLS559 ᵔʾ0 = new CLS559(((CLS557)object0));
                    String s2 = new File(CLS31.MTH1038(((Activity)object1)), "wx_temp_voice.wav").getAbsolutePath();
                    ᵔʾ0.MTH7485(s2);
                    CLS1392 ˈˊ0 = new CLS1392(((Activity)object1), s2, 1);
                    CLS40.FLD157.MTH1116(((CLS39)ˈˊ0));
                }
                return;
            }
            default: {
                CLS82 יﹳ0 = (CLS82)object1;
                long v = (long)(((Long)object0));
                if(v != ((long)(((int)v)))) {
                    throw new ArithmeticException();
                }
                יﹳ0.getClass();
                try {
                    יﹳ0.FLD315.put("delay", ((int)v));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

