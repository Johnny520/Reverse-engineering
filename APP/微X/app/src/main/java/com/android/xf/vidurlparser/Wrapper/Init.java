// Decompiled by JEB v5.42.0.202606242140

package com.android.xf.vidurlparser.Wrapper;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
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
import p.pkg2.CLS5;
import p.pkg2.CLS6;
import p.pkg2.CLS83;
import p.pkg2.CLS84;
import p.pkg5.CLS30;
import p.pkg5.CLS31;
import p.pkg8.CLS186;
import p.pkg8.CLS187;
import p.pkg8.CLS188;
import p.pkg8.CLS43.CLS42;
import p.pkg8.CLS43;
import p.pkg8.CLS44;
import p.pkg8.CLS47;
import p.pkg8.CLS51;
import p.pkg8.CLS52;
import p.pkg8.CLS53;
import p.pkg8.CLS55.CLS54;
import p.pkg8.CLS55;

public class Init {
    public ArrayList FLD5;
    public CLS6 FLD6;

    // 此方法包含解密的字符串
    public void finish() {
        this.FLD6.getClass();
        for(Object object0: this.FLD5) {
            ((CLS5)object0).getClass();
        }

        HandlerThread handlerThread0 = CLS43.FLD320.FLD323;
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
                CLS44.MTH897(throwable0);
            }
        }

        CLS44.MTH894("vidurlparser closed!");
    }

    public ArrayList getData(String s, Object[] arr_object) {
        var ˎᵔ0 = (CLS47)CLS53.FLD362.FLD366.get(s);
        return ˎᵔ0 == null ? new ArrayList() : ˎᵔ0.MTH907(arr_object);
    }

    public Set getDataChannels() {
        return CLS53.FLD362.FLD366.keySet();
    }

    public Set getEventChannels() {
        return CLS53.FLD362.FLD364.keySet();
    }

    public Set getIdEventChannels() {
        return CLS53.FLD362.FLD365.keySet();
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public ContentValues getInfo() {
        var contentValues0 = new ContentValues();
        contentValues0.put("versionName", "12");
        contentValues0.put("versionCode", 0x1F);
        contentValues0.put("featureName", "vidurlparser");
        contentValues0.put("shortName", "vid");
        contentValues0.put("showVersion", Boolean.FALSE);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public boolean init(Context context0, Object[] arr_object) {
        String s2;
        byte[] arr_b1;
        Object object0 = arr_object[0];
        var s = (String)arr_object[1];
        var context1 = (Context)arr_object[2];
        var contentValues0 = (ContentValues)arr_object[3];
        var hashMap0 = (HashMap)arr_object[4];
        var hashMap1 = (HashMap)arr_object[5];
        var hashMap2 = (HashMap)arr_object[6];
        var hashMap3 = (HashMap)arr_object[7];
        CLS53 ᴵᐧ0 = CLS53.FLD362;
        ᴵᐧ0.FLD363 = object0;
        if(object0 != null) {
            Method[] arr_method = object0.getClass().getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                String s1 = method0.getName();
                ᴵᐧ0.FLD361.put(s1, method0);
            }
        }

        var ٴʼ0 = new CLS31(contentValues0, context0);
        CLS43.FLD320.getClass();
        CLS43.FLD320.FLD321.put("p.\u02CE\u1D54.\u0674\u02BC", ٴʼ0);
        CLS44.FLD332 = object0;
        CLS44.FLD328 = s;
        CLS44.FLD324 = hashMap0;
        CLS44.FLD330 = hashMap2;
        CLS44.FLD326 = hashMap1;
        CLS44.FLD325 = hashMap3;
        CLS44.FLD327 = new WeakReference(context1);
        var ﹳˑ0 = new CLS188(0);
        CLS53.FLD362.MTH938("reloadStrings", ((CLS54)ﹳˑ0));
        var ﹳˑ1 = new CLS188(1);
        CLS53.FLD362.MTH938("reloadMeta", ((CLS54)ﹳˑ1));
        var ﹳˑ2 = new CLS188(2);
        CLS53.FLD362.MTH938("reloadParams", ((CLS54)ﹳˑ2));
        var ᐧᴵ0 = new CLS52(context0, ٴʼ0.MTH836());
        var file0 = new File(s, "534a9729a0c461cbd7a4379978fb742");
        byte[] arr_b = null;
        try {
            if(!file0.exists() || file0.length() == 0L) {
                goto label_45;
            }
            else {
                goto label_43;
            }

            goto label_46;
        }
        catch(Throwable throwable0) {
            try {
                CLS44.MTH897(throwable0);
                goto label_45;
            label_43:
                boolean z = true;
                goto label_46;
            label_45:
                z = false;
            label_46:
                if(z) {
                    var fileInputStream0 = new FileInputStream(file0);
                    try {
                        arr_b1 = new byte[fileInputStream0.available()];
                        fileInputStream0.read(arr_b1);
                        fileInputStream0.close();
                    }
                    catch(Throwable throwable2) {
                        CLS44.MTH897(throwable2);
                        goto label_57;
                    }
                }
                else {
                    goto label_57;
                }

                goto label_58;
            }
            catch(Throwable throwable1) {
            }
        }

        throwable1.printStackTrace();
    label_57:
        arr_b1 = null;
    label_58:
        ᐧᴵ0.FLD357 = arr_b1;
        CLS43.FLD320.getClass();
        CLS43.FLD320.FLD321.put("p.\u0674\u02BC.\u1427\u1D35", ᐧᴵ0);
        var stringBuilder0 = new StringBuilder();
        if(TextUtils.isEmpty(ᐧᴵ0.FLD356)) {
            String s3 = ᐧᴵ0.FLD358;
            if(TextUtils.isEmpty(s3)) {
                s3 = (ᐧᴵ0.FLD359 == null ? null : ((Context)ᐧᴵ0.FLD359.get())) == null ? null : (ᐧᴵ0.FLD359 == null ? null : ((Context)ᐧᴵ0.FLD359.get())).getPackageCodePath();
            }

            if(!TextUtils.isEmpty(s3)) {
                try {
                    var jarFile0 = new JarFile(s3);
                    JarEntry jarEntry0 = jarFile0.getJarEntry("classes.dex");
                    if(jarEntry0 != null) {
                        InputStream inputStream0 = jarFile0.getInputStream(jarEntry0);
                        byte[] arr_b2 = new byte[inputStream0.available()];
                        while(inputStream0.read(arr_b2) != -1) {
                        }

                        inputStream0.close();
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
                s2 = "";
            }
            else {
                s2 = CLS30.MTH834(arr_b);
                ᐧᴵ0.FLD356 = s2;
            }
        }
        else {
            s2 = ᐧᴵ0.FLD356;
        }

        stringBuilder0.append(s2);
        stringBuilder0.append("9n4hZkF");
        var ٴﹶ0 = new CLS51(context1, CLS30.MTH833(stringBuilder0.toString()));
        CLS43.FLD320.getClass();
        CLS43.FLD320.FLD321.put("p.\u0674\u02BC.\u0674\uFE76", ٴﹶ0);
        if(arr_object.length > 8) {
            ٴﹶ0.FLD353 = (HashMap)arr_object[8];
            ٴﹶ0.FLD352 = true;
        }
        else {
            ٴﹶ0.FLD353 = new HashMap();
            var ˏﹳ0 = new CLS186(0, ٴﹶ0);
            CLS53.FLD362.MTH938("WxDataManagerSet", ((CLS54)ˏﹳ0));
            var ˏﹳ1 = new CLS186(1, ٴﹶ0);
            CLS53.FLD362.MTH938("WxDataManagerClear", ((CLS54)ˏﹳ1));
        }

        this.FLD6 = new CLS6();
        this.FLD5 = new ArrayList();
        var ﾞˈ0 = new CLS83(this.FLD6);
        this.FLD5.add(ﾞˈ0);
        CLS6 ﹳˑ3 = this.FLD6;
        if(!ﹳˑ3.FLD23) {
            try {
                ﹳˑ3.FLD23 = true;
                var ﾞᵢ0 = new CLS84(ﹳˑ3, 0);
                CLS53.FLD362.MTH938("set_current_activity", ((CLS54)ﾞᵢ0));
                var ﾞᵢ1 = new CLS84(ﹳˑ3, 1);
                CLS53.FLD362.MTH938("set_launcherui", ((CLS54)ﾞᵢ1));
            }
            catch(Throwable throwable3) {
                CLS44.MTH897(throwable3);
            }
        }

        for(Object object1: this.FLD5) {
            var ٴʼ1 = (CLS5)object1;
            try {
                ٴʼ1.getClass();
            }
            catch(Throwable throwable4) {
                CLS44.MTH897(throwable4);
            }
        }

        CLS44.MTH894(("feature loaded: vidurlparser " + 0x1F));
        var ﹳˑ4 = new CLS188(3);
        CLS53.FLD362.MTH938("disable", ((CLS54)ﹳˑ4));
        var ﹳˑ5 = new CLS188(4);
        CLS53.FLD362.MTH938("delayed_check", ((CLS54)ﹳˑ5));
        var ﹳˑ6 = new CLS188(5);
        CLS53.FLD362.MTH938("updateLicense", ((CLS54)ﹳˑ6));
        var ﹳˑ7 = new CLS188(6);
        CLS53.FLD362.MTH938("on_update_check", ((CLS54)ﹳˑ7));
        var יٴ0 = new CLS187(0);
        CLS43.FLD320.MTH879(((CLS42)יٴ0));
        return true;
    }

    public void publish(String s, Object[] arr_object) {
        CLS53.FLD362.MTH935(s, arr_object);
    }

    public void publishAsync(String s, Object[] arr_object) {
        CLS53 ᴵᐧ0 = CLS53.FLD362;
        ConcurrentHashMap concurrentHashMap0 = ᴵᐧ0.FLD364;
        if(concurrentHashMap0.containsKey(s)) {
            var ﾞˈ0 = (CLS55)concurrentHashMap0.get(s);
            if(ﾞˈ0 != null) {
                ﾞˈ0.MTH951(arr_object);
            }
        }
        else {
            ConcurrentHashMap concurrentHashMap1 = ᴵᐧ0.FLD365;
            if(concurrentHashMap1.containsKey(s)) {
                var arrayList0 = (ArrayList)concurrentHashMap1.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        var ﾞˈ1 = (CLS55)object0;
                        if(ﾞˈ1 != null) {
                            ﾞˈ1.MTH951(arr_object);
                        }
                    }
                }
            }
        }
    }

    public void publishId(String s, int v, Object[] arr_object) {
        CLS55 ﾞˈ0 = null;
        ConcurrentHashMap concurrentHashMap0 = CLS53.FLD362.FLD365;
        if(concurrentHashMap0.containsKey(s)) {
            if(concurrentHashMap0.containsKey(s)) {
                var arrayList0 = (ArrayList)concurrentHashMap0.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        var ﾞˈ1 = (CLS55)object0;
                        if(ﾞˈ1.FLD369 == v) {
                            ﾞˈ0 = ﾞˈ1;
                            break;
                        }
                    }
                }
            }

            if(ﾞˈ0 != null) {
                ﾞˈ0.MTH950(arr_object);
            }
        }
    }

    public void publishIncrement(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = CLS53.FLD362.FLD364;
        if(concurrentHashMap0.containsKey(s)) {
            var ﾞˈ0 = (CLS55)concurrentHashMap0.get(s);
            if(ﾞˈ0 != null) {
                int v = (int)(((Integer)arr_object[0]));
                for(Object object0: ﾞˈ0.FLD368) {
                    var ﾞˈ$ٴʼ0 = (CLS54)object0;
                    try {
                        arr_object[0] = v;
                        ﾞˈ$ٴʼ0.MTH948(arr_object);
                    }
                    catch(Throwable throwable0) {
                        CLS44.MTH897(throwable0);
                    }

                    ++v;
                }
            }
        }
    }
}

