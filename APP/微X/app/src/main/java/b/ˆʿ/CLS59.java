// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.FileObserver;
import android.text.TextUtils;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS94;
import b.ᵔʾ.CLS1229;
import b.ⁱᵔ.CLS518;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

public final class CLS59 {
    public final HashMap FLD182;
    public static final CLS59 FLD183;
    public boolean FLD184;

    static {
        CLS59.FLD183 = new CLS59();
    }

    public CLS59() {
        this.FLD182 = new HashMap();
        CLS1229 ˆٴ0 = new CLS1229(10, this);
        CLS40.FLD157.MTH1124(((CLS39)ˆٴ0));
    }

    public final void MTH1281(CLS94 ⁱˉ0) {
        if(TextUtils.isEmpty(ⁱˉ0.FLD398)) {
            return;
        }
        this.FLD182.put(ⁱˉ0.FLD398, ⁱˉ0);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static boolean MTH1282(CLS94 ⁱˉ0) {
        return ⁱˉ0 != null && (CLS25.MTH860(2, ⁱˉ0.FLD398) || CLS25.MTH860(2, ⁱˉ0.FLD398 + ".png"));
    }

    public final CLS94 MTH1283(String s) {
        if(!this.FLD184) {
            this.MTH1288();
        }
        return this.FLD182.containsKey(s) ? ((CLS94)this.FLD182.get(s)) : null;
    }

    // 此方法包含解密的字符串
    public static Bitmap MTH1284(CLS94 ⁱˉ0) {
        if(!CLS59.MTH1282(ⁱˉ0)) {
            return null;
        }
        try {
            String s = ⁱˉ0.FLD398;
            InputStream inputStream0 = CLS25.MTH867(2, s);
            if(inputStream0 == null) {
                inputStream0 = CLS25.MTH867(2, CLS31.MTH979(s, "png"));
            }
            if(inputStream0 == null) {
                return null;
            }
            Bitmap bitmap0 = BitmapFactory.decodeStream(inputStream0);
            try {
                inputStream0.close();
            }
            catch(Exception exception0) {
                CLS27.MTH893(exception0);
            }
            return bitmap0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    public final ArrayList MTH1285() {
        if(!this.FLD184) {
            this.MTH1288();
        }
        return new ArrayList(this.FLD182.values());
    }

    // 此方法包含解密的字符串
    public final File MTH1286(CLS94 ⁱˉ0) {
        public final class CLS58 extends FileObserver {
            public final CLS94 FLD179;
            public final CLS59 FLD180;
            public final File FLD181;

            public CLS58(File file0, CLS94 ⁱˉ0, File file1) {
                this.FLD179 = ⁱˉ0;
                this.FLD181 = file1;
                super(file0);
            }

            // 此方法包含解密的字符串
            @Override  // android.os.FileObserver
            public final void onEvent(int v, String s) {
                if(v == 2) {
                    CLS59.this.getClass();
                    Bitmap bitmap0 = CLS518.MTH7060(this.FLD181.getAbsolutePath());
                    if(bitmap0 != null) {
                        CLS518.MTH7051(CLS25.MTH865(2, CLS31.MTH979(this.FLD179.FLD398, "png"), "image/png"), bitmap0);
                    }
                }
            }
        }

        File file0 = new File(CLS27.MTH900().getCacheDir(), ⁱˉ0.FLD398);
        String s = ⁱˉ0.FLD398;
        InputStream inputStream0 = CLS25.MTH867(2, s);
        if(inputStream0 == null) {
            inputStream0 = CLS25.MTH867(2, CLS31.MTH979(s, "png"));
        }
        CLS31.MTH1037(inputStream0, file0);
        CLS31.MTH996(file0.getAbsolutePath());
        new CLS58(this, file0, ⁱˉ0, file0).startWatching();
        return file0;
    }

    // 此方法包含解密的字符串
    public final void MTH1287() {
        if(!this.FLD184) {
            this.MTH1288();
        }
        try {
            CLS29 ˎᵢ0 = CLS27.MTH895();
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: this.FLD182.values()) {
                jSONArray0.put(((CLS94)object0).MTH1756());
            }
            ˎᵢ0.MTH922(jSONArray0, "watermark");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1288() {
        boolean z = CLS25.MTH860(2, "watermark_db");
        HashMap hashMap0 = this.FLD182;
        int v = 0;
        try {
            if(z) {
                String s = CLS31.MTH998(CLS25.MTH867(2, "watermark_db"));
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                JSONArray jSONArray0 = new JSONArray(s);
                if(jSONArray0.length() == 0) {
                    return;
                }
                while(v < jSONArray0.length()) {
                    CLS94 ⁱˉ0 = new CLS94(jSONArray0.getJSONObject(v));
                    if(CLS59.MTH1282(ⁱˉ0) || !TextUtils.isEmpty(ⁱˉ0.FLD401)) {
                        hashMap0.put(ⁱˉ0.FLD398, ⁱˉ0);
                    }
                    ++v;
                }
                this.FLD184 = true;
                CLS29 ˎᵢ0 = CLS27.MTH895();
                if(ˎᵢ0 != null) {
                    ˎᵢ0.MTH922(jSONArray0, "watermark");
                    CLS25.MTH863("watermark_db");
                }
            }
            else {
                CLS29 ˎᵢ1 = CLS27.MTH895();
                if(ˎᵢ1 != null) {
                    hashMap0.clear();
                    JSONArray jSONArray1 = ˎᵢ1.MTH937("watermark", new JSONArray());
                    while(v < jSONArray1.length()) {
                        CLS94 ⁱˉ1 = new CLS94(jSONArray1.getJSONObject(v));
                        if(CLS59.MTH1282(ⁱˉ1) || !TextUtils.isEmpty(ⁱˉ1.FLD401)) {
                            hashMap0.put(ⁱˉ1.FLD398, ⁱˉ1);
                        }
                        ++v;
                    }
                    this.FLD184 = true;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

