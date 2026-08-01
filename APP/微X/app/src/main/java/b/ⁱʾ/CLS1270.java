// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import b.ʾᵢ.CLS40.CLS39;
import b.ﾞˎ.CLS1624.CLS540;

public final class CLS1270 implements CLS39, CLS540 {
    public final int FLD3357;
    public final CLS335 FLD3358;

    public CLS1270(CLS335 ˑٴ0, int v) {
        this.FLD3357 = v;
        this.FLD3358 = ˑٴ0;
        super();
    }

    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        CLS335 ˑٴ0 = this.FLD3358;
        switch(this.FLD3357) {
            case 2: {
                ˑٴ0.getClass();
                new CLS333(ˑٴ0).filter(s);
                return;
            }
            case 3: {
                ˑٴ0.getClass();
                new CLS333(ˑٴ0).filter(s);
                return;
            }
            case 4: {
                ˑٴ0.getClass();
                new CLS333(ˑٴ0).filter(s);
                return;
            }
            case 5: {
                ˑٴ0.getClass();
                new CLS333(ˑٴ0).filter(s);
                return;
            }
            default: {
                ˑٴ0.getClass();
                new CLS333(ˑٴ0).filter(s);
            }
        }
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS335 ˑٴ0 = this.FLD3358;
        if(this.FLD3357 == 0) {
            ˑٴ0.notifyDataSetChanged();
            return;
        }
        ˑٴ0.notifyDataSetChanged();
    }
}

