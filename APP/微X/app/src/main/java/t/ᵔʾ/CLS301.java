// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.json.JSONObject;
import t.ʻˑ.CLS1;
import t.ʻˑ.CLS3;
import t.ʻˑ.CLS4;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˊﾞ.CLS102;
import t.ٴـ.CLS117;

public final class CLS301 implements CLS138 {
    public final int FLD929;

    public CLS301(int v) {
        this.FLD929 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS139$CLS138
    public final void MTH2153(Object[] arr_object) {
        String s2;
        Object object6;
        Class class0 = Object.class;
        Bitmap bitmap0 = null;
        switch(this.FLD929) {
            case 0: {
                CLS133.FLD949 = (HashMap)arr_object[0];
                return;
            }
            case 1: {
                CLS133.FLD948 = (HashMap)arr_object[0];
                return;
            }
            case 2: {
                CLS133.FLD951 = (HashMap)arr_object[0];
                return;
            }
            case 3: {
                CLS123.FLD912.MTH2006("core", "unloadFeature", new Object[]{"themes", "themes disabled"});
                CLS123.FLD912.FLD909.clear();
                CLS123.FLD912.FLD907.clear();
                CLS123.FLD912.FLD910.clear();
                return;
            }
            case 4: {
                CLS296 ˆʿ0 = new CLS296(2);
                long v = (long)CLS28.MTH1317(10000, 5000);
                CLS137.FLD972.MTH2146(((CLS136)ˆʿ0), v);
                return;
            }
            case 5: {
                CLS296 ˆʿ1 = new CLS296(1);
                long v1 = (long)CLS28.MTH1317(10000, 5000);
                CLS137.FLD972.MTH2139(((CLS136)ˆʿ1), v1);
                return;
            }
            case 6: {
                try {
                    JSONObject jSONObject0 = (JSONObject)arr_object[0];
                    if(jSONObject0.has("_fapps7")) {
                        CLS133.MTH2103().MTH2125(jSONObject0.optString("_fapps7"), "_fapps7");
                        CLS122.MTH1994();
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                return;
            }
            case 7: {
                CLS117 ˆٴ0 = CLS117.FLD842;
                ˆٴ0.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ0 = ˆٴ0.MTH1905();
                    if(יﹳ0 != null && !יﹳ0.MTH1818("HideActionBar", false)) {
                        Object object0 = arr_object[0];
                        try {
                            Method method0 = object0.getClass().getDeclaredMethod("getResult");
                            method0.setAccessible(true);
                            Object object1 = null;
                            object1 = method0.invoke(object0);
                        }
                        catch(Throwable unused_ex) {
                        }
                        if(((Boolean)object1).booleanValue()) {
                            try {
                                Field field0 = object0.getClass().getDeclaredField("args");
                                if(field0 != null) {
                                    field0.setAccessible(true);
                                    bitmap0 = field0.get(object0);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            Menu menu0 = (Menu)((Object[])bitmap0)[0];
                            if(menu0.size() >= 2) {
                                MenuItem menuItem0 = menu0.getItem(0);
                                MenuItem menuItem1 = menu0.getItem(1);
                                if(יﹳ0.MTH1818("HideActionBarSearchMenu", false) && menuItem0 != null && menuItem0.isVisible()) {
                                    menuItem0.setVisible(false);
                                }
                                if(יﹳ0.MTH1818("HideActionBarPlusMenu", false) && menuItem1 != null && menuItem1.isVisible()) {
                                    menuItem1.setVisible(false);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 8: {
                CLS117 ˆٴ1 = CLS117.FLD842;
                ˆٴ1.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ1 = ˆٴ1.MTH1905();
                    if(יﹳ1 != null && יﹳ1.MTH1818("ChangeActionBarColor", false) && !יﹳ1.MTH1819()) {
                        String s = יﹳ1.MTH1804("ActionBarColor", "");
                        if(!TextUtils.isEmpty(s)) {
                            Object object2 = arr_object[0];
                            try {
                                Field field1 = object2.getClass().getDeclaredField("thisObject");
                                if(field1 != null) {
                                    field1.setAccessible(true);
                                    bitmap0 = field1.get(object2);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            Object object3 = CLS3.MTH991(bitmap0, "getSupportActionBar", new Object[0]);
                            if(object3 != null) {
                                Object object4 = CLS1.MTH980(object3, "ActionBarContainer");
                                if(object4 == null) {
                                    CLS3.MTH991(object3, CLS133.MTH2100("ActionBar_setBackgroundDrawableMethod", "setBackgroundDrawable"), new Object[]{new ColorDrawable(CLS46.MTH1447(s))});
                                }
                                else {
                                    Drawable drawable0 = (Drawable)CLS3.MTH991(object4, "getBackground", new Object[0]);
                                    if(drawable0 == null || !(drawable0 instanceof ColorDrawable)) {
                                        CLS3.MTH991(object3, CLS133.MTH2100("ActionBar_setBackgroundDrawableMethod", "setBackgroundDrawable"), new Object[]{new ColorDrawable(CLS46.MTH1447(s))});
                                        return;
                                    }
                                    else {
                                        int v2 = ((ColorDrawable)drawable0).getColor();
                                        if(v2 != 0 && v2 != CLS46.MTH1447("#F2F2F2") && v2 != CLS46.MTH1447(s)) {
                                            CLS3.MTH991(object3, CLS133.MTH2100("ActionBar_setBackgroundDrawableMethod", "setBackgroundDrawable"), new Object[]{new ColorDrawable(CLS46.MTH1447(s))});
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 9: {
                CLS117 ˆٴ2 = CLS117.FLD842;
                ˆٴ2.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ2 = ˆٴ2.MTH1905();
                    if(יﹳ2 != null && יﹳ2.MTH1818("SplashImageEnable", false)) {
                        Object object5 = arr_object[0];
                        try {
                            Field field2 = object5.getClass().getDeclaredField("thisObject");
                            object6 = null;
                            if(field2 != null) {
                                field2.setAccessible(true);
                                object6 = field2.get(object5);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        Context context0 = CLS133.MTH2108();
                        try {
                            JSONObject jSONObject1 = יﹳ2.MTH1824("SplashImage");
                            if(jSONObject1 != null) {
                                Uri uri0 = יﹳ2.MTH1803(jSONObject1.optString("p", ""));
                                if(uri0 != null) {
                                    HashMap hashMap0 = יﹳ2.FLD771;
                                    if(hashMap0.containsKey(uri0.toString())) {
                                        bitmap0 = (Bitmap)hashMap0.get(uri0.toString());
                                    }
                                    else {
                                        Bitmap bitmap1 = CLS41.MTH1399(context0, jSONObject1, CLS41.MTH1392(uri0));
                                        hashMap0.put(uri0.toString(), bitmap1);
                                        bitmap0 = bitmap1;
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable1) {
                            CLS133.MTH2113(throwable1);
                        }
                        if(bitmap0 != null) {
                            ((ImageView)object6).setImageBitmap(bitmap0);
                        }
                    }
                }
                return;
            }
            case 10: {
                CLS117 ˆٴ3 = CLS117.FLD842;
                ˆٴ3.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ3 = ˆٴ3.MTH1905();
                    if(יﹳ3 != null && !יﹳ3.MTH1819()) {
                        boolean z = יﹳ3.MTH1818("FragmentItemViewTitleColorEnable", false);
                        if(יﹳ3.MTH1818("MeFragmentBackgroundEnable", false) || z || יﹳ3.MTH1818("MeFragmentBackgroundColorEnable", false)) {
                            CLS4 ᵔʾ0 = new CLS4(arr_object[0]);
                            if(((View)ᵔʾ0.MTH1002()).getClass().getName().endsWith("PullDownListView") && ᵔʾ0.MTH1001()[0] instanceof NinePatchDrawable) {
                                ᵔʾ0.MTH1004(null);
                            }
                        }
                    }
                }
                return;
            }
            case 11: {
                CLS117 ˆٴ4 = CLS117.FLD842;
                ˆٴ4.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ4 = ˆٴ4.MTH1905();
                    if(יﹳ4 != null && !יﹳ4.MTH1818("HideBottomTab", false) && !יﹳ4.MTH1821() && יﹳ4.MTH1818("BottomTabLabelTextColorEnable", false) && !יﹳ4.MTH1819()) {
                        CLS4 ᵔʾ1 = new CLS4(arr_object[0]);
                        int v3 = (int)(((Integer)ᵔʾ1.MTH1001()[0]));
                        String s1 = CLS133.MTH2115("BottomTabLabelTextColorFocus");
                        if(TextUtils.isEmpty(s1) || v3 != Integer.parseInt(s1)) {
                            String s3 = CLS133.MTH2115("BottomTabLabelTextColorNormal");
                            if(!TextUtils.isEmpty(s3) && v3 == Integer.parseInt(s3)) {
                                s2 = יﹳ4.MTH1804("BottomTabLabelTextColorNormal", "");
                                if(!TextUtils.isEmpty(s2)) {
                                    ᵔʾ1.MTH1004(CLS46.MTH1447(s2));
                                }
                            }
                        }
                        else {
                            s2 = יﹳ4.MTH1804("BottomTabLabelTextColorFocus", "");
                            if(!TextUtils.isEmpty(s2)) {
                                ᵔʾ1.MTH1004(CLS46.MTH1447(s2));
                                return;
                            }
                        }
                    }
                }
                return;
            }
            case 12: {
                CLS117 ˆٴ5 = CLS117.FLD842;
                ˆٴ5.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ5 = ˆٴ5.MTH1905();
                    if(יﹳ5 != null && !יﹳ5.MTH1818("HideBottomTabLabel", false) && !יﹳ5.MTH1821() && !יﹳ5.MTH1818("HideBottomTab", false) && יﹳ5.MTH1818("BottomTabIconColorEnable", false) && !יﹳ5.MTH1819()) {
                        String s4 = יﹳ5.MTH1804("BottomTabIconColorNormal", "");
                        String s5 = יﹳ5.MTH1804("BottomTabIconColorMiddle", "");
                        String s6 = יﹳ5.MTH1804("BottomTabIconColorFocus", "");
                        CLS4 ᵔʾ2 = new CLS4(arr_object[0]);
                        if(!TextUtils.isEmpty(s4)) {
                            Bitmap bitmap2 = (Bitmap)CLS15.MTH1072(0xFFFF6A012B3CF2B7L, ᵔʾ2.MTH1002());
                            CLS3.MTH995(ᵔʾ2.MTH1002(), CLS133.MTH2115("IconFieldNormal"), CLS41.MTH1404(bitmap2, CLS46.MTH1447(s4)));
                            if(CLS133.MTH2110("IconFieldPaintNormal")) {
                                Paint paint0 = new Paint(1);
                                paint0.setColorFilter(new PorterDuffColorFilter(CLS46.MTH1447(s6), PorterDuff.Mode.SRC_ATOP));
                                CLS3.MTH995(ᵔʾ2.MTH1002(), CLS133.MTH2115("IconFieldPaintNormal"), paint0);
                            }
                        }
                        if(!TextUtils.isEmpty(s5)) {
                            Bitmap bitmap3 = (Bitmap)CLS15.MTH1072(0xFFFF69B72B3CF2B7L, ᵔʾ2.MTH1002());
                            CLS3.MTH995(ᵔʾ2.MTH1002(), CLS133.MTH2115("IconFieldMiddle"), CLS41.MTH1404(bitmap3, CLS46.MTH1447(s5)));
                        }
                        if(!TextUtils.isEmpty(s6)) {
                            Bitmap bitmap4 = (Bitmap)CLS15.MTH1072(0xFFFF69972B3CF2B7L, ᵔʾ2.MTH1002());
                            CLS3.MTH995(ᵔʾ2.MTH1002(), CLS133.MTH2115("IconFieldFocus"), CLS41.MTH1404(bitmap4, CLS46.MTH1447(s6)));
                            if(CLS133.MTH2110("IconFieldPaintFocus")) {
                                Paint paint1 = new Paint(1);
                                paint1.setColorFilter(new PorterDuffColorFilter(CLS46.MTH1447(s6), PorterDuff.Mode.SRC_ATOP));
                                CLS3.MTH995(ᵔʾ2.MTH1002(), CLS133.MTH2115("IconFieldPaintFocus"), paint1);
                            }
                        }
                    }
                }
                return;
            }
            case 13: {
                CLS117 ˆٴ6 = CLS117.FLD842;
                ˆٴ6.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ6 = ˆٴ6.MTH1905();
                    if(יﹳ6 != null && !יﹳ6.MTH1818("HideBottomTabLabel", false) && !יﹳ6.MTH1821() && !יﹳ6.MTH1818("HideBottomTab", false) && !יﹳ6.MTH1819()) {
                        CLS4 ᵔʾ3 = new CLS4(arr_object[0]);
                        if(!יﹳ6.MTH1818("HideBottomTabLabel", false) && יﹳ6.MTH1818("BottomTabIconReplaceTextEnable", false)) {
                            String s7 = יﹳ6.MTH1804("BottomTabIconWechatText", "");
                            if(!TextUtils.isEmpty(s7)) {
                                CLS43.MTH1429(((TextView)CLS15.MTH1072(0xFFFF6E972B3CF2B7L, CLS15.MTH1072(0xFFFF6EB62B3CF2B7L, ᵔʾ3.MTH1002()))), s7);
                            }
                            String s8 = יﹳ6.MTH1804("BottomTabIconContactsText", "");
                            if(!TextUtils.isEmpty(s8)) {
                                CLS43.MTH1429(((TextView)CLS15.MTH1072(0xFFFF6E382B3CF2B7L, CLS15.MTH1072(-160154310085961L, ᵔʾ3.MTH1002()))), s8);
                            }
                            String s9 = יﹳ6.MTH1804("BottomTabIconDiscoverText", "");
                            if(!TextUtils.isEmpty(s9)) {
                                CLS43.MTH1429(((TextView)CLS15.MTH1072(0xFFFF6DD92B3CF2B7L, CLS15.MTH1072(0xFFFF6DF82B3CF2B7L, ᵔʾ3.MTH1002()))), s9);
                            }
                            String s10 = יﹳ6.MTH1804("BottomTabIconMeText", "");
                            if(!TextUtils.isEmpty(s10)) {
                                CLS43.MTH1429(((TextView)CLS15.MTH1072(0xFFFF6D802B3CF2B7L, CLS15.MTH1072(0xFFFF6D9F2B3CF2B7L, ᵔʾ3.MTH1002()))), s10);
                            }
                        }
                        if(יﹳ6.MTH1818("BottomTabReplaceIconEnable", false)) {
                            Object object7 = CLS15.MTH1072(0xFFFF6D212B3CF2B7L, CLS15.MTH1072(0xFFFF6D402B3CF2B7L, ᵔʾ3.MTH1002()));
                            Bitmap bitmap5 = יﹳ6.MTH1814("BottomTabWechatIconNormal.png", false);
                            if(bitmap5 != null) {
                                CLS3.MTH995(object7, CLS133.MTH2115("IconFieldNormal"), bitmap5);
                                CLS3.MTH995(object7, CLS133.MTH2115("IconFieldMiddle"), bitmap5.copy(bitmap5.getConfig(), true));
                            }
                            Bitmap bitmap6 = יﹳ6.MTH1814("BottomTabWechatIconFocus.png", false);
                            if(bitmap6 != null) {
                                CLS3.MTH995(object7, CLS133.MTH2115("IconFieldFocus"), bitmap6);
                            }
                            Object object8 = CLS15.MTH1072(0xFFFF6C732B3CF2B7L, CLS15.MTH1072(-162099930271049L, ᵔʾ3.MTH1002()));
                            Bitmap bitmap7 = יﹳ6.MTH1814("BottomTabContactsIconNormal.png", false);
                            if(bitmap7 != null) {
                                CLS3.MTH995(object8, CLS133.MTH2115("IconFieldNormal"), bitmap7);
                                CLS3.MTH995(object8, CLS133.MTH2115("IconFieldMiddle"), bitmap7.copy(bitmap7.getConfig(), true));
                            }
                            Bitmap bitmap8 = יﹳ6.MTH1814("BottomTabContactsIconFocus.png", false);
                            if(bitmap8 != null) {
                                CLS3.MTH995(object8, CLS133.MTH2115("IconFieldFocus"), bitmap8);
                            }
                            Object object9 = CLS15.MTH1072(0xFFFF6BC12B3CF2B7L, CLS15.MTH1072(0xFFFF6BE02B3CF2B7L, ᵔʾ3.MTH1002()));
                            Bitmap bitmap9 = יﹳ6.MTH1814("BottomTabDiscoverIconNormal.png", false);
                            if(bitmap9 != null) {
                                CLS3.MTH995(object9, CLS133.MTH2115("IconFieldNormal"), bitmap9);
                                CLS3.MTH995(object9, CLS133.MTH2115("IconFieldMiddle"), bitmap9.copy(bitmap9.getConfig(), true));
                            }
                            Bitmap bitmap10 = יﹳ6.MTH1814("BottomTabDiscoverIconFocus.png", false);
                            if(bitmap10 != null) {
                                CLS3.MTH995(object9, CLS133.MTH2115("IconFieldFocus"), bitmap10);
                            }
                            Object object10 = CLS15.MTH1072(0xFFFF6B0F2B3CF2B7L, CLS15.MTH1072(0xFFFF6B2E2B3CF2B7L, ᵔʾ3.MTH1002()));
                            Bitmap bitmap11 = יﹳ6.MTH1814("BottomTabMeIconNormal.png", false);
                            if(bitmap11 != null) {
                                CLS3.MTH995(object10, CLS133.MTH2115("IconFieldNormal"), bitmap11);
                                CLS3.MTH995(object10, CLS133.MTH2115("IconFieldMiddle"), bitmap11.copy(bitmap11.getConfig(), true));
                            }
                            Bitmap bitmap12 = יﹳ6.MTH1814("BottomTabMeIconFocus.png", false);
                            if(bitmap12 != null) {
                                CLS3.MTH995(object10, CLS133.MTH2115("IconFieldFocus"), bitmap12);
                            }
                        }
                    }
                }
                return;
            }
            case 14: {
                CLS117 ˆٴ7 = CLS117.FLD842;
                ˆٴ7.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ7 = ˆٴ7.MTH1905();
                    if(יﹳ7 != null && !יﹳ7.MTH1818("HideBottomTabLabel", false) && !יﹳ7.MTH1821() && !יﹳ7.MTH1818("HideBottomTab", false) && !יﹳ7.MTH1819() && !יﹳ7.MTH1818("HideBottomTabLabel", false) && יﹳ7.MTH1818("BottomTabIconReplaceTextEnable", false)) {
                        String s11 = יﹳ7.MTH1804("BottomTabIconWechatText", "");
                        if(!TextUtils.isEmpty(s11)) {
                            Object object11 = arr_object[0];
                            try {
                                Field field3 = object11.getClass().getDeclaredField("thisObject");
                                if(field3 != null) {
                                    field3.setAccessible(true);
                                    bitmap0 = field3.get(object11);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            CLS43.MTH1429(((TextView)CLS15.MTH1072(0xFFFF6F472B3CF2B7L, CLS15.MTH1072(0xFFFF6F662B3CF2B7L, CLS15.MTH1072(0xFFFF6F742B3CF2B7L, CLS15.MTH1072(0xFFFF6F7F2B3CF2B7L, bitmap0))))), s11);
                        }
                    }
                }
                return;
            }
            case 15: {
                CLS117 ˆٴ8 = CLS117.FLD842;
                ˆٴ8.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ8 = ˆٴ8.MTH1905();
                    if(יﹳ8 != null && !יﹳ8.MTH1818("HideBottomTabLabel", false) && !יﹳ8.MTH1821() && !יﹳ8.MTH1818("HideBottomTab", false) && !יﹳ8.MTH1819() && !יﹳ8.MTH1818("HideBottomTabLabel", false) && יﹳ8.MTH1818("BottomTabIconReplaceTextEnable", false)) {
                        String s12 = יﹳ8.MTH1804("BottomTabIconWechatText", "");
                        if(!TextUtils.isEmpty(s12)) {
                            Object object12 = arr_object[0];
                            try {
                                Field field4 = object12.getClass().getDeclaredField("thisObject");
                                if(field4 != null) {
                                    field4.setAccessible(true);
                                    bitmap0 = field4.get(object12);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            CLS43.MTH1429(((TextView)CLS15.MTH1072(0xFFFF70102B3CF2B7L, CLS15.MTH1072(0xFFFF702F2B3CF2B7L, CLS15.MTH1072(0xFFFF703D2B3CF2B7L, CLS15.MTH1072(0xFFFF70482B3CF2B7L, CLS15.MTH1072(0xFFFF70572B3CF2B7L, bitmap0)))))), s12);
                        }
                    }
                }
                return;
            }
            case 16: {
                CLS117 ˆٴ9 = CLS117.FLD842;
                ˆٴ9.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ9 = ˆٴ9.MTH1905();
                    if(יﹳ9 != null && יﹳ9.MTH1818("HidePullDownAppBrand", false)) {
                        Object object13 = arr_object[0];
                        try {
                            Method method1 = object13.getClass().getDeclaredMethod("setResult", class0);
                            method1.setAccessible(true);
                            method1.invoke(object13, Boolean.FALSE);
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
                return;
            }
            case 17: {
                CLS117 ˆٴ10 = CLS117.FLD842;
                ˆٴ10.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ10 = ˆٴ10.MTH1905();
                    if(יﹳ10 != null && יﹳ10.MTH1818("HideActionBar", false) && !יﹳ10.MTH1821()) {
                        CLS4 ᵔʾ4 = new CLS4(arr_object[0]);
                        Object object14 = CLS15.MTH1077(0xFFFF4E2E2B3CF2B7L) ? CLS1.MTH980(ᵔʾ4.MTH1002(), CLS133.MTH2115("TabAddressClass")) : CLS15.MTH1072(0xFFFF4E162B3CF2B7L, ᵔʾ4.MTH1002());
                        if(object14 != null) {
                            int v4 = CLS43.MTH1415(((Activity)CLS3.MTH991(object14, "getContext", new Object[0])));
                            ((View)CLS3.MTH991(object14, "getView", new Object[0])).setPadding(0, v4, 0, 0);
                            ᵔʾ4.MTH1004(null);
                        }
                    }
                }
                return;
            }
            case 18: {
                CLS117 ˆٴ11 = CLS117.FLD842;
                ˆٴ11.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ11 = ˆٴ11.MTH1905();
                    if(יﹳ11 != null && יﹳ11.MTH1818("ChangeActionBarColor", false) && !יﹳ11.MTH1819()) {
                        Object object15 = arr_object[0];
                        try {
                            Method method2 = object15.getClass().getDeclaredMethod("setResult", class0);
                            method2.setAccessible(true);
                            method2.invoke(object15, ((Object)null));
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
                return;
            }
            case 19: {
                CLS117 ˆٴ12 = CLS117.FLD842;
                ˆٴ12.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ12 = ˆٴ12.MTH1905();
                    if(יﹳ12 != null) {
                        CLS4 ᵔʾ5 = new CLS4(arr_object[0]);
                        int v5 = (int)(((Integer)ᵔʾ5.MTH1001()[1]));
                        if(v5 != 0 && v5 != CLS46.MTH1447("#F2F2F2")) {
                            if(יﹳ12.MTH1818("ChangeActionBarColor", false) && !יﹳ12.MTH1819()) {
                                String s13 = יﹳ12.MTH1804("ActionBarColor", "");
                                if(!TextUtils.isEmpty(s13)) {
                                    Object[] arr_object1 = ᵔʾ5.MTH1001();
                                    arr_object1[1] = CLS46.MTH1447(s13);
                                    return;
                                }
                            }
                            else if(יﹳ12.MTH1821()) {
                                String s14 = יﹳ12.MTH1804("TabLayoutColor", "#000000");
                                if(!TextUtils.isEmpty(s14)) {
                                    Object[] arr_object2 = ᵔʾ5.MTH1001();
                                    arr_object2[1] = CLS46.MTH1447(s14);
                                    return;
                                }
                            }
                            else if(CLS15.MTH1077(0xFFFF50122B3CF2B7L) && יﹳ12.MTH1818("MoveUpBottomTab", false) && יﹳ12.MTH1818("ChangeBottomTabColor", false)) {
                                String s15 = יﹳ12.MTH1804("BottomTabColor", "");
                                if(!TextUtils.isEmpty(s15)) {
                                    Object[] arr_object3 = ᵔʾ5.MTH1001();
                                    arr_object3[1] = CLS46.MTH1447(s15);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 20: {
                CLS117 ˆٴ13 = CLS117.FLD842;
                ˆٴ13.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ13 = ˆٴ13.MTH1905();
                    if(יﹳ13 != null) {
                        CLS4 ᵔʾ6 = new CLS4(arr_object[0]);
                        int v6 = (int)(((Integer)ᵔʾ6.MTH1001()[0]));
                        if(v6 != 0 && v6 != CLS46.MTH1447("#F2F2F2")) {
                            if(יﹳ13.MTH1818("ChangeActionBarColor", false) && !יﹳ13.MTH1819()) {
                                String s16 = יﹳ13.MTH1804("ActionBarColor", "");
                                if(!TextUtils.isEmpty(s16)) {
                                    Object[] arr_object4 = ᵔʾ6.MTH1001();
                                    arr_object4[0] = CLS46.MTH1447(s16);
                                    return;
                                }
                            }
                            else if(יﹳ13.MTH1821()) {
                                String s17 = יﹳ13.MTH1804("TabLayoutColor", "#000000");
                                if(!TextUtils.isEmpty(s17)) {
                                    Object[] arr_object5 = ᵔʾ6.MTH1001();
                                    arr_object5[0] = CLS46.MTH1447(s17);
                                    return;
                                }
                            }
                            else if(CLS15.MTH1077(0xFFFF50952B3CF2B7L) && יﹳ13.MTH1818("MoveUpBottomTab", false) && יﹳ13.MTH1818("ChangeBottomTabColor", false)) {
                                String s18 = יﹳ13.MTH1804("BottomTabColor", "");
                                if(!TextUtils.isEmpty(s18)) {
                                    Object[] arr_object6 = ᵔʾ6.MTH1001();
                                    arr_object6[0] = CLS46.MTH1447(s18);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 21: {
                CLS117 ˆٴ14 = CLS117.FLD842;
                ˆٴ14.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ14 = ˆٴ14.MTH1905();
                    if(יﹳ14 != null) {
                        CLS4 ᵔʾ7 = new CLS4(arr_object[0]);
                        int v7 = (int)(((Integer)ᵔʾ7.MTH1001()[0]));
                        if(v7 != 0 && v7 != CLS46.MTH1447("#F2F2F2")) {
                            if(יﹳ14.MTH1818("ChangeActionBarColor", false) && !יﹳ14.MTH1819()) {
                                String s19 = יﹳ14.MTH1804("ActionBarColor", "");
                                if(!TextUtils.isEmpty(s19)) {
                                    Object[] arr_object7 = ᵔʾ7.MTH1001();
                                    arr_object7[0] = CLS46.MTH1447(s19);
                                    return;
                                }
                            }
                            else if(יﹳ14.MTH1821()) {
                                String s20 = יﹳ14.MTH1804("TabLayoutColor", "#000000");
                                if(!TextUtils.isEmpty(s20)) {
                                    Object[] arr_object8 = ᵔʾ7.MTH1001();
                                    arr_object8[0] = CLS46.MTH1447(s20);
                                    return;
                                }
                            }
                            else if(CLS15.MTH1077(0xFFFF51182B3CF2B7L) && יﹳ14.MTH1818("MoveUpBottomTab", false) && יﹳ14.MTH1818("ChangeBottomTabColor", false)) {
                                String s21 = יﹳ14.MTH1804("BottomTabColor", "");
                                if(!TextUtils.isEmpty(s21)) {
                                    Object[] arr_object9 = ᵔʾ7.MTH1001();
                                    arr_object9[0] = CLS46.MTH1447(s21);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 22: {
                CLS301.MTH2062(arr_object);
                return;
            }
            case 23: {
                CLS117 ˆٴ15 = CLS117.FLD842;
                ˆٴ15.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ15 = ˆٴ15.MTH1905();
                    if(יﹳ15 != null && יﹳ15.MTH1818("ChangeActionBarColor", false) && !יﹳ15.MTH1819()) {
                        Object object16 = arr_object[0];
                        try {
                            Method method3 = object16.getClass().getDeclaredMethod("setResult", class0);
                            method3.setAccessible(true);
                            method3.invoke(object16, ((Object)null));
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
                return;
            }
            case 24: {
                CLS301.MTH2064(arr_object);
                return;
            }
            case 25: {
                CLS301.MTH2061(arr_object);
                return;
            }
            case 26: {
                CLS301.MTH2063(arr_object);
                return;
            }
            case 27: {
                CLS301.MTH2066(arr_object);
                return;
            }
            case 28: {
                CLS117 ˆٴ16 = CLS117.FLD842;
                ˆٴ16.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ16 = ˆٴ16.MTH1905();
                    if(יﹳ16 != null && יﹳ16.MTH1818("HideActionBar", false)) {
                        Object object17 = arr_object[0];
                        try {
                            Method method4 = object17.getClass().getDeclaredMethod("setResult", class0);
                            method4.setAccessible(true);
                            method4.invoke(object17, ((Object)null));
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
                return;
            }
            default: {
                CLS301.MTH2065(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private static void MTH2061(Object[] arr_object) {
        Object object1;
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && יﹳ0.MTH1818("ChangeActionBarColor", false) && !יﹳ0.MTH1819()) {
                Object object0 = arr_object[0];
                try {
                    Field field0 = object0.getClass().getDeclaredField("thisObject");
                    object1 = null;
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object1 = field0.get(object0);
                    }
                }
                catch(Throwable unused_ex) {
                }
                Object object2 = CLS3.MTH989(object1, CLS133.MTH2100("HomeUIActionBarField", "mActionBar"));
                if(object2 != null) {
                    String s = יﹳ0.MTH1804("ActionBarColor", "");
                    if(!TextUtils.isEmpty(s)) {
                        CLS3.MTH991(object2, CLS133.MTH2100("ActionBar_setBackgroundDrawableMethod", "setBackgroundDrawable"), new Object[]{new ColorDrawable(CLS46.MTH1447(s))});
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private static void MTH2062(Object[] arr_object) {
        Object object1;
        if(Build.VERSION.SDK_INT >= 21) {
            Object object0 = arr_object[0];
            try {
                Field field0 = object0.getClass().getDeclaredField("args");
                object1 = null;
                if(field0 != null) {
                    field0.setAccessible(true);
                    object1 = field0.get(object0);
                }
            }
            catch(Throwable unused_ex) {
            }
            Window window0 = ((Activity)((Object[])object1)[0]).getWindow();
            int v = window0.getStatusBarColor();
            if(v != 0 && v != CLS46.MTH1447("#F2F2F2")) {
                CLS117 ˆٴ0 = CLS117.FLD842;
                ˆٴ0.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ0 = ˆٴ0.MTH1905();
                    if(יﹳ0 != null) {
                        if(יﹳ0.MTH1818("ChangeActionBarColor", false) && !יﹳ0.MTH1819()) {
                            String s = יﹳ0.MTH1804("ActionBarColor", "");
                            if(!TextUtils.isEmpty(s)) {
                                window0.setStatusBarColor(CLS46.MTH1447(s));
                            }
                        }
                        else if(יﹳ0.MTH1821()) {
                            String s1 = יﹳ0.MTH1804("TabLayoutColor", "#000000");
                            if(!TextUtils.isEmpty(s1)) {
                                window0.setStatusBarColor(CLS46.MTH1447(s1));
                            }
                        }
                        else if(CLS15.MTH1077(0xFFFF519B2B3CF2B7L) && יﹳ0.MTH1818("MoveUpBottomTab", false) && יﹳ0.MTH1818("ChangeBottomTabColor", false)) {
                            String s2 = יﹳ0.MTH1804("BottomTabColor", "");
                            if(!TextUtils.isEmpty(s2)) {
                                window0.setStatusBarColor(CLS46.MTH1447(s2));
                            }
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private static void MTH2063(Object[] arr_object) {
        Object object1;
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && יﹳ0.MTH1818("HideActionBar", false) && !יﹳ0.MTH1821()) {
                Object object0 = arr_object[0];
                try {
                    Field field0 = object0.getClass().getDeclaredField("thisObject");
                    object1 = null;
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object1 = field0.get(object0);
                    }
                }
                catch(Throwable unused_ex) {
                }
                ((View)CLS3.MTH991(CLS15.MTH1072(0xFFFF4E512B3CF2B7L, object1), "getView", new Object[0])).setPadding(0, 0, 0, 0);
            }
        }
    }

    // 此方法包含解密的字符串
    private static void MTH2064(Object[] arr_object) {
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && יﹳ0.MTH1818("ChangeActionBarColor", false) && !יﹳ0.MTH1819()) {
                Object object0 = arr_object[0];
                try {
                    Method method0 = object0.getClass().getDeclaredMethod("setResult", Object.class);
                    method0.setAccessible(true);
                    method0.invoke(object0, ((Object)null));
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private static void MTH2065(Object[] arr_object) {
        CLS117.FLD842.getClass();
        if(CLS117.MTH1906()) {
            Object object0 = arr_object[0];
            try {
                Method method0 = object0.getClass().getDeclaredMethod("setResult", Object.class);
                method0.setAccessible(true);
                method0.invoke(object0, ((Object)null));
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    // 此方法包含解密的字符串
    private static void MTH2066(Object[] arr_object) {
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && יﹳ0.MTH1818("HideActionBar", false) && !יﹳ0.MTH1821()) {
                CLS4 ᵔʾ0 = new CLS4(arr_object[0]);
                Object object0 = CLS15.MTH1077(0xFFFF4EB32B3CF2B7L) ? CLS1.MTH980(ᵔʾ0.MTH1002(), CLS133.MTH2115("TabDiscoverClass")) : CLS15.MTH1072(0xFFFF4E9B2B3CF2B7L, ᵔʾ0.MTH1002());
                if(object0 != null) {
                    int v = CLS43.MTH1415(((Activity)CLS3.MTH991(object0, "getContext", new Object[0])));
                    ((View)CLS3.MTH991(object0, "getView", new Object[0])).setPadding(0, v, 0, 0);
                    ᵔʾ0.MTH1004(null);
                }
            }
        }
    }
}

