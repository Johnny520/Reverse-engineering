// Decompiled by JEB v5.42.0.202606242140

package com.android.xf.donation.Wrapper;

import android.content.ContentValues;
import android.content.Context;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS36;
import d.ˑʽ.CLS37;
import d.ˑʽ.CLS38;
import d.יʻ.CLS172;
import d.יʻ.CLS174;
import d.יʻ.CLS175;
import d.יʻ.CLS58;
import d.יʻ.CLS61;
import d.יʻ.CLS62;
import d.יʻ.CLS63;
import d.יʻ.CLS65.CLS64;
import d.יʻ.CLS65;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.יʻ.CLS73;
import d.ᐧˈ.CLS206;
import d.ⁱﾞ.CLS127;
import d.ⁱﾞ.CLS128;
import d.ⁱﾞ.CLS215;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Init {
    public ArrayList FLD27;
    public CLS128 FLD28;

    // 此方法包含解密的字符串
    public void finish() {
        try {
            this.FLD28.getClass();
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }

        for(Object object0: this.FLD27) {
            var ᐧי0 = (CLS127)object0;
            try {
                ᐧי0.getClass();
            }
            catch(Throwable throwable1) {
                CLS69.MTH797(throwable1);
            }
        }

        var ⁱﾞ0 = new CLS206(6);
        try {
            ⁱﾞ0.MTH1174();
        }
        catch(Throwable throwable2) {
            CLS69.MTH797(throwable2);
        }

        CLS69.MTH809("donation closed!");
    }

    public ArrayList getData(String s, Object[] arr_object) {
        var ⁱﾞ0 = (CLS73)CLS62.FLD317.FLD312.get(s);
        return ⁱﾞ0 == null ? new ArrayList() : ⁱﾞ0.MTH837(arr_object);
    }

    public Set getDataChannels() {
        return CLS62.FLD317.FLD312.keySet();
    }

    public Set getEventChannels() {
        return CLS62.FLD317.FLD314.keySet();
    }

    public Set getIdEventChannels() {
        return CLS62.FLD317.FLD316.keySet();
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public ContentValues getInfo() {
        var contentValues0 = new ContentValues();
        contentValues0.put("versionName", "11");
        contentValues0.put("versionCode", 72);
        contentValues0.put("featureName", "donation");
        contentValues0.put("shortName", "d");
        contentValues0.put("showVersion", Boolean.FALSE);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public boolean init(Context context0, Object[] arr_object) {
        Object object0 = arr_object[0];
        var s = (String)arr_object[1];
        var context1 = (Context)arr_object[2];
        var contentValues0 = (ContentValues)arr_object[3];
        var hashMap0 = (HashMap)arr_object[4];
        var hashMap1 = (HashMap)arr_object[5];
        var hashMap2 = (HashMap)arr_object[6];
        var hashMap3 = (HashMap)arr_object[7];
        CLS62 ˎˏ0 = CLS62.FLD317;
        ˎˏ0.FLD313 = object0;
        if(object0 != null) {
            Method[] arr_method = object0.getClass().getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                String s1 = method0.getName();
                ˎˏ0.FLD315.put(s1, method0);
            }
        }

        var יʻ0 = new CLS36(contentValues0, context0);
        CLS68 ٴˆ0 = CLS68.FLD326;
        ٴˆ0.getClass();
        ٴˆ0.FLD323.put("d.ˑʽ.יʻ", יʻ0);
        if(CLS13.MTH430()) {
            return false;
        }

        CLS69.FLD335 = object0;
        CLS69.FLD336 = s;
        CLS69.FLD337 = hashMap0;
        CLS69.FLD332 = hashMap1;
        CLS69.MTH796();
        CLS69.FLD331 = hashMap2;
        CLS69.FLD329 = hashMap3;
        CLS69.FLD327 = new WeakReference(context1);
        CLS62 ˎˏ1 = CLS62.FLD317;
        ˎˏ1.MTH753("reloadStrings", new CLS175(0));
        ˎˏ1.MTH753("reloadMeta", new CLS175(1));
        ˎˏ1.MTH753("reloadParams", new CLS175(2));
        var ʼˎ0 = new CLS58(context0, יʻ0.MTH593());
        ʼˎ0.FLD296 = CLS63.MTH768(new File(s, "534a9729a0c461cbd7a4379978fb742"));
        ٴˆ0.FLD323.put("d.\u05D9\u02BB.\u02BC\u02CE", ʼˎ0);
        var ˉᵢ0 = new CLS61(context1, CLS37.MTH601((ʼˎ0.MTH725() + "9n4hZkF")));
        ٴˆ0.FLD323.put("d.\u05D9\u02BB.\u02C9\u1D62", ˉᵢ0);
        if(arr_object.length > 8) {
            ˉᵢ0.FLD309 = (HashMap)arr_object[8];
            ˉᵢ0.FLD310 = true;
        }
        else {
            ˉᵢ0.FLD309 = new HashMap();
            ˎˏ1.MTH753("WxDataManagerSet", new CLS172(ˉᵢ0, 0));
            ˎˏ1.MTH753("WxDataManagerClear", new CLS172(ˉᵢ0, 1));
        }

        CLS38.FLD200.getClass();
        CLS38.FLD200.FLD197 = new HashSet();
        CLS38.FLD200.FLD199 = new ArrayList();
        CLS38.FLD200.FLD198 = new ArrayList();
        CLS38.FLD200.FLD196 = new ArrayList();
        CLS38.FLD200.FLD197.clear();
        CLS38.FLD200.FLD197.addAll(CLS38.MTH605("root"));
        CLS38.FLD200.FLD196.clear();
        CLS38.FLD200.FLD196.addAll(CLS38.MTH605("root_priority"));
        CLS38.FLD200.FLD199.clear();
        CLS38.FLD200.FLD199.addAll(CLS38.MTH605("root_random"));
        CLS38.FLD200.FLD198.clear();
        CLS38.FLD200.FLD198.addAll(CLS38.MTH605("root_fixed"));
        CLS38.FLD200.FLD195 = יʻ0;
        this.FLD28 = new CLS128();
        this.FLD27 = new ArrayList();
        try {
            var ⁱﾞ0 = new CLS215();
            this.FLD27.add(ⁱﾞ0);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }

        try {
            this.FLD28.MTH1195();
        }
        catch(Throwable throwable1) {
            CLS69.MTH797(throwable1);
        }

        for(Object object1: this.FLD27) {
            var ᐧי0 = (CLS127)object1;
            try {
                ᐧי0.MTH1191();
            }
            catch(Throwable throwable2) {
                CLS69.MTH797(throwable2);
            }
        }

        CLS69.MTH809(("feature loaded: donation " + 72));
        var ⁱٴ0 = new CLS175(3);
        CLS62.FLD317.MTH753("on_update_check", ⁱٴ0);
        var ᐧˏ0 = new CLS174(0);
        CLS68.FLD326.MTH787(ᐧˏ0);
        var ᐧˏ1 = new CLS174(1);
        CLS68.FLD326.MTH787(ᐧˏ1);
        return true;
    }

    public void publish(String s, Object[] arr_object) {
        CLS62.FLD317.MTH763(s, arr_object);
    }

    public void publishAsync(String s, Object[] arr_object) {
        CLS62 ˎˏ0 = CLS62.FLD317;
        ConcurrentHashMap concurrentHashMap0 = ˎˏ0.FLD314;
        if(concurrentHashMap0.containsKey(s)) {
            var ˑʽ0 = (CLS65)concurrentHashMap0.get(s);
            if(ˑʽ0 != null) {
                ˑʽ0.MTH776(arr_object);
            }
        }
        else {
            ConcurrentHashMap concurrentHashMap1 = ˎˏ0.FLD316;
            if(concurrentHashMap1.containsKey(s)) {
                var arrayList0 = (ArrayList)concurrentHashMap1.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        var ˑʽ1 = (CLS65)object0;
                        if(ˑʽ1 != null) {
                            ˑʽ1.MTH776(arr_object);
                        }
                    }
                }
            }
        }
    }

    public void publishId(String s, int v, Object[] arr_object) {
        CLS65 ˑʽ0 = null;
        ConcurrentHashMap concurrentHashMap0 = CLS62.FLD317.FLD316;
        if(concurrentHashMap0.containsKey(s)) {
            if(concurrentHashMap0.containsKey(s)) {
                var arrayList0 = (ArrayList)concurrentHashMap0.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        var ˑʽ1 = (CLS65)object0;
                        if(ˑʽ1.FLD318 == v) {
                            ˑʽ0 = ˑʽ1;
                            break;
                        }
                    }
                }
            }

            if(ˑʽ0 != null) {
                ˑʽ0.MTH777(arr_object);
            }
        }
    }

    public void publishIncrement(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = CLS62.FLD317.FLD314;
        if(concurrentHashMap0.containsKey(s)) {
            var ˑʽ0 = (CLS65)concurrentHashMap0.get(s);
            if(ˑʽ0 != null) {
                int v = (int)(((Integer)arr_object[0]));
                for(Object object0: ˑʽ0.FLD319) {
                    var ˑʽ$ᐧי0 = (CLS64)object0;
                    try {
                        arr_object[0] = v;
                        ˑʽ$ᐧי0.MTH774(arr_object);
                    }
                    catch(Throwable throwable0) {
                        CLS69.MTH797(throwable0);
                    }

                    ++v;
                }
            }
        }
    }
}

