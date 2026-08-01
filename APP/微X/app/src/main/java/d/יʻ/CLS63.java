// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import android.content.Context;
import d.ˎˏ.CLS4;
import d.ᵎʻ.CLS119;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS63 {
    // 此方法包含解密的字符串
    public static void MTH764(String s) {
        try {
            CLS61 ˉᵢ0 = CLS69.MTH801();
            JSONArray jSONArray0 = new JSONArray();
            ˉᵢ0.getClass();
            try {
                Object object0 = ˉᵢ0.MTH749(jSONArray0, "cleanup_files");
                if(object0 != null) {
                    jSONArray0 = (JSONArray)object0;
                }
            }
            catch(Throwable throwable1) {
                CLS69.MTH797(throwable1);
            }
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("path", s);
            jSONObject0.put("time", System.currentTimeMillis());
            jSONArray0.put(jSONObject0);
            CLS69.MTH801().MTH741(jSONArray0, "cleanup_files");
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH765(File file0) {
        if(!CLS63.MTH771(file0)) {
            return "";
        }
        try {
            byte[] arr_b = CLS63.MTH768(file0);
            return arr_b == null ? "" : new String(arr_b).trim();
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static String MTH766(Context context0) {
        if(context0 != null) {
            File file0 = context0.getCacheDir();
            return file0.canWrite() ? new File(file0, "tmp_" + Long.toHexString(System.currentTimeMillis())).getAbsolutePath() : new File(null, "tmp_" + Long.toHexString(System.currentTimeMillis())).getAbsolutePath();
        }
        return new File(null, "tmp_" + Long.toHexString(System.currentTimeMillis())).getAbsolutePath();
    }

    // 此方法包含解密的字符串
    public static void MTH767(File file0) {
        if(file0 == null) {
            return;
        }
        CLS119 ⁱٴ0 = new CLS119(file0);
        if(!CLS63.MTH772(ⁱٴ0)) {
            try {
                Object object0 = ⁱٴ0.FLD669;
                if(object0 != null) {
                    ((Boolean)CLS4.MTH389(object0, CLS69.MTH800("VFSFileClass1mkdirsMethod", "mkdirs"), new Object[0])).booleanValue();
                    return;
                }
                goto label_10;
            }
            catch(Throwable throwable0) {
                try {
                    CLS69.MTH797(throwable0);
                    try {
                    label_10:
                        ((File)ⁱٴ0.FLD667).mkdirs();
                    }
                    catch(Throwable throwable2) {
                        CLS69.MTH797(throwable2);
                    }
                    return;
                }
                catch(Throwable throwable1) {
                }
            }
            CLS69.MTH797(throwable1);
        }
    }

    public static byte[] MTH768(File file0) {
        CLS119 ⁱٴ0 = new CLS119(file0);
        try {
            if(CLS63.MTH772(ⁱٴ0)) {
                InputStream inputStream0 = ⁱٴ0.MTH1169();
                if(inputStream0 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        return CLS63.MTH770(inputStream0, byteArrayOutputStream0) ? byteArrayOutputStream0.toByteArray() : null;
                    }
                    catch(Throwable throwable1) {
                    }
                }
            }
            else {
                return null;
            }
            CLS69.MTH797(throwable1);
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static boolean MTH769(File file0, byte[] arr_b) {
        CLS119 ⁱٴ0 = new CLS119(file0);
        try {
            if(!CLS63.MTH772(ⁱٴ0)) {
                CLS63.MTH767(new File(ⁱٴ0.MTH1166()).getParentFile());
                try {
                    Object object0 = ⁱٴ0.FLD669;
                    if(object0 == null) {
                        goto label_9;
                    }
                    else {
                        ((Boolean)CLS4.MTH389(object0, CLS69.MTH800("VFSFileClass1createNewFileMethod", "createNewFile"), new Object[0])).booleanValue();
                    }
                    goto label_16;
                }
                catch(Throwable throwable1) {
                    try {
                        CLS69.MTH797(throwable1);
                        try {
                        label_9:
                            ((File)ⁱٴ0.FLD667).createNewFile();
                        }
                        catch(Throwable throwable3) {
                            CLS69.MTH797(throwable3);
                        }
                        goto label_16;
                    }
                    catch(Throwable throwable2) {
                    }
                }
                CLS69.MTH797(throwable2);
            }
        label_16:
            OutputStream outputStream0 = ⁱٴ0.MTH1168();
            if(outputStream0 != null) {
                try {
                    outputStream0.write(arr_b);
                    outputStream0.close();
                    return true;
                }
                catch(Throwable throwable4) {
                    CLS69.MTH797(throwable4);
                    return false;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH809(ⁱٴ0.MTH1167());
            CLS69.MTH797(throwable0);
        }
        return false;
    }

    public static boolean MTH770(InputStream inputStream0, OutputStream outputStream0) {
        try {
            byte[] arr_b = new byte[0x100000];
            int v;
            while((v = inputStream0.read(arr_b)) > 0) {
                outputStream0.write(arr_b, 0, v);
            }
            inputStream0.close();
            outputStream0.flush();
            outputStream0.close();
            return true;
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return false;
        }
    }

    public static boolean MTH771(File file0) {
        return CLS63.MTH772(new CLS119(file0));
    }

    // 此方法包含解密的字符串
    public static boolean MTH772(CLS119 ⁱٴ0) {
        boolean z;
        Object object0;
        try {
            object0 = ⁱٴ0.FLD667;
            Object object1 = ⁱٴ0.FLD669;
            if(object1 == null) {
                goto label_7;
            }
            else {
                z = ((Boolean)CLS4.MTH389(object1, CLS69.MTH800("VFSFileClass1ExistsMethod", "exists"), new Object[0])).booleanValue();
            }
            goto label_12;
        }
        catch(Throwable throwable0) {
            try {
                CLS69.MTH797(throwable0);
                try {
                label_7:
                    z = ((File)object0).exists();
                }
                catch(Throwable throwable2) {
                    CLS69.MTH797(throwable2);
                    z = false;
                }
            label_12:
                if(z) {
                    try {
                        Object object2 = ⁱٴ0.FLD669;
                        if(object2 != null) {
                            return ((long)(((Long)CLS4.MTH389(object2, CLS69.MTH800("VFSFileClass1LengthMethod", "length"), new Object[0])))) != 0L;
                        }
                    }
                    catch(Throwable throwable3) {
                        CLS69.MTH797(throwable3);
                    }
                    try {
                        return ((File)object0).length() != 0L;
                    }
                    catch(Throwable throwable4) {
                        CLS69.MTH797(throwable4);
                        return false;
                    }
                }
                return false;
            }
            catch(Throwable throwable1) {
            }
        }
        CLS69.MTH797(throwable1);
        return false;
    }

    public static String MTH773(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        try {
            CRC32 cRC320 = new CRC32();
            cRC320.update(arr_b);
            return Long.toHexString(cRC320.getValue());
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return null;
        }
    }
}

