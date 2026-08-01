// Decompiled by JEB v5.42.0.202606242140

package com.android.xf.themes.Wrapper;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS31;
import t.ˆʿ.CLS52;
import t.ˊﾞ.CLS106;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS128;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS135;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS139.CLS138;
import t.ᵔʾ.CLS139;
import t.ᵔʾ.CLS296;
import t.ᵔʾ.CLS299;
import t.ᵔʾ.CLS301;
import t.ﾞٴ.CLS150;
import t.ﾞٴ.CLS155;
import t.ﾞٴ.CLS309;
import t.ﾞٴ.CLS330;
import t.ﾞٴ.CLS331;

public class Init {
    public ArrayList FLD67;
    public CLS150 FLD68;

    // 此方法包含解密的字符串
    public void finish() {
        this.FLD68.getClass();
        for(Object object0: this.FLD67) {
            ((CLS155)object0).getClass();
        }
        HandlerThread handlerThread0 = CLS137.FLD972.FLD969;
        if(handlerThread0 != null) {
            try {
                if(handlerThread0.isAlive()) {
                    if(Build.VERSION.SDK_INT >= 18) {
                        handlerThread0.quitSafely();
                    }
                    else {
                        handlerThread0.quit();
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        CLS133.MTH2109("themes closed!");
    }

    public ArrayList getData(String s, Object[] arr_object) {
        return CLS123.FLD912.MTH1998(s, arr_object);
    }

    public Set getDataChannels() {
        return CLS123.FLD912.FLD910.keySet();
    }

    public Set getEventChannels() {
        return CLS123.FLD912.FLD907.keySet();
    }

    public Set getIdEventChannels() {
        return CLS123.FLD912.FLD909.keySet();
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public ContentValues getInfo() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("versionName", "16");
        contentValues0.put("versionCode", 0x74);
        contentValues0.put("featureName", "themes");
        contentValues0.put("shortName", "t");
        contentValues0.put("showVersion", Boolean.FALSE);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public boolean init(Context context0, Object[] arr_object) {
        String s4;
        Object object0 = arr_object[0];
        String s = (String)arr_object[1];
        Context context1 = (Context)arr_object[2];
        ContentValues contentValues0 = (ContentValues)arr_object[3];
        HashMap hashMap0 = (HashMap)arr_object[4];
        HashMap hashMap1 = (HashMap)arr_object[5];
        HashMap hashMap2 = (HashMap)arr_object[6];
        HashMap hashMap3 = (HashMap)arr_object[7];
        CLS123 ʾᵢ0 = CLS123.FLD912;
        ʾᵢ0.FLD908 = object0;
        if(object0 != null) {
            Method[] arr_method = object0.getClass().getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                String s1 = method0.getName();
                ʾᵢ0.FLD911.put(s1, method0);
            }
        }
        CLS52 ⁱʾ0 = new CLS52(contentValues0, context0);
        CLS137.FLD972.getClass();
        CLS137.FLD972.FLD967.put("t.ˆʿ.ⁱʾ", ⁱʾ0);
        if(CLS28.MTH1318()) {
            return false;
        }
        CLS133.FLD950 = object0;
        CLS133.FLD947 = s;
        CLS133.FLD951 = hashMap0;
        CLS133.FLD948 = hashMap1;
        CLS133.FLD949 = hashMap2;
        CLS133.FLD953 = hashMap3;
        CLS133.FLD946 = new WeakReference(context1);
        String s2 = CLS15.MTH1075(0, CLS123.FLD912, "reloadStrings", 0xFFFFB2602B3CF2B7L);
        String s3 = CLS15.MTH1075(1, CLS123.FLD912, s2, 0xFFFFB2552B3CF2B7L);
        CLS301 ٴـ0 = new CLS301(2);
        CLS123.FLD912.MTH2002(s3, ((CLS138)ٴـ0));
        CLS128 ˑٴ0 = new CLS128(context0, ⁱʾ0.MTH1475());
        CLS106 ٴـ1 = new CLS106(new File(s, "534a9729a0c461cbd7a4379978fb742"));
        byte[] arr_b = null;
        try {
            if(CLS125.MTH2022(ٴـ1)) {
                InputStream inputStream0 = ٴـ1.MTH1847();
                if(inputStream0 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        if(CLS125.MTH2038(inputStream0, byteArrayOutputStream0)) {
                            byteArrayOutputStream0.toByteArray();
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS133.MTH2113(throwable1);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
        CLS137.FLD972.getClass();
        CLS137.FLD972.FLD967.put("t.\u1D54\u02BE.\u02D1\u0674", ˑٴ0);
        StringBuilder stringBuilder0 = new StringBuilder();
        if(TextUtils.isEmpty(ˑٴ0.FLD919)) {
            String s5 = ˑٴ0.FLD917;
            if(TextUtils.isEmpty(s5)) {
                s5 = (((WeakReference)ˑٴ0.FLD918) == null ? null : ((Context)((WeakReference)ˑٴ0.FLD918).get())) == null ? null : (((WeakReference)ˑٴ0.FLD918) == null ? null : ((Context)((WeakReference)ˑٴ0.FLD918).get())).getPackageCodePath();
            }
            if(!TextUtils.isEmpty(s5)) {
                try {
                    JarFile jarFile0 = new JarFile(s5);
                    JarEntry jarEntry0 = jarFile0.getJarEntry("classes.dex");
                    if(jarEntry0 != null) {
                        InputStream inputStream1 = jarFile0.getInputStream(jarEntry0);
                        byte[] arr_b1 = new byte[inputStream1.available()];
                        while(inputStream1.read(arr_b1) != -1) {
                        }
                        inputStream1.close();
                        Certificate[] arr_certificate = jarEntry0.getCertificates();
                        if(arr_certificate != null && arr_certificate.length > 0) {
                            arr_b = arr_certificate[0].getEncoded();
                        }
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
            if(arr_b == null) {
                s4 = "";
            }
            else {
                String s6 = CLS31.MTH1333(arr_b);
                ˑٴ0.FLD919 = s6;
                s4 = s6;
            }
        }
        else {
            s4 = ˑٴ0.FLD919;
        }
        stringBuilder0.append(s4);
        stringBuilder0.append("9n4hZkF");
        CLS135 ⁱˉ0 = new CLS135(context1, CLS31.MTH1332(stringBuilder0.toString()));
        CLS137.FLD972.getClass();
        CLS137.FLD972.FLD967.put("t.ᵔʾ.ⁱˉ", ⁱˉ0);
        if(arr_object.length > 8) {
            ⁱˉ0.FLD963 = (HashMap)arr_object[8];
            ⁱˉ0.FLD966 = true;
        }
        else {
            ⁱˉ0.FLD963 = new HashMap();
            CLS299 יﹳ0 = new CLS299(ⁱˉ0, 0);
            CLS123.FLD912.MTH2002("WxDataManagerSet", ((CLS138)יﹳ0));
            CLS299 יﹳ1 = new CLS299(ⁱˉ0, 1);
            CLS123.FLD912.MTH2002("WxDataManagerClear", ((CLS138)יﹳ1));
        }
        this.FLD68 = new CLS150();
        this.FLD67 = new ArrayList();
        CLS331 ﾞᐧ0 = new CLS331(this.FLD68);
        this.FLD67.add(ﾞᐧ0);
        CLS309 ʽﹶ0 = new CLS309(this.FLD68);
        this.FLD67.add(ʽﹶ0);
        CLS330 ﾞˎ0 = new CLS330(this.FLD68);
        this.FLD67.add(ﾞˎ0);
        try {
            this.FLD68.MTH2204();
        }
        catch(Throwable throwable2) {
            CLS133.MTH2113(throwable2);
        }
        for(Object object1: this.FLD67) {
            CLS155 ﾞٴ0 = (CLS155)object1;
            try {
                ﾞٴ0.MTH2308();
            }
            catch(Throwable throwable3) {
                CLS133.MTH2113(throwable3);
            }
        }
        CLS133.MTH2109(("feature loaded: themes " + 0x74));
        String s7 = CLS15.MTH1075(3, CLS123.FLD912, "disable", 0xFFFFB83C2B3CF2B7L);
        String s8 = CLS15.MTH1075(4, CLS123.FLD912, s7, 0xFFFFB82E2B3CF2B7L);
        String s9 = CLS15.MTH1075(5, CLS123.FLD912, s8, 0xFFFFB8202B3CF2B7L);
        CLS301 ٴـ2 = new CLS301(6);
        CLS123.FLD912.MTH2002(s9, ((CLS138)ٴـ2));
        CLS296 ˆʿ0 = new CLS296(0);
        CLS137.FLD972.MTH2141(((CLS136)ˆʿ0));
        return true;
    }

    public void publish(String s, Object[] arr_object) {
        CLS123.FLD912.MTH1999(s, arr_object);
    }

    public void publishAsync(String s, Object[] arr_object) {
        CLS123 ʾᵢ0 = CLS123.FLD912;
        ConcurrentHashMap concurrentHashMap0 = ʾᵢ0.FLD907;
        if(concurrentHashMap0.containsKey(s)) {
            CLS139 ﾞٴ0 = (CLS139)concurrentHashMap0.get(s);
            if(ﾞٴ0 != null) {
                ﾞٴ0.MTH2156(arr_object);
            }
        }
        else {
            ConcurrentHashMap concurrentHashMap1 = ʾᵢ0.FLD909;
            if(concurrentHashMap1.containsKey(s)) {
                ArrayList arrayList0 = (ArrayList)concurrentHashMap1.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        CLS139 ﾞٴ1 = (CLS139)object0;
                        if(ﾞٴ1 != null) {
                            ﾞٴ1.MTH2156(arr_object);
                        }
                    }
                }
            }
        }
    }

    public void publishId(String s, int v, Object[] arr_object) {
        CLS139 ﾞٴ0 = null;
        ConcurrentHashMap concurrentHashMap0 = CLS123.FLD912.FLD909;
        if(concurrentHashMap0.containsKey(s)) {
            if(concurrentHashMap0.containsKey(s)) {
                ArrayList arrayList0 = (ArrayList)concurrentHashMap0.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        CLS139 ﾞٴ1 = (CLS139)object0;
                        if(ﾞٴ1.FLD978 == v) {
                            ﾞٴ0 = ﾞٴ1;
                            break;
                        }
                    }
                }
            }
            if(ﾞٴ0 != null) {
                ﾞٴ0.MTH2155(arr_object);
            }
        }
    }

    public void publishIncrement(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = CLS123.FLD912.FLD907;
        if(concurrentHashMap0.containsKey(s)) {
            CLS139 ﾞٴ0 = (CLS139)concurrentHashMap0.get(s);
            if(ﾞٴ0 != null) {
                int v = (int)(((Integer)arr_object[0]));
                for(Object object0: ﾞٴ0.FLD977) {
                    CLS138 ﾞٴ$ˆٴ0 = (CLS138)object0;
                    try {
                        arr_object[0] = v;
                        ﾞٴ$ˆٴ0.MTH2153(arr_object);
                    }
                    catch(Throwable throwable0) {
                        CLS133.MTH2113(throwable0);
                    }
                    ++v;
                }
            }
        }
    }
}

