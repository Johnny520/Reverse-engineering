// Decompiled by JEB v5.42.0.202606242140

package p.pkg5;

import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import p.pkg8.CLS44;

public final class CLS29 {
    public interface CLS26 {
    }

    public final class CLS27 extends AsyncTask {
        public final CLS26 FLD289;
        public final CLS29 FLD290;
        public String FLD291;

        public CLS27(CLS182 ˑᵎ0) {
            new ArrayList();
            this.FLD289 = ˑᵎ0;
        }

        @Override  // android.os.AsyncTask
        public final Object doInBackground(Object[] arr_object) {
            Void[] arr_void = (Void[])arr_object;
            CLS29 ˎᵔ0 = CLS29.this;
            byte[] arr_b = null;
            try {
                ˎᵔ0.getClass();
                List list0 = ˎᵔ0.FLD296;
                if(list0 != null && !((ArrayList)list0).isEmpty()) {
                    if(ˎᵔ0.FLD294) {
                        list0 = Arrays.asList(((String[])((ArrayList)list0).toArray(new String[0])));
                        Collections.shuffle(list0);
                    }
                    for(Object object0: list0) {
                        arr_b = this.MTH825(((String)object0));
                        if(arr_b != null) {
                            return new CLS28(arr_b);
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                ArrayList arrayList0 = ˎᵔ0.FLD299;
                if(!arrayList0.isEmpty()) {
                    Iterator iterator1 = arrayList0.iterator();
                    while(true) {
                    label_19:
                        if(!iterator1.hasNext()) {
                            break;
                        }
                        Object object1 = iterator1.next();
                        for(Object object2: ((ArrayList)object1)) {
                            arr_b = this.MTH825(((String)object2));
                            if(arr_b == null) {
                                continue;
                            }
                            return new CLS28(arr_b);
                        }
                    }
                }
                return new CLS28(null);
            }
            catch(Throwable throwable0) {
                CLS44.MTH897(throwable0);
                return new CLS28(arr_b);
            }
            goto label_19;
        }

        @Override  // android.os.AsyncTask
        public final void onPostExecute(Object object0) {
            CLS28 ˎᵔ$ﾞᵢ0 = (CLS28)object0;
            CLS26 ˎᵔ$ٴʼ0 = this.FLD289;
            if(ˎᵔ$ٴʼ0 != null) {
                try {
                    ((CLS182)ˎᵔ$ٴʼ0).MTH831(ˎᵔ$ﾞᵢ0);
                }
                catch(Throwable throwable0) {
                    CLS23.MTH809(this.FLD291);
                    CLS44.MTH897(throwable0);
                }
            }
        }

        // 此方法包含解密的字符串
        public final byte[] MTH825(String s) {
            HttpURLConnection httpURLConnection0;
            CLS29 ˎᵔ0 = CLS29.this;
            this.FLD291 = s.trim();
            CLS23.MTH809(("retrieveResult url: " + s));
            try {
                if(!TextUtils.isEmpty(s) && !s.startsWith("#")) {
                    HashMap hashMap0 = ˎᵔ0.FLD297;
                    if(ˎᵔ0.FLD295.equals("GET") && !hashMap0.isEmpty()) {
                        s = s + "?" + CLS29.MTH828(ˎᵔ0, hashMap0);
                    }
                    URL uRL0 = new URL(s);
                    boolean z = false;
                    if(TextUtils.isEmpty(null)) {
                        httpURLConnection0 = TextUtils.isEmpty(null) ? null : ((HttpURLConnection)uRL0.openConnection(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(null, 0))));
                    }
                    else {
                        httpURLConnection0 = (HttpURLConnection)uRL0.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(null, 0)));
                    }
                    if(httpURLConnection0 == null) {
                        httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                    }
                    httpURLConnection0.setReadTimeout(30000);
                    httpURLConnection0.setConnectTimeout(5000);
                    httpURLConnection0.setRequestMethod(ˎᵔ0.FLD295);
                    httpURLConnection0.setRequestProperty("User-Agent", "Mozilla/5.0 ( compatible ) ");
                    httpURLConnection0.setRequestProperty("Accept", "*/*");
                    HashMap hashMap1 = ˎᵔ0.FLD293;
                    if(!hashMap1.isEmpty()) {
                        for(Object object0: hashMap1.keySet()) {
                            httpURLConnection0.setRequestProperty(((String)object0), ((String)hashMap1.get(((String)object0))));
                        }
                    }
                    if(ˎᵔ0.FLD295.equals("POST")) {
                        httpURLConnection0.setDoInput(true);
                        httpURLConnection0.setDoOutput(true);
                        OutputStream outputStream0 = httpURLConnection0.getOutputStream();
                        BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(outputStream0, StandardCharsets.UTF_8));
                        if(!hashMap0.isEmpty()) {
                            bufferedWriter0.write(CLS29.MTH828(ˎᵔ0, hashMap0));
                        }
                        if(!TextUtils.isEmpty(ˎᵔ0.FLD298)) {
                            bufferedWriter0.write(ˎᵔ0.FLD298);
                        }
                        bufferedWriter0.flush();
                        bufferedWriter0.close();
                        outputStream0.close();
                        httpURLConnection0.connect();
                    }
                    if(httpURLConnection0.getResponseCode() != 200) {
                        return null;
                    }
                    InputStream inputStream0 = httpURLConnection0.getInputStream();
                    byte[] arr_b = new byte[0x400];
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    int v;
                    while((v = inputStream0.read(arr_b)) != -1) {
                        byteArrayOutputStream0.write(arr_b, 0, v);
                    }
                    byteArrayOutputStream0.flush();
                    byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                    byteArrayOutputStream0.close();
                    inputStream0.close();
                    httpURLConnection0.disconnect();
                    String s1 = new String(arr_b1);
                    if(!TextUtils.isEmpty(s1) && !s1.contains("<!DOCTYPE html") && !s1.contains("<script") && !s1.contains("<!doctype") && !s1.contains("<html")) {
                        String s2 = CLS44.MTH888("http_post_check");
                        if(!TextUtils.isEmpty(s2)) {
                            Pattern pattern0 = Pattern.compile(s2, 2);
                            if(pattern0 != null) {
                                z = pattern0.matcher(s1).find();
                            }
                        }
                        return z ? null : arr_b1;
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS23.MTH809(s);
                CLS44.MTH894(throwable0.getMessage());
            }
            return null;
        }
    }

    public static final class CLS28 {
        public final byte[] FLD292;

        public CLS28(byte[] arr_b) {
            this.FLD292 = arr_b;
        }
    }

    public final HashMap FLD293;
    public final boolean FLD294;
    public String FLD295;
    public final ArrayList FLD296;
    public final HashMap FLD297;
    public String FLD298;
    public final ArrayList FLD299;

    // 此方法包含解密的字符串
    public CLS29(String s) {
        ArrayList arrayList0 = new ArrayList();
        this.FLD296 = arrayList0;
        this.FLD299 = new ArrayList();
        this.FLD297 = new HashMap();
        this.FLD293 = new HashMap();
        this.FLD295 = "GET";
        this.FLD294 = true;
        if(s.contains(";")) {
            List list0 = Arrays.asList(s.split(";"));
            if(list0 != null && !list0.isEmpty()) {
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: list0) {
                    String s1 = (String)object0;
                    if(!arrayList1.contains(s1) && !this.MTH829(s1)) {
                        arrayList1.add(s1);
                    }
                }
                arrayList0.addAll(arrayList1);
            }
        }
        else if(!TextUtils.isEmpty(s) && !this.MTH829(s)) {
            arrayList0.add(s);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH828(CLS29 ˎᵔ0, HashMap hashMap0) {
        ˎᵔ0.getClass();
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            boolean z = true;
            for(Object object0: hashMap0.entrySet()) {
                if(z) {
                    z = false;
                }
                else {
                    stringBuilder0.append("&");
                }
                stringBuilder0.append(URLEncoder.encode(((String)((Map.Entry)object0).getKey()), "UTF-8"));
                stringBuilder0.append("=");
                stringBuilder0.append(URLEncoder.encode(((String)((Map.Entry)object0).getValue()), "UTF-8"));
            }
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
        return stringBuilder0.toString();
    }

    public final boolean MTH829(String s) {
        if(this.FLD296.contains(s)) {
            return true;
        }
        for(Object object0: this.FLD299) {
            if(((ArrayList)object0).contains(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

