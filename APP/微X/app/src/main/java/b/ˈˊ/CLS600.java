// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ᵔʾ.CLS283;
import b.ᵔʾ.CLS288;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS500;

public final class CLS600 extends CLS99 {
    public final int FLD456;

    public CLS600(int v) {
        this.FLD456 = v;
        switch(v) {
            case 1: {
                super();
                this.FLD501 = 18;
                this.FLD497 = true;
                this.FLD500 = true;
                this.FLD495 = true;
                return;
            }
            case 2: {
                super();
                this.FLD501 = 0;
                return;
            }
            case 3: {
                super();
                this.FLD501 = 6;
                return;
            }
            default: {
                super();
                this.FLD501 = 2;
            }
        }
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1929() {
        return false;
    }

    @Override  // b.ˈˊ.CLS99
    public final void MTH1930(Activity activity0) {
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1931() {
        return false;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final String MTH1934() {
        switch(this.FLD456) {
            case 0: {
                return CLS27.MTH889("restart_wechat");
            }
            case 1: {
                return CLS27.MTH889("resume_friend_request_task");
            }
            case 2: {
                return CLS27.MTH889("mark_read");
            }
            default: {
                return CLS27.MTH889("zombie_silent_search");
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final void MTH1936() {
        switch(this.FLD456) {
            case 0: {
                CLS390.MTH5622();
                return;
            }
            case 1: {
                CLS288.FLD2989.MTH4734();
                return;
            }
            case 2: {
                for(Object object0: CLS371.FLD3470.MTH5347()) {
                    CLS66.MTH1408(((String)object0), null);
                }
                return;
            }
            default: {
                if(CLS500.FLD4928.MTH6895("zombie_silent_search")) {
                    CLS283.FLD2946.MTH4689();
                }
            }
        }
    }

    @Override  // b.ˈˊ.CLS99
    public final void MTH1938(Activity activity0) {
    }
}

