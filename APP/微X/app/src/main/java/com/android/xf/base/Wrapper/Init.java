// Decompiled by JEB v5.42.0.202606242140

package com.android.xf.base.Wrapper;

import android.content.ContentValues;
import android.content.Context;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS26;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS564;
import b.ʾᵢ.CLS571;
import b.ˈˈ.CLS69;
import b.ˑٴ.CLS139;
import b.ˑٴ.CLS140;
import b.ˑٴ.CLS720;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1225;
import b.ⁱʽ.CLS1264;
import b.ⁱᵔ.CLS408;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS431;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Init {
    public CLS139 FLD5465;
    public ArrayList FLD5466;

    // 此方法包含解密的字符串
    public void finish() {
        CLS412.MTH5998(((CLS3)new CLS1264(this, 19)));
        for(Object object0: this.FLD5466) {
            CLS140 ﹶˑ0 = (CLS140)object0;
            try {
                ﹶˑ0.MTH3039();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        CLS412.MTH5998(((CLS3)new CLS720(4)));
        CLS27.MTH906("base closed!");
    }

    public ArrayList getData(String s, Object[] arr_object) {
        return CLS21.FLD76.MTH813(s, arr_object);
    }

    public Set getDataChannels() {
        return CLS21.FLD76.FLD74.keySet();
    }

    public Set getEventChannels() {
        return CLS21.FLD76.FLD71.keySet();
    }

    public Set getIdEventChannels() {
        return CLS21.FLD76.FLD73.keySet();
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public ContentValues getInfo() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("versionName", "62");
        contentValues0.put(CLS182.MTH3479(0x207, contentValues0, "versionCode", 0x38EA54552B3CD335L), "base");
        contentValues0.put("shortName", "b");
        contentValues0.put("showVersion", Boolean.TRUE);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public boolean init(Context context0, Object[] arr_object) {
        byte[] arr_b;
        Object object0 = arr_object[0];
        String s = (String)arr_object[1];
        Context context1 = (Context)arr_object[2];
        ContentValues contentValues0 = (ContentValues)arr_object[3];
        HashMap hashMap0 = (HashMap)arr_object[4];
        HashMap hashMap1 = (HashMap)arr_object[5];
        HashMap hashMap2 = (HashMap)arr_object[6];
        HashMap hashMap3 = (HashMap)arr_object[7];
        CLS21 ʾᵢ0 = CLS21.FLD76;
        ʾᵢ0.FLD72 = object0;
        if(object0 != null) {
            Method[] arr_method = object0.getClass().getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                String s1 = method0.getName();
                ʾᵢ0.FLD75.put(s1, method0);
            }
        }
        CLS408 ˈˈ0 = new CLS408(contentValues0, context0);
        CLS40 ﾞᵎ0 = CLS40.FLD157;
        ﾞᵎ0.MTH1115(ˈˈ0);
        if(CLS412.MTH6002()) {
            return false;
        }
        CLS27.FLD108 = object0;
        CLS27.FLD105 = s;
        CLS27.FLD110 = hashMap0;
        CLS27.FLD109 = hashMap1;
        CLS27.MTH886();
        CLS27.FLD103 = hashMap2;
        CLS27.FLD99 = hashMap3;
        CLS27.FLD106 = new WeakReference(context1);
        CLS21 ʾᵢ1 = CLS21.FLD76;
        ʾᵢ1.MTH828(CLS34.MTH1062(1, ʾᵢ1, CLS34.MTH1062(0, ʾᵢ1, "reloadStrings", 4101194774809989941L), 4101194822054630197L), ((CLS35)new CLS571(2)));
        CLS26 ˊˏ0 = new CLS26(context0, ˈˈ0.MTH5946());
        CLS69 ʾᵢ2 = new CLS69(new File(s, "534a9729a0c461cbd7a4379978fb742"));
        try {
            if(CLS31.MTH1029(ʾᵢ2)) {
                arr_b = CLS31.MTH1020(ʾᵢ2.MTH1554());
            }
            else {
                goto label_43;
            }
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            arr_b = null;
        }
        goto label_44;
    label_43:
        arr_b = null;
    label_44:
        ˊˏ0.FLD97 = arr_b;
        ﾞᵎ0.MTH1115(ˊˏ0);
        CLS29 ˎᵢ0 = new CLS29(context1, CLS431.MTH6160((ˊˏ0.MTH876() + "9n4hZkF")));
        ﾞᵎ0.MTH1115(ˎᵢ0);
        if(arr_object.length > 8) {
            ˎᵢ0.FLD121 = (HashMap)arr_object[8];
            ˎᵢ0.FLD124 = true;
        }
        else {
            ˎᵢ0.FLD121 = new HashMap();
            ʾᵢ1.MTH828("WxDataManagerSet", ((CLS35)new CLS564(ˎᵢ0, 0)));
            ʾᵢ1.MTH828("WxDataManagerClear", ((CLS35)new CLS564(ˎᵢ0, 1)));
        }
        this.FLD5466 = new ArrayList();
        CLS412.MTH5998(((CLS3)new CLS1264(this, 0)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 10)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 11)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 12)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 13)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 14)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 15)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 16)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 17)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 18)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 1)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 2)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 3)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 4)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 5)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 6)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 7)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 8)));
        CLS412.MTH5998(((CLS3)new CLS1264(this, 9)));
        try {
            this.FLD5465.MTH3030();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
        for(Object object1: this.FLD5466) {
            CLS140 ﹶˑ0 = (CLS140)object1;
            try {
                ﹶˑ0.MTH3043();
            }
            catch(Throwable throwable2) {
                CLS27.MTH893(throwable2);
            }
        }
        CLS27.MTH906(("feature loaded: base " + 0x207));
        String s2 = CLS34.MTH1062(3, CLS21.FLD76, "disable", 0x38EA54FA2B3CD335L);
        String s3 = CLS34.MTH1062(4, CLS21.FLD76, s2, 0x38EA548B2B3CD335L);
        CLS571 ٴـ0 = new CLS571(5);
        CLS21.FLD76.MTH828(s3, ((CLS35)ٴـ0));
        CLS1225 ʻˏ0 = new CLS1225(4);
        CLS40.FLD157.MTH1124(((CLS39)ʻˏ0));
        return true;
    }

    public void publish(String s, Object[] arr_object) {
        CLS21.FLD76.MTH818(s, arr_object);
    }

    public void publishAsync(String s, Object[] arr_object) {
        CLS21.FLD76.MTH829(s, arr_object);
    }

    public void publishId(String s, int v, Object[] arr_object) {
        CLS21.FLD76.MTH825(s, v, arr_object);
    }

    public void publishIncrement(String s, Object[] arr_object) {
        CLS21.FLD76.MTH835(s, arr_object);
    }

    public final void MTH7504(CLS140 ﹶˑ0) {
        this.FLD5466.add(ﹶˑ0);
    }
}

