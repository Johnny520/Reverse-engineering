// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import java.lang.reflect.Field;
import org.json.JSONArray;
import t.ʻˑ.CLS3;
import t.ʻˑ.CLS4;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˊﾞ.CLS102;
import t.ˑٴ.CLS114;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS139.CLS138;

public final class CLS329 implements CLS138 {
    public final int FLD1078;

    public CLS329(int v) {
        this.FLD1078 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS139$CLS138
    public final void MTH2153(Object[] arr_object) {
        String s;
        BitmapDrawable bitmapDrawable1;
        Bitmap bitmap1;
        Object object3;
        int v;
        BitmapDrawable bitmapDrawable0 = null;
        switch(this.FLD1078) {
            case 0: {
                CLS117 ˆٴ1 = CLS117.FLD842;
                ˆٴ1.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ1 = ˆٴ1.MTH1905();
                    if(יﹳ1 != null) {
                        CLS4 ᵔʾ0 = new CLS4(arr_object[0]);
                        Drawable drawable0 = (Drawable)ᵔʾ0.MTH1001()[0];
                        if(drawable0 instanceof ColorDrawable) {
                            v = ((ColorDrawable)drawable0).getColor();
                            if(v == 0 || v == CLS46.MTH1447("#F2F2F2")) {
                                return;
                            }
                        }
                        else {
                            v = 0;
                        }
                        if(יﹳ1.MTH1818("ChangeActionBarColor", false) && !יﹳ1.MTH1819()) {
                            String s1 = יﹳ1.MTH1804("ActionBarColor", "");
                            if(!TextUtils.isEmpty(s1)) {
                                int v1 = CLS46.MTH1447(s1);
                                if(v != v1) {
                                    Object[] arr_object1 = ᵔʾ0.MTH1001();
                                    arr_object1[0] = new ColorDrawable(v1);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                CLS117 ˆٴ2 = CLS117.FLD842;
                ˆٴ2.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ2 = ˆٴ2.MTH1905();
                    if(יﹳ2 != null && !יﹳ2.MTH1819()) {
                        Object object2 = arr_object[0];
                        try {
                            Field field0 = object2.getClass().getDeclaredField("args");
                            object3 = null;
                            if(field0 != null) {
                                field0.setAccessible(true);
                                object3 = field0.get(object2);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        int v2 = (int)(((Integer)((Object[])object3)[0]));
                        try {
                            Field field1 = object2.getClass().getDeclaredField("thisObject");
                            if(field1 != null) {
                                field1.setAccessible(true);
                                bitmapDrawable0 = field1.get(object2);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        ImageButton imageButton0 = (ImageButton)CLS15.MTH1072(0xFFFF71F72B3CF2B7L, bitmapDrawable0);
                        if(!CLS15.MTH1077(0xFFFF71E52B3CF2B7L) && v2 == Integer.parseInt(CLS133.MTH2115("chatting_setmode_voice_btn_id"))) {
                            bitmap1 = יﹳ2.MTH1814("chatfooter_mic.png", true);
                            if(bitmap1 != null) {
                                imageButton0.setImageBitmap(bitmap1);
                                return;
                            }
                        }
                        else if(!CLS15.MTH1077(0xFFFF71962B3CF2B7L) && v2 == Integer.parseInt(CLS133.MTH2115("chatting_setmode_keyboard_btn_id"))) {
                            bitmap1 = יﹳ2.MTH1814("chatfooter_keyboard.png", true);
                            if(bitmap1 != null) {
                                imageButton0.setImageBitmap(bitmap1);
                            }
                        }
                    }
                }
                return;
            }
            case 2: {
                CLS117 ˆٴ3 = CLS117.FLD842;
                ˆٴ3.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ3 = ˆٴ3.MTH1905();
                    if(יﹳ3 != null && !יﹳ3.MTH1819()) {
                        Object object4 = arr_object[0];
                        try {
                            Field field2 = object4.getClass().getDeclaredField("thisObject");
                            if(field2 != null) {
                                field2.setAccessible(true);
                                bitmapDrawable0 = field2.get(object4);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        ImageButton imageButton1 = (ImageButton)CLS15.MTH1072(0xFFFF72552B3CF2B7L, bitmapDrawable0);
                        if(imageButton1 != null) {
                            Bitmap bitmap2 = יﹳ3.MTH1814("chatfooter_smiley.png", true);
                            if(bitmap2 != null) {
                                imageButton1.setImageBitmap(bitmap2);
                            }
                        }
                    }
                }
                return;
            }
            case 3: {
                CLS117 ˆٴ4 = CLS117.FLD842;
                ˆٴ4.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ4 = ˆٴ4.MTH1905();
                    if(יﹳ4 != null && !יﹳ4.MTH1819()) {
                        Object object5 = arr_object[0];
                        try {
                            Field field3 = object5.getClass().getDeclaredField("thisObject");
                            bitmapDrawable1 = null;
                            if(field3 != null) {
                                field3.setAccessible(true);
                                bitmapDrawable1 = field3.get(object5);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        ImageButton imageButton2 = (ImageButton)CLS15.MTH1072(0xFFFF72A42B3CF2B7L, bitmapDrawable1);
                        if(imageButton2 != null) {
                            Bitmap bitmap3 = יﹳ4.MTH1814("chatfooter_plus.png", true);
                            if(bitmap3 != null) {
                                imageButton2.setImageBitmap(bitmap3);
                            }
                        }
                        if(bitmapDrawable1 == null) {
                            try {
                                Field field4 = object5.getClass().getDeclaredField("thisObject");
                                if(field4 != null) {
                                    field4.setAccessible(true);
                                    bitmapDrawable0 = field4.get(object5);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            bitmapDrawable1 = bitmapDrawable0;
                        }
                        Button button0 = (Button)CLS15.MTH1072(0xFFFF727C2B3CF2B7L, bitmapDrawable1);
                        if(button0 != null) {
                            BitmapDrawable bitmapDrawable2 = יﹳ4.MTH1820(CLS133.MTH2108(), "chatfooter_send.png", true);
                            if(bitmapDrawable2 != null) {
                                button0.setText("");
                                CLS43.MTH1437(button0, bitmapDrawable2);
                            }
                        }
                    }
                }
                return;
            }
            default: {
                CLS117 ˆٴ0 = CLS117.FLD842;
                ˆٴ0.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ0 = ˆٴ0.MTH1905();
                    if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                        Object object0 = arr_object[2];
                        if(object0 != null) {
                            Object object1 = CLS15.MTH1072(0xFFFF731C2B3CF2B7L, object0);
                            if(object1 != null) {
                                if(יﹳ0.MTH1818("ChatFooterEditBackgroundEnable", false)) {
                                    Context context0 = CLS133.MTH2108();
                                    Bitmap bitmap0 = יﹳ0.MTH1800("chatfooter_edit_bg.png");
                                    if(bitmap0 != null) {
                                        bitmapDrawable0 = new BitmapDrawable(context0.getResources(), bitmap0);
                                    }
                                    if(bitmapDrawable0 != null) {
                                        CLS43.MTH1437(((View)object1), bitmapDrawable0);
                                    }
                                }
                                if(יﹳ0.MTH1818("ChatFooterHintEnable", false)) {
                                    JSONArray jSONArray0 = יﹳ0.MTH1812("ChatFooterHintArray", new JSONArray());
                                    if(jSONArray0 == null || jSONArray0.length() == 0) {
                                        s = CLS114.MTH1900(-73481870052681L);
                                    }
                                    else {
                                        try {
                                            s = jSONArray0.getString(CLS28.MTH1317(jSONArray0.length() - 1, 0));
                                        }
                                        catch(Throwable throwable0) {
                                            CLS133.MTH2113(throwable0);
                                            s = CLS114.MTH1900(0xFFFFBD2A2B3CF2B7L);
                                        }
                                    }
                                    if(!TextUtils.isEmpty(s)) {
                                        CLS3.MTH991(object1, "setHint", new Object[]{s});
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

