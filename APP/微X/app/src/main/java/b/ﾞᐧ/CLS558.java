// Decompiled by JEB v5.42.0.202606242140

package b.ﾞᐧ;

import java.io.IOException;
import java.io.InputStream;

public final class CLS558 {
    public long FLD5445;
    public int FLD5446;
    public long FLD5447;
    public final boolean FLD5448;
    public int FLD5449;
    public String FLD5450;
    public String FLD5451;
    public long FLD5452;
    public int FLD5453;
    public String FLD5454;
    public String FLD5455;
    public long FLD5456;
    public int FLD5457;
    public long FLD5458;

    public CLS558() {
        this.FLD5452 = 36L;
        this.FLD5458 = 16L;
        this.FLD5457 = 1;
        this.FLD5446 = 1;
        this.FLD5447 = 8000L;
        this.FLD5445 = 16000L;
        this.FLD5449 = 2;
        this.FLD5453 = 16;
        this.FLD5456 = 0L;
        this.FLD5448 = true;
    }

    public CLS558(InputStream inputStream0) {
        byte[] arr_b = new byte[44];
        boolean z = false;
        try {
            inputStream0.read(arr_b);
            this.FLD5454 = new String(new byte[]{arr_b[0], arr_b[1], arr_b[2], arr_b[3]});
            this.FLD5452 = ((long)(arr_b[4] & 0xFF)) | ((long)(arr_b[5] & 0xFF)) << 8 | ((long)(arr_b[6] & 0xFF)) << 16 | ((long)arr_b[7]) & 0xFF000000L;
            this.FLD5455 = new String(new byte[]{arr_b[8], arr_b[9], arr_b[10], arr_b[11]});
            this.FLD5450 = new String(new byte[]{arr_b[12], arr_b[13], arr_b[14], arr_b[15]});
            this.FLD5458 = ((long)(arr_b[16] & 0xFF)) | ((long)(arr_b[17] & 0xFF)) << 8 | ((long)(arr_b[18] & 0xFF)) << 16 | ((long)(arr_b[19] & 0xFF)) << 24;
            this.FLD5457 = arr_b[20] & 0xFF | (arr_b[21] & 0xFF) << 8;
            this.FLD5446 = arr_b[22] & 0xFF | (arr_b[23] & 0xFF) << 8;
            this.FLD5447 = ((long)(arr_b[24] & 0xFF)) | ((long)(arr_b[25] & 0xFF)) << 8 | ((long)(arr_b[26] & 0xFF)) << 16 | ((long)(arr_b[27] & 0xFF)) << 24;
            this.FLD5445 = ((long)(arr_b[28] & 0xFF)) | ((long)(arr_b[29] & 0xFF)) << 8 | ((long)(arr_b[30] & 0xFF)) << 16 | ((long)(arr_b[0x1F] & 0xFF)) << 24;
            this.FLD5449 = arr_b[0x20] & 0xFF | (arr_b[33] & 0xFF) << 8;
            this.FLD5453 = arr_b[34] & 0xFF | (arr_b[35] & 0xFF) << 8;
            this.FLD5451 = new String(new byte[]{arr_b[36], arr_b[37], arr_b[38], arr_b[39]});
            this.FLD5456 = ((long)(arr_b[40] & 0xFF)) | ((long)(arr_b[41] & 0xFF)) << 8 | ((long)(arr_b[42] & 0xFF)) << 16 | ((long)(arr_b[43] & 0xFF)) << 24;
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            this.FLD5448 = z;
            return;
        }
        if(this.FLD5453 != 8 && this.FLD5453 != 16) {
            System.err.println("WaveHeader: only supports bitsPerSample 8 or 16");
        }
        else if(!this.FLD5454.equalsIgnoreCase("RIFF") || !this.FLD5455.equalsIgnoreCase("WAVE") || this.FLD5457 != 1) {
            System.err.println("WaveHeader: Unsupported header format");
        }
        else {
            z = true;
        }
        this.FLD5448 = z;
    }

    public CLS558(byte[] arr_b) {
        byte[] arr_b1 = new byte[4];
        boolean z = false;
        arr_b1[0] = arr_b[0];
        arr_b1[1] = arr_b[1];
        arr_b1[2] = arr_b[2];
        arr_b1[3] = arr_b[3];
        this.FLD5454 = new String(arr_b1);
        this.FLD5452 = ((long)(arr_b[4] & 0xFF)) | ((long)(arr_b[5] & 0xFF)) << 8 | ((long)(arr_b[6] & 0xFF)) << 16 | ((long)arr_b[7]) & 0xFF000000L;
        this.FLD5455 = new String(new byte[]{arr_b[8], arr_b[9], arr_b[10], arr_b[11]});
        this.FLD5450 = new String(new byte[]{arr_b[12], arr_b[13], arr_b[14], arr_b[15]});
        this.FLD5458 = ((long)(arr_b[16] & 0xFF)) | ((long)(arr_b[17] & 0xFF)) << 8 | ((long)(arr_b[18] & 0xFF)) << 16 | ((long)(arr_b[19] & 0xFF)) << 24;
        this.FLD5457 = arr_b[20] & 0xFF | (arr_b[21] & 0xFF) << 8;
        this.FLD5446 = arr_b[22] & 0xFF | (arr_b[23] & 0xFF) << 8;
        this.FLD5447 = ((long)(arr_b[24] & 0xFF)) | ((long)(arr_b[25] & 0xFF)) << 8 | ((long)(arr_b[26] & 0xFF)) << 16 | ((long)(arr_b[27] & 0xFF)) << 24;
        this.FLD5445 = ((long)(arr_b[28] & 0xFF)) | ((long)(arr_b[29] & 0xFF)) << 8 | ((long)(arr_b[30] & 0xFF)) << 16 | ((long)(arr_b[0x1F] & 0xFF)) << 24;
        this.FLD5449 = arr_b[0x20] & 0xFF | (arr_b[33] & 0xFF) << 8;
        this.FLD5453 = arr_b[34] & 0xFF | (arr_b[35] & 0xFF) << 8;
        this.FLD5451 = new String(new byte[]{arr_b[36], arr_b[37], arr_b[38], arr_b[39]});
        this.FLD5456 = ((long)(arr_b[40] & 0xFF)) | ((long)(arr_b[41] & 0xFF)) << 8 | ((long)(arr_b[42] & 0xFF)) << 16 | ((long)(arr_b[43] & 0xFF)) << 24;
        if(this.FLD5453 != 8 && this.FLD5453 != 16) {
            System.err.println("WaveHeader: only supports bitsPerSample 8 or 16");
        }
        else if(!this.FLD5454.equalsIgnoreCase("RIFF") || !this.FLD5455.equalsIgnoreCase("WAVE") || this.FLD5457 != 1) {
            System.err.println("WaveHeader: Unsupported header format");
        }
        else {
            z = true;
        }
        this.FLD5448 = z;
    }

    @Override
    public final String toString() [...] // 潜在的解密器

    public final void MTH7479(int v) {
        int v1 = (int)(this.FLD5456 * ((long)v) / this.FLD5447);
        int v2 = this.FLD5453;
        if(v2 / 8 % 2 == 0 && v1 % 2 != 0) {
            ++v1;
        }
        this.FLD5447 = (long)v;
        this.FLD5445 = ((long)v) * ((long)v2) / 8L;
        this.FLD5452 = (long)(v1 + 36);
        this.FLD5456 = (long)v1;
    }
}

