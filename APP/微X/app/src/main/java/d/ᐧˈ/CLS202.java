// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import android.net.Uri;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS28;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ⁱٴ.CLS123;

public final class CLS202 implements CLS123 {
    public final Activity FLD613;
    public final int FLD614;

    public CLS202(Activity activity0, int v) {
        this.FLD614 = v;
        this.FLD613 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        Activity activity0 = this.FLD613;
        switch(this.FLD614) {
            case 0: {
                CLS13.MTH427(activity0);
                return;
            }
            case 1: {
                CLS1.MTH362(activity0, Uri.parse(CLS69.MTH806("forum")));
                return;
            }
            case 2: {
                CLS1.MTH362(activity0, Uri.parse(CLS69.MTH806("qq_feedback")));
                return;
            }
            case 3: {
                CLS1.MTH362(activity0, Uri.parse(CLS69.MTH806("telegram")));
                return;
            }
            case 4: {
                CLS71.MTH829(0xFFFF22322DFB3E45L, activity0);
                return;
            }
            case 5: {
                CLS13.MTH428(activity0, CLS69.MTH806("paypal_url"));
                CLS13.MTH426(activity0, CLS69.MTH795("copy_to_clipboard"));
                return;
            }
            case 6: {
                try {
                    CLS1.MTH362(activity0, Uri.parse(CLS69.MTH806("paypal_url")));
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
                return;
            }
            case 7: {
                CLS71.MTH829(0xFFFF38C52DFB3E45L, activity0);
                return;
            }
            case 8: {
                CLS71.MTH829(-215842810020283L, activity0);
                return;
            }
            case 9: {
                CLS28.MTH536(activity0);
                return;
            }
            case 10: {
                CLS1.MTH367(activity0);
                return;
            }
            case 11: {
                CLS71.MTH829(0xFFFF33472DFB3E45L, activity0);
                return;
            }
            case 12: {
                CLS28.MTH536(activity0);
                return;
            }
            default: {
                CLS1.MTH367(activity0);
            }
        }
    }
}

