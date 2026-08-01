// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS54;
import b.ˆʿ.CLS55;
import b.ˆʿ.CLS59;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS77;
import b.ˈˈ.CLS78;
import b.ˈˊ.CLS1643;
import b.ˊﾞ.CLS613;
import b.ˑٴ.CLS140;
import b.ˑٴ.CLS770;
import b.ˑٴ.CLS772;
import b.ˑٴ.CLS818;
import b.ˑٴ.CLS830;
import b.ˑٴ.CLS864;
import b.ˑٴ.CLS877;
import b.ـˏ.CLS891;
import b.ᐧˉ.CLS1078;
import b.ᐧˉ.CLS1092;
import b.ᐧˉ.CLS1177;
import b.ᐧˉ.CLS174;
import b.ⁱʾ.CLS323;
import b.ⁱʾ.CLS329.CLS327;
import b.ⁱʾ.CLS329;
import b.ⁱʾ.CLS341.CLS339;
import b.ⁱʾ.CLS341;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423.CLS422;
import b.ⁱᵔ.CLS507.CLS506;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1624.CLS540;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS544.CLS543;
import b.ﾞᐧ.CLS557;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1229 implements CLS7, CLS13, CLS16, CLS17, CLS39, CLS378, CLS379, CLS420, CLS506, CLS516, CLS540, CLS543 {
    public final int FLD2970;
    public final Object FLD2971;

    public CLS1229(int v, Object object0) {
        this.FLD2970 = v;
        this.FLD2971 = object0;
        super();
    }

    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        Object object0 = this.FLD2971;
        if(this.FLD2970 == 24) {
            CLS329 ˊˏ0 = ((CLS1078)object0).FLD2317;
            ˊˏ0.getClass();
            new CLS327(ˊˏ0).filter(s);
            return;
        }
        ((CLS341)object0).getClass();
        new CLS339(((CLS341)object0)).filter(s);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        boolean z = false;
        Object object0 = this.FLD2971;
        switch(this.FLD2970) {
            case 0: {
                ((CLS304)object0).getClass();
                ((CLS304)object0).MTH4909();
                return;
            }
            case 1: {
                for(Object object1: ((CLS279)object0).FLD2909.values()) {
                    CLS3 ˆٴ0 = (CLS3)object1;
                    try {
                        ˆٴ0.MTH774();
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 3: {
                CLS66.MTH1520(((String)((CLS290)object0).FLD3008.peek()), "wx2");
                ((CLS290)object0).FLD3010.postDelayed(((CLS290)object0).FLD3012, 15000L);
                return;
            }
            case 4: {
                ((CLS305)object0).MTH4915();
                return;
            }
            case 5: {
                ((CLS323)object0).MTH5050();
                return;
            }
            case 7: {
                ((CLS55)object0).getClass();
                ((CLS55)object0).FLD177 = CLS25.MTH862(2);
                return;
            }
            case 8: {
                ((CLS47)object0).MTH1196();
                return;
            }
            case 9: {
                ((CLS54)object0).MTH1249();
                return;
            }
            case 10: {
                ((CLS59)object0).MTH1288();
                return;
            }
            case 17: {
                ((CLS772)object0).getClass();
                boolean z1 = ((CLS772)object0).FLD1445.MTH938("autoreply_master_enable", false);
                CLS77 ˊˏ0 = ((CLS772)object0).FLD1074;
                if(z1 && !((CLS772)object0).FLD1445.MTH938("autoreply_auto_enable", false) && ˊˏ0.MTH1592()) {
                    ˊˏ0.MTH1596();
                    return;
                }
                ˊˏ0.MTH1602();
                return;
            }
            case 20: {
                ((CLS877)object0).MTH3090();
                return;
            }
            case 22: {
                ((CLS830)object0).getClass();
                File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "WechatXposedTTS.wav");
                String s = null;
                try {
                    MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
                    mediaMetadataRetriever0.setDataSource(file0.getAbsolutePath());
                    s = mediaMetadataRetriever0.extractMetadata(9);
                    mediaMetadataRetriever0.release();
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                String s1 = CLS66.MTH1456(((CLS830)object0).FLD1447.FLD1434);
                String s2 = CLS66.MTH1483(s1);
                int v = Math.max((TextUtils.isEmpty(s) ? 1000 : Integer.parseInt(s)), 1000);
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                CLS613.MTH1977(new CLS557(file0.getAbsolutePath()), byteArrayOutputStream0);
                byte[] arr_b = byteArrayOutputStream0.toByteArray();
                if(arr_b.length < 25000) {
                    byte[] arr_b1 = new byte[25000];
                    System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
                    arr_b = arr_b1;
                }
                try {
                    File file1 = new File(s2);
                    CLS31.MTH1026(file1.getParentFile());
                    if(!CLS31.MTH1001(file1)) {
                        file1.createNewFile();
                    }
                    if(CLS613.MTH1966(arr_b, new CLS69(file1).MTH1553()) != 0L) {
                        z = true;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                if(z) {
                    CLS66.MTH1378(v, s1);
                }
                return;
            }
            case 23: {
                ((CLS174)object0).getClass();
                ArrayList arrayList0 = new ArrayList();
                CLS371.FLD3470.MTH5314(((CLS174)object0).FLD1677, arrayList0);
                for(Object object2: arrayList0) {
                    CLS78 ˊﾞ0 = (CLS78)object2;
                    HashMap hashMap0 = ((CLS174)object0).FLD1679;
                    if(!hashMap0.containsKey("")) {
                        hashMap0.put("", ˊﾞ0);
                        ((CLS174)object0).FLD1680.add(ˊﾞ0);
                    }
                }
                return;
            }
            case 25: {
                ((CLS1092)object0).FLD2374.MTH4021();
                return;
            }
            default: {
                ((CLS1177)object0).FLD2743.MTH4021();
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS378 ʼˎ$ˆٴ0 = (CLS378)this.FLD2971;
        if(ʼˎ$ˆٴ0 != null) {
            ʼˎ$ˆٴ0.MTH5452(ʻˑ0);
        }
    }

    @Override  // b.ⁱᵔ.CLS423$CLS420
    public final void MTH6065(CLS422 ˊⁱ$ᵔʾ0) {
        String s1;
        CLS10 ᐧˉ0 = (CLS10)this.FLD2971;
        String s = ˊⁱ$ᵔʾ0.FLD4070;
        int v = ˊⁱ$ᵔʾ0.FLD4071;
        if(v != 200) {
            s1 = CLS27.MTH889("wechat_welm") + " err: " + v;
            if(TextUtils.isEmpty(s)) {
                CLS412.MTH6011(s1);
                return;
            }
            s1 = s1 + " " + s;
            CLS412.MTH6011(s1);
            return;
        }
        String s2 = ˊⁱ$ᵔʾ0.MTH6071();
        if(!TextUtils.isEmpty(s2)) {
            try {
                JSONObject jSONObject0 = new JSONObject(s2);
                if(jSONObject0.has("choices")) {
                    JSONArray jSONArray0 = jSONObject0.getJSONArray("choices");
                    if(jSONArray0.length() != 0) {
                        String s3 = jSONArray0.getJSONObject(0).getString("text");
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("type", "text");
                        contentValues0.put("content", s3.trim());
                        ArrayList arrayList0 = new ArrayList();
                        arrayList0.add(contentValues0);
                        ᐧˉ0.MTH788(arrayList0);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        else if(!TextUtils.isEmpty(s)) {
            s1 = CLS27.MTH889("wechat_welm") + " err: " + s;
            CLS412.MTH6011(s1);
        }
    }

    @Override  // b.ʻˑ.CLS13
    public final void MTH770(String s) {
        CLS770 ٴʿ0 = (CLS770)this.FLD2971;
        ٴʿ0.getClass();
        if(!TextUtils.isEmpty(s)) {
            CLS69 ʾᵢ0 = new CLS69(s);
            if(CLS31.MTH1029(ʾᵢ0)) {
                ٴʿ0.MTH2586(ʾᵢ0.MTH1563());
            }
        }
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        ((CLS379)this.FLD2971).MTH5453(((LinearLayout)arr_object[1]));
    }

    @Override  // b.ⁱᵔ.CLS518$CLS516
    public final void MTH7045(Bitmap bitmap0) {
        Object object0 = this.FLD2971;
        if(this.FLD2970 == 2) {
            ((CLS294)object0).FLD3042 = bitmap0;
            return;
        }
        ((CLS891)object0).getClass();
        ((CLS891)object0).FLD1611 = CLS518.MTH7054(bitmap0);
        ((CLS891)object0).FLD1612 = true;
    }

    @Override  // b.ⁱᵔ.CLS507$CLS506
    public final void MTH6975(File file0, ArrayList arrayList0) {
        CLS17 ﾞٴ0 = (CLS17)this.FLD2971;
        try {
            ﾞٴ0.MTH796(new Object[]{file0, arrayList0, 1});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        Object object0 = this.FLD2971;
        if(this.FLD2970 == 16) {
            ((CLS1643)object0).getClass();
            if(!TextUtils.isEmpty(s)) {
                ((CLS1643)object0).FLD474.clear();
                ((CLS1643)object0).FLD474.add(s);
            }
            return;
        }
        ((CLS864)object0).FLD1447.MTH3027(0xFF0000FF);
        CLS21.FLD76.MTH818("startTTS", new Object[]{s});
        CLS412.MTH6004(CLS27.MTH889("tts_start"));
    }

    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        Object object1 = this.FLD2971;
        if(this.FLD2970 == 11) {
            CLS71 ˆٴ0 = (CLS71)object1;
            ˆٴ0.getClass();
            try {
                CLS3 ˆٴ1 = (CLS3)ˆٴ0.FLD238.get(((String)object0));
                if(ˆٴ1 != null) {
                    ˆٴ1.MTH774();
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        CLS404.MTH5910(((CLS140)(((CLS818)object1))).MTH3042(), ((String)object0));
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS526 ʻᵎ$ˆٴ0 = ((CLS1617)this.FLD2971).FLD5159;
        if(ʻᵎ$ˆٴ0 != null) {
            ʻᵎ$ˆٴ0.MTH7191(linearLayout0);
        }
    }
}

