// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.FileObserver;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS46;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS132.CLS131;
import t.ᵔʾ.CLS132;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ⁱʾ.CLS146;
import t.ⁱʾ.CLS147;

public final class CLS102 {
    public CLS131 FLD765;
    public CLS131 FLD766;
    public final ArrayList FLD767;
    public final HashMap FLD768;
    public final float FLD769;
    public final ArrayList FLD770;
    public final HashMap FLD771;
    public JSONObject FLD772;
    public String FLD773;

    // 此方法包含解密的字符串
    public CLS102(String s) {
        byte[] arr_b;
        this.FLD773 = s;
        this.FLD772 = new JSONObject();
        this.FLD767 = new ArrayList();
        this.FLD770 = new ArrayList();
        this.FLD769 = Resources.getSystem().getDisplayMetrics().density / 3.0f;
        this.FLD771 = new HashMap();
        this.FLD768 = new HashMap();
        String s1 = null;
        this.FLD765 = null;
        this.FLD766 = null;
        if(CLS132.MTH2090("settings.json", new String[]{this.FLD773})) {
            try {
                InputStream inputStream0 = CLS132.MTH2081("settings.json", new String[]{this.FLD773});
                if(inputStream0 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        if(CLS125.MTH2038(inputStream0, byteArrayOutputStream0)) {
                            arr_b = byteArrayOutputStream0.toByteArray();
                        }
                        else {
                            goto label_20;
                        }
                        goto label_23;
                    }
                    catch(Throwable throwable1) {
                        CLS133.MTH2113(throwable1);
                    }
                }
            label_20:
                arr_b = null;
            label_23:
                if(arr_b != null) {
                    s1 = new String(arr_b).trim();
                }
                if(!TextUtils.isEmpty(s1)) {
                    this.FLD772 = new JSONObject(s1);
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            this.MTH1827();
            this.MTH1798();
        }
    }

    @Override
    public final String toString() {
        return this.FLD772.toString();
    }

    public final void MTH1795(int v, String s) {
        try {
            this.FLD772.put(s, v);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1796(String s) {
        if(!this.MTH1815(s)) {
            return "";
        }
        this.MTH1799(s);
        CLS131 ⁱʽ$ˆٴ0 = this.FLD766;
        File file0 = ⁱʽ$ˆٴ0 == null ? CLS132.MTH2096(10, s, new ArrayList(Arrays.asList(new String[]{this.FLD773, "images"}))) : ⁱʽ$ˆٴ0.MTH2078(s);
        if(file0 == null) {
            throw new NullPointerException();
        }
        CLS108 ⁱʽ0 = new CLS108(this, file0, file0, s);
        ⁱʽ0.startWatching();
        this.FLD768.put(s, ⁱʽ0);
        return file0 == null ? "" : file0.getAbsolutePath();
    }

    // 此方法包含解密的字符串
    public final void MTH1797(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            File file0 = new File(s1);
            if(!CLS125.MTH2023(file0)) {
                return;
            }
            if(this.MTH1809(s) && s1.equals(this.MTH1826(s))) {
                return;
            }
            CLS132.MTH2092(file0, s, new String[]{this.FLD773, "icons"});
            CLS132.MTH2083(s, new String[]{this.FLD773, "icons"});
            this.MTH1806();
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1798() {
        try {
            ArrayList arrayList0 = this.FLD770;
            arrayList0.clear();
            if(!this.FLD772.has("DrawerList")) {
                return;
            }
            JSONArray jSONArray0 = this.FLD772.getJSONObject("DrawerList").getJSONArray("items");
            if(jSONArray0.length() != 0) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    arrayList0.add(new CLS290(jSONArray0.getJSONObject(v)));
                }
                Collections.sort(arrayList0, Comparator.comparingInt(new CLS100(0)));
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    public final void MTH1799(String s) {
        if(!TextUtils.isEmpty(s)) {
            HashMap hashMap0 = this.FLD768;
            if(!hashMap0.isEmpty()) {
                FileObserver fileObserver0 = (FileObserver)hashMap0.get(s);
                if(fileObserver0 == null) {
                    return;
                }
                fileObserver0.stopWatching();
                hashMap0.remove(s);
            }
        }
    }

    public final Bitmap MTH1800(String s) {
        Uri uri0 = this.MTH1803(s);
        return uri0 == null ? null : CLS41.MTH1392(uri0);
    }

    // 此方法包含解密的字符串
    public final Bitmap MTH1801(String s, int v, int v1) {
        CLS131 ⁱʽ$ˆٴ0 = this.FLD766;
        File file0 = ⁱʽ$ˆٴ0 == null ? CLS132.MTH2096(10, s, new ArrayList(Arrays.asList(new String[]{this.FLD773, "images"}))) : ⁱʽ$ˆٴ0.MTH2078(s);
        return CLS125.MTH2023(file0) ? CLS41.MTH1394(file0.getAbsolutePath(), v, v1) : null;
    }

    // 此方法包含解密的字符串
    public final void MTH1802(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        CLS132.MTH2093(s, new String[]{this.FLD773, "images"});
        this.MTH1806();
    }

    // 此方法包含解密的字符串
    public final Uri MTH1803(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        CLS131 ⁱʽ$ˆٴ0 = this.FLD766;
        return ⁱʽ$ˆٴ0 == null ? CLS132.MTH2088(s, new String[]{this.FLD773, "images"}) : ⁱʽ$ˆٴ0.MTH2077(s);
    }

    public final String MTH1804(String s, String s1) {
        try {
            if(this.FLD772.has(s)) {
                return this.FLD772.getString(s);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return s1;
    }

    public final void MTH1805(String s, boolean z) {
        try {
            this.FLD772.put(s, z);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    public final void MTH1806() {
        CLS291 ˑٴ0 = new CLS291(this, 0);
        CLS137.FLD972.MTH2141(((CLS136)ˑٴ0));
    }

    public final BitmapDrawable MTH1807(Context context0, CLS147 ⁱʾ0) {
        Bitmap bitmap0 = this.MTH1814(ⁱʾ0.getIcon(), true);
        if(bitmap0 == null) {
            return null;
        }
        if(ⁱʾ0.MTH2184() && !TextUtils.isEmpty(ⁱʾ0.MTH2188())) {
            bitmap0 = CLS41.MTH1404(bitmap0, CLS46.MTH1447(ⁱʾ0.MTH2188()));
        }
        return new BitmapDrawable(context0.getResources(), bitmap0);
    }

    // 此方法包含解密的字符串
    public final String MTH1808(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            File file0 = new File(s1);
            if(!CLS125.MTH2023(file0)) {
                return "";
            }
            if(this.MTH1815(s) && this.MTH1796(s).equals(s1)) {
                return s;
            }
            CLS132.MTH2092(file0, s, new String[]{this.FLD773, "images"});
            CLS132.MTH2083(s, new String[]{this.FLD773, "images"});
            this.MTH1806();
            return s;
        }
        return "";
    }

    // 此方法包含解密的字符串
    public final boolean MTH1809(String s) {
        CLS131 ⁱʽ$ˆٴ0 = this.FLD765;
        return ⁱʽ$ˆٴ0 == null ? CLS132.MTH2090(s, new String[]{this.FLD773, "icons"}) : !TextUtils.isEmpty(ⁱʽ$ˆٴ0.MTH2076(s));
    }

    // 此方法包含解密的字符串
    public final void MTH1810(InputStream inputStream0) {
        File file0 = new File(CLS125.MTH2028(CLS133.MTH2108()));
        CLS33.MTH1356(inputStream0, file0);
        File file1 = CLS125.MTH2035(file0, "settings.json");
        if(file1 == null) {
            CLS125.MTH2042(file0);
            return;
        }
        CLS132.MTH2089(file1.getParentFile(), new String[]{this.FLD773});
        CLS125.MTH2042(file0);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final boolean MTH1811() {
        return this.MTH1818("FloatingActionButtonEnable", false);
    }

    public final JSONArray MTH1812(String s, JSONArray jSONArray0) {
        try {
            if(this.FLD772.has(s)) {
                return this.FLD772.getJSONArray(s);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return jSONArray0;
    }

    // 此方法包含解密的字符串
    public final void MTH1813() {
        OutputStream outputStream0 = CLS132.MTH2084("settings.json", "application/json", new String[]{this.FLD773});
        String s = this.FLD772.toString();
        if(!TextUtils.isEmpty(s)) {
            byte[] arr_b = s.getBytes();
            if(outputStream0 != null && arr_b != null) {
                try {
                    outputStream0.write(arr_b);
                    outputStream0.close();
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }
        try {
            if(!CLS132.MTH2090(".nomedia", new String[]{this.FLD773, "icons"})) {
                CLS132.MTH2084(".nomedia", "*/*", new String[]{this.FLD773, "icons"});
            }
            if(!CLS132.MTH2090(".nomedia", new String[]{this.FLD773, "images"})) {
                CLS132.MTH2084(".nomedia", "*/*", new String[]{this.FLD773, "images"});
            }
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
        }
    }

    public final Bitmap MTH1814(String s, boolean z) {
        HashMap hashMap0 = this.FLD771;
        if(z && hashMap0.containsKey(s)) {
            return (Bitmap)hashMap0.get(s);
        }
        Uri uri0 = this.MTH1825(s);
        if(uri0 == null) {
            return null;
        }
        Bitmap bitmap0 = CLS41.MTH1392(uri0);
        if(bitmap0 == null) {
            return null;
        }
        if(z) {
            bitmap0 = CLS41.MTH1402(bitmap0, this.FLD769);
            hashMap0.put(s, bitmap0);
        }
        return bitmap0;
    }

    // 此方法包含解密的字符串
    public final boolean MTH1815(String s) {
        CLS131 ⁱʽ$ˆٴ0 = this.FLD766;
        return ⁱʽ$ˆٴ0 == null ? CLS132.MTH2090(s, new String[]{this.FLD773, "images"}) : !TextUtils.isEmpty(ⁱʽ$ˆٴ0.MTH2076(s));
    }

    public final void MTH1816(int v, int v1, Context context0, CLS146 ᵔʾ0, String s) {
        CLS292 ᐧˉ0 = new CLS292(this, s, v, v1, context0, ᵔʾ0);
        CLS137.FLD972.MTH2141(((CLS136)ᐧˉ0));
    }

    public final int MTH1817(int v, String s) {
        try {
            if(this.FLD772.has(s)) {
                return this.FLD772.getInt(s);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return v;
    }

    public final boolean MTH1818(String s, boolean z) {
        try {
            if(this.FLD772.has(s)) {
                return this.FLD772.getBoolean(s);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return z;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public final boolean MTH1819() {
        return this.MTH1818("DisableOnDarkMode", false) ? CLS46.MTH1455() : false;
    }

    public final BitmapDrawable MTH1820(Context context0, String s, boolean z) {
        Bitmap bitmap0 = this.MTH1814(s, z);
        return bitmap0 == null ? null : new BitmapDrawable(context0.getResources(), bitmap0);
    }

    // 去混淆评级： 中等(90)
    // 此方法包含解密的字符串
    public final boolean MTH1821() {
        return this.MTH1818("TabLayoutEnable", false) && (this.MTH1818("TabLayoutTextEnable", true) || this.MTH1818("TabLayoutIconEnable", false));
    }

    // 此方法包含解密的字符串
    public final void MTH1822(File file0) {
        if(file0.isDirectory()) {
            File file1 = CLS125.MTH2035(file0, "settings.json");
            if(file1 != null) {
                CLS132.MTH2089(file1.getParentFile(), new String[]{this.FLD773});
            }
        }
        else if(file0.getName().endsWith("zip")) {
            File file2 = new File(CLS125.MTH2028(CLS133.MTH2108()));
            CLS33.MTH1351(file2);
            try {
                FileInputStream fileInputStream0 = new FileInputStream(file0);
                CLS33.MTH1356(fileInputStream0, file2);
                fileInputStream0.close();
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            File file3 = CLS125.MTH2035(file2, "settings.json");
            if(file3 == null) {
                CLS125.MTH2042(file2);
                return;
            }
            CLS132.MTH2089(file3.getParentFile(), new String[]{this.FLD773});
            CLS125.MTH2042(file2);
        }
    }

    public final void MTH1823(String s, String s1) {
        try {
            this.FLD772.put(s, s1);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1824(String s) {
        try {
            JSONArray jSONArray0 = this.MTH1812(s, new JSONArray());
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                if(jSONObject0.optBoolean("e", false) && CLS132.MTH2090(jSONObject0.optString("p", ""), new String[]{this.FLD773, "images"})) {
                    arrayList0.add(jSONObject0);
                }
            }
            return (JSONObject)(arrayList0.isEmpty() ? null : arrayList0.get(CLS28.MTH1317(arrayList0.size() - 1, 0)));
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final Uri MTH1825(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        CLS131 ⁱʽ$ˆٴ0 = this.FLD765;
        return ⁱʽ$ˆٴ0 == null ? CLS132.MTH2088(s, new String[]{this.FLD773, "icons"}) : ⁱʽ$ˆٴ0.MTH2077(s);
    }

    // 此方法包含解密的字符串
    public final String MTH1826(String s) {
        if(!this.MTH1809(s)) {
            return "";
        }
        this.MTH1799(s);
        CLS131 ⁱʽ$ˆٴ0 = this.FLD765;
        File file0 = ⁱʽ$ˆٴ0 == null ? CLS132.MTH2096(10, s, new ArrayList(Arrays.asList(new String[]{this.FLD773, "icons"}))) : ⁱʽ$ˆٴ0.MTH2078(s);
        if(file0 == null) {
            throw new NullPointerException();
        }
        CLS101 יᐧ0 = new CLS101(this, file0, file0, s);
        יᐧ0.startWatching();
        this.FLD768.put(s, יᐧ0);
        return file0 == null ? "" : file0.getAbsolutePath();
    }

    // 此方法包含解密的字符串
    public final void MTH1827() {
        try {
            ArrayList arrayList0 = this.FLD767;
            arrayList0.clear();
            if(!this.FLD772.has("FloatingActionButton")) {
                return;
            }
            JSONArray jSONArray0 = this.FLD772.getJSONObject("FloatingActionButton").getJSONArray("items");
            if(jSONArray0.length() != 0) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    arrayList0.add(new CLS295(jSONArray0.getJSONObject(v)));
                }
                Collections.sort(arrayList0, Comparator.comparingInt(new CLS100(1)));
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

