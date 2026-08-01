// Decompiled by JEB v5.42.0.202606242140

package t.ˈˊ;

public final class CLS89 implements Runnable {
    public final int FLD700;
    public final CLS86 FLD701;
    public final CLS88 FLD702;
    public final boolean FLD703;

    public CLS89(CLS88 ˊﾞ0, CLS86 ˆٴ0, boolean z, int v) {
        this.FLD700 = v;
        this.FLD702 = ˊﾞ0;
        this.FLD701 = ˆٴ0;
        this.FLD703 = z;
        super();
    }

    @Override
    public final void run() {
        boolean z = this.FLD703;
        CLS86 ˆٴ0 = this.FLD701;
        CLS88 ˊﾞ0 = this.FLD702;
        if(this.FLD700 == 0) {
            if(ˊﾞ0.FLD658) {
                if(ˆٴ0 != ˊﾞ0.FLD690) {
                    ˆٴ0.MTH1694(z);
                }
                CLS96 ﾞᐧ0 = (CLS96)ˆٴ0.getTag(0x7F02000C);
                if(ﾞᐧ0 != null && ﾞᐧ0.FLD726) {
                    if(z && ﾞᐧ0.FLD720 != null) {
                        ﾞᐧ0.FLD731.cancel();
                        ﾞᐧ0.startAnimation(ﾞᐧ0.FLD720);
                    }
                    ﾞᐧ0.setVisibility(4);
                }
            }
            return;
        }
        if(!ˊﾞ0.FLD658) {
            if(ˆٴ0 != ˊﾞ0.FLD690) {
                ˆٴ0.MTH1693(z);
            }
            CLS96 ﾞᐧ1 = (CLS96)ˆٴ0.getTag(0x7F02000C);
            if(ﾞᐧ1 != null && ﾞᐧ1.FLD726) {
                if(z && ﾞᐧ1.FLD731 != null) {
                    ﾞᐧ1.FLD720.cancel();
                    ﾞᐧ1.startAnimation(ﾞᐧ1.FLD731);
                }
                ﾞᐧ1.setVisibility(0);
            }
        }
    }
}

