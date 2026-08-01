// Decompiled by JEB v5.42.0.202606242140

package b.ﾞᐧ;

import b.ʾᵢ.CLS27;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class CLS557 implements Serializable {
    public CLS558 FLD5443;
    public byte[] FLD5444;

    public CLS557() {
        this.FLD5443 = new CLS558();
        this.FLD5444 = new byte[0];
    }

    public CLS557(CLS558 ٴـ0, byte[] arr_b) {
        this.FLD5443 = ٴـ0;
        this.FLD5444 = arr_b;
    }

    public CLS557(File file0) {
        try {
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            this.MTH7471(fileInputStream0);
            fileInputStream0.close();
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    public CLS557(InputStream inputStream0) {
        this.MTH7471(inputStream0);
    }

    public CLS557(String s) {
        try {
            FileInputStream fileInputStream0 = new FileInputStream(s);
            this.MTH7471(fileInputStream0);
            fileInputStream0.close();
        }
        catch(FileNotFoundException | IOException fileNotFoundException0) {
            fileNotFoundException0.printStackTrace();
        }
    }

    public CLS557(byte[] arr_b) {
        this.FLD5444 = arr_b;
        this.FLD5443 = new CLS558(arr_b);
    }

    // 此方法包含解密的字符串
    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("chunkId: null\nchunkSize: 36\nformat: null\nsubChunk1Id: null\nsubChunk1Size: 16\naudioFormat: 1\nchannels: 1\nsampleRate: 8000\nbyteRate: 16000\nblockAlign: 2\nbitsPerSample: 16\nsubChunk2Id: null\nsubChunk2Size: 0");
        stringBuilder0.append("\nlength: ");
        float f = ((float)this.FLD5443.FLD5456) / ((float)(((int)this.FLD5443.FLD5445)));
        int v = ((int)f) / 60 % 60;
        StringBuilder stringBuilder1 = new StringBuilder();
        if(((int)(f / 3600.0f)) > 0) {
            stringBuilder1.append(((int)(f / 3600.0f)));
            stringBuilder1.append(":");
        }
        if(v > 0) {
            stringBuilder1.append(v);
            stringBuilder1.append(":");
        }
        stringBuilder1.append(f % 60.0f);
        stringBuilder0.append(stringBuilder1.toString());
        return stringBuilder0.toString();
    }

    public static CLS558 MTH7470(int v, int v1, int v2) {
        CLS558 ٴـ0 = new CLS558();
        ٴـ0.MTH7479(v);
        ٴـ0.FLD5454 = "RIFF";
        ٴـ0.FLD5452 = (long)v1;
        ٴـ0.FLD5455 = "WAVE";
        ٴـ0.FLD5450 = "fmt ";
        ٴـ0.FLD5458 = 16L;
        ٴـ0.FLD5457 = 1;
        ٴـ0.FLD5446 = v2;
        ٴـ0.FLD5445 = ((long)v) * 16L / 8L;
        ٴـ0.FLD5449 = 2;
        ٴـ0.FLD5453 = 16;
        ٴـ0.FLD5451 = "data";
        ٴـ0.FLD5456 = ((long)(v1 / 2)) * 16L / 8L;
        return ٴـ0;
    }

    public final void MTH7471(InputStream inputStream0) {
        CLS558 ٴـ0 = new CLS558(inputStream0);
        this.FLD5443 = ٴـ0;
        if(ٴـ0.FLD5448) {
            try {
                byte[] arr_b = new byte[inputStream0.available()];
                this.FLD5444 = arr_b;
                inputStream0.read(arr_b);
            }
            catch(IOException iOException0) {
                iOException0.printStackTrace();
            }
            return;
        }
        CLS27.MTH906("Invalid Wave Header");
    }

    public final void MTH7472() {
        if(this.FLD5443.FLD5446 == 1) {
            return;
        }
        byte[] arr_b = this.FLD5444;
        int v = arr_b.length / 2;
        byte[] arr_b1 = new byte[v];
        int v1 = arr_b.length / 2;
        byte[] arr_b2 = new byte[v1];
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        for(int v3 = 0; v3 < arr_b.length; v3 += 2) {
            for(int v7 = 0; v7 < 2; ++v7) {
                if(v4 == 0) {
                    arr_b1[v5] = arr_b[v3 + v7];
                    ++v5;
                }
                else {
                    arr_b2[v6] = arr_b[v3 + v7];
                    ++v6;
                }
            }
            ++v4;
            v4 = v4 == 2 ? 0 : v4 + 1;
        }
        short[] arr_v = new short[v / 2];
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b1);
        ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
        byteBuffer0.order(byteOrder0).asShortBuffer().get(arr_v);
        short[] arr_v1 = new short[v1 / 2];
        ByteBuffer.wrap(arr_b2).order(byteOrder0).asShortBuffer().get(arr_v1);
        short[] arr_v2 = new short[v / 2];
        for(int v2 = 0; v2 < v / 2; ++v2) {
            arr_v2[v2] = (short)(arr_v1[v2] / 2 + arr_v[v2] / 2);
        }
        int v8 = v / 2 * 2;
        byte[] arr_b3 = new byte[v8];
        ByteBuffer.wrap(arr_b3).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(arr_v2);
        this.FLD5444 = arr_b3;
        this.FLD5443 = CLS557.MTH7470(((int)this.FLD5443.FLD5447), v8, 1);
    }

    public final void MTH7473(double f, double f1) {
        double f2 = (double)(((float)this.FLD5443.FLD5456) / ((float)(((int)this.FLD5443.FLD5445))));
        CLS558 ٴـ0 = this.FLD5443;
        double f3 = (double)(((int)ٴـ0.FLD5447) * ٴـ0.FLD5453 / 8 * ٴـ0.FLD5446);
        int v = (int)(f * f3);
        long v1 = ٴـ0.FLD5452;
        long v2 = ٴـ0.FLD5456;
        long v3 = (long)(((int)(f3 * Math.max(0.0, Math.min(f2 - f1, f2)))) + v);
        if(v3 > v2) {
            v = (int)v2;
        }
        long v4 = v1 - v3;
        long v5 = v2 - v3;
        if(v4 >= 0L && v5 >= 0L) {
            ٴـ0.FLD5452 = v4;
            ٴـ0.FLD5456 = v5;
            byte[] arr_b = new byte[((int)v5)];
            System.arraycopy(this.FLD5444, v, arr_b, 0, ((int)v5));
            this.FLD5444 = arr_b;
            return;
        }
        CLS27.MTH906("Trim error: Negative length");
    }

    public final int MTH7474() {
        return (int)(((float)this.FLD5443.FLD5456) / ((float)(((int)this.FLD5443.FLD5445))) * 1000.0f);
    }
}

