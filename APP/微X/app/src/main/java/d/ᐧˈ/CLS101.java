// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import android.widget.LinearLayout;
import d.ˑʽ.CLS36;
import d.ˑʽ.CLS53;
import d.יʻ.CLS61;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.ٴˑ.CLS177;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;
import java.util.HashSet;

public abstract class CLS101 {
    public final HashSet FLD580;
    public final HashSet FLD581;
    public final CLS36 FLD582;
    public WeakReference FLD583;
    public final String FLD584;
    public final CLS61 FLD585;
    public final String FLD586;
    public final CLS53 FLD587;
    public String FLD588;

    public CLS101(String s, String s1) {
        this.FLD584 = s;
        this.FLD586 = s1;
        this.FLD581 = new HashSet();
        this.FLD580 = new HashSet();
        this.FLD585 = CLS69.MTH801();
        this.FLD582 = (CLS36)CLS68.FLD326.MTH786(CLS36.class);
        this.FLD587 = CLS53.FLD282;
    }

    public final CLS177 MTH1052(boolean z, boolean z1) {
        CLS177 ʻﹶ0 = new CLS177(this.MTH1053());
        if(z) {
            this.FLD581.add(ʻﹶ0);
        }
        if(z1) {
            this.FLD580.add(ʻﹶ0);
        }
        return ʻﹶ0;
    }

    public final Activity MTH1053() {
        return (Activity)this.FLD583.get();
    }

    public abstract void MTH1054(boolean arg1, boolean arg2, String arg3);

    public final CLS187 MTH1055(boolean z, boolean z1) {
        CLS187 ᐧﹶ0 = new CLS187(this.MTH1053());
        if(z) {
            this.FLD581.add(ᐧﹶ0);
        }
        if(z1) {
            this.FLD580.add(ᐧﹶ0);
        }
        return ᐧﹶ0;
    }

    public abstract void MTH1056(LinearLayout arg1, boolean arg2, boolean arg3, boolean arg4);

    public final CLS188 MTH1057(boolean z, boolean z1) {
        CLS188 ᴵʾ0 = new CLS188(this.MTH1053());
        if(z) {
            this.FLD581.add(ᴵʾ0);
        }
        if(z1) {
            this.FLD580.add(ᴵʾ0);
        }
        return ᴵʾ0;
    }

    public final void MTH1058(String s) {
        for(Object object0: this.FLD580) {
            CLS125 ⁱٴ0 = (CLS125)object0;
            if(ⁱٴ0.getText().equals(s)) {
                ⁱٴ0.MTH1178();
                return;
            }
            if(false) {
                break;
            }
        }
    }
}

