// Decompiled by JEB v5.42.0.202606242140

package b.ﾞٴ;

import b.ʻˑ.CLS5;
import b.ʾᵢ.CLS27;
import b.יﹳ.CLS166;

public final class CLS1637 implements CLS5 {
    public final Class FLD5438;
    public boolean FLD5439;
    public long FLD5440;
    public long FLD5441;
    public boolean FLD5442;

    public CLS1637() {
        this.FLD5442 = false;
        this.FLD5439 = false;
        this.FLD5438 = CLS27.MTH894("mediaRecorderClass");
    }

    @Override  // b.ʻˑ.CLS5
    public final void MTH777() {
        Class class0 = this.FLD5438;
        if(class0 != null && this.FLD5442) {
            CLS166.MTH3192(class0, "SilkEncUnInit", new Object[]{this.FLD5441});
        }
    }

    @Override  // b.ʻˑ.CLS5
    public final void MTH778() {
        Class class0 = this.FLD5438;
        if(class0 == null) {
            return;
        }
        this.FLD5442 = true;
        this.FLD5441 = (long)(((Long)CLS166.MTH3192(class0, "SilkEncInit", new Object[]{16000, 16000, 4, 0L})));
    }

    @Override  // b.ʻˑ.CLS5
    public final void MTH779() {
        Class class0 = this.FLD5438;
        if(class0 != null && this.FLD5439) {
            CLS166.MTH3192(class0, "SilkDecUnInit", new Object[]{this.FLD5440});
        }
    }

    @Override  // b.ʻˑ.CLS5
    public final int MTH780(byte[] arr_b, short v, byte[] arr_b1, short[] arr_v) {
        return this.FLD5438 == null ? 0 : ((int)(((Integer)CLS166.MTH3192(this.FLD5438, "SilkDoEnc", new Object[]{arr_b, v, arr_b1, arr_v, Boolean.TRUE, this.FLD5441}))));
    }

    @Override  // b.ʻˑ.CLS5
    public final int MTH781(byte[] arr_b, short v) {
        return this.FLD5438 == null ? 0 : ((int)(((Integer)CLS166.MTH3192(this.FLD5438, "SilkDoDec", new Object[]{arr_b, v, this.FLD5440}))));
    }

    @Override  // b.ʻˑ.CLS5
    public final void MTH782(int v, byte[] arr_b) {
        Class class0 = this.FLD5438;
        if(class0 == null) {
            return;
        }
        this.FLD5439 = true;
        this.FLD5440 = (long)(((Long)CLS166.MTH3192(class0, "SilkDecInit", new Object[]{16000, arr_b, v, 0L})));
    }
}

