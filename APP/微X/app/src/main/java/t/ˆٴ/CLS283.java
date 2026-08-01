// Decompiled by JEB v5.42.0.202606242140

package t.ˆٴ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Set;
import t.ˆʿ.CLS269;
import t.ˆʿ.CLS33;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS99;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS132;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ⁱʾ.CLS143;

public final class CLS283 implements CLS143 {
    public final int FLD551;
    public final Object FLD552;
    public final Object FLD553;

    public CLS283(Object object0, Object object1, int v) {
        this.FLD551 = v;
        this.FLD553 = object0;
        this.FLD552 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        Object object0 = this.FLD552;
        Object object1 = this.FLD553;
        switch(this.FLD551) {
            case 0: {
                ((CLS73)object1).getClass();
                if(((Set)object0).isEmpty()) {
                    CLS282 ٴـ0 = new CLS282(((CLS73)object1), 1);
                    CLS137.FLD972.MTH2145(((CLS136)ٴـ0));
                }
                return;
            }
            case 1: {
                ((CLS102)object1).getClass();
                File file0 = new File(((Activity)object0).getCacheDir(), CLS125.MTH2025(((CLS102)object1).FLD773, "zip"));
                if(CLS132.MTH2094(file0, new String[]{((CLS102)object1).FLD773})) {
                    CLS125.MTH2037(file0.getAbsolutePath());
                    if(CLS125.MTH2023(file0)) {
                        Activity activity0 = (Activity)CLS123.FLD912.MTH2003("getCurrentActivity_themes", new Object[0]);
                        if(activity0 != null) {
                            Uri uri0 = CLS33.MTH1344(activity0, file0);
                            if(uri0 != null) {
                                Intent intent0 = new Intent("android.intent.action.SEND");
                                intent0.setType(URLConnection.guessContentTypeFromName(file0.getName()));
                                intent0.putExtra("android.intent.extra.STREAM", uri0);
                                activity0.startActivity(Intent.createChooser(intent0, CLS133.MTH2099("share")));
                            }
                        }
                    }
                }
                return;
            }
            case 2: {
                ((ArrayList)object1).clear();
                ((CLS70)object0).notifyDataSetChanged();
                return;
            }
            default: {
                CLS99 ˆٴ0 = new CLS99(((Activity)object1));
                ˆٴ0.MTH1765("sort_recent", ((CLS143)new CLS269(((CLS64)object0), 0)));
                ˆٴ0.MTH1765("sort_alphabet", ((CLS143)new CLS269(((CLS64)object0), 1)));
                ˆٴ0.MTH1765("sort_reverse", ((CLS143)new CLS269(((CLS64)object0), 2)));
                ˆٴ0.MTH1766();
            }
        }
    }
}

