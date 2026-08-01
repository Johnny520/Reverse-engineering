// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import t.ˊﾞ.CLS106;
import t.ˊﾞ.CLS113;

public final class CLS132 {
    public static final class CLS131 {
        public final List FLD937;
        public final HashMap FLD938;
        public final int FLD939;
        public final Set FLD940;
        public final ArrayList FLD941;

        public CLS131(ArrayList arrayList0, ArrayList arrayList1) {
            this.FLD937 = Collections.synchronizedList(arrayList0);
            this.FLD940 = Collections.synchronizedSet(new HashSet(arrayList0));
            this.FLD939 = 10;
            this.FLD941 = arrayList1;
            this.FLD938 = new HashMap();
        }

        public final String MTH2076(String s) {
            if(this.FLD940.contains(s)) {
                return s;
            }
            HashMap hashMap0 = this.FLD938;
            if(hashMap0.containsKey(s)) {
                return (String)hashMap0.get(s);
            }
            for(Object object0: this.FLD937) {
                String s1 = (String)object0;
                if(s1.startsWith(s)) {
                    hashMap0.put(s, s1);
                    return s1;
                }
                if(false) {
                    break;
                }
            }
            hashMap0.put(s, null);
            return null;
        }

        public final Uri MTH2077(String s) {
            String s1 = this.MTH2076(s);
            return TextUtils.isEmpty(s1) ? null : CLS132.MTH2091(this.FLD939, s1, this.FLD941);
        }

        public final File MTH2078(String s) {
            String s1 = this.MTH2076(s);
            return TextUtils.isEmpty(s1) ? null : CLS132.MTH2096(this.FLD939, s1, this.FLD941);
        }
    }

    public static final CLS113 FLD942;
    public static final HashMap FLD943;

    static {
        CLS132.FLD942 = new CLS113(3600000L);
        CLS132.FLD943 = new HashMap();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static OutputStream MTH2080(String s, String s1, ArrayList arrayList0) {
        return (OutputStream)CLS123.FLD912.MTH2010("core", "getModuleFileOutputStream", new Object[]{10, s, s1, arrayList0});
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static InputStream MTH2081(String s, String[] arr_s) {
        if(arr_s.length > 0) {
            ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
            return (InputStream)CLS123.FLD912.MTH2010("core", "getModuleFileInputStream", new Object[]{10, s, arrayList0});
        }
        return (InputStream)CLS123.FLD912.MTH2010("core", "getModuleFileInputStream", new Object[]{10, s});
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static OutputStream MTH2082(String s, String s1) {
        return (OutputStream)CLS123.FLD912.MTH2010("core", "getModuleFileOutputStream", new Object[]{10, s, s1});
    }

    // 此方法包含解密的字符串
    public static void MTH2083(String s, String[] arr_s) {
        ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
        String s1 = arrayList0.isEmpty() ? "10" + s : "10" + s + TextUtils.join("_", arrayList0);
        CLS132.FLD942.FLD836.remove(s1);
        CLS132.FLD943.remove(s1);
        CLS123.FLD912.MTH2010("core", "clearModuleFileCache", new Object[]{s1});
    }

    public static OutputStream MTH2084(String s, String s1, String[] arr_s) {
        return arr_s.length <= 0 ? CLS132.MTH2082(s, s1) : CLS132.MTH2080(s, s1, new ArrayList(Arrays.asList(arr_s)));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static CLS131 MTH2085(String[] arr_s) {
        if(arr_s.length > 0) {
            ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
            return new CLS131(((ArrayList)CLS123.FLD912.MTH2010("core", "listModuleFiles", new Object[]{10, arrayList0})), arrayList0);
        }
        return CLS132.MTH2095();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH2086(int v, String s, ArrayList arrayList0) {
        return ((Boolean)CLS123.FLD912.MTH2010("core", "deleteModuleFile", new Object[]{v, s, arrayList0})).booleanValue();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH2087(int v, String s, ArrayList arrayList0) {
        return ((Boolean)CLS123.FLD912.MTH2010("core", "moduleFileExists", new Object[]{v, s, arrayList0})).booleanValue();
    }

    // 此方法包含解密的字符串
    public static Uri MTH2088(String s, String[] arr_s) {
        if(arr_s.length > 0) {
            return CLS132.MTH2091(10, s, new ArrayList(Arrays.asList(arr_s)));
        }
        CLS113 ﾞᐧ0 = CLS132.FLD942;
        if(ﾞᐧ0.MTH1897("10" + s)) {
            return (Uri)ﾞᐧ0.MTH1896("10" + s);
        }
        Uri uri0 = (Uri)CLS123.FLD912.MTH2010("core", "getModuleFileUri", new Object[]{10, s});
        ﾞᐧ0.MTH1898("10" + s, uri0, ﾞᐧ0.FLD838);
        return uri0;
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public static void MTH2089(File file0, String[] arr_s) {
        if(arr_s.length > 0) {
            ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
            CLS123.FLD912.MTH2004("core", "copyToModuleDir", new Object[]{file0, 10, arrayList0});
            return;
        }
        CLS123.FLD912.MTH2004("core", "copyToModuleDir", new Object[]{file0, 10});
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public static boolean MTH2090(String s, String[] arr_s) {
        return arr_s.length <= 0 ? ((Boolean)CLS123.FLD912.MTH2010("core", "moduleFileExists", new Object[]{10, s})).booleanValue() : CLS132.MTH2087(10, s, new ArrayList(Arrays.asList(arr_s)));
    }

    // 此方法包含解密的字符串
    public static Uri MTH2091(int v, String s, ArrayList arrayList0) {
        String s1 = v + s + "_" + TextUtils.join("_", arrayList0);
        CLS113 ﾞᐧ0 = CLS132.FLD942;
        if(ﾞᐧ0.MTH1897(s1)) {
            return (Uri)ﾞᐧ0.MTH1896(s1);
        }
        Uri uri0 = (Uri)CLS123.FLD912.MTH2010("core", "getModuleFileUri", new Object[]{v, s, arrayList0});
        ﾞᐧ0.MTH1898(s1, uri0, ﾞᐧ0.FLD838);
        return uri0;
    }

    public static void MTH2092(File file0, String s, String[] arr_s) {
        if(arr_s.length > 0) {
            ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
            OutputStream outputStream0 = CLS132.MTH2080(s, CLS125.MTH2034(file0), arrayList0);
            CLS125.MTH2038(new CLS106(file0).MTH1847(), outputStream0);
            return;
        }
        OutputStream outputStream1 = CLS132.MTH2082(s, CLS125.MTH2034(file0));
        CLS125.MTH2038(new CLS106(file0).MTH1847(), outputStream1);
    }

    public static void MTH2093(String s, String[] arr_s) {
        if(arr_s.length > 0) {
            CLS132.MTH2086(10, s, new ArrayList(Arrays.asList(arr_s)));
            return;
        }
        CLS132.MTH2097(s);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static boolean MTH2094(File file0, String[] arr_s) {
        if(arr_s.length > 0) {
            ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
            return ((Boolean)CLS123.FLD912.MTH2010("core", "zipModuleDir", new Object[]{file0, 10, arrayList0})).booleanValue();
        }
        return ((Boolean)CLS123.FLD912.MTH2010("core", "zipModuleDir", new Object[]{file0, 10})).booleanValue();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static CLS131 MTH2095() {
        return new CLS131(((ArrayList)CLS123.FLD912.MTH2010("core", "listModuleFiles", new Object[]{10})), null);
    }

    // 此方法包含解密的字符串
    public static File MTH2096(int v, String s, ArrayList arrayList0) {
        if(!CLS132.MTH2087(v, s, arrayList0)) {
            return null;
        }
        String s1 = v + s + TextUtils.join("_", arrayList0);
        HashMap hashMap0 = CLS132.FLD943;
        if(hashMap0.containsKey(s1)) {
            File file0 = (File)hashMap0.get(s1);
            if(CLS125.MTH2023(file0)) {
                return file0;
            }
        }
        Uri uri0 = CLS132.MTH2091(v, s, arrayList0);
        if(uri0 == null) {
            return null;
        }
        File file1 = new File(CLS133.MTH2108().getCacheDir(), CLS125.MTH2025((s + "_" + Long.toHexString(System.currentTimeMillis())), CLS125.MTH2032(CLS133.MTH2108(), uri0)));
        CLS125.MTH2037(file1.getAbsolutePath());
        CLS125.MTH2036(CLS125.MTH2027(uri0), file1);
        hashMap0.put(s1, file1);
        return file1;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH2097(String s) {
        return ((Boolean)CLS123.FLD912.MTH2010("core", "deleteModuleFile", new Object[]{10, s})).booleanValue();
    }
}

