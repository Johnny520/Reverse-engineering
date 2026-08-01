// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import b.ʾᵢ.CLS40.CLS39;
import b.ﾞˎ.CLS1624.CLS540;

public final class CLS1271 implements CLS39, CLS540 {
    public final int FLD3375;
    public final CLS338 FLD3376;

    public CLS1271(CLS338 יᐧ0, int v) {
        this.FLD3375 = v;
        this.FLD3376 = יᐧ0;
        super();
    }

    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        this.FLD3376.getClass();
        new CLS336(this.FLD3376).filter(s);
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS338 יᐧ0 = this.FLD3376;
        if(this.FLD3375 == 0) {
            יᐧ0.notifyDataSetChanged();
            return;
        }
        יᐧ0.notifyDataSetChanged();
    }
}

