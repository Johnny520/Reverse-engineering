// Decompiled by JEB v5.42.0.202606242140

package c.ﾞﹶ;

public abstract class CLS378 {
    public final int FLD1653;
    public final int FLD1654;

    public CLS378(int v, int v1) {
        this.FLD1654 = v;
        this.FLD1653 = v1;
    }

    @Override
    public final String toString() {
        int v3;
        byte[] arr_b = new byte[this.FLD1654];
        StringBuilder stringBuilder0 = new StringBuilder(this.FLD1653 * (this.FLD1654 + 1));
        for(int v = 0; v < this.FLD1653; ++v) {
            arr_b = this.MTH5108(v, arr_b);
            for(int v1 = 0; v1 < this.FLD1654; ++v1) {
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

    public abstract byte[] MTH5105();

    public boolean MTH5106() [...] // 潜在的解密器

    public final int MTH5107() {
        return this.FLD1653;
    }

    public abstract byte[] MTH5108(int arg1, byte[] arg2);

    public CLS378 MTH5109() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final int MTH5110() {
        return this.FLD1654;
    }
}

