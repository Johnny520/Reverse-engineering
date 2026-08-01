// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵎ;

public final class CLS585 extends CLS265 {
    public final byte[] FLD1053;
    public final int FLD1054;
    public final int FLD1055;
    public final int FLD1056;
    public final int FLD1057;

    public CLS585(int v, int v1, int[] arr_v) {
        super(v, v1);
        this.FLD1055 = v;
        this.FLD1054 = v1;
        this.FLD1056 = 0;
        this.FLD1057 = 0;
        int v3 = v * v1;
        this.FLD1053 = new byte[v3];
        for(int v2 = 0; v2 < v3; ++v2) {
            int v4 = arr_v[v2];
            this.FLD1053[v2] = (byte)(((v4 >> 16 & 0xFF) + (v4 >> 7 & 510) + (v4 & 0xFF)) / 4);
        }
    }

    @Override  // c.ᐧᵎ.CLS265
    public byte[] MTH3448(int v, byte[] arr_b) {
        if(v < 0 || v >= ((CLS265)this).MTH3452()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + v);
        }
        int v1 = ((CLS265)this).MTH3450();
        if(arr_b == null || arr_b.length < v1) {
            arr_b = new byte[v1];
        }
        System.arraycopy(this.FLD1053, (v + this.FLD1057) * this.FLD1055 + this.FLD1056, arr_b, 0, v1);
        return arr_b;
    }

    @Override  // c.ᐧᵎ.CLS265
    public byte[] MTH3453() {
        int v = ((CLS265)this).MTH3450();
        int v1 = ((CLS265)this).MTH3452();
        int v2 = this.FLD1055;
        if(v == v2 && v1 == this.FLD1054) {
            return this.FLD1053;
        }
        int v3 = v * v1;
        byte[] arr_b = new byte[v3];
        int v4 = this.FLD1057 * v2 + this.FLD1056;
        if(v == v2) {
            System.arraycopy(this.FLD1053, v4, arr_b, 0, v3);
            return arr_b;
        }
        for(int v5 = 0; v5 < v1; ++v5) {
            System.arraycopy(this.FLD1053, v4, arr_b, v5 * v, v);
            v4 += this.FLD1055;
        }
        return arr_b;
    }
}

