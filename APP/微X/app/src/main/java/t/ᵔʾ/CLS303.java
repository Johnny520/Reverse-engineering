// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.app.Activity;
import android.app.ProgressDialog;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import t.ʻˑ.CLS3;
import t.ʻˑ.CLS4;
import t.ʾᵢ.CLS15;
import t.ʾᵢ.CLS16;
import t.ʾᵢ.CLS20;
import t.ʾᵢ.CLS216;
import t.ʾᵢ.CLS226;
import t.ʾᵢ.CLS258;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS32;
import t.ˆʿ.CLS38;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˆʿ.CLS55.CLS53;
import t.ˆʿ.CLS55.CLS54;
import t.ˆʿ.CLS57;
import t.ˆٴ.CLS283;
import t.ˆٴ.CLS64;
import t.ˆٴ.CLS70;
import t.ˆٴ.CLS73;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS105;
import t.ˊﾞ.CLS98;
import t.ٴـ.CLS117;
import t.ⁱʾ.CLS140;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS144;
import t.ⁱʾ.CLS145;
import t.ⁱʾ.CLS146;
import t.ﾞٴ.CLS309;
import t.ﾞٴ.CLS322;
import t.ﾞᐧ.CLS168;
import t.ﾞᐧ.CLS336;
import t.ﾞᐧ.CLS337;
import t.ﾞᐧ.CLS338;
import t.ﾞᐧ.CLS343;
import t.ﾞᐧ.CLS344;

public final class CLS303 implements CLS53, CLS136, CLS140, CLS144 {
    public final int FLD973;
    public final Object FLD974;
    public final Object FLD975;
    public final Object FLD976;

    public CLS303(Activity activity0, CLS226 יᐧ0, CLS226 יᐧ1) {
        this.FLD973 = 5;
        super();
        this.FLD975 = activity0;
        this.FLD976 = יᐧ0;
        this.FLD974 = יᐧ1;
    }

    public CLS303(Object object0, Object object1, Object object2, int v) {
        this.FLD973 = v;
        this.FLD975 = object0;
        this.FLD974 = object1;
        this.FLD976 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        Throwable throwable3;
        Bitmap bitmap1;
        Bitmap bitmap0;
        String s2;
        JSONObject jSONObject1;
        JSONArray jSONArray0;
        int v1;
        String s1;
        Object object0 = this.FLD976;
        Object object1 = this.FLD974;
        Object object2 = this.FLD975;
        switch(this.FLD973) {
            case 0: {
                CLS143 ˆٴ0 = (CLS143)object0;
                if(((File)object2) != null && ((File)object2).canWrite()) {
                    if(((CLS146)object1) != null) {
                        ((CLS146)object1).MTH2177(((File)object2));
                        return;
                    }
                }
                else if(ˆٴ0 != null) {
                    try {
                        ˆٴ0.MTH2169();
                        return;
                    }
                    catch(Throwable throwable0) {
                        CLS133.MTH2113(throwable0);
                    }
                }
                return;
            }
            case 1: {
                CLS43.MTH1437(((LinearLayout)object2), ((BitmapDrawable)object1));
                ((ListView)object0).setDivider(new ColorDrawable(0));
                return;
            }
            case 2: {
                ((CLS105)object2).getClass();
                ((ImageView)object1).setImageBitmap(((Bitmap)object0));
                int v = ((CLS105)object2).FLD783.MTH1817(0xFF, "DrawerHeaderBgAlpha");
                if(v != 0xFF) {
                    ((ImageView)object1).setAlpha(((float)v) / 255.0f);
                }
                return;
            }
            case 3: {
                String s = (String)object1;
                CLS4 ᵔʾ0 = (CLS4)object0;
                ((CLS309)object2).getClass();
                CLS117 ˆٴ1 = CLS117.FLD842;
                ˆٴ1.getClass();
                Object object3 = null;
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ0 = ˆٴ1.MTH1905();
                    s1 = יﹳ0 == null || !יﹳ0.MTH1818("ChatFragmentBackgroundColorEnable", false) ? null : יﹳ0.MTH1804("ChatFragmentBackgroundColor", "000000");
                }
                else {
                    s1 = null;
                }
                if(TextUtils.isEmpty(s1)) {
                    CLS135 ⁱˉ0 = ((CLS309)object2).FLD1084;
                    if(ⁱˉ0.MTH2131("random_chatting_bg", false)) {
                        try {
                            if(ⁱˉ0.MTH2131("rnd_bg_custom_" + s, false)) {
                                if(ⁱˉ0.FLD963.containsKey("rnd_bg_" + s)) {
                                    v1 = 1;
                                }
                                else {
                                    Cursor cursor0 = CLS135.MTH2133(ⁱˉ0.getReadableDatabase(), "rnd_bg_" + s);
                                    if(cursor0 == null) {
                                        v1 = 0;
                                    }
                                    else {
                                        int v2 = cursor0.getCount() <= 0 ? 0 : 1;
                                        cursor0.close();
                                        v1 = v2;
                                    }
                                }
                                if(v1 != 0) {
                                    jSONArray0 = ⁱˉ0.MTH2135("rnd_bg_" + s, new JSONArray());
                                    goto label_62;
                                }
                                goto label_61;
                            }
                            else {
                            label_61:
                                jSONArray0 = ⁱˉ0.MTH2131("rnd_bg_general", false) ? ⁱˉ0.MTH2135("rnd_bg", new JSONArray()) : null;
                            }
                        label_62:
                            if(jSONArray0 == null) {
                                bitmap0 = null;
                            }
                            else {
                                ArrayList arrayList0 = new ArrayList();
                                for(int v3 = 0; v3 < jSONArray0.length(); ++v3) {
                                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v3);
                                    if(jSONObject0.optBoolean("e", false) && CLS125.MTH2024(jSONObject0.optString("p", ""))) {
                                        arrayList0.add(jSONObject0);
                                    }
                                }
                                if(arrayList0.isEmpty()) {
                                    bitmap0 = null;
                                }
                                else {
                                    jSONObject1 = (JSONObject)(arrayList0.isEmpty() ? null : arrayList0.get(CLS28.MTH1317(arrayList0.size() - 1, 0)));
                                    if(jSONObject1 == null) {
                                        bitmap0 = null;
                                    }
                                    else {
                                        s2 = jSONObject1.optString("p");
                                        if(TextUtils.isEmpty(s2)) {
                                            bitmap0 = null;
                                            goto label_115;
                                        }
                                        goto label_78;
                                    }
                                }
                            }
                            goto label_115;
                        }
                        catch(Throwable throwable1) {
                            goto label_111;
                        }
                    label_78:
                        HashMap hashMap0 = ((CLS309)object2).FLD1022;
                        try {
                            if(hashMap0.containsKey(s2)) {
                                bitmap0 = (Bitmap)hashMap0.get(s2);
                            }
                            else {
                                int v4 = CLS43.MTH1417(CLS133.MTH2108());
                                WindowManager windowManager0 = (WindowManager)CLS133.MTH2108().getSystemService("window");
                                DisplayMetrics displayMetrics0 = new DisplayMetrics();
                                windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
                                bitmap1 = CLS41.MTH1394(s2, v4, displayMetrics0.heightPixels - CLS43.MTH1439(0x60));
                                if(bitmap1 == null) {
                                    bitmap0 = null;
                                }
                                else {
                                    goto label_88;
                                }
                            }
                            goto label_115;
                        }
                        catch(Throwable throwable1) {
                            goto label_111;
                        }
                        try {
                        label_88:
                            bitmap0 = CLS41.MTH1399(CLS133.MTH2108(), jSONObject1, bitmap1);
                        }
                        catch(Throwable throwable2) {
                            throwable3 = throwable2;
                            goto label_113;
                        }
                        try {
                            hashMap0.put(s2, bitmap0);
                            goto label_115;
                        }
                        catch(Throwable throwable3) {
                            bitmap1 = bitmap0;
                            goto label_113;
                        }
                    }
                    bitmap0 = null;
                }
                else {
                    bitmap0 = null;
                    goto label_115;
                label_111:
                    throwable3 = throwable1;
                    bitmap1 = null;
                label_113:
                    CLS133.MTH2113(throwable3);
                    bitmap0 = bitmap1;
                }
            label_115:
                if(bitmap0 != null || !TextUtils.isEmpty(s1)) {
                    ImageView imageView0 = (ImageView)CLS15.MTH1072(0xFFFF54052B3CF2B7L, ᵔʾ0.MTH1002());
                    if(imageView0 == null) {
                        try {
                            if(!TextUtils.isEmpty(CLS133.MTH2115("ChattingComponentManagerField1")) && !TextUtils.isEmpty(CLS133.MTH2115("ChattingBgId"))) {
                                object3 = CLS3.MTH991(CLS3.MTH989(ᵔʾ0.MTH1002(), CLS133.MTH2115((CLS133.MTH2110("ChattingComponentManagerField1_b") ? "ChattingComponentManagerField1_b" : "ChattingComponentManagerField1"))), CLS133.MTH2100("findViewByIdMethod1", "findViewById"), new Object[]{Integer.valueOf(CLS133.MTH2115("ChattingBgId"))});
                            }
                            if(!TextUtils.isEmpty(CLS133.MTH2115("ChattingBgId_b"))) {
                                object3 = CLS3.MTH991(ᵔʾ0.MTH1002(), "findViewById", new Object[]{Integer.valueOf(CLS133.MTH2115("ChattingBgId_b"))});
                            }
                            if(!TextUtils.isEmpty(CLS133.MTH2115("ChattingBgId_c"))) {
                                CLS3.MTH991(CLS3.MTH991(CLS3.MTH989(ᵔʾ0.MTH1002(), CLS133.MTH2115("ChattingBgIdField1")), CLS133.MTH2115("ChattingBgIdMethod1"), new Object[0]), "findViewById", new Object[]{Integer.valueOf(CLS133.MTH2115("ChattingBgId_c"))});
                            }
                        }
                        catch(Throwable throwable4) {
                            CLS133.MTH2113(throwable4);
                        }
                        if(object3 != null) {
                            CLS3.MTH995(ᵔʾ0.MTH1002(), CLS133.MTH2115("ChattingBackgroundField1"), object3);
                            imageView0 = (ImageView)CLS15.MTH1072(0xFFFF529B2B3CF2B7L, ᵔʾ0.MTH1002());
                        }
                    }
                    if(imageView0 != null) {
                        CLS303 ﾞˎ0 = new CLS303(s1, imageView0, bitmap0, 4);
                        CLS137.FLD972.MTH2145(((CLS136)ﾞˎ0));
                    }
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(((String)object2))) {
                    ((ImageView)object1).setImageDrawable(new ColorDrawable(CLS46.MTH1447(((String)object2))));
                    return;
                }
                if(((Bitmap)object0) != null) {
                    ((ImageView)object1).setImageBitmap(((Bitmap)object0));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS140
    public final void MTH2164(String s) {
        CLS216 ˎﾞ0 = (CLS216)this.FLD975;
        Activity activity0 = (Activity)this.FLD974;
        Object[] arr_object = (Object[])this.FLD976;
        ˎﾞ0.getClass();
        if(!TextUtils.isEmpty(s)) {
            ProgressDialog progressDialog0 = new ProgressDialog(activity0);
            progressDialog0.setMessage(String.format(CLS133.MTH2099("import_theme"), s));
            progressDialog0.setCancelable(true);
            progressDialog0.setProgressStyle(0);
            progressDialog0.setIndeterminate(true);
            progressDialog0.show();
            CLS258 ⁱי0 = new CLS258(ˎﾞ0, arr_object, s, progressDialog0, activity0);
            CLS137.FLD972.MTH2141(((CLS136)ⁱי0));
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS144
    public final void MTH2170(Object[] arr_object) {
        Object object0 = this.FLD974;
        Object object1 = this.FLD976;
        Object object2 = this.FLD975;
        switch(this.FLD973) {
            case 5: {
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                CLS344 ⁱˉ0 = new CLS344(((Activity)object2));
                CLS338 יᐧ0 = new CLS338(((Activity)object2));
                יᐧ0.MTH2400(new CLS16(((CLS143)object1), 0));
                יᐧ0.MTH2172(CLS133.MTH2099("select_normal_icon"));
                ⁱˉ0.MTH2482(((CLS145)יᐧ0));
                CLS338 יᐧ1 = new CLS338(((Activity)object2));
                יᐧ1.MTH2400(new CLS16(((CLS143)object0), 1));
                יᐧ1.MTH2172(CLS133.MTH2099("select_focus_icon"));
                ⁱˉ0.MTH2482(((CLS145)יᐧ1));
                ⁱˉ0.MTH2475(linearLayout1, 0);
                return;
            }
            case 7: {
                ((CLS216)object2).getClass();
                Menu menu1 = (Menu)arr_object[0];
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                CLS336 ˊˏ1 = new CLS336(((Activity)object0));
                CLS70 ﾞٴ0 = new CLS70(((Activity)object0), ((ArrayList)object1));
                CLS168 ˑٴ1 = new CLS168(((Activity)object0), linearLayout2, menu1);
                ˑٴ1.MTH2390("add", ((CLS143)new CLS322(((Activity)object0), ((ArrayList)object1), ﾞٴ0)));
                ˑٴ1.MTH2390("clear", ((CLS143)new CLS283(((ArrayList)object1), ﾞٴ0, 2)));
                ˑٴ1.MTH2392();
                ˊˏ1.MTH2376(ﾞٴ0);
                ˊˏ1.MTH2368(new CLS20(((CLS216)object2), ((Activity)object0), ((ArrayList)object1), ﾞٴ0));
                CLS344 ⁱˉ1 = new CLS344(((Activity)object0));
                ⁱˉ1.MTH2482(((CLS145)ˊˏ1));
                CLS43.MTH1428(linearLayout2, ((CLS145)ⁱˉ1), CLS43.MTH1439(3));
                return;
            }
            case 8: {
                Menu menu2 = (Menu)arr_object[0];
                LinearLayout linearLayout3 = (LinearLayout)arr_object[1];
                CLS168 ˑٴ2 = new CLS168(((Activity)object2), linearLayout3, menu2);
                if(((CLS53)object0) != null) {
                    ((CLS53)object0).MTH1476(ˑٴ2);
                    ˑٴ2.MTH2392();
                }
                if(((CLS54)object1) != null) {
                    ((CLS54)object1).MTH1477(linearLayout3);
                }
                return;
            }
            default: {
                ((CLS38)object2).getClass();
                Menu menu0 = (Menu)arr_object[0];
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                if(!TextUtils.isEmpty(((CLS38)object2).FLD476)) {
                    CLS168 ˑٴ0 = new CLS168(((Activity)object0), linearLayout0, menu0);
                    ˑٴ0.MTH2390("gotodefault", ((CLS143)new CLS343(((CLS38)object2), 3)));
                    ˑٴ0.MTH2392();
                }
                ((CLS38)object2).FLD480 = new CLS73(((Activity)object0));
                CLS336 ˊˏ0 = new CLS336(((Activity)object0));
                ((CLS38)object2).FLD478 = ˊˏ0;
                int v = CLS43.MTH1439(5);
                ColorDrawable colorDrawable0 = new ColorDrawable(CLS46.MTH1456());
                ˊˏ0.FLD1150.setDivider(colorDrawable0);
                ˊˏ0.FLD1150.setDividerHeight(v);
                CLS337 ˎᵢ0 = new CLS337(((Activity)object0));
                ((CLS38)object2).FLD477 = ˎᵢ0;
                ˎᵢ0.FLD1165 = false;
                CLS43.MTH1423(linearLayout0, ((CLS145)ˎᵢ0), true);
                ((CLS38)object2).FLD478.MTH2375(new CLS98(((CLS38)object2), 1));
                ((CLS38)object2).FLD478.MTH2368(new CLS57(((CLS38)object2)));
                ((CLS38)object2).FLD478.MTH2376(((CLS38)object2).FLD480);
                CLS43.MTH1423(linearLayout0, ((CLS145)((CLS38)object2).FLD478), true);
                File file0 = new File(((String)object1));
                ((CLS38)object2).FLD481 = file0;
                if(!file0.isDirectory()) {
                    file0 = file0.getParentFile();
                }
                ((CLS38)object2).FLD486 = file0;
                ((CLS38)object2).MTH1385();
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ˆʿ.CLS55$CLS53
    public final void MTH1476(CLS168 ˑٴ0) {
        CLS53 ⁱˉ$ˆٴ0 = (CLS53)this.FLD975;
        Activity activity0 = (Activity)this.FLD974;
        CLS64 ˆٴ0 = (CLS64)this.FLD976;
        if(ⁱˉ$ˆٴ0 != null) {
            ⁱˉ$ˆٴ0.MTH1476(ˑٴ0);
        }
        if(CLS32.FLD447.MTH1339("sort_contacts")) {
            ˑٴ0.MTH2390("sort", ((CLS143)new CLS283(activity0, ˆٴ0, 3)));
        }
    }
}

