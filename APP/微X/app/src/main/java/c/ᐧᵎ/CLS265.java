// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵎ;

public abstract class CLS265 {
    public final int FLD1051;
    public final int FLD1052;

    public CLS265(int v, int v1) {
        this.FLD1051 = v;
        this.FLD1052 = v1;
    }

    @Override
    public final String toString() {
        int v3;
        byte[] arr_b = new byte[this.FLD1051];
        StringBuilder stringBuilder0 = new StringBuilder(this.FLD1052 * (this.FLD1051 + 1));
        for(int v = 0; v < this.FLD1052; ++v) {
            arr_b = this.MTH3448(v, arr_b);
            for(int v1 = 0; v1 < this.FLD1051; ++v1) {
                int v2 = arr_b[v1] & 0xFF;
                if(v2 < 0x40) {
                    v3 = 35;
                }
                else if(v2 < 0x80) {
                    v3 = 43;
                }
                else {
                    v3 = v2 >= 0xC0 ? 0x20 : 46;
                }
                stringBuilder0.append(((char)v3));
            }
            stringBuilder0.append('\n');
        }
        return stringBuilder0.toString();
    }

    public abstract byte[] MTH3448(int arg1, byte[] arg2);

    public boolean MTH3449() {
        return false;
    }

    public final int MTH3450() {
        return this.FLD1051;
    }

    public CLS265 MTH3451() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final int MTH3452() {
        return this.FLD1052;
    }

    public abstract byte[] MTH3453();
}

