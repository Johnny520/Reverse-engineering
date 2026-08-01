// Decompiled by JEB v5.42.0.202606242140

package c.ʼﾞ;

public final class CLS32 {
    public final int FLD130;
    public final byte[][] FLD131;
    public final int FLD132;

    public CLS32(int v, int v1) {
        this.FLD131 = new byte[v1][v];
        this.FLD130 = v;
        this.FLD132 = v1;
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder(this.FLD130 * 2 * this.FLD132 + 2);
        for(int v = 0; v < this.FLD132; ++v) {
            for(int v1 = 0; v1 < this.FLD130; ++v1) {
                switch(this.FLD131[v][v1]) {
                    case 0: {
                        s = " 0";
                        break;
                    }
                    case 1: {
                        s = " 1";
                        break;
                    }
                    default: {
                        s = "  ";
                    }
                }
                stringBuilder0.append(s);
            }
            stringBuilder0.append('\n');
        }
        return stringBuilder0.toString();
    }

    public byte MTH833(int v, int v1) {
        return this.FLD131[v1][v];
    }

    public int MTH834() {
        return this.FLD130;
    }

    public void MTH835(byte b) {
        for(int v = 0; v < this.FLD132; ++v) {
            for(int v1 = 0; v1 < this.FLD130; ++v1) {
                this.FLD131[v][v1] = b;
            }
        }
    }

    public byte[][] MTH836() {
        return this.FLD131;
    }

    public void MTH837(int v, int v1, boolean z) {
        this.FLD131[v1][v] = (byte)z;
    }

    public void MTH838(int v, int v1, int v2) {
        this.FLD131[v1][v] = (byte)v2;
    }

    public int MTH839() {
        return this.FLD132;
    }
}

