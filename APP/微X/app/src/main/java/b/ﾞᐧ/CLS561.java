// Decompiled by JEB v5.42.0.202606242140

package b.ﾞᐧ;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class CLS561 {
    public static final class CLS560 extends IOException {
        public CLS560(String s) {
            super(s);
        }
    }

    public final InputStream FLD5460;
    public int FLD5461;
    public int FLD5462;
    public BufferedInputStream FLD5463;
    public int FLD5464;

    public CLS561(InputStream inputStream0) {
        this.FLD5460 = inputStream0;
    }

    public final void MTH7488() {
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(this.FLD5460, 0x1000);
        this.FLD5463 = bufferedInputStream0;
        int v = CLS561.MTH7490(bufferedInputStream0);
        if(v != 1380533830) {
            throw new CLS560(String.format("Invalid WAVE header chunk ID: %d", v));
        }
        CLS561.MTH7489(this.FLD5463);
        if(CLS561.MTH7490(this.FLD5463) != 0x57415645) {
            throw new CLS560("Invalid WAVE format");
        }
        if(CLS561.MTH7490(this.FLD5463) != 0x666D7420) {
            throw new CLS560("Invalid WAVE format chunk ID");
        }
        CLS561.MTH7489(this.FLD5463);
        if(CLS561.MTH7491(this.FLD5463) != 1) {
            throw new CLS560("Not PCM WAVE format");
        }
        this.FLD5464 = CLS561.MTH7491(this.FLD5463);
        this.FLD5462 = CLS561.MTH7489(this.FLD5463);
        CLS561.MTH7489(this.FLD5463);
        CLS561.MTH7491(this.FLD5463);
        this.FLD5461 = CLS561.MTH7491(this.FLD5463);
        if(CLS561.MTH7490(this.FLD5463) != 1684108385) {
            throw new CLS560("Invalid WAVE data chunk ID");
        }
        CLS561.MTH7489(this.FLD5463);
    }

    public static int MTH7489(BufferedInputStream bufferedInputStream0) {
        byte[] arr_b = new byte[4];
        return bufferedInputStream0.read(arr_b) == -1 ? -1 : arr_b[0] & 0xFF | (arr_b[1] & 0xFF) << 8 | (arr_b[2] & 0xFF) << 16 | (arr_b[3] & 0xFF) << 24;
    }

    public static int MTH7490(BufferedInputStream bufferedInputStream0) {
        byte[] arr_b = new byte[4];
        return bufferedInputStream0.read(arr_b) == -1 ? -1 : (arr_b[0] & 0xFF) << 24 | (arr_b[1] & 0xFF) << 16 | (arr_b[2] & 0xFF) << 8 | arr_b[3] & 0xFF;
    }

    public static short MTH7491(BufferedInputStream bufferedInputStream0) {
        byte[] arr_b = new byte[2];
        return bufferedInputStream0.read(arr_b, 0, 2) == -1 ? -1 : ((short)(arr_b[0] & 0xFF | (arr_b[1] & 0xFF) << 8));
    }
}

