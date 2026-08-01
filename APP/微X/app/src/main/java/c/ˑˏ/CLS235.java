// Decompiled by JEB v5.42.0.202606242140

package c.ˑˏ;

public final class CLS235 {
    public final int FLD937;
    public final byte[][] FLD938;
    public final int FLD939;

    public CLS235(int v, int v1) {
        this.FLD938 = new byte[v1][v];
        this.FLD939 = v;
        this.FLD937 = v1;
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder(this.FLD939 * 2 * this.FLD937 + 2);
        for(int v = 0; v < this.FLD937; ++v) {
            for(int v1 = 0; v1 < this.FLD939; ++v1) {
                switch(this.FLD938[v][v1]) {
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

    public byte[][] MTH3192() {
        return this.FLD938;
    }

    public int MTH3193() {
        return this.FLD939;
    }

    public int MTH3194() {
        return this.FLD937;
    }

    public void MTH3195(int v, int v1, int v2) {
        this.FLD938[v1][v] = (byte)v2;
    }

    public void MTH3196(byte b) {
        for(int v = 0; v < this.FLD937; ++v) {
            for(int v1 = 0; v1 < this.FLD939; ++v1) {
                this.FLD938[v][v1] = b;
            }
        }
    }

    public void MTH3197(int v, int v1, boolean z) {
        this.FLD938[v1][v] = (byte)z;
    }

    public byte MTH3198(int v, int v1) {
        return this.FLD938[v1][v];
    }
}

