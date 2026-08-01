// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SeekBar;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import t.ʾᵢ.CLS216;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS32;
import t.ˆʿ.CLS38.CLS37;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˆʿ.CLS52;
import t.ˆٴ.CLS70;
import t.ˊﾞ.CLS105;
import t.ˊﾞ.CLS290;
import t.ٴـ.CLS117;
import t.ⁱʾ.CLS140;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS144;
import t.ⁱʾ.CLS145;
import t.ⁱʾ.CLS146;
import t.ﾞٴ.CLS331;
import t.ﾞᐧ.CLS158;
import t.ﾞᐧ.CLS162;
import t.ﾞᐧ.CLS164;
import t.ﾞᐧ.CLS167;
import t.ﾞᐧ.CLS168;
import t.ﾞᐧ.CLS172.CLS171;
import t.ﾞᐧ.CLS172;
import t.ﾞᐧ.CLS174.CLS173;
import t.ﾞᐧ.CLS174;
import t.ﾞᐧ.CLS177.CLS176;
import t.ﾞᐧ.CLS179;
import t.ﾞᐧ.CLS183;
import t.ﾞᐧ.CLS337;
import t.ﾞᐧ.CLS339;
import t.ﾞᐧ.CLS340;
import t.ﾞᐧ.CLS343;
import t.ﾞᐧ.CLS344;
import t.ﾞᐧ.CLS345;

public final class CLS304 implements CLS37, CLS136, CLS140, CLS144, CLS171, CLS176 {
    public final int FLD979;
    public final Object FLD980;
    public final Object FLD981;

    public CLS304(Object object0, Object object1, int v) {
        this.FLD979 = v;
        this.FLD981 = object0;
        this.FLD980 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        Object object0 = this.FLD980;
        Object object1 = this.FLD981;
        switch(this.FLD979) {
            case 0: {
                ((CLS138)object1).MTH2153(((Object[])object0));
                return;
            }
            case 1: {
                HashSet hashSet0 = new HashSet();
                if(!TextUtils.isEmpty(((String)object1))) {
                    hashSet0.addAll(Arrays.asList(((String)object1).split(";")));
                }
                if(!TextUtils.isEmpty(((String)object0))) {
                    hashSet0.addAll(Arrays.asList(((String)object0).split(";")));
                }
                if(!hashSet0.isEmpty()) {
                    String s = ((CLS52)CLS137.FLD972.MTH2143(CLS52.class)).MTH1475();
                    for(Object object2: hashSet0) {
                        if(s.contains(((String)object2).trim())) {
                            CLS123.FLD912.MTH2001("disable", new Object[0]);
                            CLS123.FLD912.MTH2006("core", "unloadFeature", new Object[]{"themes"});
                            CLS123.FLD912.FLD909.clear();
                            CLS123.FLD912.FLD907.clear();
                            CLS123.FLD912.FLD910.clear();
                            return;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return;
            }
            case 5: {
                ((CLS105)object1).getClass();
                ((LinearLayout)object0).setBackgroundColor(CLS46.MTH1447(((CLS105)object1).FLD783.MTH1804("DrawerBackgroundColor", "#FFFFFF")));
                return;
            }
            case 6: {
                CLS43.MTH1437(((ListView)object1), ((BitmapDrawable)object0));
                ((ListView)object1).setDivider(new ColorDrawable(0));
                return;
            }
            case 7: {
                CLS146 ᵔʾ0 = ((CLS105)object1).FLD778;
                if(ᵔʾ0 != null) {
                    ᵔʾ0.MTH2177(((CLS290)object0));
                }
                return;
            }
            case 8: {
                ((CLS146)object1).MTH2177(((Bitmap)object0));
                return;
            }
            case 12: {
                ((ProgressDialog)object1).dismiss();
                CLS28.MTH1315(((Activity)object0), CLS133.MTH2099("import_failed"));
                return;
            }
            default: {
                ((CLS32)object1).getClass();
                String[] arr_s = ((String)object0).split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    ((CLS32)object1).FLD448.MTH1898(arr_s[v], Boolean.TRUE, ((CLS32)object1).FLD448.FLD838);
                }
            }
        }
    }

    @Override  // t.ˆʿ.CLS38$CLS37
    public final void MTH1382(File file0) {
        Object object0 = this.FLD980;
        Object object1 = this.FLD981;
        if(this.FLD979 == 2) {
            if(!file0.isDirectory()) {
                file0 = file0.getParentFile();
            }
            CLS303 ﾞˎ0 = new CLS303(file0, ((CLS146)object1), ((CLS143)object0), 0);
            CLS137.FLD972.MTH2141(((CLS136)ﾞˎ0));
            return;
        }
        ((CLS331)object1).getClass();
        if(file0.isFile()) {
            String s = file0.getAbsolutePath();
            ((CLS331)object1).FLD1088 = s;
            ((ImageView)object0).setImageBitmap(CLS41.MTH1394(s, 0x200, 0x200));
            CLS337 ˎᵢ0 = ((CLS331)object1).FLD1086;
            if(ˎᵢ0 != null) {
                ˎᵢ0.MTH2388(((CLS331)object1).FLD1088);
            }
        }
    }

    @Override  // t.ⁱʾ.CLS140
    public final void MTH2164(String s) {
        ArrayList arrayList0 = (ArrayList)this.FLD981;
        CLS70 ﾞٴ0 = (CLS70)this.FLD980;
        if(!TextUtils.isEmpty(s)) {
            arrayList0.add(s);
            ﾞٴ0.notifyDataSetChanged();
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS144
    public final void MTH2170(Object[] arr_object) {
        CLS172 ـˏ0 = (CLS172)this.FLD981;
        Activity activity0 = (Activity)this.FLD980;
        ـˏ0.getClass();
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS168 ˑٴ0 = new CLS168(activity0, linearLayout0, menu0);
        ˑٴ0.MTH2390("reset_to_default", ((CLS143)new CLS343(ـˏ0, 0)));
        ˑٴ0.MTH2392();
        CLS174 ٴـ0 = new CLS174(activity0);
        ـˏ0.FLD1215 = ٴـ0;
        ٴـ0.setOnColorSelectedListener(((CLS173)new CLS297(ـˏ0, 2)));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(CLS43.MTH1439(200), CLS43.MTH1439(200));
        linearLayout$LayoutParams0.gravity = 17;
        linearLayout0.addView(ـˏ0.FLD1215, linearLayout$LayoutParams0);
        View view0 = new View(activity0);
        ـˏ0.FLD1214 = view0;
        linearLayout0.addView(view0, new LinearLayout.LayoutParams(-1, CLS43.MTH1439(15)));
        CLS344 ⁱˉ0 = new CLS344(activity0);
        CLS339 יﹳ0 = new CLS339(activity0);
        ـˏ0.FLD1223 = יﹳ0;
        יﹳ0.FLD1193 = true;
        ⁱˉ0.MTH2482(((CLS145)יﹳ0));
        CLS340 ـﹳ0 = new CLS340(activity0);
        ـﹳ0.FLD1232 = true;
        ـﹳ0.MTH2172(CLS133.MTH2099("red"));
        ـˏ0.FLD1222 = ـﹳ0.FLD1227;
        ـﹳ0.FLD1227.setMax(0xFF);
        int v = Build.VERSION.SDK_INT;
        SeekBar seekBar0 = ـˏ0.FLD1222;
        if(v >= 21) {
            seekBar0.setProgressTintList(ColorStateList.valueOf(0xFFFF0000));
        }
        else {
            seekBar0.getProgressDrawable().setColorFilter(0xFFFF0000, PorterDuff.Mode.SRC_IN);
        }
        ـˏ0.FLD1222.setOnSeekBarChangeListener(new CLS162(ـˏ0, ـﹳ0));
        ـﹳ0.FLD1230 = new CLS183(ـˏ0, activity0, ـﹳ0, 0);
        ⁱˉ0.MTH2482(((CLS145)ـﹳ0));
        CLS340 ـﹳ1 = new CLS340(activity0);
        ـﹳ1.FLD1232 = true;
        ـﹳ1.MTH2172(CLS133.MTH2099("green"));
        ـˏ0.FLD1209 = ـﹳ1.FLD1227;
        ـﹳ1.FLD1227.setMax(0xFF);
        SeekBar seekBar1 = ـˏ0.FLD1209;
        if(v >= 21) {
            seekBar1.setProgressTintList(ColorStateList.valueOf(0xFF00FF00));
        }
        else {
            seekBar1.getProgressDrawable().setColorFilter(0xFF00FF00, PorterDuff.Mode.SRC_IN);
        }
        ـˏ0.FLD1209.setOnSeekBarChangeListener(new CLS158(ـˏ0, ـﹳ1));
        ـﹳ1.FLD1230 = new CLS183(ـˏ0, activity0, ـﹳ1, 1);
        ⁱˉ0.MTH2482(((CLS145)ـﹳ1));
        CLS340 ـﹳ2 = new CLS340(activity0);
        ـﹳ2.FLD1232 = true;
        ـﹳ2.MTH2172(CLS133.MTH2099("blue"));
        ـˏ0.FLD1210 = ـﹳ2.FLD1227;
        ـﹳ2.FLD1227.setMax(0xFF);
        SeekBar seekBar2 = ـˏ0.FLD1210;
        if(v >= 21) {
            seekBar2.setProgressTintList(ColorStateList.valueOf(0xFF0000FF));
        }
        else {
            seekBar2.getProgressDrawable().setColorFilter(0xFF0000FF, PorterDuff.Mode.SRC_IN);
        }
        ـˏ0.FLD1210.setOnSeekBarChangeListener(new CLS164(ـˏ0, ـﹳ2));
        ـﹳ2.FLD1230 = new CLS183(ـˏ0, activity0, ـﹳ2, 2);
        ⁱˉ0.MTH2482(((CLS145)ـﹳ2));
        if(ـˏ0.FLD1221) {
            CLS340 ـﹳ3 = new CLS340(activity0);
            ـﹳ3.FLD1232 = true;
            ـﹳ3.MTH2172(CLS133.MTH2099("alpha"));
            ـˏ0.FLD1213 = ـﹳ3.FLD1227;
            ـﹳ3.FLD1227.setMax(0xFF);
            SeekBar seekBar3 = ـˏ0.FLD1213;
            if(v >= 21) {
                seekBar3.setProgressTintList(ColorStateList.valueOf(-1));
            }
            else {
                seekBar3.getProgressDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            ـˏ0.FLD1213.setOnSeekBarChangeListener(new CLS179(ـˏ0, ـﹳ3));
            ـﹳ3.FLD1230 = new CLS183(ـˏ0, activity0, ـﹳ3, 3);
            ⁱˉ0.MTH2482(((CLS145)ـﹳ3));
        }
        ـˏ0.FLD1223.FLD1196.setOnEditorActionListener(new CLS167(ـˏ0, activity0));
        ⁱˉ0.MTH2475(linearLayout0, CLS43.MTH1439(3));
        ـˏ0.MTH2421(ـˏ0.FLD1220);
        ـˏ0.MTH2420();
    }

    @Override  // t.ﾞᐧ.CLS177$CLS176
    public final void MTH2442(String s) {
        ((CLS216)this.FLD981).getClass();
        ((CLS216)this.FLD981).FLD236 = CLS117.FLD842.MTH1907(s);
        ((CLS143)this.FLD980).MTH2169();
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞᐧ.CLS172$CLS171
    public final void MTH2418(int v, String s) {
        Object object0 = this.FLD980;
        Object object1 = this.FLD981;
        if(this.FLD979 == 4) {
            CLS345 ﹳˊ0 = (CLS345)object1;
            ﹳˊ0.getClass();
            try {
                ﹳˊ0.FLD1303.MTH2418(v, s);
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            ((CLS337)object0).MTH2381(s);
            int v1 = CLS46.MTH1447(s);
            ((CLS337)object0).FLD1172.setTextColor(v1);
            return;
        }
        JSONObject jSONObject0 = (JSONObject)object1;
        CLS143 ˆٴ0 = (CLS143)object0;
        try {
            jSONObject0.put("c", s);
            ˆٴ0.MTH2169();
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
        }
    }
}

