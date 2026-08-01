// Decompiled by JEB v5.42.0.202606242140

package b.ˊﾞ;

import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import b.יﹳ.CLS166;
import b.ـˏ.CLS894;
import b.ⁱᵔ.CLS406;
import b.ﾞᐧ.CLS557;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;

public final class CLS101 {
    // 此方法包含解密的字符串
    public static CLS557 MTH1943(String s) {
        String s1 = new File(CLS31.MTH1038(CLS27.MTH900()), "voice_pcm_temp").getAbsolutePath();
        int v = 0;
        if(CLS27.MTH890("SilkPlayerClass1")) {
            try {
                v = !TextUtils.isEmpty(((String)CLS166.MTH3195(CLS166.MTH3188(CLS27.MTH894("SilkPlayerClass1"), new Object[0]), CLS27.MTH897("SilkPlayerClass1_method1"), new Object[]{s, s1})));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        if(v == 0) {
            goto label_11;
        }
        else {
            File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "voice_wav_temp");
            try {
                CLS613.MTH1979(new File(s1), file0);
                return new CLS557(file0);
            label_11:
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                CLS613.MTH1982(s, byteArrayOutputStream0);
                byte[] arr_b = byteArrayOutputStream0.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                CLS613.MTH1975(new ByteArrayInputStream(arr_b), byteArrayOutputStream1);
                return new CLS557(new ByteArrayInputStream(byteArrayOutputStream1.toByteArray()));
            }
            catch(Throwable throwable1) {
            }
        }
        CLS27.MTH893(throwable1);
        return null;
    }

    public static ArrayList MTH1944(CLS557 ˆٴ0, int v) {
        ArrayList arrayList0 = new ArrayList();
        if(ˆٴ0 != null) {
            CLS557 ˆٴ1 = CLS101.MTH1945(ˆٴ0);
            int v1 = ˆٴ1.MTH7474();
            ArrayList arrayList1 = new ArrayList();
            ArrayList arrayList2 = CLS613.MTH1983(ˆٴ1, 0, v1, v * 1000, arrayList1);
            for(int v2 = 0; v2 < arrayList2.size(); ++v2) {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                CLS613.MTH1966(((byte[])arrayList2.get(v2)), byteArrayOutputStream0);
                arrayList0.add(new CLS894(((int)(((Integer)arrayList1.get(v2)))) * 1000, byteArrayOutputStream0.toByteArray()));
            }
        }
        return arrayList0;
    }

    public static CLS557 MTH1945(CLS557 ˆٴ0) {
        if(ˆٴ0.FLD5443.FLD5446 > 1) {
            try {
                ˆٴ0.MTH7472();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        if(((int)ˆٴ0.FLD5443.FLD5447) != 8000 && ((int)ˆٴ0.FLD5443.FLD5447) != 16000) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            CLS613.MTH1977(ˆٴ0, byteArrayOutputStream0);
            return new CLS557(byteArrayOutputStream0.toByteArray());
        }
        return ˆٴ0;
    }

    public static void MTH1946(int v, int v1, String s, String s1) {
        if(v == 0) {
            v = -1;
        }
        if(v1 == 0) {
            v1 = -1;
        }
        try {
            CLS406.MTH5919(s, s1, v, v1);
            goto label_8;
        }
        catch(Throwable throwable0) {
            try {
                CLS27.MTH893(throwable0);
            label_8:
                if(Build.VERSION.SDK_INT >= 16) {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
                        mediaMetadataRetriever0.setDataSource(s1);
                        String s2 = mediaMetadataRetriever0.extractMetadata(12);
                        mediaMetadataRetriever0.release();
                        if(TextUtils.isEmpty(s2)) {
                            return;
                        }
                        String s3 = MimeTypeMap.getSingleton().getExtensionFromMimeType(s2);
                        if(TextUtils.isEmpty(s3)) {
                            return;
                        }
                        File file0 = new File(s1);
                        file0.renameTo(new File(file0.getParent(), file0.getName() + "." + s3));
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                    return;
                }
                return;
            }
            catch(Throwable throwable1) {
            }
        }
        CLS27.MTH893(throwable1);
    }

    public static CLS557 MTH1947(int v, int v1, String s) {
        try {
            File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "vid_audio_temp");
            String s1 = file0.getAbsolutePath();
            if(v == 0) {
                v = -1;
            }
            if(v1 == 0) {
                v1 = -1;
            }
            try {
                CLS406.MTH5919(s, s1, v, v1);
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            String s2 = file0.getAbsolutePath();
            return new CLS100().MTH1941(0L, 0L, s2);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1948(CLS557 ˆٴ0, CLS81 יᐧ0) {
        ArrayList arrayList0 = CLS613.MTH1983(CLS101.MTH1945(ˆٴ0), 0, יᐧ0.MTH1666(), יᐧ0.FLD305 * 1000, יᐧ0.FLD306);
        long v = 0L;
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            byte[] arr_b = (byte[])arrayList0.get(v1);
            CLS47.FLD167.getClass();
            v = CLS613.MTH1966(arr_b, CLS25.MTH865(3, CLS31.MTH979((יᐧ0.FLD310 + "_p" + v1 + "_amr"), "amr"), "audio/amr"));
        }
        return v != 0L;
    }
}

