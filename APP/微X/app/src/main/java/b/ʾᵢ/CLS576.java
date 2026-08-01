// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS6;
import b.ʻˑ.CLS7;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS1606;
import b.ⁱᵔ.CLS412.CLS411;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423.CLS422;
import b.ⁱᵔ.CLS442.CLS440;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class CLS576 implements CLS6, CLS7, CLS16, CLS17, CLS411, CLS420, CLS440, CLS441 {
    public final int FLD147;
    public final CLS12 FLD148;

    public CLS576(CLS12 ᵔʾ0, int v) {
        this.FLD147 = v;
        this.FLD148 = ᵔʾ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS423$CLS420
    public final void MTH6065(CLS422 ˊⁱ$ᵔʾ0) {
        if(ˊⁱ$ᵔʾ0.FLD4071 != 200) {
            CLS412.MTH6011(("网易云音乐 err: " + ˊⁱ$ᵔʾ0.FLD4071));
            return;
        }
        if(ˊⁱ$ᵔʾ0.FLD4069 == null) {
            String s = ˊⁱ$ᵔʾ0.FLD4070;
            if(!TextUtils.isEmpty(s)) {
                CLS412.MTH6011(("网易云音乐: " + s));
            }
        }
        else {
            String s1 = ˊⁱ$ᵔʾ0.MTH6071();
            try {
                JSONObject jSONObject0 = new JSONObject(s1).getJSONObject("result").getJSONArray("songs").getJSONObject(0);
                JSONObject jSONObject1 = jSONObject0.getJSONArray("artists").getJSONObject(0);
                int v = jSONObject0.getInt("id");
                String s2 = jSONObject0.getString("name");
                String s3 = jSONObject1.getString("name");
                String s4 = jSONObject1.getString("picUrl");
                String s5 = jSONObject1.getString("img1v1Url");
                if(TextUtils.isEmpty(s4) || s4.equalsIgnoreCase("null")) {
                    s4 = s5;
                }
                HashMap hashMap0 = new HashMap();
                hashMap0.put("musicDataUrl", "http://music.163.com/song/media/outer/url?id=" + v);
                hashMap0.put("musicUrl", "http://music.163.com/song/" + v);
                hashMap0.put("description", s3);
                hashMap0.put("title", s2);
                hashMap0.put("app_id", "wx8dd6ecd81906fd84");
                hashMap0.put("app_name", "网易云音乐");
                boolean z = TextUtils.isEmpty(s4);
                CLS12 ᵔʾ0 = this.FLD148;
                if(!z && !s4.equalsIgnoreCase("null")) {
                    CLS518.MTH7068(s4, ((CLS516)new CLS1606(hashMap0, ᵔʾ0, 4)));
                    return;
                }
                if(ᵔʾ0 != null) {
                    try {
                        ᵔʾ0.MTH791(hashMap0);
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS442$CLS440
    public final void MTH6221(File file0) {
        CLS12 ᵔʾ0 = this.FLD148;
        if(!file0.isDirectory()) {
            file0 = file0.getParentFile();
        }
        try {
            ᵔʾ0.MTH791(file0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        CLS12 ᵔʾ0 = this.FLD148;
        switch(this.FLD147) {
            case 0: {
                String s = CLS31.MTH998(((InputStream)arr_object[0]));
                try {
                    ᵔʾ0.MTH791(s);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 1: {
                String s1 = CLS31.MTH977(((File)arr_object[0]));
                try {
                    ᵔʾ0.MTH791(s1);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 4: {
                if(ᵔʾ0 != null) {
                    ᵔʾ0.MTH791(arr_object[0]);
                }
                return;
            }
            default: {
                if(ᵔʾ0 != null) {
                    ᵔʾ0.MTH791(arr_object[0]);
                }
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS412$CLS411
    public final void MTH5992(int v) {
        this.FLD148.MTH791(v);
    }

    @Override  // b.ʻˑ.CLS6
    public final void MTH783(ArrayList arrayList0) {
        Bitmap bitmap0;
        ArrayList arrayList1 = arrayList0;
        CLS12 ᵔʾ0 = this.FLD148;
        if(arrayList0.size() > 1) {
            int v = 2;
            String s = CLS31.MTH980();
            int v1 = arrayList0.size();
            if(v1 == 1) {
                bitmap0 = CLS518.MTH7076(((String)arrayList1.get(0)));
            }
            else {
                if(v1 > 2) {
                    v = 3;
                }
                int v2 = (int)Math.ceil(v1 / v);
                Bitmap bitmap1 = Bitmap.createBitmap(v * 65 - 1, v2 * 65 - 1, Bitmap.Config.ARGB_8888);
                Canvas canvas0 = new Canvas(bitmap1);
                float f = 0.0f;
                int v4 = 0;
                for(int v3 = 0; v3 < v2; ++v3) {
                    float f1 = 0.0f;
                    for(int v5 = 0; v5 < v; ++v5) {
                        canvas0.drawBitmap(ThumbnailUtils.extractThumbnail(BitmapFactory.decodeFile(CLS31.MTH992(CLS66.MTH1395(((String)arrayList1.get(v4))))), 0x40, 0x40), f1, f, null);
                        f1 += 65.0f;
                        ++v4;
                    }
                    f += 65.0f;
                }
                bitmap0 = bitmap1;
            }
            CLS518.MTH7077(new File(s), bitmap0);
            arrayList1 = new ArrayList();
            arrayList1.add(s);
        }
        ᵔʾ0.MTH791(arrayList1);
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        this.FLD148.MTH791(s);
    }

    @Override  // b.ⁱᵔ.CLS442$CLS441
    public final void MTH6222(InputStream inputStream0) {
        String s = CLS31.MTH998(inputStream0);
        CLS12 ᵔʾ0 = this.FLD148;
        if(ᵔʾ0 != null) {
            try {
                ᵔʾ0.MTH791(s);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        this.FLD148.MTH791(object0);
    }
}

