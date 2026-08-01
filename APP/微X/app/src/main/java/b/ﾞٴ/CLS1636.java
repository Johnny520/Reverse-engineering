// Decompiled by JEB v5.42.0.202606242140

package b.ﾞٴ;

import android.media.AudioTrack;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS5;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.יﹳ.CLS166;
import b.ﾞᐧ.CLS561;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;

public final class CLS1636 implements CLS5 {
    public final Class FLD5437;

    public CLS1636(int v) {
        if(v != 1) {
            super();
            this.FLD5437 = CLS27.MTH894("Mp3EncodeJniClass");
            return;
        }
        super();
        this.FLD5437 = CLS27.MTH894("mediaRecorderClass");
    }

    public final void MTH7447(CLS561 ⁱʾ0, String s, CLS3 ˆٴ0) {
        int v14;
        int v11;
        byte[] arr_b;
        short[] arr_v2;
        FileOutputStream fileOutputStream0;
        try {
            ⁱʾ0.MTH7488();
            if(this.MTH7448(ⁱʾ0.FLD5462, ⁱʾ0.FLD5462, ⁱʾ0.FLD5464) == -1) {
                CLS27.MTH906("init failed");
                return;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return;
        }
        int v = ⁱʾ0.FLD5464;
        Class class0 = this.FLD5437;
        int v1 = 3;
        if(v == 1) {
            try {
                CLS166.MTH3192(class0, "setMode", new Object[]{3});
                goto label_15;
            label_10:
                if(v == 2) {
                    CLS166.MTH3192(class0, "setMode", new Object[]{0});
                }
            }
            catch(Throwable throwable1) {
                goto label_14;
            }
        }
        else {
            goto label_10;
            try {
            label_14:
                CLS27.MTH893(throwable1);
            label_15:
                int v2 = ⁱʾ0.FLD5462;
                int v3 = ⁱʾ0.FLD5464 == 1 ? 4 : 12;
                if(ⁱʾ0.FLD5461 != 8) {
                    v1 = 2;
                }
                int v4 = AudioTrack.getMinBufferSize(v2, v3, v1);
                if(!CLS31.MTH1003(s)) {
                    return;
                }
                fileOutputStream0 = new FileOutputStream(s);
                short[] arr_v = new short[0x2000];
                short[] arr_v1 = new short[0x2000];
                arr_v2 = new short[0x2000];
                arr_b = new byte[((int)(((double)(v4 * 4)) * 1.25 + 7200.0))];
                while(true) {
                label_27:
                    int v5 = ⁱʾ0.FLD5464;
                    if(v5 != 2) {
                        goto label_49;
                    }
                    byte[] arr_b1 = new byte[0x8000];
                    int v6 = ⁱʾ0.FLD5463.read(arr_b1, 0, 0x8000);
                    int v8 = 0;
                    for(int v7 = 0; v7 < v6; v7 += 2) {
                        short v9 = (short)(arr_b1[0] & 0xFF | (arr_b1[v7 + 1] & 0xFF) << 8);
                        if(v7 % 4 == 0) {
                            arr_v[v8] = v9;
                        }
                        else {
                            arr_v1[v8] = v9;
                            ++v8;
                        }
                    }
                    if(v8 > 0) {
                        int v10 = this.MTH7454(arr_v, arr_v1, arr_b);
                        if(v10 <= 0) {
                            continue;
                        }
                        fileOutputStream0.write(arr_b, 0, v10);
                        continue;
                    }
                    v11 = (int)(((Integer)CLS166.MTH3192(class0, "flush", new Object[]{arr_b})));
                    goto label_71;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return;
            }
        }
        goto label_15;
        try {
            v11 = (int)(((Integer)CLS166.MTH3192(class0, "flush", new Object[]{arr_b})));
            goto label_71;
        }
        catch(Throwable throwable2) {
            goto label_69;
        }
        try {
        label_49:
            if(v5 == 1) {
                byte[] arr_b2 = new byte[0x4000];
                int v12 = ⁱʾ0.FLD5463.read(arr_b2, 0, 0x4000);
                v14 = 0;
                for(int v13 = 0; v13 < v12; v13 += 2) {
                    arr_v2[v14] = (short)((arr_b2[v13 + 1] & 0xFF) << 8 | arr_b2[v13] & 0xFF);
                    ++v14;
                }
            }
            else {
                v14 = -1;
            }
            if(v14 > 0) {
                int v15 = this.MTH7454(arr_v2, arr_v2, arr_b);
                if(v15 <= 0) {
                    goto label_27;
                }
                fileOutputStream0.write(arr_b, 0, v15);
                goto label_27;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return;
        }
        try {
            v11 = (int)(((Integer)CLS166.MTH3192(class0, "flush", new Object[]{arr_b})));
            goto label_71;
        }
        catch(Throwable throwable2) {
            try {
            label_69:
                CLS27.MTH893(throwable2);
                v11 = -1;
            label_71:
                if(v11 > 0) {
                    fileOutputStream0.write(arr_b, 0, v11);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return;
            }
        }
        try {
            CLS166.MTH3192(class0, "close", new Object[0]);
            goto label_77;
        }
        catch(Throwable throwable3) {
            try {
                CLS27.MTH893(throwable3);
            label_77:
                fileOutputStream0.close();
                BufferedInputStream bufferedInputStream0 = ⁱʾ0.FLD5463;
                if(bufferedInputStream0 != null) {
                    bufferedInputStream0.close();
                }
                if(ˆٴ0 != null) {
                    ˆٴ0.MTH774();
                    return;
                }
                return;
            }
            catch(Throwable throwable0) {
            }
        }
        CLS27.MTH893(throwable0);
    }

    public final int MTH7448(int v, int v1, int v2) {
        try {
            return (int)(((Integer)CLS166.MTH3192(this.FLD5437, "init", new Object[]{v, v2, v1, 0x100, 5})));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return -1;
        }
    }

    @Override  // b.ʻˑ.CLS5
    public final void MTH777() {
        Class class0 = this.FLD5437;
        if(class0 == null) {
            return;
        }
        CLS166.MTH3192(class0, "SilkEncUnInit", new Object[0]);
    }

    @Override  // b.ʻˑ.CLS5
    public final void MTH778() {
        Class class0 = this.FLD5437;
        if(class0 == null) {
            return;
        }
        CLS166.MTH3192(class0, "SilkEncInit", new Object[]{16000, 16000, 4});
    }

    @Override  // b.ʻˑ.CLS5
    public final void MTH779() {
        Class class0 = this.FLD5437;
        if(class0 == null) {
            return;
        }
        CLS166.MTH3192(class0, "SilkDecUnInit", new Object[0]);
    }

    @Override  // b.ʻˑ.CLS5
    public final int MTH780(byte[] arr_b, short v, byte[] arr_b1, short[] arr_v) {
        return this.FLD5437 == null ? 0 : ((int)(((Integer)CLS166.MTH3192(this.FLD5437, "SilkDoEnc", new Object[]{arr_b, v, arr_b1, arr_v, Boolean.TRUE}))));
    }

    @Override  // b.ʻˑ.CLS5
    public final int MTH781(byte[] arr_b, short v) {
        return this.FLD5437 == null ? 0 : ((int)(((Integer)CLS166.MTH3192(this.FLD5437, "SilkDoDec", new Object[]{arr_b, v}))));
    }

    public final int MTH7454(short[] arr_v, short[] arr_v1, byte[] arr_b) {
        try {
            return (int)(((Integer)CLS166.MTH3192(this.FLD5437, "encode", new Object[]{arr_v, arr_v1, 0x2000, arr_b})));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return -1;
        }
    }

    @Override  // b.ʻˑ.CLS5
    public final void MTH782(int v, byte[] arr_b) {
        Class class0 = this.FLD5437;
        if(class0 == null) {
            return;
        }
        CLS166.MTH3192(class0, "SilkDecInit", new Object[]{16000, arr_b, v});
    }
}

