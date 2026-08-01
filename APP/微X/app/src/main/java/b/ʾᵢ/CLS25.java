// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.net.Uri;
import android.text.TextUtils;
import b.ˈˈ.CLS92;
import b.ᐧˉ.CLS182;
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

public final class CLS25 {
    public static final class CLS24 {
        public final List FLD85;
        public final HashMap FLD86;
        public final int FLD87;
        public final Set FLD88;
        public final ArrayList FLD89;

        public CLS24(ArrayList arrayList0, int v) {
            this.FLD85 = Collections.synchronizedList(arrayList0);
            this.FLD88 = Collections.synchronizedSet(new HashSet(arrayList0));
            this.FLD87 = v;
            this.FLD89 = null;
            this.FLD86 = new HashMap();
        }

        // 此方法包含解密的字符串
        public final void MTH853(String s) {
            String s1 = this.MTH855(s);
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            this.FLD85.remove(s1);
            this.FLD88.remove(s1);
            this.FLD86.remove(s);
            ((Boolean)CLS21.FLD76.MTH816("core", "deleteModuleFile", new Object[]{this.FLD87, s1, this.FLD89})).booleanValue();
        }

        public final boolean MTH854() {
            return this.FLD85 == null || this.FLD85.isEmpty();
        }

        public final String MTH855(String s) {
            if(this.FLD88.contains(s)) {
                return s;
            }
            HashMap hashMap0 = this.FLD86;
            if(hashMap0.containsKey(s)) {
                return (String)hashMap0.get(s);
            }
            for(Object object0: this.FLD85) {
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

        public final boolean MTH856(String s) {
            return !TextUtils.isEmpty(this.MTH855(s));
        }

        public final InputStream MTH857(String s) {
            String s1 = this.MTH855(s);
            return TextUtils.isEmpty(s1) ? null : CLS25.MTH870(this.FLD87, s1, this.FLD89);
        }

        // 此方法包含解密的字符串
        public final void MTH858() {
            ArrayList arrayList0 = (ArrayList)CLS21.FLD76.MTH816("core", "listModuleFiles", new Object[]{this.FLD87, this.FLD89});
            this.FLD85.clear();
            this.FLD85.addAll(arrayList0);
            this.FLD88.clear();
            this.FLD88.addAll(this.FLD85);
            HashSet hashSet0 = new HashSet(this.FLD86.keySet());
            this.FLD86.clear();
            for(Object object0: hashSet0) {
                this.MTH855(((String)object0));
            }
            CLS570 ـﹳ0 = new CLS570(this, 0);
            CLS40.FLD157.MTH1124(((CLS39)ـﹳ0));
        }
    }

    public static final CLS92 FLD90;
    public static final HashMap FLD91;

    static {
        CLS25.FLD90 = new CLS92(3600000L);
        CLS25.FLD91 = new HashMap();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH860(int v, String s) {
        return ((Boolean)CLS21.FLD76.MTH816("core", "moduleFileExists", new Object[]{v, s})).booleanValue();
    }

    // 此方法包含解密的字符串
    public static Uri MTH861(int v, String s, ArrayList arrayList0) {
        String s1 = v + s + "_" + TextUtils.join("_", arrayList0);
        CLS92 ⁱʽ0 = CLS25.FLD90;
        if(ⁱʽ0.MTH1745(s1)) {
            return (Uri)ⁱʽ0.MTH1744(s1);
        }
        Uri uri0 = (Uri)CLS21.FLD76.MTH816("core", "getModuleFileUri", new Object[]{v, s, arrayList0});
        ⁱʽ0.MTH1746(s1, uri0);
        return uri0;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static CLS24 MTH862(int v) {
        return new CLS24(((ArrayList)CLS21.FLD76.MTH816("core", "listModuleFiles", new Object[]{v})), v);
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static void MTH863(String s) {
        ((Boolean)CLS21.FLD76.MTH816("core", "deleteModuleFile", new Object[]{2, s})).booleanValue();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH864(int v, String s, ArrayList arrayList0) {
        return ((Boolean)CLS21.FLD76.MTH816("core", "moduleFileExists", new Object[]{v, s, arrayList0})).booleanValue();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static OutputStream MTH865(int v, String s, String s1) {
        return (OutputStream)CLS21.FLD76.MTH816("core", "getModuleFileOutputStream", new Object[]{v, s, s1});
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static void MTH866(int v) {
        CLS21.FLD76.MTH831("core", "previewModuleDir", new Object[]{v});
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static InputStream MTH867(int v, String s) {
        return (InputStream)CLS21.FLD76.MTH816("core", "getModuleFileInputStream", new Object[]{v, s});
    }

    public static boolean MTH868(String s, String[] arr_s) {
        return arr_s.length <= 0 ? CLS25.MTH860(14, s) : CLS25.MTH864(14, s, new ArrayList(Arrays.asList(arr_s)));
    }

    // 此方法包含解密的字符串
    public static File MTH869(String s, String[] arr_s) {
        File file0;
        ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
        if(CLS25.MTH864(15, s, arrayList0)) {
            String s1 = "15" + s + TextUtils.join("_", arrayList0);
            HashMap hashMap0 = CLS25.FLD91;
            if(hashMap0.containsKey(s1)) {
                file0 = (File)hashMap0.get(s1);
                if(!CLS31.MTH1001(file0)) {
                    goto label_7;
                }
                return file0;
            }
        label_7:
            Uri uri0 = CLS25.MTH861(15, s, arrayList0);
            if(uri0 != null) {
                File file1 = CLS27.MTH900().getCacheDir();
                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                stringBuilder0.append("_");
                stringBuilder0.append(Long.toHexString(System.currentTimeMillis()));
                file0 = new File(file1, CLS31.MTH979(stringBuilder0.toString(), CLS31.MTH985(CLS27.MTH900(), uri0)));
                CLS31.MTH996(file0.getAbsolutePath());
                CLS31.MTH1037(CLS31.MTH973(uri0), file0);
                hashMap0.put(s1, file0);
                return file0;
            }
        }
        return null;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static InputStream MTH870(int v, String s, ArrayList arrayList0) {
        return (InputStream)CLS21.FLD76.MTH816("core", "getModuleFileInputStream", new Object[]{v, s, arrayList0});
    }

    public static OutputStream MTH871(String s, String s1, String[] arr_s) {
        return arr_s.length <= 0 ? CLS25.MTH865(14, s, s1) : CLS25.MTH872(14, s, s1, new ArrayList(Arrays.asList(arr_s)));
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static OutputStream MTH872(int v, String s, String s1, ArrayList arrayList0) {
        return (OutputStream)CLS21.FLD76.MTH816("core", "getModuleFileOutputStream", new Object[]{v, s, s1, arrayList0});
    }
}

