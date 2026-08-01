// Decompiled by JEB v5.42.0.202606242140

package c.ⁱˋ;

import android.content.ContentProvider;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.xmlpull.v1.XmlPullParserException;

public class CLS335 extends ContentProvider {
    public interface CLS334 {
        Uri MTH4771(File arg1);
    }

    public static class CLS814 implements CLS334 {
        public final String FLD1553;
        public final HashMap FLD1554;

        public CLS814(String s) {
            this.FLD1554 = new HashMap();
            this.FLD1553 = s;
        }

        @Override  // c.ⁱˋ.CLS335$CLS334
        public Uri MTH4771(File file0) {
            String s;
            try {
                s = file0.getCanonicalPath();
            }
            catch(IOException unused_ex) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file0);
            }
            Map.Entry map$Entry0 = null;
            for(Object object0: this.FLD1554.entrySet()) {
                Map.Entry map$Entry1 = (Map.Entry)object0;
                String s1 = ((File)map$Entry1.getValue()).getPath();
                if(s.startsWith(s1) && (map$Entry0 == null || s1.length() > ((File)map$Entry0.getValue()).getPath().length())) {
                    map$Entry0 = map$Entry1;
                }
            }
            if(map$Entry0 == null) {
                throw new IllegalArgumentException("Failed to find configured root that contains " + s);
            }
            String s2 = ((File)map$Entry0.getValue()).getPath();
            int v = s2.length();
            if(!s2.endsWith("/")) {
                ++v;
            }
            return new Uri.Builder().scheme("content").authority(this.FLD1553).encodedPath(Uri.encode(((String)map$Entry0.getKey())) + '/' + Uri.encode(s.substring(v), "/")).build();
        }

        public void MTH4774(String s, File file0) {
            File file1;
            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                file1 = file0.getCanonicalFile();
            }
            catch(IOException iOException0) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file0, iOException0);
            }
            this.FLD1554.put(s, file1);
        }
    }

    public static HashMap FLD1555;
    public static final String[] FLD1556;
    public static final File FLD1557;

    static {
        CLS335.FLD1556 = new String[]{"_display_name", "_size"};
        CLS335.FLD1557 = new File("/");
        CLS335.FLD1555 = new HashMap();
    }

    public static Uri MTH4776(Context context0, String s, File file0) {
        return CLS335.MTH4779(context0, s).MTH4771(file0);
    }

    public static CLS334 MTH4777(Context context0, String s) {
        CLS334 ˋʼ$ⁱˋ0 = new CLS814(s);
        XmlResourceParser xmlResourceParser0 = context0.getPackageManager().resolveContentProvider(s, 0x80).loadXmlMetaData(context0.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if(xmlResourceParser0 == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
    alab1:
        while(true) {
            switch(xmlResourceParser0.next()) {
                case 1: {
                    break alab1;
                }
                case 2: {
                    String s1 = xmlResourceParser0.getName();
                    File file0 = null;
                    String s2 = xmlResourceParser0.getAttributeValue(null, "name");
                    String s3 = xmlResourceParser0.getAttributeValue(null, "path");
                    if("root-path".equals(s1)) {
                        file0 = CLS335.FLD1557;
                    }
                    else if("files-path".equals(s1)) {
                        file0 = context0.getFilesDir();
                    }
                    else if("cache-path".equals(s1)) {
                        file0 = context0.getCacheDir();
                    }
                    else if("external-path".equals(s1)) {
                        file0 = Environment.getExternalStorageDirectory();
                    }
                    else if("external-files-path".equals(s1)) {
                        File[] arr_file = CLS333.MTH4768(context0, null);
                        if(arr_file.length > 0) {
                            file0 = arr_file[0];
                        }
                    }
                    else if("external-cache-path".equals(s1)) {
                        File[] arr_file1 = CLS333.MTH4767(context0);
                        if(arr_file1.length > 0) {
                            file0 = arr_file1[0];
                        }
                    }
                    else if(Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(s1)) {
                        File[] arr_file2 = context0.getExternalMediaDirs();
                        if(arr_file2.length > 0) {
                            file0 = arr_file2[0];
                        }
                    }
                    if(file0 == null) {
                        break;
                    }
                    ((CLS814)ˋʼ$ⁱˋ0).MTH4774(s2, CLS335.MTH4778(file0, new String[]{s3}));
                }
            }
        }
        return ˋʼ$ⁱˋ0;
    }

    public static File MTH4778(File file0, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(s != null) {
                file0 = new File(file0, s);
            }
        }
        return file0;
    }

    public static CLS334 MTH4779(Context context0, String s) {
        synchronized(CLS335.FLD1555) {
            CLS334 ˋʼ$ⁱˋ0 = (CLS334)CLS335.FLD1555.get(s);
            if(ˋʼ$ⁱˋ0 == null) {
                try {
                    ˋʼ$ⁱˋ0 = CLS335.MTH4777(context0, s);
                }
                catch(IOException iOException0) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", iOException0);
                }
                catch(XmlPullParserException xmlPullParserException0) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", xmlPullParserException0);
                }
                CLS335.FLD1555.put(s, ˋʼ$ⁱˋ0);
            }
            return ˋʼ$ⁱˋ0;
        }
    }
}

