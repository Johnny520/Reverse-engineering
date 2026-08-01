// Decompiled by JEB v5.42.0.202606242140

package c.ﾞﹶ;

public final class CLS820 extends CLS378 {
    public final int FLD1647;
    public final byte[] FLD1648;
    public final int FLD1649;
    public final int FLD1650;
    public final int FLD1651;

    public CLS820(int v, int v1, int[] arr_v) {
        super(v, v1);
        this.FLD1651 = v;
        this.FLD1647 = v1;
        this.FLD1650 = 0;
        this.FLD1649 = 0;
        int v3 = v * v1;
        this.FLD1648 = new byte[v3];
        for(int v2 = 0; v2 < v3; ++v2) {
            int v4 = arr_v[v2];
            this.FLD1648[v2] = (byte)(((v4 >> 16 & 0xFF) + (v4 >> 7 & 510) + (v4 & 0xFF)) / 4);
        }
    }

    @Override  // c.ﾞﹶ.CLS378
    public byte[] MTH5105() {
        int v = ((CLS378)this).MTH5110();
        int v1 = ((CLS378)this).MTH5107();
        int v2 = this.FLD1651;
        if(v == v2 && v1 == this.FLD1647) {
            return this.FLD1648;
        }
        int v3 = v * v1;
        byte[] arr_b = new byte[v3];
        int v4 = this.FLD1649 * v2 + this.FLD1650;
        if(v == v2) {
            System.arraycopy(this.FLD1648, v4, arr_b, 0, v3);
            return arr_b;
        }
        for(int v5 = 0; v5 < v1; ++v5) {
            System.arraycopy(this.FLD1648, v4, arr_b, v5 * v, v);
            v4 += this.FLD1651;
        }
        return arr_b;
    }

    @Override  // c.ﾞﹶ.CLS378
    public byte[] MTH5108(int v, byte[] arr_b) {
        if(v < 0 || v >= ((CLS378)this).MTH5107()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + v);
        }
        int v1 = ((CLS378)this).MTH5110();
        if(arr_b == null || arr_b.length < v1) {
            arr_b = new byte[v1];
        }
        System.arraycopy(this.FLD1648, (v + this.FLD1649) * this.FLD1651 + this.FLD1650, arr_b, 0, v1);
        return arr_b;
    }
}

