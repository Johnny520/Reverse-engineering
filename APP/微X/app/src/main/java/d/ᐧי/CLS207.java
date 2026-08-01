// Decompiled by JEB v5.42.0.202606242140

package d.ᐧי;

import android.app.Activity;
import d.ˑʽ.CLS28.CLS137;
import d.ˑʽ.CLS28;
import d.יʻ.CLS68.CLS67;
import d.יʻ.CLS68;
import d.ٴˑ.CLS99;
import d.ⁱٴ.CLS121;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS126;
import java.util.Set;
import org.json.JSONObject;

public final class CLS207 implements CLS123 {
    public final Object FLD626;
    public final int FLD627;
    public final Object FLD628;

    public CLS207(Object object0, Object object1, int v) {
        this.FLD627 = v;
        this.FLD626 = object0;
        this.FLD628 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        Object object0 = this.FLD628;
        Object object1 = this.FLD626;
        switch(this.FLD627) {
            case 0: {
                ((CLS113)object1).getClass();
                if(((Set)object0).isEmpty()) {
                    CLS208 ᐧי0 = new CLS208(((CLS113)object1), 1);
                    CLS68.FLD326.MTH791(((CLS67)ᐧי0));
                }
                return;
            }
            case 1: {
                CLS28.MTH533(((Activity)object1), ((CLS126)new CLS137(((double[])object0))));
                return;
            }
            case 2: {
                ((CLS121)object1).MTH1171(((String)object0));
                return;
            }
            default: {
                CLS28.MTH529(((CLS99)object1).FLD571, ((boolean)(true ^ ((JSONObject)object0).optBoolean("valid"))));
            }
        }
    }
}

