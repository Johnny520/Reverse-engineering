// Decompiled by JEB v5.42.0.202606242140

package b.ˊﾞ;

import android.content.Context;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS5;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS69;
import b.ⁱᵔ.CLS372;
import b.ﾞٴ.CLS1636;
import b.ﾞٴ.CLS1637;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS558;
import b.ﾞᐧ.CLS559;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public final class CLS613 implements CLS2 {
    public static boolean MTH1965(Context context0) {
        try {
            NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
            if(networkInfo0 == null || !networkInfo0.isConnected() || networkInfo0.getType() != 1) {
                return false;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return true;
    }

    public static long MTH1966(byte[] arr_b, OutputStream outputStream0) {
        int v3;
        long v2;
        CLS1636 ˆٴ0;
        byte[] arr_b2;
        byte[] arr_b1;
        int v1;
        long v = 0L;
        if(arr_b == null) {
            return 0L;
        }
        try {
            v1 = arr_b.length;
            arr_b1 = new byte[640];
            arr_b2 = new byte[640];
            switch(CLS27.MTH903(1, "MediaRecorderVersion")) {
                case 1: {
                    ˆٴ0 = new CLS1636(1);
                    break;
                }
                case 2: {
                    ˆٴ0 = new CLS1637();
                    break;
                }
                default: {
                    ˆٴ0 = null;
                }
            }
            if(ˆٴ0 == null) {
                return 0L;
            }
            ((CLS5)ˆٴ0).MTH777();
            ((CLS5)ˆٴ0).MTH778();
            v2 = 0L;
            v3 = 0;
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        throwable0.printStackTrace();
        return v;
        try {
        label_21:
            while(v1 >= 640) {
                System.arraycopy(arr_b, v3, arr_b2, 0, 640);
                v3 += 640;
                v1 -= 640;
                short[] arr_v = new short[1];
                if(((CLS5)ˆٴ0).MTH780(arr_b2, 640, arr_b1, arr_v) != 0) {
                    return 0L;
                }
                int v4 = arr_v[0];
                if(v4 < 640) {
                    v2 += (long)v4;
                    outputStream0.write(arr_b1, 0, v4);
                }
            }
            outputStream0.flush();
            outputStream0.close();
            ((CLS5)ˆٴ0).MTH777();
            return v2;
        }
        catch(Throwable throwable0) {
            v = v2;
        }
        throwable0.printStackTrace();
        return v;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1967() [...] // 潜在的解密器

    @Override  // b.ʻˑ.CLS2
    public void MTH772() {
    }

    public static long MTH1969(long v) {
        int v1 = (short)(((int)(v & 0xFFFFL)));
        int v2 = (short)(((int)(v >>> 16 & 0xFFFFL)));
        int v3 = (short)(v1 + v2);
        int v4 = (short)(v2 ^ v1);
        return (((long)(((short)(v4 >>> 22 | v4 << 10)))) | ((long)(((short)(((short)(v3 >>> 23 | v3 << 9)) + v1)))) << 16) << 16 | ((long)(((short)(((short)(((short)(v1 << 13 | v1 >>> 19)) ^ v4)) ^ v4 << 5))));
    }

    public static void MTH1970(OutputStream outputStream0, String s) {
        for(int v = 0; v < s.length(); ++v) {
            outputStream0.write(s.charAt(v));
        }
    }

    public static String MTH1971(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        if(s.contains("‮") && s.contains("‭")) {
            s = s.substring(0, s.indexOf("‮")) + s.substring(s.indexOf("‭") + 1);
        }
        return s.replaceAll("\\u202E|\\u202D|\\n|\\r", "").trim();
    }

    public static void MTH1972(OutputStream outputStream0, short v) {
        outputStream0.write(v);
        outputStream0.write(v >> 8);
    }

    public static void MTH1973(ZipOutputStream zipOutputStream0, String s, File file0) {
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null) {
                for(int v = 0; v < arr_file.length; ++v) {
                    File file1 = arr_file[v];
                    String s1 = file1.getName();
                    if(!TextUtils.isEmpty(s)) {
                        s1 = s + "/" + s1;
                    }
                    if(file1.isDirectory()) {
                        CLS613.MTH1980(zipOutputStream0, s1 + "/", file1);
                        CLS613.MTH1973(zipOutputStream0, s1, file1);
                    }
                    else {
                        CLS613.MTH1980(zipOutputStream0, s1, file1);
                    }
                }
            }
        }
        else {
            String s2 = file0.getName();
            if(!TextUtils.isEmpty(s)) {
                s2 = s + "/" + s2;
            }
            CLS613.MTH1980(zipOutputStream0, s2, file0);
        }
    }

    public static void MTH1974(InputStream inputStream0, File file0) {
        if(file0 != null && (!CLS31.MTH1001(file0) || !file0.isDirectory())) {
            CLS31.MTH1026(file0);
        }
        try {
            ZipInputStream zipInputStream0 = new ZipInputStream(inputStream0);
            ZipEntry zipEntry0;
            while((zipEntry0 = zipInputStream0.getNextEntry()) != null) {
                if(zipEntry0.isDirectory()) {
                    File file1 = new File(file0, zipEntry0.getName());
                    if(CLS31.MTH1001(file1) && file1.isDirectory()) {
                        continue;
                    }
                    CLS31.MTH1026(file1);
                }
                else {
                    FileOutputStream fileOutputStream0 = new FileOutputStream(new File(file0, zipEntry0.getName()));
                    int v;
                    while((v = zipInputStream0.read()) != -1) {
                        fileOutputStream0.write(v);
                    }
                    zipInputStream0.closeEntry();
                    fileOutputStream0.close();
                }
            }
            zipInputStream0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH1975(ByteArrayInputStream byteArrayInputStream0, ByteArrayOutputStream byteArrayOutputStream0) {
        try {
            int v = byteArrayInputStream0.available();
            CLS613.MTH1970(byteArrayOutputStream0, "RIFF");
            CLS613.MTH1981(byteArrayOutputStream0, v + 36);
            CLS613.MTH1970(byteArrayOutputStream0, "WAVE");
            CLS613.MTH1970(byteArrayOutputStream0, "fmt ");
            CLS613.MTH1981(byteArrayOutputStream0, 16);
            CLS613.MTH1972(byteArrayOutputStream0, 1);
            CLS613.MTH1972(byteArrayOutputStream0, 1);
            CLS613.MTH1981(byteArrayOutputStream0, 16000);
            CLS613.MTH1981(byteArrayOutputStream0, 32000);
            CLS613.MTH1972(byteArrayOutputStream0, 2);
            CLS613.MTH1972(byteArrayOutputStream0, 16);
            CLS613.MTH1970(byteArrayOutputStream0, "data");
            CLS613.MTH1981(byteArrayOutputStream0, v);
            byte[] arr_b = new byte[0x2800];
            int v1;
            while((v1 = byteArrayInputStream0.read(arr_b)) != -1) {
                byteArrayOutputStream0.write(arr_b, 0, v1);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static boolean MTH1976(File file0, File file1) {
        try {
            ZipOutputStream zipOutputStream0 = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file1)));
            CLS613.MTH1973(zipOutputStream0, "", file0);
            zipOutputStream0.close();
            return true;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    public static void MTH1977(CLS557 ˆٴ0, ByteArrayOutputStream byteArrayOutputStream0) {
        byte[] arr_b1;
        int v = (int)ˆٴ0.FLD5443.FLD5447;
        byte[] arr_b = ˆٴ0.FLD5444;
        int v1 = ˆٴ0.FLD5443.FLD5453 / 8;
        int v2 = arr_b.length / v1;
        short[] arr_v = new short[v2];
        int v3 = 0;
        for(int v4 = 0; v4 < v2; ++v4) {
            int v6 = 0;
            short v7 = 0;
            for(int v5 = 0; v6 < v1; ++v5) {
                v7 = (short)(((short)((arr_b[v5] & 0xFF) << v6 * 8)) | v7);
                ++v6;
            }
            arr_v[v4] = v7;
        }
        if(v != 16000) {
            int v8 = Math.round(((float)v2) / ((float)v) * 16000.0f);
            short[] arr_v1 = new short[v8];
            for(int v9 = 0; v9 < v8; ++v9) {
                float f = ((float)v9) / (((float)v8) / ((float)v2));
                int v10 = arr_v[(((int)f) + 1 < v2 ? ((int)f) + 1 : v2 - 1)];
                int v11 = arr_v[((int)f)];
                arr_v1[v9] = (short)(((int)((f - ((float)(((int)f)))) * ((float)(v10 - v11)) + ((float)v11))));
            }
            arr_v = arr_v1;
        }
        if(v1 == 1) {
            arr_b1 = new byte[arr_v.length];
            while(v3 < arr_v.length) {
                arr_b1[v3] = (byte)arr_v[v3];
                ++v3;
            }
        }
        else {
            arr_b1 = new byte[arr_v.length * 2];
            while(v3 < arr_v.length) {
                int v12 = arr_v[v3];
                arr_b1[v3 * 2] = (byte)(v12 & 0xFF);
                arr_b1[v3 * 2 + 1] = (byte)(v12 >> 8 & 0xFF);
                ++v3;
            }
        }
        CLS558 ٴـ0 = ˆٴ0.FLD5443;
        ٴـ0.MTH7479(16000);
        new CLS559(new CLS557(ٴـ0, arr_b1)).MTH7483(byteArrayOutputStream0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public void MTH773(String s, String s1, ArrayList arrayList0) {
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            CLS372.MTH5412("", true);
        }
    }

    // This method contains unreflected code
    public static void MTH1979(File file0, File file1) {
        int v = (int)file0.length();
        try(FileOutputStream fileOutputStream0 = new FileOutputStream(file1)) {
            CLS613.MTH1970(fileOutputStream0, "RIFF");
            CLS613.MTH1981(fileOutputStream0, v + 36);
            CLS613.MTH1970(fileOutputStream0, "WAVE");
            CLS613.MTH1970(fileOutputStream0, "fmt ");
            CLS613.MTH1981(fileOutputStream0, 16);
            CLS613.MTH1972(fileOutputStream0, 1);
            CLS613.MTH1972(fileOutputStream0, 1);
            CLS613.MTH1981(fileOutputStream0, 16000);
            CLS613.MTH1981(fileOutputStream0, 32000);
            CLS613.MTH1972(fileOutputStream0, 2);
            CLS613.MTH1972(fileOutputStream0, 16);
            CLS613.MTH1970(fileOutputStream0, "data");
            CLS613.MTH1981(fileOutputStream0, v);
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            byte[] arr_b = new byte[0x2800];
            int v1;
            while((v1 = fileInputStream0.read(arr_b)) != -1) {
                fileOutputStream0.write(arr_b, 0, v1);
            }
        }
    }

    public static void MTH1980(ZipOutputStream zipOutputStream0, String s, File file0) {
        try {
            if(file0.isDirectory()) {
                zipOutputStream0.putNextEntry(new ZipEntry(s));
                return;
            }
            byte[] arr_b = new byte[0x1800];
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(fileInputStream0, 0x1800);
            zipOutputStream0.putNextEntry(new ZipEntry(s));
            int v;
            while((v = bufferedInputStream0.read(arr_b, 0, 0x1800)) != -1) {
                zipOutputStream0.write(arr_b, 0, v);
            }
            bufferedInputStream0.close();
            fileInputStream0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH1981(OutputStream outputStream0, int v) {
        outputStream0.write(v);
        outputStream0.write(v >> 8);
        outputStream0.write(v >> 16);
        outputStream0.write(v >> 24);
    }

    public static void MTH1982(String s, ByteArrayOutputStream byteArrayOutputStream0) {
        byte[] arr_b;
        CLS69 ʾᵢ0 = new CLS69(new File(s));
        CLS1636 ˆٴ0 = null;
        try {
            if(CLS31.MTH1029(ʾᵢ0)) {
                arr_b = CLS31.MTH1020(ʾᵢ0.MTH1554());
            }
            else {
                goto label_9;
            }
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            arr_b = null;
        }
        goto label_10;
    label_9:
        arr_b = null;
    label_10:
        if(arr_b != null) {
            try {
                switch(CLS27.MTH903(1, "MediaRecorderVersion")) {
                    case 1: {
                        ˆٴ0 = new CLS1636(1);
                        break;
                    }
                    case 2: {
                        ˆٴ0 = new CLS1637();
                    }
                }
                if(ˆٴ0 != null) {
                    ((CLS5)ˆٴ0).MTH779();
                    ((CLS5)ˆٴ0).MTH782(arr_b.length, arr_b);
                    byte[] arr_b1 = new byte[AudioTrack.getMinBufferSize(16000, 2, 2) * 2];
                    while(true) {
                        if(((CLS5)ˆٴ0).MTH781(arr_b1, 320) <= 0) {
                            byteArrayOutputStream0.close();
                            ((CLS5)ˆٴ0).MTH779();
                            return;
                        }
                        byteArrayOutputStream0.write(arr_b1, 0, 640);
                        byteArrayOutputStream0.flush();
                    }
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
    }

    public static ArrayList MTH1983(CLS557 ˆٴ0, int v, int v1, int v2, ArrayList arrayList0) {
        int v3;
        ArrayList arrayList1 = new ArrayList();
        CLS559 ᵔʾ0 = new CLS559();
        if(v == 0 && v1 < v2) {
            ᵔʾ0.FLD5459 = ˆٴ0;
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            ᵔʾ0.MTH7483(byteArrayOutputStream0);
            arrayList1.add(byteArrayOutputStream0.toByteArray());
            arrayList0.add(((int)(v1 / 1000)));
            return arrayList1;
        }
        while(true) {
            try {
                v3 = v + v2;
                int v4 = Math.min(v1, v3);
                if(arrayList0 != null) {
                    arrayList0.add(((int)((v4 - v) / 1000)));
                }
                byte[] arr_b = ˆٴ0.FLD5444;
                byte[] arr_b1 = new byte[arr_b.length];
                System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
                ᵔʾ0.FLD5459 = new CLS557(CLS557.MTH7470(((int)ˆٴ0.FLD5443.FLD5447), arr_b.length, ˆٴ0.FLD5443.FLD5446), arr_b1);
                ((CLS557)ᵔʾ0.FLD5459).MTH7473(((double)v) / 1000.0, ((double)v4) / 1000.0);
                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                ᵔʾ0.MTH7483(byteArrayOutputStream1);
                arrayList1.add(byteArrayOutputStream1.toByteArray());
            }
            catch(Throwable throwable0) {
                throwable0.printStackTrace();
                return arrayList1;
            }
            if(v4 == v1) {
                break;
            }
            v = v3;
        }
        return arrayList1;
    }
}

